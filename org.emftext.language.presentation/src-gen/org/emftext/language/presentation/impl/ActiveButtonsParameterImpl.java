/**
 */
package org.emftext.language.Presentation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.emftext.language.Presentation.ActiveButtonsParameter;
import org.emftext.language.Presentation.NumberLiteral;
import org.emftext.language.Presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Active Buttons Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.Presentation.impl.ActiveButtonsParameterImpl#getNumber_literal <em>Number literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActiveButtonsParameterImpl extends HeaderParameterImpl implements ActiveButtonsParameter {
	/**
	 * The cached value of the '{@link #getNumber_literal() <em>Number literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_literal()
	 * @generated
	 * @ordered
	 */
	protected NumberLiteral number_literal;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveButtonsParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.ACTIVE_BUTTONS_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberLiteral getNumber_literal() {
		return number_literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber_literal(NumberLiteral newNumber_literal, NotificationChain msgs) {
		NumberLiteral oldNumber_literal = number_literal;
		number_literal = newNumber_literal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL, oldNumber_literal, newNumber_literal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber_literal(NumberLiteral newNumber_literal) {
		if (newNumber_literal != number_literal) {
			NotificationChain msgs = null;
			if (number_literal != null)
				msgs = ((InternalEObject)number_literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL, null, msgs);
			if (newNumber_literal != null)
				msgs = ((InternalEObject)newNumber_literal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL, null, msgs);
			msgs = basicSetNumber_literal(newNumber_literal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL, newNumber_literal, newNumber_literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL:
				return basicSetNumber_literal(null, msgs);
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
			case PresentationPackage.ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL:
				return getNumber_literal();
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
			case PresentationPackage.ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL:
				setNumber_literal((NumberLiteral)newValue);
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
			case PresentationPackage.ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL:
				setNumber_literal((NumberLiteral)null);
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
			case PresentationPackage.ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL:
				return number_literal != null;
		}
		return super.eIsSet(featureID);
	}

} //ActiveButtonsParameterImpl
