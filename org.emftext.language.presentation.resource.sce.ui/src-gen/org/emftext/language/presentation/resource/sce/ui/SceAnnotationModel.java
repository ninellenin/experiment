/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.ui;

public class SceAnnotationModel extends org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel {
	
	public SceAnnotationModel(org.eclipse.core.resources.IResource resource) {
		super(resource);
	}
	
	protected org.eclipse.ui.texteditor.MarkerAnnotation createMarkerAnnotation(org.eclipse.core.resources.IMarker marker) {
		return new org.emftext.language.presentation.resource.sce.ui.SceMarkerAnnotation(marker);
	}
	
}
