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
 *   <li>{@link org.emftext.language.Presentation.Header#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.Presentation.PresentationPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends ScenarioFile {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.Presentation.HeaderParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.emftext.language.Presentation.PresentationPackage#getHeader_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<HeaderParameter> getParameter();

} // Header
