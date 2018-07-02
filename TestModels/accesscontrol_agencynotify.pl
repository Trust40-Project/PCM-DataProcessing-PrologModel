 :- discontiguous(isDataType/1).
 :- discontiguous(dataTypeAttribute/2).
 :- discontiguous(isOperation/1).
 :- discontiguous(hasProperty/2).
 :- discontiguous(operationProperty/3).
 :- discontiguous(operationParameterType/3).
 :- discontiguous(operationReturnValueType/3).
 :- discontiguous(operationCall/3).
 :- discontiguous(callArgumentImpl/4).
 :- discontiguous(returnValueImpl/4).
 :- discontiguous(isSystemUsage/1).
 :- discontiguous(not_callArgumentImpl/4).
 :- discontiguous(not_returnValueImpl/4).
 :- discontiguous(not_operationProperty/3).
isAttribute(ATTRIB) :- attributeType(ATTRIB,_).
isProperty(ATTRIB) :- propertyType(ATTRIB,_).
operationParameter(OP,PARAM) :- operationParameterType(OP,PARAM,_).
operationReturnValue(OP,RVAL) :- operationReturnValueType(OP,RVAL,_).
callArgument([OP|S],VAR,A,VAL) :- isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),callArgumentImpl([OP|S],VAR,A,VAL).
returnValue([OP|S],VAR,A,VAL) :- isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),returnValueImpl([OP|S],VAR,A,VAL).
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
lnot(callArgument([OP|S],VAR,A,VAL)) :- isOperation(OP),operationParameterType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_callArgumentImpl([OP|S],VAR,A,VAL).
lnot(returnValue([OP|S],VAR,A,VAL)) :- isOperation(OP),operationReturnValueType(OP,VAR,T),dataTypeAttribute(T,A),attributeType(A,VT),valueSetMember(VT,VAL),not_returnValueImpl([OP|S],VAR,A,VAL).

%-------------------------Value Set Type Definitions-------------------------
valueSetMember('role','User').
valueSetMember('role','Airline').
valueSetMember('role','TravelAgency').

%-------------------------Property Type Definitions--------------------------
propertyType('accessRoles','role').

%-------------------------Attribute Type Definitions-------------------------
attributeType('authorizedRoles','role').
attributeType('requestedRoles','role').

%---------------------------Data Type Definitions----------------------------
isDataType('RequestData').
dataTypeAttribute('RequestData','authorizedRoles').
isDataType('FlightOffers').
dataTypeAttribute('FlightOffers','authorizedRoles').
isDataType('SingleFlightOffer').
dataTypeAttribute('SingleFlightOffer','authorizedRoles').
isDataType('DeclassificationRequest').
dataTypeAttribute('DeclassificationRequest','requestedRoles').
isDataType('CreditCardData').
dataTypeAttribute('CreditCardData','authorizedRoles').


%----------------------------------------------------------------------------
%------------------Operation TravelPlanner_getFlightOffers-------------------
%----------------------------------------------------------------------------
isOperation('TravelPlanner_getFlightOffers').
hasProperty('TravelPlanner_getFlightOffers','accessRoles').
operationProperty('TravelPlanner_getFlightOffers','accessRoles', 'User').
not_operationProperty('TravelPlanner_getFlightOffers','accessRoles', 'Airline').
not_operationProperty('TravelPlanner_getFlightOffers','accessRoles', 'TravelAgency').
operationParameterType('TravelPlanner_getFlightOffers','input','RequestData').
operationReturnValueType('TravelPlanner_getFlightOffers','flightOffers','FlightOffers').

