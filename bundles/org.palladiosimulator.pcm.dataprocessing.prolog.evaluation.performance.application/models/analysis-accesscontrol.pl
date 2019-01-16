
accessRoles(OP,R) :- findall(X,operationProperty(OP,'accessRoles',X),R).

isNoAccessRoleAuthorized([OP | S], P) :- accessRoles(OP,Roles), isNoRoleAuthorized(Roles,[OP | S],P).

isNoRoleAuthorized([], _Stack, _P).
isNoRoleAuthorized([Role | R], Stack, P) :- (current_predicate(lnot/1) -> 
		lnot(callArgument(Stack,P,'authorizedRoles', Role));
		(stackValid(Stack), \+ callArgument(Stack,P,'authorizedRoles', Role))), isNoRoleAuthorized(R, Stack, P).


unauthorizedAccess(S, P) :- S=[OP|_], isOperation(OP),hasProperty(OP,'accessRoles'),
							operationParameterType(OP,P,PT),dataTypeAttribute(PT,'authorizedRoles'),
							accessRoles(OP,R),isNoRoleAuthorized(R,S,P).
							
linearDependency(S) :- S=['doSomething'|_], returnValue(S,output,'isPersonalInformation','isTrue').

constantDependency(S) :- S=['doSomething'|_], (current_predicate(lnot/1) -> 
		lnot(returnValue(S,output,'encrypted','isTrue'));
		(stackValid(S), \+ returnValue(S,output,'encrypted','isTrue'))).
