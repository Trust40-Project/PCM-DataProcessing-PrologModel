 :- discontiguous(isDataType/1).
 :- discontiguous(dataTypeAttribute/2).
 :- discontiguous(isOperation/1).
 :- discontiguous(hasProperty/2).
 :- discontiguous(operationProperty/3).
 :- discontiguous(operationParameterType/3).
 :- discontiguous(operationReturnValueType/3).
 :- discontiguous(operationStateType/3).
 :- discontiguous(operationCall/3).
 :- discontiguous(isSystemUsage/1).
 :- discontiguous(defaultStateImpl/4).
 :- discontiguous(callArgumentImpl/4).
 :- discontiguous(returnValueImpl/4).
 :- discontiguous(preCallStateImpl/5).
 :- discontiguous(postCallStateImpl/5).
 :- discontiguous(not_callArgumentImpl/4).
 :- discontiguous(not_returnValueImpl/4).
 :- discontiguous(not_preCallStateImpl/5).
 :- discontiguous(not_postCallStateImpl/5).
 :- discontiguous(not_operationProperty/3).
 :- discontiguous(not_defaultStateImpl/4).
isAttribute(ATTRIB) :- attributeType(ATTRIB,_).
isProperty(ATTRIB) :- propertyType(ATTRIB,_).
operationParameter(OP,PARAM) :- operationParameterType(OP,PARAM,_).
operationReturnValue(OP,RVAL) :- operationReturnValueType(OP,RVAL,_).
operationState(OP,SVAL) :- operationStateType(OP,SVAL,_).
callArgument([OP|S],VAR,A,VAL) :- isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),callArgumentImpl([OP|S],VAR,A,VAL).
returnValue([OP|S],VAR,A,VAL) :- isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),returnValueImpl([OP|S],VAR,A,VAL).
preCallState([SOP|S],OP,VAR,A,VAL) :- isOperation(SOP),operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),preCallStateImpl([SOP|S],OP,VAR,A,VAL).
postCallState([SOP|S],OP,VAR,A,VAL) :- isOperation(SOP),operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),postCallStateImpl([SOP|S],OP,VAR,A,VAL).
defaultState(OP,VAR,A,VAL) :- operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),defaultStateImpl(OP,VAR,A,VAL).
stackValid([SU]) :- isSystemUsage(SU).
stackValid([DEST,CALL,SOURCE | S]) :- operationCall(SOURCE,DEST,CALL), stackValid([SOURCE | S]).
lnot(lnot(A)) :- A.
lnot((A,B)) :- (lnot(A);lnot(B)).
lnot((A;B)) :- (lnot(A),lnot(B)).
lnot(true) :- fail.
lnot(fail) :- true.
lnot(callArgumentImpl(S,P,A,V)) :- not_callArgumentImpl(S,P,A,V).
lnot(returnValueImpl(S,P,A,V)) :- not_returnValueImpl(S,P,A,V).
lnot(operationProperty(OP,P,V)) :- not_operationProperty(OP,P,V).
lnot(preCallStateImpl(S,OP,P,A,V)) :- not_preCallStateImpl(S,OP,P,A,V).
lnot(postCallStateImpl(S,OP,P,A,V)) :- not_postCallStateImpl(S,OP,P,A,V).
lnot(defaultStateImpl(OP,VAR,A,V)) :- not_defaultStateImpl(OP,VAR,A,V).
lnot(callArgument([OP|S],VAR,A,VAL)) :- isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_callArgumentImpl([OP|S],VAR,A,VAL).
lnot(returnValue([OP|S],VAR,A,VAL)) :- isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_returnValueImpl([OP|S],VAR,A,VAL).
lnot(preCallState([SOP|S],OP,VAR,A,VAL)) :- isOperation(SOP),operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_preCallStateImpl([SOP|S],OP,VAR,A,VAL).
lnot(postCallState([SOP|S],OP,VAR,A,VAL)) :- isOperation(SOP),operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_postCallStateImpl([SOP|S],OP,VAR,A,VAL).
lnot(defaultState(OP,VAR,A,VAL)) :- operationStateType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_defaultStateImpl(OP,VAR,A,VAL).

%-------------------------Value Set Type Definitions-------------------------
valueSetMember('geolocation','EU').
valueSetMember('geolocation','US').
valueSetMember('flag_type','isTrue').

%-------------------------Property Type Definitions--------------------------

