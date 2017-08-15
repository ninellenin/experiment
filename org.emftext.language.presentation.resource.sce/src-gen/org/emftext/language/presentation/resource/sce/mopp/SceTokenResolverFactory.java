/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.presentation.resource.sce.mopp;

/**
 * The SceTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class SceTokenResolverFactory implements org.emftext.language.presentation.resource.sce.ISceTokenResolverFactory {
	
	private java.util.Map<String, org.emftext.language.presentation.resource.sce.ISceTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.emftext.language.presentation.resource.sce.ISceTokenResolver> featureName2CollectInTokenResolver;
	private static org.emftext.language.presentation.resource.sce.ISceTokenResolver defaultResolver = new org.emftext.language.presentation.resource.sce.analysis.SceDefaultTokenResolver();
	
	public SceTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.emftext.language.presentation.resource.sce.ISceTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.emftext.language.presentation.resource.sce.ISceTokenResolver>();
		registerTokenResolver("NUMBER", new org.emftext.language.presentation.resource.sce.analysis.SceNUMBERTokenResolver());
		registerTokenResolver("BOOLEAN", new org.emftext.language.presentation.resource.sce.analysis.SceBOOLEANTokenResolver());
		registerTokenResolver("NAME", new org.emftext.language.presentation.resource.sce.analysis.SceNAMETokenResolver());
	}
	
	public org.emftext.language.presentation.resource.sce.ISceTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.emftext.language.presentation.resource.sce.ISceTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.emftext.language.presentation.resource.sce.ISceTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.emftext.language.presentation.resource.sce.ISceTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.emftext.language.presentation.resource.sce.ISceTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.emftext.language.presentation.resource.sce.ISceTokenResolver internalCreateResolver(java.util.Map<String, org.emftext.language.presentation.resource.sce.ISceTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.emftext.language.presentation.resource.sce.ISceTokenResolver> resolverMap, String key, org.emftext.language.presentation.resource.sce.ISceTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
