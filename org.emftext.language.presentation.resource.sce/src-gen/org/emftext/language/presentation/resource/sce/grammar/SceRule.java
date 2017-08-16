/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class SceRule extends org.emftext.language.Presentation.resource.sce.grammar.SceSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public SceRule(org.eclipse.emf.ecore.EClass metaclass, org.emftext.language.Presentation.resource.sce.grammar.SceChoice choice, org.emftext.language.Presentation.resource.sce.grammar.SceCardinality cardinality) {
		super(cardinality, new org.emftext.language.Presentation.resource.sce.grammar.SceSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.emftext.language.Presentation.resource.sce.grammar.SceChoice getDefinition() {
		return (org.emftext.language.Presentation.resource.sce.grammar.SceChoice) getChildren()[0];
	}
	
}

