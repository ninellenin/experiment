package standalone.epsilon.etl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;

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
