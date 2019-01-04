package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.extension;

import org.eclipse.emf.common.notify.Adapter;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.VariableItemProvider;

public class PrologmodelItemProviderAdapterFactory extends
		org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.PrologmodelItemProviderAdapterFactory {

	@Override
	public Adapter createDefaultStateRefAdapter() {
		if (defaultStateRefItemProvider == null) {
			defaultStateRefItemProvider = new DefaultStateRefItemProvider(this);
		}
		return defaultStateRefItemProvider;
	}

	@Override
	public Adapter createParameterRefAdapter() {
		if (parameterRefItemProvider == null) {
			parameterRefItemProvider = new ParameterRefItemProvider(this);
		}
		return parameterRefItemProvider;
	}

	@Override
	public Adapter createPropertyDefinitionAdapter() {
		if (propertyDefinitionItemProvider == null) {
			propertyDefinitionItemProvider = new PropertyDefinitionItemProvider(this);
		}
		return propertyDefinitionItemProvider;
	}

	@Override
	public Adapter createPropertyRefAdapter() {
		if (propertyRefItemProvider == null) {
			propertyRefItemProvider = new PropertyRefItemProvider(this);
		}
		return propertyRefItemProvider;
	}

	@Override
	public Adapter createReturnValueRefAdapter() {
		if (propertyRefItemProvider == null) {
			propertyRefItemProvider = new PropertyRefItemProvider(this);
		}
		return propertyRefItemProvider;
	}

	@Override
	public Adapter createStateRefAdapter() {
		if (stateRefItemProvider == null) {
			stateRefItemProvider = new StateRefItemProvider(this);
		}
		return stateRefItemProvider;
	}

	@Override
	public Adapter createVariableAssignmentAdapter() {
		if (variableAssignmentItemProvider == null) {
			variableAssignmentItemProvider = new VariableAssignmentItemProvider(this);
		}
		return variableAssignmentItemProvider;
	}

	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}
		return variableItemProvider;
	}

}
