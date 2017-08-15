/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce;

public interface ISceProblem {
	public String getMessage();
	public org.emftext.language.presentation.resource.sce.SceEProblemSeverity getSeverity();
	public org.emftext.language.presentation.resource.sce.SceEProblemType getType();
	public java.util.Collection<org.emftext.language.presentation.resource.sce.ISceQuickFix> getQuickFixes();
}
