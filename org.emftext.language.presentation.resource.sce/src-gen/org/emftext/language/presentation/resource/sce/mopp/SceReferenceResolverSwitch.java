/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

public class SceReferenceResolverSwitch implements org.emftext.language.presentation.resource.sce.ISceReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.emftext.language.presentation.resource.sce.ISceReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
	}
	
	public org.emftext.language.presentation.resource.sce.ISceReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> org.emftext.language.presentation.resource.sce.ISceReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, org.emftext.language.presentation.resource.sce.ISceReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.emftext.language.presentation.resource.sce.ISceOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new org.emftext.language.presentation.resource.sce.util.SceRuntimeUtil().logWarning("Found value with invalid type for option " + org.emftext.language.presentation.resource.sce.ISceOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.emftext.language.presentation.resource.sce.ISceReferenceResolver) {
			org.emftext.language.presentation.resource.sce.ISceReferenceResolver replacingResolver = (org.emftext.language.presentation.resource.sce.ISceReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.emftext.language.presentation.resource.sce.ISceDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.emftext.language.presentation.resource.sce.ISceDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			org.emftext.language.presentation.resource.sce.ISceReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.emftext.language.presentation.resource.sce.ISceReferenceCache) {
					org.emftext.language.presentation.resource.sce.ISceReferenceResolver nextResolver = (org.emftext.language.presentation.resource.sce.ISceReferenceResolver) next;
					if (nextResolver instanceof org.emftext.language.presentation.resource.sce.ISceDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.emftext.language.presentation.resource.sce.ISceDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.emftext.language.presentation.resource.sce.util.SceRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.presentation.resource.sce.ISceOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.presentation.resource.sce.ISceDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.emftext.language.presentation.resource.sce.util.SceRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.presentation.resource.sce.ISceOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.presentation.resource.sce.ISceDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
