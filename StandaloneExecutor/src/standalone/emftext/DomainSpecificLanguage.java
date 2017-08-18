package standalone.emftext;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

public class DomainSpecificLanguage {
	protected String extension;
	protected Resource.Factory resourceFactory;
	protected EPackage ePackage;
	
	public DomainSpecificLanguage(String extension, Resource.Factory resourceFactory, EPackage ePackage) {
		setExtension(extension);
		setResourceFactory(resourceFactory);
		setEPackage(ePackage);
	}
	
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public void setResourceFactory(Resource.Factory resourceFactory) {
		this.resourceFactory = resourceFactory; 
	}
	public void setEPackage(EPackage ePackage) {
		this.ePackage = ePackage;
	}
	
	public String getExtension() {
		return this.extension;
	}
	public Resource.Factory getResourceFactory() {
		return this.resourceFactory;
	}
	public EPackage getEPackage() {
		return this.ePackage;
	}
}
