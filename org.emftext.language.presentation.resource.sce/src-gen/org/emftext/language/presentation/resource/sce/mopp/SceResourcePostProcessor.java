/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce.mopp;

public class SceResourcePostProcessor implements org.emftext.language.Presentation.resource.sce.ISceResourcePostProcessor {
	
	public void process(org.emftext.language.Presentation.resource.sce.mopp.SceResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
