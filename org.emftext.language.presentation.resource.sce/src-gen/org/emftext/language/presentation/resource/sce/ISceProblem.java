/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce;

public interface ISceProblem {
	public String getMessage();
	public org.emftext.language.Presentation.resource.sce.SceEProblemSeverity getSeverity();
	public org.emftext.language.Presentation.resource.sce.SceEProblemType getType();
	public java.util.Collection<org.emftext.language.Presentation.resource.sce.ISceQuickFix> getQuickFixes();
}
