SYNTAXDEF sce
FOR <http://www.emftext.org/language/presentation>
START scenario.Scenario

IMPORTS {
	general: <http://www.emftext.org/language/presentation/general>
	literal: <http://www.emftext.org/language/presentation/literal>
	parameter: <http://www.emftext.org/language/presentation/parameter>
	picture: <http://www.emftext.org/language/presentation/stimulus/picture>
	scenario: <http://www.emftext.org/language/presentation/scenario>
	sound: <http://www.emftext.org/language/presentation/stimulus/sound>
	stimulus: <http://www.emftext.org/language/presentation/stimulus>
}

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
    DEFINE SIGNED_INTEGER $($ + SIGN + $?$ + UNSIGNED_INTEGER + $)$;
	DEFINE BOOLEAN $('true' | 'false')$;

	// Name
	DEFINE FRAGMENT NAME_BODY $($ + LATIN_LETTER + $|$ + DIGIT + $|$ + MINUS_SIGN + $|$ + UNDERSCORE + $)$;
	DEFINE FRAGMENT NAME $($ + LATIN_LETTER + NAME_BODY + $*$ + $)$;
	DEFINE QUOTED_NAME $($ + DOUBLE_QUOTE + NAME + DOUBLE_QUOTE + $)$;
	DEFINE VAR_NAME NAME;
	
	DEFINE FRAGMENT SYMBOL $($ + LATIN_LETTER + $|$ + DIGIT + $|$ + MINUS_SIGN + $|$ + UNDERSCORE + $|$ + COLON +  $|$ + WHITESPACE +  $|$ + SLASH + $)$;
	DEFINE QUOTED_TEXT DOUBLE_QUOTE  + SYMBOL + $*$ + DOUBLE_QUOTE;
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
	// General
	scenario.Scenario ::= header sdl* pcl*;
	scenario.Header ::= (parameter)* !0!0;
	scenario.SDL ::= "begin" ";" !0
		(scenario_object)* !0;
	scenario.PCL ::= "begin_pcl" ";" !0;
	
	// Header parameters
	parameter.ScenarioNameParameter ::= "scenario" #1 "=" #1 name_literal ";" !0;
	parameter.ActiveButtonsParameter ::= "active_buttons" #1 "=" #1 number_literal ";" !0;
	parameter.ButtonCodesParameter ::= "button_codes" #1 "=" #1 number_literal ("," #1 number_literal)* ";" !0;
	
	// Literals
	literal.NumberLiteral ::= value[SIGNED_INTEGER];
	literal.NameLiteral ::= value[QUOTED_NAME];
	literal.BooleanLiteral ::= value[BOOLEAN];
	literal.TextLiteral ::= value[QUOTED_TEXT];
	
	//SDL
	stimulus.Trial ::= "trial" #1 "{" !1
		//(trial_parameter)* !0
		stimulus_list !0
	"}" #1 name[VAR_NAME] ";" !0;
	stimulus.StimulusList ::= (stimulus_event)*;
	picture.PictureStimulusEvent ::= picture !1
			(stimulus_event_parameter)* !0;
	picture.Picture ::= "picture" #1 "{" !1 
		//(picture_parameter)* !0 
		(picture_part)* !0 "}" name[VAR_NAME] ";" !0;
	parameter.TimeParameter ::= "time" #1 "=" #1 number_literal ";" !0;
	//BackgroundColorParameter ::= "background_color" #1 "=" #1 number_literal "," number_literal "," number_literal ";" !0;
	picture.TextStimulus ::= text !0
					x_definition !0
					y_definition !0;
	general.CoordinateDefinition ::= type[X: "x", Y: "y", CENTER_X: "center_x", CENTER_Y: "center_y", 
		LEFT_X: "left_x", TOP_Y: "top_y"] #1 "=" #1 coordinate[SIGNED_INTEGER] ";"
		(("rigth_x" | "bottom_y") #1 "=" #1 right_bottom[SIGNED_INTEGER] ";")? ;
							
	picture.Text ::= "text" #1 "{" !1
		caption !1
		(text_parameter)* !1
		"}" (#1 name[VAR_NAME])? ";" !0;
	parameter.CaptionParameter ::= "caption" #1 "=" #1 text_literal ";" #0; 
	

}