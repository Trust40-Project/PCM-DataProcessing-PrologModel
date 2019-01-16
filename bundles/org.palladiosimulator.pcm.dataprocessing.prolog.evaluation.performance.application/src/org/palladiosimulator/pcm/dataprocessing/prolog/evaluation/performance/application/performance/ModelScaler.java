package org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.performance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Caller;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.OperationCall;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelFactory;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyDefinition;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.SystemUsage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.VariableAssignment;



public class ModelScaler {
	
	public System scaleOperationCount(System baseSystem, int n) {
		System result = EcoreUtil.copy(baseSystem);
		List<Caller> elemsToCopy = new ArrayList<>();
		elemsToCopy.addAll(result.getOperations());
		elemsToCopy.addAll(result.getSystemusages());
		for(int i=1; i<n; i++) {
			Collection<Caller> copied= EcoreUtil.copyAll(elemsToCopy);
			for(Caller caller : copied) {
				caller.setName(caller.getName()+"_"+i);
				if(caller instanceof Operation) {
					result.getOperations().add((Operation) caller);
				} else {
					result.getSystemusages().add((SystemUsage) caller);
				}
			}
		}
		return result;
	}
	
	public System scaleParameterandReturnValueCount(System baseSystem, int n) {
		System result = EcoreUtil.copy(baseSystem);
		Set<Variable> originalParams =  result.getOperations().stream()
										.flatMap(op -> op.getParameters().stream())
										.collect(Collectors.toSet());
		Set<Variable> originalReturnValue =  result.getOperations().stream()
				.flatMap(op -> op.getReturnValues().stream())
				.collect(Collectors.toSet());
		for(int i=1; i<n; i++) {
			Map<Variable,Variable> origToCopied = new HashMap<Variable, Variable>();
			for(Operation op: result.getOperations()) {
				for(Variable p : new ArrayList<>(op.getParameters())) {
					if(originalParams.contains(p)) {
						Variable newP = EcoreUtil.copy(p);
						newP.setName(newP.getName()+"_"+i);
						op.getParameters().add(newP);
						origToCopied.put(p, newP);
					}
				}
				for(Variable rv : new ArrayList<>(op.getReturnValues())) {
					if(originalReturnValue.contains(rv)) {
						Variable newRV = EcoreUtil.copy(rv);
						newRV.setName(newRV.getName()+"_"+i);
						op.getReturnValues().add(newRV);
						origToCopied.put(rv, newRV);
					}
				}
			}
			for(Operation op: result.getOperations()) {
				updateAssignments(origToCopied,op.getReturnValueAssignments());
				for(OperationCall call : op.getCalls()) {
					updateAssignments(origToCopied,call.getParameterAssignments());
				}
			}
			for(SystemUsage us: result.getSystemusages()) {
				for(OperationCall call : us.getCalls()) {
					updateAssignments(origToCopied,call.getParameterAssignments());
				}
			}
		}
		return result;
	}

	private void updateAssignments(Map<Variable, Variable> origToCopied, EList<VariableAssignment> assignments) {
		for(VariableAssignment assi : new ArrayList<>(assignments)) {
			if(origToCopied.containsKey(assi.getVariable())) {
				VariableAssignment copied = EcoreUtil.copy(assi);
				copied.setVariable(origToCopied.get(copied.getVariable()));
				TreeIterator<EObject> it = copied.eAllContents();
				while(it.hasNext()) {
					EObject elem = it.next();
					if(elem instanceof ParameterRef) {
						((ParameterRef) elem).setParameter(origToCopied.get(((ParameterRef) elem).getParameter()));
					} else if(elem instanceof ReturnValueRef) {
						((ReturnValueRef) elem).setReturnValue(origToCopied.get(((ReturnValueRef) elem).getReturnValue()));
					}
				}
				assignments.add(copied);
			}
		}
	}
	
	public System scaleAttributeValueCombinations(System baseSystem, int n) {
		System result = EcoreUtil.copy(baseSystem);
		PrologmodelFactory fac = PrologmodelFactory.eINSTANCE;
		for(int i=1; i<=n; i++) {
			ValueSetType dummyType = fac.createValueSetType();
			dummyType.setName("dummyType_"+i);
			for(int j=0; j<100; j++) {
				Value val = fac.createValue();
				val.setName("val_"+j);
				dummyType.getValues().add(val);
			}
			result.getTypes().add(dummyType);
			Attribute dummyAttrib = fac.createAttribute();
			dummyAttrib.setName("dummyAttrib_"+i);
			dummyAttrib.setType(dummyType);
			result.getAttributes().add(dummyAttrib);
			for(DataType dt: result.getDatatypes()) {
				dt.getAttributes().add(dummyAttrib);
			}
		}
		return result;
	}
	

	public System scaleProperties(System baseSystem, int n, Random rnd) {
		System result = EcoreUtil.copy(baseSystem);
		PrologmodelFactory fac = PrologmodelFactory.eINSTANCE;
		for(int i=1; i<=n; i++) {
			ValueSetType dummyType = fac.createValueSetType();
			dummyType.setName("propType_"+i);
			for(int j=0; j<100; j++) {
				Value val = fac.createValue();
				val.setName("val_"+j);
				dummyType.getValues().add(val);
			}
			result.getTypes().add(dummyType);
			
			Property prop = fac.createProperty();
			prop.setName("prop_"+i);
			prop.setType(dummyType);
			result.getProperties().add(prop);
			
			for(Operation op: result.getOperations()) {
				PropertyDefinition propDef = fac.createPropertyDefinition();
				propDef.setProperty(prop);
				for(Value val : dummyType.getValues()) {
					if(rnd.nextDouble() >= 0.5) {
						propDef.getPresentValues().add(val);
					}
				}
				op.getPropertyDefinitions().add(propDef);
			}
		}
		return result;
	}

}
