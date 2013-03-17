// $ANTLR 3.4 CSharp4Lexer.g 2013-03-17 20:28:18

package lang.csharp;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.regex.Pattern;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CSharp4PreProcessor_CSharp4Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int AMP=5;
    public static final int AS=6;
    public static final int ASSIGNMENT=7;
    public static final int Asterisks=8;
    public static final int Available_identifier=9;
    public static final int BACK_SLASH=10;
    public static final int BANG=11;
    public static final int BASE=12;
    public static final int BITWISE_OR=13;
    public static final int BOOL=14;
    public static final int BREAK=15;
    public static final int BYTE=16;
    public static final int CARET=17;
    public static final int CASE=18;
    public static final int CATCH=19;
    public static final int CHAR=20;
    public static final int CHARACTER_LITERAL=21;
    public static final int CHECKED=22;
    public static final int CLASS=23;
    public static final int CLOSE_BRACE=24;
    public static final int CLOSE_BRACKET=25;
    public static final int CLOSE_PARENS=26;
    public static final int COLON=27;
    public static final int COMMA=28;
    public static final int CONST=29;
    public static final int CONTINUE=30;
    public static final int Character=31;
    public static final int Combining_character=32;
    public static final int Conditional_symbol=33;
    public static final int Connecting_character=34;
    public static final int DECIMAL=35;
    public static final int DECIMAL_DIGIT=36;
    public static final int DEFAULT=37;
    public static final int DELEGATE=38;
    public static final int DELIMITED_COMMENT=39;
    public static final int DELIMITED_DOC_COMMENT=40;
    public static final int DIV=41;
    public static final int DO=42;
    public static final int DOT=43;
    public static final int DOUBLE=44;
    public static final int DOUBLE_BACK_SLASH=45;
    public static final int DOUBLE_COLON=46;
    public static final int DOUBLE_QUOTE=47;
    public static final int Decimal_digit_character=48;
    public static final int Decimal_digits=49;
    public static final int Decimal_integer_literal=50;
    public static final int Delimited_comment_section=51;
    public static final int ELSE=52;
    public static final int ENUM=53;
    public static final int EVENT=54;
    public static final int EXPLICIT=55;
    public static final int EXTERN=56;
    public static final int Exponent_part=57;
    public static final int FALSE=58;
    public static final int FINALLY=59;
    public static final int FIXED=60;
    public static final int FLOAT=61;
    public static final int FOR=62;
    public static final int FOREACH=63;
    public static final int File_name=64;
    public static final int File_name_character=65;
    public static final int File_name_characters=66;
    public static final int Formatting_character=67;
    public static final int GOTO=68;
    public static final int GT=69;
    public static final int HEX_DIGIT=70;
    public static final int Hex_digits=71;
    public static final int Hexadecimal_escape_sequence=72;
    public static final int Hexadecimal_integer_literal=73;
    public static final int IDENTIFIER=74;
    public static final int IF=75;
    public static final int IMPLICIT=76;
    public static final int IN=77;
    public static final int INT=78;
    public static final int INTEGER_LITERAL=79;
    public static final int INTERFACE=80;
    public static final int INTERNAL=81;
    public static final int INTERR=82;
    public static final int IS=83;
    public static final int Identifier_or_keyword=84;
    public static final int Identifier_part_character=85;
    public static final int Identifier_start_character=86;
    public static final int Input_character=87;
    public static final int Input_characters=88;
    public static final int Integer_type_suffix=89;
    public static final int LOCK=90;
    public static final int LONG=91;
    public static final int LT=92;
    public static final int Letter_character=93;
    public static final int Line_indicator=94;
    public static final int LiteralAccess=95;
    public static final int MINUS=96;
    public static final int NAMESPACE=97;
    public static final int NEW=98;
    public static final int NEW_LINE=99;
    public static final int NEW_LINE_CHARACTER=100;
    public static final int NULL=101;
    public static final int Not_number_sign=102;
    public static final int Not_slash_or_asterisk=103;
    public static final int OBJECT=104;
    public static final int OPEN_BRACE=105;
    public static final int OPEN_BRACKET=106;
    public static final int OPEN_PARENS=107;
    public static final int OPERATOR=108;
    public static final int OP_ADD_ASSIGNMENT=109;
    public static final int OP_AND=110;
    public static final int OP_AND_ASSIGNMENT=111;
    public static final int OP_COALESCING=112;
    public static final int OP_DEC=113;
    public static final int OP_DIV_ASSIGNMENT=114;
    public static final int OP_EQ=115;
    public static final int OP_GE=116;
    public static final int OP_INC=117;
    public static final int OP_LE=118;
    public static final int OP_LEFT_SHIFT=119;
    public static final int OP_LEFT_SHIFT_ASSIGNMENT=120;
    public static final int OP_MOD_ASSIGNMENT=121;
    public static final int OP_MULT_ASSIGNMENT=122;
    public static final int OP_NE=123;
    public static final int OP_OR=124;
    public static final int OP_OR_ASSIGNMENT=125;
    public static final int OP_PTR=126;
    public static final int OP_SUB_ASSIGNMENT=127;
    public static final int OP_XOR_ASSIGNMENT=128;
    public static final int OUT=129;
    public static final int OVERRIDE=130;
    public static final int PARAMS=131;
    public static final int PERCENT=132;
    public static final int PLUS=133;
    public static final int PRIVATE=134;
    public static final int PROTECTED=135;
    public static final int PUBLIC=136;
    public static final int Pp_and_expression=137;
    public static final int Pp_conditional=138;
    public static final int Pp_declaration=139;
    public static final int Pp_diagnostic=140;
    public static final int Pp_directive=141;
    public static final int Pp_elif_section=142;
    public static final int Pp_else_section=143;
    public static final int Pp_end_region=144;
    public static final int Pp_endif=145;
    public static final int Pp_equality_expression=146;
    public static final int Pp_expression=147;
    public static final int Pp_if_section=148;
    public static final int Pp_line=149;
    public static final int Pp_message=150;
    public static final int Pp_new_line=151;
    public static final int Pp_or_expression=152;
    public static final int Pp_pragma=153;
    public static final int Pp_pragma_text=154;
    public static final int Pp_primary_expression=155;
    public static final int Pp_region=156;
    public static final int Pp_start_region=157;
    public static final int Pp_unary_expression=158;
    public static final int QUOTE=159;
    public static final int Quote_escape_sequence=160;
    public static final int READONLY=161;
    public static final int REAL_LITERAL=162;
    public static final int REF=163;
    public static final int RETURN=164;
    public static final int Real_type_suffix=165;
    public static final int Regular_string_literal=166;
    public static final int Regular_string_literal_character=167;
    public static final int SBYTE=168;
    public static final int SEALED=169;
    public static final int SEMICOLON=170;
    public static final int SHARP=171;
    public static final int SHORT=172;
    public static final int SINGLE_LINE_COMMENT=173;
    public static final int SINGLE_LINE_DOC_COMMENT=174;
    public static final int SIZEOF=175;
    public static final int STACKALLOC=176;
    public static final int STAR=177;
    public static final int STATIC=178;
    public static final int STRING=179;
    public static final int STRING_LITERAL=180;
    public static final int STRUCT=181;
    public static final int SWITCH=182;
    public static final int Sign=183;
    public static final int Simple_escape_sequence=184;
    public static final int Single_character=185;
    public static final int Single_regular_string_literal_character=186;
    public static final int Single_verbatim_string_literal_character=187;
    public static final int SkiPped_characters=188;
    public static final int SkiPped_section_part=189;
    public static final int THIS=190;
    public static final int THROW=191;
    public static final int TILDE=192;
    public static final int TRUE=193;
    public static final int TRY=194;
    public static final int TYPEOF=195;
    public static final int Tokens=196;
    public static final int UINT=197;
    public static final int ULONG=198;
    public static final int UNCHECKED=199;
    public static final int UNICODE_CLASS_CF=200;
    public static final int UNICODE_CLASS_LL=201;
    public static final int UNICODE_CLASS_LM=202;
    public static final int UNICODE_CLASS_LO=203;
    public static final int UNICODE_CLASS_LT=204;
    public static final int UNICODE_CLASS_LU=205;
    public static final int UNICODE_CLASS_MC=206;
    public static final int UNICODE_CLASS_MN=207;
    public static final int UNICODE_CLASS_ND=208;
    public static final int UNICODE_CLASS_NL=209;
    public static final int UNICODE_CLASS_PC=210;
    public static final int UNICODE_CLASS_ZS=211;
    public static final int UNSAFE=212;
    public static final int USHORT=213;
    public static final int USING=214;
    public static final int Unicode_escape_sequence=215;
    public static final int VIRTUAL=216;
    public static final int VOID=217;
    public static final int VOLATILE=218;
    public static final int Verbatim_string_literal=219;
    public static final int Verbatim_string_literal_character=220;
    public static final int WHILE=221;
    public static final int WHITESPACE=222;
    public static final int Whitespace_character=223;
    public static final int Whitespace_characters=224;

    // realizes emitation of multiple tokens within one single lexer rule
    protected Queue<Token> tokens = new LinkedList<Token>();

    protected void emit2(Token token, int type) {
      token.setType(type);
      emit(token);
    }

    @Override
    public void emit(Token token) {
       state.token = token;
       tokens.add(token);
    }

    @Override
    public Token nextToken() {
       super.nextToken();
       if (tokens.size() == 0) {
          return Token.EOF_TOKEN;
       }
       return tokens.remove();
    }

    //private Pattern pLu = Pattern.compile("\\p{Lu}");
    //
    //private boolean isUnicodeClass_Lu(String tokenText) {
    //  return pLu.matcher(tokenText).matches();
    //}

    private Pattern pLo = Pattern.compile("\\p{Lo}");

    private boolean isUnicodeClass_Lo(String tokenText) {
      return pLo.matcher(tokenText).matches();
    }



    // delegates
    // delegators
    public CSharp4PreProcessor gCSharp4PreProcessor;
    public CSharp4PreProcessor gParent;
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CSharp4PreProcessor_CSharp4Lexer() {} 
    public CSharp4PreProcessor_CSharp4Lexer(CharStream input, CSharp4PreProcessor gCSharp4PreProcessor) {
        this(input, new RecognizerSharedState(), gCSharp4PreProcessor);
    }
    public CSharp4PreProcessor_CSharp4Lexer(CharStream input, RecognizerSharedState state, CSharp4PreProcessor gCSharp4PreProcessor) {
        super(input,state);
        this.gCSharp4PreProcessor = gCSharp4PreProcessor;
        gParent = gCSharp4PreProcessor;
    }
    public String getGrammarFileName() { return "CSharp4Lexer.g"; }

    // $ANTLR start "SINGLE_LINE_DOC_COMMENT"
    public final void mSINGLE_LINE_DOC_COMMENT() throws RecognitionException {
        try {
            int _type = SINGLE_LINE_DOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:66:3: ( '///' ( Input_character )* )
            // CSharp4Lexer.g:66:5: '///' ( Input_character )*
            {
            match("///"); 



            // CSharp4Lexer.g:66:11: ( Input_character )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\u0084')||(LA1_0 >= '\u0086' && LA1_0 <= '\u2027')||(LA1_0 >= '\u202A' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // CSharp4Lexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u0084')||(input.LA(1) >= '\u0086' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop1;
                }
            } while (true);


            _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_LINE_DOC_COMMENT"

    // $ANTLR start "DELIMITED_DOC_COMMENT"
    public final void mDELIMITED_DOC_COMMENT() throws RecognitionException {
        try {
            int _type = DELIMITED_DOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:69:3: ( '/**' ( Delimited_comment_section )* Asterisks '/' )
            // CSharp4Lexer.g:69:5: '/**' ( Delimited_comment_section )* Asterisks '/'
            {
            match("/**"); 



            // CSharp4Lexer.g:69:11: ( Delimited_comment_section )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // CSharp4Lexer.g:69:11: Delimited_comment_section
            	    {
            	    mDelimited_comment_section(); 


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            mAsterisks(); 


            match('/'); 

            _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELIMITED_DOC_COMMENT"

    // $ANTLR start "NEW_LINE"
    public final void mNEW_LINE() throws RecognitionException {
        try {
            int _type = NEW_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:74:3: ( ( '\\u000D' | '\\u000A' | '\\u000D' '\\u000A' | '\\u0085' | '\\u2028' | '\\u2029' ) )
            // CSharp4Lexer.g:74:5: ( '\\u000D' | '\\u000A' | '\\u000D' '\\u000A' | '\\u0085' | '\\u2028' | '\\u2029' )
            {
            // CSharp4Lexer.g:74:5: ( '\\u000D' | '\\u000A' | '\\u000D' '\\u000A' | '\\u0085' | '\\u2028' | '\\u2029' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case '\r':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='\n') ) {
                    alt3=3;
                }
                else {
                    alt3=1;
                }
                }
                break;
            case '\n':
                {
                alt3=2;
                }
                break;
            case '\u0085':
                {
                alt3=4;
                }
                break;
            case '\u2028':
                {
                alt3=5;
                }
                break;
            case '\u2029':
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // CSharp4Lexer.g:74:6: '\\u000D'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:75:5: '\\u000A'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // CSharp4Lexer.g:76:5: '\\u000D' '\\u000A'
                    {
                    match('\r'); 

                    match('\n'); 

                    }
                    break;
                case 4 :
                    // CSharp4Lexer.g:77:5: '\\u0085'
                    {
                    match('\u0085'); 

                    }
                    break;
                case 5 :
                    // CSharp4Lexer.g:78:5: '\\u2028'
                    {
                    match('\u2028'); 

                    }
                    break;
                case 6 :
                    // CSharp4Lexer.g:79:5: '\\u2029'
                    {
                    match('\u2029'); 

                    }
                    break;

            }


            _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW_LINE"

    // $ANTLR start "SINGLE_LINE_COMMENT"
    public final void mSINGLE_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = SINGLE_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:85:3: ( '//' ( Input_character )* )
            // CSharp4Lexer.g:85:5: '//' ( Input_character )*
            {
            match("//"); 



            // CSharp4Lexer.g:85:10: ( Input_character )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\u0084')||(LA4_0 >= '\u0086' && LA4_0 <= '\u2027')||(LA4_0 >= '\u202A' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // CSharp4Lexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u0084')||(input.LA(1) >= '\u0086' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop4;
                }
            } while (true);


            _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_LINE_COMMENT"

    // $ANTLR start "Input_characters"
    public final void mInput_characters() throws RecognitionException {
        try {
            // CSharp4Lexer.g:88:3: ( ( Input_character )+ )
            // CSharp4Lexer.g:88:5: ( Input_character )+
            {
            // CSharp4Lexer.g:88:5: ( Input_character )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\u0084')||(LA5_0 >= '\u0086' && LA5_0 <= '\u2027')||(LA5_0 >= '\u202A' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // CSharp4Lexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u0084')||(input.LA(1) >= '\u0086' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Input_characters"

    // $ANTLR start "Input_character"
    public final void mInput_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:91:3: (~ NEW_LINE_CHARACTER )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u0084')||(input.LA(1) >= '\u0086' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Input_character"

    // $ANTLR start "NEW_LINE_CHARACTER"
    public final void mNEW_LINE_CHARACTER() throws RecognitionException {
        try {
            // CSharp4Lexer.g:94:3: ( '\\u000D' | '\\u000A' | '\\u0085' | '\\u2028' | '\\u2029' )
            // CSharp4Lexer.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r'||input.LA(1)=='\u0085'||(input.LA(1) >= '\u2028' && input.LA(1) <= '\u2029') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW_LINE_CHARACTER"

    // $ANTLR start "DELIMITED_COMMENT"
    public final void mDELIMITED_COMMENT() throws RecognitionException {
        try {
            int _type = DELIMITED_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:102:3: ( '/*' ( Delimited_comment_section )* Asterisks '/' )
            // CSharp4Lexer.g:102:5: '/*' ( Delimited_comment_section )* Asterisks '/'
            {
            match("/*"); 



            // CSharp4Lexer.g:102:10: ( Delimited_comment_section )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // CSharp4Lexer.g:102:10: Delimited_comment_section
            	    {
            	    mDelimited_comment_section(); 


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            mAsterisks(); 


            match('/'); 

            _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELIMITED_COMMENT"

    // $ANTLR start "Delimited_comment_section"
    public final void mDelimited_comment_section() throws RecognitionException {
        try {
            // CSharp4Lexer.g:105:3: ( '/' | ( Asterisks )? Not_slash_or_asterisk )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                alt8=1;
            }
            else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '.')||(LA8_0 >= '0' && LA8_0 <= '\uFFFF')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // CSharp4Lexer.g:105:5: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:106:5: ( Asterisks )? Not_slash_or_asterisk
                    {
                    // CSharp4Lexer.g:106:5: ( Asterisks )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='*') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // CSharp4Lexer.g:106:5: Asterisks
                            {
                            mAsterisks(); 


                            }
                            break;

                    }


                    mNot_slash_or_asterisk(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Delimited_comment_section"

    // $ANTLR start "Asterisks"
    public final void mAsterisks() throws RecognitionException {
        try {
            // CSharp4Lexer.g:109:3: ( ( '*' )+ )
            // CSharp4Lexer.g:109:5: ( '*' )+
            {
            // CSharp4Lexer.g:109:5: ( '*' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // CSharp4Lexer.g:109:5: '*'
            	    {
            	    match('*'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Asterisks"

    // $ANTLR start "Not_slash_or_asterisk"
    public final void mNot_slash_or_asterisk() throws RecognitionException {
        try {
            // CSharp4Lexer.g:113:3: (~ ( '/' | '*' ) )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ')')||(input.LA(1) >= '+' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Not_slash_or_asterisk"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:118:3: ( Whitespace_characters )
            // CSharp4Lexer.g:118:5: Whitespace_characters
            {
            mWhitespace_characters(); 


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "Whitespace_characters"
    public final void mWhitespace_characters() throws RecognitionException {
        try {
            // CSharp4Lexer.g:122:3: ( ( Whitespace_character )+ )
            // CSharp4Lexer.g:122:5: ( Whitespace_character )+
            {
            // CSharp4Lexer.g:122:5: ( Whitespace_character )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||LA10_0==' '||LA10_0=='\u00A0'||LA10_0=='\u1680'||LA10_0=='\u180E'||(LA10_0 >= '\u2000' && LA10_0 <= '\u2006')||(LA10_0 >= '\u2008' && LA10_0 <= '\u200A')||LA10_0=='\u202F'||LA10_0=='\u205F'||LA10_0=='\u3000') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // CSharp4Lexer.g:
            	    {
            	    if ( input.LA(1)=='\t'||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||input.LA(1)==' '||input.LA(1)=='\u00A0'||input.LA(1)=='\u1680'||input.LA(1)=='\u180E'||(input.LA(1) >= '\u2000' && input.LA(1) <= '\u2006')||(input.LA(1) >= '\u2008' && input.LA(1) <= '\u200A')||input.LA(1)=='\u202F'||input.LA(1)=='\u205F'||input.LA(1)=='\u3000' ) {
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Whitespace_characters"

    // $ANTLR start "Whitespace_character"
    public final void mWhitespace_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:126:3: ( UNICODE_CLASS_ZS | '\\u0009' | '\\u000B' | '\\u000C' )
            // CSharp4Lexer.g:
            {
            if ( input.LA(1)=='\t'||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||input.LA(1)==' '||input.LA(1)=='\u00A0'||input.LA(1)=='\u1680'||input.LA(1)=='\u180E'||(input.LA(1) >= '\u2000' && input.LA(1) <= '\u2006')||(input.LA(1) >= '\u2008' && input.LA(1) <= '\u200A')||input.LA(1)=='\u202F'||input.LA(1)=='\u205F'||input.LA(1)=='\u3000' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Whitespace_character"

    // $ANTLR start "Unicode_escape_sequence"
    public final void mUnicode_escape_sequence() throws RecognitionException {
        try {
            // CSharp4Lexer.g:134:3: ( '\\\\u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '\\\\U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\\') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='u') ) {
                    alt11=1;
                }
                else if ( (LA11_1=='U') ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // CSharp4Lexer.g:134:5: '\\\\u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match("\\u"); 



                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:135:5: '\\\\U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match("\\U"); 



                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Unicode_escape_sequence"

    // $ANTLR start "ABSTRACT"
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:139:10: ( 'abstract' )
            // CSharp4Lexer.g:139:12: 'abstract'
            {
            match("abstract"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABSTRACT"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:140:4: ( 'as' )
            // CSharp4Lexer.g:140:6: 'as'
            {
            match("as"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "BASE"
    public final void mBASE() throws RecognitionException {
        try {
            int _type = BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:141:6: ( 'base' )
            // CSharp4Lexer.g:141:8: 'base'
            {
            match("base"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BASE"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:142:6: ( 'bool' )
            // CSharp4Lexer.g:142:8: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:143:7: ( 'break' )
            // CSharp4Lexer.g:143:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "BYTE"
    public final void mBYTE() throws RecognitionException {
        try {
            int _type = BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:144:6: ( 'byte' )
            // CSharp4Lexer.g:144:8: 'byte'
            {
            match("byte"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BYTE"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:145:6: ( 'case' )
            // CSharp4Lexer.g:145:8: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CATCH"
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:146:7: ( 'catch' )
            // CSharp4Lexer.g:146:9: 'catch'
            {
            match("catch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CATCH"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:147:6: ( 'char' )
            // CSharp4Lexer.g:147:8: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "CHECKED"
    public final void mCHECKED() throws RecognitionException {
        try {
            int _type = CHECKED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:148:9: ( 'checked' )
            // CSharp4Lexer.g:148:11: 'checked'
            {
            match("checked"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHECKED"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:149:7: ( 'class' )
            // CSharp4Lexer.g:149:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:150:7: ( 'const' )
            // CSharp4Lexer.g:150:9: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:151:10: ( 'continue' )
            // CSharp4Lexer.g:151:12: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:152:9: ( 'decimal' )
            // CSharp4Lexer.g:152:11: 'decimal'
            {
            match("decimal"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:153:9: ( 'default' )
            // CSharp4Lexer.g:153:11: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DELEGATE"
    public final void mDELEGATE() throws RecognitionException {
        try {
            int _type = DELEGATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:154:10: ( 'delegate' )
            // CSharp4Lexer.g:154:12: 'delegate'
            {
            match("delegate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELEGATE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:155:4: ( 'do' )
            // CSharp4Lexer.g:155:6: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:156:8: ( 'double' )
            // CSharp4Lexer.g:156:10: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:157:6: ( 'else' )
            // CSharp4Lexer.g:157:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENUM"
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:158:6: ( 'enum' )
            // CSharp4Lexer.g:158:8: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENUM"

    // $ANTLR start "EVENT"
    public final void mEVENT() throws RecognitionException {
        try {
            int _type = EVENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:159:7: ( 'event' )
            // CSharp4Lexer.g:159:9: 'event'
            {
            match("event"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EVENT"

    // $ANTLR start "EXPLICIT"
    public final void mEXPLICIT() throws RecognitionException {
        try {
            int _type = EXPLICIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:160:10: ( 'explicit' )
            // CSharp4Lexer.g:160:12: 'explicit'
            {
            match("explicit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPLICIT"

    // $ANTLR start "EXTERN"
    public final void mEXTERN() throws RecognitionException {
        try {
            int _type = EXTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:161:8: ( 'extern' )
            // CSharp4Lexer.g:161:10: 'extern'
            {
            match("extern"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTERN"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:162:7: ( 'false' )
            // CSharp4Lexer.g:162:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FINALLY"
    public final void mFINALLY() throws RecognitionException {
        try {
            int _type = FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:163:9: ( 'finally' )
            // CSharp4Lexer.g:163:11: 'finally'
            {
            match("finally"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FINALLY"

    // $ANTLR start "FIXED"
    public final void mFIXED() throws RecognitionException {
        try {
            int _type = FIXED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:164:7: ( 'fixed' )
            // CSharp4Lexer.g:164:9: 'fixed'
            {
            match("fixed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FIXED"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:165:7: ( 'float' )
            // CSharp4Lexer.g:165:9: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:166:5: ( 'for' )
            // CSharp4Lexer.g:166:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FOREACH"
    public final void mFOREACH() throws RecognitionException {
        try {
            int _type = FOREACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:167:9: ( 'foreach' )
            // CSharp4Lexer.g:167:11: 'foreach'
            {
            match("foreach"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOREACH"

    // $ANTLR start "GOTO"
    public final void mGOTO() throws RecognitionException {
        try {
            int _type = GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:168:6: ( 'goto' )
            // CSharp4Lexer.g:168:8: 'goto'
            {
            match("goto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GOTO"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:169:4: ( 'if' )
            // CSharp4Lexer.g:169:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPLICIT"
    public final void mIMPLICIT() throws RecognitionException {
        try {
            int _type = IMPLICIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:170:10: ( 'implicit' )
            // CSharp4Lexer.g:170:12: 'implicit'
            {
            match("implicit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPLICIT"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:171:4: ( 'in' )
            // CSharp4Lexer.g:171:6: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:172:5: ( 'int' )
            // CSharp4Lexer.g:172:7: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "INTERFACE"
    public final void mINTERFACE() throws RecognitionException {
        try {
            int _type = INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:173:11: ( 'interface' )
            // CSharp4Lexer.g:173:13: 'interface'
            {
            match("interface"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTERFACE"

    // $ANTLR start "INTERNAL"
    public final void mINTERNAL() throws RecognitionException {
        try {
            int _type = INTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:174:10: ( 'internal' )
            // CSharp4Lexer.g:174:12: 'internal'
            {
            match("internal"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTERNAL"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:175:4: ( 'is' )
            // CSharp4Lexer.g:175:6: 'is'
            {
            match("is"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "LOCK"
    public final void mLOCK() throws RecognitionException {
        try {
            int _type = LOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:176:6: ( 'lock' )
            // CSharp4Lexer.g:176:8: 'lock'
            {
            match("lock"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOCK"

    // $ANTLR start "LONG"
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:177:6: ( 'long' )
            // CSharp4Lexer.g:177:8: 'long'
            {
            match("long"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LONG"

    // $ANTLR start "NAMESPACE"
    public final void mNAMESPACE() throws RecognitionException {
        try {
            int _type = NAMESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:178:11: ( 'namespace' )
            // CSharp4Lexer.g:178:13: 'namespace'
            {
            match("namespace"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAMESPACE"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:179:5: ( 'new' )
            // CSharp4Lexer.g:179:7: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:180:6: ( 'null' )
            // CSharp4Lexer.g:180:8: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "OBJECT"
    public final void mOBJECT() throws RecognitionException {
        try {
            int _type = OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:181:8: ( 'object' )
            // CSharp4Lexer.g:181:10: 'object'
            {
            match("object"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OBJECT"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:182:10: ( 'operator' )
            // CSharp4Lexer.g:182:12: 'operator'
            {
            match("operator"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPERATOR"

    // $ANTLR start "OUT"
    public final void mOUT() throws RecognitionException {
        try {
            int _type = OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:183:5: ( 'out' )
            // CSharp4Lexer.g:183:7: 'out'
            {
            match("out"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OUT"

    // $ANTLR start "OVERRIDE"
    public final void mOVERRIDE() throws RecognitionException {
        try {
            int _type = OVERRIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:184:10: ( 'override' )
            // CSharp4Lexer.g:184:12: 'override'
            {
            match("override"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OVERRIDE"

    // $ANTLR start "PARAMS"
    public final void mPARAMS() throws RecognitionException {
        try {
            int _type = PARAMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:185:8: ( 'params' )
            // CSharp4Lexer.g:185:10: 'params'
            {
            match("params"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARAMS"

    // $ANTLR start "PRIVATE"
    public final void mPRIVATE() throws RecognitionException {
        try {
            int _type = PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:186:9: ( 'private' )
            // CSharp4Lexer.g:186:11: 'private'
            {
            match("private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRIVATE"

    // $ANTLR start "PROTECTED"
    public final void mPROTECTED() throws RecognitionException {
        try {
            int _type = PROTECTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:187:11: ( 'protected' )
            // CSharp4Lexer.g:187:13: 'protected'
            {
            match("protected"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROTECTED"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:188:8: ( 'public' )
            // CSharp4Lexer.g:188:10: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "READONLY"
    public final void mREADONLY() throws RecognitionException {
        try {
            int _type = READONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:189:10: ( 'readonly' )
            // CSharp4Lexer.g:189:12: 'readonly'
            {
            match("readonly"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READONLY"

    // $ANTLR start "REF"
    public final void mREF() throws RecognitionException {
        try {
            int _type = REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:190:5: ( 'ref' )
            // CSharp4Lexer.g:190:7: 'ref'
            {
            match("ref"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REF"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:191:8: ( 'return' )
            // CSharp4Lexer.g:191:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SBYTE"
    public final void mSBYTE() throws RecognitionException {
        try {
            int _type = SBYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:192:7: ( 'sbyte' )
            // CSharp4Lexer.g:192:9: 'sbyte'
            {
            match("sbyte"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SBYTE"

    // $ANTLR start "SEALED"
    public final void mSEALED() throws RecognitionException {
        try {
            int _type = SEALED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:193:8: ( 'sealed' )
            // CSharp4Lexer.g:193:10: 'sealed'
            {
            match("sealed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEALED"

    // $ANTLR start "SHORT"
    public final void mSHORT() throws RecognitionException {
        try {
            int _type = SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:194:7: ( 'short' )
            // CSharp4Lexer.g:194:9: 'short'
            {
            match("short"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHORT"

    // $ANTLR start "SIZEOF"
    public final void mSIZEOF() throws RecognitionException {
        try {
            int _type = SIZEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:195:8: ( 'sizeof' )
            // CSharp4Lexer.g:195:10: 'sizeof'
            {
            match("sizeof"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIZEOF"

    // $ANTLR start "STACKALLOC"
    public final void mSTACKALLOC() throws RecognitionException {
        try {
            int _type = STACKALLOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:196:12: ( 'stackalloc' )
            // CSharp4Lexer.g:196:14: 'stackalloc'
            {
            match("stackalloc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STACKALLOC"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:197:8: ( 'static' )
            // CSharp4Lexer.g:197:10: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:198:8: ( 'string' )
            // CSharp4Lexer.g:198:10: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "STRUCT"
    public final void mSTRUCT() throws RecognitionException {
        try {
            int _type = STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:199:8: ( 'struct' )
            // CSharp4Lexer.g:199:10: 'struct'
            {
            match("struct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRUCT"

    // $ANTLR start "SWITCH"
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:200:8: ( 'switch' )
            // CSharp4Lexer.g:200:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SWITCH"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:201:6: ( 'this' )
            // CSharp4Lexer.g:201:8: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "THROW"
    public final void mTHROW() throws RecognitionException {
        try {
            int _type = THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:202:7: ( 'throw' )
            // CSharp4Lexer.g:202:9: 'throw'
            {
            match("throw"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THROW"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:203:6: ( 'true' )
            // CSharp4Lexer.g:203:8: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:204:5: ( 'try' )
            // CSharp4Lexer.g:204:7: 'try'
            {
            match("try"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "TYPEOF"
    public final void mTYPEOF() throws RecognitionException {
        try {
            int _type = TYPEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:205:8: ( 'typeof' )
            // CSharp4Lexer.g:205:10: 'typeof'
            {
            match("typeof"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPEOF"

    // $ANTLR start "UINT"
    public final void mUINT() throws RecognitionException {
        try {
            int _type = UINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:206:6: ( 'uint' )
            // CSharp4Lexer.g:206:8: 'uint'
            {
            match("uint"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UINT"

    // $ANTLR start "ULONG"
    public final void mULONG() throws RecognitionException {
        try {
            int _type = ULONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:207:7: ( 'ulong' )
            // CSharp4Lexer.g:207:9: 'ulong'
            {
            match("ulong"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ULONG"

    // $ANTLR start "UNCHECKED"
    public final void mUNCHECKED() throws RecognitionException {
        try {
            int _type = UNCHECKED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:208:11: ( 'unchecked' )
            // CSharp4Lexer.g:208:13: 'unchecked'
            {
            match("unchecked"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNCHECKED"

    // $ANTLR start "UNSAFE"
    public final void mUNSAFE() throws RecognitionException {
        try {
            int _type = UNSAFE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:209:8: ( 'unsafe' )
            // CSharp4Lexer.g:209:10: 'unsafe'
            {
            match("unsafe"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNSAFE"

    // $ANTLR start "USHORT"
    public final void mUSHORT() throws RecognitionException {
        try {
            int _type = USHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:210:8: ( 'ushort' )
            // CSharp4Lexer.g:210:10: 'ushort'
            {
            match("ushort"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USHORT"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:211:7: ( 'using' )
            // CSharp4Lexer.g:211:9: 'using'
            {
            match("using"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "VIRTUAL"
    public final void mVIRTUAL() throws RecognitionException {
        try {
            int _type = VIRTUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:212:9: ( 'virtual' )
            // CSharp4Lexer.g:212:11: 'virtual'
            {
            match("virtual"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VIRTUAL"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:213:6: ( 'void' )
            // CSharp4Lexer.g:213:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "VOLATILE"
    public final void mVOLATILE() throws RecognitionException {
        try {
            int _type = VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:214:10: ( 'volatile' )
            // CSharp4Lexer.g:214:12: 'volatile'
            {
            match("volatile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOLATILE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:215:7: ( 'while' )
            // CSharp4Lexer.g:215:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:220:3: ( Available_identifier | '@' Identifier_or_keyword )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='_'||(LA12_0 >= 'a' && LA12_0 <= 'z')||(LA12_0 >= '\u00C0' && LA12_0 <= '\u00DE')||LA12_0=='\u01BB'||(LA12_0 >= '\u01C0' && LA12_0 <= '\u01C3')||LA12_0=='\u01C5'||LA12_0=='\u01C8'||LA12_0=='\u01CB'||LA12_0=='\u01F2'||LA12_0=='\u0294'||(LA12_0 >= '\u02B0' && LA12_0 <= '\u02EE')||(LA12_0 >= '\u16EE' && LA12_0 <= '\u16F0')||(LA12_0 >= '\u2160' && LA12_0 <= '\u216F')) ) {
                alt12=1;
            }
            else if ( (LA12_0=='@') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // CSharp4Lexer.g:220:5: Available_identifier
                    {
                    mAvailable_identifier(); 


                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:221:5: '@' Identifier_or_keyword
                    {
                    match('@'); 

                    mIdentifier_or_keyword(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "Available_identifier"
    public final void mAvailable_identifier() throws RecognitionException {
        try {
            // CSharp4Lexer.g:226:3: ( Identifier_or_keyword )
            // CSharp4Lexer.g:226:5: Identifier_or_keyword
            {
            mIdentifier_or_keyword(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Available_identifier"

    // $ANTLR start "Identifier_or_keyword"
    public final void mIdentifier_or_keyword() throws RecognitionException {
        try {
            // CSharp4Lexer.g:229:3: ( Identifier_start_character ( Identifier_part_character )* )
            // CSharp4Lexer.g:229:5: Identifier_start_character ( Identifier_part_character )*
            {
            mIdentifier_start_character(); 


            // CSharp4Lexer.g:229:32: ( Identifier_part_character )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'Z')||LA13_0=='_'||(LA13_0 >= 'a' && LA13_0 <= 'z')||LA13_0=='\u00AD'||(LA13_0 >= '\u00C0' && LA13_0 <= '\u00DE')||LA13_0=='\u01BB'||(LA13_0 >= '\u01C0' && LA13_0 <= '\u01C3')||LA13_0=='\u01C5'||LA13_0=='\u01C8'||LA13_0=='\u01CB'||LA13_0=='\u01F2'||LA13_0=='\u0294'||(LA13_0 >= '\u02B0' && LA13_0 <= '\u02EE')||(LA13_0 >= '\u0300' && LA13_0 <= '\u0310')||(LA13_0 >= '\u0600' && LA13_0 <= '\u0603')||LA13_0=='\u06DD'||LA13_0=='\u0903'||(LA13_0 >= '\u093E' && LA13_0 <= '\u0940')||(LA13_0 >= '\u0949' && LA13_0 <= '\u094C')||(LA13_0 >= '\u16EE' && LA13_0 <= '\u16F0')||(LA13_0 >= '\u203F' && LA13_0 <= '\u2040')||LA13_0=='\u2054'||(LA13_0 >= '\u2160' && LA13_0 <= '\u216F')||(LA13_0 >= '\uFE33' && LA13_0 <= '\uFE34')||(LA13_0 >= '\uFE4D' && LA13_0 <= '\uFE4F')||LA13_0=='\uFF3F') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // CSharp4Lexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00AD'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00DE')||input.LA(1)=='\u01BB'||(input.LA(1) >= '\u01C0' && input.LA(1) <= '\u01C3')||input.LA(1)=='\u01C5'||input.LA(1)=='\u01C8'||input.LA(1)=='\u01CB'||input.LA(1)=='\u01F2'||input.LA(1)=='\u0294'||(input.LA(1) >= '\u02B0' && input.LA(1) <= '\u02EE')||(input.LA(1) >= '\u0300' && input.LA(1) <= '\u0310')||(input.LA(1) >= '\u0600' && input.LA(1) <= '\u0603')||input.LA(1)=='\u06DD'||input.LA(1)=='\u0903'||(input.LA(1) >= '\u093E' && input.LA(1) <= '\u0940')||(input.LA(1) >= '\u0949' && input.LA(1) <= '\u094C')||(input.LA(1) >= '\u16EE' && input.LA(1) <= '\u16F0')||(input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040')||input.LA(1)=='\u2054'||(input.LA(1) >= '\u2160' && input.LA(1) <= '\u216F')||(input.LA(1) >= '\uFE33' && input.LA(1) <= '\uFE34')||(input.LA(1) >= '\uFE4D' && input.LA(1) <= '\uFE4F')||input.LA(1)=='\uFF3F' ) {
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
            	    break loop13;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identifier_or_keyword"

    // $ANTLR start "Identifier_start_character"
    public final void mIdentifier_start_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:232:3: ( Letter_character | '_' )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00DE')||input.LA(1)=='\u01BB'||(input.LA(1) >= '\u01C0' && input.LA(1) <= '\u01C3')||input.LA(1)=='\u01C5'||input.LA(1)=='\u01C8'||input.LA(1)=='\u01CB'||input.LA(1)=='\u01F2'||input.LA(1)=='\u0294'||(input.LA(1) >= '\u02B0' && input.LA(1) <= '\u02EE')||(input.LA(1) >= '\u16EE' && input.LA(1) <= '\u16F0')||(input.LA(1) >= '\u2160' && input.LA(1) <= '\u216F') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identifier_start_character"

    // $ANTLR start "Identifier_part_character"
    public final void mIdentifier_part_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:236:3: ( Letter_character | Decimal_digit_character | Connecting_character | Combining_character | Formatting_character )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00AD'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00DE')||input.LA(1)=='\u01BB'||(input.LA(1) >= '\u01C0' && input.LA(1) <= '\u01C3')||input.LA(1)=='\u01C5'||input.LA(1)=='\u01C8'||input.LA(1)=='\u01CB'||input.LA(1)=='\u01F2'||input.LA(1)=='\u0294'||(input.LA(1) >= '\u02B0' && input.LA(1) <= '\u02EE')||(input.LA(1) >= '\u0300' && input.LA(1) <= '\u0310')||(input.LA(1) >= '\u0600' && input.LA(1) <= '\u0603')||input.LA(1)=='\u06DD'||input.LA(1)=='\u0903'||(input.LA(1) >= '\u093E' && input.LA(1) <= '\u0940')||(input.LA(1) >= '\u0949' && input.LA(1) <= '\u094C')||(input.LA(1) >= '\u16EE' && input.LA(1) <= '\u16F0')||(input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040')||input.LA(1)=='\u2054'||(input.LA(1) >= '\u2160' && input.LA(1) <= '\u216F')||(input.LA(1) >= '\uFE33' && input.LA(1) <= '\uFE34')||(input.LA(1) >= '\uFE4D' && input.LA(1) <= '\uFE4F')||input.LA(1)=='\uFF3F' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identifier_part_character"

    // $ANTLR start "Letter_character"
    public final void mLetter_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:245:3: ( UNICODE_CLASS_LU | UNICODE_CLASS_LL | UNICODE_CLASS_LT | UNICODE_CLASS_LM | UNICODE_CLASS_LO | UNICODE_CLASS_NL )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00DE')||input.LA(1)=='\u01BB'||(input.LA(1) >= '\u01C0' && input.LA(1) <= '\u01C3')||input.LA(1)=='\u01C5'||input.LA(1)=='\u01C8'||input.LA(1)=='\u01CB'||input.LA(1)=='\u01F2'||input.LA(1)=='\u0294'||(input.LA(1) >= '\u02B0' && input.LA(1) <= '\u02EE')||(input.LA(1) >= '\u16EE' && input.LA(1) <= '\u16F0')||(input.LA(1) >= '\u2160' && input.LA(1) <= '\u216F') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter_character"

    // $ANTLR start "Combining_character"
    public final void mCombining_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:256:3: ( UNICODE_CLASS_MN | UNICODE_CLASS_MC )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= '\u0300' && input.LA(1) <= '\u0310')||input.LA(1)=='\u0903'||(input.LA(1) >= '\u093E' && input.LA(1) <= '\u0940')||(input.LA(1) >= '\u0949' && input.LA(1) <= '\u094C') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Combining_character"

    // $ANTLR start "Decimal_digit_character"
    public final void mDecimal_digit_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:263:3: ( UNICODE_CLASS_ND )
            // CSharp4Lexer.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Decimal_digit_character"

    // $ANTLR start "Connecting_character"
    public final void mConnecting_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:269:3: ( UNICODE_CLASS_PC )
            // CSharp4Lexer.g:
            {
            if ( input.LA(1)=='_'||(input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040')||input.LA(1)=='\u2054'||(input.LA(1) >= '\uFE33' && input.LA(1) <= '\uFE34')||(input.LA(1) >= '\uFE4D' && input.LA(1) <= '\uFE4F')||input.LA(1)=='\uFF3F' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Connecting_character"

    // $ANTLR start "Formatting_character"
    public final void mFormatting_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:275:3: ( UNICODE_CLASS_CF )
            // CSharp4Lexer.g:
            {
            if ( input.LA(1)=='\u00AD'||(input.LA(1) >= '\u0600' && input.LA(1) <= '\u0603')||input.LA(1)=='\u06DD' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Formatting_character"

    // $ANTLR start "INTEGER_LITERAL"
    public final void mINTEGER_LITERAL() throws RecognitionException {
        try {
            int _type = INTEGER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:282:3: ( Decimal_integer_literal | Hexadecimal_integer_literal )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='0') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='X'||LA14_1=='x') ) {
                    alt14=2;
                }
                else {
                    alt14=1;
                }
            }
            else if ( ((LA14_0 >= '1' && LA14_0 <= '9')) ) {
                alt14=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // CSharp4Lexer.g:282:5: Decimal_integer_literal
                    {
                    mDecimal_integer_literal(); 


                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:283:5: Hexadecimal_integer_literal
                    {
                    mHexadecimal_integer_literal(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER_LITERAL"

    // $ANTLR start "Decimal_integer_literal"
    public final void mDecimal_integer_literal() throws RecognitionException {
        try {
            // CSharp4Lexer.g:286:3: ( Decimal_digits ( Integer_type_suffix )? )
            // CSharp4Lexer.g:286:5: Decimal_digits ( Integer_type_suffix )?
            {
            mDecimal_digits(); 


            // CSharp4Lexer.g:286:20: ( Integer_type_suffix )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='L'||LA15_0=='U'||LA15_0=='l'||LA15_0=='u') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // CSharp4Lexer.g:286:20: Integer_type_suffix
                    {
                    mInteger_type_suffix(); 


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Decimal_integer_literal"

    // $ANTLR start "Decimal_digits"
    public final void mDecimal_digits() throws RecognitionException {
        try {
            // CSharp4Lexer.g:289:3: ( ( DECIMAL_DIGIT )+ )
            // CSharp4Lexer.g:289:5: ( DECIMAL_DIGIT )+
            {
            // CSharp4Lexer.g:289:5: ( DECIMAL_DIGIT )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // CSharp4Lexer.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Decimal_digits"

    // $ANTLR start "DECIMAL_DIGIT"
    public final void mDECIMAL_DIGIT() throws RecognitionException {
        try {
            // CSharp4Lexer.g:292:3: ( '0' .. '9' )
            // CSharp4Lexer.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL_DIGIT"

    // $ANTLR start "Integer_type_suffix"
    public final void mInteger_type_suffix() throws RecognitionException {
        try {
            // CSharp4Lexer.g:295:3: ( 'U' | 'u' | 'L' | 'l' | 'UL' | 'Ul' | 'uL' | 'ul' | 'LU' | 'Lu' | 'lU' | 'lu' )
            int alt17=12;
            switch ( input.LA(1) ) {
            case 'U':
                {
                switch ( input.LA(2) ) {
                case 'L':
                    {
                    alt17=5;
                    }
                    break;
                case 'l':
                    {
                    alt17=6;
                    }
                    break;
                default:
                    alt17=1;
                }

                }
                break;
            case 'u':
                {
                switch ( input.LA(2) ) {
                case 'L':
                    {
                    alt17=7;
                    }
                    break;
                case 'l':
                    {
                    alt17=8;
                    }
                    break;
                default:
                    alt17=2;
                }

                }
                break;
            case 'L':
                {
                switch ( input.LA(2) ) {
                case 'U':
                    {
                    alt17=9;
                    }
                    break;
                case 'u':
                    {
                    alt17=10;
                    }
                    break;
                default:
                    alt17=3;
                }

                }
                break;
            case 'l':
                {
                switch ( input.LA(2) ) {
                case 'U':
                    {
                    alt17=11;
                    }
                    break;
                case 'u':
                    {
                    alt17=12;
                    }
                    break;
                default:
                    alt17=4;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // CSharp4Lexer.g:295:5: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:296:5: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // CSharp4Lexer.g:297:5: 'L'
                    {
                    match('L'); 

                    }
                    break;
                case 4 :
                    // CSharp4Lexer.g:298:5: 'l'
                    {
                    match('l'); 

                    }
                    break;
                case 5 :
                    // CSharp4Lexer.g:299:5: 'UL'
                    {
                    match("UL"); 



                    }
                    break;
                case 6 :
                    // CSharp4Lexer.g:300:5: 'Ul'
                    {
                    match("Ul"); 



                    }
                    break;
                case 7 :
                    // CSharp4Lexer.g:301:5: 'uL'
                    {
                    match("uL"); 



                    }
                    break;
                case 8 :
                    // CSharp4Lexer.g:302:5: 'ul'
                    {
                    match("ul"); 



                    }
                    break;
                case 9 :
                    // CSharp4Lexer.g:303:5: 'LU'
                    {
                    match("LU"); 



                    }
                    break;
                case 10 :
                    // CSharp4Lexer.g:304:5: 'Lu'
                    {
                    match("Lu"); 



                    }
                    break;
                case 11 :
                    // CSharp4Lexer.g:305:5: 'lU'
                    {
                    match("lU"); 



                    }
                    break;
                case 12 :
                    // CSharp4Lexer.g:306:5: 'lu'
                    {
                    match("lu"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Integer_type_suffix"

    // $ANTLR start "Hexadecimal_integer_literal"
    public final void mHexadecimal_integer_literal() throws RecognitionException {
        try {
            // CSharp4Lexer.g:309:3: ( ( '0x' | '0X' ) Hex_digits ( Integer_type_suffix )? )
            // CSharp4Lexer.g:309:5: ( '0x' | '0X' ) Hex_digits ( Integer_type_suffix )?
            {
            // CSharp4Lexer.g:309:5: ( '0x' | '0X' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='0') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='x') ) {
                    alt18=1;
                }
                else if ( (LA18_1=='X') ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // CSharp4Lexer.g:309:6: '0x'
                    {
                    match("0x"); 



                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:309:13: '0X'
                    {
                    match("0X"); 



                    }
                    break;

            }


            mHex_digits(); 


            // CSharp4Lexer.g:309:30: ( Integer_type_suffix )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='L'||LA19_0=='U'||LA19_0=='l'||LA19_0=='u') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // CSharp4Lexer.g:309:30: Integer_type_suffix
                    {
                    mInteger_type_suffix(); 


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Hexadecimal_integer_literal"

    // $ANTLR start "Hex_digits"
    public final void mHex_digits() throws RecognitionException {
        try {
            // CSharp4Lexer.g:312:3: ( ( HEX_DIGIT )+ )
            // CSharp4Lexer.g:312:5: ( HEX_DIGIT )+
            {
            // CSharp4Lexer.g:312:5: ( HEX_DIGIT )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0 >= '0' && LA20_0 <= '9')||(LA20_0 >= 'A' && LA20_0 <= 'F')||(LA20_0 >= 'a' && LA20_0 <= 'f')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // CSharp4Lexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Hex_digits"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // CSharp4Lexer.g:315:3: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "LiteralAccess"
    public final void mLiteralAccess() throws RecognitionException {
        try {
            int _type = LiteralAccess;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken il=null;
            CommonToken d=null;
            CommonToken id=null;

            // CSharp4Lexer.g:323:3: (il= INTEGER_LITERAL d= DOT id= IDENTIFIER )
            // CSharp4Lexer.g:323:5: il= INTEGER_LITERAL d= DOT id= IDENTIFIER
            {
            int ilStart1477 = getCharIndex();
            int ilStartLine1477 = getLine();
            int ilStartCharPos1477 = getCharPositionInLine();
            mINTEGER_LITERAL(); 
            il = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, ilStart1477, getCharIndex()-1);
            il.setLine(ilStartLine1477);
            il.setCharPositionInLine(ilStartCharPos1477);


            emit2(il, INTEGER_LITERAL);

            int dStart1489 = getCharIndex();
            int dStartLine1489 = getLine();
            int dStartCharPos1489 = getCharPositionInLine();
            mDOT(); 
            d = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, dStart1489, getCharIndex()-1);
            d.setLine(dStartLine1489);
            d.setCharPositionInLine(dStartCharPos1489);


            emit2(d, DOT);

            int idStart1513 = getCharIndex();
            int idStartLine1513 = getLine();
            int idStartCharPos1513 = getCharPositionInLine();
            mIDENTIFIER(); 
            id = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, idStart1513, getCharIndex()-1);
            id.setLine(idStartLine1513);
            id.setCharPositionInLine(idStartCharPos1513);


            emit2(id, IDENTIFIER);

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LiteralAccess"

    // $ANTLR start "REAL_LITERAL"
    public final void mREAL_LITERAL() throws RecognitionException {
        try {
            int _type = REAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:329:3: ( Decimal_digits DOT Decimal_digits ( Exponent_part )? ( Real_type_suffix )? | DOT Decimal_digits ( Exponent_part )? ( Real_type_suffix )? | Decimal_digits Exponent_part ( Real_type_suffix )? | Decimal_digits Real_type_suffix )
            int alt26=4;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // CSharp4Lexer.g:329:5: Decimal_digits DOT Decimal_digits ( Exponent_part )? ( Real_type_suffix )?
                    {
                    mDecimal_digits(); 


                    mDOT(); 


                    mDecimal_digits(); 


                    // CSharp4Lexer.g:329:39: ( Exponent_part )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='E'||LA21_0=='e') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // CSharp4Lexer.g:329:39: Exponent_part
                            {
                            mExponent_part(); 


                            }
                            break;

                    }


                    // CSharp4Lexer.g:329:54: ( Real_type_suffix )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='D'||LA22_0=='F'||LA22_0=='M'||LA22_0=='d'||LA22_0=='f'||LA22_0=='m') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // CSharp4Lexer.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='M'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='m' ) {
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


                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:330:5: DOT Decimal_digits ( Exponent_part )? ( Real_type_suffix )?
                    {
                    mDOT(); 


                    mDecimal_digits(); 


                    // CSharp4Lexer.g:330:24: ( Exponent_part )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='E'||LA23_0=='e') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // CSharp4Lexer.g:330:24: Exponent_part
                            {
                            mExponent_part(); 


                            }
                            break;

                    }


                    // CSharp4Lexer.g:330:39: ( Real_type_suffix )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='D'||LA24_0=='F'||LA24_0=='M'||LA24_0=='d'||LA24_0=='f'||LA24_0=='m') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // CSharp4Lexer.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='M'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='m' ) {
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


                    }
                    break;
                case 3 :
                    // CSharp4Lexer.g:331:5: Decimal_digits Exponent_part ( Real_type_suffix )?
                    {
                    mDecimal_digits(); 


                    mExponent_part(); 


                    // CSharp4Lexer.g:331:34: ( Real_type_suffix )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='D'||LA25_0=='F'||LA25_0=='M'||LA25_0=='d'||LA25_0=='f'||LA25_0=='m') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // CSharp4Lexer.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='M'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='m' ) {
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


                    }
                    break;
                case 4 :
                    // CSharp4Lexer.g:332:5: Decimal_digits Real_type_suffix
                    {
                    mDecimal_digits(); 


                    mReal_type_suffix(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REAL_LITERAL"

    // $ANTLR start "Exponent_part"
    public final void mExponent_part() throws RecognitionException {
        try {
            // CSharp4Lexer.g:335:3: ( ( 'e' | 'E' ) ( Sign )? Decimal_digits )
            // CSharp4Lexer.g:335:5: ( 'e' | 'E' ) ( Sign )? Decimal_digits
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // CSharp4Lexer.g:335:17: ( Sign )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='+'||LA27_0=='-') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // CSharp4Lexer.g:
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


            mDecimal_digits(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent_part"

    // $ANTLR start "Sign"
    public final void mSign() throws RecognitionException {
        try {
            // CSharp4Lexer.g:338:3: ( '+' | '-' )
            // CSharp4Lexer.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Sign"

    // $ANTLR start "Real_type_suffix"
    public final void mReal_type_suffix() throws RecognitionException {
        try {
            // CSharp4Lexer.g:342:3: ( 'F' | 'f' | 'D' | 'd' | 'M' | 'm' )
            // CSharp4Lexer.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='M'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Real_type_suffix"

    // $ANTLR start "CHARACTER_LITERAL"
    public final void mCHARACTER_LITERAL() throws RecognitionException {
        try {
            int _type = CHARACTER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:350:3: ( QUOTE Character QUOTE )
            // CSharp4Lexer.g:350:5: QUOTE Character QUOTE
            {
            mQUOTE(); 


            mCharacter(); 


            mQUOTE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARACTER_LITERAL"

    // $ANTLR start "Character"
    public final void mCharacter() throws RecognitionException {
        try {
            // CSharp4Lexer.g:353:3: ( Single_character | Simple_escape_sequence | Hexadecimal_escape_sequence | Unicode_escape_sequence )
            int alt28=4;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0 >= '\u0000' && LA28_0 <= '\t')||(LA28_0 >= '\u000B' && LA28_0 <= '\f')||(LA28_0 >= '\u000E' && LA28_0 <= '&')||(LA28_0 >= '(' && LA28_0 <= '[')||(LA28_0 >= ']' && LA28_0 <= '\u0084')||(LA28_0 >= '\u0086' && LA28_0 <= '\u2027')||(LA28_0 >= '\u202A' && LA28_0 <= '\uFFFF')) ) {
                alt28=1;
            }
            else if ( (LA28_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '0':
                case '\\':
                case 'a':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                case 'v':
                    {
                    alt28=2;
                    }
                    break;
                case 'x':
                    {
                    alt28=3;
                    }
                    break;
                case 'U':
                case 'u':
                    {
                    alt28=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // CSharp4Lexer.g:353:5: Single_character
                    {
                    mSingle_character(); 


                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:354:5: Simple_escape_sequence
                    {
                    mSimple_escape_sequence(); 


                    }
                    break;
                case 3 :
                    // CSharp4Lexer.g:355:5: Hexadecimal_escape_sequence
                    {
                    mHexadecimal_escape_sequence(); 


                    }
                    break;
                case 4 :
                    // CSharp4Lexer.g:356:5: Unicode_escape_sequence
                    {
                    mUnicode_escape_sequence(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Character"

    // $ANTLR start "Single_character"
    public final void mSingle_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:359:3: (~ ( QUOTE | BACK_SLASH | NEW_LINE_CHARACTER ) )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\u0084')||(input.LA(1) >= '\u0086' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Single_character"

    // $ANTLR start "Simple_escape_sequence"
    public final void mSimple_escape_sequence() throws RecognitionException {
        try {
            // CSharp4Lexer.g:364:3: ( '\\\\\\'' | '\\\\\"' | DOUBLE_BACK_SLASH | '\\\\0' | '\\\\a' | '\\\\b' | '\\\\f' | '\\\\n' | '\\\\r' | '\\\\t' | '\\\\v' )
            int alt29=11;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\'':
                    {
                    alt29=1;
                    }
                    break;
                case '\"':
                    {
                    alt29=2;
                    }
                    break;
                case '\\':
                    {
                    alt29=3;
                    }
                    break;
                case '0':
                    {
                    alt29=4;
                    }
                    break;
                case 'a':
                    {
                    alt29=5;
                    }
                    break;
                case 'b':
                    {
                    alt29=6;
                    }
                    break;
                case 'f':
                    {
                    alt29=7;
                    }
                    break;
                case 'n':
                    {
                    alt29=8;
                    }
                    break;
                case 'r':
                    {
                    alt29=9;
                    }
                    break;
                case 't':
                    {
                    alt29=10;
                    }
                    break;
                case 'v':
                    {
                    alt29=11;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // CSharp4Lexer.g:364:5: '\\\\\\''
                    {
                    match("\\'"); 



                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:365:5: '\\\\\"'
                    {
                    match("\\\""); 



                    }
                    break;
                case 3 :
                    // CSharp4Lexer.g:366:5: DOUBLE_BACK_SLASH
                    {
                    mDOUBLE_BACK_SLASH(); 


                    }
                    break;
                case 4 :
                    // CSharp4Lexer.g:367:5: '\\\\0'
                    {
                    match("\\0"); 



                    }
                    break;
                case 5 :
                    // CSharp4Lexer.g:368:5: '\\\\a'
                    {
                    match("\\a"); 



                    }
                    break;
                case 6 :
                    // CSharp4Lexer.g:369:5: '\\\\b'
                    {
                    match("\\b"); 



                    }
                    break;
                case 7 :
                    // CSharp4Lexer.g:370:5: '\\\\f'
                    {
                    match("\\f"); 



                    }
                    break;
                case 8 :
                    // CSharp4Lexer.g:371:5: '\\\\n'
                    {
                    match("\\n"); 



                    }
                    break;
                case 9 :
                    // CSharp4Lexer.g:372:5: '\\\\r'
                    {
                    match("\\r"); 



                    }
                    break;
                case 10 :
                    // CSharp4Lexer.g:373:5: '\\\\t'
                    {
                    match("\\t"); 



                    }
                    break;
                case 11 :
                    // CSharp4Lexer.g:374:5: '\\\\v'
                    {
                    match("\\v"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Simple_escape_sequence"

    // $ANTLR start "Hexadecimal_escape_sequence"
    public final void mHexadecimal_escape_sequence() throws RecognitionException {
        try {
            // CSharp4Lexer.g:377:3: ( '\\\\x' HEX_DIGIT | '\\\\x' HEX_DIGIT HEX_DIGIT | '\\\\x' HEX_DIGIT HEX_DIGIT HEX_DIGIT | '\\\\x' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            int alt30=4;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\\') ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1=='x') ) {
                    int LA30_2 = input.LA(3);

                    if ( ((LA30_2 >= '0' && LA30_2 <= '9')||(LA30_2 >= 'A' && LA30_2 <= 'F')||(LA30_2 >= 'a' && LA30_2 <= 'f')) ) {
                        int LA30_3 = input.LA(4);

                        if ( ((LA30_3 >= '0' && LA30_3 <= '9')||(LA30_3 >= 'A' && LA30_3 <= 'F')||(LA30_3 >= 'a' && LA30_3 <= 'f')) ) {
                            int LA30_5 = input.LA(5);

                            if ( ((LA30_5 >= '0' && LA30_5 <= '9')||(LA30_5 >= 'A' && LA30_5 <= 'F')||(LA30_5 >= 'a' && LA30_5 <= 'f')) ) {
                                int LA30_7 = input.LA(6);

                                if ( ((LA30_7 >= '0' && LA30_7 <= '9')||(LA30_7 >= 'A' && LA30_7 <= 'F')||(LA30_7 >= 'a' && LA30_7 <= 'f')) ) {
                                    alt30=4;
                                }
                                else {
                                    alt30=3;
                                }
                            }
                            else {
                                alt30=2;
                            }
                        }
                        else {
                            alt30=1;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // CSharp4Lexer.g:377:5: '\\\\x' HEX_DIGIT
                    {
                    match("\\x"); 



                    mHEX_DIGIT(); 


                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:378:5: '\\\\x' HEX_DIGIT HEX_DIGIT
                    {
                    match("\\x"); 



                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    }
                    break;
                case 3 :
                    // CSharp4Lexer.g:379:5: '\\\\x' HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match("\\x"); 



                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    }
                    break;
                case 4 :
                    // CSharp4Lexer.g:380:5: '\\\\x' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match("\\x"); 



                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Hexadecimal_escape_sequence"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:383:3: ( Regular_string_literal | Verbatim_string_literal )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\"') ) {
                alt31=1;
            }
            else if ( (LA31_0=='@') ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // CSharp4Lexer.g:383:5: Regular_string_literal
                    {
                    mRegular_string_literal(); 


                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:384:5: Verbatim_string_literal
                    {
                    mVerbatim_string_literal(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "Regular_string_literal"
    public final void mRegular_string_literal() throws RecognitionException {
        try {
            // CSharp4Lexer.g:387:3: ( DOUBLE_QUOTE ( Regular_string_literal_character )* DOUBLE_QUOTE )
            // CSharp4Lexer.g:387:5: DOUBLE_QUOTE ( Regular_string_literal_character )* DOUBLE_QUOTE
            {
            mDOUBLE_QUOTE(); 


            // CSharp4Lexer.g:387:18: ( Regular_string_literal_character )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0 >= '\u0000' && LA32_0 <= '\t')||(LA32_0 >= '\u000B' && LA32_0 <= '\f')||(LA32_0 >= '\u000E' && LA32_0 <= '!')||(LA32_0 >= '#' && LA32_0 <= '\u0084')||(LA32_0 >= '\u0086' && LA32_0 <= '\u2027')||(LA32_0 >= '\u202A' && LA32_0 <= '\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // CSharp4Lexer.g:387:18: Regular_string_literal_character
            	    {
            	    mRegular_string_literal_character(); 


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            mDOUBLE_QUOTE(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Regular_string_literal"

    // $ANTLR start "Regular_string_literal_character"
    public final void mRegular_string_literal_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:390:3: ( Single_regular_string_literal_character | Simple_escape_sequence | Hexadecimal_escape_sequence | Unicode_escape_sequence )
            int alt33=4;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0 >= '\u0000' && LA33_0 <= '\t')||(LA33_0 >= '\u000B' && LA33_0 <= '\f')||(LA33_0 >= '\u000E' && LA33_0 <= '!')||(LA33_0 >= '#' && LA33_0 <= '[')||(LA33_0 >= ']' && LA33_0 <= '\u0084')||(LA33_0 >= '\u0086' && LA33_0 <= '\u2027')||(LA33_0 >= '\u202A' && LA33_0 <= '\uFFFF')) ) {
                alt33=1;
            }
            else if ( (LA33_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '0':
                case '\\':
                case 'a':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                case 'v':
                    {
                    alt33=2;
                    }
                    break;
                case 'x':
                    {
                    alt33=3;
                    }
                    break;
                case 'U':
                case 'u':
                    {
                    alt33=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // CSharp4Lexer.g:390:5: Single_regular_string_literal_character
                    {
                    mSingle_regular_string_literal_character(); 


                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:391:5: Simple_escape_sequence
                    {
                    mSimple_escape_sequence(); 


                    }
                    break;
                case 3 :
                    // CSharp4Lexer.g:392:5: Hexadecimal_escape_sequence
                    {
                    mHexadecimal_escape_sequence(); 


                    }
                    break;
                case 4 :
                    // CSharp4Lexer.g:393:5: Unicode_escape_sequence
                    {
                    mUnicode_escape_sequence(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Regular_string_literal_character"

    // $ANTLR start "Single_regular_string_literal_character"
    public final void mSingle_regular_string_literal_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:397:3: (~ ( DOUBLE_QUOTE | BACK_SLASH | NEW_LINE_CHARACTER ) )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\u0084')||(input.LA(1) >= '\u0086' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Single_regular_string_literal_character"

    // $ANTLR start "Verbatim_string_literal"
    public final void mVerbatim_string_literal() throws RecognitionException {
        try {
            // CSharp4Lexer.g:400:3: ( '@' DOUBLE_QUOTE ( Verbatim_string_literal_character )* DOUBLE_QUOTE )
            // CSharp4Lexer.g:400:5: '@' DOUBLE_QUOTE ( Verbatim_string_literal_character )* DOUBLE_QUOTE
            {
            match('@'); 

            mDOUBLE_QUOTE(); 


            // CSharp4Lexer.g:400:22: ( Verbatim_string_literal_character )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0=='\"') ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1=='\"') ) {
                        alt34=1;
                    }


                }
                else if ( ((LA34_0 >= '\u0000' && LA34_0 <= '!')||(LA34_0 >= '#' && LA34_0 <= '\uFFFF')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // CSharp4Lexer.g:400:22: Verbatim_string_literal_character
            	    {
            	    mVerbatim_string_literal_character(); 


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            mDOUBLE_QUOTE(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Verbatim_string_literal"

    // $ANTLR start "Verbatim_string_literal_character"
    public final void mVerbatim_string_literal_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:403:3: ( Single_verbatim_string_literal_character | Quote_escape_sequence )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0 >= '\u0000' && LA35_0 <= '!')||(LA35_0 >= '#' && LA35_0 <= '\uFFFF')) ) {
                alt35=1;
            }
            else if ( (LA35_0=='\"') ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // CSharp4Lexer.g:403:5: Single_verbatim_string_literal_character
                    {
                    mSingle_verbatim_string_literal_character(); 


                    }
                    break;
                case 2 :
                    // CSharp4Lexer.g:404:5: Quote_escape_sequence
                    {
                    mQuote_escape_sequence(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Verbatim_string_literal_character"

    // $ANTLR start "Single_verbatim_string_literal_character"
    public final void mSingle_verbatim_string_literal_character() throws RecognitionException {
        try {
            // CSharp4Lexer.g:407:3: (~ DOUBLE_QUOTE )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Single_verbatim_string_literal_character"

    // $ANTLR start "Quote_escape_sequence"
    public final void mQuote_escape_sequence() throws RecognitionException {
        try {
            // CSharp4Lexer.g:410:3: ( DOUBLE_QUOTE DOUBLE_QUOTE )
            // CSharp4Lexer.g:410:5: DOUBLE_QUOTE DOUBLE_QUOTE
            {
            mDOUBLE_QUOTE(); 


            mDOUBLE_QUOTE(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Quote_escape_sequence"

    // $ANTLR start "OPEN_BRACE"
    public final void mOPEN_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:414:12: ( '{' )
            // CSharp4Lexer.g:414:14: '{'
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
    // $ANTLR end "OPEN_BRACE"

    // $ANTLR start "CLOSE_BRACE"
    public final void mCLOSE_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:415:13: ( '}' )
            // CSharp4Lexer.g:415:15: '}'
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
    // $ANTLR end "CLOSE_BRACE"

    // $ANTLR start "OPEN_BRACKET"
    public final void mOPEN_BRACKET() throws RecognitionException {
        try {
            int _type = OPEN_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:416:14: ( '[' )
            // CSharp4Lexer.g:416:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_BRACKET"

    // $ANTLR start "CLOSE_BRACKET"
    public final void mCLOSE_BRACKET() throws RecognitionException {
        try {
            int _type = CLOSE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:417:15: ( ']' )
            // CSharp4Lexer.g:417:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_BRACKET"

    // $ANTLR start "OPEN_PARENS"
    public final void mOPEN_PARENS() throws RecognitionException {
        try {
            int _type = OPEN_PARENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:418:13: ( '(' )
            // CSharp4Lexer.g:418:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_PARENS"

    // $ANTLR start "CLOSE_PARENS"
    public final void mCLOSE_PARENS() throws RecognitionException {
        try {
            int _type = CLOSE_PARENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:419:14: ( ')' )
            // CSharp4Lexer.g:419:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_PARENS"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:420:5: ( '.' )
            // CSharp4Lexer.g:420:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:421:7: ( ',' )
            // CSharp4Lexer.g:421:9: ','
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
    // $ANTLR end "COMMA"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:422:7: ( ':' )
            // CSharp4Lexer.g:422:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:423:11: ( ';' )
            // CSharp4Lexer.g:423:13: ';'
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
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:424:6: ( '+' )
            // CSharp4Lexer.g:424:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:425:7: ( '-' )
            // CSharp4Lexer.g:425:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:426:6: ( '*' )
            // CSharp4Lexer.g:426:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:427:5: ( '/' )
            // CSharp4Lexer.g:427:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:428:9: ( '%' )
            // CSharp4Lexer.g:428:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "AMP"
    public final void mAMP() throws RecognitionException {
        try {
            int _type = AMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:429:5: ( '&' )
            // CSharp4Lexer.g:429:7: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMP"

    // $ANTLR start "BITWISE_OR"
    public final void mBITWISE_OR() throws RecognitionException {
        try {
            int _type = BITWISE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:430:12: ( '|' )
            // CSharp4Lexer.g:430:14: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISE_OR"

    // $ANTLR start "CARET"
    public final void mCARET() throws RecognitionException {
        try {
            int _type = CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:431:7: ( '^' )
            // CSharp4Lexer.g:431:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CARET"

    // $ANTLR start "BANG"
    public final void mBANG() throws RecognitionException {
        try {
            int _type = BANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:432:6: ( '!' )
            // CSharp4Lexer.g:432:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BANG"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:433:7: ( '~' )
            // CSharp4Lexer.g:433:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "ASSIGNMENT"
    public final void mASSIGNMENT() throws RecognitionException {
        try {
            int _type = ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:434:12: ( '=' )
            // CSharp4Lexer.g:434:14: '='
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
    // $ANTLR end "ASSIGNMENT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:435:4: ( '<' )
            // CSharp4Lexer.g:435:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:436:4: ( '>' )
            // CSharp4Lexer.g:436:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "INTERR"
    public final void mINTERR() throws RecognitionException {
        try {
            int _type = INTERR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:437:8: ( '?' )
            // CSharp4Lexer.g:437:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTERR"

    // $ANTLR start "DOUBLE_COLON"
    public final void mDOUBLE_COLON() throws RecognitionException {
        try {
            int _type = DOUBLE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:438:14: ( '::' )
            // CSharp4Lexer.g:438:16: '::'
            {
            match("::"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_COLON"

    // $ANTLR start "OP_COALESCING"
    public final void mOP_COALESCING() throws RecognitionException {
        try {
            int _type = OP_COALESCING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:439:15: ( '??' )
            // CSharp4Lexer.g:439:17: '??'
            {
            match("??"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_COALESCING"

    // $ANTLR start "OP_INC"
    public final void mOP_INC() throws RecognitionException {
        try {
            int _type = OP_INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:440:8: ( '++' )
            // CSharp4Lexer.g:440:10: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_INC"

    // $ANTLR start "OP_DEC"
    public final void mOP_DEC() throws RecognitionException {
        try {
            int _type = OP_DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:441:8: ( '--' )
            // CSharp4Lexer.g:441:10: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_DEC"

    // $ANTLR start "OP_AND"
    public final void mOP_AND() throws RecognitionException {
        try {
            int _type = OP_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:442:8: ( '&&' )
            // CSharp4Lexer.g:442:10: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_AND"

    // $ANTLR start "OP_OR"
    public final void mOP_OR() throws RecognitionException {
        try {
            int _type = OP_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:443:7: ( '||' )
            // CSharp4Lexer.g:443:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_OR"

    // $ANTLR start "OP_PTR"
    public final void mOP_PTR() throws RecognitionException {
        try {
            int _type = OP_PTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:444:8: ( '->' )
            // CSharp4Lexer.g:444:10: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_PTR"

    // $ANTLR start "OP_EQ"
    public final void mOP_EQ() throws RecognitionException {
        try {
            int _type = OP_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:445:7: ( '==' )
            // CSharp4Lexer.g:445:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_EQ"

    // $ANTLR start "OP_NE"
    public final void mOP_NE() throws RecognitionException {
        try {
            int _type = OP_NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:446:7: ( '!=' )
            // CSharp4Lexer.g:446:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_NE"

    // $ANTLR start "OP_LE"
    public final void mOP_LE() throws RecognitionException {
        try {
            int _type = OP_LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:447:7: ( '<=' )
            // CSharp4Lexer.g:447:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_LE"

    // $ANTLR start "OP_GE"
    public final void mOP_GE() throws RecognitionException {
        try {
            int _type = OP_GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:448:7: ( '>=' )
            // CSharp4Lexer.g:448:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_GE"

    // $ANTLR start "OP_ADD_ASSIGNMENT"
    public final void mOP_ADD_ASSIGNMENT() throws RecognitionException {
        try {
            int _type = OP_ADD_ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:449:19: ( '+=' )
            // CSharp4Lexer.g:449:21: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_ADD_ASSIGNMENT"

    // $ANTLR start "OP_SUB_ASSIGNMENT"
    public final void mOP_SUB_ASSIGNMENT() throws RecognitionException {
        try {
            int _type = OP_SUB_ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:450:19: ( '-=' )
            // CSharp4Lexer.g:450:21: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_SUB_ASSIGNMENT"

    // $ANTLR start "OP_MULT_ASSIGNMENT"
    public final void mOP_MULT_ASSIGNMENT() throws RecognitionException {
        try {
            int _type = OP_MULT_ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:451:20: ( '*=' )
            // CSharp4Lexer.g:451:22: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_MULT_ASSIGNMENT"

    // $ANTLR start "OP_DIV_ASSIGNMENT"
    public final void mOP_DIV_ASSIGNMENT() throws RecognitionException {
        try {
            int _type = OP_DIV_ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:452:19: ( '/=' )
            // CSharp4Lexer.g:452:21: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_DIV_ASSIGNMENT"

    // $ANTLR start "OP_MOD_ASSIGNMENT"
    public final void mOP_MOD_ASSIGNMENT() throws RecognitionException {
        try {
            int _type = OP_MOD_ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:453:19: ( '%=' )
            // CSharp4Lexer.g:453:21: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_MOD_ASSIGNMENT"

    // $ANTLR start "OP_AND_ASSIGNMENT"
    public final void mOP_AND_ASSIGNMENT() throws RecognitionException {
        try {
            int _type = OP_AND_ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:454:19: ( '&=' )
            // CSharp4Lexer.g:454:21: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_AND_ASSIGNMENT"

    // $ANTLR start "OP_OR_ASSIGNMENT"
    public final void mOP_OR_ASSIGNMENT() throws RecognitionException {
        try {
            int _type = OP_OR_ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:455:18: ( '|=' )
            // CSharp4Lexer.g:455:20: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_OR_ASSIGNMENT"

    // $ANTLR start "OP_XOR_ASSIGNMENT"
    public final void mOP_XOR_ASSIGNMENT() throws RecognitionException {
        try {
            int _type = OP_XOR_ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:456:19: ( '^=' )
            // CSharp4Lexer.g:456:21: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_XOR_ASSIGNMENT"

    // $ANTLR start "OP_LEFT_SHIFT"
    public final void mOP_LEFT_SHIFT() throws RecognitionException {
        try {
            int _type = OP_LEFT_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:457:15: ( '<<' )
            // CSharp4Lexer.g:457:17: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_LEFT_SHIFT"

    // $ANTLR start "OP_LEFT_SHIFT_ASSIGNMENT"
    public final void mOP_LEFT_SHIFT_ASSIGNMENT() throws RecognitionException {
        try {
            int _type = OP_LEFT_SHIFT_ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:458:26: ( '<<=' )
            // CSharp4Lexer.g:458:28: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_LEFT_SHIFT_ASSIGNMENT"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:464:7: ( '\\'' )
            // CSharp4Lexer.g:464:21: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "DOUBLE_QUOTE"
    public final void mDOUBLE_QUOTE() throws RecognitionException {
        try {
            int _type = DOUBLE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:465:14: ( '\"' )
            // CSharp4Lexer.g:465:21: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_QUOTE"

    // $ANTLR start "BACK_SLASH"
    public final void mBACK_SLASH() throws RecognitionException {
        try {
            int _type = BACK_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:466:12: ( '\\\\' )
            // CSharp4Lexer.g:466:21: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BACK_SLASH"

    // $ANTLR start "DOUBLE_BACK_SLASH"
    public final void mDOUBLE_BACK_SLASH() throws RecognitionException {
        try {
            int _type = DOUBLE_BACK_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:467:19: ( '\\\\\\\\' )
            // CSharp4Lexer.g:467:21: '\\\\\\\\'
            {
            match("\\\\"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_BACK_SLASH"

    // $ANTLR start "SHARP"
    public final void mSHARP() throws RecognitionException {
        try {
            int _type = SHARP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSharp4Lexer.g:468:7: ( '#' )
            // CSharp4Lexer.g:468:21: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHARP"

    // $ANTLR start "UNICODE_CLASS_ZS"
    public final void mUNICODE_CLASS_ZS() throws RecognitionException {
        try {
            // CSharp4Lexer.g:473:3: ( '\\u0020' | '\\u00A0' | '\\u1680' | '\\u180E' | '\\u2000' | '\\u2001' | '\\u2002' | '\\u2003' | '\\u2004' | '\\u2005' | '\\u2006' | '\\u2008' | '\\u2009' | '\\u200A' | '\\u202F' | '\\u3000' | '\\u205F' )
            // CSharp4Lexer.g:
            {
            if ( input.LA(1)==' '||input.LA(1)=='\u00A0'||input.LA(1)=='\u1680'||input.LA(1)=='\u180E'||(input.LA(1) >= '\u2000' && input.LA(1) <= '\u2006')||(input.LA(1) >= '\u2008' && input.LA(1) <= '\u200A')||input.LA(1)=='\u202F'||input.LA(1)=='\u205F'||input.LA(1)=='\u3000' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_ZS"

    // $ANTLR start "UNICODE_CLASS_LU"
    public final void mUNICODE_CLASS_LU() throws RecognitionException {
        try {
            // CSharp4Lexer.g:493:3: ( '\\u0041' .. '\\u005A' | '\\u00C0' .. '\\u00DE' )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00DE') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_LU"

    // $ANTLR start "UNICODE_CLASS_LL"
    public final void mUNICODE_CLASS_LL() throws RecognitionException {
        try {
            // CSharp4Lexer.g:499:3: ( '\\u0061' .. '\\u007A' )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_LL"

    // $ANTLR start "UNICODE_CLASS_LT"
    public final void mUNICODE_CLASS_LT() throws RecognitionException {
        try {
            // CSharp4Lexer.g:503:3: ( '\\u01C5' | '\\u01C8' | '\\u01CB' | '\\u01F2' )
            // CSharp4Lexer.g:
            {
            if ( input.LA(1)=='\u01C5'||input.LA(1)=='\u01C8'||input.LA(1)=='\u01CB'||input.LA(1)=='\u01F2' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_LT"

    // $ANTLR start "UNICODE_CLASS_LM"
    public final void mUNICODE_CLASS_LM() throws RecognitionException {
        try {
            // CSharp4Lexer.g:510:3: ( '\\u02B0' .. '\\u02EE' )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= '\u02B0' && input.LA(1) <= '\u02EE') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_LM"

    // $ANTLR start "UNICODE_CLASS_LO"
    public final void mUNICODE_CLASS_LO() throws RecognitionException {
        try {
            // CSharp4Lexer.g:514:3: ( '\\u01BB' | '\\u01C0' | '\\u01C1' | '\\u01C2' | '\\u01C3' | '\\u0294' )
            // CSharp4Lexer.g:
            {
            if ( input.LA(1)=='\u01BB'||(input.LA(1) >= '\u01C0' && input.LA(1) <= '\u01C3')||input.LA(1)=='\u0294' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_LO"

    // $ANTLR start "UNICODE_CLASS_NL"
    public final void mUNICODE_CLASS_NL() throws RecognitionException {
        try {
            // CSharp4Lexer.g:523:3: ( '\\u16EE' | '\\u16EF' | '\\u16F0' | '\\u2160' | '\\u2161' | '\\u2162' | '\\u2163' | '\\u2164' | '\\u2165' | '\\u2166' | '\\u2167' | '\\u2168' | '\\u2169' | '\\u216A' | '\\u216B' | '\\u216C' | '\\u216D' | '\\u216E' | '\\u216F' )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= '\u16EE' && input.LA(1) <= '\u16F0')||(input.LA(1) >= '\u2160' && input.LA(1) <= '\u216F') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_NL"

    // $ANTLR start "UNICODE_CLASS_MN"
    public final void mUNICODE_CLASS_MN() throws RecognitionException {
        try {
            // CSharp4Lexer.g:545:3: ( '\\u0300' | '\\u0301' | '\\u0302' | '\\u0303' | '\\u0304' | '\\u0305' | '\\u0306' | '\\u0307' | '\\u0308' | '\\u0309' | '\\u030A' | '\\u030B' | '\\u030C' | '\\u030D' | '\\u030E' | '\\u030F' | '\\u0310' )
            // CSharp4Lexer.g:
            {
            if ( (input.LA(1) >= '\u0300' && input.LA(1) <= '\u0310') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_MN"

    // $ANTLR start "UNICODE_CLASS_MC"
    public final void mUNICODE_CLASS_MC() throws RecognitionException {
        try {
            // CSharp4Lexer.g:565:3: ( '\\u0903' | '\\u093E' | '\\u093F' | '\\u0940' | '\\u0949' | '\\u094A' | '\\u094B' | '\\u094C' )
            // CSharp4Lexer.g:
            {
            if ( input.LA(1)=='\u0903'||(input.LA(1) >= '\u093E' && input.LA(1) <= '\u0940')||(input.LA(1) >= '\u0949' && input.LA(1) <= '\u094C') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_MC"

    // $ANTLR start "UNICODE_CLASS_CF"
    public final void mUNICODE_CLASS_CF() throws RecognitionException {
        try {
            // CSharp4Lexer.g:576:3: ( '\\u00AD' | '\\u0600' | '\\u0601' | '\\u0602' | '\\u0603' | '\\u06DD' )
            // CSharp4Lexer.g:
            {
            if ( input.LA(1)=='\u00AD'||(input.LA(1) >= '\u0600' && input.LA(1) <= '\u0603')||input.LA(1)=='\u06DD' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_CF"

    // $ANTLR start "UNICODE_CLASS_PC"
    public final void mUNICODE_CLASS_PC() throws RecognitionException {
        try {
            // CSharp4Lexer.g:585:3: ( '\\u005F' | '\\u203F' | '\\u2040' | '\\u2054' | '\\uFE33' | '\\uFE34' | '\\uFE4D' | '\\uFE4E' | '\\uFE4F' | '\\uFF3F' )
            // CSharp4Lexer.g:
            {
            if ( input.LA(1)=='_'||(input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040')||input.LA(1)=='\u2054'||(input.LA(1) >= '\uFE33' && input.LA(1) <= '\uFE34')||(input.LA(1) >= '\uFE4D' && input.LA(1) <= '\uFE4F')||input.LA(1)=='\uFF3F' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_PC"

    // $ANTLR start "UNICODE_CLASS_ND"
    public final void mUNICODE_CLASS_ND() throws RecognitionException {
        try {
            // CSharp4Lexer.g:598:3: ( '\\u0030' | '\\u0031' | '\\u0032' | '\\u0033' | '\\u0034' | '\\u0035' | '\\u0036' | '\\u0037' | '\\u0038' | '\\u0039' )
            // CSharp4Lexer.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_ND"

    public void mTokens() throws RecognitionException {
        // CSharp4Lexer.g:1:8: ( SINGLE_LINE_DOC_COMMENT | DELIMITED_DOC_COMMENT | NEW_LINE | SINGLE_LINE_COMMENT | DELIMITED_COMMENT | WHITESPACE | ABSTRACT | AS | BASE | BOOL | BREAK | BYTE | CASE | CATCH | CHAR | CHECKED | CLASS | CONST | CONTINUE | DECIMAL | DEFAULT | DELEGATE | DO | DOUBLE | ELSE | ENUM | EVENT | EXPLICIT | EXTERN | FALSE | FINALLY | FIXED | FLOAT | FOR | FOREACH | GOTO | IF | IMPLICIT | IN | INT | INTERFACE | INTERNAL | IS | LOCK | LONG | NAMESPACE | NEW | NULL | OBJECT | OPERATOR | OUT | OVERRIDE | PARAMS | PRIVATE | PROTECTED | PUBLIC | READONLY | REF | RETURN | SBYTE | SEALED | SHORT | SIZEOF | STACKALLOC | STATIC | STRING | STRUCT | SWITCH | THIS | THROW | TRUE | TRY | TYPEOF | UINT | ULONG | UNCHECKED | UNSAFE | USHORT | USING | VIRTUAL | VOID | VOLATILE | WHILE | IDENTIFIER | INTEGER_LITERAL | LiteralAccess | REAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | OPEN_BRACE | CLOSE_BRACE | OPEN_BRACKET | CLOSE_BRACKET | OPEN_PARENS | CLOSE_PARENS | DOT | COMMA | COLON | SEMICOLON | PLUS | MINUS | STAR | DIV | PERCENT | AMP | BITWISE_OR | CARET | BANG | TILDE | ASSIGNMENT | LT | GT | INTERR | DOUBLE_COLON | OP_COALESCING | OP_INC | OP_DEC | OP_AND | OP_OR | OP_PTR | OP_EQ | OP_NE | OP_LE | OP_GE | OP_ADD_ASSIGNMENT | OP_SUB_ASSIGNMENT | OP_MULT_ASSIGNMENT | OP_DIV_ASSIGNMENT | OP_MOD_ASSIGNMENT | OP_AND_ASSIGNMENT | OP_OR_ASSIGNMENT | OP_XOR_ASSIGNMENT | OP_LEFT_SHIFT | OP_LEFT_SHIFT_ASSIGNMENT | QUOTE | DOUBLE_QUOTE | BACK_SLASH | DOUBLE_BACK_SLASH | SHARP )
        int alt36=139;
        alt36 = dfa36.predict(input);
        switch (alt36) {
            case 1 :
                // CSharp4Lexer.g:1:10: SINGLE_LINE_DOC_COMMENT
                {
                mSINGLE_LINE_DOC_COMMENT(); 


                }
                break;
            case 2 :
                // CSharp4Lexer.g:1:34: DELIMITED_DOC_COMMENT
                {
                mDELIMITED_DOC_COMMENT(); 


                }
                break;
            case 3 :
                // CSharp4Lexer.g:1:56: NEW_LINE
                {
                mNEW_LINE(); 


                }
                break;
            case 4 :
                // CSharp4Lexer.g:1:65: SINGLE_LINE_COMMENT
                {
                mSINGLE_LINE_COMMENT(); 


                }
                break;
            case 5 :
                // CSharp4Lexer.g:1:85: DELIMITED_COMMENT
                {
                mDELIMITED_COMMENT(); 


                }
                break;
            case 6 :
                // CSharp4Lexer.g:1:103: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 7 :
                // CSharp4Lexer.g:1:114: ABSTRACT
                {
                mABSTRACT(); 


                }
                break;
            case 8 :
                // CSharp4Lexer.g:1:123: AS
                {
                mAS(); 


                }
                break;
            case 9 :
                // CSharp4Lexer.g:1:126: BASE
                {
                mBASE(); 


                }
                break;
            case 10 :
                // CSharp4Lexer.g:1:131: BOOL
                {
                mBOOL(); 


                }
                break;
            case 11 :
                // CSharp4Lexer.g:1:136: BREAK
                {
                mBREAK(); 


                }
                break;
            case 12 :
                // CSharp4Lexer.g:1:142: BYTE
                {
                mBYTE(); 


                }
                break;
            case 13 :
                // CSharp4Lexer.g:1:147: CASE
                {
                mCASE(); 


                }
                break;
            case 14 :
                // CSharp4Lexer.g:1:152: CATCH
                {
                mCATCH(); 


                }
                break;
            case 15 :
                // CSharp4Lexer.g:1:158: CHAR
                {
                mCHAR(); 


                }
                break;
            case 16 :
                // CSharp4Lexer.g:1:163: CHECKED
                {
                mCHECKED(); 


                }
                break;
            case 17 :
                // CSharp4Lexer.g:1:171: CLASS
                {
                mCLASS(); 


                }
                break;
            case 18 :
                // CSharp4Lexer.g:1:177: CONST
                {
                mCONST(); 


                }
                break;
            case 19 :
                // CSharp4Lexer.g:1:183: CONTINUE
                {
                mCONTINUE(); 


                }
                break;
            case 20 :
                // CSharp4Lexer.g:1:192: DECIMAL
                {
                mDECIMAL(); 


                }
                break;
            case 21 :
                // CSharp4Lexer.g:1:200: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 22 :
                // CSharp4Lexer.g:1:208: DELEGATE
                {
                mDELEGATE(); 


                }
                break;
            case 23 :
                // CSharp4Lexer.g:1:217: DO
                {
                mDO(); 


                }
                break;
            case 24 :
                // CSharp4Lexer.g:1:220: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 25 :
                // CSharp4Lexer.g:1:227: ELSE
                {
                mELSE(); 


                }
                break;
            case 26 :
                // CSharp4Lexer.g:1:232: ENUM
                {
                mENUM(); 


                }
                break;
            case 27 :
                // CSharp4Lexer.g:1:237: EVENT
                {
                mEVENT(); 


                }
                break;
            case 28 :
                // CSharp4Lexer.g:1:243: EXPLICIT
                {
                mEXPLICIT(); 


                }
                break;
            case 29 :
                // CSharp4Lexer.g:1:252: EXTERN
                {
                mEXTERN(); 


                }
                break;
            case 30 :
                // CSharp4Lexer.g:1:259: FALSE
                {
                mFALSE(); 


                }
                break;
            case 31 :
                // CSharp4Lexer.g:1:265: FINALLY
                {
                mFINALLY(); 


                }
                break;
            case 32 :
                // CSharp4Lexer.g:1:273: FIXED
                {
                mFIXED(); 


                }
                break;
            case 33 :
                // CSharp4Lexer.g:1:279: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 34 :
                // CSharp4Lexer.g:1:285: FOR
                {
                mFOR(); 


                }
                break;
            case 35 :
                // CSharp4Lexer.g:1:289: FOREACH
                {
                mFOREACH(); 


                }
                break;
            case 36 :
                // CSharp4Lexer.g:1:297: GOTO
                {
                mGOTO(); 


                }
                break;
            case 37 :
                // CSharp4Lexer.g:1:302: IF
                {
                mIF(); 


                }
                break;
            case 38 :
                // CSharp4Lexer.g:1:305: IMPLICIT
                {
                mIMPLICIT(); 


                }
                break;
            case 39 :
                // CSharp4Lexer.g:1:314: IN
                {
                mIN(); 


                }
                break;
            case 40 :
                // CSharp4Lexer.g:1:317: INT
                {
                mINT(); 


                }
                break;
            case 41 :
                // CSharp4Lexer.g:1:321: INTERFACE
                {
                mINTERFACE(); 


                }
                break;
            case 42 :
                // CSharp4Lexer.g:1:331: INTERNAL
                {
                mINTERNAL(); 


                }
                break;
            case 43 :
                // CSharp4Lexer.g:1:340: IS
                {
                mIS(); 


                }
                break;
            case 44 :
                // CSharp4Lexer.g:1:343: LOCK
                {
                mLOCK(); 


                }
                break;
            case 45 :
                // CSharp4Lexer.g:1:348: LONG
                {
                mLONG(); 


                }
                break;
            case 46 :
                // CSharp4Lexer.g:1:353: NAMESPACE
                {
                mNAMESPACE(); 


                }
                break;
            case 47 :
                // CSharp4Lexer.g:1:363: NEW
                {
                mNEW(); 


                }
                break;
            case 48 :
                // CSharp4Lexer.g:1:367: NULL
                {
                mNULL(); 


                }
                break;
            case 49 :
                // CSharp4Lexer.g:1:372: OBJECT
                {
                mOBJECT(); 


                }
                break;
            case 50 :
                // CSharp4Lexer.g:1:379: OPERATOR
                {
                mOPERATOR(); 


                }
                break;
            case 51 :
                // CSharp4Lexer.g:1:388: OUT
                {
                mOUT(); 


                }
                break;
            case 52 :
                // CSharp4Lexer.g:1:392: OVERRIDE
                {
                mOVERRIDE(); 


                }
                break;
            case 53 :
                // CSharp4Lexer.g:1:401: PARAMS
                {
                mPARAMS(); 


                }
                break;
            case 54 :
                // CSharp4Lexer.g:1:408: PRIVATE
                {
                mPRIVATE(); 


                }
                break;
            case 55 :
                // CSharp4Lexer.g:1:416: PROTECTED
                {
                mPROTECTED(); 


                }
                break;
            case 56 :
                // CSharp4Lexer.g:1:426: PUBLIC
                {
                mPUBLIC(); 


                }
                break;
            case 57 :
                // CSharp4Lexer.g:1:433: READONLY
                {
                mREADONLY(); 


                }
                break;
            case 58 :
                // CSharp4Lexer.g:1:442: REF
                {
                mREF(); 


                }
                break;
            case 59 :
                // CSharp4Lexer.g:1:446: RETURN
                {
                mRETURN(); 


                }
                break;
            case 60 :
                // CSharp4Lexer.g:1:453: SBYTE
                {
                mSBYTE(); 


                }
                break;
            case 61 :
                // CSharp4Lexer.g:1:459: SEALED
                {
                mSEALED(); 


                }
                break;
            case 62 :
                // CSharp4Lexer.g:1:466: SHORT
                {
                mSHORT(); 


                }
                break;
            case 63 :
                // CSharp4Lexer.g:1:472: SIZEOF
                {
                mSIZEOF(); 


                }
                break;
            case 64 :
                // CSharp4Lexer.g:1:479: STACKALLOC
                {
                mSTACKALLOC(); 


                }
                break;
            case 65 :
                // CSharp4Lexer.g:1:490: STATIC
                {
                mSTATIC(); 


                }
                break;
            case 66 :
                // CSharp4Lexer.g:1:497: STRING
                {
                mSTRING(); 


                }
                break;
            case 67 :
                // CSharp4Lexer.g:1:504: STRUCT
                {
                mSTRUCT(); 


                }
                break;
            case 68 :
                // CSharp4Lexer.g:1:511: SWITCH
                {
                mSWITCH(); 


                }
                break;
            case 69 :
                // CSharp4Lexer.g:1:518: THIS
                {
                mTHIS(); 


                }
                break;
            case 70 :
                // CSharp4Lexer.g:1:523: THROW
                {
                mTHROW(); 


                }
                break;
            case 71 :
                // CSharp4Lexer.g:1:529: TRUE
                {
                mTRUE(); 


                }
                break;
            case 72 :
                // CSharp4Lexer.g:1:534: TRY
                {
                mTRY(); 


                }
                break;
            case 73 :
                // CSharp4Lexer.g:1:538: TYPEOF
                {
                mTYPEOF(); 


                }
                break;
            case 74 :
                // CSharp4Lexer.g:1:545: UINT
                {
                mUINT(); 


                }
                break;
            case 75 :
                // CSharp4Lexer.g:1:550: ULONG
                {
                mULONG(); 


                }
                break;
            case 76 :
                // CSharp4Lexer.g:1:556: UNCHECKED
                {
                mUNCHECKED(); 


                }
                break;
            case 77 :
                // CSharp4Lexer.g:1:566: UNSAFE
                {
                mUNSAFE(); 


                }
                break;
            case 78 :
                // CSharp4Lexer.g:1:573: USHORT
                {
                mUSHORT(); 


                }
                break;
            case 79 :
                // CSharp4Lexer.g:1:580: USING
                {
                mUSING(); 


                }
                break;
            case 80 :
                // CSharp4Lexer.g:1:586: VIRTUAL
                {
                mVIRTUAL(); 


                }
                break;
            case 81 :
                // CSharp4Lexer.g:1:594: VOID
                {
                mVOID(); 


                }
                break;
            case 82 :
                // CSharp4Lexer.g:1:599: VOLATILE
                {
                mVOLATILE(); 


                }
                break;
            case 83 :
                // CSharp4Lexer.g:1:608: WHILE
                {
                mWHILE(); 


                }
                break;
            case 84 :
                // CSharp4Lexer.g:1:614: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 85 :
                // CSharp4Lexer.g:1:625: INTEGER_LITERAL
                {
                mINTEGER_LITERAL(); 


                }
                break;
            case 86 :
                // CSharp4Lexer.g:1:641: LiteralAccess
                {
                mLiteralAccess(); 


                }
                break;
            case 87 :
                // CSharp4Lexer.g:1:655: REAL_LITERAL
                {
                mREAL_LITERAL(); 


                }
                break;
            case 88 :
                // CSharp4Lexer.g:1:668: CHARACTER_LITERAL
                {
                mCHARACTER_LITERAL(); 


                }
                break;
            case 89 :
                // CSharp4Lexer.g:1:686: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 90 :
                // CSharp4Lexer.g:1:701: OPEN_BRACE
                {
                mOPEN_BRACE(); 


                }
                break;
            case 91 :
                // CSharp4Lexer.g:1:712: CLOSE_BRACE
                {
                mCLOSE_BRACE(); 


                }
                break;
            case 92 :
                // CSharp4Lexer.g:1:724: OPEN_BRACKET
                {
                mOPEN_BRACKET(); 


                }
                break;
            case 93 :
                // CSharp4Lexer.g:1:737: CLOSE_BRACKET
                {
                mCLOSE_BRACKET(); 


                }
                break;
            case 94 :
                // CSharp4Lexer.g:1:751: OPEN_PARENS
                {
                mOPEN_PARENS(); 


                }
                break;
            case 95 :
                // CSharp4Lexer.g:1:763: CLOSE_PARENS
                {
                mCLOSE_PARENS(); 


                }
                break;
            case 96 :
                // CSharp4Lexer.g:1:776: DOT
                {
                mDOT(); 


                }
                break;
            case 97 :
                // CSharp4Lexer.g:1:780: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 98 :
                // CSharp4Lexer.g:1:786: COLON
                {
                mCOLON(); 


                }
                break;
            case 99 :
                // CSharp4Lexer.g:1:792: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 100 :
                // CSharp4Lexer.g:1:802: PLUS
                {
                mPLUS(); 


                }
                break;
            case 101 :
                // CSharp4Lexer.g:1:807: MINUS
                {
                mMINUS(); 


                }
                break;
            case 102 :
                // CSharp4Lexer.g:1:813: STAR
                {
                mSTAR(); 


                }
                break;
            case 103 :
                // CSharp4Lexer.g:1:818: DIV
                {
                mDIV(); 


                }
                break;
            case 104 :
                // CSharp4Lexer.g:1:822: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 105 :
                // CSharp4Lexer.g:1:830: AMP
                {
                mAMP(); 


                }
                break;
            case 106 :
                // CSharp4Lexer.g:1:834: BITWISE_OR
                {
                mBITWISE_OR(); 


                }
                break;
            case 107 :
                // CSharp4Lexer.g:1:845: CARET
                {
                mCARET(); 


                }
                break;
            case 108 :
                // CSharp4Lexer.g:1:851: BANG
                {
                mBANG(); 


                }
                break;
            case 109 :
                // CSharp4Lexer.g:1:856: TILDE
                {
                mTILDE(); 


                }
                break;
            case 110 :
                // CSharp4Lexer.g:1:862: ASSIGNMENT
                {
                mASSIGNMENT(); 


                }
                break;
            case 111 :
                // CSharp4Lexer.g:1:873: LT
                {
                mLT(); 


                }
                break;
            case 112 :
                // CSharp4Lexer.g:1:876: GT
                {
                mGT(); 


                }
                break;
            case 113 :
                // CSharp4Lexer.g:1:879: INTERR
                {
                mINTERR(); 


                }
                break;
            case 114 :
                // CSharp4Lexer.g:1:886: DOUBLE_COLON
                {
                mDOUBLE_COLON(); 


                }
                break;
            case 115 :
                // CSharp4Lexer.g:1:899: OP_COALESCING
                {
                mOP_COALESCING(); 


                }
                break;
            case 116 :
                // CSharp4Lexer.g:1:913: OP_INC
                {
                mOP_INC(); 


                }
                break;
            case 117 :
                // CSharp4Lexer.g:1:920: OP_DEC
                {
                mOP_DEC(); 


                }
                break;
            case 118 :
                // CSharp4Lexer.g:1:927: OP_AND
                {
                mOP_AND(); 


                }
                break;
            case 119 :
                // CSharp4Lexer.g:1:934: OP_OR
                {
                mOP_OR(); 


                }
                break;
            case 120 :
                // CSharp4Lexer.g:1:940: OP_PTR
                {
                mOP_PTR(); 


                }
                break;
            case 121 :
                // CSharp4Lexer.g:1:947: OP_EQ
                {
                mOP_EQ(); 


                }
                break;
            case 122 :
                // CSharp4Lexer.g:1:953: OP_NE
                {
                mOP_NE(); 


                }
                break;
            case 123 :
                // CSharp4Lexer.g:1:959: OP_LE
                {
                mOP_LE(); 


                }
                break;
            case 124 :
                // CSharp4Lexer.g:1:965: OP_GE
                {
                mOP_GE(); 


                }
                break;
            case 125 :
                // CSharp4Lexer.g:1:971: OP_ADD_ASSIGNMENT
                {
                mOP_ADD_ASSIGNMENT(); 


                }
                break;
            case 126 :
                // CSharp4Lexer.g:1:989: OP_SUB_ASSIGNMENT
                {
                mOP_SUB_ASSIGNMENT(); 


                }
                break;
            case 127 :
                // CSharp4Lexer.g:1:1007: OP_MULT_ASSIGNMENT
                {
                mOP_MULT_ASSIGNMENT(); 


                }
                break;
            case 128 :
                // CSharp4Lexer.g:1:1026: OP_DIV_ASSIGNMENT
                {
                mOP_DIV_ASSIGNMENT(); 


                }
                break;
            case 129 :
                // CSharp4Lexer.g:1:1044: OP_MOD_ASSIGNMENT
                {
                mOP_MOD_ASSIGNMENT(); 


                }
                break;
            case 130 :
                // CSharp4Lexer.g:1:1062: OP_AND_ASSIGNMENT
                {
                mOP_AND_ASSIGNMENT(); 


                }
                break;
            case 131 :
                // CSharp4Lexer.g:1:1080: OP_OR_ASSIGNMENT
                {
                mOP_OR_ASSIGNMENT(); 


                }
                break;
            case 132 :
                // CSharp4Lexer.g:1:1097: OP_XOR_ASSIGNMENT
                {
                mOP_XOR_ASSIGNMENT(); 


                }
                break;
            case 133 :
                // CSharp4Lexer.g:1:1115: OP_LEFT_SHIFT
                {
                mOP_LEFT_SHIFT(); 


                }
                break;
            case 134 :
                // CSharp4Lexer.g:1:1129: OP_LEFT_SHIFT_ASSIGNMENT
                {
                mOP_LEFT_SHIFT_ASSIGNMENT(); 


                }
                break;
            case 135 :
                // CSharp4Lexer.g:1:1154: QUOTE
                {
                mQUOTE(); 


                }
                break;
            case 136 :
                // CSharp4Lexer.g:1:1160: DOUBLE_QUOTE
                {
                mDOUBLE_QUOTE(); 


                }
                break;
            case 137 :
                // CSharp4Lexer.g:1:1173: BACK_SLASH
                {
                mBACK_SLASH(); 


                }
                break;
            case 138 :
                // CSharp4Lexer.g:1:1184: DOUBLE_BACK_SLASH
                {
                mDOUBLE_BACK_SLASH(); 


                }
                break;
            case 139 :
                // CSharp4Lexer.g:1:1202: SHARP
                {
                mSHARP(); 


                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\4\uffff";
    static final String DFA2_minS =
        "\2\0\2\uffff";
    static final String DFA2_maxS =
        "\2\uffff\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\1\0\1\1\2\uffff}>";
    static final String[] DFA2_transitionS = {
            "\52\2\1\1\uffd5\2",
            "\52\2\1\1\4\2\1\3\uffd0\2",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 69:11: ( Delimited_comment_section )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_0 = input.LA(1);

                        s = -1;
                        if ( (LA2_0=='*') ) {s = 1;}

                        else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA2_1 = input.LA(1);

                        s = -1;
                        if ( (LA2_1=='/') ) {s = 3;}

                        else if ( (LA2_1=='*') ) {s = 1;}

                        else if ( ((LA2_1 >= '\u0000' && LA2_1 <= ')')||(LA2_1 >= '+' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA6_eotS =
        "\4\uffff";
    static final String DFA6_eofS =
        "\4\uffff";
    static final String DFA6_minS =
        "\2\0\2\uffff";
    static final String DFA6_maxS =
        "\2\uffff\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\1\0\1\1\2\uffff}>";
    static final String[] DFA6_transitionS = {
            "\52\2\1\1\uffd5\2",
            "\52\2\1\1\4\2\1\3\uffd0\2",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 102:10: ( Delimited_comment_section )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0=='*') ) {s = 1;}

                        else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA6_1 = input.LA(1);

                        s = -1;
                        if ( (LA6_1=='/') ) {s = 3;}

                        else if ( (LA6_1=='*') ) {s = 1;}

                        else if ( ((LA6_1 >= '\u0000' && LA6_1 <= ')')||(LA6_1 >= '+' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA26_eotS =
        "\6\uffff";
    static final String DFA26_eofS =
        "\6\uffff";
    static final String DFA26_minS =
        "\2\56\4\uffff";
    static final String DFA26_maxS =
        "\1\71\1\155\4\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\1\1\1\3\1\4";
    static final String DFA26_specialS =
        "\6\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\6\uffff\1\5\26\uffff"+
            "\1\5\1\4\1\5\6\uffff\1\5",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "328:1: REAL_LITERAL : ( Decimal_digits DOT Decimal_digits ( Exponent_part )? ( Real_type_suffix )? | DOT Decimal_digits ( Exponent_part )? ( Real_type_suffix )? | Decimal_digits Exponent_part ( Real_type_suffix )? | Decimal_digits Real_type_suffix );";
        }
    }
    static final String DFA36_eotS =
        "\1\uffff\1\70\2\uffff\22\26\2\uffff\2\161\1\170\1\171\1\173\7\uffff"+
        "\1\175\1\uffff\1\u0080\1\u0084\1\u0086\1\u0088\1\u008b\1\u008e\1"+
        "\u0090\1\u0092\1\uffff\1\u0094\1\u0097\1\u0099\1\u009b\1\u009d\1"+
        "\uffff\1\u009f\3\uffff\1\26\1\u00a3\11\26\1\u00b2\11\26\1\u00be"+
        "\1\26\1\u00c1\1\u00c2\34\26\4\uffff\4\161\40\uffff\1\u00f4\7\uffff"+
        "\1\u00f6\3\uffff\1\26\1\uffff\16\26\1\uffff\11\26\1\u0114\1\26\1"+
        "\uffff\1\26\1\u0118\2\uffff\3\26\1\u011c\3\26\1\u0120\6\26\1\u0127"+
        "\13\26\1\u0135\13\26\3\161\1\uffff\6\161\2\uffff\1\u00f6\1\uffff"+
        "\1\u00a1\2\uffff\1\26\1\u0149\1\u014a\1\26\1\u014c\1\u014d\1\26"+
        "\1\u014f\10\26\1\u0158\1\u0159\10\26\1\uffff\1\u0162\2\26\1\uffff"+
        "\1\u0165\1\u0166\1\26\1\uffff\1\u0168\2\26\1\uffff\6\26\1\uffff"+
        "\12\26\1\u017b\1\26\1\u017d\1\uffff\1\26\1\u017f\6\26\1\u0186\2"+
        "\26\4\161\3\uffff\1\26\2\uffff\1\u0192\2\uffff\1\u0193\1\uffff\1"+
        "\26\1\u0195\1\u0196\5\26\2\uffff\1\u019c\2\26\1\u019f\1\26\1\u01a1"+
        "\1\u01a2\1\26\1\uffff\2\26\2\uffff\1\26\1\uffff\11\26\1\u01b1\1"+
        "\26\1\u01b3\6\26\1\uffff\1\u01ba\1\uffff\1\26\1\uffff\1\u01bc\3"+
        "\26\1\u01c0\1\26\1\uffff\1\26\1\u01c3\10\161\1\26\2\uffff\1\26\2"+
        "\uffff\4\26\1\u01ca\1\uffff\1\26\1\u01cc\1\uffff\1\26\2\uffff\5"+
        "\26\1\u01d3\2\26\1\u01d6\2\26\1\u01d9\1\26\1\u01db\1\uffff\1\u01dc"+
        "\1\uffff\1\u01dd\1\26\1\u01df\1\u01e0\1\u01e1\1\u01e2\1\uffff\1"+
        "\u01e3\1\uffff\1\26\1\u01e5\1\u01e6\1\uffff\2\26\1\uffff\1\26\1"+
        "\u01ea\1\26\1\u01ec\1\u01ed\1\26\1\uffff\1\26\1\uffff\1\u01f0\1"+
        "\u01f1\4\26\1\uffff\2\26\1\uffff\1\u01f8\1\26\1\uffff\1\26\3\uffff"+
        "\1\26\5\uffff\1\26\2\uffff\1\u01fd\1\26\1\u01ff\1\uffff\1\u0200"+
        "\2\uffff\1\u0201\1\u0202\2\uffff\1\u0203\1\26\1\u0205\1\26\1\u0207"+
        "\1\u0208\1\uffff\1\26\1\u020a\2\26\1\uffff\1\u020d\5\uffff\1\u020e"+
        "\1\uffff\1\u020f\2\uffff\1\u0210\1\uffff\1\26\1\u0212\4\uffff\1"+
        "\u0213\2\uffff";
    static final String DFA36_eofS =
        "\u0214\uffff";
    static final String DFA36_minS =
        "\1\11\1\52\2\uffff\1\142\2\141\1\145\1\154\1\141\1\157\1\146\1\157"+
        "\1\141\1\142\1\141\1\145\1\142\1\150\2\151\1\150\1\uffff\1\42\2"+
        "\56\1\60\2\0\7\uffff\1\72\1\uffff\1\53\1\55\2\75\1\46\3\75\1\uffff"+
        "\1\75\1\74\1\75\1\77\1\134\1\uffff\1\57\1\0\2\uffff\1\163\1\60\1"+
        "\163\1\157\1\145\1\164\1\163\2\141\1\156\1\143\1\60\1\163\1\165"+
        "\1\145\1\160\1\154\1\156\1\157\1\162\1\164\1\60\1\160\2\60\1\143"+
        "\1\155\1\167\1\154\1\152\1\145\1\164\1\145\1\162\1\151\1\142\1\141"+
        "\1\171\1\141\1\157\1\172\1\141\2\151\1\165\1\160\1\156\1\157\1\143"+
        "\1\150\1\162\2\151\1\uffff\2\60\1\uffff\4\56\1\60\37\uffff\1\75"+
        "\7\uffff\1\0\1\uffff\1\0\1\uffff\1\164\1\uffff\1\145\1\154\1\141"+
        "\2\145\1\143\1\162\1\143\2\163\1\151\1\141\1\145\1\142\1\uffff\1"+
        "\145\1\155\1\156\1\154\1\145\1\163\1\141\1\145\1\141\1\60\1\157"+
        "\1\uffff\1\154\1\60\2\uffff\1\153\1\147\1\145\1\60\1\154\1\145\1"+
        "\162\1\60\1\162\1\141\1\166\1\164\1\154\1\144\1\60\1\165\1\164\1"+
        "\154\1\162\1\145\1\143\1\151\1\164\1\163\1\157\1\145\1\60\1\145"+
        "\1\164\1\156\1\150\1\141\1\157\1\156\1\164\1\144\1\141\1\154\3\56"+
        "\1\uffff\6\56\2\uffff\1\0\1\uffff\3\0\1\162\2\60\1\153\2\60\1\150"+
        "\1\60\1\153\1\163\1\164\1\151\1\155\1\165\1\147\1\154\2\60\1\164"+
        "\1\151\1\162\1\145\1\154\1\144\1\164\1\141\1\uffff\1\60\1\151\1"+
        "\162\1\uffff\2\60\1\163\1\uffff\1\60\1\143\1\141\1\uffff\1\162\1"+
        "\155\1\141\1\145\1\151\1\157\1\uffff\1\162\2\145\1\164\1\157\1\153"+
        "\1\151\1\156\2\143\1\60\1\167\1\60\1\uffff\1\157\1\60\1\147\1\145"+
        "\1\146\1\162\1\147\1\165\1\60\1\164\1\145\4\56\2\uffff\1\0\1\141"+
        "\2\uffff\1\60\2\uffff\1\60\1\uffff\1\145\2\60\1\156\1\141\1\154"+
        "\1\141\1\145\2\uffff\1\60\1\143\1\156\1\60\1\154\2\60\1\143\1\uffff"+
        "\1\143\1\146\2\uffff\1\160\1\uffff\2\164\1\151\1\163\1\164\2\143"+
        "\2\156\1\60\1\144\1\60\1\146\1\141\1\143\1\147\1\164\1\150\1\uffff"+
        "\1\60\1\uffff\1\146\1\uffff\1\60\1\143\1\145\1\164\1\60\1\141\1"+
        "\uffff\1\151\1\60\10\56\1\143\2\uffff\1\144\2\uffff\1\165\1\154"+
        "\2\164\1\60\1\uffff\1\151\1\60\1\uffff\1\171\2\uffff\1\150\1\151"+
        "\3\141\1\60\1\157\1\144\1\60\1\145\1\164\1\60\1\154\1\60\1\uffff"+
        "\1\60\1\uffff\1\60\1\154\4\60\1\uffff\1\60\1\uffff\1\153\2\60\1"+
        "\uffff\2\154\1\uffff\1\164\1\60\1\145\2\60\1\145\1\uffff\1\164\1"+
        "\uffff\2\60\1\164\1\143\1\154\1\143\1\uffff\1\162\1\145\1\uffff"+
        "\1\60\1\145\1\uffff\1\171\3\uffff\1\154\5\uffff\1\145\2\uffff\1"+
        "\60\1\145\1\60\1\uffff\1\60\2\uffff\2\60\2\uffff\1\60\1\145\1\60"+
        "\1\145\2\60\1\uffff\1\144\1\60\1\157\1\144\1\uffff\1\60\5\uffff"+
        "\1\60\1\uffff\1\60\2\uffff\1\60\1\uffff\1\143\1\60\4\uffff\1\60"+
        "\2\uffff";
    static final String DFA36_maxS =
        "\1\u3000\1\75\2\uffff\1\163\1\171\2\157\1\170\2\157\1\163\1\157"+
        "\1\165\1\166\1\165\1\145\1\167\1\171\1\163\1\157\1\150\1\uffff\1"+
        "\u216f\1\170\1\165\1\71\2\uffff\7\uffff\1\72\1\uffff\1\75\1\76\3"+
        "\75\1\174\2\75\1\uffff\3\75\1\77\1\134\1\uffff\1\57\1\uffff\2\uffff"+
        "\1\163\1\uff3f\1\163\1\157\1\145\2\164\1\145\1\141\1\156\1\154\1"+
        "\uff3f\1\163\1\165\1\145\1\164\1\154\1\170\1\157\1\162\1\164\1\uff3f"+
        "\1\160\2\uff3f\1\156\1\155\1\167\1\154\1\152\1\145\1\164\1\145\1"+
        "\162\1\157\1\142\1\164\1\171\1\141\1\157\1\172\1\162\1\151\1\162"+
        "\1\171\1\160\1\156\1\157\1\163\1\151\1\162\1\154\1\151\1\uffff\2"+
        "\146\1\uffff\2\154\2\165\1\u216f\37\uffff\1\75\7\uffff\1\uffff\1"+
        "\uffff\1\uffff\1\uffff\1\164\1\uffff\1\145\1\154\1\141\2\145\1\143"+
        "\1\162\1\143\1\163\1\164\1\151\1\141\1\145\1\142\1\uffff\1\145\1"+
        "\155\1\156\1\154\1\145\1\163\1\141\1\145\1\141\1\uff3f\1\157\1\uffff"+
        "\1\154\1\uff3f\2\uffff\1\153\1\147\1\145\1\uff3f\1\154\1\145\1\162"+
        "\1\uff3f\1\162\1\141\1\166\1\164\1\154\1\144\1\uff3f\1\165\1\164"+
        "\1\154\1\162\1\145\1\164\1\165\1\164\1\163\1\157\1\145\1\uff3f\1"+
        "\145\1\164\1\156\1\150\1\141\1\157\1\156\1\164\1\144\1\141\1\154"+
        "\1\165\2\56\1\uffff\6\56\2\uffff\1\uffff\1\uffff\3\uffff\1\162\2"+
        "\uff3f\1\153\2\uff3f\1\150\1\uff3f\1\153\1\163\1\164\1\151\1\155"+
        "\1\165\1\147\1\154\2\uff3f\1\164\1\151\1\162\1\145\1\154\1\144\1"+
        "\164\1\141\1\uffff\1\uff3f\1\151\1\162\1\uffff\2\uff3f\1\163\1\uffff"+
        "\1\uff3f\1\143\1\141\1\uffff\1\162\1\155\1\141\1\145\1\151\1\157"+
        "\1\uffff\1\162\2\145\1\164\1\157\1\153\1\151\1\156\2\143\1\uff3f"+
        "\1\167\1\uff3f\1\uffff\1\157\1\uff3f\1\147\1\145\1\146\1\162\1\147"+
        "\1\165\1\uff3f\1\164\1\145\2\154\2\165\2\uffff\1\uffff\1\141\2\uffff"+
        "\1\uff3f\2\uffff\1\uff3f\1\uffff\1\145\2\uff3f\1\156\1\141\1\154"+
        "\1\141\1\145\2\uffff\1\uff3f\1\143\1\156\1\uff3f\1\154\2\uff3f\1"+
        "\143\1\uffff\1\143\1\156\2\uffff\1\160\1\uffff\2\164\1\151\1\163"+
        "\1\164\2\143\2\156\1\uff3f\1\144\1\uff3f\1\146\1\141\1\143\1\147"+
        "\1\164\1\150\1\uffff\1\uff3f\1\uffff\1\146\1\uffff\1\uff3f\1\143"+
        "\1\145\1\164\1\uff3f\1\141\1\uffff\1\151\1\uff3f\10\56\1\143\2\uffff"+
        "\1\144\2\uffff\1\165\1\154\2\164\1\uff3f\1\uffff\1\151\1\uff3f\1"+
        "\uffff\1\171\2\uffff\1\150\1\151\3\141\1\uff3f\1\157\1\144\1\uff3f"+
        "\1\145\1\164\1\uff3f\1\154\1\uff3f\1\uffff\1\uff3f\1\uffff\1\uff3f"+
        "\1\154\4\uff3f\1\uffff\1\uff3f\1\uffff\1\153\2\uff3f\1\uffff\2\154"+
        "\1\uffff\1\164\1\uff3f\1\145\2\uff3f\1\145\1\uffff\1\164\1\uffff"+
        "\2\uff3f\1\164\1\143\1\154\1\143\1\uffff\1\162\1\145\1\uffff\1\uff3f"+
        "\1\145\1\uffff\1\171\3\uffff\1\154\5\uffff\1\145\2\uffff\1\uff3f"+
        "\1\145\1\uff3f\1\uffff\1\uff3f\2\uffff\2\uff3f\2\uffff\1\uff3f\1"+
        "\145\1\uff3f\1\145\2\uff3f\1\uffff\1\144\1\uff3f\1\157\1\144\1\uffff"+
        "\1\uff3f\5\uffff\1\uff3f\1\uffff\1\uff3f\2\uffff\1\uff3f\1\uffff"+
        "\1\143\1\uff3f\4\uffff\1\uff3f\2\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\3\1\6\22\uffff\1\124\6\uffff\1\132\1\133\1\134\1\135"+
        "\1\136\1\137\1\141\1\uffff\1\143\10\uffff\1\155\5\uffff\1\u008b"+
        "\2\uffff\1\u0080\1\147\65\uffff\1\131\2\uffff\1\125\5\uffff\1\127"+
        "\1\140\1\u0087\1\130\1\u0088\1\162\1\142\1\164\1\175\1\144\1\165"+
        "\1\170\1\176\1\145\1\177\1\146\1\u0081\1\150\1\166\1\u0082\1\151"+
        "\1\167\1\u0083\1\152\1\u0084\1\153\1\172\1\154\1\171\1\156\1\173"+
        "\1\uffff\1\157\1\174\1\160\1\163\1\161\1\u008a\1\u0089\1\uffff\1"+
        "\4\1\uffff\1\5\1\uffff\1\10\16\uffff\1\27\13\uffff\1\45\2\uffff"+
        "\1\47\1\53\51\uffff\1\126\6\uffff\1\u0086\1\u0085\1\uffff\1\1\35"+
        "\uffff\1\42\3\uffff\1\50\3\uffff\1\57\3\uffff\1\63\6\uffff\1\72"+
        "\15\uffff\1\110\17\uffff\2\2\2\uffff\1\11\1\12\1\uffff\1\14\1\15"+
        "\1\uffff\1\17\10\uffff\1\31\1\32\10\uffff\1\44\2\uffff\1\54\1\55"+
        "\1\uffff\1\60\22\uffff\1\105\1\uffff\1\107\1\uffff\1\112\6\uffff"+
        "\1\121\13\uffff\1\13\1\16\1\uffff\1\21\1\22\5\uffff\1\33\2\uffff"+
        "\1\36\1\uffff\1\40\1\41\16\uffff\1\74\1\uffff\1\76\6\uffff\1\106"+
        "\1\uffff\1\113\3\uffff\1\117\2\uffff\1\123\6\uffff\1\30\1\uffff"+
        "\1\35\6\uffff\1\61\2\uffff\1\65\2\uffff\1\70\1\uffff\1\73\1\75\1"+
        "\77\1\uffff\1\101\1\102\1\103\1\104\1\111\1\uffff\1\115\1\116\3"+
        "\uffff\1\20\1\uffff\1\24\1\25\2\uffff\1\37\1\43\6\uffff\1\66\4\uffff"+
        "\1\120\1\uffff\1\7\1\23\1\26\1\34\1\46\1\uffff\1\52\1\uffff\1\62"+
        "\1\64\1\uffff\1\71\2\uffff\1\122\1\51\1\56\1\67\1\uffff\1\114\1"+
        "\100";
    static final String DFA36_specialS =
        "\33\uffff\1\7\1\4\31\uffff\1\1\147\uffff\1\0\1\uffff\1\2\124\uffff"+
        "\1\11\1\uffff\1\3\1\10\1\5\115\uffff\1\6\u00cc\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\3\1\2\2\3\1\2\22\uffff\1\3\1\55\1\34\1\64\1\uffff\1\51\1"+
            "\52\1\33\1\41\1\42\1\50\1\46\1\43\1\47\1\32\1\1\1\30\11\31\1"+
            "\44\1\45\1\60\1\57\1\61\1\62\1\27\32\26\1\37\1\63\1\40\1\54"+
            "\1\26\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\26\1\13\2\26"+
            "\1\14\1\26\1\15\1\16\1\17\1\26\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\3\26\1\35\1\53\1\36\1\56\6\uffff\1\2\32\uffff\1\3\37\uffff"+
            "\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26\2\uffff\1"+
            "\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33\uffff\77"+
            "\26\u1391\uffff\1\3\155\uffff\3\26\u011d\uffff\1\3\u07f1\uffff"+
            "\7\3\1\uffff\3\3\35\uffff\2\2\5\uffff\1\3\57\uffff\1\3\u0100"+
            "\uffff\20\26\u0e90\uffff\1\3",
            "\1\66\4\uffff\1\65\15\uffff\1\67",
            "",
            "",
            "\1\71\20\uffff\1\72",
            "\1\73\15\uffff\1\74\2\uffff\1\75\6\uffff\1\76",
            "\1\77\6\uffff\1\100\3\uffff\1\101\2\uffff\1\102",
            "\1\103\11\uffff\1\104",
            "\1\105\1\uffff\1\106\7\uffff\1\107\1\uffff\1\110",
            "\1\111\7\uffff\1\112\2\uffff\1\113\2\uffff\1\114",
            "\1\115",
            "\1\116\6\uffff\1\117\1\120\4\uffff\1\121",
            "\1\122",
            "\1\123\3\uffff\1\124\17\uffff\1\125",
            "\1\126\15\uffff\1\127\4\uffff\1\130\1\131",
            "\1\132\20\uffff\1\133\2\uffff\1\134",
            "\1\135",
            "\1\136\2\uffff\1\137\2\uffff\1\140\1\141\12\uffff\1\142\2\uffff"+
            "\1\143",
            "\1\144\11\uffff\1\145\6\uffff\1\146",
            "\1\147\2\uffff\1\150\1\uffff\1\151\4\uffff\1\152",
            "\1\153\5\uffff\1\154",
            "\1\155",
            "",
            "\1\156\36\uffff\32\26\4\uffff\1\26\1\uffff\32\26\105\uffff"+
            "\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26\2\uffff\1"+
            "\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33\uffff\77"+
            "\26\u13ff\uffff\3\26\u0a6f\uffff\20\26",
            "\1\166\1\uffff\12\31\12\uffff\3\167\5\uffff\1\164\1\167\7\uffff"+
            "\1\162\2\uffff\1\160\13\uffff\3\167\5\uffff\1\165\1\167\7\uffff"+
            "\1\163\2\uffff\1\157",
            "\1\166\1\uffff\12\31\12\uffff\3\167\5\uffff\1\164\1\167\7\uffff"+
            "\1\162\16\uffff\3\167\5\uffff\1\165\1\167\7\uffff\1\163",
            "\12\167",
            "\12\172\1\uffff\2\172\1\uffff\31\172\1\uffff\135\172\1\uffff"+
            "\u1fa2\172\2\uffff\udfd6\172",
            "\12\156\1\uffff\2\156\1\uffff\167\156\1\uffff\u1fa2\156\2\uffff"+
            "\udfd6\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\174",
            "",
            "\1\176\21\uffff\1\177",
            "\1\u0081\17\uffff\1\u0083\1\u0082",
            "\1\u0085",
            "\1\u0087",
            "\1\u0089\26\uffff\1\u008a",
            "\1\u008d\76\uffff\1\u008c",
            "\1\u008f",
            "\1\u0091",
            "",
            "\1\u0093",
            "\1\u0096\1\u0095",
            "\1\u0098",
            "\1\u009a",
            "\1\u009c",
            "",
            "\1\u009e",
            "\52\u00a1\1\u00a0\uffd5\u00a1",
            "",
            "",
            "\1\u00a2",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8\1\u00a9",
            "\1\u00aa\3\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae\2\uffff\1\u00af\5\uffff\1\u00b0",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\24\26\1\u00b1\5\26"+
            "\62\uffff\1\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26"+
            "\1\uffff\1\26\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1"+
            "\uffff\1\26\33\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9"+
            "\uffff\1\26\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1"+
            "\uffff\3\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26"+
            "\udcc3\uffff\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6\3\uffff\1\u00b7",
            "\1\u00b8",
            "\1\u00b9\11\uffff\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u00bf",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\23\26\1\u00c0\6\26"+
            "\62\uffff\1\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26"+
            "\1\uffff\1\26\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1"+
            "\uffff\1\26\33\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9"+
            "\uffff\1\26\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1"+
            "\uffff\3\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26"+
            "\udcc3\uffff\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u00c3\12\uffff\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd\5\uffff\1\u00ce",
            "\1\u00cf",
            "\1\u00d0\4\uffff\1\u00d1\15\uffff\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7\20\uffff\1\u00d8",
            "\1\u00d9",
            "\1\u00da\10\uffff\1\u00db",
            "\1\u00dc\3\uffff\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1\17\uffff\1\u00e2",
            "\1\u00e3\1\u00e4",
            "\1\u00e5",
            "\1\u00e6\2\uffff\1\u00e7",
            "\1\u00e8",
            "",
            "\12\u00e9\7\uffff\6\u00e9\32\uffff\6\u00e9",
            "\12\u00e9\7\uffff\6\u00e9\32\uffff\6\u00e9",
            "",
            "\1\u00ec\35\uffff\1\u00ea\37\uffff\1\u00eb",
            "\1\u00ec\35\uffff\1\u00ed\37\uffff\1\u00ee",
            "\1\u00ec\46\uffff\1\u00ef\37\uffff\1\u00f0",
            "\1\u00ec\46\uffff\1\u00f1\37\uffff\1\u00f2",
            "\12\167\6\uffff\33\u00ec\4\uffff\1\u00ec\1\uffff\32\u00ec\105"+
            "\uffff\37\u00ec\u00dc\uffff\1\u00ec\4\uffff\4\u00ec\1\uffff"+
            "\1\u00ec\2\uffff\1\u00ec\2\uffff\1\u00ec\46\uffff\1\u00ec\u00a1"+
            "\uffff\1\u00ec\33\uffff\77\u00ec\u13ff\uffff\3\u00ec\u0a6f\uffff"+
            "\20\u00ec",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00f5\1\uffff\2\u00f5\1\uffff\167\u00f5\1\uffff\u1fa2\u00f5"+
            "\2\uffff\udfd6\u00f5",
            "",
            "\52\u00f9\1\u00f8\4\u00f9\1\u00f7\uffd0\u00f9",
            "",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\4\26\1\u0113\25\26"+
            "\62\uffff\1\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26"+
            "\1\uffff\1\26\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1"+
            "\uffff\1\26\33\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9"+
            "\uffff\1\26\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1"+
            "\uffff\3\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26"+
            "\udcc3\uffff\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0115",
            "",
            "\1\u0116",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\4\26\1\u0117\25\26"+
            "\62\uffff\1\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26"+
            "\1\uffff\1\26\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1"+
            "\uffff\1\26\33\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9"+
            "\uffff\1\26\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1"+
            "\uffff\3\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26"+
            "\udcc3\uffff\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d\20\uffff\1\u012e",
            "\1\u012f\13\uffff\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u00ec\1\uffff\12\u00e9\7\uffff\6\u00e9\5\uffff\1\u0143\10"+
            "\uffff\1\u0141\13\uffff\6\u00e9\5\uffff\1\u0144\10\uffff\1\u0142",
            "\1\u00ec",
            "\1\u00ec",
            "",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u00ec",
            "",
            "",
            "\12\u00f5\1\uffff\2\u00f5\1\uffff\167\u00f5\1\uffff\u1fa2\u00f5"+
            "\2\uffff\udfd6\u00f5",
            "",
            "\0\u0145",
            "\52\u00f9\1\u00f8\4\u00f9\1\u0146\uffd0\u00f9",
            "\52\u00f9\1\u00f8\4\u00f9\1\u0147\uffd0\u00f9",
            "\1\u0148",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u014b",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u014e",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0163",
            "\1\u0164",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0167",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0169",
            "\1\u016a",
            "",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u017c",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\1\u017e",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0187",
            "\1\u0188",
            "\1\u00ec\35\uffff\1\u0189\37\uffff\1\u018a",
            "\1\u00ec\35\uffff\1\u018b\37\uffff\1\u018c",
            "\1\u00ec\46\uffff\1\u018d\37\uffff\1\u018e",
            "\1\u00ec\46\uffff\1\u018f\37\uffff\1\u0190",
            "",
            "",
            "\52\u00f9\1\u00f8\4\u00f9\1\u0147\uffd0\u00f9",
            "\1\u0191",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\1\u0194",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u019d",
            "\1\u019e",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01a0",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01a3",
            "",
            "\1\u01a4",
            "\1\u01a5\7\uffff\1\u01a6",
            "",
            "",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01b2",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\1\u01bb",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01c1",
            "",
            "\1\u01c2",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u01c4",
            "",
            "",
            "\1\u01c5",
            "",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\1\u01cb",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\1\u01cd",
            "",
            "",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01d4",
            "\1\u01d5",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01d7",
            "\1\u01d8",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01da",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01de",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\1\u01e4",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\1\u01e7",
            "\1\u01e8",
            "",
            "\1\u01e9",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01eb",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01ee",
            "",
            "\1\u01ef",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "",
            "\1\u01f6",
            "\1\u01f7",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01f9",
            "",
            "\1\u01fa",
            "",
            "",
            "",
            "\1\u01fb",
            "",
            "",
            "",
            "",
            "",
            "\1\u01fc",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u01fe",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0204",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u0206",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\1\u0209",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "\1\u020b",
            "\1\u020c",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "\1\u0211",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26\62\uffff\1"+
            "\26\22\uffff\37\26\u00dc\uffff\1\26\4\uffff\4\26\1\uffff\1\26"+
            "\2\uffff\1\26\2\uffff\1\26\46\uffff\1\26\u00a1\uffff\1\26\33"+
            "\uffff\77\26\21\uffff\21\26\u02ef\uffff\4\26\u00d9\uffff\1\26"+
            "\u0225\uffff\1\26\72\uffff\3\26\10\uffff\4\26\u0da1\uffff\3"+
            "\26\u094e\uffff\2\26\23\uffff\1\26\u010b\uffff\20\26\udcc3\uffff"+
            "\2\26\30\uffff\3\26\u00ef\uffff\1\26",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SINGLE_LINE_DOC_COMMENT | DELIMITED_DOC_COMMENT | NEW_LINE | SINGLE_LINE_COMMENT | DELIMITED_COMMENT | WHITESPACE | ABSTRACT | AS | BASE | BOOL | BREAK | BYTE | CASE | CATCH | CHAR | CHECKED | CLASS | CONST | CONTINUE | DECIMAL | DEFAULT | DELEGATE | DO | DOUBLE | ELSE | ENUM | EVENT | EXPLICIT | EXTERN | FALSE | FINALLY | FIXED | FLOAT | FOR | FOREACH | GOTO | IF | IMPLICIT | IN | INT | INTERFACE | INTERNAL | IS | LOCK | LONG | NAMESPACE | NEW | NULL | OBJECT | OPERATOR | OUT | OVERRIDE | PARAMS | PRIVATE | PROTECTED | PUBLIC | READONLY | REF | RETURN | SBYTE | SEALED | SHORT | SIZEOF | STACKALLOC | STATIC | STRING | STRUCT | SWITCH | THIS | THROW | TRUE | TRY | TYPEOF | UINT | ULONG | UNCHECKED | UNSAFE | USHORT | USING | VIRTUAL | VOID | VOLATILE | WHILE | IDENTIFIER | INTEGER_LITERAL | LiteralAccess | REAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | OPEN_BRACE | CLOSE_BRACE | OPEN_BRACKET | CLOSE_BRACKET | OPEN_PARENS | CLOSE_PARENS | DOT | COMMA | COLON | SEMICOLON | PLUS | MINUS | STAR | DIV | PERCENT | AMP | BITWISE_OR | CARET | BANG | TILDE | ASSIGNMENT | LT | GT | INTERR | DOUBLE_COLON | OP_COALESCING | OP_INC | OP_DEC | OP_AND | OP_OR | OP_PTR | OP_EQ | OP_NE | OP_LE | OP_GE | OP_ADD_ASSIGNMENT | OP_SUB_ASSIGNMENT | OP_MULT_ASSIGNMENT | OP_DIV_ASSIGNMENT | OP_MOD_ASSIGNMENT | OP_AND_ASSIGNMENT | OP_OR_ASSIGNMENT | OP_XOR_ASSIGNMENT | OP_LEFT_SHIFT | OP_LEFT_SHIFT_ASSIGNMENT | QUOTE | DOUBLE_QUOTE | BACK_SLASH | DOUBLE_BACK_SLASH | SHARP );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_158 = input.LA(1);

                        s = -1;
                        if ( ((LA36_158 >= '\u0000' && LA36_158 <= '\t')||(LA36_158 >= '\u000B' && LA36_158 <= '\f')||(LA36_158 >= '\u000E' && LA36_158 <= '\u0084')||(LA36_158 >= '\u0086' && LA36_158 <= '\u2027')||(LA36_158 >= '\u202A' && LA36_158 <= '\uFFFF')) ) {s = 245;}

                        else s = 246;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA36_54 = input.LA(1);

                        s = -1;
                        if ( (LA36_54=='*') ) {s = 160;}

                        else if ( ((LA36_54 >= '\u0000' && LA36_54 <= ')')||(LA36_54 >= '+' && LA36_54 <= '\uFFFF')) ) {s = 161;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA36_160 = input.LA(1);

                        s = -1;
                        if ( (LA36_160=='/') ) {s = 247;}

                        else if ( (LA36_160=='*') ) {s = 248;}

                        else if ( ((LA36_160 >= '\u0000' && LA36_160 <= ')')||(LA36_160 >= '+' && LA36_160 <= '.')||(LA36_160 >= '0' && LA36_160 <= '\uFFFF')) ) {s = 249;}

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA36_247 = input.LA(1);

                        s = -1;
                        if ( ((LA36_247 >= '\u0000' && LA36_247 <= '\uFFFF')) ) {s = 325;}

                        else s = 161;

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA36_28 = input.LA(1);

                        s = -1;
                        if ( ((LA36_28 >= '\u0000' && LA36_28 <= '\t')||(LA36_28 >= '\u000B' && LA36_28 <= '\f')||(LA36_28 >= '\u000E' && LA36_28 <= '\u0084')||(LA36_28 >= '\u0086' && LA36_28 <= '\u2027')||(LA36_28 >= '\u202A' && LA36_28 <= '\uFFFF')) ) {s = 110;}

                        else s = 123;

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA36_249 = input.LA(1);

                        s = -1;
                        if ( (LA36_249=='*') ) {s = 248;}

                        else if ( (LA36_249=='/') ) {s = 327;}

                        else if ( ((LA36_249 >= '\u0000' && LA36_249 <= ')')||(LA36_249 >= '+' && LA36_249 <= '.')||(LA36_249 >= '0' && LA36_249 <= '\uFFFF')) ) {s = 249;}

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA36_327 = input.LA(1);

                        s = -1;
                        if ( (LA36_327=='*') ) {s = 248;}

                        else if ( (LA36_327=='/') ) {s = 327;}

                        else if ( ((LA36_327 >= '\u0000' && LA36_327 <= ')')||(LA36_327 >= '+' && LA36_327 <= '.')||(LA36_327 >= '0' && LA36_327 <= '\uFFFF')) ) {s = 249;}

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA36_27 = input.LA(1);

                        s = -1;
                        if ( ((LA36_27 >= '\u0000' && LA36_27 <= '\t')||(LA36_27 >= '\u000B' && LA36_27 <= '\f')||(LA36_27 >= '\u000E' && LA36_27 <= '&')||(LA36_27 >= '(' && LA36_27 <= '\u0084')||(LA36_27 >= '\u0086' && LA36_27 <= '\u2027')||(LA36_27 >= '\u202A' && LA36_27 <= '\uFFFF')) ) {s = 122;}

                        else s = 121;

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA36_248 = input.LA(1);

                        s = -1;
                        if ( ((LA36_248 >= '\u0000' && LA36_248 <= ')')||(LA36_248 >= '+' && LA36_248 <= '.')||(LA36_248 >= '0' && LA36_248 <= '\uFFFF')) ) {s = 249;}

                        else if ( (LA36_248=='*') ) {s = 248;}

                        else if ( (LA36_248=='/') ) {s = 326;}

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA36_245 = input.LA(1);

                        s = -1;
                        if ( ((LA36_245 >= '\u0000' && LA36_245 <= '\t')||(LA36_245 >= '\u000B' && LA36_245 <= '\f')||(LA36_245 >= '\u000E' && LA36_245 <= '\u0084')||(LA36_245 >= '\u0086' && LA36_245 <= '\u2027')||(LA36_245 >= '\u202A' && LA36_245 <= '\uFFFF')) ) {s = 245;}

                        else s = 246;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}