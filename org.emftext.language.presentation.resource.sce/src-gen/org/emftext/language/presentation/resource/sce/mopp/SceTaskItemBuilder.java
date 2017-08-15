/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

/**
 * The SceTaskItemBuilder is used to find task items in text documents. The
 * current implementation uses the generated lexer and the TaskItemDetector to
 * detect task items. This class is called by the BuilderAdapter, which runs both
 * this builder and the default builder that is intended to be customized.
 */
public class SceTaskItemBuilder {
	
	public void build(org.eclipse.core.resources.IFile resource, org.eclipse.emf.ecore.resource.ResourceSet resourceSet, org.eclipse.core.runtime.IProgressMonitor monitor) {
		monitor.setTaskName("Searching for task items");
		new org.emftext.language.presentation.resource.sce.mopp.SceMarkerHelper().removeAllMarkers(resource, org.eclipse.core.resources.IMarker.TASK);
		if (isInBinFolder(resource)) {
			return;
		}
		java.util.List<org.emftext.language.presentation.resource.sce.mopp.SceTaskItem> taskItems = new java.util.ArrayList<org.emftext.language.presentation.resource.sce.mopp.SceTaskItem>();
		org.emftext.language.presentation.resource.sce.mopp.SceTaskItemDetector taskItemDetector = new org.emftext.language.presentation.resource.sce.mopp.SceTaskItemDetector();
		try {
			java.io.InputStream inputStream = resource.getContents();
			String content = org.emftext.language.presentation.resource.sce.util.SceStreamUtil.getContent(inputStream);
			org.emftext.language.presentation.resource.sce.ISceTextScanner lexer = new org.emftext.language.presentation.resource.sce.mopp.SceMetaInformation().createLexer();
			lexer.setText(content);
			
			org.emftext.language.presentation.resource.sce.ISceTextToken nextToken = lexer.getNextToken();
			while (nextToken != null) {
				String text = nextToken.getText();
				taskItems.addAll(taskItemDetector.findTaskItems(text, nextToken.getLine(), nextToken.getOffset()));
				nextToken = lexer.getNextToken();
			}
		} catch (java.io.IOException e) {
			org.emftext.language.presentation.resource.sce.mopp.ScePlugin.logError("Exception while searching for task items", e);
		} catch (org.eclipse.core.runtime.CoreException e) {
			org.emftext.language.presentation.resource.sce.mopp.ScePlugin.logError("Exception while searching for task items", e);
		}
		
		for (org.emftext.language.presentation.resource.sce.mopp.SceTaskItem taskItem : taskItems) {
			java.util.Map<String, Object> markerAttributes = new java.util.LinkedHashMap<String, Object>();
			markerAttributes.put(org.eclipse.core.resources.IMarker.USER_EDITABLE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.DONE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.LINE_NUMBER, taskItem.getLine());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_START, taskItem.getCharStart());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_END, taskItem.getCharEnd());
			markerAttributes.put(org.eclipse.core.resources.IMarker.MESSAGE, taskItem.getMessage());
			new org.emftext.language.presentation.resource.sce.mopp.SceMarkerHelper().createMarker(resource, org.eclipse.core.resources.IMarker.TASK, markerAttributes);
		}
	}
	
	public String getBuilderMarkerId() {
		return org.eclipse.core.resources.IMarker.TASK;
	}
	
	public boolean isInBinFolder(org.eclipse.core.resources.IFile resource) {
		org.eclipse.core.resources.IContainer parent = resource.getParent();
		while (parent != null) {
			if ("bin".equals(parent.getName())) {
				return true;
			}
			parent = parent.getParent();
		}
		return false;
	}
	
}
