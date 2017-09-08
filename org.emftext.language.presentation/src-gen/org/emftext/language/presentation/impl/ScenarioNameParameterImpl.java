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
 *   <li>{@link org.emftext.language.Presentation.impl.ScenarioNameParameterImpl#getName_literal <em>Name literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioNameParameterImpl extends HeaderParameterImpl implements ScenarioNameParameter {
	/**
	 * The cached value of the '{@link #getName_literal() <em>Name literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_literal()
	 * @generated
	 * @ordered
	 */
	protected NameLiteral name_literal;
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
	public NameLiteral getName_literal() {
		return name_literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName_literal(NameLiteral newName_literal, NotificationChain msgs) {
		NameLiteral oldName_literal = name_literal;
		name_literal = newName_literal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.SCENARIO_NAME_PARAMETER__NAME_LITERAL, oldName_literal, newName_literal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_literal(NameLiteral newName_literal) {
		if (newName_literal != name_literal) {
			NotificationChain msgs = null;
			if (name_literal != null)
				msgs = ((InternalEObject)name_literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.SCENARIO_NAME_PARAMETER__NAME_LITERAL, null, msgs);
			if (newName_literal != null)
				msgs = ((InternalEObject)newName_literal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.SCENARIO_NAME_PARAMETER__NAME_LITERAL, null, msgs);
			msgs = basicSetName_literal(newName_literal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SCENARIO_NAME_PARAMETER__NAME_LITERAL, newName_literal, newName_literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.SCENARIO_NAME_PARAMETER__NAME_LITERAL:
				return basicSetName_literal(null, msgs);
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
			case PresentationPackage.SCENARIO_NAME_PARAMETER__NAME_LITERAL:
				return getName_literal();
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
			case PresentationPackage.SCENARIO_NAME_PARAMETER__NAME_LITERAL:
				setName_literal((NameLiteral)newValue);
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
			case PresentationPackage.SCENARIO_NAME_PARAMETER__NAME_LITERAL:
				setName_literal((NameLiteral)null);
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
			case PresentationPackage.SCENARIO_NAME_PARAMETER__NAME_LITERAL:
				return name_literal != null;
		}
		return super.eIsSet(featureID);
	}

} //ScenarioNameParameterImpl
