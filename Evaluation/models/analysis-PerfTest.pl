linearDependency(S) :- S=['doSomething'|_], returnValue(S,output,'isPersonalInformation','isTrue').
constantDependency(S) :- S=['doSomething'|_], (current_predicate(lnot/1) -> 
		lnot(returnValue(S,output,'isEncrypted','isTrue'));
		(stackValid(S), \+ returnValue(S,output,'isEncrypted','isTrue'))).