%-------------------------Attribute Type Definitions-------------------------
attributeType('origin','geolocation').
attributeType('isEncrypted','flag_type').

%---------------------------Data Type Definitions----------------------------
isDataType('data').
dataTypeAttribute('data','isEncrypted').
dataTypeAttribute('data','origin').


%----------------------------------------------------------------------------
%-------------------------------Operation join-------------------------------
%----------------------------------------------------------------------------
isOperation('join').
operationReturnValueType('join','joined','data').
operationStateType('join','d1','data').
operationStateType('join','d2','data').
defaultStateImpl('join', 'd1', 'isEncrypted', 'isTrue') :- fail.
not_defaultStateImpl('join', 'd1', 'isEncrypted', 'isTrue') :- lnot(fail).
defaultStateImpl('join', 'd1', 'origin', 'EU') :- fail.
not_defaultStateImpl('join', 'd1', 'origin', 'EU') :- lnot(fail).
defaultStateImpl('join', 'd1', 'origin', 'US') :- fail.
not_defaultStateImpl('join', 'd1', 'origin', 'US') :- lnot(fail).
defaultStateImpl('join', 'd2', 'isEncrypted', 'isTrue') :- fail.
not_defaultStateImpl('join', 'd2', 'isEncrypted', 'isTrue') :- lnot(fail).
defaultStateImpl('join', 'd2', 'origin', 'EU') :- fail.
not_defaultStateImpl('join', 'd2', 'origin', 'EU') :- lnot(fail).
defaultStateImpl('join', 'd2', 'origin', 'US') :- fail.
not_defaultStateImpl('join', 'd2', 'origin', 'US') :- lnot(fail).

%---------------------------Return Values of join----------------------------
returnValueImpl(['join'|S], 'joined', 'isEncrypted', 'isTrue') :- (preCallStateImpl(['join'|S],'join','d1','isEncrypted','isTrue') , preCallStateImpl(['join'|S],'join','d2','isEncrypted','isTrue')).
not_returnValueImpl(['join'|S], 'joined', 'isEncrypted', 'isTrue') :- lnot((preCallStateImpl(['join'|S],'join','d1','isEncrypted','isTrue') , preCallStateImpl(['join'|S],'join','d2','isEncrypted','isTrue'))).
returnValueImpl(['join'|S], 'joined', 'origin', 'EU') :- (preCallStateImpl(['join'|S],'join','d1','origin','EU') ; preCallStateImpl(['join'|S],'join','d2','origin','EU')).
not_returnValueImpl(['join'|S], 'joined', 'origin', 'EU') :- lnot((preCallStateImpl(['join'|S],'join','d1','origin','EU') ; preCallStateImpl(['join'|S],'join','d2','origin','EU'))).
returnValueImpl(['join'|S], 'joined', 'origin', 'US') :- (preCallStateImpl(['join'|S],'join','d1','origin','US') ; preCallStateImpl(['join'|S],'join','d2','origin','US')).
not_returnValueImpl(['join'|S], 'joined', 'origin', 'US') :- lnot((preCallStateImpl(['join'|S],'join','d1','origin','US') ; preCallStateImpl(['join'|S],'join','d2','origin','US'))).

%-------------------------State Definitions of join--------------------------
postCallStateImpl(['join'|S],'join','d1', 'isEncrypted', 'isTrue') :- preCallStateImpl(['join'|S],'join','d1','isEncrypted','isTrue').
not_postCallStateImpl(['join'|S],'join','d1', 'isEncrypted', 'isTrue') :- lnot(preCallStateImpl(['join'|S],'join','d1','isEncrypted','isTrue')).
postCallStateImpl(['join'|S],'join','d1', 'origin', 'EU') :- preCallStateImpl(['join'|S],'join','d1','origin','EU').
not_postCallStateImpl(['join'|S],'join','d1', 'origin', 'EU') :- lnot(preCallStateImpl(['join'|S],'join','d1','origin','EU')).
postCallStateImpl(['join'|S],'join','d1', 'origin', 'US') :- preCallStateImpl(['join'|S],'join','d1','origin','US').
not_postCallStateImpl(['join'|S],'join','d1', 'origin', 'US') :- lnot(preCallStateImpl(['join'|S],'join','d1','origin','US')).
postCallStateImpl(['join'|S],'join','d2', 'isEncrypted', 'isTrue') :- preCallStateImpl(['join'|S],'join','d2','isEncrypted','isTrue').
not_postCallStateImpl(['join'|S],'join','d2', 'isEncrypted', 'isTrue') :- lnot(preCallStateImpl(['join'|S],'join','d2','isEncrypted','isTrue')).
postCallStateImpl(['join'|S],'join','d2', 'origin', 'EU') :- preCallStateImpl(['join'|S],'join','d2','origin','EU').
not_postCallStateImpl(['join'|S],'join','d2', 'origin', 'EU') :- lnot(preCallStateImpl(['join'|S],'join','d2','origin','EU')).
postCallStateImpl(['join'|S],'join','d2', 'origin', 'US') :- preCallStateImpl(['join'|S],'join','d2','origin','US').
not_postCallStateImpl(['join'|S],'join','d2', 'origin', 'US') :- lnot(preCallStateImpl(['join'|S],'join','d2','origin','US')).


