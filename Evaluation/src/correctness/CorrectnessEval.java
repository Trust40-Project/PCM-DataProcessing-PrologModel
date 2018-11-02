package correctness;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

import org.eclipse.emf.ecore.util.EcoreUtil;

import edu.kit.ipd.sdq.dataflow.systemmodel.configuration.Configuration;
import edu.kit.ipd.sdq.dataflow.systemmodel.PrologProgram;
import edu.kit.ipd.sdq.dataflow.systemmodel.System;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemTranslator;
import interpreters.EclipsePrologAdapter;
import interpreters.JIPrologAdapter;
import interpreters.PrologAdapter;
import interpreters.QueryResult;
import interpreters.SWIPrologAdapter;
import shared.ModelSerializer;

public class CorrectnessEval {
	
	ModelSerializer ser = new ModelSerializer();
	ModelRandomizer randomizer;
	
	private static final int MODELS_PER_CLASS = 5;
	private static final int NUM_RANDOMIZATIONS = 20;
	
	private PrologAdapter[] interpreters = {
		new EclipsePrologAdapter(),
		new SWIPrologAdapter(),
		new JIPrologAdapter()
	};
	
	private static final String[] MODELS = {
		"models/accesscontrol_correct.systemmodel",
		"models/accesscontrol_nodeclassify.systemmodel",
		"models/accesscontrol_agencynotify.systemmodel",
		"models/accesscontrol_both.systemmodel",
		"models/shop_correct.systemmodel",
		"models/shop_typ0vio.systemmodel",
		"models/shop_typ1vio.systemmodel",
		"models/shop_both.systemmodel",
	};

	private static final String[] ANALYSIS = {
		"models/analysis-accesscontrol.pl",
		"models/analysis-accesscontrol.pl",
		"models/analysis-accesscontrol.pl",
		"models/analysis-accesscontrol.pl",
		"models/analysis-shop.pl",
		"models/analysis-shop.pl",
		"models/analysis-shop.pl",
		"models/analysis-shop.pl",
	};
	
	private static final String[] QUERIES = {
		QueryResultChecks.ACCESSCONTROL_QUERY,
		QueryResultChecks.ACCESSCONTROL_QUERY,
		QueryResultChecks.ACCESSCONTROL_QUERY,
		QueryResultChecks.ACCESSCONTROL_QUERY,
		QueryResultChecks.GEOLOCATIION_QUERY,
		QueryResultChecks.GEOLOCATIION_QUERY,
		QueryResultChecks.GEOLOCATIION_QUERY,
		QueryResultChecks.GEOLOCATIION_QUERY,
	};
	
	private static final List<List<Function<QueryResult,Boolean>>> EXPECTED_VIOLATIONS = Arrays.asList(
		Arrays.asList(),
		Arrays.asList(QueryResultChecks::hasCCDNoDeclassifyViolation),
		Arrays.asList(QueryResultChecks::hasNotifyAgencyViolation),
		Arrays.asList(QueryResultChecks::hasCCDNoDeclassifyViolation, QueryResultChecks::hasNotifyAgencyViolation),
		Arrays.asList(),
		Arrays.asList(QueryResultChecks::hasType0GeoViolation),
		Arrays.asList(QueryResultChecks::hasType1GeoViolationA,QueryResultChecks::hasType1GeoViolationB),
		Arrays.asList(QueryResultChecks::hasType0GeoViolation, QueryResultChecks::hasType1GeoViolationA,QueryResultChecks::hasType1GeoViolationB)
	);
	
	private static final List<Configuration> CONFIGS = new ArrayList<Configuration>();
	static {
		Configuration allOpts = new Configuration();
		allOpts.setOptimizedNegations(true);
		allOpts.setArgumentAndReturnValueIndexing(true);
		allOpts.setShorterAssignments(true);
		Configuration noOpts = new Configuration();
		noOpts.setOptimizedNegations(false);
		noOpts.setArgumentAndReturnValueIndexing(false);
		noOpts.setShorterAssignments(false);
		
		CONFIGS.add(noOpts);
		CONFIGS.add(allOpts);
	}
	
	private static PrintStream out = java.lang.System.out;
	
	public CorrectnessEval() {
		long seed = new Random().nextLong();
		//seed = -682197366142064209L;
		out.println("using seed " + seed+"L");
		randomizer = new ModelRandomizer(new Random(seed));
	}
	
	public static void main(String[] args) {
		new CorrectnessEval().run();
	}

	public void run() {
		
		for(int i=0; i<MODELS.length; i++) {
			out.println("Evaluating Model " + MODELS[i]);
			System baseSys = ser.loadSystem(MODELS[i]);
			
			for(Configuration config : CONFIGS) {
				out.println("Running for config: " + config);
				for(int n = 0; n <MODELS_PER_CLASS; n++) {
					if(n%1 == 0) {
						out.println("Running for model No. " + n+"...");								
					}
					
					System sys = EcoreUtil.copy(baseSys);
					randomizer.randomize(sys, NUM_RANDOMIZATIONS);
					SystemTranslator transl = new SystemTranslator(config);

					PrologProgram code = transl.translate(sys);
					try {
						List<String> lines = new ArrayList<String>();
						lines.add(code.getCode());
						lines.addAll(Files.readAllLines(Paths.get(ANALYSIS[i])));
						Files.write(Paths.get("temp.pl"), lines);
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
					
					boolean anyFails = false;

					for(PrologAdapter interpreter : interpreters) {
						interpreter.loadFile("temp.pl");
						QueryResult result = interpreter.executeQuery(QUERIES[i]);
						interpreter.reset();
						
						List<Function<QueryResult, Boolean>> expectedViolations = EXPECTED_VIOLATIONS.get(i);
						
						boolean resultValid = true;
						if(expectedViolations.size() != result.getNumberOfSolutions()) {
							out.println("ERROR! Invalid number of solutions found!");
							resultValid = false;
						}
						for(Function<QueryResult, Boolean> vio : expectedViolations) {
							if(!vio.apply(result)) {
								out.println("ERROR! Missing Violation!");
								resultValid = false;
							}
						}
						if(!resultValid) {
							out.println("Failed for " + interpreter.getClass());
							out.println("Result: " + result);
							anyFails = true;
						}
					}
					if(anyFails) {
						ser.storeSystem(sys, "failure.systemmodel");
						return;
					}
				}
			}
			
		}
		
	}
}
