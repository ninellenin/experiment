/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.ui;

public class SceOutlinePageTypeSortingAction extends org.emftext.language.presentation.resource.sce.ui.AbstractSceOutlinePageAction {
	
	public SceOutlinePageTypeSortingAction(org.emftext.language.presentation.resource.sce.ui.SceOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
