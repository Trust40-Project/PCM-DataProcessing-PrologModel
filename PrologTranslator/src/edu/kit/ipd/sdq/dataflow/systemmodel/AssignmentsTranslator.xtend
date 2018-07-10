package edu.kit.ipd.sdq.dataflow.systemmodel

import edu.kit.ipd.sdq.dataflow.systemmodel.typing.AssignmentTypeRestrictionsCollector
import edu.kit.ipd.sdq.dataflow.systemmodel.typing.TypeRestrictions
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.stream.Collectors
import org.eclipse.emf.ecore.util.EcoreUtil

class AssignmentsTranslator {
	
	static interface PredicateProvider {
		def String getPredicate(String stackContextList, String variable, String attribute, String value);
	}
	
	val Blackboard bb;
	val AssignmentTypeRestrictionsCollector restrictionsCollector;
	val LogicTermTranslator logicTermTranslator;
	val Configuration config;
	
	new(Blackboard bb, Configuration config) {
		this.bb = bb;
		this.config = config;
		restrictionsCollector = new AssignmentTypeRestrictionsCollector(bb);
		logicTermTranslator = new LogicTermTranslator(bb, config);
	}
	
	def void buildAssignments(List<VariableAssignment> assignments, Caller callContext, PredicateProvider predicate, PrologProgram sink) {
		var typeRestrictions = new HashMap<VariableAssignment, TypeRestrictions>();
		for(a : assignments) {
			typeRestrictions.put(a, restrictionsCollector.collect(a));
		}
		var reversedAssignments = new ArrayList<VariableAssignment>(assignments);
		Collections.reverse(reversedAssignments);
		if(config.shorterAssignments) {
			generateShortenedAssignments(reversedAssignments, typeRestrictions, callContext, predicate, sink);
		} else {
			generateStandardAssignments(reversedAssignments, typeRestrictions, callContext, predicate, sink);			
		}
	}
	
	
	protected def void generateShortenedAssignments(List<VariableAssignment> reversedAssignments, HashMap<VariableAssignment, TypeRestrictions> typeRestrictions, Caller callContext, PredicateProvider predicate, PrologProgram sink) {
		for(assi : reversedAssignments) {
			
			val restrictions = typeRestrictions.get(assi);
			val preconditions = new StringBuilder;
			
			var value = "V";
			if(assi.value !== null) {
				value = "'" + assi.value.name + "'";
			} else if(!restrictions.valueWildCardReferenced) {
				value ="_";
			}
			
			var attribute = "A";
			if(assi.attribute !== null) {
				attribute = "'" + assi.attribute.name + "'";
			} else {
				if(restrictions.attributeRestrictions.isEmpty()) {
					if(!restrictions.attributeWildCardReferenced) {
						attribute = "_";
					}
				} else {
					for(res : restrictions.attributeRestrictions) {
						preconditions.append(res.getPredicateForRestriction(attribute)).append(',');
					}	
				}	
			}
			writeAssignmentRule(callContext,restrictions.isStackReferenced,predicate,preconditions.toString,attribute,value, assi,sink);
		}
	}
	
	protected def void generateStandardAssignments(List<VariableAssignment> reversedAssignments, HashMap<VariableAssignment, TypeRestrictions> typeRestrictions, Caller callContext, PredicateProvider predicate, PrologProgram sink) {
		var allVariables = reversedAssignments.stream().map([a | a.variable]).distinct().collect(Collectors.toSet);
		
		for(vari : allVariables) {
			for(attrib : vari.datatype.attributes) {
				for(value : attrib.type.values) {
					var wasAssigned = false;
					for(assi : reversedAssignments) {
						if(!wasAssigned && assi.variable === vari) {
							
							var tr = typeRestrictions.get(assi);
							
							val valueMatch = assi.value === null || assi.value === value;
							val attributeMatch = (assi.attribute === attrib || assi.attribute === null)
												&& tr.doesAttributeMatchRestrictions(bb, attrib);
							
							if(valueMatch && attributeMatch) {
								wasAssigned = true;
								writeAssignmentRule(callContext, tr.isStackReferenced, predicate,null, "'" + attrib.name + "'" , "'"+value.name+"'", assi, sink)
							}
						}
					}
				}
			}
		}
	}
	
	protected def Object writeAssignmentRule(Caller callContext, boolean isStackReferenced, PredicateProvider predicate,String preconditions, String attrib, String value, VariableAssignment assi, PrologProgram sink) {
		var String stackContext;
		if(isStackReferenced) {
			stackContext = '''['«callContext.name»'|S]''';
		} else {
			stackContext = '''['«callContext.name»'|_]''';							
		}
		var preconditionsPrefix = "";
		if(preconditions !== null) {
			preconditionsPrefix = preconditions + "!,";
		}
		
		var String pred = predicate.getPredicate(stackContext,"'" + assi.variable.name + "'",attrib,value);
		var String term = logicTermTranslator.translate(assi.term, stackContext, attrib, value);
		sink.addRule(pred, preconditionsPrefix + term);
		if(config.optimizedNegations) {
			pred = "not_"+pred;
			val negated = SystemModelFactory.eINSTANCE.createNot();
			negated.operand = EcoreUtil.copy(assi.term);
			term = logicTermTranslator.translate(negated, stackContext, attrib, value);
			sink.addRule(pred, preconditionsPrefix + term);									
		}
	}
	
}