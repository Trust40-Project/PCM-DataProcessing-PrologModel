package interpreters;

import java.util.Collection;

import com.parctechnologies.eclipse.Atom;
import com.parctechnologies.eclipse.CompoundTerm;

public class EclipseTermToStringConverter {

	public String convert(Object term) {
		if(term == null) {
			return "_";
		} else if(term instanceof Atom) {
			return "'" + ((Atom) term).functor() + "'";
		} else if(term instanceof CompoundTerm) {
			CompoundTerm t = (CompoundTerm) term;
			StringBuilder result = new StringBuilder();
			result.append(t.functor());
			result.append("(");
			for(int i=0; i < t.arity(); i++) {
				if(i > 0) result.append(',');
				result.append(convert(t.arg(i + 1)));
			}
			result.append(")");
			return result.toString();
		} else if(term instanceof Collection) {
			StringBuilder result = new StringBuilder();
			result.append("[");
			boolean isFirst = true;
			for(Object sub : (Collection<?>) term) {
				if(isFirst) {
					isFirst = false;
				} else {
					result.append(',');
				}
				result.append(convert(sub));
			}
			result.append("]");
			return result.toString();
		}
		throw new RuntimeException("unexpected case : " + term.getClass());
	}
	
}
