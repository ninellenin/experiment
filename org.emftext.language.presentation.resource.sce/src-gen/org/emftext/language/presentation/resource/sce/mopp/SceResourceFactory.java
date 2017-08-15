/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

public class SceResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public SceResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.emftext.language.presentation.resource.sce.mopp.SceResource(uri);
	}
	
}
