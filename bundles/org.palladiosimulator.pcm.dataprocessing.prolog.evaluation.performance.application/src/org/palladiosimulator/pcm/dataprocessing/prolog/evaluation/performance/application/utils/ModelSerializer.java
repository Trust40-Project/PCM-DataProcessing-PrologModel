package org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.utils;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.Activator;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System;

public class ModelSerializer {
	
	public System loadSystem(String filePath) {    	
        ResourceSet resSet = new ResourceSetImpl();
        URI modelUri = Activator.getEMFUri(filePath);
        Resource resource = resSet.getResource(modelUri, true);
        return (System) resource.getContents().get(0);
	}
	
	public void storeSystem(System sys, String filePath) {      	
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
