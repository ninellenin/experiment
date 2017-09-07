/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce.mopp;

public class SceSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(),
			org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(),
			org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(),
			org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPCL(),
			org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(),
			org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(),
			org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(),
			org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNumberLiteral(),
			org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getNameLiteral(),
			org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getBooleanLiteral(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(),
		};
	}
	
}
