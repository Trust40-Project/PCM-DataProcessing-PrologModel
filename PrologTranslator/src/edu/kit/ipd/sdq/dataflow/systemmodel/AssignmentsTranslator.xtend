package edu.kit.ipd.sdq.dataflow.systemmodel

import java.util.List
import edu.kit.ipd.sdq.dataflow.systemmodel.typing.AssignmentTypeRestrictionsCollector
import java.util.HashMap
import edu.kit.ipd.sdq.dataflow.systemmodel.typing.TypeRestrictions
import java.util.Collections
import java.util.ArrayList
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
		
		var allVariables = assignments.stream().map([a | a.variable]).distinct().collect(Collectors.toSet);
		
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
								var String stackContext;
								if(tr.isStackReferenced) {
									stackContext = '''['«callContext.name»'|S]''';
								} else {
									stackContext = '''['«callContext.name»'|_]''';							
								}
								var String pred = predicate.getPredicate(stackContext,vari.name,attrib.name,value.name);
								var String term = logicTermTranslator.translate(assi.term, stackContext, attrib.name, value.name);
								sink.addRule(pred, term);
								if(config.optimizedNegations) {
									pred = "not_"+pred;
									val negated = SystemModelFactory.eINSTANCE.createNot();
									negated.operand = EcoreUtil.copy(assi.term);
									term = logicTermTranslator.translate(negated, stackContext, attrib.name, value.name);
									sink.addRule(pred, term);									
								}
							}
						}
					}
				}
			}
		}
	}
	
}