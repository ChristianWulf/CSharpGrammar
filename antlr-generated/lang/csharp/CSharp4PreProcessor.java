// $ANTLR 3.4 C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g 2013-03-17 20:28:17

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
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CSharp4PreProcessor extends Lexer {
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

    // if-then-else hierarchy controlling
    protected Deque<Boolean> ifStack = new LinkedList<Boolean>();

    // return value is only used for debugging purposes
    protected boolean push(boolean expr) {
      /* if we are already within a block that should not be parsed due to current macro defs,
          do not parse the child if-section */
      if (!ifStack.peek()) {
        ifStack.push(false);
        return false;
      } else {
        ifStack.push(expr);
        return expr;
      }
      
      //boolean newTopValue = expr && ifStack.peek();
      //ifStack.push(newTopValue);
      //return newTopValue;
    }

    protected boolean pop() {
      return ifStack.pop();
    }

    // static and dynamic macro definition controlling
    protected Set<String> definedMacros = new HashSet<String>();

    protected void define(final String conditionSymbol) {
      definedMacros.add(conditionSymbol);
    }
      
    protected void undefine(final String conditionSymbol) {
      definedMacros.remove(conditionSymbol);
    }
      
    protected boolean isDefined(final String conditionSymbol) {
      return definedMacros.contains(conditionSymbol);
    }

    // the following methods are only used for debug purposes
    private List<String> errors = new LinkedList<String>();

    @Override
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        super.displayRecognitionError(tokenNames, e);
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        errors.add(hdr + " " + msg);
    }

    public List<String> getErrors() {
        return errors;
    }

    private void next(int n) {
      System.err.print("next: ");
      for (int i=1; i<=n; i++) {
        System.err.print(" | " + input.LA(i));
      }
      System.err.println();
    }



    // delegates
    public CSharp4PreProcessor_CSharp4Lexer gCSharp4Lexer;
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {gCSharp4Lexer};
    }

    public CSharp4PreProcessor() {} 
    public CSharp4PreProcessor(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CSharp4PreProcessor(CharStream input, RecognizerSharedState state) {
        super(input,state);
        gCSharp4Lexer = new CSharp4PreProcessor_CSharp4Lexer(input, state, this);
    }
    public String getGrammarFileName() { return "C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g"; }

    // $ANTLR start "Pp_directive"
    public final void mPp_directive() throws RecognitionException {
        try {
            int _type = Pp_directive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:96:3: ( ( Pp_declaration | Pp_conditional | Pp_line | Pp_diagnostic | Pp_region | Pp_pragma ) )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:96:5: ( Pp_declaration | Pp_conditional | Pp_line | Pp_diagnostic | Pp_region | Pp_pragma )
            {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:96:5: ( Pp_declaration | Pp_conditional | Pp_line | Pp_diagnostic | Pp_region | Pp_pragma )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:96:6: Pp_declaration
                    {
                    mPp_declaration(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:97:5: Pp_conditional
                    {
                    mPp_conditional(); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:98:5: Pp_line
                    {
                    mPp_line(); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:99:5: Pp_diagnostic
                    {
                    mPp_diagnostic(); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:100:5: Pp_region
                    {
                    mPp_region(); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:101:5: Pp_pragma
                    {
                    mPp_pragma(); if (state.failed) return ;


                    }
                    break;

            }


            if ( state.backtracking==0 ) {_channel=HIDDEN; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_directive"

    // $ANTLR start "Pp_expression"
    public final void mPp_expression(Expression exprObj) throws RecognitionException {
        try {
             Expression expr = new Expression(); 
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:106:3: ( ( WHITESPACE )? Pp_or_expression[exprObj] ( WHITESPACE )? )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:106:5: ( WHITESPACE )? Pp_or_expression[exprObj] ( WHITESPACE )?
            {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:106:5: ( WHITESPACE )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\t'||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||LA2_0==' '||LA2_0=='\u00A0'||LA2_0=='\u1680'||LA2_0=='\u180E'||(LA2_0 >= '\u2000' && LA2_0 <= '\u2006')||(LA2_0 >= '\u2008' && LA2_0 <= '\u200A')||LA2_0=='\u202F'||LA2_0=='\u205F'||LA2_0=='\u3000') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:106:5: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            mPp_or_expression(exprObj); if (state.failed) return ;


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:106:43: ( WHITESPACE )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\t'||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||LA3_0==' '||LA3_0=='\u00A0'||LA3_0=='\u1680'||LA3_0=='\u180E'||(LA3_0 >= '\u2000' && LA3_0 <= '\u2006')||(LA3_0 >= '\u2008' && LA3_0 <= '\u200A')||LA3_0=='\u202F'||LA3_0=='\u205F'||LA3_0=='\u3000') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:106:43: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_expression"

    // $ANTLR start "Pp_or_expression"
    public final void mPp_or_expression(Expression exprObj) throws RecognitionException {
        try {
             Expression expr = new Expression(); 
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:110:3: ( Pp_and_expression[expr] ( WHITESPACE )? ( '||' ( WHITESPACE )? Pp_and_expression[expr] )* )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:110:5: Pp_and_expression[expr] ( WHITESPACE )? ( '||' ( WHITESPACE )? Pp_and_expression[expr] )*
            {
            mPp_and_expression(expr); if (state.failed) return ;


            if ( state.backtracking==0 ) {exprObj.set(expr); }

            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:110:51: ( WHITESPACE )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\t'||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||LA4_0==' '||LA4_0=='\u00A0'||LA4_0=='\u1680'||LA4_0=='\u180E'||(LA4_0 >= '\u2000' && LA4_0 <= '\u2006')||(LA4_0 >= '\u2008' && LA4_0 <= '\u200A')||LA4_0=='\u202F'||LA4_0=='\u205F'||LA4_0=='\u3000') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:110:51: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:111:5: ( '||' ( WHITESPACE )? Pp_and_expression[expr] )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='|') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:111:6: '||' ( WHITESPACE )? Pp_and_expression[expr]
            	    {
            	    match("||"); if (state.failed) return ;



            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:111:11: ( WHITESPACE )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0=='\t'||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||LA5_0==' '||LA5_0=='\u00A0'||LA5_0=='\u1680'||LA5_0=='\u180E'||(LA5_0 >= '\u2000' && LA5_0 <= '\u2006')||(LA5_0 >= '\u2008' && LA5_0 <= '\u200A')||LA5_0=='\u202F'||LA5_0=='\u205F'||LA5_0=='\u3000') ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:111:11: WHITESPACE
            	            {
            	            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    mPp_and_expression(expr); if (state.failed) return ;


            	    if ( state.backtracking==0 ) {exprObj.or(exprObj, expr);}

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_or_expression"

    // $ANTLR start "Pp_and_expression"
    public final void mPp_and_expression(Expression exprObj) throws RecognitionException {
        try {
             Expression expr = new Expression(); 
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:115:3: ( Pp_equality_expression[expr] ( WHITESPACE )? ( '&&' ( WHITESPACE )? Pp_equality_expression[expr] ( WHITESPACE )? )* )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:115:5: Pp_equality_expression[expr] ( WHITESPACE )? ( '&&' ( WHITESPACE )? Pp_equality_expression[expr] ( WHITESPACE )? )*
            {
            mPp_equality_expression(expr); if (state.failed) return ;


            if ( state.backtracking==0 ) {exprObj.set(expr);}

            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:115:55: ( WHITESPACE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\t'||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||LA7_0==' '||LA7_0=='\u00A0'||LA7_0=='\u1680'||LA7_0=='\u180E'||(LA7_0 >= '\u2000' && LA7_0 <= '\u2006')||(LA7_0 >= '\u2008' && LA7_0 <= '\u200A')||LA7_0=='\u202F'||LA7_0=='\u205F'||LA7_0=='\u3000') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:115:55: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:116:5: ( '&&' ( WHITESPACE )? Pp_equality_expression[expr] ( WHITESPACE )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='&') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:116:6: '&&' ( WHITESPACE )? Pp_equality_expression[expr] ( WHITESPACE )?
            	    {
            	    match("&&"); if (state.failed) return ;



            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:116:11: ( WHITESPACE )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0=='\t'||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||LA8_0==' '||LA8_0=='\u00A0'||LA8_0=='\u1680'||LA8_0=='\u180E'||(LA8_0 >= '\u2000' && LA8_0 <= '\u2006')||(LA8_0 >= '\u2008' && LA8_0 <= '\u200A')||LA8_0=='\u202F'||LA8_0=='\u205F'||LA8_0=='\u3000') ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:116:11: WHITESPACE
            	            {
            	            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    mPp_equality_expression(expr); if (state.failed) return ;


            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:116:52: ( WHITESPACE )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0=='\t'||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||LA9_0==' '||LA9_0=='\u00A0'||LA9_0=='\u1680'||LA9_0=='\u180E'||(LA9_0 >= '\u2000' && LA9_0 <= '\u2006')||(LA9_0 >= '\u2008' && LA9_0 <= '\u200A')||LA9_0=='\u202F'||LA9_0=='\u205F'||LA9_0=='\u3000') ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:116:52: WHITESPACE
            	            {
            	            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {exprObj.and(exprObj, expr);}

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_and_expression"

    // $ANTLR start "Pp_equality_expression"
    public final void mPp_equality_expression(Expression exprObj) throws RecognitionException {
        try {
             Expression expr = new Expression(); 
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:120:3: ( Pp_unary_expression[expr] ( WHITESPACE )? ( '==' ( WHITESPACE )? Pp_unary_expression[expr] ( WHITESPACE )? | '!=' ( WHITESPACE )? Pp_unary_expression[expr] ( WHITESPACE )? )* )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:120:5: Pp_unary_expression[expr] ( WHITESPACE )? ( '==' ( WHITESPACE )? Pp_unary_expression[expr] ( WHITESPACE )? | '!=' ( WHITESPACE )? Pp_unary_expression[expr] ( WHITESPACE )? )*
            {
            mPp_unary_expression(expr); if (state.failed) return ;


            if ( state.backtracking==0 ) {exprObj.set(expr);}

            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:120:52: ( WHITESPACE )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\t'||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||LA11_0==' '||LA11_0=='\u00A0'||LA11_0=='\u1680'||LA11_0=='\u180E'||(LA11_0 >= '\u2000' && LA11_0 <= '\u2006')||(LA11_0 >= '\u2008' && LA11_0 <= '\u200A')||LA11_0=='\u202F'||LA11_0=='\u205F'||LA11_0=='\u3000') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:120:52: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:121:5: ( '==' ( WHITESPACE )? Pp_unary_expression[expr] ( WHITESPACE )? | '!=' ( WHITESPACE )? Pp_unary_expression[expr] ( WHITESPACE )? )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='=') ) {
                    alt16=1;
                }
                else if ( (LA16_0=='!') ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:121:7: '==' ( WHITESPACE )? Pp_unary_expression[expr] ( WHITESPACE )?
            	    {
            	    match("=="); if (state.failed) return ;



            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:121:12: ( WHITESPACE )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0=='\t'||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||LA12_0==' '||LA12_0=='\u00A0'||LA12_0=='\u1680'||LA12_0=='\u180E'||(LA12_0 >= '\u2000' && LA12_0 <= '\u2006')||(LA12_0 >= '\u2008' && LA12_0 <= '\u200A')||LA12_0=='\u202F'||LA12_0=='\u205F'||LA12_0=='\u3000') ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:121:12: WHITESPACE
            	            {
            	            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    mPp_unary_expression(expr); if (state.failed) return ;


            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:121:50: ( WHITESPACE )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0=='\t'||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||LA13_0==' '||LA13_0=='\u00A0'||LA13_0=='\u1680'||LA13_0=='\u180E'||(LA13_0 >= '\u2000' && LA13_0 <= '\u2006')||(LA13_0 >= '\u2008' && LA13_0 <= '\u200A')||LA13_0=='\u202F'||LA13_0=='\u205F'||LA13_0=='\u3000') ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:121:50: WHITESPACE
            	            {
            	            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {exprObj.equal(exprObj, expr);}

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:122:7: '!=' ( WHITESPACE )? Pp_unary_expression[expr] ( WHITESPACE )?
            	    {
            	    match("!="); if (state.failed) return ;



            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:122:12: ( WHITESPACE )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0=='\t'||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||LA14_0==' '||LA14_0=='\u00A0'||LA14_0=='\u1680'||LA14_0=='\u180E'||(LA14_0 >= '\u2000' && LA14_0 <= '\u2006')||(LA14_0 >= '\u2008' && LA14_0 <= '\u200A')||LA14_0=='\u202F'||LA14_0=='\u205F'||LA14_0=='\u3000') ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:122:12: WHITESPACE
            	            {
            	            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    mPp_unary_expression(expr); if (state.failed) return ;


            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:122:50: ( WHITESPACE )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0=='\t'||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||LA15_0==' '||LA15_0=='\u00A0'||LA15_0=='\u1680'||LA15_0=='\u180E'||(LA15_0 >= '\u2000' && LA15_0 <= '\u2006')||(LA15_0 >= '\u2008' && LA15_0 <= '\u200A')||LA15_0=='\u202F'||LA15_0=='\u205F'||LA15_0=='\u3000') ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:122:50: WHITESPACE
            	            {
            	            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {exprObj.unequal(exprObj, expr);}

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_equality_expression"

    // $ANTLR start "Pp_unary_expression"
    public final void mPp_unary_expression(Expression exprObj) throws RecognitionException {
        try {
             Expression expr = new Expression(); 
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:127:3: ( Pp_primary_expression[expr] | '!' ( WHITESPACE )? Pp_unary_expression[expr] )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='('||(LA18_0 >= 'A' && LA18_0 <= 'Z')||LA18_0=='_'||(LA18_0 >= 'a' && LA18_0 <= 'z')||(LA18_0 >= '\u00C0' && LA18_0 <= '\u00DE')||LA18_0=='\u01BB'||(LA18_0 >= '\u01C0' && LA18_0 <= '\u01C3')||LA18_0=='\u01C5'||LA18_0=='\u01C8'||LA18_0=='\u01CB'||LA18_0=='\u01F2'||LA18_0=='\u0294'||(LA18_0 >= '\u02B0' && LA18_0 <= '\u02EE')||(LA18_0 >= '\u16EE' && LA18_0 <= '\u16F0')||(LA18_0 >= '\u2160' && LA18_0 <= '\u216F')) ) {
                alt18=1;
            }
            else if ( (LA18_0=='!') ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:127:5: Pp_primary_expression[expr]
                    {
                    mPp_primary_expression(expr); if (state.failed) return ;


                    if ( state.backtracking==0 ) {exprObj.set(expr);}

                    }
                    break;
                case 2 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:128:5: '!' ( WHITESPACE )? Pp_unary_expression[expr]
                    {
                    match('!'); if (state.failed) return ;

                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:128:9: ( WHITESPACE )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\t'||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||LA17_0==' '||LA17_0=='\u00A0'||LA17_0=='\u1680'||LA17_0=='\u180E'||(LA17_0 >= '\u2000' && LA17_0 <= '\u2006')||(LA17_0 >= '\u2008' && LA17_0 <= '\u200A')||LA17_0=='\u202F'||LA17_0=='\u205F'||LA17_0=='\u3000') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:128:9: WHITESPACE
                            {
                            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                            }
                            break;

                    }


                    mPp_unary_expression(expr); if (state.failed) return ;


                    if ( state.backtracking==0 ) {exprObj.not(expr);}

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_unary_expression"

    // $ANTLR start "Pp_primary_expression"
    public final void mPp_primary_expression(Expression exprObj) throws RecognitionException {
        try {
            CommonToken Conditional_symbol1=null;

            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:131:3: ( ( TRUE )=> TRUE | ( FALSE )=> FALSE | Conditional_symbol | '(' Pp_expression[exprObj] ')' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 't':
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='r') ) {
                    int LA19_5 = input.LA(3);

                    if ( (LA19_5=='u') ) {
                        int LA19_7 = input.LA(4);

                        if ( (LA19_7=='e') ) {
                            int LA19_9 = input.LA(5);

                            if ( (synpred1_CSharp4PreProcessor()) ) {
                                alt19=1;
                            }
                            else if ( (true) ) {
                                alt19=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 9, input);

                                throw nvae;

                            }
                        }
                        else {
                            alt19=3;
                        }
                    }
                    else {
                        alt19=3;
                    }
                }
                else {
                    alt19=3;
                }
                }
                break;
            case 'f':
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2=='a') ) {
                    int LA19_6 = input.LA(3);

                    if ( (LA19_6=='l') ) {
                        int LA19_8 = input.LA(4);

                        if ( (LA19_8=='s') ) {
                            int LA19_10 = input.LA(5);

                            if ( (LA19_10=='e') ) {
                                int LA19_12 = input.LA(6);

                                if ( (synpred2_CSharp4PreProcessor()) ) {
                                    alt19=2;
                                }
                                else if ( (true) ) {
                                    alt19=3;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 19, 12, input);

                                    throw nvae;

                                }
                            }
                            else {
                                alt19=3;
                            }
                        }
                        else {
                            alt19=3;
                        }
                    }
                    else {
                        alt19=3;
                    }
                }
                else {
                    alt19=3;
                }
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            case '\u00C0':
            case '\u00C1':
            case '\u00C2':
            case '\u00C3':
            case '\u00C4':
            case '\u00C5':
            case '\u00C6':
            case '\u00C7':
            case '\u00C8':
            case '\u00C9':
            case '\u00CA':
            case '\u00CB':
            case '\u00CC':
            case '\u00CD':
            case '\u00CE':
            case '\u00CF':
            case '\u00D0':
            case '\u00D1':
            case '\u00D2':
            case '\u00D3':
            case '\u00D4':
            case '\u00D5':
            case '\u00D6':
            case '\u00D7':
            case '\u00D8':
            case '\u00D9':
            case '\u00DA':
            case '\u00DB':
            case '\u00DC':
            case '\u00DD':
            case '\u00DE':
            case '\u01BB':
            case '\u01C0':
            case '\u01C1':
            case '\u01C2':
            case '\u01C3':
            case '\u01C5':
            case '\u01C8':
            case '\u01CB':
            case '\u01F2':
            case '\u0294':
            case '\u02B0':
            case '\u02B1':
            case '\u02B2':
            case '\u02B3':
            case '\u02B4':
            case '\u02B5':
            case '\u02B6':
            case '\u02B7':
            case '\u02B8':
            case '\u02B9':
            case '\u02BA':
            case '\u02BB':
            case '\u02BC':
            case '\u02BD':
            case '\u02BE':
            case '\u02BF':
            case '\u02C0':
            case '\u02C1':
            case '\u02C2':
            case '\u02C3':
            case '\u02C4':
            case '\u02C5':
            case '\u02C6':
            case '\u02C7':
            case '\u02C8':
            case '\u02C9':
            case '\u02CA':
            case '\u02CB':
            case '\u02CC':
            case '\u02CD':
            case '\u02CE':
            case '\u02CF':
            case '\u02D0':
            case '\u02D1':
            case '\u02D2':
            case '\u02D3':
            case '\u02D4':
            case '\u02D5':
            case '\u02D6':
            case '\u02D7':
            case '\u02D8':
            case '\u02D9':
            case '\u02DA':
            case '\u02DB':
            case '\u02DC':
            case '\u02DD':
            case '\u02DE':
            case '\u02DF':
            case '\u02E0':
            case '\u02E1':
            case '\u02E2':
            case '\u02E3':
            case '\u02E4':
            case '\u02E5':
            case '\u02E6':
            case '\u02E7':
            case '\u02E8':
            case '\u02E9':
            case '\u02EA':
            case '\u02EB':
            case '\u02EC':
            case '\u02ED':
            case '\u02EE':
            case '\u16EE':
            case '\u16EF':
            case '\u16F0':
            case '\u2160':
            case '\u2161':
            case '\u2162':
            case '\u2163':
            case '\u2164':
            case '\u2165':
            case '\u2166':
            case '\u2167':
            case '\u2168':
            case '\u2169':
            case '\u216A':
            case '\u216B':
            case '\u216C':
            case '\u216D':
            case '\u216E':
            case '\u216F':
                {
                alt19=3;
                }
                break;
            case '(':
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:131:5: ( TRUE )=> TRUE
                    {
                    gCSharp4Lexer.mTRUE(); if (state.failed) return ;


                    if ( state.backtracking==0 ) {exprObj.set(true);}

                    }
                    break;
                case 2 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:132:5: ( FALSE )=> FALSE
                    {
                    gCSharp4Lexer.mFALSE(); if (state.failed) return ;


                    if ( state.backtracking==0 ) {exprObj.set(false);}

                    }
                    break;
                case 3 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:133:5: Conditional_symbol
                    {
                    int Conditional_symbol1Start363 = getCharIndex();
                    int Conditional_symbol1StartLine363 = getLine();
                    int Conditional_symbol1StartCharPos363 = getCharPositionInLine();
                    mConditional_symbol(); if (state.failed) return ;
                    Conditional_symbol1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, Conditional_symbol1Start363, getCharIndex()-1);
                    Conditional_symbol1.setLine(Conditional_symbol1StartLine363);
                    Conditional_symbol1.setCharPositionInLine(Conditional_symbol1StartCharPos363);


                    if ( state.backtracking==0 ) {exprObj.set(isDefined((Conditional_symbol1!=null?Conditional_symbol1.getText():null))); }

                    }
                    break;
                case 4 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:134:5: '(' Pp_expression[exprObj] ')'
                    {
                    match('('); if (state.failed) return ;

                    mPp_expression(exprObj); if (state.failed) return ;


                    match(')'); if (state.failed) return ;

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_primary_expression"

    // $ANTLR start "Pp_declaration"
    public final void mPp_declaration() throws RecognitionException {
        try {
            CommonToken Conditional_symbol2=null;
            CommonToken Conditional_symbol3=null;

            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:137:3: ( ( WHITESPACE )? SHARP ( WHITESPACE )? 'define' WHITESPACE Conditional_symbol Pp_new_line | ( WHITESPACE )? SHARP ( WHITESPACE )? 'undef' WHITESPACE Conditional_symbol Pp_new_line )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:137:5: ( WHITESPACE )? SHARP ( WHITESPACE )? 'define' WHITESPACE Conditional_symbol Pp_new_line
                    {
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:137:5: ( WHITESPACE )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\t'||(LA20_0 >= '\u000B' && LA20_0 <= '\f')||LA20_0==' '||LA20_0=='\u00A0'||LA20_0=='\u1680'||LA20_0=='\u180E'||(LA20_0 >= '\u2000' && LA20_0 <= '\u2006')||(LA20_0 >= '\u2008' && LA20_0 <= '\u200A')||LA20_0=='\u202F'||LA20_0=='\u205F'||LA20_0=='\u3000') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:137:5: WHITESPACE
                            {
                            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                            }
                            break;

                    }


                    gCSharp4Lexer.mSHARP(); if (state.failed) return ;


                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:137:23: ( WHITESPACE )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\t'||(LA21_0 >= '\u000B' && LA21_0 <= '\f')||LA21_0==' '||LA21_0=='\u00A0'||LA21_0=='\u1680'||LA21_0=='\u180E'||(LA21_0 >= '\u2000' && LA21_0 <= '\u2006')||(LA21_0 >= '\u2008' && LA21_0 <= '\u200A')||LA21_0=='\u202F'||LA21_0=='\u205F'||LA21_0=='\u3000') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:137:23: WHITESPACE
                            {
                            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                            }
                            break;

                    }


                    match("define"); if (state.failed) return ;



                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    int Conditional_symbol2Start402 = getCharIndex();
                    int Conditional_symbol2StartLine402 = getLine();
                    int Conditional_symbol2StartCharPos402 = getCharPositionInLine();
                    mConditional_symbol(); if (state.failed) return ;
                    Conditional_symbol2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, Conditional_symbol2Start402, getCharIndex()-1);
                    Conditional_symbol2.setLine(Conditional_symbol2StartLine402);
                    Conditional_symbol2.setCharPositionInLine(Conditional_symbol2StartCharPos402);


                    mPp_new_line(); if (state.failed) return ;


                    if ( state.backtracking==0 ) {define((Conditional_symbol2!=null?Conditional_symbol2.getText():null)); }

                    }
                    break;
                case 2 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:139:5: ( WHITESPACE )? SHARP ( WHITESPACE )? 'undef' WHITESPACE Conditional_symbol Pp_new_line
                    {
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:139:5: ( WHITESPACE )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\t'||(LA22_0 >= '\u000B' && LA22_0 <= '\f')||LA22_0==' '||LA22_0=='\u00A0'||LA22_0=='\u1680'||LA22_0=='\u180E'||(LA22_0 >= '\u2000' && LA22_0 <= '\u2006')||(LA22_0 >= '\u2008' && LA22_0 <= '\u200A')||LA22_0=='\u202F'||LA22_0=='\u205F'||LA22_0=='\u3000') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:139:5: WHITESPACE
                            {
                            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                            }
                            break;

                    }


                    gCSharp4Lexer.mSHARP(); if (state.failed) return ;


                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:139:23: ( WHITESPACE )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\t'||(LA23_0 >= '\u000B' && LA23_0 <= '\f')||LA23_0==' '||LA23_0=='\u00A0'||LA23_0=='\u1680'||LA23_0=='\u180E'||(LA23_0 >= '\u2000' && LA23_0 <= '\u2006')||(LA23_0 >= '\u2008' && LA23_0 <= '\u200A')||LA23_0=='\u202F'||LA23_0=='\u205F'||LA23_0=='\u3000') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:139:23: WHITESPACE
                            {
                            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                            }
                            break;

                    }


                    match("undef"); if (state.failed) return ;



                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    int Conditional_symbol3Start428 = getCharIndex();
                    int Conditional_symbol3StartLine428 = getLine();
                    int Conditional_symbol3StartCharPos428 = getCharPositionInLine();
                    mConditional_symbol(); if (state.failed) return ;
                    Conditional_symbol3 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, Conditional_symbol3Start428, getCharIndex()-1);
                    Conditional_symbol3.setLine(Conditional_symbol3StartLine428);
                    Conditional_symbol3.setCharPositionInLine(Conditional_symbol3StartCharPos428);


                    mPp_new_line(); if (state.failed) return ;


                    if ( state.backtracking==0 ) {undefine((Conditional_symbol3!=null?Conditional_symbol3.getText():null)); }

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_declaration"

    // $ANTLR start "Pp_new_line"
    public final void mPp_new_line() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:143:3: ( ( WHITESPACE )? ( SINGLE_LINE_COMMENT )? NEW_LINE )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:143:5: ( WHITESPACE )? ( SINGLE_LINE_COMMENT )? NEW_LINE
            {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:143:5: ( WHITESPACE )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\t'||(LA25_0 >= '\u000B' && LA25_0 <= '\f')||LA25_0==' '||LA25_0=='\u00A0'||LA25_0=='\u1680'||LA25_0=='\u180E'||(LA25_0 >= '\u2000' && LA25_0 <= '\u2006')||(LA25_0 >= '\u2008' && LA25_0 <= '\u200A')||LA25_0=='\u202F'||LA25_0=='\u205F'||LA25_0=='\u3000') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:143:5: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:143:17: ( SINGLE_LINE_COMMENT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='/') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:143:17: SINGLE_LINE_COMMENT
                    {
                    gCSharp4Lexer.mSINGLE_LINE_COMMENT(); if (state.failed) return ;


                    }
                    break;

            }


            gCSharp4Lexer.mNEW_LINE(); if (state.failed) return ;


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_new_line"

    // $ANTLR start "Pp_conditional"
    public final void mPp_conditional() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:147:3: ( Pp_if_section | Pp_elif_section | Pp_else_section | Pp_endif )
            int alt27=4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:147:5: Pp_if_section
                    {
                    mPp_if_section(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:148:5: Pp_elif_section
                    {
                    mPp_elif_section(); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:149:5: Pp_else_section
                    {
                    mPp_else_section(); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:150:5: Pp_endif
                    {
                    mPp_endif(); if (state.failed) return ;


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_conditional"

    // $ANTLR start "Pp_if_section"
    public final void mPp_if_section() throws RecognitionException {
        try {
            CommonToken e=null;

            Expression exprObj = new Expression();
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:154:3: ( ( WHITESPACE )? SHARP ( WHITESPACE )? 'if' WHITESPACE e= Pp_expression[exprObj] Pp_new_line )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:154:5: ( WHITESPACE )? SHARP ( WHITESPACE )? 'if' WHITESPACE e= Pp_expression[exprObj] Pp_new_line
            {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:154:5: ( WHITESPACE )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\t'||(LA28_0 >= '\u000B' && LA28_0 <= '\f')||LA28_0==' '||LA28_0=='\u00A0'||LA28_0=='\u1680'||LA28_0=='\u180E'||(LA28_0 >= '\u2000' && LA28_0 <= '\u2006')||(LA28_0 >= '\u2008' && LA28_0 <= '\u200A')||LA28_0=='\u202F'||LA28_0=='\u205F'||LA28_0=='\u3000') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:154:5: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            gCSharp4Lexer.mSHARP(); if (state.failed) return ;


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:154:23: ( WHITESPACE )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\t'||(LA29_0 >= '\u000B' && LA29_0 <= '\f')||LA29_0==' '||LA29_0=='\u00A0'||LA29_0=='\u1680'||LA29_0=='\u180E'||(LA29_0 >= '\u2000' && LA29_0 <= '\u2006')||(LA29_0 >= '\u2008' && LA29_0 <= '\u200A')||LA29_0=='\u202F'||LA29_0=='\u205F'||LA29_0=='\u3000') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:154:23: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            match("if"); if (state.failed) return ;



            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


            int eStart522 = getCharIndex();
            int eStartLine522 = getLine();
            int eStartCharPos522 = getCharPositionInLine();
            mPp_expression(exprObj); if (state.failed) return ;
            e = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, eStart522, getCharIndex()-1);
            e.setLine(eStartLine522);
            e.setCharPositionInLine(eStartCharPos522);


            mPp_new_line(); if (state.failed) return ;


            if ( state.backtracking==0 ) {boolean p=push(exprObj.isExpression());
                    /*System.err.println("#if "+(e!=null?e.getText():null)+" -> "+exprObj.isExpression());*/ }

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_if_section"

    // $ANTLR start "Pp_elif_section"
    public final void mPp_elif_section() throws RecognitionException {
        try {
            Expression exprObj = new Expression();
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:160:3: ( ( WHITESPACE )? SHARP ( WHITESPACE )? 'elif' WHITESPACE Pp_expression[exprObj] Pp_new_line )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:160:5: ( WHITESPACE )? SHARP ( WHITESPACE )? 'elif' WHITESPACE Pp_expression[exprObj] Pp_new_line
            {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:160:5: ( WHITESPACE )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\t'||(LA30_0 >= '\u000B' && LA30_0 <= '\f')||LA30_0==' '||LA30_0=='\u00A0'||LA30_0=='\u1680'||LA30_0=='\u180E'||(LA30_0 >= '\u2000' && LA30_0 <= '\u2006')||(LA30_0 >= '\u2008' && LA30_0 <= '\u200A')||LA30_0=='\u202F'||LA30_0=='\u205F'||LA30_0=='\u3000') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:160:5: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            gCSharp4Lexer.mSHARP(); if (state.failed) return ;


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:160:23: ( WHITESPACE )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\t'||(LA31_0 >= '\u000B' && LA31_0 <= '\f')||LA31_0==' '||LA31_0=='\u00A0'||LA31_0=='\u1680'||LA31_0=='\u180E'||(LA31_0 >= '\u2000' && LA31_0 <= '\u2006')||(LA31_0 >= '\u2008' && LA31_0 <= '\u200A')||LA31_0=='\u202F'||LA31_0=='\u205F'||LA31_0=='\u3000') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:160:23: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            match("elif"); if (state.failed) return ;



            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


            mPp_expression(exprObj); if (state.failed) return ;


            mPp_new_line(); if (state.failed) return ;


            if ( state.backtracking==0 ) {push(!pop() && exprObj.isExpression()); }

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_elif_section"

    // $ANTLR start "Pp_else_section"
    public final void mPp_else_section() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:165:3: ( ( WHITESPACE )? SHARP ( WHITESPACE )? 'else' Pp_new_line )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:165:5: ( WHITESPACE )? SHARP ( WHITESPACE )? 'else' Pp_new_line
            {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:165:5: ( WHITESPACE )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\t'||(LA32_0 >= '\u000B' && LA32_0 <= '\f')||LA32_0==' '||LA32_0=='\u00A0'||LA32_0=='\u1680'||LA32_0=='\u180E'||(LA32_0 >= '\u2000' && LA32_0 <= '\u2006')||(LA32_0 >= '\u2008' && LA32_0 <= '\u200A')||LA32_0=='\u202F'||LA32_0=='\u205F'||LA32_0=='\u3000') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:165:5: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            gCSharp4Lexer.mSHARP(); if (state.failed) return ;


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:165:23: ( WHITESPACE )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\t'||(LA33_0 >= '\u000B' && LA33_0 <= '\f')||LA33_0==' '||LA33_0=='\u00A0'||LA33_0=='\u1680'||LA33_0=='\u180E'||(LA33_0 >= '\u2000' && LA33_0 <= '\u2006')||(LA33_0 >= '\u2008' && LA33_0 <= '\u200A')||LA33_0=='\u202F'||LA33_0=='\u205F'||LA33_0=='\u3000') ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:165:23: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            match("else"); if (state.failed) return ;



            mPp_new_line(); if (state.failed) return ;


            if ( state.backtracking==0 ) {push(!pop()); }

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_else_section"

    // $ANTLR start "Pp_endif"
    public final void mPp_endif() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:170:3: ( ( WHITESPACE )? SHARP ( WHITESPACE )? 'endif' Pp_new_line )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:170:5: ( WHITESPACE )? SHARP ( WHITESPACE )? 'endif' Pp_new_line
            {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:170:5: ( WHITESPACE )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\t'||(LA34_0 >= '\u000B' && LA34_0 <= '\f')||LA34_0==' '||LA34_0=='\u00A0'||LA34_0=='\u1680'||LA34_0=='\u180E'||(LA34_0 >= '\u2000' && LA34_0 <= '\u2006')||(LA34_0 >= '\u2008' && LA34_0 <= '\u200A')||LA34_0=='\u202F'||LA34_0=='\u205F'||LA34_0=='\u3000') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:170:5: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            gCSharp4Lexer.mSHARP(); if (state.failed) return ;


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:170:23: ( WHITESPACE )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\t'||(LA35_0 >= '\u000B' && LA35_0 <= '\f')||LA35_0==' '||LA35_0=='\u00A0'||LA35_0=='\u1680'||LA35_0=='\u180E'||(LA35_0 >= '\u2000' && LA35_0 <= '\u2006')||(LA35_0 >= '\u2008' && LA35_0 <= '\u200A')||LA35_0=='\u202F'||LA35_0=='\u205F'||LA35_0=='\u3000') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:170:23: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            match("endif"); if (state.failed) return ;



            mPp_new_line(); if (state.failed) return ;


            if ( state.backtracking==0 ) {boolean p=pop(); /*System.err.println("endif: "+p); System.err.println("head: "+ifStack.peek());*/ }

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_endif"

    // $ANTLR start "Conditional_symbol"
    public final void mConditional_symbol() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:176:3: ( Identifier_or_keyword )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:176:5: Identifier_or_keyword
            {
            gCSharp4Lexer.mIdentifier_or_keyword(); if (state.failed) return ;


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Conditional_symbol"

    // $ANTLR start "Pp_diagnostic"
    public final void mPp_diagnostic() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:179:3: ( ( WHITESPACE )? SHARP ( WHITESPACE )? 'error' Pp_message | ( WHITESPACE )? SHARP ( WHITESPACE )? 'warning' Pp_message )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:179:5: ( WHITESPACE )? SHARP ( WHITESPACE )? 'error' Pp_message
                    {
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:179:5: ( WHITESPACE )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='\t'||(LA36_0 >= '\u000B' && LA36_0 <= '\f')||LA36_0==' '||LA36_0=='\u00A0'||LA36_0=='\u1680'||LA36_0=='\u180E'||(LA36_0 >= '\u2000' && LA36_0 <= '\u2006')||(LA36_0 >= '\u2008' && LA36_0 <= '\u200A')||LA36_0=='\u202F'||LA36_0=='\u205F'||LA36_0=='\u3000') ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:179:5: WHITESPACE
                            {
                            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                            }
                            break;

                    }


                    gCSharp4Lexer.mSHARP(); if (state.failed) return ;


                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:179:23: ( WHITESPACE )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0=='\t'||(LA37_0 >= '\u000B' && LA37_0 <= '\f')||LA37_0==' '||LA37_0=='\u00A0'||LA37_0=='\u1680'||LA37_0=='\u180E'||(LA37_0 >= '\u2000' && LA37_0 <= '\u2006')||(LA37_0 >= '\u2008' && LA37_0 <= '\u200A')||LA37_0=='\u202F'||LA37_0=='\u205F'||LA37_0=='\u3000') ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:179:23: WHITESPACE
                            {
                            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                            }
                            break;

                    }


                    match("error"); if (state.failed) return ;



                    mPp_message(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:180:5: ( WHITESPACE )? SHARP ( WHITESPACE )? 'warning' Pp_message
                    {
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:180:5: ( WHITESPACE )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0=='\t'||(LA38_0 >= '\u000B' && LA38_0 <= '\f')||LA38_0==' '||LA38_0=='\u00A0'||LA38_0=='\u1680'||LA38_0=='\u180E'||(LA38_0 >= '\u2000' && LA38_0 <= '\u2006')||(LA38_0 >= '\u2008' && LA38_0 <= '\u200A')||LA38_0=='\u202F'||LA38_0=='\u205F'||LA38_0=='\u3000') ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:180:5: WHITESPACE
                            {
                            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                            }
                            break;

                    }


                    gCSharp4Lexer.mSHARP(); if (state.failed) return ;


                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:180:23: ( WHITESPACE )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0=='\t'||(LA39_0 >= '\u000B' && LA39_0 <= '\f')||LA39_0==' '||LA39_0=='\u00A0'||LA39_0=='\u1680'||LA39_0=='\u180E'||(LA39_0 >= '\u2000' && LA39_0 <= '\u2006')||(LA39_0 >= '\u2008' && LA39_0 <= '\u200A')||LA39_0=='\u202F'||LA39_0=='\u205F'||LA39_0=='\u3000') ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:180:23: WHITESPACE
                            {
                            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                            }
                            break;

                    }


                    match("warning"); if (state.failed) return ;



                    mPp_message(); if (state.failed) return ;


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_diagnostic"

    // $ANTLR start "Pp_message"
    public final void mPp_message() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:183:3: ( NEW_LINE | WHITESPACE ( Input_character )* NEW_LINE )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='\n'||LA42_0=='\r'||LA42_0=='\u0085'||(LA42_0 >= '\u2028' && LA42_0 <= '\u2029')) ) {
                alt42=1;
            }
            else if ( (LA42_0=='\t'||(LA42_0 >= '\u000B' && LA42_0 <= '\f')||LA42_0==' '||LA42_0=='\u00A0'||LA42_0=='\u1680'||LA42_0=='\u180E'||(LA42_0 >= '\u2000' && LA42_0 <= '\u2006')||(LA42_0 >= '\u2008' && LA42_0 <= '\u200A')||LA42_0=='\u202F'||LA42_0=='\u205F'||LA42_0=='\u3000') ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:183:5: NEW_LINE
                    {
                    gCSharp4Lexer.mNEW_LINE(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:184:5: WHITESPACE ( Input_character )* NEW_LINE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:184:16: ( Input_character )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0 >= '\u0000' && LA41_0 <= '\t')||(LA41_0 >= '\u000B' && LA41_0 <= '\f')||(LA41_0 >= '\u000E' && LA41_0 <= '\u0084')||(LA41_0 >= '\u0086' && LA41_0 <= '\u2027')||(LA41_0 >= '\u202A' && LA41_0 <= '\uFFFF')) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u0084')||(input.LA(1) >= '\u0086' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    gCSharp4Lexer.mNEW_LINE(); if (state.failed) return ;


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_message"

    // $ANTLR start "Pp_region"
    public final void mPp_region() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:188:3: ( Pp_start_region | Pp_end_region )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:188:5: Pp_start_region
                    {
                    mPp_start_region(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:189:5: Pp_end_region
                    {
                    mPp_end_region(); if (state.failed) return ;


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_region"

    // $ANTLR start "Pp_start_region"
    public final void mPp_start_region() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:192:3: ( ( WHITESPACE )? SHARP ( WHITESPACE )? 'region' Pp_message )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:192:5: ( WHITESPACE )? SHARP ( WHITESPACE )? 'region' Pp_message
            {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:192:5: ( WHITESPACE )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0=='\t'||(LA44_0 >= '\u000B' && LA44_0 <= '\f')||LA44_0==' '||LA44_0=='\u00A0'||LA44_0=='\u1680'||LA44_0=='\u180E'||(LA44_0 >= '\u2000' && LA44_0 <= '\u2006')||(LA44_0 >= '\u2008' && LA44_0 <= '\u200A')||LA44_0=='\u202F'||LA44_0=='\u205F'||LA44_0=='\u3000') ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:192:5: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            gCSharp4Lexer.mSHARP(); if (state.failed) return ;


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:192:23: ( WHITESPACE )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='\t'||(LA45_0 >= '\u000B' && LA45_0 <= '\f')||LA45_0==' '||LA45_0=='\u00A0'||LA45_0=='\u1680'||LA45_0=='\u180E'||(LA45_0 >= '\u2000' && LA45_0 <= '\u2006')||(LA45_0 >= '\u2008' && LA45_0 <= '\u200A')||LA45_0=='\u202F'||LA45_0=='\u205F'||LA45_0=='\u3000') ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:192:23: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            match("region"); if (state.failed) return ;



            mPp_message(); if (state.failed) return ;


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_start_region"

    // $ANTLR start "Pp_end_region"
    public final void mPp_end_region() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:195:3: ( ( WHITESPACE )? SHARP ( WHITESPACE )? 'endregion' ( Pp_message )? )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:195:5: ( WHITESPACE )? SHARP ( WHITESPACE )? 'endregion' ( Pp_message )?
            {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:195:5: ( WHITESPACE )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0=='\t'||(LA46_0 >= '\u000B' && LA46_0 <= '\f')||LA46_0==' '||LA46_0=='\u00A0'||LA46_0=='\u1680'||LA46_0=='\u180E'||(LA46_0 >= '\u2000' && LA46_0 <= '\u2006')||(LA46_0 >= '\u2008' && LA46_0 <= '\u200A')||LA46_0=='\u202F'||LA46_0=='\u205F'||LA46_0=='\u3000') ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:195:5: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            gCSharp4Lexer.mSHARP(); if (state.failed) return ;


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:195:23: ( WHITESPACE )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0=='\t'||(LA47_0 >= '\u000B' && LA47_0 <= '\f')||LA47_0==' '||LA47_0=='\u00A0'||LA47_0=='\u1680'||LA47_0=='\u180E'||(LA47_0 >= '\u2000' && LA47_0 <= '\u2006')||(LA47_0 >= '\u2008' && LA47_0 <= '\u200A')||LA47_0=='\u202F'||LA47_0=='\u205F'||LA47_0=='\u3000') ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:195:23: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            match("endregion"); if (state.failed) return ;



            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:195:47: ( Pp_message )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0 >= '\t' && LA48_0 <= '\r')||LA48_0==' '||LA48_0=='\u0085'||LA48_0=='\u00A0'||LA48_0=='\u1680'||LA48_0=='\u180E'||(LA48_0 >= '\u2000' && LA48_0 <= '\u2006')||(LA48_0 >= '\u2008' && LA48_0 <= '\u200A')||(LA48_0 >= '\u2028' && LA48_0 <= '\u2029')||LA48_0=='\u202F'||LA48_0=='\u205F'||LA48_0=='\u3000') ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:195:47: Pp_message
                    {
                    mPp_message(); if (state.failed) return ;


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_end_region"

    // $ANTLR start "Pp_line"
    public final void mPp_line() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:198:3: ( ( WHITESPACE )? SHARP ( WHITESPACE )? 'line' WHITESPACE Line_indicator Pp_new_line )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:198:5: ( WHITESPACE )? SHARP ( WHITESPACE )? 'line' WHITESPACE Line_indicator Pp_new_line
            {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:198:5: ( WHITESPACE )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0=='\t'||(LA49_0 >= '\u000B' && LA49_0 <= '\f')||LA49_0==' '||LA49_0=='\u00A0'||LA49_0=='\u1680'||LA49_0=='\u180E'||(LA49_0 >= '\u2000' && LA49_0 <= '\u2006')||(LA49_0 >= '\u2008' && LA49_0 <= '\u200A')||LA49_0=='\u202F'||LA49_0=='\u205F'||LA49_0=='\u3000') ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:198:5: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            gCSharp4Lexer.mSHARP(); if (state.failed) return ;


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:198:23: ( WHITESPACE )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0=='\t'||(LA50_0 >= '\u000B' && LA50_0 <= '\f')||LA50_0==' '||LA50_0=='\u00A0'||LA50_0=='\u1680'||LA50_0=='\u180E'||(LA50_0 >= '\u2000' && LA50_0 <= '\u2006')||(LA50_0 >= '\u2008' && LA50_0 <= '\u200A')||LA50_0=='\u202F'||LA50_0=='\u205F'||LA50_0=='\u3000') ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:198:23: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            match("line"); if (state.failed) return ;



            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


            mLine_indicator(); if (state.failed) return ;


            mPp_new_line(); if (state.failed) return ;


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_line"

    // $ANTLR start "Line_indicator"
    public final void mLine_indicator() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:201:3: ( Decimal_digits ( WHITESPACE File_name )? | 'default' | 'hidden' )
            int alt52=3;
            switch ( input.LA(1) ) {
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
                alt52=1;
                }
                break;
            case 'd':
                {
                alt52=2;
                }
                break;
            case 'h':
                {
                alt52=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:201:5: Decimal_digits ( WHITESPACE File_name )?
                    {
                    gCSharp4Lexer.mDecimal_digits(); if (state.failed) return ;


                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:201:20: ( WHITESPACE File_name )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0=='\t'||(LA51_0 >= '\u000B' && LA51_0 <= '\f')||LA51_0==' '||LA51_0=='\u00A0'||LA51_0=='\u1680'||LA51_0=='\u180E'||(LA51_0 >= '\u2000' && LA51_0 <= '\u2006')||(LA51_0 >= '\u2008' && LA51_0 <= '\u200A')||LA51_0=='\u202F'||LA51_0=='\u205F'||LA51_0=='\u3000') ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:201:21: WHITESPACE File_name
                            {
                            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                            mFile_name(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:202:5: 'default'
                    {
                    match("default"); if (state.failed) return ;



                    }
                    break;
                case 3 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:203:5: 'hidden'
                    {
                    match("hidden"); if (state.failed) return ;



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Line_indicator"

    // $ANTLR start "File_name"
    public final void mFile_name() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:206:3: ( DOUBLE_QUOTE File_name_characters DOUBLE_QUOTE )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:206:5: DOUBLE_QUOTE File_name_characters DOUBLE_QUOTE
            {
            gCSharp4Lexer.mDOUBLE_QUOTE(); if (state.failed) return ;


            mFile_name_characters(); if (state.failed) return ;


            gCSharp4Lexer.mDOUBLE_QUOTE(); if (state.failed) return ;


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "File_name"

    // $ANTLR start "File_name_characters"
    public final void mFile_name_characters() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:209:3: ( ( File_name_character )+ )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:209:5: ( File_name_character )+
            {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:209:5: ( File_name_character )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0 >= '\u0000' && LA53_0 <= '\t')||(LA53_0 >= '\u000B' && LA53_0 <= '\f')||(LA53_0 >= '\u000E' && LA53_0 <= '!')||(LA53_0 >= '#' && LA53_0 <= '\u0084')||(LA53_0 >= '\u0086' && LA53_0 <= '\u2027')||(LA53_0 >= '\u202A' && LA53_0 <= '\uFFFF')) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\u0084')||(input.LA(1) >= '\u0086' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "File_name_characters"

    // $ANTLR start "File_name_character"
    public final void mFile_name_character() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:213:3: (~ ( NEW_LINE_CHARACTER | DOUBLE_QUOTE ) )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\u0084')||(input.LA(1) >= '\u0086' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // $ANTLR end "File_name_character"

    // $ANTLR start "Pp_pragma"
    public final void mPp_pragma() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:217:3: ( ( WHITESPACE )? SHARP ( WHITESPACE )? 'pragma' Pp_pragma_text )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:217:5: ( WHITESPACE )? SHARP ( WHITESPACE )? 'pragma' Pp_pragma_text
            {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:217:5: ( WHITESPACE )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0=='\t'||(LA54_0 >= '\u000B' && LA54_0 <= '\f')||LA54_0==' '||LA54_0=='\u00A0'||LA54_0=='\u1680'||LA54_0=='\u180E'||(LA54_0 >= '\u2000' && LA54_0 <= '\u2006')||(LA54_0 >= '\u2008' && LA54_0 <= '\u200A')||LA54_0=='\u202F'||LA54_0=='\u205F'||LA54_0=='\u3000') ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:217:5: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            gCSharp4Lexer.mSHARP(); if (state.failed) return ;


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:217:23: ( WHITESPACE )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0=='\t'||(LA55_0 >= '\u000B' && LA55_0 <= '\f')||LA55_0==' '||LA55_0=='\u00A0'||LA55_0=='\u1680'||LA55_0=='\u180E'||(LA55_0 >= '\u2000' && LA55_0 <= '\u2006')||(LA55_0 >= '\u2008' && LA55_0 <= '\u200A')||LA55_0=='\u202F'||LA55_0=='\u205F'||LA55_0=='\u3000') ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:217:23: WHITESPACE
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    }
                    break;

            }


            match("pragma"); if (state.failed) return ;



            mPp_pragma_text(); if (state.failed) return ;


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_pragma"

    // $ANTLR start "Pp_pragma_text"
    public final void mPp_pragma_text() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:220:3: ( ( NEW_LINE )? | WHITESPACE ( Input_characters )? ( NEW_LINE )? )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0=='\t'||(LA59_0 >= '\u000B' && LA59_0 <= '\f')||LA59_0==' '||LA59_0=='\u00A0'||LA59_0=='\u1680'||LA59_0=='\u180E'||(LA59_0 >= '\u2000' && LA59_0 <= '\u2006')||(LA59_0 >= '\u2008' && LA59_0 <= '\u200A')||LA59_0=='\u202F'||LA59_0=='\u205F'||LA59_0=='\u3000') ) {
                alt59=2;
            }
            else {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:220:5: ( NEW_LINE )?
                    {
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:220:5: ( NEW_LINE )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0=='\n'||LA56_0=='\r'||LA56_0=='\u0085'||(LA56_0 >= '\u2028' && LA56_0 <= '\u2029')) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:220:5: NEW_LINE
                            {
                            gCSharp4Lexer.mNEW_LINE(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:221:5: WHITESPACE ( Input_characters )? ( NEW_LINE )?
                    {
                    gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:221:16: ( Input_characters )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0 >= '\u0000' && LA57_0 <= '\t')||(LA57_0 >= '\u000B' && LA57_0 <= '\f')||(LA57_0 >= '\u000E' && LA57_0 <= '\u0084')||(LA57_0 >= '\u0086' && LA57_0 <= '\u2027')||(LA57_0 >= '\u202A' && LA57_0 <= '\uFFFF')) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:221:16: Input_characters
                            {
                            gCSharp4Lexer.mInput_characters(); if (state.failed) return ;


                            }
                            break;

                    }


                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:221:34: ( NEW_LINE )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0=='\n'||LA58_0=='\r'||LA58_0=='\u0085'||(LA58_0 >= '\u2028' && LA58_0 <= '\u2029')) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:221:34: NEW_LINE
                            {
                            gCSharp4Lexer.mNEW_LINE(); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pp_pragma_text"

    // $ANTLR start "SkiPped_section_part"
    public final void mSkiPped_section_part() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:230:3: ( ( WHITESPACE )? ( SkiPped_characters )? NEW_LINE | Pp_directive )
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:230:5: ( WHITESPACE )? ( SkiPped_characters )? NEW_LINE
                    {
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:230:5: ( WHITESPACE )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0=='\t'||(LA60_0 >= '\u000B' && LA60_0 <= '\f')||LA60_0==' '||LA60_0=='\u00A0'||LA60_0=='\u1680'||LA60_0=='\u180E'||(LA60_0 >= '\u2000' && LA60_0 <= '\u2006')||(LA60_0 >= '\u2008' && LA60_0 <= '\u200A')||LA60_0=='\u202F'||LA60_0=='\u205F'||LA60_0=='\u3000') ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:230:5: WHITESPACE
                            {
                            gCSharp4Lexer.mWHITESPACE(); if (state.failed) return ;


                            }
                            break;

                    }


                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:230:17: ( SkiPped_characters )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0 >= '\u0000' && LA61_0 <= '\b')||(LA61_0 >= '\u000E' && LA61_0 <= '\u001F')||(LA61_0 >= '!' && LA61_0 <= '\"')||(LA61_0 >= '$' && LA61_0 <= '\u0084')||(LA61_0 >= '\u0086' && LA61_0 <= '\u009F')||(LA61_0 >= '\u00A1' && LA61_0 <= '\u167F')||(LA61_0 >= '\u1681' && LA61_0 <= '\u180D')||(LA61_0 >= '\u180F' && LA61_0 <= '\u1FFF')||LA61_0=='\u2007'||(LA61_0 >= '\u200B' && LA61_0 <= '\u2027')||(LA61_0 >= '\u202A' && LA61_0 <= '\u202E')||(LA61_0 >= '\u2030' && LA61_0 <= '\u205E')||(LA61_0 >= '\u2060' && LA61_0 <= '\u2FFF')||(LA61_0 >= '\u3001' && LA61_0 <= '\uFFFF')) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:230:17: SkiPped_characters
                            {
                            mSkiPped_characters(); if (state.failed) return ;


                            }
                            break;

                    }


                    gCSharp4Lexer.mNEW_LINE(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:231:5: Pp_directive
                    {
                    mPp_directive(); if (state.failed) return ;


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SkiPped_section_part"

    // $ANTLR start "SkiPped_characters"
    public final void mSkiPped_characters() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:234:3: ( Not_number_sign ( Input_character )* )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:234:5: Not_number_sign ( Input_character )*
            {
            mNot_number_sign(); if (state.failed) return ;


            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:234:21: ( Input_character )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0 >= '\u0000' && LA63_0 <= '\t')||(LA63_0 >= '\u000B' && LA63_0 <= '\f')||(LA63_0 >= '\u000E' && LA63_0 <= '\u0084')||(LA63_0 >= '\u0086' && LA63_0 <= '\u2027')||(LA63_0 >= '\u202A' && LA63_0 <= '\uFFFF')) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u0084')||(input.LA(1) >= '\u0086' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SkiPped_characters"

    // $ANTLR start "Not_number_sign"
    public final void mNot_number_sign() throws RecognitionException {
        try {
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:239:3: (~ ( Whitespace_character | NEW_LINE_CHARACTER | SHARP ) )
            // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '\"')||(input.LA(1) >= '$' && input.LA(1) <= '\u0084')||(input.LA(1) >= '\u0086' && input.LA(1) <= '\u009F')||(input.LA(1) >= '\u00A1' && input.LA(1) <= '\u167F')||(input.LA(1) >= '\u1681' && input.LA(1) <= '\u180D')||(input.LA(1) >= '\u180F' && input.LA(1) <= '\u1FFF')||input.LA(1)=='\u2007'||(input.LA(1) >= '\u200B' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\u202E')||(input.LA(1) >= '\u2030' && input.LA(1) <= '\u205E')||(input.LA(1) >= '\u2060' && input.LA(1) <= '\u2FFF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // $ANTLR end "Not_number_sign"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:1:8: ( Pp_directive | CSharp4Lexer. Tokens )
        int alt64=2;
        alt64 = dfa64.predict(input);
        switch (alt64) {
            case 1 :
                // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:1:10: Pp_directive
                {
                mPp_directive(); if (state.failed) return ;


                }
                break;
            case 2 :
                // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:1:23: CSharp4Lexer. Tokens
                {
                gCSharp4Lexer.mTokens(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_CSharp4PreProcessor
    public final void synpred1_CSharp4PreProcessor_fragment() throws RecognitionException {
        // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:131:5: ( TRUE )
        // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:131:6: TRUE
        {
        gCSharp4Lexer.mTRUE(); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred1_CSharp4PreProcessor

    // $ANTLR start synpred2_CSharp4PreProcessor
    public final void synpred2_CSharp4PreProcessor_fragment() throws RecognitionException {
        // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:132:5: ( FALSE )
        // C:\\Users\\chw\\workspace-masterthesis\\CSharpGrammar\\grammars\\CSharp4PreProcessor.g:132:6: FALSE
        {
        gCSharp4Lexer.mFALSE(); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred2_CSharp4PreProcessor

    public final boolean synpred1_CSharp4PreProcessor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_CSharp4PreProcessor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_CSharp4PreProcessor() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_CSharp4PreProcessor_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA1_eotS =
        "\15\uffff";
    static final String DFA1_eofS =
        "\15\uffff";
    static final String DFA1_minS =
        "\4\11\2\uffff\1\154\4\uffff\1\144\1\151";
    static final String DFA1_maxS =
        "\4\u3000\2\uffff\1\162\4\uffff\1\144\1\162";
    static final String DFA1_acceptS =
        "\4\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\2\uffff";
    static final String DFA1_specialS =
        "\15\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\uffff\2\1\23\uffff\1\1\2\uffff\1\2\174\uffff\1\1\u15df"+
            "\uffff\1\1\u018d\uffff\1\1\u07f1\uffff\7\1\1\uffff\3\1\44\uffff"+
            "\1\1\57\uffff\1\1\u0fa0\uffff\1\1",
            "\1\1\1\uffff\2\1\23\uffff\1\1\2\uffff\1\2\174\uffff\1\1\u15df"+
            "\uffff\1\1\u018d\uffff\1\1\u07f1\uffff\7\1\1\uffff\3\1\44\uffff"+
            "\1\1\57\uffff\1\1\u0fa0\uffff\1\1",
            "\1\3\1\uffff\2\3\23\uffff\1\3\103\uffff\1\4\1\6\3\uffff\1\5"+
            "\2\uffff\1\7\3\uffff\1\12\1\uffff\1\11\2\uffff\1\4\1\uffff\1"+
            "\10\50\uffff\1\3\u15df\uffff\1\3\u018d\uffff\1\3\u07f1\uffff"+
            "\7\3\1\uffff\3\3\44\uffff\1\3\57\uffff\1\3\u0fa0\uffff\1\3",
            "\1\3\1\uffff\2\3\23\uffff\1\3\103\uffff\1\4\1\6\3\uffff\1\5"+
            "\2\uffff\1\7\3\uffff\1\12\1\uffff\1\11\2\uffff\1\4\1\uffff\1"+
            "\10\50\uffff\1\3\u15df\uffff\1\3\u018d\uffff\1\3\u07f1\uffff"+
            "\7\3\1\uffff\3\3\44\uffff\1\3\57\uffff\1\3\u0fa0\uffff\1\3",
            "",
            "",
            "\1\5\1\uffff\1\13\3\uffff\1\10",
            "",
            "",
            "",
            "",
            "\1\14",
            "\1\5\10\uffff\1\11"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "96:5: ( Pp_declaration | Pp_conditional | Pp_line | Pp_diagnostic | Pp_region | Pp_pragma )";
        }
    }
    static final String DFA24_eotS =
        "\6\uffff";
    static final String DFA24_eofS =
        "\6\uffff";
    static final String DFA24_minS =
        "\4\11\2\uffff";
    static final String DFA24_maxS =
        "\4\u3000\2\uffff";
    static final String DFA24_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA24_specialS =
        "\6\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\1\uffff\2\1\23\uffff\1\1\2\uffff\1\2\174\uffff\1\1\u15df"+
            "\uffff\1\1\u018d\uffff\1\1\u07f1\uffff\7\1\1\uffff\3\1\44\uffff"+
            "\1\1\57\uffff\1\1\u0fa0\uffff\1\1",
            "\1\1\1\uffff\2\1\23\uffff\1\1\2\uffff\1\2\174\uffff\1\1\u15df"+
            "\uffff\1\1\u018d\uffff\1\1\u07f1\uffff\7\1\1\uffff\3\1\44\uffff"+
            "\1\1\57\uffff\1\1\u0fa0\uffff\1\1",
            "\1\3\1\uffff\2\3\23\uffff\1\3\103\uffff\1\4\20\uffff\1\5\52"+
            "\uffff\1\3\u15df\uffff\1\3\u018d\uffff\1\3\u07f1\uffff\7\3\1"+
            "\uffff\3\3\44\uffff\1\3\57\uffff\1\3\u0fa0\uffff\1\3",
            "\1\3\1\uffff\2\3\23\uffff\1\3\103\uffff\1\4\20\uffff\1\5\52"+
            "\uffff\1\3\u15df\uffff\1\3\u018d\uffff\1\3\u07f1\uffff\7\3\1"+
            "\uffff\3\3\44\uffff\1\3\57\uffff\1\3\u0fa0\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "136:10: fragment Pp_declaration : ( ( WHITESPACE )? SHARP ( WHITESPACE )? 'define' WHITESPACE Conditional_symbol Pp_new_line | ( WHITESPACE )? SHARP ( WHITESPACE )? 'undef' WHITESPACE Conditional_symbol Pp_new_line );";
        }
    }
    static final String DFA27_eotS =
        "\12\uffff";
    static final String DFA27_eofS =
        "\12\uffff";
    static final String DFA27_minS =
        "\4\11\1\uffff\1\154\1\151\3\uffff";
    static final String DFA27_maxS =
        "\4\u3000\1\uffff\1\156\1\163\3\uffff";
    static final String DFA27_acceptS =
        "\4\uffff\1\1\2\uffff\1\4\1\2\1\3";
    static final String DFA27_specialS =
        "\12\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\1\uffff\2\1\23\uffff\1\1\2\uffff\1\2\174\uffff\1\1\u15df"+
            "\uffff\1\1\u018d\uffff\1\1\u07f1\uffff\7\1\1\uffff\3\1\44\uffff"+
            "\1\1\57\uffff\1\1\u0fa0\uffff\1\1",
            "\1\1\1\uffff\2\1\23\uffff\1\1\2\uffff\1\2\174\uffff\1\1\u15df"+
            "\uffff\1\1\u018d\uffff\1\1\u07f1\uffff\7\1\1\uffff\3\1\44\uffff"+
            "\1\1\57\uffff\1\1\u0fa0\uffff\1\1",
            "\1\3\1\uffff\2\3\23\uffff\1\3\104\uffff\1\5\3\uffff\1\4\66"+
            "\uffff\1\3\u15df\uffff\1\3\u018d\uffff\1\3\u07f1\uffff\7\3\1"+
            "\uffff\3\3\44\uffff\1\3\57\uffff\1\3\u0fa0\uffff\1\3",
            "\1\3\1\uffff\2\3\23\uffff\1\3\104\uffff\1\5\3\uffff\1\4\66"+
            "\uffff\1\3\u15df\uffff\1\3\u018d\uffff\1\3\u07f1\uffff\7\3\1"+
            "\uffff\3\3\44\uffff\1\3\57\uffff\1\3\u0fa0\uffff\1\3",
            "",
            "\1\6\1\uffff\1\7",
            "\1\10\11\uffff\1\11",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "146:10: fragment Pp_conditional : ( Pp_if_section | Pp_elif_section | Pp_else_section | Pp_endif );";
        }
    }
    static final String DFA40_eotS =
        "\6\uffff";
    static final String DFA40_eofS =
        "\6\uffff";
    static final String DFA40_minS =
        "\4\11\2\uffff";
    static final String DFA40_maxS =
        "\4\u3000\2\uffff";
    static final String DFA40_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA40_specialS =
        "\6\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\1\uffff\2\1\23\uffff\1\1\2\uffff\1\2\174\uffff\1\1\u15df"+
            "\uffff\1\1\u018d\uffff\1\1\u07f1\uffff\7\1\1\uffff\3\1\44\uffff"+
            "\1\1\57\uffff\1\1\u0fa0\uffff\1\1",
            "\1\1\1\uffff\2\1\23\uffff\1\1\2\uffff\1\2\174\uffff\1\1\u15df"+
            "\uffff\1\1\u018d\uffff\1\1\u07f1\uffff\7\1\1\uffff\3\1\44\uffff"+
            "\1\1\57\uffff\1\1\u0fa0\uffff\1\1",
            "\1\3\1\uffff\2\3\23\uffff\1\3\104\uffff\1\4\21\uffff\1\5\50"+
            "\uffff\1\3\u15df\uffff\1\3\u018d\uffff\1\3\u07f1\uffff\7\3\1"+
            "\uffff\3\3\44\uffff\1\3\57\uffff\1\3\u0fa0\uffff\1\3",
            "\1\3\1\uffff\2\3\23\uffff\1\3\104\uffff\1\4\21\uffff\1\5\50"+
            "\uffff\1\3\u15df\uffff\1\3\u018d\uffff\1\3\u07f1\uffff\7\3\1"+
            "\uffff\3\3\44\uffff\1\3\57\uffff\1\3\u0fa0\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "178:10: fragment Pp_diagnostic : ( ( WHITESPACE )? SHARP ( WHITESPACE )? 'error' Pp_message | ( WHITESPACE )? SHARP ( WHITESPACE )? 'warning' Pp_message );";
        }
    }
    static final String DFA43_eotS =
        "\6\uffff";
    static final String DFA43_eofS =
        "\6\uffff";
    static final String DFA43_minS =
        "\4\11\2\uffff";
    static final String DFA43_maxS =
        "\4\u3000\2\uffff";
    static final String DFA43_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA43_specialS =
        "\6\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1\1\uffff\2\1\23\uffff\1\1\2\uffff\1\2\174\uffff\1\1\u15df"+
            "\uffff\1\1\u018d\uffff\1\1\u07f1\uffff\7\1\1\uffff\3\1\44\uffff"+
            "\1\1\57\uffff\1\1\u0fa0\uffff\1\1",
            "\1\1\1\uffff\2\1\23\uffff\1\1\2\uffff\1\2\174\uffff\1\1\u15df"+
            "\uffff\1\1\u018d\uffff\1\1\u07f1\uffff\7\1\1\uffff\3\1\44\uffff"+
            "\1\1\57\uffff\1\1\u0fa0\uffff\1\1",
            "\1\3\1\uffff\2\3\23\uffff\1\3\104\uffff\1\5\14\uffff\1\4\55"+
            "\uffff\1\3\u15df\uffff\1\3\u018d\uffff\1\3\u07f1\uffff\7\3\1"+
            "\uffff\3\3\44\uffff\1\3\57\uffff\1\3\u0fa0\uffff\1\3",
            "\1\3\1\uffff\2\3\23\uffff\1\3\104\uffff\1\5\14\uffff\1\4\55"+
            "\uffff\1\3\u15df\uffff\1\3\u018d\uffff\1\3\u07f1\uffff\7\3\1"+
            "\uffff\3\3\44\uffff\1\3\57\uffff\1\3\u0fa0\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "187:10: fragment Pp_region : ( Pp_start_region | Pp_end_region );";
        }
    }
    static final String DFA62_eotS =
        "\4\uffff";
    static final String DFA62_eofS =
        "\4\uffff";
    static final String DFA62_minS =
        "\2\0\2\uffff";
    static final String DFA62_maxS =
        "\2\uffff\2\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA62_specialS =
        "\1\1\1\0\2\uffff}>";
    static final String[] DFA62_transitionS = {
            "\11\2\1\1\1\2\2\1\23\2\1\1\2\2\1\3\174\2\1\1\u15df\2\1\1\u018d"+
            "\2\1\1\u07f1\2\7\1\1\2\3\1\44\2\1\1\57\2\1\1\u0fa0\2\1\1\ucfff"+
            "\2",
            "\11\2\1\1\1\2\2\1\23\2\1\1\2\2\1\3\174\2\1\1\u15df\2\1\1\u018d"+
            "\2\1\1\u07f1\2\7\1\1\2\3\1\44\2\1\1\57\2\1\1\u0fa0\2\1\1\ucfff"+
            "\2",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "229:10: fragment SkiPped_section_part : ( ( WHITESPACE )? ( SkiPped_characters )? NEW_LINE | Pp_directive );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                        s = -1;
                        if ( ((LA62_1 >= '\u0000' && LA62_1 <= '\b')||LA62_1=='\n'||(LA62_1 >= '\r' && LA62_1 <= '\u001F')||(LA62_1 >= '!' && LA62_1 <= '\"')||(LA62_1 >= '$' && LA62_1 <= '\u009F')||(LA62_1 >= '\u00A1' && LA62_1 <= '\u167F')||(LA62_1 >= '\u1681' && LA62_1 <= '\u180D')||(LA62_1 >= '\u180F' && LA62_1 <= '\u1FFF')||LA62_1=='\u2007'||(LA62_1 >= '\u200B' && LA62_1 <= '\u202E')||(LA62_1 >= '\u2030' && LA62_1 <= '\u205E')||(LA62_1 >= '\u2060' && LA62_1 <= '\u2FFF')||(LA62_1 >= '\u3001' && LA62_1 <= '\uFFFF')) ) {s = 2;}

                        else if ( (LA62_1=='\t'||(LA62_1 >= '\u000B' && LA62_1 <= '\f')||LA62_1==' '||LA62_1=='\u00A0'||LA62_1=='\u1680'||LA62_1=='\u180E'||(LA62_1 >= '\u2000' && LA62_1 <= '\u2006')||(LA62_1 >= '\u2008' && LA62_1 <= '\u200A')||LA62_1=='\u202F'||LA62_1=='\u205F'||LA62_1=='\u3000') ) {s = 1;}

                        else if ( (LA62_1=='#') ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA62_0 = input.LA(1);

                        s = -1;
                        if ( (LA62_0=='\t'||(LA62_0 >= '\u000B' && LA62_0 <= '\f')||LA62_0==' '||LA62_0=='\u00A0'||LA62_0=='\u1680'||LA62_0=='\u180E'||(LA62_0 >= '\u2000' && LA62_0 <= '\u2006')||(LA62_0 >= '\u2008' && LA62_0 <= '\u200A')||LA62_0=='\u202F'||LA62_0=='\u205F'||LA62_0=='\u3000') ) {s = 1;}

                        else if ( ((LA62_0 >= '\u0000' && LA62_0 <= '\b')||LA62_0=='\n'||(LA62_0 >= '\r' && LA62_0 <= '\u001F')||(LA62_0 >= '!' && LA62_0 <= '\"')||(LA62_0 >= '$' && LA62_0 <= '\u009F')||(LA62_0 >= '\u00A1' && LA62_0 <= '\u167F')||(LA62_0 >= '\u1681' && LA62_0 <= '\u180D')||(LA62_0 >= '\u180F' && LA62_0 <= '\u1FFF')||LA62_0=='\u2007'||(LA62_0 >= '\u200B' && LA62_0 <= '\u202E')||(LA62_0 >= '\u2030' && LA62_0 <= '\u205E')||(LA62_0 >= '\u2060' && LA62_0 <= '\u2FFF')||(LA62_0 >= '\u3001' && LA62_0 <= '\uFFFF')) ) {s = 2;}

                        else if ( (LA62_0=='#') ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA64_eotS =
        "\1\uffff\2\3\2\uffff";
    static final String DFA64_eofS =
        "\5\uffff";
    static final String DFA64_minS =
        "\3\11\2\uffff";
    static final String DFA64_maxS =
        "\3\u3000\2\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA64_specialS =
        "\5\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\1\3\2\1\1\3\22\uffff\1\1\2\3\1\2\1\uffff\73\3\1\uffff\36"+
            "\3\6\uffff\1\3\32\uffff\1\1\37\uffff\37\3\u00dc\uffff\1\3\4"+
            "\uffff\4\3\1\uffff\1\3\2\uffff\1\3\2\uffff\1\3\46\uffff\1\3"+
            "\u00a1\uffff\1\3\33\uffff\77\3\u1391\uffff\1\1\155\uffff\3\3"+
            "\u011d\uffff\1\1\u07f1\uffff\7\1\1\uffff\3\1\35\uffff\2\3\5"+
            "\uffff\1\1\57\uffff\1\1\u0100\uffff\20\3\u0e90\uffff\1\1",
            "\1\1\1\uffff\2\1\23\uffff\1\1\2\uffff\1\4\174\uffff\1\1\u15df"+
            "\uffff\1\1\u018d\uffff\1\1\u07f1\uffff\7\1\1\uffff\3\1\44\uffff"+
            "\1\1\57\uffff\1\1\u0fa0\uffff\1\1",
            "\1\4\1\uffff\2\4\23\uffff\1\4\103\uffff\2\4\3\uffff\1\4\2\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\50\uffff"+
            "\1\4\u15df\uffff\1\4\u018d\uffff\1\4\u07f1\uffff\7\4\1\uffff"+
            "\3\4\44\uffff\1\4\57\uffff\1\4\u0fa0\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Pp_directive | CSharp4Lexer. Tokens );";
        }
    }
 

}