%----------------------------------------------------------------------------
%------------------------------Operation setD1-------------------------------
%----------------------------------------------------------------------------
isOperation('setD1').

%---------------------------Return Values of setD1---------------------------

%-------------------------State Definitions of setD1-------------------------
postCallStateImpl(['setD1'|_],'join','d1', 'isEncrypted', 'isTrue') :- true.
not_postCallStateImpl(['setD1'|_],'join','d1', 'isEncrypted', 'isTrue') :- lnot(true).
postCallStateImpl(['setD1'|_],'join','d1', 'origin', 'EU') :- true.
not_postCallStateImpl(['setD1'|_],'join','d1', 'origin', 'EU') :- lnot(true).
postCallStateImpl(['setD1'|S],'join','d1', 'origin', 'US') :- preCallStateImpl(['setD1'|S],'join','d1','origin','US').
not_postCallStateImpl(['setD1'|S],'join','d1', 'origin', 'US') :- lnot(preCallStateImpl(['setD1'|S],'join','d1','origin','US')).
postCallStateImpl(['setD1'|S],'join','d2', 'isEncrypted', 'isTrue') :- preCallStateImpl(['setD1'|S],'join','d2','isEncrypted','isTrue').
not_postCallStateImpl(['setD1'|S],'join','d2', 'isEncrypted', 'isTrue') :- lnot(preCallStateImpl(['setD1'|S],'join','d2','isEncrypted','isTrue')).
postCallStateImpl(['setD1'|S],'join','d2', 'origin', 'EU') :- preCallStateImpl(['setD1'|S],'join','d2','origin','EU').
not_postCallStateImpl(['setD1'|S],'join','d2', 'origin', 'EU') :- lnot(preCallStateImpl(['setD1'|S],'join','d2','origin','EU')).
postCallStateImpl(['setD1'|S],'join','d2', 'origin', 'US') :- preCallStateImpl(['setD1'|S],'join','d2','origin','US').
not_postCallStateImpl(['setD1'|S],'join','d2', 'origin', 'US') :- lnot(preCallStateImpl(['setD1'|S],'join','d2','origin','US')).


%----------------------------------------------------------------------------
%------------------------------Operation setD2-------------------------------
%----------------------------------------------------------------------------
isOperation('setD2').

%---------------------------Return Values of setD2---------------------------

%-------------------------State Definitions of setD2-------------------------
postCallStateImpl(['setD2'|S],'join','d1', 'isEncrypted', 'isTrue') :- preCallStateImpl(['setD2'|S],'join','d1','isEncrypted','isTrue').
not_postCallStateImpl(['setD2'|S],'join','d1', 'isEncrypted', 'isTrue') :- lnot(preCallStateImpl(['setD2'|S],'join','d1','isEncrypted','isTrue')).
postCallStateImpl(['setD2'|S],'join','d1', 'origin', 'EU') :- preCallStateImpl(['setD2'|S],'join','d1','origin','EU').
not_postCallStateImpl(['setD2'|S],'join','d1', 'origin', 'EU') :- lnot(preCallStateImpl(['setD2'|S],'join','d1','origin','EU')).
postCallStateImpl(['setD2'|S],'join','d1', 'origin', 'US') :- preCallStateImpl(['setD2'|S],'join','d1','origin','US').
not_postCallStateImpl(['setD2'|S],'join','d1', 'origin', 'US') :- lnot(preCallStateImpl(['setD2'|S],'join','d1','origin','US')).
postCallStateImpl(['setD2'|_],'join','d2', 'isEncrypted', 'isTrue') :- fail.
not_postCallStateImpl(['setD2'|_],'join','d2', 'isEncrypted', 'isTrue') :- lnot(fail).
postCallStateImpl(['setD2'|S],'join','d2', 'origin', 'EU') :- preCallStateImpl(['setD2'|S],'join','d2','origin','EU').
not_postCallStateImpl(['setD2'|S],'join','d2', 'origin', 'EU') :- lnot(preCallStateImpl(['setD2'|S],'join','d2','origin','EU')).
postCallStateImpl(['setD2'|_],'join','d2', 'origin', 'US') :- true.
not_postCallStateImpl(['setD2'|_],'join','d2', 'origin', 'US') :- lnot(true).


