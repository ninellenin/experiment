/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.ui;

public class SceOutlinePageAutoExpandAction extends org.emftext.language.presentation.resource.sce.ui.AbstractSceOutlinePageAction {
	
	public SceOutlinePageAutoExpandAction(org.emftext.language.presentation.resource.sce.ui.SceOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
