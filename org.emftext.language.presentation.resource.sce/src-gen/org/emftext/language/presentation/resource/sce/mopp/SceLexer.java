// $ANTLR 3.4

	package org.emftext.language.presentation.resource.sce.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SceLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int BOOLEAN=4;
    public static final int LINEBREAK=5;
    public static final int QUOTED_NAME=6;
    public static final int SIGNED_INTEGER=7;
    public static final int WHITESPACE=8;

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

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:15:6: ( ',' )
            // Sce.g:15:8: ','
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Sce.g:1080:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Sce.g:1081:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Sce.g:1081:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Sce.g:1081:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Sce.g:1081:3: ( '\\r\\n' | '\\r' | '\\n' )
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
                    // Sce.g:1081:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Sce.g:1081:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Sce.g:1081:20: '\\n'
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
            // Sce.g:1084:11: ( ( ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) ) )
            // Sce.g:1085:2: ( ( '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u0020' | '\\u00A0' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2007' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u200B' | '\\u200C' | '\\u200D' | '\\u200E' | '\\u200F' | '\\u2028' | '\\u2029' | '\\u3000' | '\\uFEFF' ) )
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
            // Sce.g:1088:15: ( ( ( '+' | '-' )? ( ( '0' .. '9' ) )+ ) )
            // Sce.g:1089:2: ( ( '+' | '-' )? ( ( '0' .. '9' ) )+ )
            {
            // Sce.g:1089:2: ( ( '+' | '-' )? ( ( '0' .. '9' ) )+ )
            // Sce.g:1089:3: ( '+' | '-' )? ( ( '0' .. '9' ) )+
            {
            // Sce.g:1089:3: ( '+' | '-' )?
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


            // Sce.g:1089:13: ( ( '0' .. '9' ) )+
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
            // Sce.g:1091:8: ( ( ( 'true' | 'false' ) ) )
            // Sce.g:1092:2: ( ( 'true' | 'false' ) )
            {
            // Sce.g:1092:2: ( ( 'true' | 'false' ) )
            // Sce.g:1092:3: ( 'true' | 'false' )
            {
            // Sce.g:1092:3: ( 'true' | 'false' )
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
                    // Sce.g:1092:4: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // Sce.g:1092:13: 'false'
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
            // Sce.g:1094:12: ( ( '\"' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* '\"' ) )
            // Sce.g:1095:2: ( '\"' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* '\"' )
            {
            // Sce.g:1095:2: ( '\"' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* '\"' )
            // Sce.g:1095:3: '\"' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )* '\"'
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


            // Sce.g:1095:25: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | '_' )*
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
    // $ANTLR end "QUOTED_NAME"

    public void mTokens() throws RecognitionException {
        // Sce.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | LINEBREAK | WHITESPACE | SIGNED_INTEGER | BOOLEAN | QUOTED_NAME )
        int alt6=12;
        switch ( input.LA(1) ) {
        case ',':
            {
            alt6=1;
            }
            break;
        case ';':
            {
            alt6=2;
            }
            break;
        case '=':
            {
            alt6=3;
            }
            break;
        case 'a':
            {
            alt6=4;
            }
            break;
        case 'b':
            {
            int LA6_5 = input.LA(2);

            if ( (LA6_5=='e') ) {
                int LA6_13 = input.LA(3);

                if ( (LA6_13=='g') ) {
                    int LA6_15 = input.LA(4);

                    if ( (LA6_15=='i') ) {
                        int LA6_16 = input.LA(5);

                        if ( (LA6_16=='n') ) {
                            int LA6_17 = input.LA(6);

                            if ( (LA6_17=='_') ) {
                                alt6=6;
                            }
                            else {
                                alt6=5;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 16, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 15, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 13, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 5, input);

                throw nvae;

            }
            }
            break;
        case 's':
            {
            alt6=7;
            }
            break;
        case '\r':
            {
            alt6=8;
            }
            break;
        case '\n':
            {
            alt6=8;
            }
            break;
        case '\t':
        case '\u000B':
        case '\f':
        case ' ':
        case '\u00A0':
        case '\u2000':
        case '\u2001':
        case '\u2002':
        case '\u2003':
        case '\u2004':
        case '\u2005':
        case '\u2006':
        case '\u2007':
        case '\u2008':
        case '\u2009':
        case '\u200A':
        case '\u200B':
        case '\u200C':
        case '\u200D':
        case '\u200E':
        case '\u200F':
        case '\u2028':
        case '\u2029':
        case '\u3000':
        case '\uFEFF':
            {
            alt6=9;
            }
            break;
        case '+':
        case '-':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt6=10;
            }
            break;
        case 'f':
        case 't':
            {
            alt6=11;
            }
            break;
        case '\"':
            {
            alt6=12;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;

        }

        switch (alt6) {
            case 1 :
                // Sce.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // Sce.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // Sce.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // Sce.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // Sce.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // Sce.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // Sce.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // Sce.g:1:51: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 9 :
                // Sce.g:1:61: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 10 :
                // Sce.g:1:72: SIGNED_INTEGER
                {
                mSIGNED_INTEGER(); 


                }
                break;
            case 11 :
                // Sce.g:1:87: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 12 :
                // Sce.g:1:95: QUOTED_NAME
                {
                mQUOTED_NAME(); 


                }
                break;

        }

    }


 

}