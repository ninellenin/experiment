/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.grammar;

public class SceContainment extends org.emftext.language.presentation.resource.sce.grammar.SceTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public SceContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.emftext.language.presentation.resource.sce.grammar.SceCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = org.emftext.language.presentation.resource.sce.util.SceStringUtil.explode(allowedTypes, ", ", new org.emftext.language.presentation.resource.sce.ISceFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
