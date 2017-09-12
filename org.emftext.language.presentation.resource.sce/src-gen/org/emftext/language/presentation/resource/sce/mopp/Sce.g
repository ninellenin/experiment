grammar Sce;

options {
	superClass = SceANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.emftext.language.presentation.resource.sce.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
	}
}
@header{
	package org.emftext.language.presentation.resource.sce.mopp;
}

@members{
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
			if (type.getInstanceClass() == org.emftext.language.presentation.scenario.Scenario.class) {
				return parse_org_emftext_language_presentation_scenario_Scenario();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.scenario.Header.class) {
				return parse_org_emftext_language_presentation_scenario_Header();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.scenario.SDL.class) {
				return parse_org_emftext_language_presentation_scenario_SDL();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.scenario.PCL.class) {
				return parse_org_emftext_language_presentation_scenario_PCL();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.parameter.ScenarioNameParameter.class) {
				return parse_org_emftext_language_presentation_parameter_ScenarioNameParameter();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.parameter.ActiveButtonsParameter.class) {
				return parse_org_emftext_language_presentation_parameter_ActiveButtonsParameter();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.parameter.ButtonCodesParameter.class) {
				return parse_org_emftext_language_presentation_parameter_ButtonCodesParameter();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.literal.NumberLiteral.class) {
				return parse_org_emftext_language_presentation_literal_NumberLiteral();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.literal.NameLiteral.class) {
				return parse_org_emftext_language_presentation_literal_NameLiteral();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.literal.BooleanLiteral.class) {
				return parse_org_emftext_language_presentation_literal_BooleanLiteral();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.literal.TextLiteral.class) {
				return parse_org_emftext_language_presentation_literal_TextLiteral();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.stimulus.Trial.class) {
				return parse_org_emftext_language_presentation_stimulus_Trial();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.stimulus.StimulusList.class) {
				return parse_org_emftext_language_presentation_stimulus_StimulusList();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.stimulus.picture.PictureStimulusEvent.class) {
				return parse_org_emftext_language_presentation_stimulus_picture_PictureStimulusEvent();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.stimulus.picture.Picture.class) {
				return parse_org_emftext_language_presentation_stimulus_picture_Picture();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.parameter.TimeParameter.class) {
				return parse_org_emftext_language_presentation_parameter_TimeParameter();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.stimulus.picture.TextStimulus.class) {
				return parse_org_emftext_language_presentation_stimulus_picture_TextStimulus();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.general.CoordinateDefinition.class) {
				return parse_org_emftext_language_presentation_general_CoordinateDefinition();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.stimulus.picture.Text.class) {
				return parse_org_emftext_language_presentation_stimulus_picture_Text();
			}
			if (type.getInstanceClass() == org.emftext.language.presentation.parameter.CaptionParameter.class) {
				return parse_org_emftext_language_presentation_parameter_CaptionParameter();
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[0]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[1]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[2]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[3]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[4]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_emftext_language_presentation_scenario_Scenario{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_emftext_language_presentation_scenario_Scenario returns [org.emftext.language.presentation.scenario.Scenario element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_presentation_scenario_Header		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.scenario.scenarioFactory.eINSTANCE.createScenario();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.scenario.scenarioPackage.SCENARIO__HEADER), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_0_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[5]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[6]);
	}
	
	(
		(
			a1_0 = parse_org_emftext_language_presentation_scenario_SDL			{
				if (terminateParsing) {
					throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.presentation.scenario.scenarioFactory.eINSTANCE.createScenario();
					startIncompleteElement(element);
				}
				if (a1_0 != null) {
					if (a1_0 != null) {
						Object value = a1_0;
						addObjectToList(element, org.emftext.language.presentation.scenario.scenarioPackage.SCENARIO__SDL, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_0_0_0_1, a1_0, true);
					copyLocalizationInfos(a1_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[7]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[8]);
	}
	
	(
		(
			a2_0 = parse_org_emftext_language_presentation_scenario_PCL			{
				if (terminateParsing) {
					throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
				}
				if (element == null) {
					element = org.emftext.language.presentation.scenario.scenarioFactory.eINSTANCE.createScenario();
					startIncompleteElement(element);
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						Object value = a2_0;
						addObjectToList(element, org.emftext.language.presentation.scenario.scenarioPackage.SCENARIO__PCL, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_0_0_0_2, a2_0, true);
					copyLocalizationInfos(a2_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[9]);
	}
	
;

parse_org_emftext_language_presentation_scenario_Header returns [org.emftext.language.presentation.scenario.Header element = null]
@init{
}
:
	(
		(
			(
				a0_0 = parse_org_emftext_language_presentation_parameter_HeaderParameter				{
					if (terminateParsing) {
						throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.presentation.scenario.scenarioFactory.eINSTANCE.createHeader();
						startIncompleteElement(element);
					}
					if (a0_0 != null) {
						if (a0_0 != null) {
							Object value = a0_0;
							addObjectToList(element, org.emftext.language.presentation.scenario.scenarioPackage.HEADER__PARAMETER, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_1_0_0_0_0_0_0, a0_0, true);
						copyLocalizationInfos(a0_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[10]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[11]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[12]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[13]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[14]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[15]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[16]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[17]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[18]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[19]);
	}
	
;

parse_org_emftext_language_presentation_scenario_SDL returns [org.emftext.language.presentation.scenario.SDL element = null]
@init{
}
:
	a0 = 'begin' {
		if (element == null) {
			element = org.emftext.language.presentation.scenario.scenarioFactory.eINSTANCE.createSDL();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[20]);
	}
	
	a1 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.scenario.scenarioFactory.eINSTANCE.createSDL();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[21]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[22]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[23]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[24]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[25]);
	}
	
	(
		(
			(
				a2_0 = parse_org_emftext_language_presentation_stimulus_ScenarioObject				{
					if (terminateParsing) {
						throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.presentation.scenario.scenarioFactory.eINSTANCE.createSDL();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, org.emftext.language.presentation.scenario.scenarioPackage.SDL__SCENARIO_OBJECT, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_3_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[26]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[27]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[28]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[29]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[30]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[31]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[32]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[33]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[34]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[35]);
	}
	
;

parse_org_emftext_language_presentation_scenario_PCL returns [org.emftext.language.presentation.scenario.PCL element = null]
@init{
}
:
	a0 = 'begin_pcl' {
		if (element == null) {
			element = org.emftext.language.presentation.scenario.scenarioFactory.eINSTANCE.createPCL();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[36]);
	}
	
	a1 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.scenario.scenarioFactory.eINSTANCE.createPCL();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_3_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[37]);
	}
	
;

parse_org_emftext_language_presentation_parameter_ScenarioNameParameter returns [org.emftext.language.presentation.parameter.ScenarioNameParameter element = null]
@init{
}
:
	a0 = 'scenario' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createScenarioNameParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[38]);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createScenarioNameParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getScenarioNameParameter(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[39]);
	}
	
	(
		a2_0 = parse_org_emftext_language_presentation_literal_NameLiteral		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createScenarioNameParameter();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.parameter.parameterPackage.SCENARIO_NAME_PARAMETER__NAME_LITERAL), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_4, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[40]);
	}
	
	a3 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createScenarioNameParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[41]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[42]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[43]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[44]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[45]);
	}
	
;

parse_org_emftext_language_presentation_parameter_ActiveButtonsParameter returns [org.emftext.language.presentation.parameter.ActiveButtonsParameter element = null]
@init{
}
:
	a0 = 'active_buttons' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createActiveButtonsParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[46]);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createActiveButtonsParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getActiveButtonsParameter(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[47]);
	}
	
	(
		a2_0 = parse_org_emftext_language_presentation_literal_NumberLiteral		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createActiveButtonsParameter();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.parameter.parameterPackage.ACTIVE_BUTTONS_PARAMETER__NUMBER_LITERAL), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_4, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[48]);
	}
	
	a3 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createActiveButtonsParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_5_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[49]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[50]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[51]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[52]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[53]);
	}
	
