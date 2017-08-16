/**
 */
package org.emftext.language.Presentation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.Presentation.Header;
import org.emftext.language.Presentation.PCL;
import org.emftext.language.Presentation.PresentationPackage;
import org.emftext.language.Presentation.SDL;
import org.emftext.language.Presentation.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.Presentation.impl.ScenarioImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.emftext.language.Presentation.impl.ScenarioImpl#getSdl <em>Sdl</em>}</li>
 *   <li>{@link org.emftext.language.Presentation.impl.ScenarioImpl#getPcl <em>Pcl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends NamedElementImpl implements Scenario {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected Header header;

	/**
	 * The cached value of the '{@link #getSdl() <em>Sdl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdl()
	 * @generated
	 * @ordered
	 */
	protected EList<SDL> sdl;

	/**
	 * The cached value of the '{@link #getPcl() <em>Pcl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcl()
	 * @generated
	 * @ordered
	 */
	protected EList<PCL> pcl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs) {
		Header oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.SCENARIO__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(Header newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.SCENARIO__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.SCENARIO__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.SCENARIO__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SDL> getSdl() {
		if (sdl == null) {
			sdl = new EObjectContainmentEList<SDL>(SDL.class, this, PresentationPackage.SCENARIO__SDL);
		}
		return sdl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCL> getPcl() {
		if (pcl == null) {
			pcl = new EObjectContainmentEList<PCL>(PCL.class, this, PresentationPackage.SCENARIO__PCL);
		}
		return pcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.SCENARIO__HEADER:
				return basicSetHeader(null, msgs);
			case PresentationPackage.SCENARIO__SDL:
				return ((InternalEList<?>)getSdl()).basicRemove(otherEnd, msgs);
			case PresentationPackage.SCENARIO__PCL:
				return ((InternalEList<?>)getPcl()).basicRemove(otherEnd, msgs);
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
			case PresentationPackage.SCENARIO__HEADER:
				return getHeader();
			case PresentationPackage.SCENARIO__SDL:
				return getSdl();
			case PresentationPackage.SCENARIO__PCL:
				return getPcl();
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
			case PresentationPackage.SCENARIO__HEADER:
				setHeader((Header)newValue);
				return;
			case PresentationPackage.SCENARIO__SDL:
				getSdl().clear();
				getSdl().addAll((Collection<? extends SDL>)newValue);
				return;
			case PresentationPackage.SCENARIO__PCL:
				getPcl().clear();
				getPcl().addAll((Collection<? extends PCL>)newValue);
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
			case PresentationPackage.SCENARIO__HEADER:
				setHeader((Header)null);
				return;
			case PresentationPackage.SCENARIO__SDL:
				getSdl().clear();
				return;
			case PresentationPackage.SCENARIO__PCL:
				getPcl().clear();
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
			case PresentationPackage.SCENARIO__HEADER:
				return header != null;
			case PresentationPackage.SCENARIO__SDL:
				return sdl != null && !sdl.isEmpty();
			case PresentationPackage.SCENARIO__PCL:
				return pcl != null && !pcl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarioImpl
