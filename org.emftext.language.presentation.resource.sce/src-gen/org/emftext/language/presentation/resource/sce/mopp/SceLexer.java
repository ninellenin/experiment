// $ANTLR 3.4

	package org.emftext.language.presentation.resource.sce.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SceLexer extends Lexer {
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

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SceLexer() {} 
    public SceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Sce.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:15:7: ( ',' )
            // Sce.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:16:7: ( ';' )
            // Sce.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:17:7: ( '=' )
            // Sce.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:18:7: ( 'active_buttons' )
            // Sce.g:18:9: 'active_buttons'
            {
            match("active_buttons"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:19:7: ( 'begin' )
            // Sce.g:19:9: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:20:7: ( 'begin_pcl' )
            // Sce.g:20:9: 'begin_pcl'
            {
            match("begin_pcl"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:21:7: ( 'bottom_y' )
            // Sce.g:21:9: 'bottom_y'
            {
            match("bottom_y"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:22:7: ( 'button_codes' )
            // Sce.g:22:9: 'button_codes'
            {
            match("button_codes"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:23:7: ( 'caption' )
            // Sce.g:23:9: 'caption'
            {
            match("caption"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:24:7: ( 'center_x' )
            // Sce.g:24:9: 'center_x'
            {
            match("center_x"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:25:7: ( 'center_y' )
            // Sce.g:25:9: 'center_y'
            {
            match("center_y"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:26:7: ( 'left_x' )
            // Sce.g:26:9: 'left_x'
            {
            match("left_x"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:27:7: ( 'picture' )
            // Sce.g:27:9: 'picture'
            {
            match("picture"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:28:7: ( 'rigth_x' )
            // Sce.g:28:9: 'rigth_x'
            {
            match("rigth_x"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:29:7: ( 'scenario' )
            // Sce.g:29:9: 'scenario'
            {
            match("scenario"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:30:7: ( 'text' )
            // Sce.g:30:9: 'text'
            {
            match("text"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:31:7: ( 'time' )
            // Sce.g:31:9: 'time'
            {
            match("time"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:32:7: ( 'top_y' )
            // Sce.g:32:9: 'top_y'
            {
            match("top_y"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:33:7: ( 'trial' )
            // Sce.g:33:9: 'trial'
            {
            match("trial"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:34:7: ( 'x' )
            // Sce.g:34:9: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:35:7: ( 'y' )
            // Sce.g:35:9: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:36:7: ( '{' )
            // Sce.g:36:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:37:7: ( '}' )
            // Sce.g:37:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:2422:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Sce.g:2423:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Sce.g:2423:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Sce.g:2423:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Sce.g:2423:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='\n') ) {
                    alt1=1;
                }
                else {
                    alt1=2;
                }
            }
            else if ( (LA1_0=='\n') ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Sce.g:2423:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Sce.g:2423:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Sce.g:2423:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:2426:11: ( ( ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) ) )
            // Sce.g:2427:2: ( ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\r')||input.LA(1)==' '||input.LA(1)=='\u00A0'||(input.LA(1) >= '\u2000' && input.LA(1) <= '\u200F')||(input.LA(1) >= '\u2028' && input.LA(1) <= '\u2029')||input.LA(1)=='\u3000'||input.LA(1)=='\uFEFF' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "SIGNED_INTEGER"
    public final void mSIGNED_INTEGER() throws RecognitionException {
        try {
            int _type = SIGNED_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:2430:15: ( ( ( ( '+' | '-' )? ( ( '0' .. '9' ) )+ ) ) )
            // Sce.g:2431:2: ( ( ( '+' | '-' )? ( ( '0' .. '9' ) )+ ) )
            {
            // Sce.g:2431:2: ( ( ( '+' | '-' )? ( ( '0' .. '9' ) )+ ) )
            // Sce.g:2431:3: ( ( '+' | '-' )? ( ( '0' .. '9' ) )+ )
            {
            // Sce.g:2431:3: ( ( '+' | '-' )? ( ( '0' .. '9' ) )+ )
            // Sce.g:2431:4: ( '+' | '-' )? ( ( '0' .. '9' ) )+
            {
            // Sce.g:2431:4: ( '+' | '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Sce.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // Sce.g:2431:14: ( ( '0' .. '9' ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Sce.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIGNED_INTEGER"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:2433:8: ( ( ( 'true' | 'false' ) ) )
            // Sce.g:2434:2: ( ( 'true' | 'false' ) )
            {
            // Sce.g:2434:2: ( ( 'true' | 'false' ) )
            // Sce.g:2434:3: ( 'true' | 'false' )
            {
            // Sce.g:2434:3: ( 'true' | 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='t') ) {
                alt4=1;
            }
            else if ( (LA4_0=='f') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Sce.g:2434:4: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // Sce.g:2434:13: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "QUOTED_NAME"
    public final void mQUOTED_NAME() throws RecognitionException {
        try {
            int _type = QUOTED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:2436:12: ( ( ( '\"' ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) '\"' ) ) )
            // Sce.g:2437:2: ( ( '\"' ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) '\"' ) )
            {
            // Sce.g:2437:2: ( ( '\"' ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) '\"' ) )
            // Sce.g:2437:3: ( '\"' ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) '\"' )
            {
            // Sce.g:2437:3: ( '\"' ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) '\"' )
            // Sce.g:2437:4: '\"' ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) '\"'
            {
            match('\"'); 

            // Sce.g:2437:7: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* )
            // Sce.g:2437:8: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Sce.g:2437:27: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Sce.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_NAME"

    // $ANTLR start "VAR_NAME"
    public final void mVAR_NAME() throws RecognitionException {
        try {
            int _type = VAR_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:2439:9: ( ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) ) )
            // Sce.g:2440:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) )
            {
            // Sce.g:2440:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) )
            // Sce.g:2440:3: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* )
            {
            // Sce.g:2440:3: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* )
            // Sce.g:2440:4: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Sce.g:2440:23: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='-'||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Sce.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR_NAME"

    // $ANTLR start "QUOTED_TEXT"
    public final void mQUOTED_TEXT() throws RecognitionException {
        try {
            int _type = QUOTED_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:2442:12: ( ( '\"' ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' | ':' | ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) | '/' )* '\"' ) )
            // Sce.g:2443:2: ( '\"' ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' | ':' | ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) | '/' )* '\"' )
            {
            // Sce.g:2443:2: ( '\"' ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' | ':' | ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) | '/' )* '\"' )
            // Sce.g:2443:3: '\"' ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' | ':' | ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) | '/' )* '\"'
            {
            match('\"'); 

            // Sce.g:2443:6: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' | ':' | ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) | '/' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\r')||LA7_0==' '||LA7_0=='-'||(LA7_0 >= '/' && LA7_0 <= ':')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')||LA7_0=='\u00A0'||(LA7_0 >= '\u2000' && LA7_0 <= '\u200F')||(LA7_0 >= '\u2028' && LA7_0 <= '\u2029')||LA7_0=='\u3000'||LA7_0=='\uFEFF') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Sce.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\r')||input.LA(1)==' '||input.LA(1)=='-'||(input.LA(1) >= '/' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A0'||(input.LA(1) >= '\u2000' && input.LA(1) <= '\u200F')||(input.LA(1) >= '\u2028' && input.LA(1) <= '\u2029')||input.LA(1)=='\u3000'||input.LA(1)=='\uFEFF' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match('\"'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_TEXT"

    public void mTokens() throws RecognitionException {
        // Sce.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | LINEBREAK | WHITESPACE | SIGNED_INTEGER | BOOLEAN | QUOTED_NAME | VAR_NAME | QUOTED_TEXT )
        int alt8=30;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // Sce.g:1:10: T__11
                {
                mT__11(); 


                }
                break;
            case 2 :
                // Sce.g:1:16: T__12
                {
                mT__12(); 


                }
                break;
            case 3 :
                // Sce.g:1:22: T__13
                {
                mT__13(); 


                }
                break;
            case 4 :
                // Sce.g:1:28: T__14
                {
                mT__14(); 


                }
                break;
            case 5 :
                // Sce.g:1:34: T__15
                {
                mT__15(); 


                }
                break;
            case 6 :
                // Sce.g:1:40: T__16
                {
                mT__16(); 


                }
                break;
            case 7 :
                // Sce.g:1:46: T__17
                {
                mT__17(); 


                }
                break;
            case 8 :
                // Sce.g:1:52: T__18
                {
                mT__18(); 


                }
                break;
            case 9 :
                // Sce.g:1:58: T__19
                {
                mT__19(); 


                }
                break;
            case 10 :
                // Sce.g:1:64: T__20
                {
                mT__20(); 


                }
                break;
            case 11 :
                // Sce.g:1:70: T__21
                {
                mT__21(); 


                }
                break;
            case 12 :
                // Sce.g:1:76: T__22
                {
                mT__22(); 


                }
                break;
            case 13 :
                // Sce.g:1:82: T__23
                {
                mT__23(); 


                }
                break;
            case 14 :
                // Sce.g:1:88: T__24
                {
                mT__24(); 


                }
                break;
            case 15 :
                // Sce.g:1:94: T__25
                {
                mT__25(); 


                }
                break;
            case 16 :
                // Sce.g:1:100: T__26
                {
                mT__26(); 


                }
                break;
            case 17 :
                // Sce.g:1:106: T__27
                {
                mT__27(); 


                }
                break;
            case 18 :
                // Sce.g:1:112: T__28
                {
                mT__28(); 


                }
                break;
            case 19 :
                // Sce.g:1:118: T__29
                {
                mT__29(); 


                }
                break;
            case 20 :
                // Sce.g:1:124: T__30
                {
                mT__30(); 


                }
                break;
            case 21 :
                // Sce.g:1:130: T__31
                {
                mT__31(); 


                }
                break;
            case 22 :
                // Sce.g:1:136: T__32
                {
                mT__32(); 


                }
                break;
            case 23 :
                // Sce.g:1:142: T__33
                {
                mT__33(); 


                }
                break;
            case 24 :
                // Sce.g:1:148: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 25 :
                // Sce.g:1:158: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 26 :
                // Sce.g:1:169: SIGNED_INTEGER
                {
                mSIGNED_INTEGER(); 


                }
                break;
            case 27 :
                // Sce.g:1:184: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 28 :
                // Sce.g:1:192: QUOTED_NAME
                {
                mQUOTED_NAME(); 


                }
                break;
            case 29 :
                // Sce.g:1:204: VAR_NAME
                {
                mVAR_NAME(); 


                }
                break;
            case 30 :
                // Sce.g:1:213: QUOTED_TEXT
                {
                mQUOTED_TEXT(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\4\uffff\10\26\1\45\1\46\6\uffff\1\26\2\uffff\16\26\3\uffff\1\26"+
        "\2\uffff\20\26\2\uffff\12\26\1\130\1\131\2\26\1\134\1\26\1\uffff"+
        "\1\26\1\140\10\26\2\uffff\1\151\1\152\1\uffff\1\134\2\26\1\uffff"+
        "\4\26\1\161\3\26\2\uffff\4\26\1\171\1\26\1\uffff\1\174\1\175\3\26"+
        "\1\u0081\1\26\1\uffff\1\u0083\1\u0084\2\uffff\1\u0085\1\26\1\u0087"+
        "\1\uffff\1\26\3\uffff\1\26\1\uffff\4\26\1\u008e\1\26\1\uffff\1\u0090"+
        "\1\uffff";
    static final String DFA8_eofS =
        "\u0091\uffff";
    static final String DFA8_minS =
        "\1\11\3\uffff\1\143\1\145\1\141\1\145\2\151\1\143\1\145\2\55\6\uffff"+
        "\1\141\1\11\1\uffff\1\164\1\147\2\164\1\160\1\156\1\146\1\143\1"+
        "\147\1\145\1\170\1\155\1\160\1\151\3\uffff\1\154\1\11\1\uffff\2"+
        "\151\7\164\1\156\1\164\1\145\1\137\1\141\1\145\1\163\1\11\1\uffff"+
        "\1\166\1\156\2\157\1\151\1\145\1\137\1\165\1\150\1\141\2\55\1\171"+
        "\1\154\1\55\1\145\1\uffff\1\145\1\55\1\155\1\156\1\157\1\162\1\170"+
        "\1\162\1\137\1\162\2\uffff\2\55\1\uffff\1\55\1\137\1\160\1\uffff"+
        "\2\137\1\156\1\137\1\55\1\145\1\170\1\151\2\uffff\1\142\1\143\1"+
        "\171\1\143\1\55\1\170\1\uffff\2\55\1\157\1\165\1\154\1\55\1\157"+
        "\1\uffff\2\55\2\uffff\1\55\1\164\1\55\1\uffff\1\144\3\uffff\1\164"+
        "\1\uffff\1\145\1\157\1\163\1\156\1\55\1\163\1\uffff\1\55\1\uffff";
    static final String DFA8_maxS =
        "\1\ufeff\3\uffff\1\143\1\165\2\145\2\151\1\143\1\162\2\172\6\uffff"+
        "\1\141\1\ufeff\1\uffff\1\164\1\147\2\164\1\160\1\156\1\146\1\143"+
        "\1\147\1\145\1\170\1\155\1\160\1\165\3\uffff\1\154\1\ufeff\1\uffff"+
        "\2\151\7\164\1\156\1\164\1\145\1\137\1\141\1\145\1\163\1\ufeff\1"+
        "\uffff\1\166\1\156\2\157\1\151\1\145\1\137\1\165\1\150\1\141\2\172"+
        "\1\171\1\154\1\172\1\145\1\uffff\1\145\1\172\1\155\1\156\1\157\1"+
        "\162\1\170\1\162\1\137\1\162\2\uffff\2\172\1\uffff\1\172\1\137\1"+
        "\160\1\uffff\2\137\1\156\1\137\1\172\1\145\1\170\1\151\2\uffff\1"+
        "\142\1\143\1\171\1\143\1\172\1\171\1\uffff\2\172\1\157\1\165\1\154"+
        "\1\172\1\157\1\uffff\2\172\2\uffff\1\172\1\164\1\172\1\uffff\1\144"+
        "\3\uffff\1\164\1\uffff\1\145\1\157\1\163\1\156\1\172\1\163\1\uffff"+
        "\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\12\uffff\1\26\1\27\2\30\1\31\1\32\2\uffff\1"+
        "\35\16\uffff\1\24\1\25\1\30\2\uffff\1\36\21\uffff\1\34\20\uffff"+
        "\1\34\12\uffff\1\20\1\21\2\uffff\1\33\3\uffff\1\5\10\uffff\1\22"+
        "\1\23\6\uffff\1\14\7\uffff\1\11\2\uffff\1\15\1\16\3\uffff\1\7\1"+
        "\uffff\1\12\1\13\1\17\1\uffff\1\6\6\uffff\1\10\1\uffff\1\4";
    static final String DFA8_specialS =
        "\u0091\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\22\1\21\2\22\1\20\22\uffff\1\22\1\uffff\1\25\10\uffff\1\23"+
            "\1\1\1\23\2\uffff\12\23\1\uffff\1\2\1\uffff\1\3\3\uffff\32\26"+
            "\6\uffff\1\4\1\5\1\6\2\26\1\24\5\26\1\7\3\26\1\10\1\26\1\11"+
            "\1\12\1\13\3\26\1\14\1\15\1\26\1\16\1\uffff\1\17\42\uffff\1"+
            "\22\u1f5f\uffff\20\22\30\uffff\2\22\u0fd6\uffff\1\22\ucefe\uffff"+
            "\1\22",
            "",
            "",
            "",
            "\1\27",
            "\1\30\11\uffff\1\31\5\uffff\1\32",
            "\1\33\3\uffff\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41\3\uffff\1\42\5\uffff\1\43\2\uffff\1\44",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "\5\52\22\uffff\1\52\1\uffff\1\52\12\uffff\1\52\1\uffff\14\52"+
            "\6\uffff\32\51\4\uffff\1\52\1\uffff\32\51\45\uffff\1\52\u1f5f"+
            "\uffff\20\52\30\uffff\2\52\u0fd6\uffff\1\52\ucefe\uffff\1\52",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70\13\uffff\1\71",
            "",
            "",
            "",
            "\1\72",
            "\5\52\22\uffff\1\52\1\uffff\1\74\12\uffff\1\73\1\uffff\1\52"+
            "\12\73\1\52\6\uffff\32\73\4\uffff\1\73\1\uffff\32\73\45\uffff"+
            "\1\52\u1f5f\uffff\20\52\30\uffff\2\52\u0fd6\uffff\1\52\ucefe"+
            "\uffff\1\52",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\5\52\22\uffff\1\52\1\uffff\1\74\12\uffff\1\73\1\uffff\1\52"+
            "\12\73\1\52\6\uffff\32\73\4\uffff\1\73\1\uffff\32\73\45\uffff"+
            "\1\52\u1f5f\uffff\20\52\30\uffff\2\52\u0fd6\uffff\1\52\ucefe"+
            "\uffff\1\52",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\132",
            "\1\133",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\135",
            "",
            "\1\136",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\137\1\uffff\32"+
            "\26",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\172\1\173",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0082",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0086",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u0088",
            "",
            "",
            "",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u008f",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | LINEBREAK | WHITESPACE | SIGNED_INTEGER | BOOLEAN | QUOTED_NAME | VAR_NAME | QUOTED_TEXT );";
        }
    }
 

}