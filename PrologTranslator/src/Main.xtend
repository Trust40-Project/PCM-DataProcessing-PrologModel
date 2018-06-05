

import edu.kit.ipd.sdq.dataflow.systemmodel.PrologProgram
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI
import edu.kit.ipd.sdq.dataflow.systemmodel.System
import edu.kit.ipd.sdq.dataflow.systemmodel.TypeInformationTranslator
import edu.kit.ipd.sdq.dataflow.systemmodel.CallerTranslator
import edu.kit.ipd.sdq.dataflow.systemmodel.Operation
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemUsage

class Main {
	
	def static void main(String[] args) {
        SystemModelPackage.eINSTANCE.eClass();
        
        val reg = Resource.Factory.Registry.INSTANCE;
      	reg.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        val resSet = new ResourceSetImpl();

        // Get the resource
        val resource = resSet.getResource(URI.createURI("file://C:\\Users\\jku\\masther-thesis\\code_git\\data-flow-analysis\\TestModels\\accesscontrol_nodeclassify.systemmodel"), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        val sys = resource.getContents().get(0) as System;
        
        
		val result = translate(sys);
		
		
		println(result.code)
	}
	
	def static translate(System sys) {
		val result = new PrologProgram;
		
		result.appendDefaultPreamble();
		
        val trans = new TypeInformationTranslator;
        val opTrans = new CallerTranslator;
        
		trans.addValueSetTypes(result, sys.types);
		trans.addProperties(result, sys.properties);
		trans.addAttributes(result, sys.attributes);
		trans.addDataTypes(result, sys.datatypes);
		
		for(Operation op : sys.operations) {
			opTrans.translate(op, result);
		}
		
		for(SystemUsage su : sys.systemusages) {
			opTrans.translate(su, result);
		}
		
		return result;
	}
	
}