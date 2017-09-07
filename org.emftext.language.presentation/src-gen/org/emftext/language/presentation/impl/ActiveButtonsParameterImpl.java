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
 *   <li>{@link org.emftext.language.Presentation.impl.ActiveButtonsParameterImpl#getActive_buttons <em>Active buttons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActiveButtonsParameterImpl extends HeaderParameterImpl implements ActiveButtonsParameter {
	/**
	 * The cached value of the '{@link #getActive_buttons() <em>Active buttons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_buttons()
	 * @generated
	 * @ordered
	 */
	protected NumberLiteral active_buttons;

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
	public NumberLiteral getActive_buttons() {
		return active_buttons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive_buttons(NumberLiteral newActive_buttons, NotificationChain msgs) {
		NumberLiteral oldActive_buttons = active_buttons;
		active_buttons = newActive_buttons;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS, oldActive_buttons, newActive_buttons);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_buttons(NumberLiteral newActive_buttons) {
		if (newActive_buttons != active_buttons) {
			NotificationChain msgs = null;
			if (active_buttons != null)
				msgs = ((InternalEObject)active_buttons).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS, null, msgs);
			if (newActive_buttons != null)
				msgs = ((InternalEObject)newActive_buttons).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS, null, msgs);
			msgs = basicSetActive_buttons(newActive_buttons, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS, newActive_buttons, newActive_buttons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS:
				return basicSetActive_buttons(null, msgs);
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
			case PresentationPackage.ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS:
				return getActive_buttons();
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
			case PresentationPackage.ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS:
				setActive_buttons((NumberLiteral)newValue);
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
			case PresentationPackage.ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS:
				setActive_buttons((NumberLiteral)null);
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
			case PresentationPackage.ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS:
				return active_buttons != null;
		}
		return super.eIsSet(featureID);
	}

} //ActiveButtonsParameterImpl
