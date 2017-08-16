/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce.ui;

public class SceUIMetaInformation extends org.emftext.language.Presentation.resource.sce.mopp.SceMetaInformation {
	
	public org.emftext.language.Presentation.resource.sce.ISceHoverTextProvider getHoverTextProvider() {
		return new org.emftext.language.Presentation.resource.sce.ui.SceHoverTextProvider();
	}
	
	public org.emftext.language.Presentation.resource.sce.ui.SceImageProvider getImageProvider() {
		return org.emftext.language.Presentation.resource.sce.ui.SceImageProvider.INSTANCE;
	}
	
	public org.emftext.language.Presentation.resource.sce.ui.SceColorManager createColorManager() {
		return new org.emftext.language.Presentation.resource.sce.ui.SceColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.emftext.language.Presentation.resource.sce.ISceTextResour
	 * ce, org.emftext.language.Presentation.resource.sce.ui.SceColorManager) instead.
	 */
	public org.emftext.language.Presentation.resource.sce.ui.SceTokenScanner createTokenScanner(org.emftext.language.Presentation.resource.sce.ui.SceColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.emftext.language.Presentation.resource.sce.ui.SceTokenScanner createTokenScanner(org.emftext.language.Presentation.resource.sce.ISceTextResource resource, org.emftext.language.Presentation.resource.sce.ui.SceColorManager colorManager) {
		return new org.emftext.language.Presentation.resource.sce.ui.SceTokenScanner(resource, colorManager);
	}
	
	public org.emftext.language.Presentation.resource.sce.ui.SceCodeCompletionHelper createCodeCompletionHelper() {
		return new org.emftext.language.Presentation.resource.sce.ui.SceCodeCompletionHelper();
	}
	
}
