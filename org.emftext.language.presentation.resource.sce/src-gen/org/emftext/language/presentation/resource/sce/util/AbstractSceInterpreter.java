/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractSceInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<org.emftext.language.Presentation.resource.sce.ISceInterpreterListener> listeners = new java.util.ArrayList<org.emftext.language.Presentation.resource.sce.ISceInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.emftext.language.Presentation.Header) {
			result = interprete_org_emftext_language_Presentation_Header((org.emftext.language.Presentation.Header) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.SDL) {
			result = interprete_org_emftext_language_Presentation_SDL((org.emftext.language.Presentation.SDL) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.PCL) {
			result = interprete_org_emftext_language_Presentation_PCL((org.emftext.language.Presentation.PCL) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.ScenarioFile) {
			result = interprete_org_emftext_language_Presentation_ScenarioFile((org.emftext.language.Presentation.ScenarioFile) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.Scenario) {
			result = interprete_org_emftext_language_Presentation_Scenario((org.emftext.language.Presentation.Scenario) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.NamedElement) {
			result = interprete_org_emftext_language_Presentation_NamedElement((org.emftext.language.Presentation.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.NumberLiteral) {
			result = interprete_org_emftext_language_Presentation_NumberLiteral((org.emftext.language.Presentation.NumberLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.NumericLiteral) {
			result = interprete_org_emftext_language_Presentation_NumericLiteral((org.emftext.language.Presentation.NumericLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.BooleanLiteral) {
			result = interprete_org_emftext_language_Presentation_BooleanLiteral((org.emftext.language.Presentation.BooleanLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.NameLiteral) {
			result = interprete_org_emftext_language_Presentation_NameLiteral((org.emftext.language.Presentation.NameLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.TextLiteral) {
			result = interprete_org_emftext_language_Presentation_TextLiteral((org.emftext.language.Presentation.TextLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.GeneralLiteral) {
			result = interprete_org_emftext_language_Presentation_GeneralLiteral((org.emftext.language.Presentation.GeneralLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.Literal) {
			result = interprete_org_emftext_language_Presentation_Literal((org.emftext.language.Presentation.Literal) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.Trial) {
			result = interprete_org_emftext_language_Presentation_Trial((org.emftext.language.Presentation.Trial) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.StimulusEvent) {
			result = interprete_org_emftext_language_Presentation_StimulusEvent((org.emftext.language.Presentation.StimulusEvent) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.StimulusList) {
			result = interprete_org_emftext_language_Presentation_StimulusList((org.emftext.language.Presentation.StimulusList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.Bitmap) {
			result = interprete_org_emftext_language_Presentation_Bitmap((org.emftext.language.Presentation.Bitmap) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.Text) {
			result = interprete_org_emftext_language_Presentation_Text((org.emftext.language.Presentation.Text) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.PictureStimulusEvent) {
			result = interprete_org_emftext_language_Presentation_PictureStimulusEvent((org.emftext.language.Presentation.PictureStimulusEvent) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.Stimulus2D) {
			result = interprete_org_emftext_language_Presentation_Stimulus2D((org.emftext.language.Presentation.Stimulus2D) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.PicturePart) {
			result = interprete_org_emftext_language_Presentation_PicturePart((org.emftext.language.Presentation.PicturePart) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.Box) {
			result = interprete_org_emftext_language_Presentation_Box((org.emftext.language.Presentation.Box) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.ScenarioObject) {
			result = interprete_org_emftext_language_Presentation_ScenarioObject((org.emftext.language.Presentation.ScenarioObject) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.HeaderParameter) {
			result = interprete_org_emftext_language_Presentation_HeaderParameter((org.emftext.language.Presentation.HeaderParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.StimulusEventParameter) {
			result = interprete_org_emftext_language_Presentation_StimulusEventParameter((org.emftext.language.Presentation.StimulusEventParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.ActiveButtonsParameter) {
			result = interprete_org_emftext_language_Presentation_ActiveButtonsParameter((org.emftext.language.Presentation.ActiveButtonsParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.ButtonCodesParameter) {
			result = interprete_org_emftext_language_Presentation_ButtonCodesParameter((org.emftext.language.Presentation.ButtonCodesParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.ScenarioNameParameter) {
			result = interprete_org_emftext_language_Presentation_ScenarioNameParameter((org.emftext.language.Presentation.ScenarioNameParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.TimeParameter) {
			result = interprete_org_emftext_language_Presentation_TimeParameter((org.emftext.language.Presentation.TimeParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.TargetButtonParameter) {
			result = interprete_org_emftext_language_Presentation_TargetButtonParameter((org.emftext.language.Presentation.TargetButtonParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.CodeParameter) {
			result = interprete_org_emftext_language_Presentation_CodeParameter((org.emftext.language.Presentation.CodeParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.BackgroundColorParameter) {
			result = interprete_org_emftext_language_Presentation_BackgroundColorParameter((org.emftext.language.Presentation.BackgroundColorParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.PictureParameter) {
			result = interprete_org_emftext_language_Presentation_PictureParameter((org.emftext.language.Presentation.PictureParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.CaptionParameter) {
			result = interprete_org_emftext_language_Presentation_CaptionParameter((org.emftext.language.Presentation.CaptionParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.TextParameter) {
			result = interprete_org_emftext_language_Presentation_TextParameter((org.emftext.language.Presentation.TextParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.Parameter) {
			result = interprete_org_emftext_language_Presentation_Parameter((org.emftext.language.Presentation.Parameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.Picture) {
			result = interprete_org_emftext_language_Presentation_Picture((org.emftext.language.Presentation.Picture) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.Sound) {
			result = interprete_org_emftext_language_Presentation_Sound((org.emftext.language.Presentation.Sound) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.TrialParameter) {
			result = interprete_org_emftext_language_Presentation_TrialParameter((org.emftext.language.Presentation.TrialParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.Stimulus) {
			result = interprete_org_emftext_language_Presentation_Stimulus((org.emftext.language.Presentation.Stimulus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.Graphic2D) {
			result = interprete_org_emftext_language_Presentation_Graphic2D((org.emftext.language.Presentation.Graphic2D) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.BitmapStimulus) {
			result = interprete_org_emftext_language_Presentation_BitmapStimulus((org.emftext.language.Presentation.BitmapStimulus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.BoxStimulus) {
			result = interprete_org_emftext_language_Presentation_BoxStimulus((org.emftext.language.Presentation.BoxStimulus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.TextStimulus) {
			result = interprete_org_emftext_language_Presentation_TextStimulus((org.emftext.language.Presentation.TextStimulus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.CoordinateDefinition) {
			result = interprete_org_emftext_language_Presentation_CoordinateDefinition((org.emftext.language.Presentation.CoordinateDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.FilenameParameter) {
			result = interprete_org_emftext_language_Presentation_FilenameParameter((org.emftext.language.Presentation.FilenameParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.BitmapParameter) {
			result = interprete_org_emftext_language_Presentation_BitmapParameter((org.emftext.language.Presentation.BitmapParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.Presentation.FilenameLiteral) {
			result = interprete_org_emftext_language_Presentation_FilenameLiteral((org.emftext.language.Presentation.FilenameLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_ScenarioFile(org.emftext.language.Presentation.ScenarioFile scenarioFile, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Header(org.emftext.language.Presentation.Header header, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_SDL(org.emftext.language.Presentation.SDL sDL, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_PCL(org.emftext.language.Presentation.PCL pCL, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_NamedElement(org.emftext.language.Presentation.NamedElement namedElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Scenario(org.emftext.language.Presentation.Scenario scenario, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Literal(org.emftext.language.Presentation.Literal literal, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_NumericLiteral(org.emftext.language.Presentation.NumericLiteral numericLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_NumberLiteral(org.emftext.language.Presentation.NumberLiteral numberLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_GeneralLiteral(org.emftext.language.Presentation.GeneralLiteral generalLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_BooleanLiteral(org.emftext.language.Presentation.BooleanLiteral booleanLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_NameLiteral(org.emftext.language.Presentation.NameLiteral nameLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Trial(org.emftext.language.Presentation.Trial trial, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_StimulusEvent(org.emftext.language.Presentation.StimulusEvent stimulusEvent, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_StimulusList(org.emftext.language.Presentation.StimulusList stimulusList, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_ScenarioObject(org.emftext.language.Presentation.ScenarioObject scenarioObject, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Bitmap(org.emftext.language.Presentation.Bitmap bitmap, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Text(org.emftext.language.Presentation.Text text, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_PictureStimulusEvent(org.emftext.language.Presentation.PictureStimulusEvent pictureStimulusEvent, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_PicturePart(org.emftext.language.Presentation.PicturePart picturePart, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Stimulus2D(org.emftext.language.Presentation.Stimulus2D stimulus2D, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Box(org.emftext.language.Presentation.Box box, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_TextLiteral(org.emftext.language.Presentation.TextLiteral textLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Parameter(org.emftext.language.Presentation.Parameter parameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_HeaderParameter(org.emftext.language.Presentation.HeaderParameter headerParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_StimulusEventParameter(org.emftext.language.Presentation.StimulusEventParameter stimulusEventParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_ActiveButtonsParameter(org.emftext.language.Presentation.ActiveButtonsParameter activeButtonsParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_ButtonCodesParameter(org.emftext.language.Presentation.ButtonCodesParameter buttonCodesParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_ScenarioNameParameter(org.emftext.language.Presentation.ScenarioNameParameter scenarioNameParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_TimeParameter(org.emftext.language.Presentation.TimeParameter timeParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_TargetButtonParameter(org.emftext.language.Presentation.TargetButtonParameter targetButtonParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_CodeParameter(org.emftext.language.Presentation.CodeParameter codeParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_PictureParameter(org.emftext.language.Presentation.PictureParameter pictureParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_BackgroundColorParameter(org.emftext.language.Presentation.BackgroundColorParameter backgroundColorParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_TextParameter(org.emftext.language.Presentation.TextParameter textParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_CaptionParameter(org.emftext.language.Presentation.CaptionParameter captionParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Picture(org.emftext.language.Presentation.Picture picture, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Sound(org.emftext.language.Presentation.Sound sound, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_TrialParameter(org.emftext.language.Presentation.TrialParameter trialParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Stimulus(org.emftext.language.Presentation.Stimulus stimulus, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_Graphic2D(org.emftext.language.Presentation.Graphic2D graphic2D, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_BitmapStimulus(org.emftext.language.Presentation.BitmapStimulus bitmapStimulus, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_BoxStimulus(org.emftext.language.Presentation.BoxStimulus boxStimulus, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_TextStimulus(org.emftext.language.Presentation.TextStimulus textStimulus, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_CoordinateDefinition(org.emftext.language.Presentation.CoordinateDefinition coordinateDefinition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_BitmapParameter(org.emftext.language.Presentation.BitmapParameter bitmapParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_FilenameParameter(org.emftext.language.Presentation.FilenameParameter filenameParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_Presentation_FilenameLiteral(org.emftext.language.Presentation.FilenameLiteral filenameLiteral, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.emftext.language.Presentation.resource.sce.ISceInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(org.emftext.language.Presentation.resource.sce.ISceInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.emftext.language.Presentation.resource.sce.ISceInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
