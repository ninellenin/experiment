/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce.mopp;

public class SceTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public org.emftext.language.Presentation.resource.sce.ISceTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("begin".equals(tokenName)) {
			return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyle(new int[] {0x00, 0x80, 0x2A}, null, true, false, false, false);
		}
		if ("begin_pcl".equals(tokenName)) {
			return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyle(new int[] {0x00, 0x80, 0x2A}, null, true, false, false, false);
		}
		if ("SIGNED_INTEGER".equals(tokenName)) {
			return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyle(new int[] {0x0A, 0x45, 0x00}, null, false, false, false, false);
		}
		if ("BOOLEAN".equals(tokenName)) {
			return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyle(new int[] {0x0A, 0x45, 0x00}, null, false, false, false, false);
		}
		if ("=".equals(tokenName)) {
			return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyle(new int[] {0x00, 0x00, 0x5C}, null, true, false, false, false);
		}
		if (";".equals(tokenName)) {
			return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyle(new int[] {0x00, 0x00, 0x5C}, null, true, false, false, false);
		}
		if ("QUOTED_NAME".equals(tokenName)) {
			return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyle(new int[] {0x00, 0x00, 0x99}, null, false, true, false, false);
		}
		if ("scenario".equals(tokenName)) {
			return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("active_buttons".equals(tokenName)) {
			return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("button_codes".equals(tokenName)) {
			return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
