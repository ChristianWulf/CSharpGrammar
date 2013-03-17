// $ANTLR 3.4 Unicode.g 2013-03-17 19:58:15

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
public class CSharp4PreProcessor_CSharp4Lexer_Unicode extends Lexer {
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
    public static final int UNICODE_CLASS_CC=200;
    public static final int UNICODE_CLASS_CF=201;
    public static final int UNICODE_CLASS_CO=202;
    public static final int UNICODE_CLASS_CS=203;
    public static final int UNICODE_CLASS_LL=204;
    public static final int UNICODE_CLASS_LM=205;
    public static final int UNICODE_CLASS_LO=206;
    public static final int UNICODE_CLASS_LT=207;
    public static final int UNICODE_CLASS_LU=208;
    public static final int UNICODE_CLASS_MC=209;
    public static final int UNICODE_CLASS_ME=210;
    public static final int UNICODE_CLASS_MN=211;
    public static final int UNICODE_CLASS_ND=212;
    public static final int UNICODE_CLASS_NL=213;
    public static final int UNICODE_CLASS_NO=214;
    public static final int UNICODE_CLASS_PC=215;
    public static final int UNICODE_CLASS_PD=216;
    public static final int UNICODE_CLASS_PE=217;
    public static final int UNICODE_CLASS_PF=218;
    public static final int UNICODE_CLASS_PI=219;
    public static final int UNICODE_CLASS_PO=220;
    public static final int UNICODE_CLASS_PS=221;
    public static final int UNICODE_CLASS_SC=222;
    public static final int UNICODE_CLASS_SK=223;
    public static final int UNICODE_CLASS_SM=224;
    public static final int UNICODE_CLASS_SO=225;
    public static final int UNICODE_CLASS_ZL=226;
    public static final int UNICODE_CLASS_ZP=227;
    public static final int UNICODE_CLASS_ZS=228;
    public static final int UNSAFE=229;
    public static final int USHORT=230;
    public static final int USING=231;
    public static final int Unicode_escape_sequence=232;
    public static final int VIRTUAL=233;
    public static final int VOID=234;
    public static final int VOLATILE=235;
    public static final int Verbatim_string_literal=236;
    public static final int Verbatim_string_literal_character=237;
    public static final int WHILE=238;
    public static final int WHITESPACE=239;
    public static final int Whitespace_character=240;
    public static final int Whitespace_characters=241;

    // delegates
    // delegators
    public CSharp4PreProcessor gCSharp4PreProcessor;
    public CSharp4PreProcessor_CSharp4Lexer gCSharp4Lexer;
    public CSharp4PreProcessor_CSharp4Lexer gParent;
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CSharp4PreProcessor_CSharp4Lexer_Unicode() {} 
    public CSharp4PreProcessor_CSharp4Lexer_Unicode(CharStream input, CSharp4PreProcessor gCSharp4PreProcessor, CSharp4PreProcessor_CSharp4Lexer gCSharp4Lexer) {
        this(input, new RecognizerSharedState(), gCSharp4PreProcessor, gCSharp4Lexer);
    }
    public CSharp4PreProcessor_CSharp4Lexer_Unicode(CharStream input, RecognizerSharedState state, CSharp4PreProcessor gCSharp4PreProcessor, CSharp4PreProcessor_CSharp4Lexer gCSharp4Lexer) {
        super(input,state);
        this.gCSharp4PreProcessor = gCSharp4PreProcessor;
        this.gCSharp4Lexer = gCSharp4Lexer;
        gParent = gCSharp4Lexer;
    }
    public String getGrammarFileName() { return "Unicode.g"; }

    // $ANTLR start "UNICODE_CLASS_CC"
    public final void mUNICODE_CLASS_CC() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_CC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:12:17: ( '\\u0000' .. '\\u001F' | '\\u007F' .. '\\u009F' )
            // Unicode.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\u001F')||(input.LA(1) >= '\u007F' && input.LA(1) <= '\u009F') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_CC"

    // $ANTLR start "UNICODE_CLASS_CF"
    public final void mUNICODE_CLASS_CF() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_CF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:16:17: ( '\\u00AD' | '\\u0600' .. '\\u0604' | '\\u06DD' | '\\u070F' | '\\u200B' .. '\\u200F' | '\\u202A' .. '\\u202E' | '\\u2060' .. '\\u2064' | '\\u206A' .. '\\u206F' | '\\uFEFF' | '\\uFFF9' .. '\\uFFFB' )
            // Unicode.g:
            {
            if ( input.LA(1)=='\u00AD'||(input.LA(1) >= '\u0600' && input.LA(1) <= '\u0604')||input.LA(1)=='\u06DD'||input.LA(1)=='\u070F'||(input.LA(1) >= '\u200B' && input.LA(1) <= '\u200F')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\u202E')||(input.LA(1) >= '\u2060' && input.LA(1) <= '\u2064')||(input.LA(1) >= '\u206A' && input.LA(1) <= '\u206F')||input.LA(1)=='\uFEFF'||(input.LA(1) >= '\uFFF9' && input.LA(1) <= '\uFFFB') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_CF"

    // $ANTLR start "UNICODE_CLASS_CO"
    public final void mUNICODE_CLASS_CO() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_CO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:28:17: ( '\\uE000' | '\\uF8FF' )
            // Unicode.g:
            {
            if ( input.LA(1)=='\uE000'||input.LA(1)=='\uF8FF' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_CO"

    // $ANTLR start "UNICODE_CLASS_CS"
    public final void mUNICODE_CLASS_CS() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_CS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:32:17: ( '\\uD800' | '\\uDB7F' | '\\uDB80' | '\\uDBFF' | '\\uDC00' | '\\uDFFF' )
            // Unicode.g:
            {
            if ( input.LA(1)=='\uD800'||(input.LA(1) >= '\uDB7F' && input.LA(1) <= '\uDB80')||(input.LA(1) >= '\uDBFF' && input.LA(1) <= '\uDC00')||input.LA(1)=='\uDFFF' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_CS"

    // $ANTLR start "UNICODE_CLASS_LL"
    public final void mUNICODE_CLASS_LL() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_LL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:40:17: ( '\\u0061' .. '\\u007A' | '\\u00B5' | '\\u00DF' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' | '\\u0101' | '\\u0103' | '\\u0105' | '\\u0107' | '\\u0109' | '\\u010B' | '\\u010D' | '\\u010F' | '\\u0111' | '\\u0113' | '\\u0115' | '\\u0117' | '\\u0119' | '\\u011B' | '\\u011D' | '\\u011F' | '\\u0121' | '\\u0123' | '\\u0125' | '\\u0127' | '\\u0129' | '\\u012B' | '\\u012D' | '\\u012F' | '\\u0131' | '\\u0133' | '\\u0135' | '\\u0137' | '\\u0138' | '\\u013A' | '\\u013C' | '\\u013E' | '\\u0140' | '\\u0142' | '\\u0144' | '\\u0146' | '\\u0148' | '\\u0149' | '\\u014B' | '\\u014D' | '\\u014F' | '\\u0151' | '\\u0153' | '\\u0155' | '\\u0157' | '\\u0159' | '\\u015B' | '\\u015D' | '\\u015F' | '\\u0161' | '\\u0163' | '\\u0165' | '\\u0167' | '\\u0169' | '\\u016B' | '\\u016D' | '\\u016F' | '\\u0171' | '\\u0173' | '\\u0175' | '\\u0177' | '\\u017A' | '\\u017C' | '\\u017E' .. '\\u0180' | '\\u0183' | '\\u0185' | '\\u0188' | '\\u018C' | '\\u018D' | '\\u0192' | '\\u0195' | '\\u0199' .. '\\u019B' | '\\u019E' | '\\u01A1' | '\\u01A3' | '\\u01A5' | '\\u01A8' | '\\u01AA' | '\\u01AB' | '\\u01AD' | '\\u01B0' | '\\u01B4' | '\\u01B6' | '\\u01B9' | '\\u01BA' | '\\u01BD' .. '\\u01BF' | '\\u01C6' | '\\u01C9' | '\\u01CC' | '\\u01CE' | '\\u01D0' | '\\u01D2' | '\\u01D4' | '\\u01D6' | '\\u01D8' | '\\u01DA' | '\\u01DC' | '\\u01DD' | '\\u01DF' | '\\u01E1' | '\\u01E3' | '\\u01E5' | '\\u01E7' | '\\u01E9' | '\\u01EB' | '\\u01ED' | '\\u01EF' | '\\u01F0' | '\\u01F3' | '\\u01F5' | '\\u01F9' | '\\u01FB' | '\\u01FD' | '\\u01FF' | '\\u0201' | '\\u0203' | '\\u0205' | '\\u0207' | '\\u0209' | '\\u020B' | '\\u020D' | '\\u020F' | '\\u0211' | '\\u0213' | '\\u0215' | '\\u0217' | '\\u0219' | '\\u021B' | '\\u021D' | '\\u021F' | '\\u0221' | '\\u0223' | '\\u0225' | '\\u0227' | '\\u0229' | '\\u022B' | '\\u022D' | '\\u022F' | '\\u0231' | '\\u0233' .. '\\u0239' | '\\u023C' | '\\u023F' | '\\u0240' | '\\u0242' | '\\u0247' | '\\u0249' | '\\u024B' | '\\u024D' | '\\u024F' .. '\\u0293' | '\\u0295' .. '\\u02AF' | '\\u0371' | '\\u0373' | '\\u0377' | '\\u037B' .. '\\u037D' | '\\u0390' | '\\u03AC' .. '\\u03CE' | '\\u03D0' | '\\u03D1' | '\\u03D5' .. '\\u03D7' | '\\u03D9' | '\\u03DB' | '\\u03DD' | '\\u03DF' | '\\u03E1' | '\\u03E3' | '\\u03E5' | '\\u03E7' | '\\u03E9' | '\\u03EB' | '\\u03ED' | '\\u03EF' .. '\\u03F3' | '\\u03F5' | '\\u03F8' | '\\u03FB' | '\\u03FC' | '\\u0430' .. '\\u045F' | '\\u0461' | '\\u0463' | '\\u0465' | '\\u0467' | '\\u0469' | '\\u046B' | '\\u046D' | '\\u046F' | '\\u0471' | '\\u0473' | '\\u0475' | '\\u0477' | '\\u0479' | '\\u047B' | '\\u047D' | '\\u047F' | '\\u0481' | '\\u048B' | '\\u048D' | '\\u048F' | '\\u0491' | '\\u0493' | '\\u0495' | '\\u0497' | '\\u0499' | '\\u049B' | '\\u049D' | '\\u049F' | '\\u04A1' | '\\u04A3' | '\\u04A5' | '\\u04A7' | '\\u04A9' | '\\u04AB' | '\\u04AD' | '\\u04AF' | '\\u04B1' | '\\u04B3' | '\\u04B5' | '\\u04B7' | '\\u04B9' | '\\u04BB' | '\\u04BD' | '\\u04BF' | '\\u04C2' | '\\u04C4' | '\\u04C6' | '\\u04C8' | '\\u04CA' | '\\u04CC' | '\\u04CE' | '\\u04CF' | '\\u04D1' | '\\u04D3' | '\\u04D5' | '\\u04D7' | '\\u04D9' | '\\u04DB' | '\\u04DD' | '\\u04DF' | '\\u04E1' | '\\u04E3' | '\\u04E5' | '\\u04E7' | '\\u04E9' | '\\u04EB' | '\\u04ED' | '\\u04EF' | '\\u04F1' | '\\u04F3' | '\\u04F5' | '\\u04F7' | '\\u04F9' | '\\u04FB' | '\\u04FD' | '\\u04FF' | '\\u0501' | '\\u0503' | '\\u0505' | '\\u0507' | '\\u0509' | '\\u050B' | '\\u050D' | '\\u050F' | '\\u0511' | '\\u0513' | '\\u0515' | '\\u0517' | '\\u0519' | '\\u051B' | '\\u051D' | '\\u051F' | '\\u0521' | '\\u0523' | '\\u0525' | '\\u0527' | '\\u0561' .. '\\u0587' | '\\u1D00' .. '\\u1D2B' | '\\u1D6B' .. '\\u1D77' | '\\u1D79' .. '\\u1D9A' | '\\u1E01' | '\\u1E03' | '\\u1E05' | '\\u1E07' | '\\u1E09' | '\\u1E0B' | '\\u1E0D' | '\\u1E0F' | '\\u1E11' | '\\u1E13' | '\\u1E15' | '\\u1E17' | '\\u1E19' | '\\u1E1B' | '\\u1E1D' | '\\u1E1F' | '\\u1E21' | '\\u1E23' | '\\u1E25' | '\\u1E27' | '\\u1E29' | '\\u1E2B' | '\\u1E2D' | '\\u1E2F' | '\\u1E31' | '\\u1E33' | '\\u1E35' | '\\u1E37' | '\\u1E39' | '\\u1E3B' | '\\u1E3D' | '\\u1E3F' | '\\u1E41' | '\\u1E43' | '\\u1E45' | '\\u1E47' | '\\u1E49' | '\\u1E4B' | '\\u1E4D' | '\\u1E4F' | '\\u1E51' | '\\u1E53' | '\\u1E55' | '\\u1E57' | '\\u1E59' | '\\u1E5B' | '\\u1E5D' | '\\u1E5F' | '\\u1E61' | '\\u1E63' | '\\u1E65' | '\\u1E67' | '\\u1E69' | '\\u1E6B' | '\\u1E6D' | '\\u1E6F' | '\\u1E71' | '\\u1E73' | '\\u1E75' | '\\u1E77' | '\\u1E79' | '\\u1E7B' | '\\u1E7D' | '\\u1E7F' | '\\u1E81' | '\\u1E83' | '\\u1E85' | '\\u1E87' | '\\u1E89' | '\\u1E8B' | '\\u1E8D' | '\\u1E8F' | '\\u1E91' | '\\u1E93' | '\\u1E95' .. '\\u1E9D' | '\\u1E9F' | '\\u1EA1' | '\\u1EA3' | '\\u1EA5' | '\\u1EA7' | '\\u1EA9' | '\\u1EAB' | '\\u1EAD' | '\\u1EAF' | '\\u1EB1' | '\\u1EB3' | '\\u1EB5' | '\\u1EB7' | '\\u1EB9' | '\\u1EBB' | '\\u1EBD' | '\\u1EBF' | '\\u1EC1' | '\\u1EC3' | '\\u1EC5' | '\\u1EC7' | '\\u1EC9' | '\\u1ECB' | '\\u1ECD' | '\\u1ECF' | '\\u1ED1' | '\\u1ED3' | '\\u1ED5' | '\\u1ED7' | '\\u1ED9' | '\\u1EDB' | '\\u1EDD' | '\\u1EDF' | '\\u1EE1' | '\\u1EE3' | '\\u1EE5' | '\\u1EE7' | '\\u1EE9' | '\\u1EEB' | '\\u1EED' | '\\u1EEF' | '\\u1EF1' | '\\u1EF3' | '\\u1EF5' | '\\u1EF7' | '\\u1EF9' | '\\u1EFB' | '\\u1EFD' | '\\u1EFF' .. '\\u1F07' | '\\u1F10' .. '\\u1F15' | '\\u1F20' .. '\\u1F27' | '\\u1F30' .. '\\u1F37' | '\\u1F40' .. '\\u1F45' | '\\u1F50' .. '\\u1F57' | '\\u1F60' .. '\\u1F67' | '\\u1F70' .. '\\u1F7D' | '\\u1F80' .. '\\u1F87' | '\\u1F90' .. '\\u1F97' | '\\u1FA0' .. '\\u1FA7' | '\\u1FB0' .. '\\u1FB4' | '\\u1FB6' | '\\u1FB7' | '\\u1FBE' | '\\u1FC2' .. '\\u1FC4' | '\\u1FC6' | '\\u1FC7' | '\\u1FD0' .. '\\u1FD3' | '\\u1FD6' | '\\u1FD7' | '\\u1FE0' .. '\\u1FE7' | '\\u1FF2' .. '\\u1FF4' | '\\u1FF6' | '\\u1FF7' | '\\u210A' | '\\u210E' | '\\u210F' | '\\u2113' | '\\u212F' | '\\u2134' | '\\u2139' | '\\u213C' | '\\u213D' | '\\u2146' .. '\\u2149' | '\\u214E' | '\\u2184' | '\\u2C30' .. '\\u2C5E' | '\\u2C61' | '\\u2C65' | '\\u2C66' | '\\u2C68' | '\\u2C6A' | '\\u2C6C' | '\\u2C71' | '\\u2C73' | '\\u2C74' | '\\u2C76' .. '\\u2C7B' | '\\u2C81' | '\\u2C83' | '\\u2C85' | '\\u2C87' | '\\u2C89' | '\\u2C8B' | '\\u2C8D' | '\\u2C8F' | '\\u2C91' | '\\u2C93' | '\\u2C95' | '\\u2C97' | '\\u2C99' | '\\u2C9B' | '\\u2C9D' | '\\u2C9F' | '\\u2CA1' | '\\u2CA3' | '\\u2CA5' | '\\u2CA7' | '\\u2CA9' | '\\u2CAB' | '\\u2CAD' | '\\u2CAF' | '\\u2CB1' | '\\u2CB3' | '\\u2CB5' | '\\u2CB7' | '\\u2CB9' | '\\u2CBB' | '\\u2CBD' | '\\u2CBF' | '\\u2CC1' | '\\u2CC3' | '\\u2CC5' | '\\u2CC7' | '\\u2CC9' | '\\u2CCB' | '\\u2CCD' | '\\u2CCF' | '\\u2CD1' | '\\u2CD3' | '\\u2CD5' | '\\u2CD7' | '\\u2CD9' | '\\u2CDB' | '\\u2CDD' | '\\u2CDF' | '\\u2CE1' | '\\u2CE3' | '\\u2CE4' | '\\u2CEC' | '\\u2CEE' | '\\u2CF3' | '\\u2D00' .. '\\u2D25' | '\\u2D27' | '\\u2D2D' | '\\uA641' | '\\uA643' | '\\uA645' | '\\uA647' | '\\uA649' | '\\uA64B' | '\\uA64D' | '\\uA64F' | '\\uA651' | '\\uA653' | '\\uA655' | '\\uA657' | '\\uA659' | '\\uA65B' | '\\uA65D' | '\\uA65F' | '\\uA661' | '\\uA663' | '\\uA665' | '\\uA667' | '\\uA669' | '\\uA66B' | '\\uA66D' | '\\uA681' | '\\uA683' | '\\uA685' | '\\uA687' | '\\uA689' | '\\uA68B' | '\\uA68D' | '\\uA68F' | '\\uA691' | '\\uA693' | '\\uA695' | '\\uA697' | '\\uA723' | '\\uA725' | '\\uA727' | '\\uA729' | '\\uA72B' | '\\uA72D' | '\\uA72F' .. '\\uA731' | '\\uA733' | '\\uA735' | '\\uA737' | '\\uA739' | '\\uA73B' | '\\uA73D' | '\\uA73F' | '\\uA741' | '\\uA743' | '\\uA745' | '\\uA747' | '\\uA749' | '\\uA74B' | '\\uA74D' | '\\uA74F' | '\\uA751' | '\\uA753' | '\\uA755' | '\\uA757' | '\\uA759' | '\\uA75B' | '\\uA75D' | '\\uA75F' | '\\uA761' | '\\uA763' | '\\uA765' | '\\uA767' | '\\uA769' | '\\uA76B' | '\\uA76D' | '\\uA76F' | '\\uA771' .. '\\uA778' | '\\uA77A' | '\\uA77C' | '\\uA77F' | '\\uA781' | '\\uA783' | '\\uA785' | '\\uA787' | '\\uA78C' | '\\uA78E' | '\\uA791' | '\\uA793' | '\\uA7A1' | '\\uA7A3' | '\\uA7A5' | '\\uA7A7' | '\\uA7A9' | '\\uA7FA' | '\\uFB00' .. '\\uFB06' | '\\uFB13' .. '\\uFB17' | '\\uFF41' .. '\\uFF5A' )
            // Unicode.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00B5'||(input.LA(1) >= '\u00DF' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u00FF')||input.LA(1)=='\u0101'||input.LA(1)=='\u0103'||input.LA(1)=='\u0105'||input.LA(1)=='\u0107'||input.LA(1)=='\u0109'||input.LA(1)=='\u010B'||input.LA(1)=='\u010D'||input.LA(1)=='\u010F'||input.LA(1)=='\u0111'||input.LA(1)=='\u0113'||input.LA(1)=='\u0115'||input.LA(1)=='\u0117'||input.LA(1)=='\u0119'||input.LA(1)=='\u011B'||input.LA(1)=='\u011D'||input.LA(1)=='\u011F'||input.LA(1)=='\u0121'||input.LA(1)=='\u0123'||input.LA(1)=='\u0125'||input.LA(1)=='\u0127'||input.LA(1)=='\u0129'||input.LA(1)=='\u012B'||input.LA(1)=='\u012D'||input.LA(1)=='\u012F'||input.LA(1)=='\u0131'||input.LA(1)=='\u0133'||input.LA(1)=='\u0135'||(input.LA(1) >= '\u0137' && input.LA(1) <= '\u0138')||input.LA(1)=='\u013A'||input.LA(1)=='\u013C'||input.LA(1)=='\u013E'||input.LA(1)=='\u0140'||input.LA(1)=='\u0142'||input.LA(1)=='\u0144'||input.LA(1)=='\u0146'||(input.LA(1) >= '\u0148' && input.LA(1) <= '\u0149')||input.LA(1)=='\u014B'||input.LA(1)=='\u014D'||input.LA(1)=='\u014F'||input.LA(1)=='\u0151'||input.LA(1)=='\u0153'||input.LA(1)=='\u0155'||input.LA(1)=='\u0157'||input.LA(1)=='\u0159'||input.LA(1)=='\u015B'||input.LA(1)=='\u015D'||input.LA(1)=='\u015F'||input.LA(1)=='\u0161'||input.LA(1)=='\u0163'||input.LA(1)=='\u0165'||input.LA(1)=='\u0167'||input.LA(1)=='\u0169'||input.LA(1)=='\u016B'||input.LA(1)=='\u016D'||input.LA(1)=='\u016F'||input.LA(1)=='\u0171'||input.LA(1)=='\u0173'||input.LA(1)=='\u0175'||input.LA(1)=='\u0177'||input.LA(1)=='\u017A'||input.LA(1)=='\u017C'||(input.LA(1) >= '\u017E' && input.LA(1) <= '\u0180')||input.LA(1)=='\u0183'||input.LA(1)=='\u0185'||input.LA(1)=='\u0188'||(input.LA(1) >= '\u018C' && input.LA(1) <= '\u018D')||input.LA(1)=='\u0192'||input.LA(1)=='\u0195'||(input.LA(1) >= '\u0199' && input.LA(1) <= '\u019B')||input.LA(1)=='\u019E'||input.LA(1)=='\u01A1'||input.LA(1)=='\u01A3'||input.LA(1)=='\u01A5'||input.LA(1)=='\u01A8'||(input.LA(1) >= '\u01AA' && input.LA(1) <= '\u01AB')||input.LA(1)=='\u01AD'||input.LA(1)=='\u01B0'||input.LA(1)=='\u01B4'||input.LA(1)=='\u01B6'||(input.LA(1) >= '\u01B9' && input.LA(1) <= '\u01BA')||(input.LA(1) >= '\u01BD' && input.LA(1) <= '\u01BF')||input.LA(1)=='\u01C6'||input.LA(1)=='\u01C9'||input.LA(1)=='\u01CC'||input.LA(1)=='\u01CE'||input.LA(1)=='\u01D0'||input.LA(1)=='\u01D2'||input.LA(1)=='\u01D4'||input.LA(1)=='\u01D6'||input.LA(1)=='\u01D8'||input.LA(1)=='\u01DA'||(input.LA(1) >= '\u01DC' && input.LA(1) <= '\u01DD')||input.LA(1)=='\u01DF'||input.LA(1)=='\u01E1'||input.LA(1)=='\u01E3'||input.LA(1)=='\u01E5'||input.LA(1)=='\u01E7'||input.LA(1)=='\u01E9'||input.LA(1)=='\u01EB'||input.LA(1)=='\u01ED'||(input.LA(1) >= '\u01EF' && input.LA(1) <= '\u01F0')||input.LA(1)=='\u01F3'||input.LA(1)=='\u01F5'||input.LA(1)=='\u01F9'||input.LA(1)=='\u01FB'||input.LA(1)=='\u01FD'||input.LA(1)=='\u01FF'||input.LA(1)=='\u0201'||input.LA(1)=='\u0203'||input.LA(1)=='\u0205'||input.LA(1)=='\u0207'||input.LA(1)=='\u0209'||input.LA(1)=='\u020B'||input.LA(1)=='\u020D'||input.LA(1)=='\u020F'||input.LA(1)=='\u0211'||input.LA(1)=='\u0213'||input.LA(1)=='\u0215'||input.LA(1)=='\u0217'||input.LA(1)=='\u0219'||input.LA(1)=='\u021B'||input.LA(1)=='\u021D'||input.LA(1)=='\u021F'||input.LA(1)=='\u0221'||input.LA(1)=='\u0223'||input.LA(1)=='\u0225'||input.LA(1)=='\u0227'||input.LA(1)=='\u0229'||input.LA(1)=='\u022B'||input.LA(1)=='\u022D'||input.LA(1)=='\u022F'||input.LA(1)=='\u0231'||(input.LA(1) >= '\u0233' && input.LA(1) <= '\u0239')||input.LA(1)=='\u023C'||(input.LA(1) >= '\u023F' && input.LA(1) <= '\u0240')||input.LA(1)=='\u0242'||input.LA(1)=='\u0247'||input.LA(1)=='\u0249'||input.LA(1)=='\u024B'||input.LA(1)=='\u024D'||(input.LA(1) >= '\u024F' && input.LA(1) <= '\u0293')||(input.LA(1) >= '\u0295' && input.LA(1) <= '\u02AF')||input.LA(1)=='\u0371'||input.LA(1)=='\u0373'||input.LA(1)=='\u0377'||(input.LA(1) >= '\u037B' && input.LA(1) <= '\u037D')||input.LA(1)=='\u0390'||(input.LA(1) >= '\u03AC' && input.LA(1) <= '\u03CE')||(input.LA(1) >= '\u03D0' && input.LA(1) <= '\u03D1')||(input.LA(1) >= '\u03D5' && input.LA(1) <= '\u03D7')||input.LA(1)=='\u03D9'||input.LA(1)=='\u03DB'||input.LA(1)=='\u03DD'||input.LA(1)=='\u03DF'||input.LA(1)=='\u03E1'||input.LA(1)=='\u03E3'||input.LA(1)=='\u03E5'||input.LA(1)=='\u03E7'||input.LA(1)=='\u03E9'||input.LA(1)=='\u03EB'||input.LA(1)=='\u03ED'||(input.LA(1) >= '\u03EF' && input.LA(1) <= '\u03F3')||input.LA(1)=='\u03F5'||input.LA(1)=='\u03F8'||(input.LA(1) >= '\u03FB' && input.LA(1) <= '\u03FC')||(input.LA(1) >= '\u0430' && input.LA(1) <= '\u045F')||input.LA(1)=='\u0461'||input.LA(1)=='\u0463'||input.LA(1)=='\u0465'||input.LA(1)=='\u0467'||input.LA(1)=='\u0469'||input.LA(1)=='\u046B'||input.LA(1)=='\u046D'||input.LA(1)=='\u046F'||input.LA(1)=='\u0471'||input.LA(1)=='\u0473'||input.LA(1)=='\u0475'||input.LA(1)=='\u0477'||input.LA(1)=='\u0479'||input.LA(1)=='\u047B'||input.LA(1)=='\u047D'||input.LA(1)=='\u047F'||input.LA(1)=='\u0481'||input.LA(1)=='\u048B'||input.LA(1)=='\u048D'||input.LA(1)=='\u048F'||input.LA(1)=='\u0491'||input.LA(1)=='\u0493'||input.LA(1)=='\u0495'||input.LA(1)=='\u0497'||input.LA(1)=='\u0499'||input.LA(1)=='\u049B'||input.LA(1)=='\u049D'||input.LA(1)=='\u049F'||input.LA(1)=='\u04A1'||input.LA(1)=='\u04A3'||input.LA(1)=='\u04A5'||input.LA(1)=='\u04A7'||input.LA(1)=='\u04A9'||input.LA(1)=='\u04AB'||input.LA(1)=='\u04AD'||input.LA(1)=='\u04AF'||input.LA(1)=='\u04B1'||input.LA(1)=='\u04B3'||input.LA(1)=='\u04B5'||input.LA(1)=='\u04B7'||input.LA(1)=='\u04B9'||input.LA(1)=='\u04BB'||input.LA(1)=='\u04BD'||input.LA(1)=='\u04BF'||input.LA(1)=='\u04C2'||input.LA(1)=='\u04C4'||input.LA(1)=='\u04C6'||input.LA(1)=='\u04C8'||input.LA(1)=='\u04CA'||input.LA(1)=='\u04CC'||(input.LA(1) >= '\u04CE' && input.LA(1) <= '\u04CF')||input.LA(1)=='\u04D1'||input.LA(1)=='\u04D3'||input.LA(1)=='\u04D5'||input.LA(1)=='\u04D7'||input.LA(1)=='\u04D9'||input.LA(1)=='\u04DB'||input.LA(1)=='\u04DD'||input.LA(1)=='\u04DF'||input.LA(1)=='\u04E1'||input.LA(1)=='\u04E3'||input.LA(1)=='\u04E5'||input.LA(1)=='\u04E7'||input.LA(1)=='\u04E9'||input.LA(1)=='\u04EB'||input.LA(1)=='\u04ED'||input.LA(1)=='\u04EF'||input.LA(1)=='\u04F1'||input.LA(1)=='\u04F3'||input.LA(1)=='\u04F5'||input.LA(1)=='\u04F7'||input.LA(1)=='\u04F9'||input.LA(1)=='\u04FB'||input.LA(1)=='\u04FD'||input.LA(1)=='\u04FF'||input.LA(1)=='\u0501'||input.LA(1)=='\u0503'||input.LA(1)=='\u0505'||input.LA(1)=='\u0507'||input.LA(1)=='\u0509'||input.LA(1)=='\u050B'||input.LA(1)=='\u050D'||input.LA(1)=='\u050F'||input.LA(1)=='\u0511'||input.LA(1)=='\u0513'||input.LA(1)=='\u0515'||input.LA(1)=='\u0517'||input.LA(1)=='\u0519'||input.LA(1)=='\u051B'||input.LA(1)=='\u051D'||input.LA(1)=='\u051F'||input.LA(1)=='\u0521'||input.LA(1)=='\u0523'||input.LA(1)=='\u0525'||input.LA(1)=='\u0527'||(input.LA(1) >= '\u0561' && input.LA(1) <= '\u0587')||(input.LA(1) >= '\u1D00' && input.LA(1) <= '\u1D2B')||(input.LA(1) >= '\u1D6B' && input.LA(1) <= '\u1D77')||(input.LA(1) >= '\u1D79' && input.LA(1) <= '\u1D9A')||input.LA(1)=='\u1E01'||input.LA(1)=='\u1E03'||input.LA(1)=='\u1E05'||input.LA(1)=='\u1E07'||input.LA(1)=='\u1E09'||input.LA(1)=='\u1E0B'||input.LA(1)=='\u1E0D'||input.LA(1)=='\u1E0F'||input.LA(1)=='\u1E11'||input.LA(1)=='\u1E13'||input.LA(1)=='\u1E15'||input.LA(1)=='\u1E17'||input.LA(1)=='\u1E19'||input.LA(1)=='\u1E1B'||input.LA(1)=='\u1E1D'||input.LA(1)=='\u1E1F'||input.LA(1)=='\u1E21'||input.LA(1)=='\u1E23'||input.LA(1)=='\u1E25'||input.LA(1)=='\u1E27'||input.LA(1)=='\u1E29'||input.LA(1)=='\u1E2B'||input.LA(1)=='\u1E2D'||input.LA(1)=='\u1E2F'||input.LA(1)=='\u1E31'||input.LA(1)=='\u1E33'||input.LA(1)=='\u1E35'||input.LA(1)=='\u1E37'||input.LA(1)=='\u1E39'||input.LA(1)=='\u1E3B'||input.LA(1)=='\u1E3D'||input.LA(1)=='\u1E3F'||input.LA(1)=='\u1E41'||input.LA(1)=='\u1E43'||input.LA(1)=='\u1E45'||input.LA(1)=='\u1E47'||input.LA(1)=='\u1E49'||input.LA(1)=='\u1E4B'||input.LA(1)=='\u1E4D'||input.LA(1)=='\u1E4F'||input.LA(1)=='\u1E51'||input.LA(1)=='\u1E53'||input.LA(1)=='\u1E55'||input.LA(1)=='\u1E57'||input.LA(1)=='\u1E59'||input.LA(1)=='\u1E5B'||input.LA(1)=='\u1E5D'||input.LA(1)=='\u1E5F'||input.LA(1)=='\u1E61'||input.LA(1)=='\u1E63'||input.LA(1)=='\u1E65'||input.LA(1)=='\u1E67'||input.LA(1)=='\u1E69'||input.LA(1)=='\u1E6B'||input.LA(1)=='\u1E6D'||input.LA(1)=='\u1E6F'||input.LA(1)=='\u1E71'||input.LA(1)=='\u1E73'||input.LA(1)=='\u1E75'||input.LA(1)=='\u1E77'||input.LA(1)=='\u1E79'||input.LA(1)=='\u1E7B'||input.LA(1)=='\u1E7D'||input.LA(1)=='\u1E7F'||input.LA(1)=='\u1E81'||input.LA(1)=='\u1E83'||input.LA(1)=='\u1E85'||input.LA(1)=='\u1E87'||input.LA(1)=='\u1E89'||input.LA(1)=='\u1E8B'||input.LA(1)=='\u1E8D'||input.LA(1)=='\u1E8F'||input.LA(1)=='\u1E91'||input.LA(1)=='\u1E93'||(input.LA(1) >= '\u1E95' && input.LA(1) <= '\u1E9D')||input.LA(1)=='\u1E9F'||input.LA(1)=='\u1EA1'||input.LA(1)=='\u1EA3'||input.LA(1)=='\u1EA5'||input.LA(1)=='\u1EA7'||input.LA(1)=='\u1EA9'||input.LA(1)=='\u1EAB'||input.LA(1)=='\u1EAD'||input.LA(1)=='\u1EAF'||input.LA(1)=='\u1EB1'||input.LA(1)=='\u1EB3'||input.LA(1)=='\u1EB5'||input.LA(1)=='\u1EB7'||input.LA(1)=='\u1EB9'||input.LA(1)=='\u1EBB'||input.LA(1)=='\u1EBD'||input.LA(1)=='\u1EBF'||input.LA(1)=='\u1EC1'||input.LA(1)=='\u1EC3'||input.LA(1)=='\u1EC5'||input.LA(1)=='\u1EC7'||input.LA(1)=='\u1EC9'||input.LA(1)=='\u1ECB'||input.LA(1)=='\u1ECD'||input.LA(1)=='\u1ECF'||input.LA(1)=='\u1ED1'||input.LA(1)=='\u1ED3'||input.LA(1)=='\u1ED5'||input.LA(1)=='\u1ED7'||input.LA(1)=='\u1ED9'||input.LA(1)=='\u1EDB'||input.LA(1)=='\u1EDD'||input.LA(1)=='\u1EDF'||input.LA(1)=='\u1EE1'||input.LA(1)=='\u1EE3'||input.LA(1)=='\u1EE5'||input.LA(1)=='\u1EE7'||input.LA(1)=='\u1EE9'||input.LA(1)=='\u1EEB'||input.LA(1)=='\u1EED'||input.LA(1)=='\u1EEF'||input.LA(1)=='\u1EF1'||input.LA(1)=='\u1EF3'||input.LA(1)=='\u1EF5'||input.LA(1)=='\u1EF7'||input.LA(1)=='\u1EF9'||input.LA(1)=='\u1EFB'||input.LA(1)=='\u1EFD'||(input.LA(1) >= '\u1EFF' && input.LA(1) <= '\u1F07')||(input.LA(1) >= '\u1F10' && input.LA(1) <= '\u1F15')||(input.LA(1) >= '\u1F20' && input.LA(1) <= '\u1F27')||(input.LA(1) >= '\u1F30' && input.LA(1) <= '\u1F37')||(input.LA(1) >= '\u1F40' && input.LA(1) <= '\u1F45')||(input.LA(1) >= '\u1F50' && input.LA(1) <= '\u1F57')||(input.LA(1) >= '\u1F60' && input.LA(1) <= '\u1F67')||(input.LA(1) >= '\u1F70' && input.LA(1) <= '\u1F7D')||(input.LA(1) >= '\u1F80' && input.LA(1) <= '\u1F87')||(input.LA(1) >= '\u1F90' && input.LA(1) <= '\u1F97')||(input.LA(1) >= '\u1FA0' && input.LA(1) <= '\u1FA7')||(input.LA(1) >= '\u1FB0' && input.LA(1) <= '\u1FB4')||(input.LA(1) >= '\u1FB6' && input.LA(1) <= '\u1FB7')||input.LA(1)=='\u1FBE'||(input.LA(1) >= '\u1FC2' && input.LA(1) <= '\u1FC4')||(input.LA(1) >= '\u1FC6' && input.LA(1) <= '\u1FC7')||(input.LA(1) >= '\u1FD0' && input.LA(1) <= '\u1FD3')||(input.LA(1) >= '\u1FD6' && input.LA(1) <= '\u1FD7')||(input.LA(1) >= '\u1FE0' && input.LA(1) <= '\u1FE7')||(input.LA(1) >= '\u1FF2' && input.LA(1) <= '\u1FF4')||(input.LA(1) >= '\u1FF6' && input.LA(1) <= '\u1FF7')||input.LA(1)=='\u210A'||(input.LA(1) >= '\u210E' && input.LA(1) <= '\u210F')||input.LA(1)=='\u2113'||input.LA(1)=='\u212F'||input.LA(1)=='\u2134'||input.LA(1)=='\u2139'||(input.LA(1) >= '\u213C' && input.LA(1) <= '\u213D')||(input.LA(1) >= '\u2146' && input.LA(1) <= '\u2149')||input.LA(1)=='\u214E'||input.LA(1)=='\u2184'||(input.LA(1) >= '\u2C30' && input.LA(1) <= '\u2C5E')||input.LA(1)=='\u2C61'||(input.LA(1) >= '\u2C65' && input.LA(1) <= '\u2C66')||input.LA(1)=='\u2C68'||input.LA(1)=='\u2C6A'||input.LA(1)=='\u2C6C'||input.LA(1)=='\u2C71'||(input.LA(1) >= '\u2C73' && input.LA(1) <= '\u2C74')||(input.LA(1) >= '\u2C76' && input.LA(1) <= '\u2C7B')||input.LA(1)=='\u2C81'||input.LA(1)=='\u2C83'||input.LA(1)=='\u2C85'||input.LA(1)=='\u2C87'||input.LA(1)=='\u2C89'||input.LA(1)=='\u2C8B'||input.LA(1)=='\u2C8D'||input.LA(1)=='\u2C8F'||input.LA(1)=='\u2C91'||input.LA(1)=='\u2C93'||input.LA(1)=='\u2C95'||input.LA(1)=='\u2C97'||input.LA(1)=='\u2C99'||input.LA(1)=='\u2C9B'||input.LA(1)=='\u2C9D'||input.LA(1)=='\u2C9F'||input.LA(1)=='\u2CA1'||input.LA(1)=='\u2CA3'||input.LA(1)=='\u2CA5'||input.LA(1)=='\u2CA7'||input.LA(1)=='\u2CA9'||input.LA(1)=='\u2CAB'||input.LA(1)=='\u2CAD'||input.LA(1)=='\u2CAF'||input.LA(1)=='\u2CB1'||input.LA(1)=='\u2CB3'||input.LA(1)=='\u2CB5'||input.LA(1)=='\u2CB7'||input.LA(1)=='\u2CB9'||input.LA(1)=='\u2CBB'||input.LA(1)=='\u2CBD'||input.LA(1)=='\u2CBF'||input.LA(1)=='\u2CC1'||input.LA(1)=='\u2CC3'||input.LA(1)=='\u2CC5'||input.LA(1)=='\u2CC7'||input.LA(1)=='\u2CC9'||input.LA(1)=='\u2CCB'||input.LA(1)=='\u2CCD'||input.LA(1)=='\u2CCF'||input.LA(1)=='\u2CD1'||input.LA(1)=='\u2CD3'||input.LA(1)=='\u2CD5'||input.LA(1)=='\u2CD7'||input.LA(1)=='\u2CD9'||input.LA(1)=='\u2CDB'||input.LA(1)=='\u2CDD'||input.LA(1)=='\u2CDF'||input.LA(1)=='\u2CE1'||(input.LA(1) >= '\u2CE3' && input.LA(1) <= '\u2CE4')||input.LA(1)=='\u2CEC'||input.LA(1)=='\u2CEE'||input.LA(1)=='\u2CF3'||(input.LA(1) >= '\u2D00' && input.LA(1) <= '\u2D25')||input.LA(1)=='\u2D27'||input.LA(1)=='\u2D2D'||input.LA(1)=='\uA641'||input.LA(1)=='\uA643'||input.LA(1)=='\uA645'||input.LA(1)=='\uA647'||input.LA(1)=='\uA649'||input.LA(1)=='\uA64B'||input.LA(1)=='\uA64D'||input.LA(1)=='\uA64F'||input.LA(1)=='\uA651'||input.LA(1)=='\uA653'||input.LA(1)=='\uA655'||input.LA(1)=='\uA657'||input.LA(1)=='\uA659'||input.LA(1)=='\uA65B'||input.LA(1)=='\uA65D'||input.LA(1)=='\uA65F'||input.LA(1)=='\uA661'||input.LA(1)=='\uA663'||input.LA(1)=='\uA665'||input.LA(1)=='\uA667'||input.LA(1)=='\uA669'||input.LA(1)=='\uA66B'||input.LA(1)=='\uA66D'||input.LA(1)=='\uA681'||input.LA(1)=='\uA683'||input.LA(1)=='\uA685'||input.LA(1)=='\uA687'||input.LA(1)=='\uA689'||input.LA(1)=='\uA68B'||input.LA(1)=='\uA68D'||input.LA(1)=='\uA68F'||input.LA(1)=='\uA691'||input.LA(1)=='\uA693'||input.LA(1)=='\uA695'||input.LA(1)=='\uA697'||input.LA(1)=='\uA723'||input.LA(1)=='\uA725'||input.LA(1)=='\uA727'||input.LA(1)=='\uA729'||input.LA(1)=='\uA72B'||input.LA(1)=='\uA72D'||(input.LA(1) >= '\uA72F' && input.LA(1) <= '\uA731')||input.LA(1)=='\uA733'||input.LA(1)=='\uA735'||input.LA(1)=='\uA737'||input.LA(1)=='\uA739'||input.LA(1)=='\uA73B'||input.LA(1)=='\uA73D'||input.LA(1)=='\uA73F'||input.LA(1)=='\uA741'||input.LA(1)=='\uA743'||input.LA(1)=='\uA745'||input.LA(1)=='\uA747'||input.LA(1)=='\uA749'||input.LA(1)=='\uA74B'||input.LA(1)=='\uA74D'||input.LA(1)=='\uA74F'||input.LA(1)=='\uA751'||input.LA(1)=='\uA753'||input.LA(1)=='\uA755'||input.LA(1)=='\uA757'||input.LA(1)=='\uA759'||input.LA(1)=='\uA75B'||input.LA(1)=='\uA75D'||input.LA(1)=='\uA75F'||input.LA(1)=='\uA761'||input.LA(1)=='\uA763'||input.LA(1)=='\uA765'||input.LA(1)=='\uA767'||input.LA(1)=='\uA769'||input.LA(1)=='\uA76B'||input.LA(1)=='\uA76D'||input.LA(1)=='\uA76F'||(input.LA(1) >= '\uA771' && input.LA(1) <= '\uA778')||input.LA(1)=='\uA77A'||input.LA(1)=='\uA77C'||input.LA(1)=='\uA77F'||input.LA(1)=='\uA781'||input.LA(1)=='\uA783'||input.LA(1)=='\uA785'||input.LA(1)=='\uA787'||input.LA(1)=='\uA78C'||input.LA(1)=='\uA78E'||input.LA(1)=='\uA791'||input.LA(1)=='\uA793'||input.LA(1)=='\uA7A1'||input.LA(1)=='\uA7A3'||input.LA(1)=='\uA7A5'||input.LA(1)=='\uA7A7'||input.LA(1)=='\uA7A9'||input.LA(1)=='\uA7FA'||(input.LA(1) >= '\uFB00' && input.LA(1) <= '\uFB06')||(input.LA(1) >= '\uFB13' && input.LA(1) <= '\uFB17')||(input.LA(1) >= '\uFF41' && input.LA(1) <= '\uFF5A') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_LL"

    // $ANTLR start "UNICODE_CLASS_LM"
    public final void mUNICODE_CLASS_LM() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_LM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:644:17: ( '\\u02B0' .. '\\u02C1' | '\\u02C6' .. '\\u02D1' | '\\u02E0' .. '\\u02E4' | '\\u02EC' | '\\u02EE' | '\\u0374' | '\\u037A' | '\\u0559' | '\\u0640' | '\\u06E5' | '\\u06E6' | '\\u07F4' | '\\u07F5' | '\\u07FA' | '\\u081A' | '\\u0824' | '\\u0828' | '\\u0971' | '\\u0E46' | '\\u0EC6' | '\\u10FC' | '\\u17D7' | '\\u1843' | '\\u1AA7' | '\\u1C78' .. '\\u1C7D' | '\\u1D2C' .. '\\u1D6A' | '\\u1D78' | '\\u1D9B' .. '\\u1DBF' | '\\u2071' | '\\u207F' | '\\u2090' .. '\\u209C' | '\\u2C7C' | '\\u2C7D' | '\\u2D6F' | '\\u2E2F' | '\\u3005' | '\\u3031' .. '\\u3035' | '\\u303B' | '\\u309D' | '\\u309E' | '\\u30FC' .. '\\u30FE' | '\\uA015' | '\\uA4F8' .. '\\uA4FD' | '\\uA60C' | '\\uA67F' | '\\uA717' .. '\\uA71F' | '\\uA770' | '\\uA788' | '\\uA7F8' | '\\uA7F9' | '\\uA9CF' | '\\uAA70' | '\\uAADD' | '\\uAAF3' | '\\uAAF4' | '\\uFF70' | '\\uFF9E' | '\\uFF9F' )
            // Unicode.g:
            {
            if ( (input.LA(1) >= '\u02B0' && input.LA(1) <= '\u02C1')||(input.LA(1) >= '\u02C6' && input.LA(1) <= '\u02D1')||(input.LA(1) >= '\u02E0' && input.LA(1) <= '\u02E4')||input.LA(1)=='\u02EC'||input.LA(1)=='\u02EE'||input.LA(1)=='\u0374'||input.LA(1)=='\u037A'||input.LA(1)=='\u0559'||input.LA(1)=='\u0640'||(input.LA(1) >= '\u06E5' && input.LA(1) <= '\u06E6')||(input.LA(1) >= '\u07F4' && input.LA(1) <= '\u07F5')||input.LA(1)=='\u07FA'||input.LA(1)=='\u081A'||input.LA(1)=='\u0824'||input.LA(1)=='\u0828'||input.LA(1)=='\u0971'||input.LA(1)=='\u0E46'||input.LA(1)=='\u0EC6'||input.LA(1)=='\u10FC'||input.LA(1)=='\u17D7'||input.LA(1)=='\u1843'||input.LA(1)=='\u1AA7'||(input.LA(1) >= '\u1C78' && input.LA(1) <= '\u1C7D')||(input.LA(1) >= '\u1D2C' && input.LA(1) <= '\u1D6A')||input.LA(1)=='\u1D78'||(input.LA(1) >= '\u1D9B' && input.LA(1) <= '\u1DBF')||input.LA(1)=='\u2071'||input.LA(1)=='\u207F'||(input.LA(1) >= '\u2090' && input.LA(1) <= '\u209C')||(input.LA(1) >= '\u2C7C' && input.LA(1) <= '\u2C7D')||input.LA(1)=='\u2D6F'||input.LA(1)=='\u2E2F'||input.LA(1)=='\u3005'||(input.LA(1) >= '\u3031' && input.LA(1) <= '\u3035')||input.LA(1)=='\u303B'||(input.LA(1) >= '\u309D' && input.LA(1) <= '\u309E')||(input.LA(1) >= '\u30FC' && input.LA(1) <= '\u30FE')||input.LA(1)=='\uA015'||(input.LA(1) >= '\uA4F8' && input.LA(1) <= '\uA4FD')||input.LA(1)=='\uA60C'||input.LA(1)=='\uA67F'||(input.LA(1) >= '\uA717' && input.LA(1) <= '\uA71F')||input.LA(1)=='\uA770'||input.LA(1)=='\uA788'||(input.LA(1) >= '\uA7F8' && input.LA(1) <= '\uA7F9')||input.LA(1)=='\uA9CF'||input.LA(1)=='\uAA70'||input.LA(1)=='\uAADD'||(input.LA(1) >= '\uAAF3' && input.LA(1) <= '\uAAF4')||input.LA(1)=='\uFF70'||(input.LA(1) >= '\uFF9E' && input.LA(1) <= '\uFF9F') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_LM"

    // $ANTLR start "UNICODE_CLASS_LO"
    public final void mUNICODE_CLASS_LO() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_LO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:704:17: ( '\\u00AA' | '\\u00BA' | '\\u01BB' | '\\u01C0' .. '\\u01C3' | '\\u0294' | '\\u05D0' .. '\\u05EA' | '\\u05F0' .. '\\u05F2' | '\\u0620' .. '\\u063F' | '\\u0641' .. '\\u064A' | '\\u066E' | '\\u066F' | '\\u0671' .. '\\u06D3' | '\\u06D5' | '\\u06EE' | '\\u06EF' | '\\u06FA' .. '\\u06FC' | '\\u06FF' | '\\u0710' | '\\u0712' .. '\\u072F' | '\\u074D' .. '\\u07A5' | '\\u07B1' | '\\u07CA' .. '\\u07EA' | '\\u0800' .. '\\u0815' | '\\u0840' .. '\\u0858' | '\\u08A0' | '\\u08A2' .. '\\u08AC' | '\\u0904' .. '\\u0939' | '\\u093D' | '\\u0950' | '\\u0958' .. '\\u0961' | '\\u0972' .. '\\u0977' | '\\u0979' .. '\\u097F' | '\\u0985' .. '\\u098C' | '\\u098F' | '\\u0990' | '\\u0993' .. '\\u09A8' | '\\u09AA' .. '\\u09B0' | '\\u09B2' | '\\u09B6' .. '\\u09B9' | '\\u09BD' | '\\u09CE' | '\\u09DC' | '\\u09DD' | '\\u09DF' .. '\\u09E1' | '\\u09F0' | '\\u09F1' | '\\u0A05' .. '\\u0A0A' | '\\u0A0F' | '\\u0A10' | '\\u0A13' .. '\\u0A28' | '\\u0A2A' .. '\\u0A30' | '\\u0A32' | '\\u0A33' | '\\u0A35' | '\\u0A36' | '\\u0A38' | '\\u0A39' | '\\u0A59' .. '\\u0A5C' | '\\u0A5E' | '\\u0A72' .. '\\u0A74' | '\\u0A85' .. '\\u0A8D' | '\\u0A8F' .. '\\u0A91' | '\\u0A93' .. '\\u0AA8' | '\\u0AAA' .. '\\u0AB0' | '\\u0AB2' | '\\u0AB3' | '\\u0AB5' .. '\\u0AB9' | '\\u0ABD' | '\\u0AD0' | '\\u0AE0' | '\\u0AE1' | '\\u0B05' .. '\\u0B0C' | '\\u0B0F' | '\\u0B10' | '\\u0B13' .. '\\u0B28' | '\\u0B2A' .. '\\u0B30' | '\\u0B32' | '\\u0B33' | '\\u0B35' .. '\\u0B39' | '\\u0B3D' | '\\u0B5C' | '\\u0B5D' | '\\u0B5F' .. '\\u0B61' | '\\u0B71' | '\\u0B83' | '\\u0B85' .. '\\u0B8A' | '\\u0B8E' .. '\\u0B90' | '\\u0B92' .. '\\u0B95' | '\\u0B99' | '\\u0B9A' | '\\u0B9C' | '\\u0B9E' | '\\u0B9F' | '\\u0BA3' | '\\u0BA4' | '\\u0BA8' .. '\\u0BAA' | '\\u0BAE' .. '\\u0BB9' | '\\u0BD0' | '\\u0C05' .. '\\u0C0C' | '\\u0C0E' .. '\\u0C10' | '\\u0C12' .. '\\u0C28' | '\\u0C2A' .. '\\u0C33' | '\\u0C35' .. '\\u0C39' | '\\u0C3D' | '\\u0C58' | '\\u0C59' | '\\u0C60' | '\\u0C61' | '\\u0C85' .. '\\u0C8C' | '\\u0C8E' .. '\\u0C90' | '\\u0C92' .. '\\u0CA8' | '\\u0CAA' .. '\\u0CB3' | '\\u0CB5' .. '\\u0CB9' | '\\u0CBD' | '\\u0CDE' | '\\u0CE0' | '\\u0CE1' | '\\u0CF1' | '\\u0CF2' | '\\u0D05' .. '\\u0D0C' | '\\u0D0E' .. '\\u0D10' | '\\u0D12' .. '\\u0D3A' | '\\u0D3D' | '\\u0D4E' | '\\u0D60' | '\\u0D61' | '\\u0D7A' .. '\\u0D7F' | '\\u0D85' .. '\\u0D96' | '\\u0D9A' .. '\\u0DB1' | '\\u0DB3' .. '\\u0DBB' | '\\u0DBD' | '\\u0DC0' .. '\\u0DC6' | '\\u0E01' .. '\\u0E30' | '\\u0E32' | '\\u0E33' | '\\u0E40' .. '\\u0E45' | '\\u0E81' | '\\u0E82' | '\\u0E84' | '\\u0E87' | '\\u0E88' | '\\u0E8A' | '\\u0E8D' | '\\u0E94' .. '\\u0E97' | '\\u0E99' .. '\\u0E9F' | '\\u0EA1' .. '\\u0EA3' | '\\u0EA5' | '\\u0EA7' | '\\u0EAA' | '\\u0EAB' | '\\u0EAD' .. '\\u0EB0' | '\\u0EB2' | '\\u0EB3' | '\\u0EBD' | '\\u0EC0' .. '\\u0EC4' | '\\u0EDC' .. '\\u0EDF' | '\\u0F00' | '\\u0F40' .. '\\u0F47' | '\\u0F49' .. '\\u0F6C' | '\\u0F88' .. '\\u0F8C' | '\\u1000' .. '\\u102A' | '\\u103F' | '\\u1050' .. '\\u1055' | '\\u105A' .. '\\u105D' | '\\u1061' | '\\u1065' | '\\u1066' | '\\u106E' .. '\\u1070' | '\\u1075' .. '\\u1081' | '\\u108E' | '\\u10D0' .. '\\u10FA' | '\\u10FD' .. '\\u1248' | '\\u124A' .. '\\u124D' | '\\u1250' .. '\\u1256' | '\\u1258' | '\\u125A' .. '\\u125D' | '\\u1260' .. '\\u1288' | '\\u128A' .. '\\u128D' | '\\u1290' .. '\\u12B0' | '\\u12B2' .. '\\u12B5' | '\\u12B8' .. '\\u12BE' | '\\u12C0' | '\\u12C2' .. '\\u12C5' | '\\u12C8' .. '\\u12D6' | '\\u12D8' .. '\\u1310' | '\\u1312' .. '\\u1315' | '\\u1318' .. '\\u135A' | '\\u1380' .. '\\u138F' | '\\u13A0' .. '\\u13F4' | '\\u1401' .. '\\u166C' | '\\u166F' .. '\\u167F' | '\\u1681' .. '\\u169A' | '\\u16A0' .. '\\u16EA' | '\\u1700' .. '\\u170C' | '\\u170E' .. '\\u1711' | '\\u1720' .. '\\u1731' | '\\u1740' .. '\\u1751' | '\\u1760' .. '\\u176C' | '\\u176E' .. '\\u1770' | '\\u1780' .. '\\u17B3' | '\\u17DC' | '\\u1820' .. '\\u1842' | '\\u1844' .. '\\u1877' | '\\u1880' .. '\\u18A8' | '\\u18AA' | '\\u18B0' .. '\\u18F5' | '\\u1900' .. '\\u191C' | '\\u1950' .. '\\u196D' | '\\u1970' .. '\\u1974' | '\\u1980' .. '\\u19AB' | '\\u19C1' .. '\\u19C7' | '\\u1A00' .. '\\u1A16' | '\\u1A20' .. '\\u1A54' | '\\u1B05' .. '\\u1B33' | '\\u1B45' .. '\\u1B4B' | '\\u1B83' .. '\\u1BA0' | '\\u1BAE' | '\\u1BAF' | '\\u1BBA' .. '\\u1BE5' | '\\u1C00' .. '\\u1C23' | '\\u1C4D' .. '\\u1C4F' | '\\u1C5A' .. '\\u1C77' | '\\u1CE9' .. '\\u1CEC' | '\\u1CEE' .. '\\u1CF1' | '\\u1CF5' | '\\u1CF6' | '\\u2135' .. '\\u2138' | '\\u2D30' .. '\\u2D67' | '\\u2D80' .. '\\u2D96' | '\\u2DA0' .. '\\u2DA6' | '\\u2DA8' .. '\\u2DAE' | '\\u2DB0' .. '\\u2DB6' | '\\u2DB8' .. '\\u2DBE' | '\\u2DC0' .. '\\u2DC6' | '\\u2DC8' .. '\\u2DCE' | '\\u2DD0' .. '\\u2DD6' | '\\u2DD8' .. '\\u2DDE' | '\\u3006' | '\\u303C' | '\\u3041' .. '\\u3096' | '\\u309F' | '\\u30A1' .. '\\u30FA' | '\\u30FF' | '\\u3105' .. '\\u312D' | '\\u3131' .. '\\u318E' | '\\u31A0' .. '\\u31BA' | '\\u31F0' .. '\\u31FF' | '\\u3400' | '\\u4DB5' | '\\u4E00' | '\\u9FCC' | '\\uA000' .. '\\uA014' | '\\uA016' .. '\\uA48C' | '\\uA4D0' .. '\\uA4F7' | '\\uA500' .. '\\uA60B' | '\\uA610' .. '\\uA61F' | '\\uA62A' | '\\uA62B' | '\\uA66E' | '\\uA6A0' .. '\\uA6E5' | '\\uA7FB' .. '\\uA801' | '\\uA803' .. '\\uA805' | '\\uA807' .. '\\uA80A' | '\\uA80C' .. '\\uA822' | '\\uA840' .. '\\uA873' | '\\uA882' .. '\\uA8B3' | '\\uA8F2' .. '\\uA8F7' | '\\uA8FB' | '\\uA90A' .. '\\uA925' | '\\uA930' .. '\\uA946' | '\\uA960' .. '\\uA97C' | '\\uA984' .. '\\uA9B2' | '\\uAA00' .. '\\uAA28' | '\\uAA40' .. '\\uAA42' | '\\uAA44' .. '\\uAA4B' | '\\uAA60' .. '\\uAA6F' | '\\uAA71' .. '\\uAA76' | '\\uAA7A' | '\\uAA80' .. '\\uAAAF' | '\\uAAB1' | '\\uAAB5' | '\\uAAB6' | '\\uAAB9' .. '\\uAABD' | '\\uAAC0' | '\\uAAC2' | '\\uAADB' | '\\uAADC' | '\\uAAE0' .. '\\uAAEA' | '\\uAAF2' | '\\uAB01' .. '\\uAB06' | '\\uAB09' .. '\\uAB0E' | '\\uAB11' .. '\\uAB16' | '\\uAB20' .. '\\uAB26' | '\\uAB28' .. '\\uAB2E' | '\\uABC0' .. '\\uABE2' | '\\uAC00' | '\\uD7A3' | '\\uD7B0' .. '\\uD7C6' | '\\uD7CB' .. '\\uD7FB' | '\\uF900' .. '\\uFA6D' | '\\uFA70' .. '\\uFAD9' | '\\uFB1D' | '\\uFB1F' .. '\\uFB28' | '\\uFB2A' .. '\\uFB36' | '\\uFB38' .. '\\uFB3C' | '\\uFB3E' | '\\uFB40' | '\\uFB41' | '\\uFB43' | '\\uFB44' | '\\uFB46' .. '\\uFBB1' | '\\uFBD3' .. '\\uFD3D' | '\\uFD50' .. '\\uFD8F' | '\\uFD92' .. '\\uFDC7' | '\\uFDF0' .. '\\uFDFB' | '\\uFE70' .. '\\uFE74' | '\\uFE76' .. '\\uFEFC' | '\\uFF66' .. '\\uFF6F' | '\\uFF71' .. '\\uFF9D' | '\\uFFA0' .. '\\uFFBE' | '\\uFFC2' .. '\\uFFC7' | '\\uFFCA' .. '\\uFFCF' | '\\uFFD2' .. '\\uFFD7' | '\\uFFDA' .. '\\uFFDC' )
            // Unicode.g:
            {
            if ( input.LA(1)=='\u00AA'||input.LA(1)=='\u00BA'||input.LA(1)=='\u01BB'||(input.LA(1) >= '\u01C0' && input.LA(1) <= '\u01C3')||input.LA(1)=='\u0294'||(input.LA(1) >= '\u05D0' && input.LA(1) <= '\u05EA')||(input.LA(1) >= '\u05F0' && input.LA(1) <= '\u05F2')||(input.LA(1) >= '\u0620' && input.LA(1) <= '\u063F')||(input.LA(1) >= '\u0641' && input.LA(1) <= '\u064A')||(input.LA(1) >= '\u066E' && input.LA(1) <= '\u066F')||(input.LA(1) >= '\u0671' && input.LA(1) <= '\u06D3')||input.LA(1)=='\u06D5'||(input.LA(1) >= '\u06EE' && input.LA(1) <= '\u06EF')||(input.LA(1) >= '\u06FA' && input.LA(1) <= '\u06FC')||input.LA(1)=='\u06FF'||input.LA(1)=='\u0710'||(input.LA(1) >= '\u0712' && input.LA(1) <= '\u072F')||(input.LA(1) >= '\u074D' && input.LA(1) <= '\u07A5')||input.LA(1)=='\u07B1'||(input.LA(1) >= '\u07CA' && input.LA(1) <= '\u07EA')||(input.LA(1) >= '\u0800' && input.LA(1) <= '\u0815')||(input.LA(1) >= '\u0840' && input.LA(1) <= '\u0858')||input.LA(1)=='\u08A0'||(input.LA(1) >= '\u08A2' && input.LA(1) <= '\u08AC')||(input.LA(1) >= '\u0904' && input.LA(1) <= '\u0939')||input.LA(1)=='\u093D'||input.LA(1)=='\u0950'||(input.LA(1) >= '\u0958' && input.LA(1) <= '\u0961')||(input.LA(1) >= '\u0972' && input.LA(1) <= '\u0977')||(input.LA(1) >= '\u0979' && input.LA(1) <= '\u097F')||(input.LA(1) >= '\u0985' && input.LA(1) <= '\u098C')||(input.LA(1) >= '\u098F' && input.LA(1) <= '\u0990')||(input.LA(1) >= '\u0993' && input.LA(1) <= '\u09A8')||(input.LA(1) >= '\u09AA' && input.LA(1) <= '\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1) >= '\u09B6' && input.LA(1) <= '\u09B9')||input.LA(1)=='\u09BD'||input.LA(1)=='\u09CE'||(input.LA(1) >= '\u09DC' && input.LA(1) <= '\u09DD')||(input.LA(1) >= '\u09DF' && input.LA(1) <= '\u09E1')||(input.LA(1) >= '\u09F0' && input.LA(1) <= '\u09F1')||(input.LA(1) >= '\u0A05' && input.LA(1) <= '\u0A0A')||(input.LA(1) >= '\u0A0F' && input.LA(1) <= '\u0A10')||(input.LA(1) >= '\u0A13' && input.LA(1) <= '\u0A28')||(input.LA(1) >= '\u0A2A' && input.LA(1) <= '\u0A30')||(input.LA(1) >= '\u0A32' && input.LA(1) <= '\u0A33')||(input.LA(1) >= '\u0A35' && input.LA(1) <= '\u0A36')||(input.LA(1) >= '\u0A38' && input.LA(1) <= '\u0A39')||(input.LA(1) >= '\u0A59' && input.LA(1) <= '\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1) >= '\u0A72' && input.LA(1) <= '\u0A74')||(input.LA(1) >= '\u0A85' && input.LA(1) <= '\u0A8D')||(input.LA(1) >= '\u0A8F' && input.LA(1) <= '\u0A91')||(input.LA(1) >= '\u0A93' && input.LA(1) <= '\u0AA8')||(input.LA(1) >= '\u0AAA' && input.LA(1) <= '\u0AB0')||(input.LA(1) >= '\u0AB2' && input.LA(1) <= '\u0AB3')||(input.LA(1) >= '\u0AB5' && input.LA(1) <= '\u0AB9')||input.LA(1)=='\u0ABD'||input.LA(1)=='\u0AD0'||(input.LA(1) >= '\u0AE0' && input.LA(1) <= '\u0AE1')||(input.LA(1) >= '\u0B05' && input.LA(1) <= '\u0B0C')||(input.LA(1) >= '\u0B0F' && input.LA(1) <= '\u0B10')||(input.LA(1) >= '\u0B13' && input.LA(1) <= '\u0B28')||(input.LA(1) >= '\u0B2A' && input.LA(1) <= '\u0B30')||(input.LA(1) >= '\u0B32' && input.LA(1) <= '\u0B33')||(input.LA(1) >= '\u0B35' && input.LA(1) <= '\u0B39')||input.LA(1)=='\u0B3D'||(input.LA(1) >= '\u0B5C' && input.LA(1) <= '\u0B5D')||(input.LA(1) >= '\u0B5F' && input.LA(1) <= '\u0B61')||input.LA(1)=='\u0B71'||input.LA(1)=='\u0B83'||(input.LA(1) >= '\u0B85' && input.LA(1) <= '\u0B8A')||(input.LA(1) >= '\u0B8E' && input.LA(1) <= '\u0B90')||(input.LA(1) >= '\u0B92' && input.LA(1) <= '\u0B95')||(input.LA(1) >= '\u0B99' && input.LA(1) <= '\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1) >= '\u0B9E' && input.LA(1) <= '\u0B9F')||(input.LA(1) >= '\u0BA3' && input.LA(1) <= '\u0BA4')||(input.LA(1) >= '\u0BA8' && input.LA(1) <= '\u0BAA')||(input.LA(1) >= '\u0BAE' && input.LA(1) <= '\u0BB9')||input.LA(1)=='\u0BD0'||(input.LA(1) >= '\u0C05' && input.LA(1) <= '\u0C0C')||(input.LA(1) >= '\u0C0E' && input.LA(1) <= '\u0C10')||(input.LA(1) >= '\u0C12' && input.LA(1) <= '\u0C28')||(input.LA(1) >= '\u0C2A' && input.LA(1) <= '\u0C33')||(input.LA(1) >= '\u0C35' && input.LA(1) <= '\u0C39')||input.LA(1)=='\u0C3D'||(input.LA(1) >= '\u0C58' && input.LA(1) <= '\u0C59')||(input.LA(1) >= '\u0C60' && input.LA(1) <= '\u0C61')||(input.LA(1) >= '\u0C85' && input.LA(1) <= '\u0C8C')||(input.LA(1) >= '\u0C8E' && input.LA(1) <= '\u0C90')||(input.LA(1) >= '\u0C92' && input.LA(1) <= '\u0CA8')||(input.LA(1) >= '\u0CAA' && input.LA(1) <= '\u0CB3')||(input.LA(1) >= '\u0CB5' && input.LA(1) <= '\u0CB9')||input.LA(1)=='\u0CBD'||input.LA(1)=='\u0CDE'||(input.LA(1) >= '\u0CE0' && input.LA(1) <= '\u0CE1')||(input.LA(1) >= '\u0CF1' && input.LA(1) <= '\u0CF2')||(input.LA(1) >= '\u0D05' && input.LA(1) <= '\u0D0C')||(input.LA(1) >= '\u0D0E' && input.LA(1) <= '\u0D10')||(input.LA(1) >= '\u0D12' && input.LA(1) <= '\u0D3A')||input.LA(1)=='\u0D3D'||input.LA(1)=='\u0D4E'||(input.LA(1) >= '\u0D60' && input.LA(1) <= '\u0D61')||(input.LA(1) >= '\u0D7A' && input.LA(1) <= '\u0D7F')||(input.LA(1) >= '\u0D85' && input.LA(1) <= '\u0D96')||(input.LA(1) >= '\u0D9A' && input.LA(1) <= '\u0DB1')||(input.LA(1) >= '\u0DB3' && input.LA(1) <= '\u0DBB')||input.LA(1)=='\u0DBD'||(input.LA(1) >= '\u0DC0' && input.LA(1) <= '\u0DC6')||(input.LA(1) >= '\u0E01' && input.LA(1) <= '\u0E30')||(input.LA(1) >= '\u0E32' && input.LA(1) <= '\u0E33')||(input.LA(1) >= '\u0E40' && input.LA(1) <= '\u0E45')||(input.LA(1) >= '\u0E81' && input.LA(1) <= '\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1) >= '\u0E87' && input.LA(1) <= '\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1) >= '\u0E94' && input.LA(1) <= '\u0E97')||(input.LA(1) >= '\u0E99' && input.LA(1) <= '\u0E9F')||(input.LA(1) >= '\u0EA1' && input.LA(1) <= '\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1) >= '\u0EAA' && input.LA(1) <= '\u0EAB')||(input.LA(1) >= '\u0EAD' && input.LA(1) <= '\u0EB0')||(input.LA(1) >= '\u0EB2' && input.LA(1) <= '\u0EB3')||input.LA(1)=='\u0EBD'||(input.LA(1) >= '\u0EC0' && input.LA(1) <= '\u0EC4')||(input.LA(1) >= '\u0EDC' && input.LA(1) <= '\u0EDF')||input.LA(1)=='\u0F00'||(input.LA(1) >= '\u0F40' && input.LA(1) <= '\u0F47')||(input.LA(1) >= '\u0F49' && input.LA(1) <= '\u0F6C')||(input.LA(1) >= '\u0F88' && input.LA(1) <= '\u0F8C')||(input.LA(1) >= '\u1000' && input.LA(1) <= '\u102A')||input.LA(1)=='\u103F'||(input.LA(1) >= '\u1050' && input.LA(1) <= '\u1055')||(input.LA(1) >= '\u105A' && input.LA(1) <= '\u105D')||input.LA(1)=='\u1061'||(input.LA(1) >= '\u1065' && input.LA(1) <= '\u1066')||(input.LA(1) >= '\u106E' && input.LA(1) <= '\u1070')||(input.LA(1) >= '\u1075' && input.LA(1) <= '\u1081')||input.LA(1)=='\u108E'||(input.LA(1) >= '\u10D0' && input.LA(1) <= '\u10FA')||(input.LA(1) >= '\u10FD' && input.LA(1) <= '\u1248')||(input.LA(1) >= '\u124A' && input.LA(1) <= '\u124D')||(input.LA(1) >= '\u1250' && input.LA(1) <= '\u1256')||input.LA(1)=='\u1258'||(input.LA(1) >= '\u125A' && input.LA(1) <= '\u125D')||(input.LA(1) >= '\u1260' && input.LA(1) <= '\u1288')||(input.LA(1) >= '\u128A' && input.LA(1) <= '\u128D')||(input.LA(1) >= '\u1290' && input.LA(1) <= '\u12B0')||(input.LA(1) >= '\u12B2' && input.LA(1) <= '\u12B5')||(input.LA(1) >= '\u12B8' && input.LA(1) <= '\u12BE')||input.LA(1)=='\u12C0'||(input.LA(1) >= '\u12C2' && input.LA(1) <= '\u12C5')||(input.LA(1) >= '\u12C8' && input.LA(1) <= '\u12D6')||(input.LA(1) >= '\u12D8' && input.LA(1) <= '\u1310')||(input.LA(1) >= '\u1312' && input.LA(1) <= '\u1315')||(input.LA(1) >= '\u1318' && input.LA(1) <= '\u135A')||(input.LA(1) >= '\u1380' && input.LA(1) <= '\u138F')||(input.LA(1) >= '\u13A0' && input.LA(1) <= '\u13F4')||(input.LA(1) >= '\u1401' && input.LA(1) <= '\u166C')||(input.LA(1) >= '\u166F' && input.LA(1) <= '\u167F')||(input.LA(1) >= '\u1681' && input.LA(1) <= '\u169A')||(input.LA(1) >= '\u16A0' && input.LA(1) <= '\u16EA')||(input.LA(1) >= '\u1700' && input.LA(1) <= '\u170C')||(input.LA(1) >= '\u170E' && input.LA(1) <= '\u1711')||(input.LA(1) >= '\u1720' && input.LA(1) <= '\u1731')||(input.LA(1) >= '\u1740' && input.LA(1) <= '\u1751')||(input.LA(1) >= '\u1760' && input.LA(1) <= '\u176C')||(input.LA(1) >= '\u176E' && input.LA(1) <= '\u1770')||(input.LA(1) >= '\u1780' && input.LA(1) <= '\u17B3')||input.LA(1)=='\u17DC'||(input.LA(1) >= '\u1820' && input.LA(1) <= '\u1842')||(input.LA(1) >= '\u1844' && input.LA(1) <= '\u1877')||(input.LA(1) >= '\u1880' && input.LA(1) <= '\u18A8')||input.LA(1)=='\u18AA'||(input.LA(1) >= '\u18B0' && input.LA(1) <= '\u18F5')||(input.LA(1) >= '\u1900' && input.LA(1) <= '\u191C')||(input.LA(1) >= '\u1950' && input.LA(1) <= '\u196D')||(input.LA(1) >= '\u1970' && input.LA(1) <= '\u1974')||(input.LA(1) >= '\u1980' && input.LA(1) <= '\u19AB')||(input.LA(1) >= '\u19C1' && input.LA(1) <= '\u19C7')||(input.LA(1) >= '\u1A00' && input.LA(1) <= '\u1A16')||(input.LA(1) >= '\u1A20' && input.LA(1) <= '\u1A54')||(input.LA(1) >= '\u1B05' && input.LA(1) <= '\u1B33')||(input.LA(1) >= '\u1B45' && input.LA(1) <= '\u1B4B')||(input.LA(1) >= '\u1B83' && input.LA(1) <= '\u1BA0')||(input.LA(1) >= '\u1BAE' && input.LA(1) <= '\u1BAF')||(input.LA(1) >= '\u1BBA' && input.LA(1) <= '\u1BE5')||(input.LA(1) >= '\u1C00' && input.LA(1) <= '\u1C23')||(input.LA(1) >= '\u1C4D' && input.LA(1) <= '\u1C4F')||(input.LA(1) >= '\u1C5A' && input.LA(1) <= '\u1C77')||(input.LA(1) >= '\u1CE9' && input.LA(1) <= '\u1CEC')||(input.LA(1) >= '\u1CEE' && input.LA(1) <= '\u1CF1')||(input.LA(1) >= '\u1CF5' && input.LA(1) <= '\u1CF6')||(input.LA(1) >= '\u2135' && input.LA(1) <= '\u2138')||(input.LA(1) >= '\u2D30' && input.LA(1) <= '\u2D67')||(input.LA(1) >= '\u2D80' && input.LA(1) <= '\u2D96')||(input.LA(1) >= '\u2DA0' && input.LA(1) <= '\u2DA6')||(input.LA(1) >= '\u2DA8' && input.LA(1) <= '\u2DAE')||(input.LA(1) >= '\u2DB0' && input.LA(1) <= '\u2DB6')||(input.LA(1) >= '\u2DB8' && input.LA(1) <= '\u2DBE')||(input.LA(1) >= '\u2DC0' && input.LA(1) <= '\u2DC6')||(input.LA(1) >= '\u2DC8' && input.LA(1) <= '\u2DCE')||(input.LA(1) >= '\u2DD0' && input.LA(1) <= '\u2DD6')||(input.LA(1) >= '\u2DD8' && input.LA(1) <= '\u2DDE')||input.LA(1)=='\u3006'||input.LA(1)=='\u303C'||(input.LA(1) >= '\u3041' && input.LA(1) <= '\u3096')||input.LA(1)=='\u309F'||(input.LA(1) >= '\u30A1' && input.LA(1) <= '\u30FA')||input.LA(1)=='\u30FF'||(input.LA(1) >= '\u3105' && input.LA(1) <= '\u312D')||(input.LA(1) >= '\u3131' && input.LA(1) <= '\u318E')||(input.LA(1) >= '\u31A0' && input.LA(1) <= '\u31BA')||(input.LA(1) >= '\u31F0' && input.LA(1) <= '\u31FF')||input.LA(1)=='\u3400'||input.LA(1)=='\u4DB5'||input.LA(1)=='\u4E00'||input.LA(1)=='\u9FCC'||(input.LA(1) >= '\uA000' && input.LA(1) <= '\uA014')||(input.LA(1) >= '\uA016' && input.LA(1) <= '\uA48C')||(input.LA(1) >= '\uA4D0' && input.LA(1) <= '\uA4F7')||(input.LA(1) >= '\uA500' && input.LA(1) <= '\uA60B')||(input.LA(1) >= '\uA610' && input.LA(1) <= '\uA61F')||(input.LA(1) >= '\uA62A' && input.LA(1) <= '\uA62B')||input.LA(1)=='\uA66E'||(input.LA(1) >= '\uA6A0' && input.LA(1) <= '\uA6E5')||(input.LA(1) >= '\uA7FB' && input.LA(1) <= '\uA801')||(input.LA(1) >= '\uA803' && input.LA(1) <= '\uA805')||(input.LA(1) >= '\uA807' && input.LA(1) <= '\uA80A')||(input.LA(1) >= '\uA80C' && input.LA(1) <= '\uA822')||(input.LA(1) >= '\uA840' && input.LA(1) <= '\uA873')||(input.LA(1) >= '\uA882' && input.LA(1) <= '\uA8B3')||(input.LA(1) >= '\uA8F2' && input.LA(1) <= '\uA8F7')||input.LA(1)=='\uA8FB'||(input.LA(1) >= '\uA90A' && input.LA(1) <= '\uA925')||(input.LA(1) >= '\uA930' && input.LA(1) <= '\uA946')||(input.LA(1) >= '\uA960' && input.LA(1) <= '\uA97C')||(input.LA(1) >= '\uA984' && input.LA(1) <= '\uA9B2')||(input.LA(1) >= '\uAA00' && input.LA(1) <= '\uAA28')||(input.LA(1) >= '\uAA40' && input.LA(1) <= '\uAA42')||(input.LA(1) >= '\uAA44' && input.LA(1) <= '\uAA4B')||(input.LA(1) >= '\uAA60' && input.LA(1) <= '\uAA6F')||(input.LA(1) >= '\uAA71' && input.LA(1) <= '\uAA76')||input.LA(1)=='\uAA7A'||(input.LA(1) >= '\uAA80' && input.LA(1) <= '\uAAAF')||input.LA(1)=='\uAAB1'||(input.LA(1) >= '\uAAB5' && input.LA(1) <= '\uAAB6')||(input.LA(1) >= '\uAAB9' && input.LA(1) <= '\uAABD')||input.LA(1)=='\uAAC0'||input.LA(1)=='\uAAC2'||(input.LA(1) >= '\uAADB' && input.LA(1) <= '\uAADC')||(input.LA(1) >= '\uAAE0' && input.LA(1) <= '\uAAEA')||input.LA(1)=='\uAAF2'||(input.LA(1) >= '\uAB01' && input.LA(1) <= '\uAB06')||(input.LA(1) >= '\uAB09' && input.LA(1) <= '\uAB0E')||(input.LA(1) >= '\uAB11' && input.LA(1) <= '\uAB16')||(input.LA(1) >= '\uAB20' && input.LA(1) <= '\uAB26')||(input.LA(1) >= '\uAB28' && input.LA(1) <= '\uAB2E')||(input.LA(1) >= '\uABC0' && input.LA(1) <= '\uABE2')||input.LA(1)=='\uAC00'||input.LA(1)=='\uD7A3'||(input.LA(1) >= '\uD7B0' && input.LA(1) <= '\uD7C6')||(input.LA(1) >= '\uD7CB' && input.LA(1) <= '\uD7FB')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFA6D')||(input.LA(1) >= '\uFA70' && input.LA(1) <= '\uFAD9')||input.LA(1)=='\uFB1D'||(input.LA(1) >= '\uFB1F' && input.LA(1) <= '\uFB28')||(input.LA(1) >= '\uFB2A' && input.LA(1) <= '\uFB36')||(input.LA(1) >= '\uFB38' && input.LA(1) <= '\uFB3C')||input.LA(1)=='\uFB3E'||(input.LA(1) >= '\uFB40' && input.LA(1) <= '\uFB41')||(input.LA(1) >= '\uFB43' && input.LA(1) <= '\uFB44')||(input.LA(1) >= '\uFB46' && input.LA(1) <= '\uFBB1')||(input.LA(1) >= '\uFBD3' && input.LA(1) <= '\uFD3D')||(input.LA(1) >= '\uFD50' && input.LA(1) <= '\uFD8F')||(input.LA(1) >= '\uFD92' && input.LA(1) <= '\uFDC7')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFDFB')||(input.LA(1) >= '\uFE70' && input.LA(1) <= '\uFE74')||(input.LA(1) >= '\uFE76' && input.LA(1) <= '\uFEFC')||(input.LA(1) >= '\uFF66' && input.LA(1) <= '\uFF6F')||(input.LA(1) >= '\uFF71' && input.LA(1) <= '\uFF9D')||(input.LA(1) >= '\uFFA0' && input.LA(1) <= '\uFFBE')||(input.LA(1) >= '\uFFC2' && input.LA(1) <= '\uFFC7')||(input.LA(1) >= '\uFFCA' && input.LA(1) <= '\uFFCF')||(input.LA(1) >= '\uFFD2' && input.LA(1) <= '\uFFD7')||(input.LA(1) >= '\uFFDA' && input.LA(1) <= '\uFFDC') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_LO"

    // $ANTLR start "UNICODE_CLASS_LT"
    public final void mUNICODE_CLASS_LT() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:1030:17: ( '\\u01C5' | '\\u01C8' | '\\u01CB' | '\\u01F2' | '\\u1F88' .. '\\u1F8F' | '\\u1F98' .. '\\u1F9F' | '\\u1FA8' .. '\\u1FAF' | '\\u1FBC' | '\\u1FCC' | '\\u1FFC' )
            // Unicode.g:
            {
            if ( input.LA(1)=='\u01C5'||input.LA(1)=='\u01C8'||input.LA(1)=='\u01CB'||input.LA(1)=='\u01F2'||(input.LA(1) >= '\u1F88' && input.LA(1) <= '\u1F8F')||(input.LA(1) >= '\u1F98' && input.LA(1) <= '\u1F9F')||(input.LA(1) >= '\u1FA8' && input.LA(1) <= '\u1FAF')||input.LA(1)=='\u1FBC'||input.LA(1)=='\u1FCC'||input.LA(1)=='\u1FFC' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_LT"

    // $ANTLR start "UNICODE_CLASS_LU"
    public final void mUNICODE_CLASS_LU() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_LU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:1042:17: ( '\\u0041' .. '\\u005A' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00DE' | '\\u0100' | '\\u0102' | '\\u0104' | '\\u0106' | '\\u0108' | '\\u010A' | '\\u010C' | '\\u010E' | '\\u0110' | '\\u0112' | '\\u0114' | '\\u0116' | '\\u0118' | '\\u011A' | '\\u011C' | '\\u011E' | '\\u0120' | '\\u0122' | '\\u0124' | '\\u0126' | '\\u0128' | '\\u012A' | '\\u012C' | '\\u012E' | '\\u0130' | '\\u0132' | '\\u0134' | '\\u0136' | '\\u0139' | '\\u013B' | '\\u013D' | '\\u013F' | '\\u0141' | '\\u0143' | '\\u0145' | '\\u0147' | '\\u014A' | '\\u014C' | '\\u014E' | '\\u0150' | '\\u0152' | '\\u0154' | '\\u0156' | '\\u0158' | '\\u015A' | '\\u015C' | '\\u015E' | '\\u0160' | '\\u0162' | '\\u0164' | '\\u0166' | '\\u0168' | '\\u016A' | '\\u016C' | '\\u016E' | '\\u0170' | '\\u0172' | '\\u0174' | '\\u0176' | '\\u0178' | '\\u0179' | '\\u017B' | '\\u017D' | '\\u0181' | '\\u0182' | '\\u0184' | '\\u0186' | '\\u0187' | '\\u0189' .. '\\u018B' | '\\u018E' .. '\\u0191' | '\\u0193' | '\\u0194' | '\\u0196' .. '\\u0198' | '\\u019C' | '\\u019D' | '\\u019F' | '\\u01A0' | '\\u01A2' | '\\u01A4' | '\\u01A6' | '\\u01A7' | '\\u01A9' | '\\u01AC' | '\\u01AE' | '\\u01AF' | '\\u01B1' .. '\\u01B3' | '\\u01B5' | '\\u01B7' | '\\u01B8' | '\\u01BC' | '\\u01C4' | '\\u01C7' | '\\u01CA' | '\\u01CD' | '\\u01CF' | '\\u01D1' | '\\u01D3' | '\\u01D5' | '\\u01D7' | '\\u01D9' | '\\u01DB' | '\\u01DE' | '\\u01E0' | '\\u01E2' | '\\u01E4' | '\\u01E6' | '\\u01E8' | '\\u01EA' | '\\u01EC' | '\\u01EE' | '\\u01F1' | '\\u01F4' | '\\u01F6' .. '\\u01F8' | '\\u01FA' | '\\u01FC' | '\\u01FE' | '\\u0200' | '\\u0202' | '\\u0204' | '\\u0206' | '\\u0208' | '\\u020A' | '\\u020C' | '\\u020E' | '\\u0210' | '\\u0212' | '\\u0214' | '\\u0216' | '\\u0218' | '\\u021A' | '\\u021C' | '\\u021E' | '\\u0220' | '\\u0222' | '\\u0224' | '\\u0226' | '\\u0228' | '\\u022A' | '\\u022C' | '\\u022E' | '\\u0230' | '\\u0232' | '\\u023A' | '\\u023B' | '\\u023D' | '\\u023E' | '\\u0241' | '\\u0243' .. '\\u0246' | '\\u0248' | '\\u024A' | '\\u024C' | '\\u024E' | '\\u0370' | '\\u0372' | '\\u0376' | '\\u0386' | '\\u0388' .. '\\u038A' | '\\u038C' | '\\u038E' | '\\u038F' | '\\u0391' .. '\\u03A1' | '\\u03A3' .. '\\u03AB' | '\\u03CF' | '\\u03D2' .. '\\u03D4' | '\\u03D8' | '\\u03DA' | '\\u03DC' | '\\u03DE' | '\\u03E0' | '\\u03E2' | '\\u03E4' | '\\u03E6' | '\\u03E8' | '\\u03EA' | '\\u03EC' | '\\u03EE' | '\\u03F4' | '\\u03F7' | '\\u03F9' | '\\u03FA' | '\\u03FD' .. '\\u042F' | '\\u0460' | '\\u0462' | '\\u0464' | '\\u0466' | '\\u0468' | '\\u046A' | '\\u046C' | '\\u046E' | '\\u0470' | '\\u0472' | '\\u0474' | '\\u0476' | '\\u0478' | '\\u047A' | '\\u047C' | '\\u047E' | '\\u0480' | '\\u048A' | '\\u048C' | '\\u048E' | '\\u0490' | '\\u0492' | '\\u0494' | '\\u0496' | '\\u0498' | '\\u049A' | '\\u049C' | '\\u049E' | '\\u04A0' | '\\u04A2' | '\\u04A4' | '\\u04A6' | '\\u04A8' | '\\u04AA' | '\\u04AC' | '\\u04AE' | '\\u04B0' | '\\u04B2' | '\\u04B4' | '\\u04B6' | '\\u04B8' | '\\u04BA' | '\\u04BC' | '\\u04BE' | '\\u04C0' | '\\u04C1' | '\\u04C3' | '\\u04C5' | '\\u04C7' | '\\u04C9' | '\\u04CB' | '\\u04CD' | '\\u04D0' | '\\u04D2' | '\\u04D4' | '\\u04D6' | '\\u04D8' | '\\u04DA' | '\\u04DC' | '\\u04DE' | '\\u04E0' | '\\u04E2' | '\\u04E4' | '\\u04E6' | '\\u04E8' | '\\u04EA' | '\\u04EC' | '\\u04EE' | '\\u04F0' | '\\u04F2' | '\\u04F4' | '\\u04F6' | '\\u04F8' | '\\u04FA' | '\\u04FC' | '\\u04FE' | '\\u0500' | '\\u0502' | '\\u0504' | '\\u0506' | '\\u0508' | '\\u050A' | '\\u050C' | '\\u050E' | '\\u0510' | '\\u0512' | '\\u0514' | '\\u0516' | '\\u0518' | '\\u051A' | '\\u051C' | '\\u051E' | '\\u0520' | '\\u0522' | '\\u0524' | '\\u0526' | '\\u0531' .. '\\u0556' | '\\u10A0' .. '\\u10C5' | '\\u10C7' | '\\u10CD' | '\\u1E00' | '\\u1E02' | '\\u1E04' | '\\u1E06' | '\\u1E08' | '\\u1E0A' | '\\u1E0C' | '\\u1E0E' | '\\u1E10' | '\\u1E12' | '\\u1E14' | '\\u1E16' | '\\u1E18' | '\\u1E1A' | '\\u1E1C' | '\\u1E1E' | '\\u1E20' | '\\u1E22' | '\\u1E24' | '\\u1E26' | '\\u1E28' | '\\u1E2A' | '\\u1E2C' | '\\u1E2E' | '\\u1E30' | '\\u1E32' | '\\u1E34' | '\\u1E36' | '\\u1E38' | '\\u1E3A' | '\\u1E3C' | '\\u1E3E' | '\\u1E40' | '\\u1E42' | '\\u1E44' | '\\u1E46' | '\\u1E48' | '\\u1E4A' | '\\u1E4C' | '\\u1E4E' | '\\u1E50' | '\\u1E52' | '\\u1E54' | '\\u1E56' | '\\u1E58' | '\\u1E5A' | '\\u1E5C' | '\\u1E5E' | '\\u1E60' | '\\u1E62' | '\\u1E64' | '\\u1E66' | '\\u1E68' | '\\u1E6A' | '\\u1E6C' | '\\u1E6E' | '\\u1E70' | '\\u1E72' | '\\u1E74' | '\\u1E76' | '\\u1E78' | '\\u1E7A' | '\\u1E7C' | '\\u1E7E' | '\\u1E80' | '\\u1E82' | '\\u1E84' | '\\u1E86' | '\\u1E88' | '\\u1E8A' | '\\u1E8C' | '\\u1E8E' | '\\u1E90' | '\\u1E92' | '\\u1E94' | '\\u1E9E' | '\\u1EA0' | '\\u1EA2' | '\\u1EA4' | '\\u1EA6' | '\\u1EA8' | '\\u1EAA' | '\\u1EAC' | '\\u1EAE' | '\\u1EB0' | '\\u1EB2' | '\\u1EB4' | '\\u1EB6' | '\\u1EB8' | '\\u1EBA' | '\\u1EBC' | '\\u1EBE' | '\\u1EC0' | '\\u1EC2' | '\\u1EC4' | '\\u1EC6' | '\\u1EC8' | '\\u1ECA' | '\\u1ECC' | '\\u1ECE' | '\\u1ED0' | '\\u1ED2' | '\\u1ED4' | '\\u1ED6' | '\\u1ED8' | '\\u1EDA' | '\\u1EDC' | '\\u1EDE' | '\\u1EE0' | '\\u1EE2' | '\\u1EE4' | '\\u1EE6' | '\\u1EE8' | '\\u1EEA' | '\\u1EEC' | '\\u1EEE' | '\\u1EF0' | '\\u1EF2' | '\\u1EF4' | '\\u1EF6' | '\\u1EF8' | '\\u1EFA' | '\\u1EFC' | '\\u1EFE' | '\\u1F08' .. '\\u1F0F' | '\\u1F18' .. '\\u1F1D' | '\\u1F28' .. '\\u1F2F' | '\\u1F38' .. '\\u1F3F' | '\\u1F48' .. '\\u1F4D' | '\\u1F59' | '\\u1F5B' | '\\u1F5D' | '\\u1F5F' | '\\u1F68' .. '\\u1F6F' | '\\u1FB8' .. '\\u1FBB' | '\\u1FC8' .. '\\u1FCB' | '\\u1FD8' .. '\\u1FDB' | '\\u1FE8' .. '\\u1FEC' | '\\u1FF8' .. '\\u1FFB' | '\\u2102' | '\\u2107' | '\\u210B' .. '\\u210D' | '\\u2110' .. '\\u2112' | '\\u2115' | '\\u2119' .. '\\u211D' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212A' .. '\\u212D' | '\\u2130' .. '\\u2133' | '\\u213E' | '\\u213F' | '\\u2145' | '\\u2183' | '\\u2C00' .. '\\u2C2E' | '\\u2C60' | '\\u2C62' .. '\\u2C64' | '\\u2C67' | '\\u2C69' | '\\u2C6B' | '\\u2C6D' .. '\\u2C70' | '\\u2C72' | '\\u2C75' | '\\u2C7E' .. '\\u2C80' | '\\u2C82' | '\\u2C84' | '\\u2C86' | '\\u2C88' | '\\u2C8A' | '\\u2C8C' | '\\u2C8E' | '\\u2C90' | '\\u2C92' | '\\u2C94' | '\\u2C96' | '\\u2C98' | '\\u2C9A' | '\\u2C9C' | '\\u2C9E' | '\\u2CA0' | '\\u2CA2' | '\\u2CA4' | '\\u2CA6' | '\\u2CA8' | '\\u2CAA' | '\\u2CAC' | '\\u2CAE' | '\\u2CB0' | '\\u2CB2' | '\\u2CB4' | '\\u2CB6' | '\\u2CB8' | '\\u2CBA' | '\\u2CBC' | '\\u2CBE' | '\\u2CC0' | '\\u2CC2' | '\\u2CC4' | '\\u2CC6' | '\\u2CC8' | '\\u2CCA' | '\\u2CCC' | '\\u2CCE' | '\\u2CD0' | '\\u2CD2' | '\\u2CD4' | '\\u2CD6' | '\\u2CD8' | '\\u2CDA' | '\\u2CDC' | '\\u2CDE' | '\\u2CE0' | '\\u2CE2' | '\\u2CEB' | '\\u2CED' | '\\u2CF2' | '\\uA640' | '\\uA642' | '\\uA644' | '\\uA646' | '\\uA648' | '\\uA64A' | '\\uA64C' | '\\uA64E' | '\\uA650' | '\\uA652' | '\\uA654' | '\\uA656' | '\\uA658' | '\\uA65A' | '\\uA65C' | '\\uA65E' | '\\uA660' | '\\uA662' | '\\uA664' | '\\uA666' | '\\uA668' | '\\uA66A' | '\\uA66C' | '\\uA680' | '\\uA682' | '\\uA684' | '\\uA686' | '\\uA688' | '\\uA68A' | '\\uA68C' | '\\uA68E' | '\\uA690' | '\\uA692' | '\\uA694' | '\\uA696' | '\\uA722' | '\\uA724' | '\\uA726' | '\\uA728' | '\\uA72A' | '\\uA72C' | '\\uA72E' | '\\uA732' | '\\uA734' | '\\uA736' | '\\uA738' | '\\uA73A' | '\\uA73C' | '\\uA73E' | '\\uA740' | '\\uA742' | '\\uA744' | '\\uA746' | '\\uA748' | '\\uA74A' | '\\uA74C' | '\\uA74E' | '\\uA750' | '\\uA752' | '\\uA754' | '\\uA756' | '\\uA758' | '\\uA75A' | '\\uA75C' | '\\uA75E' | '\\uA760' | '\\uA762' | '\\uA764' | '\\uA766' | '\\uA768' | '\\uA76A' | '\\uA76C' | '\\uA76E' | '\\uA779' | '\\uA77B' | '\\uA77D' | '\\uA77E' | '\\uA780' | '\\uA782' | '\\uA784' | '\\uA786' | '\\uA78B' | '\\uA78D' | '\\uA790' | '\\uA792' | '\\uA7A0' | '\\uA7A2' | '\\uA7A4' | '\\uA7A6' | '\\uA7A8' | '\\uA7AA' | '\\uFF21' .. '\\uFF3A' )
            // Unicode.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00DE')||input.LA(1)=='\u0100'||input.LA(1)=='\u0102'||input.LA(1)=='\u0104'||input.LA(1)=='\u0106'||input.LA(1)=='\u0108'||input.LA(1)=='\u010A'||input.LA(1)=='\u010C'||input.LA(1)=='\u010E'||input.LA(1)=='\u0110'||input.LA(1)=='\u0112'||input.LA(1)=='\u0114'||input.LA(1)=='\u0116'||input.LA(1)=='\u0118'||input.LA(1)=='\u011A'||input.LA(1)=='\u011C'||input.LA(1)=='\u011E'||input.LA(1)=='\u0120'||input.LA(1)=='\u0122'||input.LA(1)=='\u0124'||input.LA(1)=='\u0126'||input.LA(1)=='\u0128'||input.LA(1)=='\u012A'||input.LA(1)=='\u012C'||input.LA(1)=='\u012E'||input.LA(1)=='\u0130'||input.LA(1)=='\u0132'||input.LA(1)=='\u0134'||input.LA(1)=='\u0136'||input.LA(1)=='\u0139'||input.LA(1)=='\u013B'||input.LA(1)=='\u013D'||input.LA(1)=='\u013F'||input.LA(1)=='\u0141'||input.LA(1)=='\u0143'||input.LA(1)=='\u0145'||input.LA(1)=='\u0147'||input.LA(1)=='\u014A'||input.LA(1)=='\u014C'||input.LA(1)=='\u014E'||input.LA(1)=='\u0150'||input.LA(1)=='\u0152'||input.LA(1)=='\u0154'||input.LA(1)=='\u0156'||input.LA(1)=='\u0158'||input.LA(1)=='\u015A'||input.LA(1)=='\u015C'||input.LA(1)=='\u015E'||input.LA(1)=='\u0160'||input.LA(1)=='\u0162'||input.LA(1)=='\u0164'||input.LA(1)=='\u0166'||input.LA(1)=='\u0168'||input.LA(1)=='\u016A'||input.LA(1)=='\u016C'||input.LA(1)=='\u016E'||input.LA(1)=='\u0170'||input.LA(1)=='\u0172'||input.LA(1)=='\u0174'||input.LA(1)=='\u0176'||(input.LA(1) >= '\u0178' && input.LA(1) <= '\u0179')||input.LA(1)=='\u017B'||input.LA(1)=='\u017D'||(input.LA(1) >= '\u0181' && input.LA(1) <= '\u0182')||input.LA(1)=='\u0184'||(input.LA(1) >= '\u0186' && input.LA(1) <= '\u0187')||(input.LA(1) >= '\u0189' && input.LA(1) <= '\u018B')||(input.LA(1) >= '\u018E' && input.LA(1) <= '\u0191')||(input.LA(1) >= '\u0193' && input.LA(1) <= '\u0194')||(input.LA(1) >= '\u0196' && input.LA(1) <= '\u0198')||(input.LA(1) >= '\u019C' && input.LA(1) <= '\u019D')||(input.LA(1) >= '\u019F' && input.LA(1) <= '\u01A0')||input.LA(1)=='\u01A2'||input.LA(1)=='\u01A4'||(input.LA(1) >= '\u01A6' && input.LA(1) <= '\u01A7')||input.LA(1)=='\u01A9'||input.LA(1)=='\u01AC'||(input.LA(1) >= '\u01AE' && input.LA(1) <= '\u01AF')||(input.LA(1) >= '\u01B1' && input.LA(1) <= '\u01B3')||input.LA(1)=='\u01B5'||(input.LA(1) >= '\u01B7' && input.LA(1) <= '\u01B8')||input.LA(1)=='\u01BC'||input.LA(1)=='\u01C4'||input.LA(1)=='\u01C7'||input.LA(1)=='\u01CA'||input.LA(1)=='\u01CD'||input.LA(1)=='\u01CF'||input.LA(1)=='\u01D1'||input.LA(1)=='\u01D3'||input.LA(1)=='\u01D5'||input.LA(1)=='\u01D7'||input.LA(1)=='\u01D9'||input.LA(1)=='\u01DB'||input.LA(1)=='\u01DE'||input.LA(1)=='\u01E0'||input.LA(1)=='\u01E2'||input.LA(1)=='\u01E4'||input.LA(1)=='\u01E6'||input.LA(1)=='\u01E8'||input.LA(1)=='\u01EA'||input.LA(1)=='\u01EC'||input.LA(1)=='\u01EE'||input.LA(1)=='\u01F1'||input.LA(1)=='\u01F4'||(input.LA(1) >= '\u01F6' && input.LA(1) <= '\u01F8')||input.LA(1)=='\u01FA'||input.LA(1)=='\u01FC'||input.LA(1)=='\u01FE'||input.LA(1)=='\u0200'||input.LA(1)=='\u0202'||input.LA(1)=='\u0204'||input.LA(1)=='\u0206'||input.LA(1)=='\u0208'||input.LA(1)=='\u020A'||input.LA(1)=='\u020C'||input.LA(1)=='\u020E'||input.LA(1)=='\u0210'||input.LA(1)=='\u0212'||input.LA(1)=='\u0214'||input.LA(1)=='\u0216'||input.LA(1)=='\u0218'||input.LA(1)=='\u021A'||input.LA(1)=='\u021C'||input.LA(1)=='\u021E'||input.LA(1)=='\u0220'||input.LA(1)=='\u0222'||input.LA(1)=='\u0224'||input.LA(1)=='\u0226'||input.LA(1)=='\u0228'||input.LA(1)=='\u022A'||input.LA(1)=='\u022C'||input.LA(1)=='\u022E'||input.LA(1)=='\u0230'||input.LA(1)=='\u0232'||(input.LA(1) >= '\u023A' && input.LA(1) <= '\u023B')||(input.LA(1) >= '\u023D' && input.LA(1) <= '\u023E')||input.LA(1)=='\u0241'||(input.LA(1) >= '\u0243' && input.LA(1) <= '\u0246')||input.LA(1)=='\u0248'||input.LA(1)=='\u024A'||input.LA(1)=='\u024C'||input.LA(1)=='\u024E'||input.LA(1)=='\u0370'||input.LA(1)=='\u0372'||input.LA(1)=='\u0376'||input.LA(1)=='\u0386'||(input.LA(1) >= '\u0388' && input.LA(1) <= '\u038A')||input.LA(1)=='\u038C'||(input.LA(1) >= '\u038E' && input.LA(1) <= '\u038F')||(input.LA(1) >= '\u0391' && input.LA(1) <= '\u03A1')||(input.LA(1) >= '\u03A3' && input.LA(1) <= '\u03AB')||input.LA(1)=='\u03CF'||(input.LA(1) >= '\u03D2' && input.LA(1) <= '\u03D4')||input.LA(1)=='\u03D8'||input.LA(1)=='\u03DA'||input.LA(1)=='\u03DC'||input.LA(1)=='\u03DE'||input.LA(1)=='\u03E0'||input.LA(1)=='\u03E2'||input.LA(1)=='\u03E4'||input.LA(1)=='\u03E6'||input.LA(1)=='\u03E8'||input.LA(1)=='\u03EA'||input.LA(1)=='\u03EC'||input.LA(1)=='\u03EE'||input.LA(1)=='\u03F4'||input.LA(1)=='\u03F7'||(input.LA(1) >= '\u03F9' && input.LA(1) <= '\u03FA')||(input.LA(1) >= '\u03FD' && input.LA(1) <= '\u042F')||input.LA(1)=='\u0460'||input.LA(1)=='\u0462'||input.LA(1)=='\u0464'||input.LA(1)=='\u0466'||input.LA(1)=='\u0468'||input.LA(1)=='\u046A'||input.LA(1)=='\u046C'||input.LA(1)=='\u046E'||input.LA(1)=='\u0470'||input.LA(1)=='\u0472'||input.LA(1)=='\u0474'||input.LA(1)=='\u0476'||input.LA(1)=='\u0478'||input.LA(1)=='\u047A'||input.LA(1)=='\u047C'||input.LA(1)=='\u047E'||input.LA(1)=='\u0480'||input.LA(1)=='\u048A'||input.LA(1)=='\u048C'||input.LA(1)=='\u048E'||input.LA(1)=='\u0490'||input.LA(1)=='\u0492'||input.LA(1)=='\u0494'||input.LA(1)=='\u0496'||input.LA(1)=='\u0498'||input.LA(1)=='\u049A'||input.LA(1)=='\u049C'||input.LA(1)=='\u049E'||input.LA(1)=='\u04A0'||input.LA(1)=='\u04A2'||input.LA(1)=='\u04A4'||input.LA(1)=='\u04A6'||input.LA(1)=='\u04A8'||input.LA(1)=='\u04AA'||input.LA(1)=='\u04AC'||input.LA(1)=='\u04AE'||input.LA(1)=='\u04B0'||input.LA(1)=='\u04B2'||input.LA(1)=='\u04B4'||input.LA(1)=='\u04B6'||input.LA(1)=='\u04B8'||input.LA(1)=='\u04BA'||input.LA(1)=='\u04BC'||input.LA(1)=='\u04BE'||(input.LA(1) >= '\u04C0' && input.LA(1) <= '\u04C1')||input.LA(1)=='\u04C3'||input.LA(1)=='\u04C5'||input.LA(1)=='\u04C7'||input.LA(1)=='\u04C9'||input.LA(1)=='\u04CB'||input.LA(1)=='\u04CD'||input.LA(1)=='\u04D0'||input.LA(1)=='\u04D2'||input.LA(1)=='\u04D4'||input.LA(1)=='\u04D6'||input.LA(1)=='\u04D8'||input.LA(1)=='\u04DA'||input.LA(1)=='\u04DC'||input.LA(1)=='\u04DE'||input.LA(1)=='\u04E0'||input.LA(1)=='\u04E2'||input.LA(1)=='\u04E4'||input.LA(1)=='\u04E6'||input.LA(1)=='\u04E8'||input.LA(1)=='\u04EA'||input.LA(1)=='\u04EC'||input.LA(1)=='\u04EE'||input.LA(1)=='\u04F0'||input.LA(1)=='\u04F2'||input.LA(1)=='\u04F4'||input.LA(1)=='\u04F6'||input.LA(1)=='\u04F8'||input.LA(1)=='\u04FA'||input.LA(1)=='\u04FC'||input.LA(1)=='\u04FE'||input.LA(1)=='\u0500'||input.LA(1)=='\u0502'||input.LA(1)=='\u0504'||input.LA(1)=='\u0506'||input.LA(1)=='\u0508'||input.LA(1)=='\u050A'||input.LA(1)=='\u050C'||input.LA(1)=='\u050E'||input.LA(1)=='\u0510'||input.LA(1)=='\u0512'||input.LA(1)=='\u0514'||input.LA(1)=='\u0516'||input.LA(1)=='\u0518'||input.LA(1)=='\u051A'||input.LA(1)=='\u051C'||input.LA(1)=='\u051E'||input.LA(1)=='\u0520'||input.LA(1)=='\u0522'||input.LA(1)=='\u0524'||input.LA(1)=='\u0526'||(input.LA(1) >= '\u0531' && input.LA(1) <= '\u0556')||(input.LA(1) >= '\u10A0' && input.LA(1) <= '\u10C5')||input.LA(1)=='\u10C7'||input.LA(1)=='\u10CD'||input.LA(1)=='\u1E00'||input.LA(1)=='\u1E02'||input.LA(1)=='\u1E04'||input.LA(1)=='\u1E06'||input.LA(1)=='\u1E08'||input.LA(1)=='\u1E0A'||input.LA(1)=='\u1E0C'||input.LA(1)=='\u1E0E'||input.LA(1)=='\u1E10'||input.LA(1)=='\u1E12'||input.LA(1)=='\u1E14'||input.LA(1)=='\u1E16'||input.LA(1)=='\u1E18'||input.LA(1)=='\u1E1A'||input.LA(1)=='\u1E1C'||input.LA(1)=='\u1E1E'||input.LA(1)=='\u1E20'||input.LA(1)=='\u1E22'||input.LA(1)=='\u1E24'||input.LA(1)=='\u1E26'||input.LA(1)=='\u1E28'||input.LA(1)=='\u1E2A'||input.LA(1)=='\u1E2C'||input.LA(1)=='\u1E2E'||input.LA(1)=='\u1E30'||input.LA(1)=='\u1E32'||input.LA(1)=='\u1E34'||input.LA(1)=='\u1E36'||input.LA(1)=='\u1E38'||input.LA(1)=='\u1E3A'||input.LA(1)=='\u1E3C'||input.LA(1)=='\u1E3E'||input.LA(1)=='\u1E40'||input.LA(1)=='\u1E42'||input.LA(1)=='\u1E44'||input.LA(1)=='\u1E46'||input.LA(1)=='\u1E48'||input.LA(1)=='\u1E4A'||input.LA(1)=='\u1E4C'||input.LA(1)=='\u1E4E'||input.LA(1)=='\u1E50'||input.LA(1)=='\u1E52'||input.LA(1)=='\u1E54'||input.LA(1)=='\u1E56'||input.LA(1)=='\u1E58'||input.LA(1)=='\u1E5A'||input.LA(1)=='\u1E5C'||input.LA(1)=='\u1E5E'||input.LA(1)=='\u1E60'||input.LA(1)=='\u1E62'||input.LA(1)=='\u1E64'||input.LA(1)=='\u1E66'||input.LA(1)=='\u1E68'||input.LA(1)=='\u1E6A'||input.LA(1)=='\u1E6C'||input.LA(1)=='\u1E6E'||input.LA(1)=='\u1E70'||input.LA(1)=='\u1E72'||input.LA(1)=='\u1E74'||input.LA(1)=='\u1E76'||input.LA(1)=='\u1E78'||input.LA(1)=='\u1E7A'||input.LA(1)=='\u1E7C'||input.LA(1)=='\u1E7E'||input.LA(1)=='\u1E80'||input.LA(1)=='\u1E82'||input.LA(1)=='\u1E84'||input.LA(1)=='\u1E86'||input.LA(1)=='\u1E88'||input.LA(1)=='\u1E8A'||input.LA(1)=='\u1E8C'||input.LA(1)=='\u1E8E'||input.LA(1)=='\u1E90'||input.LA(1)=='\u1E92'||input.LA(1)=='\u1E94'||input.LA(1)=='\u1E9E'||input.LA(1)=='\u1EA0'||input.LA(1)=='\u1EA2'||input.LA(1)=='\u1EA4'||input.LA(1)=='\u1EA6'||input.LA(1)=='\u1EA8'||input.LA(1)=='\u1EAA'||input.LA(1)=='\u1EAC'||input.LA(1)=='\u1EAE'||input.LA(1)=='\u1EB0'||input.LA(1)=='\u1EB2'||input.LA(1)=='\u1EB4'||input.LA(1)=='\u1EB6'||input.LA(1)=='\u1EB8'||input.LA(1)=='\u1EBA'||input.LA(1)=='\u1EBC'||input.LA(1)=='\u1EBE'||input.LA(1)=='\u1EC0'||input.LA(1)=='\u1EC2'||input.LA(1)=='\u1EC4'||input.LA(1)=='\u1EC6'||input.LA(1)=='\u1EC8'||input.LA(1)=='\u1ECA'||input.LA(1)=='\u1ECC'||input.LA(1)=='\u1ECE'||input.LA(1)=='\u1ED0'||input.LA(1)=='\u1ED2'||input.LA(1)=='\u1ED4'||input.LA(1)=='\u1ED6'||input.LA(1)=='\u1ED8'||input.LA(1)=='\u1EDA'||input.LA(1)=='\u1EDC'||input.LA(1)=='\u1EDE'||input.LA(1)=='\u1EE0'||input.LA(1)=='\u1EE2'||input.LA(1)=='\u1EE4'||input.LA(1)=='\u1EE6'||input.LA(1)=='\u1EE8'||input.LA(1)=='\u1EEA'||input.LA(1)=='\u1EEC'||input.LA(1)=='\u1EEE'||input.LA(1)=='\u1EF0'||input.LA(1)=='\u1EF2'||input.LA(1)=='\u1EF4'||input.LA(1)=='\u1EF6'||input.LA(1)=='\u1EF8'||input.LA(1)=='\u1EFA'||input.LA(1)=='\u1EFC'||input.LA(1)=='\u1EFE'||(input.LA(1) >= '\u1F08' && input.LA(1) <= '\u1F0F')||(input.LA(1) >= '\u1F18' && input.LA(1) <= '\u1F1D')||(input.LA(1) >= '\u1F28' && input.LA(1) <= '\u1F2F')||(input.LA(1) >= '\u1F38' && input.LA(1) <= '\u1F3F')||(input.LA(1) >= '\u1F48' && input.LA(1) <= '\u1F4D')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||input.LA(1)=='\u1F5F'||(input.LA(1) >= '\u1F68' && input.LA(1) <= '\u1F6F')||(input.LA(1) >= '\u1FB8' && input.LA(1) <= '\u1FBB')||(input.LA(1) >= '\u1FC8' && input.LA(1) <= '\u1FCB')||(input.LA(1) >= '\u1FD8' && input.LA(1) <= '\u1FDB')||(input.LA(1) >= '\u1FE8' && input.LA(1) <= '\u1FEC')||(input.LA(1) >= '\u1FF8' && input.LA(1) <= '\u1FFB')||input.LA(1)=='\u2102'||input.LA(1)=='\u2107'||(input.LA(1) >= '\u210B' && input.LA(1) <= '\u210D')||(input.LA(1) >= '\u2110' && input.LA(1) <= '\u2112')||input.LA(1)=='\u2115'||(input.LA(1) >= '\u2119' && input.LA(1) <= '\u211D')||input.LA(1)=='\u2124'||input.LA(1)=='\u2126'||input.LA(1)=='\u2128'||(input.LA(1) >= '\u212A' && input.LA(1) <= '\u212D')||(input.LA(1) >= '\u2130' && input.LA(1) <= '\u2133')||(input.LA(1) >= '\u213E' && input.LA(1) <= '\u213F')||input.LA(1)=='\u2145'||input.LA(1)=='\u2183'||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2C2E')||input.LA(1)=='\u2C60'||(input.LA(1) >= '\u2C62' && input.LA(1) <= '\u2C64')||input.LA(1)=='\u2C67'||input.LA(1)=='\u2C69'||input.LA(1)=='\u2C6B'||(input.LA(1) >= '\u2C6D' && input.LA(1) <= '\u2C70')||input.LA(1)=='\u2C72'||input.LA(1)=='\u2C75'||(input.LA(1) >= '\u2C7E' && input.LA(1) <= '\u2C80')||input.LA(1)=='\u2C82'||input.LA(1)=='\u2C84'||input.LA(1)=='\u2C86'||input.LA(1)=='\u2C88'||input.LA(1)=='\u2C8A'||input.LA(1)=='\u2C8C'||input.LA(1)=='\u2C8E'||input.LA(1)=='\u2C90'||input.LA(1)=='\u2C92'||input.LA(1)=='\u2C94'||input.LA(1)=='\u2C96'||input.LA(1)=='\u2C98'||input.LA(1)=='\u2C9A'||input.LA(1)=='\u2C9C'||input.LA(1)=='\u2C9E'||input.LA(1)=='\u2CA0'||input.LA(1)=='\u2CA2'||input.LA(1)=='\u2CA4'||input.LA(1)=='\u2CA6'||input.LA(1)=='\u2CA8'||input.LA(1)=='\u2CAA'||input.LA(1)=='\u2CAC'||input.LA(1)=='\u2CAE'||input.LA(1)=='\u2CB0'||input.LA(1)=='\u2CB2'||input.LA(1)=='\u2CB4'||input.LA(1)=='\u2CB6'||input.LA(1)=='\u2CB8'||input.LA(1)=='\u2CBA'||input.LA(1)=='\u2CBC'||input.LA(1)=='\u2CBE'||input.LA(1)=='\u2CC0'||input.LA(1)=='\u2CC2'||input.LA(1)=='\u2CC4'||input.LA(1)=='\u2CC6'||input.LA(1)=='\u2CC8'||input.LA(1)=='\u2CCA'||input.LA(1)=='\u2CCC'||input.LA(1)=='\u2CCE'||input.LA(1)=='\u2CD0'||input.LA(1)=='\u2CD2'||input.LA(1)=='\u2CD4'||input.LA(1)=='\u2CD6'||input.LA(1)=='\u2CD8'||input.LA(1)=='\u2CDA'||input.LA(1)=='\u2CDC'||input.LA(1)=='\u2CDE'||input.LA(1)=='\u2CE0'||input.LA(1)=='\u2CE2'||input.LA(1)=='\u2CEB'||input.LA(1)=='\u2CED'||input.LA(1)=='\u2CF2'||input.LA(1)=='\uA640'||input.LA(1)=='\uA642'||input.LA(1)=='\uA644'||input.LA(1)=='\uA646'||input.LA(1)=='\uA648'||input.LA(1)=='\uA64A'||input.LA(1)=='\uA64C'||input.LA(1)=='\uA64E'||input.LA(1)=='\uA650'||input.LA(1)=='\uA652'||input.LA(1)=='\uA654'||input.LA(1)=='\uA656'||input.LA(1)=='\uA658'||input.LA(1)=='\uA65A'||input.LA(1)=='\uA65C'||input.LA(1)=='\uA65E'||input.LA(1)=='\uA660'||input.LA(1)=='\uA662'||input.LA(1)=='\uA664'||input.LA(1)=='\uA666'||input.LA(1)=='\uA668'||input.LA(1)=='\uA66A'||input.LA(1)=='\uA66C'||input.LA(1)=='\uA680'||input.LA(1)=='\uA682'||input.LA(1)=='\uA684'||input.LA(1)=='\uA686'||input.LA(1)=='\uA688'||input.LA(1)=='\uA68A'||input.LA(1)=='\uA68C'||input.LA(1)=='\uA68E'||input.LA(1)=='\uA690'||input.LA(1)=='\uA692'||input.LA(1)=='\uA694'||input.LA(1)=='\uA696'||input.LA(1)=='\uA722'||input.LA(1)=='\uA724'||input.LA(1)=='\uA726'||input.LA(1)=='\uA728'||input.LA(1)=='\uA72A'||input.LA(1)=='\uA72C'||input.LA(1)=='\uA72E'||input.LA(1)=='\uA732'||input.LA(1)=='\uA734'||input.LA(1)=='\uA736'||input.LA(1)=='\uA738'||input.LA(1)=='\uA73A'||input.LA(1)=='\uA73C'||input.LA(1)=='\uA73E'||input.LA(1)=='\uA740'||input.LA(1)=='\uA742'||input.LA(1)=='\uA744'||input.LA(1)=='\uA746'||input.LA(1)=='\uA748'||input.LA(1)=='\uA74A'||input.LA(1)=='\uA74C'||input.LA(1)=='\uA74E'||input.LA(1)=='\uA750'||input.LA(1)=='\uA752'||input.LA(1)=='\uA754'||input.LA(1)=='\uA756'||input.LA(1)=='\uA758'||input.LA(1)=='\uA75A'||input.LA(1)=='\uA75C'||input.LA(1)=='\uA75E'||input.LA(1)=='\uA760'||input.LA(1)=='\uA762'||input.LA(1)=='\uA764'||input.LA(1)=='\uA766'||input.LA(1)=='\uA768'||input.LA(1)=='\uA76A'||input.LA(1)=='\uA76C'||input.LA(1)=='\uA76E'||input.LA(1)=='\uA779'||input.LA(1)=='\uA77B'||(input.LA(1) >= '\uA77D' && input.LA(1) <= '\uA77E')||input.LA(1)=='\uA780'||input.LA(1)=='\uA782'||input.LA(1)=='\uA784'||input.LA(1)=='\uA786'||input.LA(1)=='\uA78B'||input.LA(1)=='\uA78D'||input.LA(1)=='\uA790'||input.LA(1)=='\uA792'||input.LA(1)=='\uA7A0'||input.LA(1)=='\uA7A2'||input.LA(1)=='\uA7A4'||input.LA(1)=='\uA7A6'||input.LA(1)=='\uA7A8'||input.LA(1)=='\uA7AA'||(input.LA(1) >= '\uFF21' && input.LA(1) <= '\uFF3A') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_LU"

    // $ANTLR start "UNICODE_CLASS_MC"
    public final void mUNICODE_CLASS_MC() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_MC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:1636:17: ( '\\u0903' | '\\u093B' | '\\u093E' .. '\\u0940' | '\\u0949' .. '\\u094C' | '\\u094E' | '\\u094F' | '\\u0982' | '\\u0983' | '\\u09BE' .. '\\u09C0' | '\\u09C7' | '\\u09C8' | '\\u09CB' | '\\u09CC' | '\\u09D7' | '\\u0A03' | '\\u0A3E' .. '\\u0A40' | '\\u0A83' | '\\u0ABE' .. '\\u0AC0' | '\\u0AC9' | '\\u0ACB' | '\\u0ACC' | '\\u0B02' | '\\u0B03' | '\\u0B3E' | '\\u0B40' | '\\u0B47' | '\\u0B48' | '\\u0B4B' | '\\u0B4C' | '\\u0B57' | '\\u0BBE' | '\\u0BBF' | '\\u0BC1' | '\\u0BC2' | '\\u0BC6' .. '\\u0BC8' | '\\u0BCA' .. '\\u0BCC' | '\\u0BD7' | '\\u0C01' .. '\\u0C03' | '\\u0C41' .. '\\u0C44' | '\\u0C82' | '\\u0C83' | '\\u0CBE' | '\\u0CC0' .. '\\u0CC4' | '\\u0CC7' | '\\u0CC8' | '\\u0CCA' | '\\u0CCB' | '\\u0CD5' | '\\u0CD6' | '\\u0D02' | '\\u0D03' | '\\u0D3E' .. '\\u0D40' | '\\u0D46' .. '\\u0D48' | '\\u0D4A' .. '\\u0D4C' | '\\u0D57' | '\\u0D82' | '\\u0D83' | '\\u0DCF' .. '\\u0DD1' | '\\u0DD8' .. '\\u0DDF' | '\\u0DF2' | '\\u0DF3' | '\\u0F3E' | '\\u0F3F' | '\\u0F7F' | '\\u102B' | '\\u102C' | '\\u1031' | '\\u1038' | '\\u103B' | '\\u103C' | '\\u1056' | '\\u1057' | '\\u1062' .. '\\u1064' | '\\u1067' .. '\\u106D' | '\\u1083' | '\\u1084' | '\\u1087' .. '\\u108C' | '\\u108F' | '\\u109A' .. '\\u109C' | '\\u17B6' | '\\u17BE' .. '\\u17C5' | '\\u17C7' | '\\u17C8' | '\\u1923' .. '\\u1926' | '\\u1929' .. '\\u192B' | '\\u1930' | '\\u1931' | '\\u1933' .. '\\u1938' | '\\u19B0' .. '\\u19C0' | '\\u19C8' | '\\u19C9' | '\\u1A19' .. '\\u1A1B' | '\\u1A55' | '\\u1A57' | '\\u1A61' | '\\u1A63' | '\\u1A64' | '\\u1A6D' .. '\\u1A72' | '\\u1B04' | '\\u1B35' | '\\u1B3B' | '\\u1B3D' .. '\\u1B41' | '\\u1B43' | '\\u1B44' | '\\u1B82' | '\\u1BA1' | '\\u1BA6' | '\\u1BA7' | '\\u1BAA' | '\\u1BAC' | '\\u1BAD' | '\\u1BE7' | '\\u1BEA' .. '\\u1BEC' | '\\u1BEE' | '\\u1BF2' | '\\u1BF3' | '\\u1C24' .. '\\u1C2B' | '\\u1C34' | '\\u1C35' | '\\u1CE1' | '\\u1CF2' | '\\u1CF3' | '\\u302E' | '\\u302F' | '\\uA823' | '\\uA824' | '\\uA827' | '\\uA880' | '\\uA881' | '\\uA8B4' .. '\\uA8C3' | '\\uA952' | '\\uA953' | '\\uA983' | '\\uA9B4' | '\\uA9B5' | '\\uA9BA' | '\\uA9BB' | '\\uA9BD' .. '\\uA9C0' | '\\uAA2F' | '\\uAA30' | '\\uAA33' | '\\uAA34' | '\\uAA4D' | '\\uAA7B' | '\\uAAEB' | '\\uAAEE' | '\\uAAEF' | '\\uAAF5' | '\\uABE3' | '\\uABE4' | '\\uABE6' | '\\uABE7' | '\\uABE9' | '\\uABEA' | '\\uABEC' )
            // Unicode.g:
            {
            if ( input.LA(1)=='\u0903'||input.LA(1)=='\u093B'||(input.LA(1) >= '\u093E' && input.LA(1) <= '\u0940')||(input.LA(1) >= '\u0949' && input.LA(1) <= '\u094C')||(input.LA(1) >= '\u094E' && input.LA(1) <= '\u094F')||(input.LA(1) >= '\u0982' && input.LA(1) <= '\u0983')||(input.LA(1) >= '\u09BE' && input.LA(1) <= '\u09C0')||(input.LA(1) >= '\u09C7' && input.LA(1) <= '\u09C8')||(input.LA(1) >= '\u09CB' && input.LA(1) <= '\u09CC')||input.LA(1)=='\u09D7'||input.LA(1)=='\u0A03'||(input.LA(1) >= '\u0A3E' && input.LA(1) <= '\u0A40')||input.LA(1)=='\u0A83'||(input.LA(1) >= '\u0ABE' && input.LA(1) <= '\u0AC0')||input.LA(1)=='\u0AC9'||(input.LA(1) >= '\u0ACB' && input.LA(1) <= '\u0ACC')||(input.LA(1) >= '\u0B02' && input.LA(1) <= '\u0B03')||input.LA(1)=='\u0B3E'||input.LA(1)=='\u0B40'||(input.LA(1) >= '\u0B47' && input.LA(1) <= '\u0B48')||(input.LA(1) >= '\u0B4B' && input.LA(1) <= '\u0B4C')||input.LA(1)=='\u0B57'||(input.LA(1) >= '\u0BBE' && input.LA(1) <= '\u0BBF')||(input.LA(1) >= '\u0BC1' && input.LA(1) <= '\u0BC2')||(input.LA(1) >= '\u0BC6' && input.LA(1) <= '\u0BC8')||(input.LA(1) >= '\u0BCA' && input.LA(1) <= '\u0BCC')||input.LA(1)=='\u0BD7'||(input.LA(1) >= '\u0C01' && input.LA(1) <= '\u0C03')||(input.LA(1) >= '\u0C41' && input.LA(1) <= '\u0C44')||(input.LA(1) >= '\u0C82' && input.LA(1) <= '\u0C83')||input.LA(1)=='\u0CBE'||(input.LA(1) >= '\u0CC0' && input.LA(1) <= '\u0CC4')||(input.LA(1) >= '\u0CC7' && input.LA(1) <= '\u0CC8')||(input.LA(1) >= '\u0CCA' && input.LA(1) <= '\u0CCB')||(input.LA(1) >= '\u0CD5' && input.LA(1) <= '\u0CD6')||(input.LA(1) >= '\u0D02' && input.LA(1) <= '\u0D03')||(input.LA(1) >= '\u0D3E' && input.LA(1) <= '\u0D40')||(input.LA(1) >= '\u0D46' && input.LA(1) <= '\u0D48')||(input.LA(1) >= '\u0D4A' && input.LA(1) <= '\u0D4C')||input.LA(1)=='\u0D57'||(input.LA(1) >= '\u0D82' && input.LA(1) <= '\u0D83')||(input.LA(1) >= '\u0DCF' && input.LA(1) <= '\u0DD1')||(input.LA(1) >= '\u0DD8' && input.LA(1) <= '\u0DDF')||(input.LA(1) >= '\u0DF2' && input.LA(1) <= '\u0DF3')||(input.LA(1) >= '\u0F3E' && input.LA(1) <= '\u0F3F')||input.LA(1)=='\u0F7F'||(input.LA(1) >= '\u102B' && input.LA(1) <= '\u102C')||input.LA(1)=='\u1031'||input.LA(1)=='\u1038'||(input.LA(1) >= '\u103B' && input.LA(1) <= '\u103C')||(input.LA(1) >= '\u1056' && input.LA(1) <= '\u1057')||(input.LA(1) >= '\u1062' && input.LA(1) <= '\u1064')||(input.LA(1) >= '\u1067' && input.LA(1) <= '\u106D')||(input.LA(1) >= '\u1083' && input.LA(1) <= '\u1084')||(input.LA(1) >= '\u1087' && input.LA(1) <= '\u108C')||input.LA(1)=='\u108F'||(input.LA(1) >= '\u109A' && input.LA(1) <= '\u109C')||input.LA(1)=='\u17B6'||(input.LA(1) >= '\u17BE' && input.LA(1) <= '\u17C5')||(input.LA(1) >= '\u17C7' && input.LA(1) <= '\u17C8')||(input.LA(1) >= '\u1923' && input.LA(1) <= '\u1926')||(input.LA(1) >= '\u1929' && input.LA(1) <= '\u192B')||(input.LA(1) >= '\u1930' && input.LA(1) <= '\u1931')||(input.LA(1) >= '\u1933' && input.LA(1) <= '\u1938')||(input.LA(1) >= '\u19B0' && input.LA(1) <= '\u19C0')||(input.LA(1) >= '\u19C8' && input.LA(1) <= '\u19C9')||(input.LA(1) >= '\u1A19' && input.LA(1) <= '\u1A1B')||input.LA(1)=='\u1A55'||input.LA(1)=='\u1A57'||input.LA(1)=='\u1A61'||(input.LA(1) >= '\u1A63' && input.LA(1) <= '\u1A64')||(input.LA(1) >= '\u1A6D' && input.LA(1) <= '\u1A72')||input.LA(1)=='\u1B04'||input.LA(1)=='\u1B35'||input.LA(1)=='\u1B3B'||(input.LA(1) >= '\u1B3D' && input.LA(1) <= '\u1B41')||(input.LA(1) >= '\u1B43' && input.LA(1) <= '\u1B44')||input.LA(1)=='\u1B82'||input.LA(1)=='\u1BA1'||(input.LA(1) >= '\u1BA6' && input.LA(1) <= '\u1BA7')||input.LA(1)=='\u1BAA'||(input.LA(1) >= '\u1BAC' && input.LA(1) <= '\u1BAD')||input.LA(1)=='\u1BE7'||(input.LA(1) >= '\u1BEA' && input.LA(1) <= '\u1BEC')||input.LA(1)=='\u1BEE'||(input.LA(1) >= '\u1BF2' && input.LA(1) <= '\u1BF3')||(input.LA(1) >= '\u1C24' && input.LA(1) <= '\u1C2B')||(input.LA(1) >= '\u1C34' && input.LA(1) <= '\u1C35')||input.LA(1)=='\u1CE1'||(input.LA(1) >= '\u1CF2' && input.LA(1) <= '\u1CF3')||(input.LA(1) >= '\u302E' && input.LA(1) <= '\u302F')||(input.LA(1) >= '\uA823' && input.LA(1) <= '\uA824')||input.LA(1)=='\uA827'||(input.LA(1) >= '\uA880' && input.LA(1) <= '\uA881')||(input.LA(1) >= '\uA8B4' && input.LA(1) <= '\uA8C3')||(input.LA(1) >= '\uA952' && input.LA(1) <= '\uA953')||input.LA(1)=='\uA983'||(input.LA(1) >= '\uA9B4' && input.LA(1) <= '\uA9B5')||(input.LA(1) >= '\uA9BA' && input.LA(1) <= '\uA9BB')||(input.LA(1) >= '\uA9BD' && input.LA(1) <= '\uA9C0')||(input.LA(1) >= '\uAA2F' && input.LA(1) <= '\uAA30')||(input.LA(1) >= '\uAA33' && input.LA(1) <= '\uAA34')||input.LA(1)=='\uAA4D'||input.LA(1)=='\uAA7B'||input.LA(1)=='\uAAEB'||(input.LA(1) >= '\uAAEE' && input.LA(1) <= '\uAAEF')||input.LA(1)=='\uAAF5'||(input.LA(1) >= '\uABE3' && input.LA(1) <= '\uABE4')||(input.LA(1) >= '\uABE6' && input.LA(1) <= '\uABE7')||(input.LA(1) >= '\uABE9' && input.LA(1) <= '\uABEA')||input.LA(1)=='\uABEC' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_MC"

    // $ANTLR start "UNICODE_CLASS_ME"
    public final void mUNICODE_CLASS_ME() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_ME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:1793:17: ( '\\u0488' | '\\u0489' | '\\u20DD' .. '\\u20E0' | '\\u20E2' .. '\\u20E4' | '\\uA670' .. '\\uA672' )
            // Unicode.g:
            {
            if ( (input.LA(1) >= '\u0488' && input.LA(1) <= '\u0489')||(input.LA(1) >= '\u20DD' && input.LA(1) <= '\u20E0')||(input.LA(1) >= '\u20E2' && input.LA(1) <= '\u20E4')||(input.LA(1) >= '\uA670' && input.LA(1) <= '\uA672') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_ME"

    // $ANTLR start "UNICODE_CLASS_MN"
    public final void mUNICODE_CLASS_MN() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_MN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:1800:17: ( '\\u0300' .. '\\u036F' | '\\u0483' .. '\\u0487' | '\\u0591' .. '\\u05BD' | '\\u05BF' | '\\u05C1' | '\\u05C2' | '\\u05C4' | '\\u05C5' | '\\u05C7' | '\\u0610' .. '\\u061A' | '\\u064B' .. '\\u065F' | '\\u0670' | '\\u06D6' .. '\\u06DC' | '\\u06DF' .. '\\u06E4' | '\\u06E7' | '\\u06E8' | '\\u06EA' .. '\\u06ED' | '\\u0711' | '\\u0730' .. '\\u074A' | '\\u07A6' .. '\\u07B0' | '\\u07EB' .. '\\u07F3' | '\\u0816' .. '\\u0819' | '\\u081B' .. '\\u0823' | '\\u0825' .. '\\u0827' | '\\u0829' .. '\\u082D' | '\\u0859' .. '\\u085B' | '\\u08E4' .. '\\u08FE' | '\\u0900' .. '\\u0902' | '\\u093A' | '\\u093C' | '\\u0941' .. '\\u0948' | '\\u094D' | '\\u0951' .. '\\u0957' | '\\u0962' | '\\u0963' | '\\u0981' | '\\u09BC' | '\\u09C1' .. '\\u09C4' | '\\u09CD' | '\\u09E2' | '\\u09E3' | '\\u0A01' | '\\u0A02' | '\\u0A3C' | '\\u0A41' | '\\u0A42' | '\\u0A47' | '\\u0A48' | '\\u0A4B' .. '\\u0A4D' | '\\u0A51' | '\\u0A70' | '\\u0A71' | '\\u0A75' | '\\u0A81' | '\\u0A82' | '\\u0ABC' | '\\u0AC1' .. '\\u0AC5' | '\\u0AC7' | '\\u0AC8' | '\\u0ACD' | '\\u0AE2' | '\\u0AE3' | '\\u0B01' | '\\u0B3C' | '\\u0B3F' | '\\u0B41' .. '\\u0B44' | '\\u0B4D' | '\\u0B56' | '\\u0B62' | '\\u0B63' | '\\u0B82' | '\\u0BC0' | '\\u0BCD' | '\\u0C3E' .. '\\u0C40' | '\\u0C46' .. '\\u0C48' | '\\u0C4A' .. '\\u0C4D' | '\\u0C55' | '\\u0C56' | '\\u0C62' | '\\u0C63' | '\\u0CBC' | '\\u0CBF' | '\\u0CC6' | '\\u0CCC' | '\\u0CCD' | '\\u0CE2' | '\\u0CE3' | '\\u0D41' .. '\\u0D44' | '\\u0D4D' | '\\u0D62' | '\\u0D63' | '\\u0DCA' | '\\u0DD2' .. '\\u0DD4' | '\\u0DD6' | '\\u0E31' | '\\u0E34' .. '\\u0E3A' | '\\u0E47' .. '\\u0E4E' | '\\u0EB1' | '\\u0EB4' .. '\\u0EB9' | '\\u0EBB' | '\\u0EBC' | '\\u0EC8' .. '\\u0ECD' | '\\u0F18' | '\\u0F19' | '\\u0F35' | '\\u0F37' | '\\u0F39' | '\\u0F71' .. '\\u0F7E' | '\\u0F80' .. '\\u0F84' | '\\u0F86' | '\\u0F87' | '\\u0F8D' .. '\\u0F97' | '\\u0F99' .. '\\u0FBC' | '\\u0FC6' | '\\u102D' .. '\\u1030' | '\\u1032' .. '\\u1037' | '\\u1039' | '\\u103A' | '\\u103D' | '\\u103E' | '\\u1058' | '\\u1059' | '\\u105E' .. '\\u1060' | '\\u1071' .. '\\u1074' | '\\u1082' | '\\u1085' | '\\u1086' | '\\u108D' | '\\u109D' | '\\u135D' .. '\\u135F' | '\\u1712' .. '\\u1714' | '\\u1732' .. '\\u1734' | '\\u1752' | '\\u1753' | '\\u1772' | '\\u1773' | '\\u17B4' | '\\u17B5' | '\\u17B7' .. '\\u17BD' | '\\u17C6' | '\\u17C9' .. '\\u17D3' | '\\u17DD' | '\\u180B' .. '\\u180D' | '\\u18A9' | '\\u1920' .. '\\u1922' | '\\u1927' | '\\u1928' | '\\u1932' | '\\u1939' .. '\\u193B' | '\\u1A17' | '\\u1A18' | '\\u1A56' | '\\u1A58' .. '\\u1A5E' | '\\u1A60' | '\\u1A62' | '\\u1A65' .. '\\u1A6C' | '\\u1A73' .. '\\u1A7C' | '\\u1A7F' | '\\u1B00' .. '\\u1B03' | '\\u1B34' | '\\u1B36' .. '\\u1B3A' | '\\u1B3C' | '\\u1B42' | '\\u1B6B' .. '\\u1B73' | '\\u1B80' | '\\u1B81' | '\\u1BA2' .. '\\u1BA5' | '\\u1BA8' | '\\u1BA9' | '\\u1BAB' | '\\u1BE6' | '\\u1BE8' | '\\u1BE9' | '\\u1BED' | '\\u1BEF' .. '\\u1BF1' | '\\u1C2C' .. '\\u1C33' | '\\u1C36' | '\\u1C37' | '\\u1CD0' .. '\\u1CD2' | '\\u1CD4' .. '\\u1CE0' | '\\u1CE2' .. '\\u1CE8' | '\\u1CED' | '\\u1CF4' | '\\u1DC0' .. '\\u1DE6' | '\\u1DFC' .. '\\u1DFF' | '\\u20D0' .. '\\u20DC' | '\\u20E1' | '\\u20E5' .. '\\u20F0' | '\\u2CEF' .. '\\u2CF1' | '\\u2D7F' | '\\u2DE0' .. '\\u2DFF' | '\\u302A' .. '\\u302D' | '\\u3099' | '\\u309A' | '\\uA66F' | '\\uA674' .. '\\uA67D' | '\\uA69F' | '\\uA6F0' | '\\uA6F1' | '\\uA802' | '\\uA806' | '\\uA80B' | '\\uA825' | '\\uA826' | '\\uA8C4' | '\\uA8E0' .. '\\uA8F1' | '\\uA926' .. '\\uA92D' | '\\uA947' .. '\\uA951' | '\\uA980' .. '\\uA982' | '\\uA9B3' | '\\uA9B6' .. '\\uA9B9' | '\\uA9BC' | '\\uAA29' .. '\\uAA2E' | '\\uAA31' | '\\uAA32' | '\\uAA35' | '\\uAA36' | '\\uAA43' | '\\uAA4C' | '\\uAAB0' | '\\uAAB2' .. '\\uAAB4' | '\\uAAB7' | '\\uAAB8' | '\\uAABE' | '\\uAABF' | '\\uAAC1' | '\\uAAEC' | '\\uAAED' | '\\uAAF6' | '\\uABE5' | '\\uABE8' | '\\uABED' | '\\uFB1E' | '\\uFE00' .. '\\uFE0F' | '\\uFE20' .. '\\uFE26' )
            // Unicode.g:
            {
            if ( (input.LA(1) >= '\u0300' && input.LA(1) <= '\u036F')||(input.LA(1) >= '\u0483' && input.LA(1) <= '\u0487')||(input.LA(1) >= '\u0591' && input.LA(1) <= '\u05BD')||input.LA(1)=='\u05BF'||(input.LA(1) >= '\u05C1' && input.LA(1) <= '\u05C2')||(input.LA(1) >= '\u05C4' && input.LA(1) <= '\u05C5')||input.LA(1)=='\u05C7'||(input.LA(1) >= '\u0610' && input.LA(1) <= '\u061A')||(input.LA(1) >= '\u064B' && input.LA(1) <= '\u065F')||input.LA(1)=='\u0670'||(input.LA(1) >= '\u06D6' && input.LA(1) <= '\u06DC')||(input.LA(1) >= '\u06DF' && input.LA(1) <= '\u06E4')||(input.LA(1) >= '\u06E7' && input.LA(1) <= '\u06E8')||(input.LA(1) >= '\u06EA' && input.LA(1) <= '\u06ED')||input.LA(1)=='\u0711'||(input.LA(1) >= '\u0730' && input.LA(1) <= '\u074A')||(input.LA(1) >= '\u07A6' && input.LA(1) <= '\u07B0')||(input.LA(1) >= '\u07EB' && input.LA(1) <= '\u07F3')||(input.LA(1) >= '\u0816' && input.LA(1) <= '\u0819')||(input.LA(1) >= '\u081B' && input.LA(1) <= '\u0823')||(input.LA(1) >= '\u0825' && input.LA(1) <= '\u0827')||(input.LA(1) >= '\u0829' && input.LA(1) <= '\u082D')||(input.LA(1) >= '\u0859' && input.LA(1) <= '\u085B')||(input.LA(1) >= '\u08E4' && input.LA(1) <= '\u08FE')||(input.LA(1) >= '\u0900' && input.LA(1) <= '\u0902')||input.LA(1)=='\u093A'||input.LA(1)=='\u093C'||(input.LA(1) >= '\u0941' && input.LA(1) <= '\u0948')||input.LA(1)=='\u094D'||(input.LA(1) >= '\u0951' && input.LA(1) <= '\u0957')||(input.LA(1) >= '\u0962' && input.LA(1) <= '\u0963')||input.LA(1)=='\u0981'||input.LA(1)=='\u09BC'||(input.LA(1) >= '\u09C1' && input.LA(1) <= '\u09C4')||input.LA(1)=='\u09CD'||(input.LA(1) >= '\u09E2' && input.LA(1) <= '\u09E3')||(input.LA(1) >= '\u0A01' && input.LA(1) <= '\u0A02')||input.LA(1)=='\u0A3C'||(input.LA(1) >= '\u0A41' && input.LA(1) <= '\u0A42')||(input.LA(1) >= '\u0A47' && input.LA(1) <= '\u0A48')||(input.LA(1) >= '\u0A4B' && input.LA(1) <= '\u0A4D')||input.LA(1)=='\u0A51'||(input.LA(1) >= '\u0A70' && input.LA(1) <= '\u0A71')||input.LA(1)=='\u0A75'||(input.LA(1) >= '\u0A81' && input.LA(1) <= '\u0A82')||input.LA(1)=='\u0ABC'||(input.LA(1) >= '\u0AC1' && input.LA(1) <= '\u0AC5')||(input.LA(1) >= '\u0AC7' && input.LA(1) <= '\u0AC8')||input.LA(1)=='\u0ACD'||(input.LA(1) >= '\u0AE2' && input.LA(1) <= '\u0AE3')||input.LA(1)=='\u0B01'||input.LA(1)=='\u0B3C'||input.LA(1)=='\u0B3F'||(input.LA(1) >= '\u0B41' && input.LA(1) <= '\u0B44')||input.LA(1)=='\u0B4D'||input.LA(1)=='\u0B56'||(input.LA(1) >= '\u0B62' && input.LA(1) <= '\u0B63')||input.LA(1)=='\u0B82'||input.LA(1)=='\u0BC0'||input.LA(1)=='\u0BCD'||(input.LA(1) >= '\u0C3E' && input.LA(1) <= '\u0C40')||(input.LA(1) >= '\u0C46' && input.LA(1) <= '\u0C48')||(input.LA(1) >= '\u0C4A' && input.LA(1) <= '\u0C4D')||(input.LA(1) >= '\u0C55' && input.LA(1) <= '\u0C56')||(input.LA(1) >= '\u0C62' && input.LA(1) <= '\u0C63')||input.LA(1)=='\u0CBC'||input.LA(1)=='\u0CBF'||input.LA(1)=='\u0CC6'||(input.LA(1) >= '\u0CCC' && input.LA(1) <= '\u0CCD')||(input.LA(1) >= '\u0CE2' && input.LA(1) <= '\u0CE3')||(input.LA(1) >= '\u0D41' && input.LA(1) <= '\u0D44')||input.LA(1)=='\u0D4D'||(input.LA(1) >= '\u0D62' && input.LA(1) <= '\u0D63')||input.LA(1)=='\u0DCA'||(input.LA(1) >= '\u0DD2' && input.LA(1) <= '\u0DD4')||input.LA(1)=='\u0DD6'||input.LA(1)=='\u0E31'||(input.LA(1) >= '\u0E34' && input.LA(1) <= '\u0E3A')||(input.LA(1) >= '\u0E47' && input.LA(1) <= '\u0E4E')||input.LA(1)=='\u0EB1'||(input.LA(1) >= '\u0EB4' && input.LA(1) <= '\u0EB9')||(input.LA(1) >= '\u0EBB' && input.LA(1) <= '\u0EBC')||(input.LA(1) >= '\u0EC8' && input.LA(1) <= '\u0ECD')||(input.LA(1) >= '\u0F18' && input.LA(1) <= '\u0F19')||input.LA(1)=='\u0F35'||input.LA(1)=='\u0F37'||input.LA(1)=='\u0F39'||(input.LA(1) >= '\u0F71' && input.LA(1) <= '\u0F7E')||(input.LA(1) >= '\u0F80' && input.LA(1) <= '\u0F84')||(input.LA(1) >= '\u0F86' && input.LA(1) <= '\u0F87')||(input.LA(1) >= '\u0F8D' && input.LA(1) <= '\u0F97')||(input.LA(1) >= '\u0F99' && input.LA(1) <= '\u0FBC')||input.LA(1)=='\u0FC6'||(input.LA(1) >= '\u102D' && input.LA(1) <= '\u1030')||(input.LA(1) >= '\u1032' && input.LA(1) <= '\u1037')||(input.LA(1) >= '\u1039' && input.LA(1) <= '\u103A')||(input.LA(1) >= '\u103D' && input.LA(1) <= '\u103E')||(input.LA(1) >= '\u1058' && input.LA(1) <= '\u1059')||(input.LA(1) >= '\u105E' && input.LA(1) <= '\u1060')||(input.LA(1) >= '\u1071' && input.LA(1) <= '\u1074')||input.LA(1)=='\u1082'||(input.LA(1) >= '\u1085' && input.LA(1) <= '\u1086')||input.LA(1)=='\u108D'||input.LA(1)=='\u109D'||(input.LA(1) >= '\u135D' && input.LA(1) <= '\u135F')||(input.LA(1) >= '\u1712' && input.LA(1) <= '\u1714')||(input.LA(1) >= '\u1732' && input.LA(1) <= '\u1734')||(input.LA(1) >= '\u1752' && input.LA(1) <= '\u1753')||(input.LA(1) >= '\u1772' && input.LA(1) <= '\u1773')||(input.LA(1) >= '\u17B4' && input.LA(1) <= '\u17B5')||(input.LA(1) >= '\u17B7' && input.LA(1) <= '\u17BD')||input.LA(1)=='\u17C6'||(input.LA(1) >= '\u17C9' && input.LA(1) <= '\u17D3')||input.LA(1)=='\u17DD'||(input.LA(1) >= '\u180B' && input.LA(1) <= '\u180D')||input.LA(1)=='\u18A9'||(input.LA(1) >= '\u1920' && input.LA(1) <= '\u1922')||(input.LA(1) >= '\u1927' && input.LA(1) <= '\u1928')||input.LA(1)=='\u1932'||(input.LA(1) >= '\u1939' && input.LA(1) <= '\u193B')||(input.LA(1) >= '\u1A17' && input.LA(1) <= '\u1A18')||input.LA(1)=='\u1A56'||(input.LA(1) >= '\u1A58' && input.LA(1) <= '\u1A5E')||input.LA(1)=='\u1A60'||input.LA(1)=='\u1A62'||(input.LA(1) >= '\u1A65' && input.LA(1) <= '\u1A6C')||(input.LA(1) >= '\u1A73' && input.LA(1) <= '\u1A7C')||input.LA(1)=='\u1A7F'||(input.LA(1) >= '\u1B00' && input.LA(1) <= '\u1B03')||input.LA(1)=='\u1B34'||(input.LA(1) >= '\u1B36' && input.LA(1) <= '\u1B3A')||input.LA(1)=='\u1B3C'||input.LA(1)=='\u1B42'||(input.LA(1) >= '\u1B6B' && input.LA(1) <= '\u1B73')||(input.LA(1) >= '\u1B80' && input.LA(1) <= '\u1B81')||(input.LA(1) >= '\u1BA2' && input.LA(1) <= '\u1BA5')||(input.LA(1) >= '\u1BA8' && input.LA(1) <= '\u1BA9')||input.LA(1)=='\u1BAB'||input.LA(1)=='\u1BE6'||(input.LA(1) >= '\u1BE8' && input.LA(1) <= '\u1BE9')||input.LA(1)=='\u1BED'||(input.LA(1) >= '\u1BEF' && input.LA(1) <= '\u1BF1')||(input.LA(1) >= '\u1C2C' && input.LA(1) <= '\u1C33')||(input.LA(1) >= '\u1C36' && input.LA(1) <= '\u1C37')||(input.LA(1) >= '\u1CD0' && input.LA(1) <= '\u1CD2')||(input.LA(1) >= '\u1CD4' && input.LA(1) <= '\u1CE0')||(input.LA(1) >= '\u1CE2' && input.LA(1) <= '\u1CE8')||input.LA(1)=='\u1CED'||input.LA(1)=='\u1CF4'||(input.LA(1) >= '\u1DC0' && input.LA(1) <= '\u1DE6')||(input.LA(1) >= '\u1DFC' && input.LA(1) <= '\u1DFF')||(input.LA(1) >= '\u20D0' && input.LA(1) <= '\u20DC')||input.LA(1)=='\u20E1'||(input.LA(1) >= '\u20E5' && input.LA(1) <= '\u20F0')||(input.LA(1) >= '\u2CEF' && input.LA(1) <= '\u2CF1')||input.LA(1)=='\u2D7F'||(input.LA(1) >= '\u2DE0' && input.LA(1) <= '\u2DFF')||(input.LA(1) >= '\u302A' && input.LA(1) <= '\u302D')||(input.LA(1) >= '\u3099' && input.LA(1) <= '\u309A')||input.LA(1)=='\uA66F'||(input.LA(1) >= '\uA674' && input.LA(1) <= '\uA67D')||input.LA(1)=='\uA69F'||(input.LA(1) >= '\uA6F0' && input.LA(1) <= '\uA6F1')||input.LA(1)=='\uA802'||input.LA(1)=='\uA806'||input.LA(1)=='\uA80B'||(input.LA(1) >= '\uA825' && input.LA(1) <= '\uA826')||input.LA(1)=='\uA8C4'||(input.LA(1) >= '\uA8E0' && input.LA(1) <= '\uA8F1')||(input.LA(1) >= '\uA926' && input.LA(1) <= '\uA92D')||(input.LA(1) >= '\uA947' && input.LA(1) <= '\uA951')||(input.LA(1) >= '\uA980' && input.LA(1) <= '\uA982')||input.LA(1)=='\uA9B3'||(input.LA(1) >= '\uA9B6' && input.LA(1) <= '\uA9B9')||input.LA(1)=='\uA9BC'||(input.LA(1) >= '\uAA29' && input.LA(1) <= '\uAA2E')||(input.LA(1) >= '\uAA31' && input.LA(1) <= '\uAA32')||(input.LA(1) >= '\uAA35' && input.LA(1) <= '\uAA36')||input.LA(1)=='\uAA43'||input.LA(1)=='\uAA4C'||input.LA(1)=='\uAAB0'||(input.LA(1) >= '\uAAB2' && input.LA(1) <= '\uAAB4')||(input.LA(1) >= '\uAAB7' && input.LA(1) <= '\uAAB8')||(input.LA(1) >= '\uAABE' && input.LA(1) <= '\uAABF')||input.LA(1)=='\uAAC1'||(input.LA(1) >= '\uAAEC' && input.LA(1) <= '\uAAED')||input.LA(1)=='\uAAF6'||input.LA(1)=='\uABE5'||input.LA(1)=='\uABE8'||input.LA(1)=='\uABED'||input.LA(1)=='\uFB1E'||(input.LA(1) >= '\uFE00' && input.LA(1) <= '\uFE0F')||(input.LA(1) >= '\uFE20' && input.LA(1) <= '\uFE26') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_MN"

    // $ANTLR start "UNICODE_CLASS_ND"
    public final void mUNICODE_CLASS_ND() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_ND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2037:17: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06F0' .. '\\u06F9' | '\\u07C0' .. '\\u07C9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE6' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u0F20' .. '\\u0F29' | '\\u1040' .. '\\u1049' | '\\u1090' .. '\\u1099' | '\\u17E0' .. '\\u17E9' | '\\u1810' .. '\\u1819' | '\\u1946' .. '\\u194F' | '\\u19D0' .. '\\u19D9' | '\\u1A80' .. '\\u1A89' | '\\u1A90' .. '\\u1A99' | '\\u1B50' .. '\\u1B59' | '\\u1BB0' .. '\\u1BB9' | '\\u1C40' .. '\\u1C49' | '\\u1C50' .. '\\u1C59' | '\\uA620' .. '\\uA629' | '\\uA8D0' .. '\\uA8D9' | '\\uA900' .. '\\uA909' | '\\uA9D0' .. '\\uA9D9' | '\\uAA50' .. '\\uAA59' | '\\uABF0' .. '\\uABF9' | '\\uFF10' .. '\\uFF19' )
            // Unicode.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= '\u0660' && input.LA(1) <= '\u0669')||(input.LA(1) >= '\u06F0' && input.LA(1) <= '\u06F9')||(input.LA(1) >= '\u07C0' && input.LA(1) <= '\u07C9')||(input.LA(1) >= '\u0966' && input.LA(1) <= '\u096F')||(input.LA(1) >= '\u09E6' && input.LA(1) <= '\u09EF')||(input.LA(1) >= '\u0A66' && input.LA(1) <= '\u0A6F')||(input.LA(1) >= '\u0AE6' && input.LA(1) <= '\u0AEF')||(input.LA(1) >= '\u0B66' && input.LA(1) <= '\u0B6F')||(input.LA(1) >= '\u0BE6' && input.LA(1) <= '\u0BEF')||(input.LA(1) >= '\u0C66' && input.LA(1) <= '\u0C6F')||(input.LA(1) >= '\u0CE6' && input.LA(1) <= '\u0CEF')||(input.LA(1) >= '\u0D66' && input.LA(1) <= '\u0D6F')||(input.LA(1) >= '\u0E50' && input.LA(1) <= '\u0E59')||(input.LA(1) >= '\u0ED0' && input.LA(1) <= '\u0ED9')||(input.LA(1) >= '\u0F20' && input.LA(1) <= '\u0F29')||(input.LA(1) >= '\u1040' && input.LA(1) <= '\u1049')||(input.LA(1) >= '\u1090' && input.LA(1) <= '\u1099')||(input.LA(1) >= '\u17E0' && input.LA(1) <= '\u17E9')||(input.LA(1) >= '\u1810' && input.LA(1) <= '\u1819')||(input.LA(1) >= '\u1946' && input.LA(1) <= '\u194F')||(input.LA(1) >= '\u19D0' && input.LA(1) <= '\u19D9')||(input.LA(1) >= '\u1A80' && input.LA(1) <= '\u1A89')||(input.LA(1) >= '\u1A90' && input.LA(1) <= '\u1A99')||(input.LA(1) >= '\u1B50' && input.LA(1) <= '\u1B59')||(input.LA(1) >= '\u1BB0' && input.LA(1) <= '\u1BB9')||(input.LA(1) >= '\u1C40' && input.LA(1) <= '\u1C49')||(input.LA(1) >= '\u1C50' && input.LA(1) <= '\u1C59')||(input.LA(1) >= '\uA620' && input.LA(1) <= '\uA629')||(input.LA(1) >= '\uA8D0' && input.LA(1) <= '\uA8D9')||(input.LA(1) >= '\uA900' && input.LA(1) <= '\uA909')||(input.LA(1) >= '\uA9D0' && input.LA(1) <= '\uA9D9')||(input.LA(1) >= '\uAA50' && input.LA(1) <= '\uAA59')||(input.LA(1) >= '\uABF0' && input.LA(1) <= '\uABF9')||(input.LA(1) >= '\uFF10' && input.LA(1) <= '\uFF19') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_ND"

    // $ANTLR start "UNICODE_CLASS_NL"
    public final void mUNICODE_CLASS_NL() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2074:17: ( '\\u16EE' .. '\\u16F0' | '\\u2160' .. '\\u2182' | '\\u2185' .. '\\u2188' | '\\u3007' | '\\u3021' .. '\\u3029' | '\\u3038' .. '\\u303A' | '\\uA6E6' .. '\\uA6EF' )
            // Unicode.g:
            {
            if ( (input.LA(1) >= '\u16EE' && input.LA(1) <= '\u16F0')||(input.LA(1) >= '\u2160' && input.LA(1) <= '\u2182')||(input.LA(1) >= '\u2185' && input.LA(1) <= '\u2188')||input.LA(1)=='\u3007'||(input.LA(1) >= '\u3021' && input.LA(1) <= '\u3029')||(input.LA(1) >= '\u3038' && input.LA(1) <= '\u303A')||(input.LA(1) >= '\uA6E6' && input.LA(1) <= '\uA6EF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_NL"

    // $ANTLR start "UNICODE_CLASS_NO"
    public final void mUNICODE_CLASS_NO() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_NO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2083:17: ( '\\u00B2' | '\\u00B3' | '\\u00B9' | '\\u00BC' .. '\\u00BE' | '\\u09F4' .. '\\u09F9' | '\\u0B72' .. '\\u0B77' | '\\u0BF0' .. '\\u0BF2' | '\\u0C78' .. '\\u0C7E' | '\\u0D70' .. '\\u0D75' | '\\u0F2A' .. '\\u0F33' | '\\u1369' .. '\\u137C' | '\\u17F0' .. '\\u17F9' | '\\u19DA' | '\\u2070' | '\\u2074' .. '\\u2079' | '\\u2080' .. '\\u2089' | '\\u2150' .. '\\u215F' | '\\u2189' | '\\u2460' .. '\\u249B' | '\\u24EA' .. '\\u24FF' | '\\u2776' .. '\\u2793' | '\\u2CFD' | '\\u3192' .. '\\u3195' | '\\u3220' .. '\\u3229' | '\\u3248' .. '\\u324F' | '\\u3251' .. '\\u325F' | '\\u3280' .. '\\u3289' | '\\u32B1' .. '\\u32BF' | '\\uA830' .. '\\uA835' )
            // Unicode.g:
            {
            if ( (input.LA(1) >= '\u00B2' && input.LA(1) <= '\u00B3')||input.LA(1)=='\u00B9'||(input.LA(1) >= '\u00BC' && input.LA(1) <= '\u00BE')||(input.LA(1) >= '\u09F4' && input.LA(1) <= '\u09F9')||(input.LA(1) >= '\u0B72' && input.LA(1) <= '\u0B77')||(input.LA(1) >= '\u0BF0' && input.LA(1) <= '\u0BF2')||(input.LA(1) >= '\u0C78' && input.LA(1) <= '\u0C7E')||(input.LA(1) >= '\u0D70' && input.LA(1) <= '\u0D75')||(input.LA(1) >= '\u0F2A' && input.LA(1) <= '\u0F33')||(input.LA(1) >= '\u1369' && input.LA(1) <= '\u137C')||(input.LA(1) >= '\u17F0' && input.LA(1) <= '\u17F9')||input.LA(1)=='\u19DA'||input.LA(1)=='\u2070'||(input.LA(1) >= '\u2074' && input.LA(1) <= '\u2079')||(input.LA(1) >= '\u2080' && input.LA(1) <= '\u2089')||(input.LA(1) >= '\u2150' && input.LA(1) <= '\u215F')||input.LA(1)=='\u2189'||(input.LA(1) >= '\u2460' && input.LA(1) <= '\u249B')||(input.LA(1) >= '\u24EA' && input.LA(1) <= '\u24FF')||(input.LA(1) >= '\u2776' && input.LA(1) <= '\u2793')||input.LA(1)=='\u2CFD'||(input.LA(1) >= '\u3192' && input.LA(1) <= '\u3195')||(input.LA(1) >= '\u3220' && input.LA(1) <= '\u3229')||(input.LA(1) >= '\u3248' && input.LA(1) <= '\u324F')||(input.LA(1) >= '\u3251' && input.LA(1) <= '\u325F')||(input.LA(1) >= '\u3280' && input.LA(1) <= '\u3289')||(input.LA(1) >= '\u32B1' && input.LA(1) <= '\u32BF')||(input.LA(1) >= '\uA830' && input.LA(1) <= '\uA835') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_NO"

    // $ANTLR start "UNICODE_CLASS_PC"
    public final void mUNICODE_CLASS_PC() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_PC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2114:17: ( '\\u005F' | '\\u203F' | '\\u2040' | '\\u2054' | '\\uFE33' | '\\uFE34' | '\\uFE4D' .. '\\uFE4F' | '\\uFF3F' )
            // Unicode.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_PC"

    // $ANTLR start "UNICODE_CLASS_PD"
    public final void mUNICODE_CLASS_PD() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_PD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2124:17: ( '\\u002D' | '\\u058A' | '\\u05BE' | '\\u1400' | '\\u1806' | '\\u2010' .. '\\u2015' | '\\u2E17' | '\\u2E1A' | '\\u2E3A' | '\\u2E3B' | '\\u301C' | '\\u3030' | '\\u30A0' | '\\uFE31' | '\\uFE32' | '\\uFE58' | '\\uFE63' | '\\uFF0D' )
            // Unicode.g:
            {
            if ( input.LA(1)=='-'||input.LA(1)=='\u058A'||input.LA(1)=='\u05BE'||input.LA(1)=='\u1400'||input.LA(1)=='\u1806'||(input.LA(1) >= '\u2010' && input.LA(1) <= '\u2015')||input.LA(1)=='\u2E17'||input.LA(1)=='\u2E1A'||(input.LA(1) >= '\u2E3A' && input.LA(1) <= '\u2E3B')||input.LA(1)=='\u301C'||input.LA(1)=='\u3030'||input.LA(1)=='\u30A0'||(input.LA(1) >= '\uFE31' && input.LA(1) <= '\uFE32')||input.LA(1)=='\uFE58'||input.LA(1)=='\uFE63'||input.LA(1)=='\uFF0D' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_PD"

    // $ANTLR start "UNICODE_CLASS_PE"
    public final void mUNICODE_CLASS_PE() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_PE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2144:17: ( '\\u0029' | '\\u005D' | '\\u007D' | '\\u0F3B' | '\\u0F3D' | '\\u169C' | '\\u2046' | '\\u207E' | '\\u208E' | '\\u232A' | '\\u2769' | '\\u276B' | '\\u276D' | '\\u276F' | '\\u2771' | '\\u2773' | '\\u2775' | '\\u27C6' | '\\u27E7' | '\\u27E9' | '\\u27EB' | '\\u27ED' | '\\u27EF' | '\\u2984' | '\\u2986' | '\\u2988' | '\\u298A' | '\\u298C' | '\\u298E' | '\\u2990' | '\\u2992' | '\\u2994' | '\\u2996' | '\\u2998' | '\\u29D9' | '\\u29DB' | '\\u29FD' | '\\u2E23' | '\\u2E25' | '\\u2E27' | '\\u2E29' | '\\u3009' | '\\u300B' | '\\u300D' | '\\u300F' | '\\u3011' | '\\u3015' | '\\u3017' | '\\u3019' | '\\u301B' | '\\u301E' | '\\u301F' | '\\uFD3F' | '\\uFE18' | '\\uFE36' | '\\uFE38' | '\\uFE3A' | '\\uFE3C' | '\\uFE3E' | '\\uFE40' | '\\uFE42' | '\\uFE44' | '\\uFE48' | '\\uFE5A' | '\\uFE5C' | '\\uFE5E' | '\\uFF09' | '\\uFF3D' | '\\uFF5D' | '\\uFF60' | '\\uFF63' )
            // Unicode.g:
            {
            if ( input.LA(1)==')'||input.LA(1)==']'||input.LA(1)=='}'||input.LA(1)=='\u0F3B'||input.LA(1)=='\u0F3D'||input.LA(1)=='\u169C'||input.LA(1)=='\u2046'||input.LA(1)=='\u207E'||input.LA(1)=='\u208E'||input.LA(1)=='\u232A'||input.LA(1)=='\u2769'||input.LA(1)=='\u276B'||input.LA(1)=='\u276D'||input.LA(1)=='\u276F'||input.LA(1)=='\u2771'||input.LA(1)=='\u2773'||input.LA(1)=='\u2775'||input.LA(1)=='\u27C6'||input.LA(1)=='\u27E7'||input.LA(1)=='\u27E9'||input.LA(1)=='\u27EB'||input.LA(1)=='\u27ED'||input.LA(1)=='\u27EF'||input.LA(1)=='\u2984'||input.LA(1)=='\u2986'||input.LA(1)=='\u2988'||input.LA(1)=='\u298A'||input.LA(1)=='\u298C'||input.LA(1)=='\u298E'||input.LA(1)=='\u2990'||input.LA(1)=='\u2992'||input.LA(1)=='\u2994'||input.LA(1)=='\u2996'||input.LA(1)=='\u2998'||input.LA(1)=='\u29D9'||input.LA(1)=='\u29DB'||input.LA(1)=='\u29FD'||input.LA(1)=='\u2E23'||input.LA(1)=='\u2E25'||input.LA(1)=='\u2E27'||input.LA(1)=='\u2E29'||input.LA(1)=='\u3009'||input.LA(1)=='\u300B'||input.LA(1)=='\u300D'||input.LA(1)=='\u300F'||input.LA(1)=='\u3011'||input.LA(1)=='\u3015'||input.LA(1)=='\u3017'||input.LA(1)=='\u3019'||input.LA(1)=='\u301B'||(input.LA(1) >= '\u301E' && input.LA(1) <= '\u301F')||input.LA(1)=='\uFD3F'||input.LA(1)=='\uFE18'||input.LA(1)=='\uFE36'||input.LA(1)=='\uFE38'||input.LA(1)=='\uFE3A'||input.LA(1)=='\uFE3C'||input.LA(1)=='\uFE3E'||input.LA(1)=='\uFE40'||input.LA(1)=='\uFE42'||input.LA(1)=='\uFE44'||input.LA(1)=='\uFE48'||input.LA(1)=='\uFE5A'||input.LA(1)=='\uFE5C'||input.LA(1)=='\uFE5E'||input.LA(1)=='\uFF09'||input.LA(1)=='\uFF3D'||input.LA(1)=='\uFF5D'||input.LA(1)=='\uFF60'||input.LA(1)=='\uFF63' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_PE"

    // $ANTLR start "UNICODE_CLASS_PF"
    public final void mUNICODE_CLASS_PF() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_PF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2217:17: ( '\\u00BB' | '\\u2019' | '\\u201D' | '\\u203A' | '\\u2E03' | '\\u2E05' | '\\u2E0A' | '\\u2E0D' | '\\u2E1D' | '\\u2E21' )
            // Unicode.g:
            {
            if ( input.LA(1)=='\u00BB'||input.LA(1)=='\u2019'||input.LA(1)=='\u201D'||input.LA(1)=='\u203A'||input.LA(1)=='\u2E03'||input.LA(1)=='\u2E05'||input.LA(1)=='\u2E0A'||input.LA(1)=='\u2E0D'||input.LA(1)=='\u2E1D'||input.LA(1)=='\u2E21' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_PF"

    // $ANTLR start "UNICODE_CLASS_PI"
    public final void mUNICODE_CLASS_PI() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_PI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2229:17: ( '\\u00AB' | '\\u2018' | '\\u201B' | '\\u201C' | '\\u201F' | '\\u2039' | '\\u2E02' | '\\u2E04' | '\\u2E09' | '\\u2E0C' | '\\u2E1C' | '\\u2E20' )
            // Unicode.g:
            {
            if ( input.LA(1)=='\u00AB'||input.LA(1)=='\u2018'||(input.LA(1) >= '\u201B' && input.LA(1) <= '\u201C')||input.LA(1)=='\u201F'||input.LA(1)=='\u2039'||input.LA(1)=='\u2E02'||input.LA(1)=='\u2E04'||input.LA(1)=='\u2E09'||input.LA(1)=='\u2E0C'||input.LA(1)=='\u2E1C'||input.LA(1)=='\u2E20' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_PI"

    // $ANTLR start "UNICODE_CLASS_PO"
    public final void mUNICODE_CLASS_PO() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_PO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2243:17: ( '\\u0021' .. '\\u0023' | '\\u0025' .. '\\u0027' | '\\u002A' | '\\u002C' | '\\u002E' | '\\u002F' | '\\u003A' | '\\u003B' | '\\u003F' | '\\u0040' | '\\u005C' | '\\u00A1' | '\\u00A7' | '\\u00B6' | '\\u00B7' | '\\u00BF' | '\\u037E' | '\\u0387' | '\\u055A' .. '\\u055F' | '\\u0589' | '\\u05C0' | '\\u05C3' | '\\u05C6' | '\\u05F3' | '\\u05F4' | '\\u0609' | '\\u060A' | '\\u060C' | '\\u060D' | '\\u061B' | '\\u061E' | '\\u061F' | '\\u066A' .. '\\u066D' | '\\u06D4' | '\\u0700' .. '\\u070D' | '\\u07F7' .. '\\u07F9' | '\\u0830' .. '\\u083E' | '\\u085E' | '\\u0964' | '\\u0965' | '\\u0970' | '\\u0AF0' | '\\u0DF4' | '\\u0E4F' | '\\u0E5A' | '\\u0E5B' | '\\u0F04' .. '\\u0F12' | '\\u0F14' | '\\u0F85' | '\\u0FD0' .. '\\u0FD4' | '\\u0FD9' | '\\u0FDA' | '\\u104A' .. '\\u104F' | '\\u10FB' | '\\u1360' .. '\\u1368' | '\\u166D' | '\\u166E' | '\\u16EB' .. '\\u16ED' | '\\u1735' | '\\u1736' | '\\u17D4' .. '\\u17D6' | '\\u17D8' .. '\\u17DA' | '\\u1800' .. '\\u1805' | '\\u1807' .. '\\u180A' | '\\u1944' | '\\u1945' | '\\u1A1E' | '\\u1A1F' | '\\u1AA0' .. '\\u1AA6' | '\\u1AA8' .. '\\u1AAD' | '\\u1B5A' .. '\\u1B60' | '\\u1BFC' .. '\\u1BFF' | '\\u1C3B' .. '\\u1C3F' | '\\u1C7E' | '\\u1C7F' | '\\u1CC0' .. '\\u1CC7' | '\\u1CD3' | '\\u2016' | '\\u2017' | '\\u2020' .. '\\u2027' | '\\u2030' .. '\\u2038' | '\\u203B' .. '\\u203E' | '\\u2041' .. '\\u2043' | '\\u2047' .. '\\u2051' | '\\u2053' | '\\u2055' .. '\\u205E' | '\\u2CF9' .. '\\u2CFC' | '\\u2CFE' | '\\u2CFF' | '\\u2D70' | '\\u2E00' | '\\u2E01' | '\\u2E06' .. '\\u2E08' | '\\u2E0B' | '\\u2E0E' .. '\\u2E16' | '\\u2E18' | '\\u2E19' | '\\u2E1B' | '\\u2E1E' | '\\u2E1F' | '\\u2E2A' .. '\\u2E2E' | '\\u2E30' .. '\\u2E39' | '\\u3001' .. '\\u3003' | '\\u303D' | '\\u30FB' | '\\uA4FE' | '\\uA4FF' | '\\uA60D' .. '\\uA60F' | '\\uA673' | '\\uA67E' | '\\uA6F2' .. '\\uA6F7' | '\\uA874' .. '\\uA877' | '\\uA8CE' | '\\uA8CF' | '\\uA8F8' .. '\\uA8FA' | '\\uA92E' | '\\uA92F' | '\\uA95F' | '\\uA9C1' .. '\\uA9CD' | '\\uA9DE' | '\\uA9DF' | '\\uAA5C' .. '\\uAA5F' | '\\uAADE' | '\\uAADF' | '\\uAAF0' | '\\uAAF1' | '\\uABEB' | '\\uFE10' .. '\\uFE16' | '\\uFE19' | '\\uFE30' | '\\uFE45' | '\\uFE46' | '\\uFE49' .. '\\uFE4C' | '\\uFE50' .. '\\uFE52' | '\\uFE54' .. '\\uFE57' | '\\uFE5F' .. '\\uFE61' | '\\uFE68' | '\\uFE6A' | '\\uFE6B' | '\\uFF01' .. '\\uFF03' | '\\uFF05' .. '\\uFF07' | '\\uFF0A' | '\\uFF0C' | '\\uFF0E' | '\\uFF0F' | '\\uFF1A' | '\\uFF1B' | '\\uFF1F' | '\\uFF20' | '\\uFF3C' | '\\uFF61' | '\\uFF64' | '\\uFF65' )
            // Unicode.g:
            {
            if ( (input.LA(1) >= '!' && input.LA(1) <= '#')||(input.LA(1) >= '%' && input.LA(1) <= '\'')||input.LA(1)=='*'||input.LA(1)==','||(input.LA(1) >= '.' && input.LA(1) <= '/')||(input.LA(1) >= ':' && input.LA(1) <= ';')||(input.LA(1) >= '?' && input.LA(1) <= '@')||input.LA(1)=='\\'||input.LA(1)=='\u00A1'||input.LA(1)=='\u00A7'||(input.LA(1) >= '\u00B6' && input.LA(1) <= '\u00B7')||input.LA(1)=='\u00BF'||input.LA(1)=='\u037E'||input.LA(1)=='\u0387'||(input.LA(1) >= '\u055A' && input.LA(1) <= '\u055F')||input.LA(1)=='\u0589'||input.LA(1)=='\u05C0'||input.LA(1)=='\u05C3'||input.LA(1)=='\u05C6'||(input.LA(1) >= '\u05F3' && input.LA(1) <= '\u05F4')||(input.LA(1) >= '\u0609' && input.LA(1) <= '\u060A')||(input.LA(1) >= '\u060C' && input.LA(1) <= '\u060D')||input.LA(1)=='\u061B'||(input.LA(1) >= '\u061E' && input.LA(1) <= '\u061F')||(input.LA(1) >= '\u066A' && input.LA(1) <= '\u066D')||input.LA(1)=='\u06D4'||(input.LA(1) >= '\u0700' && input.LA(1) <= '\u070D')||(input.LA(1) >= '\u07F7' && input.LA(1) <= '\u07F9')||(input.LA(1) >= '\u0830' && input.LA(1) <= '\u083E')||input.LA(1)=='\u085E'||(input.LA(1) >= '\u0964' && input.LA(1) <= '\u0965')||input.LA(1)=='\u0970'||input.LA(1)=='\u0AF0'||input.LA(1)=='\u0DF4'||input.LA(1)=='\u0E4F'||(input.LA(1) >= '\u0E5A' && input.LA(1) <= '\u0E5B')||(input.LA(1) >= '\u0F04' && input.LA(1) <= '\u0F12')||input.LA(1)=='\u0F14'||input.LA(1)=='\u0F85'||(input.LA(1) >= '\u0FD0' && input.LA(1) <= '\u0FD4')||(input.LA(1) >= '\u0FD9' && input.LA(1) <= '\u0FDA')||(input.LA(1) >= '\u104A' && input.LA(1) <= '\u104F')||input.LA(1)=='\u10FB'||(input.LA(1) >= '\u1360' && input.LA(1) <= '\u1368')||(input.LA(1) >= '\u166D' && input.LA(1) <= '\u166E')||(input.LA(1) >= '\u16EB' && input.LA(1) <= '\u16ED')||(input.LA(1) >= '\u1735' && input.LA(1) <= '\u1736')||(input.LA(1) >= '\u17D4' && input.LA(1) <= '\u17D6')||(input.LA(1) >= '\u17D8' && input.LA(1) <= '\u17DA')||(input.LA(1) >= '\u1800' && input.LA(1) <= '\u1805')||(input.LA(1) >= '\u1807' && input.LA(1) <= '\u180A')||(input.LA(1) >= '\u1944' && input.LA(1) <= '\u1945')||(input.LA(1) >= '\u1A1E' && input.LA(1) <= '\u1A1F')||(input.LA(1) >= '\u1AA0' && input.LA(1) <= '\u1AA6')||(input.LA(1) >= '\u1AA8' && input.LA(1) <= '\u1AAD')||(input.LA(1) >= '\u1B5A' && input.LA(1) <= '\u1B60')||(input.LA(1) >= '\u1BFC' && input.LA(1) <= '\u1BFF')||(input.LA(1) >= '\u1C3B' && input.LA(1) <= '\u1C3F')||(input.LA(1) >= '\u1C7E' && input.LA(1) <= '\u1C7F')||(input.LA(1) >= '\u1CC0' && input.LA(1) <= '\u1CC7')||input.LA(1)=='\u1CD3'||(input.LA(1) >= '\u2016' && input.LA(1) <= '\u2017')||(input.LA(1) >= '\u2020' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u2030' && input.LA(1) <= '\u2038')||(input.LA(1) >= '\u203B' && input.LA(1) <= '\u203E')||(input.LA(1) >= '\u2041' && input.LA(1) <= '\u2043')||(input.LA(1) >= '\u2047' && input.LA(1) <= '\u2051')||input.LA(1)=='\u2053'||(input.LA(1) >= '\u2055' && input.LA(1) <= '\u205E')||(input.LA(1) >= '\u2CF9' && input.LA(1) <= '\u2CFC')||(input.LA(1) >= '\u2CFE' && input.LA(1) <= '\u2CFF')||input.LA(1)=='\u2D70'||(input.LA(1) >= '\u2E00' && input.LA(1) <= '\u2E01')||(input.LA(1) >= '\u2E06' && input.LA(1) <= '\u2E08')||input.LA(1)=='\u2E0B'||(input.LA(1) >= '\u2E0E' && input.LA(1) <= '\u2E16')||(input.LA(1) >= '\u2E18' && input.LA(1) <= '\u2E19')||input.LA(1)=='\u2E1B'||(input.LA(1) >= '\u2E1E' && input.LA(1) <= '\u2E1F')||(input.LA(1) >= '\u2E2A' && input.LA(1) <= '\u2E2E')||(input.LA(1) >= '\u2E30' && input.LA(1) <= '\u2E39')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\u3003')||input.LA(1)=='\u303D'||input.LA(1)=='\u30FB'||(input.LA(1) >= '\uA4FE' && input.LA(1) <= '\uA4FF')||(input.LA(1) >= '\uA60D' && input.LA(1) <= '\uA60F')||input.LA(1)=='\uA673'||input.LA(1)=='\uA67E'||(input.LA(1) >= '\uA6F2' && input.LA(1) <= '\uA6F7')||(input.LA(1) >= '\uA874' && input.LA(1) <= '\uA877')||(input.LA(1) >= '\uA8CE' && input.LA(1) <= '\uA8CF')||(input.LA(1) >= '\uA8F8' && input.LA(1) <= '\uA8FA')||(input.LA(1) >= '\uA92E' && input.LA(1) <= '\uA92F')||input.LA(1)=='\uA95F'||(input.LA(1) >= '\uA9C1' && input.LA(1) <= '\uA9CD')||(input.LA(1) >= '\uA9DE' && input.LA(1) <= '\uA9DF')||(input.LA(1) >= '\uAA5C' && input.LA(1) <= '\uAA5F')||(input.LA(1) >= '\uAADE' && input.LA(1) <= '\uAADF')||(input.LA(1) >= '\uAAF0' && input.LA(1) <= '\uAAF1')||input.LA(1)=='\uABEB'||(input.LA(1) >= '\uFE10' && input.LA(1) <= '\uFE16')||input.LA(1)=='\uFE19'||input.LA(1)=='\uFE30'||(input.LA(1) >= '\uFE45' && input.LA(1) <= '\uFE46')||(input.LA(1) >= '\uFE49' && input.LA(1) <= '\uFE4C')||(input.LA(1) >= '\uFE50' && input.LA(1) <= '\uFE52')||(input.LA(1) >= '\uFE54' && input.LA(1) <= '\uFE57')||(input.LA(1) >= '\uFE5F' && input.LA(1) <= '\uFE61')||input.LA(1)=='\uFE68'||(input.LA(1) >= '\uFE6A' && input.LA(1) <= '\uFE6B')||(input.LA(1) >= '\uFF01' && input.LA(1) <= '\uFF03')||(input.LA(1) >= '\uFF05' && input.LA(1) <= '\uFF07')||input.LA(1)=='\uFF0A'||input.LA(1)=='\uFF0C'||(input.LA(1) >= '\uFF0E' && input.LA(1) <= '\uFF0F')||(input.LA(1) >= '\uFF1A' && input.LA(1) <= '\uFF1B')||(input.LA(1) >= '\uFF1F' && input.LA(1) <= '\uFF20')||input.LA(1)=='\uFF3C'||input.LA(1)=='\uFF61'||(input.LA(1) >= '\uFF64' && input.LA(1) <= '\uFF65') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_PO"

    // $ANTLR start "UNICODE_CLASS_PS"
    public final void mUNICODE_CLASS_PS() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_PS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2398:17: ( '\\u0028' | '\\u005B' | '\\u007B' | '\\u0F3A' | '\\u0F3C' | '\\u169B' | '\\u201A' | '\\u201E' | '\\u2045' | '\\u207D' | '\\u208D' | '\\u2329' | '\\u2768' | '\\u276A' | '\\u276C' | '\\u276E' | '\\u2770' | '\\u2772' | '\\u2774' | '\\u27C5' | '\\u27E6' | '\\u27E8' | '\\u27EA' | '\\u27EC' | '\\u27EE' | '\\u2983' | '\\u2985' | '\\u2987' | '\\u2989' | '\\u298B' | '\\u298D' | '\\u298F' | '\\u2991' | '\\u2993' | '\\u2995' | '\\u2997' | '\\u29D8' | '\\u29DA' | '\\u29FC' | '\\u2E22' | '\\u2E24' | '\\u2E26' | '\\u2E28' | '\\u3008' | '\\u300A' | '\\u300C' | '\\u300E' | '\\u3010' | '\\u3014' | '\\u3016' | '\\u3018' | '\\u301A' | '\\u301D' | '\\uFD3E' | '\\uFE17' | '\\uFE35' | '\\uFE37' | '\\uFE39' | '\\uFE3B' | '\\uFE3D' | '\\uFE3F' | '\\uFE41' | '\\uFE43' | '\\uFE47' | '\\uFE59' | '\\uFE5B' | '\\uFE5D' | '\\uFF08' | '\\uFF3B' | '\\uFF5B' | '\\uFF5F' | '\\uFF62' )
            // Unicode.g:
            {
            if ( input.LA(1)=='('||input.LA(1)=='['||input.LA(1)=='{'||input.LA(1)=='\u0F3A'||input.LA(1)=='\u0F3C'||input.LA(1)=='\u169B'||input.LA(1)=='\u201A'||input.LA(1)=='\u201E'||input.LA(1)=='\u2045'||input.LA(1)=='\u207D'||input.LA(1)=='\u208D'||input.LA(1)=='\u2329'||input.LA(1)=='\u2768'||input.LA(1)=='\u276A'||input.LA(1)=='\u276C'||input.LA(1)=='\u276E'||input.LA(1)=='\u2770'||input.LA(1)=='\u2772'||input.LA(1)=='\u2774'||input.LA(1)=='\u27C5'||input.LA(1)=='\u27E6'||input.LA(1)=='\u27E8'||input.LA(1)=='\u27EA'||input.LA(1)=='\u27EC'||input.LA(1)=='\u27EE'||input.LA(1)=='\u2983'||input.LA(1)=='\u2985'||input.LA(1)=='\u2987'||input.LA(1)=='\u2989'||input.LA(1)=='\u298B'||input.LA(1)=='\u298D'||input.LA(1)=='\u298F'||input.LA(1)=='\u2991'||input.LA(1)=='\u2993'||input.LA(1)=='\u2995'||input.LA(1)=='\u2997'||input.LA(1)=='\u29D8'||input.LA(1)=='\u29DA'||input.LA(1)=='\u29FC'||input.LA(1)=='\u2E22'||input.LA(1)=='\u2E24'||input.LA(1)=='\u2E26'||input.LA(1)=='\u2E28'||input.LA(1)=='\u3008'||input.LA(1)=='\u300A'||input.LA(1)=='\u300C'||input.LA(1)=='\u300E'||input.LA(1)=='\u3010'||input.LA(1)=='\u3014'||input.LA(1)=='\u3016'||input.LA(1)=='\u3018'||input.LA(1)=='\u301A'||input.LA(1)=='\u301D'||input.LA(1)=='\uFD3E'||input.LA(1)=='\uFE17'||input.LA(1)=='\uFE35'||input.LA(1)=='\uFE37'||input.LA(1)=='\uFE39'||input.LA(1)=='\uFE3B'||input.LA(1)=='\uFE3D'||input.LA(1)=='\uFE3F'||input.LA(1)=='\uFE41'||input.LA(1)=='\uFE43'||input.LA(1)=='\uFE47'||input.LA(1)=='\uFE59'||input.LA(1)=='\uFE5B'||input.LA(1)=='\uFE5D'||input.LA(1)=='\uFF08'||input.LA(1)=='\uFF3B'||input.LA(1)=='\uFF5B'||input.LA(1)=='\uFF5F'||input.LA(1)=='\uFF62' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_PS"

    // $ANTLR start "UNICODE_CLASS_SC"
    public final void mUNICODE_CLASS_SC() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_SC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2472:17: ( '\\u0024' | '\\u00A2' .. '\\u00A5' | '\\u058F' | '\\u060B' | '\\u09F2' | '\\u09F3' | '\\u09FB' | '\\u0AF1' | '\\u0BF9' | '\\u0E3F' | '\\u17DB' | '\\u20A0' .. '\\u20B9' | '\\uA838' | '\\uFDFC' | '\\uFE69' | '\\uFF04' | '\\uFFE0' | '\\uFFE1' | '\\uFFE5' | '\\uFFE6' )
            // Unicode.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= '\u00A2' && input.LA(1) <= '\u00A5')||input.LA(1)=='\u058F'||input.LA(1)=='\u060B'||(input.LA(1) >= '\u09F2' && input.LA(1) <= '\u09F3')||input.LA(1)=='\u09FB'||input.LA(1)=='\u0AF1'||input.LA(1)=='\u0BF9'||input.LA(1)=='\u0E3F'||input.LA(1)=='\u17DB'||(input.LA(1) >= '\u20A0' && input.LA(1) <= '\u20B9')||input.LA(1)=='\uA838'||input.LA(1)=='\uFDFC'||input.LA(1)=='\uFE69'||input.LA(1)=='\uFF04'||(input.LA(1) >= '\uFFE0' && input.LA(1) <= '\uFFE1')||(input.LA(1) >= '\uFFE5' && input.LA(1) <= '\uFFE6') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_SC"

    // $ANTLR start "UNICODE_CLASS_SK"
    public final void mUNICODE_CLASS_SK() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_SK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2494:17: ( '\\u005E' | '\\u0060' | '\\u00A8' | '\\u00AF' | '\\u00B4' | '\\u00B8' | '\\u02C2' .. '\\u02C5' | '\\u02D2' .. '\\u02DF' | '\\u02E5' .. '\\u02EB' | '\\u02ED' | '\\u02EF' .. '\\u02FF' | '\\u0375' | '\\u0384' | '\\u0385' | '\\u1FBD' | '\\u1FBF' .. '\\u1FC1' | '\\u1FCD' .. '\\u1FCF' | '\\u1FDD' .. '\\u1FDF' | '\\u1FED' .. '\\u1FEF' | '\\u1FFD' | '\\u1FFE' | '\\u309B' | '\\u309C' | '\\uA700' .. '\\uA716' | '\\uA720' | '\\uA721' | '\\uA789' | '\\uA78A' | '\\uFBB2' .. '\\uFBC1' | '\\uFF3E' | '\\uFF40' | '\\uFFE3' )
            // Unicode.g:
            {
            if ( input.LA(1)=='^'||input.LA(1)=='`'||input.LA(1)=='\u00A8'||input.LA(1)=='\u00AF'||input.LA(1)=='\u00B4'||input.LA(1)=='\u00B8'||(input.LA(1) >= '\u02C2' && input.LA(1) <= '\u02C5')||(input.LA(1) >= '\u02D2' && input.LA(1) <= '\u02DF')||(input.LA(1) >= '\u02E5' && input.LA(1) <= '\u02EB')||input.LA(1)=='\u02ED'||(input.LA(1) >= '\u02EF' && input.LA(1) <= '\u02FF')||input.LA(1)=='\u0375'||(input.LA(1) >= '\u0384' && input.LA(1) <= '\u0385')||input.LA(1)=='\u1FBD'||(input.LA(1) >= '\u1FBF' && input.LA(1) <= '\u1FC1')||(input.LA(1) >= '\u1FCD' && input.LA(1) <= '\u1FCF')||(input.LA(1) >= '\u1FDD' && input.LA(1) <= '\u1FDF')||(input.LA(1) >= '\u1FED' && input.LA(1) <= '\u1FEF')||(input.LA(1) >= '\u1FFD' && input.LA(1) <= '\u1FFE')||(input.LA(1) >= '\u309B' && input.LA(1) <= '\u309C')||(input.LA(1) >= '\uA700' && input.LA(1) <= '\uA716')||(input.LA(1) >= '\uA720' && input.LA(1) <= '\uA721')||(input.LA(1) >= '\uA789' && input.LA(1) <= '\uA78A')||(input.LA(1) >= '\uFBB2' && input.LA(1) <= '\uFBC1')||input.LA(1)=='\uFF3E'||input.LA(1)=='\uFF40'||input.LA(1)=='\uFFE3' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_SK"

    // $ANTLR start "UNICODE_CLASS_SM"
    public final void mUNICODE_CLASS_SM() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_SM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2528:17: ( '\\u002B' | '\\u003C' .. '\\u003E' | '\\u007C' | '\\u007E' | '\\u00AC' | '\\u00B1' | '\\u00D7' | '\\u00F7' | '\\u03F6' | '\\u0606' .. '\\u0608' | '\\u2044' | '\\u2052' | '\\u207A' .. '\\u207C' | '\\u208A' .. '\\u208C' | '\\u2118' | '\\u2140' .. '\\u2144' | '\\u214B' | '\\u2190' .. '\\u2194' | '\\u219A' | '\\u219B' | '\\u21A0' | '\\u21A3' | '\\u21A6' | '\\u21AE' | '\\u21CE' | '\\u21CF' | '\\u21D2' | '\\u21D4' | '\\u21F4' .. '\\u22FF' | '\\u2308' .. '\\u230B' | '\\u2320' | '\\u2321' | '\\u237C' | '\\u239B' .. '\\u23B3' | '\\u23DC' .. '\\u23E1' | '\\u25B7' | '\\u25C1' | '\\u25F8' .. '\\u25FF' | '\\u266F' | '\\u27C0' .. '\\u27C4' | '\\u27C7' .. '\\u27E5' | '\\u27F0' .. '\\u27FF' | '\\u2900' .. '\\u2982' | '\\u2999' .. '\\u29D7' | '\\u29DC' .. '\\u29FB' | '\\u29FE' .. '\\u2AFF' | '\\u2B30' .. '\\u2B44' | '\\u2B47' .. '\\u2B4C' | '\\uFB29' | '\\uFE62' | '\\uFE64' .. '\\uFE66' | '\\uFF0B' | '\\uFF1C' .. '\\uFF1E' | '\\uFF5C' | '\\uFF5E' | '\\uFFE2' | '\\uFFE9' .. '\\uFFEC' )
            // Unicode.g:
            {
            if ( input.LA(1)=='+'||(input.LA(1) >= '<' && input.LA(1) <= '>')||input.LA(1)=='|'||input.LA(1)=='~'||input.LA(1)=='\u00AC'||input.LA(1)=='\u00B1'||input.LA(1)=='\u00D7'||input.LA(1)=='\u00F7'||input.LA(1)=='\u03F6'||(input.LA(1) >= '\u0606' && input.LA(1) <= '\u0608')||input.LA(1)=='\u2044'||input.LA(1)=='\u2052'||(input.LA(1) >= '\u207A' && input.LA(1) <= '\u207C')||(input.LA(1) >= '\u208A' && input.LA(1) <= '\u208C')||input.LA(1)=='\u2118'||(input.LA(1) >= '\u2140' && input.LA(1) <= '\u2144')||input.LA(1)=='\u214B'||(input.LA(1) >= '\u2190' && input.LA(1) <= '\u2194')||(input.LA(1) >= '\u219A' && input.LA(1) <= '\u219B')||input.LA(1)=='\u21A0'||input.LA(1)=='\u21A3'||input.LA(1)=='\u21A6'||input.LA(1)=='\u21AE'||(input.LA(1) >= '\u21CE' && input.LA(1) <= '\u21CF')||input.LA(1)=='\u21D2'||input.LA(1)=='\u21D4'||(input.LA(1) >= '\u21F4' && input.LA(1) <= '\u22FF')||(input.LA(1) >= '\u2308' && input.LA(1) <= '\u230B')||(input.LA(1) >= '\u2320' && input.LA(1) <= '\u2321')||input.LA(1)=='\u237C'||(input.LA(1) >= '\u239B' && input.LA(1) <= '\u23B3')||(input.LA(1) >= '\u23DC' && input.LA(1) <= '\u23E1')||input.LA(1)=='\u25B7'||input.LA(1)=='\u25C1'||(input.LA(1) >= '\u25F8' && input.LA(1) <= '\u25FF')||input.LA(1)=='\u266F'||(input.LA(1) >= '\u27C0' && input.LA(1) <= '\u27C4')||(input.LA(1) >= '\u27C7' && input.LA(1) <= '\u27E5')||(input.LA(1) >= '\u27F0' && input.LA(1) <= '\u27FF')||(input.LA(1) >= '\u2900' && input.LA(1) <= '\u2982')||(input.LA(1) >= '\u2999' && input.LA(1) <= '\u29D7')||(input.LA(1) >= '\u29DC' && input.LA(1) <= '\u29FB')||(input.LA(1) >= '\u29FE' && input.LA(1) <= '\u2AFF')||(input.LA(1) >= '\u2B30' && input.LA(1) <= '\u2B44')||(input.LA(1) >= '\u2B47' && input.LA(1) <= '\u2B4C')||input.LA(1)=='\uFB29'||input.LA(1)=='\uFE62'||(input.LA(1) >= '\uFE64' && input.LA(1) <= '\uFE66')||input.LA(1)=='\uFF0B'||(input.LA(1) >= '\uFF1C' && input.LA(1) <= '\uFF1E')||input.LA(1)=='\uFF5C'||input.LA(1)=='\uFF5E'||input.LA(1)=='\uFFE2'||(input.LA(1) >= '\uFFE9' && input.LA(1) <= '\uFFEC') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_SM"

    // $ANTLR start "UNICODE_CLASS_SO"
    public final void mUNICODE_CLASS_SO() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_SO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2587:17: ( '\\u00A6' | '\\u00A9' | '\\u00AE' | '\\u00B0' | '\\u0482' | '\\u060E' | '\\u060F' | '\\u06DE' | '\\u06E9' | '\\u06FD' | '\\u06FE' | '\\u07F6' | '\\u09FA' | '\\u0B70' | '\\u0BF3' .. '\\u0BF8' | '\\u0BFA' | '\\u0C7F' | '\\u0D79' | '\\u0F01' .. '\\u0F03' | '\\u0F13' | '\\u0F15' .. '\\u0F17' | '\\u0F1A' .. '\\u0F1F' | '\\u0F34' | '\\u0F36' | '\\u0F38' | '\\u0FBE' .. '\\u0FC5' | '\\u0FC7' .. '\\u0FCC' | '\\u0FCE' | '\\u0FCF' | '\\u0FD5' .. '\\u0FD8' | '\\u109E' | '\\u109F' | '\\u1390' .. '\\u1399' | '\\u1940' | '\\u19DE' .. '\\u19FF' | '\\u1B61' .. '\\u1B6A' | '\\u1B74' .. '\\u1B7C' | '\\u2100' | '\\u2101' | '\\u2103' .. '\\u2106' | '\\u2108' | '\\u2109' | '\\u2114' | '\\u2116' | '\\u2117' | '\\u211E' .. '\\u2123' | '\\u2125' | '\\u2127' | '\\u2129' | '\\u212E' | '\\u213A' | '\\u213B' | '\\u214A' | '\\u214C' | '\\u214D' | '\\u214F' | '\\u2195' .. '\\u2199' | '\\u219C' .. '\\u219F' | '\\u21A1' | '\\u21A2' | '\\u21A4' | '\\u21A5' | '\\u21A7' .. '\\u21AD' | '\\u21AF' .. '\\u21CD' | '\\u21D0' | '\\u21D1' | '\\u21D3' | '\\u21D5' .. '\\u21F3' | '\\u2300' .. '\\u2307' | '\\u230C' .. '\\u231F' | '\\u2322' .. '\\u2328' | '\\u232B' .. '\\u237B' | '\\u237D' .. '\\u239A' | '\\u23B4' .. '\\u23DB' | '\\u23E2' .. '\\u23F3' | '\\u2400' .. '\\u2426' | '\\u2440' .. '\\u244A' | '\\u249C' .. '\\u24E9' | '\\u2500' .. '\\u25B6' | '\\u25B8' .. '\\u25C0' | '\\u25C2' .. '\\u25F7' | '\\u2600' .. '\\u266E' | '\\u2670' .. '\\u26FF' | '\\u2701' .. '\\u2767' | '\\u2794' .. '\\u27BF' | '\\u2800' .. '\\u28FF' | '\\u2B00' .. '\\u2B2F' | '\\u2B45' | '\\u2B46' | '\\u2B50' .. '\\u2B59' | '\\u2CE5' .. '\\u2CEA' | '\\u2E80' .. '\\u2E99' | '\\u2E9B' .. '\\u2EF3' | '\\u2F00' .. '\\u2FD5' | '\\u2FF0' .. '\\u2FFB' | '\\u3004' | '\\u3012' | '\\u3013' | '\\u3020' | '\\u3036' | '\\u3037' | '\\u303E' | '\\u303F' | '\\u3190' | '\\u3191' | '\\u3196' .. '\\u319F' | '\\u31C0' .. '\\u31E3' | '\\u3200' .. '\\u321E' | '\\u322A' .. '\\u3247' | '\\u3250' | '\\u3260' .. '\\u327F' | '\\u328A' .. '\\u32B0' | '\\u32C0' .. '\\u32FE' | '\\u3300' .. '\\u33FF' | '\\u4DC0' .. '\\u4DFF' | '\\uA490' .. '\\uA4C6' | '\\uA828' .. '\\uA82B' | '\\uA836' | '\\uA837' | '\\uA839' | '\\uAA77' .. '\\uAA79' | '\\uFDFD' | '\\uFFE4' | '\\uFFE8' | '\\uFFED' | '\\uFFEE' | '\\uFFFC' | '\\uFFFD' )
            // Unicode.g:
            {
            if ( input.LA(1)=='\u00A6'||input.LA(1)=='\u00A9'||input.LA(1)=='\u00AE'||input.LA(1)=='\u00B0'||input.LA(1)=='\u0482'||(input.LA(1) >= '\u060E' && input.LA(1) <= '\u060F')||input.LA(1)=='\u06DE'||input.LA(1)=='\u06E9'||(input.LA(1) >= '\u06FD' && input.LA(1) <= '\u06FE')||input.LA(1)=='\u07F6'||input.LA(1)=='\u09FA'||input.LA(1)=='\u0B70'||(input.LA(1) >= '\u0BF3' && input.LA(1) <= '\u0BF8')||input.LA(1)=='\u0BFA'||input.LA(1)=='\u0C7F'||input.LA(1)=='\u0D79'||(input.LA(1) >= '\u0F01' && input.LA(1) <= '\u0F03')||input.LA(1)=='\u0F13'||(input.LA(1) >= '\u0F15' && input.LA(1) <= '\u0F17')||(input.LA(1) >= '\u0F1A' && input.LA(1) <= '\u0F1F')||input.LA(1)=='\u0F34'||input.LA(1)=='\u0F36'||input.LA(1)=='\u0F38'||(input.LA(1) >= '\u0FBE' && input.LA(1) <= '\u0FC5')||(input.LA(1) >= '\u0FC7' && input.LA(1) <= '\u0FCC')||(input.LA(1) >= '\u0FCE' && input.LA(1) <= '\u0FCF')||(input.LA(1) >= '\u0FD5' && input.LA(1) <= '\u0FD8')||(input.LA(1) >= '\u109E' && input.LA(1) <= '\u109F')||(input.LA(1) >= '\u1390' && input.LA(1) <= '\u1399')||input.LA(1)=='\u1940'||(input.LA(1) >= '\u19DE' && input.LA(1) <= '\u19FF')||(input.LA(1) >= '\u1B61' && input.LA(1) <= '\u1B6A')||(input.LA(1) >= '\u1B74' && input.LA(1) <= '\u1B7C')||(input.LA(1) >= '\u2100' && input.LA(1) <= '\u2101')||(input.LA(1) >= '\u2103' && input.LA(1) <= '\u2106')||(input.LA(1) >= '\u2108' && input.LA(1) <= '\u2109')||input.LA(1)=='\u2114'||(input.LA(1) >= '\u2116' && input.LA(1) <= '\u2117')||(input.LA(1) >= '\u211E' && input.LA(1) <= '\u2123')||input.LA(1)=='\u2125'||input.LA(1)=='\u2127'||input.LA(1)=='\u2129'||input.LA(1)=='\u212E'||(input.LA(1) >= '\u213A' && input.LA(1) <= '\u213B')||input.LA(1)=='\u214A'||(input.LA(1) >= '\u214C' && input.LA(1) <= '\u214D')||input.LA(1)=='\u214F'||(input.LA(1) >= '\u2195' && input.LA(1) <= '\u2199')||(input.LA(1) >= '\u219C' && input.LA(1) <= '\u219F')||(input.LA(1) >= '\u21A1' && input.LA(1) <= '\u21A2')||(input.LA(1) >= '\u21A4' && input.LA(1) <= '\u21A5')||(input.LA(1) >= '\u21A7' && input.LA(1) <= '\u21AD')||(input.LA(1) >= '\u21AF' && input.LA(1) <= '\u21CD')||(input.LA(1) >= '\u21D0' && input.LA(1) <= '\u21D1')||input.LA(1)=='\u21D3'||(input.LA(1) >= '\u21D5' && input.LA(1) <= '\u21F3')||(input.LA(1) >= '\u2300' && input.LA(1) <= '\u2307')||(input.LA(1) >= '\u230C' && input.LA(1) <= '\u231F')||(input.LA(1) >= '\u2322' && input.LA(1) <= '\u2328')||(input.LA(1) >= '\u232B' && input.LA(1) <= '\u237B')||(input.LA(1) >= '\u237D' && input.LA(1) <= '\u239A')||(input.LA(1) >= '\u23B4' && input.LA(1) <= '\u23DB')||(input.LA(1) >= '\u23E2' && input.LA(1) <= '\u23F3')||(input.LA(1) >= '\u2400' && input.LA(1) <= '\u2426')||(input.LA(1) >= '\u2440' && input.LA(1) <= '\u244A')||(input.LA(1) >= '\u249C' && input.LA(1) <= '\u24E9')||(input.LA(1) >= '\u2500' && input.LA(1) <= '\u25B6')||(input.LA(1) >= '\u25B8' && input.LA(1) <= '\u25C0')||(input.LA(1) >= '\u25C2' && input.LA(1) <= '\u25F7')||(input.LA(1) >= '\u2600' && input.LA(1) <= '\u266E')||(input.LA(1) >= '\u2670' && input.LA(1) <= '\u26FF')||(input.LA(1) >= '\u2701' && input.LA(1) <= '\u2767')||(input.LA(1) >= '\u2794' && input.LA(1) <= '\u27BF')||(input.LA(1) >= '\u2800' && input.LA(1) <= '\u28FF')||(input.LA(1) >= '\u2B00' && input.LA(1) <= '\u2B2F')||(input.LA(1) >= '\u2B45' && input.LA(1) <= '\u2B46')||(input.LA(1) >= '\u2B50' && input.LA(1) <= '\u2B59')||(input.LA(1) >= '\u2CE5' && input.LA(1) <= '\u2CEA')||(input.LA(1) >= '\u2E80' && input.LA(1) <= '\u2E99')||(input.LA(1) >= '\u2E9B' && input.LA(1) <= '\u2EF3')||(input.LA(1) >= '\u2F00' && input.LA(1) <= '\u2FD5')||(input.LA(1) >= '\u2FF0' && input.LA(1) <= '\u2FFB')||input.LA(1)=='\u3004'||(input.LA(1) >= '\u3012' && input.LA(1) <= '\u3013')||input.LA(1)=='\u3020'||(input.LA(1) >= '\u3036' && input.LA(1) <= '\u3037')||(input.LA(1) >= '\u303E' && input.LA(1) <= '\u303F')||(input.LA(1) >= '\u3190' && input.LA(1) <= '\u3191')||(input.LA(1) >= '\u3196' && input.LA(1) <= '\u319F')||(input.LA(1) >= '\u31C0' && input.LA(1) <= '\u31E3')||(input.LA(1) >= '\u3200' && input.LA(1) <= '\u321E')||(input.LA(1) >= '\u322A' && input.LA(1) <= '\u3247')||input.LA(1)=='\u3250'||(input.LA(1) >= '\u3260' && input.LA(1) <= '\u327F')||(input.LA(1) >= '\u328A' && input.LA(1) <= '\u32B0')||(input.LA(1) >= '\u32C0' && input.LA(1) <= '\u32FE')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u33FF')||(input.LA(1) >= '\u4DC0' && input.LA(1) <= '\u4DFF')||(input.LA(1) >= '\uA490' && input.LA(1) <= '\uA4C6')||(input.LA(1) >= '\uA828' && input.LA(1) <= '\uA82B')||(input.LA(1) >= '\uA836' && input.LA(1) <= '\uA837')||input.LA(1)=='\uA839'||(input.LA(1) >= '\uAA77' && input.LA(1) <= '\uAA79')||input.LA(1)=='\uFDFD'||input.LA(1)=='\uFFE4'||input.LA(1)=='\uFFE8'||(input.LA(1) >= '\uFFED' && input.LA(1) <= '\uFFEE')||(input.LA(1) >= '\uFFFC' && input.LA(1) <= '\uFFFD') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_SO"

    // $ANTLR start "UNICODE_CLASS_ZL"
    public final void mUNICODE_CLASS_ZL() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_ZL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2717:17: ( '\\u2028' )
            // Unicode.g:2718:2: '\\u2028'
            {
            match('\u2028'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_ZL"

    // $ANTLR start "UNICODE_CLASS_ZP"
    public final void mUNICODE_CLASS_ZP() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_ZP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2720:17: ( '\\u2029' )
            // Unicode.g:2721:2: '\\u2029'
            {
            match('\u2029'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_ZP"

    // $ANTLR start "UNICODE_CLASS_ZS"
    public final void mUNICODE_CLASS_ZS() throws RecognitionException {
        try {
            int _type = UNICODE_CLASS_ZS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Unicode.g:2723:17: ( '\\u0020' | '\\u00A0' | '\\u1680' | '\\u180E' | '\\u2000' .. '\\u200A' | '\\u202F' | '\\u205F' | '\\u3000' )
            // Unicode.g:
            {
            if ( input.LA(1)==' '||input.LA(1)=='\u00A0'||input.LA(1)=='\u1680'||input.LA(1)=='\u180E'||(input.LA(1) >= '\u2000' && input.LA(1) <= '\u200A')||input.LA(1)=='\u202F'||input.LA(1)=='\u205F'||input.LA(1)=='\u3000' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CLASS_ZS"

    public void mTokens() throws RecognitionException {
        // Unicode.g:1:8: ( UNICODE_CLASS_CC | UNICODE_CLASS_CF | UNICODE_CLASS_CO | UNICODE_CLASS_CS | UNICODE_CLASS_LL | UNICODE_CLASS_LM | UNICODE_CLASS_LO | UNICODE_CLASS_LT | UNICODE_CLASS_LU | UNICODE_CLASS_MC | UNICODE_CLASS_ME | UNICODE_CLASS_MN | UNICODE_CLASS_ND | UNICODE_CLASS_NL | UNICODE_CLASS_NO | UNICODE_CLASS_PC | UNICODE_CLASS_PD | UNICODE_CLASS_PE | UNICODE_CLASS_PF | UNICODE_CLASS_PI | UNICODE_CLASS_PO | UNICODE_CLASS_PS | UNICODE_CLASS_SC | UNICODE_CLASS_SK | UNICODE_CLASS_SM | UNICODE_CLASS_SO | UNICODE_CLASS_ZL | UNICODE_CLASS_ZP | UNICODE_CLASS_ZS )
        int alt1=29;
        int LA1_0 = input.LA(1);

        if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\u001F')||(LA1_0 >= '\u007F' && LA1_0 <= '\u009F')) ) {
            alt1=1;
        }
        else if ( (LA1_0=='\u00AD'||(LA1_0 >= '\u0600' && LA1_0 <= '\u0604')||LA1_0=='\u06DD'||LA1_0=='\u070F'||(LA1_0 >= '\u200B' && LA1_0 <= '\u200F')||(LA1_0 >= '\u202A' && LA1_0 <= '\u202E')||(LA1_0 >= '\u2060' && LA1_0 <= '\u2064')||(LA1_0 >= '\u206A' && LA1_0 <= '\u206F')||LA1_0=='\uFEFF'||(LA1_0 >= '\uFFF9' && LA1_0 <= '\uFFFB')) ) {
            alt1=2;
        }
        else if ( (LA1_0=='\uE000'||LA1_0=='\uF8FF') ) {
            alt1=3;
        }
        else if ( (LA1_0=='\uD800'||(LA1_0 >= '\uDB7F' && LA1_0 <= '\uDB80')||(LA1_0 >= '\uDBFF' && LA1_0 <= '\uDC00')||LA1_0=='\uDFFF') ) {
            alt1=4;
        }
        else if ( ((LA1_0 >= 'a' && LA1_0 <= 'z')||LA1_0=='\u00B5'||(LA1_0 >= '\u00DF' && LA1_0 <= '\u00F6')||(LA1_0 >= '\u00F8' && LA1_0 <= '\u00FF')||LA1_0=='\u0101'||LA1_0=='\u0103'||LA1_0=='\u0105'||LA1_0=='\u0107'||LA1_0=='\u0109'||LA1_0=='\u010B'||LA1_0=='\u010D'||LA1_0=='\u010F'||LA1_0=='\u0111'||LA1_0=='\u0113'||LA1_0=='\u0115'||LA1_0=='\u0117'||LA1_0=='\u0119'||LA1_0=='\u011B'||LA1_0=='\u011D'||LA1_0=='\u011F'||LA1_0=='\u0121'||LA1_0=='\u0123'||LA1_0=='\u0125'||LA1_0=='\u0127'||LA1_0=='\u0129'||LA1_0=='\u012B'||LA1_0=='\u012D'||LA1_0=='\u012F'||LA1_0=='\u0131'||LA1_0=='\u0133'||LA1_0=='\u0135'||(LA1_0 >= '\u0137' && LA1_0 <= '\u0138')||LA1_0=='\u013A'||LA1_0=='\u013C'||LA1_0=='\u013E'||LA1_0=='\u0140'||LA1_0=='\u0142'||LA1_0=='\u0144'||LA1_0=='\u0146'||(LA1_0 >= '\u0148' && LA1_0 <= '\u0149')||LA1_0=='\u014B'||LA1_0=='\u014D'||LA1_0=='\u014F'||LA1_0=='\u0151'||LA1_0=='\u0153'||LA1_0=='\u0155'||LA1_0=='\u0157'||LA1_0=='\u0159'||LA1_0=='\u015B'||LA1_0=='\u015D'||LA1_0=='\u015F'||LA1_0=='\u0161'||LA1_0=='\u0163'||LA1_0=='\u0165'||LA1_0=='\u0167'||LA1_0=='\u0169'||LA1_0=='\u016B'||LA1_0=='\u016D'||LA1_0=='\u016F'||LA1_0=='\u0171'||LA1_0=='\u0173'||LA1_0=='\u0175'||LA1_0=='\u0177'||LA1_0=='\u017A'||LA1_0=='\u017C'||(LA1_0 >= '\u017E' && LA1_0 <= '\u0180')||LA1_0=='\u0183'||LA1_0=='\u0185'||LA1_0=='\u0188'||(LA1_0 >= '\u018C' && LA1_0 <= '\u018D')||LA1_0=='\u0192'||LA1_0=='\u0195'||(LA1_0 >= '\u0199' && LA1_0 <= '\u019B')||LA1_0=='\u019E'||LA1_0=='\u01A1'||LA1_0=='\u01A3'||LA1_0=='\u01A5'||LA1_0=='\u01A8'||(LA1_0 >= '\u01AA' && LA1_0 <= '\u01AB')||LA1_0=='\u01AD'||LA1_0=='\u01B0'||LA1_0=='\u01B4'||LA1_0=='\u01B6'||(LA1_0 >= '\u01B9' && LA1_0 <= '\u01BA')||(LA1_0 >= '\u01BD' && LA1_0 <= '\u01BF')||LA1_0=='\u01C6'||LA1_0=='\u01C9'||LA1_0=='\u01CC'||LA1_0=='\u01CE'||LA1_0=='\u01D0'||LA1_0=='\u01D2'||LA1_0=='\u01D4'||LA1_0=='\u01D6'||LA1_0=='\u01D8'||LA1_0=='\u01DA'||(LA1_0 >= '\u01DC' && LA1_0 <= '\u01DD')||LA1_0=='\u01DF'||LA1_0=='\u01E1'||LA1_0=='\u01E3'||LA1_0=='\u01E5'||LA1_0=='\u01E7'||LA1_0=='\u01E9'||LA1_0=='\u01EB'||LA1_0=='\u01ED'||(LA1_0 >= '\u01EF' && LA1_0 <= '\u01F0')||LA1_0=='\u01F3'||LA1_0=='\u01F5'||LA1_0=='\u01F9'||LA1_0=='\u01FB'||LA1_0=='\u01FD'||LA1_0=='\u01FF'||LA1_0=='\u0201'||LA1_0=='\u0203'||LA1_0=='\u0205'||LA1_0=='\u0207'||LA1_0=='\u0209'||LA1_0=='\u020B'||LA1_0=='\u020D'||LA1_0=='\u020F'||LA1_0=='\u0211'||LA1_0=='\u0213'||LA1_0=='\u0215'||LA1_0=='\u0217'||LA1_0=='\u0219'||LA1_0=='\u021B'||LA1_0=='\u021D'||LA1_0=='\u021F'||LA1_0=='\u0221'||LA1_0=='\u0223'||LA1_0=='\u0225'||LA1_0=='\u0227'||LA1_0=='\u0229'||LA1_0=='\u022B'||LA1_0=='\u022D'||LA1_0=='\u022F'||LA1_0=='\u0231'||(LA1_0 >= '\u0233' && LA1_0 <= '\u0239')||LA1_0=='\u023C'||(LA1_0 >= '\u023F' && LA1_0 <= '\u0240')||LA1_0=='\u0242'||LA1_0=='\u0247'||LA1_0=='\u0249'||LA1_0=='\u024B'||LA1_0=='\u024D'||(LA1_0 >= '\u024F' && LA1_0 <= '\u0293')||(LA1_0 >= '\u0295' && LA1_0 <= '\u02AF')||LA1_0=='\u0371'||LA1_0=='\u0373'||LA1_0=='\u0377'||(LA1_0 >= '\u037B' && LA1_0 <= '\u037D')||LA1_0=='\u0390'||(LA1_0 >= '\u03AC' && LA1_0 <= '\u03CE')||(LA1_0 >= '\u03D0' && LA1_0 <= '\u03D1')||(LA1_0 >= '\u03D5' && LA1_0 <= '\u03D7')||LA1_0=='\u03D9'||LA1_0=='\u03DB'||LA1_0=='\u03DD'||LA1_0=='\u03DF'||LA1_0=='\u03E1'||LA1_0=='\u03E3'||LA1_0=='\u03E5'||LA1_0=='\u03E7'||LA1_0=='\u03E9'||LA1_0=='\u03EB'||LA1_0=='\u03ED'||(LA1_0 >= '\u03EF' && LA1_0 <= '\u03F3')||LA1_0=='\u03F5'||LA1_0=='\u03F8'||(LA1_0 >= '\u03FB' && LA1_0 <= '\u03FC')||(LA1_0 >= '\u0430' && LA1_0 <= '\u045F')||LA1_0=='\u0461'||LA1_0=='\u0463'||LA1_0=='\u0465'||LA1_0=='\u0467'||LA1_0=='\u0469'||LA1_0=='\u046B'||LA1_0=='\u046D'||LA1_0=='\u046F'||LA1_0=='\u0471'||LA1_0=='\u0473'||LA1_0=='\u0475'||LA1_0=='\u0477'||LA1_0=='\u0479'||LA1_0=='\u047B'||LA1_0=='\u047D'||LA1_0=='\u047F'||LA1_0=='\u0481'||LA1_0=='\u048B'||LA1_0=='\u048D'||LA1_0=='\u048F'||LA1_0=='\u0491'||LA1_0=='\u0493'||LA1_0=='\u0495'||LA1_0=='\u0497'||LA1_0=='\u0499'||LA1_0=='\u049B'||LA1_0=='\u049D'||LA1_0=='\u049F'||LA1_0=='\u04A1'||LA1_0=='\u04A3'||LA1_0=='\u04A5'||LA1_0=='\u04A7'||LA1_0=='\u04A9'||LA1_0=='\u04AB'||LA1_0=='\u04AD'||LA1_0=='\u04AF'||LA1_0=='\u04B1'||LA1_0=='\u04B3'||LA1_0=='\u04B5'||LA1_0=='\u04B7'||LA1_0=='\u04B9'||LA1_0=='\u04BB'||LA1_0=='\u04BD'||LA1_0=='\u04BF'||LA1_0=='\u04C2'||LA1_0=='\u04C4'||LA1_0=='\u04C6'||LA1_0=='\u04C8'||LA1_0=='\u04CA'||LA1_0=='\u04CC'||(LA1_0 >= '\u04CE' && LA1_0 <= '\u04CF')||LA1_0=='\u04D1'||LA1_0=='\u04D3'||LA1_0=='\u04D5'||LA1_0=='\u04D7'||LA1_0=='\u04D9'||LA1_0=='\u04DB'||LA1_0=='\u04DD'||LA1_0=='\u04DF'||LA1_0=='\u04E1'||LA1_0=='\u04E3'||LA1_0=='\u04E5'||LA1_0=='\u04E7'||LA1_0=='\u04E9'||LA1_0=='\u04EB'||LA1_0=='\u04ED'||LA1_0=='\u04EF'||LA1_0=='\u04F1'||LA1_0=='\u04F3'||LA1_0=='\u04F5'||LA1_0=='\u04F7'||LA1_0=='\u04F9'||LA1_0=='\u04FB'||LA1_0=='\u04FD'||LA1_0=='\u04FF'||LA1_0=='\u0501'||LA1_0=='\u0503'||LA1_0=='\u0505'||LA1_0=='\u0507'||LA1_0=='\u0509'||LA1_0=='\u050B'||LA1_0=='\u050D'||LA1_0=='\u050F'||LA1_0=='\u0511'||LA1_0=='\u0513'||LA1_0=='\u0515'||LA1_0=='\u0517'||LA1_0=='\u0519'||LA1_0=='\u051B'||LA1_0=='\u051D'||LA1_0=='\u051F'||LA1_0=='\u0521'||LA1_0=='\u0523'||LA1_0=='\u0525'||LA1_0=='\u0527'||(LA1_0 >= '\u0561' && LA1_0 <= '\u0587')||(LA1_0 >= '\u1D00' && LA1_0 <= '\u1D2B')||(LA1_0 >= '\u1D6B' && LA1_0 <= '\u1D77')||(LA1_0 >= '\u1D79' && LA1_0 <= '\u1D9A')||LA1_0=='\u1E01'||LA1_0=='\u1E03'||LA1_0=='\u1E05'||LA1_0=='\u1E07'||LA1_0=='\u1E09'||LA1_0=='\u1E0B'||LA1_0=='\u1E0D'||LA1_0=='\u1E0F'||LA1_0=='\u1E11'||LA1_0=='\u1E13'||LA1_0=='\u1E15'||LA1_0=='\u1E17'||LA1_0=='\u1E19'||LA1_0=='\u1E1B'||LA1_0=='\u1E1D'||LA1_0=='\u1E1F'||LA1_0=='\u1E21'||LA1_0=='\u1E23'||LA1_0=='\u1E25'||LA1_0=='\u1E27'||LA1_0=='\u1E29'||LA1_0=='\u1E2B'||LA1_0=='\u1E2D'||LA1_0=='\u1E2F'||LA1_0=='\u1E31'||LA1_0=='\u1E33'||LA1_0=='\u1E35'||LA1_0=='\u1E37'||LA1_0=='\u1E39'||LA1_0=='\u1E3B'||LA1_0=='\u1E3D'||LA1_0=='\u1E3F'||LA1_0=='\u1E41'||LA1_0=='\u1E43'||LA1_0=='\u1E45'||LA1_0=='\u1E47'||LA1_0=='\u1E49'||LA1_0=='\u1E4B'||LA1_0=='\u1E4D'||LA1_0=='\u1E4F'||LA1_0=='\u1E51'||LA1_0=='\u1E53'||LA1_0=='\u1E55'||LA1_0=='\u1E57'||LA1_0=='\u1E59'||LA1_0=='\u1E5B'||LA1_0=='\u1E5D'||LA1_0=='\u1E5F'||LA1_0=='\u1E61'||LA1_0=='\u1E63'||LA1_0=='\u1E65'||LA1_0=='\u1E67'||LA1_0=='\u1E69'||LA1_0=='\u1E6B'||LA1_0=='\u1E6D'||LA1_0=='\u1E6F'||LA1_0=='\u1E71'||LA1_0=='\u1E73'||LA1_0=='\u1E75'||LA1_0=='\u1E77'||LA1_0=='\u1E79'||LA1_0=='\u1E7B'||LA1_0=='\u1E7D'||LA1_0=='\u1E7F'||LA1_0=='\u1E81'||LA1_0=='\u1E83'||LA1_0=='\u1E85'||LA1_0=='\u1E87'||LA1_0=='\u1E89'||LA1_0=='\u1E8B'||LA1_0=='\u1E8D'||LA1_0=='\u1E8F'||LA1_0=='\u1E91'||LA1_0=='\u1E93'||(LA1_0 >= '\u1E95' && LA1_0 <= '\u1E9D')||LA1_0=='\u1E9F'||LA1_0=='\u1EA1'||LA1_0=='\u1EA3'||LA1_0=='\u1EA5'||LA1_0=='\u1EA7'||LA1_0=='\u1EA9'||LA1_0=='\u1EAB'||LA1_0=='\u1EAD'||LA1_0=='\u1EAF'||LA1_0=='\u1EB1'||LA1_0=='\u1EB3'||LA1_0=='\u1EB5'||LA1_0=='\u1EB7'||LA1_0=='\u1EB9'||LA1_0=='\u1EBB'||LA1_0=='\u1EBD'||LA1_0=='\u1EBF'||LA1_0=='\u1EC1'||LA1_0=='\u1EC3'||LA1_0=='\u1EC5'||LA1_0=='\u1EC7'||LA1_0=='\u1EC9'||LA1_0=='\u1ECB'||LA1_0=='\u1ECD'||LA1_0=='\u1ECF'||LA1_0=='\u1ED1'||LA1_0=='\u1ED3'||LA1_0=='\u1ED5'||LA1_0=='\u1ED7'||LA1_0=='\u1ED9'||LA1_0=='\u1EDB'||LA1_0=='\u1EDD'||LA1_0=='\u1EDF'||LA1_0=='\u1EE1'||LA1_0=='\u1EE3'||LA1_0=='\u1EE5'||LA1_0=='\u1EE7'||LA1_0=='\u1EE9'||LA1_0=='\u1EEB'||LA1_0=='\u1EED'||LA1_0=='\u1EEF'||LA1_0=='\u1EF1'||LA1_0=='\u1EF3'||LA1_0=='\u1EF5'||LA1_0=='\u1EF7'||LA1_0=='\u1EF9'||LA1_0=='\u1EFB'||LA1_0=='\u1EFD'||(LA1_0 >= '\u1EFF' && LA1_0 <= '\u1F07')||(LA1_0 >= '\u1F10' && LA1_0 <= '\u1F15')||(LA1_0 >= '\u1F20' && LA1_0 <= '\u1F27')||(LA1_0 >= '\u1F30' && LA1_0 <= '\u1F37')||(LA1_0 >= '\u1F40' && LA1_0 <= '\u1F45')||(LA1_0 >= '\u1F50' && LA1_0 <= '\u1F57')||(LA1_0 >= '\u1F60' && LA1_0 <= '\u1F67')||(LA1_0 >= '\u1F70' && LA1_0 <= '\u1F7D')||(LA1_0 >= '\u1F80' && LA1_0 <= '\u1F87')||(LA1_0 >= '\u1F90' && LA1_0 <= '\u1F97')||(LA1_0 >= '\u1FA0' && LA1_0 <= '\u1FA7')||(LA1_0 >= '\u1FB0' && LA1_0 <= '\u1FB4')||(LA1_0 >= '\u1FB6' && LA1_0 <= '\u1FB7')||LA1_0=='\u1FBE'||(LA1_0 >= '\u1FC2' && LA1_0 <= '\u1FC4')||(LA1_0 >= '\u1FC6' && LA1_0 <= '\u1FC7')||(LA1_0 >= '\u1FD0' && LA1_0 <= '\u1FD3')||(LA1_0 >= '\u1FD6' && LA1_0 <= '\u1FD7')||(LA1_0 >= '\u1FE0' && LA1_0 <= '\u1FE7')||(LA1_0 >= '\u1FF2' && LA1_0 <= '\u1FF4')||(LA1_0 >= '\u1FF6' && LA1_0 <= '\u1FF7')||LA1_0=='\u210A'||(LA1_0 >= '\u210E' && LA1_0 <= '\u210F')||LA1_0=='\u2113'||LA1_0=='\u212F'||LA1_0=='\u2134'||LA1_0=='\u2139'||(LA1_0 >= '\u213C' && LA1_0 <= '\u213D')||(LA1_0 >= '\u2146' && LA1_0 <= '\u2149')||LA1_0=='\u214E'||LA1_0=='\u2184'||(LA1_0 >= '\u2C30' && LA1_0 <= '\u2C5E')||LA1_0=='\u2C61'||(LA1_0 >= '\u2C65' && LA1_0 <= '\u2C66')||LA1_0=='\u2C68'||LA1_0=='\u2C6A'||LA1_0=='\u2C6C'||LA1_0=='\u2C71'||(LA1_0 >= '\u2C73' && LA1_0 <= '\u2C74')||(LA1_0 >= '\u2C76' && LA1_0 <= '\u2C7B')||LA1_0=='\u2C81'||LA1_0=='\u2C83'||LA1_0=='\u2C85'||LA1_0=='\u2C87'||LA1_0=='\u2C89'||LA1_0=='\u2C8B'||LA1_0=='\u2C8D'||LA1_0=='\u2C8F'||LA1_0=='\u2C91'||LA1_0=='\u2C93'||LA1_0=='\u2C95'||LA1_0=='\u2C97'||LA1_0=='\u2C99'||LA1_0=='\u2C9B'||LA1_0=='\u2C9D'||LA1_0=='\u2C9F'||LA1_0=='\u2CA1'||LA1_0=='\u2CA3'||LA1_0=='\u2CA5'||LA1_0=='\u2CA7'||LA1_0=='\u2CA9'||LA1_0=='\u2CAB'||LA1_0=='\u2CAD'||LA1_0=='\u2CAF'||LA1_0=='\u2CB1'||LA1_0=='\u2CB3'||LA1_0=='\u2CB5'||LA1_0=='\u2CB7'||LA1_0=='\u2CB9'||LA1_0=='\u2CBB'||LA1_0=='\u2CBD'||LA1_0=='\u2CBF'||LA1_0=='\u2CC1'||LA1_0=='\u2CC3'||LA1_0=='\u2CC5'||LA1_0=='\u2CC7'||LA1_0=='\u2CC9'||LA1_0=='\u2CCB'||LA1_0=='\u2CCD'||LA1_0=='\u2CCF'||LA1_0=='\u2CD1'||LA1_0=='\u2CD3'||LA1_0=='\u2CD5'||LA1_0=='\u2CD7'||LA1_0=='\u2CD9'||LA1_0=='\u2CDB'||LA1_0=='\u2CDD'||LA1_0=='\u2CDF'||LA1_0=='\u2CE1'||(LA1_0 >= '\u2CE3' && LA1_0 <= '\u2CE4')||LA1_0=='\u2CEC'||LA1_0=='\u2CEE'||LA1_0=='\u2CF3'||(LA1_0 >= '\u2D00' && LA1_0 <= '\u2D25')||LA1_0=='\u2D27'||LA1_0=='\u2D2D'||LA1_0=='\uA641'||LA1_0=='\uA643'||LA1_0=='\uA645'||LA1_0=='\uA647'||LA1_0=='\uA649'||LA1_0=='\uA64B'||LA1_0=='\uA64D'||LA1_0=='\uA64F'||LA1_0=='\uA651'||LA1_0=='\uA653'||LA1_0=='\uA655'||LA1_0=='\uA657'||LA1_0=='\uA659'||LA1_0=='\uA65B'||LA1_0=='\uA65D'||LA1_0=='\uA65F'||LA1_0=='\uA661'||LA1_0=='\uA663'||LA1_0=='\uA665'||LA1_0=='\uA667'||LA1_0=='\uA669'||LA1_0=='\uA66B'||LA1_0=='\uA66D'||LA1_0=='\uA681'||LA1_0=='\uA683'||LA1_0=='\uA685'||LA1_0=='\uA687'||LA1_0=='\uA689'||LA1_0=='\uA68B'||LA1_0=='\uA68D'||LA1_0=='\uA68F'||LA1_0=='\uA691'||LA1_0=='\uA693'||LA1_0=='\uA695'||LA1_0=='\uA697'||LA1_0=='\uA723'||LA1_0=='\uA725'||LA1_0=='\uA727'||LA1_0=='\uA729'||LA1_0=='\uA72B'||LA1_0=='\uA72D'||(LA1_0 >= '\uA72F' && LA1_0 <= '\uA731')||LA1_0=='\uA733'||LA1_0=='\uA735'||LA1_0=='\uA737'||LA1_0=='\uA739'||LA1_0=='\uA73B'||LA1_0=='\uA73D'||LA1_0=='\uA73F'||LA1_0=='\uA741'||LA1_0=='\uA743'||LA1_0=='\uA745'||LA1_0=='\uA747'||LA1_0=='\uA749'||LA1_0=='\uA74B'||LA1_0=='\uA74D'||LA1_0=='\uA74F'||LA1_0=='\uA751'||LA1_0=='\uA753'||LA1_0=='\uA755'||LA1_0=='\uA757'||LA1_0=='\uA759'||LA1_0=='\uA75B'||LA1_0=='\uA75D'||LA1_0=='\uA75F'||LA1_0=='\uA761'||LA1_0=='\uA763'||LA1_0=='\uA765'||LA1_0=='\uA767'||LA1_0=='\uA769'||LA1_0=='\uA76B'||LA1_0=='\uA76D'||LA1_0=='\uA76F'||(LA1_0 >= '\uA771' && LA1_0 <= '\uA778')||LA1_0=='\uA77A'||LA1_0=='\uA77C'||LA1_0=='\uA77F'||LA1_0=='\uA781'||LA1_0=='\uA783'||LA1_0=='\uA785'||LA1_0=='\uA787'||LA1_0=='\uA78C'||LA1_0=='\uA78E'||LA1_0=='\uA791'||LA1_0=='\uA793'||LA1_0=='\uA7A1'||LA1_0=='\uA7A3'||LA1_0=='\uA7A5'||LA1_0=='\uA7A7'||LA1_0=='\uA7A9'||LA1_0=='\uA7FA'||(LA1_0 >= '\uFB00' && LA1_0 <= '\uFB06')||(LA1_0 >= '\uFB13' && LA1_0 <= '\uFB17')||(LA1_0 >= '\uFF41' && LA1_0 <= '\uFF5A')) ) {
            alt1=5;
        }
        else if ( ((LA1_0 >= '\u02B0' && LA1_0 <= '\u02C1')||(LA1_0 >= '\u02C6' && LA1_0 <= '\u02D1')||(LA1_0 >= '\u02E0' && LA1_0 <= '\u02E4')||LA1_0=='\u02EC'||LA1_0=='\u02EE'||LA1_0=='\u0374'||LA1_0=='\u037A'||LA1_0=='\u0559'||LA1_0=='\u0640'||(LA1_0 >= '\u06E5' && LA1_0 <= '\u06E6')||(LA1_0 >= '\u07F4' && LA1_0 <= '\u07F5')||LA1_0=='\u07FA'||LA1_0=='\u081A'||LA1_0=='\u0824'||LA1_0=='\u0828'||LA1_0=='\u0971'||LA1_0=='\u0E46'||LA1_0=='\u0EC6'||LA1_0=='\u10FC'||LA1_0=='\u17D7'||LA1_0=='\u1843'||LA1_0=='\u1AA7'||(LA1_0 >= '\u1C78' && LA1_0 <= '\u1C7D')||(LA1_0 >= '\u1D2C' && LA1_0 <= '\u1D6A')||LA1_0=='\u1D78'||(LA1_0 >= '\u1D9B' && LA1_0 <= '\u1DBF')||LA1_0=='\u2071'||LA1_0=='\u207F'||(LA1_0 >= '\u2090' && LA1_0 <= '\u209C')||(LA1_0 >= '\u2C7C' && LA1_0 <= '\u2C7D')||LA1_0=='\u2D6F'||LA1_0=='\u2E2F'||LA1_0=='\u3005'||(LA1_0 >= '\u3031' && LA1_0 <= '\u3035')||LA1_0=='\u303B'||(LA1_0 >= '\u309D' && LA1_0 <= '\u309E')||(LA1_0 >= '\u30FC' && LA1_0 <= '\u30FE')||LA1_0=='\uA015'||(LA1_0 >= '\uA4F8' && LA1_0 <= '\uA4FD')||LA1_0=='\uA60C'||LA1_0=='\uA67F'||(LA1_0 >= '\uA717' && LA1_0 <= '\uA71F')||LA1_0=='\uA770'||LA1_0=='\uA788'||(LA1_0 >= '\uA7F8' && LA1_0 <= '\uA7F9')||LA1_0=='\uA9CF'||LA1_0=='\uAA70'||LA1_0=='\uAADD'||(LA1_0 >= '\uAAF3' && LA1_0 <= '\uAAF4')||LA1_0=='\uFF70'||(LA1_0 >= '\uFF9E' && LA1_0 <= '\uFF9F')) ) {
            alt1=6;
        }
        else if ( (LA1_0=='\u00AA'||LA1_0=='\u00BA'||LA1_0=='\u01BB'||(LA1_0 >= '\u01C0' && LA1_0 <= '\u01C3')||LA1_0=='\u0294'||(LA1_0 >= '\u05D0' && LA1_0 <= '\u05EA')||(LA1_0 >= '\u05F0' && LA1_0 <= '\u05F2')||(LA1_0 >= '\u0620' && LA1_0 <= '\u063F')||(LA1_0 >= '\u0641' && LA1_0 <= '\u064A')||(LA1_0 >= '\u066E' && LA1_0 <= '\u066F')||(LA1_0 >= '\u0671' && LA1_0 <= '\u06D3')||LA1_0=='\u06D5'||(LA1_0 >= '\u06EE' && LA1_0 <= '\u06EF')||(LA1_0 >= '\u06FA' && LA1_0 <= '\u06FC')||LA1_0=='\u06FF'||LA1_0=='\u0710'||(LA1_0 >= '\u0712' && LA1_0 <= '\u072F')||(LA1_0 >= '\u074D' && LA1_0 <= '\u07A5')||LA1_0=='\u07B1'||(LA1_0 >= '\u07CA' && LA1_0 <= '\u07EA')||(LA1_0 >= '\u0800' && LA1_0 <= '\u0815')||(LA1_0 >= '\u0840' && LA1_0 <= '\u0858')||LA1_0=='\u08A0'||(LA1_0 >= '\u08A2' && LA1_0 <= '\u08AC')||(LA1_0 >= '\u0904' && LA1_0 <= '\u0939')||LA1_0=='\u093D'||LA1_0=='\u0950'||(LA1_0 >= '\u0958' && LA1_0 <= '\u0961')||(LA1_0 >= '\u0972' && LA1_0 <= '\u0977')||(LA1_0 >= '\u0979' && LA1_0 <= '\u097F')||(LA1_0 >= '\u0985' && LA1_0 <= '\u098C')||(LA1_0 >= '\u098F' && LA1_0 <= '\u0990')||(LA1_0 >= '\u0993' && LA1_0 <= '\u09A8')||(LA1_0 >= '\u09AA' && LA1_0 <= '\u09B0')||LA1_0=='\u09B2'||(LA1_0 >= '\u09B6' && LA1_0 <= '\u09B9')||LA1_0=='\u09BD'||LA1_0=='\u09CE'||(LA1_0 >= '\u09DC' && LA1_0 <= '\u09DD')||(LA1_0 >= '\u09DF' && LA1_0 <= '\u09E1')||(LA1_0 >= '\u09F0' && LA1_0 <= '\u09F1')||(LA1_0 >= '\u0A05' && LA1_0 <= '\u0A0A')||(LA1_0 >= '\u0A0F' && LA1_0 <= '\u0A10')||(LA1_0 >= '\u0A13' && LA1_0 <= '\u0A28')||(LA1_0 >= '\u0A2A' && LA1_0 <= '\u0A30')||(LA1_0 >= '\u0A32' && LA1_0 <= '\u0A33')||(LA1_0 >= '\u0A35' && LA1_0 <= '\u0A36')||(LA1_0 >= '\u0A38' && LA1_0 <= '\u0A39')||(LA1_0 >= '\u0A59' && LA1_0 <= '\u0A5C')||LA1_0=='\u0A5E'||(LA1_0 >= '\u0A72' && LA1_0 <= '\u0A74')||(LA1_0 >= '\u0A85' && LA1_0 <= '\u0A8D')||(LA1_0 >= '\u0A8F' && LA1_0 <= '\u0A91')||(LA1_0 >= '\u0A93' && LA1_0 <= '\u0AA8')||(LA1_0 >= '\u0AAA' && LA1_0 <= '\u0AB0')||(LA1_0 >= '\u0AB2' && LA1_0 <= '\u0AB3')||(LA1_0 >= '\u0AB5' && LA1_0 <= '\u0AB9')||LA1_0=='\u0ABD'||LA1_0=='\u0AD0'||(LA1_0 >= '\u0AE0' && LA1_0 <= '\u0AE1')||(LA1_0 >= '\u0B05' && LA1_0 <= '\u0B0C')||(LA1_0 >= '\u0B0F' && LA1_0 <= '\u0B10')||(LA1_0 >= '\u0B13' && LA1_0 <= '\u0B28')||(LA1_0 >= '\u0B2A' && LA1_0 <= '\u0B30')||(LA1_0 >= '\u0B32' && LA1_0 <= '\u0B33')||(LA1_0 >= '\u0B35' && LA1_0 <= '\u0B39')||LA1_0=='\u0B3D'||(LA1_0 >= '\u0B5C' && LA1_0 <= '\u0B5D')||(LA1_0 >= '\u0B5F' && LA1_0 <= '\u0B61')||LA1_0=='\u0B71'||LA1_0=='\u0B83'||(LA1_0 >= '\u0B85' && LA1_0 <= '\u0B8A')||(LA1_0 >= '\u0B8E' && LA1_0 <= '\u0B90')||(LA1_0 >= '\u0B92' && LA1_0 <= '\u0B95')||(LA1_0 >= '\u0B99' && LA1_0 <= '\u0B9A')||LA1_0=='\u0B9C'||(LA1_0 >= '\u0B9E' && LA1_0 <= '\u0B9F')||(LA1_0 >= '\u0BA3' && LA1_0 <= '\u0BA4')||(LA1_0 >= '\u0BA8' && LA1_0 <= '\u0BAA')||(LA1_0 >= '\u0BAE' && LA1_0 <= '\u0BB9')||LA1_0=='\u0BD0'||(LA1_0 >= '\u0C05' && LA1_0 <= '\u0C0C')||(LA1_0 >= '\u0C0E' && LA1_0 <= '\u0C10')||(LA1_0 >= '\u0C12' && LA1_0 <= '\u0C28')||(LA1_0 >= '\u0C2A' && LA1_0 <= '\u0C33')||(LA1_0 >= '\u0C35' && LA1_0 <= '\u0C39')||LA1_0=='\u0C3D'||(LA1_0 >= '\u0C58' && LA1_0 <= '\u0C59')||(LA1_0 >= '\u0C60' && LA1_0 <= '\u0C61')||(LA1_0 >= '\u0C85' && LA1_0 <= '\u0C8C')||(LA1_0 >= '\u0C8E' && LA1_0 <= '\u0C90')||(LA1_0 >= '\u0C92' && LA1_0 <= '\u0CA8')||(LA1_0 >= '\u0CAA' && LA1_0 <= '\u0CB3')||(LA1_0 >= '\u0CB5' && LA1_0 <= '\u0CB9')||LA1_0=='\u0CBD'||LA1_0=='\u0CDE'||(LA1_0 >= '\u0CE0' && LA1_0 <= '\u0CE1')||(LA1_0 >= '\u0CF1' && LA1_0 <= '\u0CF2')||(LA1_0 >= '\u0D05' && LA1_0 <= '\u0D0C')||(LA1_0 >= '\u0D0E' && LA1_0 <= '\u0D10')||(LA1_0 >= '\u0D12' && LA1_0 <= '\u0D3A')||LA1_0=='\u0D3D'||LA1_0=='\u0D4E'||(LA1_0 >= '\u0D60' && LA1_0 <= '\u0D61')||(LA1_0 >= '\u0D7A' && LA1_0 <= '\u0D7F')||(LA1_0 >= '\u0D85' && LA1_0 <= '\u0D96')||(LA1_0 >= '\u0D9A' && LA1_0 <= '\u0DB1')||(LA1_0 >= '\u0DB3' && LA1_0 <= '\u0DBB')||LA1_0=='\u0DBD'||(LA1_0 >= '\u0DC0' && LA1_0 <= '\u0DC6')||(LA1_0 >= '\u0E01' && LA1_0 <= '\u0E30')||(LA1_0 >= '\u0E32' && LA1_0 <= '\u0E33')||(LA1_0 >= '\u0E40' && LA1_0 <= '\u0E45')||(LA1_0 >= '\u0E81' && LA1_0 <= '\u0E82')||LA1_0=='\u0E84'||(LA1_0 >= '\u0E87' && LA1_0 <= '\u0E88')||LA1_0=='\u0E8A'||LA1_0=='\u0E8D'||(LA1_0 >= '\u0E94' && LA1_0 <= '\u0E97')||(LA1_0 >= '\u0E99' && LA1_0 <= '\u0E9F')||(LA1_0 >= '\u0EA1' && LA1_0 <= '\u0EA3')||LA1_0=='\u0EA5'||LA1_0=='\u0EA7'||(LA1_0 >= '\u0EAA' && LA1_0 <= '\u0EAB')||(LA1_0 >= '\u0EAD' && LA1_0 <= '\u0EB0')||(LA1_0 >= '\u0EB2' && LA1_0 <= '\u0EB3')||LA1_0=='\u0EBD'||(LA1_0 >= '\u0EC0' && LA1_0 <= '\u0EC4')||(LA1_0 >= '\u0EDC' && LA1_0 <= '\u0EDF')||LA1_0=='\u0F00'||(LA1_0 >= '\u0F40' && LA1_0 <= '\u0F47')||(LA1_0 >= '\u0F49' && LA1_0 <= '\u0F6C')||(LA1_0 >= '\u0F88' && LA1_0 <= '\u0F8C')||(LA1_0 >= '\u1000' && LA1_0 <= '\u102A')||LA1_0=='\u103F'||(LA1_0 >= '\u1050' && LA1_0 <= '\u1055')||(LA1_0 >= '\u105A' && LA1_0 <= '\u105D')||LA1_0=='\u1061'||(LA1_0 >= '\u1065' && LA1_0 <= '\u1066')||(LA1_0 >= '\u106E' && LA1_0 <= '\u1070')||(LA1_0 >= '\u1075' && LA1_0 <= '\u1081')||LA1_0=='\u108E'||(LA1_0 >= '\u10D0' && LA1_0 <= '\u10FA')||(LA1_0 >= '\u10FD' && LA1_0 <= '\u1248')||(LA1_0 >= '\u124A' && LA1_0 <= '\u124D')||(LA1_0 >= '\u1250' && LA1_0 <= '\u1256')||LA1_0=='\u1258'||(LA1_0 >= '\u125A' && LA1_0 <= '\u125D')||(LA1_0 >= '\u1260' && LA1_0 <= '\u1288')||(LA1_0 >= '\u128A' && LA1_0 <= '\u128D')||(LA1_0 >= '\u1290' && LA1_0 <= '\u12B0')||(LA1_0 >= '\u12B2' && LA1_0 <= '\u12B5')||(LA1_0 >= '\u12B8' && LA1_0 <= '\u12BE')||LA1_0=='\u12C0'||(LA1_0 >= '\u12C2' && LA1_0 <= '\u12C5')||(LA1_0 >= '\u12C8' && LA1_0 <= '\u12D6')||(LA1_0 >= '\u12D8' && LA1_0 <= '\u1310')||(LA1_0 >= '\u1312' && LA1_0 <= '\u1315')||(LA1_0 >= '\u1318' && LA1_0 <= '\u135A')||(LA1_0 >= '\u1380' && LA1_0 <= '\u138F')||(LA1_0 >= '\u13A0' && LA1_0 <= '\u13F4')||(LA1_0 >= '\u1401' && LA1_0 <= '\u166C')||(LA1_0 >= '\u166F' && LA1_0 <= '\u167F')||(LA1_0 >= '\u1681' && LA1_0 <= '\u169A')||(LA1_0 >= '\u16A0' && LA1_0 <= '\u16EA')||(LA1_0 >= '\u1700' && LA1_0 <= '\u170C')||(LA1_0 >= '\u170E' && LA1_0 <= '\u1711')||(LA1_0 >= '\u1720' && LA1_0 <= '\u1731')||(LA1_0 >= '\u1740' && LA1_0 <= '\u1751')||(LA1_0 >= '\u1760' && LA1_0 <= '\u176C')||(LA1_0 >= '\u176E' && LA1_0 <= '\u1770')||(LA1_0 >= '\u1780' && LA1_0 <= '\u17B3')||LA1_0=='\u17DC'||(LA1_0 >= '\u1820' && LA1_0 <= '\u1842')||(LA1_0 >= '\u1844' && LA1_0 <= '\u1877')||(LA1_0 >= '\u1880' && LA1_0 <= '\u18A8')||LA1_0=='\u18AA'||(LA1_0 >= '\u18B0' && LA1_0 <= '\u18F5')||(LA1_0 >= '\u1900' && LA1_0 <= '\u191C')||(LA1_0 >= '\u1950' && LA1_0 <= '\u196D')||(LA1_0 >= '\u1970' && LA1_0 <= '\u1974')||(LA1_0 >= '\u1980' && LA1_0 <= '\u19AB')||(LA1_0 >= '\u19C1' && LA1_0 <= '\u19C7')||(LA1_0 >= '\u1A00' && LA1_0 <= '\u1A16')||(LA1_0 >= '\u1A20' && LA1_0 <= '\u1A54')||(LA1_0 >= '\u1B05' && LA1_0 <= '\u1B33')||(LA1_0 >= '\u1B45' && LA1_0 <= '\u1B4B')||(LA1_0 >= '\u1B83' && LA1_0 <= '\u1BA0')||(LA1_0 >= '\u1BAE' && LA1_0 <= '\u1BAF')||(LA1_0 >= '\u1BBA' && LA1_0 <= '\u1BE5')||(LA1_0 >= '\u1C00' && LA1_0 <= '\u1C23')||(LA1_0 >= '\u1C4D' && LA1_0 <= '\u1C4F')||(LA1_0 >= '\u1C5A' && LA1_0 <= '\u1C77')||(LA1_0 >= '\u1CE9' && LA1_0 <= '\u1CEC')||(LA1_0 >= '\u1CEE' && LA1_0 <= '\u1CF1')||(LA1_0 >= '\u1CF5' && LA1_0 <= '\u1CF6')||(LA1_0 >= '\u2135' && LA1_0 <= '\u2138')||(LA1_0 >= '\u2D30' && LA1_0 <= '\u2D67')||(LA1_0 >= '\u2D80' && LA1_0 <= '\u2D96')||(LA1_0 >= '\u2DA0' && LA1_0 <= '\u2DA6')||(LA1_0 >= '\u2DA8' && LA1_0 <= '\u2DAE')||(LA1_0 >= '\u2DB0' && LA1_0 <= '\u2DB6')||(LA1_0 >= '\u2DB8' && LA1_0 <= '\u2DBE')||(LA1_0 >= '\u2DC0' && LA1_0 <= '\u2DC6')||(LA1_0 >= '\u2DC8' && LA1_0 <= '\u2DCE')||(LA1_0 >= '\u2DD0' && LA1_0 <= '\u2DD6')||(LA1_0 >= '\u2DD8' && LA1_0 <= '\u2DDE')||LA1_0=='\u3006'||LA1_0=='\u303C'||(LA1_0 >= '\u3041' && LA1_0 <= '\u3096')||LA1_0=='\u309F'||(LA1_0 >= '\u30A1' && LA1_0 <= '\u30FA')||LA1_0=='\u30FF'||(LA1_0 >= '\u3105' && LA1_0 <= '\u312D')||(LA1_0 >= '\u3131' && LA1_0 <= '\u318E')||(LA1_0 >= '\u31A0' && LA1_0 <= '\u31BA')||(LA1_0 >= '\u31F0' && LA1_0 <= '\u31FF')||LA1_0=='\u3400'||LA1_0=='\u4DB5'||LA1_0=='\u4E00'||LA1_0=='\u9FCC'||(LA1_0 >= '\uA000' && LA1_0 <= '\uA014')||(LA1_0 >= '\uA016' && LA1_0 <= '\uA48C')||(LA1_0 >= '\uA4D0' && LA1_0 <= '\uA4F7')||(LA1_0 >= '\uA500' && LA1_0 <= '\uA60B')||(LA1_0 >= '\uA610' && LA1_0 <= '\uA61F')||(LA1_0 >= '\uA62A' && LA1_0 <= '\uA62B')||LA1_0=='\uA66E'||(LA1_0 >= '\uA6A0' && LA1_0 <= '\uA6E5')||(LA1_0 >= '\uA7FB' && LA1_0 <= '\uA801')||(LA1_0 >= '\uA803' && LA1_0 <= '\uA805')||(LA1_0 >= '\uA807' && LA1_0 <= '\uA80A')||(LA1_0 >= '\uA80C' && LA1_0 <= '\uA822')||(LA1_0 >= '\uA840' && LA1_0 <= '\uA873')||(LA1_0 >= '\uA882' && LA1_0 <= '\uA8B3')||(LA1_0 >= '\uA8F2' && LA1_0 <= '\uA8F7')||LA1_0=='\uA8FB'||(LA1_0 >= '\uA90A' && LA1_0 <= '\uA925')||(LA1_0 >= '\uA930' && LA1_0 <= '\uA946')||(LA1_0 >= '\uA960' && LA1_0 <= '\uA97C')||(LA1_0 >= '\uA984' && LA1_0 <= '\uA9B2')||(LA1_0 >= '\uAA00' && LA1_0 <= '\uAA28')||(LA1_0 >= '\uAA40' && LA1_0 <= '\uAA42')||(LA1_0 >= '\uAA44' && LA1_0 <= '\uAA4B')||(LA1_0 >= '\uAA60' && LA1_0 <= '\uAA6F')||(LA1_0 >= '\uAA71' && LA1_0 <= '\uAA76')||LA1_0=='\uAA7A'||(LA1_0 >= '\uAA80' && LA1_0 <= '\uAAAF')||LA1_0=='\uAAB1'||(LA1_0 >= '\uAAB5' && LA1_0 <= '\uAAB6')||(LA1_0 >= '\uAAB9' && LA1_0 <= '\uAABD')||LA1_0=='\uAAC0'||LA1_0=='\uAAC2'||(LA1_0 >= '\uAADB' && LA1_0 <= '\uAADC')||(LA1_0 >= '\uAAE0' && LA1_0 <= '\uAAEA')||LA1_0=='\uAAF2'||(LA1_0 >= '\uAB01' && LA1_0 <= '\uAB06')||(LA1_0 >= '\uAB09' && LA1_0 <= '\uAB0E')||(LA1_0 >= '\uAB11' && LA1_0 <= '\uAB16')||(LA1_0 >= '\uAB20' && LA1_0 <= '\uAB26')||(LA1_0 >= '\uAB28' && LA1_0 <= '\uAB2E')||(LA1_0 >= '\uABC0' && LA1_0 <= '\uABE2')||LA1_0=='\uAC00'||LA1_0=='\uD7A3'||(LA1_0 >= '\uD7B0' && LA1_0 <= '\uD7C6')||(LA1_0 >= '\uD7CB' && LA1_0 <= '\uD7FB')||(LA1_0 >= '\uF900' && LA1_0 <= '\uFA6D')||(LA1_0 >= '\uFA70' && LA1_0 <= '\uFAD9')||LA1_0=='\uFB1D'||(LA1_0 >= '\uFB1F' && LA1_0 <= '\uFB28')||(LA1_0 >= '\uFB2A' && LA1_0 <= '\uFB36')||(LA1_0 >= '\uFB38' && LA1_0 <= '\uFB3C')||LA1_0=='\uFB3E'||(LA1_0 >= '\uFB40' && LA1_0 <= '\uFB41')||(LA1_0 >= '\uFB43' && LA1_0 <= '\uFB44')||(LA1_0 >= '\uFB46' && LA1_0 <= '\uFBB1')||(LA1_0 >= '\uFBD3' && LA1_0 <= '\uFD3D')||(LA1_0 >= '\uFD50' && LA1_0 <= '\uFD8F')||(LA1_0 >= '\uFD92' && LA1_0 <= '\uFDC7')||(LA1_0 >= '\uFDF0' && LA1_0 <= '\uFDFB')||(LA1_0 >= '\uFE70' && LA1_0 <= '\uFE74')||(LA1_0 >= '\uFE76' && LA1_0 <= '\uFEFC')||(LA1_0 >= '\uFF66' && LA1_0 <= '\uFF6F')||(LA1_0 >= '\uFF71' && LA1_0 <= '\uFF9D')||(LA1_0 >= '\uFFA0' && LA1_0 <= '\uFFBE')||(LA1_0 >= '\uFFC2' && LA1_0 <= '\uFFC7')||(LA1_0 >= '\uFFCA' && LA1_0 <= '\uFFCF')||(LA1_0 >= '\uFFD2' && LA1_0 <= '\uFFD7')||(LA1_0 >= '\uFFDA' && LA1_0 <= '\uFFDC')) ) {
            alt1=7;
        }
        else if ( (LA1_0=='\u01C5'||LA1_0=='\u01C8'||LA1_0=='\u01CB'||LA1_0=='\u01F2'||(LA1_0 >= '\u1F88' && LA1_0 <= '\u1F8F')||(LA1_0 >= '\u1F98' && LA1_0 <= '\u1F9F')||(LA1_0 >= '\u1FA8' && LA1_0 <= '\u1FAF')||LA1_0=='\u1FBC'||LA1_0=='\u1FCC'||LA1_0=='\u1FFC') ) {
            alt1=8;
        }
        else if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= '\u00C0' && LA1_0 <= '\u00D6')||(LA1_0 >= '\u00D8' && LA1_0 <= '\u00DE')||LA1_0=='\u0100'||LA1_0=='\u0102'||LA1_0=='\u0104'||LA1_0=='\u0106'||LA1_0=='\u0108'||LA1_0=='\u010A'||LA1_0=='\u010C'||LA1_0=='\u010E'||LA1_0=='\u0110'||LA1_0=='\u0112'||LA1_0=='\u0114'||LA1_0=='\u0116'||LA1_0=='\u0118'||LA1_0=='\u011A'||LA1_0=='\u011C'||LA1_0=='\u011E'||LA1_0=='\u0120'||LA1_0=='\u0122'||LA1_0=='\u0124'||LA1_0=='\u0126'||LA1_0=='\u0128'||LA1_0=='\u012A'||LA1_0=='\u012C'||LA1_0=='\u012E'||LA1_0=='\u0130'||LA1_0=='\u0132'||LA1_0=='\u0134'||LA1_0=='\u0136'||LA1_0=='\u0139'||LA1_0=='\u013B'||LA1_0=='\u013D'||LA1_0=='\u013F'||LA1_0=='\u0141'||LA1_0=='\u0143'||LA1_0=='\u0145'||LA1_0=='\u0147'||LA1_0=='\u014A'||LA1_0=='\u014C'||LA1_0=='\u014E'||LA1_0=='\u0150'||LA1_0=='\u0152'||LA1_0=='\u0154'||LA1_0=='\u0156'||LA1_0=='\u0158'||LA1_0=='\u015A'||LA1_0=='\u015C'||LA1_0=='\u015E'||LA1_0=='\u0160'||LA1_0=='\u0162'||LA1_0=='\u0164'||LA1_0=='\u0166'||LA1_0=='\u0168'||LA1_0=='\u016A'||LA1_0=='\u016C'||LA1_0=='\u016E'||LA1_0=='\u0170'||LA1_0=='\u0172'||LA1_0=='\u0174'||LA1_0=='\u0176'||(LA1_0 >= '\u0178' && LA1_0 <= '\u0179')||LA1_0=='\u017B'||LA1_0=='\u017D'||(LA1_0 >= '\u0181' && LA1_0 <= '\u0182')||LA1_0=='\u0184'||(LA1_0 >= '\u0186' && LA1_0 <= '\u0187')||(LA1_0 >= '\u0189' && LA1_0 <= '\u018B')||(LA1_0 >= '\u018E' && LA1_0 <= '\u0191')||(LA1_0 >= '\u0193' && LA1_0 <= '\u0194')||(LA1_0 >= '\u0196' && LA1_0 <= '\u0198')||(LA1_0 >= '\u019C' && LA1_0 <= '\u019D')||(LA1_0 >= '\u019F' && LA1_0 <= '\u01A0')||LA1_0=='\u01A2'||LA1_0=='\u01A4'||(LA1_0 >= '\u01A6' && LA1_0 <= '\u01A7')||LA1_0=='\u01A9'||LA1_0=='\u01AC'||(LA1_0 >= '\u01AE' && LA1_0 <= '\u01AF')||(LA1_0 >= '\u01B1' && LA1_0 <= '\u01B3')||LA1_0=='\u01B5'||(LA1_0 >= '\u01B7' && LA1_0 <= '\u01B8')||LA1_0=='\u01BC'||LA1_0=='\u01C4'||LA1_0=='\u01C7'||LA1_0=='\u01CA'||LA1_0=='\u01CD'||LA1_0=='\u01CF'||LA1_0=='\u01D1'||LA1_0=='\u01D3'||LA1_0=='\u01D5'||LA1_0=='\u01D7'||LA1_0=='\u01D9'||LA1_0=='\u01DB'||LA1_0=='\u01DE'||LA1_0=='\u01E0'||LA1_0=='\u01E2'||LA1_0=='\u01E4'||LA1_0=='\u01E6'||LA1_0=='\u01E8'||LA1_0=='\u01EA'||LA1_0=='\u01EC'||LA1_0=='\u01EE'||LA1_0=='\u01F1'||LA1_0=='\u01F4'||(LA1_0 >= '\u01F6' && LA1_0 <= '\u01F8')||LA1_0=='\u01FA'||LA1_0=='\u01FC'||LA1_0=='\u01FE'||LA1_0=='\u0200'||LA1_0=='\u0202'||LA1_0=='\u0204'||LA1_0=='\u0206'||LA1_0=='\u0208'||LA1_0=='\u020A'||LA1_0=='\u020C'||LA1_0=='\u020E'||LA1_0=='\u0210'||LA1_0=='\u0212'||LA1_0=='\u0214'||LA1_0=='\u0216'||LA1_0=='\u0218'||LA1_0=='\u021A'||LA1_0=='\u021C'||LA1_0=='\u021E'||LA1_0=='\u0220'||LA1_0=='\u0222'||LA1_0=='\u0224'||LA1_0=='\u0226'||LA1_0=='\u0228'||LA1_0=='\u022A'||LA1_0=='\u022C'||LA1_0=='\u022E'||LA1_0=='\u0230'||LA1_0=='\u0232'||(LA1_0 >= '\u023A' && LA1_0 <= '\u023B')||(LA1_0 >= '\u023D' && LA1_0 <= '\u023E')||LA1_0=='\u0241'||(LA1_0 >= '\u0243' && LA1_0 <= '\u0246')||LA1_0=='\u0248'||LA1_0=='\u024A'||LA1_0=='\u024C'||LA1_0=='\u024E'||LA1_0=='\u0370'||LA1_0=='\u0372'||LA1_0=='\u0376'||LA1_0=='\u0386'||(LA1_0 >= '\u0388' && LA1_0 <= '\u038A')||LA1_0=='\u038C'||(LA1_0 >= '\u038E' && LA1_0 <= '\u038F')||(LA1_0 >= '\u0391' && LA1_0 <= '\u03A1')||(LA1_0 >= '\u03A3' && LA1_0 <= '\u03AB')||LA1_0=='\u03CF'||(LA1_0 >= '\u03D2' && LA1_0 <= '\u03D4')||LA1_0=='\u03D8'||LA1_0=='\u03DA'||LA1_0=='\u03DC'||LA1_0=='\u03DE'||LA1_0=='\u03E0'||LA1_0=='\u03E2'||LA1_0=='\u03E4'||LA1_0=='\u03E6'||LA1_0=='\u03E8'||LA1_0=='\u03EA'||LA1_0=='\u03EC'||LA1_0=='\u03EE'||LA1_0=='\u03F4'||LA1_0=='\u03F7'||(LA1_0 >= '\u03F9' && LA1_0 <= '\u03FA')||(LA1_0 >= '\u03FD' && LA1_0 <= '\u042F')||LA1_0=='\u0460'||LA1_0=='\u0462'||LA1_0=='\u0464'||LA1_0=='\u0466'||LA1_0=='\u0468'||LA1_0=='\u046A'||LA1_0=='\u046C'||LA1_0=='\u046E'||LA1_0=='\u0470'||LA1_0=='\u0472'||LA1_0=='\u0474'||LA1_0=='\u0476'||LA1_0=='\u0478'||LA1_0=='\u047A'||LA1_0=='\u047C'||LA1_0=='\u047E'||LA1_0=='\u0480'||LA1_0=='\u048A'||LA1_0=='\u048C'||LA1_0=='\u048E'||LA1_0=='\u0490'||LA1_0=='\u0492'||LA1_0=='\u0494'||LA1_0=='\u0496'||LA1_0=='\u0498'||LA1_0=='\u049A'||LA1_0=='\u049C'||LA1_0=='\u049E'||LA1_0=='\u04A0'||LA1_0=='\u04A2'||LA1_0=='\u04A4'||LA1_0=='\u04A6'||LA1_0=='\u04A8'||LA1_0=='\u04AA'||LA1_0=='\u04AC'||LA1_0=='\u04AE'||LA1_0=='\u04B0'||LA1_0=='\u04B2'||LA1_0=='\u04B4'||LA1_0=='\u04B6'||LA1_0=='\u04B8'||LA1_0=='\u04BA'||LA1_0=='\u04BC'||LA1_0=='\u04BE'||(LA1_0 >= '\u04C0' && LA1_0 <= '\u04C1')||LA1_0=='\u04C3'||LA1_0=='\u04C5'||LA1_0=='\u04C7'||LA1_0=='\u04C9'||LA1_0=='\u04CB'||LA1_0=='\u04CD'||LA1_0=='\u04D0'||LA1_0=='\u04D2'||LA1_0=='\u04D4'||LA1_0=='\u04D6'||LA1_0=='\u04D8'||LA1_0=='\u04DA'||LA1_0=='\u04DC'||LA1_0=='\u04DE'||LA1_0=='\u04E0'||LA1_0=='\u04E2'||LA1_0=='\u04E4'||LA1_0=='\u04E6'||LA1_0=='\u04E8'||LA1_0=='\u04EA'||LA1_0=='\u04EC'||LA1_0=='\u04EE'||LA1_0=='\u04F0'||LA1_0=='\u04F2'||LA1_0=='\u04F4'||LA1_0=='\u04F6'||LA1_0=='\u04F8'||LA1_0=='\u04FA'||LA1_0=='\u04FC'||LA1_0=='\u04FE'||LA1_0=='\u0500'||LA1_0=='\u0502'||LA1_0=='\u0504'||LA1_0=='\u0506'||LA1_0=='\u0508'||LA1_0=='\u050A'||LA1_0=='\u050C'||LA1_0=='\u050E'||LA1_0=='\u0510'||LA1_0=='\u0512'||LA1_0=='\u0514'||LA1_0=='\u0516'||LA1_0=='\u0518'||LA1_0=='\u051A'||LA1_0=='\u051C'||LA1_0=='\u051E'||LA1_0=='\u0520'||LA1_0=='\u0522'||LA1_0=='\u0524'||LA1_0=='\u0526'||(LA1_0 >= '\u0531' && LA1_0 <= '\u0556')||(LA1_0 >= '\u10A0' && LA1_0 <= '\u10C5')||LA1_0=='\u10C7'||LA1_0=='\u10CD'||LA1_0=='\u1E00'||LA1_0=='\u1E02'||LA1_0=='\u1E04'||LA1_0=='\u1E06'||LA1_0=='\u1E08'||LA1_0=='\u1E0A'||LA1_0=='\u1E0C'||LA1_0=='\u1E0E'||LA1_0=='\u1E10'||LA1_0=='\u1E12'||LA1_0=='\u1E14'||LA1_0=='\u1E16'||LA1_0=='\u1E18'||LA1_0=='\u1E1A'||LA1_0=='\u1E1C'||LA1_0=='\u1E1E'||LA1_0=='\u1E20'||LA1_0=='\u1E22'||LA1_0=='\u1E24'||LA1_0=='\u1E26'||LA1_0=='\u1E28'||LA1_0=='\u1E2A'||LA1_0=='\u1E2C'||LA1_0=='\u1E2E'||LA1_0=='\u1E30'||LA1_0=='\u1E32'||LA1_0=='\u1E34'||LA1_0=='\u1E36'||LA1_0=='\u1E38'||LA1_0=='\u1E3A'||LA1_0=='\u1E3C'||LA1_0=='\u1E3E'||LA1_0=='\u1E40'||LA1_0=='\u1E42'||LA1_0=='\u1E44'||LA1_0=='\u1E46'||LA1_0=='\u1E48'||LA1_0=='\u1E4A'||LA1_0=='\u1E4C'||LA1_0=='\u1E4E'||LA1_0=='\u1E50'||LA1_0=='\u1E52'||LA1_0=='\u1E54'||LA1_0=='\u1E56'||LA1_0=='\u1E58'||LA1_0=='\u1E5A'||LA1_0=='\u1E5C'||LA1_0=='\u1E5E'||LA1_0=='\u1E60'||LA1_0=='\u1E62'||LA1_0=='\u1E64'||LA1_0=='\u1E66'||LA1_0=='\u1E68'||LA1_0=='\u1E6A'||LA1_0=='\u1E6C'||LA1_0=='\u1E6E'||LA1_0=='\u1E70'||LA1_0=='\u1E72'||LA1_0=='\u1E74'||LA1_0=='\u1E76'||LA1_0=='\u1E78'||LA1_0=='\u1E7A'||LA1_0=='\u1E7C'||LA1_0=='\u1E7E'||LA1_0=='\u1E80'||LA1_0=='\u1E82'||LA1_0=='\u1E84'||LA1_0=='\u1E86'||LA1_0=='\u1E88'||LA1_0=='\u1E8A'||LA1_0=='\u1E8C'||LA1_0=='\u1E8E'||LA1_0=='\u1E90'||LA1_0=='\u1E92'||LA1_0=='\u1E94'||LA1_0=='\u1E9E'||LA1_0=='\u1EA0'||LA1_0=='\u1EA2'||LA1_0=='\u1EA4'||LA1_0=='\u1EA6'||LA1_0=='\u1EA8'||LA1_0=='\u1EAA'||LA1_0=='\u1EAC'||LA1_0=='\u1EAE'||LA1_0=='\u1EB0'||LA1_0=='\u1EB2'||LA1_0=='\u1EB4'||LA1_0=='\u1EB6'||LA1_0=='\u1EB8'||LA1_0=='\u1EBA'||LA1_0=='\u1EBC'||LA1_0=='\u1EBE'||LA1_0=='\u1EC0'||LA1_0=='\u1EC2'||LA1_0=='\u1EC4'||LA1_0=='\u1EC6'||LA1_0=='\u1EC8'||LA1_0=='\u1ECA'||LA1_0=='\u1ECC'||LA1_0=='\u1ECE'||LA1_0=='\u1ED0'||LA1_0=='\u1ED2'||LA1_0=='\u1ED4'||LA1_0=='\u1ED6'||LA1_0=='\u1ED8'||LA1_0=='\u1EDA'||LA1_0=='\u1EDC'||LA1_0=='\u1EDE'||LA1_0=='\u1EE0'||LA1_0=='\u1EE2'||LA1_0=='\u1EE4'||LA1_0=='\u1EE6'||LA1_0=='\u1EE8'||LA1_0=='\u1EEA'||LA1_0=='\u1EEC'||LA1_0=='\u1EEE'||LA1_0=='\u1EF0'||LA1_0=='\u1EF2'||LA1_0=='\u1EF4'||LA1_0=='\u1EF6'||LA1_0=='\u1EF8'||LA1_0=='\u1EFA'||LA1_0=='\u1EFC'||LA1_0=='\u1EFE'||(LA1_0 >= '\u1F08' && LA1_0 <= '\u1F0F')||(LA1_0 >= '\u1F18' && LA1_0 <= '\u1F1D')||(LA1_0 >= '\u1F28' && LA1_0 <= '\u1F2F')||(LA1_0 >= '\u1F38' && LA1_0 <= '\u1F3F')||(LA1_0 >= '\u1F48' && LA1_0 <= '\u1F4D')||LA1_0=='\u1F59'||LA1_0=='\u1F5B'||LA1_0=='\u1F5D'||LA1_0=='\u1F5F'||(LA1_0 >= '\u1F68' && LA1_0 <= '\u1F6F')||(LA1_0 >= '\u1FB8' && LA1_0 <= '\u1FBB')||(LA1_0 >= '\u1FC8' && LA1_0 <= '\u1FCB')||(LA1_0 >= '\u1FD8' && LA1_0 <= '\u1FDB')||(LA1_0 >= '\u1FE8' && LA1_0 <= '\u1FEC')||(LA1_0 >= '\u1FF8' && LA1_0 <= '\u1FFB')||LA1_0=='\u2102'||LA1_0=='\u2107'||(LA1_0 >= '\u210B' && LA1_0 <= '\u210D')||(LA1_0 >= '\u2110' && LA1_0 <= '\u2112')||LA1_0=='\u2115'||(LA1_0 >= '\u2119' && LA1_0 <= '\u211D')||LA1_0=='\u2124'||LA1_0=='\u2126'||LA1_0=='\u2128'||(LA1_0 >= '\u212A' && LA1_0 <= '\u212D')||(LA1_0 >= '\u2130' && LA1_0 <= '\u2133')||(LA1_0 >= '\u213E' && LA1_0 <= '\u213F')||LA1_0=='\u2145'||LA1_0=='\u2183'||(LA1_0 >= '\u2C00' && LA1_0 <= '\u2C2E')||LA1_0=='\u2C60'||(LA1_0 >= '\u2C62' && LA1_0 <= '\u2C64')||LA1_0=='\u2C67'||LA1_0=='\u2C69'||LA1_0=='\u2C6B'||(LA1_0 >= '\u2C6D' && LA1_0 <= '\u2C70')||LA1_0=='\u2C72'||LA1_0=='\u2C75'||(LA1_0 >= '\u2C7E' && LA1_0 <= '\u2C80')||LA1_0=='\u2C82'||LA1_0=='\u2C84'||LA1_0=='\u2C86'||LA1_0=='\u2C88'||LA1_0=='\u2C8A'||LA1_0=='\u2C8C'||LA1_0=='\u2C8E'||LA1_0=='\u2C90'||LA1_0=='\u2C92'||LA1_0=='\u2C94'||LA1_0=='\u2C96'||LA1_0=='\u2C98'||LA1_0=='\u2C9A'||LA1_0=='\u2C9C'||LA1_0=='\u2C9E'||LA1_0=='\u2CA0'||LA1_0=='\u2CA2'||LA1_0=='\u2CA4'||LA1_0=='\u2CA6'||LA1_0=='\u2CA8'||LA1_0=='\u2CAA'||LA1_0=='\u2CAC'||LA1_0=='\u2CAE'||LA1_0=='\u2CB0'||LA1_0=='\u2CB2'||LA1_0=='\u2CB4'||LA1_0=='\u2CB6'||LA1_0=='\u2CB8'||LA1_0=='\u2CBA'||LA1_0=='\u2CBC'||LA1_0=='\u2CBE'||LA1_0=='\u2CC0'||LA1_0=='\u2CC2'||LA1_0=='\u2CC4'||LA1_0=='\u2CC6'||LA1_0=='\u2CC8'||LA1_0=='\u2CCA'||LA1_0=='\u2CCC'||LA1_0=='\u2CCE'||LA1_0=='\u2CD0'||LA1_0=='\u2CD2'||LA1_0=='\u2CD4'||LA1_0=='\u2CD6'||LA1_0=='\u2CD8'||LA1_0=='\u2CDA'||LA1_0=='\u2CDC'||LA1_0=='\u2CDE'||LA1_0=='\u2CE0'||LA1_0=='\u2CE2'||LA1_0=='\u2CEB'||LA1_0=='\u2CED'||LA1_0=='\u2CF2'||LA1_0=='\uA640'||LA1_0=='\uA642'||LA1_0=='\uA644'||LA1_0=='\uA646'||LA1_0=='\uA648'||LA1_0=='\uA64A'||LA1_0=='\uA64C'||LA1_0=='\uA64E'||LA1_0=='\uA650'||LA1_0=='\uA652'||LA1_0=='\uA654'||LA1_0=='\uA656'||LA1_0=='\uA658'||LA1_0=='\uA65A'||LA1_0=='\uA65C'||LA1_0=='\uA65E'||LA1_0=='\uA660'||LA1_0=='\uA662'||LA1_0=='\uA664'||LA1_0=='\uA666'||LA1_0=='\uA668'||LA1_0=='\uA66A'||LA1_0=='\uA66C'||LA1_0=='\uA680'||LA1_0=='\uA682'||LA1_0=='\uA684'||LA1_0=='\uA686'||LA1_0=='\uA688'||LA1_0=='\uA68A'||LA1_0=='\uA68C'||LA1_0=='\uA68E'||LA1_0=='\uA690'||LA1_0=='\uA692'||LA1_0=='\uA694'||LA1_0=='\uA696'||LA1_0=='\uA722'||LA1_0=='\uA724'||LA1_0=='\uA726'||LA1_0=='\uA728'||LA1_0=='\uA72A'||LA1_0=='\uA72C'||LA1_0=='\uA72E'||LA1_0=='\uA732'||LA1_0=='\uA734'||LA1_0=='\uA736'||LA1_0=='\uA738'||LA1_0=='\uA73A'||LA1_0=='\uA73C'||LA1_0=='\uA73E'||LA1_0=='\uA740'||LA1_0=='\uA742'||LA1_0=='\uA744'||LA1_0=='\uA746'||LA1_0=='\uA748'||LA1_0=='\uA74A'||LA1_0=='\uA74C'||LA1_0=='\uA74E'||LA1_0=='\uA750'||LA1_0=='\uA752'||LA1_0=='\uA754'||LA1_0=='\uA756'||LA1_0=='\uA758'||LA1_0=='\uA75A'||LA1_0=='\uA75C'||LA1_0=='\uA75E'||LA1_0=='\uA760'||LA1_0=='\uA762'||LA1_0=='\uA764'||LA1_0=='\uA766'||LA1_0=='\uA768'||LA1_0=='\uA76A'||LA1_0=='\uA76C'||LA1_0=='\uA76E'||LA1_0=='\uA779'||LA1_0=='\uA77B'||(LA1_0 >= '\uA77D' && LA1_0 <= '\uA77E')||LA1_0=='\uA780'||LA1_0=='\uA782'||LA1_0=='\uA784'||LA1_0=='\uA786'||LA1_0=='\uA78B'||LA1_0=='\uA78D'||LA1_0=='\uA790'||LA1_0=='\uA792'||LA1_0=='\uA7A0'||LA1_0=='\uA7A2'||LA1_0=='\uA7A4'||LA1_0=='\uA7A6'||LA1_0=='\uA7A8'||LA1_0=='\uA7AA'||(LA1_0 >= '\uFF21' && LA1_0 <= '\uFF3A')) ) {
            alt1=9;
        }
        else if ( (LA1_0=='\u0903'||LA1_0=='\u093B'||(LA1_0 >= '\u093E' && LA1_0 <= '\u0940')||(LA1_0 >= '\u0949' && LA1_0 <= '\u094C')||(LA1_0 >= '\u094E' && LA1_0 <= '\u094F')||(LA1_0 >= '\u0982' && LA1_0 <= '\u0983')||(LA1_0 >= '\u09BE' && LA1_0 <= '\u09C0')||(LA1_0 >= '\u09C7' && LA1_0 <= '\u09C8')||(LA1_0 >= '\u09CB' && LA1_0 <= '\u09CC')||LA1_0=='\u09D7'||LA1_0=='\u0A03'||(LA1_0 >= '\u0A3E' && LA1_0 <= '\u0A40')||LA1_0=='\u0A83'||(LA1_0 >= '\u0ABE' && LA1_0 <= '\u0AC0')||LA1_0=='\u0AC9'||(LA1_0 >= '\u0ACB' && LA1_0 <= '\u0ACC')||(LA1_0 >= '\u0B02' && LA1_0 <= '\u0B03')||LA1_0=='\u0B3E'||LA1_0=='\u0B40'||(LA1_0 >= '\u0B47' && LA1_0 <= '\u0B48')||(LA1_0 >= '\u0B4B' && LA1_0 <= '\u0B4C')||LA1_0=='\u0B57'||(LA1_0 >= '\u0BBE' && LA1_0 <= '\u0BBF')||(LA1_0 >= '\u0BC1' && LA1_0 <= '\u0BC2')||(LA1_0 >= '\u0BC6' && LA1_0 <= '\u0BC8')||(LA1_0 >= '\u0BCA' && LA1_0 <= '\u0BCC')||LA1_0=='\u0BD7'||(LA1_0 >= '\u0C01' && LA1_0 <= '\u0C03')||(LA1_0 >= '\u0C41' && LA1_0 <= '\u0C44')||(LA1_0 >= '\u0C82' && LA1_0 <= '\u0C83')||LA1_0=='\u0CBE'||(LA1_0 >= '\u0CC0' && LA1_0 <= '\u0CC4')||(LA1_0 >= '\u0CC7' && LA1_0 <= '\u0CC8')||(LA1_0 >= '\u0CCA' && LA1_0 <= '\u0CCB')||(LA1_0 >= '\u0CD5' && LA1_0 <= '\u0CD6')||(LA1_0 >= '\u0D02' && LA1_0 <= '\u0D03')||(LA1_0 >= '\u0D3E' && LA1_0 <= '\u0D40')||(LA1_0 >= '\u0D46' && LA1_0 <= '\u0D48')||(LA1_0 >= '\u0D4A' && LA1_0 <= '\u0D4C')||LA1_0=='\u0D57'||(LA1_0 >= '\u0D82' && LA1_0 <= '\u0D83')||(LA1_0 >= '\u0DCF' && LA1_0 <= '\u0DD1')||(LA1_0 >= '\u0DD8' && LA1_0 <= '\u0DDF')||(LA1_0 >= '\u0DF2' && LA1_0 <= '\u0DF3')||(LA1_0 >= '\u0F3E' && LA1_0 <= '\u0F3F')||LA1_0=='\u0F7F'||(LA1_0 >= '\u102B' && LA1_0 <= '\u102C')||LA1_0=='\u1031'||LA1_0=='\u1038'||(LA1_0 >= '\u103B' && LA1_0 <= '\u103C')||(LA1_0 >= '\u1056' && LA1_0 <= '\u1057')||(LA1_0 >= '\u1062' && LA1_0 <= '\u1064')||(LA1_0 >= '\u1067' && LA1_0 <= '\u106D')||(LA1_0 >= '\u1083' && LA1_0 <= '\u1084')||(LA1_0 >= '\u1087' && LA1_0 <= '\u108C')||LA1_0=='\u108F'||(LA1_0 >= '\u109A' && LA1_0 <= '\u109C')||LA1_0=='\u17B6'||(LA1_0 >= '\u17BE' && LA1_0 <= '\u17C5')||(LA1_0 >= '\u17C7' && LA1_0 <= '\u17C8')||(LA1_0 >= '\u1923' && LA1_0 <= '\u1926')||(LA1_0 >= '\u1929' && LA1_0 <= '\u192B')||(LA1_0 >= '\u1930' && LA1_0 <= '\u1931')||(LA1_0 >= '\u1933' && LA1_0 <= '\u1938')||(LA1_0 >= '\u19B0' && LA1_0 <= '\u19C0')||(LA1_0 >= '\u19C8' && LA1_0 <= '\u19C9')||(LA1_0 >= '\u1A19' && LA1_0 <= '\u1A1B')||LA1_0=='\u1A55'||LA1_0=='\u1A57'||LA1_0=='\u1A61'||(LA1_0 >= '\u1A63' && LA1_0 <= '\u1A64')||(LA1_0 >= '\u1A6D' && LA1_0 <= '\u1A72')||LA1_0=='\u1B04'||LA1_0=='\u1B35'||LA1_0=='\u1B3B'||(LA1_0 >= '\u1B3D' && LA1_0 <= '\u1B41')||(LA1_0 >= '\u1B43' && LA1_0 <= '\u1B44')||LA1_0=='\u1B82'||LA1_0=='\u1BA1'||(LA1_0 >= '\u1BA6' && LA1_0 <= '\u1BA7')||LA1_0=='\u1BAA'||(LA1_0 >= '\u1BAC' && LA1_0 <= '\u1BAD')||LA1_0=='\u1BE7'||(LA1_0 >= '\u1BEA' && LA1_0 <= '\u1BEC')||LA1_0=='\u1BEE'||(LA1_0 >= '\u1BF2' && LA1_0 <= '\u1BF3')||(LA1_0 >= '\u1C24' && LA1_0 <= '\u1C2B')||(LA1_0 >= '\u1C34' && LA1_0 <= '\u1C35')||LA1_0=='\u1CE1'||(LA1_0 >= '\u1CF2' && LA1_0 <= '\u1CF3')||(LA1_0 >= '\u302E' && LA1_0 <= '\u302F')||(LA1_0 >= '\uA823' && LA1_0 <= '\uA824')||LA1_0=='\uA827'||(LA1_0 >= '\uA880' && LA1_0 <= '\uA881')||(LA1_0 >= '\uA8B4' && LA1_0 <= '\uA8C3')||(LA1_0 >= '\uA952' && LA1_0 <= '\uA953')||LA1_0=='\uA983'||(LA1_0 >= '\uA9B4' && LA1_0 <= '\uA9B5')||(LA1_0 >= '\uA9BA' && LA1_0 <= '\uA9BB')||(LA1_0 >= '\uA9BD' && LA1_0 <= '\uA9C0')||(LA1_0 >= '\uAA2F' && LA1_0 <= '\uAA30')||(LA1_0 >= '\uAA33' && LA1_0 <= '\uAA34')||LA1_0=='\uAA4D'||LA1_0=='\uAA7B'||LA1_0=='\uAAEB'||(LA1_0 >= '\uAAEE' && LA1_0 <= '\uAAEF')||LA1_0=='\uAAF5'||(LA1_0 >= '\uABE3' && LA1_0 <= '\uABE4')||(LA1_0 >= '\uABE6' && LA1_0 <= '\uABE7')||(LA1_0 >= '\uABE9' && LA1_0 <= '\uABEA')||LA1_0=='\uABEC') ) {
            alt1=10;
        }
        else if ( ((LA1_0 >= '\u0488' && LA1_0 <= '\u0489')||(LA1_0 >= '\u20DD' && LA1_0 <= '\u20E0')||(LA1_0 >= '\u20E2' && LA1_0 <= '\u20E4')||(LA1_0 >= '\uA670' && LA1_0 <= '\uA672')) ) {
            alt1=11;
        }
        else if ( ((LA1_0 >= '\u0300' && LA1_0 <= '\u036F')||(LA1_0 >= '\u0483' && LA1_0 <= '\u0487')||(LA1_0 >= '\u0591' && LA1_0 <= '\u05BD')||LA1_0=='\u05BF'||(LA1_0 >= '\u05C1' && LA1_0 <= '\u05C2')||(LA1_0 >= '\u05C4' && LA1_0 <= '\u05C5')||LA1_0=='\u05C7'||(LA1_0 >= '\u0610' && LA1_0 <= '\u061A')||(LA1_0 >= '\u064B' && LA1_0 <= '\u065F')||LA1_0=='\u0670'||(LA1_0 >= '\u06D6' && LA1_0 <= '\u06DC')||(LA1_0 >= '\u06DF' && LA1_0 <= '\u06E4')||(LA1_0 >= '\u06E7' && LA1_0 <= '\u06E8')||(LA1_0 >= '\u06EA' && LA1_0 <= '\u06ED')||LA1_0=='\u0711'||(LA1_0 >= '\u0730' && LA1_0 <= '\u074A')||(LA1_0 >= '\u07A6' && LA1_0 <= '\u07B0')||(LA1_0 >= '\u07EB' && LA1_0 <= '\u07F3')||(LA1_0 >= '\u0816' && LA1_0 <= '\u0819')||(LA1_0 >= '\u081B' && LA1_0 <= '\u0823')||(LA1_0 >= '\u0825' && LA1_0 <= '\u0827')||(LA1_0 >= '\u0829' && LA1_0 <= '\u082D')||(LA1_0 >= '\u0859' && LA1_0 <= '\u085B')||(LA1_0 >= '\u08E4' && LA1_0 <= '\u08FE')||(LA1_0 >= '\u0900' && LA1_0 <= '\u0902')||LA1_0=='\u093A'||LA1_0=='\u093C'||(LA1_0 >= '\u0941' && LA1_0 <= '\u0948')||LA1_0=='\u094D'||(LA1_0 >= '\u0951' && LA1_0 <= '\u0957')||(LA1_0 >= '\u0962' && LA1_0 <= '\u0963')||LA1_0=='\u0981'||LA1_0=='\u09BC'||(LA1_0 >= '\u09C1' && LA1_0 <= '\u09C4')||LA1_0=='\u09CD'||(LA1_0 >= '\u09E2' && LA1_0 <= '\u09E3')||(LA1_0 >= '\u0A01' && LA1_0 <= '\u0A02')||LA1_0=='\u0A3C'||(LA1_0 >= '\u0A41' && LA1_0 <= '\u0A42')||(LA1_0 >= '\u0A47' && LA1_0 <= '\u0A48')||(LA1_0 >= '\u0A4B' && LA1_0 <= '\u0A4D')||LA1_0=='\u0A51'||(LA1_0 >= '\u0A70' && LA1_0 <= '\u0A71')||LA1_0=='\u0A75'||(LA1_0 >= '\u0A81' && LA1_0 <= '\u0A82')||LA1_0=='\u0ABC'||(LA1_0 >= '\u0AC1' && LA1_0 <= '\u0AC5')||(LA1_0 >= '\u0AC7' && LA1_0 <= '\u0AC8')||LA1_0=='\u0ACD'||(LA1_0 >= '\u0AE2' && LA1_0 <= '\u0AE3')||LA1_0=='\u0B01'||LA1_0=='\u0B3C'||LA1_0=='\u0B3F'||(LA1_0 >= '\u0B41' && LA1_0 <= '\u0B44')||LA1_0=='\u0B4D'||LA1_0=='\u0B56'||(LA1_0 >= '\u0B62' && LA1_0 <= '\u0B63')||LA1_0=='\u0B82'||LA1_0=='\u0BC0'||LA1_0=='\u0BCD'||(LA1_0 >= '\u0C3E' && LA1_0 <= '\u0C40')||(LA1_0 >= '\u0C46' && LA1_0 <= '\u0C48')||(LA1_0 >= '\u0C4A' && LA1_0 <= '\u0C4D')||(LA1_0 >= '\u0C55' && LA1_0 <= '\u0C56')||(LA1_0 >= '\u0C62' && LA1_0 <= '\u0C63')||LA1_0=='\u0CBC'||LA1_0=='\u0CBF'||LA1_0=='\u0CC6'||(LA1_0 >= '\u0CCC' && LA1_0 <= '\u0CCD')||(LA1_0 >= '\u0CE2' && LA1_0 <= '\u0CE3')||(LA1_0 >= '\u0D41' && LA1_0 <= '\u0D44')||LA1_0=='\u0D4D'||(LA1_0 >= '\u0D62' && LA1_0 <= '\u0D63')||LA1_0=='\u0DCA'||(LA1_0 >= '\u0DD2' && LA1_0 <= '\u0DD4')||LA1_0=='\u0DD6'||LA1_0=='\u0E31'||(LA1_0 >= '\u0E34' && LA1_0 <= '\u0E3A')||(LA1_0 >= '\u0E47' && LA1_0 <= '\u0E4E')||LA1_0=='\u0EB1'||(LA1_0 >= '\u0EB4' && LA1_0 <= '\u0EB9')||(LA1_0 >= '\u0EBB' && LA1_0 <= '\u0EBC')||(LA1_0 >= '\u0EC8' && LA1_0 <= '\u0ECD')||(LA1_0 >= '\u0F18' && LA1_0 <= '\u0F19')||LA1_0=='\u0F35'||LA1_0=='\u0F37'||LA1_0=='\u0F39'||(LA1_0 >= '\u0F71' && LA1_0 <= '\u0F7E')||(LA1_0 >= '\u0F80' && LA1_0 <= '\u0F84')||(LA1_0 >= '\u0F86' && LA1_0 <= '\u0F87')||(LA1_0 >= '\u0F8D' && LA1_0 <= '\u0F97')||(LA1_0 >= '\u0F99' && LA1_0 <= '\u0FBC')||LA1_0=='\u0FC6'||(LA1_0 >= '\u102D' && LA1_0 <= '\u1030')||(LA1_0 >= '\u1032' && LA1_0 <= '\u1037')||(LA1_0 >= '\u1039' && LA1_0 <= '\u103A')||(LA1_0 >= '\u103D' && LA1_0 <= '\u103E')||(LA1_0 >= '\u1058' && LA1_0 <= '\u1059')||(LA1_0 >= '\u105E' && LA1_0 <= '\u1060')||(LA1_0 >= '\u1071' && LA1_0 <= '\u1074')||LA1_0=='\u1082'||(LA1_0 >= '\u1085' && LA1_0 <= '\u1086')||LA1_0=='\u108D'||LA1_0=='\u109D'||(LA1_0 >= '\u135D' && LA1_0 <= '\u135F')||(LA1_0 >= '\u1712' && LA1_0 <= '\u1714')||(LA1_0 >= '\u1732' && LA1_0 <= '\u1734')||(LA1_0 >= '\u1752' && LA1_0 <= '\u1753')||(LA1_0 >= '\u1772' && LA1_0 <= '\u1773')||(LA1_0 >= '\u17B4' && LA1_0 <= '\u17B5')||(LA1_0 >= '\u17B7' && LA1_0 <= '\u17BD')||LA1_0=='\u17C6'||(LA1_0 >= '\u17C9' && LA1_0 <= '\u17D3')||LA1_0=='\u17DD'||(LA1_0 >= '\u180B' && LA1_0 <= '\u180D')||LA1_0=='\u18A9'||(LA1_0 >= '\u1920' && LA1_0 <= '\u1922')||(LA1_0 >= '\u1927' && LA1_0 <= '\u1928')||LA1_0=='\u1932'||(LA1_0 >= '\u1939' && LA1_0 <= '\u193B')||(LA1_0 >= '\u1A17' && LA1_0 <= '\u1A18')||LA1_0=='\u1A56'||(LA1_0 >= '\u1A58' && LA1_0 <= '\u1A5E')||LA1_0=='\u1A60'||LA1_0=='\u1A62'||(LA1_0 >= '\u1A65' && LA1_0 <= '\u1A6C')||(LA1_0 >= '\u1A73' && LA1_0 <= '\u1A7C')||LA1_0=='\u1A7F'||(LA1_0 >= '\u1B00' && LA1_0 <= '\u1B03')||LA1_0=='\u1B34'||(LA1_0 >= '\u1B36' && LA1_0 <= '\u1B3A')||LA1_0=='\u1B3C'||LA1_0=='\u1B42'||(LA1_0 >= '\u1B6B' && LA1_0 <= '\u1B73')||(LA1_0 >= '\u1B80' && LA1_0 <= '\u1B81')||(LA1_0 >= '\u1BA2' && LA1_0 <= '\u1BA5')||(LA1_0 >= '\u1BA8' && LA1_0 <= '\u1BA9')||LA1_0=='\u1BAB'||LA1_0=='\u1BE6'||(LA1_0 >= '\u1BE8' && LA1_0 <= '\u1BE9')||LA1_0=='\u1BED'||(LA1_0 >= '\u1BEF' && LA1_0 <= '\u1BF1')||(LA1_0 >= '\u1C2C' && LA1_0 <= '\u1C33')||(LA1_0 >= '\u1C36' && LA1_0 <= '\u1C37')||(LA1_0 >= '\u1CD0' && LA1_0 <= '\u1CD2')||(LA1_0 >= '\u1CD4' && LA1_0 <= '\u1CE0')||(LA1_0 >= '\u1CE2' && LA1_0 <= '\u1CE8')||LA1_0=='\u1CED'||LA1_0=='\u1CF4'||(LA1_0 >= '\u1DC0' && LA1_0 <= '\u1DE6')||(LA1_0 >= '\u1DFC' && LA1_0 <= '\u1DFF')||(LA1_0 >= '\u20D0' && LA1_0 <= '\u20DC')||LA1_0=='\u20E1'||(LA1_0 >= '\u20E5' && LA1_0 <= '\u20F0')||(LA1_0 >= '\u2CEF' && LA1_0 <= '\u2CF1')||LA1_0=='\u2D7F'||(LA1_0 >= '\u2DE0' && LA1_0 <= '\u2DFF')||(LA1_0 >= '\u302A' && LA1_0 <= '\u302D')||(LA1_0 >= '\u3099' && LA1_0 <= '\u309A')||LA1_0=='\uA66F'||(LA1_0 >= '\uA674' && LA1_0 <= '\uA67D')||LA1_0=='\uA69F'||(LA1_0 >= '\uA6F0' && LA1_0 <= '\uA6F1')||LA1_0=='\uA802'||LA1_0=='\uA806'||LA1_0=='\uA80B'||(LA1_0 >= '\uA825' && LA1_0 <= '\uA826')||LA1_0=='\uA8C4'||(LA1_0 >= '\uA8E0' && LA1_0 <= '\uA8F1')||(LA1_0 >= '\uA926' && LA1_0 <= '\uA92D')||(LA1_0 >= '\uA947' && LA1_0 <= '\uA951')||(LA1_0 >= '\uA980' && LA1_0 <= '\uA982')||LA1_0=='\uA9B3'||(LA1_0 >= '\uA9B6' && LA1_0 <= '\uA9B9')||LA1_0=='\uA9BC'||(LA1_0 >= '\uAA29' && LA1_0 <= '\uAA2E')||(LA1_0 >= '\uAA31' && LA1_0 <= '\uAA32')||(LA1_0 >= '\uAA35' && LA1_0 <= '\uAA36')||LA1_0=='\uAA43'||LA1_0=='\uAA4C'||LA1_0=='\uAAB0'||(LA1_0 >= '\uAAB2' && LA1_0 <= '\uAAB4')||(LA1_0 >= '\uAAB7' && LA1_0 <= '\uAAB8')||(LA1_0 >= '\uAABE' && LA1_0 <= '\uAABF')||LA1_0=='\uAAC1'||(LA1_0 >= '\uAAEC' && LA1_0 <= '\uAAED')||LA1_0=='\uAAF6'||LA1_0=='\uABE5'||LA1_0=='\uABE8'||LA1_0=='\uABED'||LA1_0=='\uFB1E'||(LA1_0 >= '\uFE00' && LA1_0 <= '\uFE0F')||(LA1_0 >= '\uFE20' && LA1_0 <= '\uFE26')) ) {
            alt1=12;
        }
        else if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= '\u0660' && LA1_0 <= '\u0669')||(LA1_0 >= '\u06F0' && LA1_0 <= '\u06F9')||(LA1_0 >= '\u07C0' && LA1_0 <= '\u07C9')||(LA1_0 >= '\u0966' && LA1_0 <= '\u096F')||(LA1_0 >= '\u09E6' && LA1_0 <= '\u09EF')||(LA1_0 >= '\u0A66' && LA1_0 <= '\u0A6F')||(LA1_0 >= '\u0AE6' && LA1_0 <= '\u0AEF')||(LA1_0 >= '\u0B66' && LA1_0 <= '\u0B6F')||(LA1_0 >= '\u0BE6' && LA1_0 <= '\u0BEF')||(LA1_0 >= '\u0C66' && LA1_0 <= '\u0C6F')||(LA1_0 >= '\u0CE6' && LA1_0 <= '\u0CEF')||(LA1_0 >= '\u0D66' && LA1_0 <= '\u0D6F')||(LA1_0 >= '\u0E50' && LA1_0 <= '\u0E59')||(LA1_0 >= '\u0ED0' && LA1_0 <= '\u0ED9')||(LA1_0 >= '\u0F20' && LA1_0 <= '\u0F29')||(LA1_0 >= '\u1040' && LA1_0 <= '\u1049')||(LA1_0 >= '\u1090' && LA1_0 <= '\u1099')||(LA1_0 >= '\u17E0' && LA1_0 <= '\u17E9')||(LA1_0 >= '\u1810' && LA1_0 <= '\u1819')||(LA1_0 >= '\u1946' && LA1_0 <= '\u194F')||(LA1_0 >= '\u19D0' && LA1_0 <= '\u19D9')||(LA1_0 >= '\u1A80' && LA1_0 <= '\u1A89')||(LA1_0 >= '\u1A90' && LA1_0 <= '\u1A99')||(LA1_0 >= '\u1B50' && LA1_0 <= '\u1B59')||(LA1_0 >= '\u1BB0' && LA1_0 <= '\u1BB9')||(LA1_0 >= '\u1C40' && LA1_0 <= '\u1C49')||(LA1_0 >= '\u1C50' && LA1_0 <= '\u1C59')||(LA1_0 >= '\uA620' && LA1_0 <= '\uA629')||(LA1_0 >= '\uA8D0' && LA1_0 <= '\uA8D9')||(LA1_0 >= '\uA900' && LA1_0 <= '\uA909')||(LA1_0 >= '\uA9D0' && LA1_0 <= '\uA9D9')||(LA1_0 >= '\uAA50' && LA1_0 <= '\uAA59')||(LA1_0 >= '\uABF0' && LA1_0 <= '\uABF9')||(LA1_0 >= '\uFF10' && LA1_0 <= '\uFF19')) ) {
            alt1=13;
        }
        else if ( ((LA1_0 >= '\u16EE' && LA1_0 <= '\u16F0')||(LA1_0 >= '\u2160' && LA1_0 <= '\u2182')||(LA1_0 >= '\u2185' && LA1_0 <= '\u2188')||LA1_0=='\u3007'||(LA1_0 >= '\u3021' && LA1_0 <= '\u3029')||(LA1_0 >= '\u3038' && LA1_0 <= '\u303A')||(LA1_0 >= '\uA6E6' && LA1_0 <= '\uA6EF')) ) {
            alt1=14;
        }
        else if ( ((LA1_0 >= '\u00B2' && LA1_0 <= '\u00B3')||LA1_0=='\u00B9'||(LA1_0 >= '\u00BC' && LA1_0 <= '\u00BE')||(LA1_0 >= '\u09F4' && LA1_0 <= '\u09F9')||(LA1_0 >= '\u0B72' && LA1_0 <= '\u0B77')||(LA1_0 >= '\u0BF0' && LA1_0 <= '\u0BF2')||(LA1_0 >= '\u0C78' && LA1_0 <= '\u0C7E')||(LA1_0 >= '\u0D70' && LA1_0 <= '\u0D75')||(LA1_0 >= '\u0F2A' && LA1_0 <= '\u0F33')||(LA1_0 >= '\u1369' && LA1_0 <= '\u137C')||(LA1_0 >= '\u17F0' && LA1_0 <= '\u17F9')||LA1_0=='\u19DA'||LA1_0=='\u2070'||(LA1_0 >= '\u2074' && LA1_0 <= '\u2079')||(LA1_0 >= '\u2080' && LA1_0 <= '\u2089')||(LA1_0 >= '\u2150' && LA1_0 <= '\u215F')||LA1_0=='\u2189'||(LA1_0 >= '\u2460' && LA1_0 <= '\u249B')||(LA1_0 >= '\u24EA' && LA1_0 <= '\u24FF')||(LA1_0 >= '\u2776' && LA1_0 <= '\u2793')||LA1_0=='\u2CFD'||(LA1_0 >= '\u3192' && LA1_0 <= '\u3195')||(LA1_0 >= '\u3220' && LA1_0 <= '\u3229')||(LA1_0 >= '\u3248' && LA1_0 <= '\u324F')||(LA1_0 >= '\u3251' && LA1_0 <= '\u325F')||(LA1_0 >= '\u3280' && LA1_0 <= '\u3289')||(LA1_0 >= '\u32B1' && LA1_0 <= '\u32BF')||(LA1_0 >= '\uA830' && LA1_0 <= '\uA835')) ) {
            alt1=15;
        }
        else if ( (LA1_0=='_'||(LA1_0 >= '\u203F' && LA1_0 <= '\u2040')||LA1_0=='\u2054'||(LA1_0 >= '\uFE33' && LA1_0 <= '\uFE34')||(LA1_0 >= '\uFE4D' && LA1_0 <= '\uFE4F')||LA1_0=='\uFF3F') ) {
            alt1=16;
        }
        else if ( (LA1_0=='-'||LA1_0=='\u058A'||LA1_0=='\u05BE'||LA1_0=='\u1400'||LA1_0=='\u1806'||(LA1_0 >= '\u2010' && LA1_0 <= '\u2015')||LA1_0=='\u2E17'||LA1_0=='\u2E1A'||(LA1_0 >= '\u2E3A' && LA1_0 <= '\u2E3B')||LA1_0=='\u301C'||LA1_0=='\u3030'||LA1_0=='\u30A0'||(LA1_0 >= '\uFE31' && LA1_0 <= '\uFE32')||LA1_0=='\uFE58'||LA1_0=='\uFE63'||LA1_0=='\uFF0D') ) {
            alt1=17;
        }
        else if ( (LA1_0==')'||LA1_0==']'||LA1_0=='}'||LA1_0=='\u0F3B'||LA1_0=='\u0F3D'||LA1_0=='\u169C'||LA1_0=='\u2046'||LA1_0=='\u207E'||LA1_0=='\u208E'||LA1_0=='\u232A'||LA1_0=='\u2769'||LA1_0=='\u276B'||LA1_0=='\u276D'||LA1_0=='\u276F'||LA1_0=='\u2771'||LA1_0=='\u2773'||LA1_0=='\u2775'||LA1_0=='\u27C6'||LA1_0=='\u27E7'||LA1_0=='\u27E9'||LA1_0=='\u27EB'||LA1_0=='\u27ED'||LA1_0=='\u27EF'||LA1_0=='\u2984'||LA1_0=='\u2986'||LA1_0=='\u2988'||LA1_0=='\u298A'||LA1_0=='\u298C'||LA1_0=='\u298E'||LA1_0=='\u2990'||LA1_0=='\u2992'||LA1_0=='\u2994'||LA1_0=='\u2996'||LA1_0=='\u2998'||LA1_0=='\u29D9'||LA1_0=='\u29DB'||LA1_0=='\u29FD'||LA1_0=='\u2E23'||LA1_0=='\u2E25'||LA1_0=='\u2E27'||LA1_0=='\u2E29'||LA1_0=='\u3009'||LA1_0=='\u300B'||LA1_0=='\u300D'||LA1_0=='\u300F'||LA1_0=='\u3011'||LA1_0=='\u3015'||LA1_0=='\u3017'||LA1_0=='\u3019'||LA1_0=='\u301B'||(LA1_0 >= '\u301E' && LA1_0 <= '\u301F')||LA1_0=='\uFD3F'||LA1_0=='\uFE18'||LA1_0=='\uFE36'||LA1_0=='\uFE38'||LA1_0=='\uFE3A'||LA1_0=='\uFE3C'||LA1_0=='\uFE3E'||LA1_0=='\uFE40'||LA1_0=='\uFE42'||LA1_0=='\uFE44'||LA1_0=='\uFE48'||LA1_0=='\uFE5A'||LA1_0=='\uFE5C'||LA1_0=='\uFE5E'||LA1_0=='\uFF09'||LA1_0=='\uFF3D'||LA1_0=='\uFF5D'||LA1_0=='\uFF60'||LA1_0=='\uFF63') ) {
            alt1=18;
        }
        else if ( (LA1_0=='\u00BB'||LA1_0=='\u2019'||LA1_0=='\u201D'||LA1_0=='\u203A'||LA1_0=='\u2E03'||LA1_0=='\u2E05'||LA1_0=='\u2E0A'||LA1_0=='\u2E0D'||LA1_0=='\u2E1D'||LA1_0=='\u2E21') ) {
            alt1=19;
        }
        else if ( (LA1_0=='\u00AB'||LA1_0=='\u2018'||(LA1_0 >= '\u201B' && LA1_0 <= '\u201C')||LA1_0=='\u201F'||LA1_0=='\u2039'||LA1_0=='\u2E02'||LA1_0=='\u2E04'||LA1_0=='\u2E09'||LA1_0=='\u2E0C'||LA1_0=='\u2E1C'||LA1_0=='\u2E20') ) {
            alt1=20;
        }
        else if ( ((LA1_0 >= '!' && LA1_0 <= '#')||(LA1_0 >= '%' && LA1_0 <= '\'')||LA1_0=='*'||LA1_0==','||(LA1_0 >= '.' && LA1_0 <= '/')||(LA1_0 >= ':' && LA1_0 <= ';')||(LA1_0 >= '?' && LA1_0 <= '@')||LA1_0=='\\'||LA1_0=='\u00A1'||LA1_0=='\u00A7'||(LA1_0 >= '\u00B6' && LA1_0 <= '\u00B7')||LA1_0=='\u00BF'||LA1_0=='\u037E'||LA1_0=='\u0387'||(LA1_0 >= '\u055A' && LA1_0 <= '\u055F')||LA1_0=='\u0589'||LA1_0=='\u05C0'||LA1_0=='\u05C3'||LA1_0=='\u05C6'||(LA1_0 >= '\u05F3' && LA1_0 <= '\u05F4')||(LA1_0 >= '\u0609' && LA1_0 <= '\u060A')||(LA1_0 >= '\u060C' && LA1_0 <= '\u060D')||LA1_0=='\u061B'||(LA1_0 >= '\u061E' && LA1_0 <= '\u061F')||(LA1_0 >= '\u066A' && LA1_0 <= '\u066D')||LA1_0=='\u06D4'||(LA1_0 >= '\u0700' && LA1_0 <= '\u070D')||(LA1_0 >= '\u07F7' && LA1_0 <= '\u07F9')||(LA1_0 >= '\u0830' && LA1_0 <= '\u083E')||LA1_0=='\u085E'||(LA1_0 >= '\u0964' && LA1_0 <= '\u0965')||LA1_0=='\u0970'||LA1_0=='\u0AF0'||LA1_0=='\u0DF4'||LA1_0=='\u0E4F'||(LA1_0 >= '\u0E5A' && LA1_0 <= '\u0E5B')||(LA1_0 >= '\u0F04' && LA1_0 <= '\u0F12')||LA1_0=='\u0F14'||LA1_0=='\u0F85'||(LA1_0 >= '\u0FD0' && LA1_0 <= '\u0FD4')||(LA1_0 >= '\u0FD9' && LA1_0 <= '\u0FDA')||(LA1_0 >= '\u104A' && LA1_0 <= '\u104F')||LA1_0=='\u10FB'||(LA1_0 >= '\u1360' && LA1_0 <= '\u1368')||(LA1_0 >= '\u166D' && LA1_0 <= '\u166E')||(LA1_0 >= '\u16EB' && LA1_0 <= '\u16ED')||(LA1_0 >= '\u1735' && LA1_0 <= '\u1736')||(LA1_0 >= '\u17D4' && LA1_0 <= '\u17D6')||(LA1_0 >= '\u17D8' && LA1_0 <= '\u17DA')||(LA1_0 >= '\u1800' && LA1_0 <= '\u1805')||(LA1_0 >= '\u1807' && LA1_0 <= '\u180A')||(LA1_0 >= '\u1944' && LA1_0 <= '\u1945')||(LA1_0 >= '\u1A1E' && LA1_0 <= '\u1A1F')||(LA1_0 >= '\u1AA0' && LA1_0 <= '\u1AA6')||(LA1_0 >= '\u1AA8' && LA1_0 <= '\u1AAD')||(LA1_0 >= '\u1B5A' && LA1_0 <= '\u1B60')||(LA1_0 >= '\u1BFC' && LA1_0 <= '\u1BFF')||(LA1_0 >= '\u1C3B' && LA1_0 <= '\u1C3F')||(LA1_0 >= '\u1C7E' && LA1_0 <= '\u1C7F')||(LA1_0 >= '\u1CC0' && LA1_0 <= '\u1CC7')||LA1_0=='\u1CD3'||(LA1_0 >= '\u2016' && LA1_0 <= '\u2017')||(LA1_0 >= '\u2020' && LA1_0 <= '\u2027')||(LA1_0 >= '\u2030' && LA1_0 <= '\u2038')||(LA1_0 >= '\u203B' && LA1_0 <= '\u203E')||(LA1_0 >= '\u2041' && LA1_0 <= '\u2043')||(LA1_0 >= '\u2047' && LA1_0 <= '\u2051')||LA1_0=='\u2053'||(LA1_0 >= '\u2055' && LA1_0 <= '\u205E')||(LA1_0 >= '\u2CF9' && LA1_0 <= '\u2CFC')||(LA1_0 >= '\u2CFE' && LA1_0 <= '\u2CFF')||LA1_0=='\u2D70'||(LA1_0 >= '\u2E00' && LA1_0 <= '\u2E01')||(LA1_0 >= '\u2E06' && LA1_0 <= '\u2E08')||LA1_0=='\u2E0B'||(LA1_0 >= '\u2E0E' && LA1_0 <= '\u2E16')||(LA1_0 >= '\u2E18' && LA1_0 <= '\u2E19')||LA1_0=='\u2E1B'||(LA1_0 >= '\u2E1E' && LA1_0 <= '\u2E1F')||(LA1_0 >= '\u2E2A' && LA1_0 <= '\u2E2E')||(LA1_0 >= '\u2E30' && LA1_0 <= '\u2E39')||(LA1_0 >= '\u3001' && LA1_0 <= '\u3003')||LA1_0=='\u303D'||LA1_0=='\u30FB'||(LA1_0 >= '\uA4FE' && LA1_0 <= '\uA4FF')||(LA1_0 >= '\uA60D' && LA1_0 <= '\uA60F')||LA1_0=='\uA673'||LA1_0=='\uA67E'||(LA1_0 >= '\uA6F2' && LA1_0 <= '\uA6F7')||(LA1_0 >= '\uA874' && LA1_0 <= '\uA877')||(LA1_0 >= '\uA8CE' && LA1_0 <= '\uA8CF')||(LA1_0 >= '\uA8F8' && LA1_0 <= '\uA8FA')||(LA1_0 >= '\uA92E' && LA1_0 <= '\uA92F')||LA1_0=='\uA95F'||(LA1_0 >= '\uA9C1' && LA1_0 <= '\uA9CD')||(LA1_0 >= '\uA9DE' && LA1_0 <= '\uA9DF')||(LA1_0 >= '\uAA5C' && LA1_0 <= '\uAA5F')||(LA1_0 >= '\uAADE' && LA1_0 <= '\uAADF')||(LA1_0 >= '\uAAF0' && LA1_0 <= '\uAAF1')||LA1_0=='\uABEB'||(LA1_0 >= '\uFE10' && LA1_0 <= '\uFE16')||LA1_0=='\uFE19'||LA1_0=='\uFE30'||(LA1_0 >= '\uFE45' && LA1_0 <= '\uFE46')||(LA1_0 >= '\uFE49' && LA1_0 <= '\uFE4C')||(LA1_0 >= '\uFE50' && LA1_0 <= '\uFE52')||(LA1_0 >= '\uFE54' && LA1_0 <= '\uFE57')||(LA1_0 >= '\uFE5F' && LA1_0 <= '\uFE61')||LA1_0=='\uFE68'||(LA1_0 >= '\uFE6A' && LA1_0 <= '\uFE6B')||(LA1_0 >= '\uFF01' && LA1_0 <= '\uFF03')||(LA1_0 >= '\uFF05' && LA1_0 <= '\uFF07')||LA1_0=='\uFF0A'||LA1_0=='\uFF0C'||(LA1_0 >= '\uFF0E' && LA1_0 <= '\uFF0F')||(LA1_0 >= '\uFF1A' && LA1_0 <= '\uFF1B')||(LA1_0 >= '\uFF1F' && LA1_0 <= '\uFF20')||LA1_0=='\uFF3C'||LA1_0=='\uFF61'||(LA1_0 >= '\uFF64' && LA1_0 <= '\uFF65')) ) {
            alt1=21;
        }
        else if ( (LA1_0=='('||LA1_0=='['||LA1_0=='{'||LA1_0=='\u0F3A'||LA1_0=='\u0F3C'||LA1_0=='\u169B'||LA1_0=='\u201A'||LA1_0=='\u201E'||LA1_0=='\u2045'||LA1_0=='\u207D'||LA1_0=='\u208D'||LA1_0=='\u2329'||LA1_0=='\u2768'||LA1_0=='\u276A'||LA1_0=='\u276C'||LA1_0=='\u276E'||LA1_0=='\u2770'||LA1_0=='\u2772'||LA1_0=='\u2774'||LA1_0=='\u27C5'||LA1_0=='\u27E6'||LA1_0=='\u27E8'||LA1_0=='\u27EA'||LA1_0=='\u27EC'||LA1_0=='\u27EE'||LA1_0=='\u2983'||LA1_0=='\u2985'||LA1_0=='\u2987'||LA1_0=='\u2989'||LA1_0=='\u298B'||LA1_0=='\u298D'||LA1_0=='\u298F'||LA1_0=='\u2991'||LA1_0=='\u2993'||LA1_0=='\u2995'||LA1_0=='\u2997'||LA1_0=='\u29D8'||LA1_0=='\u29DA'||LA1_0=='\u29FC'||LA1_0=='\u2E22'||LA1_0=='\u2E24'||LA1_0=='\u2E26'||LA1_0=='\u2E28'||LA1_0=='\u3008'||LA1_0=='\u300A'||LA1_0=='\u300C'||LA1_0=='\u300E'||LA1_0=='\u3010'||LA1_0=='\u3014'||LA1_0=='\u3016'||LA1_0=='\u3018'||LA1_0=='\u301A'||LA1_0=='\u301D'||LA1_0=='\uFD3E'||LA1_0=='\uFE17'||LA1_0=='\uFE35'||LA1_0=='\uFE37'||LA1_0=='\uFE39'||LA1_0=='\uFE3B'||LA1_0=='\uFE3D'||LA1_0=='\uFE3F'||LA1_0=='\uFE41'||LA1_0=='\uFE43'||LA1_0=='\uFE47'||LA1_0=='\uFE59'||LA1_0=='\uFE5B'||LA1_0=='\uFE5D'||LA1_0=='\uFF08'||LA1_0=='\uFF3B'||LA1_0=='\uFF5B'||LA1_0=='\uFF5F'||LA1_0=='\uFF62') ) {
            alt1=22;
        }
        else if ( (LA1_0=='$'||(LA1_0 >= '\u00A2' && LA1_0 <= '\u00A5')||LA1_0=='\u058F'||LA1_0=='\u060B'||(LA1_0 >= '\u09F2' && LA1_0 <= '\u09F3')||LA1_0=='\u09FB'||LA1_0=='\u0AF1'||LA1_0=='\u0BF9'||LA1_0=='\u0E3F'||LA1_0=='\u17DB'||(LA1_0 >= '\u20A0' && LA1_0 <= '\u20B9')||LA1_0=='\uA838'||LA1_0=='\uFDFC'||LA1_0=='\uFE69'||LA1_0=='\uFF04'||(LA1_0 >= '\uFFE0' && LA1_0 <= '\uFFE1')||(LA1_0 >= '\uFFE5' && LA1_0 <= '\uFFE6')) ) {
            alt1=23;
        }
        else if ( (LA1_0=='^'||LA1_0=='`'||LA1_0=='\u00A8'||LA1_0=='\u00AF'||LA1_0=='\u00B4'||LA1_0=='\u00B8'||(LA1_0 >= '\u02C2' && LA1_0 <= '\u02C5')||(LA1_0 >= '\u02D2' && LA1_0 <= '\u02DF')||(LA1_0 >= '\u02E5' && LA1_0 <= '\u02EB')||LA1_0=='\u02ED'||(LA1_0 >= '\u02EF' && LA1_0 <= '\u02FF')||LA1_0=='\u0375'||(LA1_0 >= '\u0384' && LA1_0 <= '\u0385')||LA1_0=='\u1FBD'||(LA1_0 >= '\u1FBF' && LA1_0 <= '\u1FC1')||(LA1_0 >= '\u1FCD' && LA1_0 <= '\u1FCF')||(LA1_0 >= '\u1FDD' && LA1_0 <= '\u1FDF')||(LA1_0 >= '\u1FED' && LA1_0 <= '\u1FEF')||(LA1_0 >= '\u1FFD' && LA1_0 <= '\u1FFE')||(LA1_0 >= '\u309B' && LA1_0 <= '\u309C')||(LA1_0 >= '\uA700' && LA1_0 <= '\uA716')||(LA1_0 >= '\uA720' && LA1_0 <= '\uA721')||(LA1_0 >= '\uA789' && LA1_0 <= '\uA78A')||(LA1_0 >= '\uFBB2' && LA1_0 <= '\uFBC1')||LA1_0=='\uFF3E'||LA1_0=='\uFF40'||LA1_0=='\uFFE3') ) {
            alt1=24;
        }
        else if ( (LA1_0=='+'||(LA1_0 >= '<' && LA1_0 <= '>')||LA1_0=='|'||LA1_0=='~'||LA1_0=='\u00AC'||LA1_0=='\u00B1'||LA1_0=='\u00D7'||LA1_0=='\u00F7'||LA1_0=='\u03F6'||(LA1_0 >= '\u0606' && LA1_0 <= '\u0608')||LA1_0=='\u2044'||LA1_0=='\u2052'||(LA1_0 >= '\u207A' && LA1_0 <= '\u207C')||(LA1_0 >= '\u208A' && LA1_0 <= '\u208C')||LA1_0=='\u2118'||(LA1_0 >= '\u2140' && LA1_0 <= '\u2144')||LA1_0=='\u214B'||(LA1_0 >= '\u2190' && LA1_0 <= '\u2194')||(LA1_0 >= '\u219A' && LA1_0 <= '\u219B')||LA1_0=='\u21A0'||LA1_0=='\u21A3'||LA1_0=='\u21A6'||LA1_0=='\u21AE'||(LA1_0 >= '\u21CE' && LA1_0 <= '\u21CF')||LA1_0=='\u21D2'||LA1_0=='\u21D4'||(LA1_0 >= '\u21F4' && LA1_0 <= '\u22FF')||(LA1_0 >= '\u2308' && LA1_0 <= '\u230B')||(LA1_0 >= '\u2320' && LA1_0 <= '\u2321')||LA1_0=='\u237C'||(LA1_0 >= '\u239B' && LA1_0 <= '\u23B3')||(LA1_0 >= '\u23DC' && LA1_0 <= '\u23E1')||LA1_0=='\u25B7'||LA1_0=='\u25C1'||(LA1_0 >= '\u25F8' && LA1_0 <= '\u25FF')||LA1_0=='\u266F'||(LA1_0 >= '\u27C0' && LA1_0 <= '\u27C4')||(LA1_0 >= '\u27C7' && LA1_0 <= '\u27E5')||(LA1_0 >= '\u27F0' && LA1_0 <= '\u27FF')||(LA1_0 >= '\u2900' && LA1_0 <= '\u2982')||(LA1_0 >= '\u2999' && LA1_0 <= '\u29D7')||(LA1_0 >= '\u29DC' && LA1_0 <= '\u29FB')||(LA1_0 >= '\u29FE' && LA1_0 <= '\u2AFF')||(LA1_0 >= '\u2B30' && LA1_0 <= '\u2B44')||(LA1_0 >= '\u2B47' && LA1_0 <= '\u2B4C')||LA1_0=='\uFB29'||LA1_0=='\uFE62'||(LA1_0 >= '\uFE64' && LA1_0 <= '\uFE66')||LA1_0=='\uFF0B'||(LA1_0 >= '\uFF1C' && LA1_0 <= '\uFF1E')||LA1_0=='\uFF5C'||LA1_0=='\uFF5E'||LA1_0=='\uFFE2'||(LA1_0 >= '\uFFE9' && LA1_0 <= '\uFFEC')) ) {
            alt1=25;
        }
        else if ( (LA1_0=='\u00A6'||LA1_0=='\u00A9'||LA1_0=='\u00AE'||LA1_0=='\u00B0'||LA1_0=='\u0482'||(LA1_0 >= '\u060E' && LA1_0 <= '\u060F')||LA1_0=='\u06DE'||LA1_0=='\u06E9'||(LA1_0 >= '\u06FD' && LA1_0 <= '\u06FE')||LA1_0=='\u07F6'||LA1_0=='\u09FA'||LA1_0=='\u0B70'||(LA1_0 >= '\u0BF3' && LA1_0 <= '\u0BF8')||LA1_0=='\u0BFA'||LA1_0=='\u0C7F'||LA1_0=='\u0D79'||(LA1_0 >= '\u0F01' && LA1_0 <= '\u0F03')||LA1_0=='\u0F13'||(LA1_0 >= '\u0F15' && LA1_0 <= '\u0F17')||(LA1_0 >= '\u0F1A' && LA1_0 <= '\u0F1F')||LA1_0=='\u0F34'||LA1_0=='\u0F36'||LA1_0=='\u0F38'||(LA1_0 >= '\u0FBE' && LA1_0 <= '\u0FC5')||(LA1_0 >= '\u0FC7' && LA1_0 <= '\u0FCC')||(LA1_0 >= '\u0FCE' && LA1_0 <= '\u0FCF')||(LA1_0 >= '\u0FD5' && LA1_0 <= '\u0FD8')||(LA1_0 >= '\u109E' && LA1_0 <= '\u109F')||(LA1_0 >= '\u1390' && LA1_0 <= '\u1399')||LA1_0=='\u1940'||(LA1_0 >= '\u19DE' && LA1_0 <= '\u19FF')||(LA1_0 >= '\u1B61' && LA1_0 <= '\u1B6A')||(LA1_0 >= '\u1B74' && LA1_0 <= '\u1B7C')||(LA1_0 >= '\u2100' && LA1_0 <= '\u2101')||(LA1_0 >= '\u2103' && LA1_0 <= '\u2106')||(LA1_0 >= '\u2108' && LA1_0 <= '\u2109')||LA1_0=='\u2114'||(LA1_0 >= '\u2116' && LA1_0 <= '\u2117')||(LA1_0 >= '\u211E' && LA1_0 <= '\u2123')||LA1_0=='\u2125'||LA1_0=='\u2127'||LA1_0=='\u2129'||LA1_0=='\u212E'||(LA1_0 >= '\u213A' && LA1_0 <= '\u213B')||LA1_0=='\u214A'||(LA1_0 >= '\u214C' && LA1_0 <= '\u214D')||LA1_0=='\u214F'||(LA1_0 >= '\u2195' && LA1_0 <= '\u2199')||(LA1_0 >= '\u219C' && LA1_0 <= '\u219F')||(LA1_0 >= '\u21A1' && LA1_0 <= '\u21A2')||(LA1_0 >= '\u21A4' && LA1_0 <= '\u21A5')||(LA1_0 >= '\u21A7' && LA1_0 <= '\u21AD')||(LA1_0 >= '\u21AF' && LA1_0 <= '\u21CD')||(LA1_0 >= '\u21D0' && LA1_0 <= '\u21D1')||LA1_0=='\u21D3'||(LA1_0 >= '\u21D5' && LA1_0 <= '\u21F3')||(LA1_0 >= '\u2300' && LA1_0 <= '\u2307')||(LA1_0 >= '\u230C' && LA1_0 <= '\u231F')||(LA1_0 >= '\u2322' && LA1_0 <= '\u2328')||(LA1_0 >= '\u232B' && LA1_0 <= '\u237B')||(LA1_0 >= '\u237D' && LA1_0 <= '\u239A')||(LA1_0 >= '\u23B4' && LA1_0 <= '\u23DB')||(LA1_0 >= '\u23E2' && LA1_0 <= '\u23F3')||(LA1_0 >= '\u2400' && LA1_0 <= '\u2426')||(LA1_0 >= '\u2440' && LA1_0 <= '\u244A')||(LA1_0 >= '\u249C' && LA1_0 <= '\u24E9')||(LA1_0 >= '\u2500' && LA1_0 <= '\u25B6')||(LA1_0 >= '\u25B8' && LA1_0 <= '\u25C0')||(LA1_0 >= '\u25C2' && LA1_0 <= '\u25F7')||(LA1_0 >= '\u2600' && LA1_0 <= '\u266E')||(LA1_0 >= '\u2670' && LA1_0 <= '\u26FF')||(LA1_0 >= '\u2701' && LA1_0 <= '\u2767')||(LA1_0 >= '\u2794' && LA1_0 <= '\u27BF')||(LA1_0 >= '\u2800' && LA1_0 <= '\u28FF')||(LA1_0 >= '\u2B00' && LA1_0 <= '\u2B2F')||(LA1_0 >= '\u2B45' && LA1_0 <= '\u2B46')||(LA1_0 >= '\u2B50' && LA1_0 <= '\u2B59')||(LA1_0 >= '\u2CE5' && LA1_0 <= '\u2CEA')||(LA1_0 >= '\u2E80' && LA1_0 <= '\u2E99')||(LA1_0 >= '\u2E9B' && LA1_0 <= '\u2EF3')||(LA1_0 >= '\u2F00' && LA1_0 <= '\u2FD5')||(LA1_0 >= '\u2FF0' && LA1_0 <= '\u2FFB')||LA1_0=='\u3004'||(LA1_0 >= '\u3012' && LA1_0 <= '\u3013')||LA1_0=='\u3020'||(LA1_0 >= '\u3036' && LA1_0 <= '\u3037')||(LA1_0 >= '\u303E' && LA1_0 <= '\u303F')||(LA1_0 >= '\u3190' && LA1_0 <= '\u3191')||(LA1_0 >= '\u3196' && LA1_0 <= '\u319F')||(LA1_0 >= '\u31C0' && LA1_0 <= '\u31E3')||(LA1_0 >= '\u3200' && LA1_0 <= '\u321E')||(LA1_0 >= '\u322A' && LA1_0 <= '\u3247')||LA1_0=='\u3250'||(LA1_0 >= '\u3260' && LA1_0 <= '\u327F')||(LA1_0 >= '\u328A' && LA1_0 <= '\u32B0')||(LA1_0 >= '\u32C0' && LA1_0 <= '\u32FE')||(LA1_0 >= '\u3300' && LA1_0 <= '\u33FF')||(LA1_0 >= '\u4DC0' && LA1_0 <= '\u4DFF')||(LA1_0 >= '\uA490' && LA1_0 <= '\uA4C6')||(LA1_0 >= '\uA828' && LA1_0 <= '\uA82B')||(LA1_0 >= '\uA836' && LA1_0 <= '\uA837')||LA1_0=='\uA839'||(LA1_0 >= '\uAA77' && LA1_0 <= '\uAA79')||LA1_0=='\uFDFD'||LA1_0=='\uFFE4'||LA1_0=='\uFFE8'||(LA1_0 >= '\uFFED' && LA1_0 <= '\uFFEE')||(LA1_0 >= '\uFFFC' && LA1_0 <= '\uFFFD')) ) {
            alt1=26;
        }
        else if ( (LA1_0=='\u2028') ) {
            alt1=27;
        }
        else if ( (LA1_0=='\u2029') ) {
            alt1=28;
        }
        else if ( (LA1_0==' '||LA1_0=='\u00A0'||LA1_0=='\u1680'||LA1_0=='\u180E'||(LA1_0 >= '\u2000' && LA1_0 <= '\u200A')||LA1_0=='\u202F'||LA1_0=='\u205F'||LA1_0=='\u3000') ) {
            alt1=29;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }
        switch (alt1) {
            case 1 :
                // Unicode.g:1:10: UNICODE_CLASS_CC
                {
                mUNICODE_CLASS_CC(); 


                }
                break;
            case 2 :
                // Unicode.g:1:27: UNICODE_CLASS_CF
                {
                mUNICODE_CLASS_CF(); 


                }
                break;
            case 3 :
                // Unicode.g:1:44: UNICODE_CLASS_CO
                {
                mUNICODE_CLASS_CO(); 


                }
                break;
            case 4 :
                // Unicode.g:1:61: UNICODE_CLASS_CS
                {
                mUNICODE_CLASS_CS(); 


                }
                break;
            case 5 :
                // Unicode.g:1:78: UNICODE_CLASS_LL
                {
                mUNICODE_CLASS_LL(); 


                }
                break;
            case 6 :
                // Unicode.g:1:95: UNICODE_CLASS_LM
                {
                mUNICODE_CLASS_LM(); 


                }
                break;
            case 7 :
                // Unicode.g:1:112: UNICODE_CLASS_LO
                {
                mUNICODE_CLASS_LO(); 


                }
                break;
            case 8 :
                // Unicode.g:1:129: UNICODE_CLASS_LT
                {
                mUNICODE_CLASS_LT(); 


                }
                break;
            case 9 :
                // Unicode.g:1:146: UNICODE_CLASS_LU
                {
                mUNICODE_CLASS_LU(); 


                }
                break;
            case 10 :
                // Unicode.g:1:163: UNICODE_CLASS_MC
                {
                mUNICODE_CLASS_MC(); 


                }
                break;
            case 11 :
                // Unicode.g:1:180: UNICODE_CLASS_ME
                {
                mUNICODE_CLASS_ME(); 


                }
                break;
            case 12 :
                // Unicode.g:1:197: UNICODE_CLASS_MN
                {
                mUNICODE_CLASS_MN(); 


                }
                break;
            case 13 :
                // Unicode.g:1:214: UNICODE_CLASS_ND
                {
                mUNICODE_CLASS_ND(); 


                }
                break;
            case 14 :
                // Unicode.g:1:231: UNICODE_CLASS_NL
                {
                mUNICODE_CLASS_NL(); 


                }
                break;
            case 15 :
                // Unicode.g:1:248: UNICODE_CLASS_NO
                {
                mUNICODE_CLASS_NO(); 


                }
                break;
            case 16 :
                // Unicode.g:1:265: UNICODE_CLASS_PC
                {
                mUNICODE_CLASS_PC(); 


                }
                break;
            case 17 :
                // Unicode.g:1:282: UNICODE_CLASS_PD
                {
                mUNICODE_CLASS_PD(); 


                }
                break;
            case 18 :
                // Unicode.g:1:299: UNICODE_CLASS_PE
                {
                mUNICODE_CLASS_PE(); 


                }
                break;
            case 19 :
                // Unicode.g:1:316: UNICODE_CLASS_PF
                {
                mUNICODE_CLASS_PF(); 


                }
                break;
            case 20 :
                // Unicode.g:1:333: UNICODE_CLASS_PI
                {
                mUNICODE_CLASS_PI(); 


                }
                break;
            case 21 :
                // Unicode.g:1:350: UNICODE_CLASS_PO
                {
                mUNICODE_CLASS_PO(); 


                }
                break;
            case 22 :
                // Unicode.g:1:367: UNICODE_CLASS_PS
                {
                mUNICODE_CLASS_PS(); 


                }
                break;
            case 23 :
                // Unicode.g:1:384: UNICODE_CLASS_SC
                {
                mUNICODE_CLASS_SC(); 


                }
                break;
            case 24 :
                // Unicode.g:1:401: UNICODE_CLASS_SK
                {
                mUNICODE_CLASS_SK(); 


                }
                break;
            case 25 :
                // Unicode.g:1:418: UNICODE_CLASS_SM
                {
                mUNICODE_CLASS_SM(); 


                }
                break;
            case 26 :
                // Unicode.g:1:435: UNICODE_CLASS_SO
                {
                mUNICODE_CLASS_SO(); 


                }
                break;
            case 27 :
                // Unicode.g:1:452: UNICODE_CLASS_ZL
                {
                mUNICODE_CLASS_ZL(); 


                }
                break;
            case 28 :
                // Unicode.g:1:469: UNICODE_CLASS_ZP
                {
                mUNICODE_CLASS_ZP(); 


                }
                break;
            case 29 :
                // Unicode.g:1:486: UNICODE_CLASS_ZS
                {
                mUNICODE_CLASS_ZS(); 


                }
                break;

        }

    }


 

}