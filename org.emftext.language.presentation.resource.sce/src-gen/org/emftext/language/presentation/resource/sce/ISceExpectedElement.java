/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface ISceExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public org.emftext.language.presentation.resource.sce.grammar.SceSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(org.emftext.language.presentation.resource.sce.ISceExpectedElement follower, org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<org.emftext.language.presentation.resource.sce.util.ScePair<org.emftext.language.presentation.resource.sce.ISceExpectedElement, org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[]>> getFollowers();
	
}
