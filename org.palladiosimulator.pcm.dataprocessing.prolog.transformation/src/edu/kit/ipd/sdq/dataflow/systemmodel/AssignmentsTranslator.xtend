package edu.kit.ipd.sdq.dataflow.systemmodel

import edu.kit.ipd.sdq.dataflow.systemmodel.configuration.Configuration
import edu.kit.ipd.sdq.dataflow.systemmodel.typing.AssignmentTypeRestrictionsCollector
import edu.kit.ipd.sdq.dataflow.systemmodel.typing.AttributeRestriction
import edu.kit.ipd.sdq.dataflow.systemmodel.typing.TypeRestrictions
import java.util.ArrayList
import java.util.Collection
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Optional
import java.util.stream.Collectors
import org.eclipse.emf.ecore.util.EcoreUtil
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment

import static java.util.Arrays.asList

import static extension edu.kit.ipd.sdq.dataflow.systemmodel.Util.asAtom
import static extension edu.kit.ipd.sdq.dataflow.systemmodel.Util.negatedPredicate
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelFactory

/**
 * Translates sets of assignments for a single predicate.
 */
class AssignmentsTranslator {
	
	
	val TranslationCache cache;
	val AssignmentTypeRestrictionsCollector restrictionsCollector;
	val LogicTermTranslator logicTermTranslator;
	val Configuration config;
	/**
	 * cache variable for the type restrictions, is used across different methods.
	 */
	val typeRestrictions = new HashMap<VariableAssignment, TypeRestrictions>();
	
	/**
	 * Only used when the "shorter assignments" optimization is enabled.
	 * This counter is used for generating a unique assignment id.
	 */
	var assignmentIdCounter = 1;
	
	new(TranslationCache bb, Configuration config) {
		this.cache = bb;
		this.config = config;
		restrictionsCollector = new AssignmentTypeRestrictionsCollector(bb);
		logicTermTranslator = new LogicTermTranslator(bb, config);
	}
	
	def void buildAssignments(List<VariableAssignment> assignments, AssignmentContext assiContext, PrologProgram sink) {
		typeRestrictions.clear();
		for(a : assignments) {
			typeRestrictions.put(a, restrictionsCollector.collect(a));
		}
		var reversedAssignments = new ArrayList<VariableAssignment>(assignments);
		Collections.reverse(reversedAssignments);
		if(config.shorterAssignments) {
			generateShortenedAssignments(reversedAssignments, assiContext, sink);
		} else {
			generateStandardAssignments(reversedAssignments, assiContext, sink);			
		}
	}
	
	protected def void generateShortenedAssignments(List<VariableAssignment> reversedAssignments, AssignmentContext assiContext, PrologProgram sink) {
		val assignmentId = assignmentIdCounter;
		assignmentIdCounter++;
		
		//generate a indirection to our assignment rule set
		
		val LogicTermContext ltContext = new LogicTermContext;
		generateStackInfoForLogicTermContext(assiContext, true, ltContext);
		val allVars = reversedAssignments.stream().map([assi | assi.variable]).collect(Collectors.toSet());
		
		val adaptedContext = assiContext.copy();
		adaptedContext.predicateName = '''assignment_�assignmentId�''';
		adaptedContext.predicateArguments = [S,VAR,A,VAL | asList(S,VAR.name.asAtom(),A,VAL)];
		
		val getAdaptedContextPredicate = [String S,Variable VAR,String A, String VAL | '''assignment_�assignmentId�(�S�,�VAR.name.asAtom()�,�A�,�VAL�)'''.toString()]
		
		for(vari : allVars) {
			sink.addRule(assiContext.predicateName,
				assiContext.predicateArguments.getPredicateArguments(ltContext.currentStack,vari,"A","V"),
				getAdaptedContextPredicate.apply(ltContext.currentStack,vari,"A","V"));
			if(config.optimizedNegations) {
				sink.addRule(assiContext.predicateName.negatedPredicate,
					assiContext.predicateArguments.getPredicateArguments(ltContext.currentStack,vari,"A","V"),
				getAdaptedContextPredicate.apply(ltContext.currentStack,vari,"A","V").negatedPredicate);
			}
		}
		
		val generateAssignment = [VariableAssignment assi, boolean negated | 
			val restrictions = typeRestrictions.get(assi);
			
			val value = getValueVariable(assi.value, restrictions);
			var attribute = getAttributeVariable(assi.attribute, restrictions);
			
			var Optional<Collection<AttributeRestriction>> preconditions;			
			if(assi.isAttributeWildcard) {
				preconditions = Optional.of(restrictions.attributeRestrictions);
			} else {
				preconditions = Optional.of(Collections.emptyList());
			}
			writeAssignmentRule(adaptedContext,restrictions.isStackReferenced,negated,preconditions,attribute,value, assi,sink);
		];
		
		for(assign : reversedAssignments) {
			generateAssignment.apply(assign,false);			
		}
		if(config.optimizedNegations) {
			for(assign : reversedAssignments) {
				generateAssignment.apply(assign,true);			
			}
		}
	}
	
