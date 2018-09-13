package interpreters;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.parctechnologies.eclipse.CompoundTerm;
import com.parctechnologies.eclipse.EclipseEngineOptions;
import com.parctechnologies.eclipse.OutOfProcessEclipse;

public class EclipsePrologAdapter implements PrologAdapter {
	
	private OutOfProcessEclipse eclipse;
	private EclipseTermToStringConverter termConverter = new EclipseTermToStringConverter();
	
	public EclipsePrologAdapter() {
		try {
			EclipseEngineOptions options = new EclipseEngineOptions(new File("C:\\Program Files\\ECLiPSe 7.0"));
			eclipse = new OutOfProcessEclipse(options);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	

	@Override
	public boolean loadFile(String filepath) {
		try {
			eclipse.compile(new File(filepath));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return true;
	}

	@Override
	public boolean reset() {
		try {
			eclipse.destroy();
			EclipseEngineOptions options = new EclipseEngineOptions(new File("C:\\Program Files\\ECLiPSe 7.0"));
			eclipse = new OutOfProcessEclipse(options);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return true;
	}

	@Override
	public QueryResult executeQuery(String queryString) {
		try {
			String query = "findall(" + queryString+ "," +queryString +",X)"; 
			Collection<?> results = (Collection<?>)eclipse.rpc(query).arg(3);
			List<String> unificationResults = new ArrayList<>();
			for(Object sol : results) {
				unificationResults.add(termConverter.convert(sol));
			}
			UnificationResult uni = new UnificationResult();
			uni.setSolutions(unificationResults);
			return uni;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		// TODO Auto-generated method stub
	}


	@Override
	public String getName() {
		return "ECLiPSe";
	}

}
