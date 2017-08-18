/**
 */
package org.emftext.language.Presentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.Presentation.PresentationFactory
 * @model kind="package"
 * @generated
 */
public interface PresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Presentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftext.org/language/Presentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "presentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationPackage eINSTANCE = org.emftext.language.Presentation.impl.PresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.ScenarioFileImpl <em>Scenario File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.ScenarioFileImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getScenarioFile()
	 * @generated
	 */
	int SCENARIO_FILE = 0;

	/**
	 * The number of structural features of the '<em>Scenario File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FILE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Scenario File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.HeaderImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__DEFINITION = SCENARIO_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = SCENARIO_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = SCENARIO_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.SDLImpl <em>SDL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.SDLImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getSDL()
	 * @generated
	 */
	int SDL = 2;

	/**
	 * The number of structural features of the '<em>SDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL_FEATURE_COUNT = SCENARIO_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL_OPERATION_COUNT = SCENARIO_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.PCLImpl <em>PCL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.PCLImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getPCL()
	 * @generated
	 */
	int PCL = 3;

	/**
	 * The number of structural features of the '<em>PCL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCL_FEATURE_COUNT = SCENARIO_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCL_OPERATION_COUNT = SCENARIO_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.ParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.StatementImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 5;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.DefinitionImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__PARAMETER = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.HeaderParameterImpl <em>Header Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.HeaderParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getHeaderParameter()
	 * @generated
	 */
	int HEADER_PARAMETER = 7;

	/**
	 * The number of structural features of the '<em>Header Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Header Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.ScenarioNameParameterImpl <em>Scenario Name Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.ScenarioNameParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getScenarioNameParameter()
	 * @generated
	 */
	int SCENARIO_NAME_PARAMETER = 8;

	/**
	 * The number of structural features of the '<em>Scenario Name Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_NAME_PARAMETER_FEATURE_COUNT = HEADER_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scenario Name Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_NAME_PARAMETER_OPERATION_COUNT = HEADER_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.NamedElementImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.ScenarioImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__HEADER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sdl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SDL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pcl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PCL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.ActiveButtonsParameterImpl <em>Active Buttons Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.ActiveButtonsParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getActiveButtonsParameter()
	 * @generated
	 */
	int ACTIVE_BUTTONS_PARAMETER = 11;

	/**
	 * The number of structural features of the '<em>Active Buttons Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_BUTTONS_PARAMETER_FEATURE_COUNT = HEADER_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Active Buttons Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_BUTTONS_PARAMETER_OPERATION_COUNT = HEADER_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.LiteralImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 12;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.NumericLiteralImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getNumericLiteral()
	 * @generated
	 */
	int NUMERIC_LITERAL = 13;

	/**
	 * The number of structural features of the '<em>Numeric Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.NumberLiteralImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getNumberLiteral()
	 * @generated
	 */
	int NUMBER_LITERAL = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_OPERATION_COUNT = NUMERIC_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.GeneralLiteralImpl <em>General Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.GeneralLiteralImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getGeneralLiteral()
	 * @generated
	 */
	int GENERAL_LITERAL = 15;

	/**
	 * The number of structural features of the '<em>General Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>General Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.BooleanLiteralImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = GENERAL_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = GENERAL_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = GENERAL_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.NameLiteralImpl <em>Name Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.NameLiteralImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getNameLiteral()
	 * @generated
	 */
	int NAME_LITERAL = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LITERAL__VALUE = GENERAL_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LITERAL_FEATURE_COUNT = GENERAL_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Name Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LITERAL_OPERATION_COUNT = GENERAL_LITERAL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.ScenarioFile <em>Scenario File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario File</em>'.
	 * @see org.emftext.language.Presentation.ScenarioFile
	 * @generated
	 */
	EClass getScenarioFile();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see org.emftext.language.Presentation.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.Header#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition</em>'.
	 * @see org.emftext.language.Presentation.Header#getDefinition()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Definition();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.SDL <em>SDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL</em>'.
	 * @see org.emftext.language.Presentation.SDL
	 * @generated
	 */
	EClass getSDL();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.PCL <em>PCL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCL</em>'.
	 * @see org.emftext.language.Presentation.PCL
	 * @generated
	 */
	EClass getPCL();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.emftext.language.Presentation.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.emftext.language.Presentation.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.emftext.language.Presentation.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.Definition#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see org.emftext.language.Presentation.Definition#getParameter()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.Definition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.emftext.language.Presentation.Definition#getValue()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.HeaderParameter <em>Header Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Parameter</em>'.
	 * @see org.emftext.language.Presentation.HeaderParameter
	 * @generated
	 */
	EClass getHeaderParameter();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.ScenarioNameParameter <em>Scenario Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Name Parameter</em>'.
	 * @see org.emftext.language.Presentation.ScenarioNameParameter
	 * @generated
	 */
	EClass getScenarioNameParameter();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.emftext.language.Presentation.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.Presentation.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.Presentation.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.emftext.language.Presentation.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.Scenario#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.emftext.language.Presentation.Scenario#getHeader()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.Scenario#getSdl <em>Sdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sdl</em>'.
	 * @see org.emftext.language.Presentation.Scenario#getSdl()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Sdl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.Scenario#getPcl <em>Pcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pcl</em>'.
	 * @see org.emftext.language.Presentation.Scenario#getPcl()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Pcl();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.ActiveButtonsParameter <em>Active Buttons Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Buttons Parameter</em>'.
	 * @see org.emftext.language.Presentation.ActiveButtonsParameter
	 * @generated
	 */
	EClass getActiveButtonsParameter();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.emftext.language.Presentation.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.NumericLiteral <em>Numeric Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Literal</em>'.
	 * @see org.emftext.language.Presentation.NumericLiteral
	 * @generated
	 */
	EClass getNumericLiteral();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal</em>'.
	 * @see org.emftext.language.Presentation.NumberLiteral
	 * @generated
	 */
	EClass getNumberLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.Presentation.NumberLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.Presentation.NumberLiteral#getValue()
	 * @see #getNumberLiteral()
	 * @generated
	 */
	EAttribute getNumberLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.GeneralLiteral <em>General Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Literal</em>'.
	 * @see org.emftext.language.Presentation.GeneralLiteral
	 * @generated
	 */
	EClass getGeneralLiteral();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.emftext.language.Presentation.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.Presentation.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.Presentation.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.NameLiteral <em>Name Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Literal</em>'.
	 * @see org.emftext.language.Presentation.NameLiteral
	 * @generated
	 */
	EClass getNameLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.Presentation.NameLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.Presentation.NameLiteral#getValue()
	 * @see #getNameLiteral()
	 * @generated
	 */
	EAttribute getNameLiteral_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PresentationFactory getPresentationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.ScenarioFileImpl <em>Scenario File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.ScenarioFileImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getScenarioFile()
		 * @generated
		 */
		EClass SCENARIO_FILE = eINSTANCE.getScenarioFile();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.HeaderImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__DEFINITION = eINSTANCE.getHeader_Definition();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.SDLImpl <em>SDL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.SDLImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getSDL()
		 * @generated
		 */
		EClass SDL = eINSTANCE.getSDL();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.PCLImpl <em>PCL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.PCLImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getPCL()
		 * @generated
		 */
		EClass PCL = eINSTANCE.getPCL();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.ParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.StatementImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.DefinitionImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__PARAMETER = eINSTANCE.getDefinition_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__VALUE = eINSTANCE.getDefinition_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.HeaderParameterImpl <em>Header Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.HeaderParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getHeaderParameter()
		 * @generated
		 */
		EClass HEADER_PARAMETER = eINSTANCE.getHeaderParameter();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.ScenarioNameParameterImpl <em>Scenario Name Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.ScenarioNameParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getScenarioNameParameter()
		 * @generated
		 */
		EClass SCENARIO_NAME_PARAMETER = eINSTANCE.getScenarioNameParameter();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.NamedElementImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.ScenarioImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__HEADER = eINSTANCE.getScenario_Header();

		/**
		 * The meta object literal for the '<em><b>Sdl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SDL = eINSTANCE.getScenario_Sdl();

		/**
		 * The meta object literal for the '<em><b>Pcl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__PCL = eINSTANCE.getScenario_Pcl();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.ActiveButtonsParameterImpl <em>Active Buttons Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.ActiveButtonsParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getActiveButtonsParameter()
		 * @generated
		 */
		EClass ACTIVE_BUTTONS_PARAMETER = eINSTANCE.getActiveButtonsParameter();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.LiteralImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.NumericLiteralImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getNumericLiteral()
		 * @generated
		 */
		EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.NumberLiteralImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getNumberLiteral()
		 * @generated
		 */
		EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.GeneralLiteralImpl <em>General Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.GeneralLiteralImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getGeneralLiteral()
		 * @generated
		 */
		EClass GENERAL_LITERAL = eINSTANCE.getGeneralLiteral();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.BooleanLiteralImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.NameLiteralImpl <em>Name Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.NameLiteralImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getNameLiteral()
		 * @generated
		 */
		EClass NAME_LITERAL = eINSTANCE.getNameLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_LITERAL__VALUE = eINSTANCE.getNameLiteral_Value();

	}

} //PresentationPackage
