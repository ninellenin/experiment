package standalone.epsilon;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;

import standalone.Model;
import standalone.utils.Utils;

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
		// parse Epsilon transformation with URI
		module.parse(Utils.getURI(getSource()));
		
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
	
	protected EmfModel loadEmfModel(EmfModel emfModel, boolean readOnLoad, boolean storedOnDisposal) { 
		emfModel.setReadOnLoad(readOnLoad);
		emfModel.setStoredOnDisposal(storedOnDisposal);
		try {
			emfModel.load();
		} catch (EolModelLoadingException e1) {
			System.err.println(String.format("Error loading model \"%s\".", emfModel.getName()));
			e1.printStackTrace();
		}
		
		return emfModel;
	}
	
	protected EmfModel createEmfModel(Model model) {
		EmfModel emfModel = new EmfModel();
		emfModel.setName(model.getName());
		emfModel.setModelFileUri(URI.createFileURI(model.getModel()));
		emfModel.setMetamodelUri(model.getMetamodelUri());
		
		return emfModel;
	}
	
	protected EmfModel createInMemoryEmfModel(Model model, Resource modelImpl) {
		InMemoryEmfModel emfModel = new InMemoryEmfModel(model.getModel(), modelImpl);
		emfModel.setMetamodelUri(model.getMetamodelUri());
		
		return emfModel;
	}
	
	protected EmfModel createInputEmfModel(Model model) {
		EmfModel emfModel = createEmfModel(model);
		loadEmfModel(emfModel, true, false);
		
		return emfModel;
	}	
	
	protected EmfModel createOutputEmfModel(Model model) {
		EmfModel emfModel = createEmfModel(model);
		loadEmfModel(emfModel, false, true);
		
		return emfModel;
	}
	
	protected EmfModel createInputInMemoryEmfModel(Model model, Resource resource) {
		EmfModel emfModel = createInMemoryEmfModel(model, resource);
		loadEmfModel(emfModel, true, false);
		
		return emfModel;
	}
}