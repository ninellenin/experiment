package standalone;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;

import standalone.utils.Utils;

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
	/*
	public String toAbsolutePath(String relativePath) {
		File file = new File(relativePath);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(relativePath);
		//String absolutePath = getClass().getResource(relativePath).getPath();
		return uri.path();
	}*/
	
	protected void setName(String name) {
		this.name = name;
	}
	protected void setModel(String model) {
		this.model = Utils.getAbsolutePath(model);
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
