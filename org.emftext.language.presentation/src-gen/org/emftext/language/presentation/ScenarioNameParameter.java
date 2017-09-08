/**
 */
package org.emftext.language.Presentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Name Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.Presentation.ScenarioNameParameter#getName_literal <em>Name literal</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.Presentation.PresentationPackage#getScenarioNameParameter()
 * @model
 * @generated
 */
public interface ScenarioNameParameter extends HeaderParameter {

	/**
	 * Returns the value of the '<em><b>Name literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name literal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name literal</em>' containment reference.
	 * @see #setName_literal(NameLiteral)
	 * @see org.emftext.language.Presentation.PresentationPackage#getScenarioNameParameter_Name_literal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NameLiteral getName_literal();

	/**
	 * Sets the value of the '{@link org.emftext.language.Presentation.ScenarioNameParameter#getName_literal <em>Name literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name literal</em>' containment reference.
	 * @see #getName_literal()
	 * @generated
	 */
	void setName_literal(NameLiteral value);
} // ScenarioNameParameter
