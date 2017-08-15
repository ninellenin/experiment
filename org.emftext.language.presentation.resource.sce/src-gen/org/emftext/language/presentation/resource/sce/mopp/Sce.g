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
		int followSetID = 22;
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
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[0]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[1]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[2]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[3]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_emftext_language_presentation_Scenario{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_emftext_language_presentation_Scenario returns [org.emftext.language.presentation.Scenario element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_presentation_Header		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[4]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[5]);
	}
	
	(
		(
			a1_0 = parse_org_emftext_language_presentation_SDL			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[6]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[7]);
	}
	
	(
		(
			a2_0 = parse_org_emftext_language_presentation_PCL			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[8]);
	}
	
;

parse_org_emftext_language_presentation_Header returns [org.emftext.language.presentation.Header element = null]
@init{
}
:
	(
		(
			(
				a0_0 = parse_org_emftext_language_presentation_Definition				{
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
						retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_1_0_0_0_0_0_0, a0_0, true);
						copyLocalizationInfos(a0_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[9]);
				addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[10]);
				addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[11]);
				addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[12]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[13]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[14]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[15]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[16]);
	}
	
;

parse_org_emftext_language_presentation_SDL returns [org.emftext.language.presentation.SDL element = null]
@init{
}
:
	a0 = 'begin' {
		if (element == null) {
			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createSDL();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[17]);
	}
	
	a1 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createSDL();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_2_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[18]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[19]);
	}
	
;

parse_org_emftext_language_presentation_PCL returns [org.emftext.language.presentation.PCL element = null]
@init{
}
:
	a0 = 'begin_pcl' {
		if (element == null) {
			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createPCL();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[20]);
	}
	
	a1 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createPCL();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_3_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[21]);
	}
	
;

parse_org_emftext_language_presentation_Definition returns [org.emftext.language.presentation.Definition element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_presentation_Parameter		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[22]);
	}
	
	a1 = '=' {
		if (element == null) {
			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[23]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[24]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[25]);
	}
	
	(
		a2_0 = parse_org_emftext_language_presentation_Literal		{
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
					addObjectToList(element, org.emftext.language.presentation.PresentationPackage.DEFINITION__VALUE, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_3, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[26]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[27]);
	}
	
	(
		(
			a3 = ',' {
				if (element == null) {
					element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[28]);
				addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[29]);
				addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getDefinition(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[30]);
			}
			
			(
				a4_0 = parse_org_emftext_language_presentation_Literal				{
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
							addObjectToList(element, org.emftext.language.presentation.PresentationPackage.DEFINITION__VALUE, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_4_0_0_2, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[31]);
				addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[32]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[33]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[34]);
	}
	
	a5 = ';' {
		if (element == null) {
			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_4_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[35]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getHeader(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[36]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[37]);
		addExpectedElement(org.emftext.language.presentation.PresentationPackage.eINSTANCE.getScenario(), org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[38]);
	}
	
;

parse_org_emftext_language_presentation_NumberLiteral returns [org.emftext.language.presentation.NumberLiteral element = null]
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
				element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createNumberLiteral();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SIGNED_INTEGER");
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[39]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[40]);
	}
	
;

parse_org_emftext_language_presentation_NameLiteral returns [org.emftext.language.presentation.NameLiteral element = null]
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
				element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createNameLiteral();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.emftext.language.presentation.resource.sce.ISceTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_NAME");
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[41]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[42]);
	}
	
;

parse_org_emftext_language_presentation_BooleanLiteral returns [org.emftext.language.presentation.BooleanLiteral element = null]
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[43]);
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[44]);
	}
	
;

parse_org_emftext_language_presentation_ScenarioNameParameter returns [org.emftext.language.presentation.ScenarioNameParameter element = null]
@init{
}
:
	a0 = 'scenario' {
		if (element == null) {
			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createScenarioNameParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[45]);
	}
	
;

parse_org_emftext_language_presentation_ActiveButtonsParameter returns [org.emftext.language.presentation.ActiveButtonsParameter element = null]
@init{
}
:
	a0 = 'active_buttons' {
		if (element == null) {
			element = org.emftext.language.presentation.PresentationFactory.eINSTANCE.createActiveButtonsParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.presentation.resource.sce.grammar.SceGrammarInformationProvider.SCE_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.emftext.language.presentation.resource.sce.mopp.SceExpectationConstants.EXPECTATIONS[46]);
	}
	
;

parse_org_emftext_language_presentation_Parameter returns [org.emftext.language.presentation.Parameter element = null]
:
	c0 = parse_org_emftext_language_presentation_ScenarioNameParameter{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_presentation_ActiveButtonsParameter{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_presentation_Literal returns [org.emftext.language.presentation.Literal element = null]
:
	c0 = parse_org_emftext_language_presentation_NumberLiteral{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_presentation_NameLiteral{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_presentation_BooleanLiteral{ element = c2; /* this is a subclass or primitive expression choice */ }
	
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
	(('+'|'-')?(('0'..'9'))+)
;
BOOLEAN:
	(('true' | 'false'))
;
QUOTED_NAME:
	('"'('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|('0'..'9')|'-'|'_')*'"')
;

