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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN", "LINEBREAK", "QUOTED_NAME", "QUOTED_TEXT", "SIGNED_INTEGER", "VAR_NAME", "WHITESPACE", "','", "';'", "'='", "'active_buttons'", "'begin'", "'begin_pcl'", "'bottom_y'", "'button_codes'", "'caption'", "'center_x'", "'center_y'", "'left_x'", "'picture'", "'rigth_x'", "'scenario'", "'text'", "'time'", "'top_y'", "'trial'", "'x'", "'y'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int BOOLEAN=4;
    public static final int LINEBREAK=5;
    public static final int QUOTED_NAME=6;
    public static final int QUOTED_TEXT=7;
    public static final int SIGNED_INTEGER=8;
    public static final int VAR_NAME=9;
    public static final int WHITESPACE=10;

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
        this.state.initializeRuleMemo(51 + 1);
         

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
    			if (type.getInstanceClass() == org.emftext.language.Presentation.TextLiteral.class) {
    				return parse_org_emftext_language_Presentation_TextLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.Trial.class) {
    				return parse_org_emftext_language_Presentation_Trial();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.StimulusList.class) {
    				return parse_org_emftext_language_Presentation_StimulusList();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.PictureStimulusEvent.class) {
    				return parse_org_emftext_language_Presentation_PictureStimulusEvent();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.Picture.class) {
    				return parse_org_emftext_language_Presentation_Picture();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.TimeParameter.class) {
    				return parse_org_emftext_language_Presentation_TimeParameter();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.TextStimulus.class) {
    				return parse_org_emftext_language_Presentation_TextStimulus();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.CoordinateDefinition.class) {
    				return parse_org_emftext_language_Presentation_CoordinateDefinition();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.Text.class) {
    				return parse_org_emftext_language_Presentation_Text();
    			}
    			if (type.getInstanceClass() == org.emftext.language.Presentation.CaptionParameter.class) {
    				return parse_org_emftext_language_Presentation_CaptionParameter();
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
    		int followSetID = 80;
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
    // Sce.g:556:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_emftext_language_Presentation_Scenario ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        org.emftext.language.Presentation.Scenario c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Sce.g:557:2: ( (c0= parse_org_emftext_language_Presentation_Scenario ) EOF )
            // Sce.g:558:2: (c0= parse_org_emftext_language_Presentation_Scenario ) EOF
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

            // Sce.g:567:2: (c0= parse_org_emftext_language_Presentation_Scenario )
            // Sce.g:568:3: c0= parse_org_emftext_language_Presentation_Scenario
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
    // Sce.g:576:1: parse_org_emftext_language_Presentation_Scenario returns [org.emftext.language.Presentation.Scenario element = null] : (a0_0= parse_org_emftext_language_Presentation_Header ) ( (a1_0= parse_org_emftext_language_Presentation_SDL ) )* ( (a2_0= parse_org_emftext_language_Presentation_PCL ) )* ;
    public final org.emftext.language.Presentation.Scenario parse_org_emftext_language_Presentation_Scenario() throws RecognitionException {
        org.emftext.language.Presentation.Scenario element =  null;

        int parse_org_emftext_language_Presentation_Scenario_StartIndex = input.index();

        org.emftext.language.Presentation.Header a0_0 =null;

        org.emftext.language.Presentation.SDL a1_0 =null;

        org.emftext.language.Presentation.PCL a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Sce.g:579:2: ( (a0_0= parse_org_emftext_language_Presentation_Header ) ( (a1_0= parse_org_emftext_language_Presentation_SDL ) )* ( (a2_0= parse_org_emftext_language_Presentation_PCL ) )* )
            // Sce.g:580:2: (a0_0= parse_org_emftext_language_Presentation_Header ) ( (a1_0= parse_org_emftext_language_Presentation_SDL ) )* ( (a2_0= parse_org_emftext_language_Presentation_PCL ) )*
            {
            // Sce.g:580:2: (a0_0= parse_org_emftext_language_Presentation_Header )
            // Sce.g:581:3: a0_0= parse_org_emftext_language_Presentation_Header
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

            // Sce.g:607:2: ( (a1_0= parse_org_emftext_language_Presentation_SDL ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Sce.g:608:3: (a1_0= parse_org_emftext_language_Presentation_SDL )
            	    {
            	    // Sce.g:608:3: (a1_0= parse_org_emftext_language_Presentation_SDL )
            	    // Sce.g:609:4: a1_0= parse_org_emftext_language_Presentation_SDL
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

            // Sce.g:636:2: ( (a2_0= parse_org_emftext_language_Presentation_PCL ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Sce.g:637:3: (a2_0= parse_org_emftext_language_Presentation_PCL )
            	    {
            	    // Sce.g:637:3: (a2_0= parse_org_emftext_language_Presentation_PCL )
            	    // Sce.g:638:4: a2_0= parse_org_emftext_language_Presentation_PCL
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
    // Sce.g:666:1: parse_org_emftext_language_Presentation_Header returns [org.emftext.language.Presentation.Header element = null] : ( ( (a0_0= parse_org_emftext_language_Presentation_HeaderParameter ) ) )* ;
    public final org.emftext.language.Presentation.Header parse_org_emftext_language_Presentation_Header() throws RecognitionException {
        org.emftext.language.Presentation.Header element =  null;

        int parse_org_emftext_language_Presentation_Header_StartIndex = input.index();

        org.emftext.language.Presentation.HeaderParameter a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Sce.g:669:2: ( ( ( (a0_0= parse_org_emftext_language_Presentation_HeaderParameter ) ) )* )
            // Sce.g:670:2: ( ( (a0_0= parse_org_emftext_language_Presentation_HeaderParameter ) ) )*
            {
            // Sce.g:670:2: ( ( (a0_0= parse_org_emftext_language_Presentation_HeaderParameter ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==18||LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Sce.g:671:3: ( (a0_0= parse_org_emftext_language_Presentation_HeaderParameter ) )
            	    {
            	    // Sce.g:671:3: ( (a0_0= parse_org_emftext_language_Presentation_HeaderParameter ) )
            	    // Sce.g:672:4: (a0_0= parse_org_emftext_language_Presentation_HeaderParameter )
            	    {
            	    // Sce.g:672:4: (a0_0= parse_org_emftext_language_Presentation_HeaderParameter )
            	    // Sce.g:673:5: a0_0= parse_org_emftext_language_Presentation_HeaderParameter
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
    // Sce.g:715:1: parse_org_emftext_language_Presentation_SDL returns [org.emftext.language.Presentation.SDL element = null] : a0= 'begin' a1= ';' ( ( (a2_0= parse_org_emftext_language_Presentation_ScenarioObject ) ) )* ;
    public final org.emftext.language.Presentation.SDL parse_org_emftext_language_Presentation_SDL() throws RecognitionException {
        org.emftext.language.Presentation.SDL element =  null;

        int parse_org_emftext_language_Presentation_SDL_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        org.emftext.language.Presentation.ScenarioObject a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Sce.g:718:2: (a0= 'begin' a1= ';' ( ( (a2_0= parse_org_emftext_language_Presentation_ScenarioObject ) ) )* )
            // Sce.g:719:2: a0= 'begin' a1= ';' ( ( (a2_0= parse_org_emftext_language_Presentation_ScenarioObject ) ) )*
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_org_emftext_language_Presentation_SDL293); if (state.failed) return element;

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

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_SDL307); if (state.failed) return element;

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
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[21]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[22]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[23]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[24]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[25]);
            	}

            // Sce.g:751:2: ( ( (a2_0= parse_org_emftext_language_Presentation_ScenarioObject ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23||LA4_0==26||LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Sce.g:752:3: ( (a2_0= parse_org_emftext_language_Presentation_ScenarioObject ) )
            	    {
            	    // Sce.g:752:3: ( (a2_0= parse_org_emftext_language_Presentation_ScenarioObject ) )
            	    // Sce.g:753:4: (a2_0= parse_org_emftext_language_Presentation_ScenarioObject )
            	    {
            	    // Sce.g:753:4: (a2_0= parse_org_emftext_language_Presentation_ScenarioObject )
            	    // Sce.g:754:5: a2_0= parse_org_emftext_language_Presentation_ScenarioObject
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_ScenarioObject_in_parse_org_emftext_language_Presentation_SDL336);
            	    a2_0=parse_org_emftext_language_Presentation_ScenarioObject();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createSDL();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a2_0 != null) {
            	    						if (a2_0 != null) {
            	    							Object value = a2_0;
            	    							addObjectToList(element, org.emftext.language.Presentation.PresentationPackage.SDL__SCENARIO_OBJECT, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_3_0_0_0, a2_0, true);
            	    						copyLocalizationInfos(a2_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[26]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[27]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[28]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[29]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[30]);
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
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[31]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[32]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[33]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[34]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[35]);
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
    // Sce.g:796:1: parse_org_emftext_language_Presentation_PCL returns [org.emftext.language.Presentation.PCL element = null] : a0= 'begin_pcl' a1= ';' ;
    public final org.emftext.language.Presentation.PCL parse_org_emftext_language_Presentation_PCL() throws RecognitionException {
        org.emftext.language.Presentation.PCL element =  null;

        int parse_org_emftext_language_Presentation_PCL_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Sce.g:799:2: (a0= 'begin_pcl' a1= ';' )
            // Sce.g:800:2: a0= 'begin_pcl' a1= ';'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_org_emftext_language_Presentation_PCL392); if (state.failed) return element;

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
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[36]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_PCL406); if (state.failed) return element;

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
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[37]);
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
    // Sce.g:830:1: parse_org_emftext_language_Presentation_ScenarioNameParameter returns [org.emftext.language.Presentation.ScenarioNameParameter element = null] : a0= 'scenario' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NameLiteral ) a3= ';' ;
    public final org.emftext.language.Presentation.ScenarioNameParameter parse_org_emftext_language_Presentation_ScenarioNameParameter() throws RecognitionException {
        org.emftext.language.Presentation.ScenarioNameParameter element =  null;

        int parse_org_emftext_language_Presentation_ScenarioNameParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.emftext.language.Presentation.NameLiteral a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Sce.g:833:2: (a0= 'scenario' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NameLiteral ) a3= ';' )
            // Sce.g:834:2: a0= 'scenario' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NameLiteral ) a3= ';'
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_org_emftext_language_Presentation_ScenarioNameParameter435); if (state.failed) return element;

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
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[38]);
            	}

            a1=(Token)match(input,13,FOLLOW_13_in_parse_org_emftext_language_Presentation_ScenarioNameParameter449); if (state.failed) return element;

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
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenarioNameParameter(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[39]);
            	}

            // Sce.g:862:2: (a2_0= parse_org_emftext_language_Presentation_NameLiteral )
            // Sce.g:863:3: a2_0= parse_org_emftext_language_Presentation_NameLiteral
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_NameLiteral_in_parse_org_emftext_language_Presentation_ScenarioNameParameter467);
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
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.SCENARIO_NAME_PARAMETER__NAME_LITERAL), value);
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
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[40]);
            	}

            a3=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_ScenarioNameParameter485); if (state.failed) return element;

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
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[41]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[42]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[43]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[44]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[45]);
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
    // Sce.g:908:1: parse_org_emftext_language_Presentation_ActiveButtonsParameter returns [org.emftext.language.Presentation.ActiveButtonsParameter element = null] : a0= 'active_buttons' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) a3= ';' ;
    public final org.emftext.language.Presentation.ActiveButtonsParameter parse_org_emftext_language_Presentation_ActiveButtonsParameter() throws RecognitionException {
        org.emftext.language.Presentation.ActiveButtonsParameter element =  null;

        int parse_org_emftext_language_Presentation_ActiveButtonsParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.emftext.language.Presentation.NumberLiteral a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Sce.g:911:2: (a0= 'active_buttons' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) a3= ';' )
            // Sce.g:912:2: a0= 'active_buttons' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) a3= ';'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter514); if (state.failed) return element;

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
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[46]);
            	}

            a1=(Token)match(input,13,FOLLOW_13_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter528); if (state.failed) return element;

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
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getActiveButtonsParameter(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[47]);
            	}

            // Sce.g:940:2: (a2_0= parse_org_emftext_language_Presentation_NumberLiteral )
            // Sce.g:941:3: a2_0= parse_org_emftext_language_Presentation_NumberLiteral
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter546);
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
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL), value);
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
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[48]);
            	}

            a3=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter564); if (state.failed) return element;

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
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[49]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[50]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[51]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[52]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[53]);
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
    // Sce.g:986:1: parse_org_emftext_language_Presentation_ButtonCodesParameter returns [org.emftext.language.Presentation.ButtonCodesParameter element = null] : a0= 'button_codes' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) ( (a3= ',' (a4_0= parse_org_emftext_language_Presentation_NumberLiteral ) ) )* a5= ';' ;
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

            // Sce.g:989:2: (a0= 'button_codes' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) ( (a3= ',' (a4_0= parse_org_emftext_language_Presentation_NumberLiteral ) ) )* a5= ';' )
            // Sce.g:990:2: a0= 'button_codes' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) ( (a3= ',' (a4_0= parse_org_emftext_language_Presentation_NumberLiteral ) ) )* a5= ';'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_org_emftext_language_Presentation_ButtonCodesParameter593); if (state.failed) return element;

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
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[54]);
            	}

            a1=(Token)match(input,13,FOLLOW_13_in_parse_org_emftext_language_Presentation_ButtonCodesParameter607); if (state.failed) return element;

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
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[55]);
            	}

            // Sce.g:1018:2: (a2_0= parse_org_emftext_language_Presentation_NumberLiteral )
            // Sce.g:1019:3: a2_0= parse_org_emftext_language_Presentation_NumberLiteral
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_ButtonCodesParameter625);
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
            					addObjectToList(element, org.emftext.language.Presentation.PresentationPackage.BUTTON_CODES_PARAMETER__NUMBER_LITERAL, value);
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
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[56]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[57]);
            	}

            // Sce.g:1045:2: ( (a3= ',' (a4_0= parse_org_emftext_language_Presentation_NumberLiteral ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Sce.g:1046:3: (a3= ',' (a4_0= parse_org_emftext_language_Presentation_NumberLiteral ) )
            	    {
            	    // Sce.g:1046:3: (a3= ',' (a4_0= parse_org_emftext_language_Presentation_NumberLiteral ) )
            	    // Sce.g:1047:4: a3= ',' (a4_0= parse_org_emftext_language_Presentation_NumberLiteral )
            	    {
            	    a3=(Token)match(input,11,FOLLOW_11_in_parse_org_emftext_language_Presentation_ButtonCodesParameter652); if (state.failed) return element;

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
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getButtonCodesParameter(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[58]);
            	    			}

            	    // Sce.g:1061:4: (a4_0= parse_org_emftext_language_Presentation_NumberLiteral )
            	    // Sce.g:1062:5: a4_0= parse_org_emftext_language_Presentation_NumberLiteral
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_ButtonCodesParameter678);
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
            	    							addObjectToList(element, org.emftext.language.Presentation.PresentationPackage.BUTTON_CODES_PARAMETER__NUMBER_LITERAL, value);
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
            	    				addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[59]);
            	    				addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[60]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[61]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[62]);
            	}

            a5=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_ButtonCodesParameter719); if (state.failed) return element;

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
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[63]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[64]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[65]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[66]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[67]);
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
    // Sce.g:1116:1: parse_org_emftext_language_Presentation_NumberLiteral returns [org.emftext.language.Presentation.NumberLiteral element = null] : (a0= SIGNED_INTEGER ) ;
    public final org.emftext.language.Presentation.NumberLiteral parse_org_emftext_language_Presentation_NumberLiteral() throws RecognitionException {
        org.emftext.language.Presentation.NumberLiteral element =  null;

        int parse_org_emftext_language_Presentation_NumberLiteral_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Sce.g:1119:2: ( (a0= SIGNED_INTEGER ) )
            // Sce.g:1120:2: (a0= SIGNED_INTEGER )
            {
            // Sce.g:1120:2: (a0= SIGNED_INTEGER )
            // Sce.g:1121:3: a0= SIGNED_INTEGER
            {
            a0=(Token)match(input,SIGNED_INTEGER,FOLLOW_SIGNED_INTEGER_in_parse_org_emftext_language_Presentation_NumberLiteral752); if (state.failed) return element;

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
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[68]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[69]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[70]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[71]);
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
    // Sce.g:1161:1: parse_org_emftext_language_Presentation_NameLiteral returns [org.emftext.language.Presentation.NameLiteral element = null] : (a0= QUOTED_NAME ) ;
    public final org.emftext.language.Presentation.NameLiteral parse_org_emftext_language_Presentation_NameLiteral() throws RecognitionException {
        org.emftext.language.Presentation.NameLiteral element =  null;

        int parse_org_emftext_language_Presentation_NameLiteral_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Sce.g:1164:2: ( (a0= QUOTED_NAME ) )
            // Sce.g:1165:2: (a0= QUOTED_NAME )
            {
            // Sce.g:1165:2: (a0= QUOTED_NAME )
            // Sce.g:1166:3: a0= QUOTED_NAME
            {
            a0=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_parse_org_emftext_language_Presentation_NameLiteral792); if (state.failed) return element;

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
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[72]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[73]);
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
    // Sce.g:1204:1: parse_org_emftext_language_Presentation_BooleanLiteral returns [org.emftext.language.Presentation.BooleanLiteral element = null] : (a0= BOOLEAN ) ;
    public final org.emftext.language.Presentation.BooleanLiteral parse_org_emftext_language_Presentation_BooleanLiteral() throws RecognitionException {
        org.emftext.language.Presentation.BooleanLiteral element =  null;

        int parse_org_emftext_language_Presentation_BooleanLiteral_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Sce.g:1207:2: ( (a0= BOOLEAN ) )
            // Sce.g:1208:2: (a0= BOOLEAN )
            {
            // Sce.g:1208:2: (a0= BOOLEAN )
            // Sce.g:1209:3: a0= BOOLEAN
            {
            a0=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_parse_org_emftext_language_Presentation_BooleanLiteral832); if (state.failed) return element;

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



    // $ANTLR start "parse_org_emftext_language_Presentation_TextLiteral"
    // Sce.g:1245:1: parse_org_emftext_language_Presentation_TextLiteral returns [org.emftext.language.Presentation.TextLiteral element = null] : ( (a0= QUOTED_TEXT ) |c0= parse_org_emftext_language_Presentation_NameLiteral );
    public final org.emftext.language.Presentation.TextLiteral parse_org_emftext_language_Presentation_TextLiteral() throws RecognitionException {
        org.emftext.language.Presentation.TextLiteral element =  null;

        int parse_org_emftext_language_Presentation_TextLiteral_StartIndex = input.index();

        Token a0=null;
        org.emftext.language.Presentation.NameLiteral c0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Sce.g:1248:2: ( (a0= QUOTED_TEXT ) |c0= parse_org_emftext_language_Presentation_NameLiteral )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==QUOTED_TEXT) ) {
                alt6=1;
            }
            else if ( (LA6_0==QUOTED_NAME) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Sce.g:1249:2: (a0= QUOTED_TEXT )
                    {
                    // Sce.g:1249:2: (a0= QUOTED_TEXT )
                    // Sce.g:1250:3: a0= QUOTED_TEXT
                    {
                    a0=(Token)match(input,QUOTED_TEXT,FOLLOW_QUOTED_TEXT_in_parse_org_emftext_language_Presentation_TextLiteral872); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (terminateParsing) {
                    				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
                    			}
                    			if (element == null) {
                    				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTextLiteral();
                    				startIncompleteElement(element);
                    			}
                    			if (a0 != null) {
                    				org.emftext.language.Presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_TEXT");
                    				tokenResolver.setOptions(getOptions());
                    				org.emftext.language.Presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
                    				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.TEXT_LITERAL__VALUE), result);
                    				Object resolvedObject = result.getResolvedToken();
                    				if (resolvedObject == null) {
                    					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
                    				}
                    				java.lang.String resolved = (java.lang.String) resolvedObject;
                    				if (resolved != null) {
                    					Object value = resolved;
                    					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.TEXT_LITERAL__VALUE), value);
                    					completedElement(value, false);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_10_0_0_0, resolved, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[74]);
                    	}

                    }
                    break;
                case 2 :
                    // Sce.g:1287:2: c0= parse_org_emftext_language_Presentation_NameLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_NameLiteral_in_parse_org_emftext_language_Presentation_TextLiteral898);
                    c0=parse_org_emftext_language_Presentation_NameLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_emftext_language_Presentation_TextLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_TextLiteral"



    // $ANTLR start "parse_org_emftext_language_Presentation_Trial"
    // Sce.g:1291:1: parse_org_emftext_language_Presentation_Trial returns [org.emftext.language.Presentation.Trial element = null] : a0= 'trial' a1= '{' (a2_0= parse_org_emftext_language_Presentation_StimulusList ) a3= '}' (a4= VAR_NAME ) a5= ';' ;
    public final org.emftext.language.Presentation.Trial parse_org_emftext_language_Presentation_Trial() throws RecognitionException {
        org.emftext.language.Presentation.Trial element =  null;

        int parse_org_emftext_language_Presentation_Trial_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        org.emftext.language.Presentation.StimulusList a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Sce.g:1294:2: (a0= 'trial' a1= '{' (a2_0= parse_org_emftext_language_Presentation_StimulusList ) a3= '}' (a4= VAR_NAME ) a5= ';' )
            // Sce.g:1295:2: a0= 'trial' a1= '{' (a2_0= parse_org_emftext_language_Presentation_StimulusList ) a3= '}' (a4= VAR_NAME ) a5= ';'
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_org_emftext_language_Presentation_Trial923); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTrial();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[75]);
            	}

            a1=(Token)match(input,32,FOLLOW_32_in_parse_org_emftext_language_Presentation_Trial937); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTrial();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getTrial(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[76]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[77]);
            	}

            // Sce.g:1324:2: (a2_0= parse_org_emftext_language_Presentation_StimulusList )
            // Sce.g:1325:3: a2_0= parse_org_emftext_language_Presentation_StimulusList
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_StimulusList_in_parse_org_emftext_language_Presentation_Trial955);
            a2_0=parse_org_emftext_language_Presentation_StimulusList();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTrial();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.TRIAL__STIMULUS_LIST), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_4, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[78]);
            	}

            a3=(Token)match(input,33,FOLLOW_33_in_parse_org_emftext_language_Presentation_Trial973); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTrial();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[79]);
            	}

            // Sce.g:1364:2: (a4= VAR_NAME )
            // Sce.g:1365:3: a4= VAR_NAME
            {
            a4=(Token)match(input,VAR_NAME,FOLLOW_VAR_NAME_in_parse_org_emftext_language_Presentation_Trial991); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTrial();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				org.emftext.language.Presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VAR_NAME");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.Presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.TRIAL__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.TRIAL__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_8, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[80]);
            	}

            a5=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_Trial1012); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTrial();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[81]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[82]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[83]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[84]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[85]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_org_emftext_language_Presentation_Trial_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_Trial"



    // $ANTLR start "parse_org_emftext_language_Presentation_StimulusList"
    // Sce.g:1420:1: parse_org_emftext_language_Presentation_StimulusList returns [org.emftext.language.Presentation.StimulusList element = null] : ( ( (a0_0= parse_org_emftext_language_Presentation_StimulusEvent ) ) )* ;
    public final org.emftext.language.Presentation.StimulusList parse_org_emftext_language_Presentation_StimulusList() throws RecognitionException {
        org.emftext.language.Presentation.StimulusList element =  null;

        int parse_org_emftext_language_Presentation_StimulusList_StartIndex = input.index();

        org.emftext.language.Presentation.StimulusEvent a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Sce.g:1423:2: ( ( ( (a0_0= parse_org_emftext_language_Presentation_StimulusEvent ) ) )* )
            // Sce.g:1424:2: ( ( (a0_0= parse_org_emftext_language_Presentation_StimulusEvent ) ) )*
            {
            // Sce.g:1424:2: ( ( (a0_0= parse_org_emftext_language_Presentation_StimulusEvent ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Sce.g:1425:3: ( (a0_0= parse_org_emftext_language_Presentation_StimulusEvent ) )
            	    {
            	    // Sce.g:1425:3: ( (a0_0= parse_org_emftext_language_Presentation_StimulusEvent ) )
            	    // Sce.g:1426:4: (a0_0= parse_org_emftext_language_Presentation_StimulusEvent )
            	    {
            	    // Sce.g:1426:4: (a0_0= parse_org_emftext_language_Presentation_StimulusEvent )
            	    // Sce.g:1427:5: a0_0= parse_org_emftext_language_Presentation_StimulusEvent
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_StimulusEvent_in_parse_org_emftext_language_Presentation_StimulusList1056);
            	    a0_0=parse_org_emftext_language_Presentation_StimulusEvent();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createStimulusList();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a0_0 != null) {
            	    						if (a0_0 != null) {
            	    							Object value = a0_0;
            	    							addObjectToList(element, org.emftext.language.Presentation.PresentationPackage.STIMULUS_LIST__STIMULUS_EVENT, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_12_0_0_0_0_0_0, a0_0, true);
            	    						copyLocalizationInfos(a0_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getStimulusList(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[86]);
            	    				addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[87]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getStimulusList(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[88]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[89]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_org_emftext_language_Presentation_StimulusList_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_StimulusList"



    // $ANTLR start "parse_org_emftext_language_Presentation_PictureStimulusEvent"
    // Sce.g:1463:1: parse_org_emftext_language_Presentation_PictureStimulusEvent returns [org.emftext.language.Presentation.PictureStimulusEvent element = null] : (a0_0= parse_org_emftext_language_Presentation_Picture ) ( ( (a1_0= parse_org_emftext_language_Presentation_StimulusEventParameter ) ) )* ;
    public final org.emftext.language.Presentation.PictureStimulusEvent parse_org_emftext_language_Presentation_PictureStimulusEvent() throws RecognitionException {
        org.emftext.language.Presentation.PictureStimulusEvent element =  null;

        int parse_org_emftext_language_Presentation_PictureStimulusEvent_StartIndex = input.index();

        org.emftext.language.Presentation.Picture a0_0 =null;

        org.emftext.language.Presentation.StimulusEventParameter a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // Sce.g:1466:2: ( (a0_0= parse_org_emftext_language_Presentation_Picture ) ( ( (a1_0= parse_org_emftext_language_Presentation_StimulusEventParameter ) ) )* )
            // Sce.g:1467:2: (a0_0= parse_org_emftext_language_Presentation_Picture ) ( ( (a1_0= parse_org_emftext_language_Presentation_StimulusEventParameter ) ) )*
            {
            // Sce.g:1467:2: (a0_0= parse_org_emftext_language_Presentation_Picture )
            // Sce.g:1468:3: a0_0= parse_org_emftext_language_Presentation_Picture
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_Picture_in_parse_org_emftext_language_Presentation_PictureStimulusEvent1116);
            a0_0=parse_org_emftext_language_Presentation_Picture();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createPictureStimulusEvent();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.PICTURE_STIMULUS_EVENT__PICTURE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_13_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPictureStimulusEvent(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[90]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[91]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[92]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[93]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[94]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[95]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[96]);
            	}

            // Sce.g:1499:2: ( ( (a1_0= parse_org_emftext_language_Presentation_StimulusEventParameter ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Sce.g:1500:3: ( (a1_0= parse_org_emftext_language_Presentation_StimulusEventParameter ) )
            	    {
            	    // Sce.g:1500:3: ( (a1_0= parse_org_emftext_language_Presentation_StimulusEventParameter ) )
            	    // Sce.g:1501:4: (a1_0= parse_org_emftext_language_Presentation_StimulusEventParameter )
            	    {
            	    // Sce.g:1501:4: (a1_0= parse_org_emftext_language_Presentation_StimulusEventParameter )
            	    // Sce.g:1502:5: a1_0= parse_org_emftext_language_Presentation_StimulusEventParameter
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_StimulusEventParameter_in_parse_org_emftext_language_Presentation_PictureStimulusEvent1149);
            	    a1_0=parse_org_emftext_language_Presentation_StimulusEventParameter();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createPictureStimulusEvent();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a1_0 != null) {
            	    						if (a1_0 != null) {
            	    							Object value = a1_0;
            	    							addObjectToList(element, org.emftext.language.Presentation.PresentationPackage.PICTURE_STIMULUS_EVENT__STIMULUS_EVENT_PARAMETER, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_13_0_0_2_0_0_0, a1_0, true);
            	    						copyLocalizationInfos(a1_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPictureStimulusEvent(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[97]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[98]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[99]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[100]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[101]);
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[102]);
            	    				addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[103]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPictureStimulusEvent(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[104]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[105]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[106]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[107]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[108]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[109]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[110]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_org_emftext_language_Presentation_PictureStimulusEvent_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_PictureStimulusEvent"



    // $ANTLR start "parse_org_emftext_language_Presentation_Picture"
    // Sce.g:1548:1: parse_org_emftext_language_Presentation_Picture returns [org.emftext.language.Presentation.Picture element = null] : a0= 'picture' a1= '{' ( ( (a2_0= parse_org_emftext_language_Presentation_PicturePart ) ) )* a3= '}' (a4= VAR_NAME ) a5= ';' ;
    public final org.emftext.language.Presentation.Picture parse_org_emftext_language_Presentation_Picture() throws RecognitionException {
        org.emftext.language.Presentation.Picture element =  null;

        int parse_org_emftext_language_Presentation_Picture_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        org.emftext.language.Presentation.PicturePart a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // Sce.g:1551:2: (a0= 'picture' a1= '{' ( ( (a2_0= parse_org_emftext_language_Presentation_PicturePart ) ) )* a3= '}' (a4= VAR_NAME ) a5= ';' )
            // Sce.g:1552:2: a0= 'picture' a1= '{' ( ( (a2_0= parse_org_emftext_language_Presentation_PicturePart ) ) )* a3= '}' (a4= VAR_NAME ) a5= ';'
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_emftext_language_Presentation_Picture1205); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createPicture();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[111]);
            	}

            a1=(Token)match(input,32,FOLLOW_32_in_parse_org_emftext_language_Presentation_Picture1219); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createPicture();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPicture(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[112]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[113]);
            	}

            // Sce.g:1581:2: ( ( (a2_0= parse_org_emftext_language_Presentation_PicturePart ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Sce.g:1582:3: ( (a2_0= parse_org_emftext_language_Presentation_PicturePart ) )
            	    {
            	    // Sce.g:1582:3: ( (a2_0= parse_org_emftext_language_Presentation_PicturePart ) )
            	    // Sce.g:1583:4: (a2_0= parse_org_emftext_language_Presentation_PicturePart )
            	    {
            	    // Sce.g:1583:4: (a2_0= parse_org_emftext_language_Presentation_PicturePart )
            	    // Sce.g:1584:5: a2_0= parse_org_emftext_language_Presentation_PicturePart
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_PicturePart_in_parse_org_emftext_language_Presentation_Picture1248);
            	    a2_0=parse_org_emftext_language_Presentation_PicturePart();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createPicture();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a2_0 != null) {
            	    						if (a2_0 != null) {
            	    							Object value = a2_0;
            	    							addObjectToList(element, org.emftext.language.Presentation.PresentationPackage.PICTURE__PICTURE_PART, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_4_0_0_0, a2_0, true);
            	    						copyLocalizationInfos(a2_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPicture(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[114]);
            	    				addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[115]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPicture(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[116]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[117]);
            	}

            a3=(Token)match(input,33,FOLLOW_33_in_parse_org_emftext_language_Presentation_Picture1289); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createPicture();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[118]);
            	}

            // Sce.g:1632:2: (a4= VAR_NAME )
            // Sce.g:1633:3: a4= VAR_NAME
            {
            a4=(Token)match(input,VAR_NAME,FOLLOW_VAR_NAME_in_parse_org_emftext_language_Presentation_Picture1307); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createPicture();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				org.emftext.language.Presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VAR_NAME");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.Presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.PICTURE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.PICTURE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_7, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[119]);
            	}

            a5=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_Picture1328); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createPicture();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[120]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[121]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[122]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[123]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[124]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPictureStimulusEvent(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[125]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[126]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_org_emftext_language_Presentation_Picture_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_Picture"



    // $ANTLR start "parse_org_emftext_language_Presentation_TimeParameter"
    // Sce.g:1690:1: parse_org_emftext_language_Presentation_TimeParameter returns [org.emftext.language.Presentation.TimeParameter element = null] : a0= 'time' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) a3= ';' ;
    public final org.emftext.language.Presentation.TimeParameter parse_org_emftext_language_Presentation_TimeParameter() throws RecognitionException {
        org.emftext.language.Presentation.TimeParameter element =  null;

        int parse_org_emftext_language_Presentation_TimeParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.emftext.language.Presentation.NumberLiteral a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // Sce.g:1693:2: (a0= 'time' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) a3= ';' )
            // Sce.g:1694:2: a0= 'time' a1= '=' (a2_0= parse_org_emftext_language_Presentation_NumberLiteral ) a3= ';'
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_org_emftext_language_Presentation_TimeParameter1357); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTimeParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_15_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[127]);
            	}

            a1=(Token)match(input,13,FOLLOW_13_in_parse_org_emftext_language_Presentation_TimeParameter1371); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTimeParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_15_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getTimeParameter(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[128]);
            	}

            // Sce.g:1722:2: (a2_0= parse_org_emftext_language_Presentation_NumberLiteral )
            // Sce.g:1723:3: a2_0= parse_org_emftext_language_Presentation_NumberLiteral
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_TimeParameter1389);
            a2_0=parse_org_emftext_language_Presentation_NumberLiteral();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTimeParameter();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.TIME_PARAMETER__NUMBER_LITERAL), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_15_0_0_4, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[129]);
            	}

            a3=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_TimeParameter1407); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTimeParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_15_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getPictureStimulusEvent(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[130]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[131]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[132]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[133]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[134]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[135]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[136]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_org_emftext_language_Presentation_TimeParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_TimeParameter"



    // $ANTLR start "parse_org_emftext_language_Presentation_TextStimulus"
    // Sce.g:1770:1: parse_org_emftext_language_Presentation_TextStimulus returns [org.emftext.language.Presentation.TextStimulus element = null] : (a0_0= parse_org_emftext_language_Presentation_Text ) (a1_0= parse_org_emftext_language_Presentation_CoordinateDefinition ) (a2_0= parse_org_emftext_language_Presentation_CoordinateDefinition ) ;
    public final org.emftext.language.Presentation.TextStimulus parse_org_emftext_language_Presentation_TextStimulus() throws RecognitionException {
        org.emftext.language.Presentation.TextStimulus element =  null;

        int parse_org_emftext_language_Presentation_TextStimulus_StartIndex = input.index();

        org.emftext.language.Presentation.Text a0_0 =null;

        org.emftext.language.Presentation.CoordinateDefinition a1_0 =null;

        org.emftext.language.Presentation.CoordinateDefinition a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // Sce.g:1773:2: ( (a0_0= parse_org_emftext_language_Presentation_Text ) (a1_0= parse_org_emftext_language_Presentation_CoordinateDefinition ) (a2_0= parse_org_emftext_language_Presentation_CoordinateDefinition ) )
            // Sce.g:1774:2: (a0_0= parse_org_emftext_language_Presentation_Text ) (a1_0= parse_org_emftext_language_Presentation_CoordinateDefinition ) (a2_0= parse_org_emftext_language_Presentation_CoordinateDefinition )
            {
            // Sce.g:1774:2: (a0_0= parse_org_emftext_language_Presentation_Text )
            // Sce.g:1775:3: a0_0= parse_org_emftext_language_Presentation_Text
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_Text_in_parse_org_emftext_language_Presentation_TextStimulus1440);
            a0_0=parse_org_emftext_language_Presentation_Text();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTextStimulus();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.TEXT_STIMULUS__TEXT), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_16_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getTextStimulus(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[137]);
            	}

            // Sce.g:1800:2: (a1_0= parse_org_emftext_language_Presentation_CoordinateDefinition )
            // Sce.g:1801:3: a1_0= parse_org_emftext_language_Presentation_CoordinateDefinition
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_CoordinateDefinition_in_parse_org_emftext_language_Presentation_TextStimulus1462);
            a1_0=parse_org_emftext_language_Presentation_CoordinateDefinition();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTextStimulus();
            				startIncompleteElement(element);
            			}
            			if (a1_0 != null) {
            				if (a1_0 != null) {
            					Object value = a1_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.TEXT_STIMULUS__XDEFINITION), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_16_0_0_2, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getTextStimulus(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[138]);
            	}

            // Sce.g:1826:2: (a2_0= parse_org_emftext_language_Presentation_CoordinateDefinition )
            // Sce.g:1827:3: a2_0= parse_org_emftext_language_Presentation_CoordinateDefinition
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_CoordinateDefinition_in_parse_org_emftext_language_Presentation_TextStimulus1484);
            a2_0=parse_org_emftext_language_Presentation_CoordinateDefinition();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createTextStimulus();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.TEXT_STIMULUS__YDEFINITION), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_16_0_0_4, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[139]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[140]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[141]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[142]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[143]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[144]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_org_emftext_language_Presentation_TextStimulus_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_TextStimulus"



    // $ANTLR start "parse_org_emftext_language_Presentation_CoordinateDefinition"
    // Sce.g:1859:1: parse_org_emftext_language_Presentation_CoordinateDefinition returns [org.emftext.language.Presentation.CoordinateDefinition element = null] : ( (a0= 'x' |a1= 'y' |a2= 'center_x' |a3= 'center_y' |a4= 'left_x' |a5= 'top_y' ) ) a8= '=' (a9= SIGNED_INTEGER ) a10= ';' ( ( (a11= 'rigth_x' |a12= 'bottom_y' ) a13= '=' (a14= SIGNED_INTEGER ) a15= ';' ) )? ;
    public final org.emftext.language.Presentation.CoordinateDefinition parse_org_emftext_language_Presentation_CoordinateDefinition() throws RecognitionException {
        org.emftext.language.Presentation.CoordinateDefinition element =  null;

        int parse_org_emftext_language_Presentation_CoordinateDefinition_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // Sce.g:1862:2: ( ( (a0= 'x' |a1= 'y' |a2= 'center_x' |a3= 'center_y' |a4= 'left_x' |a5= 'top_y' ) ) a8= '=' (a9= SIGNED_INTEGER ) a10= ';' ( ( (a11= 'rigth_x' |a12= 'bottom_y' ) a13= '=' (a14= SIGNED_INTEGER ) a15= ';' ) )? )
            // Sce.g:1863:2: ( (a0= 'x' |a1= 'y' |a2= 'center_x' |a3= 'center_y' |a4= 'left_x' |a5= 'top_y' ) ) a8= '=' (a9= SIGNED_INTEGER ) a10= ';' ( ( (a11= 'rigth_x' |a12= 'bottom_y' ) a13= '=' (a14= SIGNED_INTEGER ) a15= ';' ) )?
            {
            // Sce.g:1863:2: ( (a0= 'x' |a1= 'y' |a2= 'center_x' |a3= 'center_y' |a4= 'left_x' |a5= 'top_y' ) )
            // Sce.g:1864:3: (a0= 'x' |a1= 'y' |a2= 'center_x' |a3= 'center_y' |a4= 'left_x' |a5= 'top_y' )
            {
            // Sce.g:1864:3: (a0= 'x' |a1= 'y' |a2= 'center_x' |a3= 'center_y' |a4= 'left_x' |a5= 'top_y' )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            case 21:
                {
                alt10=4;
                }
                break;
            case 22:
                {
                alt10=5;
                }
                break;
            case 28:
                {
                alt10=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // Sce.g:1865:4: a0= 'x'
                    {
                    a0=(Token)match(input,30,FOLLOW_30_in_parse_org_emftext_language_Presentation_CoordinateDefinition1526); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getCoordinateType().getEEnumLiteral(org.emftext.language.Presentation.CoordinateType.X_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.COORDINATE_DEFINITION__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sce.g:1878:8: a1= 'y'
                    {
                    a1=(Token)match(input,31,FOLLOW_31_in_parse_org_emftext_language_Presentation_CoordinateDefinition1541); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getCoordinateType().getEEnumLiteral(org.emftext.language.Presentation.CoordinateType.Y_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.COORDINATE_DEFINITION__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Sce.g:1891:8: a2= 'center_x'
                    {
                    a2=(Token)match(input,20,FOLLOW_20_in_parse_org_emftext_language_Presentation_CoordinateDefinition1556); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getCoordinateType().getEEnumLiteral(org.emftext.language.Presentation.CoordinateType.CENTER_X_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.COORDINATE_DEFINITION__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 4 :
                    // Sce.g:1904:8: a3= 'center_y'
                    {
                    a3=(Token)match(input,21,FOLLOW_21_in_parse_org_emftext_language_Presentation_CoordinateDefinition1571); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getCoordinateType().getEEnumLiteral(org.emftext.language.Presentation.CoordinateType.CENTER_Y_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.COORDINATE_DEFINITION__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 5 :
                    // Sce.g:1917:8: a4= 'left_x'
                    {
                    a4=(Token)match(input,22,FOLLOW_22_in_parse_org_emftext_language_Presentation_CoordinateDefinition1586); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getCoordinateType().getEEnumLiteral(org.emftext.language.Presentation.CoordinateType.LEFT_X_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.COORDINATE_DEFINITION__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 6 :
                    // Sce.g:1930:8: a5= 'top_y'
                    {
                    a5=(Token)match(input,28,FOLLOW_28_in_parse_org_emftext_language_Presentation_CoordinateDefinition1601); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getCoordinateType().getEEnumLiteral(org.emftext.language.Presentation.CoordinateType.TOP_Y_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.COORDINATE_DEFINITION__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[145]);
            	}

            a8=(Token)match(input,13,FOLLOW_13_in_parse_org_emftext_language_Presentation_CoordinateDefinition1622); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[146]);
            	}

            // Sce.g:1964:2: (a9= SIGNED_INTEGER )
            // Sce.g:1965:3: a9= SIGNED_INTEGER
            {
            a9=(Token)match(input,SIGNED_INTEGER,FOLLOW_SIGNED_INTEGER_in_parse_org_emftext_language_Presentation_CoordinateDefinition1640); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
            				startIncompleteElement(element);
            			}
            			if (a9 != null) {
            				org.emftext.language.Presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SIGNED_INTEGER");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.Presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.COORDINATE_DEFINITION__COORDINATE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStopIndex());
            				}
            				java.lang.Float resolved = (java.lang.Float) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.COORDINATE_DEFINITION__COORDINATE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_4, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a9, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[147]);
            	}

            a10=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_CoordinateDefinition1661); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[148]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[149]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getTextStimulus(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[150]);
            	}

            // Sce.g:2016:2: ( ( (a11= 'rigth_x' |a12= 'bottom_y' ) a13= '=' (a14= SIGNED_INTEGER ) a15= ';' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17||LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Sce.g:2017:3: ( (a11= 'rigth_x' |a12= 'bottom_y' ) a13= '=' (a14= SIGNED_INTEGER ) a15= ';' )
                    {
                    // Sce.g:2017:3: ( (a11= 'rigth_x' |a12= 'bottom_y' ) a13= '=' (a14= SIGNED_INTEGER ) a15= ';' )
                    // Sce.g:2018:4: (a11= 'rigth_x' |a12= 'bottom_y' ) a13= '=' (a14= SIGNED_INTEGER ) a15= ';'
                    {
                    // Sce.g:2018:4: (a11= 'rigth_x' |a12= 'bottom_y' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==17) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;

                    }
                    switch (alt11) {
                        case 1 :
                            // Sce.g:2019:5: a11= 'rigth_x'
                            {
                            a11=(Token)match(input,24,FOLLOW_24_in_parse_org_emftext_language_Presentation_CoordinateDefinition1690); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_0_0_0_0, null, true);
                            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                            				}

                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[151]);
                            				}

                            }
                            break;
                        case 2 :
                            // Sce.g:2034:10: a12= 'bottom_y'
                            {
                            a12=(Token)match(input,17,FOLLOW_17_in_parse_org_emftext_language_Presentation_CoordinateDefinition1723); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_0_0_1_0, null, true);
                            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                            				}

                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[152]);
                            				}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[153]);
                    			}

                    a13=(Token)match(input,13,FOLLOW_13_in_parse_org_emftext_language_Presentation_CoordinateDefinition1759); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_2, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[154]);
                    			}

                    // Sce.g:2068:4: (a14= SIGNED_INTEGER )
                    // Sce.g:2069:5: a14= SIGNED_INTEGER
                    {
                    a14=(Token)match(input,SIGNED_INTEGER,FOLLOW_SIGNED_INTEGER_in_parse_org_emftext_language_Presentation_CoordinateDefinition1785); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
                    						startIncompleteElement(element);
                    					}
                    					if (a14 != null) {
                    						org.emftext.language.Presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SIGNED_INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.Presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.COORDINATE_DEFINITION__RIGHT_BOTTOM), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStopIndex());
                    						}
                    						java.lang.Float resolved = (java.lang.Float) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.COORDINATE_DEFINITION__RIGHT_BOTTOM), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_4, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a14, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[155]);
                    			}

                    a15=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_CoordinateDefinition1818); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCoordinateDefinition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_5, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getTextStimulus(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[156]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getTextStimulus(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[157]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_org_emftext_language_Presentation_CoordinateDefinition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_CoordinateDefinition"



    // $ANTLR start "parse_org_emftext_language_Presentation_Text"
    // Sce.g:2127:1: parse_org_emftext_language_Presentation_Text returns [org.emftext.language.Presentation.Text element = null] : a0= 'text' a1= '{' (a2_0= parse_org_emftext_language_Presentation_CaptionParameter ) ( ( (a3_0= parse_org_emftext_language_Presentation_TextParameter ) ) )* a4= '}' ( ( (a5= VAR_NAME ) ) )? a6= ';' ;
    public final org.emftext.language.Presentation.Text parse_org_emftext_language_Presentation_Text() throws RecognitionException {
        org.emftext.language.Presentation.Text element =  null;

        int parse_org_emftext_language_Presentation_Text_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        org.emftext.language.Presentation.CaptionParameter a2_0 =null;

        org.emftext.language.Presentation.TextParameter a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // Sce.g:2130:2: (a0= 'text' a1= '{' (a2_0= parse_org_emftext_language_Presentation_CaptionParameter ) ( ( (a3_0= parse_org_emftext_language_Presentation_TextParameter ) ) )* a4= '}' ( ( (a5= VAR_NAME ) ) )? a6= ';' )
            // Sce.g:2131:2: a0= 'text' a1= '{' (a2_0= parse_org_emftext_language_Presentation_CaptionParameter ) ( ( (a3_0= parse_org_emftext_language_Presentation_TextParameter ) ) )* a4= '}' ( ( (a5= VAR_NAME ) ) )? a6= ';'
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_org_emftext_language_Presentation_Text1866); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createText();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[158]);
            	}

            a1=(Token)match(input,32,FOLLOW_32_in_parse_org_emftext_language_Presentation_Text1880); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createText();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getText(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[159]);
            	}

            // Sce.g:2159:2: (a2_0= parse_org_emftext_language_Presentation_CaptionParameter )
            // Sce.g:2160:3: a2_0= parse_org_emftext_language_Presentation_CaptionParameter
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_CaptionParameter_in_parse_org_emftext_language_Presentation_Text1898);
            a2_0=parse_org_emftext_language_Presentation_CaptionParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createText();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.TEXT__CAPTION), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_4, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getText(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[160]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[161]);
            	}

            // Sce.g:2186:2: ( ( (a3_0= parse_org_emftext_language_Presentation_TextParameter ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Sce.g:2187:3: ( (a3_0= parse_org_emftext_language_Presentation_TextParameter ) )
            	    {
            	    // Sce.g:2187:3: ( (a3_0= parse_org_emftext_language_Presentation_TextParameter ) )
            	    // Sce.g:2188:4: (a3_0= parse_org_emftext_language_Presentation_TextParameter )
            	    {
            	    // Sce.g:2188:4: (a3_0= parse_org_emftext_language_Presentation_TextParameter )
            	    // Sce.g:2189:5: a3_0= parse_org_emftext_language_Presentation_TextParameter
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_TextParameter_in_parse_org_emftext_language_Presentation_Text1931);
            	    a3_0=parse_org_emftext_language_Presentation_TextParameter();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createText();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a3_0 != null) {
            	    						if (a3_0 != null) {
            	    							Object value = a3_0;
            	    							addObjectToList(element, org.emftext.language.Presentation.PresentationPackage.TEXT__TEXT_PARAMETER, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_6_0_0_0, a3_0, true);
            	    						copyLocalizationInfos(a3_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getText(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[162]);
            	    				addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[163]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getText(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[164]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[165]);
            	}

            a4=(Token)match(input,33,FOLLOW_33_in_parse_org_emftext_language_Presentation_Text1972); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createText();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[166]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[167]);
            	}

            // Sce.g:2238:2: ( ( (a5= VAR_NAME ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==VAR_NAME) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Sce.g:2239:3: ( (a5= VAR_NAME ) )
                    {
                    // Sce.g:2239:3: ( (a5= VAR_NAME ) )
                    // Sce.g:2240:4: (a5= VAR_NAME )
                    {
                    // Sce.g:2240:4: (a5= VAR_NAME )
                    // Sce.g:2241:5: a5= VAR_NAME
                    {
                    a5=(Token)match(input,VAR_NAME,FOLLOW_VAR_NAME_in_parse_org_emftext_language_Presentation_Text2001); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createText();
                    						startIncompleteElement(element);
                    					}
                    					if (a5 != null) {
                    						org.emftext.language.Presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VAR_NAME");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.Presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.TEXT__NAME), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
                    						}
                    						java.lang.String resolved = (java.lang.String) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.TEXT__NAME), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_9_0_0_1, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[168]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[169]);
            	}

            a6=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_Text2047); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createText();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[170]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[171]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getSDL(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[172]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[173]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[174]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getTextStimulus(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[175]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parse_org_emftext_language_Presentation_Text_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_Text"



    // $ANTLR start "parse_org_emftext_language_Presentation_CaptionParameter"
    // Sce.g:2304:1: parse_org_emftext_language_Presentation_CaptionParameter returns [org.emftext.language.Presentation.CaptionParameter element = null] : a0= 'caption' a1= '=' (a2_0= parse_org_emftext_language_Presentation_TextLiteral ) a3= ';' ;
    public final org.emftext.language.Presentation.CaptionParameter parse_org_emftext_language_Presentation_CaptionParameter() throws RecognitionException {
        org.emftext.language.Presentation.CaptionParameter element =  null;

        int parse_org_emftext_language_Presentation_CaptionParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.emftext.language.Presentation.TextLiteral a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }

            // Sce.g:2307:2: (a0= 'caption' a1= '=' (a2_0= parse_org_emftext_language_Presentation_TextLiteral ) a3= ';' )
            // Sce.g:2308:2: a0= 'caption' a1= '=' (a2_0= parse_org_emftext_language_Presentation_TextLiteral ) a3= ';'
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_org_emftext_language_Presentation_CaptionParameter2076); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCaptionParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_19_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[176]);
            	}

            a1=(Token)match(input,13,FOLLOW_13_in_parse_org_emftext_language_Presentation_CaptionParameter2090); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCaptionParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_19_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getCaptionParameter(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[177]);
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getCaptionParameter(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[178]);
            	}

            // Sce.g:2337:2: (a2_0= parse_org_emftext_language_Presentation_TextLiteral )
            // Sce.g:2338:3: a2_0= parse_org_emftext_language_Presentation_TextLiteral
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_TextLiteral_in_parse_org_emftext_language_Presentation_CaptionParameter2108);
            a2_0=parse_org_emftext_language_Presentation_TextLiteral();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.Presentation.resource.sce.mopp.SceTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCaptionParameter();
            				startIncompleteElement(element);
            			}
            			if (a2_0 != null) {
            				if (a2_0 != null) {
            					Object value = a2_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.Presentation.PresentationPackage.CAPTION_PARAMETER__TEXT_LITERAL), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_19_0_0_4, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[179]);
            	}

            a3=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_Presentation_CaptionParameter2126); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.Presentation.PresentationFactory.eINSTANCE.createCaptionParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.Presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_19_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.Presentation.PresentationPackage.eINSTANCE.getText(), org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[180]);
            		addExpectedElement(null, org.emftext.language.Presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[181]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, parse_org_emftext_language_Presentation_CaptionParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_CaptionParameter"



    // $ANTLR start "parse_org_emftext_language_Presentation_HeaderParameter"
    // Sce.g:2380:1: parse_org_emftext_language_Presentation_HeaderParameter returns [org.emftext.language.Presentation.HeaderParameter element = null] : (c0= parse_org_emftext_language_Presentation_ScenarioNameParameter |c1= parse_org_emftext_language_Presentation_ActiveButtonsParameter |c2= parse_org_emftext_language_Presentation_ButtonCodesParameter );
    public final org.emftext.language.Presentation.HeaderParameter parse_org_emftext_language_Presentation_HeaderParameter() throws RecognitionException {
        org.emftext.language.Presentation.HeaderParameter element =  null;

        int parse_org_emftext_language_Presentation_HeaderParameter_StartIndex = input.index();

        org.emftext.language.Presentation.ScenarioNameParameter c0 =null;

        org.emftext.language.Presentation.ActiveButtonsParameter c1 =null;

        org.emftext.language.Presentation.ButtonCodesParameter c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }

            // Sce.g:2381:2: (c0= parse_org_emftext_language_Presentation_ScenarioNameParameter |c1= parse_org_emftext_language_Presentation_ActiveButtonsParameter |c2= parse_org_emftext_language_Presentation_ButtonCodesParameter )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 14:
                {
                alt15=2;
                }
                break;
            case 18:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // Sce.g:2382:2: c0= parse_org_emftext_language_Presentation_ScenarioNameParameter
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_ScenarioNameParameter_in_parse_org_emftext_language_Presentation_HeaderParameter2151);
                    c0=parse_org_emftext_language_Presentation_ScenarioNameParameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sce.g:2383:4: c1= parse_org_emftext_language_Presentation_ActiveButtonsParameter
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_ActiveButtonsParameter_in_parse_org_emftext_language_Presentation_HeaderParameter2161);
                    c1=parse_org_emftext_language_Presentation_ActiveButtonsParameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sce.g:2384:4: c2= parse_org_emftext_language_Presentation_ButtonCodesParameter
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_ButtonCodesParameter_in_parse_org_emftext_language_Presentation_HeaderParameter2171);
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
            if ( state.backtracking>0 ) { memoize(input, 22, parse_org_emftext_language_Presentation_HeaderParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_HeaderParameter"



    // $ANTLR start "parse_org_emftext_language_Presentation_ScenarioObject"
    // Sce.g:2388:1: parse_org_emftext_language_Presentation_ScenarioObject returns [org.emftext.language.Presentation.ScenarioObject element = null] : (c0= parse_org_emftext_language_Presentation_Trial |c1= parse_org_emftext_language_Presentation_PictureStimulusEvent |c2= parse_org_emftext_language_Presentation_Picture |c3= parse_org_emftext_language_Presentation_TextStimulus |c4= parse_org_emftext_language_Presentation_Text );
    public final org.emftext.language.Presentation.ScenarioObject parse_org_emftext_language_Presentation_ScenarioObject() throws RecognitionException {
        org.emftext.language.Presentation.ScenarioObject element =  null;

        int parse_org_emftext_language_Presentation_ScenarioObject_StartIndex = input.index();

        org.emftext.language.Presentation.Trial c0 =null;

        org.emftext.language.Presentation.PictureStimulusEvent c1 =null;

        org.emftext.language.Presentation.Picture c2 =null;

        org.emftext.language.Presentation.TextStimulus c3 =null;

        org.emftext.language.Presentation.Text c4 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }

            // Sce.g:2389:2: (c0= parse_org_emftext_language_Presentation_Trial |c1= parse_org_emftext_language_Presentation_PictureStimulusEvent |c2= parse_org_emftext_language_Presentation_Picture |c3= parse_org_emftext_language_Presentation_TextStimulus |c4= parse_org_emftext_language_Presentation_Text )
            int alt16=5;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // Sce.g:2390:2: c0= parse_org_emftext_language_Presentation_Trial
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_Trial_in_parse_org_emftext_language_Presentation_ScenarioObject2192);
                    c0=parse_org_emftext_language_Presentation_Trial();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sce.g:2391:4: c1= parse_org_emftext_language_Presentation_PictureStimulusEvent
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_PictureStimulusEvent_in_parse_org_emftext_language_Presentation_ScenarioObject2202);
                    c1=parse_org_emftext_language_Presentation_PictureStimulusEvent();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sce.g:2392:4: c2= parse_org_emftext_language_Presentation_Picture
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_Picture_in_parse_org_emftext_language_Presentation_ScenarioObject2212);
                    c2=parse_org_emftext_language_Presentation_Picture();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Sce.g:2393:4: c3= parse_org_emftext_language_Presentation_TextStimulus
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_TextStimulus_in_parse_org_emftext_language_Presentation_ScenarioObject2222);
                    c3=parse_org_emftext_language_Presentation_TextStimulus();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // Sce.g:2394:4: c4= parse_org_emftext_language_Presentation_Text
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_Presentation_Text_in_parse_org_emftext_language_Presentation_ScenarioObject2232);
                    c4=parse_org_emftext_language_Presentation_Text();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 23, parse_org_emftext_language_Presentation_ScenarioObject_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_ScenarioObject"



    // $ANTLR start "parse_org_emftext_language_Presentation_StimulusEvent"
    // Sce.g:2398:1: parse_org_emftext_language_Presentation_StimulusEvent returns [org.emftext.language.Presentation.StimulusEvent element = null] : c0= parse_org_emftext_language_Presentation_PictureStimulusEvent ;
    public final org.emftext.language.Presentation.StimulusEvent parse_org_emftext_language_Presentation_StimulusEvent() throws RecognitionException {
        org.emftext.language.Presentation.StimulusEvent element =  null;

        int parse_org_emftext_language_Presentation_StimulusEvent_StartIndex = input.index();

        org.emftext.language.Presentation.PictureStimulusEvent c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }

            // Sce.g:2399:2: (c0= parse_org_emftext_language_Presentation_PictureStimulusEvent )
            // Sce.g:2400:2: c0= parse_org_emftext_language_Presentation_PictureStimulusEvent
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_PictureStimulusEvent_in_parse_org_emftext_language_Presentation_StimulusEvent2253);
            c0=parse_org_emftext_language_Presentation_PictureStimulusEvent();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, parse_org_emftext_language_Presentation_StimulusEvent_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_StimulusEvent"



    // $ANTLR start "parse_org_emftext_language_Presentation_StimulusEventParameter"
    // Sce.g:2404:1: parse_org_emftext_language_Presentation_StimulusEventParameter returns [org.emftext.language.Presentation.StimulusEventParameter element = null] : c0= parse_org_emftext_language_Presentation_TimeParameter ;
    public final org.emftext.language.Presentation.StimulusEventParameter parse_org_emftext_language_Presentation_StimulusEventParameter() throws RecognitionException {
        org.emftext.language.Presentation.StimulusEventParameter element =  null;

        int parse_org_emftext_language_Presentation_StimulusEventParameter_StartIndex = input.index();

        org.emftext.language.Presentation.TimeParameter c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }

            // Sce.g:2405:2: (c0= parse_org_emftext_language_Presentation_TimeParameter )
            // Sce.g:2406:2: c0= parse_org_emftext_language_Presentation_TimeParameter
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_TimeParameter_in_parse_org_emftext_language_Presentation_StimulusEventParameter2274);
            c0=parse_org_emftext_language_Presentation_TimeParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, parse_org_emftext_language_Presentation_StimulusEventParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_StimulusEventParameter"



    // $ANTLR start "parse_org_emftext_language_Presentation_PicturePart"
    // Sce.g:2410:1: parse_org_emftext_language_Presentation_PicturePart returns [org.emftext.language.Presentation.PicturePart element = null] : c0= parse_org_emftext_language_Presentation_TextStimulus ;
    public final org.emftext.language.Presentation.PicturePart parse_org_emftext_language_Presentation_PicturePart() throws RecognitionException {
        org.emftext.language.Presentation.PicturePart element =  null;

        int parse_org_emftext_language_Presentation_PicturePart_StartIndex = input.index();

        org.emftext.language.Presentation.TextStimulus c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }

            // Sce.g:2411:2: (c0= parse_org_emftext_language_Presentation_TextStimulus )
            // Sce.g:2412:2: c0= parse_org_emftext_language_Presentation_TextStimulus
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_TextStimulus_in_parse_org_emftext_language_Presentation_PicturePart2295);
            c0=parse_org_emftext_language_Presentation_TextStimulus();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, parse_org_emftext_language_Presentation_PicturePart_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_PicturePart"



    // $ANTLR start "parse_org_emftext_language_Presentation_TextParameter"
    // Sce.g:2416:1: parse_org_emftext_language_Presentation_TextParameter returns [org.emftext.language.Presentation.TextParameter element = null] : c0= parse_org_emftext_language_Presentation_CaptionParameter ;
    public final org.emftext.language.Presentation.TextParameter parse_org_emftext_language_Presentation_TextParameter() throws RecognitionException {
        org.emftext.language.Presentation.TextParameter element =  null;

        int parse_org_emftext_language_Presentation_TextParameter_StartIndex = input.index();

        org.emftext.language.Presentation.CaptionParameter c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }

            // Sce.g:2417:2: (c0= parse_org_emftext_language_Presentation_CaptionParameter )
            // Sce.g:2418:2: c0= parse_org_emftext_language_Presentation_CaptionParameter
            {
            pushFollow(FOLLOW_parse_org_emftext_language_Presentation_CaptionParameter_in_parse_org_emftext_language_Presentation_TextParameter2316);
            c0=parse_org_emftext_language_Presentation_CaptionParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, parse_org_emftext_language_Presentation_TextParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_Presentation_TextParameter"

    // $ANTLR start synpred22_Sce
    public final void synpred22_Sce_fragment() throws RecognitionException {
        org.emftext.language.Presentation.PictureStimulusEvent c1 =null;


        // Sce.g:2391:4: (c1= parse_org_emftext_language_Presentation_PictureStimulusEvent )
        // Sce.g:2391:4: c1= parse_org_emftext_language_Presentation_PictureStimulusEvent
        {
        pushFollow(FOLLOW_parse_org_emftext_language_Presentation_PictureStimulusEvent_in_synpred22_Sce2202);
        c1=parse_org_emftext_language_Presentation_PictureStimulusEvent();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_Sce

    // $ANTLR start synpred23_Sce
    public final void synpred23_Sce_fragment() throws RecognitionException {
        org.emftext.language.Presentation.Picture c2 =null;


        // Sce.g:2392:4: (c2= parse_org_emftext_language_Presentation_Picture )
        // Sce.g:2392:4: c2= parse_org_emftext_language_Presentation_Picture
        {
        pushFollow(FOLLOW_parse_org_emftext_language_Presentation_Picture_in_synpred23_Sce2212);
        c2=parse_org_emftext_language_Presentation_Picture();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred23_Sce

    // Delegated rules

    public final boolean synpred23_Sce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Sce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_Sce() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_Sce_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\105\uffff";
    static final String DFA16_eofS =
        "\33\uffff\1\41\51\uffff";
    static final String DFA16_minS =
        "\1\27\1\uffff\2\40\1\32\1\23\1\40\1\11\1\15\1\23\1\14\1\6\1\15\1"+
        "\0\2\14\1\6\2\uffff\1\23\2\14\1\15\1\11\1\23\1\6\1\14\1\17\1\15"+
        "\1\11\2\14\2\uffff\1\6\1\14\1\24\1\23\2\14\6\15\1\23\1\10\1\14\1"+
        "\21\10\15\2\10\2\14\1\24\1\21\2\15\1\10\1\14\1\32";
    static final String DFA16_maxS =
        "\1\35\1\uffff\2\40\1\41\1\23\1\40\1\11\1\15\1\23\1\14\1\7\1\15\1"+
        "\0\2\14\1\7\2\uffff\1\41\2\14\1\15\1\14\1\41\1\7\1\14\1\37\1\15"+
        "\3\14\2\uffff\1\7\1\14\1\37\1\41\2\14\6\15\1\41\1\10\1\14\1\37\10"+
        "\15\2\10\2\14\1\37\1\41\2\15\1\10\1\14\1\41";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\17\uffff\1\2\1\3\15\uffff\1\4\1\5\43\uffff";
    static final String DFA16_specialS =
        "\15\uffff\1\0\67\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\2\uffff\1\3\2\uffff\1\1",
            "",
            "\1\4",
            "\1\5",
            "\1\6\6\uffff\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\17\1\16",
            "\1\20",
            "\1\uffff",
            "\1\23",
            "\1\23",
            "\1\25\1\24",
            "",
            "",
            "\1\26\15\uffff\1\27",
            "\1\30",
            "\1\30",
            "\1\31",
            "\1\32\2\uffff\1\33",
            "\1\34\15\uffff\1\35",
            "\1\37\1\36",
            "\1\33",
            "\2\41\3\uffff\3\40\1\41\2\uffff\1\41\1\uffff\1\40\1\41\2\40",
            "\1\42",
            "\1\43\2\uffff\1\44",
            "\1\45",
            "\1\45",
            "",
            "",
            "\1\47\1\46",
            "\1\44",
            "\1\52\1\53\1\54\5\uffff\1\55\1\uffff\1\50\1\51",
            "\1\26\15\uffff\1\27",
            "\1\56",
            "\1\56",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\57",
            "\1\34\15\uffff\1\35",
            "\1\60",
            "\1\61",
            "\1\63\2\uffff\1\66\1\67\1\70\1\uffff\1\62\3\uffff\1\71\1\uffff"+
            "\1\64\1\65",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\73",
            "\1\73",
            "\1\73",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\66\1\67\1\70\5\uffff\1\71\1\uffff\1\64\1\65",
            "\1\101\6\uffff\1\100\1\uffff\1\6\6\uffff\1\7",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\6\6\uffff\1\7"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "2388:1: parse_org_emftext_language_Presentation_ScenarioObject returns [org.emftext.language.Presentation.ScenarioObject element = null] : (c0= parse_org_emftext_language_Presentation_Trial |c1= parse_org_emftext_language_Presentation_PictureStimulusEvent |c2= parse_org_emftext_language_Presentation_Picture |c3= parse_org_emftext_language_Presentation_TextStimulus |c4= parse_org_emftext_language_Presentation_Text );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_13 = input.LA(1);

                         
                        int index16_13 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred22_Sce()) ) {s = 17;}

                        else if ( (synpred23_Sce()) ) {s = 18;}

                         
                        input.seek(index16_13);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_Scenario_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_Header_in_parse_org_emftext_language_Presentation_Scenario119 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_SDL_in_parse_org_emftext_language_Presentation_Scenario146 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_PCL_in_parse_org_emftext_language_Presentation_Scenario181 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_HeaderParameter_in_parse_org_emftext_language_Presentation_Header237 = new BitSet(new long[]{0x0000000002044002L});
    public static final BitSet FOLLOW_15_in_parse_org_emftext_language_Presentation_SDL293 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_SDL307 = new BitSet(new long[]{0x0000000024800002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_ScenarioObject_in_parse_org_emftext_language_Presentation_SDL336 = new BitSet(new long[]{0x0000000024800002L});
    public static final BitSet FOLLOW_16_in_parse_org_emftext_language_Presentation_PCL392 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_PCL406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_org_emftext_language_Presentation_ScenarioNameParameter435 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_emftext_language_Presentation_ScenarioNameParameter449 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_NameLiteral_in_parse_org_emftext_language_Presentation_ScenarioNameParameter467 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_ScenarioNameParameter485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter514 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter528 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter546 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_ActiveButtonsParameter564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_org_emftext_language_Presentation_ButtonCodesParameter593 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_emftext_language_Presentation_ButtonCodesParameter607 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_ButtonCodesParameter625 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_parse_org_emftext_language_Presentation_ButtonCodesParameter652 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_ButtonCodesParameter678 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_ButtonCodesParameter719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_INTEGER_in_parse_org_emftext_language_Presentation_NumberLiteral752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_parse_org_emftext_language_Presentation_NameLiteral792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_parse_org_emftext_language_Presentation_BooleanLiteral832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_TEXT_in_parse_org_emftext_language_Presentation_TextLiteral872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_NameLiteral_in_parse_org_emftext_language_Presentation_TextLiteral898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_org_emftext_language_Presentation_Trial923 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_org_emftext_language_Presentation_Trial937 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_StimulusList_in_parse_org_emftext_language_Presentation_Trial955 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_org_emftext_language_Presentation_Trial973 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VAR_NAME_in_parse_org_emftext_language_Presentation_Trial991 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_Trial1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_StimulusEvent_in_parse_org_emftext_language_Presentation_StimulusList1056 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_Picture_in_parse_org_emftext_language_Presentation_PictureStimulusEvent1116 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_StimulusEventParameter_in_parse_org_emftext_language_Presentation_PictureStimulusEvent1149 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_23_in_parse_org_emftext_language_Presentation_Picture1205 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_org_emftext_language_Presentation_Picture1219 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_PicturePart_in_parse_org_emftext_language_Presentation_Picture1248 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_33_in_parse_org_emftext_language_Presentation_Picture1289 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VAR_NAME_in_parse_org_emftext_language_Presentation_Picture1307 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_Picture1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_org_emftext_language_Presentation_TimeParameter1357 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_emftext_language_Presentation_TimeParameter1371 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_NumberLiteral_in_parse_org_emftext_language_Presentation_TimeParameter1389 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_TimeParameter1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_Text_in_parse_org_emftext_language_Presentation_TextStimulus1440 = new BitSet(new long[]{0x00000000D0700000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_CoordinateDefinition_in_parse_org_emftext_language_Presentation_TextStimulus1462 = new BitSet(new long[]{0x00000000D0700000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_CoordinateDefinition_in_parse_org_emftext_language_Presentation_TextStimulus1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_org_emftext_language_Presentation_CoordinateDefinition1526 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31_in_parse_org_emftext_language_Presentation_CoordinateDefinition1541 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20_in_parse_org_emftext_language_Presentation_CoordinateDefinition1556 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21_in_parse_org_emftext_language_Presentation_CoordinateDefinition1571 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_22_in_parse_org_emftext_language_Presentation_CoordinateDefinition1586 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_28_in_parse_org_emftext_language_Presentation_CoordinateDefinition1601 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_emftext_language_Presentation_CoordinateDefinition1622 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SIGNED_INTEGER_in_parse_org_emftext_language_Presentation_CoordinateDefinition1640 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_CoordinateDefinition1661 = new BitSet(new long[]{0x0000000001020002L});
    public static final BitSet FOLLOW_24_in_parse_org_emftext_language_Presentation_CoordinateDefinition1690 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17_in_parse_org_emftext_language_Presentation_CoordinateDefinition1723 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_emftext_language_Presentation_CoordinateDefinition1759 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SIGNED_INTEGER_in_parse_org_emftext_language_Presentation_CoordinateDefinition1785 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_CoordinateDefinition1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_org_emftext_language_Presentation_Text1866 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_org_emftext_language_Presentation_Text1880 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_CaptionParameter_in_parse_org_emftext_language_Presentation_Text1898 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_TextParameter_in_parse_org_emftext_language_Presentation_Text1931 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_33_in_parse_org_emftext_language_Presentation_Text1972 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_VAR_NAME_in_parse_org_emftext_language_Presentation_Text2001 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_Text2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_org_emftext_language_Presentation_CaptionParameter2076 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_emftext_language_Presentation_CaptionParameter2090 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_TextLiteral_in_parse_org_emftext_language_Presentation_CaptionParameter2108 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_Presentation_CaptionParameter2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_ScenarioNameParameter_in_parse_org_emftext_language_Presentation_HeaderParameter2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_ActiveButtonsParameter_in_parse_org_emftext_language_Presentation_HeaderParameter2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_ButtonCodesParameter_in_parse_org_emftext_language_Presentation_HeaderParameter2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_Trial_in_parse_org_emftext_language_Presentation_ScenarioObject2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_PictureStimulusEvent_in_parse_org_emftext_language_Presentation_ScenarioObject2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_Picture_in_parse_org_emftext_language_Presentation_ScenarioObject2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_TextStimulus_in_parse_org_emftext_language_Presentation_ScenarioObject2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_Text_in_parse_org_emftext_language_Presentation_ScenarioObject2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_PictureStimulusEvent_in_parse_org_emftext_language_Presentation_StimulusEvent2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_TimeParameter_in_parse_org_emftext_language_Presentation_StimulusEventParameter2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_TextStimulus_in_parse_org_emftext_language_Presentation_PicturePart2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_CaptionParameter_in_parse_org_emftext_language_Presentation_TextParameter2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_PictureStimulusEvent_in_synpred22_Sce2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_Presentation_Picture_in_synpred23_Sce2212 = new BitSet(new long[]{0x0000000000000002L});

}