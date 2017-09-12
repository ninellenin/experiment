/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

public class SceSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(),
			org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(),
			org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(),
			org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getPCL(),
			org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getScenarioNameParameter(),
			org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getActiveButtonsParameter(),
			org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter(),
			org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNumberLiteral(),
			org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getNameLiteral(),
			org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getBooleanLiteral(),
			org.emftext.language.presentation.literal.literalPackage.eINSTANCE.getTextLiteral(),
			org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(),
			org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getStimulusList(),
			org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(),
			org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(),
			org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getTimeParameter(),
			org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(),
			org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateDefinition(),
			org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(),
			org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getCaptionParameter(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(),
		};
	}
	
}
