package org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.impl;

import org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.PrologAdapter;
import org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.QueryResult;

public class JIPrologAdapter implements PrologAdapter {

//	private JIPEngine engine = new JIPEngine();
//
//	@Override
//	public boolean loadFile(String filepath) {
//		engine.consultFile(filepath);
//		return true;
//	}
//
//	@Override
//	public boolean reset() {
//		engine.reset();
//		return true;
//	}
//
//	@Override
//	public QueryResult executeQuery(String queryString) {
//		JIPTerm queryTerm = engine.getTermParser().parseTerm(queryString);
//		JIPQuery query = engine.openSynchronousQuery(queryTerm);
//		List<Map<String,String>> solutions = new ArrayList<>();
//		JIPTerm solution = query.nextSolution();
//		while(solution != null) {
//			Map<String,String> varMap = new HashMap<String, String>();
//			solutions.add(varMap);
//			JIPVariable[] vars = solution.getVariables();
//            for (JIPVariable var : vars) {
//                if (!var.isAnonymous()) {
//                	varMap.put(var.getName(), var.toStringq(engine));
//                }
//            }
//            solution = query.nextSolution();
//		}
//		VariableMappingResult res = new VariableMappingResult();
//		res.setSolutions(solutions);
//		return res;
//	}

	@Override
	public String getName() {
		return "JIProlog";
	}

	@Override
	public void setPath(String path) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean loadFile(String filepath) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean reset() {
		throw new UnsupportedOperationException();
	}

	@Override
	public QueryResult executeQuery(String queryString) {
		throw new UnsupportedOperationException();
	}

}
