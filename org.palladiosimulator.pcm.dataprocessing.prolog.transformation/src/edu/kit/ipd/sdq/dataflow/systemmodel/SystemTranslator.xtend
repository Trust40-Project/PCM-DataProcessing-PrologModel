package edu.kit.ipd.sdq.dataflow.systemmodel

import edu.kit.ipd.sdq.dataflow.systemmodel.configuration.Configuration
import java.util.Collection
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Attribute
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Property
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.System
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.SystemUsage
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Value
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ValueSetType
import org.slf4j.LoggerFactory

import static java.util.Arrays.asList

import static extension edu.kit.ipd.sdq.dataflow.systemmodel.Util.*

/**
 * Root class for the Translation.
 * Takes a System as input and returns the resulting Prolog program.
 * 
 */
class SystemTranslator {
	
	static val LOG = LoggerFactory.getLogger(typeof(SystemTranslator));
	
	val TranslationCache cache;
	val CallerTranslator callerTranslator;
	val PreambleBuilder preambleBuilder;
	
	val Configuration config;
	
	new(Configuration config) {
		this.config = config;
		cache = new TranslationCache();
		callerTranslator = new CallerTranslator(cache, config);
		preambleBuilder = new PreambleBuilder(config);
	}
	
	private def addValueSetTypes(Collection<ValueSetType> types, PrologProgram result) {
		LOG.info("Translating ValueSetTypes")
		result.addMinorHeading("Value Set Type Definitions");
		for(ValueSetType type : types) {
			for(Value value : type.values) {
				result.addFact("valueSetMember",asList(type.name.asAtom,value.name.asAtom));
			}
		}
	}
	
	private def addProperties(Collection<Property> properties, PrologProgram result) {
		LOG.info("Translating Properties")
		result.addMinorHeading("Property Type Definitions");
		for(Property prop : properties) {
			result.addFact("propertyType",asList(prop.name.asAtom,prop.type.name.asAtom));
		}
	}
	
	private def addAttributes(Collection<Attribute> attributes, PrologProgram result) {
		LOG.info("Translating Attributes")
		result.addMinorHeading("Attribute Type Definitions");
		for(Attribute attrib : attributes) {
			result.addFact("attributeType",asList(attrib.name.asAtom,attrib.type.name.asAtom));
		}
	}
	
	private def addDataTypes(Collection<DataType> types, PrologProgram result) {
		LOG.info("Translating DataTypes")
		result.addMinorHeading("Data Type Definitions");
		for(DataType dtype : types) {
			result.addFact("isDataType",asList(dtype.name.asAtom));
			for(Attribute attrib : dtype.attributes) {
				result.addFact("dataTypeAttribute", asList(dtype.name.asAtom,attrib.name.asAtom));
			}
		}
	}
	
	def PrologProgram translate(System sys) {
		LOG.info("Translating System {}", sys.name)
		LOG.info("Optimized Negations: {}", config.optimizedNegations)
		LOG.info("First-Argument Indexing Optimization: {}", config.argumentAndReturnValueIndexing)
		LOG.info("Cut-Based assignments: {}", config.shorterAssignments)
		val result = new PrologProgram;
		
		cache.clear();
		preambleBuilder.buildPreamble(result);
		
		addValueSetTypes(sys.types, result);
		addProperties(sys.properties, result);
		addAttributes(sys.attributes, result);
		addDataTypes(sys.datatypes, result);
		
		for(Operation op : sys.operations) {
			callerTranslator.translate(op,sys, result);
		}
		
		for(SystemUsage su : sys.systemusages) {
			callerTranslator.translate(su,sys, result);
		}
		
		return result;
	}
	
}