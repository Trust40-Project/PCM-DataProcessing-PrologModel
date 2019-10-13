package org.palladiosimulator.pcm.dataprocessing.prolog.transformation.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.utilities.PivotStandaloneSetup;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System;
import org.prolog4j.IProverFactory;
import org.prolog4j.Prover;
import org.prolog4j.Query;
import org.prolog4j.Solution;
import org.prolog4j.tuprolog.TuPrologProverFactory;

import edu.kit.ipd.sdq.dataflow.systemmodel.SystemTranslator;
import edu.kit.ipd.sdq.dataflow.systemmodel.configuration.Configuration;

public class TransformationTest {

    private static IProverFactory proverFactory;
    private SystemTranslator subject;
    private Prover prover;
    
    @BeforeClass
    public static void init() {
        if (!EcorePlugin.IS_ECLIPSE_RUNNING) {
            initNonEmbeddedPart();
        }
        EssentialOCLStandaloneSetup.doSetup();
        proverFactory = new TuPrologProverFactory();
    }
    
    private static void initNonEmbeddedPart() {
        // OCL Initialization
        OCL.initialize(null);
        OCLDelegateDomain.initialize(null);
        
        // OCL Pivot
        PivotStandaloneSetup.doSetup();
        CompleteOCLStandaloneSetup.doSetup();
        
        // Detection of Meta Models and URIs by classpath magic
        // https://wiki.eclipse.org/EMF/FAQ#How_do_I_make_my_EMF_standalone_application_Eclipse-aware.3F
        EcorePlugin.ExtensionProcessor.process(null);
    }
    
    @Before
    public void setup() {
        Configuration noOptimizationConfiguration = new Configuration();
        noOptimizationConfiguration.setArgumentAndReturnValueIndexing(false);
        noOptimizationConfiguration.setOptimizedNegations(false);
        noOptimizationConfiguration.setShorterAssignments(false);
        subject = new SystemTranslator(noOptimizationConfiguration);
        prover = proverFactory.createProver();
    }
    
    @Test
    public void testMinStaticAppliesStaticValue() throws Exception {
        testFile("MinStatic_Cutting");

        String privacyLevel = getPrivacyLevel("declassify", "Call_SystemUsage01_Operation01", "SystemUsage01", "outputParam01");
        assertEquals("OFFICIAL", privacyLevel);
    }
    
    @Test
    public void testMinStaticKeepsDynamicValue() throws Exception {
        testFile("MinStatic_NotCutting");
        
        String privacyLevel = getPrivacyLevel("declassify", "Call_SystemUsage01_Operation01", "SystemUsage01", "outputParam01");
        assertEquals("PUBLIC", privacyLevel);
    }
    
    private String testFile(String filePrefix) throws Exception {
        System sys = loadSystemModel(filePrefix + ".prologmodel");
        String expected = readFile(filePrefix + ".expected");
        
        String actual = subject.translate(sys).getCode().trim().replace("\r\n", "\n");
        assertEquals(expected, actual);
        
        prover.addTheory(actual);
        
        return actual;
    }

    private String getPrivacyLevel(String callee, String call, String op, String retval) {
        Query query = prover.query(
                "S=[?CALLEE, ?CALL, ?OP|_], operationCall(OP, CALLEE, CALL)," + 
                "operationReturnValue(CALLEE, ?RETVAL)," + 
                "returnValue(S, RETVAL, 'Attribute_PrivacyLevel', L).");
        query.bind("J$CALLEE", "declassify");
        query.bind("J$CALL", "Call_SystemUsage01_Operation01");
        query.bind("J$OP", "SystemUsage01");
        query.bind("J$RETVAL", "outputParam01");
        Solution<Object> solution = query.solve();
        assertTrue(solution.isSuccess());
        return solution.get("L");
    }
    
    private static System loadSystemModel(String fileName) throws Exception {
        return executeOnInputStream(fileName, is -> {
            ResourceSet rs = new ResourceSetImpl();
            Resource r = rs.createResource(URI.createURI("tmp.prologmodel"));
            r.load(is, Collections.emptyMap());
            return (System) r.getContents().get(0);
        });
    }
    
    private static String readFile(String fileName) throws Exception {
        return executeOnInputStream(fileName, is -> IOUtils.toString(is, StandardCharsets.UTF_8));
    }

    @FunctionalInterface
    private interface InputStreamTask<R> {
        R apply(InputStream is) throws Exception;
    }
    
    private static <T> T executeOnInputStream(String fileName, InputStreamTask<T> task) throws Exception {
        try (InputStream is = TransformationTest.class.getClassLoader().getResourceAsStream(fileName)) {
            return task.apply(is);
        }
    }
    
}
