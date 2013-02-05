// $ANTLR ANTLRVersion> CSharp4Parser.java generatedTimestamp>

  package lang.csharp4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused"})
public class CSharp4Parser extends Parser {
	public static final int
		T__148=3, T__147=4, T__146=5, T__145=6, T__144=7, T__143=8, T__142=9, 
		T__141=10, T__140=11, T__139=12, T__138=13, T__137=14, T__136=15, T__135=16, 
		T__134=17, T__133=18, T__132=19, T__131=20, T__130=21, T__129=22, T__128=23, 
		T__127=24, T__126=25, T__125=26, T__124=27, T__123=28, T__122=29, T__121=30, 
		T__120=31, T__119=32, T__118=33, T__117=34, T__116=35, T__115=36, T__114=37, 
		T__113=38, T__112=39, T__111=40, T__110=41, T__109=42, T__108=43, T__107=44, 
		T__106=45, T__105=46, T__104=47, T__103=48, T__102=49, T__101=50, T__100=51, 
		T__99=52, T__98=53, T__97=54, T__96=55, T__95=56, T__94=57, T__93=58, 
		T__92=59, T__91=60, T__90=61, T__89=62, T__88=63, T__87=64, T__86=65, 
		T__85=66, T__84=67, T__83=68, T__82=69, T__81=70, T__80=71, T__79=72, 
		T__78=73, T__77=74, T__76=75, T__75=76, T__74=77, T__73=78, T__72=79, 
		T__71=80, T__70=81, T__69=82, T__68=83, T__67=84, T__66=85, T__65=86, 
		T__64=87, T__63=88, T__62=89, T__61=90, T__60=91, T__59=92, T__58=93, 
		T__57=94, T__56=95, T__55=96, T__54=97, T__53=98, T__52=99, T__51=100, 
		T__50=101, T__49=102, T__48=103, T__47=104, T__46=105, T__45=106, T__44=107, 
		T__43=108, T__42=109, T__41=110, T__40=111, T__39=112, T__38=113, T__37=114, 
		T__36=115, T__35=116, T__34=117, T__33=118, T__32=119, T__31=120, T__30=121, 
		T__29=122, T__28=123, T__27=124, T__26=125, T__25=126, T__24=127, T__23=128, 
		T__22=129, T__21=130, T__20=131, T__19=132, T__18=133, T__17=134, T__16=135, 
		T__15=136, T__14=137, T__13=138, T__12=139, T__11=140, T__10=141, T__9=142, 
		T__8=143, T__7=144, T__6=145, T__5=146, T__4=147, T__3=148, T__2=149, 
		T__1=150, T__0=151, NEW_LINE=152, Comment=153, WHITESPACE=154, IDENTIFIER=155, 
		BOOLEAN_LITERAL=156, INTEGER_LITERAL=157, REAL_LITERAL=158, CHARACTER_LITERAL=159, 
		STRING_LITERAL=160, NULL_LITERAL=161, OPERATOR_OR_PUNCTUATOR=162, RIGHT_SHIFT=163, 
		RIGHT_SHIFT_ASSIGNMENT=164, QUOTE=165, BACK_SLASH=166, DOUBLE_BACK_SLASH=167, 
		INTERR=168, STAR=169, VOID=170;
	public static final String[] tokenNames = {
		"<INVALID>", "<INVALID>", "<INVALID>",
		"from", "implicit", "interface", "yield", "param", "false", "ushort", 
		"double", "namespace", "by", "partial", "abstract", "ulong", "}", "float", 
		"char", "do", "unchecked", "*=", "descending", "on", ")", "::", "throw", 
		"group", "goto", "typeof", "params", "class", "|", "!", "foreach", "long", 
		"sizeof", "short", "-=", "get", "select", "in", ",", "while", "-", "if", 
		"int", "decimal", "private", "unsafe", "as", "set", "orderby", "readonly", 
		"break", "+=", "let", "^=", "assembly", "else", "true", "++", "struct", 
		"property", "byte", ".", "extern", "+", "&&", "||", ">", "%=", "switch", 
		"/=", "where", "/", "~", "out", "internal", "remove", "&", "into", "[", 
		"checked", "<", "--", "continue", "stackalloc", "!=", "<=", "<<", "delegate", 
		"override", "sbyte", "case", "uint", "->", "%", "bool", "fixed", "virtual", 
		"explicit", "right_shift", "object", "=", "module", "alias", "const", 
		"??", "|=", "new", "finally", "join", "enum", "<<=", "]", "using", "default", 
		"public", "(", "ref", ":", "&=", "dynamic", "var", "try", "{", "method", 
		"equals", "catch", "add", "static", "ascending", "^", "is", "lock", "=>", 
		"for", "protected", "sealed", "operator", "return", "base", ";", "volatile", 
		"field", "this", "event", "type", "string", "==", ">=", "NEW_LINE", "Comment", 
		"WHITESPACE", "IDENTIFIER", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", 
		"CHARACTER_LITERAL", "STRING_LITERAL", "null", "OPERATOR_OR_PUNCTUATOR", 
		">>", ">>=", "'", "\\", "\\\\", "?", "*", "void"
	};
	public static final int
		RULE_namespace_name = 0, RULE_type_name = 1, RULE_namespace_or_type_name = 2, 
		RULE_type = 3, RULE_value_type = 4, RULE_struct_type = 5, RULE_simple_type = 6, 
		RULE_numeric_type = 7, RULE_integral_type = 8, RULE_floating_point_type = 9, 
		RULE_nullable_type = 10, RULE_non_nullable_value_type = 11, RULE_enum_type = 12, 
		RULE_reference_type = 13, RULE_class_type = 14, RULE_interface_type = 15, 
		RULE_delegate_type = 16, RULE_type_argument_list = 17, RULE_type_arguments = 18, 
		RULE_type_argument = 19, RULE_variable_reference = 20, RULE_argument_list = 21, 
		RULE_argument = 22, RULE_argument_name = 23, RULE_argument_value = 24, 
		RULE_primary_expression = 25, RULE_primary_no_array_creation_expression = 26, 
		RULE_simple_name = 27, RULE_parenthesized_expression = 28, RULE_member_access = 29, 
		RULE_predefined_type = 30, RULE_invocation_expression = 31, RULE_element_access = 32, 
		RULE_expression_list = 33, RULE_this_access = 34, RULE_base_access = 35, 
		RULE_post_increment_expression = 36, RULE_post_decrement_expression = 37, 
		RULE_object_creation_expression = 38, RULE_object_or_collection_initializer = 39, 
		RULE_object_initializer = 40, RULE_member_initializer_list = 41, RULE_member_initializer = 42, 
		RULE_initializer_value = 43, RULE_collection_initializer = 44, RULE_element_initializer_list = 45, 
		RULE_element_initializer = 46, RULE_array_creation_expression = 47, RULE_delegate_creation_expression = 48, 
		RULE_anonymous_object_creation_expression = 49, RULE_anonymous_object_initializer = 50, 
		RULE_member_declarator_list = 51, RULE_member_declarator = 52, RULE_typeof_expression = 53, 
		RULE_unbound_type_name = 54, RULE_generic_dimension_specifier = 55, RULE_commas = 56, 
		RULE_checked_expression = 57, RULE_unchecked_expression = 58, RULE_default_value_expression = 59, 
		RULE_unary_expression = 60, RULE_pre_increment_expression = 61, RULE_pre_decrement_expression = 62, 
		RULE_cast_expression = 63, RULE_multiplicative_expression = 64, RULE_additive_expression = 65, 
		RULE_shift_expression = 66, RULE_relational_expression = 67, RULE_equality_expression = 68, 
		RULE_and_expression = 69, RULE_exclusive_or_expression = 70, RULE_inclusive_or_expression = 71, 
		RULE_conditional_and_expression = 72, RULE_conditional_or_expression = 73, 
		RULE_null_coalescing_expression = 74, RULE_conditional_expression = 75, 
		RULE_lambda_expression = 76, RULE_anonymous_method_expression = 77, RULE_anonymous_function_signature = 78, 
		RULE_explicit_anonymous_function_signature = 79, RULE_explicit_anonymous_function_parameter_list = 80, 
		RULE_explicit_anonymous_function_parameter = 81, RULE_anonymous_function_parameter_modifier = 82, 
		RULE_implicit_anonymous_function_signature = 83, RULE_implicit_anonymous_function_parameter_list = 84, 
		RULE_implicit_anonymous_function_parameter = 85, RULE_anonymous_function_body = 86, 
		RULE_query_expression = 87, RULE_from_clause = 88, RULE_query_body = 89, 
		RULE_query_body_clauses = 90, RULE_query_body_clause = 91, RULE_let_clause = 92, 
		RULE_where_clause = 93, RULE_join_clause = 94, RULE_join_into_clause = 95, 
		RULE_orderby_clause = 96, RULE_orderings = 97, RULE_ordering = 98, RULE_ordering_direction = 99, 
		RULE_select_or_group_clause = 100, RULE_select_clause = 101, RULE_group_clause = 102, 
		RULE_query_continuation = 103, RULE_assignment = 104, RULE_assignment_operator = 105, 
		RULE_expression = 106, RULE_non_assignment_expression = 107, RULE_constant_expression = 108, 
		RULE_boolean_expression = 109, RULE_statement = 110, RULE_embedded_statement = 111, 
		RULE_block = 112, RULE_statement_list = 113, RULE_empty_statement = 114, 
		RULE_labeled_statement = 115, RULE_declaration_statement = 116, RULE_local_variable_declaration = 117, 
		RULE_local_variable_type = 118, RULE_local_variable_declarators = 119, 
		RULE_local_variable_declarator = 120, RULE_local_variable_initializer = 121, 
		RULE_local_constant_declaration = 122, RULE_expression_statement = 123, 
		RULE_statement_expression = 124, RULE_selection_statement = 125, RULE_if_statement = 126, 
		RULE_switch_statement = 127, RULE_switch_block = 128, RULE_switch_sections = 129, 
		RULE_switch_section = 130, RULE_switch_labels = 131, RULE_switch_label = 132, 
		RULE_iteration_statement = 133, RULE_while_statement = 134, RULE_do_statement = 135, 
		RULE_for_statement = 136, RULE_for_initializer = 137, RULE_for_condition = 138, 
		RULE_for_iterator = 139, RULE_statement_expression_list = 140, RULE_foreach_statement = 141, 
		RULE_jump_statement = 142, RULE_break_statement = 143, RULE_continue_statement = 144, 
		RULE_goto_statement = 145, RULE_return_statement = 146, RULE_throw_statement = 147, 
		RULE_try_statement = 148, RULE_catch_clauses = 149, RULE_specific_catch_clauses = 150, 
		RULE_specific_catch_clause = 151, RULE_general_catch_clause = 152, RULE_finally_clause = 153, 
		RULE_checked_statement = 154, RULE_unchecked_statement = 155, RULE_lock_statement = 156, 
		RULE_using_statement = 157, RULE_resource_acquisition = 158, RULE_yield_statement = 159, 
		RULE_compilation_unit = 160, RULE_namespace_declaration = 161, RULE_qualified_identifier = 162, 
		RULE_namespace_body = 163, RULE_extern_alias_directives = 164, RULE_extern_alias_directive = 165, 
		RULE_using_directives = 166, RULE_using_directive = 167, RULE_using_alias_directive = 168, 
		RULE_using_namespace_directive = 169, RULE_namespace_member_declarations = 170, 
		RULE_namespace_member_declaration = 171, RULE_type_declaration = 172, 
		RULE_qualified_alias_member = 173, RULE_class_declaration = 174, RULE_class_modifiers = 175, 
		RULE_class_modifier = 176, RULE_type_parameter_list = 177, RULE_type_parameters = 178, 
		RULE_type_parameter = 179, RULE_class_base = 180, RULE_interface_type_list = 181, 
		RULE_type_parameter_constraints_clauses = 182, RULE_type_parameter_constraints_clause = 183, 
		RULE_type_parameter_constraints = 184, RULE_primary_constraint = 185, 
		RULE_secondary_constraints = 186, RULE_constructor_constraint = 187, RULE_class_body = 188, 
		RULE_class_member_declarations = 189, RULE_class_member_declaration = 190, 
		RULE_constant_declaration = 191, RULE_constant_modifiers = 192, RULE_constant_modifier = 193, 
		RULE_constant_declarators = 194, RULE_constant_declarator = 195, RULE_field_declaration = 196, 
		RULE_field_modifiers = 197, RULE_field_modifier = 198, RULE_variable_declarators = 199, 
		RULE_variable_declarator = 200, RULE_variable_initializer = 201, RULE_method_declaration = 202, 
		RULE_method_header = 203, RULE_method_modifiers = 204, RULE_method_modifier = 205, 
		RULE_return_type = 206, RULE_member_name = 207, RULE_method_body = 208, 
		RULE_formal_parameter_list = 209, RULE_fixed_parameters = 210, RULE_fixed_parameter = 211, 
		RULE_default_argument = 212, RULE_parameter_modifier = 213, RULE_parameter_array = 214, 
		RULE_property_declaration = 215, RULE_property_modifiers = 216, RULE_property_modifier = 217, 
		RULE_accessor_declarations = 218, RULE_get_accessor_declaration = 219, 
		RULE_set_accessor_declaration = 220, RULE_accessor_modifier = 221, RULE_accessor_body = 222, 
		RULE_event_declaration = 223, RULE_event_modifiers = 224, RULE_event_modifier = 225, 
		RULE_event_accessor_declarations = 226, RULE_add_accessor_declaration = 227, 
		RULE_remove_accessor_declaration = 228, RULE_indexer_declaration = 229, 
		RULE_indexer_modifiers = 230, RULE_indexer_modifier = 231, RULE_indexer_declarator = 232, 
		RULE_operator_declaration = 233, RULE_operator_modifiers = 234, RULE_operator_modifier = 235, 
		RULE_operator_declarator = 236, RULE_unary_operator_declarator = 237, 
		RULE_overloadable_unary_operator = 238, RULE_binary_operator_declarator = 239, 
		RULE_overloadable_binary_operator = 240, RULE_conversion_operator_declarator = 241, 
		RULE_operator_body = 242, RULE_constructor_declaration = 243, RULE_constructor_modifiers = 244, 
		RULE_constructor_modifier = 245, RULE_constructor_declarator = 246, RULE_constructor_initializer = 247, 
		RULE_constructor_body = 248, RULE_static_constructor_declaration = 249, 
		RULE_static_constructor_modifiers = 250, RULE_static_constructor_body = 251, 
		RULE_destructor_declaration = 252, RULE_destructor_body = 253, RULE_struct_declaration = 254, 
		RULE_struct_modifiers = 255, RULE_struct_modifier = 256, RULE_struct_interfaces = 257, 
		RULE_struct_body = 258, RULE_struct_member_declarations = 259, RULE_struct_member_declaration = 260, 
		RULE_array_type = 261, RULE_non_array_type = 262, RULE_rank_specifiers = 263, 
		RULE_rank_specifier = 264, RULE_dim_separators = 265, RULE_array_initializer = 266, 
		RULE_variable_initializer_list = 267, RULE_interface_declaration = 268, 
		RULE_interface_modifiers = 269, RULE_interface_modifier = 270, RULE_variant_type_parameter_list = 271, 
		RULE_variant_type_parameters = 272, RULE_variance_annotation = 273, RULE_interface_base = 274, 
		RULE_interface_body = 275, RULE_interface_member_declarations = 276, RULE_interface_member_declaration = 277, 
		RULE_interface_method_declaration = 278, RULE_interface_property_declaration = 279, 
		RULE_interface_accessors = 280, RULE_interface_event_declaration = 281, 
		RULE_interface_indexer_declaration = 282, RULE_enum_declaration = 283, 
		RULE_enum_base = 284, RULE_enum_body = 285, RULE_enum_modifiers = 286, 
		RULE_enum_modifier = 287, RULE_enum_member_declarations = 288, RULE_enum_member_declaration = 289, 
		RULE_delegate_declaration = 290, RULE_delegate_modifiers = 291, RULE_delegate_modifier = 292, 
		RULE_global_attributes = 293, RULE_global_attribute_sections = 294, RULE_global_attribute_section = 295, 
		RULE_global_attribute_target_specifier = 296, RULE_global_attribute_target = 297, 
		RULE_attributes = 298, RULE_attribute_sections = 299, RULE_attribute_section = 300, 
		RULE_attribute_target_specifier = 301, RULE_attribute_target = 302, RULE_attribute_list = 303, 
		RULE_attribute = 304, RULE_attribute_name = 305, RULE_attribute_arguments = 306, 
		RULE_positional_argument_list = 307, RULE_positional_argument = 308, RULE_named_argument_list = 309, 
		RULE_named_argument = 310, RULE_attribute_argument_expression = 311, RULE_class_modifier_unsafe = 312, 
		RULE_struct_modifier_unsafe = 313, RULE_interface_modifier_unsafe = 314, 
		RULE_delegate_modifier_unsafe = 315, RULE_field_modifier_unsafe = 316, 
		RULE_method_modifier_unsafe = 317, RULE_property_modifier_unsafe = 318, 
		RULE_event_modifier_unsafe = 319, RULE_indexer_modifier_unsafe = 320, 
		RULE_operator_modifier_unsafe = 321, RULE_constructor_modifier_unsafe = 322, 
		RULE_destructor_declaration_unsafe = 323, RULE_static_constructor_modifiers_unsafe = 324, 
		RULE_embedded_statement_unsafe = 325, RULE_unsafe_statement = 326, RULE_type_unsafe = 327, 
		RULE_pointer_type = 328, RULE_unmanaged_type = 329, RULE_primary_no_array_creation_expression_unsafe = 330, 
		RULE_unary_expression_unsafe = 331, RULE_pointer_indirection_expression = 332, 
		RULE_pointer_member_access = 333, RULE_pointer_element_access = 334, RULE_addressof_expression = 335, 
		RULE_sizeof_expression = 336, RULE_fixed_statement = 337, RULE_fixed_pointer_declarators = 338, 
		RULE_fixed_pointer_declarator = 339, RULE_fixed_pointer_initializer = 340, 
		RULE_struct_member_declaration_unsafe = 341, RULE_fixed_size_buffer_declaration = 342, 
		RULE_fixed_size_buffer_modifiers = 343, RULE_fixed_size_buffer_modifier = 344, 
		RULE_buffer_element_type = 345, RULE_fixed_size_buffer_declarators = 346, 
		RULE_fixed_size_buffer_declarator = 347, RULE_local_variable_initializer_unsafe = 348, 
		RULE_stackalloc_initializer = 349, RULE_literal = 350;
	public static final String[] ruleNames = {
		"namespace_name", "type_name", "namespace_or_type_name", "type", "value_type", 
		"struct_type", "simple_type", "numeric_type", "integral_type", "floating_point_type", 
		"nullable_type", "non_nullable_value_type", "enum_type", "reference_type", 
		"class_type", "interface_type", "delegate_type", "type_argument_list", 
		"type_arguments", "type_argument", "variable_reference", "argument_list", 
		"argument", "argument_name", "argument_value", "primary_expression", "primary_no_array_creation_expression", 
		"simple_name", "parenthesized_expression", "member_access", "predefined_type", 
		"invocation_expression", "element_access", "expression_list", "this_access", 
		"base_access", "post_increment_expression", "post_decrement_expression", 
		"object_creation_expression", "object_or_collection_initializer", "object_initializer", 
		"member_initializer_list", "member_initializer", "initializer_value", 
		"collection_initializer", "element_initializer_list", "element_initializer", 
		"array_creation_expression", "delegate_creation_expression", "anonymous_object_creation_expression", 
		"anonymous_object_initializer", "member_declarator_list", "member_declarator", 
		"typeof_expression", "unbound_type_name", "generic_dimension_specifier", 
		"commas", "checked_expression", "unchecked_expression", "default_value_expression", 
		"unary_expression", "pre_increment_expression", "pre_decrement_expression", 
		"cast_expression", "multiplicative_expression", "additive_expression", 
		"shift_expression", "relational_expression", "equality_expression", "and_expression", 
		"exclusive_or_expression", "inclusive_or_expression", "conditional_and_expression", 
		"conditional_or_expression", "null_coalescing_expression", "conditional_expression", 
		"lambda_expression", "anonymous_method_expression", "anonymous_function_signature", 
		"explicit_anonymous_function_signature", "explicit_anonymous_function_parameter_list", 
		"explicit_anonymous_function_parameter", "anonymous_function_parameter_modifier", 
		"implicit_anonymous_function_signature", "implicit_anonymous_function_parameter_list", 
		"implicit_anonymous_function_parameter", "anonymous_function_body", "query_expression", 
		"from_clause", "query_body", "query_body_clauses", "query_body_clause", 
		"let_clause", "where_clause", "join_clause", "join_into_clause", "orderby_clause", 
		"orderings", "ordering", "ordering_direction", "select_or_group_clause", 
		"select_clause", "group_clause", "query_continuation", "assignment", "assignment_operator", 
		"expression", "non_assignment_expression", "constant_expression", "boolean_expression", 
		"statement", "embedded_statement", "block", "statement_list", "empty_statement", 
		"labeled_statement", "declaration_statement", "local_variable_declaration", 
		"local_variable_type", "local_variable_declarators", "local_variable_declarator", 
		"local_variable_initializer", "local_constant_declaration", "expression_statement", 
		"statement_expression", "selection_statement", "if_statement", "switch_statement", 
		"switch_block", "switch_sections", "switch_section", "switch_labels", 
		"switch_label", "iteration_statement", "while_statement", "do_statement", 
		"for_statement", "for_initializer", "for_condition", "for_iterator", "statement_expression_list", 
		"foreach_statement", "jump_statement", "break_statement", "continue_statement", 
		"goto_statement", "return_statement", "throw_statement", "try_statement", 
		"catch_clauses", "specific_catch_clauses", "specific_catch_clause", "general_catch_clause", 
		"finally_clause", "checked_statement", "unchecked_statement", "lock_statement", 
		"using_statement", "resource_acquisition", "yield_statement", "compilation_unit", 
		"namespace_declaration", "qualified_identifier", "namespace_body", "extern_alias_directives", 
		"extern_alias_directive", "using_directives", "using_directive", "using_alias_directive", 
		"using_namespace_directive", "namespace_member_declarations", "namespace_member_declaration", 
		"type_declaration", "qualified_alias_member", "class_declaration", "class_modifiers", 
		"class_modifier", "type_parameter_list", "type_parameters", "type_parameter", 
		"class_base", "interface_type_list", "type_parameter_constraints_clauses", 
		"type_parameter_constraints_clause", "type_parameter_constraints", "primary_constraint", 
		"secondary_constraints", "constructor_constraint", "class_body", "class_member_declarations", 
		"class_member_declaration", "constant_declaration", "constant_modifiers", 
		"constant_modifier", "constant_declarators", "constant_declarator", "field_declaration", 
		"field_modifiers", "field_modifier", "variable_declarators", "variable_declarator", 
		"variable_initializer", "method_declaration", "method_header", "method_modifiers", 
		"method_modifier", "return_type", "member_name", "method_body", "formal_parameter_list", 
		"fixed_parameters", "fixed_parameter", "default_argument", "parameter_modifier", 
		"parameter_array", "property_declaration", "property_modifiers", "property_modifier", 
		"accessor_declarations", "get_accessor_declaration", "set_accessor_declaration", 
		"accessor_modifier", "accessor_body", "event_declaration", "event_modifiers", 
		"event_modifier", "event_accessor_declarations", "add_accessor_declaration", 
		"remove_accessor_declaration", "indexer_declaration", "indexer_modifiers", 
		"indexer_modifier", "indexer_declarator", "operator_declaration", "operator_modifiers", 
		"operator_modifier", "operator_declarator", "unary_operator_declarator", 
		"overloadable_unary_operator", "binary_operator_declarator", "overloadable_binary_operator", 
		"conversion_operator_declarator", "operator_body", "constructor_declaration", 
		"constructor_modifiers", "constructor_modifier", "constructor_declarator", 
		"constructor_initializer", "constructor_body", "static_constructor_declaration", 
		"static_constructor_modifiers", "static_constructor_body", "destructor_declaration", 
		"destructor_body", "struct_declaration", "struct_modifiers", "struct_modifier", 
		"struct_interfaces", "struct_body", "struct_member_declarations", "struct_member_declaration", 
		"array_type", "non_array_type", "rank_specifiers", "rank_specifier", "dim_separators", 
		"array_initializer", "variable_initializer_list", "interface_declaration", 
		"interface_modifiers", "interface_modifier", "variant_type_parameter_list", 
		"variant_type_parameters", "variance_annotation", "interface_base", "interface_body", 
		"interface_member_declarations", "interface_member_declaration", "interface_method_declaration", 
		"interface_property_declaration", "interface_accessors", "interface_event_declaration", 
		"interface_indexer_declaration", "enum_declaration", "enum_base", "enum_body", 
		"enum_modifiers", "enum_modifier", "enum_member_declarations", "enum_member_declaration", 
		"delegate_declaration", "delegate_modifiers", "delegate_modifier", "global_attributes", 
		"global_attribute_sections", "global_attribute_section", "global_attribute_target_specifier", 
		"global_attribute_target", "attributes", "attribute_sections", "attribute_section", 
		"attribute_target_specifier", "attribute_target", "attribute_list", "attribute", 
		"attribute_name", "attribute_arguments", "positional_argument_list", "positional_argument", 
		"named_argument_list", "named_argument", "attribute_argument_expression", 
		"class_modifier_unsafe", "struct_modifier_unsafe", "interface_modifier_unsafe", 
		"delegate_modifier_unsafe", "field_modifier_unsafe", "method_modifier_unsafe", 
		"property_modifier_unsafe", "event_modifier_unsafe", "indexer_modifier_unsafe", 
		"operator_modifier_unsafe", "constructor_modifier_unsafe", "destructor_declaration_unsafe", 
		"static_constructor_modifiers_unsafe", "embedded_statement_unsafe", "unsafe_statement", 
		"type_unsafe", "pointer_type", "unmanaged_type", "primary_no_array_creation_expression_unsafe", 
		"unary_expression_unsafe", "pointer_indirection_expression", "pointer_member_access", 
		"pointer_element_access", "addressof_expression", "sizeof_expression", 
		"fixed_statement", "fixed_pointer_declarators", "fixed_pointer_declarator", 
		"fixed_pointer_initializer", "struct_member_declaration_unsafe", "fixed_size_buffer_declaration", 
		"fixed_size_buffer_modifiers", "fixed_size_buffer_modifier", "buffer_element_type", 
		"fixed_size_buffer_declarators", "fixed_size_buffer_declarator", "local_variable_initializer_unsafe", 
		"stackalloc_initializer", "literal"
	};
	public CSharp4Parser(TokenStream input) {
		super(input);
		_interp = new v2ParserATNSimulator<Token>(this,_ATN);
	}
	public static class namespace_nameContext extends ParserRuleContext<Token> {
		public namespace_nameContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final namespace_nameContext namespace_name() throws RecognitionException {
		namespace_nameContext _localctx = new namespace_nameContext(_ctx, 0);
		enterRule(_localctx, RULE_namespace_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702); namespace_or_type_name();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class type_nameContext extends ParserRuleContext<Token> {
		public type_nameContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final type_nameContext type_name() throws RecognitionException {
		type_nameContext _localctx = new type_nameContext(_ctx, 2);
		enterRule(_localctx, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704); namespace_or_type_name();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class namespace_or_type_nameContext extends ParserRuleContext<Token> {
		public namespace_or_type_nameContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final namespace_or_type_nameContext namespace_or_type_name() throws RecognitionException {
		namespace_or_type_nameContext _localctx = new namespace_or_type_nameContext(_ctx, 4);
		enterRule(_localctx, RULE_namespace_or_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(706); match(IDENTIFIER);
					setState(710);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
						case 1:
							{
							setState(708); type_argument_list();
							}
							break;
					}
					}
					break;
				case 2:
					{
					setState(712); qualified_alias_member();
					}
					break;
			}
			setState(726);
			_errHandler.sync(this);
			int _alt74 = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt74!=2 && _alt74!=-1 ) {
			    if ( _alt74==1 ) {
			        {
			        {
			        setState(716); match(65);
			        setState(718); match(IDENTIFIER);
			        setState(722);
			        //_errHandler.sync(this);
			        switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			        	case 1:
			        		{
			        		setState(720); type_argument_list();
			        		}
			        		break;
			        }
			        }
			        } 
			    }
				setState(728);
				_errHandler.sync(this);
				_alt74 = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class typeContext extends ParserRuleContext<Token> {
		public typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final typeContext type() throws RecognitionException {
		typeContext _localctx = new typeContext(_ctx, 6);
		enterRule(_localctx, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(729); type_name();
					}
					break;
				case 2:
					{
					setState(731); simple_type();
					}
					break;
				case 3:
					{
					setState(733); enum_type();
					}
					break;
				case 4:
					{
					setState(735); class_type();
					}
					break;
				case 5:
					{
					setState(737); interface_type();
					}
					break;
				case 6:
					{
					setState(739); delegate_type();
					}
					break;
				case 7:
					{
					setState(741); type_parameter();
					}
					break;
				case 8:
					{
					setState(743); match(VOID);
					setState(745); match(STAR);
					}
					break;
			}
			setState(757);
			_errHandler.sync(this);
			int _alt133 = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt133!=2 && _alt133!=-1 ) {
			    if ( _alt133==1 ) {
			        {
			        setState(755);
			        //_errHandler.sync(this);
			        switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			        	case 1:
			        		{
			        		setState(749); match(INTERR);
			        		}
			        		break;
			        	case 2:
			        		{
			        		setState(751); rank_specifier();
			        		}
			        		break;
			        	case 3:
			        		{
			        		setState(753); match(STAR);
			        		}
			        		break;
			        }
			        } 
			    }
				setState(759);
				_errHandler.sync(this);
				_alt133 = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class value_typeContext extends ParserRuleContext<Token> {
		public value_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final value_typeContext value_type() throws RecognitionException {
		value_typeContext _localctx = new value_typeContext(_ctx, 8);
		enterRule(_localctx, RULE_value_type);
		try {
			setState(764);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(760); struct_type();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(762); enum_type();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class struct_typeContext extends ParserRuleContext<Token> {
		public struct_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final struct_typeContext struct_type() throws RecognitionException {
		struct_typeContext _localctx = new struct_typeContext(_ctx, 10);
		enterRule(_localctx, RULE_struct_type);
		try {
			setState(772);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(766); type_name();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(768); simple_type();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(770); nullable_type();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class simple_typeContext extends ParserRuleContext<Token> {
		public simple_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final simple_typeContext simple_type() throws RecognitionException {
		simple_typeContext _localctx = new simple_typeContext(_ctx, 12);
		enterRule(_localctx, RULE_simple_type);
		try {
			setState(778);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(774); numeric_type();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(776); match(98);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class numeric_typeContext extends ParserRuleContext<Token> {
		public numeric_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final numeric_typeContext numeric_type() throws RecognitionException {
		numeric_typeContext _localctx = new numeric_typeContext(_ctx, 14);
		enterRule(_localctx, RULE_numeric_type);
		try {
			setState(786);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(780); integral_type();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(782); floating_point_type();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(784); match(47);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class integral_typeContext extends ParserRuleContext<Token> {
		public integral_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final integral_typeContext integral_type() throws RecognitionException {
		integral_typeContext _localctx = new integral_typeContext(_ctx, 16);
		enterRule(_localctx, RULE_integral_type);
		try {
			setState(806);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 93:
					enterOuterAlt(_localctx, 1);
					{
					setState(788); match(93);
					}
					break;
				case 64:
					enterOuterAlt(_localctx, 2);
					{
					setState(790); match(64);
					}
					break;
				case 37:
					enterOuterAlt(_localctx, 3);
					{
					setState(792); match(37);
					}
					break;
				case 9:
					enterOuterAlt(_localctx, 4);
					{
					setState(794); match(9);
					}
					break;
				case 46:
					enterOuterAlt(_localctx, 5);
					{
					setState(796); match(46);
					}
					break;
				case 95:
					enterOuterAlt(_localctx, 6);
					{
					setState(798); match(95);
					}
					break;
				case 35:
					enterOuterAlt(_localctx, 7);
					{
					setState(800); match(35);
					}
					break;
				case 15:
					enterOuterAlt(_localctx, 8);
					{
					setState(802); match(15);
					}
					break;
				case 18:
					enterOuterAlt(_localctx, 9);
					{
					setState(804); match(18);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class floating_point_typeContext extends ParserRuleContext<Token> {
		public floating_point_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final floating_point_typeContext floating_point_type() throws RecognitionException {
		floating_point_typeContext _localctx = new floating_point_typeContext(_ctx, 18);
		enterRule(_localctx, RULE_floating_point_type);
		try {
			setState(812);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 17:
					enterOuterAlt(_localctx, 1);
					{
					setState(808); match(17);
					}
					break;
				case 10:
					enterOuterAlt(_localctx, 2);
					{
					setState(810); match(10);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class nullable_typeContext extends ParserRuleContext<Token> {
		public nullable_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final nullable_typeContext nullable_type() throws RecognitionException {
		nullable_typeContext _localctx = new nullable_typeContext(_ctx, 20);
		enterRule(_localctx, RULE_nullable_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814); non_nullable_value_type();
			setState(816); match(INTERR);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class non_nullable_value_typeContext extends ParserRuleContext<Token> {
		public non_nullable_value_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final non_nullable_value_typeContext non_nullable_value_type() throws RecognitionException {
		non_nullable_value_typeContext _localctx = new non_nullable_value_typeContext(_ctx, 22);
		enterRule(_localctx, RULE_non_nullable_value_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818); type();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class enum_typeContext extends ParserRuleContext<Token> {
		public enum_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final enum_typeContext enum_type() throws RecognitionException {
		enum_typeContext _localctx = new enum_typeContext(_ctx, 24);
		enterRule(_localctx, RULE_enum_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820); type_name();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class reference_typeContext extends ParserRuleContext<Token> {
		public reference_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final reference_typeContext reference_type() throws RecognitionException {
		reference_typeContext _localctx = new reference_typeContext(_ctx, 26);
		enterRule(_localctx, RULE_reference_type);
		try {
			setState(830);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(822); class_type();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(824); interface_type();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(826); array_type();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(828); delegate_type();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class class_typeContext extends ParserRuleContext<Token> {
		public class_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final class_typeContext class_type() throws RecognitionException {
		class_typeContext _localctx = new class_typeContext(_ctx, 28);
		enterRule(_localctx, RULE_class_type);
		try {
			setState(840);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(832); type_name();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(834); match(103);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(836); match(123);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(838); match(149);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_typeContext extends ParserRuleContext<Token> {
		public interface_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_typeContext interface_type() throws RecognitionException {
		interface_typeContext _localctx = new interface_typeContext(_ctx, 30);
		enterRule(_localctx, RULE_interface_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842); type_name();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class delegate_typeContext extends ParserRuleContext<Token> {
		public delegate_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final delegate_typeContext delegate_type() throws RecognitionException {
		delegate_typeContext _localctx = new delegate_typeContext(_ctx, 32);
		enterRule(_localctx, RULE_delegate_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844); type_name();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class type_argument_listContext extends ParserRuleContext<Token> {
		public type_argument_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final type_argument_listContext type_argument_list() throws RecognitionException {
		type_argument_listContext _localctx = new type_argument_listContext(_ctx, 34);
		enterRule(_localctx, RULE_type_argument_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846); match(84);
			setState(848); type_arguments();
			setState(850); match(70);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class type_argumentsContext extends ParserRuleContext<Token> {
		public type_argumentsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final type_argumentsContext type_arguments() throws RecognitionException {
		type_argumentsContext _localctx = new type_argumentsContext(_ctx, 36);
		enterRule(_localctx, RULE_type_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852); type_argument();
			setState(860);
			_errHandler.sync(this);
			int _alt351 = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt351!=2 && _alt351!=-1 ) {
			    if ( _alt351==1 ) {
			        {
			        {
			        setState(854); match(42);
			        setState(856); type_argument();
			        }
			        } 
			    }
				setState(862);
				_errHandler.sync(this);
				_alt351 = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class type_argumentContext extends ParserRuleContext<Token> {
		public type_argumentContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final type_argumentContext type_argument() throws RecognitionException {
		type_argumentContext _localctx = new type_argumentContext(_ctx, 38);
		enterRule(_localctx, RULE_type_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863); type();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class variable_referenceContext extends ParserRuleContext<Token> {
		public variable_referenceContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final variable_referenceContext variable_reference() throws RecognitionException {
		variable_referenceContext _localctx = new variable_referenceContext(_ctx, 40);
		enterRule(_localctx, RULE_variable_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865); expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class argument_listContext extends ParserRuleContext<Token> {
		public argument_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final argument_listContext argument_list() throws RecognitionException {
		argument_listContext _localctx = new argument_listContext(_ctx, 42);
		enterRule(_localctx, RULE_argument_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867); argument();
			setState(875);
			_errHandler.sync(this);
			int _alt387 = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt387!=2 && _alt387!=-1 ) {
			    if ( _alt387==1 ) {
			        {
			        {
			        setState(869); match(42);
			        setState(871); argument();
			        }
			        } 
			    }
				setState(877);
				_errHandler.sync(this);
				_alt387 = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class argumentContext extends ParserRuleContext<Token> {
		public argumentContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final argumentContext argument() throws RecognitionException {
		argumentContext _localctx = new argumentContext(_ctx, 44);
		enterRule(_localctx, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(878); argument_name();
					}
					break;
			}
			setState(882); argument_value();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class argument_nameContext extends ParserRuleContext<Token> {
		public argument_nameContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final argument_nameContext argument_name() throws RecognitionException {
		argument_nameContext _localctx = new argument_nameContext(_ctx, 46);
		enterRule(_localctx, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884); match(IDENTIFIER);
			setState(886); match(121);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class argument_valueContext extends ParserRuleContext<Token> {
		public argument_valueContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final argument_valueContext argument_value() throws RecognitionException {
		argument_valueContext _localctx = new argument_valueContext(_ctx, 48);
		enterRule(_localctx, RULE_argument_value);
		try {
			setState(898);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(888); expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(890); match(120);
					setState(892); variable_reference();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(894); match(77);
					setState(896); variable_reference();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class primary_expressionContext extends ParserRuleContext<Token> {
		public primary_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final primary_expressionContext primary_expression() throws RecognitionException {
		primary_expressionContext _localctx = new primary_expressionContext(_ctx, 50);
		enterRule(_localctx, RULE_primary_expression);
		try {
			setState(904);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(900); primary_no_array_creation_expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(902); array_creation_expression();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class primary_no_array_creation_expressionContext extends ParserRuleContext<Token> {
		public primary_no_array_creation_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final primary_no_array_creation_expressionContext primary_no_array_creation_expression() throws RecognitionException {
		primary_no_array_creation_expressionContext _localctx = new primary_no_array_creation_expressionContext(_ctx, 52);
		enterRule(_localctx, RULE_primary_no_array_creation_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(906); literal();
					}
					break;
				case 2:
					{
					setState(908); simple_name();
					}
					break;
				case 3:
					{
					setState(910); parenthesized_expression();
					}
					break;
				case 4:
					{
					setState(912); array_creation_expression();
					setState(914); match(65);
					setState(916); match(IDENTIFIER);
					setState(920);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(918); type_argument_list();
							}
							break;
					}
					}
					break;
				case 5:
					{
					setState(922); predefined_type();
					setState(924); match(65);
					setState(926); match(IDENTIFIER);
					setState(930);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(928); type_argument_list();
							}
							break;
					}
					}
					break;
				case 6:
					{
					setState(932); qualified_alias_member();
					setState(934); match(65);
					setState(936); match(IDENTIFIER);
					}
					break;
				case 7:
					{
					setState(938); array_creation_expression();
					setState(940); match(119);
					setState(944);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(942); argument_list();
							}
							break;
					}
					setState(946); match(24);
					}
					break;
				case 8:
					{
					setState(948); this_access();
					}
					break;
				case 9:
					{
					setState(950); base_access();
					}
					break;
				case 10:
					{
					setState(952); array_creation_expression();
					setState(954); match(61);
					}
					break;
				case 11:
					{
					setState(956); array_creation_expression();
					setState(958); match(85);
					}
					break;
				case 12:
					{
					setState(960); object_creation_expression();
					}
					break;
				case 13:
					{
					setState(962); delegate_creation_expression();
					}
					break;
				case 14:
					{
					setState(964); anonymous_object_creation_expression();
					}
					break;
				case 15:
					{
					setState(966); typeof_expression();
					}
					break;
				case 16:
					{
					setState(968); checked_expression();
					}
					break;
				case 17:
					{
					setState(970); unchecked_expression();
					}
					break;
				case 18:
					{
					setState(972); default_value_expression();
					}
					break;
				case 19:
					{
					setState(974); anonymous_method_expression();
					}
					break;
				case 20:
					{
					setState(976); array_creation_expression();
					setState(978); match(96);
					setState(980); match(IDENTIFIER);
					}
					break;
				case 21:
					{
					setState(982); sizeof_expression();
					}
					break;
			}
			setState(1024);
			_errHandler.sync(this);
			int _alt648 = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt648!=2 && _alt648!=-1 ) {
			    if ( _alt648==1 ) {
			        {
			        setState(1022);
			        //_errHandler.sync(this);
			        switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			        	case 1:
			        		{
			        		setState(986); match(65);
			        		setState(988); match(IDENTIFIER);
			        		setState(992);
			        		//_errHandler.sync(this);
			        		switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			        			case 1:
			        				{
			        				setState(990); type_argument_list();
			        				}
			        				break;
			        		}
			        		}
			        		break;
			        	case 2:
			        		{
			        		setState(994); match(119);
			        		setState(998);
			        		//_errHandler.sync(this);
			        		switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			        			case 1:
			        				{
			        				setState(996); argument_list();
			        				}
			        				break;
			        		}
			        		setState(1000); match(24);
			        		}
			        		break;
			        	case 3:
			        		{
			        		setState(1002); match(82);
			        		setState(1004); expression_list();
			        		setState(1006); match(115);
			        		}
			        		break;
			        	case 4:
			        		{
			        		setState(1008); match(61);
			        		}
			        		break;
			        	case 5:
			        		{
			        		setState(1010); match(85);
			        		}
			        		break;
			        	case 6:
			        		{
			        		setState(1012); match(96);
			        		setState(1014); match(IDENTIFIER);
			        		}
			        		break;
			        	case 7:
			        		{
			        		setState(1016); match(82);
			        		setState(1018); expression();
			        		setState(1020); match(115);
			        		}
			        		break;
			        }
			        } 
			    }
				setState(1026);
				_errHandler.sync(this);
				_alt648 = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class simple_nameContext extends ParserRuleContext<Token> {
		public simple_nameContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final simple_nameContext simple_name() throws RecognitionException {
		simple_nameContext _localctx = new simple_nameContext(_ctx, 54);
		enterRule(_localctx, RULE_simple_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027); match(IDENTIFIER);
			setState(1031);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(1029); type_argument_list();
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class parenthesized_expressionContext extends ParserRuleContext<Token> {
		public parenthesized_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		parenthesized_expressionContext _localctx = new parenthesized_expressionContext(_ctx, 56);
		enterRule(_localctx, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033); match(119);
			setState(1035); expression();
			setState(1037); match(24);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class member_accessContext extends ParserRuleContext<Token> {
		public member_accessContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final member_accessContext member_access() throws RecognitionException {
		member_accessContext _localctx = new member_accessContext(_ctx, 58);
		enterRule(_localctx, RULE_member_access);
		try {
			setState(1065);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1039); primary_expression();
					setState(1041); match(65);
					setState(1043); match(IDENTIFIER);
					setState(1047);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
						case 1:
							{
							setState(1045); type_argument_list();
							}
							break;
					}
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1049); predefined_type();
					setState(1051); match(65);
					setState(1053); match(IDENTIFIER);
					setState(1057);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(1055); type_argument_list();
							}
							break;
					}
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(1059); qualified_alias_member();
					setState(1061); match(65);
					setState(1063); match(IDENTIFIER);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class predefined_typeContext extends ParserRuleContext<Token> {
		public predefined_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final predefined_typeContext predefined_type() throws RecognitionException {
		predefined_typeContext _localctx = new predefined_typeContext(_ctx, 60);
		enterRule(_localctx, RULE_predefined_type);
		try {
			setState(1097);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 98:
					enterOuterAlt(_localctx, 1);
					{
					setState(1067); match(98);
					}
					break;
				case 64:
					enterOuterAlt(_localctx, 2);
					{
					setState(1069); match(64);
					}
					break;
				case 18:
					enterOuterAlt(_localctx, 3);
					{
					setState(1071); match(18);
					}
					break;
				case 47:
					enterOuterAlt(_localctx, 4);
					{
					setState(1073); match(47);
					}
					break;
				case 10:
					enterOuterAlt(_localctx, 5);
					{
					setState(1075); match(10);
					}
					break;
				case 17:
					enterOuterAlt(_localctx, 6);
					{
					setState(1077); match(17);
					}
					break;
				case 46:
					enterOuterAlt(_localctx, 7);
					{
					setState(1079); match(46);
					}
					break;
				case 35:
					enterOuterAlt(_localctx, 8);
					{
					setState(1081); match(35);
					}
					break;
				case 103:
					enterOuterAlt(_localctx, 9);
					{
					setState(1083); match(103);
					}
					break;
				case 93:
					enterOuterAlt(_localctx, 10);
					{
					setState(1085); match(93);
					}
					break;
				case 37:
					enterOuterAlt(_localctx, 11);
					{
					setState(1087); match(37);
					}
					break;
				case 149:
					enterOuterAlt(_localctx, 12);
					{
					setState(1089); match(149);
					}
					break;
				case 95:
					enterOuterAlt(_localctx, 13);
					{
					setState(1091); match(95);
					}
					break;
				case 15:
					enterOuterAlt(_localctx, 14);
					{
					setState(1093); match(15);
					}
					break;
				case 9:
					enterOuterAlt(_localctx, 15);
					{
					setState(1095); match(9);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class invocation_expressionContext extends ParserRuleContext<Token> {
		public invocation_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final invocation_expressionContext invocation_expression() throws RecognitionException {
		invocation_expressionContext _localctx = new invocation_expressionContext(_ctx, 62);
		enterRule(_localctx, RULE_invocation_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099); primary_expression();
			setState(1101); match(119);
			setState(1105);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(1103); argument_list();
					}
					break;
			}
			setState(1107); match(24);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class element_accessContext extends ParserRuleContext<Token> {
		public element_accessContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final element_accessContext element_access() throws RecognitionException {
		element_accessContext _localctx = new element_accessContext(_ctx, 64);
		enterRule(_localctx, RULE_element_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109); primary_no_array_creation_expression();
			setState(1111); match(82);
			setState(1113); expression_list();
			setState(1115); match(115);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class expression_listContext extends ParserRuleContext<Token> {
		public expression_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final expression_listContext expression_list() throws RecognitionException {
		expression_listContext _localctx = new expression_listContext(_ctx, 66);
		enterRule(_localctx, RULE_expression_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117); expression();
			setState(1125);
			_errHandler.sync(this);
			int _alt814 = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt814!=2 && _alt814!=-1 ) {
			    if ( _alt814==1 ) {
			        {
			        {
			        setState(1119); match(42);
			        setState(1121); expression();
			        }
			        } 
			    }
				setState(1127);
				_errHandler.sync(this);
				_alt814 = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class this_accessContext extends ParserRuleContext<Token> {
		public this_accessContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final this_accessContext this_access() throws RecognitionException {
		this_accessContext _localctx = new this_accessContext(_ctx, 68);
		enterRule(_localctx, RULE_this_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128); match(146);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class base_accessContext extends ParserRuleContext<Token> {
		public base_accessContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final base_accessContext base_access() throws RecognitionException {
		base_accessContext _localctx = new base_accessContext(_ctx, 70);
		enterRule(_localctx, RULE_base_access);
		try {
			setState(1144);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1130); match(142);
					setState(1132); match(65);
					setState(1134); match(IDENTIFIER);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1136); match(142);
					setState(1138); match(82);
					setState(1140); expression_list();
					setState(1142); match(115);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class post_increment_expressionContext extends ParserRuleContext<Token> {
		public post_increment_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final post_increment_expressionContext post_increment_expression() throws RecognitionException {
		post_increment_expressionContext _localctx = new post_increment_expressionContext(_ctx, 72);
		enterRule(_localctx, RULE_post_increment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146); primary_expression();
			setState(1148); match(61);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class post_decrement_expressionContext extends ParserRuleContext<Token> {
		public post_decrement_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final post_decrement_expressionContext post_decrement_expression() throws RecognitionException {
		post_decrement_expressionContext _localctx = new post_decrement_expressionContext(_ctx, 74);
		enterRule(_localctx, RULE_post_decrement_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150); primary_expression();
			setState(1152); match(85);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class object_creation_expressionContext extends ParserRuleContext<Token> {
		public object_creation_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final object_creation_expressionContext object_creation_expression() throws RecognitionException {
		object_creation_expressionContext _localctx = new object_creation_expressionContext(_ctx, 76);
		enterRule(_localctx, RULE_object_creation_expression);
		try {
			setState(1176);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1154); match(110);
					setState(1156); type();
					setState(1158); match(119);
					setState(1162);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(1160); argument_list();
							}
							break;
					}
					setState(1164); match(24);
					setState(1168);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(1166); object_or_collection_initializer();
							}
							break;
					}
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1170); match(110);
					setState(1172); type();
					setState(1174); object_or_collection_initializer();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class object_or_collection_initializerContext extends ParserRuleContext<Token> {
		public object_or_collection_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final object_or_collection_initializerContext object_or_collection_initializer() throws RecognitionException {
		object_or_collection_initializerContext _localctx = new object_or_collection_initializerContext(_ctx, 78);
		enterRule(_localctx, RULE_object_or_collection_initializer);
		try {
			setState(1182);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1178); object_initializer();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1180); collection_initializer();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class object_initializerContext extends ParserRuleContext<Token> {
		public object_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final object_initializerContext object_initializer() throws RecognitionException {
		object_initializerContext _localctx = new object_initializerContext(_ctx, 80);
		enterRule(_localctx, RULE_object_initializer);
		try {
			setState(1200);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1184); match(126);
					setState(1188);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(1186); member_initializer_list();
							}
							break;
					}
					setState(1190); match(16);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1192); match(126);
					setState(1194); member_initializer_list();
					setState(1196); match(42);
					setState(1198); match(16);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class member_initializer_listContext extends ParserRuleContext<Token> {
		public member_initializer_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final member_initializer_listContext member_initializer_list() throws RecognitionException {
		member_initializer_listContext _localctx = new member_initializer_listContext(_ctx, 82);
		enterRule(_localctx, RULE_member_initializer_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202); member_initializer();
			setState(1210);
			_errHandler.sync(this);
			int _alt943 = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt943!=2 && _alt943!=-1 ) {
			    if ( _alt943==1 ) {
			        {
			        {
			        setState(1204); match(42);
			        setState(1206); member_initializer();
			        }
			        } 
			    }
				setState(1212);
				_errHandler.sync(this);
				_alt943 = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class member_initializerContext extends ParserRuleContext<Token> {
		public member_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final member_initializerContext member_initializer() throws RecognitionException {
		member_initializerContext _localctx = new member_initializerContext(_ctx, 84);
		enterRule(_localctx, RULE_member_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213); match(IDENTIFIER);
			setState(1215); match(104);
			setState(1217); initializer_value();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class initializer_valueContext extends ParserRuleContext<Token> {
		public initializer_valueContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final initializer_valueContext initializer_value() throws RecognitionException {
		initializer_valueContext _localctx = new initializer_valueContext(_ctx, 86);
		enterRule(_localctx, RULE_initializer_value);
		try {
			setState(1223);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1219); expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1221); object_or_collection_initializer();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class collection_initializerContext extends ParserRuleContext<Token> {
		public collection_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final collection_initializerContext collection_initializer() throws RecognitionException {
		collection_initializerContext _localctx = new collection_initializerContext(_ctx, 88);
		enterRule(_localctx, RULE_collection_initializer);
		try {
			setState(1239);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1225); match(126);
					setState(1227); element_initializer_list();
					setState(1229); match(16);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1231); match(126);
					setState(1233); element_initializer_list();
					setState(1235); match(42);
					setState(1237); match(16);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class element_initializer_listContext extends ParserRuleContext<Token> {
		public element_initializer_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final element_initializer_listContext element_initializer_list() throws RecognitionException {
		element_initializer_listContext _localctx = new element_initializer_listContext(_ctx, 90);
		enterRule(_localctx, RULE_element_initializer_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241); element_initializer();
			setState(1249);
			_errHandler.sync(this);
			int _alt1005 = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt1005!=2 && _alt1005!=-1 ) {
			    if ( _alt1005==1 ) {
			        {
			        {
			        setState(1243); match(42);
			        setState(1245); element_initializer();
			        }
			        } 
			    }
				setState(1251);
				_errHandler.sync(this);
				_alt1005 = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class element_initializerContext extends ParserRuleContext<Token> {
		public element_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final element_initializerContext element_initializer() throws RecognitionException {
		element_initializerContext _localctx = new element_initializerContext(_ctx, 92);
		enterRule(_localctx, RULE_element_initializer);
		try {
			setState(1260);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1252); non_assignment_expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1254); match(126);
					setState(1256); expression_list();
					setState(1258); match(16);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class array_creation_expressionContext extends ParserRuleContext<Token> {
		public array_creation_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final array_creation_expressionContext array_creation_expression() throws RecognitionException {
		array_creation_expressionContext _localctx = new array_creation_expressionContext(_ctx, 94);
		enterRule(_localctx, RULE_array_creation_expression);
		try {
			setState(1292);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1262); match(110);
					setState(1264); non_array_type();
					setState(1266); match(82);
					setState(1268); expression_list();
					setState(1270); match(115);
					setState(1274);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
						case 1:
							{
							setState(1272); rank_specifiers();
							}
							break;
					}
					setState(1278);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
						case 1:
							{
							setState(1276); array_initializer();
							}
							break;
					}
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1280); match(110);
					setState(1282); array_type();
					setState(1284); array_initializer();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(1286); match(110);
					setState(1288); rank_specifier();
					setState(1290); array_initializer();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class delegate_creation_expressionContext extends ParserRuleContext<Token> {
		public delegate_creation_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final delegate_creation_expressionContext delegate_creation_expression() throws RecognitionException {
		delegate_creation_expressionContext _localctx = new delegate_creation_expressionContext(_ctx, 96);
		enterRule(_localctx, RULE_delegate_creation_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294); match(110);
			setState(1296); delegate_type();
			setState(1298); match(119);
			setState(1300); expression();
			setState(1302); match(24);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class anonymous_object_creation_expressionContext extends ParserRuleContext<Token> {
		public anonymous_object_creation_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final anonymous_object_creation_expressionContext anonymous_object_creation_expression() throws RecognitionException {
		anonymous_object_creation_expressionContext _localctx = new anonymous_object_creation_expressionContext(_ctx, 98);
		enterRule(_localctx, RULE_anonymous_object_creation_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304); match(110);
			setState(1306); anonymous_object_initializer();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class anonymous_object_initializerContext extends ParserRuleContext<Token> {
		public anonymous_object_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final anonymous_object_initializerContext anonymous_object_initializer() throws RecognitionException {
		anonymous_object_initializerContext _localctx = new anonymous_object_initializerContext(_ctx, 100);
		enterRule(_localctx, RULE_anonymous_object_initializer);
		try {
			setState(1324);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1308); match(126);
					setState(1312);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
						case 1:
							{
							setState(1310); member_declarator_list();
							}
							break;
					}
					setState(1314); match(16);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1316); match(126);
					setState(1318); member_declarator_list();
					setState(1320); match(42);
					setState(1322); match(16);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class member_declarator_listContext extends ParserRuleContext<Token> {
		public member_declarator_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final member_declarator_listContext member_declarator_list() throws RecognitionException {
		member_declarator_listContext _localctx = new member_declarator_listContext(_ctx, 102);
		enterRule(_localctx, RULE_member_declarator_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326); member_declarator();
			setState(1334);
			_errHandler.sync(this);
			int _alt1124 = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt1124!=2 && _alt1124!=-1 ) {
			    if ( _alt1124==1 ) {
			        {
			        {
			        setState(1328); match(42);
			        setState(1330); member_declarator();
			        }
			        } 
			    }
				setState(1336);
				_errHandler.sync(this);
				_alt1124 = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class member_declaratorContext extends ParserRuleContext<Token> {
		public member_declaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final member_declaratorContext member_declarator() throws RecognitionException {
		member_declaratorContext _localctx = new member_declaratorContext(_ctx, 104);
		enterRule(_localctx, RULE_member_declarator);
		try {
			setState(1349);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1337); simple_name();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1339); member_access();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(1341); base_access();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(1343); match(IDENTIFIER);
					setState(1345); match(104);
					setState(1347); expression();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class typeof_expressionContext extends ParserRuleContext<Token> {
		public typeof_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final typeof_expressionContext typeof_expression() throws RecognitionException {
		typeof_expressionContext _localctx = new typeof_expressionContext(_ctx, 106);
		enterRule(_localctx, RULE_typeof_expression);
		try {
			setState(1375);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1351); match(29);
					setState(1353); match(119);
					setState(1355); type();
					setState(1357); match(24);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1359); match(29);
					setState(1361); match(119);
					setState(1363); unbound_type_name();
					setState(1365); match(24);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(1367); match(29);
					setState(1369); match(119);
					setState(1371); match(VOID);
					setState(1373); match(24);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class unbound_type_nameContext extends ParserRuleContext<Token> {
		public unbound_type_nameContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final unbound_type_nameContext unbound_type_name() throws RecognitionException {
		unbound_type_nameContext _localctx = new unbound_type_nameContext(_ctx, 108);
		enterRule(_localctx, RULE_unbound_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(1377); match(IDENTIFIER);
					setState(1379); match(25);
					}
					break;
			}
			setState(1383); match(IDENTIFIER);
			setState(1387);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(1385); generic_dimension_specifier();
					}
					break;
			}
			setState(1399);
			_errHandler.sync(this);
			int _alt1214 = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt1214!=2 && _alt1214!=-1 ) {
			    if ( _alt1214==1 ) {
			        {
			        {
			        setState(1389); match(65);
			        setState(1391); match(IDENTIFIER);
			        setState(1395);
			        //_errHandler.sync(this);
			        switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			        	case 1:
			        		{
			        		setState(1393); generic_dimension_specifier();
			        		}
			        		break;
			        }
			        }
			        } 
			    }
				setState(1401);
				_errHandler.sync(this);
				_alt1214 = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class generic_dimension_specifierContext extends ParserRuleContext<Token> {
		public generic_dimension_specifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final generic_dimension_specifierContext generic_dimension_specifier() throws RecognitionException {
		generic_dimension_specifierContext _localctx = new generic_dimension_specifierContext(_ctx, 110);
		enterRule(_localctx, RULE_generic_dimension_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402); match(84);
			setState(1406);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(1404); commas();
					}
					break;
			}
			setState(1408); match(70);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class commasContext extends ParserRuleContext<Token> {
		public commasContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final commasContext commas() throws RecognitionException {
		commasContext _localctx = new commasContext(_ctx, 112);
		enterRule(_localctx, RULE_commas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410); match(42);
			setState(1416);
			_errHandler.sync(this);
			int _alt1242 = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt1242!=2 && _alt1242!=-1 ) {
			    if ( _alt1242==1 ) {
			        {
			        {
			        setState(1412); match(42);
			        }
			        } 
			    }
				setState(1418);
				_errHandler.sync(this);
				_alt1242 = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class checked_expressionContext extends ParserRuleContext<Token> {
		public checked_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final checked_expressionContext checked_expression() throws RecognitionException {
		checked_expressionContext _localctx = new checked_expressionContext(_ctx, 114);
		enterRule(_localctx, RULE_checked_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419); match(83);
			setState(1421); match(119);
			setState(1423); expression();
			setState(1425); match(24);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class unchecked_expressionContext extends ParserRuleContext<Token> {
		public unchecked_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final unchecked_expressionContext unchecked_expression() throws RecognitionException {
		unchecked_expressionContext _localctx = new unchecked_expressionContext(_ctx, 116);
		enterRule(_localctx, RULE_unchecked_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427); match(20);
			setState(1429); match(119);
			setState(1431); expression();
			setState(1433); match(24);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class default_value_expressionContext extends ParserRuleContext<Token> {
		public default_value_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final default_value_expressionContext default_value_expression() throws RecognitionException {
		default_value_expressionContext _localctx = new default_value_expressionContext(_ctx, 118);
		enterRule(_localctx, RULE_default_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435); match(117);
			setState(1437); match(119);
			setState(1439); type();
			setState(1441); match(24);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class unary_expressionContext extends ParserRuleContext<Token> {
		public unary_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final unary_expressionContext unary_expression() throws RecognitionException {
		unary_expressionContext _localctx = new unary_expressionContext(_ctx, 120);
		enterRule(_localctx, RULE_unary_expression);
		try {
			setState(1469);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1443); primary_expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1445); match(67);
					setState(1447); unary_expression();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(1449); match(44);
					setState(1451); unary_expression();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(1453); match(33);
					setState(1455); unary_expression();
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(1457); match(76);
					setState(1459); unary_expression();
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(1461); pre_increment_expression();
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(1463); pre_decrement_expression();
					}
					break;
				case 8:
					enterOuterAlt(_localctx, 8);
					{
					setState(1465); cast_expression();
					}
					break;
				case 9:
					enterOuterAlt(_localctx, 9);
					{
					setState(1467); unary_expression_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class pre_increment_expressionContext extends ParserRuleContext<Token> {
		public pre_increment_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final pre_increment_expressionContext pre_increment_expression() throws RecognitionException {
		pre_increment_expressionContext _localctx = new pre_increment_expressionContext(_ctx, 122);
		enterRule(_localctx, RULE_pre_increment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471); match(61);
			setState(1473); unary_expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class pre_decrement_expressionContext extends ParserRuleContext<Token> {
		public pre_decrement_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final pre_decrement_expressionContext pre_decrement_expression() throws RecognitionException {
		pre_decrement_expressionContext _localctx = new pre_decrement_expressionContext(_ctx, 124);
		enterRule(_localctx, RULE_pre_decrement_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475); match(85);
			setState(1477); unary_expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class cast_expressionContext extends ParserRuleContext<Token> {
		public cast_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final cast_expressionContext cast_expression() throws RecognitionException {
		cast_expressionContext _localctx = new cast_expressionContext(_ctx, 126);
		enterRule(_localctx, RULE_cast_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479); match(119);
			setState(1481); type();
			setState(1483); match(24);
			setState(1485); unary_expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class multiplicative_expressionContext extends ParserRuleContext<Token> {
		public multiplicative_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		multiplicative_expressionContext _localctx = new multiplicative_expressionContext(_ctx, 128);
		enterRule(_localctx, RULE_multiplicative_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487); unary_expression();
			setState(1503);
			_errHandler.sync(this);
			int _alt1407 = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt1407!=2 && _alt1407!=-1 ) {
			    if ( _alt1407==1 ) {
			        {
			        setState(1501);
			        //_errHandler.sync(this);
			        switch ( _input.LA(1) ) {
			        	case STAR:
			        		{
			        		{
			        		setState(1489); match(STAR);
			        		setState(1491); unary_expression();
			        		}
			        		}
			        		break;
			        	case 75:
			        		{
			        		{
			        		setState(1493); match(75);
			        		setState(1495); unary_expression();
			        		}
			        		}
			        		break;
			        	case 97:
			        		{
			        		{
			        		setState(1497); match(97);
			        		setState(1499); unary_expression();
			        		}
			        		}
			        		break;
			        	default :
			        		throw new NoViableAltException(this);
			        }
			        } 
			    }
				setState(1505);
				_errHandler.sync(this);
				_alt1407 = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class additive_expressionContext extends ParserRuleContext<Token> {
		public additive_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final additive_expressionContext additive_expression() throws RecognitionException {
		additive_expressionContext _localctx = new additive_expressionContext(_ctx, 130);
		enterRule(_localctx, RULE_additive_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506); multiplicative_expression();
			setState(1518);
			_errHandler.sync(this);
			int _alt1438 = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt1438!=2 && _alt1438!=-1 ) {
			    if ( _alt1438==1 ) {
			        {
			        setState(1516);
			        //_errHandler.sync(this);
			        switch ( _input.LA(1) ) {
			        	case 67:
			        		{
			        		{
			        		setState(1508); match(67);
			        		setState(1510); multiplicative_expression();
			        		}
			        		}
			        		break;
			        	case 44:
			        		{
			        		{
			        		setState(1512); match(44);
			        		setState(1514); multiplicative_expression();
			        		}
			        		}
			        		break;
			        	default :
			        		throw new NoViableAltException(this);
			        }
			        } 
			    }
				setState(1520);
				_errHandler.sync(this);
				_alt1438 = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class shift_expressionContext extends ParserRuleContext<Token> {
		public shift_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final shift_expressionContext shift_expression() throws RecognitionException {
		shift_expressionContext _localctx = new shift_expressionContext(_ctx, 132);
		enterRule(_localctx, RULE_shift_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521); additive_expression();
			setState(1533);
			_errHandler.sync(this);
			int _alt1469 = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt1469!=2 && _alt1469!=-1 ) {
			    if ( _alt1469==1 ) {
			        {
			        setState(1531);
			        //_errHandler.sync(this);
			        switch ( _input.LA(1) ) {
			        	case 90:
			        		{
			        		{
			        		setState(1523); match(90);
			        		setState(1525); additive_expression();
			        		}
			        		}
			        		break;
			        	case RIGHT_SHIFT:
			        		{
			        		{
			        		setState(1527); match(RIGHT_SHIFT);
			        		setState(1529); additive_expression();
			        		}
			        		}
			        		break;
			        	default :
			        		throw new NoViableAltException(this);
			        }
			        } 
			    }
				setState(1535);
				_errHandler.sync(this);
				_alt1469 = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class relational_expressionContext extends ParserRuleContext<Token> {
		public relational_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final relational_expressionContext relational_expression() throws RecognitionException {
		relational_expressionContext _localctx = new relational_expressionContext(_ctx, 134);
		enterRule(_localctx, RULE_relational_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536); shift_expression();
			setState(1564);
			_errHandler.sync(this);
			int _alt1540 = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt1540!=2 && _alt1540!=-1 ) {
			    if ( _alt1540==1 ) {
			        {
			        setState(1562);
			        //_errHandler.sync(this);
			        switch ( _input.LA(1) ) {
			        	case 84:
			        		{
			        		{
			        		setState(1538); match(84);
			        		setState(1540); shift_expression();
			        		}
			        		}
			        		break;
			        	case 70:
			        		{
			        		{
			        		setState(1542); match(70);
			        		setState(1544); shift_expression();
			        		}
			        		}
			        		break;
			        	case 89:
			        		{
			        		{
			        		setState(1546); match(89);
			        		setState(1548); shift_expression();
			        		}
			        		}
			        		break;
			        	case 151:
			        		{
			        		{
			        		setState(1550); match(151);
			        		setState(1552); shift_expression();
			        		}
			        		}
			        		break;
			        	case 134:
			        		{
			        		{
			        		setState(1554); match(134);
			        		setState(1556); type();
			        		}
			        		}
			        		break;
			        	case 50:
			        		{
			        		{
			        		setState(1558); match(50);
			        		setState(1560); type();
			        		}
			        		}
			        		break;
			        	default :
			        		throw new NoViableAltException(this);
			        }
			        } 
			    }
				setState(1566);
				_errHandler.sync(this);
				_alt1540 = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class equality_expressionContext extends ParserRuleContext<Token> {
		public equality_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final equality_expressionContext equality_expression() throws RecognitionException {
		equality_expressionContext _localctx = new equality_expressionContext(_ctx, 136);
		enterRule(_localctx, RULE_equality_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567); relational_expression();
			setState(1579);
			_errHandler.sync(this);
			int _alt1571 = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt1571!=2 && _alt1571!=-1 ) {
			    if ( _alt1571==1 ) {
			        {
			        setState(1577);
			        //_errHandler.sync(this);
			        switch ( _input.LA(1) ) {
			        	case 150:
			        		{
			        		{
			        		setState(1569); match(150);
			        		setState(1571); relational_expression();
			        		}
			        		}
			        		break;
			        	case 88:
			        		{
			        		{
			        		setState(1573); match(88);
			        		setState(1575); relational_expression();
			        		}
			        		}
			        		break;
			        	default :
			        		throw new NoViableAltException(this);
			        }
			        } 
			    }
				setState(1581);
				_errHandler.sync(this);
				_alt1571 = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class and_expressionContext extends ParserRuleContext<Token> {
		public and_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final and_expressionContext and_expression() throws RecognitionException {
		and_expressionContext _localctx = new and_expressionContext(_ctx, 138);
		enterRule(_localctx, RULE_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582); equality_expression();
			setState(1590);
			_errHandler.sync(this);
			int _alt1587 = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt1587!=2 && _alt1587!=-1 ) {
			    if ( _alt1587==1 ) {
			        {
			        {
			        setState(1584); match(80);
			        setState(1586); equality_expression();
			        }
			        } 
			    }
				setState(1592);
				_errHandler.sync(this);
				_alt1587 = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class exclusive_or_expressionContext extends ParserRuleContext<Token> {
		public exclusive_or_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		exclusive_or_expressionContext _localctx = new exclusive_or_expressionContext(_ctx, 140);
		enterRule(_localctx, RULE_exclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593); and_expression();
			setState(1601);
			_errHandler.sync(this);
			int _alt1603 = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt1603!=2 && _alt1603!=-1 ) {
			    if ( _alt1603==1 ) {
			        {
			        {
			        setState(1595); match(133);
			        setState(1597); and_expression();
			        }
			        } 
			    }
				setState(1603);
				_errHandler.sync(this);
				_alt1603 = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class inclusive_or_expressionContext extends ParserRuleContext<Token> {
		public inclusive_or_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		inclusive_or_expressionContext _localctx = new inclusive_or_expressionContext(_ctx, 142);
		enterRule(_localctx, RULE_inclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604); exclusive_or_expression();
			setState(1612);
			_errHandler.sync(this);
			int _alt1619 = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt1619!=2 && _alt1619!=-1 ) {
			    if ( _alt1619==1 ) {
			        {
			        {
			        setState(1606); match(32);
			        setState(1608); exclusive_or_expression();
			        }
			        } 
			    }
				setState(1614);
				_errHandler.sync(this);
				_alt1619 = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class conditional_and_expressionContext extends ParserRuleContext<Token> {
		public conditional_and_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final conditional_and_expressionContext conditional_and_expression() throws RecognitionException {
		conditional_and_expressionContext _localctx = new conditional_and_expressionContext(_ctx, 144);
		enterRule(_localctx, RULE_conditional_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615); inclusive_or_expression();
			setState(1623);
			_errHandler.sync(this);
			int _alt1635 = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt1635!=2 && _alt1635!=-1 ) {
			    if ( _alt1635==1 ) {
			        {
			        {
			        setState(1617); match(68);
			        setState(1619); inclusive_or_expression();
			        }
			        } 
			    }
				setState(1625);
				_errHandler.sync(this);
				_alt1635 = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class conditional_or_expressionContext extends ParserRuleContext<Token> {
		public conditional_or_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final conditional_or_expressionContext conditional_or_expression() throws RecognitionException {
		conditional_or_expressionContext _localctx = new conditional_or_expressionContext(_ctx, 146);
		enterRule(_localctx, RULE_conditional_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626); conditional_and_expression();
			setState(1634);
			_errHandler.sync(this);
			int _alt1651 = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt1651!=2 && _alt1651!=-1 ) {
			    if ( _alt1651==1 ) {
			        {
			        {
			        setState(1628); match(69);
			        setState(1630); conditional_and_expression();
			        }
			        } 
			    }
				setState(1636);
				_errHandler.sync(this);
				_alt1651 = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class null_coalescing_expressionContext extends ParserRuleContext<Token> {
		public null_coalescing_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final null_coalescing_expressionContext null_coalescing_expression() throws RecognitionException {
		null_coalescing_expressionContext _localctx = new null_coalescing_expressionContext(_ctx, 148);
		enterRule(_localctx, RULE_null_coalescing_expression);
		try {
			setState(1645);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1637); conditional_or_expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1639); conditional_or_expression();
					setState(1641); match(108);
					setState(1643); null_coalescing_expression();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class conditional_expressionContext extends ParserRuleContext<Token> {
		public conditional_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final conditional_expressionContext conditional_expression() throws RecognitionException {
		conditional_expressionContext _localctx = new conditional_expressionContext(_ctx, 150);
		enterRule(_localctx, RULE_conditional_expression);
		try {
			setState(1659);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1647); null_coalescing_expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1649); null_coalescing_expression();
					setState(1651); match(INTERR);
					setState(1653); expression();
					setState(1655); match(121);
					setState(1657); expression();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class lambda_expressionContext extends ParserRuleContext<Token> {
		public lambda_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final lambda_expressionContext lambda_expression() throws RecognitionException {
		lambda_expressionContext _localctx = new lambda_expressionContext(_ctx, 152);
		enterRule(_localctx, RULE_lambda_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661); anonymous_function_signature();
			setState(1663); match(136);
			setState(1665); anonymous_function_body();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class anonymous_method_expressionContext extends ParserRuleContext<Token> {
		public anonymous_method_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final anonymous_method_expressionContext anonymous_method_expression() throws RecognitionException {
		anonymous_method_expressionContext _localctx = new anonymous_method_expressionContext(_ctx, 154);
		enterRule(_localctx, RULE_anonymous_method_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667); match(91);
			setState(1671);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(1669); explicit_anonymous_function_signature();
					}
					break;
			}
			setState(1673); block();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class anonymous_function_signatureContext extends ParserRuleContext<Token> {
		public anonymous_function_signatureContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final anonymous_function_signatureContext anonymous_function_signature() throws RecognitionException {
		anonymous_function_signatureContext _localctx = new anonymous_function_signatureContext(_ctx, 156);
		enterRule(_localctx, RULE_anonymous_function_signature);
		try {
			setState(1679);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1675); explicit_anonymous_function_signature();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1677); implicit_anonymous_function_signature();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class explicit_anonymous_function_signatureContext extends ParserRuleContext<Token> {
		public explicit_anonymous_function_signatureContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final explicit_anonymous_function_signatureContext explicit_anonymous_function_signature() throws RecognitionException {
		explicit_anonymous_function_signatureContext _localctx = new explicit_anonymous_function_signatureContext(_ctx, 158);
		enterRule(_localctx, RULE_explicit_anonymous_function_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681); match(119);
			setState(1685);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(1683); explicit_anonymous_function_parameter_list();
					}
					break;
			}
			setState(1687); match(24);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class explicit_anonymous_function_parameter_listContext extends ParserRuleContext<Token> {
		public explicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() throws RecognitionException {
		explicit_anonymous_function_parameter_listContext _localctx = new explicit_anonymous_function_parameter_listContext(_ctx, 160);
		enterRule(_localctx, RULE_explicit_anonymous_function_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689); explicit_anonymous_function_parameter();
			setState(1697);
			_errHandler.sync(this);
			int _alt1753 = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt1753!=2 && _alt1753!=-1 ) {
			    if ( _alt1753==1 ) {
			        {
			        {
			        setState(1691); match(42);
			        setState(1693); explicit_anonymous_function_parameter();
			        }
			        } 
			    }
				setState(1699);
				_errHandler.sync(this);
				_alt1753 = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class explicit_anonymous_function_parameterContext extends ParserRuleContext<Token> {
		public explicit_anonymous_function_parameterContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter() throws RecognitionException {
		explicit_anonymous_function_parameterContext _localctx = new explicit_anonymous_function_parameterContext(_ctx, 162);
		enterRule(_localctx, RULE_explicit_anonymous_function_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(1700); anonymous_function_parameter_modifier();
					}
					break;
			}
			setState(1704); type();
			setState(1706); match(IDENTIFIER);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class anonymous_function_parameter_modifierContext extends ParserRuleContext<Token> {
		public anonymous_function_parameter_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final anonymous_function_parameter_modifierContext anonymous_function_parameter_modifier() throws RecognitionException {
		anonymous_function_parameter_modifierContext _localctx = new anonymous_function_parameter_modifierContext(_ctx, 164);
		enterRule(_localctx, RULE_anonymous_function_parameter_modifier);
		try {
			setState(1712);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 120:
					enterOuterAlt(_localctx, 1);
					{
					setState(1708); match(120);
					}
					break;
				case 77:
					enterOuterAlt(_localctx, 2);
					{
					setState(1710); match(77);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class implicit_anonymous_function_signatureContext extends ParserRuleContext<Token> {
		public implicit_anonymous_function_signatureContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final implicit_anonymous_function_signatureContext implicit_anonymous_function_signature() throws RecognitionException {
		implicit_anonymous_function_signatureContext _localctx = new implicit_anonymous_function_signatureContext(_ctx, 166);
		enterRule(_localctx, RULE_implicit_anonymous_function_signature);
		try {
			setState(1724);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1714); match(119);
					setState(1718);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
						case 1:
							{
							setState(1716); implicit_anonymous_function_parameter_list();
							}
							break;
					}
					setState(1720); match(24);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1722); implicit_anonymous_function_parameter();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class implicit_anonymous_function_parameter_listContext extends ParserRuleContext<Token> {
		public implicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() throws RecognitionException {
		implicit_anonymous_function_parameter_listContext _localctx = new implicit_anonymous_function_parameter_listContext(_ctx, 168);
		enterRule(_localctx, RULE_implicit_anonymous_function_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726); implicit_anonymous_function_parameter();
			setState(1734);
			_errHandler.sync(this);
			int _alt1811 = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt1811!=2 && _alt1811!=-1 ) {
			    if ( _alt1811==1 ) {
			        {
			        {
			        setState(1728); match(42);
			        setState(1730); implicit_anonymous_function_parameter();
			        }
			        } 
			    }
				setState(1736);
				_errHandler.sync(this);
				_alt1811 = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class implicit_anonymous_function_parameterContext extends ParserRuleContext<Token> {
		public implicit_anonymous_function_parameterContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final implicit_anonymous_function_parameterContext implicit_anonymous_function_parameter() throws RecognitionException {
		implicit_anonymous_function_parameterContext _localctx = new implicit_anonymous_function_parameterContext(_ctx, 170);
		enterRule(_localctx, RULE_implicit_anonymous_function_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737); match(IDENTIFIER);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class anonymous_function_bodyContext extends ParserRuleContext<Token> {
		public anonymous_function_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final anonymous_function_bodyContext anonymous_function_body() throws RecognitionException {
		anonymous_function_bodyContext _localctx = new anonymous_function_bodyContext(_ctx, 172);
		enterRule(_localctx, RULE_anonymous_function_body);
		try {
			setState(1743);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1739); expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1741); block();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class query_expressionContext extends ParserRuleContext<Token> {
		public query_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final query_expressionContext query_expression() throws RecognitionException {
		query_expressionContext _localctx = new query_expressionContext(_ctx, 174);
		enterRule(_localctx, RULE_query_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745); from_clause();
			setState(1747); query_body();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class from_clauseContext extends ParserRuleContext<Token> {
		public from_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final from_clauseContext from_clause() throws RecognitionException {
		from_clauseContext _localctx = new from_clauseContext(_ctx, 176);
		enterRule(_localctx, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749); match(3);
			setState(1753);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(1751); type();
					}
					break;
			}
			setState(1755); match(IDENTIFIER);
			setState(1757); match(41);
			setState(1759); expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class query_bodyContext extends ParserRuleContext<Token> {
		public query_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final query_bodyContext query_body() throws RecognitionException {
		query_bodyContext _localctx = new query_bodyContext(_ctx, 178);
		enterRule(_localctx, RULE_query_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(1761); query_body_clauses();
					}
					break;
			}
			setState(1765); select_or_group_clause();
			setState(1769);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(1767); query_continuation();
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class query_body_clausesContext extends ParserRuleContext<Token> {
		public query_body_clausesContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final query_body_clausesContext query_body_clauses() throws RecognitionException {
		query_body_clausesContext _localctx = new query_body_clausesContext(_ctx, 180);
		enterRule(_localctx, RULE_query_body_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771); query_body_clause();
			setState(1777);
			_errHandler.sync(this);
			int _alt1887 = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt1887!=2 && _alt1887!=-1 ) {
			    if ( _alt1887==1 ) {
			        {
			        {
			        setState(1773); query_body_clause();
			        }
			        } 
			    }
				setState(1779);
				_errHandler.sync(this);
				_alt1887 = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class query_body_clauseContext extends ParserRuleContext<Token> {
		public query_body_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final query_body_clauseContext query_body_clause() throws RecognitionException {
		query_body_clauseContext _localctx = new query_body_clauseContext(_ctx, 182);
		enterRule(_localctx, RULE_query_body_clause);
		try {
			setState(1792);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1780); from_clause();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1782); let_clause();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(1784); where_clause();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(1786); join_clause();
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(1788); join_into_clause();
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(1790); orderby_clause();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class let_clauseContext extends ParserRuleContext<Token> {
		public let_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final let_clauseContext let_clause() throws RecognitionException {
		let_clauseContext _localctx = new let_clauseContext(_ctx, 184);
		enterRule(_localctx, RULE_let_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794); match(56);
			setState(1796); match(IDENTIFIER);
			setState(1798); match(104);
			setState(1800); expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class where_clauseContext extends ParserRuleContext<Token> {
		public where_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final where_clauseContext where_clause() throws RecognitionException {
		where_clauseContext _localctx = new where_clauseContext(_ctx, 186);
		enterRule(_localctx, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802); match(74);
			setState(1804); boolean_expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class join_clauseContext extends ParserRuleContext<Token> {
		public join_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final join_clauseContext join_clause() throws RecognitionException {
		join_clauseContext _localctx = new join_clauseContext(_ctx, 188);
		enterRule(_localctx, RULE_join_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806); match(112);
			setState(1810);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(1808); type();
					}
					break;
			}
			setState(1812); match(IDENTIFIER);
			setState(1814); match(41);
			setState(1816); expression();
			setState(1818); match(23);
			setState(1820); expression();
			setState(1822); match(128);
			setState(1824); expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class join_into_clauseContext extends ParserRuleContext<Token> {
		public join_into_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final join_into_clauseContext join_into_clause() throws RecognitionException {
		join_into_clauseContext _localctx = new join_into_clauseContext(_ctx, 190);
		enterRule(_localctx, RULE_join_into_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826); match(112);
			setState(1830);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(1828); type();
					}
					break;
			}
			setState(1832); match(IDENTIFIER);
			setState(1834); match(41);
			setState(1836); expression();
			setState(1838); match(23);
			setState(1840); expression();
			setState(1842); match(128);
			setState(1844); expression();
			setState(1846); match(81);
			setState(1848); match(IDENTIFIER);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class orderby_clauseContext extends ParserRuleContext<Token> {
		public orderby_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final orderby_clauseContext orderby_clause() throws RecognitionException {
		orderby_clauseContext _localctx = new orderby_clauseContext(_ctx, 192);
		enterRule(_localctx, RULE_orderby_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850); match(52);
			setState(1852); orderings();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class orderingsContext extends ParserRuleContext<Token> {
		public orderingsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final orderingsContext orderings() throws RecognitionException {
		orderingsContext _localctx = new orderingsContext(_ctx, 194);
		enterRule(_localctx, RULE_orderings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854); ordering();
			setState(1862);
			_errHandler.sync(this);
			int _alt2020 = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt2020!=2 && _alt2020!=-1 ) {
			    if ( _alt2020==1 ) {
			        {
			        {
			        setState(1856); match(42);
			        setState(1858); ordering();
			        }
			        } 
			    }
				setState(1864);
				_errHandler.sync(this);
				_alt2020 = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class orderingContext extends ParserRuleContext<Token> {
		public orderingContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final orderingContext ordering() throws RecognitionException {
		orderingContext _localctx = new orderingContext(_ctx, 196);
		enterRule(_localctx, RULE_ordering);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865); expression();
			setState(1869);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(1867); ordering_direction();
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ordering_directionContext extends ParserRuleContext<Token> {
		public ordering_directionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final ordering_directionContext ordering_direction() throws RecognitionException {
		ordering_directionContext _localctx = new ordering_directionContext(_ctx, 198);
		enterRule(_localctx, RULE_ordering_direction);
		try {
			setState(1875);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 132:
					enterOuterAlt(_localctx, 1);
					{
					setState(1871); match(132);
					}
					break;
				case 22:
					enterOuterAlt(_localctx, 2);
					{
					setState(1873); match(22);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class select_or_group_clauseContext extends ParserRuleContext<Token> {
		public select_or_group_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final select_or_group_clauseContext select_or_group_clause() throws RecognitionException {
		select_or_group_clauseContext _localctx = new select_or_group_clauseContext(_ctx, 200);
		enterRule(_localctx, RULE_select_or_group_clause);
		try {
			setState(1881);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1877); select_clause();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1879); group_clause();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class select_clauseContext extends ParserRuleContext<Token> {
		public select_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final select_clauseContext select_clause() throws RecognitionException {
		select_clauseContext _localctx = new select_clauseContext(_ctx, 202);
		enterRule(_localctx, RULE_select_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883); match(40);
			setState(1885); expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class group_clauseContext extends ParserRuleContext<Token> {
		public group_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final group_clauseContext group_clause() throws RecognitionException {
		group_clauseContext _localctx = new group_clauseContext(_ctx, 204);
		enterRule(_localctx, RULE_group_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887); match(27);
			setState(1889); expression();
			setState(1891); match(12);
			setState(1893); expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class query_continuationContext extends ParserRuleContext<Token> {
		public query_continuationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final query_continuationContext query_continuation() throws RecognitionException {
		query_continuationContext _localctx = new query_continuationContext(_ctx, 206);
		enterRule(_localctx, RULE_query_continuation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895); match(81);
			setState(1897); match(IDENTIFIER);
			setState(1899); query_body();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class assignmentContext extends ParserRuleContext<Token> {
		public assignmentContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final assignmentContext assignment() throws RecognitionException {
		assignmentContext _localctx = new assignmentContext(_ctx, 208);
		enterRule(_localctx, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901); unary_expression();
			setState(1903); assignment_operator();
			setState(1905); expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class assignment_operatorContext extends ParserRuleContext<Token> {
		public assignment_operatorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final assignment_operatorContext assignment_operator() throws RecognitionException {
		assignment_operatorContext _localctx = new assignment_operatorContext(_ctx, 210);
		enterRule(_localctx, RULE_assignment_operator);
		try {
			setState(1929);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 104:
					enterOuterAlt(_localctx, 1);
					{
					setState(1907); match(104);
					}
					break;
				case 55:
					enterOuterAlt(_localctx, 2);
					{
					setState(1909); match(55);
					}
					break;
				case 38:
					enterOuterAlt(_localctx, 3);
					{
					setState(1911); match(38);
					}
					break;
				case 21:
					enterOuterAlt(_localctx, 4);
					{
					setState(1913); match(21);
					}
					break;
				case 73:
					enterOuterAlt(_localctx, 5);
					{
					setState(1915); match(73);
					}
					break;
				case 71:
					enterOuterAlt(_localctx, 6);
					{
					setState(1917); match(71);
					}
					break;
				case 122:
					enterOuterAlt(_localctx, 7);
					{
					setState(1919); match(122);
					}
					break;
				case 109:
					enterOuterAlt(_localctx, 8);
					{
					setState(1921); match(109);
					}
					break;
				case 57:
					enterOuterAlt(_localctx, 9);
					{
					setState(1923); match(57);
					}
					break;
				case 114:
					enterOuterAlt(_localctx, 10);
					{
					setState(1925); match(114);
					}
					break;
				case RIGHT_SHIFT_ASSIGNMENT:
					enterOuterAlt(_localctx, 11);
					{
					setState(1927); match(RIGHT_SHIFT_ASSIGNMENT);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class expressionContext extends ParserRuleContext<Token> {
		public expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final expressionContext expression() throws RecognitionException {
		expressionContext _localctx = new expressionContext(_ctx, 212);
		enterRule(_localctx, RULE_expression);
		try {
			setState(1935);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1931); non_assignment_expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1933); assignment();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class non_assignment_expressionContext extends ParserRuleContext<Token> {
		public non_assignment_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final non_assignment_expressionContext non_assignment_expression() throws RecognitionException {
		non_assignment_expressionContext _localctx = new non_assignment_expressionContext(_ctx, 214);
		enterRule(_localctx, RULE_non_assignment_expression);
		try {
			setState(1943);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1937); conditional_expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1939); lambda_expression();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(1941); query_expression();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constant_expressionContext extends ParserRuleContext<Token> {
		public constant_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constant_expressionContext constant_expression() throws RecognitionException {
		constant_expressionContext _localctx = new constant_expressionContext(_ctx, 216);
		enterRule(_localctx, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1945); expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class boolean_expressionContext extends ParserRuleContext<Token> {
		public boolean_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final boolean_expressionContext boolean_expression() throws RecognitionException {
		boolean_expressionContext _localctx = new boolean_expressionContext(_ctx, 218);
		enterRule(_localctx, RULE_boolean_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947); expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class statementContext extends ParserRuleContext<Token> {
		public statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final statementContext statement() throws RecognitionException {
		statementContext _localctx = new statementContext(_ctx, 220);
		enterRule(_localctx, RULE_statement);
		try {
			setState(1955);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1949); labeled_statement();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1951); declaration_statement();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(1953); embedded_statement();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class embedded_statementContext extends ParserRuleContext<Token> {
		public embedded_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final embedded_statementContext embedded_statement() throws RecognitionException {
		embedded_statementContext _localctx = new embedded_statementContext(_ctx, 222);
		enterRule(_localctx, RULE_embedded_statement);
		try {
			setState(1983);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(1957); block();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(1959); empty_statement();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(1961); expression_statement();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(1963); selection_statement();
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(1965); iteration_statement();
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(1967); jump_statement();
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(1969); try_statement();
					}
					break;
				case 8:
					enterOuterAlt(_localctx, 8);
					{
					setState(1971); checked_statement();
					}
					break;
				case 9:
					enterOuterAlt(_localctx, 9);
					{
					setState(1973); unchecked_statement();
					}
					break;
				case 10:
					enterOuterAlt(_localctx, 10);
					{
					setState(1975); lock_statement();
					}
					break;
				case 11:
					enterOuterAlt(_localctx, 11);
					{
					setState(1977); using_statement();
					}
					break;
				case 12:
					enterOuterAlt(_localctx, 12);
					{
					setState(1979); yield_statement();
					}
					break;
				case 13:
					enterOuterAlt(_localctx, 13);
					{
					setState(1981); embedded_statement_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class blockContext extends ParserRuleContext<Token> {
		public blockContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final blockContext block() throws RecognitionException {
		blockContext _localctx = new blockContext(_ctx, 224);
		enterRule(_localctx, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985); match(126);
			setState(1989);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1987); statement_list();
					}
					break;
			}
			setState(1991); match(16);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class statement_listContext extends ParserRuleContext<Token> {
		public statement_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final statement_listContext statement_list() throws RecognitionException {
		statement_listContext _localctx = new statement_listContext(_ctx, 226);
		enterRule(_localctx, RULE_statement_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993); statement();
			setState(1999);
			_errHandler.sync(this);
			int _alt2297 = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt2297!=2 && _alt2297!=-1 ) {
			    if ( _alt2297==1 ) {
			        {
			        {
			        setState(1995); statement();
			        }
			        } 
			    }
				setState(2001);
				_errHandler.sync(this);
				_alt2297 = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class empty_statementContext extends ParserRuleContext<Token> {
		public empty_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final empty_statementContext empty_statement() throws RecognitionException {
		empty_statementContext _localctx = new empty_statementContext(_ctx, 228);
		enterRule(_localctx, RULE_empty_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class labeled_statementContext extends ParserRuleContext<Token> {
		public labeled_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final labeled_statementContext labeled_statement() throws RecognitionException {
		labeled_statementContext _localctx = new labeled_statementContext(_ctx, 230);
		enterRule(_localctx, RULE_labeled_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2004); match(IDENTIFIER);
			setState(2006); match(121);
			setState(2008); statement();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class declaration_statementContext extends ParserRuleContext<Token> {
		public declaration_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final declaration_statementContext declaration_statement() throws RecognitionException {
		declaration_statementContext _localctx = new declaration_statementContext(_ctx, 232);
		enterRule(_localctx, RULE_declaration_statement);
		try {
			setState(2018);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2010); local_variable_declaration();
					setState(2012); match(143);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2014); local_constant_declaration();
					setState(2016); match(143);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class local_variable_declarationContext extends ParserRuleContext<Token> {
		public local_variable_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final local_variable_declarationContext local_variable_declaration() throws RecognitionException {
		local_variable_declarationContext _localctx = new local_variable_declarationContext(_ctx, 234);
		enterRule(_localctx, RULE_local_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020); local_variable_type();
			setState(2022); local_variable_declarators();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class local_variable_typeContext extends ParserRuleContext<Token> {
		public local_variable_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final local_variable_typeContext local_variable_type() throws RecognitionException {
		local_variable_typeContext _localctx = new local_variable_typeContext(_ctx, 236);
		enterRule(_localctx, RULE_local_variable_type);
		try {
			setState(2028);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2024); type();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2026); match(124);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class local_variable_declaratorsContext extends ParserRuleContext<Token> {
		public local_variable_declaratorsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final local_variable_declaratorsContext local_variable_declarators() throws RecognitionException {
		local_variable_declaratorsContext _localctx = new local_variable_declaratorsContext(_ctx, 238);
		enterRule(_localctx, RULE_local_variable_declarators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2030); local_variable_declarator();
			setState(2038);
			_errHandler.sync(this);
			int _alt2372 = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt2372!=2 && _alt2372!=-1 ) {
			    if ( _alt2372==1 ) {
			        {
			        {
			        setState(2032); match(42);
			        setState(2034); local_variable_declarator();
			        }
			        } 
			    }
				setState(2040);
				_errHandler.sync(this);
				_alt2372 = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class local_variable_declaratorContext extends ParserRuleContext<Token> {
		public local_variable_declaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final local_variable_declaratorContext local_variable_declarator() throws RecognitionException {
		local_variable_declaratorContext _localctx = new local_variable_declaratorContext(_ctx, 240);
		enterRule(_localctx, RULE_local_variable_declarator);
		try {
			setState(2049);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2041); match(IDENTIFIER);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2043); match(IDENTIFIER);
					setState(2045); match(104);
					setState(2047); local_variable_initializer();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class local_variable_initializerContext extends ParserRuleContext<Token> {
		public local_variable_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final local_variable_initializerContext local_variable_initializer() throws RecognitionException {
		local_variable_initializerContext _localctx = new local_variable_initializerContext(_ctx, 242);
		enterRule(_localctx, RULE_local_variable_initializer);
		try {
			setState(2057);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2051); expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2053); array_initializer();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2055); local_variable_initializer_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class local_constant_declarationContext extends ParserRuleContext<Token> {
		public local_constant_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final local_constant_declarationContext local_constant_declaration() throws RecognitionException {
		local_constant_declarationContext _localctx = new local_constant_declarationContext(_ctx, 244);
		enterRule(_localctx, RULE_local_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059); match(107);
			setState(2061); type();
			setState(2063); constant_declarators();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class expression_statementContext extends ParserRuleContext<Token> {
		public expression_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final expression_statementContext expression_statement() throws RecognitionException {
		expression_statementContext _localctx = new expression_statementContext(_ctx, 246);
		enterRule(_localctx, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2065); statement_expression();
			setState(2067); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class statement_expressionContext extends ParserRuleContext<Token> {
		public statement_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final statement_expressionContext statement_expression() throws RecognitionException {
		statement_expressionContext _localctx = new statement_expressionContext(_ctx, 248);
		enterRule(_localctx, RULE_statement_expression);
		try {
			setState(2083);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2069); invocation_expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2071); object_creation_expression();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2073); assignment();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(2075); post_increment_expression();
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(2077); post_decrement_expression();
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(2079); pre_increment_expression();
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(2081); pre_decrement_expression();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class selection_statementContext extends ParserRuleContext<Token> {
		public selection_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final selection_statementContext selection_statement() throws RecognitionException {
		selection_statementContext _localctx = new selection_statementContext(_ctx, 250);
		enterRule(_localctx, RULE_selection_statement);
		try {
			setState(2089);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2085); if_statement();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2087); switch_statement();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class if_statementContext extends ParserRuleContext<Token> {
		public if_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final if_statementContext if_statement() throws RecognitionException {
		if_statementContext _localctx = new if_statementContext(_ctx, 252);
		enterRule(_localctx, RULE_if_statement);
		try {
			setState(2115);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2091); match(45);
					setState(2093); match(119);
					setState(2095); boolean_expression();
					setState(2097); match(24);
					setState(2099); embedded_statement();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2101); match(45);
					setState(2103); match(119);
					setState(2105); boolean_expression();
					setState(2107); match(24);
					setState(2109); embedded_statement();
					setState(2111); match(59);
					setState(2113); embedded_statement();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class switch_statementContext extends ParserRuleContext<Token> {
		public switch_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final switch_statementContext switch_statement() throws RecognitionException {
		switch_statementContext _localctx = new switch_statementContext(_ctx, 254);
		enterRule(_localctx, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2117); match(72);
			setState(2119); match(119);
			setState(2121); expression();
			setState(2123); match(24);
			setState(2125); switch_block();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class switch_blockContext extends ParserRuleContext<Token> {
		public switch_blockContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final switch_blockContext switch_block() throws RecognitionException {
		switch_blockContext _localctx = new switch_blockContext(_ctx, 256);
		enterRule(_localctx, RULE_switch_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127); match(126);
			setState(2131);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(2129); switch_sections();
					}
					break;
			}
			setState(2133); match(16);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class switch_sectionsContext extends ParserRuleContext<Token> {
		public switch_sectionsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final switch_sectionsContext switch_sections() throws RecognitionException {
		switch_sectionsContext _localctx = new switch_sectionsContext(_ctx, 258);
		enterRule(_localctx, RULE_switch_sections);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135); switch_section();
			setState(2141);
			_errHandler.sync(this);
			int _alt2546 = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt2546!=2 && _alt2546!=-1 ) {
			    if ( _alt2546==1 ) {
			        {
			        {
			        setState(2137); switch_section();
			        }
			        } 
			    }
				setState(2143);
				_errHandler.sync(this);
				_alt2546 = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class switch_sectionContext extends ParserRuleContext<Token> {
		public switch_sectionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final switch_sectionContext switch_section() throws RecognitionException {
		switch_sectionContext _localctx = new switch_sectionContext(_ctx, 260);
		enterRule(_localctx, RULE_switch_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144); switch_labels();
			setState(2146); statement_list();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class switch_labelsContext extends ParserRuleContext<Token> {
		public switch_labelsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final switch_labelsContext switch_labels() throws RecognitionException {
		switch_labelsContext _localctx = new switch_labelsContext(_ctx, 262);
		enterRule(_localctx, RULE_switch_labels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2148); switch_label();
			setState(2154);
			_errHandler.sync(this);
			int _alt2571 = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt2571!=2 && _alt2571!=-1 ) {
			    if ( _alt2571==1 ) {
			        {
			        {
			        setState(2150); switch_label();
			        }
			        } 
			    }
				setState(2156);
				_errHandler.sync(this);
				_alt2571 = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class switch_labelContext extends ParserRuleContext<Token> {
		public switch_labelContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final switch_labelContext switch_label() throws RecognitionException {
		switch_labelContext _localctx = new switch_labelContext(_ctx, 264);
		enterRule(_localctx, RULE_switch_label);
		try {
			setState(2167);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 94:
					enterOuterAlt(_localctx, 1);
					{
					setState(2157); match(94);
					setState(2159); constant_expression();
					setState(2161); match(121);
					}
					break;
				case 117:
					enterOuterAlt(_localctx, 2);
					{
					setState(2163); match(117);
					setState(2165); match(121);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class iteration_statementContext extends ParserRuleContext<Token> {
		public iteration_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final iteration_statementContext iteration_statement() throws RecognitionException {
		iteration_statementContext _localctx = new iteration_statementContext(_ctx, 266);
		enterRule(_localctx, RULE_iteration_statement);
		try {
			setState(2177);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2169); while_statement();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2171); do_statement();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2173); for_statement();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(2175); foreach_statement();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class while_statementContext extends ParserRuleContext<Token> {
		public while_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final while_statementContext while_statement() throws RecognitionException {
		while_statementContext _localctx = new while_statementContext(_ctx, 268);
		enterRule(_localctx, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2179); match(43);
			setState(2181); match(119);
			setState(2183); boolean_expression();
			setState(2185); match(24);
			setState(2187); embedded_statement();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class do_statementContext extends ParserRuleContext<Token> {
		public do_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final do_statementContext do_statement() throws RecognitionException {
		do_statementContext _localctx = new do_statementContext(_ctx, 270);
		enterRule(_localctx, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2189); match(19);
			setState(2191); embedded_statement();
			setState(2193); match(43);
			setState(2195); match(119);
			setState(2197); boolean_expression();
			setState(2199); match(24);
			setState(2201); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class for_statementContext extends ParserRuleContext<Token> {
		public for_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final for_statementContext for_statement() throws RecognitionException {
		for_statementContext _localctx = new for_statementContext(_ctx, 272);
		enterRule(_localctx, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2203); match(137);
			setState(2205); match(119);
			setState(2209);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(2207); for_initializer();
					}
					break;
			}
			setState(2211); match(143);
			setState(2215);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(2213); for_condition();
					}
					break;
			}
			setState(2217); match(143);
			setState(2221);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(2219); for_iterator();
					}
					break;
			}
			setState(2223); match(24);
			setState(2225); embedded_statement();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class for_initializerContext extends ParserRuleContext<Token> {
		public for_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final for_initializerContext for_initializer() throws RecognitionException {
		for_initializerContext _localctx = new for_initializerContext(_ctx, 274);
		enterRule(_localctx, RULE_for_initializer);
		try {
			setState(2231);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2227); local_variable_declaration();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2229); statement_expression_list();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class for_conditionContext extends ParserRuleContext<Token> {
		public for_conditionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final for_conditionContext for_condition() throws RecognitionException {
		for_conditionContext _localctx = new for_conditionContext(_ctx, 276);
		enterRule(_localctx, RULE_for_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2233); boolean_expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class for_iteratorContext extends ParserRuleContext<Token> {
		public for_iteratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final for_iteratorContext for_iterator() throws RecognitionException {
		for_iteratorContext _localctx = new for_iteratorContext(_ctx, 278);
		enterRule(_localctx, RULE_for_iterator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235); statement_expression_list();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class statement_expression_listContext extends ParserRuleContext<Token> {
		public statement_expression_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final statement_expression_listContext statement_expression_list() throws RecognitionException {
		statement_expression_listContext _localctx = new statement_expression_listContext(_ctx, 280);
		enterRule(_localctx, RULE_statement_expression_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2237); statement_expression();
			setState(2245);
			_errHandler.sync(this);
			int _alt2717 = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt2717!=2 && _alt2717!=-1 ) {
			    if ( _alt2717==1 ) {
			        {
			        {
			        setState(2239); match(42);
			        setState(2241); statement_expression();
			        }
			        } 
			    }
				setState(2247);
				_errHandler.sync(this);
				_alt2717 = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class foreach_statementContext extends ParserRuleContext<Token> {
		public foreach_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final foreach_statementContext foreach_statement() throws RecognitionException {
		foreach_statementContext _localctx = new foreach_statementContext(_ctx, 282);
		enterRule(_localctx, RULE_foreach_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2248); match(34);
			setState(2250); match(119);
			setState(2252); local_variable_type();
			setState(2254); match(IDENTIFIER);
			setState(2256); match(41);
			setState(2258); expression();
			setState(2260); match(24);
			setState(2262); embedded_statement();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class jump_statementContext extends ParserRuleContext<Token> {
		public jump_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final jump_statementContext jump_statement() throws RecognitionException {
		jump_statementContext _localctx = new jump_statementContext(_ctx, 284);
		enterRule(_localctx, RULE_jump_statement);
		try {
			setState(2274);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2264); break_statement();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2266); continue_statement();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2268); goto_statement();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(2270); return_statement();
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(2272); throw_statement();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class break_statementContext extends ParserRuleContext<Token> {
		public break_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final break_statementContext break_statement() throws RecognitionException {
		break_statementContext _localctx = new break_statementContext(_ctx, 286);
		enterRule(_localctx, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2276); match(54);
			setState(2278); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class continue_statementContext extends ParserRuleContext<Token> {
		public continue_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final continue_statementContext continue_statement() throws RecognitionException {
		continue_statementContext _localctx = new continue_statementContext(_ctx, 288);
		enterRule(_localctx, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280); match(86);
			setState(2282); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class goto_statementContext extends ParserRuleContext<Token> {
		public goto_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final goto_statementContext goto_statement() throws RecognitionException {
		goto_statementContext _localctx = new goto_statementContext(_ctx, 290);
		enterRule(_localctx, RULE_goto_statement);
		try {
			setState(2304);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2284); match(28);
					setState(2286); match(IDENTIFIER);
					setState(2288); match(143);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2290); match(28);
					setState(2292); match(94);
					setState(2294); constant_expression();
					setState(2296); match(143);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2298); match(28);
					setState(2300); match(117);
					setState(2302); match(143);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class return_statementContext extends ParserRuleContext<Token> {
		public return_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final return_statementContext return_statement() throws RecognitionException {
		return_statementContext _localctx = new return_statementContext(_ctx, 292);
		enterRule(_localctx, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2306); match(141);
			setState(2310);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(2308); expression();
					}
					break;
			}
			setState(2312); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class throw_statementContext extends ParserRuleContext<Token> {
		public throw_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final throw_statementContext throw_statement() throws RecognitionException {
		throw_statementContext _localctx = new throw_statementContext(_ctx, 294);
		enterRule(_localctx, RULE_throw_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2314); match(26);
			setState(2318);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(2316); expression();
					}
					break;
			}
			setState(2320); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class try_statementContext extends ParserRuleContext<Token> {
		public try_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final try_statementContext try_statement() throws RecognitionException {
		try_statementContext _localctx = new try_statementContext(_ctx, 296);
		enterRule(_localctx, RULE_try_statement);
		try {
			setState(2342);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2322); match(125);
					setState(2324); block();
					setState(2326); catch_clauses();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2328); match(125);
					setState(2330); block();
					setState(2332); finally_clause();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2334); match(125);
					setState(2336); block();
					setState(2338); catch_clauses();
					setState(2340); finally_clause();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class catch_clausesContext extends ParserRuleContext<Token> {
		public catch_clausesContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final catch_clausesContext catch_clauses() throws RecognitionException {
		catch_clausesContext _localctx = new catch_clausesContext(_ctx, 298);
		enterRule(_localctx, RULE_catch_clauses);
		try {
			setState(2356);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2344); specific_catch_clauses();
					setState(2348);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
						case 1:
							{
							setState(2346); general_catch_clause();
							}
							break;
					}
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2352);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
						case 1:
							{
							setState(2350); specific_catch_clauses();
							}
							break;
					}
					setState(2354); general_catch_clause();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class specific_catch_clausesContext extends ParserRuleContext<Token> {
		public specific_catch_clausesContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final specific_catch_clausesContext specific_catch_clauses() throws RecognitionException {
		specific_catch_clausesContext _localctx = new specific_catch_clausesContext(_ctx, 300);
		enterRule(_localctx, RULE_specific_catch_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358); specific_catch_clause();
			setState(2364);
			_errHandler.sync(this);
			int _alt2902 = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt2902!=2 && _alt2902!=-1 ) {
			    if ( _alt2902==1 ) {
			        {
			        {
			        setState(2360); specific_catch_clause();
			        }
			        } 
			    }
				setState(2366);
				_errHandler.sync(this);
				_alt2902 = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class specific_catch_clauseContext extends ParserRuleContext<Token> {
		public specific_catch_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final specific_catch_clauseContext specific_catch_clause() throws RecognitionException {
		specific_catch_clauseContext _localctx = new specific_catch_clauseContext(_ctx, 302);
		enterRule(_localctx, RULE_specific_catch_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2367); match(129);
			setState(2369); match(119);
			setState(2371); class_type();
			setState(2375);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(2373); match(IDENTIFIER);
					}
					break;
			}
			setState(2377); match(24);
			setState(2379); block();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class general_catch_clauseContext extends ParserRuleContext<Token> {
		public general_catch_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final general_catch_clauseContext general_catch_clause() throws RecognitionException {
		general_catch_clauseContext _localctx = new general_catch_clauseContext(_ctx, 304);
		enterRule(_localctx, RULE_general_catch_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381); match(129);
			setState(2383); block();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class finally_clauseContext extends ParserRuleContext<Token> {
		public finally_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final finally_clauseContext finally_clause() throws RecognitionException {
		finally_clauseContext _localctx = new finally_clauseContext(_ctx, 306);
		enterRule(_localctx, RULE_finally_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385); match(111);
			setState(2387); block();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class checked_statementContext extends ParserRuleContext<Token> {
		public checked_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final checked_statementContext checked_statement() throws RecognitionException {
		checked_statementContext _localctx = new checked_statementContext(_ctx, 308);
		enterRule(_localctx, RULE_checked_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2389); match(83);
			setState(2391); block();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class unchecked_statementContext extends ParserRuleContext<Token> {
		public unchecked_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final unchecked_statementContext unchecked_statement() throws RecognitionException {
		unchecked_statementContext _localctx = new unchecked_statementContext(_ctx, 310);
		enterRule(_localctx, RULE_unchecked_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2393); match(20);
			setState(2395); block();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class lock_statementContext extends ParserRuleContext<Token> {
		public lock_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final lock_statementContext lock_statement() throws RecognitionException {
		lock_statementContext _localctx = new lock_statementContext(_ctx, 312);
		enterRule(_localctx, RULE_lock_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397); match(135);
			setState(2399); match(119);
			setState(2401); expression();
			setState(2403); match(24);
			setState(2405); embedded_statement();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class using_statementContext extends ParserRuleContext<Token> {
		public using_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final using_statementContext using_statement() throws RecognitionException {
		using_statementContext _localctx = new using_statementContext(_ctx, 314);
		enterRule(_localctx, RULE_using_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407); match(116);
			setState(2409); match(119);
			setState(2411); resource_acquisition();
			setState(2413); match(24);
			setState(2415); embedded_statement();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class resource_acquisitionContext extends ParserRuleContext<Token> {
		public resource_acquisitionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final resource_acquisitionContext resource_acquisition() throws RecognitionException {
		resource_acquisitionContext _localctx = new resource_acquisitionContext(_ctx, 316);
		enterRule(_localctx, RULE_resource_acquisition);
		try {
			setState(2421);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2417); local_variable_declaration();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2419); expression();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class yield_statementContext extends ParserRuleContext<Token> {
		public yield_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final yield_statementContext yield_statement() throws RecognitionException {
		yield_statementContext _localctx = new yield_statementContext(_ctx, 318);
		enterRule(_localctx, RULE_yield_statement);
		try {
			setState(2437);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2423); match(6);
					setState(2425); match(141);
					setState(2427); expression();
					setState(2429); match(143);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2431); match(6);
					setState(2433); match(54);
					setState(2435); match(143);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class compilation_unitContext extends ParserRuleContext<Token> {
		public compilation_unitContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final compilation_unitContext compilation_unit() throws RecognitionException {
		compilation_unitContext _localctx = new compilation_unitContext(_ctx, 320);
		enterRule(_localctx, RULE_compilation_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2441);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(2439); extern_alias_directives();
					}
					break;
			}
			setState(2445);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(2443); using_directives();
					}
					break;
			}
			setState(2449);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(2447); global_attributes();
					}
					break;
			}
			setState(2453);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(2451); namespace_member_declarations();
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class namespace_declarationContext extends ParserRuleContext<Token> {
		public namespace_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final namespace_declarationContext namespace_declaration() throws RecognitionException {
		namespace_declarationContext _localctx = new namespace_declarationContext(_ctx, 322);
		enterRule(_localctx, RULE_namespace_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2455); match(11);
			setState(2457); qualified_identifier();
			setState(2459); namespace_body();
			setState(2463);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(2461); match(143);
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class qualified_identifierContext extends ParserRuleContext<Token> {
		public qualified_identifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final qualified_identifierContext qualified_identifier() throws RecognitionException {
		qualified_identifierContext _localctx = new qualified_identifierContext(_ctx, 324);
		enterRule(_localctx, RULE_qualified_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2465); match(IDENTIFIER);
			setState(2473);
			_errHandler.sync(this);
			int _alt3079 = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt3079!=2 && _alt3079!=-1 ) {
			    if ( _alt3079==1 ) {
			        {
			        {
			        setState(2467); match(65);
			        setState(2469); match(IDENTIFIER);
			        }
			        } 
			    }
				setState(2475);
				_errHandler.sync(this);
				_alt3079 = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class namespace_bodyContext extends ParserRuleContext<Token> {
		public namespace_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final namespace_bodyContext namespace_body() throws RecognitionException {
		namespace_bodyContext _localctx = new namespace_bodyContext(_ctx, 326);
		enterRule(_localctx, RULE_namespace_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2476); match(126);
			setState(2480);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(2478); extern_alias_directives();
					}
					break;
			}
			setState(2484);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(2482); using_directives();
					}
					break;
			}
			setState(2488);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(2486); namespace_member_declarations();
					}
					break;
			}
			setState(2490); match(16);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class extern_alias_directivesContext extends ParserRuleContext<Token> {
		public extern_alias_directivesContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final extern_alias_directivesContext extern_alias_directives() throws RecognitionException {
		extern_alias_directivesContext _localctx = new extern_alias_directivesContext(_ctx, 328);
		enterRule(_localctx, RULE_extern_alias_directives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2492); extern_alias_directive();
			setState(2498);
			_errHandler.sync(this);
			int _alt3113 = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt3113!=2 && _alt3113!=-1 ) {
			    if ( _alt3113==1 ) {
			        {
			        {
			        setState(2494); extern_alias_directive();
			        }
			        } 
			    }
				setState(2500);
				_errHandler.sync(this);
				_alt3113 = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class extern_alias_directiveContext extends ParserRuleContext<Token> {
		public extern_alias_directiveContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final extern_alias_directiveContext extern_alias_directive() throws RecognitionException {
		extern_alias_directiveContext _localctx = new extern_alias_directiveContext(_ctx, 330);
		enterRule(_localctx, RULE_extern_alias_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2501); match(66);
			setState(2503); match(106);
			setState(2505); match(IDENTIFIER);
			setState(2507); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class using_directivesContext extends ParserRuleContext<Token> {
		public using_directivesContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final using_directivesContext using_directives() throws RecognitionException {
		using_directivesContext _localctx = new using_directivesContext(_ctx, 332);
		enterRule(_localctx, RULE_using_directives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2509); using_directive();
			setState(2515);
			_errHandler.sync(this);
			int _alt3142 = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt3142!=2 && _alt3142!=-1 ) {
			    if ( _alt3142==1 ) {
			        {
			        {
			        setState(2511); using_directive();
			        }
			        } 
			    }
				setState(2517);
				_errHandler.sync(this);
				_alt3142 = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class using_directiveContext extends ParserRuleContext<Token> {
		public using_directiveContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final using_directiveContext using_directive() throws RecognitionException {
		using_directiveContext _localctx = new using_directiveContext(_ctx, 334);
		enterRule(_localctx, RULE_using_directive);
		try {
			setState(2522);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2518); using_alias_directive();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2520); using_namespace_directive();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class using_alias_directiveContext extends ParserRuleContext<Token> {
		public using_alias_directiveContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final using_alias_directiveContext using_alias_directive() throws RecognitionException {
		using_alias_directiveContext _localctx = new using_alias_directiveContext(_ctx, 336);
		enterRule(_localctx, RULE_using_alias_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2524); match(116);
			setState(2526); match(IDENTIFIER);
			setState(2528); match(104);
			setState(2530); namespace_or_type_name();
			setState(2532); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class using_namespace_directiveContext extends ParserRuleContext<Token> {
		public using_namespace_directiveContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final using_namespace_directiveContext using_namespace_directive() throws RecognitionException {
		using_namespace_directiveContext _localctx = new using_namespace_directiveContext(_ctx, 338);
		enterRule(_localctx, RULE_using_namespace_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2534); match(116);
			setState(2536); namespace_name();
			setState(2538); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class namespace_member_declarationsContext extends ParserRuleContext<Token> {
		public namespace_member_declarationsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final namespace_member_declarationsContext namespace_member_declarations() throws RecognitionException {
		namespace_member_declarationsContext _localctx = new namespace_member_declarationsContext(_ctx, 340);
		enterRule(_localctx, RULE_namespace_member_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2540); namespace_member_declaration();
			setState(2546);
			_errHandler.sync(this);
			int _alt3197 = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt3197!=2 && _alt3197!=-1 ) {
			    if ( _alt3197==1 ) {
			        {
			        {
			        setState(2542); namespace_member_declaration();
			        }
			        } 
			    }
				setState(2548);
				_errHandler.sync(this);
				_alt3197 = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class namespace_member_declarationContext extends ParserRuleContext<Token> {
		public namespace_member_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final namespace_member_declarationContext namespace_member_declaration() throws RecognitionException {
		namespace_member_declarationContext _localctx = new namespace_member_declarationContext(_ctx, 342);
		enterRule(_localctx, RULE_namespace_member_declaration);
		try {
			setState(2553);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2549); namespace_declaration();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2551); type_declaration();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class type_declarationContext extends ParserRuleContext<Token> {
		public type_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final type_declarationContext type_declaration() throws RecognitionException {
		type_declarationContext _localctx = new type_declarationContext(_ctx, 344);
		enterRule(_localctx, RULE_type_declaration);
		try {
			setState(2565);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2555); class_declaration();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2557); struct_declaration();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2559); interface_declaration();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(2561); enum_declaration();
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(2563); delegate_declaration();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class qualified_alias_memberContext extends ParserRuleContext<Token> {
		public qualified_alias_memberContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final qualified_alias_memberContext qualified_alias_member() throws RecognitionException {
		qualified_alias_memberContext _localctx = new qualified_alias_memberContext(_ctx, 346);
		enterRule(_localctx, RULE_qualified_alias_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2567); match(IDENTIFIER);
			setState(2569); match(25);
			setState(2571); match(IDENTIFIER);
			setState(2575);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(2573); type_argument_list();
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class class_declarationContext extends ParserRuleContext<Token> {
		public class_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final class_declarationContext class_declaration() throws RecognitionException {
		class_declarationContext _localctx = new class_declarationContext(_ctx, 348);
		enterRule(_localctx, RULE_class_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2579);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(2577); attributes();
					}
					break;
			}
			setState(2583);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(2581); class_modifiers();
					}
					break;
			}
			setState(2587);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(2585); match(13);
					}
					break;
			}
			setState(2589); match(31);
			setState(2591); match(IDENTIFIER);
			setState(2595);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(2593); type_parameter_list();
					}
					break;
			}
			setState(2599);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(2597); class_base();
					}
					break;
			}
			setState(2603);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(2601); type_parameter_constraints_clauses();
					}
					break;
			}
			setState(2605); class_body();
			setState(2609);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(2607); match(143);
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class class_modifiersContext extends ParserRuleContext<Token> {
		public class_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final class_modifiersContext class_modifiers() throws RecognitionException {
		class_modifiersContext _localctx = new class_modifiersContext(_ctx, 350);
		enterRule(_localctx, RULE_class_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2611); class_modifier();
			setState(2617);
			_errHandler.sync(this);
			int _alt3298 = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt3298!=2 && _alt3298!=-1 ) {
			    if ( _alt3298==1 ) {
			        {
			        {
			        setState(2613); class_modifier();
			        }
			        } 
			    }
				setState(2619);
				_errHandler.sync(this);
				_alt3298 = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class class_modifierContext extends ParserRuleContext<Token> {
		public class_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final class_modifierContext class_modifier() throws RecognitionException {
		class_modifierContext _localctx = new class_modifierContext(_ctx, 352);
		enterRule(_localctx, RULE_class_modifier);
		try {
			setState(2638);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2620); match(110);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2622); match(118);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2624); match(138);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(2626); match(78);
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(2628); match(48);
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(2630); match(14);
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(2632); match(139);
					}
					break;
				case 8:
					enterOuterAlt(_localctx, 8);
					{
					setState(2634); match(131);
					}
					break;
				case 9:
					enterOuterAlt(_localctx, 9);
					{
					setState(2636); class_modifier_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class type_parameter_listContext extends ParserRuleContext<Token> {
		public type_parameter_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final type_parameter_listContext type_parameter_list() throws RecognitionException {
		type_parameter_listContext _localctx = new type_parameter_listContext(_ctx, 354);
		enterRule(_localctx, RULE_type_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2640); match(84);
			setState(2642); type_parameters();
			setState(2644); match(70);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class type_parametersContext extends ParserRuleContext<Token> {
		public type_parametersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final type_parametersContext type_parameters() throws RecognitionException {
		type_parametersContext _localctx = new type_parametersContext(_ctx, 356);
		enterRule(_localctx, RULE_type_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2648);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(2646); attributes();
					}
					break;
			}
			setState(2650); type_parameter();
			setState(2662);
			_errHandler.sync(this);
			int _alt3373 = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt3373!=2 && _alt3373!=-1 ) {
			    if ( _alt3373==1 ) {
			        {
			        {
			        setState(2652); match(42);
			        setState(2656);
			        //_errHandler.sync(this);
			        switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			        	case 1:
			        		{
			        		setState(2654); attributes();
			        		}
			        		break;
			        }
			        setState(2658); type_parameter();
			        }
			        } 
			    }
				setState(2664);
				_errHandler.sync(this);
				_alt3373 = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class type_parameterContext extends ParserRuleContext<Token> {
		public type_parameterContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final type_parameterContext type_parameter() throws RecognitionException {
		type_parameterContext _localctx = new type_parameterContext(_ctx, 358);
		enterRule(_localctx, RULE_type_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2665); match(IDENTIFIER);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class class_baseContext extends ParserRuleContext<Token> {
		public class_baseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final class_baseContext class_base() throws RecognitionException {
		class_baseContext _localctx = new class_baseContext(_ctx, 360);
		enterRule(_localctx, RULE_class_base);
		try {
			setState(2683);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2667); match(121);
					setState(2669); class_type();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2671); match(121);
					setState(2673); interface_type_list();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2675); match(121);
					setState(2677); class_type();
					setState(2679); match(42);
					setState(2681); interface_type_list();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_type_listContext extends ParserRuleContext<Token> {
		public interface_type_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_type_listContext interface_type_list() throws RecognitionException {
		interface_type_listContext _localctx = new interface_type_listContext(_ctx, 362);
		enterRule(_localctx, RULE_interface_type_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2685); interface_type();
			setState(2693);
			_errHandler.sync(this);
			int _alt3424 = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt3424!=2 && _alt3424!=-1 ) {
			    if ( _alt3424==1 ) {
			        {
			        {
			        setState(2687); match(42);
			        setState(2689); interface_type();
			        }
			        } 
			    }
				setState(2695);
				_errHandler.sync(this);
				_alt3424 = getInterpreter().adaptivePredict(_input,166,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class type_parameter_constraints_clausesContext extends ParserRuleContext<Token> {
		public type_parameter_constraints_clausesContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final type_parameter_constraints_clausesContext type_parameter_constraints_clauses() throws RecognitionException {
		type_parameter_constraints_clausesContext _localctx = new type_parameter_constraints_clausesContext(_ctx, 364);
		enterRule(_localctx, RULE_type_parameter_constraints_clauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2696); type_parameter_constraints_clause();
			setState(2702);
			_errHandler.sync(this);
			int _alt3439 = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt3439!=2 && _alt3439!=-1 ) {
			    if ( _alt3439==1 ) {
			        {
			        {
			        setState(2698); type_parameter_constraints_clause();
			        }
			        } 
			    }
				setState(2704);
				_errHandler.sync(this);
				_alt3439 = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class type_parameter_constraints_clauseContext extends ParserRuleContext<Token> {
		public type_parameter_constraints_clauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final type_parameter_constraints_clauseContext type_parameter_constraints_clause() throws RecognitionException {
		type_parameter_constraints_clauseContext _localctx = new type_parameter_constraints_clauseContext(_ctx, 366);
		enterRule(_localctx, RULE_type_parameter_constraints_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2705); match(74);
			setState(2707); type_parameter();
			setState(2709); match(121);
			setState(2711); type_parameter_constraints();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class type_parameter_constraintsContext extends ParserRuleContext<Token> {
		public type_parameter_constraintsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final type_parameter_constraintsContext type_parameter_constraints() throws RecognitionException {
		type_parameter_constraintsContext _localctx = new type_parameter_constraintsContext(_ctx, 368);
		enterRule(_localctx, RULE_type_parameter_constraints);
		try {
			setState(2747);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2713); primary_constraint();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2715); secondary_constraints();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2717); constructor_constraint();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(2719); primary_constraint();
					setState(2721); match(42);
					setState(2723); secondary_constraints();
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(2725); primary_constraint();
					setState(2727); match(42);
					setState(2729); constructor_constraint();
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(2731); secondary_constraints();
					setState(2733); match(42);
					setState(2735); constructor_constraint();
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(2737); primary_constraint();
					setState(2739); match(42);
					setState(2741); secondary_constraints();
					setState(2743); match(42);
					setState(2745); constructor_constraint();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class primary_constraintContext extends ParserRuleContext<Token> {
		public primary_constraintContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final primary_constraintContext primary_constraint() throws RecognitionException {
		primary_constraintContext _localctx = new primary_constraintContext(_ctx, 370);
		enterRule(_localctx, RULE_primary_constraint);
		try {
			setState(2755);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2749); class_type();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2751); match(31);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2753); match(62);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class secondary_constraintsContext extends ParserRuleContext<Token> {
		public secondary_constraintsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final secondary_constraintsContext secondary_constraints() throws RecognitionException {
		secondary_constraintsContext _localctx = new secondary_constraintsContext(_ctx, 372);
		enterRule(_localctx, RULE_secondary_constraints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2761);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(2757); interface_type();
					}
					break;
				case 2:
					{
					setState(2759); type_parameter();
					}
					break;
			}
			setState(2773);
			_errHandler.sync(this);
			int _alt3553 = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt3553!=2 && _alt3553!=-1 ) {
			    if ( _alt3553==1 ) {
			        {
			        {
			        setState(2763); match(42);
			        setState(2769);
			        //_errHandler.sync(this);
			        switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			        	case 1:
			        		{
			        		setState(2765); interface_type();
			        		}
			        		break;
			        	case 2:
			        		{
			        		setState(2767); type_parameter();
			        		}
			        		break;
			        }
			        }
			        } 
			    }
				setState(2775);
				_errHandler.sync(this);
				_alt3553 = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constructor_constraintContext extends ParserRuleContext<Token> {
		public constructor_constraintContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constructor_constraintContext constructor_constraint() throws RecognitionException {
		constructor_constraintContext _localctx = new constructor_constraintContext(_ctx, 374);
		enterRule(_localctx, RULE_constructor_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2776); match(110);
			setState(2778); match(119);
			setState(2780); match(24);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class class_bodyContext extends ParserRuleContext<Token> {
		public class_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final class_bodyContext class_body() throws RecognitionException {
		class_bodyContext _localctx = new class_bodyContext(_ctx, 376);
		enterRule(_localctx, RULE_class_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2782); match(126);
			setState(2786);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(2784); class_member_declarations();
					}
					break;
			}
			setState(2788); match(16);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class class_member_declarationsContext extends ParserRuleContext<Token> {
		public class_member_declarationsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final class_member_declarationsContext class_member_declarations() throws RecognitionException {
		class_member_declarationsContext _localctx = new class_member_declarationsContext(_ctx, 378);
		enterRule(_localctx, RULE_class_member_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2792); 
			_errHandler.sync(this);
			int _alt3587 = getInterpreter().adaptivePredict(_input,174,_ctx);
			do {
				switch ( _alt3587 ) {
					case 1:
						{
						{
						setState(2790); class_member_declaration();
						}
						}
						break;
					default :
						throw new NoViableAltException(this);
				}
				setState(2794); 
				_errHandler.sync(this);
				_alt3587 = getInterpreter().adaptivePredict(_input,174,_ctx);
			} while ( _alt3587!=2 && _alt3587!=-1 );
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class class_member_declarationContext extends ParserRuleContext<Token> {
		public class_member_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final class_member_declarationContext class_member_declaration() throws RecognitionException {
		class_member_declarationContext _localctx = new class_member_declarationContext(_ctx, 380);
		enterRule(_localctx, RULE_class_member_declaration);
		try {
			setState(2818);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2796); constant_declaration();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2798); field_declaration();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2800); method_declaration();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(2802); property_declaration();
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(2804); event_declaration();
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(2806); indexer_declaration();
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(2808); operator_declaration();
					}
					break;
				case 8:
					enterOuterAlt(_localctx, 8);
					{
					setState(2810); constructor_declaration();
					}
					break;
				case 9:
					enterOuterAlt(_localctx, 9);
					{
					setState(2812); destructor_declaration();
					}
					break;
				case 10:
					enterOuterAlt(_localctx, 10);
					{
					setState(2814); static_constructor_declaration();
					}
					break;
				case 11:
					enterOuterAlt(_localctx, 11);
					{
					setState(2816); type_declaration();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constant_declarationContext extends ParserRuleContext<Token> {
		public constant_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constant_declarationContext constant_declaration() throws RecognitionException {
		constant_declarationContext _localctx = new constant_declarationContext(_ctx, 382);
		enterRule(_localctx, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2822);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(2820); attributes();
					}
					break;
			}
			setState(2826);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(2824); constant_modifiers();
					}
					break;
			}
			setState(2828); match(107);
			setState(2830); type();
			setState(2832); constant_declarators();
			setState(2834); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constant_modifiersContext extends ParserRuleContext<Token> {
		public constant_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constant_modifiersContext constant_modifiers() throws RecognitionException {
		constant_modifiersContext _localctx = new constant_modifiersContext(_ctx, 384);
		enterRule(_localctx, RULE_constant_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2838); 
			_errHandler.sync(this);
			int _alt3664 = getInterpreter().adaptivePredict(_input,178,_ctx);
			do {
				switch ( _alt3664 ) {
					case 1:
						{
						{
						setState(2836); constant_modifier();
						}
						}
						break;
					default :
						throw new NoViableAltException(this);
				}
				setState(2840); 
				_errHandler.sync(this);
				_alt3664 = getInterpreter().adaptivePredict(_input,178,_ctx);
			} while ( _alt3664!=2 && _alt3664!=-1 );
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constant_modifierContext extends ParserRuleContext<Token> {
		public constant_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constant_modifierContext constant_modifier() throws RecognitionException {
		constant_modifierContext _localctx = new constant_modifierContext(_ctx, 386);
		enterRule(_localctx, RULE_constant_modifier);
		try {
			setState(2852);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 110:
					enterOuterAlt(_localctx, 1);
					{
					setState(2842); match(110);
					}
					break;
				case 118:
					enterOuterAlt(_localctx, 2);
					{
					setState(2844); match(118);
					}
					break;
				case 138:
					enterOuterAlt(_localctx, 3);
					{
					setState(2846); match(138);
					}
					break;
				case 78:
					enterOuterAlt(_localctx, 4);
					{
					setState(2848); match(78);
					}
					break;
				case 48:
					enterOuterAlt(_localctx, 5);
					{
					setState(2850); match(48);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constant_declaratorsContext extends ParserRuleContext<Token> {
		public constant_declaratorsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constant_declaratorsContext constant_declarators() throws RecognitionException {
		constant_declaratorsContext _localctx = new constant_declaratorsContext(_ctx, 388);
		enterRule(_localctx, RULE_constant_declarators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2854); constant_declarator();
			setState(2862);
			_errHandler.sync(this);
			int _alt3705 = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt3705!=2 && _alt3705!=-1 ) {
			    if ( _alt3705==1 ) {
			        {
			        {
			        setState(2856); match(42);
			        setState(2858); constant_declarator();
			        }
			        } 
			    }
				setState(2864);
				_errHandler.sync(this);
				_alt3705 = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constant_declaratorContext extends ParserRuleContext<Token> {
		public constant_declaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constant_declaratorContext constant_declarator() throws RecognitionException {
		constant_declaratorContext _localctx = new constant_declaratorContext(_ctx, 390);
		enterRule(_localctx, RULE_constant_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2865); match(IDENTIFIER);
			setState(2867); match(104);
			setState(2869); constant_expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class field_declarationContext extends ParserRuleContext<Token> {
		public field_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final field_declarationContext field_declaration() throws RecognitionException {
		field_declarationContext _localctx = new field_declarationContext(_ctx, 392);
		enterRule(_localctx, RULE_field_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2873);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(2871); attributes();
					}
					break;
			}
			setState(2877);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(2875); field_modifiers();
					}
					break;
			}
			setState(2879); type();
			setState(2881); variable_declarators();
			setState(2883); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class field_modifiersContext extends ParserRuleContext<Token> {
		public field_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final field_modifiersContext field_modifiers() throws RecognitionException {
		field_modifiersContext _localctx = new field_modifiersContext(_ctx, 394);
		enterRule(_localctx, RULE_field_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2885); field_modifier();
			setState(2891);
			_errHandler.sync(this);
			int _alt3750 = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt3750!=2 && _alt3750!=-1 ) {
			    if ( _alt3750==1 ) {
			        {
			        {
			        setState(2887); field_modifier();
			        }
			        } 
			    }
				setState(2893);
				_errHandler.sync(this);
				_alt3750 = getInterpreter().adaptivePredict(_input,183,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class field_modifierContext extends ParserRuleContext<Token> {
		public field_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final field_modifierContext field_modifier() throws RecognitionException {
		field_modifierContext _localctx = new field_modifierContext(_ctx, 396);
		enterRule(_localctx, RULE_field_modifier);
		try {
			setState(2912);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2894); match(110);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2896); match(118);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2898); match(138);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(2900); match(78);
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(2902); match(48);
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(2904); match(131);
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(2906); match(53);
					}
					break;
				case 8:
					enterOuterAlt(_localctx, 8);
					{
					setState(2908); match(144);
					}
					break;
				case 9:
					enterOuterAlt(_localctx, 9);
					{
					setState(2910); field_modifier_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class variable_declaratorsContext extends ParserRuleContext<Token> {
		public variable_declaratorsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final variable_declaratorsContext variable_declarators() throws RecognitionException {
		variable_declaratorsContext _localctx = new variable_declaratorsContext(_ctx, 398);
		enterRule(_localctx, RULE_variable_declarators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2914); variable_declarator();
			setState(2922);
			_errHandler.sync(this);
			int _alt3807 = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt3807!=2 && _alt3807!=-1 ) {
			    if ( _alt3807==1 ) {
			        {
			        {
			        setState(2916); match(42);
			        setState(2918); variable_declarator();
			        }
			        } 
			    }
				setState(2924);
				_errHandler.sync(this);
				_alt3807 = getInterpreter().adaptivePredict(_input,185,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class variable_declaratorContext extends ParserRuleContext<Token> {
		public variable_declaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final variable_declaratorContext variable_declarator() throws RecognitionException {
		variable_declaratorContext _localctx = new variable_declaratorContext(_ctx, 400);
		enterRule(_localctx, RULE_variable_declarator);
		try {
			setState(2933);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2925); match(IDENTIFIER);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2927); match(IDENTIFIER);
					setState(2929); match(104);
					setState(2931); variable_initializer();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class variable_initializerContext extends ParserRuleContext<Token> {
		public variable_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final variable_initializerContext variable_initializer() throws RecognitionException {
		variable_initializerContext _localctx = new variable_initializerContext(_ctx, 402);
		enterRule(_localctx, RULE_variable_initializer);
		try {
			setState(2939);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2935); expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2937); array_initializer();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class method_declarationContext extends ParserRuleContext<Token> {
		public method_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final method_declarationContext method_declaration() throws RecognitionException {
		method_declarationContext _localctx = new method_declarationContext(_ctx, 404);
		enterRule(_localctx, RULE_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2941); method_header();
			setState(2943); method_body();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class method_headerContext extends ParserRuleContext<Token> {
		public method_headerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final method_headerContext method_header() throws RecognitionException {
		method_headerContext _localctx = new method_headerContext(_ctx, 406);
		enterRule(_localctx, RULE_method_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2947);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(2945); attributes();
					}
					break;
			}
			setState(2951);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(2949); method_modifiers();
					}
					break;
			}
			setState(2955);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(2953); match(13);
					}
					break;
			}
			setState(2957); return_type();
			setState(2959); member_name();
			setState(2963);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(2961); type_parameter_list();
					}
					break;
			}
			setState(2965); match(119);
			setState(2969);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(2967); formal_parameter_list();
					}
					break;
			}
			setState(2971); match(24);
			setState(2975);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(2973); type_parameter_constraints_clauses();
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class method_modifiersContext extends ParserRuleContext<Token> {
		public method_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final method_modifiersContext method_modifiers() throws RecognitionException {
		method_modifiersContext _localctx = new method_modifiersContext(_ctx, 408);
		enterRule(_localctx, RULE_method_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2977); method_modifier();
			setState(2983);
			_errHandler.sync(this);
			int _alt3892 = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt3892!=2 && _alt3892!=-1 ) {
			    if ( _alt3892==1 ) {
			        {
			        {
			        setState(2979); method_modifier();
			        }
			        } 
			    }
				setState(2985);
				_errHandler.sync(this);
				_alt3892 = getInterpreter().adaptivePredict(_input,194,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class method_modifierContext extends ParserRuleContext<Token> {
		public method_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final method_modifierContext method_modifier() throws RecognitionException {
		method_modifierContext _localctx = new method_modifierContext(_ctx, 410);
		enterRule(_localctx, RULE_method_modifier);
		try {
			setState(3010);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(2986); match(110);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(2988); match(118);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(2990); match(138);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(2992); match(78);
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(2994); match(48);
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(2996); match(131);
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(2998); match(100);
					}
					break;
				case 8:
					enterOuterAlt(_localctx, 8);
					{
					setState(3000); match(139);
					}
					break;
				case 9:
					enterOuterAlt(_localctx, 9);
					{
					setState(3002); match(92);
					}
					break;
				case 10:
					enterOuterAlt(_localctx, 10);
					{
					setState(3004); match(14);
					}
					break;
				case 11:
					enterOuterAlt(_localctx, 11);
					{
					setState(3006); match(66);
					}
					break;
				case 12:
					enterOuterAlt(_localctx, 12);
					{
					setState(3008); method_modifier_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class return_typeContext extends ParserRuleContext<Token> {
		public return_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final return_typeContext return_type() throws RecognitionException {
		return_typeContext _localctx = new return_typeContext(_ctx, 412);
		enterRule(_localctx, RULE_return_type);
		try {
			setState(3016);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3012); type();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3014); match(VOID);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class member_nameContext extends ParserRuleContext<Token> {
		public member_nameContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final member_nameContext member_name() throws RecognitionException {
		member_nameContext _localctx = new member_nameContext(_ctx, 414);
		enterRule(_localctx, RULE_member_name);
		try {
			setState(3026);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3018); match(IDENTIFIER);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3020); interface_type();
					setState(3022); match(65);
					setState(3024); match(IDENTIFIER);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class method_bodyContext extends ParserRuleContext<Token> {
		public method_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final method_bodyContext method_body() throws RecognitionException {
		method_bodyContext _localctx = new method_bodyContext(_ctx, 416);
		enterRule(_localctx, RULE_method_body);
		try {
			setState(3032);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3028); block();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3030); match(143);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class formal_parameter_listContext extends ParserRuleContext<Token> {
		public formal_parameter_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		formal_parameter_listContext _localctx = new formal_parameter_listContext(_ctx, 418);
		enterRule(_localctx, RULE_formal_parameter_list);
		try {
			setState(3044);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3034); fixed_parameters();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3036); fixed_parameters();
					setState(3038); match(42);
					setState(3040); parameter_array();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(3042); parameter_array();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class fixed_parametersContext extends ParserRuleContext<Token> {
		public fixed_parametersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final fixed_parametersContext fixed_parameters() throws RecognitionException {
		fixed_parametersContext _localctx = new fixed_parametersContext(_ctx, 420);
		enterRule(_localctx, RULE_fixed_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3046); fixed_parameter();
			setState(3054);
			_errHandler.sync(this);
			int _alt4021 = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt4021!=2 && _alt4021!=-1 ) {
			    if ( _alt4021==1 ) {
			        {
			        {
			        setState(3048); match(42);
			        setState(3050); fixed_parameter();
			        }
			        } 
			    }
				setState(3056);
				_errHandler.sync(this);
				_alt4021 = getInterpreter().adaptivePredict(_input,200,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class fixed_parameterContext extends ParserRuleContext<Token> {
		public fixed_parameterContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final fixed_parameterContext fixed_parameter() throws RecognitionException {
		fixed_parameterContext _localctx = new fixed_parameterContext(_ctx, 422);
		enterRule(_localctx, RULE_fixed_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3059);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(3057); attributes();
					}
					break;
			}
			setState(3063);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(3061); parameter_modifier();
					}
					break;
			}
			setState(3065); type();
			setState(3067); match(IDENTIFIER);
			setState(3071);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(3069); default_argument();
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class default_argumentContext extends ParserRuleContext<Token> {
		public default_argumentContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final default_argumentContext default_argument() throws RecognitionException {
		default_argumentContext _localctx = new default_argumentContext(_ctx, 424);
		enterRule(_localctx, RULE_default_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3073); match(104);
			setState(3075); expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class parameter_modifierContext extends ParserRuleContext<Token> {
		public parameter_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final parameter_modifierContext parameter_modifier() throws RecognitionException {
		parameter_modifierContext _localctx = new parameter_modifierContext(_ctx, 426);
		enterRule(_localctx, RULE_parameter_modifier);
		try {
			setState(3083);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 120:
					enterOuterAlt(_localctx, 1);
					{
					setState(3077); match(120);
					}
					break;
				case 77:
					enterOuterAlt(_localctx, 2);
					{
					setState(3079); match(77);
					}
					break;
				case 146:
					enterOuterAlt(_localctx, 3);
					{
					setState(3081); match(146);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class parameter_arrayContext extends ParserRuleContext<Token> {
		public parameter_arrayContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final parameter_arrayContext parameter_array() throws RecognitionException {
		parameter_arrayContext _localctx = new parameter_arrayContext(_ctx, 428);
		enterRule(_localctx, RULE_parameter_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3087);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(3085); attributes();
					}
					break;
			}
			setState(3089); match(30);
			setState(3091); array_type();
			setState(3093); match(IDENTIFIER);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class property_declarationContext extends ParserRuleContext<Token> {
		public property_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final property_declarationContext property_declaration() throws RecognitionException {
		property_declarationContext _localctx = new property_declarationContext(_ctx, 430);
		enterRule(_localctx, RULE_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3097);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(3095); attributes();
					}
					break;
			}
			setState(3101);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(3099); property_modifiers();
					}
					break;
			}
			setState(3103); type();
			setState(3105); member_name();
			setState(3107); match(126);
			setState(3109); accessor_declarations();
			setState(3111); match(16);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class property_modifiersContext extends ParserRuleContext<Token> {
		public property_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final property_modifiersContext property_modifiers() throws RecognitionException {
		property_modifiersContext _localctx = new property_modifiersContext(_ctx, 432);
		enterRule(_localctx, RULE_property_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3113); property_modifier();
			setState(3119);
			_errHandler.sync(this);
			int _alt4118 = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt4118!=2 && _alt4118!=-1 ) {
			    if ( _alt4118==1 ) {
			        {
			        {
			        setState(3115); property_modifier();
			        }
			        } 
			    }
				setState(3121);
				_errHandler.sync(this);
				_alt4118 = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class property_modifierContext extends ParserRuleContext<Token> {
		public property_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final property_modifierContext property_modifier() throws RecognitionException {
		property_modifierContext _localctx = new property_modifierContext(_ctx, 434);
		enterRule(_localctx, RULE_property_modifier);
		try {
			setState(3146);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3122); match(110);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3124); match(118);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(3126); match(138);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(3128); match(78);
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(3130); match(48);
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(3132); match(131);
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(3134); match(100);
					}
					break;
				case 8:
					enterOuterAlt(_localctx, 8);
					{
					setState(3136); match(139);
					}
					break;
				case 9:
					enterOuterAlt(_localctx, 9);
					{
					setState(3138); match(92);
					}
					break;
				case 10:
					enterOuterAlt(_localctx, 10);
					{
					setState(3140); match(14);
					}
					break;
				case 11:
					enterOuterAlt(_localctx, 11);
					{
					setState(3142); match(66);
					}
					break;
				case 12:
					enterOuterAlt(_localctx, 12);
					{
					setState(3144); property_modifier_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class accessor_declarationsContext extends ParserRuleContext<Token> {
		public accessor_declarationsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final accessor_declarationsContext accessor_declarations() throws RecognitionException {
		accessor_declarationsContext _localctx = new accessor_declarationsContext(_ctx, 436);
		enterRule(_localctx, RULE_accessor_declarations);
		try {
			setState(3160);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3148); get_accessor_declaration();
					setState(3152);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
						case 1:
							{
							setState(3150); set_accessor_declaration();
							}
							break;
					}
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3154); set_accessor_declaration();
					setState(3158);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
						case 1:
							{
							setState(3156); get_accessor_declaration();
							}
							break;
					}
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class get_accessor_declarationContext extends ParserRuleContext<Token> {
		public get_accessor_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final get_accessor_declarationContext get_accessor_declaration() throws RecognitionException {
		get_accessor_declarationContext _localctx = new get_accessor_declarationContext(_ctx, 438);
		enterRule(_localctx, RULE_get_accessor_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3164);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(3162); attributes();
					}
					break;
			}
			setState(3168);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(3166); accessor_modifier();
					}
					break;
			}
			setState(3170); match(39);
			setState(3172); accessor_body();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class set_accessor_declarationContext extends ParserRuleContext<Token> {
		public set_accessor_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final set_accessor_declarationContext set_accessor_declaration() throws RecognitionException {
		set_accessor_declarationContext _localctx = new set_accessor_declarationContext(_ctx, 440);
		enterRule(_localctx, RULE_set_accessor_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3176);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(3174); attributes();
					}
					break;
			}
			setState(3180);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(3178); accessor_modifier();
					}
					break;
			}
			setState(3182); match(51);
			setState(3184); accessor_body();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class accessor_modifierContext extends ParserRuleContext<Token> {
		public accessor_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final accessor_modifierContext accessor_modifier() throws RecognitionException {
		accessor_modifierContext _localctx = new accessor_modifierContext(_ctx, 442);
		enterRule(_localctx, RULE_accessor_modifier);
		try {
			setState(3200);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3186); match(138);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3188); match(78);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(3190); match(48);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(3192); match(138);
					setState(3194); match(78);
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(3196); match(78);
					setState(3198); match(138);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class accessor_bodyContext extends ParserRuleContext<Token> {
		public accessor_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final accessor_bodyContext accessor_body() throws RecognitionException {
		accessor_bodyContext _localctx = new accessor_bodyContext(_ctx, 444);
		enterRule(_localctx, RULE_accessor_body);
		try {
			setState(3206);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3202); block();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3204); match(143);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class event_declarationContext extends ParserRuleContext<Token> {
		public event_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final event_declarationContext event_declaration() throws RecognitionException {
		event_declarationContext _localctx = new event_declarationContext(_ctx, 446);
		enterRule(_localctx, RULE_event_declaration);
		try {
			setState(3244);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3210);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
						case 1:
							{
							setState(3208); attributes();
							}
							break;
					}
					setState(3214);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
						case 1:
							{
							setState(3212); event_modifiers();
							}
							break;
					}
					setState(3216); match(147);
					setState(3218); type();
					setState(3220); variable_declarators();
					setState(3222); match(143);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3226);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
						case 1:
							{
							setState(3224); attributes();
							}
							break;
					}
					setState(3230);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
						case 1:
							{
							setState(3228); event_modifiers();
							}
							break;
					}
					setState(3232); match(147);
					setState(3234); type();
					setState(3236); member_name();
					setState(3238); match(126);
					setState(3240); event_accessor_declarations();
					setState(3242); match(16);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class event_modifiersContext extends ParserRuleContext<Token> {
		public event_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final event_modifiersContext event_modifiers() throws RecognitionException {
		event_modifiersContext _localctx = new event_modifiersContext(_ctx, 448);
		enterRule(_localctx, RULE_event_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3246); event_modifier();
			setState(3252);
			_errHandler.sync(this);
			int _alt4315 = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt4315!=2 && _alt4315!=-1 ) {
			    if ( _alt4315==1 ) {
			        {
			        {
			        setState(3248); event_modifier();
			        }
			        } 
			    }
				setState(3254);
				_errHandler.sync(this);
				_alt4315 = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class event_modifierContext extends ParserRuleContext<Token> {
		public event_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final event_modifierContext event_modifier() throws RecognitionException {
		event_modifierContext _localctx = new event_modifierContext(_ctx, 450);
		enterRule(_localctx, RULE_event_modifier);
		try {
			setState(3279);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3255); match(110);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3257); match(118);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(3259); match(138);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(3261); match(78);
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(3263); match(48);
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(3265); match(131);
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(3267); match(100);
					}
					break;
				case 8:
					enterOuterAlt(_localctx, 8);
					{
					setState(3269); match(139);
					}
					break;
				case 9:
					enterOuterAlt(_localctx, 9);
					{
					setState(3271); match(92);
					}
					break;
				case 10:
					enterOuterAlt(_localctx, 10);
					{
					setState(3273); match(14);
					}
					break;
				case 11:
					enterOuterAlt(_localctx, 11);
					{
					setState(3275); match(66);
					}
					break;
				case 12:
					enterOuterAlt(_localctx, 12);
					{
					setState(3277); event_modifier_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class event_accessor_declarationsContext extends ParserRuleContext<Token> {
		public event_accessor_declarationsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final event_accessor_declarationsContext event_accessor_declarations() throws RecognitionException {
		event_accessor_declarationsContext _localctx = new event_accessor_declarationsContext(_ctx, 452);
		enterRule(_localctx, RULE_event_accessor_declarations);
		try {
			setState(3289);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3281); add_accessor_declaration();
					setState(3283); remove_accessor_declaration();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3285); remove_accessor_declaration();
					setState(3287); add_accessor_declaration();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class add_accessor_declarationContext extends ParserRuleContext<Token> {
		public add_accessor_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final add_accessor_declarationContext add_accessor_declaration() throws RecognitionException {
		add_accessor_declarationContext _localctx = new add_accessor_declarationContext(_ctx, 454);
		enterRule(_localctx, RULE_add_accessor_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3293);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(3291); attributes();
					}
					break;
			}
			setState(3295); match(130);
			setState(3297); block();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class remove_accessor_declarationContext extends ParserRuleContext<Token> {
		public remove_accessor_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final remove_accessor_declarationContext remove_accessor_declaration() throws RecognitionException {
		remove_accessor_declarationContext _localctx = new remove_accessor_declarationContext(_ctx, 456);
		enterRule(_localctx, RULE_remove_accessor_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3301);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(3299); attributes();
					}
					break;
			}
			setState(3303); match(79);
			setState(3305); block();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class indexer_declarationContext extends ParserRuleContext<Token> {
		public indexer_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final indexer_declarationContext indexer_declaration() throws RecognitionException {
		indexer_declarationContext _localctx = new indexer_declarationContext(_ctx, 458);
		enterRule(_localctx, RULE_indexer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3309);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(3307); attributes();
					}
					break;
			}
			setState(3313);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(3311); indexer_modifiers();
					}
					break;
			}
			setState(3315); indexer_declarator();
			setState(3317); match(126);
			setState(3319); accessor_declarations();
			setState(3321); match(16);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class indexer_modifiersContext extends ParserRuleContext<Token> {
		public indexer_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final indexer_modifiersContext indexer_modifiers() throws RecognitionException {
		indexer_modifiersContext _localctx = new indexer_modifiersContext(_ctx, 460);
		enterRule(_localctx, RULE_indexer_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3323); indexer_modifier();
			setState(3329);
			_errHandler.sync(this);
			int _alt4444 = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt4444!=2 && _alt4444!=-1 ) {
			    if ( _alt4444==1 ) {
			        {
			        {
			        setState(3325); indexer_modifier();
			        }
			        } 
			    }
				setState(3331);
				_errHandler.sync(this);
				_alt4444 = getInterpreter().adaptivePredict(_input,231,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class indexer_modifierContext extends ParserRuleContext<Token> {
		public indexer_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final indexer_modifierContext indexer_modifier() throws RecognitionException {
		indexer_modifierContext _localctx = new indexer_modifierContext(_ctx, 462);
		enterRule(_localctx, RULE_indexer_modifier);
		try {
			setState(3354);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3332); match(110);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3334); match(118);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(3336); match(138);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(3338); match(78);
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(3340); match(48);
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(3342); match(100);
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(3344); match(139);
					}
					break;
				case 8:
					enterOuterAlt(_localctx, 8);
					{
					setState(3346); match(92);
					}
					break;
				case 9:
					enterOuterAlt(_localctx, 9);
					{
					setState(3348); match(14);
					}
					break;
				case 10:
					enterOuterAlt(_localctx, 10);
					{
					setState(3350); match(66);
					}
					break;
				case 11:
					enterOuterAlt(_localctx, 11);
					{
					setState(3352); indexer_modifier_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class indexer_declaratorContext extends ParserRuleContext<Token> {
		public indexer_declaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final indexer_declaratorContext indexer_declarator() throws RecognitionException {
		indexer_declaratorContext _localctx = new indexer_declaratorContext(_ctx, 464);
		enterRule(_localctx, RULE_indexer_declarator);
		try {
			setState(3380);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3356); type();
					setState(3358); match(146);
					setState(3360); match(82);
					setState(3362); formal_parameter_list();
					setState(3364); match(115);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3366); type();
					setState(3368); interface_type();
					setState(3370); match(65);
					setState(3372); match(146);
					setState(3374); match(82);
					setState(3376); formal_parameter_list();
					setState(3378); match(115);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class operator_declarationContext extends ParserRuleContext<Token> {
		public operator_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final operator_declarationContext operator_declaration() throws RecognitionException {
		operator_declarationContext _localctx = new operator_declarationContext(_ctx, 466);
		enterRule(_localctx, RULE_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3384);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(3382); attributes();
					}
					break;
			}
			setState(3386); operator_modifiers();
			setState(3388); operator_declarator();
			setState(3390); operator_body();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class operator_modifiersContext extends ParserRuleContext<Token> {
		public operator_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final operator_modifiersContext operator_modifiers() throws RecognitionException {
		operator_modifiersContext _localctx = new operator_modifiersContext(_ctx, 468);
		enterRule(_localctx, RULE_operator_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3392); operator_modifier();
			setState(3398);
			_errHandler.sync(this);
			int _alt4554 = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt4554!=2 && _alt4554!=-1 ) {
			    if ( _alt4554==1 ) {
			        {
			        {
			        setState(3394); operator_modifier();
			        }
			        } 
			    }
				setState(3400);
				_errHandler.sync(this);
				_alt4554 = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class operator_modifierContext extends ParserRuleContext<Token> {
		public operator_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final operator_modifierContext operator_modifier() throws RecognitionException {
		operator_modifierContext _localctx = new operator_modifierContext(_ctx, 470);
		enterRule(_localctx, RULE_operator_modifier);
		try {
			setState(3409);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3401); match(118);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3403); match(131);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(3405); match(66);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(3407); operator_modifier_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class operator_declaratorContext extends ParserRuleContext<Token> {
		public operator_declaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final operator_declaratorContext operator_declarator() throws RecognitionException {
		operator_declaratorContext _localctx = new operator_declaratorContext(_ctx, 472);
		enterRule(_localctx, RULE_operator_declarator);
		try {
			setState(3417);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3411); unary_operator_declarator();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3413); binary_operator_declarator();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(3415); conversion_operator_declarator();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class unary_operator_declaratorContext extends ParserRuleContext<Token> {
		public unary_operator_declaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final unary_operator_declaratorContext unary_operator_declarator() throws RecognitionException {
		unary_operator_declaratorContext _localctx = new unary_operator_declaratorContext(_ctx, 474);
		enterRule(_localctx, RULE_unary_operator_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3419); type();
			setState(3421); match(140);
			setState(3423); overloadable_unary_operator();
			setState(3425); match(119);
			setState(3427); type();
			setState(3429); match(IDENTIFIER);
			setState(3431); match(24);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class overloadable_unary_operatorContext extends ParserRuleContext<Token> {
		public overloadable_unary_operatorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final overloadable_unary_operatorContext overloadable_unary_operator() throws RecognitionException {
		overloadable_unary_operatorContext _localctx = new overloadable_unary_operatorContext(_ctx, 476);
		enterRule(_localctx, RULE_overloadable_unary_operator);
		try {
			setState(3449);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 67:
					enterOuterAlt(_localctx, 1);
					{
					setState(3433); match(67);
					}
					break;
				case 44:
					enterOuterAlt(_localctx, 2);
					{
					setState(3435); match(44);
					}
					break;
				case 33:
					enterOuterAlt(_localctx, 3);
					{
					setState(3437); match(33);
					}
					break;
				case 76:
					enterOuterAlt(_localctx, 4);
					{
					setState(3439); match(76);
					}
					break;
				case 61:
					enterOuterAlt(_localctx, 5);
					{
					setState(3441); match(61);
					}
					break;
				case 85:
					enterOuterAlt(_localctx, 6);
					{
					setState(3443); match(85);
					}
					break;
				case 60:
					enterOuterAlt(_localctx, 7);
					{
					setState(3445); match(60);
					}
					break;
				case 8:
					enterOuterAlt(_localctx, 8);
					{
					setState(3447); match(8);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class binary_operator_declaratorContext extends ParserRuleContext<Token> {
		public binary_operator_declaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final binary_operator_declaratorContext binary_operator_declarator() throws RecognitionException {
		binary_operator_declaratorContext _localctx = new binary_operator_declaratorContext(_ctx, 478);
		enterRule(_localctx, RULE_binary_operator_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3451); type();
			setState(3453); match(140);
			setState(3455); overloadable_binary_operator();
			setState(3457); match(119);
			setState(3459); type();
			setState(3461); match(IDENTIFIER);
			setState(3463); match(42);
			setState(3465); type();
			setState(3467); match(IDENTIFIER);
			setState(3469); match(24);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class overloadable_binary_operatorContext extends ParserRuleContext<Token> {
		public overloadable_binary_operatorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final overloadable_binary_operatorContext overloadable_binary_operator() throws RecognitionException {
		overloadable_binary_operatorContext _localctx = new overloadable_binary_operatorContext(_ctx, 480);
		enterRule(_localctx, RULE_overloadable_binary_operator);
		try {
			setState(3503);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 67:
					enterOuterAlt(_localctx, 1);
					{
					setState(3471); match(67);
					}
					break;
				case 44:
					enterOuterAlt(_localctx, 2);
					{
					setState(3473); match(44);
					}
					break;
				case STAR:
					enterOuterAlt(_localctx, 3);
					{
					setState(3475); match(STAR);
					}
					break;
				case 75:
					enterOuterAlt(_localctx, 4);
					{
					setState(3477); match(75);
					}
					break;
				case 97:
					enterOuterAlt(_localctx, 5);
					{
					setState(3479); match(97);
					}
					break;
				case 80:
					enterOuterAlt(_localctx, 6);
					{
					setState(3481); match(80);
					}
					break;
				case 32:
					enterOuterAlt(_localctx, 7);
					{
					setState(3483); match(32);
					}
					break;
				case 133:
					enterOuterAlt(_localctx, 8);
					{
					setState(3485); match(133);
					}
					break;
				case 90:
					enterOuterAlt(_localctx, 9);
					{
					setState(3487); match(90);
					}
					break;
				case 102:
					enterOuterAlt(_localctx, 10);
					{
					setState(3489); match(102);
					}
					break;
				case 150:
					enterOuterAlt(_localctx, 11);
					{
					setState(3491); match(150);
					}
					break;
				case 88:
					enterOuterAlt(_localctx, 12);
					{
					setState(3493); match(88);
					}
					break;
				case 70:
					enterOuterAlt(_localctx, 13);
					{
					setState(3495); match(70);
					}
					break;
				case 84:
					enterOuterAlt(_localctx, 14);
					{
					setState(3497); match(84);
					}
					break;
				case 151:
					enterOuterAlt(_localctx, 15);
					{
					setState(3499); match(151);
					}
					break;
				case 89:
					enterOuterAlt(_localctx, 16);
					{
					setState(3501); match(89);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class conversion_operator_declaratorContext extends ParserRuleContext<Token> {
		public conversion_operator_declaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final conversion_operator_declaratorContext conversion_operator_declarator() throws RecognitionException {
		conversion_operator_declaratorContext _localctx = new conversion_operator_declaratorContext(_ctx, 482);
		enterRule(_localctx, RULE_conversion_operator_declarator);
		try {
			setState(3533);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 4:
					enterOuterAlt(_localctx, 1);
					{
					setState(3505); match(4);
					setState(3507); match(140);
					setState(3509); type();
					setState(3511); match(119);
					setState(3513); type();
					setState(3515); match(IDENTIFIER);
					setState(3517); match(24);
					}
					break;
				case 101:
					enterOuterAlt(_localctx, 2);
					{
					setState(3519); match(101);
					setState(3521); match(140);
					setState(3523); type();
					setState(3525); match(119);
					setState(3527); type();
					setState(3529); match(IDENTIFIER);
					setState(3531); match(24);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class operator_bodyContext extends ParserRuleContext<Token> {
		public operator_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final operator_bodyContext operator_body() throws RecognitionException {
		operator_bodyContext _localctx = new operator_bodyContext(_ctx, 484);
		enterRule(_localctx, RULE_operator_body);
		try {
			setState(3539);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3535); block();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3537); match(143);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constructor_declarationContext extends ParserRuleContext<Token> {
		public constructor_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constructor_declarationContext constructor_declaration() throws RecognitionException {
		constructor_declarationContext _localctx = new constructor_declarationContext(_ctx, 486);
		enterRule(_localctx, RULE_constructor_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3543);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(3541); attributes();
					}
					break;
			}
			setState(3547);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(3545); constructor_modifiers();
					}
					break;
			}
			setState(3549); constructor_declarator();
			setState(3551); constructor_body();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constructor_modifiersContext extends ParserRuleContext<Token> {
		public constructor_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constructor_modifiersContext constructor_modifiers() throws RecognitionException {
		constructor_modifiersContext _localctx = new constructor_modifiersContext(_ctx, 488);
		enterRule(_localctx, RULE_constructor_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3553); constructor_modifier();
			setState(3559);
			_errHandler.sync(this);
			int _alt4819 = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt4819!=2 && _alt4819!=-1 ) {
			    if ( _alt4819==1 ) {
			        {
			        {
			        setState(3555); constructor_modifier();
			        }
			        } 
			    }
				setState(3561);
				_errHandler.sync(this);
				_alt4819 = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constructor_modifierContext extends ParserRuleContext<Token> {
		public constructor_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constructor_modifierContext constructor_modifier() throws RecognitionException {
		constructor_modifierContext _localctx = new constructor_modifierContext(_ctx, 490);
		enterRule(_localctx, RULE_constructor_modifier);
		try {
			setState(3574);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3562); match(118);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3564); match(138);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(3566); match(78);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(3568); match(48);
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(3570); match(66);
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(3572); constructor_modifier_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constructor_declaratorContext extends ParserRuleContext<Token> {
		public constructor_declaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constructor_declaratorContext constructor_declarator() throws RecognitionException {
		constructor_declaratorContext _localctx = new constructor_declaratorContext(_ctx, 492);
		enterRule(_localctx, RULE_constructor_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3576); match(IDENTIFIER);
			setState(3578); match(119);
			setState(3582);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(3580); formal_parameter_list();
					}
					break;
			}
			setState(3584); match(24);
			setState(3588);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(3586); constructor_initializer();
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constructor_initializerContext extends ParserRuleContext<Token> {
		public constructor_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constructor_initializerContext constructor_initializer() throws RecognitionException {
		constructor_initializerContext _localctx = new constructor_initializerContext(_ctx, 494);
		enterRule(_localctx, RULE_constructor_initializer);
		try {
			setState(3614);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3590); match(121);
					setState(3592); match(142);
					setState(3594); match(119);
					setState(3598);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
						case 1:
							{
							setState(3596); argument_list();
							}
							break;
					}
					setState(3600); match(24);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3602); match(121);
					setState(3604); match(146);
					setState(3606); match(119);
					setState(3610);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
						case 1:
							{
							setState(3608); argument_list();
							}
							break;
					}
					setState(3612); match(24);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constructor_bodyContext extends ParserRuleContext<Token> {
		public constructor_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constructor_bodyContext constructor_body() throws RecognitionException {
		constructor_bodyContext _localctx = new constructor_bodyContext(_ctx, 496);
		enterRule(_localctx, RULE_constructor_body);
		try {
			setState(3620);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3616); block();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3618); match(143);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class static_constructor_declarationContext extends ParserRuleContext<Token> {
		public static_constructor_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final static_constructor_declarationContext static_constructor_declaration() throws RecognitionException {
		static_constructor_declarationContext _localctx = new static_constructor_declarationContext(_ctx, 498);
		enterRule(_localctx, RULE_static_constructor_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3624);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(3622); attributes();
					}
					break;
			}
			setState(3626); static_constructor_modifiers();
			setState(3628); match(IDENTIFIER);
			setState(3630); match(119);
			setState(3632); match(24);
			setState(3634); static_constructor_body();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class static_constructor_modifiersContext extends ParserRuleContext<Token> {
		public static_constructor_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final static_constructor_modifiersContext static_constructor_modifiers() throws RecognitionException {
		static_constructor_modifiersContext _localctx = new static_constructor_modifiersContext(_ctx, 500);
		enterRule(_localctx, RULE_static_constructor_modifiers);
		try {
			setState(3650);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3638);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
						case 1:
							{
							setState(3636); match(66);
							}
							break;
					}
					setState(3640); match(131);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3642); match(131);
					setState(3646);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
						case 1:
							{
							setState(3644); match(66);
							}
							break;
					}
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(3648); static_constructor_modifiers_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class static_constructor_bodyContext extends ParserRuleContext<Token> {
		public static_constructor_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final static_constructor_bodyContext static_constructor_body() throws RecognitionException {
		static_constructor_bodyContext _localctx = new static_constructor_bodyContext(_ctx, 502);
		enterRule(_localctx, RULE_static_constructor_body);
		try {
			setState(3656);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3652); block();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3654); match(143);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class destructor_declarationContext extends ParserRuleContext<Token> {
		public destructor_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final destructor_declarationContext destructor_declaration() throws RecognitionException {
		destructor_declarationContext _localctx = new destructor_declarationContext(_ctx, 504);
		enterRule(_localctx, RULE_destructor_declaration);
		try {
			setState(3678);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3660);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
						case 1:
							{
							setState(3658); attributes();
							}
							break;
					}
					setState(3664);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
						case 1:
							{
							setState(3662); match(66);
							}
							break;
					}
					setState(3666); match(76);
					setState(3668); match(IDENTIFIER);
					setState(3670); match(119);
					setState(3672); match(24);
					setState(3674); destructor_body();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3676); destructor_declaration_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class destructor_bodyContext extends ParserRuleContext<Token> {
		public destructor_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final destructor_bodyContext destructor_body() throws RecognitionException {
		destructor_bodyContext _localctx = new destructor_bodyContext(_ctx, 506);
		enterRule(_localctx, RULE_destructor_body);
		try {
			setState(3684);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3680); block();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3682); match(143);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class struct_declarationContext extends ParserRuleContext<Token> {
		public struct_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final struct_declarationContext struct_declaration() throws RecognitionException {
		struct_declarationContext _localctx = new struct_declarationContext(_ctx, 508);
		enterRule(_localctx, RULE_struct_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3688);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(3686); attributes();
					}
					break;
			}
			setState(3692);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(3690); struct_modifiers();
					}
					break;
			}
			setState(3696);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(3694); match(13);
					}
					break;
			}
			setState(3698); match(62);
			setState(3700); match(IDENTIFIER);
			setState(3704);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(3702); type_parameter_list();
					}
					break;
			}
			setState(3708);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(3706); struct_interfaces();
					}
					break;
			}
			setState(3712);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(3710); type_parameter_constraints_clauses();
					}
					break;
			}
			setState(3714); struct_body();
			setState(3718);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(3716); match(143);
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class struct_modifiersContext extends ParserRuleContext<Token> {
		public struct_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final struct_modifiersContext struct_modifiers() throws RecognitionException {
		struct_modifiersContext _localctx = new struct_modifiersContext(_ctx, 510);
		enterRule(_localctx, RULE_struct_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3720); struct_modifier();
			setState(3726);
			_errHandler.sync(this);
			int _alt5048 = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt5048!=2 && _alt5048!=-1 ) {
			    if ( _alt5048==1 ) {
			        {
			        {
			        setState(3722); struct_modifier();
			        }
			        } 
			    }
				setState(3728);
				_errHandler.sync(this);
				_alt5048 = getInterpreter().adaptivePredict(_input,268,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class struct_modifierContext extends ParserRuleContext<Token> {
		public struct_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final struct_modifierContext struct_modifier() throws RecognitionException {
		struct_modifierContext _localctx = new struct_modifierContext(_ctx, 512);
		enterRule(_localctx, RULE_struct_modifier);
		try {
			setState(3741);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3729); match(110);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3731); match(118);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(3733); match(138);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(3735); match(78);
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(3737); match(48);
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(3739); struct_modifier_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class struct_interfacesContext extends ParserRuleContext<Token> {
		public struct_interfacesContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final struct_interfacesContext struct_interfaces() throws RecognitionException {
		struct_interfacesContext _localctx = new struct_interfacesContext(_ctx, 514);
		enterRule(_localctx, RULE_struct_interfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3743); match(121);
			setState(3745); interface_type_list();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class struct_bodyContext extends ParserRuleContext<Token> {
		public struct_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final struct_bodyContext struct_body() throws RecognitionException {
		struct_bodyContext _localctx = new struct_bodyContext(_ctx, 516);
		enterRule(_localctx, RULE_struct_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3747); match(126);
			setState(3751);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(3749); struct_member_declarations();
					}
					break;
			}
			setState(3753); match(16);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class struct_member_declarationsContext extends ParserRuleContext<Token> {
		public struct_member_declarationsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final struct_member_declarationsContext struct_member_declarations() throws RecognitionException {
		struct_member_declarationsContext _localctx = new struct_member_declarationsContext(_ctx, 518);
		enterRule(_localctx, RULE_struct_member_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3755); struct_member_declaration();
			setState(3761);
			_errHandler.sync(this);
			int _alt5114 = getInterpreter().adaptivePredict(_input,271,_ctx);
			while ( _alt5114!=2 && _alt5114!=-1 ) {
			    if ( _alt5114==1 ) {
			        {
			        {
			        setState(3757); struct_member_declaration();
			        }
			        } 
			    }
				setState(3763);
				_errHandler.sync(this);
				_alt5114 = getInterpreter().adaptivePredict(_input,271,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class struct_member_declarationContext extends ParserRuleContext<Token> {
		public struct_member_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final struct_member_declarationContext struct_member_declaration() throws RecognitionException {
		struct_member_declarationContext _localctx = new struct_member_declarationContext(_ctx, 520);
		enterRule(_localctx, RULE_struct_member_declaration);
		try {
			setState(3786);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3764); constant_declaration();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3766); field_declaration();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(3768); method_declaration();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(3770); property_declaration();
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(3772); event_declaration();
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(3774); indexer_declaration();
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(3776); operator_declaration();
					}
					break;
				case 8:
					enterOuterAlt(_localctx, 8);
					{
					setState(3778); constructor_declaration();
					}
					break;
				case 9:
					enterOuterAlt(_localctx, 9);
					{
					setState(3780); static_constructor_declaration();
					}
					break;
				case 10:
					enterOuterAlt(_localctx, 10);
					{
					setState(3782); type_declaration();
					}
					break;
				case 11:
					enterOuterAlt(_localctx, 11);
					{
					setState(3784); struct_member_declaration_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class array_typeContext extends ParserRuleContext<Token> {
		public array_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final array_typeContext array_type() throws RecognitionException {
		array_typeContext _localctx = new array_typeContext(_ctx, 522);
		enterRule(_localctx, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3806);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(3788); type_name();
					}
					break;
				case 2:
					{
					setState(3790); simple_type();
					}
					break;
				case 3:
					{
					setState(3792); enum_type();
					}
					break;
				case 4:
					{
					setState(3794); class_type();
					}
					break;
				case 5:
					{
					setState(3796); interface_type();
					}
					break;
				case 6:
					{
					setState(3798); delegate_type();
					}
					break;
				case 7:
					{
					setState(3800); type_parameter();
					}
					break;
				case 8:
					{
					setState(3802); match(VOID);
					setState(3804); match(STAR);
					}
					break;
			}
			setState(3817); 
			_errHandler.sync(this);
			int _alt5222 = getInterpreter().adaptivePredict(_input,275,_ctx);
			do {
				switch ( _alt5222 ) {
					case 1:
						{
						{
						setState(3812);
						_errHandler.sync(this);
						int _alt5218 = getInterpreter().adaptivePredict(_input,274,_ctx);
						while ( _alt5218!=2 && _alt5218!=-1 ) {
						    if ( _alt5218==1 ) {
						        {
						        {
						        setState(3808);
						        _input.LT(1);
						        _la = _input.LA(1);
						        if ( !(_la==INTERR || _la==STAR) ) {
						        _errHandler.recoverInline(this);
						        }
						        consume();
						        }
						        } 
						    }
							setState(3814);
							_errHandler.sync(this);
							_alt5218 = getInterpreter().adaptivePredict(_input,274,_ctx);
						}
						setState(3815); rank_specifier();
						}
						}
						break;
					default :
						throw new NoViableAltException(this);
				}
				setState(3819); 
				_errHandler.sync(this);
				_alt5222 = getInterpreter().adaptivePredict(_input,275,_ctx);
			} while ( _alt5222!=2 && _alt5222!=-1 );
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class non_array_typeContext extends ParserRuleContext<Token> {
		public non_array_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final non_array_typeContext non_array_type() throws RecognitionException {
		non_array_typeContext _localctx = new non_array_typeContext(_ctx, 524);
		enterRule(_localctx, RULE_non_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3839);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(3821); type_name();
					}
					break;
				case 2:
					{
					setState(3823); simple_type();
					}
					break;
				case 3:
					{
					setState(3825); enum_type();
					}
					break;
				case 4:
					{
					setState(3827); class_type();
					}
					break;
				case 5:
					{
					setState(3829); interface_type();
					}
					break;
				case 6:
					{
					setState(3831); delegate_type();
					}
					break;
				case 7:
					{
					setState(3833); type_parameter();
					}
					break;
				case 8:
					{
					setState(3835); match(VOID);
					setState(3837); match(STAR);
					}
					break;
			}
			setState(3849);
			_errHandler.sync(this);
			int _alt5279 = getInterpreter().adaptivePredict(_input,278,_ctx);
			while ( _alt5279!=2 && _alt5279!=-1 ) {
			    if ( _alt5279==1 ) {
			        {
			        setState(3847);
			        //_errHandler.sync(this);
			        switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			        	case 1:
			        		{
			        		setState(3841); rank_specifier();
			        		}
			        		break;
			        	case 2:
			        		{
			        		setState(3843); match(INTERR);
			        		}
			        		break;
			        	case 3:
			        		{
			        		setState(3845); match(STAR);
			        		}
			        		break;
			        }
			        } 
			    }
				setState(3851);
				_errHandler.sync(this);
				_alt5279 = getInterpreter().adaptivePredict(_input,278,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class rank_specifiersContext extends ParserRuleContext<Token> {
		public rank_specifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final rank_specifiersContext rank_specifiers() throws RecognitionException {
		rank_specifiersContext _localctx = new rank_specifiersContext(_ctx, 526);
		enterRule(_localctx, RULE_rank_specifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3854); 
			_errHandler.sync(this);
			int _alt5290 = getInterpreter().adaptivePredict(_input,279,_ctx);
			do {
				switch ( _alt5290 ) {
					case 1:
						{
						{
						setState(3852); rank_specifier();
						}
						}
						break;
					default :
						throw new NoViableAltException(this);
				}
				setState(3856); 
				_errHandler.sync(this);
				_alt5290 = getInterpreter().adaptivePredict(_input,279,_ctx);
			} while ( _alt5290!=2 && _alt5290!=-1 );
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class rank_specifierContext extends ParserRuleContext<Token> {
		public rank_specifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final rank_specifierContext rank_specifier() throws RecognitionException {
		rank_specifierContext _localctx = new rank_specifierContext(_ctx, 528);
		enterRule(_localctx, RULE_rank_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3858); match(82);
			setState(3862);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(3860); dim_separators();
					}
					break;
			}
			setState(3864); match(115);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class dim_separatorsContext extends ParserRuleContext<Token> {
		public dim_separatorsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final dim_separatorsContext dim_separators() throws RecognitionException {
		dim_separatorsContext _localctx = new dim_separatorsContext(_ctx, 530);
		enterRule(_localctx, RULE_dim_separators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3866); match(42);
			setState(3872);
			_errHandler.sync(this);
			int _alt5318 = getInterpreter().adaptivePredict(_input,281,_ctx);
			while ( _alt5318!=2 && _alt5318!=-1 ) {
			    if ( _alt5318==1 ) {
			        {
			        {
			        setState(3868); match(42);
			        }
			        } 
			    }
				setState(3874);
				_errHandler.sync(this);
				_alt5318 = getInterpreter().adaptivePredict(_input,281,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class array_initializerContext extends ParserRuleContext<Token> {
		public array_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final array_initializerContext array_initializer() throws RecognitionException {
		array_initializerContext _localctx = new array_initializerContext(_ctx, 532);
		enterRule(_localctx, RULE_array_initializer);
		try {
			setState(3891);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3875); match(126);
					setState(3879);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
						case 1:
							{
							setState(3877); variable_initializer_list();
							}
							break;
					}
					setState(3881); match(16);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3883); match(126);
					setState(3885); variable_initializer_list();
					setState(3887); match(42);
					setState(3889); match(16);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class variable_initializer_listContext extends ParserRuleContext<Token> {
		public variable_initializer_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final variable_initializer_listContext variable_initializer_list() throws RecognitionException {
		variable_initializer_listContext _localctx = new variable_initializer_listContext(_ctx, 534);
		enterRule(_localctx, RULE_variable_initializer_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3893); variable_initializer();
			setState(3901);
			_errHandler.sync(this);
			int _alt5358 = getInterpreter().adaptivePredict(_input,284,_ctx);
			while ( _alt5358!=2 && _alt5358!=-1 ) {
			    if ( _alt5358==1 ) {
			        {
			        {
			        setState(3895); match(42);
			        setState(3897); variable_initializer();
			        }
			        } 
			    }
				setState(3903);
				_errHandler.sync(this);
				_alt5358 = getInterpreter().adaptivePredict(_input,284,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_declarationContext extends ParserRuleContext<Token> {
		public interface_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_declarationContext interface_declaration() throws RecognitionException {
		interface_declarationContext _localctx = new interface_declarationContext(_ctx, 536);
		enterRule(_localctx, RULE_interface_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3906);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(3904); attributes();
					}
					break;
			}
			setState(3910);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(3908); interface_modifiers();
					}
					break;
			}
			setState(3914);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(3912); match(13);
					}
					break;
			}
			setState(3916); match(5);
			setState(3918); match(IDENTIFIER);
			setState(3922);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(3920); variant_type_parameter_list();
					}
					break;
			}
			setState(3926);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(3924); interface_base();
					}
					break;
			}
			setState(3930);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(3928); type_parameter_constraints_clauses();
					}
					break;
			}
			setState(3932); interface_body();
			setState(3936);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(3934); match(143);
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_modifiersContext extends ParserRuleContext<Token> {
		public interface_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_modifiersContext interface_modifiers() throws RecognitionException {
		interface_modifiersContext _localctx = new interface_modifiersContext(_ctx, 538);
		enterRule(_localctx, RULE_interface_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3938); interface_modifier();
			setState(3944);
			_errHandler.sync(this);
			int _alt5408 = getInterpreter().adaptivePredict(_input,292,_ctx);
			while ( _alt5408!=2 && _alt5408!=-1 ) {
			    if ( _alt5408==1 ) {
			        {
			        {
			        setState(3940); interface_modifier();
			        }
			        } 
			    }
				setState(3946);
				_errHandler.sync(this);
				_alt5408 = getInterpreter().adaptivePredict(_input,292,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_modifierContext extends ParserRuleContext<Token> {
		public interface_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_modifierContext interface_modifier() throws RecognitionException {
		interface_modifierContext _localctx = new interface_modifierContext(_ctx, 540);
		enterRule(_localctx, RULE_interface_modifier);
		try {
			setState(3959);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(3947); match(110);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(3949); match(118);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(3951); match(138);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(3953); match(78);
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(3955); match(48);
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(3957); interface_modifier_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class variant_type_parameter_listContext extends ParserRuleContext<Token> {
		public variant_type_parameter_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final variant_type_parameter_listContext variant_type_parameter_list() throws RecognitionException {
		variant_type_parameter_listContext _localctx = new variant_type_parameter_listContext(_ctx, 542);
		enterRule(_localctx, RULE_variant_type_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3961); match(84);
			setState(3963); variant_type_parameters();
			setState(3965); match(70);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class variant_type_parametersContext extends ParserRuleContext<Token> {
		public variant_type_parametersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final variant_type_parametersContext variant_type_parameters() throws RecognitionException {
		variant_type_parametersContext _localctx = new variant_type_parametersContext(_ctx, 544);
		enterRule(_localctx, RULE_variant_type_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3969);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(3967); attributes();
					}
					break;
			}
			setState(3973);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(3971); variance_annotation();
					}
					break;
			}
			setState(3975); type_parameter();
			setState(3991);
			_errHandler.sync(this);
			int _alt5477 = getInterpreter().adaptivePredict(_input,298,_ctx);
			while ( _alt5477!=2 && _alt5477!=-1 ) {
			    if ( _alt5477==1 ) {
			        {
			        {
			        setState(3977); match(42);
			        setState(3981);
			        //_errHandler.sync(this);
			        switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			        	case 1:
			        		{
			        		setState(3979); attributes();
			        		}
			        		break;
			        }
			        setState(3985);
			        //_errHandler.sync(this);
			        switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			        	case 1:
			        		{
			        		setState(3983); variance_annotation();
			        		}
			        		break;
			        }
			        setState(3987); type_parameter();
			        }
			        } 
			    }
				setState(3993);
				_errHandler.sync(this);
				_alt5477 = getInterpreter().adaptivePredict(_input,298,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class variance_annotationContext extends ParserRuleContext<Token> {
		public variance_annotationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final variance_annotationContext variance_annotation() throws RecognitionException {
		variance_annotationContext _localctx = new variance_annotationContext(_ctx, 546);
		enterRule(_localctx, RULE_variance_annotation);
		try {
			setState(3998);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 41:
					enterOuterAlt(_localctx, 1);
					{
					setState(3994); match(41);
					}
					break;
				case 77:
					enterOuterAlt(_localctx, 2);
					{
					setState(3996); match(77);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_baseContext extends ParserRuleContext<Token> {
		public interface_baseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_baseContext interface_base() throws RecognitionException {
		interface_baseContext _localctx = new interface_baseContext(_ctx, 548);
		enterRule(_localctx, RULE_interface_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4000); match(121);
			setState(4002); interface_type_list();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_bodyContext extends ParserRuleContext<Token> {
		public interface_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_bodyContext interface_body() throws RecognitionException {
		interface_bodyContext _localctx = new interface_bodyContext(_ctx, 550);
		enterRule(_localctx, RULE_interface_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4004); match(126);
			setState(4008);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(4006); interface_member_declarations();
					}
					break;
			}
			setState(4010); match(16);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_member_declarationsContext extends ParserRuleContext<Token> {
		public interface_member_declarationsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_member_declarationsContext interface_member_declarations() throws RecognitionException {
		interface_member_declarationsContext _localctx = new interface_member_declarationsContext(_ctx, 552);
		enterRule(_localctx, RULE_interface_member_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4012); interface_member_declaration();
			setState(4018);
			_errHandler.sync(this);
			int _alt5527 = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt5527!=2 && _alt5527!=-1 ) {
			    if ( _alt5527==1 ) {
			        {
			        {
			        setState(4014); interface_member_declaration();
			        }
			        } 
			    }
				setState(4020);
				_errHandler.sync(this);
				_alt5527 = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_member_declarationContext extends ParserRuleContext<Token> {
		public interface_member_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_member_declarationContext interface_member_declaration() throws RecognitionException {
		interface_member_declarationContext _localctx = new interface_member_declarationContext(_ctx, 554);
		enterRule(_localctx, RULE_interface_member_declaration);
		try {
			setState(4029);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4021); interface_method_declaration();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4023); interface_property_declaration();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(4025); interface_event_declaration();
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(4027); interface_indexer_declaration();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_method_declarationContext extends ParserRuleContext<Token> {
		public interface_method_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_method_declarationContext interface_method_declaration() throws RecognitionException {
		interface_method_declarationContext _localctx = new interface_method_declarationContext(_ctx, 556);
		enterRule(_localctx, RULE_interface_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4033);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(4031); attributes();
					}
					break;
			}
			setState(4037);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(4035); match(110);
					}
					break;
			}
			setState(4039); return_type();
			setState(4041); match(IDENTIFIER);
			setState(4043); type_parameter_list();
			setState(4045); match(119);
			setState(4049);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
				case 1:
					{
					setState(4047); formal_parameter_list();
					}
					break;
			}
			setState(4051); match(24);
			setState(4055);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(4053); type_parameter_constraints_clauses();
					}
					break;
			}
			setState(4057); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_property_declarationContext extends ParserRuleContext<Token> {
		public interface_property_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_property_declarationContext interface_property_declaration() throws RecognitionException {
		interface_property_declarationContext _localctx = new interface_property_declarationContext(_ctx, 558);
		enterRule(_localctx, RULE_interface_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4061);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(4059); attributes();
					}
					break;
			}
			setState(4065);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(4063); match(110);
					}
					break;
			}
			setState(4067); type();
			setState(4069); match(IDENTIFIER);
			setState(4071); match(126);
			setState(4073); interface_accessors();
			setState(4075); match(16);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_accessorsContext extends ParserRuleContext<Token> {
		public interface_accessorsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_accessorsContext interface_accessors() throws RecognitionException {
		interface_accessorsContext _localctx = new interface_accessorsContext(_ctx, 560);
		enterRule(_localctx, RULE_interface_accessors);
		try {
			setState(4125);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4079);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
						case 1:
							{
							setState(4077); attributes();
							}
							break;
					}
					setState(4081); match(39);
					setState(4083); match(143);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4087);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
						case 1:
							{
							setState(4085); attributes();
							}
							break;
					}
					setState(4089); match(51);
					setState(4091); match(143);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(4095);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
						case 1:
							{
							setState(4093); attributes();
							}
							break;
					}
					setState(4097); match(39);
					setState(4099); match(143);
					setState(4103);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
						case 1:
							{
							setState(4101); attributes();
							}
							break;
					}
					setState(4105); match(51);
					setState(4107); match(143);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(4111);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
						case 1:
							{
							setState(4109); attributes();
							}
							break;
					}
					setState(4113); match(51);
					setState(4115); match(143);
					setState(4119);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
						case 1:
							{
							setState(4117); attributes();
							}
							break;
					}
					setState(4121); match(39);
					setState(4123); match(143);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_event_declarationContext extends ParserRuleContext<Token> {
		public interface_event_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_event_declarationContext interface_event_declaration() throws RecognitionException {
		interface_event_declarationContext _localctx = new interface_event_declarationContext(_ctx, 562);
		enterRule(_localctx, RULE_interface_event_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4129);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(4127); attributes();
					}
					break;
			}
			setState(4133);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(4131); match(110);
					}
					break;
			}
			setState(4135); match(147);
			setState(4137); type();
			setState(4139); match(IDENTIFIER);
			setState(4141); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_indexer_declarationContext extends ParserRuleContext<Token> {
		public interface_indexer_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_indexer_declarationContext interface_indexer_declaration() throws RecognitionException {
		interface_indexer_declarationContext _localctx = new interface_indexer_declarationContext(_ctx, 564);
		enterRule(_localctx, RULE_interface_indexer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4145);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
				case 1:
					{
					setState(4143); attributes();
					}
					break;
			}
			setState(4149);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
				case 1:
					{
					setState(4147); match(110);
					}
					break;
			}
			setState(4151); type();
			setState(4153); match(146);
			setState(4155); match(82);
			setState(4157); formal_parameter_list();
			setState(4159); match(115);
			setState(4161); match(126);
			setState(4163); interface_accessors();
			setState(4165); match(16);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class enum_declarationContext extends ParserRuleContext<Token> {
		public enum_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final enum_declarationContext enum_declaration() throws RecognitionException {
		enum_declarationContext _localctx = new enum_declarationContext(_ctx, 566);
		enterRule(_localctx, RULE_enum_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4169);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
				case 1:
					{
					setState(4167); attributes();
					}
					break;
			}
			setState(4173);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(4171); enum_modifiers();
					}
					break;
			}
			setState(4175); match(113);
			setState(4177); match(IDENTIFIER);
			setState(4181);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
				case 1:
					{
					setState(4179); enum_base();
					}
					break;
			}
			setState(4183); enum_body();
			setState(4187);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(4185); match(143);
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class enum_baseContext extends ParserRuleContext<Token> {
		public enum_baseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final enum_baseContext enum_base() throws RecognitionException {
		enum_baseContext _localctx = new enum_baseContext(_ctx, 568);
		enterRule(_localctx, RULE_enum_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4189); match(121);
			setState(4191); integral_type();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class enum_bodyContext extends ParserRuleContext<Token> {
		public enum_bodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final enum_bodyContext enum_body() throws RecognitionException {
		enum_bodyContext _localctx = new enum_bodyContext(_ctx, 570);
		enterRule(_localctx, RULE_enum_body);
		try {
			setState(4209);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4193); match(126);
					setState(4197);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
						case 1:
							{
							setState(4195); enum_member_declarations();
							}
							break;
					}
					setState(4199); match(16);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4201); match(126);
					setState(4203); enum_member_declarations();
					setState(4205); match(42);
					setState(4207); match(16);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class enum_modifiersContext extends ParserRuleContext<Token> {
		public enum_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final enum_modifiersContext enum_modifiers() throws RecognitionException {
		enum_modifiersContext _localctx = new enum_modifiersContext(_ctx, 572);
		enterRule(_localctx, RULE_enum_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4211); enum_modifier();
			setState(4217);
			_errHandler.sync(this);
			int _alt5775 = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt5775!=2 && _alt5775!=-1 ) {
			    if ( _alt5775==1 ) {
			        {
			        {
			        setState(4213); enum_modifier();
			        }
			        } 
			    }
				setState(4219);
				_errHandler.sync(this);
				_alt5775 = getInterpreter().adaptivePredict(_input,326,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class enum_modifierContext extends ParserRuleContext<Token> {
		public enum_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final enum_modifierContext enum_modifier() throws RecognitionException {
		enum_modifierContext _localctx = new enum_modifierContext(_ctx, 574);
		enterRule(_localctx, RULE_enum_modifier);
		try {
			setState(4230);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 110:
					enterOuterAlt(_localctx, 1);
					{
					setState(4220); match(110);
					}
					break;
				case 118:
					enterOuterAlt(_localctx, 2);
					{
					setState(4222); match(118);
					}
					break;
				case 138:
					enterOuterAlt(_localctx, 3);
					{
					setState(4224); match(138);
					}
					break;
				case 78:
					enterOuterAlt(_localctx, 4);
					{
					setState(4226); match(78);
					}
					break;
				case 48:
					enterOuterAlt(_localctx, 5);
					{
					setState(4228); match(48);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class enum_member_declarationsContext extends ParserRuleContext<Token> {
		public enum_member_declarationsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final enum_member_declarationsContext enum_member_declarations() throws RecognitionException {
		enum_member_declarationsContext _localctx = new enum_member_declarationsContext(_ctx, 576);
		enterRule(_localctx, RULE_enum_member_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4232); enum_member_declaration();
			setState(4240);
			_errHandler.sync(this);
			int _alt5816 = getInterpreter().adaptivePredict(_input,328,_ctx);
			while ( _alt5816!=2 && _alt5816!=-1 ) {
			    if ( _alt5816==1 ) {
			        {
			        {
			        setState(4234); match(42);
			        setState(4236); enum_member_declaration();
			        }
			        } 
			    }
				setState(4242);
				_errHandler.sync(this);
				_alt5816 = getInterpreter().adaptivePredict(_input,328,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class enum_member_declarationContext extends ParserRuleContext<Token> {
		public enum_member_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final enum_member_declarationContext enum_member_declaration() throws RecognitionException {
		enum_member_declarationContext _localctx = new enum_member_declarationContext(_ctx, 578);
		enterRule(_localctx, RULE_enum_member_declaration);
		try {
			setState(4259);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4245);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
						case 1:
							{
							setState(4243); attributes();
							}
							break;
					}
					setState(4247); match(IDENTIFIER);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4251);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
						case 1:
							{
							setState(4249); attributes();
							}
							break;
					}
					setState(4253); match(IDENTIFIER);
					setState(4255); match(104);
					setState(4257); constant_expression();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class delegate_declarationContext extends ParserRuleContext<Token> {
		public delegate_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final delegate_declarationContext delegate_declaration() throws RecognitionException {
		delegate_declarationContext _localctx = new delegate_declarationContext(_ctx, 580);
		enterRule(_localctx, RULE_delegate_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4263);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
				case 1:
					{
					setState(4261); attributes();
					}
					break;
			}
			setState(4267);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
				case 1:
					{
					setState(4265); delegate_modifiers();
					}
					break;
			}
			setState(4269); match(91);
			setState(4271); return_type();
			setState(4273); match(IDENTIFIER);
			setState(4277);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(4275); type_parameter_list();
					}
					break;
			}
			setState(4279); match(119);
			setState(4283);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
				case 1:
					{
					setState(4281); formal_parameter_list();
					}
					break;
			}
			setState(4285); match(24);
			setState(4289);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(4287); type_parameter_constraints_clauses();
					}
					break;
			}
			setState(4291); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class delegate_modifiersContext extends ParserRuleContext<Token> {
		public delegate_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final delegate_modifiersContext delegate_modifiers() throws RecognitionException {
		delegate_modifiersContext _localctx = new delegate_modifiersContext(_ctx, 582);
		enterRule(_localctx, RULE_delegate_modifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4293); delegate_modifier();
			setState(4299);
			_errHandler.sync(this);
			int _alt5888 = getInterpreter().adaptivePredict(_input,337,_ctx);
			while ( _alt5888!=2 && _alt5888!=-1 ) {
			    if ( _alt5888==1 ) {
			        {
			        {
			        setState(4295); delegate_modifier();
			        }
			        } 
			    }
				setState(4301);
				_errHandler.sync(this);
				_alt5888 = getInterpreter().adaptivePredict(_input,337,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class delegate_modifierContext extends ParserRuleContext<Token> {
		public delegate_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final delegate_modifierContext delegate_modifier() throws RecognitionException {
		delegate_modifierContext _localctx = new delegate_modifierContext(_ctx, 584);
		enterRule(_localctx, RULE_delegate_modifier);
		try {
			setState(4314);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4302); match(110);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4304); match(118);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(4306); match(138);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(4308); match(78);
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(4310); match(48);
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(4312); delegate_modifier_unsafe();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class global_attributesContext extends ParserRuleContext<Token> {
		public global_attributesContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final global_attributesContext global_attributes() throws RecognitionException {
		global_attributesContext _localctx = new global_attributesContext(_ctx, 586);
		enterRule(_localctx, RULE_global_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4316); global_attribute_sections();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class global_attribute_sectionsContext extends ParserRuleContext<Token> {
		public global_attribute_sectionsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final global_attribute_sectionsContext global_attribute_sections() throws RecognitionException {
		global_attribute_sectionsContext _localctx = new global_attribute_sectionsContext(_ctx, 588);
		enterRule(_localctx, RULE_global_attribute_sections);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4318); global_attribute_section();
			setState(4324);
			_errHandler.sync(this);
			int _alt5941 = getInterpreter().adaptivePredict(_input,339,_ctx);
			while ( _alt5941!=2 && _alt5941!=-1 ) {
			    if ( _alt5941==1 ) {
			        {
			        {
			        setState(4320); global_attribute_section();
			        }
			        } 
			    }
				setState(4326);
				_errHandler.sync(this);
				_alt5941 = getInterpreter().adaptivePredict(_input,339,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class global_attribute_sectionContext extends ParserRuleContext<Token> {
		public global_attribute_sectionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final global_attribute_sectionContext global_attribute_section() throws RecognitionException {
		global_attribute_sectionContext _localctx = new global_attribute_sectionContext(_ctx, 590);
		enterRule(_localctx, RULE_global_attribute_section);
		try {
			setState(4345);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4327); match(82);
					setState(4329); global_attribute_target_specifier();
					setState(4331); attribute_list();
					setState(4333); match(115);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4335); match(82);
					setState(4337); global_attribute_target_specifier();
					setState(4339); attribute_list();
					setState(4341); match(42);
					setState(4343); match(115);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class global_attribute_target_specifierContext extends ParserRuleContext<Token> {
		public global_attribute_target_specifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final global_attribute_target_specifierContext global_attribute_target_specifier() throws RecognitionException {
		global_attribute_target_specifierContext _localctx = new global_attribute_target_specifierContext(_ctx, 592);
		enterRule(_localctx, RULE_global_attribute_target_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4347); global_attribute_target();
			setState(4349); match(121);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class global_attribute_targetContext extends ParserRuleContext<Token> {
		public global_attribute_targetContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final global_attribute_targetContext global_attribute_target() throws RecognitionException {
		global_attribute_targetContext _localctx = new global_attribute_targetContext(_ctx, 594);
		enterRule(_localctx, RULE_global_attribute_target);
		try {
			setState(4355);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 58:
					enterOuterAlt(_localctx, 1);
					{
					setState(4351); match(58);
					}
					break;
				case 105:
					enterOuterAlt(_localctx, 2);
					{
					setState(4353); match(105);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class attributesContext extends ParserRuleContext<Token> {
		public attributesContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final attributesContext attributes() throws RecognitionException {
		attributesContext _localctx = new attributesContext(_ctx, 596);
		enterRule(_localctx, RULE_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4357); attribute_sections();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class attribute_sectionsContext extends ParserRuleContext<Token> {
		public attribute_sectionsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final attribute_sectionsContext attribute_sections() throws RecognitionException {
		attribute_sectionsContext _localctx = new attribute_sectionsContext(_ctx, 598);
		enterRule(_localctx, RULE_attribute_sections);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4359); attribute_section();
			setState(4365);
			_errHandler.sync(this);
			int _alt6012 = getInterpreter().adaptivePredict(_input,342,_ctx);
			while ( _alt6012!=2 && _alt6012!=-1 ) {
			    if ( _alt6012==1 ) {
			        {
			        {
			        setState(4361); attribute_section();
			        }
			        } 
			    }
				setState(4367);
				_errHandler.sync(this);
				_alt6012 = getInterpreter().adaptivePredict(_input,342,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class attribute_sectionContext extends ParserRuleContext<Token> {
		public attribute_sectionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final attribute_sectionContext attribute_section() throws RecognitionException {
		attribute_sectionContext _localctx = new attribute_sectionContext(_ctx, 600);
		enterRule(_localctx, RULE_attribute_section);
		try {
			setState(4390);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4368); match(82);
					setState(4372);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
						case 1:
							{
							setState(4370); attribute_target_specifier();
							}
							break;
					}
					setState(4374); attribute_list();
					setState(4376); match(115);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4378); match(82);
					setState(4382);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
						case 1:
							{
							setState(4380); attribute_target_specifier();
							}
							break;
					}
					setState(4384); attribute_list();
					setState(4386); match(42);
					setState(4388); match(115);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class attribute_target_specifierContext extends ParserRuleContext<Token> {
		public attribute_target_specifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final attribute_target_specifierContext attribute_target_specifier() throws RecognitionException {
		attribute_target_specifierContext _localctx = new attribute_target_specifierContext(_ctx, 602);
		enterRule(_localctx, RULE_attribute_target_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4392); attribute_target();
			setState(4394); match(121);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class attribute_targetContext extends ParserRuleContext<Token> {
		public attribute_targetContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final attribute_targetContext attribute_target() throws RecognitionException {
		attribute_targetContext _localctx = new attribute_targetContext(_ctx, 604);
		enterRule(_localctx, RULE_attribute_target);
		try {
			setState(4410);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 145:
					enterOuterAlt(_localctx, 1);
					{
					setState(4396); match(145);
					}
					break;
				case 147:
					enterOuterAlt(_localctx, 2);
					{
					setState(4398); match(147);
					}
					break;
				case 127:
					enterOuterAlt(_localctx, 3);
					{
					setState(4400); match(127);
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 4);
					{
					setState(4402); match(7);
					}
					break;
				case 63:
					enterOuterAlt(_localctx, 5);
					{
					setState(4404); match(63);
					}
					break;
				case 141:
					enterOuterAlt(_localctx, 6);
					{
					setState(4406); match(141);
					}
					break;
				case 148:
					enterOuterAlt(_localctx, 7);
					{
					setState(4408); match(148);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class attribute_listContext extends ParserRuleContext<Token> {
		public attribute_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final attribute_listContext attribute_list() throws RecognitionException {
		attribute_listContext _localctx = new attribute_listContext(_ctx, 606);
		enterRule(_localctx, RULE_attribute_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4412); attribute();
			setState(4420);
			_errHandler.sync(this);
			int _alt6099 = getInterpreter().adaptivePredict(_input,347,_ctx);
			while ( _alt6099!=2 && _alt6099!=-1 ) {
			    if ( _alt6099==1 ) {
			        {
			        {
			        setState(4414); match(42);
			        setState(4416); attribute();
			        }
			        } 
			    }
				setState(4422);
				_errHandler.sync(this);
				_alt6099 = getInterpreter().adaptivePredict(_input,347,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class attributeContext extends ParserRuleContext<Token> {
		public attributeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final attributeContext attribute() throws RecognitionException {
		attributeContext _localctx = new attributeContext(_ctx, 608);
		enterRule(_localctx, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4423); attribute_name();
			setState(4427);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
				case 1:
					{
					setState(4425); attribute_arguments();
					}
					break;
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class attribute_nameContext extends ParserRuleContext<Token> {
		public attribute_nameContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final attribute_nameContext attribute_name() throws RecognitionException {
		attribute_nameContext _localctx = new attribute_nameContext(_ctx, 610);
		enterRule(_localctx, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4429); type_name();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class attribute_argumentsContext extends ParserRuleContext<Token> {
		public attribute_argumentsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final attribute_argumentsContext attribute_arguments() throws RecognitionException {
		attribute_argumentsContext _localctx = new attribute_argumentsContext(_ctx, 612);
		enterRule(_localctx, RULE_attribute_arguments);
		try {
			setState(4455);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4431); match(119);
					setState(4435);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
						case 1:
							{
							setState(4433); positional_argument_list();
							}
							break;
					}
					setState(4437); match(24);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4439); match(119);
					setState(4441); positional_argument_list();
					setState(4443); match(42);
					setState(4445); named_argument_list();
					setState(4447); match(24);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(4449); match(119);
					setState(4451); named_argument_list();
					setState(4453); match(24);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class positional_argument_listContext extends ParserRuleContext<Token> {
		public positional_argument_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final positional_argument_listContext positional_argument_list() throws RecognitionException {
		positional_argument_listContext _localctx = new positional_argument_listContext(_ctx, 614);
		enterRule(_localctx, RULE_positional_argument_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4457); positional_argument();
			setState(4465);
			_errHandler.sync(this);
			int _alt6168 = getInterpreter().adaptivePredict(_input,351,_ctx);
			while ( _alt6168!=2 && _alt6168!=-1 ) {
			    if ( _alt6168==1 ) {
			        {
			        {
			        setState(4459); match(42);
			        setState(4461); positional_argument();
			        }
			        } 
			    }
				setState(4467);
				_errHandler.sync(this);
				_alt6168 = getInterpreter().adaptivePredict(_input,351,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class positional_argumentContext extends ParserRuleContext<Token> {
		public positional_argumentContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final positional_argumentContext positional_argument() throws RecognitionException {
		positional_argumentContext _localctx = new positional_argumentContext(_ctx, 616);
		enterRule(_localctx, RULE_positional_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4468); attribute_argument_expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class named_argument_listContext extends ParserRuleContext<Token> {
		public named_argument_listContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final named_argument_listContext named_argument_list() throws RecognitionException {
		named_argument_listContext _localctx = new named_argument_listContext(_ctx, 618);
		enterRule(_localctx, RULE_named_argument_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4470); named_argument();
			setState(4478);
			_errHandler.sync(this);
			int _alt6193 = getInterpreter().adaptivePredict(_input,352,_ctx);
			while ( _alt6193!=2 && _alt6193!=-1 ) {
			    if ( _alt6193==1 ) {
			        {
			        {
			        setState(4472); match(42);
			        setState(4474); named_argument();
			        }
			        } 
			    }
				setState(4480);
				_errHandler.sync(this);
				_alt6193 = getInterpreter().adaptivePredict(_input,352,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class named_argumentContext extends ParserRuleContext<Token> {
		public named_argumentContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final named_argumentContext named_argument() throws RecognitionException {
		named_argumentContext _localctx = new named_argumentContext(_ctx, 620);
		enterRule(_localctx, RULE_named_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4481); match(IDENTIFIER);
			setState(4483); match(104);
			setState(4485); attribute_argument_expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class attribute_argument_expressionContext extends ParserRuleContext<Token> {
		public attribute_argument_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final attribute_argument_expressionContext attribute_argument_expression() throws RecognitionException {
		attribute_argument_expressionContext _localctx = new attribute_argument_expressionContext(_ctx, 622);
		enterRule(_localctx, RULE_attribute_argument_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4487); expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class class_modifier_unsafeContext extends ParserRuleContext<Token> {
		public class_modifier_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final class_modifier_unsafeContext class_modifier_unsafe() throws RecognitionException {
		class_modifier_unsafeContext _localctx = new class_modifier_unsafeContext(_ctx, 624);
		enterRule(_localctx, RULE_class_modifier_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4489); match(49);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class struct_modifier_unsafeContext extends ParserRuleContext<Token> {
		public struct_modifier_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final struct_modifier_unsafeContext struct_modifier_unsafe() throws RecognitionException {
		struct_modifier_unsafeContext _localctx = new struct_modifier_unsafeContext(_ctx, 626);
		enterRule(_localctx, RULE_struct_modifier_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4491); match(49);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class interface_modifier_unsafeContext extends ParserRuleContext<Token> {
		public interface_modifier_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final interface_modifier_unsafeContext interface_modifier_unsafe() throws RecognitionException {
		interface_modifier_unsafeContext _localctx = new interface_modifier_unsafeContext(_ctx, 628);
		enterRule(_localctx, RULE_interface_modifier_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4493); match(49);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class delegate_modifier_unsafeContext extends ParserRuleContext<Token> {
		public delegate_modifier_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final delegate_modifier_unsafeContext delegate_modifier_unsafe() throws RecognitionException {
		delegate_modifier_unsafeContext _localctx = new delegate_modifier_unsafeContext(_ctx, 630);
		enterRule(_localctx, RULE_delegate_modifier_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4495); match(49);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class field_modifier_unsafeContext extends ParserRuleContext<Token> {
		public field_modifier_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final field_modifier_unsafeContext field_modifier_unsafe() throws RecognitionException {
		field_modifier_unsafeContext _localctx = new field_modifier_unsafeContext(_ctx, 632);
		enterRule(_localctx, RULE_field_modifier_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4497); match(49);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class method_modifier_unsafeContext extends ParserRuleContext<Token> {
		public method_modifier_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final method_modifier_unsafeContext method_modifier_unsafe() throws RecognitionException {
		method_modifier_unsafeContext _localctx = new method_modifier_unsafeContext(_ctx, 634);
		enterRule(_localctx, RULE_method_modifier_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4499); match(49);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class property_modifier_unsafeContext extends ParserRuleContext<Token> {
		public property_modifier_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final property_modifier_unsafeContext property_modifier_unsafe() throws RecognitionException {
		property_modifier_unsafeContext _localctx = new property_modifier_unsafeContext(_ctx, 636);
		enterRule(_localctx, RULE_property_modifier_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4501); match(49);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class event_modifier_unsafeContext extends ParserRuleContext<Token> {
		public event_modifier_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final event_modifier_unsafeContext event_modifier_unsafe() throws RecognitionException {
		event_modifier_unsafeContext _localctx = new event_modifier_unsafeContext(_ctx, 638);
		enterRule(_localctx, RULE_event_modifier_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4503); match(49);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class indexer_modifier_unsafeContext extends ParserRuleContext<Token> {
		public indexer_modifier_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final indexer_modifier_unsafeContext indexer_modifier_unsafe() throws RecognitionException {
		indexer_modifier_unsafeContext _localctx = new indexer_modifier_unsafeContext(_ctx, 640);
		enterRule(_localctx, RULE_indexer_modifier_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4505); match(49);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class operator_modifier_unsafeContext extends ParserRuleContext<Token> {
		public operator_modifier_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final operator_modifier_unsafeContext operator_modifier_unsafe() throws RecognitionException {
		operator_modifier_unsafeContext _localctx = new operator_modifier_unsafeContext(_ctx, 642);
		enterRule(_localctx, RULE_operator_modifier_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4507); match(49);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class constructor_modifier_unsafeContext extends ParserRuleContext<Token> {
		public constructor_modifier_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final constructor_modifier_unsafeContext constructor_modifier_unsafe() throws RecognitionException {
		constructor_modifier_unsafeContext _localctx = new constructor_modifier_unsafeContext(_ctx, 644);
		enterRule(_localctx, RULE_constructor_modifier_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4509); match(49);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class destructor_declaration_unsafeContext extends ParserRuleContext<Token> {
		public destructor_declaration_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final destructor_declaration_unsafeContext destructor_declaration_unsafe() throws RecognitionException {
		destructor_declaration_unsafeContext _localctx = new destructor_declaration_unsafeContext(_ctx, 646);
		enterRule(_localctx, RULE_destructor_declaration_unsafe);
		try {
			setState(4555);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4513);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
						case 1:
							{
							setState(4511); attributes();
							}
							break;
					}
					setState(4517);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
						case 1:
							{
							setState(4515); match(66);
							}
							break;
					}
					setState(4521);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
						case 1:
							{
							setState(4519); match(49);
							}
							break;
					}
					setState(4523); match(76);
					setState(4525); match(IDENTIFIER);
					setState(4527); match(119);
					setState(4529); match(24);
					setState(4531); destructor_body();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4535);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
						case 1:
							{
							setState(4533); attributes();
							}
							break;
					}
					setState(4539);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
						case 1:
							{
							setState(4537); match(49);
							}
							break;
					}
					setState(4543);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
						case 1:
							{
							setState(4541); match(66);
							}
							break;
					}
					setState(4545); match(76);
					setState(4547); match(IDENTIFIER);
					setState(4549); match(119);
					setState(4551); match(24);
					setState(4553); destructor_body();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class static_constructor_modifiers_unsafeContext extends ParserRuleContext<Token> {
		public static_constructor_modifiers_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final static_constructor_modifiers_unsafeContext static_constructor_modifiers_unsafe() throws RecognitionException {
		static_constructor_modifiers_unsafeContext _localctx = new static_constructor_modifiers_unsafeContext(_ctx, 648);
		enterRule(_localctx, RULE_static_constructor_modifiers_unsafe);
		try {
			setState(4617);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4559);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
						case 1:
							{
							setState(4557); match(66);
							}
							break;
					}
					setState(4563);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
						case 1:
							{
							setState(4561); match(49);
							}
							break;
					}
					setState(4565); match(131);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4569);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
						case 1:
							{
							setState(4567); match(49);
							}
							break;
					}
					setState(4573);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
						case 1:
							{
							setState(4571); match(66);
							}
							break;
					}
					setState(4575); match(131);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(4579);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
						case 1:
							{
							setState(4577); match(66);
							}
							break;
					}
					setState(4581); match(131);
					setState(4585);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
						case 1:
							{
							setState(4583); match(49);
							}
							break;
					}
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(4589);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
						case 1:
							{
							setState(4587); match(49);
							}
							break;
					}
					setState(4591); match(131);
					setState(4595);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
						case 1:
							{
							setState(4593); match(66);
							}
							break;
					}
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(4597); match(131);
					setState(4601);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
						case 1:
							{
							setState(4599); match(66);
							}
							break;
					}
					setState(4605);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
						case 1:
							{
							setState(4603); match(49);
							}
							break;
					}
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(4607); match(131);
					setState(4611);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
						case 1:
							{
							setState(4609); match(49);
							}
							break;
					}
					setState(4615);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
						case 1:
							{
							setState(4613); match(66);
							}
							break;
					}
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class embedded_statement_unsafeContext extends ParserRuleContext<Token> {
		public embedded_statement_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final embedded_statement_unsafeContext embedded_statement_unsafe() throws RecognitionException {
		embedded_statement_unsafeContext _localctx = new embedded_statement_unsafeContext(_ctx, 650);
		enterRule(_localctx, RULE_embedded_statement_unsafe);
		try {
			setState(4623);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4619); unsafe_statement();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4621); fixed_statement();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class unsafe_statementContext extends ParserRuleContext<Token> {
		public unsafe_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final unsafe_statementContext unsafe_statement() throws RecognitionException {
		unsafe_statementContext _localctx = new unsafe_statementContext(_ctx, 652);
		enterRule(_localctx, RULE_unsafe_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4625); match(49);
			setState(4627); block();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class type_unsafeContext extends ParserRuleContext<Token> {
		public type_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final type_unsafeContext type_unsafe() throws RecognitionException {
		type_unsafeContext _localctx = new type_unsafeContext(_ctx, 654);
		enterRule(_localctx, RULE_type_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4629); pointer_type(0);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class pointer_typeContext extends ParserRuleContext<Token> {
		public int _p;
		public pointer_typeContext(ParserRuleContext parent, int state) { super(parent, state); }
		public pointer_typeContext(ParserRuleContext parent, int state, int _p) {
			super(parent, state);
			this._p = _p;
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final pointer_typeContext pointer_type(int _p) throws RecognitionException {
	    ParserRuleContext<Token> _parentctx = _ctx;
		pointer_typeContext _localctx = new pointer_typeContext(_ctx, 656, _p);
		pointer_typeContext _prevctx = _localctx;
		int _startState = 656;
	    pushNewRecursionContext(_localctx, RULE_pointer_type);
		try {
		    enterOuterAlt(_localctx, 1);
		    {
		    setState(4726);
		    //_errHandler.sync(this);
		    switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
		    	case 1:
		    		{
		    		setState(4631); type_name();
		    		setState(4639);
		    		_errHandler.sync(this);
		    		int _alt16 = getInterpreter().adaptivePredict(_input,375,_ctx);
		    		while ( _alt16!=2 && _alt16!=-1 ) {
		    		    if ( _alt16==1 ) {
		    		        {
		    		        setState(4637);
		    		        //_errHandler.sync(this);
		    		        switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
		    		        	case 1:
		    		        		{
		    		        		setState(4633); rank_specifier();
		    		        		}
		    		        		break;
		    		        	case 2:
		    		        		{
		    		        		setState(4635); match(INTERR);
		    		        		}
		    		        		break;
		    		        }
		    		        } 
		    		    }
		    			setState(4641);
		    			_errHandler.sync(this);
		    			_alt16 = getInterpreter().adaptivePredict(_input,375,_ctx);
		    		}
		    		setState(4642); match(STAR);
		    		}
		    		break;
		    	case 2:
		    		{
		    		setState(4644); simple_type();
		    		setState(4652);
		    		_errHandler.sync(this);
		    		int _alt31 = getInterpreter().adaptivePredict(_input,377,_ctx);
		    		while ( _alt31!=2 && _alt31!=-1 ) {
		    		    if ( _alt31==1 ) {
		    		        {
		    		        setState(4650);
		    		        //_errHandler.sync(this);
		    		        switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
		    		        	case 1:
		    		        		{
		    		        		setState(4646); rank_specifier();
		    		        		}
		    		        		break;
		    		        	case 2:
		    		        		{
		    		        		setState(4648); match(INTERR);
		    		        		}
		    		        		break;
		    		        }
		    		        } 
		    		    }
		    			setState(4654);
		    			_errHandler.sync(this);
		    			_alt31 = getInterpreter().adaptivePredict(_input,377,_ctx);
		    		}
		    		setState(4655); match(STAR);
		    		}
		    		break;
		    	case 3:
		    		{
		    		setState(4657); enum_type();
		    		setState(4665);
		    		_errHandler.sync(this);
		    		int _alt46 = getInterpreter().adaptivePredict(_input,379,_ctx);
		    		while ( _alt46!=2 && _alt46!=-1 ) {
		    		    if ( _alt46==1 ) {
		    		        {
		    		        setState(4663);
		    		        //_errHandler.sync(this);
		    		        switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
		    		        	case 1:
		    		        		{
		    		        		setState(4659); rank_specifier();
		    		        		}
		    		        		break;
		    		        	case 2:
		    		        		{
		    		        		setState(4661); match(INTERR);
		    		        		}
		    		        		break;
		    		        }
		    		        } 
		    		    }
		    			setState(4667);
		    			_errHandler.sync(this);
		    			_alt46 = getInterpreter().adaptivePredict(_input,379,_ctx);
		    		}
		    		setState(4668); match(STAR);
		    		}
		    		break;
		    	case 4:
		    		{
		    		setState(4670); class_type();
		    		setState(4678);
		    		_errHandler.sync(this);
		    		int _alt61 = getInterpreter().adaptivePredict(_input,381,_ctx);
		    		while ( _alt61!=2 && _alt61!=-1 ) {
		    		    if ( _alt61==1 ) {
		    		        {
		    		        setState(4676);
		    		        //_errHandler.sync(this);
		    		        switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
		    		        	case 1:
		    		        		{
		    		        		setState(4672); rank_specifier();
		    		        		}
		    		        		break;
		    		        	case 2:
		    		        		{
		    		        		setState(4674); match(INTERR);
		    		        		}
		    		        		break;
		    		        }
		    		        } 
		    		    }
		    			setState(4680);
		    			_errHandler.sync(this);
		    			_alt61 = getInterpreter().adaptivePredict(_input,381,_ctx);
		    		}
		    		setState(4681); match(STAR);
		    		}
		    		break;
		    	case 5:
		    		{
		    		setState(4683); interface_type();
		    		setState(4691);
		    		_errHandler.sync(this);
		    		int _alt76 = getInterpreter().adaptivePredict(_input,383,_ctx);
		    		while ( _alt76!=2 && _alt76!=-1 ) {
		    		    if ( _alt76==1 ) {
		    		        {
		    		        setState(4689);
		    		        //_errHandler.sync(this);
		    		        switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
		    		        	case 1:
		    		        		{
		    		        		setState(4685); rank_specifier();
		    		        		}
		    		        		break;
		    		        	case 2:
		    		        		{
		    		        		setState(4687); match(INTERR);
		    		        		}
		    		        		break;
		    		        }
		    		        } 
		    		    }
		    			setState(4693);
		    			_errHandler.sync(this);
		    			_alt76 = getInterpreter().adaptivePredict(_input,383,_ctx);
		    		}
		    		setState(4694); match(STAR);
		    		}
		    		break;
		    	case 6:
		    		{
		    		setState(4696); delegate_type();
		    		setState(4704);
		    		_errHandler.sync(this);
		    		int _alt91 = getInterpreter().adaptivePredict(_input,385,_ctx);
		    		while ( _alt91!=2 && _alt91!=-1 ) {
		    		    if ( _alt91==1 ) {
		    		        {
		    		        setState(4702);
		    		        //_errHandler.sync(this);
		    		        switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
		    		        	case 1:
		    		        		{
		    		        		setState(4698); rank_specifier();
		    		        		}
		    		        		break;
		    		        	case 2:
		    		        		{
		    		        		setState(4700); match(INTERR);
		    		        		}
		    		        		break;
		    		        }
		    		        } 
		    		    }
		    			setState(4706);
		    			_errHandler.sync(this);
		    			_alt91 = getInterpreter().adaptivePredict(_input,385,_ctx);
		    		}
		    		setState(4707); match(STAR);
		    		}
		    		break;
		    	case 7:
		    		{
		    		setState(4709); type_parameter();
		    		setState(4717);
		    		_errHandler.sync(this);
		    		int _alt106 = getInterpreter().adaptivePredict(_input,387,_ctx);
		    		while ( _alt106!=2 && _alt106!=-1 ) {
		    		    if ( _alt106==1 ) {
		    		        {
		    		        setState(4715);
		    		        //_errHandler.sync(this);
		    		        switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
		    		        	case 1:
		    		        		{
		    		        		setState(4711); rank_specifier();
		    		        		}
		    		        		break;
		    		        	case 2:
		    		        		{
		    		        		setState(4713); match(INTERR);
		    		        		}
		    		        		break;
		    		        }
		    		        } 
		    		    }
		    			setState(4719);
		    			_errHandler.sync(this);
		    			_alt106 = getInterpreter().adaptivePredict(_input,387,_ctx);
		    		}
		    		setState(4720); match(STAR);
		    		}
		    		break;
		    	case 8:
		    		{
		    		setState(4722); match(VOID);
		    		setState(4724); match(STAR);
		    		}
		    		break;
		    }
		    _ctx.stop = _input.LT(-1);
		    setState(4743);
		    _errHandler.sync(this);
		    int _alt134 = getInterpreter().adaptivePredict(_input,391,_ctx);
		    while ( _alt134!=2 && _alt134!=-1 ) {
		        if ( _alt134==1 ) {
		    	    if ( _parseListeners!=null ) triggerExitRuleEvent();
		    	    _prevctx = _localctx;
		            {
		            {
		            _localctx = new pointer_typeContext(_parentctx, _startState, _p);
		            _localctx.addChild(_prevctx);
		            pushNewRecursionContext(_localctx, RULE_pointer_type);
		            setState(4728);
		            if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "failed predicate: {2 >= $_p}?");
		            setState(4736);
		            _errHandler.sync(this);
		            int _alt129 = getInterpreter().adaptivePredict(_input,390,_ctx);
		            while ( _alt129!=2 && _alt129!=-1 ) {
		                if ( _alt129==1 ) {
		                    {
		                    setState(4734);
		                    //_errHandler.sync(this);
		                    switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
		                    	case 1:
		                    		{
		                    		setState(4730); rank_specifier();
		                    		}
		                    		break;
		                    	case 2:
		                    		{
		                    		setState(4732); match(INTERR);
		                    		}
		                    		break;
		                    }
		                    } 
		                }
		            	setState(4738);
		            	_errHandler.sync(this);
		            	_alt129 = getInterpreter().adaptivePredict(_input,390,_ctx);
		            }
		            setState(4739); match(STAR);
		            }
		            } 
		        }
		    	setState(4745);
		    	_errHandler.sync(this);
		    	_alt134 = getInterpreter().adaptivePredict(_input,391,_ctx);
		    }
		    }
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class unmanaged_typeContext extends ParserRuleContext<Token> {
		public unmanaged_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final unmanaged_typeContext unmanaged_type() throws RecognitionException {
		unmanaged_typeContext _localctx = new unmanaged_typeContext(_ctx, 658);
		enterRule(_localctx, RULE_unmanaged_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4764);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
				case 1:
					{
					setState(4746); type_name();
					}
					break;
				case 2:
					{
					setState(4748); simple_type();
					}
					break;
				case 3:
					{
					setState(4750); enum_type();
					}
					break;
				case 4:
					{
					setState(4752); class_type();
					}
					break;
				case 5:
					{
					setState(4754); interface_type();
					}
					break;
				case 6:
					{
					setState(4756); delegate_type();
					}
					break;
				case 7:
					{
					setState(4758); type_parameter();
					}
					break;
				case 8:
					{
					setState(4760); match(VOID);
					setState(4762); match(STAR);
					}
					break;
			}
			setState(4774);
			_errHandler.sync(this);
			int _alt6636 = getInterpreter().adaptivePredict(_input,394,_ctx);
			while ( _alt6636!=2 && _alt6636!=-1 ) {
			    if ( _alt6636==1 ) {
			        {
			        setState(4772);
			        //_errHandler.sync(this);
			        switch ( getInterpreter().adaptivePredict(_input,393,_ctx) ) {
			        	case 1:
			        		{
			        		setState(4766); match(STAR);
			        		}
			        		break;
			        	case 2:
			        		{
			        		setState(4768); match(INTERR);
			        		}
			        		break;
			        	case 3:
			        		{
			        		setState(4770); rank_specifier();
			        		}
			        		break;
			        }
			        } 
			    }
				setState(4776);
				_errHandler.sync(this);
				_alt6636 = getInterpreter().adaptivePredict(_input,394,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class primary_no_array_creation_expression_unsafeContext extends ParserRuleContext<Token> {
		public primary_no_array_creation_expression_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final primary_no_array_creation_expression_unsafeContext primary_no_array_creation_expression_unsafe() throws RecognitionException {
		primary_no_array_creation_expression_unsafeContext _localctx = new primary_no_array_creation_expression_unsafeContext(_ctx, 660);
		enterRule(_localctx, RULE_primary_no_array_creation_expression_unsafe);
		try {
			setState(4783);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4777); pointer_member_access();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4779); pointer_element_access();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(4781); sizeof_expression();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class unary_expression_unsafeContext extends ParserRuleContext<Token> {
		public unary_expression_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final unary_expression_unsafeContext unary_expression_unsafe() throws RecognitionException {
		unary_expression_unsafeContext _localctx = new unary_expression_unsafeContext(_ctx, 662);
		enterRule(_localctx, RULE_unary_expression_unsafe);
		try {
			setState(4789);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4785); pointer_indirection_expression();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4787); addressof_expression();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class pointer_indirection_expressionContext extends ParserRuleContext<Token> {
		public pointer_indirection_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final pointer_indirection_expressionContext pointer_indirection_expression() throws RecognitionException {
		pointer_indirection_expressionContext _localctx = new pointer_indirection_expressionContext(_ctx, 664);
		enterRule(_localctx, RULE_pointer_indirection_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4791); match(STAR);
			setState(4793); unary_expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class pointer_member_accessContext extends ParserRuleContext<Token> {
		public pointer_member_accessContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final pointer_member_accessContext pointer_member_access() throws RecognitionException {
		pointer_member_accessContext _localctx = new pointer_member_accessContext(_ctx, 666);
		enterRule(_localctx, RULE_pointer_member_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4795); primary_expression();
			setState(4797); match(96);
			setState(4799); match(IDENTIFIER);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class pointer_element_accessContext extends ParserRuleContext<Token> {
		public pointer_element_accessContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final pointer_element_accessContext pointer_element_access() throws RecognitionException {
		pointer_element_accessContext _localctx = new pointer_element_accessContext(_ctx, 668);
		enterRule(_localctx, RULE_pointer_element_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4801); primary_no_array_creation_expression();
			setState(4803); match(82);
			setState(4805); expression();
			setState(4807); match(115);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class addressof_expressionContext extends ParserRuleContext<Token> {
		public addressof_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final addressof_expressionContext addressof_expression() throws RecognitionException {
		addressof_expressionContext _localctx = new addressof_expressionContext(_ctx, 670);
		enterRule(_localctx, RULE_addressof_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4809); match(80);
			setState(4811); unary_expression();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class sizeof_expressionContext extends ParserRuleContext<Token> {
		public sizeof_expressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final sizeof_expressionContext sizeof_expression() throws RecognitionException {
		sizeof_expressionContext _localctx = new sizeof_expressionContext(_ctx, 672);
		enterRule(_localctx, RULE_sizeof_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4813); match(36);
			setState(4815); match(119);
			setState(4817); unmanaged_type();
			setState(4819); match(24);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class fixed_statementContext extends ParserRuleContext<Token> {
		public fixed_statementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final fixed_statementContext fixed_statement() throws RecognitionException {
		fixed_statementContext _localctx = new fixed_statementContext(_ctx, 674);
		enterRule(_localctx, RULE_fixed_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4821); match(99);
			setState(4823); match(119);
			setState(4825); pointer_type(0);
			setState(4827); fixed_pointer_declarators();
			setState(4829); match(24);
			setState(4831); embedded_statement();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class fixed_pointer_declaratorsContext extends ParserRuleContext<Token> {
		public fixed_pointer_declaratorsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final fixed_pointer_declaratorsContext fixed_pointer_declarators() throws RecognitionException {
		fixed_pointer_declaratorsContext _localctx = new fixed_pointer_declaratorsContext(_ctx, 676);
		enterRule(_localctx, RULE_fixed_pointer_declarators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4833); fixed_pointer_declarator();
			setState(4841);
			_errHandler.sync(this);
			int _alt6759 = getInterpreter().adaptivePredict(_input,397,_ctx);
			while ( _alt6759!=2 && _alt6759!=-1 ) {
			    if ( _alt6759==1 ) {
			        {
			        {
			        setState(4835); match(42);
			        setState(4837); fixed_pointer_declarator();
			        }
			        } 
			    }
				setState(4843);
				_errHandler.sync(this);
				_alt6759 = getInterpreter().adaptivePredict(_input,397,_ctx);
			}
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class fixed_pointer_declaratorContext extends ParserRuleContext<Token> {
		public fixed_pointer_declaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final fixed_pointer_declaratorContext fixed_pointer_declarator() throws RecognitionException {
		fixed_pointer_declaratorContext _localctx = new fixed_pointer_declaratorContext(_ctx, 678);
		enterRule(_localctx, RULE_fixed_pointer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4844); match(IDENTIFIER);
			setState(4846); match(104);
			setState(4848); fixed_pointer_initializer();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class fixed_pointer_initializerContext extends ParserRuleContext<Token> {
		public fixed_pointer_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final fixed_pointer_initializerContext fixed_pointer_initializer() throws RecognitionException {
		fixed_pointer_initializerContext _localctx = new fixed_pointer_initializerContext(_ctx, 680);
		enterRule(_localctx, RULE_fixed_pointer_initializer);
		try {
			setState(4856);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4850); match(80);
					setState(4852); variable_reference();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4854); expression();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class struct_member_declaration_unsafeContext extends ParserRuleContext<Token> {
		public struct_member_declaration_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final struct_member_declaration_unsafeContext struct_member_declaration_unsafe() throws RecognitionException {
		struct_member_declaration_unsafeContext _localctx = new struct_member_declaration_unsafeContext(_ctx, 682);
		enterRule(_localctx, RULE_struct_member_declaration_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4858); fixed_size_buffer_declaration();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class fixed_size_buffer_declarationContext extends ParserRuleContext<Token> {
		public fixed_size_buffer_declarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final fixed_size_buffer_declarationContext fixed_size_buffer_declaration() throws RecognitionException {
		fixed_size_buffer_declarationContext _localctx = new fixed_size_buffer_declarationContext(_ctx, 684);
		enterRule(_localctx, RULE_fixed_size_buffer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4862);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,399,_ctx) ) {
				case 1:
					{
					setState(4860); attributes();
					}
					break;
			}
			setState(4866);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
				case 1:
					{
					setState(4864); fixed_size_buffer_modifiers();
					}
					break;
			}
			setState(4868); match(99);
			setState(4870); buffer_element_type();
			setState(4872); fixed_size_buffer_declarators();
			setState(4874); match(143);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class fixed_size_buffer_modifiersContext extends ParserRuleContext<Token> {
		public fixed_size_buffer_modifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final fixed_size_buffer_modifiersContext fixed_size_buffer_modifiers() throws RecognitionException {
		fixed_size_buffer_modifiersContext _localctx = new fixed_size_buffer_modifiersContext(_ctx, 686);
		enterRule(_localctx, RULE_fixed_size_buffer_modifiers);
		try {
			setState(4882);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,401,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4876); fixed_size_buffer_modifier();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4878); fixed_size_buffer_modifier();
					setState(4880); fixed_size_buffer_modifiers();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class fixed_size_buffer_modifierContext extends ParserRuleContext<Token> {
		public fixed_size_buffer_modifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final fixed_size_buffer_modifierContext fixed_size_buffer_modifier() throws RecognitionException {
		fixed_size_buffer_modifierContext _localctx = new fixed_size_buffer_modifierContext(_ctx, 688);
		enterRule(_localctx, RULE_fixed_size_buffer_modifier);
		try {
			setState(4896);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 110:
					enterOuterAlt(_localctx, 1);
					{
					setState(4884); match(110);
					}
					break;
				case 118:
					enterOuterAlt(_localctx, 2);
					{
					setState(4886); match(118);
					}
					break;
				case 138:
					enterOuterAlt(_localctx, 3);
					{
					setState(4888); match(138);
					}
					break;
				case 78:
					enterOuterAlt(_localctx, 4);
					{
					setState(4890); match(78);
					}
					break;
				case 48:
					enterOuterAlt(_localctx, 5);
					{
					setState(4892); match(48);
					}
					break;
				case 49:
					enterOuterAlt(_localctx, 6);
					{
					setState(4894); match(49);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class buffer_element_typeContext extends ParserRuleContext<Token> {
		public buffer_element_typeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final buffer_element_typeContext buffer_element_type() throws RecognitionException {
		buffer_element_typeContext _localctx = new buffer_element_typeContext(_ctx, 690);
		enterRule(_localctx, RULE_buffer_element_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4898); type();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class fixed_size_buffer_declaratorsContext extends ParserRuleContext<Token> {
		public fixed_size_buffer_declaratorsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final fixed_size_buffer_declaratorsContext fixed_size_buffer_declarators() throws RecognitionException {
		fixed_size_buffer_declaratorsContext _localctx = new fixed_size_buffer_declaratorsContext(_ctx, 692);
		enterRule(_localctx, RULE_fixed_size_buffer_declarators);
		try {
			setState(4906);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
					{
					setState(4900); fixed_size_buffer_declarator();
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4902); fixed_size_buffer_declarator();
					setState(4904); fixed_size_buffer_declarators();
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class fixed_size_buffer_declaratorContext extends ParserRuleContext<Token> {
		public fixed_size_buffer_declaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final fixed_size_buffer_declaratorContext fixed_size_buffer_declarator() throws RecognitionException {
		fixed_size_buffer_declaratorContext _localctx = new fixed_size_buffer_declaratorContext(_ctx, 694);
		enterRule(_localctx, RULE_fixed_size_buffer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4908); match(IDENTIFIER);
			setState(4910); match(82);
			setState(4912); constant_expression();
			setState(4914); match(115);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class local_variable_initializer_unsafeContext extends ParserRuleContext<Token> {
		public local_variable_initializer_unsafeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final local_variable_initializer_unsafeContext local_variable_initializer_unsafe() throws RecognitionException {
		local_variable_initializer_unsafeContext _localctx = new local_variable_initializer_unsafeContext(_ctx, 696);
		enterRule(_localctx, RULE_local_variable_initializer_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4916); stackalloc_initializer();
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class stackalloc_initializerContext extends ParserRuleContext<Token> {
		public stackalloc_initializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final stackalloc_initializerContext stackalloc_initializer() throws RecognitionException {
		stackalloc_initializerContext _localctx = new stackalloc_initializerContext(_ctx, 698);
		enterRule(_localctx, RULE_stackalloc_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4918); match(87);
			setState(4920); unmanaged_type();
			setState(4922); match(82);
			setState(4924); expression();
			setState(4926); match(115);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class literalContext extends ParserRuleContext<Token> {
		public literalContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((CSharp4Listener)listener).exitRule(this);
		}
	}

	public final literalContext literal() throws RecognitionException {
		literalContext _localctx = new literalContext(_ctx, 700);
		enterRule(_localctx, RULE_literal);
		try {
			setState(4942);
			//_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
				case 1:
					{
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					{
					setState(4930); match(BOOLEAN_LITERAL);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(4932); match(INTEGER_LITERAL);
					}
					break;
				case 4:
					enterOuterAlt(_localctx, 4);
					{
					setState(4934); match(REAL_LITERAL);
					}
					break;
				case 5:
					enterOuterAlt(_localctx, 5);
					{
					setState(4936); match(CHARACTER_LITERAL);
					}
					break;
				case 6:
					enterOuterAlt(_localctx, 6);
					{
					setState(4938); match(STRING_LITERAL);
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 7);
					{
					setState(4940); match(NULL_LITERAL);
					}
					break;
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@Override
	public String[] getTokenNames() { return tokenNames; }
	@Override
	public String[] getRuleNames() { return ruleNames; }
	@Override
	public ATN getATN() { return _ATN; }

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch ( ruleIndex ) {
				case 328 : return pointer_type_sempred((pointer_typeContext)_localctx, predIndex);
		}
		return true;
	}
	public boolean pointer_type_sempred(pointer_typeContext _localctx, int predIndex) {
		switch ( predIndex ) {
			case 0 : return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u00aa\u1351\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6"+
	  "\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16\7\16"+
	  "\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25\7\25"+
	  "\2\26\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34\7\34"+
	  "\2\35\7\35\2\36\7\36\2\37\7\37\2 \7 \2!\7!\2\"\7\"\2#\7#\2$\7$\2%\7%"+
	  "\2&\7&\2\'\7\'\2(\7(\2)\7)\2*\7*\2+\7+\2,\7,\2-\7-\2.\7.\2/\7/\2\60\7"+
	  "\60\2\61\7\61\2\62\7\62\2\63\7\63\2\64\7\64\2\65\7\65\2\66\7\66\2\67"+
	  "\7\67\28\78\29\79\2:\7:\2;\7;\2<\7<\2=\7=\2>\7>\2?\7?\2@\7@\2A\7A\2B"+
	  "\7B\2C\7C\2D\7D\2E\7E\2F\7F\2G\7G\2H\7H\2I\7I\2J\7J\2K\7K\2L\7L\2M\7"+
	  "M\2N\7N\2O\7O\2P\7P\2Q\7Q\2R\7R\2S\7S\2T\7T\2U\7U\2V\7V\2W\7W\2X\7X\2"+
	  "Y\7Y\2Z\7Z\2[\7[\2\\\7\\\2]\7]\2^\7^\2_\7_\2`\7`\2a\7a\2b\7b\2c\7c\2"+
	  "d\7d\2e\7e\2f\7f\2g\7g\2h\7h\2i\7i\2j\7j\2k\7k\2l\7l\2m\7m\2n\7n\2o\7"+
	  "o\2p\7p\2q\7q\2r\7r\2s\7s\2t\7t\2u\7u\2v\7v\2w\7w\2x\7x\2y\7y\2z\7z\2"+
	  "{\7{\2|\7|\2}\7}\2~\7~\2\177\7\177\2\u0080\7\u0080\2\u0081\7\u0081\2"+
	  "\u0082\7\u0082\2\u0083\7\u0083\2\u0084\7\u0084\2\u0085\7\u0085\2\u0086"+
	  "\7\u0086\2\u0087\7\u0087\2\u0088\7\u0088\2\u0089\7\u0089\2\u008a\7\u008a"+
	  "\2\u008b\7\u008b\2\u008c\7\u008c\2\u008d\7\u008d\2\u008e\7\u008e\2\u008f"+
	  "\7\u008f\2\u0090\7\u0090\2\u0091\7\u0091\2\u0092\7\u0092\2\u0093\7\u0093"+
	  "\2\u0094\7\u0094\2\u0095\7\u0095\2\u0096\7\u0096\2\u0097\7\u0097\2\u0098"+
	  "\7\u0098\2\u0099\7\u0099\2\u009a\7\u009a\2\u009b\7\u009b\2\u009c\7\u009c"+
	  "\2\u009d\7\u009d\2\u009e\7\u009e\2\u009f\7\u009f\2\u00a0\7\u00a0\2\u00a1"+
	  "\7\u00a1\2\u00a2\7\u00a2\2\u00a3\7\u00a3\2\u00a4\7\u00a4\2\u00a5\7\u00a5"+
	  "\2\u00a6\7\u00a6\2\u00a7\7\u00a7\2\u00a8\7\u00a8\2\u00a9\7\u00a9\2\u00aa"+
	  "\7\u00aa\2\u00ab\7\u00ab\2\u00ac\7\u00ac\2\u00ad\7\u00ad\2\u00ae\7\u00ae"+
	  "\2\u00af\7\u00af\2\u00b0\7\u00b0\2\u00b1\7\u00b1\2\u00b2\7\u00b2\2\u00b3"+
	  "\7\u00b3\2\u00b4\7\u00b4\2\u00b5\7\u00b5\2\u00b6\7\u00b6\2\u00b7\7\u00b7"+
	  "\2\u00b8\7\u00b8\2\u00b9\7\u00b9\2\u00ba\7\u00ba\2\u00bb\7\u00bb\2\u00bc"+
	  "\7\u00bc\2\u00bd\7\u00bd\2\u00be\7\u00be\2\u00bf\7\u00bf\2\u00c0\7\u00c0"+
	  "\2\u00c1\7\u00c1\2\u00c2\7\u00c2\2\u00c3\7\u00c3\2\u00c4\7\u00c4\2\u00c5"+
	  "\7\u00c5\2\u00c6\7\u00c6\2\u00c7\7\u00c7\2\u00c8\7\u00c8\2\u00c9\7\u00c9"+
	  "\2\u00ca\7\u00ca\2\u00cb\7\u00cb\2\u00cc\7\u00cc\2\u00cd\7\u00cd\2\u00ce"+
	  "\7\u00ce\2\u00cf\7\u00cf\2\u00d0\7\u00d0\2\u00d1\7\u00d1\2\u00d2\7\u00d2"+
	  "\2\u00d3\7\u00d3\2\u00d4\7\u00d4\2\u00d5\7\u00d5\2\u00d6\7\u00d6\2\u00d7"+
	  "\7\u00d7\2\u00d8\7\u00d8\2\u00d9\7\u00d9\2\u00da\7\u00da\2\u00db\7\u00db"+
	  "\2\u00dc\7\u00dc\2\u00dd\7\u00dd\2\u00de\7\u00de\2\u00df\7\u00df\2\u00e0"+
	  "\7\u00e0\2\u00e1\7\u00e1\2\u00e2\7\u00e2\2\u00e3\7\u00e3\2\u00e4\7\u00e4"+
	  "\2\u00e5\7\u00e5\2\u00e6\7\u00e6\2\u00e7\7\u00e7\2\u00e8\7\u00e8\2\u00e9"+
	  "\7\u00e9\2\u00ea\7\u00ea\2\u00eb\7\u00eb\2\u00ec\7\u00ec\2\u00ed\7\u00ed"+
	  "\2\u00ee\7\u00ee\2\u00ef\7\u00ef\2\u00f0\7\u00f0\2\u00f1\7\u00f1\2\u00f2"+
	  "\7\u00f2\2\u00f3\7\u00f3\2\u00f4\7\u00f4\2\u00f5\7\u00f5\2\u00f6\7\u00f6"+
	  "\2\u00f7\7\u00f7\2\u00f8\7\u00f8\2\u00f9\7\u00f9\2\u00fa\7\u00fa\2\u00fb"+
	  "\7\u00fb\2\u00fc\7\u00fc\2\u00fd\7\u00fd\2\u00fe\7\u00fe\2\u00ff\7\u00ff"+
	  "\2\u0100\7\u0100\2\u0101\7\u0101\2\u0102\7\u0102\2\u0103\7\u0103\2\u0104"+
	  "\7\u0104\2\u0105\7\u0105\2\u0106\7\u0106\2\u0107\7\u0107\2\u0108\7\u0108"+
	  "\2\u0109\7\u0109\2\u010a\7\u010a\2\u010b\7\u010b\2\u010c\7\u010c\2\u010d"+
	  "\7\u010d\2\u010e\7\u010e\2\u010f\7\u010f\2\u0110\7\u0110\2\u0111\7\u0111"+
	  "\2\u0112\7\u0112\2\u0113\7\u0113\2\u0114\7\u0114\2\u0115\7\u0115\2\u0116"+
	  "\7\u0116\2\u0117\7\u0117\2\u0118\7\u0118\2\u0119\7\u0119\2\u011a\7\u011a"+
	  "\2\u011b\7\u011b\2\u011c\7\u011c\2\u011d\7\u011d\2\u011e\7\u011e\2\u011f"+
	  "\7\u011f\2\u0120\7\u0120\2\u0121\7\u0121\2\u0122\7\u0122\2\u0123\7\u0123"+
	  "\2\u0124\7\u0124\2\u0125\7\u0125\2\u0126\7\u0126\2\u0127\7\u0127\2\u0128"+
	  "\7\u0128\2\u0129\7\u0129\2\u012a\7\u012a\2\u012b\7\u012b\2\u012c\7\u012c"+
	  "\2\u012d\7\u012d\2\u012e\7\u012e\2\u012f\7\u012f\2\u0130\7\u0130\2\u0131"+
	  "\7\u0131\2\u0132\7\u0132\2\u0133\7\u0133\2\u0134\7\u0134\2\u0135\7\u0135"+
	  "\2\u0136\7\u0136\2\u0137\7\u0137\2\u0138\7\u0138\2\u0139\7\u0139\2\u013a"+
	  "\7\u013a\2\u013b\7\u013b\2\u013c\7\u013c\2\u013d\7\u013d\2\u013e\7\u013e"+
	  "\2\u013f\7\u013f\2\u0140\7\u0140\2\u0141\7\u0141\2\u0142\7\u0142\2\u0143"+
	  "\7\u0143\2\u0144\7\u0144\2\u0145\7\u0145\2\u0146\7\u0146\2\u0147\7\u0147"+
	  "\2\u0148\7\u0148\2\u0149\7\u0149\2\u014a\7\u014a\2\u014b\7\u014b\2\u014c"+
	  "\7\u014c\2\u014d\7\u014d\2\u014e\7\u014e\2\u014f\7\u014f\2\u0150\7\u0150"+
	  "\2\u0151\7\u0151\2\u0152\7\u0152\2\u0153\7\u0153\2\u0154\7\u0154\2\u0155"+
	  "\7\u0155\2\u0156\7\u0156\2\u0157\7\u0157\2\u0158\7\u0158\2\u0159\7\u0159"+
	  "\2\u015a\7\u015a\2\u015b\7\u015b\2\u015c\7\u015c\2\u015d\7\u015d\2\u015e"+
	  "\7\u015e\1\0\1\0\1\1\1\1\1\2\0\1\2\0\3\2\b\2\1\2\0\3\2\b\2\1\2\0\1\2"+
	  "\0\1\2\0\3\2\b\2\5\2\b\2\n\2\f\2\u02d8\t\2\1\3\0\1\3\0\1\3\0\1\3\0\1"+
	  "\3\0\1\3\0\1\3\0\1\3\0\1\3\0\3\3\b\3\1\3\0\1\3\0\1\3\0\5\3\b\3\n\3\f"+
	  "\3\u02f7\t\3\1\4\0\1\4\0\3\4\b\4\1\5\0\1\5\0\1\5\0\3\5\b\5\1\6\0\1\6"+
	  "\0\3\6\b\6\1\7\0\1\7\0\1\7\0\3\7\b\7\1\b\0\1\b\0\1\b\0\1\b\0\1\b\0\1"+
	  "\b\0\1\b\0\1\b\0\1\b\0\3\b\b\b\1\t\0\1\t\0\3\t\b\t\1\n\0\1\n\1\n\1\13"+
	  "\1\13\1\f\1\f\1\r\0\1\r\0\1\r\0\1\r\0\3\r\b\r\1\16\0\1\16\0\1\16\0\1"+
	  "\16\0\3\16\b\16\1\17\1\17\1\20\1\20\1\21\0\1\21\0\1\21\1\21\1\22\0\1"+
	  "\22\0\1\22\0\5\22\b\22\n\22\f\22\u035e\t\22\1\23\1\23\1\24\1\24\1\25"+
	  "\0\1\25\0\1\25\0\5\25\b\25\n\25\f\25\u036d\t\25\1\26\0\3\26\b\26\1\26"+
	  "\1\26\1\27\0\1\27\1\27\1\30\0\1\30\0\1\30\0\1\30\0\1\30\0\3\30\b\30\1"+
	  "\31\0\1\31\0\3\31\b\31\1\32\0\1\32\0\1\32\0\1\32\0\1\32\0\1\32\0\1\32"+
	  "\0\3\32\b\32\1\32\0\1\32\0\1\32\0\1\32\0\3\32\b\32\1\32\0\1\32\0\1\32"+
	  "\1\32\1\32\0\1\32\0\1\32\0\3\32\b\32\1\32\1\32\1\32\0\1\32\0\1\32\0\1"+
	  "\32\1\32\1\32\0\1\32\1\32\1\32\0\1\32\0\1\32\0\1\32\0\1\32\0\1\32\0\1"+
	  "\32\0\1\32\0\1\32\0\1\32\0\1\32\1\32\1\32\0\3\32\b\32\1\32\0\1\32\0\1"+
	  "\32\0\3\32\b\32\1\32\0\1\32\0\3\32\b\32\1\32\0\1\32\0\1\32\0\1\32\1\32"+
	  "\1\32\0\1\32\0\1\32\0\1\32\0\1\32\0\1\32\0\1\32\1\32\5\32\b\32\n\32\f"+
	  "\32\u0402\t\32\1\33\0\1\33\0\3\33\b\33\1\34\0\1\34\0\1\34\1\34\1\35\0"+
	  "\1\35\0\1\35\0\1\35\0\3\35\b\35\1\35\0\1\35\0\1\35\0\1\35\0\3\35\b\35"+
	  "\1\35\0\1\35\0\1\35\1\35\3\35\b\35\1\36\0\1\36\0\1\36\0\1\36\0\1\36\0"+
	  "\1\36\0\1\36\0\1\36\0\1\36\0\1\36\0\1\36\0\1\36\0\1\36\0\1\36\0\1\36"+
	  "\0\3\36\b\36\1\37\0\1\37\0\1\37\0\3\37\b\37\1\37\1\37\1 \0\1 \0\1 \0"+
	  "\1 \1 \1!\0\1!\0\1!\0\5!\b!\n!\f!\u0467\t!\1\"\1\"\1#\0\1#\0\1#\0\1#"+
	  "\0\1#\0\1#\0\1#\1#\3#\b#\1$\0\1$\1$\1%\0\1%\1%\1&\0\1&\0\1&\0\1&\0\3"+
	  "&\b&\1&\0\1&\0\3&\b&\1&\0\1&\0\1&\1&\3&\b&\1\'\0\1\'\0\3\'\b\'\1(\0\1"+
	  "(\0\3(\b(\1(\0\1(\0\1(\0\1(\0\1(\1(\3(\b(\1)\0\1)\0\1)\0\5)\b)\n)\f)"+
	  "\u04bc\t)\1*\0\1*\0\1*\1*\1+\0\1+\0\3+\b+\1,\0\1,\0\1,\1,\1,\0\1,\0\1"+
	  ",\0\1,\1,\3,\b,\1-\0\1-\0\1-\0\5-\b-\n-\f-\u04e3\t-\1.\0\1.\0\1.\0\1"+
	  ".\1.\3.\b.\1/\0\1/\0\1/\0\1/\0\1/\0\1/\0\3/\b/\1/\0\3/\b/\1/\0\1/\0\1"+
	  "/\1/\1/\0\1/\0\1/\1/\3/\b/\1\60\0\1\60\0\1\60\0\1\60\0\1\60\1\60\1\61"+
	  "\0\1\61\1\61\1\62\0\1\62\0\3\62\b\62\1\62\0\1\62\0\1\62\0\1\62\0\1\62"+
	  "\1\62\3\62\b\62\1\63\0\1\63\0\1\63\0\5\63\b\63\n\63\f\63\u0538\t\63\1"+
	  "\64\0\1\64\0\1\64\0\1\64\0\1\64\0\1\64\0\3\64\b\64\1\65\0\1\65\0\1\65"+
	  "\0\1\65\1\65\1\65\0\1\65\0\1\65\0\1\65\1\65\1\65\0\1\65\0\1\65\0\1\65"+
	  "\0\3\65\b\65\1\66\0\1\66\0\3\66\b\66\1\66\0\1\66\0\3\66\b\66\1\66\0\1"+
	  "\66\0\1\66\0\3\66\b\66\5\66\b\66\n\66\f\66\u0579\t\66\1\67\0\1\67\0\3"+
	  "\67\b\67\1\67\1\67\18\0\18\0\58\b8\n8\f8\u058a\t8\19\0\19\0\19\0\19\1"+
	  "9\1:\0\1:\0\1:\0\1:\1:\1;\0\1;\0\1;\0\1;\1;\1<\0\1<\0\1<\0\1<\0\1<\0"+
	  "\1<\0\1<\0\1<\0\1<\0\1<\0\1<\0\1<\0\1<\0\3<\b<\1=\0\1=\1=\1>\0\1>\1>"+
	  "\1?\0\1?\0\1?\0\1?\1?\1@\0\1@\0\1@\0\1@\0\1@\0\1@\0\1@\0\5@\b@\n@\f@"+
	  "\u05e1\t@\1A\0\1A\0\1A\0\1A\0\1A\0\5A\bA\nA\fA\u05f0\tA\1B\0\1B\0\1B"+
	  "\0\1B\0\1B\0\5B\bB\nB\fB\u05ff\tB\1C\0\1C\0\1C\0\1C\0\1C\0\1C\0\1C\0"+
	  "\1C\0\1C\0\1C\0\1C\0\1C\0\1C\0\5C\bC\nC\fC\u061e\tC\1D\0\1D\0\1D\0\1"+
	  "D\0\1D\0\5D\bD\nD\fD\u062d\tD\1E\0\1E\0\1E\0\5E\bE\nE\fE\u0638\tE\1F"+
	  "\0\1F\0\1F\0\5F\bF\nF\fF\u0643\tF\1G\0\1G\0\1G\0\5G\bG\nG\fG\u064e\t"+
	  "G\1H\0\1H\0\1H\0\5H\bH\nH\fH\u0659\tH\1I\0\1I\0\1I\0\5I\bI\nI\fI\u0664"+
	  "\tI\1J\0\1J\0\1J\0\1J\1J\3J\bJ\1K\0\1K\0\1K\0\1K\0\1K\0\1K\1K\3K\bK\1"+
	  "L\0\1L\0\1L\1L\1M\0\1M\0\3M\bM\1M\1M\1N\0\1N\0\3N\bN\1O\0\1O\0\3O\bO"+
	  "\1O\1O\1P\0\1P\0\1P\0\5P\bP\nP\fP\u06a3\tP\1Q\0\3Q\bQ\1Q\0\1Q\1Q\1R\0"+
	  "\1R\0\3R\bR\1S\0\1S\0\3S\bS\1S\0\1S\0\3S\bS\1T\0\1T\0\1T\0\5T\bT\nT\f"+
	  "T\u06c8\tT\1U\1U\1V\0\1V\0\3V\bV\1W\0\1W\1W\1X\0\1X\0\3X\bX\1X\0\1X\0"+
	  "\1X\1X\1Y\0\3Y\bY\1Y\0\1Y\0\3Y\bY\1Z\0\1Z\0\5Z\bZ\nZ\fZ\u06f3\tZ\1[\0"+
	  "\1[\0\1[\0\1[\0\1[\0\1[\0\3[\b[\1\\\0\1\\\0\1\\\0\1\\\1\\\1]\0\1]\1]"+
	  "\1^\0\1^\0\3^\b^\1^\0\1^\0\1^\0\1^\0\1^\0\1^\0\1^\1^\1_\0\1_\0\3_\b_"+
	  "\1_\0\1_\0\1_\0\1_\0\1_\0\1_\0\1_\0\1_\0\1_\1_\1`\0\1`\1`\1a\0\1a\0\1"+
	  "a\0\5a\ba\na\fa\u0748\ta\1b\0\1b\0\3b\bb\1c\0\1c\0\3c\bc\1d\0\1d\0\3"+
	  "d\bd\1e\0\1e\1e\1f\0\1f\0\1f\0\1f\1f\1g\0\1g\0\1g\1g\1h\0\1h\0\1h\1h"+
	  "\1i\0\1i\0\1i\0\1i\0\1i\0\1i\0\1i\0\1i\0\1i\0\1i\0\1i\0\3i\bi\1j\0\1"+
	  "j\0\3j\bj\1k\0\1k\0\1k\0\3k\bk\1l\1l\1m\1m\1n\0\1n\0\1n\0\3n\bn\1o\0"+
	  "\1o\0\1o\0\1o\0\1o\0\1o\0\1o\0\1o\0\1o\0\1o\0\1o\0\1o\0\1o\0\3o\bo\1"+
	  "p\0\1p\0\3p\bp\1p\1p\1q\0\1q\0\5q\bq\nq\fq\u07d1\tq\1r\1r\1s\0\1s\0\1"+
	  "s\1s\1t\0\1t\1t\1t\0\1t\1t\3t\bt\1u\0\1u\1u\1v\0\1v\0\3v\bv\1w\0\1w\0"+
	  "\1w\0\5w\bw\nw\fw\u07f8\tw\1x\0\1x\0\1x\0\1x\0\3x\bx\1y\0\1y\0\1y\0\3"+
	  "y\by\1z\0\1z\0\1z\1z\1{\0\1{\1{\1|\0\1|\0\1|\0\1|\0\1|\0\1|\0\1|\0\3"+
	  "|\b|\1}\0\1}\0\3}\b}\1~\0\1~\0\1~\0\1~\0\1~\1~\1~\0\1~\0\1~\0\1~\0\1"+
	  "~\0\1~\0\1~\1~\3~\b~\1\177\0\1\177\0\1\177\0\1\177\0\1\177\1\177\1\u0080"+
	  "\0\1\u0080\0\3\u0080\b\u0080\1\u0080\1\u0080\1\u0081\0\1\u0081\0\5\u0081"+
	  "\b\u0081\n\u0081\f\u0081\u085f\t\u0081\1\u0082\0\1\u0082\1\u0082\1\u0083"+
	  "\0\1\u0083\0\5\u0083\b\u0083\n\u0083\f\u0083\u086c\t\u0083\1\u0084\0"+
	  "\1\u0084\0\1\u0084\1\u0084\1\u0084\0\1\u0084\0\3\u0084\b\u0084\1\u0085"+
	  "\0\1\u0085\0\1\u0085\0\1\u0085\0\3\u0085\b\u0085\1\u0086\0\1\u0086\0"+
	  "\1\u0086\0\1\u0086\0\1\u0086\1\u0086\1\u0087\0\1\u0087\0\1\u0087\0\1"+
	  "\u0087\0\1\u0087\0\1\u0087\0\1\u0087\1\u0087\1\u0088\0\1\u0088\0\1\u0088"+
	  "\0\3\u0088\b\u0088\1\u0088\0\1\u0088\0\3\u0088\b\u0088\1\u0088\0\1\u0088"+
	  "\0\3\u0088\b\u0088\1\u0088\0\1\u0088\1\u0088\1\u0089\0\1\u0089\0\3\u0089"+
	  "\b\u0089\1\u008a\1\u008a\1\u008b\1\u008b\1\u008c\0\1\u008c\0\1\u008c"+
	  "\0\5\u008c\b\u008c\n\u008c\f\u008c\u08c7\t\u008c\1\u008d\0\1\u008d\0"+
	  "\1\u008d\0\1\u008d\0\1\u008d\0\1\u008d\0\1\u008d\0\1\u008d\1\u008d\1"+
	  "\u008e\0\1\u008e\0\1\u008e\0\1\u008e\0\1\u008e\0\3\u008e\b\u008e\1\u008f"+
	  "\0\1\u008f\1\u008f\1\u0090\0\1\u0090\1\u0090\1\u0091\0\1\u0091\0\1\u0091"+
	  "\0\1\u0091\0\1\u0091\0\1\u0091\0\1\u0091\1\u0091\1\u0091\0\1\u0091\0"+
	  "\1\u0091\0\3\u0091\b\u0091\1\u0092\0\1\u0092\0\3\u0092\b\u0092\1\u0092"+
	  "\1\u0092\1\u0093\0\1\u0093\0\3\u0093\b\u0093\1\u0093\1\u0093\1\u0094"+
	  "\0\1\u0094\0\1\u0094\1\u0094\1\u0094\0\1\u0094\0\1\u0094\1\u0094\1\u0094"+
	  "\0\1\u0094\0\1\u0094\0\1\u0094\1\u0094\3\u0094\b\u0094\1\u0095\0\1\u0095"+
	  "\0\3\u0095\b\u0095\1\u0095\0\3\u0095\b\u0095\1\u0095\0\3\u0095\b\u0095"+
	  "\1\u0096\0\1\u0096\0\5\u0096\b\u0096\n\u0096\f\u0096\u093e\t\u0096\1"+
	  "\u0097\0\1\u0097\0\1\u0097\0\1\u0097\0\3\u0097\b\u0097\1\u0097\0\1\u0097"+
	  "\1\u0097\1\u0098\0\1\u0098\1\u0098\1\u0099\0\1\u0099\1\u0099\1\u009a"+
	  "\0\1\u009a\1\u009a\1\u009b\0\1\u009b\1\u009b\1\u009c\0\1\u009c\0\1\u009c"+
	  "\0\1\u009c\0\1\u009c\1\u009c\1\u009d\0\1\u009d\0\1\u009d\0\1\u009d\0"+
	  "\1\u009d\1\u009d\1\u009e\0\1\u009e\0\3\u009e\b\u009e\1\u009f\0\1\u009f"+
	  "\0\1\u009f\0\1\u009f\1\u009f\1\u009f\0\1\u009f\0\1\u009f\0\3\u009f\b"+
	  "\u009f\1\u00a0\0\3\u00a0\b\u00a0\1\u00a0\0\3\u00a0\b\u00a0\1\u00a0\0"+
	  "\3\u00a0\b\u00a0\1\u00a0\0\3\u00a0\b\u00a0\1\u00a1\0\1\u00a1\0\1\u00a1"+
	  "\0\1\u00a1\0\3\u00a1\b\u00a1\1\u00a2\0\1\u00a2\0\1\u00a2\0\5\u00a2\b"+
	  "\u00a2\n\u00a2\f\u00a2\u09ab\t\u00a2\1\u00a3\0\1\u00a3\0\3\u00a3\b\u00a3"+
	  "\1\u00a3\0\3\u00a3\b\u00a3\1\u00a3\0\3\u00a3\b\u00a3\1\u00a3\1\u00a3"+
	  "\1\u00a4\0\1\u00a4\0\5\u00a4\b\u00a4\n\u00a4\f\u00a4\u09c4\t\u00a4\1"+
	  "\u00a5\0\1\u00a5\0\1\u00a5\0\1\u00a5\1\u00a5\1\u00a6\0\1\u00a6\0\5\u00a6"+
	  "\b\u00a6\n\u00a6\f\u00a6\u09d5\t\u00a6\1\u00a7\0\1\u00a7\0\3\u00a7\b"+
	  "\u00a7\1\u00a8\0\1\u00a8\0\1\u00a8\0\1\u00a8\0\1\u00a8\1\u00a8\1\u00a9"+
	  "\0\1\u00a9\0\1\u00a9\1\u00a9\1\u00aa\0\1\u00aa\0\5\u00aa\b\u00aa\n\u00aa"+
	  "\f\u00aa\u09f4\t\u00aa\1\u00ab\0\1\u00ab\0\3\u00ab\b\u00ab\1\u00ac\0"+
	  "\1\u00ac\0\1\u00ac\0\1\u00ac\0\1\u00ac\0\3\u00ac\b\u00ac\1\u00ad\0\1"+
	  "\u00ad\0\1\u00ad\0\1\u00ad\0\3\u00ad\b\u00ad\1\u00ae\0\3\u00ae\b\u00ae"+
	  "\1\u00ae\0\3\u00ae\b\u00ae\1\u00ae\0\3\u00ae\b\u00ae\1\u00ae\0\1\u00ae"+
	  "\0\1\u00ae\0\3\u00ae\b\u00ae\1\u00ae\0\3\u00ae\b\u00ae\1\u00ae\0\3\u00ae"+
	  "\b\u00ae\1\u00ae\0\1\u00ae\0\3\u00ae\b\u00ae\1\u00af\0\1\u00af\0\5\u00af"+
	  "\b\u00af\n\u00af\f\u00af\u0a3b\t\u00af\1\u00b0\0\1\u00b0\0\1\u00b0\0"+
	  "\1\u00b0\0\1\u00b0\0\1\u00b0\0\1\u00b0\0\1\u00b0\0\1\u00b0\0\3\u00b0"+
	  "\b\u00b0\1\u00b1\0\1\u00b1\0\1\u00b1\1\u00b1\1\u00b2\0\3\u00b2\b\u00b2"+
	  "\1\u00b2\0\1\u00b2\0\1\u00b2\0\3\u00b2\b\u00b2\1\u00b2\0\5\u00b2\b\u00b2"+
	  "\n\u00b2\f\u00b2\u0a68\t\u00b2\1\u00b3\1\u00b3\1\u00b4\0\1\u00b4\0\1"+
	  "\u00b4\0\1\u00b4\0\1\u00b4\0\1\u00b4\0\1\u00b4\0\1\u00b4\1\u00b4\3\u00b4"+
	  "\b\u00b4\1\u00b5\0\1\u00b5\0\1\u00b5\0\5\u00b5\b\u00b5\n\u00b5\f\u00b5"+
	  "\u0a87\t\u00b5\1\u00b6\0\1\u00b6\0\5\u00b6\b\u00b6\n\u00b6\f\u00b6\u0a90"+
	  "\t\u00b6\1\u00b7\0\1\u00b7\0\1\u00b7\0\1\u00b7\1\u00b7\1\u00b8\0\1\u00b8"+
	  "\0\1\u00b8\0\1\u00b8\0\1\u00b8\0\1\u00b8\1\u00b8\1\u00b8\0\1\u00b8\0"+
	  "\1\u00b8\1\u00b8\1\u00b8\0\1\u00b8\0\1\u00b8\1\u00b8\1\u00b8\0\1\u00b8"+
	  "\0\1\u00b8\0\1\u00b8\0\1\u00b8\1\u00b8\3\u00b8\b\u00b8\1\u00b9\0\1\u00b9"+
	  "\0\1\u00b9\0\3\u00b9\b\u00b9\1\u00ba\0\1\u00ba\0\3\u00ba\b\u00ba\1\u00ba"+
	  "\0\1\u00ba\0\1\u00ba\0\3\u00ba\b\u00ba\5\u00ba\b\u00ba\n\u00ba\f\u00ba"+
	  "\u0ad7\t\u00ba\1\u00bb\0\1\u00bb\0\1\u00bb\1\u00bb\1\u00bc\0\1\u00bc"+
	  "\0\3\u00bc\b\u00bc\1\u00bc\1\u00bc\1\u00bd\0\4\u00bd\b\u00bd\13\u00bd"+
	  "\f\u00bd\u0aea\1\u00be\0\1\u00be\0\1\u00be\0\1\u00be\0\1\u00be\0\1\u00be"+
	  "\0\1\u00be\0\1\u00be\0\1\u00be\0\1\u00be\0\1\u00be\0\3\u00be\b\u00be"+
	  "\1\u00bf\0\3\u00bf\b\u00bf\1\u00bf\0\3\u00bf\b\u00bf\1\u00bf\0\1\u00bf"+
	  "\0\1\u00bf\0\1\u00bf\1\u00bf\1\u00c0\0\4\u00c0\b\u00c0\13\u00c0\f\u00c0"+
	  "\u0b18\1\u00c1\0\1\u00c1\0\1\u00c1\0\1\u00c1\0\1\u00c1\0\3\u00c1\b\u00c1"+
	  "\1\u00c2\0\1\u00c2\0\1\u00c2\0\5\u00c2\b\u00c2\n\u00c2\f\u00c2\u0b30"+
	  "\t\u00c2\1\u00c3\0\1\u00c3\0\1\u00c3\1\u00c3\1\u00c4\0\3\u00c4\b\u00c4"+
	  "\1\u00c4\0\3\u00c4\b\u00c4\1\u00c4\0\1\u00c4\0\1\u00c4\1\u00c4\1\u00c5"+
	  "\0\1\u00c5\0\5\u00c5\b\u00c5\n\u00c5\f\u00c5\u0b4d\t\u00c5\1\u00c6\0"+
	  "\1\u00c6\0\1\u00c6\0\1\u00c6\0\1\u00c6\0\1\u00c6\0\1\u00c6\0\1\u00c6"+
	  "\0\1\u00c6\0\3\u00c6\b\u00c6\1\u00c7\0\1\u00c7\0\1\u00c7\0\5\u00c7\b"+
	  "\u00c7\n\u00c7\f\u00c7\u0b6c\t\u00c7\1\u00c8\0\1\u00c8\0\1\u00c8\0\1"+
	  "\u00c8\0\3\u00c8\b\u00c8\1\u00c9\0\1\u00c9\0\3\u00c9\b\u00c9\1\u00ca"+
	  "\0\1\u00ca\1\u00ca\1\u00cb\0\3\u00cb\b\u00cb\1\u00cb\0\3\u00cb\b\u00cb"+
	  "\1\u00cb\0\3\u00cb\b\u00cb\1\u00cb\0\1\u00cb\0\1\u00cb\0\3\u00cb\b\u00cb"+
	  "\1\u00cb\0\1\u00cb\0\3\u00cb\b\u00cb\1\u00cb\0\1\u00cb\0\3\u00cb\b\u00cb"+
	  "\1\u00cc\0\1\u00cc\0\5\u00cc\b\u00cc\n\u00cc\f\u00cc\u0ba9\t\u00cc\1"+
	  "\u00cd\0\1\u00cd\0\1\u00cd\0\1\u00cd\0\1\u00cd\0\1\u00cd\0\1\u00cd\0"+
	  "\1\u00cd\0\1\u00cd\0\1\u00cd\0\1\u00cd\0\1\u00cd\0\3\u00cd\b\u00cd\1"+
	  "\u00ce\0\1\u00ce\0\3\u00ce\b\u00ce\1\u00cf\0\1\u00cf\0\1\u00cf\0\1\u00cf"+
	  "\1\u00cf\3\u00cf\b\u00cf\1\u00d0\0\1\u00d0\0\3\u00d0\b\u00d0\1\u00d1"+
	  "\0\1\u00d1\0\1\u00d1\0\1\u00d1\1\u00d1\1\u00d1\0\3\u00d1\b\u00d1\1\u00d2"+
	  "\0\1\u00d2\0\1\u00d2\0\5\u00d2\b\u00d2\n\u00d2\f\u00d2\u0bf0\t\u00d2"+
	  "\1\u00d3\0\3\u00d3\b\u00d3\1\u00d3\0\3\u00d3\b\u00d3\1\u00d3\0\1\u00d3"+
	  "\0\1\u00d3\0\3\u00d3\b\u00d3\1\u00d4\0\1\u00d4\1\u00d4\1\u00d5\0\1\u00d5"+
	  "\0\1\u00d5\0\3\u00d5\b\u00d5\1\u00d6\0\3\u00d6\b\u00d6\1\u00d6\0\1\u00d6"+
	  "\0\1\u00d6\1\u00d6\1\u00d7\0\3\u00d7\b\u00d7\1\u00d7\0\3\u00d7\b\u00d7"+
	  "\1\u00d7\0\1\u00d7\0\1\u00d7\0\1\u00d7\0\1\u00d7\1\u00d7\1\u00d8\0\1"+
	  "\u00d8\0\5\u00d8\b\u00d8\n\u00d8\f\u00d8\u0c31\t\u00d8\1\u00d9\0\1\u00d9"+
	  "\0\1\u00d9\0\1\u00d9\0\1\u00d9\0\1\u00d9\0\1\u00d9\0\1\u00d9\0\1\u00d9"+
	  "\0\1\u00d9\0\1\u00d9\0\1\u00d9\0\3\u00d9\b\u00d9\1\u00da\0\1\u00da\0"+
	  "\3\u00da\b\u00da\1\u00da\0\1\u00da\0\3\u00da\b\u00da\3\u00da\b\u00da"+
	  "\1\u00db\0\3\u00db\b\u00db\1\u00db\0\3\u00db\b\u00db\1\u00db\0\1\u00db"+
	  "\1\u00db\1\u00dc\0\3\u00dc\b\u00dc\1\u00dc\0\3\u00dc\b\u00dc\1\u00dc"+
	  "\0\1\u00dc\1\u00dc\1\u00dd\0\1\u00dd\0\1\u00dd\0\1\u00dd\0\1\u00dd\0"+
	  "\1\u00dd\0\1\u00dd\0\3\u00dd\b\u00dd\1\u00de\0\1\u00de\0\3\u00de\b\u00de"+
	  "\1\u00df\0\3\u00df\b\u00df\1\u00df\0\3\u00df\b\u00df\1\u00df\0\1\u00df"+
	  "\0\1\u00df\0\1\u00df\1\u00df\1\u00df\0\3\u00df\b\u00df\1\u00df\0\3\u00df"+
	  "\b\u00df\1\u00df\0\1\u00df\0\1\u00df\0\1\u00df\0\1\u00df\0\1\u00df\1"+
	  "\u00df\3\u00df\b\u00df\1\u00e0\0\1\u00e0\0\5\u00e0\b\u00e0\n\u00e0\f"+
	  "\u00e0\u0cb6\t\u00e0\1\u00e1\0\1\u00e1\0\1\u00e1\0\1\u00e1\0\1\u00e1"+
	  "\0\1\u00e1\0\1\u00e1\0\1\u00e1\0\1\u00e1\0\1\u00e1\0\1\u00e1\0\1\u00e1"+
	  "\0\3\u00e1\b\u00e1\1\u00e2\0\1\u00e2\1\u00e2\1\u00e2\0\1\u00e2\1\u00e2"+
	  "\3\u00e2\b\u00e2\1\u00e3\0\3\u00e3\b\u00e3\1\u00e3\0\1\u00e3\1\u00e3"+
	  "\1\u00e4\0\3\u00e4\b\u00e4\1\u00e4\0\1\u00e4\1\u00e4\1\u00e5\0\3\u00e5"+
	  "\b\u00e5\1\u00e5\0\3\u00e5\b\u00e5\1\u00e5\0\1\u00e5\0\1\u00e5\0\1\u00e5"+
	  "\1\u00e5\1\u00e6\0\1\u00e6\0\5\u00e6\b\u00e6\n\u00e6\f\u00e6\u0d03\t"+
	  "\u00e6\1\u00e7\0\1\u00e7\0\1\u00e7\0\1\u00e7\0\1\u00e7\0\1\u00e7\0\1"+
	  "\u00e7\0\1\u00e7\0\1\u00e7\0\1\u00e7\0\1\u00e7\0\3\u00e7\b\u00e7\1\u00e8"+
	  "\0\1\u00e8\0\1\u00e8\0\1\u00e8\0\1\u00e8\1\u00e8\1\u00e8\0\1\u00e8\0"+
	  "\1\u00e8\0\1\u00e8\0\1\u00e8\0\1\u00e8\0\1\u00e8\1\u00e8\3\u00e8\b\u00e8"+
	  "\1\u00e9\0\3\u00e9\b\u00e9\1\u00e9\0\1\u00e9\0\1\u00e9\1\u00e9\1\u00ea"+
	  "\0\1\u00ea\0\5\u00ea\b\u00ea\n\u00ea\f\u00ea\u0d48\t\u00ea\1\u00eb\0"+
	  "\1\u00eb\0\1\u00eb\0\1\u00eb\0\3\u00eb\b\u00eb\1\u00ec\0\1\u00ec\0\1"+
	  "\u00ec\0\3\u00ec\b\u00ec\1\u00ed\0\1\u00ed\0\1\u00ed\0\1\u00ed\0\1\u00ed"+
	  "\0\1\u00ed\0\1\u00ed\1\u00ed\1\u00ee\0\1\u00ee\0\1\u00ee\0\1\u00ee\0"+
	  "\1\u00ee\0\1\u00ee\0\1\u00ee\0\1\u00ee\0\3\u00ee\b\u00ee\1\u00ef\0\1"+
	  "\u00ef\0\1\u00ef\0\1\u00ef\0\1\u00ef\0\1\u00ef\0\1\u00ef\0\1\u00ef\0"+
	  "\1\u00ef\0\1\u00ef\1\u00ef\1\u00f0\0\1\u00f0\0\1\u00f0\0\1\u00f0\0\1"+
	  "\u00f0\0\1\u00f0\0\1\u00f0\0\1\u00f0\0\1\u00f0\0\1\u00f0\0\1\u00f0\0"+
	  "\1\u00f0\0\1\u00f0\0\1\u00f0\0\1\u00f0\0\1\u00f0\0\3\u00f0\b\u00f0\1"+
	  "\u00f1\0\1\u00f1\0\1\u00f1\0\1\u00f1\0\1\u00f1\0\1\u00f1\0\1\u00f1\1"+
	  "\u00f1\1\u00f1\0\1\u00f1\0\1\u00f1\0\1\u00f1\0\1\u00f1\0\1\u00f1\0\1"+
	  "\u00f1\1\u00f1\3\u00f1\b\u00f1\1\u00f2\0\1\u00f2\0\3\u00f2\b\u00f2\1"+
	  "\u00f3\0\3\u00f3\b\u00f3\1\u00f3\0\3\u00f3\b\u00f3\1\u00f3\0\1\u00f3"+
	  "\1\u00f3\1\u00f4\0\1\u00f4\0\5\u00f4\b\u00f4\n\u00f4\f\u00f4\u0de9\t"+
	  "\u00f4\1\u00f5\0\1\u00f5\0\1\u00f5\0\1\u00f5\0\1\u00f5\0\1\u00f5\0\3"+
	  "\u00f5\b\u00f5\1\u00f6\0\1\u00f6\0\1\u00f6\0\3\u00f6\b\u00f6\1\u00f6"+
	  "\0\1\u00f6\0\3\u00f6\b\u00f6\1\u00f7\0\1\u00f7\0\1\u00f7\0\1\u00f7\0"+
	  "\3\u00f7\b\u00f7\1\u00f7\0\1\u00f7\0\1\u00f7\0\1\u00f7\0\1\u00f7\0\3"+
	  "\u00f7\b\u00f7\1\u00f7\0\3\u00f7\b\u00f7\1\u00f8\0\1\u00f8\0\3\u00f8"+
	  "\b\u00f8\1\u00f9\0\3\u00f9\b\u00f9\1\u00f9\0\1\u00f9\0\1\u00f9\0\1\u00f9"+
	  "\0\1\u00f9\1\u00f9\1\u00fa\0\3\u00fa\b\u00fa\1\u00fa\0\1\u00fa\0\1\u00fa"+
	  "\0\3\u00fa\b\u00fa\1\u00fa\0\3\u00fa\b\u00fa\1\u00fb\0\1\u00fb\0\3\u00fb"+
	  "\b\u00fb\1\u00fc\0\3\u00fc\b\u00fc\1\u00fc\0\3\u00fc\b\u00fc\1\u00fc"+
	  "\0\1\u00fc\0\1\u00fc\0\1\u00fc\0\1\u00fc\0\1\u00fc\0\3\u00fc\b\u00fc"+
	  "\1\u00fd\0\1\u00fd\0\3\u00fd\b\u00fd\1\u00fe\0\3\u00fe\b\u00fe\1\u00fe"+
	  "\0\3\u00fe\b\u00fe\1\u00fe\0\3\u00fe\b\u00fe\1\u00fe\0\1\u00fe\0\1\u00fe"+
	  "\0\3\u00fe\b\u00fe\1\u00fe\0\3\u00fe\b\u00fe\1\u00fe\0\3\u00fe\b\u00fe"+
	  "\1\u00fe\0\1\u00fe\0\3\u00fe\b\u00fe\1\u00ff\0\1\u00ff\0\5\u00ff\b\u00ff"+
	  "\n\u00ff\f\u00ff\u0e90\t\u00ff\1\u0100\0\1\u0100\0\1\u0100\0\1\u0100"+
	  "\0\1\u0100\0\1\u0100\0\3\u0100\b\u0100\1\u0101\0\1\u0101\1\u0101\1\u0102"+
	  "\0\1\u0102\0\3\u0102\b\u0102\1\u0102\1\u0102\1\u0103\0\1\u0103\0\5\u0103"+
	  "\b\u0103\n\u0103\f\u0103\u0eb3\t\u0103\1\u0104\0\1\u0104\0\1\u0104\0"+
	  "\1\u0104\0\1\u0104\0\1\u0104\0\1\u0104\0\1\u0104\0\1\u0104\0\1\u0104"+
	  "\0\1\u0104\0\3\u0104\b\u0104\1\u0105\0\1\u0105\0\1\u0105\0\1\u0105\0"+
	  "\1\u0105\0\1\u0105\0\1\u0105\0\1\u0105\0\1\u0105\0\3\u0105\b\u0105\1"+
	  "\u0105\0\5\u0105\b\u0105\n\u0105\f\u0105\u0ee6\t\u0105\1\u0105\0\4\u0105"+
	  "\b\u0105\13\u0105\f\u0105\u0eeb\1\u0106\0\1\u0106\0\1\u0106\0\1\u0106"+
	  "\0\1\u0106\0\1\u0106\0\1\u0106\0\1\u0106\0\1\u0106\0\3\u0106\b\u0106"+
	  "\1\u0106\0\1\u0106\0\1\u0106\0\5\u0106\b\u0106\n\u0106\f\u0106\u0f0b"+
	  "\t\u0106\1\u0107\0\4\u0107\b\u0107\13\u0107\f\u0107\u0f10\1\u0108\0\1"+
	  "\u0108\0\3\u0108\b\u0108\1\u0108\1\u0108\1\u0109\0\1\u0109\0\5\u0109"+
	  "\b\u0109\n\u0109\f\u0109\u0f22\t\u0109\1\u010a\0\1\u010a\0\3\u010a\b"+
	  "\u010a\1\u010a\0\1\u010a\0\1\u010a\0\1\u010a\0\1\u010a\1\u010a\3\u010a"+
	  "\b\u010a\1\u010b\0\1\u010b\0\1\u010b\0\5\u010b\b\u010b\n\u010b\f\u010b"+
	  "\u0f3f\t\u010b\1\u010c\0\3\u010c\b\u010c\1\u010c\0\3\u010c\b\u010c\1"+
	  "\u010c\0\3\u010c\b\u010c\1\u010c\0\1\u010c\0\1\u010c\0\3\u010c\b\u010c"+
	  "\1\u010c\0\3\u010c\b\u010c\1\u010c\0\3\u010c\b\u010c\1\u010c\0\1\u010c"+
	  "\0\3\u010c\b\u010c\1\u010d\0\1\u010d\0\5\u010d\b\u010d\n\u010d\f\u010d"+
	  "\u0f6a\t\u010d\1\u010e\0\1\u010e\0\1\u010e\0\1\u010e\0\1\u010e\0\1\u010e"+
	  "\0\3\u010e\b\u010e\1\u010f\0\1\u010f\0\1\u010f\1\u010f\1\u0110\0\3\u0110"+
	  "\b\u0110\1\u0110\0\3\u0110\b\u0110\1\u0110\0\1\u0110\0\1\u0110\0\3\u0110"+
	  "\b\u0110\1\u0110\0\3\u0110\b\u0110\1\u0110\0\5\u0110\b\u0110\n\u0110"+
	  "\f\u0110\u0f99\t\u0110\1\u0111\0\1\u0111\0\3\u0111\b\u0111\1\u0112\0"+
	  "\1\u0112\1\u0112\1\u0113\0\1\u0113\0\3\u0113\b\u0113\1\u0113\1\u0113"+
	  "\1\u0114\0\1\u0114\0\5\u0114\b\u0114\n\u0114\f\u0114\u0fb4\t\u0114\1"+
	  "\u0115\0\1\u0115\0\1\u0115\0\1\u0115\0\3\u0115\b\u0115\1\u0116\0\3\u0116"+
	  "\b\u0116\1\u0116\0\3\u0116\b\u0116\1\u0116\0\1\u0116\0\1\u0116\0\1\u0116"+
	  "\0\1\u0116\0\3\u0116\b\u0116\1\u0116\0\1\u0116\0\3\u0116\b\u0116\1\u0116"+
	  "\1\u0116\1\u0117\0\3\u0117\b\u0117\1\u0117\0\3\u0117\b\u0117\1\u0117"+
	  "\0\1\u0117\0\1\u0117\0\1\u0117\0\1\u0117\1\u0117\1\u0118\0\3\u0118\b"+
	  "\u0118\1\u0118\0\1\u0118\0\1\u0118\0\3\u0118\b\u0118\1\u0118\0\1\u0118"+
	  "\0\1\u0118\0\3\u0118\b\u0118\1\u0118\0\1\u0118\0\1\u0118\0\3\u0118\b"+
	  "\u0118\1\u0118\0\1\u0118\0\1\u0118\0\3\u0118\b\u0118\1\u0118\0\1\u0118"+
	  "\0\1\u0118\0\3\u0118\b\u0118\1\u0118\0\1\u0118\0\3\u0118\b\u0118\1\u0119"+
	  "\0\3\u0119\b\u0119\1\u0119\0\3\u0119\b\u0119\1\u0119\0\1\u0119\0\1\u0119"+
	  "\0\1\u0119\1\u0119\1\u011a\0\3\u011a\b\u011a\1\u011a\0\3\u011a\b\u011a"+
	  "\1\u011a\0\1\u011a\0\1\u011a\0\1\u011a\0\1\u011a\0\1\u011a\0\1\u011a"+
	  "\0\1\u011a\1\u011a\1\u011b\0\3\u011b\b\u011b\1\u011b\0\3\u011b\b\u011b"+
	  "\1\u011b\0\1\u011b\0\1\u011b\0\3\u011b\b\u011b\1\u011b\0\1\u011b\0\3"+
	  "\u011b\b\u011b\1\u011c\0\1\u011c\1\u011c\1\u011d\0\1\u011d\0\3\u011d"+
	  "\b\u011d\1\u011d\0\1\u011d\0\1\u011d\0\1\u011d\0\1\u011d\1\u011d\3\u011d"+
	  "\b\u011d\1\u011e\0\1\u011e\0\5\u011e\b\u011e\n\u011e\f\u011e\u107b\t"+
	  "\u011e\1\u011f\0\1\u011f\0\1\u011f\0\1\u011f\0\1\u011f\0\3\u011f\b\u011f"+
	  "\1\u0120\0\1\u0120\0\1\u0120\0\5\u0120\b\u0120\n\u0120\f\u0120\u1092"+
	  "\t\u0120\1\u0121\0\3\u0121\b\u0121\1\u0121\0\1\u0121\0\3\u0121\b\u0121"+
	  "\1\u0121\0\1\u0121\0\1\u0121\0\3\u0121\b\u0121\1\u0122\0\3\u0122\b\u0122"+
	  "\1\u0122\0\3\u0122\b\u0122\1\u0122\0\1\u0122\0\1\u0122\0\1\u0122\0\3"+
	  "\u0122\b\u0122\1\u0122\0\1\u0122\0\3\u0122\b\u0122\1\u0122\0\1\u0122"+
	  "\0\3\u0122\b\u0122\1\u0122\1\u0122\1\u0123\0\1\u0123\0\5\u0123\b\u0123"+
	  "\n\u0123\f\u0123\u10cd\t\u0123\1\u0124\0\1\u0124\0\1\u0124\0\1\u0124"+
	  "\0\1\u0124\0\1\u0124\0\3\u0124\b\u0124\1\u0125\1\u0125\1\u0126\0\1\u0126"+
	  "\0\5\u0126\b\u0126\n\u0126\f\u0126\u10e6\t\u0126\1\u0127\0\1\u0127\0"+
	  "\1\u0127\0\1\u0127\1\u0127\1\u0127\0\1\u0127\0\1\u0127\0\1\u0127\0\1"+
	  "\u0127\1\u0127\3\u0127\b\u0127\1\u0128\0\1\u0128\1\u0128\1\u0129\0\1"+
	  "\u0129\0\3\u0129\b\u0129\1\u012a\1\u012a\1\u012b\0\1\u012b\0\5\u012b"+
	  "\b\u012b\n\u012b\f\u012b\u110f\t\u012b\1\u012c\0\1\u012c\0\3\u012c\b"+
	  "\u012c\1\u012c\0\1\u012c\1\u012c\1\u012c\0\1\u012c\0\3\u012c\b\u012c"+
	  "\1\u012c\0\1\u012c\0\1\u012c\1\u012c\3\u012c\b\u012c\1\u012d\0\1\u012d"+
	  "\1\u012d\1\u012e\0\1\u012e\0\1\u012e\0\1\u012e\0\1\u012e\0\1\u012e\0"+
	  "\1\u012e\0\3\u012e\b\u012e\1\u012f\0\1\u012f\0\1\u012f\0\5\u012f\b\u012f"+
	  "\n\u012f\f\u012f\u1146\t\u012f\1\u0130\0\1\u0130\0\3\u0130\b\u0130\1"+
	  "\u0131\1\u0131\1\u0132\0\1\u0132\0\3\u0132\b\u0132\1\u0132\0\1\u0132"+
	  "\0\1\u0132\0\1\u0132\0\1\u0132\0\1\u0132\1\u0132\1\u0132\0\1\u0132\0"+
	  "\1\u0132\1\u0132\3\u0132\b\u0132\1\u0133\0\1\u0133\0\1\u0133\0\5\u0133"+
	  "\b\u0133\n\u0133\f\u0133\u1173\t\u0133\1\u0134\1\u0134\1\u0135\0\1\u0135"+
	  "\0\1\u0135\0\5\u0135\b\u0135\n\u0135\f\u0135\u1180\t\u0135\1\u0136\0"+
	  "\1\u0136\0\1\u0136\1\u0136\1\u0137\1\u0137\1\u0138\1\u0138\1\u0139\1"+
	  "\u0139\1\u013a\1\u013a\1\u013b\1\u013b\1\u013c\1\u013c\1\u013d\1\u013d"+
	  "\1\u013e\1\u013e\1\u013f\1\u013f\1\u0140\1\u0140\1\u0141\1\u0141\1\u0142"+
	  "\1\u0142\1\u0143\0\3\u0143\b\u0143\1\u0143\0\3\u0143\b\u0143\1\u0143"+
	  "\0\3\u0143\b\u0143\1\u0143\0\1\u0143\0\1\u0143\0\1\u0143\0\1\u0143\0"+
	  "\1\u0143\0\3\u0143\b\u0143\1\u0143\0\3\u0143\b\u0143\1\u0143\0\3\u0143"+
	  "\b\u0143\1\u0143\0\1\u0143\0\1\u0143\0\1\u0143\0\1\u0143\0\3\u0143\b"+
	  "\u0143\1\u0144\0\3\u0144\b\u0144\1\u0144\0\3\u0144\b\u0144\1\u0144\0"+
	  "\1\u0144\0\3\u0144\b\u0144\1\u0144\0\3\u0144\b\u0144\1\u0144\0\1\u0144"+
	  "\0\3\u0144\b\u0144\1\u0144\0\1\u0144\0\3\u0144\b\u0144\1\u0144\0\3\u0144"+
	  "\b\u0144\1\u0144\0\1\u0144\0\3\u0144\b\u0144\1\u0144\0\1\u0144\0\3\u0144"+
	  "\b\u0144\1\u0144\0\3\u0144\b\u0144\1\u0144\0\1\u0144\0\3\u0144\b\u0144"+
	  "\1\u0144\0\3\u0144\b\u0144\3\u0144\b\u0144\1\u0145\0\1\u0145\0\3\u0145"+
	  "\b\u0145\1\u0146\0\1\u0146\1\u0146\1\u0147\1\u0147\1\u0148\0\1\u0148"+
	  "\0\1\u0148\0\5\u0148\b\u0148\n\u0148\f\u0148\u1221\t\u0148\1\u0148\1"+
	  "\u0148\1\u0148\0\1\u0148\0\1\u0148\0\5\u0148\b\u0148\n\u0148\f\u0148"+
	  "\u122e\t\u0148\1\u0148\1\u0148\1\u0148\0\1\u0148\0\1\u0148\0\5\u0148"+
	  "\b\u0148\n\u0148\f\u0148\u123b\t\u0148\1\u0148\1\u0148\1\u0148\0\1\u0148"+
	  "\0\1\u0148\0\5\u0148\b\u0148\n\u0148\f\u0148\u1248\t\u0148\1\u0148\1"+
	  "\u0148\1\u0148\0\1\u0148\0\1\u0148\0\5\u0148\b\u0148\n\u0148\f\u0148"+
	  "\u1255\t\u0148\1\u0148\1\u0148\1\u0148\0\1\u0148\0\1\u0148\0\5\u0148"+
	  "\b\u0148\n\u0148\f\u0148\u1262\t\u0148\1\u0148\1\u0148\1\u0148\0\1\u0148"+
	  "\0\1\u0148\0\5\u0148\b\u0148\n\u0148\f\u0148\u126f\t\u0148\1\u0148\1"+
	  "\u0148\1\u0148\0\1\u0148\0\3\u0148\b\u0148\1\u0148\0\1\u0148\0\1\u0148"+
	  "\0\5\u0148\b\u0148\n\u0148\f\u0148\u1282\t\u0148\1\u0148\0\5\u0148\b"+
	  "\u0148\n\u0148\f\u0148\u1289\t\u0148\1\u0149\0\1\u0149\0\1\u0149\0\1"+
	  "\u0149\0\1\u0149\0\1\u0149\0\1\u0149\0\1\u0149\0\1\u0149\0\3\u0149\b"+
	  "\u0149\1\u0149\0\1\u0149\0\1\u0149\0\5\u0149\b\u0149\n\u0149\f\u0149"+
	  "\u12a8\t\u0149\1\u014a\0\1\u014a\0\1\u014a\0\3\u014a\b\u014a\1\u014b"+
	  "\0\1\u014b\0\3\u014b\b\u014b\1\u014c\0\1\u014c\1\u014c\1\u014d\0\1\u014d"+
	  "\0\1\u014d\1\u014d\1\u014e\0\1\u014e\0\1\u014e\0\1\u014e\1\u014e\1\u014f"+
	  "\0\1\u014f\1\u014f\1\u0150\0\1\u0150\0\1\u0150\0\1\u0150\1\u0150\1\u0151"+
	  "\0\1\u0151\0\1\u0151\0\1\u0151\0\1\u0151\0\1\u0151\1\u0151\1\u0152\0"+
	  "\1\u0152\0\1\u0152\0\5\u0152\b\u0152\n\u0152\f\u0152\u12eb\t\u0152\1"+
	  "\u0153\0\1\u0153\0\1\u0153\1\u0153\1\u0154\0\1\u0154\0\1\u0154\0\3\u0154"+
	  "\b\u0154\1\u0155\1\u0155\1\u0156\0\3\u0156\b\u0156\1\u0156\0\3\u0156"+
	  "\b\u0156\1\u0156\0\1\u0156\0\1\u0156\0\1\u0156\1\u0156\1\u0157\0\1\u0157"+
	  "\0\1\u0157\1\u0157\3\u0157\b\u0157\1\u0158\0\1\u0158\0\1\u0158\0\1\u0158"+
	  "\0\1\u0158\0\1\u0158\0\3\u0158\b\u0158\1\u0159\1\u0159\1\u015a\0\1\u015a"+
	  "\0\1\u015a\1\u015a\3\u015a\b\u015a\1\u015b\0\1\u015b\0\1\u015b\0\1\u015b"+
	  "\1\u015b\1\u015c\1\u015c\1\u015d\0\1\u015d\0\1\u015d\0\1\u015d\0\1\u015d"+
	  "\1\u015d\1\u015e\0\1\u015e\0\1\u015e\0\1\u015e\0\1\u015e\0\1\u015e\0"+
	  "\1\u015e\0\3\u015e\b\u015e\1\u015e\u015f\0\2\4\6\b\n\f\16\20\22\24\26"+
	  "\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz"+
	  "|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
	  "\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
	  "\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
	  "\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
	  "\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
	  "\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
	  "\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
	  "\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
	  "\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
	  "\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c"+
	  "\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184"+
	  "\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c"+
	  "\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4"+
	  "\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc"+
	  "\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4"+
	  "\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc"+
	  "\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\u020e\u0210\u0212\u0214"+
	  "\u0216\u0218\u021a\u021c\u021e\u0220\u0222\u0224\u0226\u0228\u022a\u022c"+
	  "\u022e\u0230\u0232\u0234\u0236\u0238\u023a\u023c\u023e\u0240\u0242\u0244"+
	  "\u0246\u0248\u024a\u024c\u024e\u0250\u0252\u0254\u0256\u0258\u025a\u025c"+
	  "\u025e\u0260\u0262\u0264\u0266\u0268\u026a\u026c\u026e\u0270\u0272\u0274"+
	  "\u0276\u0278\u027a\u027c\u027e\u0280\u0282\u0284\u0286\u0288\u028a\u028c"+
	  "\u028e\u0290\u0292\u0294\u0296\u0298\u029a\u029c\u029e\u02a0\u02a2\u02a4"+
	  "\u02a6\u02a8\u02aa\u02ac\u02ae\u02b0\u02b2\u02b4\u02b6\u02b8\u02ba\u02bc"+
	  "\0\1\1\u00a8\u00a9\u1253\0\u02be\1\0\0\0\1\u09ea\1\0\0\0\2\u02c0\1\0"+
	  "\0\0\3\u02ec\1\0\0\0\3\u0305\1\0\0\0\3\u0335\1\0\0\0\3\u0349\1\0\0\0"+
	  "\3\u034b\1\0\0\0\3\u034d\1\0\0\0\3\u0edf\1\0\0\0\3\u0f00\1\0\0\0\3\u114e"+
	  "\1\0\0\0\3\u121f\1\0\0\0\3\u129d\1\0\0\0\4\u02ca\1\0\0\0\5\u02bf\1\0"+
	  "\0\0\5\u02c1\1\0\0\0\5\u09e4\1\0\0\0\6\u02eb\1\0\0\0\7\u0333\1\0\0\0"+
	  "\7\u0360\1\0\0\0\7\u0486\1\0\0\0\7\u0496\1\0\0\0\7\u054d\1\0\0\0\7\u05a1"+
	  "\1\0\0\0\7\u05cb\1\0\0\0\7\u061b\1\0\0\0\7\u061b\1\0\0\0\7\u06aa\1\0"+
	  "\0\0\7\u06da\1\0\0\0\7\u0713\1\0\0\0\7\u0727\1\0\0\0\7\u07ed\1\0\0\0"+
	  "\7\u080f\1\0\0\0\7\u0b10\1\0\0\0\7\u0b41\1\0\0\0\7\u0bc9\1\0\0\0\7\u0bfb"+
	  "\1\0\0\0\7\u0c21\1\0\0\0\7\u0c94\1\0\0\0\7\u0ca4\1\0\0\0\7\u0d1e\1\0"+
	  "\0\0\7\u0d28\1\0\0\0\7\u0d5d\1\0\0\0\7\u0d65\1\0\0\0\7\u0d7d\1\0\0\0"+
	  "\7\u0d85\1\0\0\0\7\u0d8b\1\0\0\0\7\u0db7\1\0\0\0\7\u0dbb\1\0\0\0\7\u0dc5"+
	  "\1\0\0\0\7\u0dc9\1\0\0\0\7\u0fe5\1\0\0\0\7\u102b\1\0\0\0\7\u1039\1\0"+
	  "\0\0\7\u1323\1\0\0\0\b\u02fc\1\0\0\0\t\u1350\5\uffff\0\0\n\u0304\1\0"+
	  "\0\0\13\u02fd\1\0\0\0\f\u030a\1\0\0\0\r\u02ec\1\0\0\0\r\u0305\1\0\0\0"+
	  "\r\u0edf\1\0\0\0\r\u0f00\1\0\0\0\r\u122c\1\0\0\0\r\u129d\1\0\0\0\16\u0312"+
	  "\1\0\0\0\17\u030b\1\0\0\0\20\u0326\1\0\0\0\21\u0313\1\0\0\0\21\u1060"+
	  "\1\0\0\0\22\u032c\1\0\0\0\23\u0313\1\0\0\0\24\u032e\1\0\0\0\25\u0305"+
	  "\1\0\0\0\26\u0332\1\0\0\0\27\u0330\1\0\0\0\30\u0334\1\0\0\0\31\u02ec"+
	  "\1\0\0\0\31\u02fd\1\0\0\0\31\u0edf\1\0\0\0\31\u0f00\1\0\0\0\31\u1239"+
	  "\1\0\0\0\31\u129d\1\0\0\0\32\u033e\1\0\0\0\33\u1350\5\uffff\0\0\34\u0348"+
	  "\1\0\0\0\35\u02ec\1\0\0\0\35\u033f\1\0\0\0\35\u0947\1\0\0\0\35\u0a7c"+
	  "\1\0\0\0\35\u0a77\1\0\0\0\35\u0ac4\1\0\0\0\35\u0edf\1\0\0\0\35\u0f00"+
	  "\1\0\0\0\35\u1246\1\0\0\0\35\u129d\1\0\0\0\36\u034a\1\0\0\0\37\u02ec"+
	  "\1\0\0\0\37\u033f\1\0\0\0\37\u0a85\1\0\0\0\37\u0a84\1\0\0\0\37\u0aca"+
	  "\1\0\0\0\37\u0ad2\1\0\0\0\37\u0bce\1\0\0\0\37\u0d2a\1\0\0\0\37\u0edf"+
	  "\1\0\0\0\37\u0f00\1\0\0\0\37\u1253\1\0\0\0\37\u129d\1\0\0\0 \u034c\1"+
	  "\0\0\0!\u02ec\1\0\0\0!\u033f\1\0\0\0!\u0512\1\0\0\0!\u0edf\1\0\0\0!\u0f00"+
	  "\1\0\0\0!\u1260\1\0\0\0!\u129d\1\0\0\0\"\u034e\1\0\0\0#\u02c7\1\0\0\0"+
	  "#\u02d3\1\0\0\0#\u0399\1\0\0\0#\u03a3\1\0\0\0#\u03e1\1\0\0\0#\u0408\1"+
	  "\0\0\0#\u0418\1\0\0\0#\u0422\1\0\0\0#\u0a10\1\0\0\0$\u0354\1\0\0\0%\u0352"+
	  "\1\0\0\0&\u035f\1\0\0\0\'\u035c\1\0\0\0\'\u035b\1\0\0\0(\u0361\1\0\0"+
	  "\0)\u0383\1\0\0\0)\u0383\1\0\0\0)\u12f9\1\0\0\0*\u0363\1\0\0\0+\u03b1"+
	  "\1\0\0\0+\u03e7\1\0\0\0+\u0452\1\0\0\0+\u048b\1\0\0\0+\u0e0f\1\0\0\0"+
	  "+\u0e1b\1\0\0\0,\u0370\1\0\0\0-\u036b\1\0\0\0-\u036a\1\0\0\0.\u0374\1"+
	  "\0\0\0/\u0371\1\0\0\0\60\u0382\1\0\0\0\61\u0373\1\0\0\0\62\u0388\1\0"+
	  "\0\0\63\u0411\1\0\0\0\63\u044d\1\0\0\0\63\u047c\1\0\0\0\63\u0480\1\0"+
	  "\0\0\63\u05be\1\0\0\0\63\u12bd\1\0\0\0\64\u03d8\1\0\0\0\65\u0389\1\0"+
	  "\0\0\65\u0457\1\0\0\0\65\u12c3\1\0\0\0\66\u0403\1\0\0\0\67\u03d9\1\0"+
	  "\0\0\67\u0546\1\0\0\08\u0409\1\0\0\09\u03d9\1\0\0\0:\u0429\1\0\0\0;\u0546"+
	  "\1\0\0\0<\u0449\1\0\0\0=\u039c\1\0\0\0=\u041b\1\0\0\0>\u044b\1\0\0\0"+
	  "?\u0824\1\0\0\0@\u0455\1\0\0\0A\u1350\5\uffff\0\0B\u045d\1\0\0\0C\u03ee"+
	  "\1\0\0\0C\u045b\1\0\0\0C\u0476\1\0\0\0C\u04ea\1\0\0\0C\u04f6\1\0\0\0"+
	  "D\u0468\1\0\0\0E\u03d9\1\0\0\0F\u0478\1\0\0\0G\u03d9\1\0\0\0G\u0546\1"+
	  "\0\0\0H\u047a\1\0\0\0I\u0824\1\0\0\0J\u047e\1\0\0\0K\u0824\1\0\0\0L\u0498"+
	  "\1\0\0\0M\u03d9\1\0\0\0M\u0824\1\0\0\0N\u049e\1\0\0\0O\u0491\1\0\0\0"+
	  "O\u0497\1\0\0\0O\u04c8\1\0\0\0P\u04b0\1\0\0\0Q\u049f\1\0\0\0R\u04b2\1"+
	  "\0\0\0S\u04a5\1\0\0\0S\u04ac\1\0\0\0T\u04bd\1\0\0\0U\u04ba\1\0\0\0U\u04b9"+
	  "\1\0\0\0V\u04c7\1\0\0\0W\u04c2\1\0\0\0X\u04d7\1\0\0\0Y\u049f\1\0\0\0"+
	  "Z\u04d9\1\0\0\0[\u04cd\1\0\0\0[\u04d3\1\0\0\0\\\u04ec\1\0\0\0]\u04e1"+
	  "\1\0\0\0]\u04e0\1\0\0\0^\u050c\1\0\0\0_\u0389\1\0\0\0_\u0392\1\0\0\0"+
	  "_\u03ac\1\0\0\0_\u03ba\1\0\0\0_\u03be\1\0\0\0_\u03d2\1\0\0\0`\u050e\1"+
	  "\0\0\0a\u03d9\1\0\0\0b\u0518\1\0\0\0c\u03d9\1\0\0\0d\u052c\1\0\0\0e\u051b"+
	  "\1\0\0\0f\u052e\1\0\0\0g\u0521\1\0\0\0g\u0528\1\0\0\0h\u0545\1\0\0\0"+
	  "i\u0536\1\0\0\0i\u0535\1\0\0\0j\u055f\1\0\0\0k\u03d9\1\0\0\0l\u0565\1"+
	  "\0\0\0m\u0555\1\0\0\0n\u057a\1\0\0\0o\u056c\1\0\0\0o\u0574\1\0\0\0p\u0582"+
	  "\1\0\0\0q\u057f\1\0\0\0r\u058b\1\0\0\0s\u03d9\1\0\0\0t\u0593\1\0\0\0"+
	  "u\u03d9\1\0\0\0v\u059b\1\0\0\0w\u03d9\1\0\0\0x\u05bd\1\0\0\0y\u05be\1"+
	  "\0\0\0y\u05be\1\0\0\0y\u05be\1\0\0\0y\u05be\1\0\0\0y\u05c2\1\0\0\0y\u05c6"+
	  "\1\0\0\0y\u05ce\1\0\0\0y\u05df\1\0\0\0y\u05de\1\0\0\0y\u05de\1\0\0\0"+
	  "y\u05de\1\0\0\0y\u076f\1\0\0\0y\u12ba\1\0\0\0y\u12cc\1\0\0\0z\u05bf\1"+
	  "\0\0\0{\u05be\1\0\0\0{\u0824\1\0\0\0|\u05c3\1\0\0\0}\u05be\1\0\0\0}\u0824"+
	  "\1\0\0\0~\u05c7\1\0\0\0\177\u05be\1\0\0\0\u0080\u05cf\1\0\0\0\u0081\u05ee"+
	  "\1\0\0\0\u0081\u05ed\1\0\0\0\u0081\u05ed\1\0\0\0\u0082\u05e2\1\0\0\0"+
	  "\u0083\u05fd\1\0\0\0\u0083\u05fc\1\0\0\0\u0083\u05fc\1\0\0\0\u0084\u05f1"+
	  "\1\0\0\0\u0085\u061c\1\0\0\0\u0085\u061b\1\0\0\0\u0085\u061b\1\0\0\0"+
	  "\u0085\u061b\1\0\0\0\u0085\u061b\1\0\0\0\u0086\u0600\1\0\0\0\u0087\u062b"+
	  "\1\0\0\0\u0087\u062a\1\0\0\0\u0087\u062a\1\0\0\0\u0088\u061f\1\0\0\0"+
	  "\u0089\u0636\1\0\0\0\u0089\u0635\1\0\0\0\u008a\u062e\1\0\0\0\u008b\u0641"+
	  "\1\0\0\0\u008b\u0640\1\0\0\0\u008c\u0639\1\0\0\0\u008d\u064c\1\0\0\0"+
	  "\u008d\u064b\1\0\0\0\u008e\u0644\1\0\0\0\u008f\u0657\1\0\0\0\u008f\u0656"+
	  "\1\0\0\0\u0090\u064f\1\0\0\0\u0091\u0662\1\0\0\0\u0091\u0661\1\0\0\0"+
	  "\u0092\u065a\1\0\0\0\u0093\u066e\1\0\0\0\u0093\u0669\1\0\0\0\u0094\u066d"+
	  "\1\0\0\0\u0095\u066c\1\0\0\0\u0095\u067c\1\0\0\0\u0095\u0673\1\0\0\0"+
	  "\u0096\u067b\1\0\0\0\u0097\u0798\1\0\0\0\u0098\u067d\1\0\0\0\u0099\u0798"+
	  "\1\0\0\0\u009a\u0683\1\0\0\0\u009b\u03d9\1\0\0\0\u009c\u068f\1\0\0\0"+
	  "\u009d\u067f\1\0\0\0\u009e\u0691\1\0\0\0\u009f\u0688\1\0\0\0\u009f\u0690"+
	  "\1\0\0\0\u00a0\u0699\1\0\0\0\u00a1\u0696\1\0\0\0\u00a2\u06a6\1\0\0\0"+
	  "\u00a3\u06a1\1\0\0\0\u00a3\u06a0\1\0\0\0\u00a4\u06b0\1\0\0\0\u00a5\u06a7"+
	  "\1\0\0\0\u00a6\u06bc\1\0\0\0\u00a7\u0690\1\0\0\0\u00a8\u06be\1\0\0\0"+
	  "\u00a9\u06b7\1\0\0\0\u00aa\u06c9\1\0\0\0\u00ab\u06bd\1\0\0\0\u00ab\u06c6"+
	  "\1\0\0\0\u00ab\u06c5\1\0\0\0\u00ac\u06cf\1\0\0\0\u00ad\u0682\1\0\0\0"+
	  "\u00ae\u06d1\1\0\0\0\u00af\u0798\1\0\0\0\u00b0\u06d5\1\0\0\0\u00b1\u06d3"+
	  "\1\0\0\0\u00b1\u0701\1\0\0\0\u00b2\u06e3\1\0\0\0\u00b3\u06d4\1\0\0\0"+
	  "\u00b3\u076c\1\0\0\0\u00b4\u06eb\1\0\0\0\u00b5\u06e4\1\0\0\0\u00b6\u0700"+
	  "\1\0\0\0\u00b7\u06f1\1\0\0\0\u00b7\u06f0\1\0\0\0\u00b8\u0702\1\0\0\0"+
	  "\u00b9\u0701\1\0\0\0\u00ba\u070a\1\0\0\0\u00bb\u0701\1\0\0\0\u00bc\u070e"+
	  "\1\0\0\0\u00bd\u0701\1\0\0\0\u00be\u0722\1\0\0\0\u00bf\u0701\1\0\0\0"+
	  "\u00c0\u073a\1\0\0\0\u00c1\u0701\1\0\0\0\u00c2\u073e\1\0\0\0\u00c3\u073d"+
	  "\1\0\0\0\u00c4\u0749\1\0\0\0\u00c5\u0746\1\0\0\0\u00c5\u0745\1\0\0\0"+
	  "\u00c6\u0753\1\0\0\0\u00c7\u074e\1\0\0\0\u00c8\u0759\1\0\0\0\u00c9\u06e9"+
	  "\1\0\0\0\u00ca\u075b\1\0\0\0\u00cb\u075a\1\0\0\0\u00cc\u075f\1\0\0\0"+
	  "\u00cd\u075a\1\0\0\0\u00ce\u0767\1\0\0\0\u00cf\u06ea\1\0\0\0\u00d0\u076d"+
	  "\1\0\0\0\u00d1\u0790\1\0\0\0\u00d1\u0824\1\0\0\0\u00d2\u0789\1\0\0\0"+
	  "\u00d3\u0771\1\0\0\0\u00d4\u078f\1\0\0\0\u00d5\u0362\1\0\0\0\u00d5\u0383"+
	  "\1\0\0\0\u00d5\u03fc\1\0\0\0\u00d5\u040d\1\0\0\0\u00d5\u0465\1\0\0\0"+
	  "\u00d5\u0464\1\0\0\0\u00d5\u04c8\1\0\0\0\u00d5\u0516\1\0\0\0\u00d5\u0546"+
	  "\1\0\0\0\u00d5\u0591\1\0\0\0\u00d5\u0599\1\0\0\0\u00d5\u0677\1\0\0\0"+
	  "\u00d5\u067a\1\0\0\0\u00d5\u06d0\1\0\0\0\u00d5\u06e0\1\0\0\0\u00d5\u0709"+
	  "\1\0\0\0\u00d5\u071a\1\0\0\0\u00d5\u071e\1\0\0\0\u00d5\u0721\1\0\0\0"+
	  "\u00d5\u072e\1\0\0\0\u00d5\u0732\1\0\0\0\u00d5\u0736\1\0\0\0\u00d5\u074d"+
	  "\1\0\0\0\u00d5\u075e\1\0\0\0\u00d5\u0763\1\0\0\0\u00d5\u0766\1\0\0\0"+
	  "\u00d5\u0772\1\0\0\0\u00d5\u079a\1\0\0\0\u00d5\u079c\1\0\0\0\u00d5\u080a"+
	  "\1\0\0\0\u00d5\u084b\1\0\0\0\u00d5\u08d4\1\0\0\0\u00d5\u0907\1\0\0\0"+
	  "\u00d5\u090f\1\0\0\0\u00d5\u0963\1\0\0\0\u00d5\u0976\1\0\0\0\u00d5\u097d"+
	  "\1\0\0\0\u00d5\u0b7c\1\0\0\0\u00d5\u0c04\1\0\0\0\u00d5\u1188\1\0\0\0"+
	  "\u00d5\u12c7\1\0\0\0\u00d5\u12f9\1\0\0\0\u00d5\u133e\1\0\0\0\u00d6\u0797"+
	  "\1\0\0\0\u00d7\u04ed\1\0\0\0\u00d7\u0790\1\0\0\0\u00d8\u0799\1\0\0\0"+
	  "\u00d9\u0871\1\0\0\0\u00d9\u08f8\1\0\0\0\u00d9\u0b36\1\0\0\0\u00d9\u10a4"+
	  "\1\0\0\0\u00d9\u1332\1\0\0\0\u00da\u079b\1\0\0\0\u00db\u070d\1\0\0\0"+
	  "\u00db\u0831\1\0\0\0\u00db\u083b\1\0\0\0\u00db\u0889\1\0\0\0\u00db\u0897"+
	  "\1\0\0\0\u00db\u08ba\1\0\0\0\u00dc\u07a3\1\0\0\0\u00dd\u07cf\1\0\0\0"+
	  "\u00dd\u07ce\1\0\0\0\u00dd\u07d9\1\0\0\0\u00de\u07bf\1\0\0\0\u00df\u07a4"+
	  "\1\0\0\0\u00df\u0834\1\0\0\0\u00df\u083f\1\0\0\0\u00df\u0842\1\0\0\0"+
	  "\u00df\u088c\1\0\0\0\u00df\u0891\1\0\0\0\u00df\u08b2\1\0\0\0\u00df\u08d7"+
	  "\1\0\0\0\u00df\u0966\1\0\0\0\u00df\u0970\1\0\0\0\u00df\u12e0\1\0\0\0"+
	  "\u00e0\u07c1\1\0\0\0\u00e1\u068a\1\0\0\0\u00e1\u06d0\1\0\0\0\u00e1\u07c0"+
	  "\1\0\0\0\u00e1\u0916\1\0\0\0\u00e1\u091c\1\0\0\0\u00e1\u0922\1\0\0\0"+
	  "\u00e1\u094c\1\0\0\0\u00e1\u0950\1\0\0\0\u00e1\u0954\1\0\0\0\u00e1\u0958"+
	  "\1\0\0\0\u00e1\u095c\1\0\0\0\u00e1\u0bd9\1\0\0\0\u00e1\u0c87\1\0\0\0"+
	  "\u00e1\u0ce2\1\0\0\0\u00e1\u0cea\1\0\0\0\u00e1\u0dd4\1\0\0\0\u00e1\u0e25"+
	  "\1\0\0\0\u00e1\u0e49\1\0\0\0\u00e1\u0e65\1\0\0\0\u00e1\u1214\1\0\0\0"+
	  "\u00e2\u07c9\1\0\0\0\u00e3\u07c6\1\0\0\0\u00e3\u0863\1\0\0\0\u00e4\u07d2"+
	  "\1\0\0\0\u00e5\u07c0\1\0\0\0\u00e6\u07d4\1\0\0\0\u00e7\u07a4\1\0\0\0"+
	  "\u00e8\u07e2\1\0\0\0\u00e9\u07a4\1\0\0\0\u00ea\u07e4\1\0\0\0\u00eb\u07dc"+
	  "\1\0\0\0\u00eb\u08b8\1\0\0\0\u00eb\u0976\1\0\0\0\u00ec\u07ec\1\0\0\0"+
	  "\u00ed\u07e6\1\0\0\0\u00ed\u08ce\1\0\0\0\u00ee\u07ee\1\0\0\0\u00ef\u07e7"+
	  "\1\0\0\0\u00f0\u0801\1\0\0\0\u00f1\u07f6\1\0\0\0\u00f1\u07f5\1\0\0\0"+
	  "\u00f2\u0809\1\0\0\0\u00f3\u0802\1\0\0\0\u00f4\u080b\1\0\0\0\u00f5\u07e0"+
	  "\1\0\0\0\u00f6\u0811\1\0\0\0\u00f7\u07c0\1\0\0\0\u00f8\u0823\1\0\0\0"+
	  "\u00f9\u0813\1\0\0\0\u00f9\u08c5\1\0\0\0\u00f9\u08c4\1\0\0\0\u00fa\u0829"+
	  "\1\0\0\0\u00fb\u07c0\1\0\0\0\u00fc\u0843\1\0\0\0\u00fd\u082a\1\0\0\0"+
	  "\u00fe\u0845\1\0\0\0\u00ff\u082a\1\0\0\0\u0100\u084f\1\0\0\0\u0101\u084e"+
	  "\1\0\0\0\u0102\u0857\1\0\0\0\u0103\u0854\1\0\0\0\u0104\u0860\1\0\0\0"+
	  "\u0105\u085d\1\0\0\0\u0105\u085c\1\0\0\0\u0106\u0864\1\0\0\0\u0107\u0862"+
	  "\1\0\0\0\u0108\u0877\1\0\0\0\u0109\u086a\1\0\0\0\u0109\u0869\1\0\0\0"+
	  "\u010a\u0881\1\0\0\0\u010b\u07c0\1\0\0\0\u010c\u0883\1\0\0\0\u010d\u0882"+
	  "\1\0\0\0\u010e\u088d\1\0\0\0\u010f\u0882\1\0\0\0\u0110\u089b\1\0\0\0"+
	  "\u0111\u0882\1\0\0\0\u0112\u08b7\1\0\0\0\u0113\u08a2\1\0\0\0\u0114\u08b9"+
	  "\1\0\0\0\u0115\u08a8\1\0\0\0\u0116\u08bb\1\0\0\0\u0117\u08ae\1\0\0\0"+
	  "\u0118\u08bd\1\0\0\0\u0119\u08b8\1\0\0\0\u0119\u08bc\1\0\0\0\u011a\u08c8"+
	  "\1\0\0\0\u011b\u0882\1\0\0\0\u011c\u08e2\1\0\0\0\u011d\u07c0\1\0\0\0"+
	  "\u011e\u08e4\1\0\0\0\u011f\u08e3\1\0\0\0\u0120\u08e8\1\0\0\0\u0121\u08e3"+
	  "\1\0\0\0\u0122\u0900\1\0\0\0\u0123\u08e3\1\0\0\0\u0124\u0902\1\0\0\0"+
	  "\u0125\u08e3\1\0\0\0\u0126\u090a\1\0\0\0\u0127\u08e3\1\0\0\0\u0128\u0926"+
	  "\1\0\0\0\u0129\u07c0\1\0\0\0\u012a\u0934\1\0\0\0\u012b\u0917\1\0\0\0"+
	  "\u012b\u0924\1\0\0\0\u012c\u0936\1\0\0\0\u012d\u092c\1\0\0\0\u012d\u0931"+
	  "\1\0\0\0\u012e\u093f\1\0\0\0\u012f\u093c\1\0\0\0\u012f\u093b\1\0\0\0"+
	  "\u0130\u094d\1\0\0\0\u0131\u092d\1\0\0\0\u0131\u0935\1\0\0\0\u0132\u0951"+
	  "\1\0\0\0\u0133\u091d\1\0\0\0\u0133\u0925\1\0\0\0\u0134\u0955\1\0\0\0"+
	  "\u0135\u07c0\1\0\0\0\u0136\u0959\1\0\0\0\u0137\u07c0\1\0\0\0\u0138\u095d"+
	  "\1\0\0\0\u0139\u07c0\1\0\0\0\u013a\u0967\1\0\0\0\u013b\u07c0\1\0\0\0"+
	  "\u013c\u0975\1\0\0\0\u013d\u096d\1\0\0\0\u013e\u0985\1\0\0\0\u013f\u07c0"+
	  "\1\0\0\0\u0140\u0989\1\0\0\0\u0141\u1350\5\uffff\0\0\u0142\u0997\1\0"+
	  "\0\0\u0143\u09fa\1\0\0\0\u0144\u09a1\1\0\0\0\u0145\u099b\1\0\0\0\u0146"+
	  "\u09ac\1\0\0\0\u0147\u099f\1\0\0\0\u0148\u09bc\1\0\0\0\u0149\u098a\1"+
	  "\0\0\0\u0149\u09b1\1\0\0\0\u014a\u09c5\1\0\0\0\u014b\u09c2\1\0\0\0\u014b"+
	  "\u09c1\1\0\0\0\u014c\u09cd\1\0\0\0\u014d\u098e\1\0\0\0\u014d\u09b5\1"+
	  "\0\0\0\u014e\u09da\1\0\0\0\u014f\u09d3\1\0\0\0\u014f\u09d2\1\0\0\0\u0150"+
	  "\u09dc\1\0\0\0\u0151\u09db\1\0\0\0\u0152\u09e6\1\0\0\0\u0153\u09db\1"+
	  "\0\0\0\u0154\u09ec\1\0\0\0\u0155\u0996\1\0\0\0\u0155\u09b9\1\0\0\0\u0156"+
	  "\u09f9\1\0\0\0\u0157\u09f2\1\0\0\0\u0157\u09f1\1\0\0\0\u0158\u0a05\1"+
	  "\0\0\0\u0159\u09fa\1\0\0\0\u0159\u0b03\1\0\0\0\u0159\u0ecb\1\0\0\0\u015a"+
	  "\u0a07\1\0\0\0\u015b\u02cb\1\0\0\0\u015b\u03a6\1\0\0\0\u015b\u0425\1"+
	  "\0\0\0\u015c\u0a13\1\0\0\0\u015d\u0a06\1\0\0\0\u015e\u0a33\1\0\0\0\u015f"+
	  "\u0a18\1\0\0\0\u0160\u0a4e\1\0\0\0\u0161\u0a39\1\0\0\0\u0161\u0a38\1"+
	  "\0\0\0\u0162\u0a50\1\0\0\0\u0163\u0a24\1\0\0\0\u0163\u0b94\1\0\0\0\u0163"+
	  "\u0e79\1\0\0\0\u0163\u0fcd\1\0\0\0\u0163\u10b6\1\0\0\0\u0164\u0a58\1"+
	  "\0\0\0\u0165\u0a54\1\0\0\0\u0166\u0a69\1\0\0\0\u0167\u02ec\1\0\0\0\u0167"+
	  "\u0a66\1\0\0\0\u0167\u0a65\1\0\0\0\u0167\u0a95\1\0\0\0\u0167\u0aca\1"+
	  "\0\0\0\u0167\u0ad2\1\0\0\0\u0167\u0edf\1\0\0\0\u0167\u0f00\1\0\0\0\u0167"+
	  "\u0f97\1\0\0\0\u0167\u0f96\1\0\0\0\u0167\u126d\1\0\0\0\u0167\u129d\1"+
	  "\0\0\0\u0168\u0a7b\1\0\0\0\u0169\u0a28\1\0\0\0\u016a\u0a7d\1\0\0\0\u016b"+
	  "\u0a7c\1\0\0\0\u016b\u0a7a\1\0\0\0\u016b\u0ea2\1\0\0\0\u016b\u0fa3\1"+
	  "\0\0\0\u016c\u0a88\1\0\0\0\u016d\u0a2c\1\0\0\0\u016d\u0ba0\1\0\0\0\u016d"+
	  "\u0e81\1\0\0\0\u016d\u0f5b\1\0\0\0\u016d\u0fd8\1\0\0\0\u016d\u10c2\1"+
	  "\0\0\0\u016e\u0a91\1\0\0\0\u016f\u0a8e\1\0\0\0\u016f\u0a8d\1\0\0\0\u0170"+
	  "\u0abb\1\0\0\0\u0171\u0a98\1\0\0\0\u0172\u0ac3\1\0\0\0\u0173\u0abc\1"+
	  "\0\0\0\u0173\u0aa1\1\0\0\0\u0173\u0aa7\1\0\0\0\u0173\u0ab3\1\0\0\0\u0174"+
	  "\u0ac9\1\0\0\0\u0175\u0abc\1\0\0\0\u0175\u0aa4\1\0\0\0\u0175\u0aad\1"+
	  "\0\0\0\u0175\u0ab7\1\0\0\0\u0176\u0ad8\1\0\0\0\u0177\u0abc\1\0\0\0\u0177"+
	  "\u0aaa\1\0\0\0\u0177\u0ab0\1\0\0\0\u0177\u0aba\1\0\0\0\u0178\u0ade\1"+
	  "\0\0\0\u0179\u0a31\1\0\0\0\u017a\u0ae8\1\0\0\0\u017b\u0ae3\1\0\0\0\u017c"+
	  "\u0b02\1\0\0\0\u017d\u0ae9\1\0\0\0\u017e\u0b06\1\0\0\0\u017f\u0b03\1"+
	  "\0\0\0\u017f\u0ecb\1\0\0\0\u0180\u0b16\1\0\0\0\u0181\u0b0b\1\0\0\0\u0182"+
	  "\u0b24\1\0\0\0\u0183\u0b17\1\0\0\0\u0184\u0b26\1\0\0\0\u0185\u0810\1"+
	  "\0\0\0\u0185\u0b12\1\0\0\0\u0186\u0b31\1\0\0\0\u0187\u0b2e\1\0\0\0\u0187"+
	  "\u0b2d\1\0\0\0\u0188\u0b39\1\0\0\0\u0189\u0b03\1\0\0\0\u0189\u0ecb\1"+
	  "\0\0\0\u018a\u0b45\1\0\0\0\u018b\u0b3e\1\0\0\0\u018c\u0b60\1\0\0\0\u018d"+
	  "\u0b4b\1\0\0\0\u018d\u0b4a\1\0\0\0\u018e\u0b62\1\0\0\0\u018f\u0b43\1"+
	  "\0\0\0\u018f\u0c96\1\0\0\0\u0190\u0b75\1\0\0\0\u0191\u0b6a\1\0\0\0\u0191"+
	  "\u0b69\1\0\0\0\u0192\u0b7b\1\0\0\0\u0193\u0b76\1\0\0\0\u0193\u0f3d\1"+
	  "\0\0\0\u0193\u0f3c\1\0\0\0\u0194\u0b7d\1\0\0\0\u0195\u0b03\1\0\0\0\u0195"+
	  "\u0ecb\1\0\0\0\u0196\u0b83\1\0\0\0\u0197\u0b7f\1\0\0\0\u0198\u0ba1\1"+
	  "\0\0\0\u0199\u0b88\1\0\0\0\u019a\u0bc2\1\0\0\0\u019b\u0ba7\1\0\0\0\u019b"+
	  "\u0ba6\1\0\0\0\u019c\u0bc8\1\0\0\0\u019d\u0b8f\1\0\0\0\u019d\u0fc9\1"+
	  "\0\0\0\u019d\u10b1\1\0\0\0\u019e\u0bd2\1\0\0\0\u019f\u0b93\1\0\0\0\u019f"+
	  "\u0c23\1\0\0\0\u019f\u0ca6\1\0\0\0\u01a0\u0bd8\1\0\0\0\u01a1\u0b80\1"+
	  "\0\0\0\u01a2\u0be4\1\0\0\0\u01a3\u0b9a\1\0\0\0\u01a3\u0d24\1\0\0\0\u01a3"+
	  "\u0d32\1\0\0\0\u01a3\u0dff\1\0\0\0\u01a3\u0fd2\1\0\0\0\u01a3\u103f\1"+
	  "\0\0\0\u01a3\u10bc\1\0\0\0\u01a4\u0be6\1\0\0\0\u01a5\u0be5\1\0\0\0\u01a5"+
	  "\u0bde\1\0\0\0\u01a6\u0bf3\1\0\0\0\u01a7\u0bee\1\0\0\0\u01a7\u0bed\1"+
	  "\0\0\0\u01a8\u0c01\1\0\0\0\u01a9\u0c00\1\0\0\0\u01aa\u0c0b\1\0\0\0\u01ab"+
	  "\u0bf8\1\0\0\0\u01ac\u0c0f\1\0\0\0\u01ad\u0be1\1\0\0\0\u01ad\u0be5\1"+
	  "\0\0\0\u01ae\u0c19\1\0\0\0\u01af\u0b03\1\0\0\0\u01af\u0ecb\1\0\0\0\u01b0"+
	  "\u0c29\1\0\0\0\u01b1\u0c1e\1\0\0\0\u01b2\u0c4a\1\0\0\0\u01b3\u0c2f\1"+
	  "\0\0\0\u01b3\u0c2e\1\0\0\0\u01b4\u0c58\1\0\0\0\u01b5\u0c27\1\0\0\0\u01b5"+
	  "\u0cf9\1\0\0\0\u01b6\u0c5c\1\0\0\0\u01b7\u0c50\1\0\0\0\u01b7\u0c57\1"+
	  "\0\0\0\u01b8\u0c68\1\0\0\0\u01b9\u0c51\1\0\0\0\u01b9\u0c56\1\0\0\0\u01ba"+
	  "\u0c80\1\0\0\0\u01bb\u0c61\1\0\0\0\u01bb\u0c6d\1\0\0\0\u01bc\u0c86\1"+
	  "\0\0\0\u01bd\u0c65\1\0\0\0\u01bd\u0c71\1\0\0\0\u01be\u0cac\1\0\0\0\u01bf"+
	  "\u0b03\1\0\0\0\u01bf\u0ecb\1\0\0\0\u01c0\u0cae\1\0\0\0\u01c1\u0c8f\1"+
	  "\0\0\0\u01c1\u0c9f\1\0\0\0\u01c2\u0ccf\1\0\0\0\u01c3\u0cb4\1\0\0\0\u01c3"+
	  "\u0cb3\1\0\0\0\u01c4\u0cd9\1\0\0\0\u01c5\u0caa\1\0\0\0\u01c6\u0cdd\1"+
	  "\0\0\0\u01c7\u0cd3\1\0\0\0\u01c7\u0cd8\1\0\0\0\u01c8\u0ce5\1\0\0\0\u01c9"+
	  "\u0cd4\1\0\0\0\u01c9\u0cd7\1\0\0\0\u01ca\u0ced\1\0\0\0\u01cb\u0b03\1"+
	  "\0\0\0\u01cb\u0ecb\1\0\0\0\u01cc\u0cfb\1\0\0\0\u01cd\u0cf2\1\0\0\0\u01ce"+
	  "\u0d1a\1\0\0\0\u01cf\u0d01\1\0\0\0\u01cf\u0d00\1\0\0\0\u01d0\u0d34\1"+
	  "\0\0\0\u01d1\u0cf5\1\0\0\0\u01d2\u0d38\1\0\0\0\u01d3\u0b03\1\0\0\0\u01d3"+
	  "\u0ecb\1\0\0\0\u01d4\u0d40\1\0\0\0\u01d5\u0d3c\1\0\0\0\u01d6\u0d51\1"+
	  "\0\0\0\u01d7\u0d46\1\0\0\0\u01d7\u0d45\1\0\0\0\u01d8\u0d59\1\0\0\0\u01d9"+
	  "\u0d3e\1\0\0\0\u01da\u0d5b\1\0\0\0\u01db\u0d5a\1\0\0\0\u01dc\u0d79\1"+
	  "\0\0\0\u01dd\u0d61\1\0\0\0\u01de\u0d7b\1\0\0\0\u01df\u0d5a\1\0\0\0\u01e0"+
	  "\u0daf\1\0\0\0\u01e1\u0d81\1\0\0\0\u01e2\u0dcd\1\0\0\0\u01e3\u0d5a\1"+
	  "\0\0\0\u01e4\u0dd3\1\0\0\0\u01e5\u0d3f\1\0\0\0\u01e6\u0dd7\1\0\0\0\u01e7"+
	  "\u0b03\1\0\0\0\u01e7\u0ecb\1\0\0\0\u01e8\u0de1\1\0\0\0\u01e9\u0ddc\1"+
	  "\0\0\0\u01ea\u0df6\1\0\0\0\u01eb\u0de7\1\0\0\0\u01eb\u0de6\1\0\0\0\u01ec"+
	  "\u0df8\1\0\0\0\u01ed\u0ddf\1\0\0\0\u01ee\u0e1e\1\0\0\0\u01ef\u0e05\1"+
	  "\0\0\0\u01f0\u0e24\1\0\0\0\u01f1\u0de0\1\0\0\0\u01f2\u0e28\1\0\0\0\u01f3"+
	  "\u0b03\1\0\0\0\u01f3\u0ecb\1\0\0\0\u01f4\u0e42\1\0\0\0\u01f5\u0e2c\1"+
	  "\0\0\0\u01f6\u0e48\1\0\0\0\u01f7\u0e33\1\0\0\0\u01f8\u0e5e\1\0\0\0\u01f9"+
	  "\u0b03\1\0\0\0\u01fa\u0e64\1\0\0\0\u01fb\u0e5f\1\0\0\0\u01fb\u11cc\1"+
	  "\0\0\0\u01fb\u11cc\1\0\0\0\u01fc\u0e68\1\0\0\0\u01fd\u0a06\1\0\0\0\u01fe"+
	  "\u0e88\1\0\0\0\u01ff\u0e6d\1\0\0\0\u0200\u0e9d\1\0\0\0\u0201\u0e8e\1"+
	  "\0\0\0\u0201\u0e8d\1\0\0\0\u0202\u0e9f\1\0\0\0\u0203\u0e7d\1\0\0\0\u0204"+
	  "\u0ea3\1\0\0\0\u0205\u0e86\1\0\0\0\u0206\u0eab\1\0\0\0\u0207\u0ea8\1"+
	  "\0\0\0\u0208\u0eca\1\0\0\0\u0209\u0eb1\1\0\0\0\u0209\u0eb0\1\0\0\0\u020a"+
	  "\u0ede\1\0\0\0\u020b\u033f\1\0\0\0\u020b\u0504\1\0\0\0\u020b\u0c15\1"+
	  "\0\0\0\u020c\u0eff\1\0\0\0\u020d\u04f2\1\0\0\0\u020e\u0f0e\1\0\0\0\u020f"+
	  "\u04fb\1\0\0\0\u0210\u0f12\1\0\0\0\u0211\u02f4\1\0\0\0\u0211\u050a\1"+
	  "\0\0\0\u0211\u0eea\1\0\0\0\u0211\u0f08\1\0\0\0\u0211\u0f0f\1\0\0\0\u0211"+
	  "\u121e\1\0\0\0\u0211\u122b\1\0\0\0\u0211\u1238\1\0\0\0\u0211\u1245\1"+
	  "\0\0\0\u0211\u1252\1\0\0\0\u0211\u125f\1\0\0\0\u0211\u126c\1\0\0\0\u0211"+
	  "\u127f\1\0\0\0\u0211\u12a5\1\0\0\0\u0212\u0f1a\1\0\0\0\u0213\u0f17\1"+
	  "\0\0\0\u0214\u0f33\1\0\0\0\u0215\u04ff\1\0\0\0\u0215\u0505\1\0\0\0\u0215"+
	  "\u050b\1\0\0\0\u0215\u080a\1\0\0\0\u0215\u0b7c\1\0\0\0\u0216\u0f35\1"+
	  "\0\0\0\u0217\u0f28\1\0\0\0\u0217\u0f2f\1\0\0\0\u0218\u0f42\1\0\0\0\u0219"+
	  "\u0a06\1\0\0\0\u021a\u0f62\1\0\0\0\u021b\u0f47\1\0\0\0\u021c\u0f77\1"+
	  "\0\0\0\u021d\u0f68\1\0\0\0\u021d\u0f67\1\0\0\0\u021e\u0f79\1\0\0\0\u021f"+
	  "\u0f53\1\0\0\0\u0220\u0f81\1\0\0\0\u0221\u0f7d\1\0\0\0\u0222\u0f9e\1"+
	  "\0\0\0\u0223\u0f86\1\0\0\0\u0223\u0f92\1\0\0\0\u0224\u0fa0\1\0\0\0\u0225"+
	  "\u0f57\1\0\0\0\u0226\u0fa4\1\0\0\0\u0227\u0f60\1\0\0\0\u0228\u0fac\1"+
	  "\0\0\0\u0229\u0fa9\1\0\0\0\u022a\u0fbd\1\0\0\0\u022b\u0fb2\1\0\0\0\u022b"+
	  "\u0fb1\1\0\0\0\u022c\u0fc1\1\0\0\0\u022d\u0fbe\1\0\0\0\u022e\u0fdd\1"+
	  "\0\0\0\u022f\u0fbe\1\0\0\0\u0230\u101d\1\0\0\0\u0231\u0feb\1\0\0\0\u0231"+
	  "\u1045\1\0\0\0\u0232\u1021\1\0\0\0\u0233\u0fbe\1\0\0\0\u0234\u1031\1"+
	  "\0\0\0\u0235\u0fbe\1\0\0\0\u0236\u1049\1\0\0\0\u0237\u0a06\1\0\0\0\u0238"+
	  "\u105d\1\0\0\0\u0239\u1056\1\0\0\0\u023a\u1071\1\0\0\0\u023b\u105b\1"+
	  "\0\0\0\u023c\u1073\1\0\0\0\u023d\u104e\1\0\0\0\u023e\u1086\1\0\0\0\u023f"+
	  "\u1079\1\0\0\0\u023f\u1078\1\0\0\0\u0240\u1088\1\0\0\0\u0241\u1066\1"+
	  "\0\0\0\u0241\u106d\1\0\0\0\u0242\u10a3\1\0\0\0\u0243\u1090\1\0\0\0\u0243"+
	  "\u108f\1\0\0\0\u0244\u10a7\1\0\0\0\u0245\u0a06\1\0\0\0\u0246\u10c5\1"+
	  "\0\0\0\u0247\u10ac\1\0\0\0\u0248\u10da\1\0\0\0\u0249\u10cb\1\0\0\0\u0249"+
	  "\u10ca\1\0\0\0\u024a\u10dc\1\0\0\0\u024b\u0992\1\0\0\0\u024c\u10de\1"+
	  "\0\0\0\u024d\u10dd\1\0\0\0\u024e\u10f9\1\0\0\0\u024f\u10e4\1\0\0\0\u024f"+
	  "\u10e3\1\0\0\0\u0250\u10fb\1\0\0\0\u0251\u10eb\1\0\0\0\u0251\u10f3\1"+
	  "\0\0\0\u0252\u1103\1\0\0\0\u0253\u10fd\1\0\0\0\u0254\u1105\1\0\0\0\u0255"+
	  "\u0a14\1\0\0\0\u0255\u0a59\1\0\0\0\u0255\u0a61\1\0\0\0\u0255\u0b07\1"+
	  "\0\0\0\u0255\u0b3a\1\0\0\0\u0255\u0b84\1\0\0\0\u0255\u0bf4\1\0\0\0\u0255"+
	  "\u0c10\1\0\0\0\u0255\u0c1a\1\0\0\0\u0255\u0c5d\1\0\0\0\u0255\u0c69\1"+
	  "\0\0\0\u0255\u0c8b\1\0\0\0\u0255\u0c9b\1\0\0\0\u0255\u0cde\1\0\0\0\u0255"+
	  "\u0ce6\1\0\0\0\u0255\u0cee\1\0\0\0\u0255\u0d39\1\0\0\0\u0255\u0dd8\1"+
	  "\0\0\0\u0255\u0e29\1\0\0\0\u0255\u0e4d\1\0\0\0\u0255\u0e69\1\0\0\0\u0255"+
	  "\u0f43\1\0\0\0\u0255\u0f82\1\0\0\0\u0255\u0f8e\1\0\0\0\u0255\u0fc2\1"+
	  "\0\0\0\u0255\u0fde\1\0\0\0\u0255\u0ff0\1\0\0\0\u0255\u0ff8\1\0\0\0\u0255"+
	  "\u1000\1\0\0\0\u0255\u1008\1\0\0\0\u0255\u1010\1\0\0\0\u0255\u1018\1"+
	  "\0\0\0\u0255\u1022\1\0\0\0\u0255\u1032\1\0\0\0\u0255\u104a\1\0\0\0\u0255"+
	  "\u1096\1\0\0\0\u0255\u109c\1\0\0\0\u0255\u10a8\1\0\0\0\u0255\u11a2\1"+
	  "\0\0\0\u0255\u11b8\1\0\0\0\u0255\u12ff\1\0\0\0\u0256\u1107\1\0\0\0\u0257"+
	  "\u1106\1\0\0\0\u0258\u1126\1\0\0\0\u0259\u110d\1\0\0\0\u0259\u110c\1"+
	  "\0\0\0\u025a\u1128\1\0\0\0\u025b\u1115\1\0\0\0\u025b\u111f\1\0\0\0\u025c"+
	  "\u113a\1\0\0\0\u025d\u112a\1\0\0\0\u025e\u113c\1\0\0\0\u025f\u10ed\1"+
	  "\0\0\0\u025f\u10f5\1\0\0\0\u025f\u1118\1\0\0\0\u025f\u1122\1\0\0\0\u0260"+
	  "\u1147\1\0\0\0\u0261\u1144\1\0\0\0\u0261\u1143\1\0\0\0\u0262\u114d\1"+
	  "\0\0\0\u0263\u114b\1\0\0\0\u0264\u1167\1\0\0\0\u0265\u114c\1\0\0\0\u0266"+
	  "\u1169\1\0\0\0\u0267\u1154\1\0\0\0\u0267\u115b\1\0\0\0\u0268\u1174\1"+
	  "\0\0\0\u0269\u1171\1\0\0\0\u0269\u1170\1\0\0\0\u026a\u1176\1\0\0\0\u026b"+
	  "\u115f\1\0\0\0\u026b\u1165\1\0\0\0\u026c\u1181\1\0\0\0\u026d\u117e\1"+
	  "\0\0\0\u026d\u117d\1\0\0\0\u026e\u1187\1\0\0\0\u026f\u1175\1\0\0\0\u026f"+
	  "\u1186\1\0\0\0\u0270\u1189\1\0\0\0\u0271\u0a4f\1\0\0\0\u0272\u118b\1"+
	  "\0\0\0\u0273\u0e9e\1\0\0\0\u0274\u118d\1\0\0\0\u0275\u0f78\1\0\0\0\u0276"+
	  "\u118f\1\0\0\0\u0277\u10db\1\0\0\0\u0278\u1191\1\0\0\0\u0279\u0b61\1"+
	  "\0\0\0\u027a\u1193\1\0\0\0\u027b\u0bc3\1\0\0\0\u027c\u1195\1\0\0\0\u027d"+
	  "\u0c4b\1\0\0\0\u027e\u1197\1\0\0\0\u027f\u0cd0\1\0\0\0\u0280\u1199\1"+
	  "\0\0\0\u0281\u0d1b\1\0\0\0\u0282\u119b\1\0\0\0\u0283\u0d52\1\0\0\0\u0284"+
	  "\u119d\1\0\0\0\u0285\u0df7\1\0\0\0\u0286\u11cb\1\0\0\0\u0287\u0e5f\1"+
	  "\0\0\0\u0288\u1209\1\0\0\0\u0289\u0e43\1\0\0\0\u028a\u120f\1\0\0\0\u028b"+
	  "\u07c0\1\0\0\0\u028c\u1211\1\0\0\0\u028d\u1210\1\0\0\0\u028e\u1215\1"+
	  "\0\0\0\u028f\u1350\5\uffff\0\0\u0290\u1276\1\0\0\0\u0291\u1216\1\0\0"+
	  "\0\u0291\u12db\1\0\0\0\u0292\u129c\1\0\0\0\u0293\u12d3\1\0\0\0\u0293"+
	  "\u133a\1\0\0\0\u0294\u12af\1\0\0\0\u0295\u1350\5\uffff\0\0\u0296\u12b5"+
	  "\1\0\0\0\u0297\u05be\1\0\0\0\u0298\u12b7\1\0\0\0\u0299\u12b6\1\0\0\0"+
	  "\u029a\u12bb\1\0\0\0\u029b\u12b0\1\0\0\0\u029c\u12c1\1\0\0\0\u029d\u12b0"+
	  "\1\0\0\0\u029e\u12c9\1\0\0\0\u029f\u12b6\1\0\0\0\u02a0\u12cd\1\0\0\0"+
	  "\u02a1\u03d9\1\0\0\0\u02a1\u12b0\1\0\0\0\u02a2\u12d5\1\0\0\0\u02a3\u1210"+
	  "\1\0\0\0\u02a4\u12e1\1\0\0\0\u02a5\u12dd\1\0\0\0\u02a6\u12ec\1\0\0\0"+
	  "\u02a7\u12e9\1\0\0\0\u02a7\u12e8\1\0\0\0\u02a8\u12f8\1\0\0\0\u02a9\u12f1"+
	  "\1\0\0\0\u02aa\u12fa\1\0\0\0\u02ab\u0ecb\1\0\0\0\u02ac\u12fe\1\0\0\0"+
	  "\u02ad\u12fb\1\0\0\0\u02ae\u1312\1\0\0\0\u02af\u1303\1\0\0\0\u02af\u1311"+
	  "\1\0\0\0\u02b0\u1320\1\0\0\0\u02b1\u1313\1\0\0\0\u02b1\u1310\1\0\0\0"+
	  "\u02b2\u1322\1\0\0\0\u02b3\u1308\1\0\0\0\u02b4\u132a\1\0\0\0\u02b5\u130a"+
	  "\1\0\0\0\u02b5\u1329\1\0\0\0\u02b6\u132c\1\0\0\0\u02b7\u132b\1\0\0\0"+
	  "\u02b7\u1328\1\0\0\0\u02b8\u1334\1\0\0\0\u02b9\u080a\1\0\0\0\u02ba\u1336"+
	  "\1\0\0\0\u02bb\u1335\1\0\0\0\u02bc\u134e\1\0\0\0\u02bd\u03d9\1\0\0\0"+
	  "\u02be\u02bf\3\4\2\0\u02bf\1\1\0\0\0\u02c0\u02c1\3\4\2\0\u02c1\3\1\0"+
	  "\0\0\u02c2\u02c6\5\u009b\0\0\u02c4\u02c7\3\"\21\0\u02c6\u02c4\1\0\0\0"+
	  "\u02c6\u02c7\1\0\0\0\u02c7\u02cb\1\0\0\0\u02c8\u02cb\3\u015a\u00ad\0"+
	  "\u02ca\u02c2\1\0\0\0\u02ca\u02c8\1\0\0\0\u02cb\u02d6\1\0\0\0\u02cc\u02ce"+
	  "\5A\0\0\u02ce\u02d2\5\u009b\0\0\u02d0\u02d3\3\"\21\0\u02d2\u02d0\1\0"+
	  "\0\0\u02d2\u02d3\1\0\0\0\u02d3\u02d5\1\0\0\0\u02d4\u02cc\1\0\0\0\u02d5"+
	  "\u02d8\1\0\0\0\u02d6\u02d4\1\0\0\0\u02d6\u02d7\1\0\0\0\u02d7\5\1\0\0"+
	  "\0\u02d8\u02d6\1\0\0\0\u02d9\u02ec\3\2\1\0\u02db\u02ec\3\f\6\0\u02dd"+
	  "\u02ec\3\30\f\0\u02df\u02ec\3\34\16\0\u02e1\u02ec\3\36\17\0\u02e3\u02ec"+
	  "\3 \20\0\u02e5\u02ec\3\u0166\u00b3\0\u02e7\u02e9\5\u00aa\0\0\u02e9\u02ec"+
	  "\5\u00a9\0\0\u02eb\u02d9\1\0\0\0\u02eb\u02db\1\0\0\0\u02eb\u02dd\1\0"+
	  "\0\0\u02eb\u02df\1\0\0\0\u02eb\u02e1\1\0\0\0\u02eb\u02e3\1\0\0\0\u02eb"+
	  "\u02e5\1\0\0\0\u02eb\u02e7\1\0\0\0\u02ec\u02f5\1\0\0\0\u02ed\u02f4\5"+
	  "\u00a8\0\0\u02ef\u02f4\3\u0210\u0108\0\u02f1\u02f4\5\u00a9\0\0\u02f3"+
	  "\u02ed\1\0\0\0\u02f3\u02ef\1\0\0\0\u02f3\u02f1\1\0\0\0\u02f4\u02f7\1"+
	  "\0\0\0\u02f5\u02f3\1\0\0\0\u02f5\u02f6\1\0\0\0\u02f6\7\1\0\0\0\u02f7"+
	  "\u02f5\1\0\0\0\u02f8\u02fd\3\n\5\0\u02fa\u02fd\3\30\f\0\u02fc\u02f8\1"+
	  "\0\0\0\u02fc\u02fa\1\0\0\0\u02fd\t\1\0\0\0\u02fe\u0305\3\2\1\0\u0300"+
	  "\u0305\3\f\6\0\u0302\u0305\3\24\n\0\u0304\u02fe\1\0\0\0\u0304\u0300\1"+
	  "\0\0\0\u0304\u0302\1\0\0\0\u0305\13\1\0\0\0\u0306\u030b\3\16\7\0\u0308"+
	  "\u030b\5b\0\0\u030a\u0306\1\0\0\0\u030a\u0308\1\0\0\0\u030b\r\1\0\0\0"+
	  "\u030c\u0313\3\20\b\0\u030e\u0313\3\22\t\0\u0310\u0313\5/\0\0\u0312\u030c"+
	  "\1\0\0\0\u0312\u030e\1\0\0\0\u0312\u0310\1\0\0\0\u0313\17\1\0\0\0\u0314"+
	  "\u0327\5]\0\0\u0316\u0327\5@\0\0\u0318\u0327\5%\0\0\u031a\u0327\5\t\0"+
	  "\0\u031c\u0327\5.\0\0\u031e\u0327\5_\0\0\u0320\u0327\5#\0\0\u0322\u0327"+
	  "\5\17\0\0\u0324\u0327\5\22\0\0\u0326\u0314\1\0\0\0\u0326\u0316\1\0\0"+
	  "\0\u0326\u0318\1\0\0\0\u0326\u031a\1\0\0\0\u0326\u031c\1\0\0\0\u0326"+
	  "\u031e\1\0\0\0\u0326\u0320\1\0\0\0\u0326\u0322\1\0\0\0\u0326\u0324\1"+
	  "\0\0\0\u0327\21\1\0\0\0\u0328\u032d\5\21\0\0\u032a\u032d\5\n\0\0\u032c"+
	  "\u0328\1\0\0\0\u032c\u032a\1\0\0\0\u032d\23\1\0\0\0\u032e\u0330\3\26"+
	  "\13\0\u0330\u0331\5\u00a8\0\0\u0331\25\1\0\0\0\u0332\u0333\3\6\3\0\u0333"+
	  "\27\1\0\0\0\u0334\u0335\3\2\1\0\u0335\31\1\0\0\0\u0336\u033f\3\34\16"+
	  "\0\u0338\u033f\3\36\17\0\u033a\u033f\3\u020a\u0105\0\u033c\u033f\3 \20"+
	  "\0\u033e\u0336\1\0\0\0\u033e\u0338\1\0\0\0\u033e\u033a\1\0\0\0\u033e"+
	  "\u033c\1\0\0\0\u033f\33\1\0\0\0\u0340\u0349\3\2\1\0\u0342\u0349\5g\0"+
	  "\0\u0344\u0349\5{\0\0\u0346\u0349\5\u0095\0\0\u0348\u0340\1\0\0\0\u0348"+
	  "\u0342\1\0\0\0\u0348\u0344\1\0\0\0\u0348\u0346\1\0\0\0\u0349\35\1\0\0"+
	  "\0\u034a\u034b\3\2\1\0\u034b\37\1\0\0\0\u034c\u034d\3\2\1\0\u034d!\1"+
	  "\0\0\0\u034e\u0350\5T\0\0\u0350\u0352\3$\22\0\u0352\u0353\5F\0\0\u0353"+
	  "#\1\0\0\0\u0354\u035c\3&\23\0\u0356\u0358\5*\0\0\u0358\u035b\3&\23\0"+
	  "\u035a\u0356\1\0\0\0\u035b\u035e\1\0\0\0\u035c\u035a\1\0\0\0\u035c\u035d"+
	  "\1\0\0\0\u035d%\1\0\0\0\u035e\u035c\1\0\0\0\u035f\u0360\3\6\3\0\u0360"+
	  "\'\1\0\0\0\u0361\u0362\3\u00d4j\0\u0362)\1\0\0\0\u0363\u036b\3,\26\0"+
	  "\u0365\u0367\5*\0\0\u0367\u036a\3,\26\0\u0369\u0365\1\0\0\0\u036a\u036d"+
	  "\1\0\0\0\u036b\u0369\1\0\0\0\u036b\u036c\1\0\0\0\u036c+\1\0\0\0\u036d"+
	  "\u036b\1\0\0\0\u036e\u0371\3.\27\0\u0370\u036e\1\0\0\0\u0370\u0371\1"+
	  "\0\0\0\u0371\u0372\1\0\0\0\u0372\u0373\3\60\30\0\u0373-\1\0\0\0\u0374"+
	  "\u0376\5\u009b\0\0\u0376\u0377\5y\0\0\u0377/\1\0\0\0\u0378\u0383\3\u00d4"+
	  "j\0\u037a\u037c\5x\0\0\u037c\u0383\3(\24\0\u037e\u0380\5M\0\0\u0380\u0383"+
	  "\3(\24\0\u0382\u0378\1\0\0\0\u0382\u037a\1\0\0\0\u0382\u037e\1\0\0\0"+
	  "\u0383\61\1\0\0\0\u0384\u0389\3\64\32\0\u0386\u0389\3^/\0\u0388\u0384"+
	  "\1\0\0\0\u0388\u0386\1\0\0\0\u0389\63\1\0\0\0\u038a\u03d9\3\u02bc\u015e"+
	  "\0\u038c\u03d9\3\66\33\0\u038e\u03d9\38\34\0\u0390\u0392\3^/\0\u0392"+
	  "\u0394\5A\0\0\u0394\u0398\5\u009b\0\0\u0396\u0399\3\"\21\0\u0398\u0396"+
	  "\1\0\0\0\u0398\u0399\1\0\0\0\u0399\u03d9\1\0\0\0\u039a\u039c\3<\36\0"+
	  "\u039c\u039e\5A\0\0\u039e\u03a2\5\u009b\0\0\u03a0\u03a3\3\"\21\0\u03a2"+
	  "\u03a0\1\0\0\0\u03a2\u03a3\1\0\0\0\u03a3\u03d9\1\0\0\0\u03a4\u03a6\3"+
	  "\u015a\u00ad\0\u03a6\u03a8\5A\0\0\u03a8\u03a9\5\u009b\0\0\u03a9\u03d9"+
	  "\1\0\0\0\u03aa\u03ac\3^/\0\u03ac\u03b0\5w\0\0\u03ae\u03b1\3*\25\0\u03b0"+
	  "\u03ae\1\0\0\0\u03b0\u03b1\1\0\0\0\u03b1\u03b2\1\0\0\0\u03b2\u03b3\5"+
	  "\30\0\0\u03b3\u03d9\1\0\0\0\u03b4\u03d9\3D\"\0\u03b6\u03d9\3F#\0\u03b8"+
	  "\u03ba\3^/\0\u03ba\u03bb\5=\0\0\u03bb\u03d9\1\0\0\0\u03bc\u03be\3^/\0"+
	  "\u03be\u03bf\5U\0\0\u03bf\u03d9\1\0\0\0\u03c0\u03d9\3L&\0\u03c2\u03d9"+
	  "\3`\60\0\u03c4\u03d9\3b\61\0\u03c6\u03d9\3j\65\0\u03c8\u03d9\3r9\0\u03ca"+
	  "\u03d9\3t:\0\u03cc\u03d9\3v;\0\u03ce\u03d9\3\u009aM\0\u03d0\u03d2\3^"+
	  "/\0\u03d2\u03d4\5`\0\0\u03d4\u03d5\5\u009b\0\0\u03d5\u03d9\1\0\0\0\u03d6"+
	  "\u03d9\3\u02a0\u0150\0\u03d8\u038a\1\0\0\0\u03d8\u038c\1\0\0\0\u03d8"+
	  "\u038e\1\0\0\0\u03d8\u0390\1\0\0\0\u03d8\u039a\1\0\0\0\u03d8\u03a4\1"+
	  "\0\0\0\u03d8\u03aa\1\0\0\0\u03d8\u03b4\1\0\0\0\u03d8\u03b6\1\0\0\0\u03d8"+
	  "\u03b8\1\0\0\0\u03d8\u03bc\1\0\0\0\u03d8\u03c0\1\0\0\0\u03d8\u03c2\1"+
	  "\0\0\0\u03d8\u03c4\1\0\0\0\u03d8\u03c6\1\0\0\0\u03d8\u03c8\1\0\0\0\u03d8"+
	  "\u03ca\1\0\0\0\u03d8\u03cc\1\0\0\0\u03d8\u03ce\1\0\0\0\u03d8\u03d0\1"+
	  "\0\0\0\u03d8\u03d6\1\0\0\0\u03d9\u0400\1\0\0\0\u03da\u03dc\5A\0\0\u03dc"+
	  "\u03e0\5\u009b\0\0\u03de\u03e1\3\"\21\0\u03e0\u03de\1\0\0\0\u03e0\u03e1"+
	  "\1\0\0\0\u03e1\u03ff\1\0\0\0\u03e2\u03e6\5w\0\0\u03e4\u03e7\3*\25\0\u03e6"+
	  "\u03e4\1\0\0\0\u03e6\u03e7\1\0\0\0\u03e7\u03e8\1\0\0\0\u03e8\u03ff\5"+
	  "\30\0\0\u03ea\u03ec\5R\0\0\u03ec\u03ee\3B!\0\u03ee\u03ef\5s\0\0\u03ef"+
	  "\u03ff\1\0\0\0\u03f0\u03ff\5=\0\0\u03f2\u03ff\5U\0\0\u03f4\u03f6\5`\0"+
	  "\0\u03f6\u03ff\5\u009b\0\0\u03f8\u03fa\5R\0\0\u03fa\u03fc\3\u00d4j\0"+
	  "\u03fc\u03fd\5s\0\0\u03fd\u03ff\1\0\0\0\u03fe\u03da\1\0\0\0\u03fe\u03e2"+
	  "\1\0\0\0\u03fe\u03ea\1\0\0\0\u03fe\u03f0\1\0\0\0\u03fe\u03f2\1\0\0\0"+
	  "\u03fe\u03f4\1\0\0\0\u03fe\u03f8\1\0\0\0\u03ff\u0402\1\0\0\0\u0400\u03fe"+
	  "\1\0\0\0\u0400\u0401\1\0\0\0\u0401\65\1\0\0\0\u0402\u0400\1\0\0\0\u0403"+
	  "\u0407\5\u009b\0\0\u0405\u0408\3\"\21\0\u0407\u0405\1\0\0\0\u0407\u0408"+
	  "\1\0\0\0\u0408\67\1\0\0\0\u0409\u040b\5w\0\0\u040b\u040d\3\u00d4j\0\u040d"+
	  "\u040e\5\30\0\0\u040e9\1\0\0\0\u040f\u0411\3\62\31\0\u0411\u0413\5A\0"+
	  "\0\u0413\u0417\5\u009b\0\0\u0415\u0418\3\"\21\0\u0417\u0415\1\0\0\0\u0417"+
	  "\u0418\1\0\0\0\u0418\u042a\1\0\0\0\u0419\u041b\3<\36\0\u041b\u041d\5"+
	  "A\0\0\u041d\u0421\5\u009b\0\0\u041f\u0422\3\"\21\0\u0421\u041f\1\0\0"+
	  "\0\u0421\u0422\1\0\0\0\u0422\u042a\1\0\0\0\u0423\u0425\3\u015a\u00ad"+
	  "\0\u0425\u0427\5A\0\0\u0427\u0428\5\u009b\0\0\u0428\u042a\1\0\0\0\u0429"+
	  "\u040f\1\0\0\0\u0429\u0419\1\0\0\0\u0429\u0423\1\0\0\0\u042a;\1\0\0\0"+
	  "\u042b\u044a\5b\0\0\u042d\u044a\5@\0\0\u042f\u044a\5\22\0\0\u0431\u044a"+
	  "\5/\0\0\u0433\u044a\5\n\0\0\u0435\u044a\5\21\0\0\u0437\u044a\5.\0\0\u0439"+
	  "\u044a\5#\0\0\u043b\u044a\5g\0\0\u043d\u044a\5]\0\0\u043f\u044a\5%\0"+
	  "\0\u0441\u044a\5\u0095\0\0\u0443\u044a\5_\0\0\u0445\u044a\5\17\0\0\u0447"+
	  "\u044a\5\t\0\0\u0449\u042b\1\0\0\0\u0449\u042d\1\0\0\0\u0449\u042f\1"+
	  "\0\0\0\u0449\u0431\1\0\0\0\u0449\u0433\1\0\0\0\u0449\u0435\1\0\0\0\u0449"+
	  "\u0437\1\0\0\0\u0449\u0439\1\0\0\0\u0449\u043b\1\0\0\0\u0449\u043d\1"+
	  "\0\0\0\u0449\u043f\1\0\0\0\u0449\u0441\1\0\0\0\u0449\u0443\1\0\0\0\u0449"+
	  "\u0445\1\0\0\0\u0449\u0447\1\0\0\0\u044a=\1\0\0\0\u044b\u044d\3\62\31"+
	  "\0\u044d\u0451\5w\0\0\u044f\u0452\3*\25\0\u0451\u044f\1\0\0\0\u0451\u0452"+
	  "\1\0\0\0\u0452\u0453\1\0\0\0\u0453\u0454\5\30\0\0\u0454?\1\0\0\0\u0455"+
	  "\u0457\3\64\32\0\u0457\u0459\5R\0\0\u0459\u045b\3B!\0\u045b\u045c\5s"+
	  "\0\0\u045cA\1\0\0\0\u045d\u0465\3\u00d4j\0\u045f\u0461\5*\0\0\u0461\u0464"+
	  "\3\u00d4j\0\u0463\u045f\1\0\0\0\u0464\u0467\1\0\0\0\u0465\u0463\1\0\0"+
	  "\0\u0465\u0466\1\0\0\0\u0466C\1\0\0\0\u0467\u0465\1\0\0\0\u0468\u0469"+
	  "\5\u0092\0\0\u0469E\1\0\0\0\u046a\u046c\5\u008e\0\0\u046c\u046e\5A\0"+
	  "\0\u046e\u0479\5\u009b\0\0\u0470\u0472\5\u008e\0\0\u0472\u0474\5R\0\0"+
	  "\u0474\u0476\3B!\0\u0476\u0477\5s\0\0\u0477\u0479\1\0\0\0\u0478\u046a"+
	  "\1\0\0\0\u0478\u0470\1\0\0\0\u0479G\1\0\0\0\u047a\u047c\3\62\31\0\u047c"+
	  "\u047d\5=\0\0\u047dI\1\0\0\0\u047e\u0480\3\62\31\0\u0480\u0481\5U\0\0"+
	  "\u0481K\1\0\0\0\u0482\u0484\5n\0\0\u0484\u0486\3\6\3\0\u0486\u048a\5"+
	  "w\0\0\u0488\u048b\3*\25\0\u048a\u0488\1\0\0\0\u048a\u048b\1\0\0\0\u048b"+
	  "\u048c\1\0\0\0\u048c\u0490\5\30\0\0\u048e\u0491\3N\'\0\u0490\u048e\1"+
	  "\0\0\0\u0490\u0491\1\0\0\0\u0491\u0499\1\0\0\0\u0492\u0494\5n\0\0\u0494"+
	  "\u0496\3\6\3\0\u0496\u0497\3N\'\0\u0497\u0499\1\0\0\0\u0498\u0482\1\0"+
	  "\0\0\u0498\u0492\1\0\0\0\u0499M\1\0\0\0\u049a\u049f\3P(\0\u049c\u049f"+
	  "\3X,\0\u049e\u049a\1\0\0\0\u049e\u049c\1\0\0\0\u049fO\1\0\0\0\u04a0\u04a4"+
	  "\5~\0\0\u04a2\u04a5\3R)\0\u04a4\u04a2\1\0\0\0\u04a4\u04a5\1\0\0\0\u04a5"+
	  "\u04a6\1\0\0\0\u04a6\u04b1\5\20\0\0\u04a8\u04aa\5~\0\0\u04aa\u04ac\3"+
	  "R)\0\u04ac\u04ae\5*\0\0\u04ae\u04af\5\20\0\0\u04af\u04b1\1\0\0\0\u04b0"+
	  "\u04a0\1\0\0\0\u04b0\u04a8\1\0\0\0\u04b1Q\1\0\0\0\u04b2\u04ba\3T*\0\u04b4"+
	  "\u04b6\5*\0\0\u04b6\u04b9\3T*\0\u04b8\u04b4\1\0\0\0\u04b9\u04bc\1\0\0"+
	  "\0\u04ba\u04b8\1\0\0\0\u04ba\u04bb\1\0\0\0\u04bbS\1\0\0\0\u04bc\u04ba"+
	  "\1\0\0\0\u04bd\u04bf\5\u009b\0\0\u04bf\u04c1\5h\0\0\u04c1\u04c2\3V+\0"+
	  "\u04c2U\1\0\0\0\u04c3\u04c8\3\u00d4j\0\u04c5\u04c8\3N\'\0\u04c7\u04c3"+
	  "\1\0\0\0\u04c7\u04c5\1\0\0\0\u04c8W\1\0\0\0\u04c9\u04cb\5~\0\0\u04cb"+
	  "\u04cd\3Z-\0\u04cd\u04ce\5\20\0\0\u04ce\u04d8\1\0\0\0\u04cf\u04d1\5~"+
	  "\0\0\u04d1\u04d3\3Z-\0\u04d3\u04d5\5*\0\0\u04d5\u04d6\5\20\0\0\u04d6"+
	  "\u04d8\1\0\0\0\u04d7\u04c9\1\0\0\0\u04d7\u04cf\1\0\0\0\u04d8Y\1\0\0\0"+
	  "\u04d9\u04e1\3\\.\0\u04db\u04dd\5*\0\0\u04dd\u04e0\3\\.\0\u04df\u04db"+
	  "\1\0\0\0\u04e0\u04e3\1\0\0\0\u04e1\u04df\1\0\0\0\u04e1\u04e2\1\0\0\0"+
	  "\u04e2[\1\0\0\0\u04e3\u04e1\1\0\0\0\u04e4\u04ed\3\u00d6k\0\u04e6\u04e8"+
	  "\5~\0\0\u04e8\u04ea\3B!\0\u04ea\u04eb\5\20\0\0\u04eb\u04ed\1\0\0\0\u04ec"+
	  "\u04e4\1\0\0\0\u04ec\u04e6\1\0\0\0\u04ed]\1\0\0\0\u04ee\u04f0\5n\0\0"+
	  "\u04f0\u04f2\3\u020c\u0106\0\u04f2\u04f4\5R\0\0\u04f4\u04f6\3B!\0\u04f6"+
	  "\u04fa\5s\0\0\u04f8\u04fb\3\u020e\u0107\0\u04fa\u04f8\1\0\0\0\u04fa\u04fb"+
	  "\1\0\0\0\u04fb\u04fe\1\0\0\0\u04fc\u04ff\3\u0214\u010a\0\u04fe\u04fc"+
	  "\1\0\0\0\u04fe\u04ff\1\0\0\0\u04ff\u050d\1\0\0\0\u0500\u0502\5n\0\0\u0502"+
	  "\u0504\3\u020a\u0105\0\u0504\u0505\3\u0214\u010a\0\u0505\u050d\1\0\0"+
	  "\0\u0506\u0508\5n\0\0\u0508\u050a\3\u0210\u0108\0\u050a\u050b\3\u0214"+
	  "\u010a\0\u050b\u050d\1\0\0\0\u050c\u04ee\1\0\0\0\u050c\u0500\1\0\0\0"+
	  "\u050c\u0506\1\0\0\0\u050d_\1\0\0\0\u050e\u0510\5n\0\0\u0510\u0512\3"+
	  " \20\0\u0512\u0514\5w\0\0\u0514\u0516\3\u00d4j\0\u0516\u0517\5\30\0\0"+
	  "\u0517a\1\0\0\0\u0518\u051a\5n\0\0\u051a\u051b\3d\62\0\u051bc\1\0\0\0"+
	  "\u051c\u0520\5~\0\0\u051e\u0521\3f\63\0\u0520\u051e\1\0\0\0\u0520\u0521"+
	  "\1\0\0\0\u0521\u0522\1\0\0\0\u0522\u052d\5\20\0\0\u0524\u0526\5~\0\0"+
	  "\u0526\u0528\3f\63\0\u0528\u052a\5*\0\0\u052a\u052b\5\20\0\0\u052b\u052d"+
	  "\1\0\0\0\u052c\u051c\1\0\0\0\u052c\u0524\1\0\0\0\u052de\1\0\0\0\u052e"+
	  "\u0536\3h\64\0\u0530\u0532\5*\0\0\u0532\u0535\3h\64\0\u0534\u0530\1\0"+
	  "\0\0\u0535\u0538\1\0\0\0\u0536\u0534\1\0\0\0\u0536\u0537\1\0\0\0\u0537"+
	  "g\1\0\0\0\u0538\u0536\1\0\0\0\u0539\u0546\3\66\33\0\u053b\u0546\3:\35"+
	  "\0\u053d\u0546\3F#\0\u053f\u0541\5\u009b\0\0\u0541\u0543\5h\0\0\u0543"+
	  "\u0546\3\u00d4j\0\u0545\u0539\1\0\0\0\u0545\u053b\1\0\0\0\u0545\u053d"+
	  "\1\0\0\0\u0545\u053f\1\0\0\0\u0546i\1\0\0\0\u0547\u0549\5\35\0\0\u0549"+
	  "\u054b\5w\0\0\u054b\u054d\3\6\3\0\u054d\u054e\5\30\0\0\u054e\u0560\1"+
	  "\0\0\0\u054f\u0551\5\35\0\0\u0551\u0553\5w\0\0\u0553\u0555\3l\66\0\u0555"+
	  "\u0556\5\30\0\0\u0556\u0560\1\0\0\0\u0557\u0559\5\35\0\0\u0559\u055b"+
	  "\5w\0\0\u055b\u055d\5\u00aa\0\0\u055d\u0560\5\30\0\0\u055f\u0547\1\0"+
	  "\0\0\u055f\u054f\1\0\0\0\u055f\u0557\1\0\0\0\u0560k\1\0\0\0\u0561\u0563"+
	  "\5\u009b\0\0\u0563\u0566\5\31\0\0\u0565\u0561\1\0\0\0\u0565\u0566\1\0"+
	  "\0\0\u0566\u0567\1\0\0\0\u0567\u056b\5\u009b\0\0\u0569\u056c\3n\67\0"+
	  "\u056b\u0569\1\0\0\0\u056b\u056c\1\0\0\0\u056c\u0577\1\0\0\0\u056d\u056f"+
	  "\5A\0\0\u056f\u0573\5\u009b\0\0\u0571\u0574\3n\67\0\u0573\u0571\1\0\0"+
	  "\0\u0573\u0574\1\0\0\0\u0574\u0576\1\0\0\0\u0575\u056d\1\0\0\0\u0576"+
	  "\u0579\1\0\0\0\u0577\u0575\1\0\0\0\u0577\u0578\1\0\0\0\u0578m\1\0\0\0"+
	  "\u0579\u0577\1\0\0\0\u057a\u057e\5T\0\0\u057c\u057f\3p8\0\u057e\u057c"+
	  "\1\0\0\0\u057e\u057f\1\0\0\0\u057f\u0580\1\0\0\0\u0580\u0581\5F\0\0\u0581"+
	  "o\1\0\0\0\u0582\u0588\5*\0\0\u0584\u0587\5*\0\0\u0586\u0584\1\0\0\0\u0587"+
	  "\u058a\1\0\0\0\u0588\u0586\1\0\0\0\u0588\u0589\1\0\0\0\u0589q\1\0\0\0"+
	  "\u058a\u0588\1\0\0\0\u058b\u058d\5S\0\0\u058d\u058f\5w\0\0\u058f\u0591"+
	  "\3\u00d4j\0\u0591\u0592\5\30\0\0\u0592s\1\0\0\0\u0593\u0595\5\24\0\0"+
	  "\u0595\u0597\5w\0\0\u0597\u0599\3\u00d4j\0\u0599\u059a\5\30\0\0\u059a"+
	  "u\1\0\0\0\u059b\u059d\5u\0\0\u059d\u059f\5w\0\0\u059f\u05a1\3\6\3\0\u05a1"+
	  "\u05a2\5\30\0\0\u05a2w\1\0\0\0\u05a3\u05be\3\62\31\0\u05a5\u05a7\5C\0"+
	  "\0\u05a7\u05be\3x<\0\u05a9\u05ab\5,\0\0\u05ab\u05be\3x<\0\u05ad\u05af"+
	  "\5!\0\0\u05af\u05be\3x<\0\u05b1\u05b3\5L\0\0\u05b3\u05be\3x<\0\u05b5"+
	  "\u05be\3z=\0\u05b7\u05be\3|>\0\u05b9\u05be\3~?\0\u05bb\u05be\3\u0296"+
	  "\u014b\0\u05bd\u05a3\1\0\0\0\u05bd\u05a5\1\0\0\0\u05bd\u05a9\1\0\0\0"+
	  "\u05bd\u05ad\1\0\0\0\u05bd\u05b1\1\0\0\0\u05bd\u05b5\1\0\0\0\u05bd\u05b7"+
	  "\1\0\0\0\u05bd\u05b9\1\0\0\0\u05bd\u05bb\1\0\0\0\u05bey\1\0\0\0\u05bf"+
	  "\u05c1\5=\0\0\u05c1\u05c2\3x<\0\u05c2{\1\0\0\0\u05c3\u05c5\5U\0\0\u05c5"+
	  "\u05c6\3x<\0\u05c6}\1\0\0\0\u05c7\u05c9\5w\0\0\u05c9\u05cb\3\6\3\0\u05cb"+
	  "\u05cd\5\30\0\0\u05cd\u05ce\3x<\0\u05ce\177\1\0\0\0\u05cf\u05df\3x<\0"+
	  "\u05d1\u05d3\5\u00a9\0\0\u05d3\u05de\3x<\0\u05d5\u05d7\5K\0\0\u05d7\u05de"+
	  "\3x<\0\u05d9\u05db\5a\0\0\u05db\u05de\3x<\0\u05dd\u05d1\1\0\0\0\u05dd"+
	  "\u05d5\1\0\0\0\u05dd\u05d9\1\0\0\0\u05de\u05e1\1\0\0\0\u05df\u05dd\1"+
	  "\0\0\0\u05df\u05e0\1\0\0\0\u05e0\u0081\1\0\0\0\u05e1\u05df\1\0\0\0\u05e2"+
	  "\u05ee\3\u0080@\0\u05e4\u05e6\5C\0\0\u05e6\u05ed\3\u0080@\0\u05e8\u05ea"+
	  "\5,\0\0\u05ea\u05ed\3\u0080@\0\u05ec\u05e4\1\0\0\0\u05ec\u05e8\1\0\0"+
	  "\0\u05ed\u05f0\1\0\0\0\u05ee\u05ec\1\0\0\0\u05ee\u05ef\1\0\0\0\u05ef"+
	  "\u0083\1\0\0\0\u05f0\u05ee\1\0\0\0\u05f1\u05fd\3\u0082A\0\u05f3\u05f5"+
	  "\5Z\0\0\u05f5\u05fc\3\u0082A\0\u05f7\u05f9\5\u00a3\0\0\u05f9\u05fc\3"+
	  "\u0082A\0\u05fb\u05f3\1\0\0\0\u05fb\u05f7\1\0\0\0\u05fc\u05ff\1\0\0\0"+
	  "\u05fd\u05fb\1\0\0\0\u05fd\u05fe\1\0\0\0\u05fe\u0085\1\0\0\0\u05ff\u05fd"+
	  "\1\0\0\0\u0600\u061c\3\u0084B\0\u0602\u0604\5T\0\0\u0604\u061b\3\u0084"+
	  "B\0\u0606\u0608\5F\0\0\u0608\u061b\3\u0084B\0\u060a\u060c\5Y\0\0\u060c"+
	  "\u061b\3\u0084B\0\u060e\u0610\5\u0097\0\0\u0610\u061b\3\u0084B\0\u0612"+
	  "\u0614\5\u0086\0\0\u0614\u061b\3\6\3\0\u0616\u0618\5\62\0\0\u0618\u061b"+
	  "\3\6\3\0\u061a\u0602\1\0\0\0\u061a\u0606\1\0\0\0\u061a\u060a\1\0\0\0"+
	  "\u061a\u060e\1\0\0\0\u061a\u0612\1\0\0\0\u061a\u0616\1\0\0\0\u061b\u061e"+
	  "\1\0\0\0\u061c\u061a\1\0\0\0\u061c\u061d\1\0\0\0\u061d\u0087\1\0\0\0"+
	  "\u061e\u061c\1\0\0\0\u061f\u062b\3\u0086C\0\u0621\u0623\5\u0096\0\0\u0623"+
	  "\u062a\3\u0086C\0\u0625\u0627\5X\0\0\u0627\u062a\3\u0086C\0\u0629\u0621"+
	  "\1\0\0\0\u0629\u0625\1\0\0\0\u062a\u062d\1\0\0\0\u062b\u0629\1\0\0\0"+
	  "\u062b\u062c\1\0\0\0\u062c\u0089\1\0\0\0\u062d\u062b\1\0\0\0\u062e\u0636"+
	  "\3\u0088D\0\u0630\u0632\5P\0\0\u0632\u0635\3\u0088D\0\u0634\u0630\1\0"+
	  "\0\0\u0635\u0638\1\0\0\0\u0636\u0634\1\0\0\0\u0636\u0637\1\0\0\0\u0637"+
	  "\u008b\1\0\0\0\u0638\u0636\1\0\0\0\u0639\u0641\3\u008aE\0\u063b\u063d"+
	  "\5\u0085\0\0\u063d\u0640\3\u008aE\0\u063f\u063b\1\0\0\0\u0640\u0643\1"+
	  "\0\0\0\u0641\u063f\1\0\0\0\u0641\u0642\1\0\0\0\u0642\u008d\1\0\0\0\u0643"+
	  "\u0641\1\0\0\0\u0644\u064c\3\u008cF\0\u0646\u0648\5 \0\0\u0648\u064b"+
	  "\3\u008cF\0\u064a\u0646\1\0\0\0\u064b\u064e\1\0\0\0\u064c\u064a\1\0\0"+
	  "\0\u064c\u064d\1\0\0\0\u064d\u008f\1\0\0\0\u064e\u064c\1\0\0\0\u064f"+
	  "\u0657\3\u008eG\0\u0651\u0653\5D\0\0\u0653\u0656\3\u008eG\0\u0655\u0651"+
	  "\1\0\0\0\u0656\u0659\1\0\0\0\u0657\u0655\1\0\0\0\u0657\u0658\1\0\0\0"+
	  "\u0658\u0091\1\0\0\0\u0659\u0657\1\0\0\0\u065a\u0662\3\u0090H\0\u065c"+
	  "\u065e\5E\0\0\u065e\u0661\3\u0090H\0\u0660\u065c\1\0\0\0\u0661\u0664"+
	  "\1\0\0\0\u0662\u0660\1\0\0\0\u0662\u0663\1\0\0\0\u0663\u0093\1\0\0\0"+
	  "\u0664\u0662\1\0\0\0\u0665\u066e\3\u0092I\0\u0667\u0669\3\u0092I\0\u0669"+
	  "\u066b\5l\0\0\u066b\u066c\3\u0094J\0\u066c\u066e\1\0\0\0\u066d\u0665"+
	  "\1\0\0\0\u066d\u0667\1\0\0\0\u066e\u0095\1\0\0\0\u066f\u067c\3\u0094"+
	  "J\0\u0671\u0673\3\u0094J\0\u0673\u0675\5\u00a8\0\0\u0675\u0677\3\u00d4"+
	  "j\0\u0677\u0679\5y\0\0\u0679\u067a\3\u00d4j\0\u067a\u067c\1\0\0\0\u067b"+
	  "\u066f\1\0\0\0\u067b\u0671\1\0\0\0\u067c\u0097\1\0\0\0\u067d\u067f\3"+
	  "\u009cN\0\u067f\u0681\5\u0088\0\0\u0681\u0682\3\u00acV\0\u0682\u0099"+
	  "\1\0\0\0\u0683\u0687\5[\0\0\u0685\u0688\3\u009eO\0\u0687\u0685\1\0\0"+
	  "\0\u0687\u0688\1\0\0\0\u0688\u0689\1\0\0\0\u0689\u068a\3\u00e0p\0\u068a"+
	  "\u009b\1\0\0\0\u068b\u0690\3\u009eO\0\u068d\u0690\3\u00a6S\0\u068f\u068b"+
	  "\1\0\0\0\u068f\u068d\1\0\0\0\u0690\u009d\1\0\0\0\u0691\u0695\5w\0\0\u0693"+
	  "\u0696\3\u00a0P\0\u0695\u0693\1\0\0\0\u0695\u0696\1\0\0\0\u0696\u0697"+
	  "\1\0\0\0\u0697\u0698\5\30\0\0\u0698\u009f\1\0\0\0\u0699\u06a1\3\u00a2"+
	  "Q\0\u069b\u069d\5*\0\0\u069d\u06a0\3\u00a2Q\0\u069f\u069b\1\0\0\0\u06a0"+
	  "\u06a3\1\0\0\0\u06a1\u069f\1\0\0\0\u06a1\u06a2\1\0\0\0\u06a2\u00a1\1"+
	  "\0\0\0\u06a3\u06a1\1\0\0\0\u06a4\u06a7\3\u00a4R\0\u06a6\u06a4\1\0\0\0"+
	  "\u06a6\u06a7\1\0\0\0\u06a7\u06a8\1\0\0\0\u06a8\u06aa\3\6\3\0\u06aa\u06ab"+
	  "\5\u009b\0\0\u06ab\u00a3\1\0\0\0\u06ac\u06b1\5x\0\0\u06ae\u06b1\5M\0"+
	  "\0\u06b0\u06ac\1\0\0\0\u06b0\u06ae\1\0\0\0\u06b1\u00a5\1\0\0\0\u06b2"+
	  "\u06b6\5w\0\0\u06b4\u06b7\3\u00a8T\0\u06b6\u06b4\1\0\0\0\u06b6\u06b7"+
	  "\1\0\0\0\u06b7\u06b8\1\0\0\0\u06b8\u06bd\5\30\0\0\u06ba\u06bd\3\u00aa"+
	  "U\0\u06bc\u06b2\1\0\0\0\u06bc\u06ba\1\0\0\0\u06bd\u00a7\1\0\0\0\u06be"+
	  "\u06c6\3\u00aaU\0\u06c0\u06c2\5*\0\0\u06c2\u06c5\3\u00aaU\0\u06c4\u06c0"+
	  "\1\0\0\0\u06c5\u06c8\1\0\0\0\u06c6\u06c4\1\0\0\0\u06c6\u06c7\1\0\0\0"+
	  "\u06c7\u00a9\1\0\0\0\u06c8\u06c6\1\0\0\0\u06c9\u06ca\5\u009b\0\0\u06ca"+
	  "\u00ab\1\0\0\0\u06cb\u06d0\3\u00d4j\0\u06cd\u06d0\3\u00e0p\0\u06cf\u06cb"+
	  "\1\0\0\0\u06cf\u06cd\1\0\0\0\u06d0\u00ad\1\0\0\0\u06d1\u06d3\3\u00b0"+
	  "X\0\u06d3\u06d4\3\u00b2Y\0\u06d4\u00af\1\0\0\0\u06d5\u06d9\5\3\0\0\u06d7"+
	  "\u06da\3\6\3\0\u06d9\u06d7\1\0\0\0\u06d9\u06da\1\0\0\0\u06da\u06db\1"+
	  "\0\0\0\u06db\u06dd\5\u009b\0\0\u06dd\u06df\5)\0\0\u06df\u06e0\3\u00d4"+
	  "j\0\u06e0\u00b1\1\0\0\0\u06e1\u06e4\3\u00b4Z\0\u06e3\u06e1\1\0\0\0\u06e3"+
	  "\u06e4\1\0\0\0\u06e4\u06e5\1\0\0\0\u06e5\u06e9\3\u00c8d\0\u06e7\u06ea"+
	  "\3\u00ceg\0\u06e9\u06e7\1\0\0\0\u06e9\u06ea\1\0\0\0\u06ea\u00b3\1\0\0"+
	  "\0\u06eb\u06f1\3\u00b6[\0\u06ed\u06f0\3\u00b6[\0\u06ef\u06ed\1\0\0\0"+
	  "\u06f0\u06f3\1\0\0\0\u06f1\u06ef\1\0\0\0\u06f1\u06f2\1\0\0\0\u06f2\u00b5"+
	  "\1\0\0\0\u06f3\u06f1\1\0\0\0\u06f4\u0701\3\u00b0X\0\u06f6\u0701\3\u00b8"+
	  "\\\0\u06f8\u0701\3\u00ba]\0\u06fa\u0701\3\u00bc^\0\u06fc\u0701\3\u00be"+
	  "_\0\u06fe\u0701\3\u00c0`\0\u0700\u06f4\1\0\0\0\u0700\u06f6\1\0\0\0\u0700"+
	  "\u06f8\1\0\0\0\u0700\u06fa\1\0\0\0\u0700\u06fc\1\0\0\0\u0700\u06fe\1"+
	  "\0\0\0\u0701\u00b7\1\0\0\0\u0702\u0704\58\0\0\u0704\u0706\5\u009b\0\0"+
	  "\u0706\u0708\5h\0\0\u0708\u0709\3\u00d4j\0\u0709\u00b9\1\0\0\0\u070a"+
	  "\u070c\5J\0\0\u070c\u070d\3\u00dam\0\u070d\u00bb\1\0\0\0\u070e\u0712"+
	  "\5p\0\0\u0710\u0713\3\6\3\0\u0712\u0710\1\0\0\0\u0712\u0713\1\0\0\0\u0713"+
	  "\u0714\1\0\0\0\u0714\u0716\5\u009b\0\0\u0716\u0718\5)\0\0\u0718\u071a"+
	  "\3\u00d4j\0\u071a\u071c\5\27\0\0\u071c\u071e\3\u00d4j\0\u071e\u0720\5"+
	  "\u0080\0\0\u0720\u0721\3\u00d4j\0\u0721\u00bd\1\0\0\0\u0722\u0726\5p"+
	  "\0\0\u0724\u0727\3\6\3\0\u0726\u0724\1\0\0\0\u0726\u0727\1\0\0\0\u0727"+
	  "\u0728\1\0\0\0\u0728\u072a\5\u009b\0\0\u072a\u072c\5)\0\0\u072c\u072e"+
	  "\3\u00d4j\0\u072e\u0730\5\27\0\0\u0730\u0732\3\u00d4j\0\u0732\u0734\5"+
	  "\u0080\0\0\u0734\u0736\3\u00d4j\0\u0736\u0738\5Q\0\0\u0738\u0739\5\u009b"+
	  "\0\0\u0739\u00bf\1\0\0\0\u073a\u073c\5\64\0\0\u073c\u073d\3\u00c2a\0"+
	  "\u073d\u00c1\1\0\0\0\u073e\u0746\3\u00c4b\0\u0740\u0742\5*\0\0\u0742"+
	  "\u0745\3\u00c4b\0\u0744\u0740\1\0\0\0\u0745\u0748\1\0\0\0\u0746\u0744"+
	  "\1\0\0\0\u0746\u0747\1\0\0\0\u0747\u00c3\1\0\0\0\u0748\u0746\1\0\0\0"+
	  "\u0749\u074d\3\u00d4j\0\u074b\u074e\3\u00c6c\0\u074d\u074b\1\0\0\0\u074d"+
	  "\u074e\1\0\0\0\u074e\u00c5\1\0\0\0\u074f\u0754\5\u0084\0\0\u0751\u0754"+
	  "\5\26\0\0\u0753\u074f\1\0\0\0\u0753\u0751\1\0\0\0\u0754\u00c7\1\0\0\0"+
	  "\u0755\u075a\3\u00cae\0\u0757\u075a\3\u00ccf\0\u0759\u0755\1\0\0\0\u0759"+
	  "\u0757\1\0\0\0\u075a\u00c9\1\0\0\0\u075b\u075d\5(\0\0\u075d\u075e\3\u00d4"+
	  "j\0\u075e\u00cb\1\0\0\0\u075f\u0761\5\33\0\0\u0761\u0763\3\u00d4j\0\u0763"+
	  "\u0765\5\f\0\0\u0765\u0766\3\u00d4j\0\u0766\u00cd\1\0\0\0\u0767\u0769"+
	  "\5Q\0\0\u0769\u076b\5\u009b\0\0\u076b\u076c\3\u00b2Y\0\u076c\u00cf\1"+
	  "\0\0\0\u076d\u076f\3x<\0\u076f\u0771\3\u00d2i\0\u0771\u0772\3\u00d4j"+
	  "\0\u0772\u00d1\1\0\0\0\u0773\u078a\5h\0\0\u0775\u078a\5\67\0\0\u0777"+
	  "\u078a\5&\0\0\u0779\u078a\5\25\0\0\u077b\u078a\5I\0\0\u077d\u078a\5G"+
	  "\0\0\u077f\u078a\5z\0\0\u0781\u078a\5m\0\0\u0783\u078a\59\0\0\u0785\u078a"+
	  "\5r\0\0\u0787\u078a\5\u00a4\0\0\u0789\u0773\1\0\0\0\u0789\u0775\1\0\0"+
	  "\0\u0789\u0777\1\0\0\0\u0789\u0779\1\0\0\0\u0789\u077b\1\0\0\0\u0789"+
	  "\u077d\1\0\0\0\u0789\u077f\1\0\0\0\u0789\u0781\1\0\0\0\u0789\u0783\1"+
	  "\0\0\0\u0789\u0785\1\0\0\0\u0789\u0787\1\0\0\0\u078a\u00d3\1\0\0\0\u078b"+
	  "\u0790\3\u00d6k\0\u078d\u0790\3\u00d0h\0\u078f\u078b\1\0\0\0\u078f\u078d"+
	  "\1\0\0\0\u0790\u00d5\1\0\0\0\u0791\u0798\3\u0096K\0\u0793\u0798\3\u0098"+
	  "L\0\u0795\u0798\3\u00aeW\0\u0797\u0791\1\0\0\0\u0797\u0793\1\0\0\0\u0797"+
	  "\u0795\1\0\0\0\u0798\u00d7\1\0\0\0\u0799\u079a\3\u00d4j\0\u079a\u00d9"+
	  "\1\0\0\0\u079b\u079c\3\u00d4j\0\u079c\u00db\1\0\0\0\u079d\u07a4\3\u00e6"+
	  "s\0\u079f\u07a4\3\u00e8t\0\u07a1\u07a4\3\u00deo\0\u07a3\u079d\1\0\0\0"+
	  "\u07a3\u079f\1\0\0\0\u07a3\u07a1\1\0\0\0\u07a4\u00dd\1\0\0\0\u07a5\u07c0"+
	  "\3\u00e0p\0\u07a7\u07c0\3\u00e4r\0\u07a9\u07c0\3\u00f6{\0\u07ab\u07c0"+
	  "\3\u00fa}\0\u07ad\u07c0\3\u010a\u0085\0\u07af\u07c0\3\u011c\u008e\0\u07b1"+
	  "\u07c0\3\u0128\u0094\0\u07b3\u07c0\3\u0134\u009a\0\u07b5\u07c0\3\u0136"+
	  "\u009b\0\u07b7\u07c0\3\u0138\u009c\0\u07b9\u07c0\3\u013a\u009d\0\u07bb"+
	  "\u07c0\3\u013e\u009f\0\u07bd\u07c0\3\u028a\u0145\0\u07bf\u07a5\1\0\0"+
	  "\0\u07bf\u07a7\1\0\0\0\u07bf\u07a9\1\0\0\0\u07bf\u07ab\1\0\0\0\u07bf"+
	  "\u07ad\1\0\0\0\u07bf\u07af\1\0\0\0\u07bf\u07b1\1\0\0\0\u07bf\u07b3\1"+
	  "\0\0\0\u07bf\u07b5\1\0\0\0\u07bf\u07b7\1\0\0\0\u07bf\u07b9\1\0\0\0\u07bf"+
	  "\u07bb\1\0\0\0\u07bf\u07bd\1\0\0\0\u07c0\u00df\1\0\0\0\u07c1\u07c5\5"+
	  "~\0\0\u07c3\u07c6\3\u00e2q\0\u07c5\u07c3\1\0\0\0\u07c5\u07c6\1\0\0\0"+
	  "\u07c6\u07c7\1\0\0\0\u07c7\u07c8\5\20\0\0\u07c8\u00e1\1\0\0\0\u07c9\u07cf"+
	  "\3\u00dcn\0\u07cb\u07ce\3\u00dcn\0\u07cd\u07cb\1\0\0\0\u07ce\u07d1\1"+
	  "\0\0\0\u07cf\u07cd\1\0\0\0\u07cf\u07d0\1\0\0\0\u07d0\u00e3\1\0\0\0\u07d1"+
	  "\u07cf\1\0\0\0\u07d2\u07d3\5\u008f\0\0\u07d3\u00e5\1\0\0\0\u07d4\u07d6"+
	  "\5\u009b\0\0\u07d6\u07d8\5y\0\0\u07d8\u07d9\3\u00dcn\0\u07d9\u00e7\1"+
	  "\0\0\0\u07da\u07dc\3\u00eau\0\u07dc\u07dd\5\u008f\0\0\u07dd\u07e3\1\0"+
	  "\0\0\u07de\u07e0\3\u00f4z\0\u07e0\u07e1\5\u008f\0\0\u07e1\u07e3\1\0\0"+
	  "\0\u07e2\u07da\1\0\0\0\u07e2\u07de\1\0\0\0\u07e3\u00e9\1\0\0\0\u07e4"+
	  "\u07e6\3\u00ecv\0\u07e6\u07e7\3\u00eew\0\u07e7\u00eb\1\0\0\0\u07e8\u07ed"+
	  "\3\6\3\0\u07ea\u07ed\5|\0\0\u07ec\u07e8\1\0\0\0\u07ec\u07ea\1\0\0\0\u07ed"+
	  "\u00ed\1\0\0\0\u07ee\u07f6\3\u00f0x\0\u07f0\u07f2\5*\0\0\u07f2\u07f5"+
	  "\3\u00f0x\0\u07f4\u07f0\1\0\0\0\u07f5\u07f8\1\0\0\0\u07f6\u07f4\1\0\0"+
	  "\0\u07f6\u07f7\1\0\0\0\u07f7\u00ef\1\0\0\0\u07f8\u07f6\1\0\0\0\u07f9"+
	  "\u0802\5\u009b\0\0\u07fb\u07fd\5\u009b\0\0\u07fd\u07ff\5h\0\0\u07ff\u0802"+
	  "\3\u00f2y\0\u0801\u07f9\1\0\0\0\u0801\u07fb\1\0\0\0\u0802\u00f1\1\0\0"+
	  "\0\u0803\u080a\3\u00d4j\0\u0805\u080a\3\u0214\u010a\0\u0807\u080a\3\u02b8"+
	  "\u015c\0\u0809\u0803\1\0\0\0\u0809\u0805\1\0\0\0\u0809\u0807\1\0\0\0"+
	  "\u080a\u00f3\1\0\0\0\u080b\u080d\5k\0\0\u080d\u080f\3\6\3\0\u080f\u0810"+
	  "\3\u0184\u00c2\0\u0810\u00f5\1\0\0\0\u0811\u0813\3\u00f8|\0\u0813\u0814"+
	  "\5\u008f\0\0\u0814\u00f7\1\0\0\0\u0815\u0824\3>\37\0\u0817\u0824\3L&"+
	  "\0\u0819\u0824\3\u00d0h\0\u081b\u0824\3H$\0\u081d\u0824\3J%\0\u081f\u0824"+
	  "\3z=\0\u0821\u0824\3|>\0\u0823\u0815\1\0\0\0\u0823\u0817\1\0\0\0\u0823"+
	  "\u0819\1\0\0\0\u0823\u081b\1\0\0\0\u0823\u081d\1\0\0\0\u0823\u081f\1"+
	  "\0\0\0\u0823\u0821\1\0\0\0\u0824\u00f9\1\0\0\0\u0825\u082a\3\u00fc~\0"+
	  "\u0827\u082a\3\u00fe\177\0\u0829\u0825\1\0\0\0\u0829\u0827\1\0\0\0\u082a"+
	  "\u00fb\1\0\0\0\u082b\u082d\5-\0\0\u082d\u082f\5w\0\0\u082f\u0831\3\u00da"+
	  "m\0\u0831\u0833\5\30\0\0\u0833\u0834\3\u00deo\0\u0834\u0844\1\0\0\0\u0835"+
	  "\u0837\5-\0\0\u0837\u0839\5w\0\0\u0839\u083b\3\u00dam\0\u083b\u083d\5"+
	  "\30\0\0\u083d\u083f\3\u00deo\0\u083f\u0841\5;\0\0\u0841\u0842\3\u00de"+
	  "o\0\u0842\u0844\1\0\0\0\u0843\u082b\1\0\0\0\u0843\u0835\1\0\0\0\u0844"+
	  "\u00fd\1\0\0\0\u0845\u0847\5H\0\0\u0847\u0849\5w\0\0\u0849\u084b\3\u00d4"+
	  "j\0\u084b\u084d\5\30\0\0\u084d\u084e\3\u0100\u0080\0\u084e\u00ff\1\0"+
	  "\0\0\u084f\u0853\5~\0\0\u0851\u0854\3\u0102\u0081\0\u0853\u0851\1\0\0"+
	  "\0\u0853\u0854\1\0\0\0\u0854\u0855\1\0\0\0\u0855\u0856\5\20\0\0\u0856"+
	  "\u0101\1\0\0\0\u0857\u085d\3\u0104\u0082\0\u0859\u085c\3\u0104\u0082"+
	  "\0\u085b\u0859\1\0\0\0\u085c\u085f\1\0\0\0\u085d\u085b\1\0\0\0\u085d"+
	  "\u085e\1\0\0\0\u085e\u0103\1\0\0\0\u085f\u085d\1\0\0\0\u0860\u0862\3"+
	  "\u0106\u0083\0\u0862\u0863\3\u00e2q\0\u0863\u0105\1\0\0\0\u0864\u086a"+
	  "\3\u0108\u0084\0\u0866\u0869\3\u0108\u0084\0\u0868\u0866\1\0\0\0\u0869"+
	  "\u086c\1\0\0\0\u086a\u0868\1\0\0\0\u086a\u086b\1\0\0\0\u086b\u0107\1"+
	  "\0\0\0\u086c\u086a\1\0\0\0\u086d\u086f\5^\0\0\u086f\u0871\3\u00d8l\0"+
	  "\u0871\u0872\5y\0\0\u0872\u0878\1\0\0\0\u0873\u0875\5u\0\0\u0875\u0878"+
	  "\5y\0\0\u0877\u086d\1\0\0\0\u0877\u0873\1\0\0\0\u0878\u0109\1\0\0\0\u0879"+
	  "\u0882\3\u010c\u0086\0\u087b\u0882\3\u010e\u0087\0\u087d\u0882\3\u0110"+
	  "\u0088\0\u087f\u0882\3\u011a\u008d\0\u0881\u0879\1\0\0\0\u0881\u087b"+
	  "\1\0\0\0\u0881\u087d\1\0\0\0\u0881\u087f\1\0\0\0\u0882\u010b\1\0\0\0"+
	  "\u0883\u0885\5+\0\0\u0885\u0887\5w\0\0\u0887\u0889\3\u00dam\0\u0889\u088b"+
	  "\5\30\0\0\u088b\u088c\3\u00deo\0\u088c\u010d\1\0\0\0\u088d\u088f\5\23"+
	  "\0\0\u088f\u0891\3\u00deo\0\u0891\u0893\5+\0\0\u0893\u0895\5w\0\0\u0895"+
	  "\u0897\3\u00dam\0\u0897\u0899\5\30\0\0\u0899\u089a\5\u008f\0\0\u089a"+
	  "\u010f\1\0\0\0\u089b\u089d\5\u0089\0\0\u089d\u08a1\5w\0\0\u089f\u08a2"+
	  "\3\u0112\u0089\0\u08a1\u089f\1\0\0\0\u08a1\u08a2\1\0\0\0\u08a2\u08a3"+
	  "\1\0\0\0\u08a3\u08a7\5\u008f\0\0\u08a5\u08a8\3\u0114\u008a\0\u08a7\u08a5"+
	  "\1\0\0\0\u08a7\u08a8\1\0\0\0\u08a8\u08a9\1\0\0\0\u08a9\u08ad\5\u008f"+
	  "\0\0\u08ab\u08ae\3\u0116\u008b\0\u08ad\u08ab\1\0\0\0\u08ad\u08ae\1\0"+
	  "\0\0\u08ae\u08af\1\0\0\0\u08af\u08b1\5\30\0\0\u08b1\u08b2\3\u00deo\0"+
	  "\u08b2\u0111\1\0\0\0\u08b3\u08b8\3\u00eau\0\u08b5\u08b8\3\u0118\u008c"+
	  "\0\u08b7\u08b3\1\0\0\0\u08b7\u08b5\1\0\0\0\u08b8\u0113\1\0\0\0\u08b9"+
	  "\u08ba\3\u00dam\0\u08ba\u0115\1\0\0\0\u08bb\u08bc\3\u0118\u008c\0\u08bc"+
	  "\u0117\1\0\0\0\u08bd\u08c5\3\u00f8|\0\u08bf\u08c1\5*\0\0\u08c1\u08c4"+
	  "\3\u00f8|\0\u08c3\u08bf\1\0\0\0\u08c4\u08c7\1\0\0\0\u08c5\u08c3\1\0\0"+
	  "\0\u08c5\u08c6\1\0\0\0\u08c6\u0119\1\0\0\0\u08c7\u08c5\1\0\0\0\u08c8"+
	  "\u08ca\5\"\0\0\u08ca\u08cc\5w\0\0\u08cc\u08ce\3\u00ecv\0\u08ce\u08d0"+
	  "\5\u009b\0\0\u08d0\u08d2\5)\0\0\u08d2\u08d4\3\u00d4j\0\u08d4\u08d6\5"+
	  "\30\0\0\u08d6\u08d7\3\u00deo\0\u08d7\u011b\1\0\0\0\u08d8\u08e3\3\u011e"+
	  "\u008f\0\u08da\u08e3\3\u0120\u0090\0\u08dc\u08e3\3\u0122\u0091\0\u08de"+
	  "\u08e3\3\u0124\u0092\0\u08e0\u08e3\3\u0126\u0093\0\u08e2\u08d8\1\0\0"+
	  "\0\u08e2\u08da\1\0\0\0\u08e2\u08dc\1\0\0\0\u08e2\u08de\1\0\0\0\u08e2"+
	  "\u08e0\1\0\0\0\u08e3\u011d\1\0\0\0\u08e4\u08e6\5\66\0\0\u08e6\u08e7\5"+
	  "\u008f\0\0\u08e7\u011f\1\0\0\0\u08e8\u08ea\5V\0\0\u08ea\u08eb\5\u008f"+
	  "\0\0\u08eb\u0121\1\0\0\0\u08ec\u08ee\5\34\0\0\u08ee\u08f0\5\u009b\0\0"+
	  "\u08f0\u0901\5\u008f\0\0\u08f2\u08f4\5\34\0\0\u08f4\u08f6\5^\0\0\u08f6"+
	  "\u08f8\3\u00d8l\0\u08f8\u08f9\5\u008f\0\0\u08f9\u0901\1\0\0\0\u08fa\u08fc"+
	  "\5\34\0\0\u08fc\u08fe\5u\0\0\u08fe\u0901\5\u008f\0\0\u0900\u08ec\1\0"+
	  "\0\0\u0900\u08f2\1\0\0\0\u0900\u08fa\1\0\0\0\u0901\u0123\1\0\0\0\u0902"+
	  "\u0906\5\u008d\0\0\u0904\u0907\3\u00d4j\0\u0906\u0904\1\0\0\0\u0906\u0907"+
	  "\1\0\0\0\u0907\u0908\1\0\0\0\u0908\u0909\5\u008f\0\0\u0909\u0125\1\0"+
	  "\0\0\u090a\u090e\5\32\0\0\u090c\u090f\3\u00d4j\0\u090e\u090c\1\0\0\0"+
	  "\u090e\u090f\1\0\0\0\u090f\u0910\1\0\0\0\u0910\u0911\5\u008f\0\0\u0911"+
	  "\u0127\1\0\0\0\u0912\u0914\5}\0\0\u0914\u0916\3\u00e0p\0\u0916\u0917"+
	  "\3\u012a\u0095\0\u0917\u0927\1\0\0\0\u0918\u091a\5}\0\0\u091a\u091c\3"+
	  "\u00e0p\0\u091c\u091d\3\u0132\u0099\0\u091d\u0927\1\0\0\0\u091e\u0920"+
	  "\5}\0\0\u0920\u0922\3\u00e0p\0\u0922\u0924\3\u012a\u0095\0\u0924\u0925"+
	  "\3\u0132\u0099\0\u0925\u0927\1\0\0\0\u0926\u0912\1\0\0\0\u0926\u0918"+
	  "\1\0\0\0\u0926\u091e\1\0\0\0\u0927\u0129\1\0\0\0\u0928\u092c\3\u012c"+
	  "\u0096\0\u092a\u092d\3\u0130\u0098\0\u092c\u092a\1\0\0\0\u092c\u092d"+
	  "\1\0\0\0\u092d\u0935\1\0\0\0\u092e\u0931\3\u012c\u0096\0\u0930\u092e"+
	  "\1\0\0\0\u0930\u0931\1\0\0\0\u0931\u0932\1\0\0\0\u0932\u0935\3\u0130"+
	  "\u0098\0\u0934\u0928\1\0\0\0\u0934\u0930\1\0\0\0\u0935\u012b\1\0\0\0"+
	  "\u0936\u093c\3\u012e\u0097\0\u0938\u093b\3\u012e\u0097\0\u093a\u0938"+
	  "\1\0\0\0\u093b\u093e\1\0\0\0\u093c\u093a\1\0\0\0\u093c\u093d\1\0\0\0"+
	  "\u093d\u012d\1\0\0\0\u093e\u093c\1\0\0\0\u093f\u0941\5\u0081\0\0\u0941"+
	  "\u0943\5w\0\0\u0943\u0947\3\34\16\0\u0945\u0948\5\u009b\0\0\u0947\u0945"+
	  "\1\0\0\0\u0947\u0948\1\0\0\0\u0948\u0949\1\0\0\0\u0949\u094b\5\30\0\0"+
	  "\u094b\u094c\3\u00e0p\0\u094c\u012f\1\0\0\0\u094d\u094f\5\u0081\0\0\u094f"+
	  "\u0950\3\u00e0p\0\u0950\u0131\1\0\0\0\u0951\u0953\5o\0\0\u0953\u0954"+
	  "\3\u00e0p\0\u0954\u0133\1\0\0\0\u0955\u0957\5S\0\0\u0957\u0958\3\u00e0"+
	  "p\0\u0958\u0135\1\0\0\0\u0959\u095b\5\24\0\0\u095b\u095c\3\u00e0p\0\u095c"+
	  "\u0137\1\0\0\0\u095d\u095f\5\u0087\0\0\u095f\u0961\5w\0\0\u0961\u0963"+
	  "\3\u00d4j\0\u0963\u0965\5\30\0\0\u0965\u0966\3\u00deo\0\u0966\u0139\1"+
	  "\0\0\0\u0967\u0969\5t\0\0\u0969\u096b\5w\0\0\u096b\u096d\3\u013c\u009e"+
	  "\0\u096d\u096f\5\30\0\0\u096f\u0970\3\u00deo\0\u0970\u013b\1\0\0\0\u0971"+
	  "\u0976\3\u00eau\0\u0973\u0976\3\u00d4j\0\u0975\u0971\1\0\0\0\u0975\u0973"+
	  "\1\0\0\0\u0976\u013d\1\0\0\0\u0977\u0979\5\6\0\0\u0979\u097b\5\u008d"+
	  "\0\0\u097b\u097d\3\u00d4j\0\u097d\u097e\5\u008f\0\0\u097e\u0986\1\0\0"+
	  "\0\u097f\u0981\5\6\0\0\u0981\u0983\5\66\0\0\u0983\u0986\5\u008f\0\0\u0985"+
	  "\u0977\1\0\0\0\u0985\u097f\1\0\0\0\u0986\u013f\1\0\0\0\u0987\u098a\3"+
	  "\u0148\u00a4\0\u0989\u0987\1\0\0\0\u0989\u098a\1\0\0\0\u098a\u098d\1"+
	  "\0\0\0\u098b\u098e\3\u014c\u00a6\0\u098d\u098b\1\0\0\0\u098d\u098e\1"+
	  "\0\0\0\u098e\u0991\1\0\0\0\u098f\u0992\3\u024a\u0125\0\u0991\u098f\1"+
	  "\0\0\0\u0991\u0992\1\0\0\0\u0992\u0995\1\0\0\0\u0993\u0996\3\u0154\u00aa"+
	  "\0\u0995\u0993\1\0\0\0\u0995\u0996\1\0\0\0\u0996\u0141\1\0\0\0\u0997"+
	  "\u0999\5\13\0\0\u0999\u099b\3\u0144\u00a2\0\u099b\u099f\3\u0146\u00a3"+
	  "\0\u099d\u09a0\5\u008f\0\0\u099f\u099d\1\0\0\0\u099f\u09a0\1\0\0\0\u09a0"+
	  "\u0143\1\0\0\0\u09a1\u09a9\5\u009b\0\0\u09a3\u09a5\5A\0\0\u09a5\u09a8"+
	  "\5\u009b\0\0\u09a7\u09a3\1\0\0\0\u09a8\u09ab\1\0\0\0\u09a9\u09a7\1\0"+
	  "\0\0\u09a9\u09aa\1\0\0\0\u09aa\u0145\1\0\0\0\u09ab\u09a9\1\0\0\0\u09ac"+
	  "\u09b0\5~\0\0\u09ae\u09b1\3\u0148\u00a4\0\u09b0\u09ae\1\0\0\0\u09b0\u09b1"+
	  "\1\0\0\0\u09b1\u09b4\1\0\0\0\u09b2\u09b5\3\u014c\u00a6\0\u09b4\u09b2"+
	  "\1\0\0\0\u09b4\u09b5\1\0\0\0\u09b5\u09b8\1\0\0\0\u09b6\u09b9\3\u0154"+
	  "\u00aa\0\u09b8\u09b6\1\0\0\0\u09b8\u09b9\1\0\0\0\u09b9\u09ba\1\0\0\0"+
	  "\u09ba\u09bb\5\20\0\0\u09bb\u0147\1\0\0\0\u09bc\u09c2\3\u014a\u00a5\0"+
	  "\u09be\u09c1\3\u014a\u00a5\0\u09c0\u09be\1\0\0\0\u09c1\u09c4\1\0\0\0"+
	  "\u09c2\u09c0\1\0\0\0\u09c2\u09c3\1\0\0\0\u09c3\u0149\1\0\0\0\u09c4\u09c2"+
	  "\1\0\0\0\u09c5\u09c7\5B\0\0\u09c7\u09c9\5j\0\0\u09c9\u09cb\5\u009b\0"+
	  "\0\u09cb\u09cc\5\u008f\0\0\u09cc\u014b\1\0\0\0\u09cd\u09d3\3\u014e\u00a7"+
	  "\0\u09cf\u09d2\3\u014e\u00a7\0\u09d1\u09cf\1\0\0\0\u09d2\u09d5\1\0\0"+
	  "\0\u09d3\u09d1\1\0\0\0\u09d3\u09d4\1\0\0\0\u09d4\u014d\1\0\0\0\u09d5"+
	  "\u09d3\1\0\0\0\u09d6\u09db\3\u0150\u00a8\0\u09d8\u09db\3\u0152\u00a9"+
	  "\0\u09da\u09d6\1\0\0\0\u09da\u09d8\1\0\0\0\u09db\u014f\1\0\0\0\u09dc"+
	  "\u09de\5t\0\0\u09de\u09e0\5\u009b\0\0\u09e0\u09e2\5h\0\0\u09e2\u09e4"+
	  "\3\4\2\0\u09e4\u09e5\5\u008f\0\0\u09e5\u0151\1\0\0\0\u09e6\u09e8\5t\0"+
	  "\0\u09e8\u09ea\3\0\0\0\u09ea\u09eb\5\u008f\0\0\u09eb\u0153\1\0\0\0\u09ec"+
	  "\u09f2\3\u0156\u00ab\0\u09ee\u09f1\3\u0156\u00ab\0\u09f0\u09ee\1\0\0"+
	  "\0\u09f1\u09f4\1\0\0\0\u09f2\u09f0\1\0\0\0\u09f2\u09f3\1\0\0\0\u09f3"+
	  "\u0155\1\0\0\0\u09f4\u09f2\1\0\0\0\u09f5\u09fa\3\u0142\u00a1\0\u09f7"+
	  "\u09fa\3\u0158\u00ac\0\u09f9\u09f5\1\0\0\0\u09f9\u09f7\1\0\0\0\u09fa"+
	  "\u0157\1\0\0\0\u09fb\u0a06\3\u015c\u00ae\0\u09fd\u0a06\3\u01fc\u00fe"+
	  "\0\u09ff\u0a06\3\u0218\u010c\0\u0a01\u0a06\3\u0236\u011b\0\u0a03\u0a06"+
	  "\3\u0244\u0122\0\u0a05\u09fb\1\0\0\0\u0a05\u09fd\1\0\0\0\u0a05\u09ff"+
	  "\1\0\0\0\u0a05\u0a01\1\0\0\0\u0a05\u0a03\1\0\0\0\u0a06\u0159\1\0\0\0"+
	  "\u0a07\u0a09\5\u009b\0\0\u0a09\u0a0b\5\31\0\0\u0a0b\u0a0f\5\u009b\0\0"+
	  "\u0a0d\u0a10\3\"\21\0\u0a0f\u0a0d\1\0\0\0\u0a0f\u0a10\1\0\0\0\u0a10\u015b"+
	  "\1\0\0\0\u0a11\u0a14\3\u0254\u012a\0\u0a13\u0a11\1\0\0\0\u0a13\u0a14"+
	  "\1\0\0\0\u0a14\u0a17\1\0\0\0\u0a15\u0a18\3\u015e\u00af\0\u0a17\u0a15"+
	  "\1\0\0\0\u0a17\u0a18\1\0\0\0\u0a18\u0a1b\1\0\0\0\u0a19\u0a1c\5\r\0\0"+
	  "\u0a1b\u0a19\1\0\0\0\u0a1b\u0a1c\1\0\0\0\u0a1c\u0a1d\1\0\0\0\u0a1d\u0a1f"+
	  "\5\37\0\0\u0a1f\u0a23\5\u009b\0\0\u0a21\u0a24\3\u0162\u00b1\0\u0a23\u0a21"+
	  "\1\0\0\0\u0a23\u0a24\1\0\0\0\u0a24\u0a27\1\0\0\0\u0a25\u0a28\3\u0168"+
	  "\u00b4\0\u0a27\u0a25\1\0\0\0\u0a27\u0a28\1\0\0\0\u0a28\u0a2b\1\0\0\0"+
	  "\u0a29\u0a2c\3\u016c\u00b6\0\u0a2b\u0a29\1\0\0\0\u0a2b\u0a2c\1\0\0\0"+
	  "\u0a2c\u0a2d\1\0\0\0\u0a2d\u0a31\3\u0178\u00bc\0\u0a2f\u0a32\5\u008f"+
	  "\0\0\u0a31\u0a2f\1\0\0\0\u0a31\u0a32\1\0\0\0\u0a32\u015d\1\0\0\0\u0a33"+
	  "\u0a39\3\u0160\u00b0\0\u0a35\u0a38\3\u0160\u00b0\0\u0a37\u0a35\1\0\0"+
	  "\0\u0a38\u0a3b\1\0\0\0\u0a39\u0a37\1\0\0\0\u0a39\u0a3a\1\0\0\0\u0a3a"+
	  "\u015f\1\0\0\0\u0a3b\u0a39\1\0\0\0\u0a3c\u0a4f\5n\0\0\u0a3e\u0a4f\5v"+
	  "\0\0\u0a40\u0a4f\5\u008a\0\0\u0a42\u0a4f\5N\0\0\u0a44\u0a4f\5\60\0\0"+
	  "\u0a46\u0a4f\5\16\0\0\u0a48\u0a4f\5\u008b\0\0\u0a4a\u0a4f\5\u0083\0\0"+
	  "\u0a4c\u0a4f\3\u0270\u0138\0\u0a4e\u0a3c\1\0\0\0\u0a4e\u0a3e\1\0\0\0"+
	  "\u0a4e\u0a40\1\0\0\0\u0a4e\u0a42\1\0\0\0\u0a4e\u0a44\1\0\0\0\u0a4e\u0a46"+
	  "\1\0\0\0\u0a4e\u0a48\1\0\0\0\u0a4e\u0a4a\1\0\0\0\u0a4e\u0a4c\1\0\0\0"+
	  "\u0a4f\u0161\1\0\0\0\u0a50\u0a52\5T\0\0\u0a52\u0a54\3\u0164\u00b2\0\u0a54"+
	  "\u0a55\5F\0\0\u0a55\u0163\1\0\0\0\u0a56\u0a59\3\u0254\u012a\0\u0a58\u0a56"+
	  "\1\0\0\0\u0a58\u0a59\1\0\0\0\u0a59\u0a5a\1\0\0\0\u0a5a\u0a66\3\u0166"+
	  "\u00b3\0\u0a5c\u0a60\5*\0\0\u0a5e\u0a61\3\u0254\u012a\0\u0a60\u0a5e\1"+
	  "\0\0\0\u0a60\u0a61\1\0\0\0\u0a61\u0a62\1\0\0\0\u0a62\u0a65\3\u0166\u00b3"+
	  "\0\u0a64\u0a5c\1\0\0\0\u0a65\u0a68\1\0\0\0\u0a66\u0a64\1\0\0\0\u0a66"+
	  "\u0a67\1\0\0\0\u0a67\u0165\1\0\0\0\u0a68\u0a66\1\0\0\0\u0a69\u0a6a\5"+
	  "\u009b\0\0\u0a6a\u0167\1\0\0\0\u0a6b\u0a6d\5y\0\0\u0a6d\u0a7c\3\34\16"+
	  "\0\u0a6f\u0a71\5y\0\0\u0a71\u0a7c\3\u016a\u00b5\0\u0a73\u0a75\5y\0\0"+
	  "\u0a75\u0a77\3\34\16\0\u0a77\u0a79\5*\0\0\u0a79\u0a7a\3\u016a\u00b5\0"+
	  "\u0a7a\u0a7c\1\0\0\0\u0a7b\u0a6b\1\0\0\0\u0a7b\u0a6f\1\0\0\0\u0a7b\u0a73"+
	  "\1\0\0\0\u0a7c\u0169\1\0\0\0\u0a7d\u0a85\3\36\17\0\u0a7f\u0a81\5*\0\0"+
	  "\u0a81\u0a84\3\36\17\0\u0a83\u0a7f\1\0\0\0\u0a84\u0a87\1\0\0\0\u0a85"+
	  "\u0a83\1\0\0\0\u0a85\u0a86\1\0\0\0\u0a86\u016b\1\0\0\0\u0a87\u0a85\1"+
	  "\0\0\0\u0a88\u0a8e\3\u016e\u00b7\0\u0a8a\u0a8d\3\u016e\u00b7\0\u0a8c"+
	  "\u0a8a\1\0\0\0\u0a8d\u0a90\1\0\0\0\u0a8e\u0a8c\1\0\0\0\u0a8e\u0a8f\1"+
	  "\0\0\0\u0a8f\u016d\1\0\0\0\u0a90\u0a8e\1\0\0\0\u0a91\u0a93\5J\0\0\u0a93"+
	  "\u0a95\3\u0166\u00b3\0\u0a95\u0a97\5y\0\0\u0a97\u0a98\3\u0170\u00b8\0"+
	  "\u0a98\u016f\1\0\0\0\u0a99\u0abc\3\u0172\u00b9\0\u0a9b\u0abc\3\u0174"+
	  "\u00ba\0\u0a9d\u0abc\3\u0176\u00bb\0\u0a9f\u0aa1\3\u0172\u00b9\0\u0aa1"+
	  "\u0aa3\5*\0\0\u0aa3\u0aa4\3\u0174\u00ba\0\u0aa4\u0abc\1\0\0\0\u0aa5\u0aa7"+
	  "\3\u0172\u00b9\0\u0aa7\u0aa9\5*\0\0\u0aa9\u0aaa\3\u0176\u00bb\0\u0aaa"+
	  "\u0abc\1\0\0\0\u0aab\u0aad\3\u0174\u00ba\0\u0aad\u0aaf\5*\0\0\u0aaf\u0ab0"+
	  "\3\u0176\u00bb\0\u0ab0\u0abc\1\0\0\0\u0ab1\u0ab3\3\u0172\u00b9\0\u0ab3"+
	  "\u0ab5\5*\0\0\u0ab5\u0ab7\3\u0174\u00ba\0\u0ab7\u0ab9\5*\0\0\u0ab9\u0aba"+
	  "\3\u0176\u00bb\0\u0aba\u0abc\1\0\0\0\u0abb\u0a99\1\0\0\0\u0abb\u0a9b"+
	  "\1\0\0\0\u0abb\u0a9d\1\0\0\0\u0abb\u0a9f\1\0\0\0\u0abb\u0aa5\1\0\0\0"+
	  "\u0abb\u0aab\1\0\0\0\u0abb\u0ab1\1\0\0\0\u0abc\u0171\1\0\0\0\u0abd\u0ac4"+
	  "\3\34\16\0\u0abf\u0ac4\5\37\0\0\u0ac1\u0ac4\5>\0\0\u0ac3\u0abd\1\0\0"+
	  "\0\u0ac3\u0abf\1\0\0\0\u0ac3\u0ac1\1\0\0\0\u0ac4\u0173\1\0\0\0\u0ac5"+
	  "\u0aca\3\36\17\0\u0ac7\u0aca\3\u0166\u00b3\0\u0ac9\u0ac5\1\0\0\0\u0ac9"+
	  "\u0ac7\1\0\0\0\u0aca\u0ad5\1\0\0\0\u0acb\u0ad1\5*\0\0\u0acd\u0ad2\3\36"+
	  "\17\0\u0acf\u0ad2\3\u0166\u00b3\0\u0ad1\u0acd\1\0\0\0\u0ad1\u0acf\1\0"+
	  "\0\0\u0ad2\u0ad4\1\0\0\0\u0ad3\u0acb\1\0\0\0\u0ad4\u0ad7\1\0\0\0\u0ad5"+
	  "\u0ad3\1\0\0\0\u0ad5\u0ad6\1\0\0\0\u0ad6\u0175\1\0\0\0\u0ad7\u0ad5\1"+
	  "\0\0\0\u0ad8\u0ada\5n\0\0\u0ada\u0adc\5w\0\0\u0adc\u0add\5\30\0\0\u0add"+
	  "\u0177\1\0\0\0\u0ade\u0ae2\5~\0\0\u0ae0\u0ae3\3\u017a\u00bd\0\u0ae2\u0ae0"+
	  "\1\0\0\0\u0ae2\u0ae3\1\0\0\0\u0ae3\u0ae4\1\0\0\0\u0ae4\u0ae5\5\20\0\0"+
	  "\u0ae5\u0179\1\0\0\0\u0ae6\u0ae9\3\u017c\u00be\0\u0ae8\u0ae6\1\0\0\0"+
	  "\u0ae9\u0aea\1\0\0\0\u0aea\u0ae8\1\0\0\0\u0aea\u0aeb\1\0\0\0\u0aeb\u017b"+
	  "\1\0\0\0\u0aec\u0b03\3\u017e\u00bf\0\u0aee\u0b03\3\u0188\u00c4\0\u0af0"+
	  "\u0b03\3\u0194\u00ca\0\u0af2\u0b03\3\u01ae\u00d7\0\u0af4\u0b03\3\u01be"+
	  "\u00df\0\u0af6\u0b03\3\u01ca\u00e5\0\u0af8\u0b03\3\u01d2\u00e9\0\u0afa"+
	  "\u0b03\3\u01e6\u00f3\0\u0afc\u0b03\3\u01f8\u00fc\0\u0afe\u0b03\3\u01f2"+
	  "\u00f9\0\u0b00\u0b03\3\u0158\u00ac\0\u0b02\u0aec\1\0\0\0\u0b02\u0aee"+
	  "\1\0\0\0\u0b02\u0af0\1\0\0\0\u0b02\u0af2\1\0\0\0\u0b02\u0af4\1\0\0\0"+
	  "\u0b02\u0af6\1\0\0\0\u0b02\u0af8\1\0\0\0\u0b02\u0afa\1\0\0\0\u0b02\u0afc"+
	  "\1\0\0\0\u0b02\u0afe\1\0\0\0\u0b02\u0b00\1\0\0\0\u0b03\u017d\1\0\0\0"+
	  "\u0b04\u0b07\3\u0254\u012a\0\u0b06\u0b04\1\0\0\0\u0b06\u0b07\1\0\0\0"+
	  "\u0b07\u0b0a\1\0\0\0\u0b08\u0b0b\3\u0180\u00c0\0\u0b0a\u0b08\1\0\0\0"+
	  "\u0b0a\u0b0b\1\0\0\0\u0b0b\u0b0c\1\0\0\0\u0b0c\u0b0e\5k\0\0\u0b0e\u0b10"+
	  "\3\6\3\0\u0b10\u0b12\3\u0184\u00c2\0\u0b12\u0b13\5\u008f\0\0\u0b13\u017f"+
	  "\1\0\0\0\u0b14\u0b17\3\u0182\u00c1\0\u0b16\u0b14\1\0\0\0\u0b17\u0b18"+
	  "\1\0\0\0\u0b18\u0b16\1\0\0\0\u0b18\u0b19\1\0\0\0\u0b19\u0181\1\0\0\0"+
	  "\u0b1a\u0b25\5n\0\0\u0b1c\u0b25\5v\0\0\u0b1e\u0b25\5\u008a\0\0\u0b20"+
	  "\u0b25\5N\0\0\u0b22\u0b25\5\60\0\0\u0b24\u0b1a\1\0\0\0\u0b24\u0b1c\1"+
	  "\0\0\0\u0b24\u0b1e\1\0\0\0\u0b24\u0b20\1\0\0\0\u0b24\u0b22\1\0\0\0\u0b25"+
	  "\u0183\1\0\0\0\u0b26\u0b2e\3\u0186\u00c3\0\u0b28\u0b2a\5*\0\0\u0b2a\u0b2d"+
	  "\3\u0186\u00c3\0\u0b2c\u0b28\1\0\0\0\u0b2d\u0b30\1\0\0\0\u0b2e\u0b2c"+
	  "\1\0\0\0\u0b2e\u0b2f\1\0\0\0\u0b2f\u0185\1\0\0\0\u0b30\u0b2e\1\0\0\0"+
	  "\u0b31\u0b33\5\u009b\0\0\u0b33\u0b35\5h\0\0\u0b35\u0b36\3\u00d8l\0\u0b36"+
	  "\u0187\1\0\0\0\u0b37\u0b3a\3\u0254\u012a\0\u0b39\u0b37\1\0\0\0\u0b39"+
	  "\u0b3a\1\0\0\0\u0b3a\u0b3d\1\0\0\0\u0b3b\u0b3e\3\u018a\u00c5\0\u0b3d"+
	  "\u0b3b\1\0\0\0\u0b3d\u0b3e\1\0\0\0\u0b3e\u0b3f\1\0\0\0\u0b3f\u0b41\3"+
	  "\6\3\0\u0b41\u0b43\3\u018e\u00c7\0\u0b43\u0b44\5\u008f\0\0\u0b44\u0189"+
	  "\1\0\0\0\u0b45\u0b4b\3\u018c\u00c6\0\u0b47\u0b4a\3\u018c\u00c6\0\u0b49"+
	  "\u0b47\1\0\0\0\u0b4a\u0b4d\1\0\0\0\u0b4b\u0b49\1\0\0\0\u0b4b\u0b4c\1"+
	  "\0\0\0\u0b4c\u018b\1\0\0\0\u0b4d\u0b4b\1\0\0\0\u0b4e\u0b61\5n\0\0\u0b50"+
	  "\u0b61\5v\0\0\u0b52\u0b61\5\u008a\0\0\u0b54\u0b61\5N\0\0\u0b56\u0b61"+
	  "\5\60\0\0\u0b58\u0b61\5\u0083\0\0\u0b5a\u0b61\5\65\0\0\u0b5c\u0b61\5"+
	  "\u0090\0\0\u0b5e\u0b61\3\u0278\u013c\0\u0b60\u0b4e\1\0\0\0\u0b60\u0b50"+
	  "\1\0\0\0\u0b60\u0b52\1\0\0\0\u0b60\u0b54\1\0\0\0\u0b60\u0b56\1\0\0\0"+
	  "\u0b60\u0b58\1\0\0\0\u0b60\u0b5a\1\0\0\0\u0b60\u0b5c\1\0\0\0\u0b60\u0b5e"+
	  "\1\0\0\0\u0b61\u018d\1\0\0\0\u0b62\u0b6a\3\u0190\u00c8\0\u0b64\u0b66"+
	  "\5*\0\0\u0b66\u0b69\3\u0190\u00c8\0\u0b68\u0b64\1\0\0\0\u0b69\u0b6c\1"+
	  "\0\0\0\u0b6a\u0b68\1\0\0\0\u0b6a\u0b6b\1\0\0\0\u0b6b\u018f\1\0\0\0\u0b6c"+
	  "\u0b6a\1\0\0\0\u0b6d\u0b76\5\u009b\0\0\u0b6f\u0b71\5\u009b\0\0\u0b71"+
	  "\u0b73\5h\0\0\u0b73\u0b76\3\u0192\u00c9\0\u0b75\u0b6d\1\0\0\0\u0b75\u0b6f"+
	  "\1\0\0\0\u0b76\u0191\1\0\0\0\u0b77\u0b7c\3\u00d4j\0\u0b79\u0b7c\3\u0214"+
	  "\u010a\0\u0b7b\u0b77\1\0\0\0\u0b7b\u0b79\1\0\0\0\u0b7c\u0193\1\0\0\0"+
	  "\u0b7d\u0b7f\3\u0196\u00cb\0\u0b7f\u0b80\3\u01a0\u00d0\0\u0b80\u0195"+
	  "\1\0\0\0\u0b81\u0b84\3\u0254\u012a\0\u0b83\u0b81\1\0\0\0\u0b83\u0b84"+
	  "\1\0\0\0\u0b84\u0b87\1\0\0\0\u0b85\u0b88\3\u0198\u00cc\0\u0b87\u0b85"+
	  "\1\0\0\0\u0b87\u0b88\1\0\0\0\u0b88\u0b8b\1\0\0\0\u0b89\u0b8c\5\r\0\0"+
	  "\u0b8b\u0b89\1\0\0\0\u0b8b\u0b8c\1\0\0\0\u0b8c\u0b8d\1\0\0\0\u0b8d\u0b8f"+
	  "\3\u019c\u00ce\0\u0b8f\u0b93\3\u019e\u00cf\0\u0b91\u0b94\3\u0162\u00b1"+
	  "\0\u0b93\u0b91\1\0\0\0\u0b93\u0b94\1\0\0\0\u0b94\u0b95\1\0\0\0\u0b95"+
	  "\u0b99\5w\0\0\u0b97\u0b9a\3\u01a2\u00d1\0\u0b99\u0b97\1\0\0\0\u0b99\u0b9a"+
	  "\1\0\0\0\u0b9a\u0b9b\1\0\0\0\u0b9b\u0b9f\5\30\0\0\u0b9d\u0ba0\3\u016c"+
	  "\u00b6\0\u0b9f\u0b9d\1\0\0\0\u0b9f\u0ba0\1\0\0\0\u0ba0\u0197\1\0\0\0"+
	  "\u0ba1\u0ba7\3\u019a\u00cd\0\u0ba3\u0ba6\3\u019a\u00cd\0\u0ba5\u0ba3"+
	  "\1\0\0\0\u0ba6\u0ba9\1\0\0\0\u0ba7\u0ba5\1\0\0\0\u0ba7\u0ba8\1\0\0\0"+
	  "\u0ba8\u0199\1\0\0\0\u0ba9\u0ba7\1\0\0\0\u0baa\u0bc3\5n\0\0\u0bac\u0bc3"+
	  "\5v\0\0\u0bae\u0bc3\5\u008a\0\0\u0bb0\u0bc3\5N\0\0\u0bb2\u0bc3\5\60\0"+
	  "\0\u0bb4\u0bc3\5\u0083\0\0\u0bb6\u0bc3\5d\0\0\u0bb8\u0bc3\5\u008b\0\0"+
	  "\u0bba\u0bc3\5\\\0\0\u0bbc\u0bc3\5\16\0\0\u0bbe\u0bc3\5B\0\0\u0bc0\u0bc3"+
	  "\3\u027a\u013d\0\u0bc2\u0baa\1\0\0\0\u0bc2\u0bac\1\0\0\0\u0bc2\u0bae"+
	  "\1\0\0\0\u0bc2\u0bb0\1\0\0\0\u0bc2\u0bb2\1\0\0\0\u0bc2\u0bb4\1\0\0\0"+
	  "\u0bc2\u0bb6\1\0\0\0\u0bc2\u0bb8\1\0\0\0\u0bc2\u0bba\1\0\0\0\u0bc2\u0bbc"+
	  "\1\0\0\0\u0bc2\u0bbe\1\0\0\0\u0bc2\u0bc0\1\0\0\0\u0bc3\u019b\1\0\0\0"+
	  "\u0bc4\u0bc9\3\6\3\0\u0bc6\u0bc9\5\u00aa\0\0\u0bc8\u0bc4\1\0\0\0\u0bc8"+
	  "\u0bc6\1\0\0\0\u0bc9\u019d\1\0\0\0\u0bca\u0bd3\5\u009b\0\0\u0bcc\u0bce"+
	  "\3\36\17\0\u0bce\u0bd0\5A\0\0\u0bd0\u0bd1\5\u009b\0\0\u0bd1\u0bd3\1\0"+
	  "\0\0\u0bd2\u0bca\1\0\0\0\u0bd2\u0bcc\1\0\0\0\u0bd3\u019f\1\0\0\0\u0bd4"+
	  "\u0bd9\3\u00e0p\0\u0bd6\u0bd9\5\u008f\0\0\u0bd8\u0bd4\1\0\0\0\u0bd8\u0bd6"+
	  "\1\0\0\0\u0bd9\u01a1\1\0\0\0\u0bda\u0be5\3\u01a4\u00d2\0\u0bdc\u0bde"+
	  "\3\u01a4\u00d2\0\u0bde\u0be0\5*\0\0\u0be0\u0be1\3\u01ac\u00d6\0\u0be1"+
	  "\u0be5\1\0\0\0\u0be2\u0be5\3\u01ac\u00d6\0\u0be4\u0bda\1\0\0\0\u0be4"+
	  "\u0bdc\1\0\0\0\u0be4\u0be2\1\0\0\0\u0be5\u01a3\1\0\0\0\u0be6\u0bee\3"+
	  "\u01a6\u00d3\0\u0be8\u0bea\5*\0\0\u0bea\u0bed\3\u01a6\u00d3\0\u0bec\u0be8"+
	  "\1\0\0\0\u0bed\u0bf0\1\0\0\0\u0bee\u0bec\1\0\0\0\u0bee\u0bef\1\0\0\0"+
	  "\u0bef\u01a5\1\0\0\0\u0bf0\u0bee\1\0\0\0\u0bf1\u0bf4\3\u0254\u012a\0"+
	  "\u0bf3\u0bf1\1\0\0\0\u0bf3\u0bf4\1\0\0\0\u0bf4\u0bf7\1\0\0\0\u0bf5\u0bf8"+
	  "\3\u01aa\u00d5\0\u0bf7\u0bf5\1\0\0\0\u0bf7\u0bf8\1\0\0\0\u0bf8\u0bf9"+
	  "\1\0\0\0\u0bf9\u0bfb\3\6\3\0\u0bfb\u0bff\5\u009b\0\0\u0bfd\u0c00\3\u01a8"+
	  "\u00d4\0\u0bff\u0bfd\1\0\0\0\u0bff\u0c00\1\0\0\0\u0c00\u01a7\1\0\0\0"+
	  "\u0c01\u0c03\5h\0\0\u0c03\u0c04\3\u00d4j\0\u0c04\u01a9\1\0\0\0\u0c05"+
	  "\u0c0c\5x\0\0\u0c07\u0c0c\5M\0\0\u0c09\u0c0c\5\u0092\0\0\u0c0b\u0c05"+
	  "\1\0\0\0\u0c0b\u0c07\1\0\0\0\u0c0b\u0c09\1\0\0\0\u0c0c\u01ab\1\0\0\0"+
	  "\u0c0d\u0c10\3\u0254\u012a\0\u0c0f\u0c0d\1\0\0\0\u0c0f\u0c10\1\0\0\0"+
	  "\u0c10\u0c11\1\0\0\0\u0c11\u0c13\5\36\0\0\u0c13\u0c15\3\u020a\u0105\0"+
	  "\u0c15\u0c16\5\u009b\0\0\u0c16\u01ad\1\0\0\0\u0c17\u0c1a\3\u0254\u012a"+
	  "\0\u0c19\u0c17\1\0\0\0\u0c19\u0c1a\1\0\0\0\u0c1a\u0c1d\1\0\0\0\u0c1b"+
	  "\u0c1e\3\u01b0\u00d8\0\u0c1d\u0c1b\1\0\0\0\u0c1d\u0c1e\1\0\0\0\u0c1e"+
	  "\u0c1f\1\0\0\0\u0c1f\u0c21\3\6\3\0\u0c21\u0c23\3\u019e\u00cf\0\u0c23"+
	  "\u0c25\5~\0\0\u0c25\u0c27\3\u01b4\u00da\0\u0c27\u0c28\5\20\0\0\u0c28"+
	  "\u01af\1\0\0\0\u0c29\u0c2f\3\u01b2\u00d9\0\u0c2b\u0c2e\3\u01b2\u00d9"+
	  "\0\u0c2d\u0c2b\1\0\0\0\u0c2e\u0c31\1\0\0\0\u0c2f\u0c2d\1\0\0\0\u0c2f"+
	  "\u0c30\1\0\0\0\u0c30\u01b1\1\0\0\0\u0c31\u0c2f\1\0\0\0\u0c32\u0c4b\5"+
	  "n\0\0\u0c34\u0c4b\5v\0\0\u0c36\u0c4b\5\u008a\0\0\u0c38\u0c4b\5N\0\0\u0c3a"+
	  "\u0c4b\5\60\0\0\u0c3c\u0c4b\5\u0083\0\0\u0c3e\u0c4b\5d\0\0\u0c40\u0c4b"+
	  "\5\u008b\0\0\u0c42\u0c4b\5\\\0\0\u0c44\u0c4b\5\16\0\0\u0c46\u0c4b\5B"+
	  "\0\0\u0c48\u0c4b\3\u027c\u013e\0\u0c4a\u0c32\1\0\0\0\u0c4a\u0c34\1\0"+
	  "\0\0\u0c4a\u0c36\1\0\0\0\u0c4a\u0c38\1\0\0\0\u0c4a\u0c3a\1\0\0\0\u0c4a"+
	  "\u0c3c\1\0\0\0\u0c4a\u0c3e\1\0\0\0\u0c4a\u0c40\1\0\0\0\u0c4a\u0c42\1"+
	  "\0\0\0\u0c4a\u0c44\1\0\0\0\u0c4a\u0c46\1\0\0\0\u0c4a\u0c48\1\0\0\0\u0c4b"+
	  "\u01b3\1\0\0\0\u0c4c\u0c50\3\u01b6\u00db\0\u0c4e\u0c51\3\u01b8\u00dc"+
	  "\0\u0c50\u0c4e\1\0\0\0\u0c50\u0c51\1\0\0\0\u0c51\u0c59\1\0\0\0\u0c52"+
	  "\u0c56\3\u01b8\u00dc\0\u0c54\u0c57\3\u01b6\u00db\0\u0c56\u0c54\1\0\0"+
	  "\0\u0c56\u0c57\1\0\0\0\u0c57\u0c59\1\0\0\0\u0c58\u0c4c\1\0\0\0\u0c58"+
	  "\u0c52\1\0\0\0\u0c59\u01b5\1\0\0\0\u0c5a\u0c5d\3\u0254\u012a\0\u0c5c"+
	  "\u0c5a\1\0\0\0\u0c5c\u0c5d\1\0\0\0\u0c5d\u0c60\1\0\0\0\u0c5e\u0c61\3"+
	  "\u01ba\u00dd\0\u0c60\u0c5e\1\0\0\0\u0c60\u0c61\1\0\0\0\u0c61\u0c62\1"+
	  "\0\0\0\u0c62\u0c64\5\'\0\0\u0c64\u0c65\3\u01bc\u00de\0\u0c65\u01b7\1"+
	  "\0\0\0\u0c66\u0c69\3\u0254\u012a\0\u0c68\u0c66\1\0\0\0\u0c68\u0c69\1"+
	  "\0\0\0\u0c69\u0c6c\1\0\0\0\u0c6a\u0c6d\3\u01ba\u00dd\0\u0c6c\u0c6a\1"+
	  "\0\0\0\u0c6c\u0c6d\1\0\0\0\u0c6d\u0c6e\1\0\0\0\u0c6e\u0c70\5\63\0\0\u0c70"+
	  "\u0c71\3\u01bc\u00de\0\u0c71\u01b9\1\0\0\0\u0c72\u0c81\5\u008a\0\0\u0c74"+
	  "\u0c81\5N\0\0\u0c76\u0c81\5\60\0\0\u0c78\u0c7a\5\u008a\0\0\u0c7a\u0c81"+
	  "\5N\0\0\u0c7c\u0c7e\5N\0\0\u0c7e\u0c81\5\u008a\0\0\u0c80\u0c72\1\0\0"+
	  "\0\u0c80\u0c74\1\0\0\0\u0c80\u0c76\1\0\0\0\u0c80\u0c78\1\0\0\0\u0c80"+
	  "\u0c7c\1\0\0\0\u0c81\u01bb\1\0\0\0\u0c82\u0c87\3\u00e0p\0\u0c84\u0c87"+
	  "\5\u008f\0\0\u0c86\u0c82\1\0\0\0\u0c86\u0c84\1\0\0\0\u0c87\u01bd\1\0"+
	  "\0\0\u0c88\u0c8b\3\u0254\u012a\0\u0c8a\u0c88\1\0\0\0\u0c8a\u0c8b\1\0"+
	  "\0\0\u0c8b\u0c8e\1\0\0\0\u0c8c\u0c8f\3\u01c0\u00e0\0\u0c8e\u0c8c\1\0"+
	  "\0\0\u0c8e\u0c8f\1\0\0\0\u0c8f\u0c90\1\0\0\0\u0c90\u0c92\5\u0093\0\0"+
	  "\u0c92\u0c94\3\6\3\0\u0c94\u0c96\3\u018e\u00c7\0\u0c96\u0c97\5\u008f"+
	  "\0\0\u0c97\u0cad\1\0\0\0\u0c98\u0c9b\3\u0254\u012a\0\u0c9a\u0c98\1\0"+
	  "\0\0\u0c9a\u0c9b\1\0\0\0\u0c9b\u0c9e\1\0\0\0\u0c9c\u0c9f\3\u01c0\u00e0"+
	  "\0\u0c9e\u0c9c\1\0\0\0\u0c9e\u0c9f\1\0\0\0\u0c9f\u0ca0\1\0\0\0\u0ca0"+
	  "\u0ca2\5\u0093\0\0\u0ca2\u0ca4\3\6\3\0\u0ca4\u0ca6\3\u019e\u00cf\0\u0ca6"+
	  "\u0ca8\5~\0\0\u0ca8\u0caa\3\u01c4\u00e2\0\u0caa\u0cab\5\20\0\0\u0cab"+
	  "\u0cad\1\0\0\0\u0cac\u0c8a\1\0\0\0\u0cac\u0c9a\1\0\0\0\u0cad\u01bf\1"+
	  "\0\0\0\u0cae\u0cb4\3\u01c2\u00e1\0\u0cb0\u0cb3\3\u01c2\u00e1\0\u0cb2"+
	  "\u0cb0\1\0\0\0\u0cb3\u0cb6\1\0\0\0\u0cb4\u0cb2\1\0\0\0\u0cb4\u0cb5\1"+
	  "\0\0\0\u0cb5\u01c1\1\0\0\0\u0cb6\u0cb4\1\0\0\0\u0cb7\u0cd0\5n\0\0\u0cb9"+
	  "\u0cd0\5v\0\0\u0cbb\u0cd0\5\u008a\0\0\u0cbd\u0cd0\5N\0\0\u0cbf\u0cd0"+
	  "\5\60\0\0\u0cc1\u0cd0\5\u0083\0\0\u0cc3\u0cd0\5d\0\0\u0cc5\u0cd0\5\u008b"+
	  "\0\0\u0cc7\u0cd0\5\\\0\0\u0cc9\u0cd0\5\16\0\0\u0ccb\u0cd0\5B\0\0\u0ccd"+
	  "\u0cd0\3\u027e\u013f\0\u0ccf\u0cb7\1\0\0\0\u0ccf\u0cb9\1\0\0\0\u0ccf"+
	  "\u0cbb\1\0\0\0\u0ccf\u0cbd\1\0\0\0\u0ccf\u0cbf\1\0\0\0\u0ccf\u0cc1\1"+
	  "\0\0\0\u0ccf\u0cc3\1\0\0\0\u0ccf\u0cc5\1\0\0\0\u0ccf\u0cc7\1\0\0\0\u0ccf"+
	  "\u0cc9\1\0\0\0\u0ccf\u0ccb\1\0\0\0\u0ccf\u0ccd\1\0\0\0\u0cd0\u01c3\1"+
	  "\0\0\0\u0cd1\u0cd3\3\u01c6\u00e3\0\u0cd3\u0cd4\3\u01c8\u00e4\0\u0cd4"+
	  "\u0cda\1\0\0\0\u0cd5\u0cd7\3\u01c8\u00e4\0\u0cd7\u0cd8\3\u01c6\u00e3"+
	  "\0\u0cd8\u0cda\1\0\0\0\u0cd9\u0cd1\1\0\0\0\u0cd9\u0cd5\1\0\0\0\u0cda"+
	  "\u01c5\1\0\0\0\u0cdb\u0cde\3\u0254\u012a\0\u0cdd\u0cdb\1\0\0\0\u0cdd"+
	  "\u0cde\1\0\0\0\u0cde\u0cdf\1\0\0\0\u0cdf\u0ce1\5\u0082\0\0\u0ce1\u0ce2"+
	  "\3\u00e0p\0\u0ce2\u01c7\1\0\0\0\u0ce3\u0ce6\3\u0254\u012a\0\u0ce5\u0ce3"+
	  "\1\0\0\0\u0ce5\u0ce6\1\0\0\0\u0ce6\u0ce7\1\0\0\0\u0ce7\u0ce9\5O\0\0\u0ce9"+
	  "\u0cea\3\u00e0p\0\u0cea\u01c9\1\0\0\0\u0ceb\u0cee\3\u0254\u012a\0\u0ced"+
	  "\u0ceb\1\0\0\0\u0ced\u0cee\1\0\0\0\u0cee\u0cf1\1\0\0\0\u0cef\u0cf2\3"+
	  "\u01cc\u00e6\0\u0cf1\u0cef\1\0\0\0\u0cf1\u0cf2\1\0\0\0\u0cf2\u0cf3\1"+
	  "\0\0\0\u0cf3\u0cf5\3\u01d0\u00e8\0\u0cf5\u0cf7\5~\0\0\u0cf7\u0cf9\3\u01b4"+
	  "\u00da\0\u0cf9\u0cfa\5\20\0\0\u0cfa\u01cb\1\0\0\0\u0cfb\u0d01\3\u01ce"+
	  "\u00e7\0\u0cfd\u0d00\3\u01ce\u00e7\0\u0cff\u0cfd\1\0\0\0\u0d00\u0d03"+
	  "\1\0\0\0\u0d01\u0cff\1\0\0\0\u0d01\u0d02\1\0\0\0\u0d02\u01cd\1\0\0\0"+
	  "\u0d03\u0d01\1\0\0\0\u0d04\u0d1b\5n\0\0\u0d06\u0d1b\5v\0\0\u0d08\u0d1b"+
	  "\5\u008a\0\0\u0d0a\u0d1b\5N\0\0\u0d0c\u0d1b\5\60\0\0\u0d0e\u0d1b\5d\0"+
	  "\0\u0d10\u0d1b\5\u008b\0\0\u0d12\u0d1b\5\\\0\0\u0d14\u0d1b\5\16\0\0\u0d16"+
	  "\u0d1b\5B\0\0\u0d18\u0d1b\3\u0280\u0140\0\u0d1a\u0d04\1\0\0\0\u0d1a\u0d06"+
	  "\1\0\0\0\u0d1a\u0d08\1\0\0\0\u0d1a\u0d0a\1\0\0\0\u0d1a\u0d0c\1\0\0\0"+
	  "\u0d1a\u0d0e\1\0\0\0\u0d1a\u0d10\1\0\0\0\u0d1a\u0d12\1\0\0\0\u0d1a\u0d14"+
	  "\1\0\0\0\u0d1a\u0d16\1\0\0\0\u0d1a\u0d18\1\0\0\0\u0d1b\u01cf\1\0\0\0"+
	  "\u0d1c\u0d1e\3\6\3\0\u0d1e\u0d20\5\u0092\0\0\u0d20\u0d22\5R\0\0\u0d22"+
	  "\u0d24\3\u01a2\u00d1\0\u0d24\u0d25\5s\0\0\u0d25\u0d35\1\0\0\0\u0d26\u0d28"+
	  "\3\6\3\0\u0d28\u0d2a\3\36\17\0\u0d2a\u0d2c\5A\0\0\u0d2c\u0d2e\5\u0092"+
	  "\0\0\u0d2e\u0d30\5R\0\0\u0d30\u0d32\3\u01a2\u00d1\0\u0d32\u0d33\5s\0"+
	  "\0\u0d33\u0d35\1\0\0\0\u0d34\u0d1c\1\0\0\0\u0d34\u0d26\1\0\0\0\u0d35"+
	  "\u01d1\1\0\0\0\u0d36\u0d39\3\u0254\u012a\0\u0d38\u0d36\1\0\0\0\u0d38"+
	  "\u0d39\1\0\0\0\u0d39\u0d3a\1\0\0\0\u0d3a\u0d3c\3\u01d4\u00ea\0\u0d3c"+
	  "\u0d3e\3\u01d8\u00ec\0\u0d3e\u0d3f\3\u01e4\u00f2\0\u0d3f\u01d3\1\0\0"+
	  "\0\u0d40\u0d46\3\u01d6\u00eb\0\u0d42\u0d45\3\u01d6\u00eb\0\u0d44\u0d42"+
	  "\1\0\0\0\u0d45\u0d48\1\0\0\0\u0d46\u0d44\1\0\0\0\u0d46\u0d47\1\0\0\0"+
	  "\u0d47\u01d5\1\0\0\0\u0d48\u0d46\1\0\0\0\u0d49\u0d52\5v\0\0\u0d4b\u0d52"+
	  "\5\u0083\0\0\u0d4d\u0d52\5B\0\0\u0d4f\u0d52\3\u0282\u0141\0\u0d51\u0d49"+
	  "\1\0\0\0\u0d51\u0d4b\1\0\0\0\u0d51\u0d4d\1\0\0\0\u0d51\u0d4f\1\0\0\0"+
	  "\u0d52\u01d7\1\0\0\0\u0d53\u0d5a\3\u01da\u00ed\0\u0d55\u0d5a\3\u01de"+
	  "\u00ef\0\u0d57\u0d5a\3\u01e2\u00f1\0\u0d59\u0d53\1\0\0\0\u0d59\u0d55"+
	  "\1\0\0\0\u0d59\u0d57\1\0\0\0\u0d5a\u01d9\1\0\0\0\u0d5b\u0d5d\3\6\3\0"+
	  "\u0d5d\u0d5f\5\u008c\0\0\u0d5f\u0d61\3\u01dc\u00ee\0\u0d61\u0d63\5w\0"+
	  "\0\u0d63\u0d65\3\6\3\0\u0d65\u0d67\5\u009b\0\0\u0d67\u0d68\5\30\0\0\u0d68"+
	  "\u01db\1\0\0\0\u0d69\u0d7a\5C\0\0\u0d6b\u0d7a\5,\0\0\u0d6d\u0d7a\5!\0"+
	  "\0\u0d6f\u0d7a\5L\0\0\u0d71\u0d7a\5=\0\0\u0d73\u0d7a\5U\0\0\u0d75\u0d7a"+
	  "\5<\0\0\u0d77\u0d7a\5\b\0\0\u0d79\u0d69\1\0\0\0\u0d79\u0d6b\1\0\0\0\u0d79"+
	  "\u0d6d\1\0\0\0\u0d79\u0d6f\1\0\0\0\u0d79\u0d71\1\0\0\0\u0d79\u0d73\1"+
	  "\0\0\0\u0d79\u0d75\1\0\0\0\u0d79\u0d77\1\0\0\0\u0d7a\u01dd\1\0\0\0\u0d7b"+
	  "\u0d7d\3\6\3\0\u0d7d\u0d7f\5\u008c\0\0\u0d7f\u0d81\3\u01e0\u00f0\0\u0d81"+
	  "\u0d83\5w\0\0\u0d83\u0d85\3\6\3\0\u0d85\u0d87\5\u009b\0\0\u0d87\u0d89"+
	  "\5*\0\0\u0d89\u0d8b\3\6\3\0\u0d8b\u0d8d\5\u009b\0\0\u0d8d\u0d8e\5\30"+
	  "\0\0\u0d8e\u01df\1\0\0\0\u0d8f\u0db0\5C\0\0\u0d91\u0db0\5,\0\0\u0d93"+
	  "\u0db0\5\u00a9\0\0\u0d95\u0db0\5K\0\0\u0d97\u0db0\5a\0\0\u0d99\u0db0"+
	  "\5P\0\0\u0d9b\u0db0\5 \0\0\u0d9d\u0db0\5\u0085\0\0\u0d9f\u0db0\5Z\0\0"+
	  "\u0da1\u0db0\5f\0\0\u0da3\u0db0\5\u0096\0\0\u0da5\u0db0\5X\0\0\u0da7"+
	  "\u0db0\5F\0\0\u0da9\u0db0\5T\0\0\u0dab\u0db0\5\u0097\0\0\u0dad\u0db0"+
	  "\5Y\0\0\u0daf\u0d8f\1\0\0\0\u0daf\u0d91\1\0\0\0\u0daf\u0d93\1\0\0\0\u0daf"+
	  "\u0d95\1\0\0\0\u0daf\u0d97\1\0\0\0\u0daf\u0d99\1\0\0\0\u0daf\u0d9b\1"+
	  "\0\0\0\u0daf\u0d9d\1\0\0\0\u0daf\u0d9f\1\0\0\0\u0daf\u0da1\1\0\0\0\u0daf"+
	  "\u0da3\1\0\0\0\u0daf\u0da5\1\0\0\0\u0daf\u0da7\1\0\0\0\u0daf\u0da9\1"+
	  "\0\0\0\u0daf\u0dab\1\0\0\0\u0daf\u0dad\1\0\0\0\u0db0\u01e1\1\0\0\0\u0db1"+
	  "\u0db3\5\4\0\0\u0db3\u0db5\5\u008c\0\0\u0db5\u0db7\3\6\3\0\u0db7\u0db9"+
	  "\5w\0\0\u0db9\u0dbb\3\6\3\0\u0dbb\u0dbd\5\u009b\0\0\u0dbd\u0dbe\5\30"+
	  "\0\0\u0dbe\u0dce\1\0\0\0\u0dbf\u0dc1\5e\0\0\u0dc1\u0dc3\5\u008c\0\0\u0dc3"+
	  "\u0dc5\3\6\3\0\u0dc5\u0dc7\5w\0\0\u0dc7\u0dc9\3\6\3\0\u0dc9\u0dcb\5\u009b"+
	  "\0\0\u0dcb\u0dcc\5\30\0\0\u0dcc\u0dce\1\0\0\0\u0dcd\u0db1\1\0\0\0\u0dcd"+
	  "\u0dbf\1\0\0\0\u0dce\u01e3\1\0\0\0\u0dcf\u0dd4\3\u00e0p\0\u0dd1\u0dd4"+
	  "\5\u008f\0\0\u0dd3\u0dcf\1\0\0\0\u0dd3\u0dd1\1\0\0\0\u0dd4\u01e5\1\0"+
	  "\0\0\u0dd5\u0dd8\3\u0254\u012a\0\u0dd7\u0dd5\1\0\0\0\u0dd7\u0dd8\1\0"+
	  "\0\0\u0dd8\u0ddb\1\0\0\0\u0dd9\u0ddc\3\u01e8\u00f4\0\u0ddb\u0dd9\1\0"+
	  "\0\0\u0ddb\u0ddc\1\0\0\0\u0ddc\u0ddd\1\0\0\0\u0ddd\u0ddf\3\u01ec\u00f6"+
	  "\0\u0ddf\u0de0\3\u01f0\u00f8\0\u0de0\u01e7\1\0\0\0\u0de1\u0de7\3\u01ea"+
	  "\u00f5\0\u0de3\u0de6\3\u01ea\u00f5\0\u0de5\u0de3\1\0\0\0\u0de6\u0de9"+
	  "\1\0\0\0\u0de7\u0de5\1\0\0\0\u0de7\u0de8\1\0\0\0\u0de8\u01e9\1\0\0\0"+
	  "\u0de9\u0de7\1\0\0\0\u0dea\u0df7\5v\0\0\u0dec\u0df7\5\u008a\0\0\u0dee"+
	  "\u0df7\5N\0\0\u0df0\u0df7\5\60\0\0\u0df2\u0df7\5B\0\0\u0df4\u0df7\3\u0284"+
	  "\u0142\0\u0df6\u0dea\1\0\0\0\u0df6\u0dec\1\0\0\0\u0df6\u0dee\1\0\0\0"+
	  "\u0df6\u0df0\1\0\0\0\u0df6\u0df2\1\0\0\0\u0df6\u0df4\1\0\0\0\u0df7\u01eb"+
	  "\1\0\0\0\u0df8\u0dfa\5\u009b\0\0\u0dfa\u0dfe\5w\0\0\u0dfc\u0dff\3\u01a2"+
	  "\u00d1\0\u0dfe\u0dfc\1\0\0\0\u0dfe\u0dff\1\0\0\0\u0dff\u0e00\1\0\0\0"+
	  "\u0e00\u0e04\5\30\0\0\u0e02\u0e05\3\u01ee\u00f7\0\u0e04\u0e02\1\0\0\0"+
	  "\u0e04\u0e05\1\0\0\0\u0e05\u01ed\1\0\0\0\u0e06\u0e08\5y\0\0\u0e08\u0e0a"+
	  "\5\u008e\0\0\u0e0a\u0e0e\5w\0\0\u0e0c\u0e0f\3*\25\0\u0e0e\u0e0c\1\0\0"+
	  "\0\u0e0e\u0e0f\1\0\0\0\u0e0f\u0e10\1\0\0\0\u0e10\u0e1f\5\30\0\0\u0e12"+
	  "\u0e14\5y\0\0\u0e14\u0e16\5\u0092\0\0\u0e16\u0e1a\5w\0\0\u0e18\u0e1b"+
	  "\3*\25\0\u0e1a\u0e18\1\0\0\0\u0e1a\u0e1b\1\0\0\0\u0e1b\u0e1c\1\0\0\0"+
	  "\u0e1c\u0e1f\5\30\0\0\u0e1e\u0e06\1\0\0\0\u0e1e\u0e12\1\0\0\0\u0e1f\u01ef"+
	  "\1\0\0\0\u0e20\u0e25\3\u00e0p\0\u0e22\u0e25\5\u008f\0\0\u0e24\u0e20\1"+
	  "\0\0\0\u0e24\u0e22\1\0\0\0\u0e25\u01f1\1\0\0\0\u0e26\u0e29\3\u0254\u012a"+
	  "\0\u0e28\u0e26\1\0\0\0\u0e28\u0e29\1\0\0\0\u0e29\u0e2a\1\0\0\0\u0e2a"+
	  "\u0e2c\3\u01f4\u00fa\0\u0e2c\u0e2e\5\u009b\0\0\u0e2e\u0e30\5w\0\0\u0e30"+
	  "\u0e32\5\30\0\0\u0e32\u0e33\3\u01f6\u00fb\0\u0e33\u01f3\1\0\0\0\u0e34"+
	  "\u0e37\5B\0\0\u0e36\u0e34\1\0\0\0\u0e36\u0e37\1\0\0\0\u0e37\u0e38\1\0"+
	  "\0\0\u0e38\u0e43\5\u0083\0\0\u0e3a\u0e3e\5\u0083\0\0\u0e3c\u0e3f\5B\0"+
	  "\0\u0e3e\u0e3c\1\0\0\0\u0e3e\u0e3f\1\0\0\0\u0e3f\u0e43\1\0\0\0\u0e40"+
	  "\u0e43\3\u0288\u0144\0\u0e42\u0e36\1\0\0\0\u0e42\u0e3a\1\0\0\0\u0e42"+
	  "\u0e40\1\0\0\0\u0e43\u01f5\1\0\0\0\u0e44\u0e49\3\u00e0p\0\u0e46\u0e49"+
	  "\5\u008f\0\0\u0e48\u0e44\1\0\0\0\u0e48\u0e46\1\0\0\0\u0e49\u01f7\1\0"+
	  "\0\0\u0e4a\u0e4d\3\u0254\u012a\0\u0e4c\u0e4a\1\0\0\0\u0e4c\u0e4d\1\0"+
	  "\0\0\u0e4d\u0e50\1\0\0\0\u0e4e\u0e51\5B\0\0\u0e50\u0e4e\1\0\0\0\u0e50"+
	  "\u0e51\1\0\0\0\u0e51\u0e52\1\0\0\0\u0e52\u0e54\5L\0\0\u0e54\u0e56\5\u009b"+
	  "\0\0\u0e56\u0e58\5w\0\0\u0e58\u0e5a\5\30\0\0\u0e5a\u0e5f\3\u01fa\u00fd"+
	  "\0\u0e5c\u0e5f\3\u0286\u0143\0\u0e5e\u0e4c\1\0\0\0\u0e5e\u0e5c\1\0\0"+
	  "\0\u0e5f\u01f9\1\0\0\0\u0e60\u0e65\3\u00e0p\0\u0e62\u0e65\5\u008f\0\0"+
	  "\u0e64\u0e60\1\0\0\0\u0e64\u0e62\1\0\0\0\u0e65\u01fb\1\0\0\0\u0e66\u0e69"+
	  "\3\u0254\u012a\0\u0e68\u0e66\1\0\0\0\u0e68\u0e69\1\0\0\0\u0e69\u0e6c"+
	  "\1\0\0\0\u0e6a\u0e6d\3\u01fe\u00ff\0\u0e6c\u0e6a\1\0\0\0\u0e6c\u0e6d"+
	  "\1\0\0\0\u0e6d\u0e70\1\0\0\0\u0e6e\u0e71\5\r\0\0\u0e70\u0e6e\1\0\0\0"+
	  "\u0e70\u0e71\1\0\0\0\u0e71\u0e72\1\0\0\0\u0e72\u0e74\5>\0\0\u0e74\u0e78"+
	  "\5\u009b\0\0\u0e76\u0e79\3\u0162\u00b1\0\u0e78\u0e76\1\0\0\0\u0e78\u0e79"+
	  "\1\0\0\0\u0e79\u0e7c\1\0\0\0\u0e7a\u0e7d\3\u0202\u0101\0\u0e7c\u0e7a"+
	  "\1\0\0\0\u0e7c\u0e7d\1\0\0\0\u0e7d\u0e80\1\0\0\0\u0e7e\u0e81\3\u016c"+
	  "\u00b6\0\u0e80\u0e7e\1\0\0\0\u0e80\u0e81\1\0\0\0\u0e81\u0e82\1\0\0\0"+
	  "\u0e82\u0e86\3\u0204\u0102\0\u0e84\u0e87\5\u008f\0\0\u0e86\u0e84\1\0"+
	  "\0\0\u0e86\u0e87\1\0\0\0\u0e87\u01fd\1\0\0\0\u0e88\u0e8e\3\u0200\u0100"+
	  "\0\u0e8a\u0e8d\3\u0200\u0100\0\u0e8c\u0e8a\1\0\0\0\u0e8d\u0e90\1\0\0"+
	  "\0\u0e8e\u0e8c\1\0\0\0\u0e8e\u0e8f\1\0\0\0\u0e8f\u01ff\1\0\0\0\u0e90"+
	  "\u0e8e\1\0\0\0\u0e91\u0e9e\5n\0\0\u0e93\u0e9e\5v\0\0\u0e95\u0e9e\5\u008a"+
	  "\0\0\u0e97\u0e9e\5N\0\0\u0e99\u0e9e\5\60\0\0\u0e9b\u0e9e\3\u0272\u0139"+
	  "\0\u0e9d\u0e91\1\0\0\0\u0e9d\u0e93\1\0\0\0\u0e9d\u0e95\1\0\0\0\u0e9d"+
	  "\u0e97\1\0\0\0\u0e9d\u0e99\1\0\0\0\u0e9d\u0e9b\1\0\0\0\u0e9e\u0201\1"+
	  "\0\0\0\u0e9f\u0ea1\5y\0\0\u0ea1\u0ea2\3\u016a\u00b5\0\u0ea2\u0203\1\0"+
	  "\0\0\u0ea3\u0ea7\5~\0\0\u0ea5\u0ea8\3\u0206\u0103\0\u0ea7\u0ea5\1\0\0"+
	  "\0\u0ea7\u0ea8\1\0\0\0\u0ea8\u0ea9\1\0\0\0\u0ea9\u0eaa\5\20\0\0\u0eaa"+
	  "\u0205\1\0\0\0\u0eab\u0eb1\3\u0208\u0104\0\u0ead\u0eb0\3\u0208\u0104"+
	  "\0\u0eaf\u0ead\1\0\0\0\u0eb0\u0eb3\1\0\0\0\u0eb1\u0eaf\1\0\0\0\u0eb1"+
	  "\u0eb2\1\0\0\0\u0eb2\u0207\1\0\0\0\u0eb3\u0eb1\1\0\0\0\u0eb4\u0ecb\3"+
	  "\u017e\u00bf\0\u0eb6\u0ecb\3\u0188\u00c4\0\u0eb8\u0ecb\3\u0194\u00ca"+
	  "\0\u0eba\u0ecb\3\u01ae\u00d7\0\u0ebc\u0ecb\3\u01be\u00df\0\u0ebe\u0ecb"+
	  "\3\u01ca\u00e5\0\u0ec0\u0ecb\3\u01d2\u00e9\0\u0ec2\u0ecb\3\u01e6\u00f3"+
	  "\0\u0ec4\u0ecb\3\u01f2\u00f9\0\u0ec6\u0ecb\3\u0158\u00ac\0\u0ec8\u0ecb"+
	  "\3\u02aa\u0155\0\u0eca\u0eb4\1\0\0\0\u0eca\u0eb6\1\0\0\0\u0eca\u0eb8"+
	  "\1\0\0\0\u0eca\u0eba\1\0\0\0\u0eca\u0ebc\1\0\0\0\u0eca\u0ebe\1\0\0\0"+
	  "\u0eca\u0ec0\1\0\0\0\u0eca\u0ec2\1\0\0\0\u0eca\u0ec4\1\0\0\0\u0eca\u0ec6"+
	  "\1\0\0\0\u0eca\u0ec8\1\0\0\0\u0ecb\u0209\1\0\0\0\u0ecc\u0edf\3\2\1\0"+
	  "\u0ece\u0edf\3\f\6\0\u0ed0\u0edf\3\30\f\0\u0ed2\u0edf\3\34\16\0\u0ed4"+
	  "\u0edf\3\36\17\0\u0ed6\u0edf\3 \20\0\u0ed8\u0edf\3\u0166\u00b3\0\u0eda"+
	  "\u0edc\5\u00aa\0\0\u0edc\u0edf\5\u00a9\0\0\u0ede\u0ecc\1\0\0\0\u0ede"+
	  "\u0ece\1\0\0\0\u0ede\u0ed0\1\0\0\0\u0ede\u0ed2\1\0\0\0\u0ede\u0ed4\1"+
	  "\0\0\0\u0ede\u0ed6\1\0\0\0\u0ede\u0ed8\1\0\0\0\u0ede\u0eda\1\0\0\0\u0edf"+
	  "\u0ee9\1\0\0\0\u0ee0\u0ee3\7\0\0\0\u0ee2\u0ee0\1\0\0\0\u0ee3\u0ee6\1"+
	  "\0\0\0\u0ee4\u0ee2\1\0\0\0\u0ee4\u0ee5\1\0\0\0\u0ee5\u0ee7\1\0\0\0\u0ee6"+
	  "\u0ee4\1\0\0\0\u0ee7\u0eea\3\u0210\u0108\0\u0ee9\u0ee4\1\0\0\0\u0eea"+
	  "\u0eeb\1\0\0\0\u0eeb\u0ee9\1\0\0\0\u0eeb\u0eec\1\0\0\0\u0eec\u020b\1"+
	  "\0\0\0\u0eed\u0f00\3\2\1\0\u0eef\u0f00\3\f\6\0\u0ef1\u0f00\3\30\f\0\u0ef3"+
	  "\u0f00\3\34\16\0\u0ef5\u0f00\3\36\17\0\u0ef7\u0f00\3 \20\0\u0ef9\u0f00"+
	  "\3\u0166\u00b3\0\u0efb\u0efd\5\u00aa\0\0\u0efd\u0f00\5\u00a9\0\0\u0eff"+
	  "\u0eed\1\0\0\0\u0eff\u0eef\1\0\0\0\u0eff\u0ef1\1\0\0\0\u0eff\u0ef3\1"+
	  "\0\0\0\u0eff\u0ef5\1\0\0\0\u0eff\u0ef7\1\0\0\0\u0eff\u0ef9\1\0\0\0\u0eff"+
	  "\u0efb\1\0\0\0\u0f00\u0f09\1\0\0\0\u0f01\u0f08\3\u0210\u0108\0\u0f03"+
	  "\u0f08\5\u00a8\0\0\u0f05\u0f08\5\u00a9\0\0\u0f07\u0f01\1\0\0\0\u0f07"+
	  "\u0f03\1\0\0\0\u0f07\u0f05\1\0\0\0\u0f08\u0f0b\1\0\0\0\u0f09\u0f07\1"+
	  "\0\0\0\u0f09\u0f0a\1\0\0\0\u0f0a\u020d\1\0\0\0\u0f0b\u0f09\1\0\0\0\u0f0c"+
	  "\u0f0f\3\u0210\u0108\0\u0f0e\u0f0c\1\0\0\0\u0f0f\u0f10\1\0\0\0\u0f10"+
	  "\u0f0e\1\0\0\0\u0f10\u0f11\1\0\0\0\u0f11\u020f\1\0\0\0\u0f12\u0f16\5"+
	  "R\0\0\u0f14\u0f17\3\u0212\u0109\0\u0f16\u0f14\1\0\0\0\u0f16\u0f17\1\0"+
	  "\0\0\u0f17\u0f18\1\0\0\0\u0f18\u0f19\5s\0\0\u0f19\u0211\1\0\0\0\u0f1a"+
	  "\u0f20\5*\0\0\u0f1c\u0f1f\5*\0\0\u0f1e\u0f1c\1\0\0\0\u0f1f\u0f22\1\0"+
	  "\0\0\u0f20\u0f1e\1\0\0\0\u0f20\u0f21\1\0\0\0\u0f21\u0213\1\0\0\0\u0f22"+
	  "\u0f20\1\0\0\0\u0f23\u0f27\5~\0\0\u0f25\u0f28\3\u0216\u010b\0\u0f27\u0f25"+
	  "\1\0\0\0\u0f27\u0f28\1\0\0\0\u0f28\u0f29\1\0\0\0\u0f29\u0f34\5\20\0\0"+
	  "\u0f2b\u0f2d\5~\0\0\u0f2d\u0f2f\3\u0216\u010b\0\u0f2f\u0f31\5*\0\0\u0f31"+
	  "\u0f32\5\20\0\0\u0f32\u0f34\1\0\0\0\u0f33\u0f23\1\0\0\0\u0f33\u0f2b\1"+
	  "\0\0\0\u0f34\u0215\1\0\0\0\u0f35\u0f3d\3\u0192\u00c9\0\u0f37\u0f39\5"+
	  "*\0\0\u0f39\u0f3c\3\u0192\u00c9\0\u0f3b\u0f37\1\0\0\0\u0f3c\u0f3f\1\0"+
	  "\0\0\u0f3d\u0f3b\1\0\0\0\u0f3d\u0f3e\1\0\0\0\u0f3e\u0217\1\0\0\0\u0f3f"+
	  "\u0f3d\1\0\0\0\u0f40\u0f43\3\u0254\u012a\0\u0f42\u0f40\1\0\0\0\u0f42"+
	  "\u0f43\1\0\0\0\u0f43\u0f46\1\0\0\0\u0f44\u0f47\3\u021a\u010d\0\u0f46"+
	  "\u0f44\1\0\0\0\u0f46\u0f47\1\0\0\0\u0f47\u0f4a\1\0\0\0\u0f48\u0f4b\5"+
	  "\r\0\0\u0f4a\u0f48\1\0\0\0\u0f4a\u0f4b\1\0\0\0\u0f4b\u0f4c\1\0\0\0\u0f4c"+
	  "\u0f4e\5\5\0\0\u0f4e\u0f52\5\u009b\0\0\u0f50\u0f53\3\u021e\u010f\0\u0f52"+
	  "\u0f50\1\0\0\0\u0f52\u0f53\1\0\0\0\u0f53\u0f56\1\0\0\0\u0f54\u0f57\3"+
	  "\u0224\u0112\0\u0f56\u0f54\1\0\0\0\u0f56\u0f57\1\0\0\0\u0f57\u0f5a\1"+
	  "\0\0\0\u0f58\u0f5b\3\u016c\u00b6\0\u0f5a\u0f58\1\0\0\0\u0f5a\u0f5b\1"+
	  "\0\0\0\u0f5b\u0f5c\1\0\0\0\u0f5c\u0f60\3\u0226\u0113\0\u0f5e\u0f61\5"+
	  "\u008f\0\0\u0f60\u0f5e\1\0\0\0\u0f60\u0f61\1\0\0\0\u0f61\u0219\1\0\0"+
	  "\0\u0f62\u0f68\3\u021c\u010e\0\u0f64\u0f67\3\u021c\u010e\0\u0f66\u0f64"+
	  "\1\0\0\0\u0f67\u0f6a\1\0\0\0\u0f68\u0f66\1\0\0\0\u0f68\u0f69\1\0\0\0"+
	  "\u0f69\u021b\1\0\0\0\u0f6a\u0f68\1\0\0\0\u0f6b\u0f78\5n\0\0\u0f6d\u0f78"+
	  "\5v\0\0\u0f6f\u0f78\5\u008a\0\0\u0f71\u0f78\5N\0\0\u0f73\u0f78\5\60\0"+
	  "\0\u0f75\u0f78\3\u0274\u013a\0\u0f77\u0f6b\1\0\0\0\u0f77\u0f6d\1\0\0"+
	  "\0\u0f77\u0f6f\1\0\0\0\u0f77\u0f71\1\0\0\0\u0f77\u0f73\1\0\0\0\u0f77"+
	  "\u0f75\1\0\0\0\u0f78\u021d\1\0\0\0\u0f79\u0f7b\5T\0\0\u0f7b\u0f7d\3\u0220"+
	  "\u0110\0\u0f7d\u0f7e\5F\0\0\u0f7e\u021f\1\0\0\0\u0f7f\u0f82\3\u0254\u012a"+
	  "\0\u0f81\u0f7f\1\0\0\0\u0f81\u0f82\1\0\0\0\u0f82\u0f85\1\0\0\0\u0f83"+
	  "\u0f86\3\u0222\u0111\0\u0f85\u0f83\1\0\0\0\u0f85\u0f86\1\0\0\0\u0f86"+
	  "\u0f87\1\0\0\0\u0f87\u0f97\3\u0166\u00b3\0\u0f89\u0f8d\5*\0\0\u0f8b\u0f8e"+
	  "\3\u0254\u012a\0\u0f8d\u0f8b\1\0\0\0\u0f8d\u0f8e\1\0\0\0\u0f8e\u0f91"+
	  "\1\0\0\0\u0f8f\u0f92\3\u0222\u0111\0\u0f91\u0f8f\1\0\0\0\u0f91\u0f92"+
	  "\1\0\0\0\u0f92\u0f93\1\0\0\0\u0f93\u0f96\3\u0166\u00b3\0\u0f95\u0f89"+
	  "\1\0\0\0\u0f96\u0f99\1\0\0\0\u0f97\u0f95\1\0\0\0\u0f97\u0f98\1\0\0\0"+
	  "\u0f98\u0221\1\0\0\0\u0f99\u0f97\1\0\0\0\u0f9a\u0f9f\5)\0\0\u0f9c\u0f9f"+
	  "\5M\0\0\u0f9e\u0f9a\1\0\0\0\u0f9e\u0f9c\1\0\0\0\u0f9f\u0223\1\0\0\0\u0fa0"+
	  "\u0fa2\5y\0\0\u0fa2\u0fa3\3\u016a\u00b5\0\u0fa3\u0225\1\0\0\0\u0fa4\u0fa8"+
	  "\5~\0\0\u0fa6\u0fa9\3\u0228\u0114\0\u0fa8\u0fa6\1\0\0\0\u0fa8\u0fa9\1"+
	  "\0\0\0\u0fa9\u0faa\1\0\0\0\u0faa\u0fab\5\20\0\0\u0fab\u0227\1\0\0\0\u0fac"+
	  "\u0fb2\3\u022a\u0115\0\u0fae\u0fb1\3\u022a\u0115\0\u0fb0\u0fae\1\0\0"+
	  "\0\u0fb1\u0fb4\1\0\0\0\u0fb2\u0fb0\1\0\0\0\u0fb2\u0fb3\1\0\0\0\u0fb3"+
	  "\u0229\1\0\0\0\u0fb4\u0fb2\1\0\0\0\u0fb5\u0fbe\3\u022c\u0116\0\u0fb7"+
	  "\u0fbe\3\u022e\u0117\0\u0fb9\u0fbe\3\u0232\u0119\0\u0fbb\u0fbe\3\u0234"+
	  "\u011a\0\u0fbd\u0fb5\1\0\0\0\u0fbd\u0fb7\1\0\0\0\u0fbd\u0fb9\1\0\0\0"+
	  "\u0fbd\u0fbb\1\0\0\0\u0fbe\u022b\1\0\0\0\u0fbf\u0fc2\3\u0254\u012a\0"+
	  "\u0fc1\u0fbf\1\0\0\0\u0fc1\u0fc2\1\0\0\0\u0fc2\u0fc5\1\0\0\0\u0fc3\u0fc6"+
	  "\5n\0\0\u0fc5\u0fc3\1\0\0\0\u0fc5\u0fc6\1\0\0\0\u0fc6\u0fc7\1\0\0\0\u0fc7"+
	  "\u0fc9\3\u019c\u00ce\0\u0fc9\u0fcb\5\u009b\0\0\u0fcb\u0fcd\3\u0162\u00b1"+
	  "\0\u0fcd\u0fd1\5w\0\0\u0fcf\u0fd2\3\u01a2\u00d1\0\u0fd1\u0fcf\1\0\0\0"+
	  "\u0fd1\u0fd2\1\0\0\0\u0fd2\u0fd3\1\0\0\0\u0fd3\u0fd7\5\30\0\0\u0fd5\u0fd8"+
	  "\3\u016c\u00b6\0\u0fd7\u0fd5\1\0\0\0\u0fd7\u0fd8\1\0\0\0\u0fd8\u0fd9"+
	  "\1\0\0\0\u0fd9\u0fda\5\u008f\0\0\u0fda\u022d\1\0\0\0\u0fdb\u0fde\3\u0254"+
	  "\u012a\0\u0fdd\u0fdb\1\0\0\0\u0fdd\u0fde\1\0\0\0\u0fde\u0fe1\1\0\0\0"+
	  "\u0fdf\u0fe2\5n\0\0\u0fe1\u0fdf\1\0\0\0\u0fe1\u0fe2\1\0\0\0\u0fe2\u0fe3"+
	  "\1\0\0\0\u0fe3\u0fe5\3\6\3\0\u0fe5\u0fe7\5\u009b\0\0\u0fe7\u0fe9\5~\0"+
	  "\0\u0fe9\u0feb\3\u0230\u0118\0\u0feb\u0fec\5\20\0\0\u0fec\u022f\1\0\0"+
	  "\0\u0fed\u0ff0\3\u0254\u012a\0\u0fef\u0fed\1\0\0\0\u0fef\u0ff0\1\0\0"+
	  "\0\u0ff0\u0ff1\1\0\0\0\u0ff1\u0ff3\5\'\0\0\u0ff3\u101e\5\u008f\0\0\u0ff5"+
	  "\u0ff8\3\u0254\u012a\0\u0ff7\u0ff5\1\0\0\0\u0ff7\u0ff8\1\0\0\0\u0ff8"+
	  "\u0ff9\1\0\0\0\u0ff9\u0ffb\5\63\0\0\u0ffb\u101e\5\u008f\0\0\u0ffd\u1000"+
	  "\3\u0254\u012a\0\u0fff\u0ffd\1\0\0\0\u0fff\u1000\1\0\0\0\u1000\u1001"+
	  "\1\0\0\0\u1001\u1003\5\'\0\0\u1003\u1007\5\u008f\0\0\u1005\u1008\3\u0254"+
	  "\u012a\0\u1007\u1005\1\0\0\0\u1007\u1008\1\0\0\0\u1008\u1009\1\0\0\0"+
	  "\u1009\u100b\5\63\0\0\u100b\u101e\5\u008f\0\0\u100d\u1010\3\u0254\u012a"+
	  "\0\u100f\u100d\1\0\0\0\u100f\u1010\1\0\0\0\u1010\u1011\1\0\0\0\u1011"+
	  "\u1013\5\63\0\0\u1013\u1017\5\u008f\0\0\u1015\u1018\3\u0254\u012a\0\u1017"+
	  "\u1015\1\0\0\0\u1017\u1018\1\0\0\0\u1018\u1019\1\0\0\0\u1019\u101b\5"+
	  "\'\0\0\u101b\u101e\5\u008f\0\0\u101d\u0fef\1\0\0\0\u101d\u0ff7\1\0\0"+
	  "\0\u101d\u0fff\1\0\0\0\u101d\u100f\1\0\0\0\u101e\u0231\1\0\0\0\u101f"+
	  "\u1022\3\u0254\u012a\0\u1021\u101f\1\0\0\0\u1021\u1022\1\0\0\0\u1022"+
	  "\u1025\1\0\0\0\u1023\u1026\5n\0\0\u1025\u1023\1\0\0\0\u1025\u1026\1\0"+
	  "\0\0\u1026\u1027\1\0\0\0\u1027\u1029\5\u0093\0\0\u1029\u102b\3\6\3\0"+
	  "\u102b\u102d\5\u009b\0\0\u102d\u102e\5\u008f\0\0\u102e\u0233\1\0\0\0"+
	  "\u102f\u1032\3\u0254\u012a\0\u1031\u102f\1\0\0\0\u1031\u1032\1\0\0\0"+
	  "\u1032\u1035\1\0\0\0\u1033\u1036\5n\0\0\u1035\u1033\1\0\0\0\u1035\u1036"+
	  "\1\0\0\0\u1036\u1037\1\0\0\0\u1037\u1039\3\6\3\0\u1039\u103b\5\u0092"+
	  "\0\0\u103b\u103d\5R\0\0\u103d\u103f\3\u01a2\u00d1\0\u103f\u1041\5s\0"+
	  "\0\u1041\u1043\5~\0\0\u1043\u1045\3\u0230\u0118\0\u1045\u1046\5\20\0"+
	  "\0\u1046\u0235\1\0\0\0\u1047\u104a\3\u0254\u012a\0\u1049\u1047\1\0\0"+
	  "\0\u1049\u104a\1\0\0\0\u104a\u104d\1\0\0\0\u104b\u104e\3\u023c\u011e"+
	  "\0\u104d\u104b\1\0\0\0\u104d\u104e\1\0\0\0\u104e\u104f\1\0\0\0\u104f"+
	  "\u1051\5q\0\0\u1051\u1055\5\u009b\0\0\u1053\u1056\3\u0238\u011c\0\u1055"+
	  "\u1053\1\0\0\0\u1055\u1056\1\0\0\0\u1056\u1057\1\0\0\0\u1057\u105b\3"+
	  "\u023a\u011d\0\u1059\u105c\5\u008f\0\0\u105b\u1059\1\0\0\0\u105b\u105c"+
	  "\1\0\0\0\u105c\u0237\1\0\0\0\u105d\u105f\5y\0\0\u105f\u1060\3\20\b\0"+
	  "\u1060\u0239\1\0\0\0\u1061\u1065\5~\0\0\u1063\u1066\3\u0240\u0120\0\u1065"+
	  "\u1063\1\0\0\0\u1065\u1066\1\0\0\0\u1066\u1067\1\0\0\0\u1067\u1072\5"+
	  "\20\0\0\u1069\u106b\5~\0\0\u106b\u106d\3\u0240\u0120\0\u106d\u106f\5"+
	  "*\0\0\u106f\u1070\5\20\0\0\u1070\u1072\1\0\0\0\u1071\u1061\1\0\0\0\u1071"+
	  "\u1069\1\0\0\0\u1072\u023b\1\0\0\0\u1073\u1079\3\u023e\u011f\0\u1075"+
	  "\u1078\3\u023e\u011f\0\u1077\u1075\1\0\0\0\u1078\u107b\1\0\0\0\u1079"+
	  "\u1077\1\0\0\0\u1079\u107a\1\0\0\0\u107a\u023d\1\0\0\0\u107b\u1079\1"+
	  "\0\0\0\u107c\u1087\5n\0\0\u107e\u1087\5v\0\0\u1080\u1087\5\u008a\0\0"+
	  "\u1082\u1087\5N\0\0\u1084\u1087\5\60\0\0\u1086\u107c\1\0\0\0\u1086\u107e"+
	  "\1\0\0\0\u1086\u1080\1\0\0\0\u1086\u1082\1\0\0\0\u1086\u1084\1\0\0\0"+
	  "\u1087\u023f\1\0\0\0\u1088\u1090\3\u0242\u0121\0\u108a\u108c\5*\0\0\u108c"+
	  "\u108f\3\u0242\u0121\0\u108e\u108a\1\0\0\0\u108f\u1092\1\0\0\0\u1090"+
	  "\u108e\1\0\0\0\u1090\u1091\1\0\0\0\u1091\u0241\1\0\0\0\u1092\u1090\1"+
	  "\0\0\0\u1093\u1096\3\u0254\u012a\0\u1095\u1093\1\0\0\0\u1095\u1096\1"+
	  "\0\0\0\u1096\u1097\1\0\0\0\u1097\u10a4\5\u009b\0\0\u1099\u109c\3\u0254"+
	  "\u012a\0\u109b\u1099\1\0\0\0\u109b\u109c\1\0\0\0\u109c\u109d\1\0\0\0"+
	  "\u109d\u109f\5\u009b\0\0\u109f\u10a1\5h\0\0\u10a1\u10a4\3\u00d8l\0\u10a3"+
	  "\u1095\1\0\0\0\u10a3\u109b\1\0\0\0\u10a4\u0243\1\0\0\0\u10a5\u10a8\3"+
	  "\u0254\u012a\0\u10a7\u10a5\1\0\0\0\u10a7\u10a8\1\0\0\0\u10a8\u10ab\1"+
	  "\0\0\0\u10a9\u10ac\3\u0246\u0123\0\u10ab\u10a9\1\0\0\0\u10ab\u10ac\1"+
	  "\0\0\0\u10ac\u10ad\1\0\0\0\u10ad\u10af\5[\0\0\u10af\u10b1\3\u019c\u00ce"+
	  "\0\u10b1\u10b5\5\u009b\0\0\u10b3\u10b6\3\u0162\u00b1\0\u10b5\u10b3\1"+
	  "\0\0\0\u10b5\u10b6\1\0\0\0\u10b6\u10b7\1\0\0\0\u10b7\u10bb\5w\0\0\u10b9"+
	  "\u10bc\3\u01a2\u00d1\0\u10bb\u10b9\1\0\0\0\u10bb\u10bc\1\0\0\0\u10bc"+
	  "\u10bd\1\0\0\0\u10bd\u10c1\5\30\0\0\u10bf\u10c2\3\u016c\u00b6\0\u10c1"+
	  "\u10bf\1\0\0\0\u10c1\u10c2\1\0\0\0\u10c2\u10c3\1\0\0\0\u10c3\u10c4\5"+
	  "\u008f\0\0\u10c4\u0245\1\0\0\0\u10c5\u10cb\3\u0248\u0124\0\u10c7\u10ca"+
	  "\3\u0248\u0124\0\u10c9\u10c7\1\0\0\0\u10ca\u10cd\1\0\0\0\u10cb\u10c9"+
	  "\1\0\0\0\u10cb\u10cc\1\0\0\0\u10cc\u0247\1\0\0\0\u10cd\u10cb\1\0\0\0"+
	  "\u10ce\u10db\5n\0\0\u10d0\u10db\5v\0\0\u10d2\u10db\5\u008a\0\0\u10d4"+
	  "\u10db\5N\0\0\u10d6\u10db\5\60\0\0\u10d8\u10db\3\u0276\u013b\0\u10da"+
	  "\u10ce\1\0\0\0\u10da\u10d0\1\0\0\0\u10da\u10d2\1\0\0\0\u10da\u10d4\1"+
	  "\0\0\0\u10da\u10d6\1\0\0\0\u10da\u10d8\1\0\0\0\u10db\u0249\1\0\0\0\u10dc"+
	  "\u10dd\3\u024c\u0126\0\u10dd\u024b\1\0\0\0\u10de\u10e4\3\u024e\u0127"+
	  "\0\u10e0\u10e3\3\u024e\u0127\0\u10e2\u10e0\1\0\0\0\u10e3\u10e6\1\0\0"+
	  "\0\u10e4\u10e2\1\0\0\0\u10e4\u10e5\1\0\0\0\u10e5\u024d\1\0\0\0\u10e6"+
	  "\u10e4\1\0\0\0\u10e7\u10e9\5R\0\0\u10e9\u10eb\3\u0250\u0128\0\u10eb\u10ed"+
	  "\3\u025e\u012f\0\u10ed\u10ee\5s\0\0\u10ee\u10fa\1\0\0\0\u10ef\u10f1\5"+
	  "R\0\0\u10f1\u10f3\3\u0250\u0128\0\u10f3\u10f5\3\u025e\u012f\0\u10f5\u10f7"+
	  "\5*\0\0\u10f7\u10f8\5s\0\0\u10f8\u10fa\1\0\0\0\u10f9\u10e7\1\0\0\0\u10f9"+
	  "\u10ef\1\0\0\0\u10fa\u024f\1\0\0\0\u10fb\u10fd\3\u0252\u0129\0\u10fd"+
	  "\u10fe\5y\0\0\u10fe\u0251\1\0\0\0\u10ff\u1104\5:\0\0\u1101\u1104\5i\0"+
	  "\0\u1103\u10ff\1\0\0\0\u1103\u1101\1\0\0\0\u1104\u0253\1\0\0\0\u1105"+
	  "\u1106\3\u0256\u012b\0\u1106\u0255\1\0\0\0\u1107\u110d\3\u0258\u012c"+
	  "\0\u1109\u110c\3\u0258\u012c\0\u110b\u1109\1\0\0\0\u110c\u110f\1\0\0"+
	  "\0\u110d\u110b\1\0\0\0\u110d\u110e\1\0\0\0\u110e\u0257\1\0\0\0\u110f"+
	  "\u110d\1\0\0\0\u1110\u1114\5R\0\0\u1112\u1115\3\u025a\u012d\0\u1114\u1112"+
	  "\1\0\0\0\u1114\u1115\1\0\0\0\u1115\u1116\1\0\0\0\u1116\u1118\3\u025e"+
	  "\u012f\0\u1118\u1119\5s\0\0\u1119\u1127\1\0\0\0\u111a\u111e\5R\0\0\u111c"+
	  "\u111f\3\u025a\u012d\0\u111e\u111c\1\0\0\0\u111e\u111f\1\0\0\0\u111f"+
	  "\u1120\1\0\0\0\u1120\u1122\3\u025e\u012f\0\u1122\u1124\5*\0\0\u1124\u1125"+
	  "\5s\0\0\u1125\u1127\1\0\0\0\u1126\u1110\1\0\0\0\u1126\u111a\1\0\0\0\u1127"+
	  "\u0259\1\0\0\0\u1128\u112a\3\u025c\u012e\0\u112a\u112b\5y\0\0\u112b\u025b"+
	  "\1\0\0\0\u112c\u113b\5\u0091\0\0\u112e\u113b\5\u0093\0\0\u1130\u113b"+
	  "\5\177\0\0\u1132\u113b\5\7\0\0\u1134\u113b\5?\0\0\u1136\u113b\5\u008d"+
	  "\0\0\u1138\u113b\5\u0094\0\0\u113a\u112c\1\0\0\0\u113a\u112e\1\0\0\0"+
	  "\u113a\u1130\1\0\0\0\u113a\u1132\1\0\0\0\u113a\u1134\1\0\0\0\u113a\u1136"+
	  "\1\0\0\0\u113a\u1138\1\0\0\0\u113b\u025d\1\0\0\0\u113c\u1144\3\u0260"+
	  "\u0130\0\u113e\u1140\5*\0\0\u1140\u1143\3\u0260\u0130\0\u1142\u113e\1"+
	  "\0\0\0\u1143\u1146\1\0\0\0\u1144\u1142\1\0\0\0\u1144\u1145\1\0\0\0\u1145"+
	  "\u025f\1\0\0\0\u1146\u1144\1\0\0\0\u1147\u114b\3\u0262\u0131\0\u1149"+
	  "\u114c\3\u0264\u0132\0\u114b\u1149\1\0\0\0\u114b\u114c\1\0\0\0\u114c"+
	  "\u0261\1\0\0\0\u114d\u114e\3\2\1\0\u114e\u0263\1\0\0\0\u114f\u1153\5"+
	  "w\0\0\u1151\u1154\3\u0266\u0133\0\u1153\u1151\1\0\0\0\u1153\u1154\1\0"+
	  "\0\0\u1154\u1155\1\0\0\0\u1155\u1168\5\30\0\0\u1157\u1159\5w\0\0\u1159"+
	  "\u115b\3\u0266\u0133\0\u115b\u115d\5*\0\0\u115d\u115f\3\u026a\u0135\0"+
	  "\u115f\u1160\5\30\0\0\u1160\u1168\1\0\0\0\u1161\u1163\5w\0\0\u1163\u1165"+
	  "\3\u026a\u0135\0\u1165\u1166\5\30\0\0\u1166\u1168\1\0\0\0\u1167\u114f"+
	  "\1\0\0\0\u1167\u1157\1\0\0\0\u1167\u1161\1\0\0\0\u1168\u0265\1\0\0\0"+
	  "\u1169\u1171\3\u0268\u0134\0\u116b\u116d\5*\0\0\u116d\u1170\3\u0268\u0134"+
	  "\0\u116f\u116b\1\0\0\0\u1170\u1173\1\0\0\0\u1171\u116f\1\0\0\0\u1171"+
	  "\u1172\1\0\0\0\u1172\u0267\1\0\0\0\u1173\u1171\1\0\0\0\u1174\u1175\3"+
	  "\u026e\u0137\0\u1175\u0269\1\0\0\0\u1176\u117e\3\u026c\u0136\0\u1178"+
	  "\u117a\5*\0\0\u117a\u117d\3\u026c\u0136\0\u117c\u1178\1\0\0\0\u117d\u1180"+
	  "\1\0\0\0\u117e\u117c\1\0\0\0\u117e\u117f\1\0\0\0\u117f\u026b\1\0\0\0"+
	  "\u1180\u117e\1\0\0\0\u1181\u1183\5\u009b\0\0\u1183\u1185\5h\0\0\u1185"+
	  "\u1186\3\u026e\u0137\0\u1186\u026d\1\0\0\0\u1187\u1188\3\u00d4j\0\u1188"+
	  "\u026f\1\0\0\0\u1189\u118a\5\61\0\0\u118a\u0271\1\0\0\0\u118b\u118c\5"+
	  "\61\0\0\u118c\u0273\1\0\0\0\u118d\u118e\5\61\0\0\u118e\u0275\1\0\0\0"+
	  "\u118f\u1190\5\61\0\0\u1190\u0277\1\0\0\0\u1191\u1192\5\61\0\0\u1192"+
	  "\u0279\1\0\0\0\u1193\u1194\5\61\0\0\u1194\u027b\1\0\0\0\u1195\u1196\5"+
	  "\61\0\0\u1196\u027d\1\0\0\0\u1197\u1198\5\61\0\0\u1198\u027f\1\0\0\0"+
	  "\u1199\u119a\5\61\0\0\u119a\u0281\1\0\0\0\u119b\u119c\5\61\0\0\u119c"+
	  "\u0283\1\0\0\0\u119d\u119e\5\61\0\0\u119e\u0285\1\0\0\0\u119f\u11a2\3"+
	  "\u0254\u012a\0\u11a1\u119f\1\0\0\0\u11a1\u11a2\1\0\0\0\u11a2\u11a5\1"+
	  "\0\0\0\u11a3\u11a6\5B\0\0\u11a5\u11a3\1\0\0\0\u11a5\u11a6\1\0\0\0\u11a6"+
	  "\u11a9\1\0\0\0\u11a7\u11aa\5\61\0\0\u11a9\u11a7\1\0\0\0\u11a9\u11aa\1"+
	  "\0\0\0\u11aa\u11ab\1\0\0\0\u11ab\u11ad\5L\0\0\u11ad\u11af\5\u009b\0\0"+
	  "\u11af\u11b1\5w\0\0\u11b1\u11b3\5\30\0\0\u11b3\u11cc\3\u01fa\u00fd\0"+
	  "\u11b5\u11b8\3\u0254\u012a\0\u11b7\u11b5\1\0\0\0\u11b7\u11b8\1\0\0\0"+
	  "\u11b8\u11bb\1\0\0\0\u11b9\u11bc\5\61\0\0\u11bb\u11b9\1\0\0\0\u11bb\u11bc"+
	  "\1\0\0\0\u11bc\u11bf\1\0\0\0\u11bd\u11c0\5B\0\0\u11bf\u11bd\1\0\0\0\u11bf"+
	  "\u11c0\1\0\0\0\u11c0\u11c1\1\0\0\0\u11c1\u11c3\5L\0\0\u11c3\u11c5\5\u009b"+
	  "\0\0\u11c5\u11c7\5w\0\0\u11c7\u11c9\5\30\0\0\u11c9\u11cc\3\u01fa\u00fd"+
	  "\0\u11cb\u11a1\1\0\0\0\u11cb\u11b7\1\0\0\0\u11cc\u0287\1\0\0\0\u11cd"+
	  "\u11d0\5B\0\0\u11cf\u11cd\1\0\0\0\u11cf\u11d0\1\0\0\0\u11d0\u11d3\1\0"+
	  "\0\0\u11d1\u11d4\5\61\0\0\u11d3\u11d1\1\0\0\0\u11d3\u11d4\1\0\0\0\u11d4"+
	  "\u11d5\1\0\0\0\u11d5\u120a\5\u0083\0\0\u11d7\u11da\5\61\0\0\u11d9\u11d7"+
	  "\1\0\0\0\u11d9\u11da\1\0\0\0\u11da\u11dd\1\0\0\0\u11db\u11de\5B\0\0\u11dd"+
	  "\u11db\1\0\0\0\u11dd\u11de\1\0\0\0\u11de\u11df\1\0\0\0\u11df\u120a\5"+
	  "\u0083\0\0\u11e1\u11e4\5B\0\0\u11e3\u11e1\1\0\0\0\u11e3\u11e4\1\0\0\0"+
	  "\u11e4\u11e5\1\0\0\0\u11e5\u11e9\5\u0083\0\0\u11e7\u11ea\5\61\0\0\u11e9"+
	  "\u11e7\1\0\0\0\u11e9\u11ea\1\0\0\0\u11ea\u120a\1\0\0\0\u11eb\u11ee\5"+
	  "\61\0\0\u11ed\u11eb\1\0\0\0\u11ed\u11ee\1\0\0\0\u11ee\u11ef\1\0\0\0\u11ef"+
	  "\u11f3\5\u0083\0\0\u11f1\u11f4\5B\0\0\u11f3\u11f1\1\0\0\0\u11f3\u11f4"+
	  "\1\0\0\0\u11f4\u120a\1\0\0\0\u11f5\u11f9\5\u0083\0\0\u11f7\u11fa\5B\0"+
	  "\0\u11f9\u11f7\1\0\0\0\u11f9\u11fa\1\0\0\0\u11fa\u11fd\1\0\0\0\u11fb"+
	  "\u11fe\5\61\0\0\u11fd\u11fb\1\0\0\0\u11fd\u11fe\1\0\0\0\u11fe\u120a\1"+
	  "\0\0\0\u11ff\u1203\5\u0083\0\0\u1201\u1204\5\61\0\0\u1203\u1201\1\0\0"+
	  "\0\u1203\u1204\1\0\0\0\u1204\u1207\1\0\0\0\u1205\u1208\5B\0\0\u1207\u1205"+
	  "\1\0\0\0\u1207\u1208\1\0\0\0\u1208\u120a\1\0\0\0\u1209\u11cf\1\0\0\0"+
	  "\u1209\u11d9\1\0\0\0\u1209\u11e3\1\0\0\0\u1209\u11ed\1\0\0\0\u1209\u11f5"+
	  "\1\0\0\0\u1209\u11ff\1\0\0\0\u120a\u0289\1\0\0\0\u120b\u1210\3\u028c"+
	  "\u0146\0\u120d\u1210\3\u02a2\u0151\0\u120f\u120b\1\0\0\0\u120f\u120d"+
	  "\1\0\0\0\u1210\u028b\1\0\0\0\u1211\u1213\5\61\0\0\u1213\u1214\3\u00e0"+
	  "p\0\u1214\u028d\1\0\0\0\u1215\u1216\3\u0290\u0148\0\u1216\u028f\1\0\0"+
	  "\0\u1217\u121f\3\2\1\0\u1219\u121e\3\u0210\u0108\0\u121b\u121e\5\u00a8"+
	  "\0\0\u121d\u1219\1\0\0\0\u121d\u121b\1\0\0\0\u121e\u1221\1\0\0\0\u121f"+
	  "\u121d\1\0\0\0\u121f\u1220\1\0\0\0\u1220\u1222\1\0\0\0\u1221\u121f\1"+
	  "\0\0\0\u1222\u1223\5\u00a9\0\0\u1223\u1277\1\0\0\0\u1224\u122c\3\f\6"+
	  "\0\u1226\u122b\3\u0210\u0108\0\u1228\u122b\5\u00a8\0\0\u122a\u1226\1"+
	  "\0\0\0\u122a\u1228\1\0\0\0\u122b\u122e\1\0\0\0\u122c\u122a\1\0\0\0\u122c"+
	  "\u122d\1\0\0\0\u122d\u122f\1\0\0\0\u122e\u122c\1\0\0\0\u122f\u1230\5"+
	  "\u00a9\0\0\u1230\u1277\1\0\0\0\u1231\u1239\3\30\f\0\u1233\u1238\3\u0210"+
	  "\u0108\0\u1235\u1238\5\u00a8\0\0\u1237\u1233\1\0\0\0\u1237\u1235\1\0"+
	  "\0\0\u1238\u123b\1\0\0\0\u1239\u1237\1\0\0\0\u1239\u123a\1\0\0\0\u123a"+
	  "\u123c\1\0\0\0\u123b\u1239\1\0\0\0\u123c\u123d\5\u00a9\0\0\u123d\u1277"+
	  "\1\0\0\0\u123e\u1246\3\34\16\0\u1240\u1245\3\u0210\u0108\0\u1242\u1245"+
	  "\5\u00a8\0\0\u1244\u1240\1\0\0\0\u1244\u1242\1\0\0\0\u1245\u1248\1\0"+
	  "\0\0\u1246\u1244\1\0\0\0\u1246\u1247\1\0\0\0\u1247\u1249\1\0\0\0\u1248"+
	  "\u1246\1\0\0\0\u1249\u124a\5\u00a9\0\0\u124a\u1277\1\0\0\0\u124b\u1253"+
	  "\3\36\17\0\u124d\u1252\3\u0210\u0108\0\u124f\u1252\5\u00a8\0\0\u1251"+
	  "\u124d\1\0\0\0\u1251\u124f\1\0\0\0\u1252\u1255\1\0\0\0\u1253\u1251\1"+
	  "\0\0\0\u1253\u1254\1\0\0\0\u1254\u1256\1\0\0\0\u1255\u1253\1\0\0\0\u1256"+
	  "\u1257\5\u00a9\0\0\u1257\u1277\1\0\0\0\u1258\u1260\3 \20\0\u125a\u125f"+
	  "\3\u0210\u0108\0\u125c\u125f\5\u00a8\0\0\u125e\u125a\1\0\0\0\u125e\u125c"+
	  "\1\0\0\0\u125f\u1262\1\0\0\0\u1260\u125e\1\0\0\0\u1260\u1261\1\0\0\0"+
	  "\u1261\u1263\1\0\0\0\u1262\u1260\1\0\0\0\u1263\u1264\5\u00a9\0\0\u1264"+
	  "\u1277\1\0\0\0\u1265\u126d\3\u0166\u00b3\0\u1267\u126c\3\u0210\u0108"+
	  "\0\u1269\u126c\5\u00a8\0\0\u126b\u1267\1\0\0\0\u126b\u1269\1\0\0\0\u126c"+
	  "\u126f\1\0\0\0\u126d\u126b\1\0\0\0\u126d\u126e\1\0\0\0\u126e\u1270\1"+
	  "\0\0\0\u126f\u126d\1\0\0\0\u1270\u1271\5\u00a9\0\0\u1271\u1277\1\0\0"+
	  "\0\u1272\u1274\5\u00aa\0\0\u1274\u1277\5\u00a9\0\0\u1276\u1217\1\0\0"+
	  "\0\u1276\u1224\1\0\0\0\u1276\u1231\1\0\0\0\u1276\u123e\1\0\0\0\u1276"+
	  "\u124b\1\0\0\0\u1276\u1258\1\0\0\0\u1276\u1265\1\0\0\0\u1276\u1272\1"+
	  "\0\0\0\u1277\u1287\1\0\0\0\u1278\u1280\4\u0148\0\1\u127a\u127f\3\u0210"+
	  "\u0108\0\u127c\u127f\5\u00a8\0\0\u127e\u127a\1\0\0\0\u127e\u127c\1\0"+
	  "\0\0\u127f\u1282\1\0\0\0\u1280\u127e\1\0\0\0\u1280\u1281\1\0\0\0\u1281"+
	  "\u1283\1\0\0\0\u1282\u1280\1\0\0\0\u1283\u1286\5\u00a9\0\0\u1285\u1278"+
	  "\1\0\0\0\u1286\u1289\1\0\0\0\u1287\u1285\1\0\0\0\u1287\u1288\1\0\0\0"+
	  "\u1288\u0291\1\0\0\0\u1289\u1287\1\0\0\0\u128a\u129d\3\2\1\0\u128c\u129d"+
	  "\3\f\6\0\u128e\u129d\3\30\f\0\u1290\u129d\3\34\16\0\u1292\u129d\3\36"+
	  "\17\0\u1294\u129d\3 \20\0\u1296\u129d\3\u0166\u00b3\0\u1298\u129a\5\u00aa"+
	  "\0\0\u129a\u129d\5\u00a9\0\0\u129c\u128a\1\0\0\0\u129c\u128c\1\0\0\0"+
	  "\u129c\u128e\1\0\0\0\u129c\u1290\1\0\0\0\u129c\u1292\1\0\0\0\u129c\u1294"+
	  "\1\0\0\0\u129c\u1296\1\0\0\0\u129c\u1298\1\0\0\0\u129d\u12a6\1\0\0\0"+
	  "\u129e\u12a5\5\u00a9\0\0\u12a0\u12a5\5\u00a8\0\0\u12a2\u12a5\3\u0210"+
	  "\u0108\0\u12a4\u129e\1\0\0\0\u12a4\u12a0\1\0\0\0\u12a4\u12a2\1\0\0\0"+
	  "\u12a5\u12a8\1\0\0\0\u12a6\u12a4\1\0\0\0\u12a6\u12a7\1\0\0\0\u12a7\u0293"+
	  "\1\0\0\0\u12a8\u12a6\1\0\0\0\u12a9\u12b0\3\u029a\u014d\0\u12ab\u12b0"+
	  "\3\u029c\u014e\0\u12ad\u12b0\3\u02a0\u0150\0\u12af\u12a9\1\0\0\0\u12af"+
	  "\u12ab\1\0\0\0\u12af\u12ad\1\0\0\0\u12b0\u0295\1\0\0\0\u12b1\u12b6\3"+
	  "\u0298\u014c\0\u12b3\u12b6\3\u029e\u014f\0\u12b5\u12b1\1\0\0\0\u12b5"+
	  "\u12b3\1\0\0\0\u12b6\u0297\1\0\0\0\u12b7\u12b9\5\u00a9\0\0\u12b9\u12ba"+
	  "\3x<\0\u12ba\u0299\1\0\0\0\u12bb\u12bd\3\62\31\0\u12bd\u12bf\5`\0\0\u12bf"+
	  "\u12c0\5\u009b\0\0\u12c0\u029b\1\0\0\0\u12c1\u12c3\3\64\32\0\u12c3\u12c5"+
	  "\5R\0\0\u12c5\u12c7\3\u00d4j\0\u12c7\u12c8\5s\0\0\u12c8\u029d\1\0\0\0"+
	  "\u12c9\u12cb\5P\0\0\u12cb\u12cc\3x<\0\u12cc\u029f\1\0\0\0\u12cd\u12cf"+
	  "\5$\0\0\u12cf\u12d1\5w\0\0\u12d1\u12d3\3\u0292\u0149\0\u12d3\u12d4\5"+
	  "\30\0\0\u12d4\u02a1\1\0\0\0\u12d5\u12d7\5c\0\0\u12d7\u12d9\5w\0\0\u12d9"+
	  "\u12db\3\u0290\u0148\0\u12db\u12dd\3\u02a4\u0152\0\u12dd\u12df\5\30\0"+
	  "\0\u12df\u12e0\3\u00deo\0\u12e0\u02a3\1\0\0\0\u12e1\u12e9\3\u02a6\u0153"+
	  "\0\u12e3\u12e5\5*\0\0\u12e5\u12e8\3\u02a6\u0153\0\u12e7\u12e3\1\0\0\0"+
	  "\u12e8\u12eb\1\0\0\0\u12e9\u12e7\1\0\0\0\u12e9\u12ea\1\0\0\0\u12ea\u02a5"+
	  "\1\0\0\0\u12eb\u12e9\1\0\0\0\u12ec\u12ee\5\u009b\0\0\u12ee\u12f0\5h\0"+
	  "\0\u12f0\u12f1\3\u02a8\u0154\0\u12f1\u02a7\1\0\0\0\u12f2\u12f4\5P\0\0"+
	  "\u12f4\u12f9\3(\24\0\u12f6\u12f9\3\u00d4j\0\u12f8\u12f2\1\0\0\0\u12f8"+
	  "\u12f6\1\0\0\0\u12f9\u02a9\1\0\0\0\u12fa\u12fb\3\u02ac\u0156\0\u12fb"+
	  "\u02ab\1\0\0\0\u12fc\u12ff\3\u0254\u012a\0\u12fe\u12fc\1\0\0\0\u12fe"+
	  "\u12ff\1\0\0\0\u12ff\u1302\1\0\0\0\u1300\u1303\3\u02ae\u0157\0\u1302"+
	  "\u1300\1\0\0\0\u1302\u1303\1\0\0\0\u1303\u1304\1\0\0\0\u1304\u1306\5"+
	  "c\0\0\u1306\u1308\3\u02b2\u0159\0\u1308\u130a\3\u02b4\u015a\0\u130a\u130b"+
	  "\5\u008f\0\0\u130b\u02ad\1\0\0\0\u130c\u1313\3\u02b0\u0158\0\u130e\u1310"+
	  "\3\u02b0\u0158\0\u1310\u1311\3\u02ae\u0157\0\u1311\u1313\1\0\0\0\u1312"+
	  "\u130c\1\0\0\0\u1312\u130e\1\0\0\0\u1313\u02af\1\0\0\0\u1314\u1321\5"+
	  "n\0\0\u1316\u1321\5v\0\0\u1318\u1321\5\u008a\0\0\u131a\u1321\5N\0\0\u131c"+
	  "\u1321\5\60\0\0\u131e\u1321\5\61\0\0\u1320\u1314\1\0\0\0\u1320\u1316"+
	  "\1\0\0\0\u1320\u1318\1\0\0\0\u1320\u131a\1\0\0\0\u1320\u131c\1\0\0\0"+
	  "\u1320\u131e\1\0\0\0\u1321\u02b1\1\0\0\0\u1322\u1323\3\6\3\0\u1323\u02b3"+
	  "\1\0\0\0\u1324\u132b\3\u02b6\u015b\0\u1326\u1328\3\u02b6\u015b\0\u1328"+
	  "\u1329\3\u02b4\u015a\0\u1329\u132b\1\0\0\0\u132a\u1324\1\0\0\0\u132a"+
	  "\u1326\1\0\0\0\u132b\u02b5\1\0\0\0\u132c\u132e\5\u009b\0\0\u132e\u1330"+
	  "\5R\0\0\u1330\u1332\3\u00d8l\0\u1332\u1333\5s\0\0\u1333\u02b7\1\0\0\0"+
	  "\u1334\u1335\3\u02ba\u015d\0\u1335\u02b9\1\0\0\0\u1336\u1338\5W\0\0\u1338"+
	  "\u133a\3\u0292\u0149\0\u133a\u133c\5R\0\0\u133c\u133e\3\u00d4j\0\u133e"+
	  "\u133f\5s\0\0\u133f\u02bb\1\0\0\0\u1340\u134f\1\0\0\0\u1342\u134f\5\u009c"+
	  "\0\0\u1344\u134f\5\u009d\0\0\u1346\u134f\5\u009e\0\0\u1348\u134f\5\u009f"+
	  "\0\0\u134a\u134f\5\u00a0\0\0\u134c\u134f\5\u00a1\0\0\u134e\u1340\1\0"+
	  "\0\0\u134e\u1342\1\0\0\0\u134e\u1344\1\0\0\0\u134e\u1346\1\0\0\0\u134e"+
	  "\u1348\1\0\0\0\u134e\u134a\1\0\0\0\u134e\u134c\1\0\0\0\u134f\u02bd\1"+
	  "\0\0\0\u0195\u02c6\1\u02ca\1\u02d2\1\u02d6\1\u02eb\1\u02f3\1\u02f5\1"+
	  "\u02fc\1\u0304\1\u030a\1\u0312\1\u0326\1\u032c\1\u033e\1\u0348\1\u035c"+
	  "\1\u036b\1\u0370\1\u0382\1\u0388\1\u0398\1\u03a2\1\u03b0\1\u03d8\1\u03e0"+
	  "\1\u03e6\1\u03fe\1\u0400\1\u0407\1\u0417\1\u0421\1\u0429\1\u0449\1\u0451"+
	  "\1\u0465\1\u0478\1\u048a\1\u0490\1\u0498\1\u049e\1\u04a4\1\u04b0\1\u04ba"+
	  "\1\u04c7\1\u04d7\1\u04e1\1\u04ec\1\u04fa\1\u04fe\1\u050c\1\u0520\1\u052c"+
	  "\1\u0536\1\u0545\1\u055f\1\u0565\1\u056b\1\u0573\1\u0577\1\u057e\1\u0588"+
	  "\1\u05bd\1\u05dd\1\u05df\1\u05ec\1\u05ee\1\u05fb\1\u05fd\1\u061a\1\u061c"+
	  "\1\u0629\1\u062b\1\u0636\1\u0641\1\u064c\1\u0657\1\u0662\1\u066d\1\u067b"+
	  "\1\u0687\1\u068f\1\u0695\1\u06a1\1\u06a6\1\u06b0\1\u06b6\1\u06bc\1\u06c6"+
	  "\1\u06cf\1\u06d9\1\u06e3\1\u06e9\1\u06f1\1\u0700\1\u0712\1\u0726\1\u0746"+
	  "\1\u074d\1\u0753\1\u0759\1\u0789\1\u078f\1\u0797\1\u07a3\1\u07bf\1\u07c5"+
	  "\1\u07cf\1\u07e2\1\u07ec\1\u07f6\1\u0801\1\u0809\1\u0823\1\u0829\1\u0843"+
	  "\1\u0853\1\u085d\1\u086a\1\u0877\1\u0881\1\u08a1\1\u08a7\1\u08ad\1\u08b7"+
	  "\1\u08c5\1\u08e2\1\u0900\1\u0906\1\u090e\1\u0926\1\u092c\1\u0930\1\u0934"+
	  "\1\u093c\1\u0947\1\u0975\1\u0985\1\u0989\1\u098d\1\u0991\1\u0995\1\u099f"+
	  "\1\u09a9\1\u09b0\1\u09b4\1\u09b8\1\u09c2\1\u09d3\1\u09da\1\u09f2\1\u09f9"+
	  "\1\u0a05\1\u0a0f\1\u0a13\1\u0a17\1\u0a1b\1\u0a23\1\u0a27\1\u0a2b\1\u0a31"+
	  "\1\u0a39\1\u0a4e\1\u0a58\1\u0a60\1\u0a66\1\u0a7b\1\u0a85\1\u0a8e\1\u0abb"+
	  "\1\u0ac3\1\u0ac9\1\u0ad1\1\u0ad5\1\u0ae2\1\u0aea\1\u0b02\1\u0b06\1\u0b0a"+
	  "\1\u0b18\1\u0b24\1\u0b2e\1\u0b39\1\u0b3d\1\u0b4b\1\u0b60\1\u0b6a\1\u0b75"+
	  "\1\u0b7b\1\u0b83\1\u0b87\1\u0b8b\1\u0b93\1\u0b99\1\u0b9f\1\u0ba7\1\u0bc2"+
	  "\1\u0bc8\1\u0bd2\1\u0bd8\1\u0be4\1\u0bee\1\u0bf3\1\u0bf7\1\u0bff\1\u0c0b"+
	  "\1\u0c0f\1\u0c19\1\u0c1d\1\u0c2f\1\u0c4a\1\u0c50\1\u0c56\1\u0c58\1\u0c5c"+
	  "\1\u0c60\1\u0c68\1\u0c6c\1\u0c80\1\u0c86\1\u0c8a\1\u0c8e\1\u0c9a\1\u0c9e"+
	  "\1\u0cac\1\u0cb4\1\u0ccf\1\u0cd9\1\u0cdd\1\u0ce5\1\u0ced\1\u0cf1\1\u0d01"+
	  "\1\u0d1a\1\u0d34\1\u0d38\1\u0d46\1\u0d51\1\u0d59\1\u0d79\1\u0daf\1\u0dcd"+
	  "\1\u0dd3\1\u0dd7\1\u0ddb\1\u0de7\1\u0df6\1\u0dfe\1\u0e04\1\u0e0e\1\u0e1a"+
	  "\1\u0e1e\1\u0e24\1\u0e28\1\u0e36\1\u0e3e\1\u0e42\1\u0e48\1\u0e4c\1\u0e50"+
	  "\1\u0e5e\1\u0e64\1\u0e68\1\u0e6c\1\u0e70\1\u0e78\1\u0e7c\1\u0e80\1\u0e86"+
	  "\1\u0e8e\1\u0e9d\1\u0ea7\1\u0eb1\1\u0eca\1\u0ede\1\u0ee4\1\u0eeb\1\u0eff"+
	  "\1\u0f07\1\u0f09\1\u0f10\1\u0f16\1\u0f20\1\u0f27\1\u0f33\1\u0f3d\1\u0f42"+
	  "\1\u0f46\1\u0f4a\1\u0f52\1\u0f56\1\u0f5a\1\u0f60\1\u0f68\1\u0f77\1\u0f81"+
	  "\1\u0f85\1\u0f8d\1\u0f91\1\u0f97\1\u0f9e\1\u0fa8\1\u0fb2\1\u0fbd\1\u0fc1"+
	  "\1\u0fc5\1\u0fd1\1\u0fd7\1\u0fdd\1\u0fe1\1\u0fef\1\u0ff7\1\u0fff\1\u1007"+
	  "\1\u100f\1\u1017\1\u101d\1\u1021\1\u1025\1\u1031\1\u1035\1\u1049\1\u104d"+
	  "\1\u1055\1\u105b\1\u1065\1\u1071\1\u1079\1\u1086\1\u1090\1\u1095\1\u109b"+
	  "\1\u10a3\1\u10a7\1\u10ab\1\u10b5\1\u10bb\1\u10c1\1\u10cb\1\u10da\1\u10e4"+
	  "\1\u10f9\1\u1103\1\u110d\1\u1114\1\u111e\1\u1126\1\u113a\1\u1144\1\u114b"+
	  "\1\u1153\1\u1167\1\u1171\1\u117e\1\u11a1\1\u11a5\1\u11a9\1\u11b7\1\u11bb"+
	  "\1\u11bf\1\u11cb\1\u11cf\1\u11d3\1\u11d9\1\u11dd\1\u11e3\1\u11e9\1\u11ed"+
	  "\1\u11f3\1\u11f9\1\u11fd\1\u1203\1\u1207\1\u1209\1\u120f\1\u121d\1\u121f"+
	  "\1\u122a\1\u122c\1\u1237\1\u1239\1\u1244\1\u1246\1\u1251\1\u1253\1\u125e"+
	  "\1\u1260\1\u126b\1\u126d\1\u1276\1\u127e\1\u1280\1\u1287\1\u129c\1\u12a4"+
	  "\1\u12a6\1\u12af\1\u12b5\1\u12e9\1\u12f8\1\u12fe\1\u1302\1\u1312\1\u1320"+
	  "\1\u132a\1\u134e\1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}