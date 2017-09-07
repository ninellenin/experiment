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
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__PARAMETER = SCENARIO_FILE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Trial</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL__TRIAL = SCENARIO_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL_FEATURE_COUNT = SCENARIO_FILE_FEATURE_COUNT + 1;

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
	int PARAMETER = 24;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.SDLParameterImpl <em>SDL Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.SDLParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getSDLParameter()
	 * @generated
	 */
	int SDL_PARAMETER = 26;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.ScenarioNameParameterImpl <em>Scenario Name Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.ScenarioNameParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getScenarioNameParameter()
	 * @generated
	 */
	int SCENARIO_NAME_PARAMETER = 29;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.TimeParameterImpl <em>Time Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.TimeParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTimeParameter()
	 * @generated
	 */
	int TIME_PARAMETER = 30;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.TargetButtonParameterImpl <em>Target Button Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.TargetButtonParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTargetButtonParameter()
	 * @generated
	 */
	int TARGET_BUTTON_PARAMETER = 31;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.CodeParameterImpl <em>Code Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.CodeParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getCodeParameter()
	 * @generated
	 */
	int CODE_PARAMETER = 32;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.NamedElementImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

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
	int SCENARIO = 5;

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
	int ACTIVE_BUTTONS_PARAMETER = 27;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.ButtonCodesParameterImpl <em>Button Codes Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.ButtonCodesParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getButtonCodesParameter()
	 * @generated
	 */
	int BUTTON_CODES_PARAMETER = 28;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.LiteralImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 6;

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
	int NUMERIC_LITERAL = 7;

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
	int NUMBER_LITERAL = 8;

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
	int GENERAL_LITERAL = 9;

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
	int BOOLEAN_LITERAL = 10;

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
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.TextLiteralImpl <em>Text Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.TextLiteralImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTextLiteral()
	 * @generated
	 */
	int TEXT_LITERAL = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL__VALUE = GENERAL_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_FEATURE_COUNT = GENERAL_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LITERAL_OPERATION_COUNT = GENERAL_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.NameLiteralImpl <em>Name Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.NameLiteralImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getNameLiteral()
	 * @generated
	 */
	int NAME_LITERAL = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LITERAL__VALUE = TEXT_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Name Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LITERAL_FEATURE_COUNT = TEXT_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Name Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LITERAL_OPERATION_COUNT = TEXT_LITERAL_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.TrialImpl <em>Trial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.TrialImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTrial()
	 * @generated
	 */
	int TRIAL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Stimuluslist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL__STIMULUSLIST = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.StimulusEventImpl <em>Stimulus Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.StimulusEventImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulusEvent()
	 * @generated
	 */
	int STIMULUS_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT__TIME = 0;

	/**
	 * The feature id for the '<em><b>Target button</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT__TARGET_BUTTON = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT__CODE = 2;

	/**
	 * The number of structural features of the '<em>Stimulus Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Stimulus Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.ListNodeImpl <em>List Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.ListNodeImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getListNode()
	 * @generated
	 */
	int LIST_NODE = 14;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_NODE__NEXT = 0;

	/**
	 * The number of structural features of the '<em>List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.StimulusListImpl <em>Stimulus List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.StimulusListImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulusList()
	 * @generated
	 */
	int STIMULUS_LIST = 15;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_LIST__NEXT = LIST_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_LIST__STIMULUS = LIST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stimulus List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_LIST_FEATURE_COUNT = LIST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stimulus List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_LIST_OPERATION_COUNT = LIST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.ScenarioObjectImpl <em>Scenario Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.ScenarioObjectImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getScenarioObject()
	 * @generated
	 */
	int SCENARIO_OBJECT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OBJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Scenario Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OBJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scenario Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OBJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.PicturePartImpl <em>Picture Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.PicturePartImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getPicturePart()
	 * @generated
	 */
	int PICTURE_PART = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_PART__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Picture Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_PART_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Picture Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_PART_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.Stimulus2DImpl <em>Stimulus2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.Stimulus2DImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulus2D()
	 * @generated
	 */
	int STIMULUS2_D = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS2_D__NAME = PICTURE_PART__NAME;

	/**
	 * The feature id for the '<em><b>Xcoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS2_D__XCOORDINATE = PICTURE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ycoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS2_D__YCOORDINATE = PICTURE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stimulus2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS2_D_FEATURE_COUNT = PICTURE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stimulus2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS2_D_OPERATION_COUNT = PICTURE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.BitmapImpl <em>Bitmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.BitmapImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBitmap()
	 * @generated
	 */
	int BITMAP = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP__NAME = STIMULUS2_D__NAME;

	/**
	 * The feature id for the '<em><b>Xcoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP__XCOORDINATE = STIMULUS2_D__XCOORDINATE;

	/**
	 * The feature id for the '<em><b>Ycoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP__YCOORDINATE = STIMULUS2_D__YCOORDINATE;

	/**
	 * The number of structural features of the '<em>Bitmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_FEATURE_COUNT = STIMULUS2_D_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bitmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_OPERATION_COUNT = STIMULUS2_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.TextImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = STIMULUS2_D__NAME;

	/**
	 * The feature id for the '<em><b>Xcoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__XCOORDINATE = STIMULUS2_D__XCOORDINATE;

	/**
	 * The feature id for the '<em><b>Ycoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__YCOORDINATE = STIMULUS2_D__YCOORDINATE;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = STIMULUS2_D_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = STIMULUS2_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.PictureImpl <em>Picture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.PictureImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getPicture()
	 * @generated
	 */
	int PICTURE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__NAME = SCENARIO_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Picturepart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__PICTUREPART = SCENARIO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_FEATURE_COUNT = SCENARIO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_OPERATION_COUNT = SCENARIO_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.BoxImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__NAME = STIMULUS2_D__NAME;

	/**
	 * The feature id for the '<em><b>Xcoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__XCOORDINATE = STIMULUS2_D__XCOORDINATE;

	/**
	 * The feature id for the '<em><b>Ycoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__YCOORDINATE = STIMULUS2_D__YCOORDINATE;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = STIMULUS2_D_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = STIMULUS2_D_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.HeaderParameterImpl <em>Header Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.HeaderParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getHeaderParameter()
	 * @generated
	 */
	int HEADER_PARAMETER = 25;

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
	 * The number of structural features of the '<em>SDL Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SDL Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active buttons</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS = HEADER_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Buttons Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_BUTTONS_PARAMETER_FEATURE_COUNT = HEADER_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Active Buttons Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_BUTTONS_PARAMETER_OPERATION_COUNT = HEADER_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Button codes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CODES_PARAMETER__BUTTON_CODES = HEADER_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Codes Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CODES_PARAMETER_FEATURE_COUNT = HEADER_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button Codes Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CODES_PARAMETER_OPERATION_COUNT = HEADER_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scenario name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_NAME_PARAMETER__SCENARIO_NAME = HEADER_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scenario Name Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_NAME_PARAMETER_FEATURE_COUNT = HEADER_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scenario Name Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_NAME_PARAMETER_OPERATION_COUNT = HEADER_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER__TIME = SDL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER_FEATURE_COUNT = SDL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER_OPERATION_COUNT = SDL_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target button</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_BUTTON_PARAMETER__TARGET_BUTTON = SDL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Button Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_BUTTON_PARAMETER_FEATURE_COUNT = SDL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Target Button Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_BUTTON_PARAMETER_OPERATION_COUNT = SDL_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PARAMETER__CODE = SDL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PARAMETER_FEATURE_COUNT = SDL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PARAMETER_OPERATION_COUNT = SDL_PARAMETER_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.Header#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.emftext.language.Presentation.Header#getParameter()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Parameter();

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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.SDL#getTrial <em>Trial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trial</em>'.
	 * @see org.emftext.language.Presentation.SDL#getTrial()
	 * @see #getSDL()
	 * @generated
	 */
	EReference getSDL_Trial();

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
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.HeaderParameter <em>Header Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Parameter</em>'.
	 * @see org.emftext.language.Presentation.HeaderParameter
	 * @generated
	 */
	EClass getHeaderParameter();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.SDLParameter <em>SDL Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDL Parameter</em>'.
	 * @see org.emftext.language.Presentation.SDLParameter
	 * @generated
	 */
	EClass getSDLParameter();

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
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.ScenarioNameParameter#getScenario_name <em>Scenario name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenario name</em>'.
	 * @see org.emftext.language.Presentation.ScenarioNameParameter#getScenario_name()
	 * @see #getScenarioNameParameter()
	 * @generated
	 */
	EReference getScenarioNameParameter_Scenario_name();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.TimeParameter <em>Time Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Parameter</em>'.
	 * @see org.emftext.language.Presentation.TimeParameter
	 * @generated
	 */
	EClass getTimeParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.TimeParameter#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.emftext.language.Presentation.TimeParameter#getTime()
	 * @see #getTimeParameter()
	 * @generated
	 */
	EReference getTimeParameter_Time();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.TargetButtonParameter <em>Target Button Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Button Parameter</em>'.
	 * @see org.emftext.language.Presentation.TargetButtonParameter
	 * @generated
	 */
	EClass getTargetButtonParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.TargetButtonParameter#getTarget_button <em>Target button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target button</em>'.
	 * @see org.emftext.language.Presentation.TargetButtonParameter#getTarget_button()
	 * @see #getTargetButtonParameter()
	 * @generated
	 */
	EReference getTargetButtonParameter_Target_button();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.CodeParameter <em>Code Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Parameter</em>'.
	 * @see org.emftext.language.Presentation.CodeParameter
	 * @generated
	 */
	EClass getCodeParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.CodeParameter#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.emftext.language.Presentation.CodeParameter#getCode()
	 * @see #getCodeParameter()
	 * @generated
	 */
	EReference getCodeParameter_Code();

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
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.ActiveButtonsParameter#getActive_buttons <em>Active buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active buttons</em>'.
	 * @see org.emftext.language.Presentation.ActiveButtonsParameter#getActive_buttons()
	 * @see #getActiveButtonsParameter()
	 * @generated
	 */
	EReference getActiveButtonsParameter_Active_buttons();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.ButtonCodesParameter <em>Button Codes Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Codes Parameter</em>'.
	 * @see org.emftext.language.Presentation.ButtonCodesParameter
	 * @generated
	 */
	EClass getButtonCodesParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.ButtonCodesParameter#getButton_codes <em>Button codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Button codes</em>'.
	 * @see org.emftext.language.Presentation.ButtonCodesParameter#getButton_codes()
	 * @see #getButtonCodesParameter()
	 * @generated
	 */
	EReference getButtonCodesParameter_Button_codes();

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
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Trial <em>Trial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trial</em>'.
	 * @see org.emftext.language.Presentation.Trial
	 * @generated
	 */
	EClass getTrial();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.Trial#getStimuluslist <em>Stimuluslist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stimuluslist</em>'.
	 * @see org.emftext.language.Presentation.Trial#getStimuluslist()
	 * @see #getTrial()
	 * @generated
	 */
	EReference getTrial_Stimuluslist();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.StimulusEvent <em>Stimulus Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus Event</em>'.
	 * @see org.emftext.language.Presentation.StimulusEvent
	 * @generated
	 */
	EClass getStimulusEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.StimulusEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.emftext.language.Presentation.StimulusEvent#getTime()
	 * @see #getStimulusEvent()
	 * @generated
	 */
	EReference getStimulusEvent_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.StimulusEvent#getTarget_button <em>Target button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target button</em>'.
	 * @see org.emftext.language.Presentation.StimulusEvent#getTarget_button()
	 * @see #getStimulusEvent()
	 * @generated
	 */
	EReference getStimulusEvent_Target_button();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.Presentation.StimulusEvent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see org.emftext.language.Presentation.StimulusEvent#getCode()
	 * @see #getStimulusEvent()
	 * @generated
	 */
	EReference getStimulusEvent_Code();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.ListNode <em>List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Node</em>'.
	 * @see org.emftext.language.Presentation.ListNode
	 * @generated
	 */
	EClass getListNode();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.Presentation.ListNode#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.emftext.language.Presentation.ListNode#getNext()
	 * @see #getListNode()
	 * @generated
	 */
	EReference getListNode_Next();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.StimulusList <em>Stimulus List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus List</em>'.
	 * @see org.emftext.language.Presentation.StimulusList
	 * @generated
	 */
	EClass getStimulusList();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.StimulusList#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stimulus</em>'.
	 * @see org.emftext.language.Presentation.StimulusList#getStimulus()
	 * @see #getStimulusList()
	 * @generated
	 */
	EReference getStimulusList_Stimulus();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.ScenarioObject <em>Scenario Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Object</em>'.
	 * @see org.emftext.language.Presentation.ScenarioObject
	 * @generated
	 */
	EClass getScenarioObject();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Bitmap <em>Bitmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitmap</em>'.
	 * @see org.emftext.language.Presentation.Bitmap
	 * @generated
	 */
	EClass getBitmap();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.emftext.language.Presentation.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Picture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picture</em>'.
	 * @see org.emftext.language.Presentation.Picture
	 * @generated
	 */
	EClass getPicture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.Picture#getPicturepart <em>Picturepart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Picturepart</em>'.
	 * @see org.emftext.language.Presentation.Picture#getPicturepart()
	 * @see #getPicture()
	 * @generated
	 */
	EReference getPicture_Picturepart();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.PicturePart <em>Picture Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picture Part</em>'.
	 * @see org.emftext.language.Presentation.PicturePart
	 * @generated
	 */
	EClass getPicturePart();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Stimulus2D <em>Stimulus2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus2 D</em>'.
	 * @see org.emftext.language.Presentation.Stimulus2D
	 * @generated
	 */
	EClass getStimulus2D();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.Presentation.Stimulus2D#getX_coordinate <em>Xcoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xcoordinate</em>'.
	 * @see org.emftext.language.Presentation.Stimulus2D#getX_coordinate()
	 * @see #getStimulus2D()
	 * @generated
	 */
	EAttribute getStimulus2D_X_coordinate();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.Presentation.Stimulus2D#getY_coordinate <em>Ycoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ycoordinate</em>'.
	 * @see org.emftext.language.Presentation.Stimulus2D#getY_coordinate()
	 * @see #getStimulus2D()
	 * @generated
	 */
	EAttribute getStimulus2D_Y_coordinate();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see org.emftext.language.Presentation.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.TextLiteral <em>Text Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Literal</em>'.
	 * @see org.emftext.language.Presentation.TextLiteral
	 * @generated
	 */
	EClass getTextLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.Presentation.TextLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.Presentation.TextLiteral#getValue()
	 * @see #getTextLiteral()
	 * @generated
	 */
	EAttribute getTextLiteral_Value();

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
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__PARAMETER = eINSTANCE.getHeader_Parameter();

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
		 * The meta object literal for the '<em><b>Trial</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL__TRIAL = eINSTANCE.getSDL_Trial();

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
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.HeaderParameterImpl <em>Header Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.HeaderParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getHeaderParameter()
		 * @generated
		 */
		EClass HEADER_PARAMETER = eINSTANCE.getHeaderParameter();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.SDLParameterImpl <em>SDL Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.SDLParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getSDLParameter()
		 * @generated
		 */
		EClass SDL_PARAMETER = eINSTANCE.getSDLParameter();

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
		 * The meta object literal for the '<em><b>Scenario name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_NAME_PARAMETER__SCENARIO_NAME = eINSTANCE.getScenarioNameParameter_Scenario_name();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.TimeParameterImpl <em>Time Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.TimeParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTimeParameter()
		 * @generated
		 */
		EClass TIME_PARAMETER = eINSTANCE.getTimeParameter();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETER__TIME = eINSTANCE.getTimeParameter_Time();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.TargetButtonParameterImpl <em>Target Button Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.TargetButtonParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTargetButtonParameter()
		 * @generated
		 */
		EClass TARGET_BUTTON_PARAMETER = eINSTANCE.getTargetButtonParameter();

		/**
		 * The meta object literal for the '<em><b>Target button</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_BUTTON_PARAMETER__TARGET_BUTTON = eINSTANCE.getTargetButtonParameter_Target_button();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.CodeParameterImpl <em>Code Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.CodeParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getCodeParameter()
		 * @generated
		 */
		EClass CODE_PARAMETER = eINSTANCE.getCodeParameter();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_PARAMETER__CODE = eINSTANCE.getCodeParameter_Code();

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
		 * The meta object literal for the '<em><b>Active buttons</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS = eINSTANCE.getActiveButtonsParameter_Active_buttons();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.ButtonCodesParameterImpl <em>Button Codes Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.ButtonCodesParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getButtonCodesParameter()
		 * @generated
		 */
		EClass BUTTON_CODES_PARAMETER = eINSTANCE.getButtonCodesParameter();

		/**
		 * The meta object literal for the '<em><b>Button codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_CODES_PARAMETER__BUTTON_CODES = eINSTANCE.getButtonCodesParameter_Button_codes();

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
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.TrialImpl <em>Trial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.TrialImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTrial()
		 * @generated
		 */
		EClass TRIAL = eINSTANCE.getTrial();

		/**
		 * The meta object literal for the '<em><b>Stimuluslist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIAL__STIMULUSLIST = eINSTANCE.getTrial_Stimuluslist();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.StimulusEventImpl <em>Stimulus Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.StimulusEventImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulusEvent()
		 * @generated
		 */
		EClass STIMULUS_EVENT = eINSTANCE.getStimulusEvent();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS_EVENT__TIME = eINSTANCE.getStimulusEvent_Time();

		/**
		 * The meta object literal for the '<em><b>Target button</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS_EVENT__TARGET_BUTTON = eINSTANCE.getStimulusEvent_Target_button();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS_EVENT__CODE = eINSTANCE.getStimulusEvent_Code();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.ListNodeImpl <em>List Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.ListNodeImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getListNode()
		 * @generated
		 */
		EClass LIST_NODE = eINSTANCE.getListNode();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_NODE__NEXT = eINSTANCE.getListNode_Next();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.StimulusListImpl <em>Stimulus List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.StimulusListImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulusList()
		 * @generated
		 */
		EClass STIMULUS_LIST = eINSTANCE.getStimulusList();

		/**
		 * The meta object literal for the '<em><b>Stimulus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS_LIST__STIMULUS = eINSTANCE.getStimulusList_Stimulus();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.ScenarioObjectImpl <em>Scenario Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.ScenarioObjectImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getScenarioObject()
		 * @generated
		 */
		EClass SCENARIO_OBJECT = eINSTANCE.getScenarioObject();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.BitmapImpl <em>Bitmap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.BitmapImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBitmap()
		 * @generated
		 */
		EClass BITMAP = eINSTANCE.getBitmap();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.TextImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.PictureImpl <em>Picture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.PictureImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getPicture()
		 * @generated
		 */
		EClass PICTURE = eINSTANCE.getPicture();

		/**
		 * The meta object literal for the '<em><b>Picturepart</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICTURE__PICTUREPART = eINSTANCE.getPicture_Picturepart();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.PicturePartImpl <em>Picture Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.PicturePartImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getPicturePart()
		 * @generated
		 */
		EClass PICTURE_PART = eINSTANCE.getPicturePart();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.Stimulus2DImpl <em>Stimulus2 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.Stimulus2DImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulus2D()
		 * @generated
		 */
		EClass STIMULUS2_D = eINSTANCE.getStimulus2D();

		/**
		 * The meta object literal for the '<em><b>Xcoordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STIMULUS2_D__XCOORDINATE = eINSTANCE.getStimulus2D_X_coordinate();

		/**
		 * The meta object literal for the '<em><b>Ycoordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STIMULUS2_D__YCOORDINATE = eINSTANCE.getStimulus2D_Y_coordinate();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.BoxImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBox()
		 * @generated
		 */
		EClass BOX = eINSTANCE.getBox();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.TextLiteralImpl <em>Text Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.TextLiteralImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTextLiteral()
		 * @generated
		 */
		EClass TEXT_LITERAL = eINSTANCE.getTextLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_LITERAL__VALUE = eINSTANCE.getTextLiteral_Value();

	}

} //PresentationPackage
