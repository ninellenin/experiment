/**
 */
package org.emftext.language.Presentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Scenario object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDL__SCENARIO_OBJECT = SCENARIO_FILE_FEATURE_COUNT + 0;

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
	int PARAMETER = 23;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.ScenarioNameParameterImpl <em>Scenario Name Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.ScenarioNameParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getScenarioNameParameter()
	 * @generated
	 */
	int SCENARIO_NAME_PARAMETER = 28;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.TimeParameterImpl <em>Time Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.TimeParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTimeParameter()
	 * @generated
	 */
	int TIME_PARAMETER = 29;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.TargetButtonParameterImpl <em>Target Button Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.TargetButtonParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTargetButtonParameter()
	 * @generated
	 */
	int TARGET_BUTTON_PARAMETER = 30;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.CodeParameterImpl <em>Code Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.CodeParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getCodeParameter()
	 * @generated
	 */
	int CODE_PARAMETER = 31;

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
	int ACTIVE_BUTTONS_PARAMETER = 26;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.ButtonCodesParameterImpl <em>Button Codes Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.ButtonCodesParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getButtonCodesParameter()
	 * @generated
	 */
	int BUTTON_CODES_PARAMETER = 27;

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
	int TEXT_LITERAL = 22;

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
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.StimulusEventImpl <em>Stimulus Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.StimulusEventImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulusEvent()
	 * @generated
	 */
	int STIMULUS_EVENT = 13;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.StimulusListImpl <em>Stimulus List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.StimulusListImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulusList()
	 * @generated
	 */
	int STIMULUS_LIST = 14;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.ScenarioObjectImpl <em>Scenario Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.ScenarioObjectImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getScenarioObject()
	 * @generated
	 */
	int SCENARIO_OBJECT = 15;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL__NAME = SCENARIO_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Stimulus list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL__STIMULUS_LIST = SCENARIO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trial parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL__TRIAL_PARAMETER = SCENARIO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL_FEATURE_COUNT = SCENARIO_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL_OPERATION_COUNT = SCENARIO_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT__NAME = SCENARIO_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Stimulus event parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT__STIMULUS_EVENT_PARAMETER = SCENARIO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stimulus Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT_FEATURE_COUNT = SCENARIO_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stimulus Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT_OPERATION_COUNT = SCENARIO_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stimulus event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_LIST__STIMULUS_EVENT = 0;

	/**
	 * The number of structural features of the '<em>Stimulus List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stimulus List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.Graphic2DImpl <em>Graphic2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.Graphic2DImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getGraphic2D()
	 * @generated
	 */
	int GRAPHIC2_D = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D__NAME = SCENARIO_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Graphic2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D_FEATURE_COUNT = SCENARIO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graphic2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC2_D_OPERATION_COUNT = SCENARIO_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.PicturePartImpl <em>Picture Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.PicturePartImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getPicturePart()
	 * @generated
	 */
	int PICTURE_PART = 19;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.Stimulus2DImpl <em>Stimulus2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.Stimulus2DImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulus2D()
	 * @generated
	 */
	int STIMULUS2_D = 20;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.BitmapImpl <em>Bitmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.BitmapImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBitmap()
	 * @generated
	 */
	int BITMAP = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP__NAME = GRAPHIC2_D__NAME;

	/**
	 * The feature id for the '<em><b>Filename parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP__FILENAME_PARAMETER = GRAPHIC2_D_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bitmap parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP__BITMAP_PARAMETERS = GRAPHIC2_D_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bitmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_FEATURE_COUNT = GRAPHIC2_D_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bitmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_OPERATION_COUNT = GRAPHIC2_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.TextImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = GRAPHIC2_D__NAME;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CAPTION = GRAPHIC2_D_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_PARAMETER = GRAPHIC2_D_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = GRAPHIC2_D_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = GRAPHIC2_D_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.PictureStimulusEventImpl <em>Picture Stimulus Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.PictureStimulusEventImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getPictureStimulusEvent()
	 * @generated
	 */
	int PICTURE_STIMULUS_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_STIMULUS_EVENT__NAME = STIMULUS_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Stimulus event parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_STIMULUS_EVENT__STIMULUS_EVENT_PARAMETER = STIMULUS_EVENT__STIMULUS_EVENT_PARAMETER;

	/**
	 * The feature id for the '<em><b>Picture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_STIMULUS_EVENT__PICTURE = STIMULUS_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Picture Stimulus Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_STIMULUS_EVENT_FEATURE_COUNT = STIMULUS_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Picture Stimulus Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_STIMULUS_EVENT_OPERATION_COUNT = STIMULUS_EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_PART__NAME = SCENARIO_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Picture Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_PART_FEATURE_COUNT = SCENARIO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Picture Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_PART_OPERATION_COUNT = SCENARIO_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS2_D__NAME = PICTURE_PART__NAME;

	/**
	 * The feature id for the '<em><b>Xdefinition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS2_D__XDEFINITION = PICTURE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ydefinition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS2_D__YDEFINITION = PICTURE_PART_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.PictureImpl <em>Picture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.PictureImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getPicture()
	 * @generated
	 */
	int PICTURE = 36;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.SoundImpl <em>Sound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.SoundImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getSound()
	 * @generated
	 */
	int SOUND = 37;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.TrialParameterImpl <em>Trial Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.TrialParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTrialParameter()
	 * @generated
	 */
	int TRIAL_PARAMETER = 38;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.BitmapStimulusImpl <em>Bitmap Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.BitmapStimulusImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBitmapStimulus()
	 * @generated
	 */
	int BITMAP_STIMULUS = 41;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.BoxStimulusImpl <em>Box Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.BoxStimulusImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBoxStimulus()
	 * @generated
	 */
	int BOX_STIMULUS = 42;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.TextStimulusImpl <em>Text Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.TextStimulusImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTextStimulus()
	 * @generated
	 */
	int TEXT_STIMULUS = 43;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.CoordinateDefinitionImpl <em>Coordinate Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.CoordinateDefinitionImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getCoordinateDefinition()
	 * @generated
	 */
	int COORDINATE_DEFINITION = 44;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.CoordinateType <em>Coordinate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.CoordinateType
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getCoordinateType()
	 * @generated
	 */
	int COORDINATE_TYPE = 48;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.BoxImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__NAME = GRAPHIC2_D__NAME;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = GRAPHIC2_D_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = GRAPHIC2_D_OPERATION_COUNT + 0;

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
	int HEADER_PARAMETER = 24;

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
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.StimulusEventParameterImpl <em>Stimulus Event Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.StimulusEventParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulusEventParameter()
	 * @generated
	 */
	int STIMULUS_EVENT_PARAMETER = 25;

	/**
	 * The number of structural features of the '<em>Stimulus Event Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stimulus Event Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL = HEADER_PARAMETER_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Number literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CODES_PARAMETER__NUMBER_LITERAL = HEADER_PARAMETER_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Name literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_NAME_PARAMETER__NAME_LITERAL = HEADER_PARAMETER_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Number literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER__NUMBER_LITERAL = STIMULUS_EVENT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER_FEATURE_COUNT = STIMULUS_EVENT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER_OPERATION_COUNT = STIMULUS_EVENT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_BUTTON_PARAMETER__NUMBER_LITERAL = STIMULUS_EVENT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Button Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_BUTTON_PARAMETER_FEATURE_COUNT = STIMULUS_EVENT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Target Button Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_BUTTON_PARAMETER_OPERATION_COUNT = STIMULUS_EVENT_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PARAMETER__TEXT_LITERAL = STIMULUS_EVENT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PARAMETER_FEATURE_COUNT = STIMULUS_EVENT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PARAMETER_OPERATION_COUNT = STIMULUS_EVENT_PARAMETER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.PictureParameterImpl <em>Picture Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.PictureParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getPictureParameter()
	 * @generated
	 */
	int PICTURE_PARAMETER = 32;

	/**
	 * The number of structural features of the '<em>Picture Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Picture Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.BackgroundColorParameterImpl <em>Background Color Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.BackgroundColorParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBackgroundColorParameter()
	 * @generated
	 */
	int BACKGROUND_COLOR_PARAMETER = 33;

	/**
	 * The feature id for the '<em><b>Number literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_COLOR_PARAMETER__NUMBER_LITERAL = PICTURE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Background Color Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_COLOR_PARAMETER_FEATURE_COUNT = PICTURE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Background Color Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_COLOR_PARAMETER_OPERATION_COUNT = PICTURE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.TextParameterImpl <em>Text Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.TextParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTextParameter()
	 * @generated
	 */
	int TEXT_PARAMETER = 34;

	/**
	 * The number of structural features of the '<em>Text Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.CaptionParameterImpl <em>Caption Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.CaptionParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getCaptionParameter()
	 * @generated
	 */
	int CAPTION_PARAMETER = 35;

	/**
	 * The feature id for the '<em><b>Text literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_PARAMETER__TEXT_LITERAL = TEXT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Caption Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_PARAMETER_FEATURE_COUNT = TEXT_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Caption Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_PARAMETER_OPERATION_COUNT = TEXT_PARAMETER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.StimulusImpl <em>Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.StimulusImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulus()
	 * @generated
	 */
	int STIMULUS = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__NAME = SCENARIO_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_FEATURE_COUNT = SCENARIO_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_OPERATION_COUNT = SCENARIO_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__NAME = STIMULUS__NAME;

	/**
	 * The feature id for the '<em><b>Picture part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__PICTURE_PART = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Picture parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__PICTURE_PARAMETER = STIMULUS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND__NAME = STIMULUS__NAME;

	/**
	 * The number of structural features of the '<em>Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trial Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trial Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_STIMULUS__NAME = STIMULUS2_D__NAME;

	/**
	 * The feature id for the '<em><b>Xdefinition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_STIMULUS__XDEFINITION = STIMULUS2_D__XDEFINITION;

	/**
	 * The feature id for the '<em><b>Ydefinition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_STIMULUS__YDEFINITION = STIMULUS2_D__YDEFINITION;

	/**
	 * The feature id for the '<em><b>Bitmap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_STIMULUS__BITMAP = STIMULUS2_D_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bitmap Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_STIMULUS_FEATURE_COUNT = STIMULUS2_D_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bitmap Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_STIMULUS_OPERATION_COUNT = STIMULUS2_D_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_STIMULUS__NAME = STIMULUS2_D__NAME;

	/**
	 * The feature id for the '<em><b>Xdefinition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_STIMULUS__XDEFINITION = STIMULUS2_D__XDEFINITION;

	/**
	 * The feature id for the '<em><b>Ydefinition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_STIMULUS__YDEFINITION = STIMULUS2_D__YDEFINITION;

	/**
	 * The feature id for the '<em><b>Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_STIMULUS__BOX = STIMULUS2_D_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Box Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_STIMULUS_FEATURE_COUNT = STIMULUS2_D_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Box Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_STIMULUS_OPERATION_COUNT = STIMULUS2_D_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STIMULUS__NAME = STIMULUS2_D__NAME;

	/**
	 * The feature id for the '<em><b>Xdefinition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STIMULUS__XDEFINITION = STIMULUS2_D__XDEFINITION;

	/**
	 * The feature id for the '<em><b>Ydefinition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STIMULUS__YDEFINITION = STIMULUS2_D__YDEFINITION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STIMULUS__TEXT = STIMULUS2_D_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STIMULUS_FEATURE_COUNT = STIMULUS2_D_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STIMULUS_OPERATION_COUNT = STIMULUS2_D_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_DEFINITION__COORDINATE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_DEFINITION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Right bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_DEFINITION__RIGHT_BOTTOM = 2;

	/**
	 * The number of structural features of the '<em>Coordinate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Coordinate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.BitmapParameterImpl <em>Bitmap Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.BitmapParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBitmapParameter()
	 * @generated
	 */
	int BITMAP_PARAMETER = 45;

	/**
	 * The number of structural features of the '<em>Bitmap Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Bitmap Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.FilenameParameterImpl <em>Filename Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.FilenameParameterImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getFilenameParameter()
	 * @generated
	 */
	int FILENAME_PARAMETER = 46;

	/**
	 * The feature id for the '<em><b>Filename literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILENAME_PARAMETER__FILENAME_LITERAL = BITMAP_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filename Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILENAME_PARAMETER_FEATURE_COUNT = BITMAP_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filename Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILENAME_PARAMETER_OPERATION_COUNT = BITMAP_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.Presentation.impl.FilenameLiteralImpl <em>Filename Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.Presentation.impl.FilenameLiteralImpl
	 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getFilenameLiteral()
	 * @generated
	 */
	int FILENAME_LITERAL = 47;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILENAME_LITERAL__VALUE = TEXT_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Filename Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILENAME_LITERAL_FEATURE_COUNT = TEXT_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Filename Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILENAME_LITERAL_OPERATION_COUNT = TEXT_LITERAL_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.SDL#getScenario_object <em>Scenario object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario object</em>'.
	 * @see org.emftext.language.Presentation.SDL#getScenario_object()
	 * @see #getSDL()
	 * @generated
	 */
	EReference getSDL_Scenario_object();

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
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.StimulusEventParameter <em>Stimulus Event Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus Event Parameter</em>'.
	 * @see org.emftext.language.Presentation.StimulusEventParameter
	 * @generated
	 */
	EClass getStimulusEventParameter();

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
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.ScenarioNameParameter#getName_literal <em>Name literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name literal</em>'.
	 * @see org.emftext.language.Presentation.ScenarioNameParameter#getName_literal()
	 * @see #getScenarioNameParameter()
	 * @generated
	 */
	EReference getScenarioNameParameter_Name_literal();

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
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.TimeParameter#getNumber_literal <em>Number literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number literal</em>'.
	 * @see org.emftext.language.Presentation.TimeParameter#getNumber_literal()
	 * @see #getTimeParameter()
	 * @generated
	 */
	EReference getTimeParameter_Number_literal();

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
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.TargetButtonParameter#getNumber_literal <em>Number literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number literal</em>'.
	 * @see org.emftext.language.Presentation.TargetButtonParameter#getNumber_literal()
	 * @see #getTargetButtonParameter()
	 * @generated
	 */
	EReference getTargetButtonParameter_Number_literal();

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
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.CodeParameter#getText_literal <em>Text literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text literal</em>'.
	 * @see org.emftext.language.Presentation.CodeParameter#getText_literal()
	 * @see #getCodeParameter()
	 * @generated
	 */
	EReference getCodeParameter_Text_literal();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.PictureParameter <em>Picture Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picture Parameter</em>'.
	 * @see org.emftext.language.Presentation.PictureParameter
	 * @generated
	 */
	EClass getPictureParameter();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.BackgroundColorParameter <em>Background Color Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background Color Parameter</em>'.
	 * @see org.emftext.language.Presentation.BackgroundColorParameter
	 * @generated
	 */
	EClass getBackgroundColorParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.BackgroundColorParameter#getNumber_literal <em>Number literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Number literal</em>'.
	 * @see org.emftext.language.Presentation.BackgroundColorParameter#getNumber_literal()
	 * @see #getBackgroundColorParameter()
	 * @generated
	 */
	EReference getBackgroundColorParameter_Number_literal();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.TextParameter <em>Text Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Parameter</em>'.
	 * @see org.emftext.language.Presentation.TextParameter
	 * @generated
	 */
	EClass getTextParameter();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.CaptionParameter <em>Caption Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caption Parameter</em>'.
	 * @see org.emftext.language.Presentation.CaptionParameter
	 * @generated
	 */
	EClass getCaptionParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.CaptionParameter#getText_literal <em>Text literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text literal</em>'.
	 * @see org.emftext.language.Presentation.CaptionParameter#getText_literal()
	 * @see #getCaptionParameter()
	 * @generated
	 */
	EReference getCaptionParameter_Text_literal();

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
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.ActiveButtonsParameter#getNumber_literal <em>Number literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number literal</em>'.
	 * @see org.emftext.language.Presentation.ActiveButtonsParameter#getNumber_literal()
	 * @see #getActiveButtonsParameter()
	 * @generated
	 */
	EReference getActiveButtonsParameter_Number_literal();

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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.ButtonCodesParameter#getNumber_literal <em>Number literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Number literal</em>'.
	 * @see org.emftext.language.Presentation.ButtonCodesParameter#getNumber_literal()
	 * @see #getButtonCodesParameter()
	 * @generated
	 */
	EReference getButtonCodesParameter_Number_literal();

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
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.Trial#getStimulus_list <em>Stimulus list</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stimulus list</em>'.
	 * @see org.emftext.language.Presentation.Trial#getStimulus_list()
	 * @see #getTrial()
	 * @generated
	 */
	EReference getTrial_Stimulus_list();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.Trial#getTrial_parameter <em>Trial parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trial parameter</em>'.
	 * @see org.emftext.language.Presentation.Trial#getTrial_parameter()
	 * @see #getTrial()
	 * @generated
	 */
	EReference getTrial_Trial_parameter();

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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.StimulusEvent#getStimulus_event_parameter <em>Stimulus event parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stimulus event parameter</em>'.
	 * @see org.emftext.language.Presentation.StimulusEvent#getStimulus_event_parameter()
	 * @see #getStimulusEvent()
	 * @generated
	 */
	EReference getStimulusEvent_Stimulus_event_parameter();

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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.StimulusList#getStimulus_event <em>Stimulus event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stimulus event</em>'.
	 * @see org.emftext.language.Presentation.StimulusList#getStimulus_event()
	 * @see #getStimulusList()
	 * @generated
	 */
	EReference getStimulusList_Stimulus_event();

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
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.Bitmap#getFilename_parameter <em>Filename parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filename parameter</em>'.
	 * @see org.emftext.language.Presentation.Bitmap#getFilename_parameter()
	 * @see #getBitmap()
	 * @generated
	 */
	EReference getBitmap_Filename_parameter();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftext.language.Presentation.Bitmap#getBitmap_parameters <em>Bitmap parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bitmap parameters</em>'.
	 * @see org.emftext.language.Presentation.Bitmap#getBitmap_parameters()
	 * @see #getBitmap()
	 * @generated
	 */
	EAttribute getBitmap_Bitmap_parameters();

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
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.Text#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see org.emftext.language.Presentation.Text#getCaption()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.Text#getText_parameter <em>Text parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text parameter</em>'.
	 * @see org.emftext.language.Presentation.Text#getText_parameter()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Text_parameter();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.PictureStimulusEvent <em>Picture Stimulus Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picture Stimulus Event</em>'.
	 * @see org.emftext.language.Presentation.PictureStimulusEvent
	 * @generated
	 */
	EClass getPictureStimulusEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.PictureStimulusEvent#getPicture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Picture</em>'.
	 * @see org.emftext.language.Presentation.PictureStimulusEvent#getPicture()
	 * @see #getPictureStimulusEvent()
	 * @generated
	 */
	EReference getPictureStimulusEvent_Picture();

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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.Picture#getPicture_part <em>Picture part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Picture part</em>'.
	 * @see org.emftext.language.Presentation.Picture#getPicture_part()
	 * @see #getPicture()
	 * @generated
	 */
	EReference getPicture_Picture_part();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.Presentation.Picture#getPicture_parameter <em>Picture parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Picture parameter</em>'.
	 * @see org.emftext.language.Presentation.Picture#getPicture_parameter()
	 * @see #getPicture()
	 * @generated
	 */
	EReference getPicture_Picture_parameter();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Sound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound</em>'.
	 * @see org.emftext.language.Presentation.Sound
	 * @generated
	 */
	EClass getSound();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.TrialParameter <em>Trial Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trial Parameter</em>'.
	 * @see org.emftext.language.Presentation.TrialParameter
	 * @generated
	 */
	EClass getTrialParameter();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Stimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus</em>'.
	 * @see org.emftext.language.Presentation.Stimulus
	 * @generated
	 */
	EClass getStimulus();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.Graphic2D <em>Graphic2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic2 D</em>'.
	 * @see org.emftext.language.Presentation.Graphic2D
	 * @generated
	 */
	EClass getGraphic2D();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.BitmapStimulus <em>Bitmap Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitmap Stimulus</em>'.
	 * @see org.emftext.language.Presentation.BitmapStimulus
	 * @generated
	 */
	EClass getBitmapStimulus();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.BitmapStimulus#getBitmap <em>Bitmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bitmap</em>'.
	 * @see org.emftext.language.Presentation.BitmapStimulus#getBitmap()
	 * @see #getBitmapStimulus()
	 * @generated
	 */
	EReference getBitmapStimulus_Bitmap();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.BoxStimulus <em>Box Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box Stimulus</em>'.
	 * @see org.emftext.language.Presentation.BoxStimulus
	 * @generated
	 */
	EClass getBoxStimulus();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.BoxStimulus#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Box</em>'.
	 * @see org.emftext.language.Presentation.BoxStimulus#getBox()
	 * @see #getBoxStimulus()
	 * @generated
	 */
	EReference getBoxStimulus_Box();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.TextStimulus <em>Text Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Stimulus</em>'.
	 * @see org.emftext.language.Presentation.TextStimulus
	 * @generated
	 */
	EClass getTextStimulus();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.TextStimulus#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.emftext.language.Presentation.TextStimulus#getText()
	 * @see #getTextStimulus()
	 * @generated
	 */
	EReference getTextStimulus_Text();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.CoordinateDefinition <em>Coordinate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate Definition</em>'.
	 * @see org.emftext.language.Presentation.CoordinateDefinition
	 * @generated
	 */
	EClass getCoordinateDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.Presentation.CoordinateDefinition#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinate</em>'.
	 * @see org.emftext.language.Presentation.CoordinateDefinition#getCoordinate()
	 * @see #getCoordinateDefinition()
	 * @generated
	 */
	EAttribute getCoordinateDefinition_Coordinate();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.Presentation.CoordinateDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emftext.language.Presentation.CoordinateDefinition#getType()
	 * @see #getCoordinateDefinition()
	 * @generated
	 */
	EAttribute getCoordinateDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.Presentation.CoordinateDefinition#getRight_bottom <em>Right bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right bottom</em>'.
	 * @see org.emftext.language.Presentation.CoordinateDefinition#getRight_bottom()
	 * @see #getCoordinateDefinition()
	 * @generated
	 */
	EAttribute getCoordinateDefinition_Right_bottom();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.BitmapParameter <em>Bitmap Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitmap Parameter</em>'.
	 * @see org.emftext.language.Presentation.BitmapParameter
	 * @generated
	 */
	EClass getBitmapParameter();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.FilenameParameter <em>Filename Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filename Parameter</em>'.
	 * @see org.emftext.language.Presentation.FilenameParameter
	 * @generated
	 */
	EClass getFilenameParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.FilenameParameter#getFilename_literal <em>Filename literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filename literal</em>'.
	 * @see org.emftext.language.Presentation.FilenameParameter#getFilename_literal()
	 * @see #getFilenameParameter()
	 * @generated
	 */
	EReference getFilenameParameter_Filename_literal();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.Presentation.FilenameLiteral <em>Filename Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filename Literal</em>'.
	 * @see org.emftext.language.Presentation.FilenameLiteral
	 * @generated
	 */
	EClass getFilenameLiteral();

	/**
	 * Returns the meta object for enum '{@link org.emftext.language.Presentation.CoordinateType <em>Coordinate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coordinate Type</em>'.
	 * @see org.emftext.language.Presentation.CoordinateType
	 * @generated
	 */
	EEnum getCoordinateType();

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
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.Stimulus2D#getX_definition <em>Xdefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xdefinition</em>'.
	 * @see org.emftext.language.Presentation.Stimulus2D#getX_definition()
	 * @see #getStimulus2D()
	 * @generated
	 */
	EReference getStimulus2D_X_definition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.Presentation.Stimulus2D#getY_definition <em>Ydefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ydefinition</em>'.
	 * @see org.emftext.language.Presentation.Stimulus2D#getY_definition()
	 * @see #getStimulus2D()
	 * @generated
	 */
	EReference getStimulus2D_Y_definition();

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
		 * The meta object literal for the '<em><b>Scenario object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDL__SCENARIO_OBJECT = eINSTANCE.getSDL_Scenario_object();

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
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.StimulusEventParameterImpl <em>Stimulus Event Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.StimulusEventParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulusEventParameter()
		 * @generated
		 */
		EClass STIMULUS_EVENT_PARAMETER = eINSTANCE.getStimulusEventParameter();

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
		 * The meta object literal for the '<em><b>Name literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_NAME_PARAMETER__NAME_LITERAL = eINSTANCE.getScenarioNameParameter_Name_literal();

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
		 * The meta object literal for the '<em><b>Number literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETER__NUMBER_LITERAL = eINSTANCE.getTimeParameter_Number_literal();

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
		 * The meta object literal for the '<em><b>Number literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_BUTTON_PARAMETER__NUMBER_LITERAL = eINSTANCE.getTargetButtonParameter_Number_literal();

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
		 * The meta object literal for the '<em><b>Text literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_PARAMETER__TEXT_LITERAL = eINSTANCE.getCodeParameter_Text_literal();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.PictureParameterImpl <em>Picture Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.PictureParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getPictureParameter()
		 * @generated
		 */
		EClass PICTURE_PARAMETER = eINSTANCE.getPictureParameter();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.BackgroundColorParameterImpl <em>Background Color Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.BackgroundColorParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBackgroundColorParameter()
		 * @generated
		 */
		EClass BACKGROUND_COLOR_PARAMETER = eINSTANCE.getBackgroundColorParameter();

		/**
		 * The meta object literal for the '<em><b>Number literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND_COLOR_PARAMETER__NUMBER_LITERAL = eINSTANCE.getBackgroundColorParameter_Number_literal();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.TextParameterImpl <em>Text Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.TextParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTextParameter()
		 * @generated
		 */
		EClass TEXT_PARAMETER = eINSTANCE.getTextParameter();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.CaptionParameterImpl <em>Caption Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.CaptionParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getCaptionParameter()
		 * @generated
		 */
		EClass CAPTION_PARAMETER = eINSTANCE.getCaptionParameter();

		/**
		 * The meta object literal for the '<em><b>Text literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPTION_PARAMETER__TEXT_LITERAL = eINSTANCE.getCaptionParameter_Text_literal();

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
		 * The meta object literal for the '<em><b>Number literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL = eINSTANCE.getActiveButtonsParameter_Number_literal();

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
		 * The meta object literal for the '<em><b>Number literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_CODES_PARAMETER__NUMBER_LITERAL = eINSTANCE.getButtonCodesParameter_Number_literal();

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
		 * The meta object literal for the '<em><b>Stimulus list</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIAL__STIMULUS_LIST = eINSTANCE.getTrial_Stimulus_list();

		/**
		 * The meta object literal for the '<em><b>Trial parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIAL__TRIAL_PARAMETER = eINSTANCE.getTrial_Trial_parameter();

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
		 * The meta object literal for the '<em><b>Stimulus event parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS_EVENT__STIMULUS_EVENT_PARAMETER = eINSTANCE.getStimulusEvent_Stimulus_event_parameter();

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
		 * The meta object literal for the '<em><b>Stimulus event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS_LIST__STIMULUS_EVENT = eINSTANCE.getStimulusList_Stimulus_event();

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
		 * The meta object literal for the '<em><b>Filename parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BITMAP__FILENAME_PARAMETER = eINSTANCE.getBitmap_Filename_parameter();

		/**
		 * The meta object literal for the '<em><b>Bitmap parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP__BITMAP_PARAMETERS = eINSTANCE.getBitmap_Bitmap_parameters();

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
		 * The meta object literal for the '<em><b>Caption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__CAPTION = eINSTANCE.getText_Caption();

		/**
		 * The meta object literal for the '<em><b>Text parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__TEXT_PARAMETER = eINSTANCE.getText_Text_parameter();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.PictureStimulusEventImpl <em>Picture Stimulus Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.PictureStimulusEventImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getPictureStimulusEvent()
		 * @generated
		 */
		EClass PICTURE_STIMULUS_EVENT = eINSTANCE.getPictureStimulusEvent();

		/**
		 * The meta object literal for the '<em><b>Picture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICTURE_STIMULUS_EVENT__PICTURE = eINSTANCE.getPictureStimulusEvent_Picture();

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
		 * The meta object literal for the '<em><b>Picture part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICTURE__PICTURE_PART = eINSTANCE.getPicture_Picture_part();

		/**
		 * The meta object literal for the '<em><b>Picture parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICTURE__PICTURE_PARAMETER = eINSTANCE.getPicture_Picture_parameter();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.SoundImpl <em>Sound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.SoundImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getSound()
		 * @generated
		 */
		EClass SOUND = eINSTANCE.getSound();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.TrialParameterImpl <em>Trial Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.TrialParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTrialParameter()
		 * @generated
		 */
		EClass TRIAL_PARAMETER = eINSTANCE.getTrialParameter();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.StimulusImpl <em>Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.StimulusImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getStimulus()
		 * @generated
		 */
		EClass STIMULUS = eINSTANCE.getStimulus();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.Graphic2DImpl <em>Graphic2 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.Graphic2DImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getGraphic2D()
		 * @generated
		 */
		EClass GRAPHIC2_D = eINSTANCE.getGraphic2D();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.BitmapStimulusImpl <em>Bitmap Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.BitmapStimulusImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBitmapStimulus()
		 * @generated
		 */
		EClass BITMAP_STIMULUS = eINSTANCE.getBitmapStimulus();

		/**
		 * The meta object literal for the '<em><b>Bitmap</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BITMAP_STIMULUS__BITMAP = eINSTANCE.getBitmapStimulus_Bitmap();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.BoxStimulusImpl <em>Box Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.BoxStimulusImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBoxStimulus()
		 * @generated
		 */
		EClass BOX_STIMULUS = eINSTANCE.getBoxStimulus();

		/**
		 * The meta object literal for the '<em><b>Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX_STIMULUS__BOX = eINSTANCE.getBoxStimulus_Box();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.TextStimulusImpl <em>Text Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.TextStimulusImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getTextStimulus()
		 * @generated
		 */
		EClass TEXT_STIMULUS = eINSTANCE.getTextStimulus();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_STIMULUS__TEXT = eINSTANCE.getTextStimulus_Text();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.CoordinateDefinitionImpl <em>Coordinate Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.CoordinateDefinitionImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getCoordinateDefinition()
		 * @generated
		 */
		EClass COORDINATE_DEFINITION = eINSTANCE.getCoordinateDefinition();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE_DEFINITION__COORDINATE = eINSTANCE.getCoordinateDefinition_Coordinate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE_DEFINITION__TYPE = eINSTANCE.getCoordinateDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Right bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE_DEFINITION__RIGHT_BOTTOM = eINSTANCE.getCoordinateDefinition_Right_bottom();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.BitmapParameterImpl <em>Bitmap Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.BitmapParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getBitmapParameter()
		 * @generated
		 */
		EClass BITMAP_PARAMETER = eINSTANCE.getBitmapParameter();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.FilenameParameterImpl <em>Filename Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.FilenameParameterImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getFilenameParameter()
		 * @generated
		 */
		EClass FILENAME_PARAMETER = eINSTANCE.getFilenameParameter();

		/**
		 * The meta object literal for the '<em><b>Filename literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILENAME_PARAMETER__FILENAME_LITERAL = eINSTANCE.getFilenameParameter_Filename_literal();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.impl.FilenameLiteralImpl <em>Filename Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.impl.FilenameLiteralImpl
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getFilenameLiteral()
		 * @generated
		 */
		EClass FILENAME_LITERAL = eINSTANCE.getFilenameLiteral();

		/**
		 * The meta object literal for the '{@link org.emftext.language.Presentation.CoordinateType <em>Coordinate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.Presentation.CoordinateType
		 * @see org.emftext.language.Presentation.impl.PresentationPackageImpl#getCoordinateType()
		 * @generated
		 */
		EEnum COORDINATE_TYPE = eINSTANCE.getCoordinateType();

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
		 * The meta object literal for the '<em><b>Xdefinition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS2_D__XDEFINITION = eINSTANCE.getStimulus2D_X_definition();

		/**
		 * The meta object literal for the '<em><b>Ydefinition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULUS2_D__YDEFINITION = eINSTANCE.getStimulus2D_Y_definition();

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
