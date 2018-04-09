package standalone.xml2model;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mapping.xsd2ecore.util.XSD2EcoreResourceImpl;
import org.psychopy.experiment.util.experimentResourceFactoryImpl;

public class Xml2Model {
	String toAbsolutePath(String relativePath) {
		return getClass().getResource(relativePath).getPath();
	}
	
	Resource toModel(String relativePath) {
		System.out.println("REL: " + relativePath);
		String absolutePath = toAbsolutePath(relativePath);
		System.out.println("ABS: " + absolutePath);
		URI resourceURI = URI.createFileURI(absolutePath);
		experimentResourceFactoryImpl resourceFactory = new experimentResourceFactoryImpl();
		Resource resource = resourceFactory.createResource(resourceURI);
		Map<String, String> options = new HashMap<String, String>();
		try {
			resource.load(options);
			//XSD2EcoreResourceImpl xsd2ecore = new XSD2EcoreResourceImpl(resource.getURI());
			///xsd2ecore.load(options);
			OutputStream outputStream = new FileOutputStream("out.xml");
			//xsd2ecore.doSave(outputStream, options);
			resource.save(outputStream, options);
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
