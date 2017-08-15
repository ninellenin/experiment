/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.grammar;

public class SceWhiteSpace extends org.emftext.language.presentation.resource.sce.grammar.SceFormattingElement {
	
	private final int amount;
	
	public SceWhiteSpace(int amount, org.emftext.language.presentation.resource.sce.grammar.SceCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}