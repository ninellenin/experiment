/**
 */
package org.emftext.language.Presentation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.emftext.language.Presentation.NameLiteral;
import org.emftext.language.Presentation.PresentationPackage;
import org.emftext.language.Presentation.ScenarioNameParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Name Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.Presentation.impl.ScenarioNameParameterImpl#getScenario_name <em>Scenario name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioNameParameterImpl extends HeaderParameterImpl implements ScenarioNameParameter {
	/**
	 * The cached value of the '{@link #getScenario_name() <em>Scenario name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario_name()
	 * @generated
	 * @ordered
	 */
	protected NameLiteral scenario_name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioNameParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.SCENARIO_NAME_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameLiteral getScenario_name() {
		return scenario_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario_name(NameLiteral newScenario_name, NotificationChain msgs) {
		NameLiteral oldScenario_name = scenario_name;
		scenario_name = newScenario_name;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.SCENARIO_NAME_PARAMETER__SCENARIO_NAME, oldScenario_name, newScenario_name);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario_name(NameLiteral newScenario_name) {
		if (newScenario_name != scenario_name) {
			NotificationChain msgs = null;
			if (scenario_name != null)
				msgs = ((InternalEObject)scenario_name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.SCENARIO_NAME_PARAMETER__SCENARIO_NAME, null, msgs);
			if (newScenario_name != null)
				msgs = ((InternalEObject)newScenario_name).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.SCENARIO_NAME_PARAMETER__SCENARIO_NAME, null, msgs);
			msgs = basicSetScenario_name(newScenario_name, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SCENARIO_NAME_PARAMETER__SCENARIO_NAME, newScenario_name, newScenario_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.SCENARIO_NAME_PARAMETER__SCENARIO_NAME:
				return basicSetScenario_name(null, msgs);
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
			case PresentationPackage.SCENARIO_NAME_PARAMETER__SCENARIO_NAME:
				return getScenario_name();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PresentationPackage.SCENARIO_NAME_PARAMETER__SCENARIO_NAME:
				setScenario_name((NameLiteral)newValue);
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
			case PresentationPackage.SCENARIO_NAME_PARAMETER__SCENARIO_NAME:
				setScenario_name((NameLiteral)null);
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
			case PresentationPackage.SCENARIO_NAME_PARAMETER__SCENARIO_NAME:
				return scenario_name != null;
		}
		return super.eIsSet(featureID);
	}

} //ScenarioNameParameterImpl
