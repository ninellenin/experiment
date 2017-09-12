/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.ui;

public class SceOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(org.emftext.language.presentation.resource.sce.ui.SceOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new org.emftext.language.presentation.resource.sce.ui.SceOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.emftext.language.presentation.resource.sce.ui.SceOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.presentation.resource.sce.ui.SceOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.presentation.resource.sce.ui.SceOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.emftext.language.presentation.resource.sce.ui.SceOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.emftext.language.presentation.resource.sce.ui.SceOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