%----------------------------------------------------------------------------
%-----------------------------System Usage usage-----------------------------
%----------------------------------------------------------------------------
isSystemUsage('usage').

%--------------------------Call to setD1 (call_d1)---------------------------
operationCall('usage','setD1','call_d1').
preCallStateImpl(['setD1','call_d1'|['usage'|_]],'join','d1', 'isEncrypted', 'isTrue') :- defaultStateImpl('join','d1','isEncrypted','isTrue').
not_preCallStateImpl(['setD1','call_d1'|['usage'|_]],'join','d1', 'isEncrypted', 'isTrue') :- lnot(defaultStateImpl('join','d1','isEncrypted','isTrue')).
preCallStateImpl(['setD1','call_d1'|['usage'|_]],'join','d1', 'origin', 'EU') :- defaultStateImpl('join','d1','origin','EU').
not_preCallStateImpl(['setD1','call_d1'|['usage'|_]],'join','d1', 'origin', 'EU') :- lnot(defaultStateImpl('join','d1','origin','EU')).
preCallStateImpl(['setD1','call_d1'|['usage'|_]],'join','d1', 'origin', 'US') :- defaultStateImpl('join','d1','origin','US').
not_preCallStateImpl(['setD1','call_d1'|['usage'|_]],'join','d1', 'origin', 'US') :- lnot(defaultStateImpl('join','d1','origin','US')).
preCallStateImpl(['setD1','call_d1'|['usage'|_]],'join','d2', 'isEncrypted', 'isTrue') :- defaultStateImpl('join','d2','isEncrypted','isTrue').
not_preCallStateImpl(['setD1','call_d1'|['usage'|_]],'join','d2', 'isEncrypted', 'isTrue') :- lnot(defaultStateImpl('join','d2','isEncrypted','isTrue')).
preCallStateImpl(['setD1','call_d1'|['usage'|_]],'join','d2', 'origin', 'EU') :- defaultStateImpl('join','d2','origin','EU').
not_preCallStateImpl(['setD1','call_d1'|['usage'|_]],'join','d2', 'origin', 'EU') :- lnot(defaultStateImpl('join','d2','origin','EU')).
preCallStateImpl(['setD1','call_d1'|['usage'|_]],'join','d2', 'origin', 'US') :- defaultStateImpl('join','d2','origin','US').
not_preCallStateImpl(['setD1','call_d1'|['usage'|_]],'join','d2', 'origin', 'US') :- lnot(defaultStateImpl('join','d2','origin','US')).

