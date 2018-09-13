package interpreters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;


public class SWIPrologAdapter implements PrologAdapter {

	private static SWIPrologAdapter instance;
	
	private List<String> loadedFiles = new ArrayList<String>();
	
	static SWIPrologAdapter getInstance() {
		if(instance == null) {
			instance = new SWIPrologAdapter();
		}
		return instance;
	}
	
	public boolean loadFile(String path) {
		Query loadQ = new Query("load_files", new Atom(path));
		if(loadQ.hasSolution()) {
			loadedFiles.add(path);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean reset() {
		Collections.reverse(loadedFiles);
		for(String file : loadedFiles) {
			Query loadQ = new Query("unload_file", new Atom(file));
			if(!loadQ.hasSolution()) {
				throw new RuntimeException("unloading of " + file + " failed!");
			}
		}
		loadedFiles.clear();
		return true;
	}
	
	public QueryResult executeQuery(String queryString) {
		Query query = new Query(queryString);
		List<Map<String,String>> portableResults = new ArrayList<Map<String,String>>();
		for(Map<String,Term> result : query.allSolutions()) {
			Map<String,String> varMap = new HashMap<String, String>();
			for(Entry<String,Term> varDef : result.entrySet()) {
				varMap.put(varDef.getKey(), convertTerm(varDef.getValue()));
			}
			portableResults.add(varMap);
		}
		VariableMappingResult res = new VariableMappingResult();
		res.setSolutions(portableResults);
		return res;
	}

	private String convertTerm(Term value) {
		if(value.isAtom()) {
			return "'" + value.name() + "'";
		} else if(value.isListPair()) {
			return convertList(value);
		} else if(value.isListNil()) {
			return "[]";
		} else if (value.isVariable()) {
			return value.name();
		}
		throw new RuntimeException("unexpected term type: " + value.typeName());
	}

	private String convertList(Term current) {
		StringBuffer list = new StringBuffer("[");
		
		Function<Term,String> termToString = t -> {
			if(t.isAtom()) {
				return "'" + t.name() +"'";
			}else if (t.isVariable()) {
				return t.name();
			} else {
				throw new RuntimeException("unexpected term! : " + t.typeName());
			}
		};
		
		boolean isFirstElement = true;
		while(true) {
			if(current.isListNil()) {
				break;
			} 
			if(isFirstElement) {
				isFirstElement = false;
			} else {
				if(current.isVariable()) {
					list.append('|');
				} else {
					list.append(',');
				}
			} if(current.isAtom() || current.isVariable()) {
				list.append(termToString.apply(current));
				break;
			} else if(current.isListPair()) {
				list.append(termToString.apply(current.arg(1)));
				current = current.arg(2);
			}
		}
		list.append(']');
		return list.toString();
	}

	@Override
	public String getName() {
		return "SWIProlog";
	}
	
}
