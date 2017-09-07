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
 *   <li>{@link org.emftext.language.Presentation.ScenarioNameParameter#getScenario_name <em>Scenario name</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.Presentation.PresentationPackage#getScenarioNameParameter()
 * @model
 * @generated
 */
public interface ScenarioNameParameter extends HeaderParameter {

	/**
	 * Returns the value of the '<em><b>Scenario name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario name</em>' containment reference.
	 * @see #setScenario_name(NameLiteral)
	 * @see org.emftext.language.Presentation.PresentationPackage#getScenarioNameParameter_Scenario_name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NameLiteral getScenario_name();

	/**
	 * Sets the value of the '{@link org.emftext.language.Presentation.ScenarioNameParameter#getScenario_name <em>Scenario name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario name</em>' containment reference.
	 * @see #getScenario_name()
	 * @generated
	 */
	void setScenario_name(NameLiteral value);
} // ScenarioNameParameter
