package org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.impl;
import java.util.List;
import java.util.Map;

import org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.QueryResult;

public class VariableMappingResult implements QueryResult {
	
	/**
	 * maps variable to their value term for each solution.
	 */
	private List<Map<String,String>> solutions;

	public List<Map<String, String>> getSolutions() {
		return solutions;
	}

	public void setSolutions(List<Map<String, String>> solutions) {
		this.solutions = solutions;
	}

	@Override
	public String toString() {
		return solutions.toString();
	}

	@Override
	public int getNumberOfSolutions() {
		return solutions.size();
	}
}
