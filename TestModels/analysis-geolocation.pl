euStorageViolation(S) :- S=['storeInDB'|_],
	callArgument(S,X,'origin','EU'),
	callArgument(S,X,'isPersonalInformation','isTrue'),
	stackValid(S), \+ callArgument(S,X,'isEncrypted','isTrue').
	