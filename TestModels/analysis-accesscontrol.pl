
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