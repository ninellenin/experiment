package standalone.epsilon.etl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;
import org.psychopy.experiment.util.experimentResourceFactoryImpl;
import org.psychopy.experiment.util.experimentResourceImpl;

import standalone.Model;
import standalone.epsilon.EpsilonStandalone;
import standalone.utils.Utils;

public class EtlExecutor extends EpsilonStandalone {
	protected Model source;
	protected Model target;
	protected String transformation;
	
	public EtlExecutor(Model source, Model target, String transformation) {
		this.source = source;
		this.target = target;
		this.transformation = transformation;
	};
	
	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createInputEmfModel(source));
		/*//InMemoryEmfModel
		experimentResourceFactoryImpl resourceFactory = new experimentResourceFactoryImpl();
		Resource experimentResource = resourceFactory.createResource(Utils.getEmfURI(source.getModel()));
		Map<Object, Object> options = new HashMap<Object, Object>();
		experimentResource.load(options);
		System.out.println(".....");
		models.add(createInputInMemoryEmfModel(source, experimentResource));*/
		models.add(createOutputEmfModel(target));
		
		return models;
	}

	@Override
	public String getSource() throws Exception {
		String path = Utils.getAbsolutePath(transformation);
		return path;
	}

	@Override
	public void postProcess() {
		
	}
}
