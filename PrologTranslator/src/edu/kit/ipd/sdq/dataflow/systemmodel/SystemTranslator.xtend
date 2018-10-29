package edu.kit.ipd.sdq.dataflow.systemmodel
import static java.util.Arrays.asList;
import static extension edu.kit.ipd.sdq.dataflow.systemmodel.Util.asAtom;

import java.util.Collection

class SystemTranslator {
	
	val TranslationCache bb;
	val CallerTranslator callerTranslator;
	val PreambleBuilder preambleBuilder;
	
	new(Configuration config) {
		
		bb = new TranslationCache();
		callerTranslator = new CallerTranslator(bb, config);
		preambleBuilder = new PreambleBuilder(config);
	}
	
	private def addValueSetTypes(Collection<ValueSetType> types, PrologProgram result) {
		result.addMinorHeading("Value Set Type Definitions");
		for(ValueSetType type : types) {
			for(Value value : type.values) {
				result.addFact("valueSetMember",asList(type.name.asAtom,value.name.asAtom));
			}
		}
	}
	
	private def addProperties(Collection<Property> properties, PrologProgram result) {
		result.addMinorHeading("Property Type Definitions");
		for(Property prop : properties) {
			result.addFact("propertyType",asList(prop.name.asAtom,prop.type.name.asAtom));
		}
	}
	
	private def addAttributes(Collection<Attribute> attributes, PrologProgram result) {
		result.addMinorHeading("Attribute Type Definitions");
		for(Attribute attrib : attributes) {
			result.addFact("attributeType",asList(attrib.name.asAtom,attrib.type.name.asAtom));
		}
	}
	
	private def addDataTypes(Collection<DataType> types, PrologProgram result) {
		result.addMinorHeading("Data Type Definitions");
		for(DataType dtype : types) {
			result.addFact("isDataType",asList(dtype.name.asAtom));
			for(Attribute attrib : dtype.attributes) {
				result.addFact("dataTypeAttribute", asList(dtype.name.asAtom,attrib.name.asAtom));
			}
		}
	}
	
	def PrologProgram translate(System sys) {
		val result = new PrologProgram;
		
		bb.clear();
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