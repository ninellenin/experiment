/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.util;

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
	private java.util.List<org.emftext.language.presentation.resource.sce.ISceInterpreterListener> listeners = new java.util.ArrayList<org.emftext.language.presentation.resource.sce.ISceInterpreterListener>();
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
		if (object instanceof org.emftext.language.presentation.Header) {
			result = interprete_org_emftext_language_presentation_Header((org.emftext.language.presentation.Header) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.SDL) {
			result = interprete_org_emftext_language_presentation_SDL((org.emftext.language.presentation.SDL) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.PCL) {
			result = interprete_org_emftext_language_presentation_PCL((org.emftext.language.presentation.PCL) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.ScenarioFile) {
			result = interprete_org_emftext_language_presentation_ScenarioFile((org.emftext.language.presentation.ScenarioFile) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.ScenarioNameParameter) {
			result = interprete_org_emftext_language_presentation_ScenarioNameParameter((org.emftext.language.presentation.ScenarioNameParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.ActiveButtonsParameter) {
			result = interprete_org_emftext_language_presentation_ActiveButtonsParameter((org.emftext.language.presentation.ActiveButtonsParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.Parameter) {
			result = interprete_org_emftext_language_presentation_Parameter((org.emftext.language.presentation.Parameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.Definition) {
			result = interprete_org_emftext_language_presentation_Definition((org.emftext.language.presentation.Definition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.Statement) {
			result = interprete_org_emftext_language_presentation_Statement((org.emftext.language.presentation.Statement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.HeaderParameter) {
			result = interprete_org_emftext_language_presentation_HeaderParameter((org.emftext.language.presentation.HeaderParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.Scenario) {
			result = interprete_org_emftext_language_presentation_Scenario((org.emftext.language.presentation.Scenario) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.NamedElement) {
			result = interprete_org_emftext_language_presentation_NamedElement((org.emftext.language.presentation.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.NumberLiteral) {
			result = interprete_org_emftext_language_presentation_NumberLiteral((org.emftext.language.presentation.NumberLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.NumericLiteral) {
			result = interprete_org_emftext_language_presentation_NumericLiteral((org.emftext.language.presentation.NumericLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.BooleanLiteral) {
			result = interprete_org_emftext_language_presentation_BooleanLiteral((org.emftext.language.presentation.BooleanLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.NameLiteral) {
			result = interprete_org_emftext_language_presentation_NameLiteral((org.emftext.language.presentation.NameLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.GeneralLiteral) {
			result = interprete_org_emftext_language_presentation_GeneralLiteral((org.emftext.language.presentation.GeneralLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.presentation.Literal) {
			result = interprete_org_emftext_language_presentation_Literal((org.emftext.language.presentation.Literal) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_emftext_language_presentation_ScenarioFile(org.emftext.language.presentation.ScenarioFile scenarioFile, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_Header(org.emftext.language.presentation.Header header, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_SDL(org.emftext.language.presentation.SDL sDL, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_PCL(org.emftext.language.presentation.PCL pCL, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_Parameter(org.emftext.language.presentation.Parameter parameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_Statement(org.emftext.language.presentation.Statement statement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_Definition(org.emftext.language.presentation.Definition definition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_HeaderParameter(org.emftext.language.presentation.HeaderParameter headerParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_ScenarioNameParameter(org.emftext.language.presentation.ScenarioNameParameter scenarioNameParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_NamedElement(org.emftext.language.presentation.NamedElement namedElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_Scenario(org.emftext.language.presentation.Scenario scenario, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_ActiveButtonsParameter(org.emftext.language.presentation.ActiveButtonsParameter activeButtonsParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_Literal(org.emftext.language.presentation.Literal literal, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_NumericLiteral(org.emftext.language.presentation.NumericLiteral numericLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_NumberLiteral(org.emftext.language.presentation.NumberLiteral numberLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_GeneralLiteral(org.emftext.language.presentation.GeneralLiteral generalLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_BooleanLiteral(org.emftext.language.presentation.BooleanLiteral booleanLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_presentation_NameLiteral(org.emftext.language.presentation.NameLiteral nameLiteral, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.emftext.language.presentation.resource.sce.ISceInterpreterListener listener : listeners) {
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
	
	public void addListener(org.emftext.language.presentation.resource.sce.ISceInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.emftext.language.presentation.resource.sce.ISceInterpreterListener listener) {
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
