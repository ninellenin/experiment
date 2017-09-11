/**
 */
package org.emftext.language.Presentation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.Presentation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationFactoryImpl extends EFactoryImpl implements PresentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresentationFactory init() {
		try {
			PresentationFactory thePresentationFactory = (PresentationFactory)EPackage.Registry.INSTANCE.getEFactory(PresentationPackage.eNS_URI);
			if (thePresentationFactory != null) {
				return thePresentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PresentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PresentationPackage.HEADER: return createHeader();
			case PresentationPackage.SDL: return createSDL();
			case PresentationPackage.PCL: return createPCL();
			case PresentationPackage.SCENARIO: return createScenario();
			case PresentationPackage.NUMBER_LITERAL: return createNumberLiteral();
			case PresentationPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case PresentationPackage.NAME_LITERAL: return createNameLiteral();
			case PresentationPackage.TRIAL: return createTrial();
			case PresentationPackage.STIMULUS_LIST: return createStimulusList();
			case PresentationPackage.BITMAP: return createBitmap();
			case PresentationPackage.TEXT: return createText();
			case PresentationPackage.PICTURE_STIMULUS_EVENT: return createPictureStimulusEvent();
			case PresentationPackage.BOX: return createBox();
			case PresentationPackage.TEXT_LITERAL: return createTextLiteral();
			case PresentationPackage.ACTIVE_BUTTONS_PARAMETER: return createActiveButtonsParameter();
			case PresentationPackage.BUTTON_CODES_PARAMETER: return createButtonCodesParameter();
			case PresentationPackage.SCENARIO_NAME_PARAMETER: return createScenarioNameParameter();
			case PresentationPackage.TIME_PARAMETER: return createTimeParameter();
			case PresentationPackage.TARGET_BUTTON_PARAMETER: return createTargetButtonParameter();
			case PresentationPackage.CODE_PARAMETER: return createCodeParameter();
			case PresentationPackage.BACKGROUND_COLOR_PARAMETER: return createBackgroundColorParameter();
			case PresentationPackage.CAPTION_PARAMETER: return createCaptionParameter();
			case PresentationPackage.PICTURE: return createPicture();
			case PresentationPackage.SOUND: return createSound();
			case PresentationPackage.BITMAP_STIMULUS: return createBitmapStimulus();
			case PresentationPackage.BOX_STIMULUS: return createBoxStimulus();
			case PresentationPackage.TEXT_STIMULUS: return createTextStimulus();
			case PresentationPackage.COORDINATE_DEFINITION: return createCoordinateDefinition();
			case PresentationPackage.FILENAME_PARAMETER: return createFilenameParameter();
			case PresentationPackage.FILENAME_LITERAL: return createFilenameLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PresentationPackage.COORDINATE_TYPE:
				return createCoordinateTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PresentationPackage.COORDINATE_TYPE:
				return convertCoordinateTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDL createSDL() {
		SDLImpl sdl = new SDLImpl();
		return sdl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCL createPCL() {
		PCLImpl pcl = new PCLImpl();
		return pcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioNameParameter createScenarioNameParameter() {
		ScenarioNameParameterImpl scenarioNameParameter = new ScenarioNameParameterImpl();
		return scenarioNameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeParameter createTimeParameter() {
		TimeParameterImpl timeParameter = new TimeParameterImpl();
		return timeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetButtonParameter createTargetButtonParameter() {
		TargetButtonParameterImpl targetButtonParameter = new TargetButtonParameterImpl();
		return targetButtonParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeParameter createCodeParameter() {
		CodeParameterImpl codeParameter = new CodeParameterImpl();
		return codeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundColorParameter createBackgroundColorParameter() {
		BackgroundColorParameterImpl backgroundColorParameter = new BackgroundColorParameterImpl();
		return backgroundColorParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionParameter createCaptionParameter() {
		CaptionParameterImpl captionParameter = new CaptionParameterImpl();
		return captionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveButtonsParameter createActiveButtonsParameter() {
		ActiveButtonsParameterImpl activeButtonsParameter = new ActiveButtonsParameterImpl();
		return activeButtonsParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonCodesParameter createButtonCodesParameter() {
		ButtonCodesParameterImpl buttonCodesParameter = new ButtonCodesParameterImpl();
		return buttonCodesParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberLiteral createNumberLiteral() {
		NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
		return numberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameLiteral createNameLiteral() {
		NameLiteralImpl nameLiteral = new NameLiteralImpl();
		return nameLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trial createTrial() {
		TrialImpl trial = new TrialImpl();
		return trial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimulusList createStimulusList() {
		StimulusListImpl stimulusList = new StimulusListImpl();
		return stimulusList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bitmap createBitmap() {
		BitmapImpl bitmap = new BitmapImpl();
		return bitmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PictureStimulusEvent createPictureStimulusEvent() {
		PictureStimulusEventImpl pictureStimulusEvent = new PictureStimulusEventImpl();
		return pictureStimulusEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Picture createPicture() {
		PictureImpl picture = new PictureImpl();
		return picture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sound createSound() {
		SoundImpl sound = new SoundImpl();
		return sound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitmapStimulus createBitmapStimulus() {
		BitmapStimulusImpl bitmapStimulus = new BitmapStimulusImpl();
		return bitmapStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxStimulus createBoxStimulus() {
		BoxStimulusImpl boxStimulus = new BoxStimulusImpl();
		return boxStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextStimulus createTextStimulus() {
		TextStimulusImpl textStimulus = new TextStimulusImpl();
		return textStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateDefinition createCoordinateDefinition() {
		CoordinateDefinitionImpl coordinateDefinition = new CoordinateDefinitionImpl();
		return coordinateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilenameParameter createFilenameParameter() {
		FilenameParameterImpl filenameParameter = new FilenameParameterImpl();
		return filenameParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilenameLiteral createFilenameLiteral() {
		FilenameLiteralImpl filenameLiteral = new FilenameLiteralImpl();
		return filenameLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateType createCoordinateTypeFromString(EDataType eDataType, String initialValue) {
		CoordinateType result = CoordinateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoordinateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box createBox() {
		BoxImpl box = new BoxImpl();
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteral createTextLiteral() {
		TextLiteralImpl textLiteral = new TextLiteralImpl();
		return textLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationPackage getPresentationPackage() {
		return (PresentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PresentationPackage getPackage() {
		return PresentationPackage.eINSTANCE;
	}

} //PresentationFactoryImpl
