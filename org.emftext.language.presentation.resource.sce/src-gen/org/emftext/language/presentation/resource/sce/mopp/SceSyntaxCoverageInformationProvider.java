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
			org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(),
			org.emftext.language.presentation.PresentationPackage.eINSTANCE.getHeader(),
			org.emftext.language.presentation.PresentationPackage.eINSTANCE.getSDL(),
			org.emftext.language.presentation.PresentationPackage.eINSTANCE.getPCL(),
			org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(),
			org.emftext.language.presentation.PresentationPackage.eINSTANCE.getNumberLiteral(),
			org.emftext.language.presentation.PresentationPackage.eINSTANCE.getNameLiteral(),
			org.emftext.language.presentation.PresentationPackage.eINSTANCE.getBooleanLiteral(),
			org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(),
			org.emftext.language.presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(),
		};
	}
	
}
