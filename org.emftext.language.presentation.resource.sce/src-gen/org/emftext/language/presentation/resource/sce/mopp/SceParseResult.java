/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

public class SceParseResult implements org.emftext.language.presentation.resource.sce.ISceParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.emftext.language.presentation.resource.sce.ISceCommand<org.emftext.language.presentation.resource.sce.ISceTextResource>> commands = new java.util.ArrayList<org.emftext.language.presentation.resource.sce.ISceCommand<org.emftext.language.presentation.resource.sce.ISceTextResource>>();
	
	public SceParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.emftext.language.presentation.resource.sce.ISceCommand<org.emftext.language.presentation.resource.sce.ISceTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
