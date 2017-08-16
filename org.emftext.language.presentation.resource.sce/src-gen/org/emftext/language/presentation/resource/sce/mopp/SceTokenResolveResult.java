/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce.mopp;

/**
 * A basic implementation of the ITokenResolveResult interface.
 */
public class SceTokenResolveResult implements org.emftext.language.Presentation.resource.sce.ISceTokenResolveResult {
	
	private String errorMessage;
	private Object resolvedToken;
	
	public SceTokenResolveResult() {
		super();
		clear();
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Object getResolvedToken() {
		return resolvedToken;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void setResolvedToken(Object resolvedToken) {
		this.resolvedToken = resolvedToken;
	}
	
	public void clear() {
		errorMessage = "Can't resolve token.";
		resolvedToken = null;
	}
	
}
