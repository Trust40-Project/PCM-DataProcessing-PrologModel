package edu.kit.ipd.sdq.dataflow.systemmodel

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
				result.addFact('''valueSetMember('«type.name»','«value.name»')''')
			}
		}
	}
	
	private def addProperties(Collection<Property> properties, PrologProgram result) {
		result.addMinorHeading("Property Type Definitions");
		for(Property prop : properties) {
			result.addFact('''propertyType('«prop.name»','«prop.type.name»')''')
		}
	}
	
	private def addAttributes(Collection<Attribute> attributes, PrologProgram result) {
		result.addMinorHeading("Attribute Type Definitions");
		for(Attribute attrib : attributes) {
			result.addFact('''attributeType('«attrib.name»','«attrib.type.name»')''')
		}
	}
	
	private def addDataTypes(Collection<DataType> types, PrologProgram result) {
		result.addMinorHeading("Data Type Definitions");
		for(DataType dtype : types) {
			result.addFact('''isDataType('«dtype.name»')''');
			for(Attribute attrib : dtype.attributes) {
				result.addFact('''dataTypeAttribute('«dtype.name»','«attrib.name»')''');
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