package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.extension;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

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
	
	public static <T> Optional<T> getContainerOfType(EObject obj, Class<? extends T> type) {
		EObject current = obj;
		while(current != null) {
			if(type.isInstance(current)) {
				return Optional.of(type.cast(current));
			} else {
				current = current.eContainer();
			}
		}
		return Optional.empty();
	}
	
	/**
	 * Walks up the containment tree until the given feauter is found.
	 * If the feature is found, the owner of the feature is returned as container.
	 * Otherwise an empty optional is returned.
	 * @param obj the object whose containers shall be traversed
	 * @param containingFeature the feature type to look for
	 * @return the foudn container or an empty Optional otherwise
	 */
	public static Optional<EObject> getFeatureBasedContainer(EObject obj, EStructuralFeature containingFeature) {
		EObject current = obj;
		while(current != null) {
			if(current.eContainingFeature() == containingFeature) {
				return Optional.of(current.eContainer());
			} else {
				current = current.eContainer();
			}
		}
		return Optional.empty();
	}
}
