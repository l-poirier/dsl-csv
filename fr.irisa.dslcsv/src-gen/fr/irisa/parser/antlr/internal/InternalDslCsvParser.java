package fr.irisa.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.irisa.services.DslCsvGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslCsvParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'!'", "'|'", "'&'", "'<'", "'>'", "'=='", "'<='", "'>='", "'!='", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'{'", "','", "'}'", "'Count'", "'Sort'", "'Dim'", "'Print'", "'Features'", "'Row'", "'Column'", "'Product'", "'Sum'", "'Mean'", "'Filter'", "'Unselect'", "'Select'", "'Save'", "'Acquire'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslCsvParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslCsvParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslCsvParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDslCsv.g"; }



     	private DslCsvGrammarAccess grammarAccess;

        public InternalDslCsvParser(TokenStream input, DslCsvGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected DslCsvGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalDslCsv.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalDslCsv.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalDslCsv.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalDslCsv.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_expr_0_0= ruleExpression ) ) (otherlv_1= ';' ( (lv_expr_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:77:2: ( ( ( (lv_expr_0_0= ruleExpression ) ) (otherlv_1= ';' ( (lv_expr_2_0= ruleExpression ) ) )* ) )
            // InternalDslCsv.g:78:2: ( ( (lv_expr_0_0= ruleExpression ) ) (otherlv_1= ';' ( (lv_expr_2_0= ruleExpression ) ) )* )
            {
            // InternalDslCsv.g:78:2: ( ( (lv_expr_0_0= ruleExpression ) ) (otherlv_1= ';' ( (lv_expr_2_0= ruleExpression ) ) )* )
            // InternalDslCsv.g:79:3: ( (lv_expr_0_0= ruleExpression ) ) (otherlv_1= ';' ( (lv_expr_2_0= ruleExpression ) ) )*
            {
            // InternalDslCsv.g:79:3: ( (lv_expr_0_0= ruleExpression ) )
            // InternalDslCsv.g:80:4: (lv_expr_0_0= ruleExpression )
            {
            // InternalDslCsv.g:80:4: (lv_expr_0_0= ruleExpression )
            // InternalDslCsv.g:81:5: lv_expr_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getExprExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_expr_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					add(
            						current,
            						"expr",
            						lv_expr_0_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDslCsv.g:98:3: (otherlv_1= ';' ( (lv_expr_2_0= ruleExpression ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDslCsv.g:99:4: otherlv_1= ';' ( (lv_expr_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalDslCsv.g:103:4: ( (lv_expr_2_0= ruleExpression ) )
            	    // InternalDslCsv.g:104:5: (lv_expr_2_0= ruleExpression )
            	    {
            	    // InternalDslCsv.g:104:5: (lv_expr_2_0= ruleExpression )
            	    // InternalDslCsv.g:105:6: lv_expr_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getExprExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_expr_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expr",
            	    							lv_expr_2_0,
            	    							"fr.irisa.DslCsv.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExpression"
    // InternalDslCsv.g:127:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDslCsv.g:127:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDslCsv.g:128:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDslCsv.g:134:1: ruleExpression returns [EObject current=null] : (this_FuncCall_0= ruleFuncCall | this_Assign_1= ruleAssign | this_LogicalExpression_2= ruleLogicalExpression | this_Nop_3= ruleNop ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FuncCall_0 = null;

        EObject this_Assign_1 = null;

        EObject this_LogicalExpression_2 = null;

        EObject this_Nop_3 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:140:2: ( (this_FuncCall_0= ruleFuncCall | this_Assign_1= ruleAssign | this_LogicalExpression_2= ruleLogicalExpression | this_Nop_3= ruleNop ) )
            // InternalDslCsv.g:141:2: (this_FuncCall_0= ruleFuncCall | this_Assign_1= ruleAssign | this_LogicalExpression_2= ruleLogicalExpression | this_Nop_3= ruleNop )
            {
            // InternalDslCsv.g:141:2: (this_FuncCall_0= ruleFuncCall | this_Assign_1= ruleAssign | this_LogicalExpression_2= ruleLogicalExpression | this_Nop_3= ruleNop )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==EOF||LA2_2==11||(LA2_2>=14 && LA2_2<=26)||LA2_2==28||(LA2_2>=30 && LA2_2<=31)) ) {
                    alt2=3;
                }
                else if ( (LA2_2==12) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 27:
            case 29:
                {
                alt2=3;
                }
                break;
            case 13:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDslCsv.g:142:3: this_FuncCall_0= ruleFuncCall
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFuncCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncCall_0=ruleFuncCall();

                    state._fsp--;


                    			current = this_FuncCall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDslCsv.g:151:3: this_Assign_1= ruleAssign
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAssignParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assign_1=ruleAssign();

                    state._fsp--;


                    			current = this_Assign_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDslCsv.g:160:3: this_LogicalExpression_2= ruleLogicalExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalExpression_2=ruleLogicalExpression();

                    state._fsp--;


                    			current = this_LogicalExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDslCsv.g:169:3: this_Nop_3= ruleNop
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Nop_3=ruleNop();

                    state._fsp--;


                    			current = this_Nop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssign"
    // InternalDslCsv.g:181:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // InternalDslCsv.g:181:47: (iv_ruleAssign= ruleAssign EOF )
            // InternalDslCsv.g:182:2: iv_ruleAssign= ruleAssign EOF
            {
             newCompositeNode(grammarAccess.getAssignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssign=ruleAssign();

            state._fsp--;

             current =iv_ruleAssign; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // InternalDslCsv.g:188:1: ruleAssign returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        EObject lv_val_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:194:2: ( ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleExpression ) ) ) )
            // InternalDslCsv.g:195:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleExpression ) ) )
            {
            // InternalDslCsv.g:195:2: ( ( (lv_var_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleExpression ) ) )
            // InternalDslCsv.g:196:3: ( (lv_var_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= ruleExpression ) )
            {
            // InternalDslCsv.g:196:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalDslCsv.g:197:4: (lv_var_0_0= RULE_ID )
            {
            // InternalDslCsv.g:197:4: (lv_var_0_0= RULE_ID )
            // InternalDslCsv.g:198:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_var_0_0, grammarAccess.getAssignAccess().getVarIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignAccess().getEqualsSignKeyword_1());
            		
            // InternalDslCsv.g:218:3: ( (lv_val_2_0= ruleExpression ) )
            // InternalDslCsv.g:219:4: (lv_val_2_0= ruleExpression )
            {
            // InternalDslCsv.g:219:4: (lv_val_2_0= ruleExpression )
            // InternalDslCsv.g:220:5: lv_val_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignAccess().getValExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleNop"
    // InternalDslCsv.g:241:1: entryRuleNop returns [EObject current=null] : iv_ruleNop= ruleNop EOF ;
    public final EObject entryRuleNop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNop = null;


        try {
            // InternalDslCsv.g:241:44: (iv_ruleNop= ruleNop EOF )
            // InternalDslCsv.g:242:2: iv_ruleNop= ruleNop EOF
            {
             newCompositeNode(grammarAccess.getNopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNop=ruleNop();

            state._fsp--;

             current =iv_ruleNop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNop"


    // $ANTLR start "ruleNop"
    // InternalDslCsv.g:248:1: ruleNop returns [EObject current=null] : (otherlv_0= '!' ( (lv_expr_1_0= ruleExpression ) ) ) ;
    public final EObject ruleNop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:254:2: ( (otherlv_0= '!' ( (lv_expr_1_0= ruleExpression ) ) ) )
            // InternalDslCsv.g:255:2: (otherlv_0= '!' ( (lv_expr_1_0= ruleExpression ) ) )
            {
            // InternalDslCsv.g:255:2: (otherlv_0= '!' ( (lv_expr_1_0= ruleExpression ) ) )
            // InternalDslCsv.g:256:3: otherlv_0= '!' ( (lv_expr_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNopAccess().getExclamationMarkKeyword_0());
            		
            // InternalDslCsv.g:260:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalDslCsv.g:261:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalDslCsv.g:261:4: (lv_expr_1_0= ruleExpression )
            // InternalDslCsv.g:262:5: lv_expr_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNopAccess().getExprExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNopRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNop"


    // $ANTLR start "entryRuleLogicalExpression"
    // InternalDslCsv.g:283:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // InternalDslCsv.g:283:58: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // InternalDslCsv.g:284:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalExpression=ruleLogicalExpression();

            state._fsp--;

             current =iv_ruleLogicalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalExpression"


    // $ANTLR start "ruleLogicalExpression"
    // InternalDslCsv.g:290:1: ruleLogicalExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleCompExpression ) ) ( ( ( (lv_op_1_1= '|' | lv_op_1_2= '&' ) ) ) ( (lv_right_2_0= ruleLogicalExpression ) ) )? ) ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:296:2: ( ( ( (lv_left_0_0= ruleCompExpression ) ) ( ( ( (lv_op_1_1= '|' | lv_op_1_2= '&' ) ) ) ( (lv_right_2_0= ruleLogicalExpression ) ) )? ) )
            // InternalDslCsv.g:297:2: ( ( (lv_left_0_0= ruleCompExpression ) ) ( ( ( (lv_op_1_1= '|' | lv_op_1_2= '&' ) ) ) ( (lv_right_2_0= ruleLogicalExpression ) ) )? )
            {
            // InternalDslCsv.g:297:2: ( ( (lv_left_0_0= ruleCompExpression ) ) ( ( ( (lv_op_1_1= '|' | lv_op_1_2= '&' ) ) ) ( (lv_right_2_0= ruleLogicalExpression ) ) )? )
            // InternalDslCsv.g:298:3: ( (lv_left_0_0= ruleCompExpression ) ) ( ( ( (lv_op_1_1= '|' | lv_op_1_2= '&' ) ) ) ( (lv_right_2_0= ruleLogicalExpression ) ) )?
            {
            // InternalDslCsv.g:298:3: ( (lv_left_0_0= ruleCompExpression ) )
            // InternalDslCsv.g:299:4: (lv_left_0_0= ruleCompExpression )
            {
            // InternalDslCsv.g:299:4: (lv_left_0_0= ruleCompExpression )
            // InternalDslCsv.g:300:5: lv_left_0_0= ruleCompExpression
            {

            					newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLeftCompExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_left_0_0=ruleCompExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"fr.irisa.DslCsv.CompExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDslCsv.g:317:3: ( ( ( (lv_op_1_1= '|' | lv_op_1_2= '&' ) ) ) ( (lv_right_2_0= ruleLogicalExpression ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDslCsv.g:318:4: ( ( (lv_op_1_1= '|' | lv_op_1_2= '&' ) ) ) ( (lv_right_2_0= ruleLogicalExpression ) )
                    {
                    // InternalDslCsv.g:318:4: ( ( (lv_op_1_1= '|' | lv_op_1_2= '&' ) ) )
                    // InternalDslCsv.g:319:5: ( (lv_op_1_1= '|' | lv_op_1_2= '&' ) )
                    {
                    // InternalDslCsv.g:319:5: ( (lv_op_1_1= '|' | lv_op_1_2= '&' ) )
                    // InternalDslCsv.g:320:6: (lv_op_1_1= '|' | lv_op_1_2= '&' )
                    {
                    // InternalDslCsv.g:320:6: (lv_op_1_1= '|' | lv_op_1_2= '&' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==15) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalDslCsv.g:321:7: lv_op_1_1= '|'
                            {
                            lv_op_1_1=(Token)match(input,14,FOLLOW_7); 

                            							newLeafNode(lv_op_1_1, grammarAccess.getLogicalExpressionAccess().getOpVerticalLineKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLogicalExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDslCsv.g:332:7: lv_op_1_2= '&'
                            {
                            lv_op_1_2=(Token)match(input,15,FOLLOW_7); 

                            							newLeafNode(lv_op_1_2, grammarAccess.getLogicalExpressionAccess().getOpAmpersandKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLogicalExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalDslCsv.g:345:4: ( (lv_right_2_0= ruleLogicalExpression ) )
                    // InternalDslCsv.g:346:5: (lv_right_2_0= ruleLogicalExpression )
                    {
                    // InternalDslCsv.g:346:5: (lv_right_2_0= ruleLogicalExpression )
                    // InternalDslCsv.g:347:6: lv_right_2_0= ruleLogicalExpression
                    {

                    						newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRightLogicalExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleLogicalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"fr.irisa.DslCsv.LogicalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleCompExpression"
    // InternalDslCsv.g:369:1: entryRuleCompExpression returns [EObject current=null] : iv_ruleCompExpression= ruleCompExpression EOF ;
    public final EObject entryRuleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompExpression = null;


        try {
            // InternalDslCsv.g:369:55: (iv_ruleCompExpression= ruleCompExpression EOF )
            // InternalDslCsv.g:370:2: iv_ruleCompExpression= ruleCompExpression EOF
            {
             newCompositeNode(grammarAccess.getCompExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompExpression=ruleCompExpression();

            state._fsp--;

             current =iv_ruleCompExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompExpression"


    // $ANTLR start "ruleCompExpression"
    // InternalDslCsv.g:376:1: ruleCompExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleArithExpression ) ) ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '==' | lv_op_1_4= '<=' | lv_op_1_5= '>=' | lv_op_1_6= '!=' ) ) ) ( (lv_right_2_0= ruleCompExpression ) ) )? ) ;
    public final EObject ruleCompExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        Token lv_op_1_4=null;
        Token lv_op_1_5=null;
        Token lv_op_1_6=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:382:2: ( ( ( (lv_left_0_0= ruleArithExpression ) ) ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '==' | lv_op_1_4= '<=' | lv_op_1_5= '>=' | lv_op_1_6= '!=' ) ) ) ( (lv_right_2_0= ruleCompExpression ) ) )? ) )
            // InternalDslCsv.g:383:2: ( ( (lv_left_0_0= ruleArithExpression ) ) ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '==' | lv_op_1_4= '<=' | lv_op_1_5= '>=' | lv_op_1_6= '!=' ) ) ) ( (lv_right_2_0= ruleCompExpression ) ) )? )
            {
            // InternalDslCsv.g:383:2: ( ( (lv_left_0_0= ruleArithExpression ) ) ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '==' | lv_op_1_4= '<=' | lv_op_1_5= '>=' | lv_op_1_6= '!=' ) ) ) ( (lv_right_2_0= ruleCompExpression ) ) )? )
            // InternalDslCsv.g:384:3: ( (lv_left_0_0= ruleArithExpression ) ) ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '==' | lv_op_1_4= '<=' | lv_op_1_5= '>=' | lv_op_1_6= '!=' ) ) ) ( (lv_right_2_0= ruleCompExpression ) ) )?
            {
            // InternalDslCsv.g:384:3: ( (lv_left_0_0= ruleArithExpression ) )
            // InternalDslCsv.g:385:4: (lv_left_0_0= ruleArithExpression )
            {
            // InternalDslCsv.g:385:4: (lv_left_0_0= ruleArithExpression )
            // InternalDslCsv.g:386:5: lv_left_0_0= ruleArithExpression
            {

            					newCompositeNode(grammarAccess.getCompExpressionAccess().getLeftArithExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_left_0_0=ruleArithExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"fr.irisa.DslCsv.ArithExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDslCsv.g:403:3: ( ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '==' | lv_op_1_4= '<=' | lv_op_1_5= '>=' | lv_op_1_6= '!=' ) ) ) ( (lv_right_2_0= ruleCompExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=16 && LA6_0<=21)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDslCsv.g:404:4: ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '==' | lv_op_1_4= '<=' | lv_op_1_5= '>=' | lv_op_1_6= '!=' ) ) ) ( (lv_right_2_0= ruleCompExpression ) )
                    {
                    // InternalDslCsv.g:404:4: ( ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '==' | lv_op_1_4= '<=' | lv_op_1_5= '>=' | lv_op_1_6= '!=' ) ) )
                    // InternalDslCsv.g:405:5: ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '==' | lv_op_1_4= '<=' | lv_op_1_5= '>=' | lv_op_1_6= '!=' ) )
                    {
                    // InternalDslCsv.g:405:5: ( (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '==' | lv_op_1_4= '<=' | lv_op_1_5= '>=' | lv_op_1_6= '!=' ) )
                    // InternalDslCsv.g:406:6: (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '==' | lv_op_1_4= '<=' | lv_op_1_5= '>=' | lv_op_1_6= '!=' )
                    {
                    // InternalDslCsv.g:406:6: (lv_op_1_1= '<' | lv_op_1_2= '>' | lv_op_1_3= '==' | lv_op_1_4= '<=' | lv_op_1_5= '>=' | lv_op_1_6= '!=' )
                    int alt5=6;
                    switch ( input.LA(1) ) {
                    case 16:
                        {
                        alt5=1;
                        }
                        break;
                    case 17:
                        {
                        alt5=2;
                        }
                        break;
                    case 18:
                        {
                        alt5=3;
                        }
                        break;
                    case 19:
                        {
                        alt5=4;
                        }
                        break;
                    case 20:
                        {
                        alt5=5;
                        }
                        break;
                    case 21:
                        {
                        alt5=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }

                    switch (alt5) {
                        case 1 :
                            // InternalDslCsv.g:407:7: lv_op_1_1= '<'
                            {
                            lv_op_1_1=(Token)match(input,16,FOLLOW_7); 

                            							newLeafNode(lv_op_1_1, grammarAccess.getCompExpressionAccess().getOpLessThanSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCompExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDslCsv.g:418:7: lv_op_1_2= '>'
                            {
                            lv_op_1_2=(Token)match(input,17,FOLLOW_7); 

                            							newLeafNode(lv_op_1_2, grammarAccess.getCompExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCompExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalDslCsv.g:429:7: lv_op_1_3= '=='
                            {
                            lv_op_1_3=(Token)match(input,18,FOLLOW_7); 

                            							newLeafNode(lv_op_1_3, grammarAccess.getCompExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCompExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalDslCsv.g:440:7: lv_op_1_4= '<='
                            {
                            lv_op_1_4=(Token)match(input,19,FOLLOW_7); 

                            							newLeafNode(lv_op_1_4, grammarAccess.getCompExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCompExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalDslCsv.g:451:7: lv_op_1_5= '>='
                            {
                            lv_op_1_5=(Token)match(input,20,FOLLOW_7); 

                            							newLeafNode(lv_op_1_5, grammarAccess.getCompExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCompExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalDslCsv.g:462:7: lv_op_1_6= '!='
                            {
                            lv_op_1_6=(Token)match(input,21,FOLLOW_7); 

                            							newLeafNode(lv_op_1_6, grammarAccess.getCompExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_0_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCompExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_6, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalDslCsv.g:475:4: ( (lv_right_2_0= ruleCompExpression ) )
                    // InternalDslCsv.g:476:5: (lv_right_2_0= ruleCompExpression )
                    {
                    // InternalDslCsv.g:476:5: (lv_right_2_0= ruleCompExpression )
                    // InternalDslCsv.g:477:6: lv_right_2_0= ruleCompExpression
                    {

                    						newCompositeNode(grammarAccess.getCompExpressionAccess().getRightCompExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleCompExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"fr.irisa.DslCsv.CompExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompExpression"


    // $ANTLR start "entryRuleArithExpression"
    // InternalDslCsv.g:499:1: entryRuleArithExpression returns [EObject current=null] : iv_ruleArithExpression= ruleArithExpression EOF ;
    public final EObject entryRuleArithExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithExpression = null;


        try {
            // InternalDslCsv.g:499:56: (iv_ruleArithExpression= ruleArithExpression EOF )
            // InternalDslCsv.g:500:2: iv_ruleArithExpression= ruleArithExpression EOF
            {
             newCompositeNode(grammarAccess.getArithExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithExpression=ruleArithExpression();

            state._fsp--;

             current =iv_ruleArithExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithExpression"


    // $ANTLR start "ruleArithExpression"
    // InternalDslCsv.g:506:1: ruleArithExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleSubExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_right_2_0= ruleArithExpression ) ) )? ) ;
    public final EObject ruleArithExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:512:2: ( ( ( (lv_left_0_0= ruleSubExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_right_2_0= ruleArithExpression ) ) )? ) )
            // InternalDslCsv.g:513:2: ( ( (lv_left_0_0= ruleSubExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_right_2_0= ruleArithExpression ) ) )? )
            {
            // InternalDslCsv.g:513:2: ( ( (lv_left_0_0= ruleSubExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_right_2_0= ruleArithExpression ) ) )? )
            // InternalDslCsv.g:514:3: ( (lv_left_0_0= ruleSubExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_right_2_0= ruleArithExpression ) ) )?
            {
            // InternalDslCsv.g:514:3: ( (lv_left_0_0= ruleSubExpression ) )
            // InternalDslCsv.g:515:4: (lv_left_0_0= ruleSubExpression )
            {
            // InternalDslCsv.g:515:4: (lv_left_0_0= ruleSubExpression )
            // InternalDslCsv.g:516:5: lv_left_0_0= ruleSubExpression
            {

            					newCompositeNode(grammarAccess.getArithExpressionAccess().getLeftSubExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_left_0_0=ruleSubExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArithExpressionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"fr.irisa.DslCsv.SubExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDslCsv.g:533:3: ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_right_2_0= ruleArithExpression ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=22 && LA8_0<=23)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDslCsv.g:534:4: ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_right_2_0= ruleArithExpression ) )
                    {
                    // InternalDslCsv.g:534:4: ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) )
                    // InternalDslCsv.g:535:5: ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) )
                    {
                    // InternalDslCsv.g:535:5: ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) )
                    // InternalDslCsv.g:536:6: (lv_op_1_1= '+' | lv_op_1_2= '-' )
                    {
                    // InternalDslCsv.g:536:6: (lv_op_1_1= '+' | lv_op_1_2= '-' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==22) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==23) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDslCsv.g:537:7: lv_op_1_1= '+'
                            {
                            lv_op_1_1=(Token)match(input,22,FOLLOW_7); 

                            							newLeafNode(lv_op_1_1, grammarAccess.getArithExpressionAccess().getOpPlusSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDslCsv.g:548:7: lv_op_1_2= '-'
                            {
                            lv_op_1_2=(Token)match(input,23,FOLLOW_7); 

                            							newLeafNode(lv_op_1_2, grammarAccess.getArithExpressionAccess().getOpHyphenMinusKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getArithExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalDslCsv.g:561:4: ( (lv_right_2_0= ruleArithExpression ) )
                    // InternalDslCsv.g:562:5: (lv_right_2_0= ruleArithExpression )
                    {
                    // InternalDslCsv.g:562:5: (lv_right_2_0= ruleArithExpression )
                    // InternalDslCsv.g:563:6: lv_right_2_0= ruleArithExpression
                    {

                    						newCompositeNode(grammarAccess.getArithExpressionAccess().getRightArithExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleArithExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArithExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"fr.irisa.DslCsv.ArithExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalDslCsv.g:585:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalDslCsv.g:585:54: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalDslCsv.g:586:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
             newCompositeNode(grammarAccess.getSubExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;

             current =iv_ruleSubExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // InternalDslCsv.g:592:1: ruleSubExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleBaseExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_right_2_0= ruleSubExpression ) ) )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:598:2: ( ( ( (lv_left_0_0= ruleBaseExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_right_2_0= ruleSubExpression ) ) )? ) )
            // InternalDslCsv.g:599:2: ( ( (lv_left_0_0= ruleBaseExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_right_2_0= ruleSubExpression ) ) )? )
            {
            // InternalDslCsv.g:599:2: ( ( (lv_left_0_0= ruleBaseExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_right_2_0= ruleSubExpression ) ) )? )
            // InternalDslCsv.g:600:3: ( (lv_left_0_0= ruleBaseExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_right_2_0= ruleSubExpression ) ) )?
            {
            // InternalDslCsv.g:600:3: ( (lv_left_0_0= ruleBaseExpression ) )
            // InternalDslCsv.g:601:4: (lv_left_0_0= ruleBaseExpression )
            {
            // InternalDslCsv.g:601:4: (lv_left_0_0= ruleBaseExpression )
            // InternalDslCsv.g:602:5: lv_left_0_0= ruleBaseExpression
            {

            					newCompositeNode(grammarAccess.getSubExpressionAccess().getLeftBaseExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_left_0_0=ruleBaseExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubExpressionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"fr.irisa.DslCsv.BaseExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDslCsv.g:619:3: ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_right_2_0= ruleSubExpression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=24 && LA10_0<=26)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDslCsv.g:620:4: ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_right_2_0= ruleSubExpression ) )
                    {
                    // InternalDslCsv.g:620:4: ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) )
                    // InternalDslCsv.g:621:5: ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) )
                    {
                    // InternalDslCsv.g:621:5: ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) )
                    // InternalDslCsv.g:622:6: (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' )
                    {
                    // InternalDslCsv.g:622:6: (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' )
                    int alt9=3;
                    switch ( input.LA(1) ) {
                    case 24:
                        {
                        alt9=1;
                        }
                        break;
                    case 25:
                        {
                        alt9=2;
                        }
                        break;
                    case 26:
                        {
                        alt9=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // InternalDslCsv.g:623:7: lv_op_1_1= '*'
                            {
                            lv_op_1_1=(Token)match(input,24,FOLLOW_7); 

                            							newLeafNode(lv_op_1_1, grammarAccess.getSubExpressionAccess().getOpAsteriskKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSubExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDslCsv.g:634:7: lv_op_1_2= '/'
                            {
                            lv_op_1_2=(Token)match(input,25,FOLLOW_7); 

                            							newLeafNode(lv_op_1_2, grammarAccess.getSubExpressionAccess().getOpSolidusKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSubExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalDslCsv.g:645:7: lv_op_1_3= '%'
                            {
                            lv_op_1_3=(Token)match(input,26,FOLLOW_7); 

                            							newLeafNode(lv_op_1_3, grammarAccess.getSubExpressionAccess().getOpPercentSignKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSubExpressionRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_1_3, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalDslCsv.g:658:4: ( (lv_right_2_0= ruleSubExpression ) )
                    // InternalDslCsv.g:659:5: (lv_right_2_0= ruleSubExpression )
                    {
                    // InternalDslCsv.g:659:5: (lv_right_2_0= ruleSubExpression )
                    // InternalDslCsv.g:660:6: lv_right_2_0= ruleSubExpression
                    {

                    						newCompositeNode(grammarAccess.getSubExpressionAccess().getRightSubExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleSubExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"fr.irisa.DslCsv.SubExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleBaseExpression"
    // InternalDslCsv.g:682:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // InternalDslCsv.g:682:55: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalDslCsv.g:683:2: iv_ruleBaseExpression= ruleBaseExpression EOF
            {
             newCompositeNode(grammarAccess.getBaseExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseExpression=ruleBaseExpression();

            state._fsp--;

             current =iv_ruleBaseExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // InternalDslCsv.g:689:1: ruleBaseExpression returns [EObject current=null] : (this_Var_0= ruleVar | this_ConstNat_1= ruleConstNat | this_ConstStr_2= ruleConstStr | this_Parenthesis_3= ruleParenthesis | this_ConstVector_4= ruleConstVector ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Var_0 = null;

        EObject this_ConstNat_1 = null;

        EObject this_ConstStr_2 = null;

        EObject this_Parenthesis_3 = null;

        EObject this_ConstVector_4 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:695:2: ( (this_Var_0= ruleVar | this_ConstNat_1= ruleConstNat | this_ConstStr_2= ruleConstStr | this_Parenthesis_3= ruleParenthesis | this_ConstVector_4= ruleConstVector ) )
            // InternalDslCsv.g:696:2: (this_Var_0= ruleVar | this_ConstNat_1= ruleConstNat | this_ConstStr_2= ruleConstStr | this_Parenthesis_3= ruleParenthesis | this_ConstVector_4= ruleConstVector )
            {
            // InternalDslCsv.g:696:2: (this_Var_0= ruleVar | this_ConstNat_1= ruleConstNat | this_ConstStr_2= ruleConstStr | this_Parenthesis_3= ruleParenthesis | this_ConstVector_4= ruleConstVector )
            int alt11=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_INT:
                {
                alt11=2;
                }
                break;
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            case 29:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDslCsv.g:697:3: this_Var_0= ruleVar
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getVarParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Var_0=ruleVar();

                    state._fsp--;


                    			current = this_Var_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDslCsv.g:706:3: this_ConstNat_1= ruleConstNat
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getConstNatParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstNat_1=ruleConstNat();

                    state._fsp--;


                    			current = this_ConstNat_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDslCsv.g:715:3: this_ConstStr_2= ruleConstStr
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getConstStrParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstStr_2=ruleConstStr();

                    state._fsp--;


                    			current = this_ConstStr_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDslCsv.g:724:3: this_Parenthesis_3= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getParenthesisParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_3=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDslCsv.g:733:3: this_ConstVector_4= ruleConstVector
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getConstVectorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstVector_4=ruleConstVector();

                    state._fsp--;


                    			current = this_ConstVector_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRuleVar"
    // InternalDslCsv.g:745:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalDslCsv.g:745:44: (iv_ruleVar= ruleVar EOF )
            // InternalDslCsv.g:746:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalDslCsv.g:752:1: ruleVar returns [EObject current=null] : ( (lv_var_0_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;


        	enterRule();

        try {
            // InternalDslCsv.g:758:2: ( ( (lv_var_0_0= RULE_ID ) ) )
            // InternalDslCsv.g:759:2: ( (lv_var_0_0= RULE_ID ) )
            {
            // InternalDslCsv.g:759:2: ( (lv_var_0_0= RULE_ID ) )
            // InternalDslCsv.g:760:3: (lv_var_0_0= RULE_ID )
            {
            // InternalDslCsv.g:760:3: (lv_var_0_0= RULE_ID )
            // InternalDslCsv.g:761:4: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_var_0_0, grammarAccess.getVarAccess().getVarIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarRule());
            				}
            				setWithLastConsumed(
            					current,
            					"var",
            					lv_var_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleConstNat"
    // InternalDslCsv.g:780:1: entryRuleConstNat returns [EObject current=null] : iv_ruleConstNat= ruleConstNat EOF ;
    public final EObject entryRuleConstNat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstNat = null;


        try {
            // InternalDslCsv.g:780:49: (iv_ruleConstNat= ruleConstNat EOF )
            // InternalDslCsv.g:781:2: iv_ruleConstNat= ruleConstNat EOF
            {
             newCompositeNode(grammarAccess.getConstNatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstNat=ruleConstNat();

            state._fsp--;

             current =iv_ruleConstNat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstNat"


    // $ANTLR start "ruleConstNat"
    // InternalDslCsv.g:787:1: ruleConstNat returns [EObject current=null] : ( (lv_constNat_0_0= RULE_INT ) ) ;
    public final EObject ruleConstNat() throws RecognitionException {
        EObject current = null;

        Token lv_constNat_0_0=null;


        	enterRule();

        try {
            // InternalDslCsv.g:793:2: ( ( (lv_constNat_0_0= RULE_INT ) ) )
            // InternalDslCsv.g:794:2: ( (lv_constNat_0_0= RULE_INT ) )
            {
            // InternalDslCsv.g:794:2: ( (lv_constNat_0_0= RULE_INT ) )
            // InternalDslCsv.g:795:3: (lv_constNat_0_0= RULE_INT )
            {
            // InternalDslCsv.g:795:3: (lv_constNat_0_0= RULE_INT )
            // InternalDslCsv.g:796:4: lv_constNat_0_0= RULE_INT
            {
            lv_constNat_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_constNat_0_0, grammarAccess.getConstNatAccess().getConstNatINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConstNatRule());
            				}
            				setWithLastConsumed(
            					current,
            					"constNat",
            					lv_constNat_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstNat"


    // $ANTLR start "entryRuleConstStr"
    // InternalDslCsv.g:815:1: entryRuleConstStr returns [EObject current=null] : iv_ruleConstStr= ruleConstStr EOF ;
    public final EObject entryRuleConstStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstStr = null;


        try {
            // InternalDslCsv.g:815:49: (iv_ruleConstStr= ruleConstStr EOF )
            // InternalDslCsv.g:816:2: iv_ruleConstStr= ruleConstStr EOF
            {
             newCompositeNode(grammarAccess.getConstStrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstStr=ruleConstStr();

            state._fsp--;

             current =iv_ruleConstStr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstStr"


    // $ANTLR start "ruleConstStr"
    // InternalDslCsv.g:822:1: ruleConstStr returns [EObject current=null] : ( (lv_constStr_0_0= RULE_STRING ) ) ;
    public final EObject ruleConstStr() throws RecognitionException {
        EObject current = null;

        Token lv_constStr_0_0=null;


        	enterRule();

        try {
            // InternalDslCsv.g:828:2: ( ( (lv_constStr_0_0= RULE_STRING ) ) )
            // InternalDslCsv.g:829:2: ( (lv_constStr_0_0= RULE_STRING ) )
            {
            // InternalDslCsv.g:829:2: ( (lv_constStr_0_0= RULE_STRING ) )
            // InternalDslCsv.g:830:3: (lv_constStr_0_0= RULE_STRING )
            {
            // InternalDslCsv.g:830:3: (lv_constStr_0_0= RULE_STRING )
            // InternalDslCsv.g:831:4: lv_constStr_0_0= RULE_STRING
            {
            lv_constStr_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_constStr_0_0, grammarAccess.getConstStrAccess().getConstStrSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConstStrRule());
            				}
            				setWithLastConsumed(
            					current,
            					"constStr",
            					lv_constStr_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstStr"


    // $ANTLR start "entryRuleParenthesis"
    // InternalDslCsv.g:850:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalDslCsv.g:850:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalDslCsv.g:851:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalDslCsv.g:857:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:863:2: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalDslCsv.g:864:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalDslCsv.g:864:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalDslCsv.g:865:3: otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDslCsv.g:869:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalDslCsv.g:870:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalDslCsv.g:870:4: (lv_expr_1_0= ruleExpression )
            // InternalDslCsv.g:871:5: lv_expr_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExprExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_expr_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleConstVector"
    // InternalDslCsv.g:896:1: entryRuleConstVector returns [EObject current=null] : iv_ruleConstVector= ruleConstVector EOF ;
    public final EObject entryRuleConstVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstVector = null;


        try {
            // InternalDslCsv.g:896:52: (iv_ruleConstVector= ruleConstVector EOF )
            // InternalDslCsv.g:897:2: iv_ruleConstVector= ruleConstVector EOF
            {
             newCompositeNode(grammarAccess.getConstVectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstVector=ruleConstVector();

            state._fsp--;

             current =iv_ruleConstVector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstVector"


    // $ANTLR start "ruleConstVector"
    // InternalDslCsv.g:903:1: ruleConstVector returns [EObject current=null] : (otherlv_0= '{' ( (lv_constVector_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_constVector_3_0= ruleExpression ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleConstVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constVector_1_0 = null;

        EObject lv_constVector_3_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:909:2: ( (otherlv_0= '{' ( (lv_constVector_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_constVector_3_0= ruleExpression ) ) )* otherlv_4= '}' ) )
            // InternalDslCsv.g:910:2: (otherlv_0= '{' ( (lv_constVector_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_constVector_3_0= ruleExpression ) ) )* otherlv_4= '}' )
            {
            // InternalDslCsv.g:910:2: (otherlv_0= '{' ( (lv_constVector_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_constVector_3_0= ruleExpression ) ) )* otherlv_4= '}' )
            // InternalDslCsv.g:911:3: otherlv_0= '{' ( (lv_constVector_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_constVector_3_0= ruleExpression ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConstVectorAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalDslCsv.g:915:3: ( (lv_constVector_1_0= ruleExpression ) )
            // InternalDslCsv.g:916:4: (lv_constVector_1_0= ruleExpression )
            {
            // InternalDslCsv.g:916:4: (lv_constVector_1_0= ruleExpression )
            // InternalDslCsv.g:917:5: lv_constVector_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConstVectorAccess().getConstVectorExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_constVector_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstVectorRule());
            					}
            					add(
            						current,
            						"constVector",
            						lv_constVector_1_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDslCsv.g:934:3: (otherlv_2= ',' ( (lv_constVector_3_0= ruleExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDslCsv.g:935:4: otherlv_2= ',' ( (lv_constVector_3_0= ruleExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConstVectorAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDslCsv.g:939:4: ( (lv_constVector_3_0= ruleExpression ) )
            	    // InternalDslCsv.g:940:5: (lv_constVector_3_0= ruleExpression )
            	    {
            	    // InternalDslCsv.g:940:5: (lv_constVector_3_0= ruleExpression )
            	    // InternalDslCsv.g:941:6: lv_constVector_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getConstVectorAccess().getConstVectorExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_constVector_3_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstVectorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constVector",
            	    							lv_constVector_3_0,
            	    							"fr.irisa.DslCsv.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConstVectorAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstVector"


    // $ANTLR start "entryRuleFuncCall"
    // InternalDslCsv.g:967:1: entryRuleFuncCall returns [EObject current=null] : iv_ruleFuncCall= ruleFuncCall EOF ;
    public final EObject entryRuleFuncCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncCall = null;


        try {
            // InternalDslCsv.g:967:49: (iv_ruleFuncCall= ruleFuncCall EOF )
            // InternalDslCsv.g:968:2: iv_ruleFuncCall= ruleFuncCall EOF
            {
             newCompositeNode(grammarAccess.getFuncCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncCall=ruleFuncCall();

            state._fsp--;

             current =iv_ruleFuncCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncCall"


    // $ANTLR start "ruleFuncCall"
    // InternalDslCsv.g:974:1: ruleFuncCall returns [EObject current=null] : (this_Acquire_0= ruleAcquire | this_Save_1= ruleSave | this_Select_2= ruleSelect | this_Unselect_3= ruleUnselect | this_Filter_4= ruleFilter | this_Mean_5= ruleMean | this_Sum_6= ruleSum | this_Product_7= ruleProduct | this_Column_8= ruleColumn | this_Row_9= ruleRow | this_Features_10= ruleFeatures | this_Print_11= rulePrint | this_Dim_12= ruleDim | this_Sort_13= ruleSort | this_Count_14= ruleCount ) ;
    public final EObject ruleFuncCall() throws RecognitionException {
        EObject current = null;

        EObject this_Acquire_0 = null;

        EObject this_Save_1 = null;

        EObject this_Select_2 = null;

        EObject this_Unselect_3 = null;

        EObject this_Filter_4 = null;

        EObject this_Mean_5 = null;

        EObject this_Sum_6 = null;

        EObject this_Product_7 = null;

        EObject this_Column_8 = null;

        EObject this_Row_9 = null;

        EObject this_Features_10 = null;

        EObject this_Print_11 = null;

        EObject this_Dim_12 = null;

        EObject this_Sort_13 = null;

        EObject this_Count_14 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:980:2: ( (this_Acquire_0= ruleAcquire | this_Save_1= ruleSave | this_Select_2= ruleSelect | this_Unselect_3= ruleUnselect | this_Filter_4= ruleFilter | this_Mean_5= ruleMean | this_Sum_6= ruleSum | this_Product_7= ruleProduct | this_Column_8= ruleColumn | this_Row_9= ruleRow | this_Features_10= ruleFeatures | this_Print_11= rulePrint | this_Dim_12= ruleDim | this_Sort_13= ruleSort | this_Count_14= ruleCount ) )
            // InternalDslCsv.g:981:2: (this_Acquire_0= ruleAcquire | this_Save_1= ruleSave | this_Select_2= ruleSelect | this_Unselect_3= ruleUnselect | this_Filter_4= ruleFilter | this_Mean_5= ruleMean | this_Sum_6= ruleSum | this_Product_7= ruleProduct | this_Column_8= ruleColumn | this_Row_9= ruleRow | this_Features_10= ruleFeatures | this_Print_11= rulePrint | this_Dim_12= ruleDim | this_Sort_13= ruleSort | this_Count_14= ruleCount )
            {
            // InternalDslCsv.g:981:2: (this_Acquire_0= ruleAcquire | this_Save_1= ruleSave | this_Select_2= ruleSelect | this_Unselect_3= ruleUnselect | this_Filter_4= ruleFilter | this_Mean_5= ruleMean | this_Sum_6= ruleSum | this_Product_7= ruleProduct | this_Column_8= ruleColumn | this_Row_9= ruleRow | this_Features_10= ruleFeatures | this_Print_11= rulePrint | this_Dim_12= ruleDim | this_Sort_13= ruleSort | this_Count_14= ruleCount )
            int alt13=15;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt13=1;
                }
                break;
            case 45:
                {
                alt13=2;
                }
                break;
            case 44:
                {
                alt13=3;
                }
                break;
            case 43:
                {
                alt13=4;
                }
                break;
            case 42:
                {
                alt13=5;
                }
                break;
            case 41:
                {
                alt13=6;
                }
                break;
            case 40:
                {
                alt13=7;
                }
                break;
            case 39:
                {
                alt13=8;
                }
                break;
            case 38:
                {
                alt13=9;
                }
                break;
            case 37:
                {
                alt13=10;
                }
                break;
            case 36:
                {
                alt13=11;
                }
                break;
            case 35:
                {
                alt13=12;
                }
                break;
            case 34:
                {
                alt13=13;
                }
                break;
            case 33:
                {
                alt13=14;
                }
                break;
            case 32:
                {
                alt13=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDslCsv.g:982:3: this_Acquire_0= ruleAcquire
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getAcquireParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Acquire_0=ruleAcquire();

                    state._fsp--;


                    			current = this_Acquire_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDslCsv.g:991:3: this_Save_1= ruleSave
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getSaveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Save_1=ruleSave();

                    state._fsp--;


                    			current = this_Save_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDslCsv.g:1000:3: this_Select_2= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getSelectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_2=ruleSelect();

                    state._fsp--;


                    			current = this_Select_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDslCsv.g:1009:3: this_Unselect_3= ruleUnselect
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getUnselectParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Unselect_3=ruleUnselect();

                    state._fsp--;


                    			current = this_Unselect_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDslCsv.g:1018:3: this_Filter_4= ruleFilter
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getFilterParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Filter_4=ruleFilter();

                    state._fsp--;


                    			current = this_Filter_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDslCsv.g:1027:3: this_Mean_5= ruleMean
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getMeanParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mean_5=ruleMean();

                    state._fsp--;


                    			current = this_Mean_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDslCsv.g:1036:3: this_Sum_6= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getSumParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_6=ruleSum();

                    state._fsp--;


                    			current = this_Sum_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDslCsv.g:1045:3: this_Product_7= ruleProduct
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getProductParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Product_7=ruleProduct();

                    state._fsp--;


                    			current = this_Product_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDslCsv.g:1054:3: this_Column_8= ruleColumn
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getColumnParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Column_8=ruleColumn();

                    state._fsp--;


                    			current = this_Column_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDslCsv.g:1063:3: this_Row_9= ruleRow
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getRowParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Row_9=ruleRow();

                    state._fsp--;


                    			current = this_Row_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDslCsv.g:1072:3: this_Features_10= ruleFeatures
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getFeaturesParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Features_10=ruleFeatures();

                    state._fsp--;


                    			current = this_Features_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDslCsv.g:1081:3: this_Print_11= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getPrintParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_11=rulePrint();

                    state._fsp--;


                    			current = this_Print_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDslCsv.g:1090:3: this_Dim_12= ruleDim
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getDimParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dim_12=ruleDim();

                    state._fsp--;


                    			current = this_Dim_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalDslCsv.g:1099:3: this_Sort_13= ruleSort
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getSortParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sort_13=ruleSort();

                    state._fsp--;


                    			current = this_Sort_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalDslCsv.g:1108:3: this_Count_14= ruleCount
                    {

                    			newCompositeNode(grammarAccess.getFuncCallAccess().getCountParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_Count_14=ruleCount();

                    state._fsp--;


                    			current = this_Count_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncCall"


    // $ANTLR start "entryRuleCount"
    // InternalDslCsv.g:1120:1: entryRuleCount returns [EObject current=null] : iv_ruleCount= ruleCount EOF ;
    public final EObject entryRuleCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCount = null;


        try {
            // InternalDslCsv.g:1120:46: (iv_ruleCount= ruleCount EOF )
            // InternalDslCsv.g:1121:2: iv_ruleCount= ruleCount EOF
            {
             newCompositeNode(grammarAccess.getCountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCount=ruleCount();

            state._fsp--;

             current =iv_ruleCount; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCount"


    // $ANTLR start "ruleCount"
    // InternalDslCsv.g:1127:1: ruleCount returns [EObject current=null] : (otherlv_0= 'Count' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1133:2: ( (otherlv_0= 'Count' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalDslCsv.g:1134:2: (otherlv_0= 'Count' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalDslCsv.g:1134:2: (otherlv_0= 'Count' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalDslCsv.g:1135:3: otherlv_0= 'Count' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getCountAccess().getCountKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCountAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1143:3: ( (lv_vector_2_0= ruleExpression ) )
            // InternalDslCsv.g:1144:4: (lv_vector_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1144:4: (lv_vector_2_0= ruleExpression )
            // InternalDslCsv.g:1145:5: lv_vector_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCountAccess().getVectorExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_vector_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCountAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCount"


    // $ANTLR start "entryRuleSort"
    // InternalDslCsv.g:1170:1: entryRuleSort returns [EObject current=null] : iv_ruleSort= ruleSort EOF ;
    public final EObject entryRuleSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSort = null;


        try {
            // InternalDslCsv.g:1170:45: (iv_ruleSort= ruleSort EOF )
            // InternalDslCsv.g:1171:2: iv_ruleSort= ruleSort EOF
            {
             newCompositeNode(grammarAccess.getSortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSort=ruleSort();

            state._fsp--;

             current =iv_ruleSort; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSort"


    // $ANTLR start "ruleSort"
    // InternalDslCsv.g:1177:1: ruleSort returns [EObject current=null] : (otherlv_0= 'Sort' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_criterion_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleSort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_file_2_0 = null;

        EObject lv_criterion_4_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1183:2: ( (otherlv_0= 'Sort' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_criterion_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalDslCsv.g:1184:2: (otherlv_0= 'Sort' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_criterion_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalDslCsv.g:1184:2: (otherlv_0= 'Sort' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_criterion_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalDslCsv.g:1185:3: otherlv_0= 'Sort' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_criterion_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSortAccess().getSortKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSortAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1193:3: ( (lv_file_2_0= ruleExpression ) )
            // InternalDslCsv.g:1194:4: (lv_file_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1194:4: (lv_file_2_0= ruleExpression )
            // InternalDslCsv.g:1195:5: lv_file_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSortAccess().getFileExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_file_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSortRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSortAccess().getCommaKeyword_3());
            		
            // InternalDslCsv.g:1216:3: ( (lv_criterion_4_0= ruleExpression ) )
            // InternalDslCsv.g:1217:4: (lv_criterion_4_0= ruleExpression )
            {
            // InternalDslCsv.g:1217:4: (lv_criterion_4_0= ruleExpression )
            // InternalDslCsv.g:1218:5: lv_criterion_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSortAccess().getCriterionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_criterion_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSortRule());
            					}
            					set(
            						current,
            						"criterion",
            						lv_criterion_4_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSortAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSort"


    // $ANTLR start "entryRuleDim"
    // InternalDslCsv.g:1243:1: entryRuleDim returns [EObject current=null] : iv_ruleDim= ruleDim EOF ;
    public final EObject entryRuleDim() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDim = null;


        try {
            // InternalDslCsv.g:1243:44: (iv_ruleDim= ruleDim EOF )
            // InternalDslCsv.g:1244:2: iv_ruleDim= ruleDim EOF
            {
             newCompositeNode(grammarAccess.getDimRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDim=ruleDim();

            state._fsp--;

             current =iv_ruleDim; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDim"


    // $ANTLR start "ruleDim"
    // InternalDslCsv.g:1250:1: ruleDim returns [EObject current=null] : (otherlv_0= 'Dim' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleDim() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1256:2: ( (otherlv_0= 'Dim' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalDslCsv.g:1257:2: (otherlv_0= 'Dim' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalDslCsv.g:1257:2: (otherlv_0= 'Dim' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalDslCsv.g:1258:3: otherlv_0= 'Dim' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDimAccess().getDimKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDimAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1266:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalDslCsv.g:1267:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1267:4: (lv_expr_2_0= ruleExpression )
            // InternalDslCsv.g:1268:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDimAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDimAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDim"


    // $ANTLR start "entryRulePrint"
    // InternalDslCsv.g:1293:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalDslCsv.g:1293:46: (iv_rulePrint= rulePrint EOF )
            // InternalDslCsv.g:1294:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalDslCsv.g:1300:1: rulePrint returns [EObject current=null] : (otherlv_0= 'Print' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1306:2: ( (otherlv_0= 'Print' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalDslCsv.g:1307:2: (otherlv_0= 'Print' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalDslCsv.g:1307:2: (otherlv_0= 'Print' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalDslCsv.g:1308:3: otherlv_0= 'Print' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1316:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalDslCsv.g:1317:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1317:4: (lv_expr_2_0= ruleExpression )
            // InternalDslCsv.g:1318:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPrintAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleFeatures"
    // InternalDslCsv.g:1343:1: entryRuleFeatures returns [EObject current=null] : iv_ruleFeatures= ruleFeatures EOF ;
    public final EObject entryRuleFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatures = null;


        try {
            // InternalDslCsv.g:1343:49: (iv_ruleFeatures= ruleFeatures EOF )
            // InternalDslCsv.g:1344:2: iv_ruleFeatures= ruleFeatures EOF
            {
             newCompositeNode(grammarAccess.getFeaturesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatures=ruleFeatures();

            state._fsp--;

             current =iv_ruleFeatures; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatures"


    // $ANTLR start "ruleFeatures"
    // InternalDslCsv.g:1350:1: ruleFeatures returns [EObject current=null] : (otherlv_0= 'Features' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleFeatures() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_file_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1356:2: ( (otherlv_0= 'Features' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalDslCsv.g:1357:2: (otherlv_0= 'Features' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalDslCsv.g:1357:2: (otherlv_0= 'Features' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalDslCsv.g:1358:3: otherlv_0= 'Features' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFeaturesAccess().getFeaturesKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFeaturesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1366:3: ( (lv_file_2_0= ruleExpression ) )
            // InternalDslCsv.g:1367:4: (lv_file_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1367:4: (lv_file_2_0= ruleExpression )
            // InternalDslCsv.g:1368:5: lv_file_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFeaturesAccess().getFileExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_file_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeaturesRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFeaturesAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatures"


    // $ANTLR start "entryRuleRow"
    // InternalDslCsv.g:1393:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalDslCsv.g:1393:44: (iv_ruleRow= ruleRow EOF )
            // InternalDslCsv.g:1394:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalDslCsv.g:1400:1: ruleRow returns [EObject current=null] : (otherlv_0= 'Row' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_vector_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_file_2_0 = null;

        EObject lv_vector_4_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1406:2: ( (otherlv_0= 'Row' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_vector_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalDslCsv.g:1407:2: (otherlv_0= 'Row' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_vector_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalDslCsv.g:1407:2: (otherlv_0= 'Row' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_vector_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalDslCsv.g:1408:3: otherlv_0= 'Row' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_vector_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1416:3: ( (lv_file_2_0= ruleExpression ) )
            // InternalDslCsv.g:1417:4: (lv_file_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1417:4: (lv_file_2_0= ruleExpression )
            // InternalDslCsv.g:1418:5: lv_file_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRowAccess().getFileExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_file_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRowRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRowAccess().getCommaKeyword_3());
            		
            // InternalDslCsv.g:1439:3: ( (lv_vector_4_0= ruleExpression ) )
            // InternalDslCsv.g:1440:4: (lv_vector_4_0= ruleExpression )
            {
            // InternalDslCsv.g:1440:4: (lv_vector_4_0= ruleExpression )
            // InternalDslCsv.g:1441:5: lv_vector_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRowAccess().getVectorExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_vector_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRowRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_4_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRowAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleColumn"
    // InternalDslCsv.g:1466:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalDslCsv.g:1466:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalDslCsv.g:1467:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalDslCsv.g:1473:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'Column' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_columnName_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_vector_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_file_2_0 = null;

        EObject lv_columnName_4_0 = null;

        EObject lv_vector_6_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1479:2: ( (otherlv_0= 'Column' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_columnName_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_vector_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // InternalDslCsv.g:1480:2: (otherlv_0= 'Column' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_columnName_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_vector_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // InternalDslCsv.g:1480:2: (otherlv_0= 'Column' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_columnName_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_vector_6_0= ruleExpression ) ) otherlv_7= ')' )
            // InternalDslCsv.g:1481:3: otherlv_0= 'Column' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_columnName_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_vector_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1489:3: ( (lv_file_2_0= ruleExpression ) )
            // InternalDslCsv.g:1490:4: (lv_file_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1490:4: (lv_file_2_0= ruleExpression )
            // InternalDslCsv.g:1491:5: lv_file_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getFileExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_file_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getCommaKeyword_3());
            		
            // InternalDslCsv.g:1512:3: ( (lv_columnName_4_0= ruleExpression ) )
            // InternalDslCsv.g:1513:4: (lv_columnName_4_0= ruleExpression )
            {
            // InternalDslCsv.g:1513:4: (lv_columnName_4_0= ruleExpression )
            // InternalDslCsv.g:1514:5: lv_columnName_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getColumnNameExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_columnName_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"columnName",
            						lv_columnName_4_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getCommaKeyword_5());
            		
            // InternalDslCsv.g:1535:3: ( (lv_vector_6_0= ruleExpression ) )
            // InternalDslCsv.g:1536:4: (lv_vector_6_0= ruleExpression )
            {
            // InternalDslCsv.g:1536:4: (lv_vector_6_0= ruleExpression )
            // InternalDslCsv.g:1537:5: lv_vector_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getVectorExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_vector_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_6_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getColumnAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleProduct"
    // InternalDslCsv.g:1562:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalDslCsv.g:1562:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalDslCsv.g:1563:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // InternalDslCsv.g:1569:1: ruleProduct returns [EObject current=null] : (otherlv_0= 'Product' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1575:2: ( (otherlv_0= 'Product' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalDslCsv.g:1576:2: (otherlv_0= 'Product' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalDslCsv.g:1576:2: (otherlv_0= 'Product' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalDslCsv.g:1577:3: otherlv_0= 'Product' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getProductAccess().getProductKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProductAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1585:3: ( (lv_vector_2_0= ruleExpression ) )
            // InternalDslCsv.g:1586:4: (lv_vector_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1586:4: (lv_vector_2_0= ruleExpression )
            // InternalDslCsv.g:1587:5: lv_vector_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProductAccess().getVectorExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_vector_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProductAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleSum"
    // InternalDslCsv.g:1612:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalDslCsv.g:1612:44: (iv_ruleSum= ruleSum EOF )
            // InternalDslCsv.g:1613:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalDslCsv.g:1619:1: ruleSum returns [EObject current=null] : (otherlv_0= 'Sum' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1625:2: ( (otherlv_0= 'Sum' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalDslCsv.g:1626:2: (otherlv_0= 'Sum' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalDslCsv.g:1626:2: (otherlv_0= 'Sum' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalDslCsv.g:1627:3: otherlv_0= 'Sum' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getSumKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSumAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1635:3: ( (lv_vector_2_0= ruleExpression ) )
            // InternalDslCsv.g:1636:4: (lv_vector_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1636:4: (lv_vector_2_0= ruleExpression )
            // InternalDslCsv.g:1637:5: lv_vector_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSumAccess().getVectorExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_vector_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSumAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleMean"
    // InternalDslCsv.g:1662:1: entryRuleMean returns [EObject current=null] : iv_ruleMean= ruleMean EOF ;
    public final EObject entryRuleMean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMean = null;


        try {
            // InternalDslCsv.g:1662:45: (iv_ruleMean= ruleMean EOF )
            // InternalDslCsv.g:1663:2: iv_ruleMean= ruleMean EOF
            {
             newCompositeNode(grammarAccess.getMeanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMean=ruleMean();

            state._fsp--;

             current =iv_ruleMean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMean"


    // $ANTLR start "ruleMean"
    // InternalDslCsv.g:1669:1: ruleMean returns [EObject current=null] : (otherlv_0= 'Mean' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleMean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1675:2: ( (otherlv_0= 'Mean' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalDslCsv.g:1676:2: (otherlv_0= 'Mean' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalDslCsv.g:1676:2: (otherlv_0= 'Mean' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalDslCsv.g:1677:3: otherlv_0= 'Mean' otherlv_1= '(' ( (lv_vector_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMeanAccess().getMeanKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMeanAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1685:3: ( (lv_vector_2_0= ruleExpression ) )
            // InternalDslCsv.g:1686:4: (lv_vector_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1686:4: (lv_vector_2_0= ruleExpression )
            // InternalDslCsv.g:1687:5: lv_vector_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMeanAccess().getVectorExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_vector_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeanRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMeanAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMean"


    // $ANTLR start "entryRuleFilter"
    // InternalDslCsv.g:1712:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalDslCsv.g:1712:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalDslCsv.g:1713:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalDslCsv.g:1719:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'Filter' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_cond_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_file_2_0 = null;

        EObject lv_cond_4_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1725:2: ( (otherlv_0= 'Filter' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_cond_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalDslCsv.g:1726:2: (otherlv_0= 'Filter' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_cond_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalDslCsv.g:1726:2: (otherlv_0= 'Filter' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_cond_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalDslCsv.g:1727:3: otherlv_0= 'Filter' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_cond_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1735:3: ( (lv_file_2_0= ruleExpression ) )
            // InternalDslCsv.g:1736:4: (lv_file_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1736:4: (lv_file_2_0= ruleExpression )
            // InternalDslCsv.g:1737:5: lv_file_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getFileExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_file_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getFilterAccess().getCommaKeyword_3());
            		
            // InternalDslCsv.g:1758:3: ( (lv_cond_4_0= ruleExpression ) )
            // InternalDslCsv.g:1759:4: (lv_cond_4_0= ruleExpression )
            {
            // InternalDslCsv.g:1759:4: (lv_cond_4_0= ruleExpression )
            // InternalDslCsv.g:1760:5: lv_cond_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getCondExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_cond_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_4_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFilterAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleUnselect"
    // InternalDslCsv.g:1785:1: entryRuleUnselect returns [EObject current=null] : iv_ruleUnselect= ruleUnselect EOF ;
    public final EObject entryRuleUnselect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnselect = null;


        try {
            // InternalDslCsv.g:1785:49: (iv_ruleUnselect= ruleUnselect EOF )
            // InternalDslCsv.g:1786:2: iv_ruleUnselect= ruleUnselect EOF
            {
             newCompositeNode(grammarAccess.getUnselectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnselect=ruleUnselect();

            state._fsp--;

             current =iv_ruleUnselect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnselect"


    // $ANTLR start "ruleUnselect"
    // InternalDslCsv.g:1792:1: ruleUnselect returns [EObject current=null] : (otherlv_0= 'Unselect' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_features_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleUnselect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_file_2_0 = null;

        EObject lv_features_4_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1798:2: ( (otherlv_0= 'Unselect' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_features_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalDslCsv.g:1799:2: (otherlv_0= 'Unselect' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_features_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalDslCsv.g:1799:2: (otherlv_0= 'Unselect' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_features_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalDslCsv.g:1800:3: otherlv_0= 'Unselect' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_features_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getUnselectAccess().getUnselectKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUnselectAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1808:3: ( (lv_file_2_0= ruleExpression ) )
            // InternalDslCsv.g:1809:4: (lv_file_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1809:4: (lv_file_2_0= ruleExpression )
            // InternalDslCsv.g:1810:5: lv_file_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getUnselectAccess().getFileExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_file_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnselectRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getUnselectAccess().getCommaKeyword_3());
            		
            // InternalDslCsv.g:1831:3: ( (lv_features_4_0= ruleExpression ) )
            // InternalDslCsv.g:1832:4: (lv_features_4_0= ruleExpression )
            {
            // InternalDslCsv.g:1832:4: (lv_features_4_0= ruleExpression )
            // InternalDslCsv.g:1833:5: lv_features_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getUnselectAccess().getFeaturesExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_features_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnselectRule());
            					}
            					set(
            						current,
            						"features",
            						lv_features_4_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUnselectAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnselect"


    // $ANTLR start "entryRuleSelect"
    // InternalDslCsv.g:1858:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalDslCsv.g:1858:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalDslCsv.g:1859:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalDslCsv.g:1865:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'Select' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_features_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_file_2_0 = null;

        EObject lv_features_4_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1871:2: ( (otherlv_0= 'Select' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_features_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalDslCsv.g:1872:2: (otherlv_0= 'Select' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_features_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalDslCsv.g:1872:2: (otherlv_0= 'Select' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_features_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalDslCsv.g:1873:3: otherlv_0= 'Select' otherlv_1= '(' ( (lv_file_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_features_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1881:3: ( (lv_file_2_0= ruleExpression ) )
            // InternalDslCsv.g:1882:4: (lv_file_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1882:4: (lv_file_2_0= ruleExpression )
            // InternalDslCsv.g:1883:5: lv_file_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getFileExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_file_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectAccess().getCommaKeyword_3());
            		
            // InternalDslCsv.g:1904:3: ( (lv_features_4_0= ruleExpression ) )
            // InternalDslCsv.g:1905:4: (lv_features_4_0= ruleExpression )
            {
            // InternalDslCsv.g:1905:4: (lv_features_4_0= ruleExpression )
            // InternalDslCsv.g:1906:5: lv_features_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getFeaturesExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_features_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"features",
            						lv_features_4_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSelectAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleSave"
    // InternalDslCsv.g:1931:1: entryRuleSave returns [EObject current=null] : iv_ruleSave= ruleSave EOF ;
    public final EObject entryRuleSave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSave = null;


        try {
            // InternalDslCsv.g:1931:45: (iv_ruleSave= ruleSave EOF )
            // InternalDslCsv.g:1932:2: iv_ruleSave= ruleSave EOF
            {
             newCompositeNode(grammarAccess.getSaveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSave=ruleSave();

            state._fsp--;

             current =iv_ruleSave; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSave"


    // $ANTLR start "ruleSave"
    // InternalDslCsv.g:1938:1: ruleSave returns [EObject current=null] : (otherlv_0= 'Save' otherlv_1= '(' ( (lv_filename_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_file_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_sep_6_0= ruleExpression ) ) otherlv_7= ',' ( (lv_saveHeader_8_0= ruleExpression ) ) otherlv_9= ',' ( (lv_saveID_10_0= ruleExpression ) ) otherlv_11= ')' ) ;
    public final EObject ruleSave() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_filename_2_0 = null;

        EObject lv_file_4_0 = null;

        EObject lv_sep_6_0 = null;

        EObject lv_saveHeader_8_0 = null;

        EObject lv_saveID_10_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:1944:2: ( (otherlv_0= 'Save' otherlv_1= '(' ( (lv_filename_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_file_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_sep_6_0= ruleExpression ) ) otherlv_7= ',' ( (lv_saveHeader_8_0= ruleExpression ) ) otherlv_9= ',' ( (lv_saveID_10_0= ruleExpression ) ) otherlv_11= ')' ) )
            // InternalDslCsv.g:1945:2: (otherlv_0= 'Save' otherlv_1= '(' ( (lv_filename_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_file_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_sep_6_0= ruleExpression ) ) otherlv_7= ',' ( (lv_saveHeader_8_0= ruleExpression ) ) otherlv_9= ',' ( (lv_saveID_10_0= ruleExpression ) ) otherlv_11= ')' )
            {
            // InternalDslCsv.g:1945:2: (otherlv_0= 'Save' otherlv_1= '(' ( (lv_filename_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_file_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_sep_6_0= ruleExpression ) ) otherlv_7= ',' ( (lv_saveHeader_8_0= ruleExpression ) ) otherlv_9= ',' ( (lv_saveID_10_0= ruleExpression ) ) otherlv_11= ')' )
            // InternalDslCsv.g:1946:3: otherlv_0= 'Save' otherlv_1= '(' ( (lv_filename_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_file_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_sep_6_0= ruleExpression ) ) otherlv_7= ',' ( (lv_saveHeader_8_0= ruleExpression ) ) otherlv_9= ',' ( (lv_saveID_10_0= ruleExpression ) ) otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSaveAccess().getSaveKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSaveAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:1954:3: ( (lv_filename_2_0= ruleExpression ) )
            // InternalDslCsv.g:1955:4: (lv_filename_2_0= ruleExpression )
            {
            // InternalDslCsv.g:1955:4: (lv_filename_2_0= ruleExpression )
            // InternalDslCsv.g:1956:5: lv_filename_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSaveAccess().getFilenameExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_filename_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSaveRule());
            					}
            					set(
            						current,
            						"filename",
            						lv_filename_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSaveAccess().getCommaKeyword_3());
            		
            // InternalDslCsv.g:1977:3: ( (lv_file_4_0= ruleExpression ) )
            // InternalDslCsv.g:1978:4: (lv_file_4_0= ruleExpression )
            {
            // InternalDslCsv.g:1978:4: (lv_file_4_0= ruleExpression )
            // InternalDslCsv.g:1979:5: lv_file_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSaveAccess().getFileExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_file_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSaveRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_4_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getSaveAccess().getCommaKeyword_5());
            		
            // InternalDslCsv.g:2000:3: ( (lv_sep_6_0= ruleExpression ) )
            // InternalDslCsv.g:2001:4: (lv_sep_6_0= ruleExpression )
            {
            // InternalDslCsv.g:2001:4: (lv_sep_6_0= ruleExpression )
            // InternalDslCsv.g:2002:5: lv_sep_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSaveAccess().getSepExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_sep_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSaveRule());
            					}
            					set(
            						current,
            						"sep",
            						lv_sep_6_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getSaveAccess().getCommaKeyword_7());
            		
            // InternalDslCsv.g:2023:3: ( (lv_saveHeader_8_0= ruleExpression ) )
            // InternalDslCsv.g:2024:4: (lv_saveHeader_8_0= ruleExpression )
            {
            // InternalDslCsv.g:2024:4: (lv_saveHeader_8_0= ruleExpression )
            // InternalDslCsv.g:2025:5: lv_saveHeader_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSaveAccess().getSaveHeaderExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_saveHeader_8_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSaveRule());
            					}
            					set(
            						current,
            						"saveHeader",
            						lv_saveHeader_8_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getSaveAccess().getCommaKeyword_9());
            		
            // InternalDslCsv.g:2046:3: ( (lv_saveID_10_0= ruleExpression ) )
            // InternalDslCsv.g:2047:4: (lv_saveID_10_0= ruleExpression )
            {
            // InternalDslCsv.g:2047:4: (lv_saveID_10_0= ruleExpression )
            // InternalDslCsv.g:2048:5: lv_saveID_10_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSaveAccess().getSaveIDExpressionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_saveID_10_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSaveRule());
            					}
            					set(
            						current,
            						"saveID",
            						lv_saveID_10_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSaveAccess().getRightParenthesisKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSave"


    // $ANTLR start "entryRuleAcquire"
    // InternalDslCsv.g:2073:1: entryRuleAcquire returns [EObject current=null] : iv_ruleAcquire= ruleAcquire EOF ;
    public final EObject entryRuleAcquire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcquire = null;


        try {
            // InternalDslCsv.g:2073:48: (iv_ruleAcquire= ruleAcquire EOF )
            // InternalDslCsv.g:2074:2: iv_ruleAcquire= ruleAcquire EOF
            {
             newCompositeNode(grammarAccess.getAcquireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcquire=ruleAcquire();

            state._fsp--;

             current =iv_ruleAcquire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcquire"


    // $ANTLR start "ruleAcquire"
    // InternalDslCsv.g:2080:1: ruleAcquire returns [EObject current=null] : (otherlv_0= 'Acquire' otherlv_1= '(' ( (lv_path_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_sep_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_hasHeader_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleAcquire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_path_2_0 = null;

        EObject lv_sep_4_0 = null;

        EObject lv_hasHeader_6_0 = null;



        	enterRule();

        try {
            // InternalDslCsv.g:2086:2: ( (otherlv_0= 'Acquire' otherlv_1= '(' ( (lv_path_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_sep_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_hasHeader_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // InternalDslCsv.g:2087:2: (otherlv_0= 'Acquire' otherlv_1= '(' ( (lv_path_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_sep_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_hasHeader_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // InternalDslCsv.g:2087:2: (otherlv_0= 'Acquire' otherlv_1= '(' ( (lv_path_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_sep_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_hasHeader_6_0= ruleExpression ) ) otherlv_7= ')' )
            // InternalDslCsv.g:2088:3: otherlv_0= 'Acquire' otherlv_1= '(' ( (lv_path_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_sep_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_hasHeader_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAcquireAccess().getAcquireKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAcquireAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDslCsv.g:2096:3: ( (lv_path_2_0= ruleExpression ) )
            // InternalDslCsv.g:2097:4: (lv_path_2_0= ruleExpression )
            {
            // InternalDslCsv.g:2097:4: (lv_path_2_0= ruleExpression )
            // InternalDslCsv.g:2098:5: lv_path_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAcquireAccess().getPathExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_path_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAcquireRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_2_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAcquireAccess().getCommaKeyword_3());
            		
            // InternalDslCsv.g:2119:3: ( (lv_sep_4_0= ruleExpression ) )
            // InternalDslCsv.g:2120:4: (lv_sep_4_0= ruleExpression )
            {
            // InternalDslCsv.g:2120:4: (lv_sep_4_0= ruleExpression )
            // InternalDslCsv.g:2121:5: lv_sep_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAcquireAccess().getSepExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_sep_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAcquireRule());
            					}
            					set(
            						current,
            						"sep",
            						lv_sep_4_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getAcquireAccess().getCommaKeyword_5());
            		
            // InternalDslCsv.g:2142:3: ( (lv_hasHeader_6_0= ruleExpression ) )
            // InternalDslCsv.g:2143:4: (lv_hasHeader_6_0= ruleExpression )
            {
            // InternalDslCsv.g:2143:4: (lv_hasHeader_6_0= ruleExpression )
            // InternalDslCsv.g:2144:5: lv_hasHeader_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAcquireAccess().getHasHeaderExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_hasHeader_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAcquireRule());
            					}
            					set(
            						current,
            						"hasHeader",
            						lv_hasHeader_6_0,
            						"fr.irisa.DslCsv.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAcquireAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcquire"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00007FFF28002070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000028000070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});

}