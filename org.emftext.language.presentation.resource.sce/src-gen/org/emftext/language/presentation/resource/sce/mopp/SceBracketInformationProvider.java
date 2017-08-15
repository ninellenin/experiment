/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

public class SceBracketInformationProvider {
	
	public class BracketPair implements org.emftext.language.presentation.resource.sce.ISceBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<org.emftext.language.presentation.resource.sce.ISceBracketPair> getBracketPairs() {
		java.util.Collection<org.emftext.language.presentation.resource.sce.ISceBracketPair> result = new java.util.ArrayList<org.emftext.language.presentation.resource.sce.ISceBracketPair>();
		return result;
	}
	
}
