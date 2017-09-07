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
 *   <li>{@link org.emftext.language.Presentation.SDL#getTrial <em>Trial</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.Presentation.PresentationPackage#getSDL()
 * @model
 * @generated
 */
public interface SDL extends ScenarioFile {

	/**
	 * Returns the value of the '<em><b>Trial</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.Presentation.Trial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trial</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trial</em>' containment reference list.
	 * @see org.emftext.language.Presentation.PresentationPackage#getSDL_Trial()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trial> getTrial();
} // SDL
