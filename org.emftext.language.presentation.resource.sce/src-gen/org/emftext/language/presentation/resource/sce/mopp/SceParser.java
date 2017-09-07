// $ANTLR 3.4

	package org.emftext.language.Presentation.resource.sce.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SceParser extends SceANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN", "LINEBREAK", "QUOTED_NAME", "SIGNED_INTEGER", "WHITESPACE", "','", "';'", "'='", "'active_buttons'", "'begin'", "'begin_pcl'", "'button_codes'", "'scenario'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int BOOLEAN=4;
    public static final int LINEBREAK=5;
    public static final int QUOTED_NAME=6;
    public static final int SIGNED_INTEGER=7;
    public static final int WHITESPACE=8;

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
        this.state.initializeRuleMemo(17 + 1);
         

    }

    public String[] getTokenNames() { return SceParser.tokenNames; }
    public String getGrammarFileName() { return "Sce.g"; }


    	private org.emftext.language.Presentation.resource.sce.ISceTokenResolverFactory tokenResolverFactory = new org.emftext.language.Presentation.resource.sce.mopp.SceTokenResolverFactory();
    	
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
    	private java.util.List<org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal> expectedElements = new java.util.ArrayList<org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal>();
    	
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
    		postParseCommands.add(new org.emftext.language.Presentation.resource.sce.ISceCommand<org.emftext.language.Presentation.resource.sce.ISceTextResource>() {
    			public boolean execute(org.emftext.language.Presentation.resource.sce.ISceTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.emftext.language.Presentation.resource.sce.ISceProblem() {
    					public org.emftext.language.Presentation.resource.sce.SceEProblemSeverity getSeverity() {
    						return org.emftext.language.Presentation.resource.sce.SceEProblemSeverity.ERROR;
    					}
    					public org.emftext.language.Presentation.resource.sce.SceEProblemType getType() {
    						return org.emftext.language.Presentation.resource.sce.SceEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<org.emftext.language.Presentation.resource.sce.ISceQuickFix> getQuickFixes() {
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
    		org.emftext.language.Presentation.resource.sce.ISceExpectedElement terminal = org.emftext.language.Presentation.resource.sce.grammar.SceFollowSetProvider.TERMINALS[terminalID];
    		org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[] containmentFeatures = new org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = org.emftext.language.Presentation.resource.sce.grammar.SceFollowSetProvider.LINKS[ids[i]];
    		}
    		org.emftext.language.Presentation.resource.sce.grammar.SceContainmentTrace containmentTrace = new org.emftext.language.Presentation.resource.sce.grammar.SceContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal expectedElement = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal(container, terminal, followSetID, containmentTrace);
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
    		postParseCommands.add(new org.emftext.language.Presentation.resource.sce.ISceCommand<org.emftext.language.Presentation.resource.sce.ISceTextResource>() {
    			public boolean execute(org.emftext.language.Presentation.resource.sce.ISceTextResource resource) {
    				org.emftext.language.Presentation.resource.sce.ISceLocationMap locationMap = resource.getLocationMap();
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
    		postParseCommands.add(new org.emftext.language.Presentation.resource.sce.ISceCommand<org.emftext.language.Presentation.resource.sce.ISceTextResource>() {
    			public boolean execute(org.emftext.language.Presentation.resource.sce.ISceTextResource resource) {
    				org.emftext.language.Presentation.resource.sce.ISceLocationMap locationMap = resource.getLocationMap();
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
    	protected void setLocalizationEnd(java.util.Collection<org.emftext.language.Presentation.resource.sce.ISceCommand<org.emftext.language.Presentation.resource.sce.ISceTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.Presentation.resource.sce.ISceCommand<org.emftext.language.Presentation.resource.sce.ISceTextResource>() {
    			public boolean execute(org.emftext.language.Presentation.resource.sce.ISceTextResource resource) {
    				org.emftext.language.Presentation.resource.sce.ISceLocationMap locationMap = resource.getLocationMap();
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
    	
    	public org.emftext.language.Presentation.resource.sce.ISceTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new SceParser(new org.antlr.runtime3_4_0.CommonTokenStream(new SceLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new SceParser(new org.antlr.runtime3_4_0.CommonTokenStream(new SceLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new org.emftext.language.Presentation.resource.sce.util.SceRuntimeUtil().logError("Error while creating parser.", e);
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
    			if (type.getInstanceClass() == org.emftext.language.Presentation.Scenario.class) {
    				return parse_org_emftext_language_Presentation_Scenario();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.Header.class) {
    				return parse_org_emftext_language_Presentation_Header();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.SDL.class) {
    				return parse_org_emftext_language_Presentation_SDL();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.PCL.class) {
    				return parse_org_emftext_language_Presentation_PCL();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.ScenarioNameParameter.class) {
    				return parse_org_emftext_language_Presentation_ScenarioNameParameter();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.ActiveButtonsParameter.class) {
    				return parse_org_emftext_language_Presentation_ActiveButtonsParameter();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.ButtonCodesParameter.class) {
    				return parse_org_emftext_language_Presentation_ButtonCodesParameter();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.NumberLiteral.class) {
    				return parse_org_emftext_language_Presentation_NumberLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.NameLiteral.class) {
    				return parse_org_emftext_language_Presentation_NameLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.BooleanLiteral.class) {
    				return parse_org_emftext_language_Presentation_BooleanLiteral();
    			}
    		}
    		throw new org.emftext.language.Presentation.resource.sce.mopp.SceUnexpectedContentTypeException(typeObject);
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
    			typeObject = options.get(org.emftext.language.Presentation.resource.sce.ISceOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.emftext.language.Presentation.resource.sce.ISceParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.emftext.language.Presentation.resource.sce.ISceCommand<org.emftext.language.Presentation.resource.sce.ISceTextResource>>();
    		org.emftext.language.Presentation.resource.sce.mopp.SceParseResult parseResult = new org.emftext.language.Presentation.resource.sce.mopp.SceParseResult();
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
    	
    	public java.util.List<org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.emftext.language.Presentation.resource.sce.ISceTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		org.emftext.language.Presentation.resource.sce.ISceParseResult result = parse();
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
    			for (org.emftext.language.Presentation.resource.sce.ISceCommand<org.emftext.language.Presentation.resource.sce.ISceTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal>();
    		java.util.List<org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal> newFollowSet = new java.util.ArrayList<org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 28;
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
    				for (org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.emftext.language.Presentation.resource.sce.util.ScePair<org.emftext.language.Presentation.resource.sce.ISceExpectedElement, org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.emftext.language.Presentation.resource.sce.util.ScePair<org.emftext.language.Presentation.resource.sce.ISceExpectedElement, org.emftext.language.Presentation.resource.sce.mopp.SceContainedFeature[]> newFollowerPair : newFollowers) {
    							org.emftext.language.Presentation.resource.sce.ISceExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							org.emftext.language.Presentation.resource.sce.grammar.SceContainmentTrace containmentTrace = new org.emftext.language.Presentation.resource.sce.grammar.SceContainmentTrace(null, newFollowerPair.getRight());
    							org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal newFollowTerminal = new org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal(container, newFollower, followSetID, containmentTrace);
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
    		for (org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.emftext.language.Presentation.resource.sce.mopp.SceExpectedTerminal expectedElement, int tokenIndex) {
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
    // Sce.g:526:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_emftext_language_Presentation_Scenario ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        org.emftext.language.Presentation.Scenario c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Sce.g:527:2: ( (c0= parse_org_emftext_language_Presentation_Scenario ) EOF )
            // Sce.g:528:2: (c0= parse_org_emftext_language_Presentation_Scenario ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[0]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[1]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[2]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[4]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Sce.g:537:2: (c0= parse_org_emftext_language_Presentation_Scenario )
            // Sce.g:538:3: c0= parse_org_emftext_language_Presentation_Scenario
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_Scenario_in_start82);
            c0=parse_org_emftext_language_Presentation_Scenario();

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



    // $ANTLR start "parse_org_emftext_language_Presentation_Scenario"
    // Sce.g:546:1: parse_org_emftext_language_Presentation_Scenario returns [org.emftext.language.Presentation.Scenario element = null] : (a0_0= parse_org_emftext_language_Presentation_Header ) ( (a1_0= parse_org_emftext_language_Presentation_SDL ) )* ( (a2_0= parse_org_emftext_language_Presentation_PCL ) )* ;
    public final org.emftext.language.Presentation.Scenario parse_org_emftext_language_Presentation_Scenario() throws RecognitionException {
        org.emftext.language.Presentation.Scenario element =  null;

        int parse_org_emftext_language_Presentation_Scenario_StartIndex = input.index();

        org.emftext.language.Presentation.Header a0_0 =null;

        org.emftext.language.Presentation.SDL a1_0 =null;

        org.emftext.language.Presentation.PCL a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Sce.g:549:2: ( (a0_0= parse_org_emftext_language_Presentation_Header ) ( (a1_0= parse_org_emftext_language_Presentation_SDL ) )* ( (a2_0= parse_org_emftext_language_Presentation_PCL ) )* )
            // Sce.g:550:2: (a0_0= parse_org_emftext_language_Presentation_Header ) ( (a1_0= parse_org_emftext_language_Presentation_SDL ) )* ( (a2_0= parse_org_emftext_language_Presentation_PCL ) )*
            {
            // Sce.g:550:2: (a0_0= parse_org_emftext_language_Presentation_Header )
            // Sce.g:551:3: a0_0= parse_org_emftext_language_Presentation_Header
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_Header_in_parse_org_emftext_language_Presentation_Scenario119);
            a0_0=parse_org_emftext_language_Presentation_Header();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createScenario();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.SCENARIO__HEADER), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_0_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[5]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[6]);
            	}

            // Sce.g:577:2: ( (a1_0= parse_org_emftext_language_Presentation_SDL ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Sce.g:578:3: (a1_0= parse_org_emftext_language_Presentation_SDL )
            	    {
            	    // Sce.g:578:3: (a1_0= parse_org_emftext_language_Presentation_SDL )
            	    // Sce.g:579:4: a1_0= parse_org_emftext_language_Presentation_SDL
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_SDL_in_parse_org_emftext_language_Presentation_Scenario146);
            	    a1_0=parse_org_emftext_language_Presentation_SDL();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createScenario();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a1_0 != null) {
            	    					if (a1_0 != null) {
            	    						Object value = a1_0;
            	    						addObjectToList(element, org.emftext.language.Presentation.PresentationPackage.SCENARIO__SDL, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_0_0_0_1, a1_0, true);
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
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[7]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[8]);
            	}

            // Sce.g:606:2: ( (a2_0= parse_org_emftext_language_Presentation_PCL ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Sce.g:607:3: (a2_0= parse_org_emftext_language_Presentation_PCL )
            	    {
            	    // Sce.g:607:3: (a2_0= parse_org_emftext_language_Presentation_PCL )
            	    // Sce.g:608:4: a2_0= parse_org_emftext_language_Presentation_PCL
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_PCL_in_parse_org_emftext_language_Presentation_Scenario181);
            	    a2_0=parse_org_emftext_language_Presentation_PCL();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createScenario();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a2_0 != null) {
            	    					if (a2_0 != null) {
            	    						Object value = a2_0;
            	    						addObjectToList(element, org.emftext.language.Presentation.PresentationPackage.SCENARIO__PCL, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_0_0_0_2, a2_0, true);
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
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[9]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_emftext_language_Presentation_Scenario_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_Scenario"



    // $ANTLR start "parse_org_emftext_language_Presentation_Header"
    // Sce.g:636:1: parse_org_emftext_language_Presentation_Header returns [org.emftext.language.Presentation.Header element = null] : ( ( (a0_0= parse_org_emftext_language_Presentation_HeaderParameter ) ) )* ;
    public final org.emftext.language.Presentation.Header parse_org_emftext_language_Presentation_Header() throws RecognitionException {
        org.emftext.language.Presentation.Header element =  null;

        int parse_org_emftext_language_Presentation_Header_StartIndex = input.index();

        org.emftext.language.Presentation.HeaderParameter a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Sce.g:639:2: ( ( ( (a0_0= parse_org_emftext_language_Presentation_HeaderParameter ) ) )* )
            // Sce.g:640:2: ( ( (a0_0= parse_org_emftext_language_Presentation_HeaderParameter ) ) )*
            {
            // Sce.g:640:2: ( ( (a0_0= parse_org_emftext_language_Presentation_HeaderParameter ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||(LA3_0 >= 15 && LA3_0 <= 16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Sce.g:641:3: ( (a0_0= parse_org_emftext_language_Presentation_HeaderParameter ) )
            	    {
            	    // Sce.g:641:3: ( (a0_0= parse_org_emftext_language_Presentation_HeaderParameter ) )
            	    // Sce.g:642:4: (a0_0= parse_org_emftext_language_Presentation_HeaderParameter )
            	    {
            	    // Sce.g:642:4: (a0_0= parse_org_emftext_language_Presentation_HeaderParameter )
            	    // Sce.g:643:5: a0_0= parse_org_emftext_language_Presentation_HeaderParameter
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_HeaderParameter_in_parse_org_emftext_language_Presentation_Header237);
            	    a0_0=parse_org_emftext_language_Presentation_HeaderParameter();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createHeader();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a0_0 != null) {
            	    						if (a0_0 != null) {
            	    							Object value = a0_0;
            	    							addObjectToList(element, org.emftext.language.Presentation.PresentationPackage.HEADER__PARAMETER, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_1_0_0_0_0_0_0, a0_0, true);
            	    						copyLocalizationInfos(a0_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[10]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[11]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[12]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[13]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[14]);
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
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[15]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[16]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[17]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[18]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[19]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_emftext_language_Presentation_Header_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_Header"



    // $ANTLR start "parse_org_emftext_language_Presentation_SDL"
    // Sce.g:685:1: parse_org_emftext_language_Presentation_SDL returns [org.emftext.language.Presentation.SDL element = null] : a0= 'begin' a1= ';' ;
    public final org.emftext.language.Presentation.SDL parse_org_emftext_language_Presentation_SDL() throws RecognitionException {
        org.emftext.language.Presentation.SDL element =  null;

        int parse_org_emftext_language_Presentation_SDL_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Sce.g:688:2: (a0= 'begin' a1= ';' )
            // Sce.g:689:2: a0= 'begin' a1= ';'
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_org_emftext_language_Presentation_SDL293); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createSDL();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[20]);
            	}

            a1=(Token)match(input,10,FOLLOW_10_in_parse_org_emftext_language_Presentation_SDL307); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createSDL();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[21]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[22]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_emftext_language_Presentation_SDL_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_SDL"



    // $ANTLR start "parse_org_emftext_language_Presentation_PCL"
    // Sce.g:720:1: parse_org_emftext_language_Presentation_PCL returns [org.emftext.language.Presentation.PCL element = null] : a0= 'begin_pcl' a1= ';' ;
    public final org.emftext.language.Presentation.PCL parse_org_emftext_language_Presentation_PCL() throws RecognitionException {
        org.emftext.language.Presentation.PCL element =  null;

        int parse_org_emftext_language_Presentation_PCL_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Sce.g:723:2: (a0= 'begin_pcl' a1= ';' )
            // Sce.g:724:2: a0= 'begin_pcl' a1= ';'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_org_emftext_language_Presentation_PCL336); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createPCL();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[23]);
            	}

            a1=(Token)match(input,10,FOLLOW_10_in_parse_org_emftext_language_Presentation_PCL350); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createPCL();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_3_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[24]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_emftext_language_Presentation_PCL_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_PCL"



    // $ANTLR start "parse_org_emftext_language_Presentation_ScenarioNameParameter"
    // Sce.g:754:1: parse_org_emftext_language_Presentation_ScenarioNameParameter returns [org.emftext.language.Presentation.ScenarioNameParameter element = null] : a0= 'scenario' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NameLiteral ) a3= ';' ;
    public final org.emftext.language.Presentation.ScenarioNameParameter parse_org_emftext_language_Presentation_ScenarioNameParameter() throws RecognitionException {
        org.emftext.language.Presentation.ScenarioNameParameter element =  null;

        int parse_org_emftext_language_Presentation_ScenarioNameParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.emftext.language.Presentation.NameLiteral a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Sce.g:757:2: (a0= 'scenario' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NameLiteral ) a3= ';' )
            // Sce.g:758:2: a0= 'scenario' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NameLiteral ) a3= ';'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_org_emftext_language_Presentation_ScenarioNameParameter379); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createScenarioNameParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[25]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_org_emftext_language_Presentation_ScenarioNameParameter393); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createScenarioNameParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[26]);
            	}

            // Sce.g:786:2: (a2_0= parse_org_emftext_language_Presentation_NameLiteral )
            // Sce.g:787:3: a2_0= parse_org_emftext_language_Presentation_NameLiteral
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_NameLiteral_in_parse_org_emftext_language_Presentation_ScenarioNameParameter411);
            a2_0=parse_org_emftext_language_Presentation_NameLiteral();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createScenarioNameParameter();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.SCENARIO_NAME_PARAMETER__SCENARIO_NAME), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_4, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[27]);
            	}

            a3=(Token)match(input,10,FOLLOW_10_in_parse_org_emftext_language_Presentation_ScenarioNameParameter429); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createScenarioNameParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[28]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[29]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[30]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[31]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[32]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_emftext_language_Presentation_ScenarioNameParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_ScenarioNameParameter"



    // $ANTLR start "parse_org_emftext_language_Presentation_ActiveButtonsParameter"
    // Sce.g:832:1: parse_org_emftext_language_Presentation_ActiveButtonsParameter returns [org.emftext.language.Presentation.ActiveButtonsParameter element = null] : a0= 'active_buttons' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) a3= ';' ;
    public final org.emftext.language.Presentation.ActiveButtonsParameter parse_org_emftext_language_Presentation_ActiveButtonsParameter() throws RecognitionException {
        org.emftext.language.Presentation.ActiveButtonsParameter element =  null;

        int parse_org_emftext_language_Presentation_ActiveButtonsParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.emftext.language.Presentation.NumberLiteral a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Sce.g:835:2: (a0= 'active_buttons' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) a3= ';' )
            // Sce.g:836:2: a0= 'active_buttons' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) a3= ';'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter458); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createActiveButtonsParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[33]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter472); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createActiveButtonsParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[34]);
            	}

            // Sce.g:864:2: (a2_0= parse_org_emftext_language_Presentation_NumberLiteral )
            // Sce.g:865:3: a2_0= parse_org_emftext_language_Presentation_NumberLiteral
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter490);
            a2_0=parse_org_emftext_language_Presentation_NumberLiteral();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createActiveButtonsParameter();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.ACTIVE_BUTTONS_PARAMETER__ACTIVE_BUTTONS), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_4, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[35]);
            	}

            a3=(Token)match(input,10,FOLLOW_10_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter508); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createActiveButtonsParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[36]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[37]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[38]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[39]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[40]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_emftext_language_Presentation_ActiveButtonsParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_ActiveButtonsParameter"



    // $ANTLR start "parse_org_emftext_language_Presentation_ButtonCodesParameter"
    // Sce.g:910:1: parse_org_emftext_language_Presentation_ButtonCodesParameter returns [org.emftext.language.Presentation.ButtonCodesParameter element = null] : a0= 'button_codes' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) (a3= ',' (a4_0= parse_org_emftext_language_Presentation_NumberLiteral ) ) a5= ';' ;
    public final org.emftext.language.Presentation.ButtonCodesParameter parse_org_emftext_language_Presentation_ButtonCodesParameter() throws RecognitionException {
        org.emftext.language.Presentation.ButtonCodesParameter element =  null;

        int parse_org_emftext_language_Presentation_ButtonCodesParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        org.emftext.language.Presentation.NumberLiteral a2_0 =null;

        org.emftext.language.Presentation.NumberLiteral a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Sce.g:913:2: (a0= 'button_codes' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) (a3= ',' (a4_0= parse_org_emftext_language_Presentation_NumberLiteral ) ) a5= ';' )
            // Sce.g:914:2: a0= 'button_codes' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) (a3= ',' (a4_0= parse_org_emftext_language_Presentation_NumberLiteral ) ) a5= ';'
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_org_emftext_language_Presentation_ButtonCodesParameter537); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createButtonCodesParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[41]);
            	}

            a1=(Token)match(input,11,FOLLOW_11_in_parse_org_emftext_language_Presentation_ButtonCodesParameter551); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createButtonCodesParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[42]);
            	}

            // Sce.g:942:2: (a2_0= parse_org_emftext_language_Presentation_NumberLiteral )
            // Sce.g:943:3: a2_0= parse_org_emftext_language_Presentation_NumberLiteral
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_ButtonCodesParameter569);
            a2_0=parse_org_emftext_language_Presentation_NumberLiteral();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createButtonCodesParameter();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					addObjectToList(element, org.emftext.language.Presentation.PresentationPackage.BUTTON_CODES_PARAMETER__BUTTON_CODES, value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_4, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[43]);
            	}

            // Sce.g:968:2: (a3= ',' (a4_0= parse_org_emftext_language_Presentation_NumberLiteral ) )
            // Sce.g:969:3: a3= ',' (a4_0= parse_org_emftext_language_Presentation_NumberLiteral )
            {
            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_emftext_language_Presentation_ButtonCodesParameter591); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createButtonCodesParameter();
            				startIncompleteElement(element);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_5_0_0_0, null, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            		}

            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[44]);
            		}

            // Sce.g:983:3: (a4_0= parse_org_emftext_language_Presentation_NumberLiteral )
            // Sce.g:984:4: a4_0= parse_org_emftext_language_Presentation_NumberLiteral
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_ButtonCodesParameter613);
            a4_0=parse_org_emftext_language_Presentation_NumberLiteral();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            				if (terminateParsing) {
            					throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            				}
            				if (element == null) {
            					element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createButtonCodesParameter();
            					startIncompleteElement(element);
            				}
            				if (a4_0 != null) {
            					if (a4_0 != null) {
            						Object value = a4_0;
            						addObjectToList(element, org.emftext.language.Presentation.PresentationPackage.BUTTON_CODES_PARAMETER__BUTTON_CODES, value);
            						completedElement(value, true);
            					}
            					collectHiddenTokens(element);
            					retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_5_0_0_2, a4_0, true);
            					copyLocalizationInfos(a4_0, element);
            				}
            			}

            }


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[45]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[46]);
            	}

            a5=(Token)match(input,10,FOLLOW_10_in_parse_org_emftext_language_Presentation_ButtonCodesParameter643); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createButtonCodesParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[47]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[48]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[49]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[50]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[51]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_emftext_language_Presentation_ButtonCodesParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_ButtonCodesParameter"



    // $ANTLR start "parse_org_emftext_language_Presentation_NumberLiteral"
    // Sce.g:1035:1: parse_org_emftext_language_Presentation_NumberLiteral returns [org.emftext.language.Presentation.NumberLiteral element = null] : (a0= SIGNED_INTEGER ) ;
    public final org.emftext.language.Presentation.NumberLiteral parse_org_emftext_language_Presentation_NumberLiteral() throws RecognitionException {
        org.emftext.language.Presentation.NumberLiteral element =  null;

        int parse_org_emftext_language_Presentation_NumberLiteral_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Sce.g:1038:2: ( (a0= SIGNED_INTEGER ) )
            // Sce.g:1039:2: (a0= SIGNED_INTEGER )
            {
            // Sce.g:1039:2: (a0= SIGNED_INTEGER )
            // Sce.g:1040:3: a0= SIGNED_INTEGER
            {
            a0=(Token)match(input,SIGNED_INTEGER,FOLLOW_SIGNED_INTEGER_in_parse_org_emftext_language_Presentation_NumberLiteral676); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createNumberLiteral();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.Presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SIGNED_INTEGER");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.Presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.NUMBER_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.NUMBER_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_7_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[52]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[53]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_emftext_language_Presentation_NumberLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_NumberLiteral"



    // $ANTLR start "parse_org_emftext_language_Presentation_NameLiteral"
    // Sce.g:1078:1: parse_org_emftext_language_Presentation_NameLiteral returns [org.emftext.language.Presentation.NameLiteral element = null] : (a0= QUOTED_NAME ) ;
    public final org.emftext.language.Presentation.NameLiteral parse_org_emftext_language_Presentation_NameLiteral() throws RecognitionException {
        org.emftext.language.Presentation.NameLiteral element =  null;

        int parse_org_emftext_language_Presentation_NameLiteral_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Sce.g:1081:2: ( (a0= QUOTED_NAME ) )
            // Sce.g:1082:2: (a0= QUOTED_NAME )
            {
            // Sce.g:1082:2: (a0= QUOTED_NAME )
            // Sce.g:1083:3: a0= QUOTED_NAME
            {
            a0=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_parse_org_emftext_language_Presentation_NameLiteral716); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createNameLiteral();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.Presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_NAME");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.Presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.NAME_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.NAME_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_8_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[54]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_emftext_language_Presentation_NameLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_NameLiteral"



    // $ANTLR start "parse_org_emftext_language_Presentation_BooleanLiteral"
    // Sce.g:1120:1: parse_org_emftext_language_Presentation_BooleanLiteral returns [org.emftext.language.Presentation.BooleanLiteral element = null] : (a0= BOOLEAN ) ;
    public final org.emftext.language.Presentation.BooleanLiteral parse_org_emftext_language_Presentation_BooleanLiteral() throws RecognitionException {
        org.emftext.language.Presentation.BooleanLiteral element =  null;

        int parse_org_emftext_language_Presentation_BooleanLiteral_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Sce.g:1123:2: ( (a0= BOOLEAN ) )
            // Sce.g:1124:2: (a0= BOOLEAN )
            {
            // Sce.g:1124:2: (a0= BOOLEAN )
            // Sce.g:1125:3: a0= BOOLEAN
            {
            a0=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_parse_org_emftext_language_Presentation_BooleanLiteral756); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createBooleanLiteral();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.Presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BOOLEAN");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.Presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.BOOLEAN_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.Boolean resolved = (java.lang.Boolean) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.BOOLEAN_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_9_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_org_emftext_language_Presentation_BooleanLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_BooleanLiteral"



    // $ANTLR start "parse_org_emftext_language_Presentation_HeaderParameter"
    // Sce.g:1161:1: parse_org_emftext_language_Presentation_HeaderParameter returns [org.emftext.language.Presentation.HeaderParameter element = null] : (c0= parse_org_emftext_language_Presentation_ScenarioNameParameter |c1= parse_org_emftext_language_Presentation_ActiveButtonsParameter |c2= parse_org_emftext_language_Presentation_ButtonCodesParameter );
    public final org.emftext.language.Presentation.HeaderParameter parse_org_emftext_language_Presentation_HeaderParameter() throws RecognitionException {
        org.emftext.language.Presentation.HeaderParameter element =  null;

        int parse_org_emftext_language_Presentation_HeaderParameter_StartIndex = input.index();

        org.emftext.language.Presentation.ScenarioNameParameter c0 =null;

        org.emftext.language.Presentation.ActiveButtonsParameter c1 =null;

        org.emftext.language.Presentation.ButtonCodesParameter c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Sce.g:1162:2: (c0= parse_org_emftext_language_Presentation_ScenarioNameParameter |c1= parse_org_emftext_language_Presentation_ActiveButtonsParameter |c2= parse_org_emftext_language_Presentation_ButtonCodesParameter )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // Sce.g:1163:2: c0= parse_org_emftext_language_Presentation_ScenarioNameParameter
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_ScenarioNameParameter_in_parse_org_emftext_language_Presentation_HeaderParameter788);
                    c0=parse_org_emftext_language_Presentation_ScenarioNameParameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sce.g:1164:4: c1= parse_org_emftext_language_Presentation_ActiveButtonsParameter
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_ActiveButtonsParameter_in_parse_org_emftext_language_Presentation_HeaderParameter798);
                    c1=parse_org_emftext_language_Presentation_ActiveButtonsParameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sce.g:1165:4: c2= parse_org_emftext_language_Presentation_ButtonCodesParameter
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_ButtonCodesParameter_in_parse_org_emftext_language_Presentation_HeaderParameter808);
                    c2=parse_org_emftext_language_Presentation_ButtonCodesParameter();

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
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_emftext_language_Presentation_HeaderParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_HeaderParameter"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_Scenario_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_Header_in_parse_org_emftext_language_Presentation_Scenario119 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_SDL_in_parse_org_emftext_language_Presentation_Scenario146 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_PCL_in_parse_org_emftext_language_Presentation_Scenario181 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_HeaderParameter_in_parse_org_emftext_language_Presentation_Header237 = new BitSet(new long[]{0x0000000000019002L});
    public static final BitSet FOLLOW_13_in_parse_org_emftext_language_Presentation_SDL293 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_org_emftext_language_Presentation_SDL307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_org_emftext_language_Presentation_PCL336 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_org_emftext_language_Presentation_PCL350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_org_emftext_language_Presentation_ScenarioNameParameter379 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_org_emftext_language_Presentation_ScenarioNameParameter393 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_NameLiteral_in_parse_org_emftext_language_Presentation_ScenarioNameParameter411 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_org_emftext_language_Presentation_ScenarioNameParameter429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter458 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter472 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter490 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_org_emftext_language_Presentation_ButtonCodesParameter537 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_org_emftext_language_Presentation_ButtonCodesParameter551 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_ButtonCodesParameter569 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_emftext_language_Presentation_ButtonCodesParameter591 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_ButtonCodesParameter613 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_org_emftext_language_Presentation_ButtonCodesParameter643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_INTEGER_in_parse_org_emftext_language_Presentation_NumberLiteral676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_parse_org_emftext_language_Presentation_NameLiteral716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_parse_org_emftext_language_Presentation_BooleanLiteral756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_ScenarioNameParameter_in_parse_org_emftext_language_Presentation_HeaderParameter788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_ActiveButtonsParameter_in_parse_org_emftext_language_Presentation_HeaderParameter798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_ButtonCodesParameter_in_parse_org_emftext_language_Presentation_HeaderParameter808 = new BitSet(new long[]{0x0000000000000002L});

}