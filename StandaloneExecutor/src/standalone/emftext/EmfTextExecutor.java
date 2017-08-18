package standalone.emftext;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;

import standalone.Model;

public class EmfTextExecutor {
	public EmfTextExecutor() {
	}
	
	public String getSource() throws Exception {
		return null;
	}
	
	public void postProcess() {};
	
	public void preProcess() {};
	
	public void generateText(Model source, String target, DomainSpecificLanguage dsl) throws IOException {
		 registerResourceFactory(dsl.getExtension(), dsl.getResourceFactory());
		 registerXMIResourceFactory();
		 ResourceSet resourceSet = new ResourceSetImpl();
			
		 EPackage.Registry.INSTANCE.put(dsl.getEPackage().getNsURI(), dsl.getEPackage());
		 Resource xmiResource = resourceSet.getResource(createFileURI(source.getModel()), true);
		 Resource dslResource = resourceSet.createResource(createFileURI(target));
		 
		 dslResource.getContents().addAll(xmiResource.getContents());
		 dslResource.save(null);
	}
	
	protected URI createFileURI(String relativePath) {
		return URI.createFileURI(getClass().getResource(relativePath).getPath());
	}
	
	protected void registerResourceFactory(String name, Object factory) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(name, factory);
	}
	
	protected void registerXMIResourceFactory() {
		registerResourceFactory(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	}
	
}