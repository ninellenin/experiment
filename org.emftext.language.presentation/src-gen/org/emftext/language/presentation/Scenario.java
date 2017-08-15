/**
 */
package org.emftext.language.presentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.presentation.Scenario#getHeader <em>Header</em>}</li>
 *   <li>{@link org.emftext.language.presentation.Scenario#getSdl <em>Sdl</em>}</li>
 *   <li>{@link org.emftext.language.presentation.Scenario#getPcl <em>Pcl</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.presentation.PresentationPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Header)
	 * @see org.emftext.language.presentation.PresentationPackage#getScenario_Header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link org.emftext.language.presentation.Scenario#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Sdl</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.presentation.SDL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sdl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sdl</em>' containment reference list.
	 * @see org.emftext.language.presentation.PresentationPackage#getScenario_Sdl()
	 * @model containment="true"
	 * @generated
	 */
	EList<SDL> getSdl();

	/**
	 * Returns the value of the '<em><b>Pcl</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.presentation.PCL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcl</em>' containment reference list.
	 * @see org.emftext.language.presentation.PresentationPackage#getScenario_Pcl()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCL> getPcl();

} // Scenario
