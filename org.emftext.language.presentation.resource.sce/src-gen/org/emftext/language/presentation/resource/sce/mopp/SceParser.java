// $ANTLR 3.4

	package org.emftext.language.presentation.resource.sce.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SceParser extends SceANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN", "LINEBREAK", "NAME", "NUMBER", "QUOTED_NAME", "QUOTED_STRING", "UNSIGNED_INTEGER", "WHITESPACE", "','", "';'", "'='", "'active_buttons'", "'begin;'", "'begin_pcl;'", "'scenario'"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int BOOLEAN=4;
    public static final int LINEBREAK=5;
    public static final int NAME=6;
    public static final int NUMBER=7;
    public static final int QUOTED_NAME=8;
    public static final int QUOTED_STRING=9;
    public static final int UNSIGNED_INTEGER=10;
    public static final int WHITESPACE=11;

    // delegates
    public SceANTLRParserBase[] getDelegates() {
        return new SceANTLRParserBase[] {};
    }

    // delegators


    public SceParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SceParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(20 + 1);
         

    }

    public String[] getTokenNames() { return SceParser.tokenNames; }
    public String getGrammarFileName() { return "Sce.g"; }


    	private org.emftext.language.presentation.resource.sce.ISceTokenResolverFactory tokenResolverFactory = new org.emftext.language.presentation.resource.sce.mopp.SceTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal> expectedElements = new java.util.ArrayList<org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new org.emftext.language.presentation.resource.sce.ISceCommand<org.emftext.language.presentation.resource.sce.ISceTextResource>() {
    			public boolean execute(org.emftext.language.presentation.resource.sce.ISceTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.emftext.language.presentation.resource.sce.ISceProblem() {
    					public org.emftext.language.presentation.resource.sce.SceEProblemSeverity getSeverity() {
    						return org.emftext.language.presentation.resource.sce.SceEProblemSeverity.ERROR;
    					}
    					public org.emftext.language.presentation.resource.sce.SceEProblemType getType() {
    						return org.emftext.language.presentation.resource.sce.SceEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<org.emftext.language.presentation.resource.sce.ISceQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		int terminalID = ids[0];
    		int followSetID = ids[1];
    		org.emftext.language.presentation.resource.sce.ISceExpectedElement terminal = org.emftext.language.presentation.resource.sce.grammar.SceFollowSetProvider.TERMINALS[terminalID];
    		org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[] containmentFeatures = new org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = org.emftext.language.presentation.resource.sce.grammar.SceFollowSetProvider.LINKS[ids[i]];
    		}
    		org.emftext.language.presentation.resource.sce.grammar.SceContainmentTrace containmentTrace = new org.emftext.language.presentation.resource.sce.grammar.SceContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal expectedElement = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal(container, terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    			this.expectedElementsIndexOfLastCompleteElement = 0;
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.presentation.resource.sce.ISceCommand<org.emftext.language.presentation.resource.sce.ISceTextResource>() {
    			public boolean execute(org.emftext.language.presentation.resource.sce.ISceTextResource resource) {
    				org.emftext.language.presentation.resource.sce.ISceLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.presentation.resource.sce.ISceCommand<org.emftext.language.presentation.resource.sce.ISceTextResource>() {
    			public boolean execute(org.emftext.language.presentation.resource.sce.ISceTextResource resource) {
    				org.emftext.language.presentation.resource.sce.ISceLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<org.emftext.language.presentation.resource.sce.ISceCommand<org.emftext.language.presentation.resource.sce.ISceTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.presentation.resource.sce.ISceCommand<org.emftext.language.presentation.resource.sce.ISceTextResource>() {
    			public boolean execute(org.emftext.language.presentation.resource.sce.ISceTextResource resource) {
    				org.emftext.language.presentation.resource.sce.ISceLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public org.emftext.language.presentation.resource.sce.ISceTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new SceParser(new org.antlr.runtime3_4_0.CommonTokenStream(new SceLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new SceParser(new org.antlr.runtime3_4_0.CommonTokenStream(new SceLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new org.emftext.language.presentation.resource.sce.util.SceRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public SceParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((SceLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((SceLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == org.emftext.language.presentation.Scenario.class) {
    				return parse_org_emftext_language_presentation_Scenario();
    			}
    			if (type.getInstanceClass() == org.emftext.language.presentation.Header.class) {
    				return parse_org_emftext_language_presentation_Header();
    			}
    			if (type.getInstanceClass() == org.emftext.language.presentation.SDL.class) {
    				return parse_org_emftext_language_presentation_SDL();
    			}
    			if (type.getInstanceClass() == org.emftext.language.presentation.PCL.class) {
    				return parse_org_emftext_language_presentation_PCL();
    			}
    			if (type.getInstanceClass() == org.emftext.language.presentation.Definition.class) {
    				return parse_org_emftext_language_presentation_Definition();
    			}
    			if (type.getInstanceClass() == org.emftext.language.presentation.NumberLiteral.class) {
    				return parse_org_emftext_language_presentation_NumberLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.presentation.NameLiteral.class) {
    				return parse_org_emftext_language_presentation_NameLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.presentation.BooleanLiteral.class) {
    				return parse_org_emftext_language_presentation_BooleanLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.presentation.ScenarioNameParameter.class) {
    				return parse_org_emftext_language_presentation_ScenarioNameParameter();
    			}
    			if (type.getInstanceClass() == org.emftext.language.presentation.ActiveButtonsParameter.class) {
    				return parse_org_emftext_language_presentation_ActiveButtonsParameter();
    			}
    		}
    		throw new org.emftext.language.presentation.resource.sce.mopp.SceUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(org.emftext.language.presentation.resource.sce.ISceOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.emftext.language.presentation.resource.sce.ISceParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.emftext.language.presentation.resource.sce.ISceCommand<org.emftext.language.presentation.resource.sce.ISceTextResource>>();
    		org.emftext.language.presentation.resource.sce.mopp.SceParseResult parseResult = new org.emftext.language.presentation.resource.sce.mopp.SceParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.emftext.language.presentation.resource.sce.ISceTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		org.emftext.language.presentation.resource.sce.ISceParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (org.emftext.language.presentation.resource.sce.ISceCommand<org.emftext.language.presentation.resource.sce.ISceTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal>();
    		java.util.List<org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal> newFollowSet = new java.util.ArrayList<org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 19;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.emftext.language.presentation.resource.sce.util.ScePair<org.emftext.language.presentation.resource.sce.ISceExpectedElement, org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.emftext.language.presentation.resource.sce.util.ScePair<org.emftext.language.presentation.resource.sce.ISceExpectedElement, org.emftext.language.presentation.resource.sce.mopp.SceContainedFeature[]> newFollowerPair : newFollowers) {
    							org.emftext.language.presentation.resource.sce.ISceExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							org.emftext.language.presentation.resource.sce.grammar.SceContainmentTrace containmentTrace = new org.emftext.language.presentation.resource.sce.grammar.SceContainmentTrace(null, newFollowerPair.getRight());
    							org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal newFollowTerminal = new org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal(container, newFollower, followSetID, containmentTrace);
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.emftext.language.presentation.resource.sce.mopp.SceExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
    			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
    			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	private void startIncompleteElement(Object object) {
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
    		}
    	}
    	
    	private void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			boolean exists = this.incompleteObjects.remove(object);
    			if (!exists) {
    			}
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
    		if (incompleteObjects.isEmpty()) {
    			return null;
    		}
    		return incompleteObjects.get(incompleteObjects.size() - 1);
    	}
    	



    // $ANTLR start "start"
    // Sce.g:526:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_emftext_language_presentation_Scenario ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        org.emftext.language.presentation.Scenario c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Sce.g:527:2: ( (c0= parse_org_emftext_language_presentation_Scenario ) EOF )
            // Sce.g:528:2: (c0= parse_org_emftext_language_presentation_Scenario ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[0]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[1]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[2]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[3]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Sce.g:536:2: (c0= parse_org_emftext_language_presentation_Scenario )
            // Sce.g:537:3: c0= parse_org_emftext_language_presentation_Scenario
            {
            pushFollow(FOLLOW_parse_org_emftext_language_presentation_Scenario_in_start82);
            c0=parse_org_emftext_language_presentation_Scenario();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_org_emftext_language_presentation_Scenario"
    // Sce.g:545:1: parse_org_emftext_language_presentation_Scenario returns [org.emftext.language.presentation.Scenario element = null] : (a0_0= parse_org_emftext_language_presentation_Header ) ( (a1_0= parse_org_emftext_language_presentation_SDL ) )* ( (a2_0= parse_org_emftext_language_presentation_PCL ) )* ;
    public final org.emftext.language.presentation.Scenario parse_org_emftext_language_presentation_Scenario() throws RecognitionException {
        org.emftext.language.presentation.Scenario element =  null;

        int parse_org_emftext_language_presentation_Scenario_StartIndex = input.index();

        org.emftext.language.presentation.Header a0_0 =null;

        org.emftext.language.presentation.SDL a1_0 =null;

        org.emftext.language.presentation.PCL a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Sce.g:548:2: ( (a0_0= parse_org_emftext_language_presentation_Header ) ( (a1_0= parse_org_emftext_language_presentation_SDL ) )* ( (a2_0= parse_org_emftext_language_presentation_PCL ) )* )
            // Sce.g:549:2: (a0_0= parse_org_emftext_language_presentation_Header ) ( (a1_0= parse_org_emftext_language_presentation_SDL ) )* ( (a2_0= parse_org_emftext_language_presentation_PCL ) )*
            {
            // Sce.g:549:2: (a0_0= parse_org_emftext_language_presentation_Header )
            // Sce.g:550:3: a0_0= parse_org_emftext_language_presentation_Header
            {
            pushFollow(FOLLOW_parse_org_emftext_language_presentation_Header_in_parse_org_emftext_language_presentation_Scenario119);
            a0_0=parse_org_emftext_language_presentation_Header();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createScenario();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.SCENARIO__HEADER), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_0_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[4]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[5]);
            	}

            // Sce.g:576:2: ( (a1_0= parse_org_emftext_language_presentation_SDL ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Sce.g:577:3: (a1_0= parse_org_emftext_language_presentation_SDL )
            	    {
            	    // Sce.g:577:3: (a1_0= parse_org_emftext_language_presentation_SDL )
            	    // Sce.g:578:4: a1_0= parse_org_emftext_language_presentation_SDL
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_presentation_SDL_in_parse_org_emftext_language_presentation_Scenario146);
            	    a1_0=parse_org_emftext_language_presentation_SDL();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createScenario();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a1_0 != null) {
            	    					if (a1_0 != null) {
            	    						Object value = a1_0;
            	    						addObjectToList(element, org.emftext.language.presentation.PresentationPackage.SCENARIO__SDL, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_0_0_0_1, a1_0, true);
            	    					copyLocalizationInfos(a1_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[6]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[7]);
            	}

            // Sce.g:605:2: ( (a2_0= parse_org_emftext_language_presentation_PCL ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Sce.g:606:3: (a2_0= parse_org_emftext_language_presentation_PCL )
            	    {
            	    // Sce.g:606:3: (a2_0= parse_org_emftext_language_presentation_PCL )
            	    // Sce.g:607:4: a2_0= parse_org_emftext_language_presentation_PCL
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_presentation_PCL_in_parse_org_emftext_language_presentation_Scenario181);
            	    a2_0=parse_org_emftext_language_presentation_PCL();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createScenario();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a2_0 != null) {
            	    					if (a2_0 != null) {
            	    						Object value = a2_0;
            	    						addObjectToList(element, org.emftext.language.presentation.PresentationPackage.SCENARIO__PCL, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_0_0_0_2, a2_0, true);
            	    					copyLocalizationInfos(a2_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[8]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_emftext_language_presentation_Scenario_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_presentation_Scenario"



    // $ANTLR start "parse_org_emftext_language_presentation_Header"
    // Sce.g:635:1: parse_org_emftext_language_presentation_Header returns [org.emftext.language.presentation.Header element = null] : ( (a0_0= parse_org_emftext_language_presentation_Definition ) )* ;
    public final org.emftext.language.presentation.Header parse_org_emftext_language_presentation_Header() throws RecognitionException {
        org.emftext.language.presentation.Header element =  null;

        int parse_org_emftext_language_presentation_Header_StartIndex = input.index();

        org.emftext.language.presentation.Definition a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Sce.g:638:2: ( ( (a0_0= parse_org_emftext_language_presentation_Definition ) )* )
            // Sce.g:639:2: ( (a0_0= parse_org_emftext_language_presentation_Definition ) )*
            {
            // Sce.g:639:2: ( (a0_0= parse_org_emftext_language_presentation_Definition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Sce.g:640:3: (a0_0= parse_org_emftext_language_presentation_Definition )
            	    {
            	    // Sce.g:640:3: (a0_0= parse_org_emftext_language_presentation_Definition )
            	    // Sce.g:641:4: a0_0= parse_org_emftext_language_presentation_Definition
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_presentation_Definition_in_parse_org_emftext_language_presentation_Header231);
            	    a0_0=parse_org_emftext_language_presentation_Definition();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createHeader();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a0_0 != null) {
            	    					if (a0_0 != null) {
            	    						Object value = a0_0;
            	    						addObjectToList(element, org.emftext.language.presentation.PresentationPackage.HEADER__DEFINITION, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_1_0_0_0, a0_0, true);
            	    					copyLocalizationInfos(a0_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[9]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[10]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[11]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[12]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_emftext_language_presentation_Header_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_presentation_Header"



    // $ANTLR start "parse_org_emftext_language_presentation_SDL"
    // Sce.g:672:1: parse_org_emftext_language_presentation_SDL returns [org.emftext.language.presentation.SDL element = null] : a0= 'begin;' ;
    public final org.emftext.language.presentation.SDL parse_org_emftext_language_presentation_SDL() throws RecognitionException {
        org.emftext.language.presentation.SDL element =  null;

        int parse_org_emftext_language_presentation_SDL_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Sce.g:675:2: (a0= 'begin;' )
            // Sce.g:676:2: a0= 'begin;'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_org_emftext_language_presentation_SDL272); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createSDL();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[13]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[14]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_emftext_language_presentation_SDL_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_presentation_SDL"



    // $ANTLR start "parse_org_emftext_language_presentation_PCL"
    // Sce.g:693:1: parse_org_emftext_language_presentation_PCL returns [org.emftext.language.presentation.PCL element = null] : a0= 'begin_pcl;' ;
    public final org.emftext.language.presentation.PCL parse_org_emftext_language_presentation_PCL() throws RecognitionException {
        org.emftext.language.presentation.PCL element =  null;

        int parse_org_emftext_language_presentation_PCL_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Sce.g:696:2: (a0= 'begin_pcl;' )
            // Sce.g:697:2: a0= 'begin_pcl;'
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_org_emftext_language_presentation_PCL301); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createPCL();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[15]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_emftext_language_presentation_PCL_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_presentation_PCL"



    // $ANTLR start "parse_org_emftext_language_presentation_Definition"
    // Sce.g:713:1: parse_org_emftext_language_presentation_Definition returns [org.emftext.language.presentation.Definition element = null] : (a0_0= parse_org_emftext_language_presentation_Parameter ) a1= '=' (a2_0= parse_org_emftext_language_presentation_Literal ) ( (a3= ',' (a4_0= parse_org_emftext_language_presentation_Literal ) ) )* a5= ';' ;
    public final org.emftext.language.presentation.Definition parse_org_emftext_language_presentation_Definition() throws RecognitionException {
        org.emftext.language.presentation.Definition element =  null;

        int parse_org_emftext_language_presentation_Definition_StartIndex = input.index();

        Token a1=null;
        Token a3=null;
        Token a5=null;
        org.emftext.language.presentation.Parameter a0_0 =null;

        org.emftext.language.presentation.Literal a2_0 =null;

        org.emftext.language.presentation.Literal a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Sce.g:716:2: ( (a0_0= parse_org_emftext_language_presentation_Parameter ) a1= '=' (a2_0= parse_org_emftext_language_presentation_Literal ) ( (a3= ',' (a4_0= parse_org_emftext_language_presentation_Literal ) ) )* a5= ';' )
            // Sce.g:717:2: (a0_0= parse_org_emftext_language_presentation_Parameter ) a1= '=' (a2_0= parse_org_emftext_language_presentation_Literal ) ( (a3= ',' (a4_0= parse_org_emftext_language_presentation_Literal ) ) )* a5= ';'
            {
            // Sce.g:717:2: (a0_0= parse_org_emftext_language_presentation_Parameter )
            // Sce.g:718:3: a0_0= parse_org_emftext_language_presentation_Parameter
            {
            pushFollow(FOLLOW_parse_org_emftext_language_presentation_Parameter_in_parse_org_emftext_language_presentation_Definition334);
            a0_0=parse_org_emftext_language_presentation_Parameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createDefinition();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.DEFINITION__PARAMETER), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[16]);
            	}

            a1=(Token)match(input,14,FOLLOW_14_in_parse_org_emftext_language_presentation_Definition352); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[17]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[18]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[19]);
            	}

            // Sce.g:759:2: (a2_0= parse_org_emftext_language_presentation_Literal )
            // Sce.g:760:3: a2_0= parse_org_emftext_language_presentation_Literal
            {
            pushFollow(FOLLOW_parse_org_emftext_language_presentation_Literal_in_parse_org_emftext_language_presentation_Definition370);
            a2_0=parse_org_emftext_language_presentation_Literal();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createDefinition();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.DEFINITION__VALUE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_2, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[20]);
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[21]);
            	}

            // Sce.g:786:2: ( (a3= ',' (a4_0= parse_org_emftext_language_presentation_Literal ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Sce.g:787:3: (a3= ',' (a4_0= parse_org_emftext_language_presentation_Literal ) )
            	    {
            	    // Sce.g:787:3: (a3= ',' (a4_0= parse_org_emftext_language_presentation_Literal ) )
            	    // Sce.g:788:4: a3= ',' (a4_0= parse_org_emftext_language_presentation_Literal )
            	    {
            	    a3=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_presentation_Definition397); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createDefinition();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[22]);
            	    				addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[23]);
            	    				addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[24]);
            	    			}

            	    // Sce.g:804:4: (a4_0= parse_org_emftext_language_presentation_Literal )
            	    // Sce.g:805:5: a4_0= parse_org_emftext_language_presentation_Literal
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_presentation_Literal_in_parse_org_emftext_language_presentation_Definition423);
            	    a4_0=parse_org_emftext_language_presentation_Literal();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createDefinition();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a4_0 != null) {
            	    						if (a4_0 != null) {
            	    							Object value = a4_0;
            	    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.DEFINITION__VALUE), value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_3_0_0_1, a4_0, true);
            	    						copyLocalizationInfos(a4_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[25]);
            	    				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[26]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[27]);
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[28]);
            	}

            a5=(Token)match(input,13,FOLLOW_13_in_parse_org_emftext_language_presentation_Definition464); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[29]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[30]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[31]);
            		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[32]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_emftext_language_presentation_Definition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_presentation_Definition"



    // $ANTLR start "parse_org_emftext_language_presentation_NumberLiteral"
    // Sce.g:858:1: parse_org_emftext_language_presentation_NumberLiteral returns [org.emftext.language.presentation.NumberLiteral element = null] : (a0= NUMBER ) ;
    public final org.emftext.language.presentation.NumberLiteral parse_org_emftext_language_presentation_NumberLiteral() throws RecognitionException {
        org.emftext.language.presentation.NumberLiteral element =  null;

        int parse_org_emftext_language_presentation_NumberLiteral_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Sce.g:861:2: ( (a0= NUMBER ) )
            // Sce.g:862:2: (a0= NUMBER )
            {
            // Sce.g:862:2: (a0= NUMBER )
            // Sce.g:863:3: a0= NUMBER
            {
            a0=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_org_emftext_language_presentation_NumberLiteral497); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createNumberLiteral();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.NUMBER_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.NUMBER_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[33]);
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[34]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_emftext_language_presentation_NumberLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_presentation_NumberLiteral"



    // $ANTLR start "parse_org_emftext_language_presentation_NameLiteral"
    // Sce.g:901:1: parse_org_emftext_language_presentation_NameLiteral returns [org.emftext.language.presentation.NameLiteral element = null] : (a0= NAME ) ;
    public final org.emftext.language.presentation.NameLiteral parse_org_emftext_language_presentation_NameLiteral() throws RecognitionException {
        org.emftext.language.presentation.NameLiteral element =  null;

        int parse_org_emftext_language_presentation_NameLiteral_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Sce.g:904:2: ( (a0= NAME ) )
            // Sce.g:905:2: (a0= NAME )
            {
            // Sce.g:905:2: (a0= NAME )
            // Sce.g:906:3: a0= NAME
            {
            a0=(Token)match(input,NAME,FOLLOW_NAME_in_parse_org_emftext_language_presentation_NameLiteral537); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createNameLiteral();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NAME");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.NAME_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.NAME_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[35]);
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[36]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_emftext_language_presentation_NameLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_presentation_NameLiteral"



    // $ANTLR start "parse_org_emftext_language_presentation_BooleanLiteral"
    // Sce.g:944:1: parse_org_emftext_language_presentation_BooleanLiteral returns [org.emftext.language.presentation.BooleanLiteral element = null] : (a0= BOOLEAN ) ;
    public final org.emftext.language.presentation.BooleanLiteral parse_org_emftext_language_presentation_BooleanLiteral() throws RecognitionException {
        org.emftext.language.presentation.BooleanLiteral element =  null;

        int parse_org_emftext_language_presentation_BooleanLiteral_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Sce.g:947:2: ( (a0= BOOLEAN ) )
            // Sce.g:948:2: (a0= BOOLEAN )
            {
            // Sce.g:948:2: (a0= BOOLEAN )
            // Sce.g:949:3: a0= BOOLEAN
            {
            a0=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_parse_org_emftext_language_presentation_BooleanLiteral577); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createBooleanLiteral();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BOOLEAN");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.BOOLEAN_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.Boolean resolved = (java.lang.Boolean) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.PresentationPackage.BOOLEAN_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_7_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[37]);
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[38]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_emftext_language_presentation_BooleanLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_presentation_BooleanLiteral"



    // $ANTLR start "parse_org_emftext_language_presentation_ScenarioNameParameter"
    // Sce.g:987:1: parse_org_emftext_language_presentation_ScenarioNameParameter returns [org.emftext.language.presentation.ScenarioNameParameter element = null] : a0= 'scenario' ;
    public final org.emftext.language.presentation.ScenarioNameParameter parse_org_emftext_language_presentation_ScenarioNameParameter() throws RecognitionException {
        org.emftext.language.presentation.ScenarioNameParameter element =  null;

        int parse_org_emftext_language_presentation_ScenarioNameParameter_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Sce.g:990:2: (a0= 'scenario' )
            // Sce.g:991:2: a0= 'scenario'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_presentation_ScenarioNameParameter613); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createScenarioNameParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_8_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[39]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_emftext_language_presentation_ScenarioNameParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_presentation_ScenarioNameParameter"



    // $ANTLR start "parse_org_emftext_language_presentation_ActiveButtonsParameter"
    // Sce.g:1007:1: parse_org_emftext_language_presentation_ActiveButtonsParameter returns [org.emftext.language.presentation.ActiveButtonsParameter element = null] : a0= 'active_buttons' ;
    public final org.emftext.language.presentation.ActiveButtonsParameter parse_org_emftext_language_presentation_ActiveButtonsParameter() throws RecognitionException {
        org.emftext.language.presentation.ActiveButtonsParameter element =  null;

        int parse_org_emftext_language_presentation_ActiveButtonsParameter_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Sce.g:1010:2: (a0= 'active_buttons' )
            // Sce.g:1011:2: a0= 'active_buttons'
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_org_emftext_language_presentation_ActiveButtonsParameter642); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createActiveButtonsParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_9_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[40]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_org_emftext_language_presentation_ActiveButtonsParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_presentation_ActiveButtonsParameter"



    // $ANTLR start "parse_org_emftext_language_presentation_Parameter"
    // Sce.g:1027:1: parse_org_emftext_language_presentation_Parameter returns [org.emftext.language.presentation.Parameter element = null] : (c0= parse_org_emftext_language_presentation_ScenarioNameParameter |c1= parse_org_emftext_language_presentation_ActiveButtonsParameter );
    public final org.emftext.language.presentation.Parameter parse_org_emftext_language_presentation_Parameter() throws RecognitionException {
        org.emftext.language.presentation.Parameter element =  null;

        int parse_org_emftext_language_presentation_Parameter_StartIndex = input.index();

        org.emftext.language.presentation.ScenarioNameParameter c0 =null;

        org.emftext.language.presentation.ActiveButtonsParameter c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Sce.g:1028:2: (c0= parse_org_emftext_language_presentation_ScenarioNameParameter |c1= parse_org_emftext_language_presentation_ActiveButtonsParameter )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Sce.g:1029:2: c0= parse_org_emftext_language_presentation_ScenarioNameParameter
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_presentation_ScenarioNameParameter_in_parse_org_emftext_language_presentation_Parameter667);
                    c0=parse_org_emftext_language_presentation_ScenarioNameParameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sce.g:1030:4: c1= parse_org_emftext_language_presentation_ActiveButtonsParameter
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_presentation_ActiveButtonsParameter_in_parse_org_emftext_language_presentation_Parameter677);
                    c1=parse_org_emftext_language_presentation_ActiveButtonsParameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_emftext_language_presentation_Parameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_presentation_Parameter"



    // $ANTLR start "parse_org_emftext_language_presentation_Literal"
    // Sce.g:1034:1: parse_org_emftext_language_presentation_Literal returns [org.emftext.language.presentation.Literal element = null] : (c0= parse_org_emftext_language_presentation_NumberLiteral |c1= parse_org_emftext_language_presentation_NameLiteral |c2= parse_org_emftext_language_presentation_BooleanLiteral );
    public final org.emftext.language.presentation.Literal parse_org_emftext_language_presentation_Literal() throws RecognitionException {
        org.emftext.language.presentation.Literal element =  null;

        int parse_org_emftext_language_presentation_Literal_StartIndex = input.index();

        org.emftext.language.presentation.NumberLiteral c0 =null;

        org.emftext.language.presentation.NameLiteral c1 =null;

        org.emftext.language.presentation.BooleanLiteral c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Sce.g:1035:2: (c0= parse_org_emftext_language_presentation_NumberLiteral |c1= parse_org_emftext_language_presentation_NameLiteral |c2= parse_org_emftext_language_presentation_BooleanLiteral )
            int alt6=3;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt6=1;
                }
                break;
            case NAME:
                {
                alt6=2;
                }
                break;
            case BOOLEAN:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // Sce.g:1036:2: c0= parse_org_emftext_language_presentation_NumberLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_presentation_NumberLiteral_in_parse_org_emftext_language_presentation_Literal698);
                    c0=parse_org_emftext_language_presentation_NumberLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sce.g:1037:4: c1= parse_org_emftext_language_presentation_NameLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_presentation_NameLiteral_in_parse_org_emftext_language_presentation_Literal708);
                    c1=parse_org_emftext_language_presentation_NameLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sce.g:1038:4: c2= parse_org_emftext_language_presentation_BooleanLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_presentation_BooleanLiteral_in_parse_org_emftext_language_presentation_Literal718);
                    c2=parse_org_emftext_language_presentation_BooleanLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_org_emftext_language_presentation_Literal_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_presentation_Literal"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_Scenario_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_Header_in_parse_org_emftext_language_presentation_Scenario119 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_SDL_in_parse_org_emftext_language_presentation_Scenario146 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_PCL_in_parse_org_emftext_language_presentation_Scenario181 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_Definition_in_parse_org_emftext_language_presentation_Header231 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_16_in_parse_org_emftext_language_presentation_SDL272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_org_emftext_language_presentation_PCL301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_Parameter_in_parse_org_emftext_language_presentation_Definition334 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_emftext_language_presentation_Definition352 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_Literal_in_parse_org_emftext_language_presentation_Definition370 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_presentation_Definition397 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_Literal_in_parse_org_emftext_language_presentation_Definition423 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_parse_org_emftext_language_presentation_Definition464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_parse_org_emftext_language_presentation_NumberLiteral497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_parse_org_emftext_language_presentation_NameLiteral537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_parse_org_emftext_language_presentation_BooleanLiteral577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_presentation_ScenarioNameParameter613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_org_emftext_language_presentation_ActiveButtonsParameter642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_ScenarioNameParameter_in_parse_org_emftext_language_presentation_Parameter667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_ActiveButtonsParameter_in_parse_org_emftext_language_presentation_Parameter677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_NumberLiteral_in_parse_org_emftext_language_presentation_Literal698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_NameLiteral_in_parse_org_emftext_language_presentation_Literal708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_presentation_BooleanLiteral_in_parse_org_emftext_language_presentation_Literal718 = new BitSet(new long[]{0x0000000000000002L});

}