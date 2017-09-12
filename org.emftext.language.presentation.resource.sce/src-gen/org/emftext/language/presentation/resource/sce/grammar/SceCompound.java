/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.grammar;

public class SceCompound extends org.emftext.language.presentation.resource.sce.grammar.SceSyntaxElement {
	
	public SceCompound(org.emftext.language.presentation.resource.sce.grammar.SceChoice choice, org.emftext.language.presentation.resource.sce.grammar.SceCardinality cardinality) {
		super(cardinality, new org.emftext.language.presentation.resource.sce.grammar.SceSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