%--------------------------Call to setD2 (call_d2)---------------------------
operationCall('usage','setD2','call_d2').
preCallStateImpl(['setD2','call_d2'|['usage'|S]],'join','d1', 'isEncrypted', 'isTrue') :- postCallStateImpl(['setD1','call_d1','usage'|S],'join','d1','isEncrypted','isTrue').
not_preCallStateImpl(['setD2','call_d2'|['usage'|S]],'join','d1', 'isEncrypted', 'isTrue') :- lnot(postCallStateImpl(['setD1','call_d1','usage'|S],'join','d1','isEncrypted','isTrue')).
preCallStateImpl(['setD2','call_d2'|['usage'|S]],'join','d1', 'origin', 'EU') :- postCallStateImpl(['setD1','call_d1','usage'|S],'join','d1','origin','EU').
not_preCallStateImpl(['setD2','call_d2'|['usage'|S]],'join','d1', 'origin', 'EU') :- lnot(postCallStateImpl(['setD1','call_d1','usage'|S],'join','d1','origin','EU')).
preCallStateImpl(['setD2','call_d2'|['usage'|S]],'join','d1', 'origin', 'US') :- postCallStateImpl(['setD1','call_d1','usage'|S],'join','d1','origin','US').
not_preCallStateImpl(['setD2','call_d2'|['usage'|S]],'join','d1', 'origin', 'US') :- lnot(postCallStateImpl(['setD1','call_d1','usage'|S],'join','d1','origin','US')).
preCallStateImpl(['setD2','call_d2'|['usage'|S]],'join','d2', 'isEncrypted', 'isTrue') :- postCallStateImpl(['setD1','call_d1','usage'|S],'join','d2','isEncrypted','isTrue').
not_preCallStateImpl(['setD2','call_d2'|['usage'|S]],'join','d2', 'isEncrypted', 'isTrue') :- lnot(postCallStateImpl(['setD1','call_d1','usage'|S],'join','d2','isEncrypted','isTrue')).
preCallStateImpl(['setD2','call_d2'|['usage'|S]],'join','d2', 'origin', 'EU') :- postCallStateImpl(['setD1','call_d1','usage'|S],'join','d2','origin','EU').
not_preCallStateImpl(['setD2','call_d2'|['usage'|S]],'join','d2', 'origin', 'EU') :- lnot(postCallStateImpl(['setD1','call_d1','usage'|S],'join','d2','origin','EU')).
preCallStateImpl(['setD2','call_d2'|['usage'|S]],'join','d2', 'origin', 'US') :- postCallStateImpl(['setD1','call_d1','usage'|S],'join','d2','origin','US').
not_preCallStateImpl(['setD2','call_d2'|['usage'|S]],'join','d2', 'origin', 'US') :- lnot(postCallStateImpl(['setD1','call_d1','usage'|S],'join','d2','origin','US')).

%--------------------------Call to join (call_join)--------------------------
operationCall('usage','join','call_join').
preCallStateImpl(['join','call_join'|['usage'|S]],'join','d1', 'isEncrypted', 'isTrue') :- postCallStateImpl(['setD2','call_d2','usage'|S],'join','d1','isEncrypted','isTrue').
not_preCallStateImpl(['join','call_join'|['usage'|S]],'join','d1', 'isEncrypted', 'isTrue') :- lnot(postCallStateImpl(['setD2','call_d2','usage'|S],'join','d1','isEncrypted','isTrue')).
preCallStateImpl(['join','call_join'|['usage'|S]],'join','d1', 'origin', 'EU') :- postCallStateImpl(['setD2','call_d2','usage'|S],'join','d1','origin','EU').
not_preCallStateImpl(['join','call_join'|['usage'|S]],'join','d1', 'origin', 'EU') :- lnot(postCallStateImpl(['setD2','call_d2','usage'|S],'join','d1','origin','EU')).
preCallStateImpl(['join','call_join'|['usage'|S]],'join','d1', 'origin', 'US') :- postCallStateImpl(['setD2','call_d2','usage'|S],'join','d1','origin','US').
not_preCallStateImpl(['join','call_join'|['usage'|S]],'join','d1', 'origin', 'US') :- lnot(postCallStateImpl(['setD2','call_d2','usage'|S],'join','d1','origin','US')).
preCallStateImpl(['join','call_join'|['usage'|S]],'join','d2', 'isEncrypted', 'isTrue') :- postCallStateImpl(['setD2','call_d2','usage'|S],'join','d2','isEncrypted','isTrue').
not_preCallStateImpl(['join','call_join'|['usage'|S]],'join','d2', 'isEncrypted', 'isTrue') :- lnot(postCallStateImpl(['setD2','call_d2','usage'|S],'join','d2','isEncrypted','isTrue')).
preCallStateImpl(['join','call_join'|['usage'|S]],'join','d2', 'origin', 'EU') :- postCallStateImpl(['setD2','call_d2','usage'|S],'join','d2','origin','EU').
not_preCallStateImpl(['join','call_join'|['usage'|S]],'join','d2', 'origin', 'EU') :- lnot(postCallStateImpl(['setD2','call_d2','usage'|S],'join','d2','origin','EU')).
preCallStateImpl(['join','call_join'|['usage'|S]],'join','d2', 'origin', 'US') :- postCallStateImpl(['setD2','call_d2','usage'|S],'join','d2','origin','US').
not_preCallStateImpl(['join','call_join'|['usage'|S]],'join','d2', 'origin', 'US') :- lnot(postCallStateImpl(['setD2','call_d2','usage'|S],'join','d2','origin','US')).

joinResult(A,V) :-returnValue(['join','call_join','usage'], 'joined', A, V).
lnot(joinResult(A,V)) :- lnot(returnValue(['join','call_join','usage'], 'joined', A, V)).
