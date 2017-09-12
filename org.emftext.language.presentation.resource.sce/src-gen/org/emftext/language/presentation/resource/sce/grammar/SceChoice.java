/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.grammar;

public class SceChoice extends org.emftext.language.presentation.resource.sce.grammar.SceSyntaxElement {
	
	public SceChoice(org.emftext.language.presentation.resource.sce.grammar.SceCardinality cardinality, org.emftext.language.presentation.resource.sce.grammar.SceSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.emftext.language.presentation.resource.sce.util.SceStringUtil.explode(getChildren(), "|");
	}
	
}
