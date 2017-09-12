/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

public class SceProblem implements org.emftext.language.presentation.resource.sce.ISceProblem {
	
	private String message;
	private org.emftext.language.presentation.resource.sce.SceEProblemType type;
	private org.emftext.language.presentation.resource.sce.SceEProblemSeverity severity;
	private java.util.Collection<org.emftext.language.presentation.resource.sce.ISceQuickFix> quickFixes;
	
	public SceProblem(String message, org.emftext.language.presentation.resource.sce.SceEProblemType type, org.emftext.language.presentation.resource.sce.SceEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.emftext.language.presentation.resource.sce.ISceQuickFix>emptySet());
	}
	
	public SceProblem(String message, org.emftext.language.presentation.resource.sce.SceEProblemType type, org.emftext.language.presentation.resource.sce.SceEProblemSeverity severity, org.emftext.language.presentation.resource.sce.ISceQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public SceProblem(String message, org.emftext.language.presentation.resource.sce.SceEProblemType type, org.emftext.language.presentation.resource.sce.SceEProblemSeverity severity, java.util.Collection<org.emftext.language.presentation.resource.sce.ISceQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.emftext.language.presentation.resource.sce.ISceQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.emftext.language.presentation.resource.sce.SceEProblemType getType() {
		return type;
	}
	
	public org.emftext.language.presentation.resource.sce.SceEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.emftext.language.presentation.resource.sce.ISceQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
