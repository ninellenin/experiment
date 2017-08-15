/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class SceKeyword extends org.emftext.language.presentation.resource.sce.grammar.SceSyntaxElement {
	
	private final String value;
	
	public SceKeyword(String value, org.emftext.language.presentation.resource.sce.grammar.SceCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
