/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.grammar;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class SceFollowSetProvider {
	
	public final static org.emftext.language.presentation.resource.sce.ISceExpectedElement TERMINALS[] = new org.emftext.language.presentation.resource.sce.ISceExpectedElement[48];
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] FEATURES = new org.eclipse.emf.ecore.EStructuralFeature[20];
	
	public final static org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] LINKS = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[152];
	
	public final static org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] EMPTY_LINK_ARRAY = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_0);
		TERMINALS[1] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_0);
		TERMINALS[2] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_0);
		TERMINALS[3] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_0);
		TERMINALS[4] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_3_0_0_0);
		TERMINALS[5] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_1);
		TERMINALS[6] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_0);
		TERMINALS[7] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_0);
		TERMINALS[8] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_0);
		TERMINALS[9] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_3_0_0_1);
		TERMINALS[10] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_2);
		TERMINALS[11] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedStructuralFeature(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_8_0_0_0);
		TERMINALS[12] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_5);
		TERMINALS[13] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_2);
		TERMINALS[14] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedStructuralFeature(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_7_0_0_0);
		TERMINALS[15] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_5);
		TERMINALS[16] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_2);
		TERMINALS[17] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_5_0_0_0);
		TERMINALS[18] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_6);
		TERMINALS[19] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_15_0_0_5);
		TERMINALS[20] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_19_0_0_5);
		TERMINALS[21] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedStructuralFeature(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_9_0_0_0);
		TERMINALS[22] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedStructuralFeature(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_10_0_0_0);
		TERMINALS[23] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_2);
		TERMINALS[24] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_6);
		TERMINALS[25] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedStructuralFeature(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_8);
		TERMINALS[26] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_9);
		TERMINALS[27] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_15_0_0_0);
		TERMINALS[28] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_2);
		TERMINALS[29] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_6);
		TERMINALS[30] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedStructuralFeature(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_7);
		TERMINALS[31] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_8);
		TERMINALS[32] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_15_0_0_2);
		TERMINALS[33] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedEnumerationTerminal(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0);
		TERMINALS[34] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_2);
		TERMINALS[35] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedStructuralFeature(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_4);
		TERMINALS[36] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_5);
		TERMINALS[37] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_0_0_0_0);
		TERMINALS[38] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_0_0_1_0);
		TERMINALS[39] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_2);
		TERMINALS[40] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedStructuralFeature(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_4);
		TERMINALS[41] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_5);
		TERMINALS[42] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_2);
		TERMINALS[43] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_19_0_0_0);
		TERMINALS[44] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_8);
		TERMINALS[45] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedStructuralFeature(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_9_0_0_1);
		TERMINALS[46] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_10);
		TERMINALS[47] = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_19_0_0_2);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL().getEStructuralFeature(org.emftext.language.presentation.scenario.scenarioPackage.SDL__SCENARIO_OBJECT);
		FEATURES[1] = org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.PICTURE_STIMULUS_EVENT__PICTURE);
		FEATURES[2] = org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.TEXT_STIMULUS__TEXT);
		FEATURES[3] = org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario().getEStructuralFeature(org.emftext.language.presentation.scenario.scenarioPackage.SCENARIO__SDL);
		FEATURES[4] = org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario().getEStructuralFeature(org.emftext.language.presentation.scenario.scenarioPackage.SCENARIO__PCL);
		FEATURES[5] = org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getScenarioNameParameter().getEStructuralFeature(org.emftext.language.presentation.parameter.parameterPackage.SCENARIO_NAME_PARAMETER__NAME_LITERAL);
		FEATURES[6] = org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader().getEStructuralFeature(org.emftext.language.presentation.scenario.scenarioPackage.HEADER__PARAMETER);
		FEATURES[7] = org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getActiveButtonsParameter().getEStructuralFeature(org.emftext.language.presentation.parameter.parameterPackage.ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL);
		FEATURES[8] = org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter().getEStructuralFeature(org.emftext.language.presentation.parameter.parameterPackage.BUTTON_CODES_PARAMETER__NUMBER_LITERAL);
		FEATURES[9] = org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getStimulusList().getEStructuralFeature(org.emftext.language.presentation.stimulus.stimulusPackage.STIMULUS_LIST__STIMULUS_EVENT);
		FEATURES[10] = org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial().getEStructuralFeature(org.emftext.language.presentation.stimulus.stimulusPackage.TRIAL__STIMULUS_LIST);
		FEATURES[11] = org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.PICTURE__PICTURE_PART);
		FEATURES[12] = org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getStimulusEvent().getEStructuralFeature(org.emftext.language.presentation.stimulus.stimulusPackage.STIMULUS_EVENT__STIMULUS_EVENT_PARAMETER);
		FEATURES[13] = org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getTimeParameter().getEStructuralFeature(org.emftext.language.presentation.parameter.parameterPackage.TIME_PARAMETER__NUMBER_LITERAL);
		FEATURES[14] = org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getStimulus2D().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.STIMULUS2_D__YDEFINITION);
		FEATURES[15] = org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.TEXT__CAPTION);
		FEATURES[16] = org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getStimulus2D().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.STIMULUS2_D__XDEFINITION);
		FEATURES[17] = org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getCaptionParameter().getEStructuralFeature(org.emftext.language.presentation.parameter.parameterPackage.CAPTION_PARAMETER__TEXT_LITERAL);
		FEATURES[18] = org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.TEXT__TEXT_PARAMETER);
		FEATURES[19] = org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario().getEStructuralFeature(org.emftext.language.presentation.scenario.scenarioPackage.SCENARIO__HEADER);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[6]);
		LINKS[1] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), FEATURES[19]);
		LINKS[2] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[6]);
		LINKS[3] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), FEATURES[19]);
		LINKS[4] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[6]);
		LINKS[5] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), FEATURES[19]);
		LINKS[6] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[7] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[8] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[9] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[10] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[11] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[12] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[13] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[6]);
		LINKS[14] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[6]);
		LINKS[15] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[6]);
		LINKS[16] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[17] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[18] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[6]);
		LINKS[19] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[6]);
		LINKS[20] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[6]);
		LINKS[21] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[22] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[23] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]);
		LINKS[24] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[25] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]);
		LINKS[26] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[27] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]);
		LINKS[28] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[29] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[30] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]);
		LINKS[31] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[32] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]);
		LINKS[33] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[34] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]);
		LINKS[35] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[36] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[37] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]);
		LINKS[38] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[39] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]);
		LINKS[40] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[41] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]);
		LINKS[42] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[43] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[44] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[45] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNameLiteral(), FEATURES[5]);
		LINKS[46] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[6]);
		LINKS[47] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[6]);
		LINKS[48] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[6]);
		LINKS[49] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[50] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[51] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNumberLiteral(), FEATURES[7]);
		LINKS[52] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[6]);
		LINKS[53] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[6]);
		LINKS[54] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[6]);
		LINKS[55] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[56] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[57] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNumberLiteral(), FEATURES[8]);
		LINKS[58] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNumberLiteral(), FEATURES[8]);
		LINKS[59] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[6]);
		LINKS[60] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[6]);
		LINKS[61] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[6]);
		LINKS[62] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[63] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[64] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[65] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[9]);
		LINKS[66] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getStimulusList(), FEATURES[10]);
		LINKS[67] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]);
		LINKS[68] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[69] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]);
		LINKS[70] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[71] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]);
		LINKS[72] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[73] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[74] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[75] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[9]);
		LINKS[76] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[77] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[9]);
		LINKS[78] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getTimeParameter(), FEATURES[12]);
		LINKS[79] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]);
		LINKS[80] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[81] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]);
		LINKS[82] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[83] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]);
		LINKS[84] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[85] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[86] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getTimeParameter(), FEATURES[12]);
		LINKS[87] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]);
		LINKS[88] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[89] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]);
		LINKS[90] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[91] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]);
		LINKS[92] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[93] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[94] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getTimeParameter(), FEATURES[12]);
		LINKS[95] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]);
		LINKS[96] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[97] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]);
		LINKS[98] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[99] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]);
		LINKS[100] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[101] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[102] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[103] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[11]);
		LINKS[104] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[105] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[11]);
		LINKS[106] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[107] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[11]);
		LINKS[108] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]);
		LINKS[109] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[110] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]);
		LINKS[111] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[112] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]);
		LINKS[113] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[114] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[115] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getTimeParameter(), FEATURES[12]);
		LINKS[116] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNumberLiteral(), FEATURES[13]);
		LINKS[117] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getTimeParameter(), FEATURES[12]);
		LINKS[118] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]);
		LINKS[119] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[120] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]);
		LINKS[121] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[122] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]);
		LINKS[123] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[124] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[125] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateDefinition(), FEATURES[16]);
		LINKS[126] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateDefinition(), FEATURES[14]);
		LINKS[127] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]);
		LINKS[128] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[129] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]);
		LINKS[130] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[131] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]);
		LINKS[132] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[133] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[134] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateDefinition(), FEATURES[14]);
		LINKS[135] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateDefinition(), FEATURES[14]);
		LINKS[136] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateDefinition(), FEATURES[14]);
		LINKS[137] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getCaptionParameter(), FEATURES[15]);
		LINKS[138] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getCaptionParameter(), FEATURES[18]);
		LINKS[139] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getCaptionParameter(), FEATURES[18]);
		LINKS[140] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getCaptionParameter(), FEATURES[18]);
		LINKS[141] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]);
		LINKS[142] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]);
		LINKS[143] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]);
		LINKS[144] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]);
		LINKS[145] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]);
		LINKS[146] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]);
		LINKS[147] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]);
		LINKS[148] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateDefinition(), FEATURES[16]);
		LINKS[149] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNameLiteral(), FEATURES[17]);
		LINKS[150] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getTextLiteral(), FEATURES[17]);
		LINKS[151] = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getCaptionParameter(), FEATURES[18]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[3].addFollower(TERMINALS[5], EMPTY_LINK_ARRAY);
		TERMINALS[5].addFollower(TERMINALS[6], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]), });
		TERMINALS[5].addFollower(TERMINALS[7], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]), });
		TERMINALS[5].addFollower(TERMINALS[8], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]), });
		TERMINALS[5].addFollower(TERMINALS[3], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]), });
		TERMINALS[5].addFollower(TERMINALS[4], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]), });
		TERMINALS[4].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
		TERMINALS[9].addFollower(TERMINALS[4], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]), });
		TERMINALS[0].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[10].addFollower(TERMINALS[11], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNameLiteral(), FEATURES[5]), });
		TERMINALS[12].addFollower(TERMINALS[0], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[6]), });
		TERMINALS[12].addFollower(TERMINALS[1], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[6]), });
		TERMINALS[12].addFollower(TERMINALS[2], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[6]), });
		TERMINALS[12].addFollower(TERMINALS[3], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]), });
		TERMINALS[12].addFollower(TERMINALS[4], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]), });
		TERMINALS[1].addFollower(TERMINALS[13], EMPTY_LINK_ARRAY);
		TERMINALS[13].addFollower(TERMINALS[14], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNumberLiteral(), FEATURES[7]), });
		TERMINALS[15].addFollower(TERMINALS[0], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[6]), });
		TERMINALS[15].addFollower(TERMINALS[1], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[6]), });
		TERMINALS[15].addFollower(TERMINALS[2], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[6]), });
		TERMINALS[15].addFollower(TERMINALS[3], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]), });
		TERMINALS[15].addFollower(TERMINALS[4], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]), });
		TERMINALS[2].addFollower(TERMINALS[16], EMPTY_LINK_ARRAY);
		TERMINALS[16].addFollower(TERMINALS[14], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNumberLiteral(), FEATURES[8]), });
		TERMINALS[17].addFollower(TERMINALS[14], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNumberLiteral(), FEATURES[8]), });
		TERMINALS[18].addFollower(TERMINALS[0], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getScenarioNameParameter(), FEATURES[6]), });
		TERMINALS[18].addFollower(TERMINALS[1], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getActiveButtonsParameter(), FEATURES[6]), });
		TERMINALS[18].addFollower(TERMINALS[2], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter(), FEATURES[6]), });
		TERMINALS[18].addFollower(TERMINALS[3], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]), });
		TERMINALS[18].addFollower(TERMINALS[4], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]), });
		TERMINALS[14].addFollower(TERMINALS[15], EMPTY_LINK_ARRAY);
		TERMINALS[14].addFollower(TERMINALS[17], EMPTY_LINK_ARRAY);
		TERMINALS[14].addFollower(TERMINALS[18], EMPTY_LINK_ARRAY);
		TERMINALS[14].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[11].addFollower(TERMINALS[12], EMPTY_LINK_ARRAY);
		TERMINALS[11].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[22].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[6].addFollower(TERMINALS[23], EMPTY_LINK_ARRAY);
		TERMINALS[23].addFollower(TERMINALS[7], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[9]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getStimulusList(), FEATURES[10]), });
		TERMINALS[23].addFollower(TERMINALS[24], EMPTY_LINK_ARRAY);
		TERMINALS[24].addFollower(TERMINALS[25], EMPTY_LINK_ARRAY);
		TERMINALS[25].addFollower(TERMINALS[26], EMPTY_LINK_ARRAY);
		TERMINALS[26].addFollower(TERMINALS[6], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]), });
		TERMINALS[26].addFollower(TERMINALS[7], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]), });
		TERMINALS[26].addFollower(TERMINALS[8], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]), });
		TERMINALS[26].addFollower(TERMINALS[3], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]), });
		TERMINALS[26].addFollower(TERMINALS[4], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]), });
		TERMINALS[7].addFollower(TERMINALS[28], EMPTY_LINK_ARRAY);
		TERMINALS[28].addFollower(TERMINALS[8], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[11]), });
		TERMINALS[28].addFollower(TERMINALS[29], EMPTY_LINK_ARRAY);
		TERMINALS[29].addFollower(TERMINALS[30], EMPTY_LINK_ARRAY);
		TERMINALS[30].addFollower(TERMINALS[31], EMPTY_LINK_ARRAY);
		TERMINALS[31].addFollower(TERMINALS[6], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]), });
		TERMINALS[31].addFollower(TERMINALS[7], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]), });
		TERMINALS[31].addFollower(TERMINALS[8], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]), });
		TERMINALS[31].addFollower(TERMINALS[3], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]), });
		TERMINALS[31].addFollower(TERMINALS[4], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]), });
		TERMINALS[31].addFollower(TERMINALS[27], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getTimeParameter(), FEATURES[12]), });
		TERMINALS[31].addFollower(TERMINALS[24], EMPTY_LINK_ARRAY);
		TERMINALS[27].addFollower(TERMINALS[32], EMPTY_LINK_ARRAY);
		TERMINALS[32].addFollower(TERMINALS[14], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNumberLiteral(), FEATURES[13]), });
		TERMINALS[19].addFollower(TERMINALS[27], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getTimeParameter(), FEATURES[12]), });
		TERMINALS[19].addFollower(TERMINALS[6], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]), });
		TERMINALS[19].addFollower(TERMINALS[7], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]), });
		TERMINALS[19].addFollower(TERMINALS[8], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]), });
		TERMINALS[19].addFollower(TERMINALS[3], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]), });
		TERMINALS[19].addFollower(TERMINALS[4], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]), });
		TERMINALS[19].addFollower(TERMINALS[24], EMPTY_LINK_ARRAY);
		TERMINALS[34].addFollower(TERMINALS[35], EMPTY_LINK_ARRAY);
		TERMINALS[35].addFollower(TERMINALS[36], EMPTY_LINK_ARRAY);
		TERMINALS[36].addFollower(TERMINALS[37], EMPTY_LINK_ARRAY);
		TERMINALS[36].addFollower(TERMINALS[38], EMPTY_LINK_ARRAY);
		TERMINALS[36].addFollower(TERMINALS[33], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateDefinition(), FEATURES[14]), });
		TERMINALS[37].addFollower(TERMINALS[39], EMPTY_LINK_ARRAY);
		TERMINALS[38].addFollower(TERMINALS[39], EMPTY_LINK_ARRAY);
		TERMINALS[39].addFollower(TERMINALS[40], EMPTY_LINK_ARRAY);
		TERMINALS[40].addFollower(TERMINALS[41], EMPTY_LINK_ARRAY);
		TERMINALS[41].addFollower(TERMINALS[33], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateDefinition(), FEATURES[14]), });
		TERMINALS[8].addFollower(TERMINALS[42], EMPTY_LINK_ARRAY);
		TERMINALS[42].addFollower(TERMINALS[43], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getCaptionParameter(), FEATURES[15]), });
		TERMINALS[44].addFollower(TERMINALS[45], EMPTY_LINK_ARRAY);
		TERMINALS[44].addFollower(TERMINALS[46], EMPTY_LINK_ARRAY);
		TERMINALS[45].addFollower(TERMINALS[46], EMPTY_LINK_ARRAY);
		TERMINALS[46].addFollower(TERMINALS[6], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), FEATURES[0]), });
		TERMINALS[46].addFollower(TERMINALS[7], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), FEATURES[1]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), FEATURES[0]), });
		TERMINALS[46].addFollower(TERMINALS[8], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), FEATURES[2]), new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), FEATURES[0]), });
		TERMINALS[46].addFollower(TERMINALS[3], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), FEATURES[3]), });
		TERMINALS[46].addFollower(TERMINALS[4], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(), FEATURES[4]), });
		TERMINALS[46].addFollower(TERMINALS[33], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateDefinition(), FEATURES[16]), });
		TERMINALS[43].addFollower(TERMINALS[47], EMPTY_LINK_ARRAY);
		TERMINALS[47].addFollower(TERMINALS[11], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNameLiteral(), FEATURES[17]), });
		TERMINALS[47].addFollower(TERMINALS[22], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getTextLiteral(), FEATURES[17]), });
		TERMINALS[20].addFollower(TERMINALS[43], new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] {new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getCaptionParameter(), FEATURES[18]), });
		TERMINALS[20].addFollower(TERMINALS[44], EMPTY_LINK_ARRAY);
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
