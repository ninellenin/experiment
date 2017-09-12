/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

/**
 * A basic implementation of the
 * org.emftext.language.presentation.resource.sce.ISceElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class SceElementMapping<ReferenceType> implements org.emftext.language.presentation.resource.sce.ISceElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public SceElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
