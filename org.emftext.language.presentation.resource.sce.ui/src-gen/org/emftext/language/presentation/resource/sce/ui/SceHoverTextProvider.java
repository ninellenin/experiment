/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.ui;

public class SceHoverTextProvider implements org.emftext.language.presentation.resource.sce.ISceHoverTextProvider {
	
	private org.emftext.language.presentation.resource.sce.ui.SceDefaultHoverTextProvider defaultProvider = new org.emftext.language.presentation.resource.sce.ui.SceDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
