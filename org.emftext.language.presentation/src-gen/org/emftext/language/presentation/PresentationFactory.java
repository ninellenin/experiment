/**
 */
package org.emftext.language.Presentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.Presentation.PresentationPackage
 * @generated
 */
public interface PresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationFactory eINSTANCE = org.emftext.language.Presentation.impl.PresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	Header createHeader();

	/**
	 * Returns a new object of class '<em>SDL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDL</em>'.
	 * @generated
	 */
	SDL createSDL();

	/**
	 * Returns a new object of class '<em>PCL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCL</em>'.
	 * @generated
	 */
	PCL createPCL();

	/**
	 * Returns a new object of class '<em>Scenario Name Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Name Parameter</em>'.
	 * @generated
	 */
	ScenarioNameParameter createScenarioNameParameter();

	/**
	 * Returns a new object of class '<em>Time Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Parameter</em>'.
	 * @generated
	 */
	TimeParameter createTimeParameter();

	/**
	 * Returns a new object of class '<em>Target Button Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Button Parameter</em>'.
	 * @generated
	 */
	TargetButtonParameter createTargetButtonParameter();

	/**
	 * Returns a new object of class '<em>Code Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Parameter</em>'.
	 * @generated
	 */
	CodeParameter createCodeParameter();

	/**
	 * Returns a new object of class '<em>Background Color Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Background Color Parameter</em>'.
	 * @generated
	 */
	BackgroundColorParameter createBackgroundColorParameter();

	/**
	 * Returns a new object of class '<em>Caption Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caption Parameter</em>'.
	 * @generated
	 */
	CaptionParameter createCaptionParameter();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Active Buttons Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Buttons Parameter</em>'.
	 * @generated
	 */
	ActiveButtonsParameter createActiveButtonsParameter();

	/**
	 * Returns a new object of class '<em>Button Codes Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Codes Parameter</em>'.
	 * @generated
	 */
	ButtonCodesParameter createButtonCodesParameter();

	/**
	 * Returns a new object of class '<em>Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Literal</em>'.
	 * @generated
	 */
	NumberLiteral createNumberLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Name Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Literal</em>'.
	 * @generated
	 */
	NameLiteral createNameLiteral();

	/**
	 * Returns a new object of class '<em>Trial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trial</em>'.
	 * @generated
	 */
	Trial createTrial();

	/**
	 * Returns a new object of class '<em>Stimulus List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stimulus List</em>'.
	 * @generated
	 */
	StimulusList createStimulusList();

	/**
	 * Returns a new object of class '<em>Bitmap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bitmap</em>'.
	 * @generated
	 */
	Bitmap createBitmap();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Picture Stimulus Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Picture Stimulus Event</em>'.
	 * @generated
	 */
	PictureStimulusEvent createPictureStimulusEvent();

	/**
	 * Returns a new object of class '<em>Picture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Picture</em>'.
	 * @generated
	 */
	Picture createPicture();

	/**
	 * Returns a new object of class '<em>Sound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sound</em>'.
	 * @generated
	 */
	Sound createSound();

	/**
	 * Returns a new object of class '<em>Bitmap Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bitmap Stimulus</em>'.
	 * @generated
	 */
	BitmapStimulus createBitmapStimulus();

	/**
	 * Returns a new object of class '<em>Box Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Box Stimulus</em>'.
	 * @generated
	 */
	BoxStimulus createBoxStimulus();

	/**
	 * Returns a new object of class '<em>Text Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Stimulus</em>'.
	 * @generated
	 */
	TextStimulus createTextStimulus();

	/**
	 * Returns a new object of class '<em>Coordinate Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinate Definition</em>'.
	 * @generated
	 */
	CoordinateDefinition createCoordinateDefinition();

	/**
	 * Returns a new object of class '<em>Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Box</em>'.
	 * @generated
	 */
	Box createBox();

	/**
	 * Returns a new object of class '<em>Text Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Literal</em>'.
	 * @generated
	 */
	TextLiteral createTextLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PresentationPackage getPresentationPackage();

} //PresentationFactory
