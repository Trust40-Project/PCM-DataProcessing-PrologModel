package correctness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edu.kit.ipd.sdq.dataflow.systemmodel.Operation;
import edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall;
import edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.System;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelFactory;
import edu.kit.ipd.sdq.dataflow.systemmodel.Variable;
import edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment;

public class ModelRandomizer {
	
	Random rnd;
	
	public ModelRandomizer(Random rnd) {
		this.rnd =rnd;
	}
	
	public void randomize(System sys, int numOps) {
		for(int i=1; i<=numOps; i++) {
			if(rnd.nextDouble() >= 0.5) {
				insertBranch(sys, i);				
			} else {
				insertTransmitter(sys, i);				
			}	
		}
	}
	

	private void insertBranch(System sys, int id) {
		List<OperationCall> allCalls = new ArrayList<OperationCall>();
		sys.getOperations().stream()
		.flatMap(op -> op.getCalls().stream())
		.forEach(allCalls::add);
		sys.getSystemusages().stream()
		.flatMap(op -> op.getCalls().stream())
		.forEach(allCalls::add);
		final OperationCall replacedCall = allCalls.get((int)(rnd.nextDouble() * allCalls.size()));
		

		HashMap<Variable, Variable> paramMapping = new HashMap<Variable, Variable>();
		HashMap<Variable, Variable> rvalMapping = new HashMap<Variable, Variable>();
		SystemModelFactory fac = SystemModelFactory.eINSTANCE;		
		
		Operation op = fac.createOperation();
		sys.getOperations().add(op);
		
		op.setName("gen"+id);
		replacedCall.getCallee().getParameters().forEach((var) -> {
			Variable copiedParam = EcoreUtil.copy(var);
			Variable copiedRval = EcoreUtil.copy(var);
			op.getParameters().add(copiedParam);
			op.getReturnValues().add(copiedRval);
			
			paramMapping.put(var, copiedParam);
			rvalMapping.put(var, copiedRval);
			
			VariableAssignment copyAssi = fac.createVariableAssignment();
			copyAssi.setVariable(copiedRval);
			ParameterRef pref = fac.createParameterRef();
			pref.setParameter(copiedParam);
			copyAssi.setTerm(pref);
			op.getReturnValueAssignments().add(copyAssi);		
		});
		
		OperationCall branchCall = fac.createOperationCall();
		branchCall.setName("branch_"+id);
		branchCall.setCallee(op);
		int pos = replacedCall.getCaller().getCalls().indexOf(replacedCall);
		replacedCall.getCaller().getCalls().add(pos, branchCall);
		
		List<VariableAssignment> redirectedAssignments = new ArrayList<VariableAssignment>(replacedCall.getParameterAssignments());
		replacedCall.getParameterAssignments().clear();
		redirectedAssignments.forEach(assi -> {
			assi.setVariable(paramMapping.get(assi.getVariable()));
			branchCall.getParameterAssignments().add(assi);
		});
		
		replacedCall.getCallee().getParameters().forEach(var -> {
			VariableAssignment copyAssi = fac.createVariableAssignment();
			copyAssi.setVariable(var);
			ReturnValueRef rref = fac.createReturnValueRef();
			rref.setReturnValue(rvalMapping.get(var));
			rref.setCall(branchCall);
			copyAssi.setTerm(rref);
			replacedCall.getParameterAssignments().add(copyAssi);			
		});
		
		
	}
	
	private void insertTransmitter(System sys, int id) {
		List<OperationCall> allCalls = new ArrayList<OperationCall>();
		sys.getOperations().stream()
		.flatMap(op -> op.getCalls().stream())
		.forEach(allCalls::add);
		sys.getSystemusages().stream()
		.flatMap(op -> op.getCalls().stream())
		.forEach(allCalls::add);
		final OperationCall replacedCall = allCalls.get((int)(rnd.nextDouble() * allCalls.size()));
		

		HashMap<Variable, Variable> variableMapping = new HashMap<Variable, Variable>();
		SystemModelFactory fac = SystemModelFactory.eINSTANCE;		
		
		Operation op = fac.createOperation();
		sys.getOperations().add(op);
		
		op.setName("gen"+id);
		replacedCall.getCallee().getParameters().forEach((var) -> {
			Variable copied = EcoreUtil.copy(var);
			variableMapping.put(var,copied);
			op.getParameters().add(copied);
		});
		replacedCall.getCallee().getReturnValues().forEach((var) -> {
			Variable copied = EcoreUtil.copy(var);
			variableMapping.put(var,copied);
			op.getReturnValues().add(copied);
		});
		
		OperationCall callFromTransmitter = fac.createOperationCall();
		callFromTransmitter.setName("transmit_"+id);
		callFromTransmitter.setCaller(op);
		callFromTransmitter.setCallee(replacedCall.getCallee());
		
		callFromTransmitter.getCallee().getParameters().forEach((var) -> {
			VariableAssignment copyAssi = fac.createVariableAssignment();
			copyAssi.setVariable(var);
			ParameterRef pref = fac.createParameterRef();
			pref.setParameter(variableMapping.get(var));
			copyAssi.setTerm(pref);
			callFromTransmitter.getParameterAssignments().add(copyAssi);			
		});
		
		callFromTransmitter.getCallee().getReturnValues().forEach((var) -> {
			VariableAssignment copyAssi = fac.createVariableAssignment();
			copyAssi.setVariable(variableMapping.get(var));
			ReturnValueRef rref = fac.createReturnValueRef();
			rref.setReturnValue(var);
			rref.setCall(callFromTransmitter);
			copyAssi.setTerm(rref);
			op.getReturnValueAssignments().add(copyAssi);			
		});
		
		//redirect call
		replacedCall.setCallee(op);
		replacedCall.getParameterAssignments().forEach(assi -> {
			assi.setVariable(variableMapping.get(assi.getVariable()));
		});
		
		EcoreUtil.getAllContents(replacedCall.getCaller(), true).forEachRemaining(obj -> {
			if (obj instanceof ReturnValueRef) {
				ReturnValueRef rref = (ReturnValueRef) obj;
				if(rref.getCall() == replacedCall) {
					rref.setReturnValue(variableMapping.get(rref.getReturnValue()));
				}
			}
		});
		
	}

}