;

parse_org_emftext_language_presentation_parameter_ButtonCodesParameter returns [org.emftext.language.presentation.parameter.ButtonCodesParameter element = null]
@init{
}
:
	a0 = 'button_codes' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createButtonCodesParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[54]);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createButtonCodesParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[55]);
	}
	
	(
		a2_0 = parse_org_emftext_language_presentation_literal_NumberLiteral		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createButtonCodesParameter();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					addObjectToList(element, org.emftext.language.presentation.parameter.parameterPackage.BUTTON_CODES_PARAMETER__NUMBER_LITERAL, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_4, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[56]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[57]);
	}
	
	(
		(
			a3 = ',' {
				if (element == null) {
					element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createButtonCodesParameter();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getButtonCodesParameter(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[58]);
			}
			
			(
				a4_0 = parse_org_emftext_language_presentation_literal_NumberLiteral				{
					if (terminateParsing) {
						throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createButtonCodesParameter();
						startIncompleteElement(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							addObjectToList(element, org.emftext.language.presentation.parameter.parameterPackage.BUTTON_CODES_PARAMETER__NUMBER_LITERAL, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_5_0_0_2, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[59]);
				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[60]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[61]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[62]);
	}
	
	a5 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createButtonCodesParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_6_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[63]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[64]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[65]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[66]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[67]);
	}
	
;

parse_org_emftext_language_presentation_literal_NumberLiteral returns [org.emftext.language.presentation.literal.NumberLiteral element = null]
@init{
}
:
	(
		a0 = SIGNED_INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.literal.literalFactory.eINSTANCE.createNumberLiteral();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SIGNED_INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.presentation.literal.literalPackage.NUMBER_LITERAL__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.literal.literalPackage.NUMBER_LITERAL__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_7_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[68]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[69]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[70]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[71]);
	}
	
;

parse_org_emftext_language_presentation_literal_NameLiteral returns [org.emftext.language.presentation.literal.NameLiteral element = null]
@init{
}
:
	(
		a0 = QUOTED_NAME		
		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.literal.literalFactory.eINSTANCE.createNameLiteral();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_NAME");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.presentation.literal.literalPackage.NAME_LITERAL__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.literal.literalPackage.NAME_LITERAL__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_8_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[72]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[73]);
	}
	
;

parse_org_emftext_language_presentation_literal_BooleanLiteral returns [org.emftext.language.presentation.literal.BooleanLiteral element = null]
@init{
}
:
	(
		a0 = BOOLEAN		
		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.literal.literalFactory.eINSTANCE.createBooleanLiteral();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BOOLEAN");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.presentation.literal.literalPackage.BOOLEAN_LITERAL__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Boolean resolved = (java.lang.Boolean) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.literal.literalPackage.BOOLEAN_LITERAL__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_9_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
	}
	
;

parse_org_emftext_language_presentation_literal_TextLiteral returns [org.emftext.language.presentation.literal.TextLiteral element = null]
@init{
}
:
	(
		a0 = QUOTED_TEXT		
		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.literal.literalFactory.eINSTANCE.createTextLiteral();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_TEXT");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.presentation.literal.literalPackage.TEXT_LITERAL__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.literal.literalPackage.TEXT_LITERAL__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_10_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[74]);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_emftext_language_presentation_literal_NameLiteral{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_presentation_stimulus_Trial returns [org.emftext.language.presentation.stimulus.Trial element = null]
@init{
}
:
	a0 = 'trial' {
		if (element == null) {
			element = org.emftext.language.presentation.stimulus.stimulusFactory.eINSTANCE.createTrial();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[75]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = org.emftext.language.presentation.stimulus.stimulusFactory.eINSTANCE.createTrial();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getTrial(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[76]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[77]);
	}
	
	(
		a2_0 = parse_org_emftext_language_presentation_stimulus_StimulusList		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.stimulus.stimulusFactory.eINSTANCE.createTrial();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.stimulus.stimulusPackage.TRIAL__STIMULUS_LIST), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_4, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[78]);
	}
	
	a3 = '}' {
		if (element == null) {
			element = org.emftext.language.presentation.stimulus.stimulusFactory.eINSTANCE.createTrial();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[79]);
	}
	
	(
		a4 = VAR_NAME		
		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.stimulus.stimulusFactory.eINSTANCE.createTrial();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VAR_NAME");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.emftext.language.presentation.stimulus.stimulusPackage.TRIAL__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.stimulus.stimulusPackage.TRIAL__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_8, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[80]);
	}
	
	a5 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.stimulus.stimulusFactory.eINSTANCE.createTrial();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_11_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[81]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[82]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[83]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[84]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[85]);
	}
	
