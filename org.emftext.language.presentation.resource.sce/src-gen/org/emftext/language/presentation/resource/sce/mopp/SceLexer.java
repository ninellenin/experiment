// $ANTLR 3.4

	package org.emftext.language.presentation.resource.sce.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SceLexer extends Lexer {
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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:19:7: ( 'begin;' )
            // Sce.g:19:9: 'begin;'
            {
            match("begin;"); 



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
            // Sce.g:20:7: ( 'begin_pcl;' )
            // Sce.g:20:9: 'begin_pcl;'
            {
            match("begin_pcl;"); 



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
            // Sce.g:21:7: ( 'scenario' )
            // Sce.g:21:9: 'scenario'
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
    // $ANTLR end "T__18"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:1042:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Sce.g:1043:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Sce.g:1043:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Sce.g:1043:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Sce.g:1043:3: ( '\\r\\n' | '\\r' | '\\n' )
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
                    // Sce.g:1043:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Sce.g:1043:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Sce.g:1043:20: '\\n'
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
            // Sce.g:1046:11: ( ( ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) ) )
            // Sce.g:1047:2: ( ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) )
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

    // $ANTLR start "UNSIGNED_INTEGER"
    public final void mUNSIGNED_INTEGER() throws RecognitionException {
        try {
            int _type = UNSIGNED_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:1050:17: ( ( ( ( '0' .. '9' ) )+ ) )
            // Sce.g:1051:2: ( ( ( '0' .. '9' ) )+ )
            {
            // Sce.g:1051:2: ( ( ( '0' .. '9' ) )+ )
            // Sce.g:1051:3: ( ( '0' .. '9' ) )+
            {
            // Sce.g:1051:3: ( ( '0' .. '9' ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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
    // $ANTLR end "UNSIGNED_INTEGER"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:1054:7: ( ( ( ( ( '0' .. '9' ) )+ | ( '+' | '-' )? ( ( '0' .. '9' ) )+ ) ) )
            // Sce.g:1055:2: ( ( ( ( '0' .. '9' ) )+ | ( '+' | '-' )? ( ( '0' .. '9' ) )+ ) )
            {
            // Sce.g:1055:2: ( ( ( ( '0' .. '9' ) )+ | ( '+' | '-' )? ( ( '0' .. '9' ) )+ ) )
            // Sce.g:1055:3: ( ( ( '0' .. '9' ) )+ | ( '+' | '-' )? ( ( '0' .. '9' ) )+ )
            {
            // Sce.g:1055:3: ( ( ( '0' .. '9' ) )+ | ( '+' | '-' )? ( ( '0' .. '9' ) )+ )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                alt6=1;
            }
            else if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Sce.g:1055:4: ( ( '0' .. '9' ) )+
                    {
                    // Sce.g:1055:4: ( ( '0' .. '9' ) )+
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
                    break;
                case 2 :
                    // Sce.g:1055:18: ( '+' | '-' )? ( ( '0' .. '9' ) )+
                    {
                    // Sce.g:1055:18: ( '+' | '-' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='+'||LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
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


                    // Sce.g:1055:28: ( ( '0' .. '9' ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
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
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


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
    // $ANTLR end "NUMBER"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:1057:8: ( ( ( 'true' | 'false' ) ) )
            // Sce.g:1058:2: ( ( 'true' | 'false' ) )
            {
            // Sce.g:1058:2: ( ( 'true' | 'false' ) )
            // Sce.g:1058:3: ( 'true' | 'false' )
            {
            // Sce.g:1058:3: ( 'true' | 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='t') ) {
                alt7=1;
            }
            else if ( (LA7_0=='f') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // Sce.g:1058:4: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // Sce.g:1058:13: 'false'
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

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:1060:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* ) )
            // Sce.g:1061:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* )
            {
            // Sce.g:1061:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* )
            // Sce.g:1061:3: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Sce.g:1061:22: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='-'||(LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                    alt8=1;
                }


                switch (alt8) {
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
            	    break loop8;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "QUOTED_NAME"
    public final void mQUOTED_NAME() throws RecognitionException {
        try {
            int _type = QUOTED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:1063:12: ( ( '\"' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* '\"' ) )
            // Sce.g:1064:2: ( '\"' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* '\"' )
            {
            // Sce.g:1064:2: ( '\"' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* '\"' )
            // Sce.g:1064:3: '\"' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* '\"'
            {
            match('\"'); 

            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Sce.g:1064:25: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='-'||(LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    break loop9;
                }
            } while (true);


            match('\"'); 

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
    // $ANTLR end "QUOTED_NAME"

    // $ANTLR start "QUOTED_STRING"
    public final void mQUOTED_STRING() throws RecognitionException {
        try {
            int _type = QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:1067:14: ( ( '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) )* '\"' ) )
            // Sce.g:1068:2: ( '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) )* '\"' )
            {
            // Sce.g:1068:2: ( '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) )* '\"' )
            // Sce.g:1068:3: '\"' (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) )* '\"'
            {
            match('\"'); 

            // Sce.g:1068:6: (~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= '\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Sce.g:1068:6: ~ ( '\"' | ( '\\r\\n' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop10;
                }
            } while (true);


            match('\"'); 

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
    // $ANTLR end "QUOTED_STRING"

    public void mTokens() throws RecognitionException {
        // Sce.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | LINEBREAK | WHITESPACE | UNSIGNED_INTEGER | NUMBER | BOOLEAN | NAME | QUOTED_NAME | QUOTED_STRING )
        int alt11=15;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // Sce.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // Sce.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // Sce.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // Sce.g:1:28: T__15
                {
                mT__15(); 


                }
                break;
            case 5 :
                // Sce.g:1:34: T__16
                {
                mT__16(); 


                }
                break;
            case 6 :
                // Sce.g:1:40: T__17
                {
                mT__17(); 


                }
                break;
            case 7 :
                // Sce.g:1:46: T__18
                {
                mT__18(); 


                }
                break;
            case 8 :
                // Sce.g:1:52: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 9 :
                // Sce.g:1:62: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 10 :
                // Sce.g:1:73: UNSIGNED_INTEGER
                {
                mUNSIGNED_INTEGER(); 


                }
                break;
            case 11 :
                // Sce.g:1:90: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 12 :
                // Sce.g:1:97: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 13 :
                // Sce.g:1:105: NAME
                {
                mNAME(); 


                }
                break;
            case 14 :
                // Sce.g:1:110: QUOTED_NAME
                {
                mQUOTED_NAME(); 


                }
                break;
            case 15 :
                // Sce.g:1:122: QUOTED_STRING
                {
                mQUOTED_STRING(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\4\uffff\3\16\3\uffff\1\24\1\uffff\2\16\2\uffff\3\16\2\uffff\2\16"+
        "\2\uffff\5\16\2\uffff\3\16\1\51\1\16\1\uffff\3\16\1\uffff\1\51\1"+
        "\16\1\uffff\7\16\1\67\2\16\1\uffff\1\16\1\uffff\3\16\1\76\1\uffff";
    static final String DFA11_eofS =
        "\77\uffff";
    static final String DFA11_minS =
        "\1\11\3\uffff\1\143\1\145\1\143\3\uffff\1\60\1\uffff\1\162\1\141"+
        "\1\uffff\1\0\1\164\1\147\1\145\2\uffff\1\165\1\154\1\0\1\uffff\2"+
        "\151\1\156\1\145\1\163\1\0\1\uffff\1\166\1\156\1\141\1\55\1\145"+
        "\1\uffff\1\145\1\73\1\162\1\uffff\1\55\1\137\1\uffff\1\160\1\151"+
        "\1\142\1\143\1\157\1\165\1\154\1\55\1\164\1\73\1\uffff\1\164\1\uffff"+
        "\1\157\1\156\1\163\1\55\1\uffff";
    static final String DFA11_maxS =
        "\1\ufeff\3\uffff\1\143\1\145\1\143\3\uffff\1\71\1\uffff\1\162\1"+
        "\141\1\uffff\1\uffff\1\164\1\147\1\145\2\uffff\1\165\1\154\1\uffff"+
        "\1\uffff\2\151\1\156\1\145\1\163\1\uffff\1\uffff\1\166\1\156\1\141"+
        "\1\172\1\145\1\uffff\1\145\1\137\1\162\1\uffff\1\172\1\137\1\uffff"+
        "\1\160\1\151\1\142\1\143\1\157\1\165\1\154\1\172\1\164\1\73\1\uffff"+
        "\1\164\1\uffff\1\157\1\156\1\163\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\2\10\1\11\1\uffff\1\13\2\uffff\1\15"+
        "\4\uffff\1\10\1\12\3\uffff\1\17\6\uffff\1\16\5\uffff\1\16\3\uffff"+
        "\1\14\2\uffff\1\5\12\uffff\1\7\1\uffff\1\6\4\uffff\1\4";
    static final String DFA11_specialS =
        "\17\uffff\1\1\7\uffff\1\0\6\uffff\1\2\40\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\11\1\10\2\11\1\7\22\uffff\1\11\1\uffff\1\17\10\uffff\1\13"+
            "\1\1\1\13\2\uffff\12\12\1\uffff\1\2\1\uffff\1\3\3\uffff\32\16"+
            "\6\uffff\1\4\1\5\3\16\1\15\14\16\1\6\1\14\6\16\45\uffff\1\11"+
            "\u1f5f\uffff\20\11\30\uffff\2\11\u0fd6\uffff\1\11\ucefe\uffff"+
            "\1\11",
            "",
            "",
            "",
            "\1\20",
            "\1\21",
            "\1\22",
            "",
            "",
            "",
            "\12\12",
            "",
            "\1\25",
            "\1\26",
            "",
            "\12\30\1\uffff\2\30\1\uffff\63\30\32\27\6\30\32\27\uff85\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "",
            "",
            "\1\34",
            "\1\35",
            "\12\30\1\uffff\2\30\1\uffff\24\30\1\37\12\30\1\36\2\30\12\36"+
            "\7\30\32\36\4\30\1\36\1\30\32\36\uff85\30",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\12\30\1\uffff\2\30\1\uffff\24\30\1\37\12\30\1\36\2\30\12\36"+
            "\7\30\32\36\4\30\1\36\1\30\32\36\uff85\30",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\52",
            "",
            "\1\53",
            "\1\54\43\uffff\1\55",
            "\1\56",
            "",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\57",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\70",
            "\1\71",
            "",
            "\1\72",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | LINEBREAK | WHITESPACE | UNSIGNED_INTEGER | NUMBER | BOOLEAN | NAME | QUOTED_NAME | QUOTED_STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_23 = input.LA(1);

                        s = -1;
                        if ( (LA11_23=='-'||(LA11_23 >= '0' && LA11_23 <= '9')||(LA11_23 >= 'A' && LA11_23 <= 'Z')||LA11_23=='_'||(LA11_23 >= 'a' && LA11_23 <= 'z')) ) {s = 30;}

                        else if ( (LA11_23=='\"') ) {s = 31;}

                        else if ( ((LA11_23 >= '\u0000' && LA11_23 <= '\t')||(LA11_23 >= '\u000B' && LA11_23 <= '\f')||(LA11_23 >= '\u000E' && LA11_23 <= '!')||(LA11_23 >= '#' && LA11_23 <= ',')||(LA11_23 >= '.' && LA11_23 <= '/')||(LA11_23 >= ':' && LA11_23 <= '@')||(LA11_23 >= '[' && LA11_23 <= '^')||LA11_23=='`'||(LA11_23 >= '{' && LA11_23 <= '\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_15 = input.LA(1);

                        s = -1;
                        if ( ((LA11_15 >= 'A' && LA11_15 <= 'Z')||(LA11_15 >= 'a' && LA11_15 <= 'z')) ) {s = 23;}

                        else if ( ((LA11_15 >= '\u0000' && LA11_15 <= '\t')||(LA11_15 >= '\u000B' && LA11_15 <= '\f')||(LA11_15 >= '\u000E' && LA11_15 <= '@')||(LA11_15 >= '[' && LA11_15 <= '`')||(LA11_15 >= '{' && LA11_15 <= '\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_30 = input.LA(1);

                        s = -1;
                        if ( (LA11_30=='\"') ) {s = 31;}

                        else if ( (LA11_30=='-'||(LA11_30 >= '0' && LA11_30 <= '9')||(LA11_30 >= 'A' && LA11_30 <= 'Z')||LA11_30=='_'||(LA11_30 >= 'a' && LA11_30 <= 'z')) ) {s = 30;}

                        else if ( ((LA11_30 >= '\u0000' && LA11_30 <= '\t')||(LA11_30 >= '\u000B' && LA11_30 <= '\f')||(LA11_30 >= '\u000E' && LA11_30 <= '!')||(LA11_30 >= '#' && LA11_30 <= ',')||(LA11_30 >= '.' && LA11_30 <= '/')||(LA11_30 >= ':' && LA11_30 <= '@')||(LA11_30 >= '[' && LA11_30 <= '^')||LA11_30=='`'||(LA11_30 >= '{' && LA11_30 <= '\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}