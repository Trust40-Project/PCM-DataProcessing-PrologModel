:- discontiguous isDataType/1.
:- discontiguous dataTypeAttribute/2.
:- discontiguous isOperation/1.
:- discontiguous hasProperty/2.
:- discontiguous operationProperty/3.
:- discontiguous operationParameterType/3.
:- discontiguous operationReturnValueType/3.
:- discontiguous operationCall/3.
:- discontiguous callArgumentImpl/4.
:- discontiguous returnValueImpl/4.
:- discontiguous isSystemUsage/1.

isAttribute(ATTRIB) :- attributeType(ATTRIB,_).
isProperty(ATTRIB) :- propertyType(ATTRIB,_).

callArgument([OP|S],VAR,A,VAL) :- isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),callArgumentImpl([OP|S],VAR,A,VAL).
returnValue([OP|S],VAR,A,VAL) :- isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),returnValueImpl([OP|S],VAR,A,VAL).

operationParameter(OP,PARAM) :- operationParameterType(OP,PARAM,_).
operationReturnValue(OP,RVAL) :- operationReturnValueType(OP,RVAL,_).

stackValid([SU]) :- isSystemUsage(SU).
stackValid([DEST,CALL,SOURCE | S]) :- operationCall(SOURCE,DEST,CALL), stackValid([SOURCE | S]).
