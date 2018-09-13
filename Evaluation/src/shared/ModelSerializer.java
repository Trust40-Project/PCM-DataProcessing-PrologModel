package shared;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import edu.kit.ipd.sdq.dataflow.systemmodel.System;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage;

public class ModelSerializer {
	
	public System loadSystem(String filePath) {
		SystemModelPackage.eINSTANCE.getClass();
        Registry reg = Resource.Factory.Registry.INSTANCE;
      	reg.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
      	
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(URI.createURI(filePath), true);
        
        return (System) resource.getContents().get(0);
	}
	
	public void storeSystem(System sys, String filePath) {
		SystemModelPackage.eINSTANCE.getClass();
        Registry reg = Resource.Factory.Registry.INSTANCE;
      	reg.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
      	
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(URI.createURI(filePath));
        resource.getContents().add(sys);
        try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
