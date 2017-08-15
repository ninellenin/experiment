/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.grammar;

public class SceLineBreak extends org.emftext.language.presentation.resource.sce.grammar.SceFormattingElement {
	
	private final int tabs;
	
	public SceLineBreak(org.emftext.language.presentation.resource.sce.grammar.SceCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
