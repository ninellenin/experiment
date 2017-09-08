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
 *   <li>{@link org.emftext.language.Presentation.ActiveButtonsParameter#getNumber_literal <em>Number literal</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.Presentation.PresentationPackage#getActiveButtonsParameter()
 * @model
 * @generated
 */
public interface ActiveButtonsParameter extends HeaderParameter {

	/**
	 * Returns the value of the '<em><b>Number literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number literal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number literal</em>' containment reference.
	 * @see #setNumber_literal(NumberLiteral)
	 * @see org.emftext.language.Presentation.PresentationPackage#getActiveButtonsParameter_Number_literal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumberLiteral getNumber_literal();

	/**
	 * Sets the value of the '{@link org.emftext.language.Presentation.ActiveButtonsParameter#getNumber_literal <em>Number literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number literal</em>' containment reference.
	 * @see #getNumber_literal()
	 * @generated
	 */
	void setNumber_literal(NumberLiteral value);
} // ActiveButtonsParameter
