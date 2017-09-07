/**
 */
package org.emftext.language.Presentation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.Presentation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftext.language.Presentation.PresentationPackage
 * @generated
 */
public class PresentationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PresentationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationSwitch() {
		if (modelPackage == null) {
			modelPackage = PresentationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PresentationPackage.SCENARIO_FILE: {
				ScenarioFile scenarioFile = (ScenarioFile)theEObject;
				T result = caseScenarioFile(scenarioFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = caseScenarioFile(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.SDL: {
				SDL sdl = (SDL)theEObject;
				T result = caseSDL(sdl);
				if (result == null) result = caseScenarioFile(sdl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.PCL: {
				PCL pcl = (PCL)theEObject;
				T result = casePCL(pcl);
				if (result == null) result = caseScenarioFile(pcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = caseNamedElement(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.NUMERIC_LITERAL: {
				NumericLiteral numericLiteral = (NumericLiteral)theEObject;
				T result = caseNumericLiteral(numericLiteral);
				if (result == null) result = caseLiteral(numericLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.NUMBER_LITERAL: {
				NumberLiteral numberLiteral = (NumberLiteral)theEObject;
				T result = caseNumberLiteral(numberLiteral);
				if (result == null) result = caseNumericLiteral(numberLiteral);
				if (result == null) result = caseLiteral(numberLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.GENERAL_LITERAL: {
				GeneralLiteral generalLiteral = (GeneralLiteral)theEObject;
				T result = caseGeneralLiteral(generalLiteral);
				if (result == null) result = caseLiteral(generalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseGeneralLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.NAME_LITERAL: {
				NameLiteral nameLiteral = (NameLiteral)theEObject;
				T result = caseNameLiteral(nameLiteral);
				if (result == null) result = caseTextLiteral(nameLiteral);
				if (result == null) result = caseGeneralLiteral(nameLiteral);
				if (result == null) result = caseLiteral(nameLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.TRIAL: {
				Trial trial = (Trial)theEObject;
				T result = caseTrial(trial);
				if (result == null) result = caseNamedElement(trial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.STIMULUS_EVENT: {
				StimulusEvent stimulusEvent = (StimulusEvent)theEObject;
				T result = caseStimulusEvent(stimulusEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.LIST_NODE: {
				ListNode listNode = (ListNode)theEObject;
				T result = caseListNode(listNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.STIMULUS_LIST: {
				StimulusList stimulusList = (StimulusList)theEObject;
				T result = caseStimulusList(stimulusList);
				if (result == null) result = caseListNode(stimulusList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.SCENARIO_OBJECT: {
				ScenarioObject scenarioObject = (ScenarioObject)theEObject;
				T result = caseScenarioObject(scenarioObject);
				if (result == null) result = caseNamedElement(scenarioObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.BITMAP: {
				Bitmap bitmap = (Bitmap)theEObject;
				T result = caseBitmap(bitmap);
				if (result == null) result = caseStimulus2D(bitmap);
				if (result == null) result = casePicturePart(bitmap);
				if (result == null) result = caseNamedElement(bitmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseStimulus2D(text);
				if (result == null) result = casePicturePart(text);
				if (result == null) result = caseNamedElement(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.PICTURE: {
				Picture picture = (Picture)theEObject;
				T result = casePicture(picture);
				if (result == null) result = caseScenarioObject(picture);
				if (result == null) result = caseNamedElement(picture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.PICTURE_PART: {
				PicturePart picturePart = (PicturePart)theEObject;
				T result = casePicturePart(picturePart);
				if (result == null) result = caseNamedElement(picturePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.STIMULUS2_D: {
				Stimulus2D stimulus2D = (Stimulus2D)theEObject;
				T result = caseStimulus2D(stimulus2D);
				if (result == null) result = casePicturePart(stimulus2D);
				if (result == null) result = caseNamedElement(stimulus2D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.BOX: {
				Box box = (Box)theEObject;
				T result = caseBox(box);
				if (result == null) result = caseStimulus2D(box);
				if (result == null) result = casePicturePart(box);
				if (result == null) result = caseNamedElement(box);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.TEXT_LITERAL: {
				TextLiteral textLiteral = (TextLiteral)theEObject;
				T result = caseTextLiteral(textLiteral);
				if (result == null) result = caseGeneralLiteral(textLiteral);
				if (result == null) result = caseLiteral(textLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.HEADER_PARAMETER: {
				HeaderParameter headerParameter = (HeaderParameter)theEObject;
				T result = caseHeaderParameter(headerParameter);
				if (result == null) result = caseParameter(headerParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.SDL_PARAMETER: {
				SDLParameter sdlParameter = (SDLParameter)theEObject;
				T result = caseSDLParameter(sdlParameter);
				if (result == null) result = caseParameter(sdlParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.ACTIVE_BUTTONS_PARAMETER: {
				ActiveButtonsParameter activeButtonsParameter = (ActiveButtonsParameter)theEObject;
				T result = caseActiveButtonsParameter(activeButtonsParameter);
				if (result == null) result = caseHeaderParameter(activeButtonsParameter);
				if (result == null) result = caseParameter(activeButtonsParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.BUTTON_CODES_PARAMETER: {
				ButtonCodesParameter buttonCodesParameter = (ButtonCodesParameter)theEObject;
				T result = caseButtonCodesParameter(buttonCodesParameter);
				if (result == null) result = caseHeaderParameter(buttonCodesParameter);
				if (result == null) result = caseParameter(buttonCodesParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.SCENARIO_NAME_PARAMETER: {
				ScenarioNameParameter scenarioNameParameter = (ScenarioNameParameter)theEObject;
				T result = caseScenarioNameParameter(scenarioNameParameter);
				if (result == null) result = caseHeaderParameter(scenarioNameParameter);
				if (result == null) result = caseParameter(scenarioNameParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.TIME_PARAMETER: {
				TimeParameter timeParameter = (TimeParameter)theEObject;
				T result = caseTimeParameter(timeParameter);
				if (result == null) result = caseSDLParameter(timeParameter);
				if (result == null) result = caseParameter(timeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.TARGET_BUTTON_PARAMETER: {
				TargetButtonParameter targetButtonParameter = (TargetButtonParameter)theEObject;
				T result = caseTargetButtonParameter(targetButtonParameter);
				if (result == null) result = caseSDLParameter(targetButtonParameter);
				if (result == null) result = caseParameter(targetButtonParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.CODE_PARAMETER: {
				CodeParameter codeParameter = (CodeParameter)theEObject;
				T result = caseCodeParameter(codeParameter);
				if (result == null) result = caseSDLParameter(codeParameter);
				if (result == null) result = caseParameter(codeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioFile(ScenarioFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDL(SDL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCL(PCL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderParameter(HeaderParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDL Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDL Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDLParameter(SDLParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Name Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Name Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioNameParameter(ScenarioNameParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeParameter(TimeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Button Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Button Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetButtonParameter(TargetButtonParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeParameter(CodeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Buttons Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Buttons Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveButtonsParameter(ActiveButtonsParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Codes Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Codes Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonCodesParameter(ButtonCodesParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericLiteral(NumericLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteral(NumberLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralLiteral(GeneralLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameLiteral(NameLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrial(Trial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimulus Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimulus Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStimulusEvent(StimulusEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListNode(ListNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimulus List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimulus List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStimulusList(StimulusList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioObject(ScenarioObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bitmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bitmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitmap(Bitmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Picture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Picture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePicture(Picture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Picture Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Picture Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePicturePart(PicturePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimulus2 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimulus2 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStimulus2D(Stimulus2D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBox(Box object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextLiteral(TextLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PresentationSwitch