;

parse_org_emftext_language_presentation_stimulus_StimulusList returns [org.emftext.language.presentation.stimulus.StimulusList element = null]
@init{
}
:
	(
		(
			(
				a0_0 = parse_org_emftext_language_presentation_stimulus_StimulusEvent				{
					if (terminateParsing) {
						throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.presentation.stimulus.stimulusFactory.eINSTANCE.createStimulusList();
						startIncompleteElement(element);
					}
					if (a0_0 != null) {
						if (a0_0 != null) {
							Object value = a0_0;
							addObjectToList(element, org.emftext.language.presentation.stimulus.stimulusPackage.STIMULUS_LIST__STIMULUS_EVENT, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_12_0_0_0_0_0_0, a0_0, true);
						copyLocalizationInfos(a0_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getStimulusList(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[86]);
				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[87]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.stimulusPackage.eINSTANCE.getStimulusList(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[88]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[89]);
	}
	
;

parse_org_emftext_language_presentation_stimulus_picture_PictureStimulusEvent returns [org.emftext.language.presentation.stimulus.picture.PictureStimulusEvent element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_presentation_stimulus_picture_Picture		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createPictureStimulusEvent();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.PICTURE_STIMULUS_EVENT__PICTURE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_13_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[90]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[91]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[92]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[93]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[94]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[95]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[96]);
	}
	
	(
		(
			(
				a1_0 = parse_org_emftext_language_presentation_parameter_StimulusEventParameter				{
					if (terminateParsing) {
						throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createPictureStimulusEvent();
						startIncompleteElement(element);
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							Object value = a1_0;
							addObjectToList(element, org.emftext.language.presentation.stimulus.picture.picturePackage.PICTURE_STIMULUS_EVENT__STIMULUS_EVENT_PARAMETER, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_13_0_0_2_0_0_0, a1_0, true);
						copyLocalizationInfos(a1_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[97]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[98]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[99]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[100]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[101]);
				addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[102]);
				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[103]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[104]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[105]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[106]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[107]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[108]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[109]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[110]);
	}
	
;

parse_org_emftext_language_presentation_stimulus_picture_Picture returns [org.emftext.language.presentation.stimulus.picture.Picture element = null]
@init{
}
:
	a0 = 'picture' {
		if (element == null) {
			element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createPicture();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[111]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createPicture();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[112]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[113]);
	}
	
	(
		(
			(
				a2_0 = parse_org_emftext_language_presentation_stimulus_picture_PicturePart				{
					if (terminateParsing) {
						throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createPicture();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, org.emftext.language.presentation.stimulus.picture.picturePackage.PICTURE__PICTURE_PART, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_4_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[114]);
				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[115]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPicture(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[116]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[117]);
	}
	
	a3 = '}' {
		if (element == null) {
			element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createPicture();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[118]);
	}
	
	(
		a4 = VAR_NAME		
		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createPicture();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VAR_NAME");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.PICTURE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.PICTURE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_7, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[119]);
	}
	
	a5 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createPicture();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_14_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[120]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[121]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[122]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[123]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[124]);
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[125]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[126]);
	}
	
;

parse_org_emftext_language_presentation_parameter_TimeParameter returns [org.emftext.language.presentation.parameter.TimeParameter element = null]
@init{
}
:
	a0 = 'time' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createTimeParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_15_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[127]);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createTimeParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_15_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getTimeParameter(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[128]);
	}
	
	(
		a2_0 = parse_org_emftext_language_presentation_literal_NumberLiteral		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createTimeParameter();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.parameter.parameterPackage.TIME_PARAMETER__NUMBER_LITERAL), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_15_0_0_4, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[129]);
	}
	
	a3 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createTimeParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_15_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getPictureStimulusEvent(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[130]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[131]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[132]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[133]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[134]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[135]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[136]);
	}
	
;

parse_org_emftext_language_presentation_stimulus_picture_TextStimulus returns [org.emftext.language.presentation.stimulus.picture.TextStimulus element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_presentation_stimulus_picture_Text		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createTextStimulus();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.TEXT_STIMULUS__TEXT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_16_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[137]);
	}
	
	(
		a1_0 = parse_org_emftext_language_presentation_general_CoordinateDefinition		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createTextStimulus();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.TEXT_STIMULUS__XDEFINITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_16_0_0_2, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[138]);
	}
	
	(
		a2_0 = parse_org_emftext_language_presentation_general_CoordinateDefinition		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createTextStimulus();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.TEXT_STIMULUS__YDEFINITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_16_0_0_4, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[139]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[140]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[141]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[142]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[143]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[144]);
	}
	
