package standalone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.emftext.language.presentation.scenario.scenarioPackage;
import org.emftext.language.presentation.resource.sce.mopp.SceResourceFactory;

import org.psychopy.experiment.experimentPackage;
import org.psychopy.experiment.util.experimentResourceFactoryImpl;

import standalone.emftext.DomainSpecificLanguage;
import standalone.emftext.EmfTextExecutor;
import standalone.epsilon.etl.EtlExecutor;
import standalone.utils.Utils;
import standalone.xml2model.Xml2Model;

public class Executor {
	protected static String CONFIGURATION_NOT_FOUND_MESSAGE = "Configuration file \"%s\" not found.";
	protected static String CONFIGURATION_NOT_LOADED = "Configuration \"\" wasn't loaded.";
	protected static String DEFAULT_CONFIGURATION = "configuration.ini";
	protected static String EPSILON_TRANSFORMATION_FAILED_MESSAGE = "Epsilon transformation \"%s\" failed.";
	protected static String GENERATION_TEXT_FAILED = "Text generation failed.";
	protected static String PSYCHOPY = "PSYCHOPY";
	protected static String PIM = "EXPERIMENT";
	protected static String PROPERTY_NOT_FOUND_EXCEPTION = "Property \"%s\" not found.";
	protected static String PSM = "SCENARIO";
	protected static String SPLIT = ";";
	protected static String TEXT = "OUTPUT";
	protected static String TRANSFORMATION = "TRANSFORMATION";
	
	protected Properties configuration;
	protected boolean configurationLoaded;
	protected Model platformIndependentModel;
	protected Model platformSpecificModel;
	protected String output;
	
	
	public Executor(String configurationFile) {
		configurationLoaded = false;
		
		loadConfiguration(configurationFile);
		if (!configurationLoaded) {
			printErrorMessage(String.format(CONFIGURATION_NOT_LOADED, configurationFile));
		}
	}
	
	public static void main(String[] args) throws Exception {
		Executor executor = new Executor(DEFAULT_CONFIGURATION);
		
		executor.executeXML2ModelTransformation();
		executor.executePIM2PSMTransformation();
		executor.executeTextGeneration();
	}

	public void loadConfiguration(String configurationFile) {
		configuration = new Properties();
		try {
			configuration.load(new FileInputStream(new File(configurationFile)));
			configurationLoaded = true;
		} catch (FileNotFoundException e) {
			printErrorMessage(String.format(CONFIGURATION_NOT_FOUND_MESSAGE, configurationFile));
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getProperty(String name) {
		if (configurationLoaded) {
			try {
				return configuration.getProperty(name);
			} catch (NullPointerException exception) {
				printErrorMessage(String.format(PROPERTY_NOT_FOUND_EXCEPTION, name));
			}
		}
		return null;
	}
	
	public String[] getProperties(String name) {
		String properties = getProperty(name);
		if (properties != null) {
			return properties.split(SPLIT);
		}
		return null;
	}
	
	public void executeXML2ModelTransformation() {
		Xml2Model psyExp2Model = new Xml2Model(new experimentResourceFactoryImpl());
		String psyExperiment = getProperty(PSYCHOPY);
		String[] model  = getProperties(PIM);
		psyExp2Model.transform(psyExperiment, model[1]);
	}
	
	public void executePIM2PSMTransformation() {
		String[] model  = getProperties(PIM);
		platformIndependentModel = new Model(model[0], model[1], experimentPackage.eINSTANCE);
		model = getProperties(PSM);
		platformSpecificModel = new Model(model[0], model[1], scenarioPackage.eINSTANCE);
		String transformation = getProperty(TRANSFORMATION);

		try {
			new EtlExecutor(platformIndependentModel, platformSpecificModel, transformation).execute();
		} catch (Exception e) {
			printErrorMessage(String.format(EPSILON_TRANSFORMATION_FAILED_MESSAGE, transformation));
			e.printStackTrace();
		}
	}

	public void executeTextGeneration() {
		DomainSpecificLanguage presentationDsl = new DomainSpecificLanguage("sce", new SceResourceFactory(), scenarioPackage.eINSTANCE);
		String text = configuration.getProperty(TEXT);
		text = Utils.getAbsolutePath(text);
		try {
			new EmfTextExecutor().generateText(platformSpecificModel, text, presentationDsl);
		} catch (IOException e) {
			printErrorMessage(GENERATION_TEXT_FAILED);
			e.printStackTrace();
		}
	}
	
	protected void printErrorMessage(String message) {
		System.out.println(String.format("ERROR: %s", message));
	}
}
