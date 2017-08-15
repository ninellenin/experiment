/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.analysis;

public class FeatureTypeReferenceResolver implements org.emftext.language.presentation.resource.sce.ISceReferenceResolver<org.emftext.language.presentation.Feature, org.emftext.language.presentation.Type> {
	
	private org.emftext.language.presentation.resource.sce.analysis.SceDefaultResolverDelegate<org.emftext.language.presentation.Feature, org.emftext.language.presentation.Type> delegate = new org.emftext.language.presentation.resource.sce.analysis.SceDefaultResolverDelegate<org.emftext.language.presentation.Feature, org.emftext.language.presentation.Type>();
	
	public void resolve(String identifier, org.emftext.language.presentation.Feature container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.presentation.resource.sce.ISceReferenceResolveResult<org.emftext.language.presentation.Type> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.emftext.language.presentation.Type element, org.emftext.language.presentation.Feature container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
