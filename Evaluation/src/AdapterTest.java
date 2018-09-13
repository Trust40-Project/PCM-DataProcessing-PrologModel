import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import javax.swing.event.ListSelectionEvent;

import edu.kit.ipd.sdq.dataflow.systemmodel.System;
import edu.kit.ipd.sdq.dataflow.systemmodel.Configuration;
import edu.kit.ipd.sdq.dataflow.systemmodel.PrologProgram;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemTranslator;
import interpreters.SWIPrologAdapter;
import performance.PerformanceTestBuilder;

public class AdapterTest {
	
	

	private static final String FILE_PATH = "temp.pl";

	public static void main(String[] args) throws IOException {
		PerformanceTestBuilder ptb = new PerformanceTestBuilder();

		SWIPrologAdapter swi = new SWIPrologAdapter();
		

		for(int i=10; i<28; i+=2) {

			System sys = ptb.getExponentialCallModel(i);

			Configuration config = new Configuration();
			//config.setArgumentAndReturnValueIndexing(false);
			//config.setShorterAssignments(false);
			//config.setOptimizedNegations(false);
			
			SystemTranslator transl = new SystemTranslator(config);
			
			PrologProgram code = transl.translate(sys);
			Files.write(Paths.get(FILE_PATH), Arrays.asList(code.getCode()));
			java.lang.System.out.println("Running for n=" + i);
			
			long start = java.lang.System.currentTimeMillis();
			swi.loadFile(FILE_PATH);
			long load = java.lang.System.currentTimeMillis();
			swi.executeQuery("S=[doSomething|_], lnot( returnValue(S,output,encrypted,isTrue))");				
			long query = java.lang.System.currentTimeMillis();
			swi.reset();

			java.lang.System.out.println("Load: " + (load-start)+"ms, query: " +(query-load)+"ms");
			
		}
		
		/*
		PrologAdapter swi = new EclipsePrologAdapter();
		swi.loadFile(FILE_PATH);
		Collection<Map<String,String>> results = swi.executeQuery(QUERY_STRING); 
		swi.reset();
		System.out.println(results);
		*/
	}

}
