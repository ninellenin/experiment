/**
 */
package org.emftext.language.Presentation;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.Presentation.SDL#getScenario_object <em>Scenario object</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.Presentation.PresentationPackage#getSDL()
 * @model
 * @generated
 */
public interface SDL extends ScenarioFile {

	/**
	 * Returns the value of the '<em><b>Scenario object</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.Presentation.ScenarioObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario object</em>' containment reference list.
	 * @see org.emftext.language.Presentation.PresentationPackage#getSDL_Scenario_object()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScenarioObject> getScenario_object();
} // SDL
