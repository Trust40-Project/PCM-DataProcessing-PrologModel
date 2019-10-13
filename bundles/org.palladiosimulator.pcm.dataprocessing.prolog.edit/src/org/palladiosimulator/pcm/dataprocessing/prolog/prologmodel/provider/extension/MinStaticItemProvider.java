package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.extension;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.CommandParameter;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DefaultStateRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.LogicTerm;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ParameterRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PropertyRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.ReturnValueRef;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.StateRef;

public class MinStaticItemProvider
        extends org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.MinStaticItemProvider {

    private static final Collection<Class<? extends LogicTerm>> WHITELISTED_OPERANDS = Arrays
        .asList(DefaultStateRef.class, ParameterRef.class, PropertyRef.class, ReturnValueRef.class, StateRef.class);

    public MinStaticItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.removeIf(d -> Optional.of(d)
                .filter(CommandParameter.class::isInstance)
                .map(CommandParameter.class::cast)
                .map(cp -> Optional.ofNullable(cp.getValue())
                    .map(Object::getClass)
                    .filter(LogicTerm.class::isAssignableFrom)
                    .map(valueClass -> WHITELISTED_OPERANDS.stream()
                        .noneMatch(whitelistedOp -> whitelistedOp.isAssignableFrom(valueClass)))
                    .orElse(false))
                .orElse(false));

    }

}