%-------------Call to TravelAgency_getFlightOffers (checkAgency)-------------
operationCall('TravelPlanner_getFlightOffers','TravelAgency_getFlightOffers','checkAgency').
callArgumentImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]], 'input', 'authorizedRoles', 'User') :- callArgumentImpl(['TravelPlanner_getFlightOffers'|S],'input','authorizedRoles','User').
not_callArgumentImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]], 'input', 'authorizedRoles', 'User') :- lnot(callArgumentImpl(['TravelPlanner_getFlightOffers'|S],'input','authorizedRoles','User')).
callArgumentImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]], 'input', 'authorizedRoles', 'Airline') :- callArgumentImpl(['TravelPlanner_getFlightOffers'|S],'input','authorizedRoles','Airline').
not_callArgumentImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]], 'input', 'authorizedRoles', 'Airline') :- lnot(callArgumentImpl(['TravelPlanner_getFlightOffers'|S],'input','authorizedRoles','Airline')).
callArgumentImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]], 'input', 'authorizedRoles', 'TravelAgency') :- callArgumentImpl(['TravelPlanner_getFlightOffers'|S],'input','authorizedRoles','TravelAgency').
not_callArgumentImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]], 'input', 'authorizedRoles', 'TravelAgency') :- lnot(callArgumentImpl(['TravelPlanner_getFlightOffers'|S],'input','authorizedRoles','TravelAgency')).

%---------------Return Values of TravelPlanner_getFlightOffers---------------
returnValueImpl(['TravelPlanner_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'User') :- returnValueImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]],'flightOffers','authorizedRoles','User').
not_returnValueImpl(['TravelPlanner_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'User') :- lnot(returnValueImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]],'flightOffers','authorizedRoles','User')).
returnValueImpl(['TravelPlanner_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'Airline') :- returnValueImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]],'flightOffers','authorizedRoles','Airline').
not_returnValueImpl(['TravelPlanner_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'Airline') :- lnot(returnValueImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]],'flightOffers','authorizedRoles','Airline')).
returnValueImpl(['TravelPlanner_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'TravelAgency') :- returnValueImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]],'flightOffers','authorizedRoles','TravelAgency').
not_returnValueImpl(['TravelPlanner_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'TravelAgency') :- lnot(returnValueImpl(['TravelAgency_getFlightOffers','checkAgency'|['TravelPlanner_getFlightOffers'|S]],'flightOffers','authorizedRoles','TravelAgency')).


%----------------------------------------------------------------------------
%-------------------Operation TravelAgency_getFlightOffers-------------------
%----------------------------------------------------------------------------
isOperation('TravelAgency_getFlightOffers').
hasProperty('TravelAgency_getFlightOffers','accessRoles').
operationProperty('TravelAgency_getFlightOffers','accessRoles', 'TravelAgency').
not_operationProperty('TravelAgency_getFlightOffers','accessRoles', 'User').
not_operationProperty('TravelAgency_getFlightOffers','accessRoles', 'Airline').
operationParameterType('TravelAgency_getFlightOffers','input','RequestData').
operationReturnValueType('TravelAgency_getFlightOffers','flightOffers','FlightOffers').

%--------------Call to Airline_getFlightOffers (checkAirlines)---------------
operationCall('TravelAgency_getFlightOffers','Airline_getFlightOffers','checkAirlines').
callArgumentImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]], 'input', 'authorizedRoles', 'User') :- callArgumentImpl(['TravelAgency_getFlightOffers'|S],'input','authorizedRoles','User').
not_callArgumentImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]], 'input', 'authorizedRoles', 'User') :- lnot(callArgumentImpl(['TravelAgency_getFlightOffers'|S],'input','authorizedRoles','User')).
callArgumentImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]], 'input', 'authorizedRoles', 'Airline') :- callArgumentImpl(['TravelAgency_getFlightOffers'|S],'input','authorizedRoles','Airline').
not_callArgumentImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]], 'input', 'authorizedRoles', 'Airline') :- lnot(callArgumentImpl(['TravelAgency_getFlightOffers'|S],'input','authorizedRoles','Airline')).
callArgumentImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]], 'input', 'authorizedRoles', 'TravelAgency') :- callArgumentImpl(['TravelAgency_getFlightOffers'|S],'input','authorizedRoles','TravelAgency').
not_callArgumentImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]], 'input', 'authorizedRoles', 'TravelAgency') :- lnot(callArgumentImpl(['TravelAgency_getFlightOffers'|S],'input','authorizedRoles','TravelAgency')).

