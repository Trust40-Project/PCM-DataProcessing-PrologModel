/**
 */
package org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.extension;

import java.util.Optional;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.DataType;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Operation;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.PrologmodelPackage;
import org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.Variable;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.dataflow.systemmodel.Variable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableItemProvider extends org.palladiosimulator.pcm.dataprocessing.prolog.prologmodel.provider.VariableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Variable) object).getName();

		Optional<Variable> var = Util.tryCast(Variable.class, object);
		Optional<EStructuralFeature> containingFeature = var.map(Variable::eContainingFeature);
		Optional<Operation> containingOperation = var.map(Variable::eContainer)
				.flatMap(obj -> Util.tryCast(Operation.class, obj));

		Optional<String> typeName = var.map(Variable::getDatatype).map(DataType::getName);
		String typeSuffix = "";
		if (typeName.isPresent()) {
			typeSuffix = " : " + typeName.get();
		}

		if (containingFeature.isPresent()
				&& containingFeature.get() == PrologmodelPackage.eINSTANCE.getOperation_ReturnValues()) {
			return "ReturnValue " + label + typeSuffix;
		} else if (containingFeature.isPresent()
				&& containingFeature.get() == PrologmodelPackage.eINSTANCE.getOperation_Parameters()) {
			return "Parameter " + label + typeSuffix;

		} else if (containingFeature.isPresent()
				&& containingFeature.get() == PrologmodelPackage.eINSTANCE.getOperation_StateVariables()) {
			String opName = containingOperation.map(Operation::getName).orElse("");
			return "State " + opName + "." + label + typeSuffix;

		} else {
			return label == null || label.length() == 0 ? getString("_UI_Variable_type")
					: getString("_UI_Variable_type") + " " + label + typeSuffix;
		}
	}

}
