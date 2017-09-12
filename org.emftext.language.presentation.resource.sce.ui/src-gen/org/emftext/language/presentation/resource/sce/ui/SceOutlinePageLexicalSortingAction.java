/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.ui;

public class SceOutlinePageLexicalSortingAction extends org.emftext.language.presentation.resource.sce.ui.AbstractSceOutlinePageAction {
	
	public SceOutlinePageLexicalSortingAction(org.emftext.language.presentation.resource.sce.ui.SceOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
