package edu.kit.ipd.sdq.dataflow.systemmodel

import edu.kit.ipd.sdq.dataflow.systemmodel.configuration.Configuration
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.And
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.False
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Not
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Or
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.True
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable

/**
 * Translates LogicTerms (the right sides of Variable Assignments).
 */
class LogicTermTranslator {
	
	val TranslationCache bb;
	val Configuration config
	
	new(TranslationCache bb, Configuration config) {
		this.bb = bb;
		this.config = config;
	}
	
	def String getWildcardOrName(Attribute attrib, LogicTermContext context) {
		if(attrib !== null) {
			return "'" + attrib.name +"'";
		} else {
			return context.attributeWildCardInstatiation;
		}
	}
	
	def String getWildcardOrName(Value value, LogicTermContext context) {
		if(value !== null) {
			return "'" + value.name +"'";
		} else {
			return context.valueWildCardInstatiation;
		}
	}
	
	def dispatch String translate(True term, LogicTermContext context) {
		return "true";
	}
	
	def dispatch String translate(False term, LogicTermContext context) {
		return "fail";
	}
	
	def dispatch String translate(Not term, LogicTermContext context) {
		if(config.optimizedNegations) {
			return '''lnot(«translate(term.operand,context)»)''';	
		} else {
			if(bb.getTermTypeRestrictions(term.operand).isStackReferenced) {
				//we have to bind the stack-variable in case it is used within the negated operand
				//all other possible variables are required to be bound when invoking logical terms
				return '''(stackValid(«context.currentStack»), \+ «translate(term.operand,context)»)''';			
			} else {
				return '''\+ «translate(term.operand,context)»)''';			
			}
		}
	}
	
	def dispatch String translate(And term, LogicTermContext context) {
		return '''(«translate(term.operands.get(0),context)» , «translate(term.operands.get(1),context)»)''';
	}
	
	def dispatch String translate(Or term, LogicTermContext context) {
		return '''(«translate(term.operands.get(0),context)» ; «translate(term.operands.get(1),context)»)''';
	}
	
	def dispatch String translate(PropertyRef term, LogicTermContext context) {
		return '''operationProperty('«term.operation.name»','«term.property.name»',«getWildcardOrName(term.value,context)»)''';
	}
	
	def dispatch String translate(DefaultStateRef term, LogicTermContext context) {
		val variable = term.stateVariable;
		val operation = getVariableContainingOperation(variable);
		
		return '''defaultStateImpl('«operation.name»','«variable.name»',«getWildcardOrName(term.attribute,context)»,«getWildcardOrName(term.value,context)»)''';
	}
	
	def dispatch String translate(ParameterRef term, LogicTermContext context) {
		return '''callArgumentImpl(«context.currentStack»,'«term.parameter.name»',«getWildcardOrName(term.attribute,context)»,«getWildcardOrName(term.value,context)»)''';
	}
	
	def dispatch String translate(ReturnValueRef term, LogicTermContext context) {
		val callStack = '''['«term.call.callee.name»','«term.call.name»'|«context.currentStack»]'''
		return '''returnValueImpl(«callStack»,'«term.returnValue.name»',«getWildcardOrName(term.attribute,context)»,«getWildcardOrName(term.value,context)»)''';
	}
	
	def dispatch String translate(StateRef term, LogicTermContext context) {
		val variable = term.stateVariable;
		val operation = getVariableContainingOperation(variable);
		
		return switch context.stateAccessPredicate {
			case PRECALL: '''preCallStateImpl(«context.stateAccessStack»,'«operation.name»','«variable.name»',«getWildcardOrName(term.attribute,context)»,«getWildcardOrName(term.value,context)»)'''
			case POSTCALL: '''postCallStateImpl(«context.stateAccessStack»,'«operation.name»','«variable.name»',«getWildcardOrName(term.attribute,context)»,«getWildcardOrName(term.value,context)»)'''
		};
	}
	
	def private getVariableContainingOperation(Variable variable) {
		val varContainer = variable.eContainer;
		if(!(varContainer instanceof Operation)) {
			throw new RuntimeException("Given Variable is not contained in an operation");
		}
		return varContainer as Operation;
	}
	
	
}