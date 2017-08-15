/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce;

/**
 * An interface used to access the result of parsing a document.
 */
public interface ISceParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.emftext.language.presentation.resource.sce.ISceCommand<org.emftext.language.presentation.resource.sce.ISceTextResource>> getPostParseCommands();
	
}
