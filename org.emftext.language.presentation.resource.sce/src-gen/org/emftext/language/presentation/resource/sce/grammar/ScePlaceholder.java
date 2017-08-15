/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class ScePlaceholder extends org.emftext.language.presentation.resource.sce.grammar.SceTerminal {
	
	private final String tokenName;
	
	public ScePlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.emftext.language.presentation.resource.sce.grammar.SceCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
