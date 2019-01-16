package org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.impl;
import java.util.List;

import org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.QueryResult;

public class UnificationResult implements QueryResult {

	private List<String> solutions;

	public List<String> getSolutions() {
		return solutions;
	}

	public void setSolutions(List<String> solutions) {
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
