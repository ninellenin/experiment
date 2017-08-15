/**
 */
package org.emftext.language.presentation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.presentation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.presentation.PresentationPackage
 * @generated
 */
public class PresentationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PresentationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PresentationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationSwitch<Adapter> modelSwitch =
		new PresentationSwitch<Adapter>() {
			@Override
			public Adapter caseScenarioFile(ScenarioFile object) {
				return createScenarioFileAdapter();
			}
			@Override
			public Adapter caseHeader(Header object) {
				return createHeaderAdapter();
			}
			@Override
			public Adapter caseSDL(SDL object) {
				return createSDLAdapter();
			}
			@Override
			public Adapter casePCL(PCL object) {
				return createPCLAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			@Override
			public Adapter caseHeaderParameter(HeaderParameter object) {
				return createHeaderParameterAdapter();
			}
			@Override
			public Adapter caseScenarioNameParameter(ScenarioNameParameter object) {
				return createScenarioNameParameterAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseActiveButtonsParameter(ActiveButtonsParameter object) {
				return createActiveButtonsParameterAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseNumericLiteral(NumericLiteral object) {
				return createNumericLiteralAdapter();
			}
			@Override
			public Adapter caseNumberLiteral(NumberLiteral object) {
				return createNumberLiteralAdapter();
			}
			@Override
			public Adapter caseGeneralLiteral(GeneralLiteral object) {
				return createGeneralLiteralAdapter();
			}
			@Override
			public Adapter caseBooleanLiteral(BooleanLiteral object) {
				return createBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseNameLiteral(NameLiteral object) {
				return createNameLiteralAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.ScenarioFile <em>Scenario File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.ScenarioFile
	 * @generated
	 */
	public Adapter createScenarioFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.SDL <em>SDL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.SDL
	 * @generated
	 */
	public Adapter createSDLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.PCL <em>PCL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.PCL
	 * @generated
	 */
	public Adapter createPCLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.HeaderParameter <em>Header Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.HeaderParameter
	 * @generated
	 */
	public Adapter createHeaderParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.ScenarioNameParameter <em>Scenario Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.ScenarioNameParameter
	 * @generated
	 */
	public Adapter createScenarioNameParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.ActiveButtonsParameter <em>Active Buttons Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.ActiveButtonsParameter
	 * @generated
	 */
	public Adapter createActiveButtonsParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.NumericLiteral <em>Numeric Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.NumericLiteral
	 * @generated
	 */
	public Adapter createNumericLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.NumberLiteral
	 * @generated
	 */
	public Adapter createNumberLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.GeneralLiteral <em>General Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.GeneralLiteral
	 * @generated
	 */
	public Adapter createGeneralLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.presentation.NameLiteral <em>Name Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.presentation.NameLiteral
	 * @generated
	 */
	public Adapter createNameLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PresentationAdapterFactory
