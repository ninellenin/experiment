/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

public class ScePrinter implements org.emftext.language.presentation.resource.sce.ISceTextPrinter {
	
	protected org.emftext.language.presentation.resource.sce.ISceTokenResolverFactory tokenResolverFactory = new org.emftext.language.presentation.resource.sce.mopp.SceTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.emftext.language.presentation.resource.sce.ISceTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public ScePrinter(java.io.OutputStream outputStream, org.emftext.language.presentation.resource.sce.ISceTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.emftext.language.presentation.Scenario) {
			print_org_emftext_language_presentation_Scenario((org.emftext.language.presentation.Scenario) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.presentation.Header) {
			print_org_emftext_language_presentation_Header((org.emftext.language.presentation.Header) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.presentation.SDL) {
			print_org_emftext_language_presentation_SDL((org.emftext.language.presentation.SDL) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.presentation.PCL) {
			print_org_emftext_language_presentation_PCL((org.emftext.language.presentation.PCL) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.presentation.Definition) {
			print_org_emftext_language_presentation_Definition((org.emftext.language.presentation.Definition) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.presentation.NumberLiteral) {
			print_org_emftext_language_presentation_NumberLiteral((org.emftext.language.presentation.NumberLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.presentation.NameLiteral) {
			print_org_emftext_language_presentation_NameLiteral((org.emftext.language.presentation.NameLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.presentation.BooleanLiteral) {
			print_org_emftext_language_presentation_BooleanLiteral((org.emftext.language.presentation.BooleanLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.presentation.ScenarioNameParameter) {
			print_org_emftext_language_presentation_ScenarioNameParameter((org.emftext.language.presentation.ScenarioNameParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.presentation.ActiveButtonsParameter) {
			print_org_emftext_language_presentation_ActiveButtonsParameter((org.emftext.language.presentation.ActiveButtonsParameter) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.emftext.language.presentation.resource.sce.mopp.SceReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.emftext.language.presentation.resource.sce.mopp.SceReferenceResolverSwitch) new org.emftext.language.presentation.resource.sce.mopp.SceMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.emftext.language.presentation.resource.sce.ISceTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.emftext.language.presentation.resource.sce.mopp.SceProblem(errorMessage, org.emftext.language.presentation.resource.sce.SceEProblemType.PRINT_PROBLEM, org.emftext.language.presentation.resource.sce.SceEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public org.emftext.language.presentation.resource.sce.ISceTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_org_emftext_language_presentation_Scenario(org.emftext.language.presentation.Scenario element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.SCENARIO__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.SCENARIO__HEADER));
		printCountingMap.put("header", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.SCENARIO__SDL));
		printCountingMap.put("sdl", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.SCENARIO__PCL));
		printCountingMap.put("pcl", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("header");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.SCENARIO__HEADER));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("header", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sdl");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.SCENARIO__SDL));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sdl", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("pcl");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.SCENARIO__PCL));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("pcl", 0);
		}
	}
	
	
	public void print_org_emftext_language_presentation_Header(org.emftext.language.presentation.Header element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.HEADER__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("definition");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.HEADER__DEFINITION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("definition", 0);
		}
	}
	
	
	public void print_org_emftext_language_presentation_SDL(org.emftext.language.presentation.SDL element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("begin;");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_presentation_PCL(org.emftext.language.presentation.PCL element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("begin_pcl;");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_presentation_Definition(org.emftext.language.presentation.Definition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.DEFINITION__PARAMETER));
		printCountingMap.put("parameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.DEFINITION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.DEFINITION__PARAMETER));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameter", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.DEFINITION__VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_presentation_Definition_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_org_emftext_language_presentation_Definition_0(org.emftext.language.presentation.Definition element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.DEFINITION__VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_presentation_NumberLiteral(org.emftext.language.presentation.NumberLiteral element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.NUMBER_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.NUMBER_LITERAL__VALUE));
			if (o != null) {
				org.emftext.language.presentation.resource.sce.ISceTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.NUMBER_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_presentation_NameLiteral(org.emftext.language.presentation.NameLiteral element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.NAME_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.NAME_LITERAL__VALUE));
			if (o != null) {
				org.emftext.language.presentation.resource.sce.ISceTokenResolver resolver = tokenResolverFactory.createTokenResolver("NAME");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.NAME_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_presentation_BooleanLiteral(org.emftext.language.presentation.BooleanLiteral element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.BOOLEAN_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.BOOLEAN_LITERAL__VALUE));
			if (o != null) {
				org.emftext.language.presentation.resource.sce.ISceTokenResolver resolver = tokenResolverFactory.createTokenResolver("BOOLEAN");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.BOOLEAN_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_presentation_ScenarioNameParameter(org.emftext.language.presentation.ScenarioNameParameter element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("scenario");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_presentation_ActiveButtonsParameter(org.emftext.language.presentation.ActiveButtonsParameter element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("active_buttons");
		out.print(" ");
	}
	
	
}
