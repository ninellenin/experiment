package standalone;

public class Model {
	protected String name;
	protected String model;
	protected String metamodel;
	
	public Model(String name, String model, String metamodel) {
		setName(name);
		setModel(model);
		setMetamodel(metamodel);
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	protected void setModel(String model) {
		this.model = model;
	}
	protected void setMetamodel(String metamodel) {
		this.metamodel = metamodel;
	}
	
	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
	}
	public String getMetamodel() {
		return metamodel;
	}
}
