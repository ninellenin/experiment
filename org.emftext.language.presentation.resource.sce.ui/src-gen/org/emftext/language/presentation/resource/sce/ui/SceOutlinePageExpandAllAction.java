/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.ui;

public class SceOutlinePageExpandAllAction extends org.emftext.language.presentation.resource.sce.ui.AbstractSceOutlinePageAction {
	
	public SceOutlinePageExpandAllAction(org.emftext.language.presentation.resource.sce.ui.SceOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
