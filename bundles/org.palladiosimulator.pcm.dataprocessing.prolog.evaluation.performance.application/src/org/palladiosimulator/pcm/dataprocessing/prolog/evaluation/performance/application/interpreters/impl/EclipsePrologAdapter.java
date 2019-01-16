package org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.PrologAdapter;
import org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.QueryResult;

import com.parctechnologies.eclipse.EclipseEngineOptions;
import com.parctechnologies.eclipse.OutOfProcessEclipse;

public class EclipsePrologAdapter implements PrologAdapter {

	private OutOfProcessEclipse eclipseInstance;
	private EclipseTermToStringConverter termConverter = new EclipseTermToStringConverter();
	private String path;

	private OutOfProcessEclipse getEngine() {
		if (eclipseInstance == null) {
			try {
				EclipseEngineOptions options = new EclipseEngineOptions(new File(path));
				eclipseInstance = new OutOfProcessEclipse(options);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return eclipseInstance;
	}

	@Override
	public boolean loadFile(String filepath) {
		try {
			getEngine().compile(new File(filepath));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return true;
	}

	@Override
	public boolean reset() {
		try {
			getEngine().destroy();
			eclipseInstance = null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return true;
	}

	@Override
	public QueryResult executeQuery(String queryString) {
		try {
			String query = "findall(" + queryString + "," + queryString + ",X)";
			Collection<?> results = (Collection<?>) getEngine().rpc(query).arg(3);
			List<String> unificationResults = new ArrayList<>();
			for (Object sol : results) {
				unificationResults.add(termConverter.convert(sol));
			}
			UnificationResult uni = new UnificationResult();
			uni.setSolutions(unificationResults);
			return uni;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getName() {
		return "ECLiPSe";
	}

	@Override
	public void setPath(String path) {
		this.path = path;
	}

}
