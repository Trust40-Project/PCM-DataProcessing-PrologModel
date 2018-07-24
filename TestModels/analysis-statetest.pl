joinResult(A,V) :-returnValue(['join','call_join','usage'], 'joined', A, V).
lnot(joinResult(A,V)) :- lnot(returnValue(['join','call_join','usage'], 'joined', A, V)).