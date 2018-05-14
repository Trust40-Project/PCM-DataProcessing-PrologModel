package edu.kit.ipd.sdq.dataflow.systemmodel.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Util {

	public static <T> Optional<T> tryCast(Class<T> clazz, Object elem) {
		if(elem != null && clazz.isInstance(elem)) {
			return Optional.of(clazz.cast(elem));
		} else {
			return Optional.empty();
		}
	}
	
	public static <S> S getOrElse(Optional<? extends S> opt, Supplier<? extends S> elseValue) {
		if(opt.isPresent()) {
			return opt.get();
		} else {
			return elseValue.get();
		}
	}
	
	public static <S> Collection<S> addNull(Collection<S> collection) {
		ArrayList<S> result = new ArrayList<S>(collection);
		result.add(null);
		return result;
	}
	
	public static <S> Stream<S> streamOfNullable(Collection<S> nullableCollection) {
		if(nullableCollection == null) {
			return Stream.empty();
		} else {
			return nullableCollection.stream();
		}
	}
}
