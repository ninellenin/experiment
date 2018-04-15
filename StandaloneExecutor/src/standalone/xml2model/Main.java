package standalone.xml2model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.psychopy.experiment.DocumentRoot;
import org.psychopy.experiment.Experiment;
import org.psychopy.experiment.experimentFactory;
import org.psychopy.experiment.experimentPackage;
import org.psychopy.experiment.util.experimentResourceFactoryImpl;

import standalone.utils.Utils;

public class Main {

	public static void main(String[] args) {
		Xml2Model xml2Model = new Xml2Model(new experimentResourceFactoryImpl());
		xml2Model.transform(args[0], "out.xml");
	}

	public static void transformationTest(String[] args) {
		String path = args[0];
		File file = new File(path);
		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(path);
		
		/*
		DocumentRoot root = experimentFactory.eINSTANCE.createDocumentRoot();
		Experiment experiment = experimentFactory.eINSTANCE.createExperiment();
		Settings settings = experimentFactory.eINSTANCE.createSettings();
		Flow flow = experimentFactory.eINSTANCE.createFlow();
		Routines routines = experimentFactory.eINSTANCE.createRoutines();
		
		experiment.setSettings(settings);
		experiment.setFlow(flow);
		experiment.setRoutines(routines);
		root.setPsychoPy2experiment(experiment);*/
		
		try {
			Map<Object, Object> options = new HashMap<Object, Object>();
			OutputStream os = new FileOutputStream("out.xml");
			
			experimentResourceFactoryImpl expResourceFactory = new experimentResourceFactoryImpl();
			
			Resource resource = expResourceFactory.createResource(uri);
			resource.load(options);
			for (EObject obj: resource.getContents()) {
				Utils.printContent(obj);
			}
			DocumentRoot root = (DocumentRoot) resource.getContents().get(0);
			XMIResourceImpl xmiResource = new XMIResourceImpl();
			xmiResource.getContents().add(root);
			
			System.out.println(xmiResource.isLoaded());
			//resource.load(options);
			xmiResource.save(os, options);
			os.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void experimentTest(String[] args) {
		//Xml2Model xml2model = new Xml2Model();
		//Resource resource = xml2model.toModel("./simple.xml");
		

		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new experimentResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(experimentPackage.eNS_URI, 
			 experimentPackage.eINSTANCE);

		//
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
			.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
        
		// If there are no arguments, emit an appropriate usage message.
		//
		if (args.length == 0) {
			System.out.println("Enter a list of file paths or URIs that have content like this:");
			try {
				Resource resource = resourceSet.createResource(URI.createURI("http:///My.experiment"));
				DocumentRoot documentRoot = experimentFactory.eINSTANCE.createDocumentRoot();
				Experiment root = experimentFactory.eINSTANCE.createExperiment();
				documentRoot.setPsychoPy2experiment(root);
				resource.getContents().add(documentRoot);
				resource.save(System.out, null);
			}
			catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		else {
			// Iterate over all the arguments.
			//
			for (int i = 0; i < args.length; ++i) {
				// Construct the URI for the instance file.
				// The argument is treated as a file path only if it denotes an existing file.
				// Otherwise, it's directly treated as a URL.
				//
				File file = new File(args[i]);
				URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(args[i]);

				try {
					// Demand load resource for this file.
					//
					Resource resource = resourceSet.getResource(uri, true);
					System.out.println("Loaded " + uri);

					// Validate the contents of the loaded resource.
					//
					for (EObject eObject : resource.getContents()) {
						System.out.println(eObject.toString());
						Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
						if (diagnostic.getSeverity() != Diagnostic.OK) {
							System.out.println(diagnostic.toString());
						}
					}
					
					Map<Object, Object> options = new HashMap<Object, Object>();
					OutputStream outputStream = new FileOutputStream("out.xml");
					//options.put(XMLResource.OPTION_EXTENDED_META_DATA,new Boolean(true)); 
					//options.put(XMLResource.OPTION_DECLARE_XML,new Boolean(false));
					InMemoryEmfModel emfModel = new InMemoryEmfModel("Experiment", resource);
					emfModel.store(outputStream);
					System.out.println(emfModel.getName());
					//resource.save(outputStream, options);
					outputStream.close();
				}
				catch (RuntimeException exception) {
					System.out.println("Problem loading " + uri);
					exception.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
