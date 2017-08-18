package standalone;

import org.eclipse.emf.ecore.EPackage;

public class Model {
	protected String name;
	protected String model;
	protected String metamodelUri;
	
	public Model(String name, String model, EPackage ePackage) {
		setName(name);
		setModel(model);
		EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
		setMetamodelUri(ePackage.getNsURI());
	}
	
	public String toAbsolutePath(String relativePath) {
		return getClass().getResource(relativePath).getPath();
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	protected void setModel(String model) {
		this.model = toAbsolutePath(model);
	}
	protected void setMetamodelUri(String metamodel) {
		this.metamodelUri = metamodel;
	}
	
	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
	}
	public String getMetamodelUri() {
		return metamodelUri;
	}
}
