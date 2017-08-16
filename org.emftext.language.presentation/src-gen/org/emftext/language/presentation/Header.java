/**
 */
package org.emftext.language.Presentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.Presentation.Header#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.Presentation.PresentationPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends ScenarioFile {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.Presentation.Definition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see org.emftext.language.Presentation.PresentationPackage#getHeader_Definition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Definition> getDefinition();

} // Header