;

parse_org_emftext_language_presentation_general_CoordinateDefinition returns [org.emftext.language.presentation.general.CoordinateDefinition element = null]
@init{
}
:
	(
		(
			a0 = 'x' {
				if (element == null) {
					element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateType().getEEnumLiteral(org.emftext.language.presentation.general.CoordinateType.X_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.general.generalPackage.COORDINATE_DEFINITION__TYPE), value);
				completedElement(value, false);
			}
			|			a1 = 'y' {
				if (element == null) {
					element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateType().getEEnumLiteral(org.emftext.language.presentation.general.CoordinateType.Y_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.general.generalPackage.COORDINATE_DEFINITION__TYPE), value);
				completedElement(value, false);
			}
			|			a2 = 'center_x' {
				if (element == null) {
					element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateType().getEEnumLiteral(org.emftext.language.presentation.general.CoordinateType.CENTER_X_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.general.generalPackage.COORDINATE_DEFINITION__TYPE), value);
				completedElement(value, false);
			}
			|			a3 = 'center_y' {
				if (element == null) {
					element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateType().getEEnumLiteral(org.emftext.language.presentation.general.CoordinateType.CENTER_Y_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.general.generalPackage.COORDINATE_DEFINITION__TYPE), value);
				completedElement(value, false);
			}
			|			a4 = 'left_x' {
				if (element == null) {
					element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateType().getEEnumLiteral(org.emftext.language.presentation.general.CoordinateType.LEFT_X_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.general.generalPackage.COORDINATE_DEFINITION__TYPE), value);
				completedElement(value, false);
			}
			|			a5 = 'top_y' {
				if (element == null) {
					element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.presentation.general.generalPackage.eINSTANCE.getCoordinateType().getEEnumLiteral(org.emftext.language.presentation.general.CoordinateType.TOP_Y_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.general.generalPackage.COORDINATE_DEFINITION__TYPE), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[145]);
	}
	
	a8 = '=' {
		if (element == null) {
			element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[146]);
	}
	
	(
		a9 = SIGNED_INTEGER		
		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
				startIncompleteElement(element);
			}
			if (a9 != null) {
				org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SIGNED_INTEGER");
				tokenResolver.setOptions(getOptions());
				org.emftext.language.presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.emftext.language.presentation.general.generalPackage.COORDINATE_DEFINITION__COORDINATE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStopIndex());
				}
				java.lang.Float resolved = (java.lang.Float) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.general.generalPackage.COORDINATE_DEFINITION__COORDINATE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_4, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a9, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[147]);
	}
	
	a10 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[148]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[149]);
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[150]);
	}
	
	(
		(
			(
				a11 = 'rigth_x' {
					if (element == null) {
						element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[151]);
				}
				
				
				|				a12 = 'bottom_y' {
					if (element == null) {
						element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_0_0_1_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[152]);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[153]);
			}
			
			a13 = '=' {
				if (element == null) {
					element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[154]);
			}
			
			(
				a14 = SIGNED_INTEGER				
				{
					if (terminateParsing) {
						throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
						startIncompleteElement(element);
					}
					if (a14 != null) {
						org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SIGNED_INTEGER");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.emftext.language.presentation.general.generalPackage.COORDINATE_DEFINITION__RIGHT_BOTTOM), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStopIndex());
						}
						java.lang.Float resolved = (java.lang.Float) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.general.generalPackage.COORDINATE_DEFINITION__RIGHT_BOTTOM), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_4, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a14, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[155]);
			}
			
			a15 = ';' {
				if (element == null) {
					element = org.emftext.language.presentation.general.generalFactory.eINSTANCE.createCoordinateDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_17_0_0_6_0_0_5, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[156]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[157]);
	}
	
;

parse_org_emftext_language_presentation_stimulus_picture_Text returns [org.emftext.language.presentation.stimulus.picture.Text element = null]
@init{
}
:
	a0 = 'text' {
		if (element == null) {
			element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createText();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[158]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createText();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[159]);
	}
	
	(
		a2_0 = parse_org_emftext_language_presentation_parameter_CaptionParameter		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createText();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.TEXT__CAPTION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_4, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[160]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[161]);
	}
	
	(
		(
			(
				a3_0 = parse_org_emftext_language_presentation_parameter_TextParameter				{
					if (terminateParsing) {
						throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createText();
						startIncompleteElement(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, org.emftext.language.presentation.stimulus.picture.picturePackage.TEXT__TEXT_PARAMETER, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_6_0_0_0, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[162]);
				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[163]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[164]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[165]);
	}
	
	a4 = '}' {
		if (element == null) {
			element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createText();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[166]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[167]);
	}
	
	(
		(
			(
				a5 = VAR_NAME				
				{
					if (terminateParsing) {
						throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
					}
					if (element == null) {
						element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createText();
						startIncompleteElement(element);
					}
					if (a5 != null) {
						org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VAR_NAME");
						tokenResolver.setOptions(getOptions());
						org.emftext.language.presentation.resource.sce.ISceTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.TEXT__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.stimulus.picture.picturePackage.TEXT__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_9_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[168]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[169]);
	}
	
	a6 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.stimulus.picture.pictureFactory.eINSTANCE.createText();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_18_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[170]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[171]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getSDL(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[172]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[173]);
		addExpectedElement(org.emftext.language.presentation.scenario.scenarioPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[174]);
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getTextStimulus(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[175]);
	}
	
;

parse_org_emftext_language_presentation_parameter_CaptionParameter returns [org.emftext.language.presentation.parameter.CaptionParameter element = null]
@init{
}
:
	a0 = 'caption' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createCaptionParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_19_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[176]);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createCaptionParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_19_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getCaptionParameter(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[177]);
		addExpectedElement(org.emftext.language.presentation.parameter.parameterPackage.eINSTANCE.getCaptionParameter(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[178]);
	}
	
	(
		a2_0 = parse_org_emftext_language_presentation_literal_TextLiteral		{
			if (terminateParsing) {
				throw new org.emftext.language.presentation.resource.sce.mopp.SceTerminateParsingException();
			}
			if (element == null) {
				element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createCaptionParameter();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.presentation.parameter.parameterPackage.CAPTION_PARAMETER__TEXT_LITERAL), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_19_0_0_4, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[179]);
	}
	
	a3 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.parameter.parameterFactory.eINSTANCE.createCaptionParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_19_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.stimulus.picture.picturePackage.eINSTANCE.getText(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[180]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[181]);
	}
	
;

parse_org_emftext_language_presentation_parameter_HeaderParameter returns [org.emftext.language.presentation.parameter.HeaderParameter element = null]
:
	c0 = parse_org_emftext_language_presentation_parameter_ScenarioNameParameter{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_presentation_parameter_ActiveButtonsParameter{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_presentation_parameter_ButtonCodesParameter{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_presentation_stimulus_ScenarioObject returns [org.emftext.language.presentation.stimulus.ScenarioObject element = null]
:
	c0 = parse_org_emftext_language_presentation_stimulus_Trial{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_presentation_stimulus_picture_PictureStimulusEvent{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_presentation_stimulus_picture_Picture{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_emftext_language_presentation_stimulus_picture_TextStimulus{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_emftext_language_presentation_stimulus_picture_Text{ element = c4; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_presentation_stimulus_StimulusEvent returns [org.emftext.language.presentation.stimulus.StimulusEvent element = null]
:
	c0 = parse_org_emftext_language_presentation_stimulus_picture_PictureStimulusEvent{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_presentation_parameter_StimulusEventParameter returns [org.emftext.language.presentation.parameter.StimulusEventParameter element = null]
:
	c0 = parse_org_emftext_language_presentation_parameter_TimeParameter{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_presentation_stimulus_picture_PicturePart returns [org.emftext.language.presentation.stimulus.picture.PicturePart element = null]
:
	c0 = parse_org_emftext_language_presentation_stimulus_picture_TextStimulus{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_presentation_parameter_TextParameter returns [org.emftext.language.presentation.parameter.TextParameter element = null]
:
	c0 = parse_org_emftext_language_presentation_parameter_CaptionParameter{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;
WHITESPACE:
	(('\u0009'|'\u000A'|'\u000B'|'\u000C'|'\u000D'|'\u0020'|'\u00A0'|'\u2000'|'\u2001'|'\u2002'|'\u2003'|'\u2004'|'\u2005'|'\u2006'|'\u2007'|'\u2008'|'\u2009'|'\u200A'|'\u200B'|'\u200C'|'\u200D'|'\u200E'|'\u200F'|'\u2028'|'\u2029'|'\u3000'|'\uFEFF'))
	{ _channel = 99; }
;
SIGNED_INTEGER:
	((('+'|'-')?(('0'..'9'))+))
;
BOOLEAN:
	(('true' | 'false'))
;
QUOTED_NAME:
	(('"'(('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|('0'..'9')|'-'|'_')*)'"'))
;
VAR_NAME:
	((('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|('0'..'9')|'-'|'_')*))
;
QUOTED_TEXT:
	('"'(('A'..'Z'|'a'..'z')|('0'..'9')|'-'|'_'|':'|('\u0009'|'\u000A'|'\u000B'|'\u000C'|'\u000D'|'\u0020'|'\u00A0'|'\u2000'|'\u2001'|'\u2002'|'\u2003'|'\u2004'|'\u2005'|'\u2006'|'\u2007'|'\u2008'|'\u2009'|'\u200A'|'\u200B'|'\u200C'|'\u200D'|'\u200E'|'\u200F'|'\u2028'|'\u2029'|'\u3000'|'\uFEFF')|'/')*'"')
;

