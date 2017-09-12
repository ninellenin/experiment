/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.grammar;

public class SceSequence extends org.emftext.language.presentation.resource.sce.grammar.SceSyntaxElement {
	
	public SceSequence(org.emftext.language.presentation.resource.sce.grammar.SceCardinality cardinality, org.emftext.language.presentation.resource.sce.grammar.SceSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.emftext.language.presentation.resource.sce.util.SceStringUtil.explode(getChildren(), " ");
	}
	
}
