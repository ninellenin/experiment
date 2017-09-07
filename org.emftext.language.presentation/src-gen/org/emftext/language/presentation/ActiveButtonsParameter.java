/**
 */
package org.emftext.language.Presentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Buttons Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.Presentation.ActiveButtonsParameter#getActive_buttons <em>Active buttons</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.Presentation.PresentationPackage#getActiveButtonsParameter()
 * @model
 * @generated
 */
public interface ActiveButtonsParameter extends HeaderParameter {

	/**
	 * Returns the value of the '<em><b>Active buttons</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active buttons</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active buttons</em>' containment reference.
	 * @see #setActive_buttons(NumberLiteral)
	 * @see org.emftext.language.Presentation.PresentationPackage#getActiveButtonsParameter_Active_buttons()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumberLiteral getActive_buttons();

	/**
	 * Sets the value of the '{@link org.emftext.language.Presentation.ActiveButtonsParameter#getActive_buttons <em>Active buttons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active buttons</em>' containment reference.
	 * @see #getActive_buttons()
	 * @generated
	 */
	void setActive_buttons(NumberLiteral value);
} // ActiveButtonsParameter
