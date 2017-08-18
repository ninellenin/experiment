/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package standalone.epsilon;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

import standalone.Model;

public abstract class EpsilonStandalone {
	
	protected IEolExecutableModule module;
	protected List<Variable> parameters = new ArrayList<Variable>();
	
	protected Object result;
	
	public abstract IEolExecutableModule createModule();
	
	public abstract String getSource() throws Exception;
	
	public abstract List<IModel> getModels() throws Exception;
	
	public void postProcess() {};
	
	public void preProcess() {};
	
	public void execute() throws Exception {
		
		module = createModule();
		module.parse(Model.class.getResource(getSource()).toURI());
		
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			return;
		}
		
		for (IModel model : getModels()) {
			module.getContext().getModelRepository().addModel(model);
		}
		
		for (Variable parameter : parameters) {
			module.getContext().getFrameStack().put(parameter);
		}
		
		preProcess();
		result = execute(module);
		postProcess();
		
		module.getContext().getModelRepository().dispose();
	}
	
	public List<Variable> getParameters() {
		return parameters;
	}
	
	protected Object execute(IEolExecutableModule module) 
			throws EolRuntimeException {
		return module.execute();
	}
	
	protected EmfModel createEmfModel(Model model, boolean readOnLoad, boolean storedOnDisposal) {
		EmfModel emfModel = new EmfModel();
		emfModel.setName(model.getName());
		emfModel.setModelFileUri(URI.createFileURI(model.getModel()));
		emfModel.setMetamodelUri(model.getMetamodelUri());
		emfModel.setReadOnLoad(readOnLoad);
		emfModel.setStoredOnDisposal(storedOnDisposal);
		try {
			emfModel.load();
		} catch (EolModelLoadingException e1) {
			System.err.println(String.format("Error loading model \"%s\".", model.getModel()));
			e1.printStackTrace();
		}
		
		return emfModel;
	}
	
	protected EmfModel createInputEmfModel(Model model) {
		return createEmfModel(model, true, false);
	}
	
	protected EmfModel createOutputEmfModel(Model model) {
		return createEmfModel(model, false, true);
	}
}