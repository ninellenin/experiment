/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce.grammar;

public class SceGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static SceGrammarInformationProvider INSTANCE = new SceGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceContainment SCE_0_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceContainment(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.SCENARIO__HEADER), org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), }, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceContainment SCE_0_0_0_1 = new org.emftext.language.Presentation.resource.sce.grammar.SceContainment(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.SCENARIO__SDL), org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), }, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceContainment SCE_0_0_0_2 = new org.emftext.language.Presentation.resource.sce.grammar.SceContainment(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.SCENARIO__PCL), org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), }, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceSequence SCE_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceSequence(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_0_0_0_0, SCE_0_0_0_1, SCE_0_0_0_2);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceChoice SCE_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceChoice(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_0_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceRule SCE_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceRule(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), SCE_0_0, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceContainment SCE_1_0_0_0_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceContainment(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.HEADER__DEFINITION), org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getDefinition(), }, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceSequence SCE_1_0_0_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceSequence(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_1_0_0_0_0_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceChoice SCE_1_0_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceChoice(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_1_0_0_0_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceCompound SCE_1_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceCompound(SCE_1_0_0_0_0, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.STAR);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceLineBreak SCE_1_0_0_1 = new org.emftext.language.Presentation.resource.sce.grammar.SceLineBreak(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceSequence SCE_1_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceSequence(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_1_0_0_0, SCE_1_0_0_1);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceChoice SCE_1_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceChoice(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_1_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceRule SCE_1 = new org.emftext.language.Presentation.resource.sce.grammar.SceRule(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), SCE_1_0, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceKeyword SCE_2_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceKeyword("begin", org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceKeyword SCE_2_0_0_1 = new org.emftext.language.Presentation.resource.sce.grammar.SceKeyword(";", org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceLineBreak SCE_2_0_0_2 = new org.emftext.language.Presentation.resource.sce.grammar.SceLineBreak(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceSequence SCE_2_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceSequence(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_2_0_0_0, SCE_2_0_0_1, SCE_2_0_0_2);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceChoice SCE_2_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceChoice(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_2_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceRule SCE_2 = new org.emftext.language.Presentation.resource.sce.grammar.SceRule(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), SCE_2_0, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceKeyword SCE_3_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceKeyword("begin_pcl", org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceKeyword SCE_3_0_0_1 = new org.emftext.language.Presentation.resource.sce.grammar.SceKeyword(";", org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceLineBreak SCE_3_0_0_2 = new org.emftext.language.Presentation.resource.sce.grammar.SceLineBreak(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceSequence SCE_3_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceSequence(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_3_0_0_0, SCE_3_0_0_1, SCE_3_0_0_2);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceChoice SCE_3_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceChoice(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_3_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceRule SCE_3 = new org.emftext.language.Presentation.resource.sce.grammar.SceRule(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), SCE_3_0, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceContainment SCE_4_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceContainment(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getDefinition().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.DEFINITION__PARAMETER), org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getParameter(), }, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceWhiteSpace SCE_4_0_0_1 = new org.emftext.language.Presentation.resource.sce.grammar.SceWhiteSpace(1, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceKeyword SCE_4_0_0_2 = new org.emftext.language.Presentation.resource.sce.grammar.SceKeyword("=", org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceWhiteSpace SCE_4_0_0_3 = new org.emftext.language.Presentation.resource.sce.grammar.SceWhiteSpace(1, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceContainment SCE_4_0_0_4 = new org.emftext.language.Presentation.resource.sce.grammar.SceContainment(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getDefinition().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.DEFINITION__VALUE), org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getLiteral(), }, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceKeyword SCE_4_0_0_5_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceKeyword(",", org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceWhiteSpace SCE_4_0_0_5_0_0_1 = new org.emftext.language.Presentation.resource.sce.grammar.SceWhiteSpace(1, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceContainment SCE_4_0_0_5_0_0_2 = new org.emftext.language.Presentation.resource.sce.grammar.SceContainment(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getDefinition().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.DEFINITION__VALUE), org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getLiteral(), }, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceSequence SCE_4_0_0_5_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceSequence(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_4_0_0_5_0_0_0, SCE_4_0_0_5_0_0_1, SCE_4_0_0_5_0_0_2);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceChoice SCE_4_0_0_5_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceChoice(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_4_0_0_5_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceCompound SCE_4_0_0_5 = new org.emftext.language.Presentation.resource.sce.grammar.SceCompound(SCE_4_0_0_5_0, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.STAR);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceKeyword SCE_4_0_0_6 = new org.emftext.language.Presentation.resource.sce.grammar.SceKeyword(";", org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceLineBreak SCE_4_0_0_7 = new org.emftext.language.Presentation.resource.sce.grammar.SceLineBreak(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceSequence SCE_4_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceSequence(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_4_0_0_0, SCE_4_0_0_1, SCE_4_0_0_2, SCE_4_0_0_3, SCE_4_0_0_4, SCE_4_0_0_5, SCE_4_0_0_6, SCE_4_0_0_7);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceChoice SCE_4_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceChoice(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_4_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceRule SCE_4 = new org.emftext.language.Presentation.resource.sce.grammar.SceRule(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getDefinition(), SCE_4_0, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.ScePlaceholder SCE_5_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.ScePlaceholder(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNumberLiteral().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.NUMBER_LITERAL__VALUE), "SIGNED_INTEGER", org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceSequence SCE_5_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceSequence(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_5_0_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceChoice SCE_5_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceChoice(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_5_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceRule SCE_5 = new org.emftext.language.Presentation.resource.sce.grammar.SceRule(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNumberLiteral(), SCE_5_0, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.ScePlaceholder SCE_6_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.ScePlaceholder(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNameLiteral().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.NAME_LITERAL__VALUE), "QUOTED_NAME", org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceSequence SCE_6_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceSequence(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_6_0_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceChoice SCE_6_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceChoice(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_6_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceRule SCE_6 = new org.emftext.language.Presentation.resource.sce.grammar.SceRule(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNameLiteral(), SCE_6_0, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.ScePlaceholder SCE_7_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.ScePlaceholder(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getBooleanLiteral().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.BOOLEAN_LITERAL__VALUE), "BOOLEAN", org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, 0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceSequence SCE_7_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceSequence(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_7_0_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceChoice SCE_7_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceChoice(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_7_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceRule SCE_7 = new org.emftext.language.Presentation.resource.sce.grammar.SceRule(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getBooleanLiteral(), SCE_7_0, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceKeyword SCE_8_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceKeyword("scenario", org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceSequence SCE_8_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceSequence(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_8_0_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceChoice SCE_8_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceChoice(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_8_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceRule SCE_8 = new org.emftext.language.Presentation.resource.sce.grammar.SceRule(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(), SCE_8_0, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceKeyword SCE_9_0_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceKeyword("active_buttons", org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceSequence SCE_9_0_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceSequence(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_9_0_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceChoice SCE_9_0 = new org.emftext.language.Presentation.resource.sce.grammar.SceChoice(org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE, SCE_9_0_0);
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceRule SCE_9 = new org.emftext.language.Presentation.resource.sce.grammar.SceRule(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(), SCE_9_0, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality.ONE);
	
	public static String getSyntaxElementID(org.emftext.language.Presentation.resource.sce.grammar.SceSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static org.emftext.language.Presentation.resource.sce.grammar.SceSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (org.emftext.language.Presentation.resource.sce.grammar.SceSyntaxElement) org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static org.emftext.language.Presentation.resource.sce.grammar.SceRule[] RULES = new org.emftext.language.Presentation.resource.sce.grammar.SceRule[] {
		SCE_0,
		SCE_1,
		SCE_2,
		SCE_3,
		SCE_4,
		SCE_5,
		SCE_6,
		SCE_7,
		SCE_8,
		SCE_9,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (org.emftext.language.Presentation.resource.sce.grammar.SceRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(org.emftext.language.Presentation.resource.sce.grammar.SceSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof org.emftext.language.Presentation.resource.sce.grammar.SceKeyword) {
			keywords.add(((org.emftext.language.Presentation.resource.sce.grammar.SceKeyword) element).getValue());
		} else if (element instanceof org.emftext.language.Presentation.resource.sce.grammar.SceBooleanTerminal) {
			keywords.add(((org.emftext.language.Presentation.resource.sce.grammar.SceBooleanTerminal) element).getTrueLiteral());
			keywords.add(((org.emftext.language.Presentation.resource.sce.grammar.SceBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof org.emftext.language.Presentation.resource.sce.grammar.SceEnumerationTerminal) {
			org.emftext.language.Presentation.resource.sce.grammar.SceEnumerationTerminal terminal = (org.emftext.language.Presentation.resource.sce.grammar.SceEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (org.emftext.language.Presentation.resource.sce.grammar.SceSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
