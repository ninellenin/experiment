/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface ISceCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
