
isSafe('EU').
isNotSafe(X) :- valueSetMember('Locations',X), \+ isSafe(X).

type0Violation(OP,P,L) :- S=[OP|_], callArgument(S,P,'level','Type-0'), operationProperty(OP,'location',L), isNotSafe(L).
type1Violation(S1,P1,S2,P2,L) :- S1=[OP1|_], S2=[OP2|_],
								operationProperty(OP1,'location',L), isNotSafe(L), callArgument(S1,P1,'level','Type-1'),
								operationProperty(OP2,'location',L), callArgument(S2,P2,'level','Type-1'),
								operationParameterType(OP1,P1,T1),operationParameterType(OP2,P2,T2),
								\+ T1=T2,
								P1 @< P2.
								
anyViolation(S1,P1,_,_,L) :- S1=[OP|_], type0Violation(OP,P1,L).
anyViolation(S1,P1,S2,P2,L) :- type1Violation(S1,P1,S2,P2,L).
