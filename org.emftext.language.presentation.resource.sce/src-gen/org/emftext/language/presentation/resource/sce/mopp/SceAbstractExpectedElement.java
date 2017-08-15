/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class SceAbstractExpectedElement implements org.emftext.language.presentation.resource.sce.ISceExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<org.emftext.language.presentation.resource.sce.util.ScePair<org.emftext.language.presentation.resource.sce.ISceExpectedElement, org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[]>> followers = new java.util.LinkedHashSet<org.emftext.language.presentation.resource.sce.util.ScePair<org.emftext.language.presentation.resource.sce.ISceExpectedElement, org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[]>>();
	
	public SceAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.emftext.language.presentation.resource.sce.ISceExpectedElement follower, org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] path) {
		followers.add(new org.emftext.language.presentation.resource.sce.util.ScePair<org.emftext.language.presentation.resource.sce.ISceExpectedElement, org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.emftext.language.presentation.resource.sce.util.ScePair<org.emftext.language.presentation.resource.sce.ISceExpectedElement, org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
