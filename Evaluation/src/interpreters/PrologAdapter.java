package interpreters;
import java.util.Collection;
import java.util.Map;

public interface PrologAdapter {
	
	boolean loadFile(String filepath);
	
	boolean reset();

	QueryResult executeQuery(String queryString);

	String getName();

}
