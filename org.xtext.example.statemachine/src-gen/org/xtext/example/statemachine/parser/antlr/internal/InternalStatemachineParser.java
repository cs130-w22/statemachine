package org.xtext.example.statemachine.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.statemachine.services.StatemachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStatemachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'state'", "'machine'", "'{'", "'}'", "'initial'", "'final'", "'->'", "':'", "'['", "']'", "'/'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStatemachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStatemachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStatemachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStatemachine.g"; }



     	private StatemachineGrammarAccess grammarAccess;

        public InternalStatemachineParser(TokenStream input, StatemachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected StatemachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalStatemachine.g:64:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStatemachine.g:64:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStatemachine.g:65:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStatemachine.g:71:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'state' otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_states_4_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalStatemachine.g:77:2: ( (otherlv_0= 'state' otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )? ) )
            // InternalStatemachine.g:78:2: (otherlv_0= 'state' otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )? )
            {
            // InternalStatemachine.g:78:2: (otherlv_0= 'state' otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )? )
            // InternalStatemachine.g:79:3: otherlv_0= 'state' otherlv_1= 'machine' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getMachineKeyword_1());
            		
            // InternalStatemachine.g:87:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalStatemachine.g:88:4: (lv_name_2_0= RULE_ID )
            {
            // InternalStatemachine.g:88:4: (lv_name_2_0= RULE_ID )
            // InternalStatemachine.g:89:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStatemachine.g:105:3: (otherlv_3= '{' ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStatemachine.g:106:4: otherlv_3= '{' ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalStatemachine.g:110:4: ( (lv_states_4_0= ruleAbstractState ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=16)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalStatemachine.g:111:5: (lv_states_4_0= ruleAbstractState )
                    	    {
                    	    // InternalStatemachine.g:111:5: (lv_states_4_0= ruleAbstractState )
                    	    // InternalStatemachine.g:112:6: lv_states_4_0= ruleAbstractState
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateMachineAccess().getStatesAbstractStateParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_states_4_0=ruleAbstractState();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"states",
                    	    							lv_states_4_0,
                    	    							"org.xtext.example.statemachine.Statemachine.AbstractState");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // InternalStatemachine.g:129:4: ( (lv_transitions_5_0= ruleTransition ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalStatemachine.g:130:5: (lv_transitions_5_0= ruleTransition )
                    	    {
                    	    // InternalStatemachine.g:130:5: (lv_transitions_5_0= ruleTransition )
                    	    // InternalStatemachine.g:131:6: lv_transitions_5_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_transitions_5_0=ruleTransition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"transitions",
                    	    							lv_transitions_5_0,
                    	    							"org.xtext.example.statemachine.Statemachine.Transition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_3_3());
                    			

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleAbstractState"
    // InternalStatemachine.g:157:1: entryRuleAbstractState returns [EObject current=null] : iv_ruleAbstractState= ruleAbstractState EOF ;
    public final EObject entryRuleAbstractState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractState = null;


        try {
            // InternalStatemachine.g:157:54: (iv_ruleAbstractState= ruleAbstractState EOF )
            // InternalStatemachine.g:158:2: iv_ruleAbstractState= ruleAbstractState EOF
            {
             newCompositeNode(grammarAccess.getAbstractStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractState=ruleAbstractState();

            state._fsp--;

             current =iv_ruleAbstractState; 
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
    // $ANTLR end "entryRuleAbstractState"


    // $ANTLR start "ruleAbstractState"
    // InternalStatemachine.g:164:1: ruleAbstractState returns [EObject current=null] : (this_State_0= ruleState | this_InitialState_1= ruleInitialState | this_FinalState_2= ruleFinalState ) ;
    public final EObject ruleAbstractState() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_InitialState_1 = null;

        EObject this_FinalState_2 = null;



        	enterRule();

        try {
            // InternalStatemachine.g:170:2: ( (this_State_0= ruleState | this_InitialState_1= ruleInitialState | this_FinalState_2= ruleFinalState ) )
            // InternalStatemachine.g:171:2: (this_State_0= ruleState | this_InitialState_1= ruleInitialState | this_FinalState_2= ruleFinalState )
            {
            // InternalStatemachine.g:171:2: (this_State_0= ruleState | this_InitialState_1= ruleInitialState | this_FinalState_2= ruleFinalState )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalStatemachine.g:172:3: this_State_0= ruleState
                    {

                    			newCompositeNode(grammarAccess.getAbstractStateAccess().getStateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_State_0=ruleState();

                    state._fsp--;


                    			current = this_State_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStatemachine.g:181:3: this_InitialState_1= ruleInitialState
                    {

                    			newCompositeNode(grammarAccess.getAbstractStateAccess().getInitialStateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialState_1=ruleInitialState();

                    state._fsp--;


                    			current = this_InitialState_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalStatemachine.g:190:3: this_FinalState_2= ruleFinalState
                    {

                    			newCompositeNode(grammarAccess.getAbstractStateAccess().getFinalStateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FinalState_2=ruleFinalState();

                    state._fsp--;


                    			current = this_FinalState_2;
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
    // $ANTLR end "ruleAbstractState"


    // $ANTLR start "entryRuleState"
    // InternalStatemachine.g:202:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStatemachine.g:202:46: (iv_ruleState= ruleState EOF )
            // InternalStatemachine.g:203:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStatemachine.g:209:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_activities_3_0= ruleActivity ) )* ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_activities_3_0 = null;

        EObject lv_states_4_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalStatemachine.g:215:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_activities_3_0= ruleActivity ) )* ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )? ) )
            // InternalStatemachine.g:216:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_activities_3_0= ruleActivity ) )* ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )? )
            {
            // InternalStatemachine.g:216:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_activities_3_0= ruleActivity ) )* ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )? )
            // InternalStatemachine.g:217:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_activities_3_0= ruleActivity ) )* ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStatemachine.g:221:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStatemachine.g:222:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStatemachine.g:222:4: (lv_name_1_0= RULE_ID )
            // InternalStatemachine.g:223:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStatemachine.g:239:3: (otherlv_2= '{' ( (lv_activities_3_0= ruleActivity ) )* ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStatemachine.g:240:4: otherlv_2= '{' ( (lv_activities_3_0= ruleActivity ) )* ( (lv_states_4_0= ruleAbstractState ) )* ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalStatemachine.g:244:4: ( (lv_activities_3_0= ruleActivity ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            int LA5_2 = input.LA(2);

                            if ( (LA5_2==RULE_ID||LA5_2==11||(LA5_2>=14 && LA5_2<=16)||LA5_2==19||LA5_2==21) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalStatemachine.g:245:5: (lv_activities_3_0= ruleActivity )
                    	    {
                    	    // InternalStatemachine.g:245:5: (lv_activities_3_0= ruleActivity )
                    	    // InternalStatemachine.g:246:6: lv_activities_3_0= ruleActivity
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getActivitiesActivityParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_activities_3_0=ruleActivity();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"activities",
                    	    							lv_activities_3_0,
                    	    							"org.xtext.example.statemachine.Statemachine.Activity");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalStatemachine.g:263:4: ( (lv_states_4_0= ruleAbstractState ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==11||(LA6_0>=15 && LA6_0<=16)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalStatemachine.g:264:5: (lv_states_4_0= ruleAbstractState )
                    	    {
                    	    // InternalStatemachine.g:264:5: (lv_states_4_0= ruleAbstractState )
                    	    // InternalStatemachine.g:265:6: lv_states_4_0= ruleAbstractState
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getStatesAbstractStateParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_states_4_0=ruleAbstractState();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"states",
                    	    							lv_states_4_0,
                    	    							"org.xtext.example.statemachine.Statemachine.AbstractState");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalStatemachine.g:282:4: ( (lv_transitions_5_0= ruleTransition ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalStatemachine.g:283:5: (lv_transitions_5_0= ruleTransition )
                    	    {
                    	    // InternalStatemachine.g:283:5: (lv_transitions_5_0= ruleTransition )
                    	    // InternalStatemachine.g:284:6: lv_transitions_5_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_transitions_5_0=ruleTransition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"transitions",
                    	    							lv_transitions_5_0,
                    	    							"org.xtext.example.statemachine.Statemachine.Transition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_4());
                    			

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleInitialState"
    // InternalStatemachine.g:310:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // InternalStatemachine.g:310:53: (iv_ruleInitialState= ruleInitialState EOF )
            // InternalStatemachine.g:311:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
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
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalStatemachine.g:317:1: ruleInitialState returns [EObject current=null] : (otherlv_0= 'initial' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStatemachine.g:323:2: ( (otherlv_0= 'initial' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStatemachine.g:324:2: (otherlv_0= 'initial' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStatemachine.g:324:2: (otherlv_0= 'initial' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStatemachine.g:325:3: otherlv_0= 'initial' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialStateAccess().getInitialKeyword_0());
            		
            // InternalStatemachine.g:329:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStatemachine.g:330:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStatemachine.g:330:4: (lv_name_1_0= RULE_ID )
            // InternalStatemachine.g:331:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInitialStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleFinalState"
    // InternalStatemachine.g:351:1: entryRuleFinalState returns [EObject current=null] : iv_ruleFinalState= ruleFinalState EOF ;
    public final EObject entryRuleFinalState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalState = null;


        try {
            // InternalStatemachine.g:351:51: (iv_ruleFinalState= ruleFinalState EOF )
            // InternalStatemachine.g:352:2: iv_ruleFinalState= ruleFinalState EOF
            {
             newCompositeNode(grammarAccess.getFinalStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalState=ruleFinalState();

            state._fsp--;

             current =iv_ruleFinalState; 
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
    // $ANTLR end "entryRuleFinalState"


    // $ANTLR start "ruleFinalState"
    // InternalStatemachine.g:358:1: ruleFinalState returns [EObject current=null] : (otherlv_0= 'final' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFinalState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStatemachine.g:364:2: ( (otherlv_0= 'final' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStatemachine.g:365:2: (otherlv_0= 'final' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStatemachine.g:365:2: (otherlv_0= 'final' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStatemachine.g:366:3: otherlv_0= 'final' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFinalStateAccess().getFinalKeyword_0());
            		
            // InternalStatemachine.g:370:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStatemachine.g:371:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStatemachine.g:371:4: (lv_name_1_0= RULE_ID )
            // InternalStatemachine.g:372:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFinalStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFinalStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleFinalState"


    // $ANTLR start "entryRuleTransition"
    // InternalStatemachine.g:392:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStatemachine.g:392:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStatemachine.g:393:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStatemachine.g:399:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':' ( (lv_activity_4_0= ruleActivity ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_activity_4_0 = null;



        	enterRule();

        try {
            // InternalStatemachine.g:405:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':' ( (lv_activity_4_0= ruleActivity ) ) )? ) )
            // InternalStatemachine.g:406:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':' ( (lv_activity_4_0= ruleActivity ) ) )? )
            {
            // InternalStatemachine.g:406:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':' ( (lv_activity_4_0= ruleActivity ) ) )? )
            // InternalStatemachine.g:407:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ':' ( (lv_activity_4_0= ruleActivity ) ) )?
            {
            // InternalStatemachine.g:407:3: ( (otherlv_0= RULE_ID ) )
            // InternalStatemachine.g:408:4: (otherlv_0= RULE_ID )
            {
            // InternalStatemachine.g:408:4: (otherlv_0= RULE_ID )
            // InternalStatemachine.g:409:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getStartAbstractStateCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalStatemachine.g:424:3: ( (otherlv_2= RULE_ID ) )
            // InternalStatemachine.g:425:4: (otherlv_2= RULE_ID )
            {
            // InternalStatemachine.g:425:4: (otherlv_2= RULE_ID )
            // InternalStatemachine.g:426:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getEndAbstractStateCrossReference_2_0());
            				

            }


            }

            // InternalStatemachine.g:437:3: (otherlv_3= ':' ( (lv_activity_4_0= ruleActivity ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStatemachine.g:438:4: otherlv_3= ':' ( (lv_activity_4_0= ruleActivity ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getColonKeyword_3_0());
                    			
                    // InternalStatemachine.g:442:4: ( (lv_activity_4_0= ruleActivity ) )
                    // InternalStatemachine.g:443:5: (lv_activity_4_0= ruleActivity )
                    {
                    // InternalStatemachine.g:443:5: (lv_activity_4_0= ruleActivity )
                    // InternalStatemachine.g:444:6: lv_activity_4_0= ruleActivity
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getActivityActivityParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_activity_4_0=ruleActivity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"activity",
                    							lv_activity_4_0,
                    							"org.xtext.example.statemachine.Statemachine.Activity");
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleActivity"
    // InternalStatemachine.g:466:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalStatemachine.g:466:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalStatemachine.g:467:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalStatemachine.g:473:1: ruleActivity returns [EObject current=null] : ( ( (lv_trigger_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_action_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token lv_trigger_0_0=null;
        Token otherlv_1=null;
        Token lv_condition_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_action_5_0=null;


        	enterRule();

        try {
            // InternalStatemachine.g:479:2: ( ( ( (lv_trigger_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_action_5_0= RULE_STRING ) ) )? ) )
            // InternalStatemachine.g:480:2: ( ( (lv_trigger_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_action_5_0= RULE_STRING ) ) )? )
            {
            // InternalStatemachine.g:480:2: ( ( (lv_trigger_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_action_5_0= RULE_STRING ) ) )? )
            // InternalStatemachine.g:481:3: ( (lv_trigger_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_action_5_0= RULE_STRING ) ) )?
            {
            // InternalStatemachine.g:481:3: ( (lv_trigger_0_0= RULE_ID ) )
            // InternalStatemachine.g:482:4: (lv_trigger_0_0= RULE_ID )
            {
            // InternalStatemachine.g:482:4: (lv_trigger_0_0= RULE_ID )
            // InternalStatemachine.g:483:5: lv_trigger_0_0= RULE_ID
            {
            lv_trigger_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_trigger_0_0, grammarAccess.getActivityAccess().getTriggerIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"trigger",
            						lv_trigger_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStatemachine.g:499:3: (otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStatemachine.g:500:4: otherlv_1= '[' ( (lv_condition_2_0= RULE_STRING ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalStatemachine.g:504:4: ( (lv_condition_2_0= RULE_STRING ) )
                    // InternalStatemachine.g:505:5: (lv_condition_2_0= RULE_STRING )
                    {
                    // InternalStatemachine.g:505:5: (lv_condition_2_0= RULE_STRING )
                    // InternalStatemachine.g:506:6: lv_condition_2_0= RULE_STRING
                    {
                    lv_condition_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_condition_2_0, grammarAccess.getActivityAccess().getConditionSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"condition",
                    							lv_condition_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalStatemachine.g:527:3: (otherlv_4= '/' ( (lv_action_5_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalStatemachine.g:528:4: otherlv_4= '/' ( (lv_action_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getSolidusKeyword_2_0());
                    			
                    // InternalStatemachine.g:532:4: ( (lv_action_5_0= RULE_STRING ) )
                    // InternalStatemachine.g:533:5: (lv_action_5_0= RULE_STRING )
                    {
                    // InternalStatemachine.g:533:5: (lv_action_5_0= RULE_STRING )
                    // InternalStatemachine.g:534:6: lv_action_5_0= RULE_STRING
                    {
                    lv_action_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_action_5_0, grammarAccess.getActivityAccess().getActionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"action",
                    							lv_action_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleActivity"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});

}