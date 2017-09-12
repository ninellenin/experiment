/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.util;

/**
 * Class SceTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.emftext.language.presentation.resource.sce.util.SceResourceUtil.
 */
public class SceTextResourceUtil {
	
	/**
	 * Use
	 * org.emftext.language.presentation.resource.sce.util.SceResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated	
	public static org.emftext.language.presentation.resource.sce.mopp.SceResource getResource(org.eclipse.core.resources.IFile file) {
		return new org.emftext.language.presentation.resource.sce.util.SceEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.emftext.language.presentation.resource.sce.util.SceResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated	
	public static org.emftext.language.presentation.resource.sce.mopp.SceResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.emftext.language.presentation.resource.sce.util.SceResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.emftext.language.presentation.resource.sce.util.SceResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated	
	public static org.emftext.language.presentation.resource.sce.mopp.SceResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.emftext.language.presentation.resource.sce.util.SceResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.emftext.language.presentation.resource.sce.util.SceResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated	
	public static org.emftext.language.presentation.resource.sce.mopp.SceResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.emftext.language.presentation.resource.sce.util.SceResourceUtil.getResource(uri, options);
	}
	
}
