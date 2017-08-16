/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.Presentation.resource.sce.mopp;

public class SceMetaInformation implements org.emftext.language.Presentation.resource.sce.ISceMetaInformation {
	
	public String getSyntaxName() {
		return "sce";
	}
	
	public String getURI() {
		return "http://www.emftext.org/language/Presentation";
	}
	
	public org.emftext.language.Presentation.resource.sce.ISceTextScanner createLexer() {
		return new org.emftext.language.Presentation.resource.sce.mopp.SceAntlrScanner(new org.emftext.language.Presentation.resource.sce.mopp.SceLexer());
	}
	
	public org.emftext.language.Presentation.resource.sce.ISceTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.emftext.language.Presentation.resource.sce.mopp.SceParser().createInstance(inputStream, encoding);
	}
	
	public org.emftext.language.Presentation.resource.sce.ISceTextPrinter createPrinter(java.io.OutputStream outputStream, org.emftext.language.Presentation.resource.sce.ISceTextResource resource) {
		return new org.emftext.language.Presentation.resource.sce.mopp.ScePrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.emftext.language.Presentation.resource.sce.mopp.SceSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.emftext.language.Presentation.resource.sce.mopp.SceSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.emftext.language.Presentation.resource.sce.ISceReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.emftext.language.Presentation.resource.sce.mopp.SceReferenceResolverSwitch();
	}
	
	public org.emftext.language.Presentation.resource.sce.ISceTokenResolverFactory getTokenResolverFactory() {
		return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.emftext.language.presentation/metamodel/Presentation.cs";
	}
	
	public String[] getTokenNames() {
		return org.emftext.language.Presentation.resource.sce.mopp.SceParser.tokenNames;
	}
	
	public org.emftext.language.Presentation.resource.sce.ISceTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.emftext.language.Presentation.resource.sce.ISceBracketPair> getBracketPairs() {
		return new org.emftext.language.Presentation.resource.sce.mopp.SceBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.emftext.language.Presentation.resource.sce.mopp.SceFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.emftext.language.Presentation.resource.sce.mopp.SceResourceFactory();
	}
	
	public org.emftext.language.Presentation.resource.sce.mopp.SceNewFileContentProvider getNewFileContentProvider() {
		return new org.emftext.language.Presentation.resource.sce.mopp.SceNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.emftext.language.Presentation.resource.sce.mopp.SceResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "org.emftext.language.Presentation.resource.sce.ui.launchConfigurationType";
	}
	
	public org.emftext.language.Presentation.resource.sce.ISceNameProvider createNameProvider() {
		return new org.emftext.language.Presentation.resource.sce.analysis.SceDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.emftext.language.Presentation.resource.sce.mopp.SceAntlrTokenHelper tokenHelper = new org.emftext.language.Presentation.resource.sce.mopp.SceAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(org.emftext.language.Presentation.resource.sce.mopp.SceTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
