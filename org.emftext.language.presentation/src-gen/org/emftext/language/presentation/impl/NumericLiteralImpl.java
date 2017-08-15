/**
 */
package org.emftext.language.presentation.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.presentation.NumericLiteral;
import org.emftext.language.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NumericLiteralImpl extends LiteralImpl implements NumericLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.NUMERIC_LITERAL;
	}

} //NumericLiteralImpl
