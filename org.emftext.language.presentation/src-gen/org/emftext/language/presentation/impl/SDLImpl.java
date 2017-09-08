/**
 */
package org.emftext.language.Presentation.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.emftext.language.Presentation.PresentationPackage;
import org.emftext.language.Presentation.SDL;
import org.emftext.language.Presentation.ScenarioObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.Presentation.impl.SDLImpl#getScenario_object <em>Scenario object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDLImpl extends ScenarioFileImpl implements SDL {
	/**
	 * The cached value of the '{@link #getScenario_object() <em>Scenario object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario_object()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioObject> scenario_object;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.SDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScenarioObject> getScenario_object() {
		if (scenario_object == null) {
			scenario_object = new EObjectContainmentEList<ScenarioObject>(ScenarioObject.class, this, PresentationPackage.SDL__SCENARIO_OBJECT);
		}
		return scenario_object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.SDL__SCENARIO_OBJECT:
				return ((InternalEList<?>)getScenario_object()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.SDL__SCENARIO_OBJECT:
				return getScenario_object();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PresentationPackage.SDL__SCENARIO_OBJECT:
				getScenario_object().clear();
				getScenario_object().addAll((Collection<? extends ScenarioObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PresentationPackage.SDL__SCENARIO_OBJECT:
				getScenario_object().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PresentationPackage.SDL__SCENARIO_OBJECT:
				return scenario_object != null && !scenario_object.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SDLImpl
