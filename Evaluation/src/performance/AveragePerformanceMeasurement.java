package performance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.eclipse.emf.ecore.util.EcoreUtil;

import correctness.ModelRandomizer;
import correctness.QueryResultChecks;
import edu.kit.ipd.sdq.dataflow.systemmodel.Configuration;
import edu.kit.ipd.sdq.dataflow.systemmodel.PrologProgram;
import edu.kit.ipd.sdq.dataflow.systemmodel.System;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemTranslator;
import interpreters.EclipsePrologAdapter;
import interpreters.JIPrologAdapter;
import interpreters.PrologAdapter;
import interpreters.QueryResult;
import interpreters.SWIPrologAdapter;
import shared.ModelSerializer;

public class AveragePerformanceMeasurement {

	private PrologAdapter[] interpreters = {
		new SWIPrologAdapter(),
		new EclipsePrologAdapter(),
		new JIPrologAdapter()
	};
	
	private static final String MODEL = "models/accesscontrol_correct.systemmodel";
	private static final String ANALYSIS = "models/analysis-accesscontrol.pl";
	
	private static final String AC_QUERY = QueryResultChecks.ACCESSCONTROL_QUERY;
	
	private static final int NUM_REPETITIONS = 10;
	
	ModelScaler scaler = new ModelScaler();
	
	/**
	 * lnot,indexing,shorterAssignments
	 */
	private static final boolean[][] configs = {
			{false,false,false},
			{true,true,true},
			{true,false,false},
			{false,true,false},
			{false,false,true},
	};
	
	System baseModel;
	List<String> baseAnalysis;
	PerformanceTestBuilder ptb = new PerformanceTestBuilder();
	
	public static void main(String[] args) throws IOException {
		AveragePerformanceMeasurement m = new AveragePerformanceMeasurement();
		for(int i=0; i<10; i++) {
			m.measureTimings(Optional.empty(), 1, m.baseModel, AC_QUERY);			
		}
		
		m.measureScalingWithOperations(201,20);
		m.measureScalingWithCallGraph(1001, 100);
		m.measureScalingWithparams(201, 20);
		m.measureScalingWithAttributeValueCombinations(21, 2);
		m.measureScalingWithProperties(41, 4, new Random(42));
		m.measureIndexingPerfTest(1501, 150);
		m.measureNegationPerfTest(17, 2);
		
		//m.measureAssignmentsPerfTest(80, 10);
	}
	
	public AveragePerformanceMeasurement() throws IOException {
		baseModel = new ModelSerializer().loadSystem(MODEL);
		baseAnalysis = Files.readAllLines(Paths.get(ANALYSIS));
	}
	
