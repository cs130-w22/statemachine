package org.xtext.example.statemachine.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.statemachine.services.StatemachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStatemachineParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(StatemachineGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleStateMachine"
    // InternalStatemachine.g:53:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // InternalStatemachine.g:54:1: ( ruleStateMachine EOF )
            // InternalStatemachine.g:55:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStatemachine.g:62:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:66:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // InternalStatemachine.g:67:2: ( ( rule__StateMachine__Group__0 ) )
            {
            // InternalStatemachine.g:67:2: ( ( rule__StateMachine__Group__0 ) )
            // InternalStatemachine.g:68:3: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // InternalStatemachine.g:69:3: ( rule__StateMachine__Group__0 )
            // InternalStatemachine.g:69:4: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleAbstractState"
    // InternalStatemachine.g:78:1: entryRuleAbstractState : ruleAbstractState EOF ;
    public final void entryRuleAbstractState() throws RecognitionException {
        try {
            // InternalStatemachine.g:79:1: ( ruleAbstractState EOF )
            // InternalStatemachine.g:80:1: ruleAbstractState EOF
            {
             before(grammarAccess.getAbstractStateRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractState();

            state._fsp--;

             after(grammarAccess.getAbstractStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractState"


    // $ANTLR start "ruleAbstractState"
    // InternalStatemachine.g:87:1: ruleAbstractState : ( ( rule__AbstractState__Alternatives ) ) ;
    public final void ruleAbstractState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:91:2: ( ( ( rule__AbstractState__Alternatives ) ) )
            // InternalStatemachine.g:92:2: ( ( rule__AbstractState__Alternatives ) )
            {
            // InternalStatemachine.g:92:2: ( ( rule__AbstractState__Alternatives ) )
            // InternalStatemachine.g:93:3: ( rule__AbstractState__Alternatives )
            {
             before(grammarAccess.getAbstractStateAccess().getAlternatives()); 
            // InternalStatemachine.g:94:3: ( rule__AbstractState__Alternatives )
            // InternalStatemachine.g:94:4: rule__AbstractState__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractState__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractStateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractState"


    // $ANTLR start "entryRuleState"
    // InternalStatemachine.g:103:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalStatemachine.g:104:1: ( ruleState EOF )
            // InternalStatemachine.g:105:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStatemachine.g:112:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:116:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalStatemachine.g:117:2: ( ( rule__State__Group__0 ) )
            {
            // InternalStatemachine.g:117:2: ( ( rule__State__Group__0 ) )
            // InternalStatemachine.g:118:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalStatemachine.g:119:3: ( rule__State__Group__0 )
            // InternalStatemachine.g:119:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleInitialState"
    // InternalStatemachine.g:128:1: entryRuleInitialState : ruleInitialState EOF ;
    public final void entryRuleInitialState() throws RecognitionException {
        try {
            // InternalStatemachine.g:129:1: ( ruleInitialState EOF )
            // InternalStatemachine.g:130:1: ruleInitialState EOF
            {
             before(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialState();

            state._fsp--;

             after(grammarAccess.getInitialStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalStatemachine.g:137:1: ruleInitialState : ( ( rule__InitialState__Group__0 ) ) ;
    public final void ruleInitialState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:141:2: ( ( ( rule__InitialState__Group__0 ) ) )
            // InternalStatemachine.g:142:2: ( ( rule__InitialState__Group__0 ) )
            {
            // InternalStatemachine.g:142:2: ( ( rule__InitialState__Group__0 ) )
            // InternalStatemachine.g:143:3: ( rule__InitialState__Group__0 )
            {
             before(grammarAccess.getInitialStateAccess().getGroup()); 
            // InternalStatemachine.g:144:3: ( rule__InitialState__Group__0 )
            // InternalStatemachine.g:144:4: rule__InitialState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleFinalState"
    // InternalStatemachine.g:153:1: entryRuleFinalState : ruleFinalState EOF ;
    public final void entryRuleFinalState() throws RecognitionException {
        try {
            // InternalStatemachine.g:154:1: ( ruleFinalState EOF )
            // InternalStatemachine.g:155:1: ruleFinalState EOF
            {
             before(grammarAccess.getFinalStateRule()); 
            pushFollow(FOLLOW_1);
            ruleFinalState();

            state._fsp--;

             after(grammarAccess.getFinalStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFinalState"


    // $ANTLR start "ruleFinalState"
    // InternalStatemachine.g:162:1: ruleFinalState : ( ( rule__FinalState__Group__0 ) ) ;
    public final void ruleFinalState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:166:2: ( ( ( rule__FinalState__Group__0 ) ) )
            // InternalStatemachine.g:167:2: ( ( rule__FinalState__Group__0 ) )
            {
            // InternalStatemachine.g:167:2: ( ( rule__FinalState__Group__0 ) )
            // InternalStatemachine.g:168:3: ( rule__FinalState__Group__0 )
            {
             before(grammarAccess.getFinalStateAccess().getGroup()); 
            // InternalStatemachine.g:169:3: ( rule__FinalState__Group__0 )
            // InternalStatemachine.g:169:4: rule__FinalState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FinalState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinalState"


    // $ANTLR start "entryRuleTransition"
    // InternalStatemachine.g:178:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalStatemachine.g:179:1: ( ruleTransition EOF )
            // InternalStatemachine.g:180:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStatemachine.g:187:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:191:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalStatemachine.g:192:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalStatemachine.g:192:2: ( ( rule__Transition__Group__0 ) )
            // InternalStatemachine.g:193:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalStatemachine.g:194:3: ( rule__Transition__Group__0 )
            // InternalStatemachine.g:194:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleActivity"
    // InternalStatemachine.g:203:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalStatemachine.g:204:1: ( ruleActivity EOF )
            // InternalStatemachine.g:205:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalStatemachine.g:212:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:216:2: ( ( ( rule__Activity__Group__0 ) ) )
            // InternalStatemachine.g:217:2: ( ( rule__Activity__Group__0 ) )
            {
            // InternalStatemachine.g:217:2: ( ( rule__Activity__Group__0 ) )
            // InternalStatemachine.g:218:3: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // InternalStatemachine.g:219:3: ( rule__Activity__Group__0 )
            // InternalStatemachine.g:219:4: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "rule__AbstractState__Alternatives"
    // InternalStatemachine.g:227:1: rule__AbstractState__Alternatives : ( ( ruleState ) | ( ruleInitialState ) | ( ruleFinalState ) );
    public final void rule__AbstractState__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:231:1: ( ( ruleState ) | ( ruleInitialState ) | ( ruleFinalState ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalStatemachine.g:232:2: ( ruleState )
                    {
                    // InternalStatemachine.g:232:2: ( ruleState )
                    // InternalStatemachine.g:233:3: ruleState
                    {
                     before(grammarAccess.getAbstractStateAccess().getStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getAbstractStateAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStatemachine.g:238:2: ( ruleInitialState )
                    {
                    // InternalStatemachine.g:238:2: ( ruleInitialState )
                    // InternalStatemachine.g:239:3: ruleInitialState
                    {
                     before(grammarAccess.getAbstractStateAccess().getInitialStateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInitialState();

                    state._fsp--;

                     after(grammarAccess.getAbstractStateAccess().getInitialStateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalStatemachine.g:244:2: ( ruleFinalState )
                    {
                    // InternalStatemachine.g:244:2: ( ruleFinalState )
                    // InternalStatemachine.g:245:3: ruleFinalState
                    {
                     before(grammarAccess.getAbstractStateAccess().getFinalStateParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFinalState();

                    state._fsp--;

                     after(grammarAccess.getAbstractStateAccess().getFinalStateParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractState__Alternatives"


    // $ANTLR start "rule__StateMachine__Group__0"
    // InternalStatemachine.g:254:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:258:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // InternalStatemachine.g:259:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // InternalStatemachine.g:266:1: rule__StateMachine__Group__0__Impl : ( 'state' ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:270:1: ( ( 'state' ) )
            // InternalStatemachine.g:271:1: ( 'state' )
            {
            // InternalStatemachine.g:271:1: ( 'state' )
            // InternalStatemachine.g:272:2: 'state'
            {
             before(grammarAccess.getStateMachineAccess().getStateKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // InternalStatemachine.g:281:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:285:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // InternalStatemachine.g:286:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // InternalStatemachine.g:293:1: rule__StateMachine__Group__1__Impl : ( 'machine' ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:297:1: ( ( 'machine' ) )
            // InternalStatemachine.g:298:1: ( 'machine' )
            {
            // InternalStatemachine.g:298:1: ( 'machine' )
            // InternalStatemachine.g:299:2: 'machine'
            {
             before(grammarAccess.getStateMachineAccess().getMachineKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getMachineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // InternalStatemachine.g:308:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:312:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // InternalStatemachine.g:313:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // InternalStatemachine.g:320:1: rule__StateMachine__Group__2__Impl : ( ( rule__StateMachine__NameAssignment_2 ) ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:324:1: ( ( ( rule__StateMachine__NameAssignment_2 ) ) )
            // InternalStatemachine.g:325:1: ( ( rule__StateMachine__NameAssignment_2 ) )
            {
            // InternalStatemachine.g:325:1: ( ( rule__StateMachine__NameAssignment_2 ) )
            // InternalStatemachine.g:326:2: ( rule__StateMachine__NameAssignment_2 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_2()); 
            // InternalStatemachine.g:327:2: ( rule__StateMachine__NameAssignment_2 )
            // InternalStatemachine.g:327:3: rule__StateMachine__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // InternalStatemachine.g:335:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:339:1: ( rule__StateMachine__Group__3__Impl )
            // InternalStatemachine.g:340:2: rule__StateMachine__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // InternalStatemachine.g:346:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__Group_3__0 )? ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:350:1: ( ( ( rule__StateMachine__Group_3__0 )? ) )
            // InternalStatemachine.g:351:1: ( ( rule__StateMachine__Group_3__0 )? )
            {
            // InternalStatemachine.g:351:1: ( ( rule__StateMachine__Group_3__0 )? )
            // InternalStatemachine.g:352:2: ( rule__StateMachine__Group_3__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_3()); 
            // InternalStatemachine.g:353:2: ( rule__StateMachine__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalStatemachine.g:353:3: rule__StateMachine__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__0"
    // InternalStatemachine.g:362:1: rule__StateMachine__Group_3__0 : rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1 ;
    public final void rule__StateMachine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:366:1: ( rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1 )
            // InternalStatemachine.g:367:2: rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__0"


    // $ANTLR start "rule__StateMachine__Group_3__0__Impl"
    // InternalStatemachine.g:374:1: rule__StateMachine__Group_3__0__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:378:1: ( ( '{' ) )
            // InternalStatemachine.g:379:1: ( '{' )
            {
            // InternalStatemachine.g:379:1: ( '{' )
            // InternalStatemachine.g:380:2: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__1"
    // InternalStatemachine.g:389:1: rule__StateMachine__Group_3__1 : rule__StateMachine__Group_3__1__Impl rule__StateMachine__Group_3__2 ;
    public final void rule__StateMachine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:393:1: ( rule__StateMachine__Group_3__1__Impl rule__StateMachine__Group_3__2 )
            // InternalStatemachine.g:394:2: rule__StateMachine__Group_3__1__Impl rule__StateMachine__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__1"


    // $ANTLR start "rule__StateMachine__Group_3__1__Impl"
    // InternalStatemachine.g:401:1: rule__StateMachine__Group_3__1__Impl : ( ( rule__StateMachine__StatesAssignment_3_1 )* ) ;
    public final void rule__StateMachine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:405:1: ( ( ( rule__StateMachine__StatesAssignment_3_1 )* ) )
            // InternalStatemachine.g:406:1: ( ( rule__StateMachine__StatesAssignment_3_1 )* )
            {
            // InternalStatemachine.g:406:1: ( ( rule__StateMachine__StatesAssignment_3_1 )* )
            // InternalStatemachine.g:407:2: ( rule__StateMachine__StatesAssignment_3_1 )*
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_3_1()); 
            // InternalStatemachine.g:408:2: ( rule__StateMachine__StatesAssignment_3_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||(LA3_0>=15 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStatemachine.g:408:3: rule__StateMachine__StatesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StateMachine__StatesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__2"
    // InternalStatemachine.g:416:1: rule__StateMachine__Group_3__2 : rule__StateMachine__Group_3__2__Impl rule__StateMachine__Group_3__3 ;
    public final void rule__StateMachine__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:420:1: ( rule__StateMachine__Group_3__2__Impl rule__StateMachine__Group_3__3 )
            // InternalStatemachine.g:421:2: rule__StateMachine__Group_3__2__Impl rule__StateMachine__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__2"


    // $ANTLR start "rule__StateMachine__Group_3__2__Impl"
    // InternalStatemachine.g:428:1: rule__StateMachine__Group_3__2__Impl : ( ( rule__StateMachine__TransitionsAssignment_3_2 )* ) ;
    public final void rule__StateMachine__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:432:1: ( ( ( rule__StateMachine__TransitionsAssignment_3_2 )* ) )
            // InternalStatemachine.g:433:1: ( ( rule__StateMachine__TransitionsAssignment_3_2 )* )
            {
            // InternalStatemachine.g:433:1: ( ( rule__StateMachine__TransitionsAssignment_3_2 )* )
            // InternalStatemachine.g:434:2: ( rule__StateMachine__TransitionsAssignment_3_2 )*
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_3_2()); 
            // InternalStatemachine.g:435:2: ( rule__StateMachine__TransitionsAssignment_3_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStatemachine.g:435:3: rule__StateMachine__TransitionsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__StateMachine__TransitionsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__3"
    // InternalStatemachine.g:443:1: rule__StateMachine__Group_3__3 : rule__StateMachine__Group_3__3__Impl ;
    public final void rule__StateMachine__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:447:1: ( rule__StateMachine__Group_3__3__Impl )
            // InternalStatemachine.g:448:2: rule__StateMachine__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__3"


    // $ANTLR start "rule__StateMachine__Group_3__3__Impl"
    // InternalStatemachine.g:454:1: rule__StateMachine__Group_3__3__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:458:1: ( ( '}' ) )
            // InternalStatemachine.g:459:1: ( '}' )
            {
            // InternalStatemachine.g:459:1: ( '}' )
            // InternalStatemachine.g:460:2: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__3__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalStatemachine.g:470:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:474:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalStatemachine.g:475:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalStatemachine.g:482:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:486:1: ( ( 'state' ) )
            // InternalStatemachine.g:487:1: ( 'state' )
            {
            // InternalStatemachine.g:487:1: ( 'state' )
            // InternalStatemachine.g:488:2: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalStatemachine.g:497:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:501:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalStatemachine.g:502:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalStatemachine.g:509:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:513:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalStatemachine.g:514:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalStatemachine.g:514:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalStatemachine.g:515:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalStatemachine.g:516:2: ( rule__State__NameAssignment_1 )
            // InternalStatemachine.g:516:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalStatemachine.g:524:1: rule__State__Group__2 : rule__State__Group__2__Impl ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:528:1: ( rule__State__Group__2__Impl )
            // InternalStatemachine.g:529:2: rule__State__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalStatemachine.g:535:1: rule__State__Group__2__Impl : ( ( rule__State__Group_2__0 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:539:1: ( ( ( rule__State__Group_2__0 )? ) )
            // InternalStatemachine.g:540:1: ( ( rule__State__Group_2__0 )? )
            {
            // InternalStatemachine.g:540:1: ( ( rule__State__Group_2__0 )? )
            // InternalStatemachine.g:541:2: ( rule__State__Group_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_2()); 
            // InternalStatemachine.g:542:2: ( rule__State__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStatemachine.g:542:3: rule__State__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group_2__0"
    // InternalStatemachine.g:551:1: rule__State__Group_2__0 : rule__State__Group_2__0__Impl rule__State__Group_2__1 ;
    public final void rule__State__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:555:1: ( rule__State__Group_2__0__Impl rule__State__Group_2__1 )
            // InternalStatemachine.g:556:2: rule__State__Group_2__0__Impl rule__State__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__State__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0"


    // $ANTLR start "rule__State__Group_2__0__Impl"
    // InternalStatemachine.g:563:1: rule__State__Group_2__0__Impl : ( '{' ) ;
    public final void rule__State__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:567:1: ( ( '{' ) )
            // InternalStatemachine.g:568:1: ( '{' )
            {
            // InternalStatemachine.g:568:1: ( '{' )
            // InternalStatemachine.g:569:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__0__Impl"


    // $ANTLR start "rule__State__Group_2__1"
    // InternalStatemachine.g:578:1: rule__State__Group_2__1 : rule__State__Group_2__1__Impl rule__State__Group_2__2 ;
    public final void rule__State__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:582:1: ( rule__State__Group_2__1__Impl rule__State__Group_2__2 )
            // InternalStatemachine.g:583:2: rule__State__Group_2__1__Impl rule__State__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__State__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1"


    // $ANTLR start "rule__State__Group_2__1__Impl"
    // InternalStatemachine.g:590:1: rule__State__Group_2__1__Impl : ( ( rule__State__ActivitiesAssignment_2_1 )* ) ;
    public final void rule__State__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:594:1: ( ( ( rule__State__ActivitiesAssignment_2_1 )* ) )
            // InternalStatemachine.g:595:1: ( ( rule__State__ActivitiesAssignment_2_1 )* )
            {
            // InternalStatemachine.g:595:1: ( ( rule__State__ActivitiesAssignment_2_1 )* )
            // InternalStatemachine.g:596:2: ( rule__State__ActivitiesAssignment_2_1 )*
            {
             before(grammarAccess.getStateAccess().getActivitiesAssignment_2_1()); 
            // InternalStatemachine.g:597:2: ( rule__State__ActivitiesAssignment_2_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID||LA6_2==11||(LA6_2>=14 && LA6_2<=16)||LA6_2==19||LA6_2==21) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalStatemachine.g:597:3: rule__State__ActivitiesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__State__ActivitiesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getActivitiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__1__Impl"


    // $ANTLR start "rule__State__Group_2__2"
    // InternalStatemachine.g:605:1: rule__State__Group_2__2 : rule__State__Group_2__2__Impl rule__State__Group_2__3 ;
    public final void rule__State__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:609:1: ( rule__State__Group_2__2__Impl rule__State__Group_2__3 )
            // InternalStatemachine.g:610:2: rule__State__Group_2__2__Impl rule__State__Group_2__3
            {
            pushFollow(FOLLOW_6);
            rule__State__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__2"


    // $ANTLR start "rule__State__Group_2__2__Impl"
    // InternalStatemachine.g:617:1: rule__State__Group_2__2__Impl : ( ( rule__State__StatesAssignment_2_2 )* ) ;
    public final void rule__State__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:621:1: ( ( ( rule__State__StatesAssignment_2_2 )* ) )
            // InternalStatemachine.g:622:1: ( ( rule__State__StatesAssignment_2_2 )* )
            {
            // InternalStatemachine.g:622:1: ( ( rule__State__StatesAssignment_2_2 )* )
            // InternalStatemachine.g:623:2: ( rule__State__StatesAssignment_2_2 )*
            {
             before(grammarAccess.getStateAccess().getStatesAssignment_2_2()); 
            // InternalStatemachine.g:624:2: ( rule__State__StatesAssignment_2_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==11||(LA7_0>=15 && LA7_0<=16)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStatemachine.g:624:3: rule__State__StatesAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__State__StatesAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getStatesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__2__Impl"


    // $ANTLR start "rule__State__Group_2__3"
    // InternalStatemachine.g:632:1: rule__State__Group_2__3 : rule__State__Group_2__3__Impl rule__State__Group_2__4 ;
    public final void rule__State__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:636:1: ( rule__State__Group_2__3__Impl rule__State__Group_2__4 )
            // InternalStatemachine.g:637:2: rule__State__Group_2__3__Impl rule__State__Group_2__4
            {
            pushFollow(FOLLOW_6);
            rule__State__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__3"


    // $ANTLR start "rule__State__Group_2__3__Impl"
    // InternalStatemachine.g:644:1: rule__State__Group_2__3__Impl : ( ( rule__State__TransitionsAssignment_2_3 )* ) ;
    public final void rule__State__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:648:1: ( ( ( rule__State__TransitionsAssignment_2_3 )* ) )
            // InternalStatemachine.g:649:1: ( ( rule__State__TransitionsAssignment_2_3 )* )
            {
            // InternalStatemachine.g:649:1: ( ( rule__State__TransitionsAssignment_2_3 )* )
            // InternalStatemachine.g:650:2: ( rule__State__TransitionsAssignment_2_3 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_2_3()); 
            // InternalStatemachine.g:651:2: ( rule__State__TransitionsAssignment_2_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalStatemachine.g:651:3: rule__State__TransitionsAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__State__TransitionsAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__3__Impl"


    // $ANTLR start "rule__State__Group_2__4"
    // InternalStatemachine.g:659:1: rule__State__Group_2__4 : rule__State__Group_2__4__Impl ;
    public final void rule__State__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:663:1: ( rule__State__Group_2__4__Impl )
            // InternalStatemachine.g:664:2: rule__State__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__4"


    // $ANTLR start "rule__State__Group_2__4__Impl"
    // InternalStatemachine.g:670:1: rule__State__Group_2__4__Impl : ( '}' ) ;
    public final void rule__State__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:674:1: ( ( '}' ) )
            // InternalStatemachine.g:675:1: ( '}' )
            {
            // InternalStatemachine.g:675:1: ( '}' )
            // InternalStatemachine.g:676:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_2__4__Impl"


    // $ANTLR start "rule__InitialState__Group__0"
    // InternalStatemachine.g:686:1: rule__InitialState__Group__0 : rule__InitialState__Group__0__Impl rule__InitialState__Group__1 ;
    public final void rule__InitialState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:690:1: ( rule__InitialState__Group__0__Impl rule__InitialState__Group__1 )
            // InternalStatemachine.g:691:2: rule__InitialState__Group__0__Impl rule__InitialState__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__InitialState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__0"


    // $ANTLR start "rule__InitialState__Group__0__Impl"
    // InternalStatemachine.g:698:1: rule__InitialState__Group__0__Impl : ( 'initial' ) ;
    public final void rule__InitialState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:702:1: ( ( 'initial' ) )
            // InternalStatemachine.g:703:1: ( 'initial' )
            {
            // InternalStatemachine.g:703:1: ( 'initial' )
            // InternalStatemachine.g:704:2: 'initial'
            {
             before(grammarAccess.getInitialStateAccess().getInitialKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInitialStateAccess().getInitialKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__0__Impl"


    // $ANTLR start "rule__InitialState__Group__1"
    // InternalStatemachine.g:713:1: rule__InitialState__Group__1 : rule__InitialState__Group__1__Impl ;
    public final void rule__InitialState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:717:1: ( rule__InitialState__Group__1__Impl )
            // InternalStatemachine.g:718:2: rule__InitialState__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialState__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__1"


    // $ANTLR start "rule__InitialState__Group__1__Impl"
    // InternalStatemachine.g:724:1: rule__InitialState__Group__1__Impl : ( ( rule__InitialState__NameAssignment_1 ) ) ;
    public final void rule__InitialState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:728:1: ( ( ( rule__InitialState__NameAssignment_1 ) ) )
            // InternalStatemachine.g:729:1: ( ( rule__InitialState__NameAssignment_1 ) )
            {
            // InternalStatemachine.g:729:1: ( ( rule__InitialState__NameAssignment_1 ) )
            // InternalStatemachine.g:730:2: ( rule__InitialState__NameAssignment_1 )
            {
             before(grammarAccess.getInitialStateAccess().getNameAssignment_1()); 
            // InternalStatemachine.g:731:2: ( rule__InitialState__NameAssignment_1 )
            // InternalStatemachine.g:731:3: rule__InitialState__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialState__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__1__Impl"


    // $ANTLR start "rule__FinalState__Group__0"
    // InternalStatemachine.g:740:1: rule__FinalState__Group__0 : rule__FinalState__Group__0__Impl rule__FinalState__Group__1 ;
    public final void rule__FinalState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:744:1: ( rule__FinalState__Group__0__Impl rule__FinalState__Group__1 )
            // InternalStatemachine.g:745:2: rule__FinalState__Group__0__Impl rule__FinalState__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FinalState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalState__Group__0"


    // $ANTLR start "rule__FinalState__Group__0__Impl"
    // InternalStatemachine.g:752:1: rule__FinalState__Group__0__Impl : ( 'final' ) ;
    public final void rule__FinalState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:756:1: ( ( 'final' ) )
            // InternalStatemachine.g:757:1: ( 'final' )
            {
            // InternalStatemachine.g:757:1: ( 'final' )
            // InternalStatemachine.g:758:2: 'final'
            {
             before(grammarAccess.getFinalStateAccess().getFinalKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFinalStateAccess().getFinalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalState__Group__0__Impl"


    // $ANTLR start "rule__FinalState__Group__1"
    // InternalStatemachine.g:767:1: rule__FinalState__Group__1 : rule__FinalState__Group__1__Impl ;
    public final void rule__FinalState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:771:1: ( rule__FinalState__Group__1__Impl )
            // InternalStatemachine.g:772:2: rule__FinalState__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalState__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalState__Group__1"


    // $ANTLR start "rule__FinalState__Group__1__Impl"
    // InternalStatemachine.g:778:1: rule__FinalState__Group__1__Impl : ( ( rule__FinalState__NameAssignment_1 ) ) ;
    public final void rule__FinalState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:782:1: ( ( ( rule__FinalState__NameAssignment_1 ) ) )
            // InternalStatemachine.g:783:1: ( ( rule__FinalState__NameAssignment_1 ) )
            {
            // InternalStatemachine.g:783:1: ( ( rule__FinalState__NameAssignment_1 ) )
            // InternalStatemachine.g:784:2: ( rule__FinalState__NameAssignment_1 )
            {
             before(grammarAccess.getFinalStateAccess().getNameAssignment_1()); 
            // InternalStatemachine.g:785:2: ( rule__FinalState__NameAssignment_1 )
            // InternalStatemachine.g:785:3: rule__FinalState__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FinalState__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalState__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalStatemachine.g:794:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:798:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalStatemachine.g:799:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalStatemachine.g:806:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__StartAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:810:1: ( ( ( rule__Transition__StartAssignment_0 ) ) )
            // InternalStatemachine.g:811:1: ( ( rule__Transition__StartAssignment_0 ) )
            {
            // InternalStatemachine.g:811:1: ( ( rule__Transition__StartAssignment_0 ) )
            // InternalStatemachine.g:812:2: ( rule__Transition__StartAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getStartAssignment_0()); 
            // InternalStatemachine.g:813:2: ( rule__Transition__StartAssignment_0 )
            // InternalStatemachine.g:813:3: rule__Transition__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalStatemachine.g:821:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:825:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalStatemachine.g:826:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalStatemachine.g:833:1: rule__Transition__Group__1__Impl : ( '->' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:837:1: ( ( '->' ) )
            // InternalStatemachine.g:838:1: ( '->' )
            {
            // InternalStatemachine.g:838:1: ( '->' )
            // InternalStatemachine.g:839:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalStatemachine.g:848:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:852:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalStatemachine.g:853:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalStatemachine.g:860:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__EndAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:864:1: ( ( ( rule__Transition__EndAssignment_2 ) ) )
            // InternalStatemachine.g:865:1: ( ( rule__Transition__EndAssignment_2 ) )
            {
            // InternalStatemachine.g:865:1: ( ( rule__Transition__EndAssignment_2 ) )
            // InternalStatemachine.g:866:2: ( rule__Transition__EndAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getEndAssignment_2()); 
            // InternalStatemachine.g:867:2: ( rule__Transition__EndAssignment_2 )
            // InternalStatemachine.g:867:3: rule__Transition__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalStatemachine.g:875:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:879:1: ( rule__Transition__Group__3__Impl )
            // InternalStatemachine.g:880:2: rule__Transition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalStatemachine.g:886:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:890:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // InternalStatemachine.g:891:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // InternalStatemachine.g:891:1: ( ( rule__Transition__Group_3__0 )? )
            // InternalStatemachine.g:892:2: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // InternalStatemachine.g:893:2: ( rule__Transition__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStatemachine.g:893:3: rule__Transition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group_3__0"
    // InternalStatemachine.g:902:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:906:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // InternalStatemachine.g:907:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__0"


    // $ANTLR start "rule__Transition__Group_3__0__Impl"
    // InternalStatemachine.g:914:1: rule__Transition__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:918:1: ( ( ':' ) )
            // InternalStatemachine.g:919:1: ( ':' )
            {
            // InternalStatemachine.g:919:1: ( ':' )
            // InternalStatemachine.g:920:2: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_3__1"
    // InternalStatemachine.g:929:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:933:1: ( rule__Transition__Group_3__1__Impl )
            // InternalStatemachine.g:934:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__1"


    // $ANTLR start "rule__Transition__Group_3__1__Impl"
    // InternalStatemachine.g:940:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__ActivityAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:944:1: ( ( ( rule__Transition__ActivityAssignment_3_1 ) ) )
            // InternalStatemachine.g:945:1: ( ( rule__Transition__ActivityAssignment_3_1 ) )
            {
            // InternalStatemachine.g:945:1: ( ( rule__Transition__ActivityAssignment_3_1 ) )
            // InternalStatemachine.g:946:2: ( rule__Transition__ActivityAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getActivityAssignment_3_1()); 
            // InternalStatemachine.g:947:2: ( rule__Transition__ActivityAssignment_3_1 )
            // InternalStatemachine.g:947:3: rule__Transition__ActivityAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ActivityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getActivityAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__1__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // InternalStatemachine.g:956:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:960:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // InternalStatemachine.g:961:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // InternalStatemachine.g:968:1: rule__Activity__Group__0__Impl : ( ( rule__Activity__TriggerAssignment_0 ) ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:972:1: ( ( ( rule__Activity__TriggerAssignment_0 ) ) )
            // InternalStatemachine.g:973:1: ( ( rule__Activity__TriggerAssignment_0 ) )
            {
            // InternalStatemachine.g:973:1: ( ( rule__Activity__TriggerAssignment_0 ) )
            // InternalStatemachine.g:974:2: ( rule__Activity__TriggerAssignment_0 )
            {
             before(grammarAccess.getActivityAccess().getTriggerAssignment_0()); 
            // InternalStatemachine.g:975:2: ( rule__Activity__TriggerAssignment_0 )
            // InternalStatemachine.g:975:3: rule__Activity__TriggerAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Activity__TriggerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getTriggerAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // InternalStatemachine.g:983:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:987:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // InternalStatemachine.g:988:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // InternalStatemachine.g:995:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__Group_1__0 )? ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:999:1: ( ( ( rule__Activity__Group_1__0 )? ) )
            // InternalStatemachine.g:1000:1: ( ( rule__Activity__Group_1__0 )? )
            {
            // InternalStatemachine.g:1000:1: ( ( rule__Activity__Group_1__0 )? )
            // InternalStatemachine.g:1001:2: ( rule__Activity__Group_1__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_1()); 
            // InternalStatemachine.g:1002:2: ( rule__Activity__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStatemachine.g:1002:3: rule__Activity__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // InternalStatemachine.g:1010:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1014:1: ( rule__Activity__Group__2__Impl )
            // InternalStatemachine.g:1015:2: rule__Activity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // InternalStatemachine.g:1021:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__Group_2__0 )? ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1025:1: ( ( ( rule__Activity__Group_2__0 )? ) )
            // InternalStatemachine.g:1026:1: ( ( rule__Activity__Group_2__0 )? )
            {
            // InternalStatemachine.g:1026:1: ( ( rule__Activity__Group_2__0 )? )
            // InternalStatemachine.g:1027:2: ( rule__Activity__Group_2__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_2()); 
            // InternalStatemachine.g:1028:2: ( rule__Activity__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalStatemachine.g:1028:3: rule__Activity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group_1__0"
    // InternalStatemachine.g:1037:1: rule__Activity__Group_1__0 : rule__Activity__Group_1__0__Impl rule__Activity__Group_1__1 ;
    public final void rule__Activity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1041:1: ( rule__Activity__Group_1__0__Impl rule__Activity__Group_1__1 )
            // InternalStatemachine.g:1042:2: rule__Activity__Group_1__0__Impl rule__Activity__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Activity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__0"


    // $ANTLR start "rule__Activity__Group_1__0__Impl"
    // InternalStatemachine.g:1049:1: rule__Activity__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Activity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1053:1: ( ( '[' ) )
            // InternalStatemachine.g:1054:1: ( '[' )
            {
            // InternalStatemachine.g:1054:1: ( '[' )
            // InternalStatemachine.g:1055:2: '['
            {
             before(grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_1__1"
    // InternalStatemachine.g:1064:1: rule__Activity__Group_1__1 : rule__Activity__Group_1__1__Impl rule__Activity__Group_1__2 ;
    public final void rule__Activity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1068:1: ( rule__Activity__Group_1__1__Impl rule__Activity__Group_1__2 )
            // InternalStatemachine.g:1069:2: rule__Activity__Group_1__1__Impl rule__Activity__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Activity__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__1"


    // $ANTLR start "rule__Activity__Group_1__1__Impl"
    // InternalStatemachine.g:1076:1: rule__Activity__Group_1__1__Impl : ( ( rule__Activity__ConditionAssignment_1_1 ) ) ;
    public final void rule__Activity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1080:1: ( ( ( rule__Activity__ConditionAssignment_1_1 ) ) )
            // InternalStatemachine.g:1081:1: ( ( rule__Activity__ConditionAssignment_1_1 ) )
            {
            // InternalStatemachine.g:1081:1: ( ( rule__Activity__ConditionAssignment_1_1 ) )
            // InternalStatemachine.g:1082:2: ( rule__Activity__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getActivityAccess().getConditionAssignment_1_1()); 
            // InternalStatemachine.g:1083:2: ( rule__Activity__ConditionAssignment_1_1 )
            // InternalStatemachine.g:1083:3: rule__Activity__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity__ConditionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getConditionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_1__2"
    // InternalStatemachine.g:1091:1: rule__Activity__Group_1__2 : rule__Activity__Group_1__2__Impl ;
    public final void rule__Activity__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1095:1: ( rule__Activity__Group_1__2__Impl )
            // InternalStatemachine.g:1096:2: rule__Activity__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__2"


    // $ANTLR start "rule__Activity__Group_1__2__Impl"
    // InternalStatemachine.g:1102:1: rule__Activity__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Activity__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1106:1: ( ( ']' ) )
            // InternalStatemachine.g:1107:1: ( ']' )
            {
            // InternalStatemachine.g:1107:1: ( ']' )
            // InternalStatemachine.g:1108:2: ']'
            {
             before(grammarAccess.getActivityAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_2__0"
    // InternalStatemachine.g:1118:1: rule__Activity__Group_2__0 : rule__Activity__Group_2__0__Impl rule__Activity__Group_2__1 ;
    public final void rule__Activity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1122:1: ( rule__Activity__Group_2__0__Impl rule__Activity__Group_2__1 )
            // InternalStatemachine.g:1123:2: rule__Activity__Group_2__0__Impl rule__Activity__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Activity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_2__0"


    // $ANTLR start "rule__Activity__Group_2__0__Impl"
    // InternalStatemachine.g:1130:1: rule__Activity__Group_2__0__Impl : ( '/' ) ;
    public final void rule__Activity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1134:1: ( ( '/' ) )
            // InternalStatemachine.g:1135:1: ( '/' )
            {
            // InternalStatemachine.g:1135:1: ( '/' )
            // InternalStatemachine.g:1136:2: '/'
            {
             before(grammarAccess.getActivityAccess().getSolidusKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_2__0__Impl"


    // $ANTLR start "rule__Activity__Group_2__1"
    // InternalStatemachine.g:1145:1: rule__Activity__Group_2__1 : rule__Activity__Group_2__1__Impl ;
    public final void rule__Activity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1149:1: ( rule__Activity__Group_2__1__Impl )
            // InternalStatemachine.g:1150:2: rule__Activity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_2__1"


    // $ANTLR start "rule__Activity__Group_2__1__Impl"
    // InternalStatemachine.g:1156:1: rule__Activity__Group_2__1__Impl : ( ( rule__Activity__ActionAssignment_2_1 ) ) ;
    public final void rule__Activity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1160:1: ( ( ( rule__Activity__ActionAssignment_2_1 ) ) )
            // InternalStatemachine.g:1161:1: ( ( rule__Activity__ActionAssignment_2_1 ) )
            {
            // InternalStatemachine.g:1161:1: ( ( rule__Activity__ActionAssignment_2_1 ) )
            // InternalStatemachine.g:1162:2: ( rule__Activity__ActionAssignment_2_1 )
            {
             before(grammarAccess.getActivityAccess().getActionAssignment_2_1()); 
            // InternalStatemachine.g:1163:2: ( rule__Activity__ActionAssignment_2_1 )
            // InternalStatemachine.g:1163:3: rule__Activity__ActionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity__ActionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getActionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_2__1__Impl"


    // $ANTLR start "rule__StateMachine__NameAssignment_2"
    // InternalStatemachine.g:1172:1: rule__StateMachine__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StateMachine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1176:1: ( ( RULE_ID ) )
            // InternalStatemachine.g:1177:2: ( RULE_ID )
            {
            // InternalStatemachine.g:1177:2: ( RULE_ID )
            // InternalStatemachine.g:1178:3: RULE_ID
            {
             before(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NameAssignment_2"


    // $ANTLR start "rule__StateMachine__StatesAssignment_3_1"
    // InternalStatemachine.g:1187:1: rule__StateMachine__StatesAssignment_3_1 : ( ruleAbstractState ) ;
    public final void rule__StateMachine__StatesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1191:1: ( ( ruleAbstractState ) )
            // InternalStatemachine.g:1192:2: ( ruleAbstractState )
            {
            // InternalStatemachine.g:1192:2: ( ruleAbstractState )
            // InternalStatemachine.g:1193:3: ruleAbstractState
            {
             before(grammarAccess.getStateMachineAccess().getStatesAbstractStateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStatesAbstractStateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StatesAssignment_3_1"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_3_2"
    // InternalStatemachine.g:1202:1: rule__StateMachine__TransitionsAssignment_3_2 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1206:1: ( ( ruleTransition ) )
            // InternalStatemachine.g:1207:2: ( ruleTransition )
            {
            // InternalStatemachine.g:1207:2: ( ruleTransition )
            // InternalStatemachine.g:1208:3: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_3_2"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalStatemachine.g:1217:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1221:1: ( ( RULE_ID ) )
            // InternalStatemachine.g:1222:2: ( RULE_ID )
            {
            // InternalStatemachine.g:1222:2: ( RULE_ID )
            // InternalStatemachine.g:1223:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__ActivitiesAssignment_2_1"
    // InternalStatemachine.g:1232:1: rule__State__ActivitiesAssignment_2_1 : ( ruleActivity ) ;
    public final void rule__State__ActivitiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1236:1: ( ( ruleActivity ) )
            // InternalStatemachine.g:1237:2: ( ruleActivity )
            {
            // InternalStatemachine.g:1237:2: ( ruleActivity )
            // InternalStatemachine.g:1238:3: ruleActivity
            {
             before(grammarAccess.getStateAccess().getActivitiesActivityParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActivitiesActivityParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActivitiesAssignment_2_1"


    // $ANTLR start "rule__State__StatesAssignment_2_2"
    // InternalStatemachine.g:1247:1: rule__State__StatesAssignment_2_2 : ( ruleAbstractState ) ;
    public final void rule__State__StatesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1251:1: ( ( ruleAbstractState ) )
            // InternalStatemachine.g:1252:2: ( ruleAbstractState )
            {
            // InternalStatemachine.g:1252:2: ( ruleAbstractState )
            // InternalStatemachine.g:1253:3: ruleAbstractState
            {
             before(grammarAccess.getStateAccess().getStatesAbstractStateParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractState();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStatesAbstractStateParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__StatesAssignment_2_2"


    // $ANTLR start "rule__State__TransitionsAssignment_2_3"
    // InternalStatemachine.g:1262:1: rule__State__TransitionsAssignment_2_3 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1266:1: ( ( ruleTransition ) )
            // InternalStatemachine.g:1267:2: ( ruleTransition )
            {
            // InternalStatemachine.g:1267:2: ( ruleTransition )
            // InternalStatemachine.g:1268:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionsAssignment_2_3"


    // $ANTLR start "rule__InitialState__NameAssignment_1"
    // InternalStatemachine.g:1277:1: rule__InitialState__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialState__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1281:1: ( ( RULE_ID ) )
            // InternalStatemachine.g:1282:2: ( RULE_ID )
            {
            // InternalStatemachine.g:1282:2: ( RULE_ID )
            // InternalStatemachine.g:1283:3: RULE_ID
            {
             before(grammarAccess.getInitialStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__NameAssignment_1"


    // $ANTLR start "rule__FinalState__NameAssignment_1"
    // InternalStatemachine.g:1292:1: rule__FinalState__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FinalState__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1296:1: ( ( RULE_ID ) )
            // InternalStatemachine.g:1297:2: ( RULE_ID )
            {
            // InternalStatemachine.g:1297:2: ( RULE_ID )
            // InternalStatemachine.g:1298:3: RULE_ID
            {
             before(grammarAccess.getFinalStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFinalStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalState__NameAssignment_1"


    // $ANTLR start "rule__Transition__StartAssignment_0"
    // InternalStatemachine.g:1307:1: rule__Transition__StartAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1311:1: ( ( ( RULE_ID ) ) )
            // InternalStatemachine.g:1312:2: ( ( RULE_ID ) )
            {
            // InternalStatemachine.g:1312:2: ( ( RULE_ID ) )
            // InternalStatemachine.g:1313:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStartAbstractStateCrossReference_0_0()); 
            // InternalStatemachine.g:1314:3: ( RULE_ID )
            // InternalStatemachine.g:1315:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStartAbstractStateIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getStartAbstractStateIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getStartAbstractStateCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__StartAssignment_0"


    // $ANTLR start "rule__Transition__EndAssignment_2"
    // InternalStatemachine.g:1326:1: rule__Transition__EndAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1330:1: ( ( ( RULE_ID ) ) )
            // InternalStatemachine.g:1331:2: ( ( RULE_ID ) )
            {
            // InternalStatemachine.g:1331:2: ( ( RULE_ID ) )
            // InternalStatemachine.g:1332:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEndAbstractStateCrossReference_2_0()); 
            // InternalStatemachine.g:1333:3: ( RULE_ID )
            // InternalStatemachine.g:1334:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getEndAbstractStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getEndAbstractStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getEndAbstractStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EndAssignment_2"


    // $ANTLR start "rule__Transition__ActivityAssignment_3_1"
    // InternalStatemachine.g:1345:1: rule__Transition__ActivityAssignment_3_1 : ( ruleActivity ) ;
    public final void rule__Transition__ActivityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1349:1: ( ( ruleActivity ) )
            // InternalStatemachine.g:1350:2: ( ruleActivity )
            {
            // InternalStatemachine.g:1350:2: ( ruleActivity )
            // InternalStatemachine.g:1351:3: ruleActivity
            {
             before(grammarAccess.getTransitionAccess().getActivityActivityParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getActivityActivityParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActivityAssignment_3_1"


    // $ANTLR start "rule__Activity__TriggerAssignment_0"
    // InternalStatemachine.g:1360:1: rule__Activity__TriggerAssignment_0 : ( RULE_ID ) ;
    public final void rule__Activity__TriggerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1364:1: ( ( RULE_ID ) )
            // InternalStatemachine.g:1365:2: ( RULE_ID )
            {
            // InternalStatemachine.g:1365:2: ( RULE_ID )
            // InternalStatemachine.g:1366:3: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getTriggerIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getTriggerIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__TriggerAssignment_0"


    // $ANTLR start "rule__Activity__ConditionAssignment_1_1"
    // InternalStatemachine.g:1375:1: rule__Activity__ConditionAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Activity__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1379:1: ( ( RULE_STRING ) )
            // InternalStatemachine.g:1380:2: ( RULE_STRING )
            {
            // InternalStatemachine.g:1380:2: ( RULE_STRING )
            // InternalStatemachine.g:1381:3: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getConditionSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getConditionSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ConditionAssignment_1_1"


    // $ANTLR start "rule__Activity__ActionAssignment_2_1"
    // InternalStatemachine.g:1390:1: rule__Activity__ActionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Activity__ActionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStatemachine.g:1394:1: ( ( RULE_STRING ) )
            // InternalStatemachine.g:1395:2: ( RULE_STRING )
            {
            // InternalStatemachine.g:1395:2: ( RULE_STRING )
            // InternalStatemachine.g:1396:3: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getActionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getActionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ActionAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});

}