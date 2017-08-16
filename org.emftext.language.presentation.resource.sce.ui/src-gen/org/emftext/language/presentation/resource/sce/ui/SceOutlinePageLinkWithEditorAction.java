/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce.ui;

public class SceOutlinePageLinkWithEditorAction extends org.emftext.language.Presentation.resource.sce.ui.AbstractSceOutlinePageAction {
	
	public SceOutlinePageLinkWithEditorAction(org.emftext.language.Presentation.resource.sce.ui.SceOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
