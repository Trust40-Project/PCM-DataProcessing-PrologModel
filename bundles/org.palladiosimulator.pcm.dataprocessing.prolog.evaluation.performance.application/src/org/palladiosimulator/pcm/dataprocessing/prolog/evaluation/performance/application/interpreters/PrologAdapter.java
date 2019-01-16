package org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters;

public interface PrologAdapter {
	
	void setPath(String path);
	
	boolean loadFile(String filepath);
	
	boolean reset();

	QueryResult executeQuery(String queryString);

	String getName();
	
	default boolean isValid() {
		try {
			return executeQuery("true.").getNumberOfSolutions() > 0;	
		} catch (Exception e) {
			return false;
		}
	}

}
