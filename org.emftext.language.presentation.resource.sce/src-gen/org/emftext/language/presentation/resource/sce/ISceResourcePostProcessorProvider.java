/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface ISceResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.emftext.language.Presentation.resource.sce.ISceResourcePostProcessor getResourcePostProcessor();
	
}
