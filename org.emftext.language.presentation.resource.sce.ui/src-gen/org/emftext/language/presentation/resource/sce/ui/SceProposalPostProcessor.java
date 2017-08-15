/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class SceProposalPostProcessor {
	
	public java.util.List<org.emftext.language.presentation.resource.sce.ui.SceCompletionProposal> process(java.util.List<org.emftext.language.presentation.resource.sce.ui.SceCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