	protected def void generateStandardAssignments(List<VariableAssignment> reversedAssignments, AssignmentContext assiContext, PrologProgram sink) {
		var allVariables = reversedAssignments.stream().map([a | a.variable]).distinct().collect(Collectors.toSet);
		
		for(vari : allVariables) {
			for(attrib : vari.datatype.attributes) {
				for(value : attrib.type.values) {
					var wasAssigned = false;
					for(assign : reversedAssignments) {
						if(!wasAssigned && assign.variable === vari) {
							
							var tr = typeRestrictions.get(assign);
							
							val valueMatch = assign.isValueWildcard || assign.value === value;
							val attributeMatch = (assign.attribute === attrib || assign.isAttributeWildcard)
												&& tr.doesAttributeMatchRestrictions(cache, attrib);
							
							if(valueMatch && attributeMatch) {
								wasAssigned = true;
								writeAssignmentRule(assiContext, tr.isStackReferenced,false, Optional.empty(), attrib.name.asAtom(), value.name.asAtom(), assign, sink)
								if(config.optimizedNegations) {
									writeAssignmentRule(assiContext, tr.isStackReferenced,true, Optional.empty(), attrib.name.asAtom() , value.name.asAtom(), assign, sink)			
								}
							}
						}
					}
				}
			}
		}
	}
	
	private def generateStackInfoForLogicTermContext(AssignmentContext assiContext, boolean isStackReferenced, LogicTermContext ltContext) {
		var String stackVariable;
		if(isStackReferenced) {
			stackVariable= "S";
		} else {
			stackVariable= "_";					
		}
		ltContext.currentStack = '''[�assiContext.getCurrentOperation.name.asAtom�|�stackVariable�]''';
		
		if(assiContext.previousCall.isPresent) {
			val call = assiContext.previousCall.get();
			ltContext.stateAccessPredicate = StateAccessMode.POSTCALL;
			ltContext.stateAccessStack = '''[�call.callee.name.asAtom�,�call.name.asAtom�,�call.caller.name.asAtom�|�stackVariable�]''';
		} else {
			ltContext.stateAccessPredicate = StateAccessMode.PRECALL;
			ltContext.stateAccessStack = ltContext.currentStack;	
		}
	}
	
	private def getValueVariable(Value value, TypeRestrictions typeRestrictions) {
		if(value !== null) {
			return value.name.asAtom;
		} else {  //value is wildcard
			if(!typeRestrictions.valueWildCardReferenced) {
				return "_";				
			} else {
				return "V";
			}
		}
	}
	
	private def getAttributeVariable(Attribute attrib, TypeRestrictions typeRestrictions) {
		if(attrib !== null) {
			return attrib.name.asAtom;
		} else { //attribute is wildcard
			if(typeRestrictions.attributeRestrictions.isEmpty() && !typeRestrictions.attributeWildCardReferenced) {
				return "_";
			} else {
				return "A";
			}
		}
	}	
	
	private def void writeAssignmentRule(AssignmentContext assiContext, boolean isStackReferenced, boolean negated, Optional<Collection<AttributeRestriction>> preconditions, String attrib, String value, VariableAssignment assi, PrologProgram sink) {
		
		val LogicTermContext ltContext = new LogicTermContext;
		generateStackInfoForLogicTermContext(assiContext, isStackReferenced, ltContext);
		
		
		ltContext.valueWildCardInstatiation = value;
		ltContext.attributeWildCardInstatiation = attrib;
		
		var preconditionsPrefix = "";
		if(preconditions.isPresent) {
			for(precond : preconditions.get()) {
				preconditionsPrefix += precond.getPredicateForRestriction(attrib) + ",";
			}
			preconditionsPrefix += "!,";
		}
		
		val predArgs = assiContext.predicateArguments.getPredicateArguments(ltContext.currentStack,assi.variable,attrib,value);
		
		if(negated) {
			val negatedTerm = PrologmodelFactory.eINSTANCE.createNot();
			negatedTerm.operand = EcoreUtil.copy(assi.term);
			val term = logicTermTranslator.translate(negatedTerm, ltContext);
			sink.addRule(assiContext.predicateName.negatedPredicate,predArgs, preconditionsPrefix + term);									
		} else {
			var String term = logicTermTranslator.translate(assi.term, ltContext);
			sink.addRule(assiContext.predicateName,predArgs, preconditionsPrefix + term);			
		}
	}
	
}