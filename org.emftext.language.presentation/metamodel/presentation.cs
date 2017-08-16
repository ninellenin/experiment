SYNTAXDEF sce
FOR <http://www.emftext.org/language/Presentation> 
START Scenario

OPTIONS {
    reloadGeneratorModel = "true";
    usePredefinedTokens = "false";
    disableBuilder = "true";
    disableDebugSupport = "true";
    disableLaunchSupport = "true";
 //   disableTokenSorting = "true";
//    overrideProposalPostProcessor = "false";
//    overrideManifest = "false";
//    overrideUIManifest = "false";
}

TOKENS {
	DEFINE LINEBREAK $('\r\n' | '\r' | '\n')$;
  	DEFINE WHITESPACE $('\u0009'|'\u000A'|'\u000B'|'\u000C'|'\u000D'|'\u0020'|'\u00A0'|'\u2000'|'\u2001'$ +
                      $|'\u2002'|'\u2003'|'\u2004'|'\u2005'|'\u2006'|'\u2007'|'\u2008'|'\u2009'|'\u200A'$ +
                      $|'\u200B'|'\u200C'|'\u200D'|'\u200E'|'\u200F'|'\u2028'|'\u2029'|'\u3000'|'\uFEFF')$;

    DEFINE FRAGMENT LATIN_LETTER $($ + LATIN_UPPER_CASE_LETTER + $|$ + LATIN_LOWER_CASE_LETTER + $)$;
    DEFINE FRAGMENT LATIN_UPPER_CASE_LETTER $'A'..'Z'$;
    DEFINE FRAGMENT LATIN_LOWER_CASE_LETTER $'a'..'z'$;
    DEFINE FRAGMENT DIGIT $('0'..'9')$;    
    DEFINE FRAGMENT COLON $':'$;
    DEFINE FRAGMENT DOT $'.'$;
    DEFINE FRAGMENT SPACE $' '$;
    DEFINE FRAGMENT UNDERSCORE $'_'$;
    DEFINE FRAGMENT SLASH $'/'$;
    DEFINE FRAGMENT ASTERISK $'*'$;
    DEFINE FRAGMENT QUOTE $'\''$;
    DEFINE FRAGMENT DOUBLE_QUOTE $'"'$;
    DEFINE FRAGMENT PLUS_SIGN $'+'$;
    DEFINE FRAGMENT MINUS_SIGN $'-'$;
    DEFINE FRAGMENT SIGN $($ + PLUS_SIGN + $|$ + MINUS_SIGN + $)$;
    DEFINE FRAGMENT NEWLINE $('\r\n'|'\r'|'\n')$;
    
    //DEFINE FRAGMENT QUOTE_SYMBOL $($ + QUOTE + QUOTE + $)$;
    DEFINE FRAGMENT NONQUOTE_CHARACTER $~($ + QUOTE + $|$ + NEWLINE + $)$; 
    //DEFINE FRAGMENT DOUBLEQUOTE_SYMBOL $($ + DOUBLE_QUOTE + DOUBLE_QUOTE + $)$;
    DEFINE FRAGMENT NONDOUBLEQUOTE_CHARACTER $~($ + DOUBLE_QUOTE + $|$ + NEWLINE + $)$;
   
    // Literals
    DEFINE FRAGMENT UNSIGNED_INTEGER $($ + DIGIT + $)+$;
    DEFINE SIGNED_INTEGER SIGN + $?$ + UNSIGNED_INTEGER;
	DEFINE BOOLEAN $('true' | 'false')$;

	// Text
	DEFINE FRAGMENT NAME_BODY $($ + LATIN_LETTER + $|$ + DIGIT + $|$ + MINUS_SIGN + $|$ + UNDERSCORE + $)$;
	DEFINE FRAGMENT NAME LATIN_LETTER + NAME_BODY + $*$;
	DEFINE QUOTED_NAME DOUBLE_QUOTE + NAME + DOUBLE_QUOTE;
}

TOKENSTYLES {
	"begin", "begin_pcl" 
	COLOR #00802A, BOLD;
	
	"SIGNED_INTEGER", "BOOLEAN"
	COLOR #0A4500;
	
	 "=", ";"
	 COLOR #00005C, BOLD;
	
	"QUOTED_NAME" 
	COLOR  #000099, ITALIC;
}

RULES {
	Scenario ::= header sdl* pcl*;
	Header ::= (definition)* !0;
	SDL ::= "begin" ";" !0;
	PCL ::= "begin_pcl" ";" !0;
	
	Definition ::= parameter #1 "=" value ("," #1 value)*  ";" !0;
	NumberLiteral ::= value[SIGNED_INTEGER];
	NameLiteral ::= value[QUOTED_NAME];
	BooleanLiteral ::= value[BOOLEAN];
	ScenarioNameParameter ::= "scenario";
	ActiveButtonsParameter ::= "active_buttons";
}