	public void measureTimings(Optional<CSVWriter> result, int n, System model, String query) throws IOException {
		for(boolean[] config : configs) {
			
			long start = java.lang.System.nanoTime();
			
			Configuration conf = new Configuration();
			conf.setOptimizedNegations(config[0]);
			conf.setArgumentAndReturnValueIndexing(config[1]);
			conf.setShorterAssignments(config[2]);
			SystemTranslator trans = new SystemTranslator(conf);

			String filename = "temp_"+config[0]+"_"+config[1]+"_"+config[2]+".pl";
			PrologProgram code = trans.translate(model);
			try {
				List<String> lines = new ArrayList<String>();
				lines.add(code.getCode());
				lines.addAll(baseAnalysis);
				Files.write(Paths.get(filename), lines);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
			long end = java.lang.System.nanoTime();
			double transTimeMs = (end-start) / 1000.0 / 1000.0;
			
			for(PrologAdapter interpreter : interpreters) {
				
				start = java.lang.System.nanoTime();
				
				interpreter.loadFile(filename);

				end = java.lang.System.nanoTime();
				double loadTimeMs = (end-start) / 1000.0 / 1000.0;
				start = end;
				
				QueryResult res = interpreter.executeQuery(query);

				end = java.lang.System.nanoTime();
				double analysisTimeMs = (end-start) / 1000.0 / 1000.0;
				
				if(res.getNumberOfSolutions() != 0) {
					throw new RuntimeException("Invalid Analysis!");
				}
				interpreter.reset();
				if(result.isPresent()) {
					result.get().writeRecord(n, interpreter.getName(), conf, transTimeMs, loadTimeMs, analysisTimeMs);
				}
			}
		}
		
	}
	
	public void measureScalingWithOperations(int nMax,int stepSize) throws IOException {
		
		java.lang.System.out.println("Measuring Operation Scaling");
		CSVWriter result = new CSVWriter("operations");
		//System copied = EcoreUtil.copy(baseModel);
		for(int n=1; n<=nMax; n+=stepSize) {
			System scaled = scaler.scaleOperationCount(baseModel, n);
			for(int j=0; j <NUM_REPETITIONS; j++) {
				measureTimings(Optional.of(result), scaled.getOperations().size(), scaled, AC_QUERY);				
			}
		}
		result.close();
	}

	public void measureScalingWithparams(int nMax,int stepSize) throws IOException {
		
		java.lang.System.out.println("Measuring Parameter Scaling");
		CSVWriter result = new CSVWriter("parameters");
		//System copied = EcoreUtil.copy(baseModel);
		for(int n=1; n<=nMax; n+=stepSize) {
			System scaled = scaler.scaleParameterandReturnValueCount(baseModel, n);
			for(int j=0; j <NUM_REPETITIONS; j++) {
				int cnt = scaled.getOperations().stream().mapToInt(op -> op.getParameters().size() + op.getReturnValues().size()).sum();
				measureTimings(Optional.of(result), cnt, scaled, AC_QUERY);				
			}
		}
		result.close();
	}
	
	public void measureScalingWithAttributeValueCombinations(int nMax,int stepSize) throws IOException {
		
		java.lang.System.out.println("Measuring Attribute-Value-Combo Scaling");
		CSVWriter result = new CSVWriter("values");
		//System copied = EcoreUtil.copy(baseModel);
		for(int n=1; n<=nMax; n+=stepSize) {
			System scaled = scaler.scaleAttributeValueCombinations(baseModel, n);
			for(int j=0; j <NUM_REPETITIONS; j++) {
				int cnt = scaled.getAttributes().stream().mapToInt(attrib -> attrib.getType().getValues().size()).sum();
				measureTimings(Optional.of(result), cnt, scaled, AC_QUERY);				
			}
		}
		result.close();
	}
	
	public void measureScalingWithProperties(int nMax,int stepSize, Random rnd) throws IOException {
		
		java.lang.System.out.println("Measuring Property Scaling");
		CSVWriter result = new CSVWriter("properties");
		for(int n=1; n<=nMax; n+=stepSize) {
			System scaled = scaler.scaleProperties(baseModel, n, rnd);
			for(int j=0; j <NUM_REPETITIONS; j++) {
				int cnt = scaled.getProperties().stream().mapToInt(prop -> prop.getType().getValues().size()).sum();
				measureTimings(Optional.of(result), cnt, scaled, AC_QUERY);				
			}
		}
		result.close();
	}
	
	public void measureScalingWithCallGraph(int nMax,int stepSize) throws IOException {
		
		ModelRandomizer rnd = new ModelRandomizer(new Random(424242));
		
		java.lang.System.out.println("Measuring Call-Graph Scaling");
		CSVWriter result = new CSVWriter("callgraph");
		//System copied = EcoreUtil.copy(baseModel);
		for(int n=1; n<=nMax; n+=stepSize) {
			for(int j=0; j <NUM_REPETITIONS; j++) {
				System scaled = EcoreUtil.copy(baseModel);
				rnd.randomize(scaled, n-1);
				measureTimings(Optional.of(result), scaled.getOperations().size(), scaled, AC_QUERY);				
			}
		}
		result.close();
	}
	
	public void measureIndexingPerfTest(int nMax,int stepSize) throws IOException {
		
		java.lang.System.out.println("Measuring Indexing Performance Test Scaling");
		CSVWriter result = new CSVWriter("indexing-perftest");
		//System copied = EcoreUtil.copy(baseModel);
		for(int n=1; n<=nMax; n+=stepSize) {
			System scaled = ptb.getLinearCallModel(n);
			for(int j=0; j <NUM_REPETITIONS; j++) {
				measureTimings(Optional.of(result), scaled.getOperations().size(), scaled, "linearDependency(S)");				
			}
		}
		result.close();
	}
	
	public void measureNegationPerfTest(int nMax,int stepSize) throws IOException {
		
		java.lang.System.out.println("Measuring Negation Performance Test Scaling");
		CSVWriter result = new CSVWriter("negation-perftest");
		//System copied = EcoreUtil.copy(baseModel);
		for(int n=1; n<=nMax; n+=stepSize) {
			System scaled = ptb.getExponentialCallModel(n);
			for(int j=0; j <NUM_REPETITIONS; j++) {
				measureTimings(Optional.of(result), scaled.getOperations().size(), scaled, "constantDependency(S)");				
			}
		}
		result.close();
	}
	

	public void measureAssignmentsPerfTest(int nMax,int stepSize) throws IOException {
		
		java.lang.System.out.println("Measuring Negation Performance Test Scaling");
		CSVWriter result = new CSVWriter("assignments-perftest");
		//System copied = EcoreUtil.copy(baseModel);
		for(int n=1; n<=nMax; n+=stepSize) {
			System scaled = scaler.scaleAttributeValueCombinations(ptb.getLinearCallModel(1), n);
			for(int j=0; j <NUM_REPETITIONS; j++) {
				int cnt = scaled.getAttributes().stream().mapToInt(attrib -> attrib.getType().getValues().size()).sum();
				measureTimings(Optional.of(result), cnt, scaled, "linearDependency(S)");				
			}
		}
		result.close();
	}
	


}
