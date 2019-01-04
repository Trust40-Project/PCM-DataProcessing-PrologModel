package edu.kit.ipd.sdq.dataflow.systemmodel.main;

import edu.kit.ipd.sdq.dataflow.systemmodel.SystemTranslator
import edu.kit.ipd.sdq.dataflow.systemmodel.configuration.Configuration
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.ocl.ecore.OCL
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System
import org.slf4j.LoggerFactory
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain

class Main {
	
	static val LOG = LoggerFactory.getLogger(typeof(Main))
	
	private def static System loadSystem(String filePath) {
		//the model required OCL
		OCL.initialize(null)
		OCLDelegateDomain.initialize(null)
		
		//Register Model package
		PrologmodelPackage.eINSTANCE.EClassifiers;
		
        val reg = Resource.Factory.Registry.INSTANCE;
      	reg.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
      	
        val resSet = new ResourceSetImpl();
        val resource = resSet.getResource(URI.createFileURI(filePath), true);
        
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