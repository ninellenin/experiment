/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class SceExpectedCsString extends org.emftext.language.presentation.resource.sce.mopp.SceAbstractExpectedElement {
	
	private org.emftext.language.presentation.resource.sce.grammar.SceKeyword keyword;
	
	public SceExpectedCsString(org.emftext.language.presentation.resource.sce.grammar.SceKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public org.emftext.language.presentation.resource.sce.grammar.SceSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof SceExpectedCsString) {
			return getValue().equals(((SceExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
