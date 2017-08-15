/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class SceContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements org.emftext.language.presentation.resource.sce.ISceContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.emftext.language.presentation.resource.sce.ISceReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public SceContextDependentURIFragmentFactory(org.emftext.language.presentation.resource.sce.ISceReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.emftext.language.presentation.resource.sce.ISceContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new org.emftext.language.presentation.resource.sce.mopp.SceContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.emftext.language.presentation.resource.sce.ISceReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
