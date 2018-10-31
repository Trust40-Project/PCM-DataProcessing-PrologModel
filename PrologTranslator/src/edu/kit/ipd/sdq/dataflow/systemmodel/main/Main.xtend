package edu.kit.ipd.sdq.dataflow.systemmodel.main;

import edu.kit.ipd.sdq.dataflow.systemmodel.Configuration
import edu.kit.ipd.sdq.dataflow.systemmodel.System
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemTranslator
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.ocl.pivot.utilities.PivotStandaloneSetup
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage
import org.slf4j.LoggerFactory

class Main {
	
	static val LOG = LoggerFactory.getLogger(typeof(Main))
	
	def static System loadSystem(String filePath) {
		//the model required OCL
		PivotStandaloneSetup.doSetup();
		CompleteOCLStandaloneSetup.doSetup();
		
		//Register Model package
		SystemModelPackage.eINSTANCE.EClassifiers;
		
        val reg = Resource.Factory.Registry.INSTANCE;
      	reg.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
      	
        val resSet = new ResourceSetImpl();
        val resource = resSet.getResource(URI.createURI("file://" + filePath), true);
        
        return resource.getContents().get(0) as System;
	}
	
	def static void main(String[] args) {
		
		val config = new Configuration();
		
		if(args.length < 2 || args.length > 3) {
			println("Usage: [modelfile] [outputfile] [optional:prolog-to-append]");
			return;
		}
		val systemPath = args.get(0);
		val outputPath = args.get(1);
		LOG.info("Transforming {} to Prolog code {}" ,systemPath, outputPath)
		
        val sys = loadSystem(systemPath);
        val st = new SystemTranslator(config);
        
		val result = st.translate(sys);
		
		val output = newArrayList(result.code);
		if(args.length == 3) {
			val programToAppend = args.get(2)
			val additionalRules = Files.readAllLines(Paths.get(programToAppend));
			output.addAll(additionalRules);
		}
		Files.write(Paths.get(outputPath), output);
		
		
	}
	
	
}