%---------------Return Values of TravelAgency_getFlightOffers----------------
returnValueImpl(['TravelAgency_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'User') :- returnValueImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]],'flightOffers','authorizedRoles','User').
not_returnValueImpl(['TravelAgency_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'User') :- lnot(returnValueImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]],'flightOffers','authorizedRoles','User')).
returnValueImpl(['TravelAgency_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'Airline') :- returnValueImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]],'flightOffers','authorizedRoles','Airline').
not_returnValueImpl(['TravelAgency_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'Airline') :- lnot(returnValueImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]],'flightOffers','authorizedRoles','Airline')).
returnValueImpl(['TravelAgency_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'TravelAgency') :- returnValueImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]],'flightOffers','authorizedRoles','TravelAgency').
not_returnValueImpl(['TravelAgency_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'TravelAgency') :- lnot(returnValueImpl(['Airline_getFlightOffers','checkAirlines'|['TravelAgency_getFlightOffers'|S]],'flightOffers','authorizedRoles','TravelAgency')).


%----------------------------------------------------------------------------
%---------------------Operation Airline_getFlightOffers----------------------
%----------------------------------------------------------------------------
isOperation('Airline_getFlightOffers').
hasProperty('Airline_getFlightOffers','accessRoles').
operationProperty('Airline_getFlightOffers','accessRoles', 'Airline').
not_operationProperty('Airline_getFlightOffers','accessRoles', 'User').
not_operationProperty('Airline_getFlightOffers','accessRoles', 'TravelAgency').
operationParameterType('Airline_getFlightOffers','input','RequestData').
operationReturnValueType('Airline_getFlightOffers','flightOffers','FlightOffers').

%------------------Return Values of Airline_getFlightOffers------------------
returnValueImpl(['Airline_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'User') :- callArgumentImpl(['Airline_getFlightOffers'|S],'input','authorizedRoles','User').
not_returnValueImpl(['Airline_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'User') :- lnot(callArgumentImpl(['Airline_getFlightOffers'|S],'input','authorizedRoles','User')).
returnValueImpl(['Airline_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'Airline') :- callArgumentImpl(['Airline_getFlightOffers'|S],'input','authorizedRoles','Airline').
not_returnValueImpl(['Airline_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'Airline') :- lnot(callArgumentImpl(['Airline_getFlightOffers'|S],'input','authorizedRoles','Airline')).
returnValueImpl(['Airline_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'TravelAgency') :- callArgumentImpl(['Airline_getFlightOffers'|S],'input','authorizedRoles','TravelAgency').
not_returnValueImpl(['Airline_getFlightOffers'|S], 'flightOffers', 'authorizedRoles', 'TravelAgency') :- lnot(callArgumentImpl(['Airline_getFlightOffers'|S],'input','authorizedRoles','TravelAgency')).


%----------------------------------------------------------------------------
%---------------------Operation TravelPlanner_bookFlight---------------------
%----------------------------------------------------------------------------
isOperation('TravelPlanner_bookFlight').
hasProperty('TravelPlanner_bookFlight','accessRoles').
operationProperty('TravelPlanner_bookFlight','accessRoles', 'User').
not_operationProperty('TravelPlanner_bookFlight','accessRoles', 'Airline').
not_operationProperty('TravelPlanner_bookFlight','accessRoles', 'TravelAgency').
operationParameterType('TravelPlanner_bookFlight','selectedFlight','SingleFlightOffer').

%---------------Call to CCC_requestDeclassifiedCCD (fetchCCD)----------------
operationCall('TravelPlanner_bookFlight','CCC_requestDeclassifiedCCD','fetchCCD').
callArgumentImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|_]], 'declassRequest', 'requestedRoles', 'User') :- fail.
not_callArgumentImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|_]], 'declassRequest', 'requestedRoles', 'User') :- lnot(fail).
callArgumentImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|_]], 'declassRequest', 'requestedRoles', 'Airline') :- true.
not_callArgumentImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|_]], 'declassRequest', 'requestedRoles', 'Airline') :- lnot(true).
callArgumentImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|_]], 'declassRequest', 'requestedRoles', 'TravelAgency') :- fail.
not_callArgumentImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|_]], 'declassRequest', 'requestedRoles', 'TravelAgency') :- lnot(fail).

%---------------------Call to Airline_bookFlight (book)----------------------
operationCall('TravelPlanner_bookFlight','Airline_bookFlight','book').
callArgumentImpl(['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'ccd', 'authorizedRoles', 'User') :- returnValueImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|S]],'ccd','authorizedRoles','User').
not_callArgumentImpl(['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'ccd', 'authorizedRoles', 'User') :- lnot(returnValueImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|S]],'ccd','authorizedRoles','User')).
callArgumentImpl(['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'ccd', 'authorizedRoles', 'Airline') :- returnValueImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|S]],'ccd','authorizedRoles','Airline').
not_callArgumentImpl(['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'ccd', 'authorizedRoles', 'Airline') :- lnot(returnValueImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|S]],'ccd','authorizedRoles','Airline')).
callArgumentImpl(['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'ccd', 'authorizedRoles', 'TravelAgency') :- returnValueImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|S]],'ccd','authorizedRoles','TravelAgency').
not_callArgumentImpl(['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'ccd', 'authorizedRoles', 'TravelAgency') :- lnot(returnValueImpl(['CCC_requestDeclassifiedCCD','fetchCCD'|['TravelPlanner_bookFlight'|S]],'ccd','authorizedRoles','TravelAgency')).
callArgumentImpl(['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'flight', 'authorizedRoles', 'User') :- callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight','authorizedRoles','User').
not_callArgumentImpl(['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'flight', 'authorizedRoles', 'User') :- lnot(callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight','authorizedRoles','User')).
callArgumentImpl(['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'flight', 'authorizedRoles', 'Airline') :- callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight','authorizedRoles','Airline').
not_callArgumentImpl(['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'flight', 'authorizedRoles', 'Airline') :- lnot(callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight','authorizedRoles','Airline')).
callArgumentImpl(['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'flight', 'authorizedRoles', 'TravelAgency') :- callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight','authorizedRoles','TravelAgency').
not_callArgumentImpl(['Airline_bookFlight','book'|['TravelPlanner_bookFlight'|S]], 'flight', 'authorizedRoles', 'TravelAgency') :- lnot(callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight','authorizedRoles','TravelAgency')).

%-----------Call to TravelAgency_notifyAboutBooking (notifyAgency)-----------
operationCall('TravelPlanner_bookFlight','TravelAgency_notifyAboutBooking','notifyAgency').
callArgumentImpl(['TravelAgency_notifyAboutBooking','notifyAgency'|['TravelPlanner_bookFlight'|S]], 'selectedOffer', 'authorizedRoles', 'User') :- callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight','authorizedRoles','User').
not_callArgumentImpl(['TravelAgency_notifyAboutBooking','notifyAgency'|['TravelPlanner_bookFlight'|S]], 'selectedOffer', 'authorizedRoles', 'User') :- lnot(callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight','authorizedRoles','User')).
callArgumentImpl(['TravelAgency_notifyAboutBooking','notifyAgency'|['TravelPlanner_bookFlight'|S]], 'selectedOffer', 'authorizedRoles', 'Airline') :- callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight','authorizedRoles','Airline').
not_callArgumentImpl(['TravelAgency_notifyAboutBooking','notifyAgency'|['TravelPlanner_bookFlight'|S]], 'selectedOffer', 'authorizedRoles', 'Airline') :- lnot(callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight','authorizedRoles','Airline')).
callArgumentImpl(['TravelAgency_notifyAboutBooking','notifyAgency'|['TravelPlanner_bookFlight'|S]], 'selectedOffer', 'authorizedRoles', 'TravelAgency') :- callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight','authorizedRoles','TravelAgency').
not_callArgumentImpl(['TravelAgency_notifyAboutBooking','notifyAgency'|['TravelPlanner_bookFlight'|S]], 'selectedOffer', 'authorizedRoles', 'TravelAgency') :- lnot(callArgumentImpl(['TravelPlanner_bookFlight'|S],'selectedFlight','authorizedRoles','TravelAgency')).

%-----------------Return Values of TravelPlanner_bookFlight------------------


%----------------------------------------------------------------------------
%------------------Operation askUserForCCDDeclassification-------------------
%----------------------------------------------------------------------------
isOperation('askUserForCCDDeclassification').
hasProperty('askUserForCCDDeclassification','accessRoles').
operationProperty('askUserForCCDDeclassification','accessRoles', 'User').
not_operationProperty('askUserForCCDDeclassification','accessRoles', 'Airline').
not_operationProperty('askUserForCCDDeclassification','accessRoles', 'TravelAgency').
operationParameterType('askUserForCCDDeclassification','declassRequest','DeclassificationRequest').
operationReturnValueType('askUserForCCDDeclassification','allowedRoles','DeclassificationRequest').

%---------------Return Values of askUserForCCDDeclassification---------------
returnValueImpl(['askUserForCCDDeclassification'|S], 'allowedRoles', 'requestedRoles', 'User') :- callArgumentImpl(['askUserForCCDDeclassification'|S],'declassRequest','requestedRoles','User').
not_returnValueImpl(['askUserForCCDDeclassification'|S], 'allowedRoles', 'requestedRoles', 'User') :- lnot(callArgumentImpl(['askUserForCCDDeclassification'|S],'declassRequest','requestedRoles','User')).
returnValueImpl(['askUserForCCDDeclassification'|S], 'allowedRoles', 'requestedRoles', 'Airline') :- callArgumentImpl(['askUserForCCDDeclassification'|S],'declassRequest','requestedRoles','Airline').
not_returnValueImpl(['askUserForCCDDeclassification'|S], 'allowedRoles', 'requestedRoles', 'Airline') :- lnot(callArgumentImpl(['askUserForCCDDeclassification'|S],'declassRequest','requestedRoles','Airline')).
returnValueImpl(['askUserForCCDDeclassification'|S], 'allowedRoles', 'requestedRoles', 'TravelAgency') :- callArgumentImpl(['askUserForCCDDeclassification'|S],'declassRequest','requestedRoles','TravelAgency').
not_returnValueImpl(['askUserForCCDDeclassification'|S], 'allowedRoles', 'requestedRoles', 'TravelAgency') :- lnot(callArgumentImpl(['askUserForCCDDeclassification'|S],'declassRequest','requestedRoles','TravelAgency')).


%----------------------------------------------------------------------------
%--------------------Operation CCC_requestDeclassifiedCCD--------------------
%----------------------------------------------------------------------------
isOperation('CCC_requestDeclassifiedCCD').
hasProperty('CCC_requestDeclassifiedCCD','accessRoles').
operationProperty('CCC_requestDeclassifiedCCD','accessRoles', 'User').
not_operationProperty('CCC_requestDeclassifiedCCD','accessRoles', 'Airline').
not_operationProperty('CCC_requestDeclassifiedCCD','accessRoles', 'TravelAgency').
operationParameterType('CCC_requestDeclassifiedCCD','declassRequest','DeclassificationRequest').
operationReturnValueType('CCC_requestDeclassifiedCCD','ccd','CreditCardData').

%-------------Call to askUserForCCDDeclassification (promptUser)-------------
operationCall('CCC_requestDeclassifiedCCD','askUserForCCDDeclassification','promptUser').
callArgumentImpl(['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]], 'declassRequest', 'requestedRoles', 'User') :- callArgumentImpl(['CCC_requestDeclassifiedCCD'|S],'declassRequest','requestedRoles','User').
not_callArgumentImpl(['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]], 'declassRequest', 'requestedRoles', 'User') :- lnot(callArgumentImpl(['CCC_requestDeclassifiedCCD'|S],'declassRequest','requestedRoles','User')).
callArgumentImpl(['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]], 'declassRequest', 'requestedRoles', 'Airline') :- callArgumentImpl(['CCC_requestDeclassifiedCCD'|S],'declassRequest','requestedRoles','Airline').
not_callArgumentImpl(['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]], 'declassRequest', 'requestedRoles', 'Airline') :- lnot(callArgumentImpl(['CCC_requestDeclassifiedCCD'|S],'declassRequest','requestedRoles','Airline')).
callArgumentImpl(['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]], 'declassRequest', 'requestedRoles', 'TravelAgency') :- callArgumentImpl(['CCC_requestDeclassifiedCCD'|S],'declassRequest','requestedRoles','TravelAgency').
not_callArgumentImpl(['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]], 'declassRequest', 'requestedRoles', 'TravelAgency') :- lnot(callArgumentImpl(['CCC_requestDeclassifiedCCD'|S],'declassRequest','requestedRoles','TravelAgency')).

%----------------Return Values of CCC_requestDeclassifiedCCD-----------------
returnValueImpl(['CCC_requestDeclassifiedCCD'|_], 'ccd', 'authorizedRoles', 'User') :- true.
not_returnValueImpl(['CCC_requestDeclassifiedCCD'|_], 'ccd', 'authorizedRoles', 'User') :- lnot(true).
returnValueImpl(['CCC_requestDeclassifiedCCD'|S], 'ccd', 'authorizedRoles', 'Airline') :- returnValueImpl(['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]],'allowedRoles','requestedRoles','Airline').
not_returnValueImpl(['CCC_requestDeclassifiedCCD'|S], 'ccd', 'authorizedRoles', 'Airline') :- lnot(returnValueImpl(['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]],'allowedRoles','requestedRoles','Airline')).
returnValueImpl(['CCC_requestDeclassifiedCCD'|S], 'ccd', 'authorizedRoles', 'TravelAgency') :- returnValueImpl(['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]],'allowedRoles','requestedRoles','TravelAgency').
not_returnValueImpl(['CCC_requestDeclassifiedCCD'|S], 'ccd', 'authorizedRoles', 'TravelAgency') :- lnot(returnValueImpl(['askUserForCCDDeclassification','promptUser'|['CCC_requestDeclassifiedCCD'|S]],'allowedRoles','requestedRoles','TravelAgency')).


%----------------------------------------------------------------------------
%------------------------Operation Airline_bookFlight------------------------
%----------------------------------------------------------------------------
isOperation('Airline_bookFlight').
hasProperty('Airline_bookFlight','accessRoles').
operationProperty('Airline_bookFlight','accessRoles', 'Airline').
not_operationProperty('Airline_bookFlight','accessRoles', 'User').
not_operationProperty('Airline_bookFlight','accessRoles', 'TravelAgency').
operationParameterType('Airline_bookFlight','ccd','CreditCardData').
operationParameterType('Airline_bookFlight','flight','SingleFlightOffer').

%--------------------Return Values of Airline_bookFlight---------------------


%----------------------------------------------------------------------------
%-----------------Operation TravelAgency_notifyAboutBooking------------------
%----------------------------------------------------------------------------
isOperation('TravelAgency_notifyAboutBooking').
hasProperty('TravelAgency_notifyAboutBooking','accessRoles').
operationProperty('TravelAgency_notifyAboutBooking','accessRoles', 'TravelAgency').
not_operationProperty('TravelAgency_notifyAboutBooking','accessRoles', 'User').
not_operationProperty('TravelAgency_notifyAboutBooking','accessRoles', 'Airline').
operationParameterType('TravelAgency_notifyAboutBooking','selectedOffer','SingleFlightOffer').

%--------------Return Values of TravelAgency_notifyAboutBooking--------------


%----------------------------------------------------------------------------
%-------------------------System Usage BookingUsage--------------------------
%----------------------------------------------------------------------------
isSystemUsage('BookingUsage').

%------------Call to TravelPlanner_getFlightOffers (fetchOffers)-------------
operationCall('BookingUsage','TravelPlanner_getFlightOffers','fetchOffers').
callArgumentImpl(['TravelPlanner_getFlightOffers','fetchOffers'|['BookingUsage'|_]], 'input', 'authorizedRoles', 'User') :- true.
not_callArgumentImpl(['TravelPlanner_getFlightOffers','fetchOffers'|['BookingUsage'|_]], 'input', 'authorizedRoles', 'User') :- lnot(true).
callArgumentImpl(['TravelPlanner_getFlightOffers','fetchOffers'|['BookingUsage'|_]], 'input', 'authorizedRoles', 'Airline') :- true.
not_callArgumentImpl(['TravelPlanner_getFlightOffers','fetchOffers'|['BookingUsage'|_]], 'input', 'authorizedRoles', 'Airline') :- lnot(true).
callArgumentImpl(['TravelPlanner_getFlightOffers','fetchOffers'|['BookingUsage'|_]], 'input', 'authorizedRoles', 'TravelAgency') :- true.
not_callArgumentImpl(['TravelPlanner_getFlightOffers','fetchOffers'|['BookingUsage'|_]], 'input', 'authorizedRoles', 'TravelAgency') :- lnot(true).

%------------------Call to TravelPlanner_bookFlight (book)-------------------
operationCall('BookingUsage','TravelPlanner_bookFlight','book').
callArgumentImpl(['TravelPlanner_bookFlight','book'|['BookingUsage'|_]], 'selectedFlight', 'authorizedRoles', 'User') :- true.
not_callArgumentImpl(['TravelPlanner_bookFlight','book'|['BookingUsage'|_]], 'selectedFlight', 'authorizedRoles', 'User') :- lnot(true).
callArgumentImpl(['TravelPlanner_bookFlight','book'|['BookingUsage'|_]], 'selectedFlight', 'authorizedRoles', 'Airline') :- true.
not_callArgumentImpl(['TravelPlanner_bookFlight','book'|['BookingUsage'|_]], 'selectedFlight', 'authorizedRoles', 'Airline') :- lnot(true).
callArgumentImpl(['TravelPlanner_bookFlight','book'|['BookingUsage'|_]], 'selectedFlight', 'authorizedRoles', 'TravelAgency') :- fail.
not_callArgumentImpl(['TravelPlanner_bookFlight','book'|['BookingUsage'|_]], 'selectedFlight', 'authorizedRoles', 'TravelAgency') :- lnot(fail).


accessRoles(OP,R) :- findall(X,operationProperty(OP,'accessRoles',X),R).

isNoAccessRoleAuthorized([OP | S], P) :- accessRoles(OP,Roles), isNoRoleAuthorized(Roles,[OP | S],P).

isNoRoleAuthorized([], _Stack, _P).
isNoRoleAuthorized([Role | R], Stack, P) :- stackValid(Stack), \+ callArgument(Stack,P,'authorizedRoles', Role), isNoRoleAuthorized(R, Stack, P).


unauthorizedAccess(S, P) :- S=[OP|_], isOperation(OP),hasProperty(OP,'accessRoles'),
							operationParameterType(OP,P,PT),dataTypeAttribute(PT,'authorizedRoles'),
							accessRoles(OP,R),isNoRoleAuthorized(R,S,P).
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
isAnyAccessRoleAuthorized([OP | S], P) :- accessRoles(OP,Roles), isAnyRoleAuthorized(Roles,[OP | S],P).
isAnyRoleAuthorized([Role | _], Stack, P) :- stackValid(Stack), callArgument(Stack,P,'authorizedRoles', Role).
isAnyRoleAuthorized([_ | R], Stack, P) :- stackValid(Stack), isAnyRoleAuthorized(R, Stack, P).
								
authorizedAccess(S, P) :- 	S=[OP|_], isOperation(OP),hasProperty(OP,'accessRoles'),
							operationParameterType(OP,P,PT),dataTypeAttribute(PT,'authorizedRoles'),
							accessRoles(OP,R),isAnyRoleAuthorized(R,S,P).
