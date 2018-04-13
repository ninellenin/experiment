package standalone.xml2model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import standalone.utils.Utils;


public class Xml2Model {
	ResourceFactoryImpl resourceFactory;
	
	public Xml2Model(ResourceFactoryImpl factory) {
		resourceFactory = factory;
	}
	public XMIResource eObject2XMI(EObject root) {
		XMIResourceImpl xmiResource = new XMIResourceImpl();
		xmiResource.getContents().add(root);
		
		return xmiResource;
	}
	
	public Resource getResource(URI uri) {		
		Resource resource = resourceFactory.createResource(uri);
		try {
			resource.load(null);
		} catch (IOException e) {
			System.out.println("Error loading resource with URI " + uri);
		}
		
		return resource;
	}
	
	public void transform(String from, String to) {
		try {
			OutputStream outputStream = new FileOutputStream(Utils.getAbsolutePath(to));
			transform(from, outputStream);
		} catch (FileNotFoundException e) {
			System.out.println("Error transformation " + from + " to " + to);
			e.printStackTrace();
		}
		
	}

	public void transform(String from, OutputStream to) {
		try {
			Resource resource = getResource(Utils.getEmfURI(from));
			resource.load(null);
			XMIResource xmiResource = eObject2XMI(resource.getContents().get(0));
			xmiResource.save(to, null);
		} catch (IOException e) {
			System.out.println("Error transformation between input and output streams.");
			e.printStackTrace();
		}
	}	
}
