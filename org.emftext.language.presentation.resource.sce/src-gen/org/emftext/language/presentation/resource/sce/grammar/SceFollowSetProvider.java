/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce.grammar;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class SceFollowSetProvider {
	
	public final static org.emftext.language.Presentation.resource.sce.ISceExpectedElement TERMINALS[] = new org.emftext.language.Presentation.resource.sce.ISceExpectedElement[17];
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] FEATURES = new org.eclipse.emf.ecore.EStructuralFeature[7];
	
	public final static org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] LINKS = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[45];
	
	public final static org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] EMPTY_LINK_ARRAY = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_0);
		TERMINALS[1] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_0);
		TERMINALS[2] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_0);
		TERMINALS[3] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_0);
		TERMINALS[4] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_3_0_0_0);
		TERMINALS[5] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_1);
		TERMINALS[6] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_3_0_0_1);
		TERMINALS[7] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_2);
		TERMINALS[8] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedStructuralFeature(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_8_0_0_0);
		TERMINALS[9] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_5);
		TERMINALS[10] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_2);
		TERMINALS[11] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedStructuralFeature(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_7_0_0_0);
		TERMINALS[12] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_5);
		TERMINALS[13] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_2);
		TERMINALS[14] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_5_0_0_0);
		TERMINALS[15] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_6);
		TERMINALS[16] = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedStructuralFeature(org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_9_0_0_0);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.SCENARIO__SDL);
		FEATURES[1] = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.SCENARIO__PCL);
		FEATURES[2] = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.SCENARIO_NAME_PARAMETER__SCENARIO_NAME);
		FEATURES[3] = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.HEADER__PARAMETER);
		FEATURES[4] = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS);
		FEATURES[5] = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.BUTTON_CODES_PARAMETER__BUTTON_CODES);
		FEATURES[6] = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.SCENARIO__HEADER);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[3]);
		LINKS[1] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), FEATURES[6]);
		LINKS[2] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[3]);
		LINKS[3] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), FEATURES[6]);
		LINKS[4] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[3]);
		LINKS[5] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), FEATURES[6]);
		LINKS[6] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]);
		LINKS[7] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]);
		LINKS[8] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]);
		LINKS[9] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]);
		LINKS[10] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]);
		LINKS[11] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]);
		LINKS[12] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]);
		LINKS[13] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[3]);
		LINKS[14] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[3]);
		LINKS[15] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[3]);
		LINKS[16] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]);
		LINKS[17] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]);
		LINKS[18] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[3]);
		LINKS[19] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[3]);
		LINKS[20] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[3]);
		LINKS[21] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]);
		LINKS[22] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]);
		LINKS[23] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]);
		LINKS[24] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]);
		LINKS[25] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]);
		LINKS[26] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNameLiteral(), FEATURES[2]);
		LINKS[27] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[3]);
		LINKS[28] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[3]);
		LINKS[29] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[3]);
		LINKS[30] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]);
		LINKS[31] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]);
		LINKS[32] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNumberLiteral(), FEATURES[4]);
		LINKS[33] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[3]);
		LINKS[34] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[3]);
		LINKS[35] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[3]);
		LINKS[36] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]);
		LINKS[37] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]);
		LINKS[38] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNumberLiteral(), FEATURES[5]);
		LINKS[39] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNumberLiteral(), FEATURES[5]);
		LINKS[40] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[3]);
		LINKS[41] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[3]);
		LINKS[42] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[3]);
		LINKS[43] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]);
		LINKS[44] = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[3].addFollower(TERMINALS[5], EMPTY_LINK_ARRAY);
		TERMINALS[5].addFollower(TERMINALS[3], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]), });
		TERMINALS[5].addFollower(TERMINALS[4], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]), });
		TERMINALS[4].addFollower(TERMINALS[6], EMPTY_LINK_ARRAY);
		TERMINALS[6].addFollower(TERMINALS[4], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]), });
		TERMINALS[0].addFollower(TERMINALS[7], EMPTY_LINK_ARRAY);
		TERMINALS[7].addFollower(TERMINALS[8], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNameLiteral(), FEATURES[2]), });
		TERMINALS[9].addFollower(TERMINALS[0], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[3]), });
		TERMINALS[9].addFollower(TERMINALS[1], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[3]), });
		TERMINALS[9].addFollower(TERMINALS[2], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[3]), });
		TERMINALS[9].addFollower(TERMINALS[3], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]), });
		TERMINALS[9].addFollower(TERMINALS[4], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]), });
		TERMINALS[1].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[10].addFollower(TERMINALS[11], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNumberLiteral(), FEATURES[4]), });
		TERMINALS[12].addFollower(TERMINALS[0], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[3]), });
		TERMINALS[12].addFollower(TERMINALS[1], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[3]), });
		TERMINALS[12].addFollower(TERMINALS[2], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[3]), });
		TERMINALS[12].addFollower(TERMINALS[3], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]), });
		TERMINALS[12].addFollower(TERMINALS[4], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]), });
		TERMINALS[2].addFollower(TERMINALS[13], EMPTY_LINK_ARRAY);
		TERMINALS[13].addFollower(TERMINALS[11], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNumberLiteral(), FEATURES[5]), });
		TERMINALS[14].addFollower(TERMINALS[11], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNumberLiteral(), FEATURES[5]), });
		TERMINALS[15].addFollower(TERMINALS[0], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[3]), });
		TERMINALS[15].addFollower(TERMINALS[1], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[3]), });
		TERMINALS[15].addFollower(TERMINALS[2], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[3]), });
		TERMINALS[15].addFollower(TERMINALS[3], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), FEATURES[0]), });
		TERMINALS[15].addFollower(TERMINALS[4], new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(), FEATURES[1]), });
		TERMINALS[11].addFollower(TERMINALS[12], EMPTY_LINK_ARRAY);
		TERMINALS[11].addFollower(TERMINALS[14], EMPTY_LINK_ARRAY);
		TERMINALS[8].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
	}
	
	public static void wire() {
		wire0();
	}
	
	static {
		// initialize the arrays
		initializeTerminals();
		initializeFeatures();
		initializeLinks();
		// wire the terminals
		wire();
	}
}
