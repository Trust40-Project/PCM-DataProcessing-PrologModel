package edu.kit.ipd.sdq.dataflow.systemmodel

import java.util.Collection

class TypeInformationTranslator {
	
	def addValueSetTypes(PrologProgram result, Collection<ValueSetType> types) {
		result.addMinorHeading("Value Set Type Definitions");
		for(ValueSetType type : types) {
			for(Value value : type.values) {
				result.addFact('''valueSetMember('«type.name»','«value.name»')''')
			}
		}
	}
	
	def addProperties(PrologProgram result, Collection<Property> properties) {
		result.addMinorHeading("Property Type Definitions");
		for(Property prop : properties) {
			result.addFact('''propertyType('«prop.name»','«prop.type.name»')''')
		}
	}
	
	def addAttributes(PrologProgram result, Collection<Attribute> attributes) {
		result.addMinorHeading("Attribute Type Definitions");
		for(Attribute attrib : attributes) {
			result.addFact('''attributeType('«attrib.name»','«attrib.type.name»')''')
		}
	}
	
	def addDataTypes(PrologProgram result, Collection<DataType> types) {
		result.addMinorHeading("Data Type Definitions");
		for(DataType dtype : types) {
			result.addFact('''isDataType('«dtype.name»')''');
			for(Attribute attrib : dtype.attributes) {
				result.addFact('''dataTypeAttribute('«dtype.name»','«attrib.name»')''');
			}
		}
	}
	
}