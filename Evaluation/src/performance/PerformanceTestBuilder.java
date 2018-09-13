package performance;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemUsage;
import edu.kit.ipd.sdq.dataflow.systemmodel.Variable;
import edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment;
import shared.ModelSerializer;
import edu.kit.ipd.sdq.dataflow.systemmodel.DataType;
import edu.kit.ipd.sdq.dataflow.systemmodel.Operation;
import edu.kit.ipd.sdq.dataflow.systemmodel.OperationCall;
import edu.kit.ipd.sdq.dataflow.systemmodel.ParameterRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.ReturnValueRef;
import edu.kit.ipd.sdq.dataflow.systemmodel.System;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class PerformanceTestBuilder {
	
	private static final String FILE_PATH = "models/PerfTest.systemmodel";
	
	private System baseModel = new ModelSerializer().loadSystem(FILE_PATH);
	

	public System getExponentialCallModel(int n) {
		
		SystemModelFactory fac = SystemModelFactory.eINSTANCE;		
		System sys = EcoreUtil.copy(baseModel);
		
		DataType dt = sys.getDatatypes().stream().filter(d -> "Data".equals(d.getName())).findFirst().get();
		
		Operation lastOperation = sys.getOperations().stream()
				.filter(op -> "doSomething".contentEquals(op.getName())).findFirst().get();
		Variable lastInput = lastOperation.getParameters().get(0);
		Variable lastOutput = lastOperation.getReturnValues().get(0);
		
		for(int i=0; i<n; i++) {
			Operation op = fac.createOperation();
			op.setName("op" + (n - i));
			
			Variable opIn = fac.createVariable();
			opIn.setName("input");
			opIn.setDatatype(dt);
			op.getParameters().add(opIn);
			
			Variable opOut = fac.createVariable();
			opOut.setName("output");
			opOut.setDatatype(dt);
			op.getReturnValues().add(opOut);
			
			OperationCall callA = fac.createOperationCall();
			callA.setName("callA" + (n - i));
			callA.setCaller(op);
			callA.setCallee(lastOperation);
			VariableAssignment paramCopy = fac.createVariableAssignment();
			paramCopy.setVariable(lastInput);
			ParameterRef pref = fac.createParameterRef();
			pref.setParameter(opIn);
			paramCopy.setTerm(pref);
			callA.getParameterAssignments().add(paramCopy);
			

			OperationCall callB = fac.createOperationCall();
			callB.setName("callB" + (n - i));
			callB.setCaller(op);
			callB.setCallee(lastOperation);
			VariableAssignment paramCopyB = fac.createVariableAssignment();
			paramCopyB.setVariable(lastInput);
			ParameterRef prefB = fac.createParameterRef();
			prefB.setParameter(opIn);
			paramCopyB.setTerm(prefB);
			callB.getParameterAssignments().add(paramCopyB);
			
			VariableAssignment rvalCopy = fac.createVariableAssignment();
			rvalCopy.setVariable(opOut);
			ReturnValueRef rref = fac.createReturnValueRef();
			rref.setCall(callA);
			rref.setReturnValue(lastOutput);
			rvalCopy.setTerm(rref);
			op.getReturnValueAssignments().add(rvalCopy);
			
			sys.getOperations().add(op);
			lastOperation = op;
			lastInput = opIn;
			lastOutput = opOut;
		}
		
		SystemUsage su = fac.createSystemUsage();
		su.setName("Usage");

		OperationCall call = fac.createOperationCall();
		call.setName("initcall");
		call.setCaller(su);
		call.setCallee(lastOperation);
		VariableAssignment paramInit = fac.createVariableAssignment();
		paramInit.setTerm(fac.createFalse());
		paramInit.setVariable(lastInput);
		call.getParameterAssignments().add(paramInit);
		
		sys.getSystemusages().add(su);
		return sys;
	}
	
	public System getLinearCallModel(int n) {
		
		SystemModelFactory fac = SystemModelFactory.eINSTANCE;		
		System sys = EcoreUtil.copy(baseModel);
		
		DataType dt = sys.getDatatypes().stream().filter(d -> "Data".equals(d.getName())).findFirst().get();
		
		Operation lastOperation = sys.getOperations().stream()
				.filter(op -> "doSomething".contentEquals(op.getName())).findFirst().get();
		Variable lastInput = lastOperation.getParameters().get(0);
		Variable lastOutput = lastOperation.getReturnValues().get(0);
		
		for(int i=0; i<n; i++) {
			Operation op = fac.createOperation();
			op.setName("op" + (n - i));
			
			Variable opIn = fac.createVariable();
			opIn.setName("input");
			opIn.setDatatype(dt);
			op.getParameters().add(opIn);
			
			Variable opOut = fac.createVariable();
			opOut.setName("output");
			opOut.setDatatype(dt);
			op.getReturnValues().add(opOut);
			
			OperationCall call = fac.createOperationCall();
			call.setName("call" + (n - i));
			call.setCaller(op);
			call.setCallee(lastOperation);
			VariableAssignment paramCopy = fac.createVariableAssignment();
			paramCopy.setVariable(lastInput);
			ParameterRef pref = fac.createParameterRef();
			pref.setParameter(opIn);
			paramCopy.setTerm(pref);
			call.getParameterAssignments().add(paramCopy);
			
			VariableAssignment rvalCopy = fac.createVariableAssignment();
			rvalCopy.setVariable(opOut);
			ReturnValueRef rref = fac.createReturnValueRef();
			rref.setCall(call);
			rref.setReturnValue(lastOutput);
			rvalCopy.setTerm(rref);
			op.getReturnValueAssignments().add(rvalCopy);
			
			sys.getOperations().add(op);
			lastOperation = op;
			lastInput = opIn;
			lastOutput = opOut;
		}
		
		SystemUsage su = fac.createSystemUsage();
		su.setName("Usage");

		OperationCall call = fac.createOperationCall();
		call.setName("initcall");
		call.setCaller(su);
		call.setCallee(lastOperation);
		VariableAssignment paramInit = fac.createVariableAssignment();
		paramInit.setTerm(fac.createFalse());
		paramInit.setVariable(lastInput);
		call.getParameterAssignments().add(paramInit);
		
		sys.getSystemusages().add(su);
		return sys;
	}
}
