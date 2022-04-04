package org.xtext.example.hal.ide.contentassist.antlr.internal;

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
import org.xtext.example.hal.services.HalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'='", "'>'", "'>='", "'<'", "'<='", "'!='", "'AND'", "'OR'", "'password'", "'address'", "'types'", "'{'", "'}'", "'sensors'", "','", "'actuators'", "'rooms'", "'rules'", "'sensorEntries'", "'.'", "'('", "'x'", "')'", "'WHEN'", "'THEN'", "'reading'", "'timestamp'", "'is'", "'type'", "'at'", "'-'", "'runs'", "'active'", "'NOT'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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


        public InternalHalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHal.g"; }


    	private HalGrammarAccess grammarAccess;

    	public void setGrammarAccess(HalGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleHAL"
    // InternalHal.g:53:1: entryRuleHAL : ruleHAL EOF ;
    public final void entryRuleHAL() throws RecognitionException {
        try {
            // InternalHal.g:54:1: ( ruleHAL EOF )
            // InternalHal.g:55:1: ruleHAL EOF
            {
             before(grammarAccess.getHALRule()); 
            pushFollow(FOLLOW_1);
            ruleHAL();

            state._fsp--;

             after(grammarAccess.getHALRule()); 
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
    // $ANTLR end "entryRuleHAL"


    // $ANTLR start "ruleHAL"
    // InternalHal.g:62:1: ruleHAL : ( ( rule__HAL__Group__0 ) ) ;
    public final void ruleHAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:66:2: ( ( ( rule__HAL__Group__0 ) ) )
            // InternalHal.g:67:2: ( ( rule__HAL__Group__0 ) )
            {
            // InternalHal.g:67:2: ( ( rule__HAL__Group__0 ) )
            // InternalHal.g:68:3: ( rule__HAL__Group__0 )
            {
             before(grammarAccess.getHALAccess().getGroup()); 
            // InternalHal.g:69:3: ( rule__HAL__Group__0 )
            // InternalHal.g:69:4: rule__HAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHALAccess().getGroup()); 

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
    // $ANTLR end "ruleHAL"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalHal.g:78:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalHal.g:79:1: ( ruleBooleanExpression EOF )
            // InternalHal.g:80:1: ruleBooleanExpression EOF
            {
             before(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionRule()); 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalHal.g:87:1: ruleBooleanExpression : ( ( rule__BooleanExpression__Alternatives ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:91:2: ( ( ( rule__BooleanExpression__Alternatives ) ) )
            // InternalHal.g:92:2: ( ( rule__BooleanExpression__Alternatives ) )
            {
            // InternalHal.g:92:2: ( ( rule__BooleanExpression__Alternatives ) )
            // InternalHal.g:93:3: ( rule__BooleanExpression__Alternatives )
            {
             before(grammarAccess.getBooleanExpressionAccess().getAlternatives()); 
            // InternalHal.g:94:3: ( rule__BooleanExpression__Alternatives )
            // InternalHal.g:94:4: rule__BooleanExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalHal.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalHal.g:104:1: ( ruleQualifiedName EOF )
            // InternalHal.g:105:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalHal.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalHal.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalHal.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalHal.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalHal.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalHal.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRoom"
    // InternalHal.g:128:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalHal.g:129:1: ( ruleRoom EOF )
            // InternalHal.g:130:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalHal.g:137:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:141:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalHal.g:142:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalHal.g:142:2: ( ( rule__Room__Group__0 ) )
            // InternalHal.g:143:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalHal.g:144:3: ( rule__Room__Group__0 )
            // InternalHal.g:144:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleAutomationRule"
    // InternalHal.g:153:1: entryRuleAutomationRule : ruleAutomationRule EOF ;
    public final void entryRuleAutomationRule() throws RecognitionException {
        try {
            // InternalHal.g:154:1: ( ruleAutomationRule EOF )
            // InternalHal.g:155:1: ruleAutomationRule EOF
            {
             before(grammarAccess.getAutomationRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleAutomationRule();

            state._fsp--;

             after(grammarAccess.getAutomationRuleRule()); 
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
    // $ANTLR end "entryRuleAutomationRule"


    // $ANTLR start "ruleAutomationRule"
    // InternalHal.g:162:1: ruleAutomationRule : ( ( rule__AutomationRule__Group__0 ) ) ;
    public final void ruleAutomationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:166:2: ( ( ( rule__AutomationRule__Group__0 ) ) )
            // InternalHal.g:167:2: ( ( rule__AutomationRule__Group__0 ) )
            {
            // InternalHal.g:167:2: ( ( rule__AutomationRule__Group__0 ) )
            // InternalHal.g:168:3: ( rule__AutomationRule__Group__0 )
            {
             before(grammarAccess.getAutomationRuleAccess().getGroup()); 
            // InternalHal.g:169:3: ( rule__AutomationRule__Group__0 )
            // InternalHal.g:169:4: rule__AutomationRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutomationRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleAutomationRule"


    // $ANTLR start "entryRuleSensorEntry"
    // InternalHal.g:178:1: entryRuleSensorEntry : ruleSensorEntry EOF ;
    public final void entryRuleSensorEntry() throws RecognitionException {
        try {
            // InternalHal.g:179:1: ( ruleSensorEntry EOF )
            // InternalHal.g:180:1: ruleSensorEntry EOF
            {
             before(grammarAccess.getSensorEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorEntry();

            state._fsp--;

             after(grammarAccess.getSensorEntryRule()); 
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
    // $ANTLR end "entryRuleSensorEntry"


    // $ANTLR start "ruleSensorEntry"
    // InternalHal.g:187:1: ruleSensorEntry : ( ( rule__SensorEntry__Group__0 ) ) ;
    public final void ruleSensorEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:191:2: ( ( ( rule__SensorEntry__Group__0 ) ) )
            // InternalHal.g:192:2: ( ( rule__SensorEntry__Group__0 ) )
            {
            // InternalHal.g:192:2: ( ( rule__SensorEntry__Group__0 ) )
            // InternalHal.g:193:3: ( rule__SensorEntry__Group__0 )
            {
             before(grammarAccess.getSensorEntryAccess().getGroup()); 
            // InternalHal.g:194:3: ( rule__SensorEntry__Group__0 )
            // InternalHal.g:194:4: rule__SensorEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorEntryAccess().getGroup()); 

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
    // $ANTLR end "ruleSensorEntry"


    // $ANTLR start "entryRuleDevice"
    // InternalHal.g:203:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalHal.g:204:1: ( ruleDevice EOF )
            // InternalHal.g:205:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalHal.g:212:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:216:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalHal.g:217:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalHal.g:217:2: ( ( rule__Device__Group__0 ) )
            // InternalHal.g:218:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalHal.g:219:3: ( rule__Device__Group__0 )
            // InternalHal.g:219:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroup()); 

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRulePosFloat"
    // InternalHal.g:228:1: entryRulePosFloat : rulePosFloat EOF ;
    public final void entryRulePosFloat() throws RecognitionException {
        try {
            // InternalHal.g:229:1: ( rulePosFloat EOF )
            // InternalHal.g:230:1: rulePosFloat EOF
            {
             before(grammarAccess.getPosFloatRule()); 
            pushFollow(FOLLOW_1);
            rulePosFloat();

            state._fsp--;

             after(grammarAccess.getPosFloatRule()); 
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
    // $ANTLR end "entryRulePosFloat"


    // $ANTLR start "rulePosFloat"
    // InternalHal.g:237:1: rulePosFloat : ( ( rule__PosFloat__Group__0 ) ) ;
    public final void rulePosFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:241:2: ( ( ( rule__PosFloat__Group__0 ) ) )
            // InternalHal.g:242:2: ( ( rule__PosFloat__Group__0 ) )
            {
            // InternalHal.g:242:2: ( ( rule__PosFloat__Group__0 ) )
            // InternalHal.g:243:3: ( rule__PosFloat__Group__0 )
            {
             before(grammarAccess.getPosFloatAccess().getGroup()); 
            // InternalHal.g:244:3: ( rule__PosFloat__Group__0 )
            // InternalHal.g:244:4: rule__PosFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PosFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPosFloatAccess().getGroup()); 

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
    // $ANTLR end "rulePosFloat"


    // $ANTLR start "entryRuleAction"
    // InternalHal.g:253:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalHal.g:254:1: ( ruleAction EOF )
            // InternalHal.g:255:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalHal.g:262:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:266:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalHal.g:267:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalHal.g:267:2: ( ( rule__Action__Group__0 ) )
            // InternalHal.g:268:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalHal.g:269:3: ( rule__Action__Group__0 )
            // InternalHal.g:269:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAtomicRelationalTerm"
    // InternalHal.g:278:1: entryRuleAtomicRelationalTerm : ruleAtomicRelationalTerm EOF ;
    public final void entryRuleAtomicRelationalTerm() throws RecognitionException {
        try {
            // InternalHal.g:279:1: ( ruleAtomicRelationalTerm EOF )
            // InternalHal.g:280:1: ruleAtomicRelationalTerm EOF
            {
             before(grammarAccess.getAtomicRelationalTermRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicRelationalTerm();

            state._fsp--;

             after(grammarAccess.getAtomicRelationalTermRule()); 
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
    // $ANTLR end "entryRuleAtomicRelationalTerm"


    // $ANTLR start "ruleAtomicRelationalTerm"
    // InternalHal.g:287:1: ruleAtomicRelationalTerm : ( ( rule__AtomicRelationalTerm__Group__0 ) ) ;
    public final void ruleAtomicRelationalTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:291:2: ( ( ( rule__AtomicRelationalTerm__Group__0 ) ) )
            // InternalHal.g:292:2: ( ( rule__AtomicRelationalTerm__Group__0 ) )
            {
            // InternalHal.g:292:2: ( ( rule__AtomicRelationalTerm__Group__0 ) )
            // InternalHal.g:293:3: ( rule__AtomicRelationalTerm__Group__0 )
            {
             before(grammarAccess.getAtomicRelationalTermAccess().getGroup()); 
            // InternalHal.g:294:3: ( rule__AtomicRelationalTerm__Group__0 )
            // InternalHal.g:294:4: rule__AtomicRelationalTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtomicRelationalTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicRelationalTermAccess().getGroup()); 

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
    // $ANTLR end "ruleAtomicRelationalTerm"


    // $ANTLR start "entryRuleCompoundRelationalTerm"
    // InternalHal.g:303:1: entryRuleCompoundRelationalTerm : ruleCompoundRelationalTerm EOF ;
    public final void entryRuleCompoundRelationalTerm() throws RecognitionException {
        try {
            // InternalHal.g:304:1: ( ruleCompoundRelationalTerm EOF )
            // InternalHal.g:305:1: ruleCompoundRelationalTerm EOF
            {
             before(grammarAccess.getCompoundRelationalTermRule()); 
            pushFollow(FOLLOW_1);
            ruleCompoundRelationalTerm();

            state._fsp--;

             after(grammarAccess.getCompoundRelationalTermRule()); 
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
    // $ANTLR end "entryRuleCompoundRelationalTerm"


    // $ANTLR start "ruleCompoundRelationalTerm"
    // InternalHal.g:312:1: ruleCompoundRelationalTerm : ( ( rule__CompoundRelationalTerm__Group__0 ) ) ;
    public final void ruleCompoundRelationalTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:316:2: ( ( ( rule__CompoundRelationalTerm__Group__0 ) ) )
            // InternalHal.g:317:2: ( ( rule__CompoundRelationalTerm__Group__0 ) )
            {
            // InternalHal.g:317:2: ( ( rule__CompoundRelationalTerm__Group__0 ) )
            // InternalHal.g:318:3: ( rule__CompoundRelationalTerm__Group__0 )
            {
             before(grammarAccess.getCompoundRelationalTermAccess().getGroup()); 
            // InternalHal.g:319:3: ( rule__CompoundRelationalTerm__Group__0 )
            // InternalHal.g:319:4: rule__CompoundRelationalTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompoundRelationalTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompoundRelationalTermAccess().getGroup()); 

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
    // $ANTLR end "ruleCompoundRelationalTerm"


    // $ANTLR start "entryRuleCommand"
    // InternalHal.g:328:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalHal.g:329:1: ( ruleCommand EOF )
            // InternalHal.g:330:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalHal.g:337:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:341:2: ( ( ( rule__Command__Group__0 ) ) )
            // InternalHal.g:342:2: ( ( rule__Command__Group__0 ) )
            {
            // InternalHal.g:342:2: ( ( rule__Command__Group__0 ) )
            // InternalHal.g:343:3: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // InternalHal.g:344:3: ( rule__Command__Group__0 )
            // InternalHal.g:344:4: rule__Command__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleSensor"
    // InternalHal.g:353:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalHal.g:354:1: ( ruleSensor EOF )
            // InternalHal.g:355:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalHal.g:362:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:366:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalHal.g:367:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalHal.g:367:2: ( ( rule__Sensor__Group__0 ) )
            // InternalHal.g:368:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalHal.g:369:3: ( rule__Sensor__Group__0 )
            // InternalHal.g:369:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalHal.g:378:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalHal.g:379:1: ( ruleActuator EOF )
            // InternalHal.g:380:1: ruleActuator EOF
            {
             before(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getActuatorRule()); 
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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalHal.g:387:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:391:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalHal.g:392:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalHal.g:392:2: ( ( rule__Actuator__Group__0 ) )
            // InternalHal.g:393:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalHal.g:394:3: ( rule__Actuator__Group__0 )
            // InternalHal.g:394:4: rule__Actuator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getGroup()); 

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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleELong"
    // InternalHal.g:403:1: entryRuleELong : ruleELong EOF ;
    public final void entryRuleELong() throws RecognitionException {
        try {
            // InternalHal.g:404:1: ( ruleELong EOF )
            // InternalHal.g:405:1: ruleELong EOF
            {
             before(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getELongRule()); 
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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalHal.g:412:1: ruleELong : ( RULE_INT ) ;
    public final void ruleELong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:416:2: ( ( RULE_INT ) )
            // InternalHal.g:417:2: ( RULE_INT )
            {
            // InternalHal.g:417:2: ( RULE_INT )
            // InternalHal.g:418:3: RULE_INT
            {
             before(grammarAccess.getELongAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getELongAccess().getINTTerminalRuleCall()); 

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "ruleComparisonOperator"
    // InternalHal.g:428:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:432:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalHal.g:433:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalHal.g:433:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalHal.g:434:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalHal.g:435:3: ( rule__ComparisonOperator__Alternatives )
            // InternalHal.g:435:4: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleBooleanOperator"
    // InternalHal.g:444:1: ruleBooleanOperator : ( ( rule__BooleanOperator__Alternatives ) ) ;
    public final void ruleBooleanOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:448:1: ( ( ( rule__BooleanOperator__Alternatives ) ) )
            // InternalHal.g:449:2: ( ( rule__BooleanOperator__Alternatives ) )
            {
            // InternalHal.g:449:2: ( ( rule__BooleanOperator__Alternatives ) )
            // InternalHal.g:450:3: ( rule__BooleanOperator__Alternatives )
            {
             before(grammarAccess.getBooleanOperatorAccess().getAlternatives()); 
            // InternalHal.g:451:3: ( rule__BooleanOperator__Alternatives )
            // InternalHal.g:451:4: rule__BooleanOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBooleanOperator"


    // $ANTLR start "rule__BooleanExpression__Alternatives"
    // InternalHal.g:459:1: rule__BooleanExpression__Alternatives : ( ( ruleAtomicRelationalTerm ) | ( ruleCompoundRelationalTerm ) );
    public final void rule__BooleanExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:463:1: ( ( ruleAtomicRelationalTerm ) | ( ruleCompoundRelationalTerm ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==33) ) {
                    alt1=2;
                }
                else if ( ((LA1_1>=RULE_STRING && LA1_1<=RULE_ID)) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 33:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalHal.g:464:2: ( ruleAtomicRelationalTerm )
                    {
                    // InternalHal.g:464:2: ( ruleAtomicRelationalTerm )
                    // InternalHal.g:465:3: ruleAtomicRelationalTerm
                    {
                     before(grammarAccess.getBooleanExpressionAccess().getAtomicRelationalTermParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomicRelationalTerm();

                    state._fsp--;

                     after(grammarAccess.getBooleanExpressionAccess().getAtomicRelationalTermParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHal.g:470:2: ( ruleCompoundRelationalTerm )
                    {
                    // InternalHal.g:470:2: ( ruleCompoundRelationalTerm )
                    // InternalHal.g:471:3: ruleCompoundRelationalTerm
                    {
                     before(grammarAccess.getBooleanExpressionAccess().getCompoundRelationalTermParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompoundRelationalTerm();

                    state._fsp--;

                     after(grammarAccess.getBooleanExpressionAccess().getCompoundRelationalTermParserRuleCall_1()); 

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
    // $ANTLR end "rule__BooleanExpression__Alternatives"


    // $ANTLR start "rule__QualifiedName__Alternatives_0"
    // InternalHal.g:480:1: rule__QualifiedName__Alternatives_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__QualifiedName__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:484:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHal.g:485:2: ( RULE_STRING )
                    {
                    // InternalHal.g:485:2: ( RULE_STRING )
                    // InternalHal.g:486:3: RULE_STRING
                    {
                     before(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHal.g:491:2: ( RULE_ID )
                    {
                    // InternalHal.g:491:2: ( RULE_ID )
                    // InternalHal.g:492:3: RULE_ID
                    {
                     before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__QualifiedName__Alternatives_0"


    // $ANTLR start "rule__QualifiedName__Alternatives_1_1"
    // InternalHal.g:501:1: rule__QualifiedName__Alternatives_1_1 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__QualifiedName__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:505:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHal.g:506:2: ( RULE_STRING )
                    {
                    // InternalHal.g:506:2: ( RULE_STRING )
                    // InternalHal.g:507:3: RULE_STRING
                    {
                     before(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHal.g:512:2: ( RULE_ID )
                    {
                    // InternalHal.g:512:2: ( RULE_ID )
                    // InternalHal.g:513:3: RULE_ID
                    {
                     before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Alternatives_1_1"


    // $ANTLR start "rule__PosFloat__Alternatives_1_2_0"
    // InternalHal.g:522:1: rule__PosFloat__Alternatives_1_2_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__PosFloat__Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:526:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalHal.g:527:2: ( 'E' )
                    {
                    // InternalHal.g:527:2: ( 'E' )
                    // InternalHal.g:528:3: 'E'
                    {
                     before(grammarAccess.getPosFloatAccess().getEKeyword_1_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPosFloatAccess().getEKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHal.g:533:2: ( 'e' )
                    {
                    // InternalHal.g:533:2: ( 'e' )
                    // InternalHal.g:534:3: 'e'
                    {
                     before(grammarAccess.getPosFloatAccess().getEKeyword_1_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPosFloatAccess().getEKeyword_1_2_0_1()); 

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
    // $ANTLR end "rule__PosFloat__Alternatives_1_2_0"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // InternalHal.g:543:1: rule__ComparisonOperator__Alternatives : ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '!=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:547:1: ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '!=' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            case 18:
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
                    // InternalHal.g:548:2: ( ( '=' ) )
                    {
                    // InternalHal.g:548:2: ( ( '=' ) )
                    // InternalHal.g:549:3: ( '=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalHal.g:550:3: ( '=' )
                    // InternalHal.g:550:4: '='
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHal.g:554:2: ( ( '>' ) )
                    {
                    // InternalHal.g:554:2: ( ( '>' ) )
                    // InternalHal.g:555:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATERTHANEnumLiteralDeclaration_1()); 
                    // InternalHal.g:556:3: ( '>' )
                    // InternalHal.g:556:4: '>'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATERTHANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHal.g:560:2: ( ( '>=' ) )
                    {
                    // InternalHal.g:560:2: ( ( '>=' ) )
                    // InternalHal.g:561:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATERTHANOREQUALEnumLiteralDeclaration_2()); 
                    // InternalHal.g:562:3: ( '>=' )
                    // InternalHal.g:562:4: '>='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATERTHANOREQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHal.g:566:2: ( ( '<' ) )
                    {
                    // InternalHal.g:566:2: ( ( '<' ) )
                    // InternalHal.g:567:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESSTHANEnumLiteralDeclaration_3()); 
                    // InternalHal.g:568:3: ( '<' )
                    // InternalHal.g:568:4: '<'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESSTHANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHal.g:572:2: ( ( '<=' ) )
                    {
                    // InternalHal.g:572:2: ( ( '<=' ) )
                    // InternalHal.g:573:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLESSTHANOREQUALEnumLiteralDeclaration_4()); 
                    // InternalHal.g:574:3: ( '<=' )
                    // InternalHal.g:574:4: '<='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLESSTHANOREQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHal.g:578:2: ( ( '!=' ) )
                    {
                    // InternalHal.g:578:2: ( ( '!=' ) )
                    // InternalHal.g:579:3: ( '!=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNOTEQUALEnumLiteralDeclaration_5()); 
                    // InternalHal.g:580:3: ( '!=' )
                    // InternalHal.g:580:4: '!='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNOTEQUALEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__BooleanOperator__Alternatives"
    // InternalHal.g:588:1: rule__BooleanOperator__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BooleanOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:592:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalHal.g:593:2: ( ( 'AND' ) )
                    {
                    // InternalHal.g:593:2: ( ( 'AND' ) )
                    // InternalHal.g:594:3: ( 'AND' )
                    {
                     before(grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalHal.g:595:3: ( 'AND' )
                    // InternalHal.g:595:4: 'AND'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHal.g:599:2: ( ( 'OR' ) )
                    {
                    // InternalHal.g:599:2: ( ( 'OR' ) )
                    // InternalHal.g:600:3: ( 'OR' )
                    {
                     before(grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalHal.g:601:3: ( 'OR' )
                    // InternalHal.g:601:4: 'OR'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BooleanOperator__Alternatives"


    // $ANTLR start "rule__HAL__Group__0"
    // InternalHal.g:609:1: rule__HAL__Group__0 : rule__HAL__Group__0__Impl rule__HAL__Group__1 ;
    public final void rule__HAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:613:1: ( rule__HAL__Group__0__Impl rule__HAL__Group__1 )
            // InternalHal.g:614:2: rule__HAL__Group__0__Impl rule__HAL__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__HAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group__1();

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
    // $ANTLR end "rule__HAL__Group__0"


    // $ANTLR start "rule__HAL__Group__0__Impl"
    // InternalHal.g:621:1: rule__HAL__Group__0__Impl : ( 'password' ) ;
    public final void rule__HAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:625:1: ( ( 'password' ) )
            // InternalHal.g:626:1: ( 'password' )
            {
            // InternalHal.g:626:1: ( 'password' )
            // InternalHal.g:627:2: 'password'
            {
             before(grammarAccess.getHALAccess().getPasswordKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getPasswordKeyword_0()); 

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
    // $ANTLR end "rule__HAL__Group__0__Impl"


    // $ANTLR start "rule__HAL__Group__1"
    // InternalHal.g:636:1: rule__HAL__Group__1 : rule__HAL__Group__1__Impl rule__HAL__Group__2 ;
    public final void rule__HAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:640:1: ( rule__HAL__Group__1__Impl rule__HAL__Group__2 )
            // InternalHal.g:641:2: rule__HAL__Group__1__Impl rule__HAL__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__HAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group__2();

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
    // $ANTLR end "rule__HAL__Group__1"


    // $ANTLR start "rule__HAL__Group__1__Impl"
    // InternalHal.g:648:1: rule__HAL__Group__1__Impl : ( ( rule__HAL__PasswordAssignment_1 ) ) ;
    public final void rule__HAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:652:1: ( ( ( rule__HAL__PasswordAssignment_1 ) ) )
            // InternalHal.g:653:1: ( ( rule__HAL__PasswordAssignment_1 ) )
            {
            // InternalHal.g:653:1: ( ( rule__HAL__PasswordAssignment_1 ) )
            // InternalHal.g:654:2: ( rule__HAL__PasswordAssignment_1 )
            {
             before(grammarAccess.getHALAccess().getPasswordAssignment_1()); 
            // InternalHal.g:655:2: ( rule__HAL__PasswordAssignment_1 )
            // InternalHal.g:655:3: rule__HAL__PasswordAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HAL__PasswordAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHALAccess().getPasswordAssignment_1()); 

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
    // $ANTLR end "rule__HAL__Group__1__Impl"


    // $ANTLR start "rule__HAL__Group__2"
    // InternalHal.g:663:1: rule__HAL__Group__2 : rule__HAL__Group__2__Impl rule__HAL__Group__3 ;
    public final void rule__HAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:667:1: ( rule__HAL__Group__2__Impl rule__HAL__Group__3 )
            // InternalHal.g:668:2: rule__HAL__Group__2__Impl rule__HAL__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__HAL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group__3();

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
    // $ANTLR end "rule__HAL__Group__2"


    // $ANTLR start "rule__HAL__Group__2__Impl"
    // InternalHal.g:675:1: rule__HAL__Group__2__Impl : ( 'address' ) ;
    public final void rule__HAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:679:1: ( ( 'address' ) )
            // InternalHal.g:680:1: ( 'address' )
            {
            // InternalHal.g:680:1: ( 'address' )
            // InternalHal.g:681:2: 'address'
            {
             before(grammarAccess.getHALAccess().getAddressKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getAddressKeyword_2()); 

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
    // $ANTLR end "rule__HAL__Group__2__Impl"


    // $ANTLR start "rule__HAL__Group__3"
    // InternalHal.g:690:1: rule__HAL__Group__3 : rule__HAL__Group__3__Impl rule__HAL__Group__4 ;
    public final void rule__HAL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:694:1: ( rule__HAL__Group__3__Impl rule__HAL__Group__4 )
            // InternalHal.g:695:2: rule__HAL__Group__3__Impl rule__HAL__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__HAL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group__4();

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
    // $ANTLR end "rule__HAL__Group__3"


    // $ANTLR start "rule__HAL__Group__3__Impl"
    // InternalHal.g:702:1: rule__HAL__Group__3__Impl : ( ( rule__HAL__AddressAssignment_3 ) ) ;
    public final void rule__HAL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:706:1: ( ( ( rule__HAL__AddressAssignment_3 ) ) )
            // InternalHal.g:707:1: ( ( rule__HAL__AddressAssignment_3 ) )
            {
            // InternalHal.g:707:1: ( ( rule__HAL__AddressAssignment_3 ) )
            // InternalHal.g:708:2: ( rule__HAL__AddressAssignment_3 )
            {
             before(grammarAccess.getHALAccess().getAddressAssignment_3()); 
            // InternalHal.g:709:2: ( rule__HAL__AddressAssignment_3 )
            // InternalHal.g:709:3: rule__HAL__AddressAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__HAL__AddressAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHALAccess().getAddressAssignment_3()); 

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
    // $ANTLR end "rule__HAL__Group__3__Impl"


    // $ANTLR start "rule__HAL__Group__4"
    // InternalHal.g:717:1: rule__HAL__Group__4 : rule__HAL__Group__4__Impl rule__HAL__Group__5 ;
    public final void rule__HAL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:721:1: ( rule__HAL__Group__4__Impl rule__HAL__Group__5 )
            // InternalHal.g:722:2: rule__HAL__Group__4__Impl rule__HAL__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__HAL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group__5();

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
    // $ANTLR end "rule__HAL__Group__4"


    // $ANTLR start "rule__HAL__Group__4__Impl"
    // InternalHal.g:729:1: rule__HAL__Group__4__Impl : ( ( rule__HAL__Group_4__0 )? ) ;
    public final void rule__HAL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:733:1: ( ( ( rule__HAL__Group_4__0 )? ) )
            // InternalHal.g:734:1: ( ( rule__HAL__Group_4__0 )? )
            {
            // InternalHal.g:734:1: ( ( rule__HAL__Group_4__0 )? )
            // InternalHal.g:735:2: ( rule__HAL__Group_4__0 )?
            {
             before(grammarAccess.getHALAccess().getGroup_4()); 
            // InternalHal.g:736:2: ( rule__HAL__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalHal.g:736:3: rule__HAL__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HAL__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHALAccess().getGroup_4()); 

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
    // $ANTLR end "rule__HAL__Group__4__Impl"


    // $ANTLR start "rule__HAL__Group__5"
    // InternalHal.g:744:1: rule__HAL__Group__5 : rule__HAL__Group__5__Impl rule__HAL__Group__6 ;
    public final void rule__HAL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:748:1: ( rule__HAL__Group__5__Impl rule__HAL__Group__6 )
            // InternalHal.g:749:2: rule__HAL__Group__5__Impl rule__HAL__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__HAL__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group__6();

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
    // $ANTLR end "rule__HAL__Group__5"


    // $ANTLR start "rule__HAL__Group__5__Impl"
    // InternalHal.g:756:1: rule__HAL__Group__5__Impl : ( ( rule__HAL__Group_5__0 )? ) ;
    public final void rule__HAL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:760:1: ( ( ( rule__HAL__Group_5__0 )? ) )
            // InternalHal.g:761:1: ( ( rule__HAL__Group_5__0 )? )
            {
            // InternalHal.g:761:1: ( ( rule__HAL__Group_5__0 )? )
            // InternalHal.g:762:2: ( rule__HAL__Group_5__0 )?
            {
             before(grammarAccess.getHALAccess().getGroup_5()); 
            // InternalHal.g:763:2: ( rule__HAL__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHal.g:763:3: rule__HAL__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HAL__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHALAccess().getGroup_5()); 

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
    // $ANTLR end "rule__HAL__Group__5__Impl"


    // $ANTLR start "rule__HAL__Group__6"
    // InternalHal.g:771:1: rule__HAL__Group__6 : rule__HAL__Group__6__Impl rule__HAL__Group__7 ;
    public final void rule__HAL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:775:1: ( rule__HAL__Group__6__Impl rule__HAL__Group__7 )
            // InternalHal.g:776:2: rule__HAL__Group__6__Impl rule__HAL__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__HAL__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group__7();

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
    // $ANTLR end "rule__HAL__Group__6"


    // $ANTLR start "rule__HAL__Group__6__Impl"
    // InternalHal.g:783:1: rule__HAL__Group__6__Impl : ( ( rule__HAL__Group_6__0 )? ) ;
    public final void rule__HAL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:787:1: ( ( ( rule__HAL__Group_6__0 )? ) )
            // InternalHal.g:788:1: ( ( rule__HAL__Group_6__0 )? )
            {
            // InternalHal.g:788:1: ( ( rule__HAL__Group_6__0 )? )
            // InternalHal.g:789:2: ( rule__HAL__Group_6__0 )?
            {
             before(grammarAccess.getHALAccess().getGroup_6()); 
            // InternalHal.g:790:2: ( rule__HAL__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalHal.g:790:3: rule__HAL__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HAL__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHALAccess().getGroup_6()); 

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
    // $ANTLR end "rule__HAL__Group__6__Impl"


    // $ANTLR start "rule__HAL__Group__7"
    // InternalHal.g:798:1: rule__HAL__Group__7 : rule__HAL__Group__7__Impl ;
    public final void rule__HAL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:802:1: ( rule__HAL__Group__7__Impl )
            // InternalHal.g:803:2: rule__HAL__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HAL__Group__7__Impl();

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
    // $ANTLR end "rule__HAL__Group__7"


    // $ANTLR start "rule__HAL__Group__7__Impl"
    // InternalHal.g:809:1: rule__HAL__Group__7__Impl : ( ( rule__HAL__Group_7__0 )? ) ;
    public final void rule__HAL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:813:1: ( ( ( rule__HAL__Group_7__0 )? ) )
            // InternalHal.g:814:1: ( ( rule__HAL__Group_7__0 )? )
            {
            // InternalHal.g:814:1: ( ( rule__HAL__Group_7__0 )? )
            // InternalHal.g:815:2: ( rule__HAL__Group_7__0 )?
            {
             before(grammarAccess.getHALAccess().getGroup_7()); 
            // InternalHal.g:816:2: ( rule__HAL__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalHal.g:816:3: rule__HAL__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HAL__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHALAccess().getGroup_7()); 

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
    // $ANTLR end "rule__HAL__Group__7__Impl"


    // $ANTLR start "rule__HAL__Group_4__0"
    // InternalHal.g:825:1: rule__HAL__Group_4__0 : rule__HAL__Group_4__0__Impl rule__HAL__Group_4__1 ;
    public final void rule__HAL__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:829:1: ( rule__HAL__Group_4__0__Impl rule__HAL__Group_4__1 )
            // InternalHal.g:830:2: rule__HAL__Group_4__0__Impl rule__HAL__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__HAL__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_4__1();

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
    // $ANTLR end "rule__HAL__Group_4__0"


    // $ANTLR start "rule__HAL__Group_4__0__Impl"
    // InternalHal.g:837:1: rule__HAL__Group_4__0__Impl : ( 'types' ) ;
    public final void rule__HAL__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:841:1: ( ( 'types' ) )
            // InternalHal.g:842:1: ( 'types' )
            {
            // InternalHal.g:842:1: ( 'types' )
            // InternalHal.g:843:2: 'types'
            {
             before(grammarAccess.getHALAccess().getTypesKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getTypesKeyword_4_0()); 

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
    // $ANTLR end "rule__HAL__Group_4__0__Impl"


    // $ANTLR start "rule__HAL__Group_4__1"
    // InternalHal.g:852:1: rule__HAL__Group_4__1 : rule__HAL__Group_4__1__Impl rule__HAL__Group_4__2 ;
    public final void rule__HAL__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:856:1: ( rule__HAL__Group_4__1__Impl rule__HAL__Group_4__2 )
            // InternalHal.g:857:2: rule__HAL__Group_4__1__Impl rule__HAL__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__HAL__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_4__2();

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
    // $ANTLR end "rule__HAL__Group_4__1"


    // $ANTLR start "rule__HAL__Group_4__1__Impl"
    // InternalHal.g:864:1: rule__HAL__Group_4__1__Impl : ( '{' ) ;
    public final void rule__HAL__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:868:1: ( ( '{' ) )
            // InternalHal.g:869:1: ( '{' )
            {
            // InternalHal.g:869:1: ( '{' )
            // InternalHal.g:870:2: '{'
            {
             before(grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__HAL__Group_4__1__Impl"


    // $ANTLR start "rule__HAL__Group_4__2"
    // InternalHal.g:879:1: rule__HAL__Group_4__2 : rule__HAL__Group_4__2__Impl rule__HAL__Group_4__3 ;
    public final void rule__HAL__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:883:1: ( rule__HAL__Group_4__2__Impl rule__HAL__Group_4__3 )
            // InternalHal.g:884:2: rule__HAL__Group_4__2__Impl rule__HAL__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__HAL__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_4__3();

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
    // $ANTLR end "rule__HAL__Group_4__2"


    // $ANTLR start "rule__HAL__Group_4__2__Impl"
    // InternalHal.g:891:1: rule__HAL__Group_4__2__Impl : ( ( rule__HAL__Group_4_2__0 )? ) ;
    public final void rule__HAL__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:895:1: ( ( ( rule__HAL__Group_4_2__0 )? ) )
            // InternalHal.g:896:1: ( ( rule__HAL__Group_4_2__0 )? )
            {
            // InternalHal.g:896:1: ( ( rule__HAL__Group_4_2__0 )? )
            // InternalHal.g:897:2: ( rule__HAL__Group_4_2__0 )?
            {
             before(grammarAccess.getHALAccess().getGroup_4_2()); 
            // InternalHal.g:898:2: ( rule__HAL__Group_4_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalHal.g:898:3: rule__HAL__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HAL__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHALAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__HAL__Group_4__2__Impl"


    // $ANTLR start "rule__HAL__Group_4__3"
    // InternalHal.g:906:1: rule__HAL__Group_4__3 : rule__HAL__Group_4__3__Impl rule__HAL__Group_4__4 ;
    public final void rule__HAL__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:910:1: ( rule__HAL__Group_4__3__Impl rule__HAL__Group_4__4 )
            // InternalHal.g:911:2: rule__HAL__Group_4__3__Impl rule__HAL__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__HAL__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_4__4();

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
    // $ANTLR end "rule__HAL__Group_4__3"


    // $ANTLR start "rule__HAL__Group_4__3__Impl"
    // InternalHal.g:918:1: rule__HAL__Group_4__3__Impl : ( ( rule__HAL__Group_4_3__0 )? ) ;
    public final void rule__HAL__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:922:1: ( ( ( rule__HAL__Group_4_3__0 )? ) )
            // InternalHal.g:923:1: ( ( rule__HAL__Group_4_3__0 )? )
            {
            // InternalHal.g:923:1: ( ( rule__HAL__Group_4_3__0 )? )
            // InternalHal.g:924:2: ( rule__HAL__Group_4_3__0 )?
            {
             before(grammarAccess.getHALAccess().getGroup_4_3()); 
            // InternalHal.g:925:2: ( rule__HAL__Group_4_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHal.g:925:3: rule__HAL__Group_4_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HAL__Group_4_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHALAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__HAL__Group_4__3__Impl"


    // $ANTLR start "rule__HAL__Group_4__4"
    // InternalHal.g:933:1: rule__HAL__Group_4__4 : rule__HAL__Group_4__4__Impl ;
    public final void rule__HAL__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:937:1: ( rule__HAL__Group_4__4__Impl )
            // InternalHal.g:938:2: rule__HAL__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HAL__Group_4__4__Impl();

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
    // $ANTLR end "rule__HAL__Group_4__4"


    // $ANTLR start "rule__HAL__Group_4__4__Impl"
    // InternalHal.g:944:1: rule__HAL__Group_4__4__Impl : ( '}' ) ;
    public final void rule__HAL__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:948:1: ( ( '}' ) )
            // InternalHal.g:949:1: ( '}' )
            {
            // InternalHal.g:949:1: ( '}' )
            // InternalHal.g:950:2: '}'
            {
             before(grammarAccess.getHALAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__HAL__Group_4__4__Impl"


    // $ANTLR start "rule__HAL__Group_4_2__0"
    // InternalHal.g:960:1: rule__HAL__Group_4_2__0 : rule__HAL__Group_4_2__0__Impl rule__HAL__Group_4_2__1 ;
    public final void rule__HAL__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:964:1: ( rule__HAL__Group_4_2__0__Impl rule__HAL__Group_4_2__1 )
            // InternalHal.g:965:2: rule__HAL__Group_4_2__0__Impl rule__HAL__Group_4_2__1
            {
            pushFollow(FOLLOW_6);
            rule__HAL__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_4_2__1();

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
    // $ANTLR end "rule__HAL__Group_4_2__0"


    // $ANTLR start "rule__HAL__Group_4_2__0__Impl"
    // InternalHal.g:972:1: rule__HAL__Group_4_2__0__Impl : ( 'sensors' ) ;
    public final void rule__HAL__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:976:1: ( ( 'sensors' ) )
            // InternalHal.g:977:1: ( 'sensors' )
            {
            // InternalHal.g:977:1: ( 'sensors' )
            // InternalHal.g:978:2: 'sensors'
            {
             before(grammarAccess.getHALAccess().getSensorsKeyword_4_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getSensorsKeyword_4_2_0()); 

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
    // $ANTLR end "rule__HAL__Group_4_2__0__Impl"


    // $ANTLR start "rule__HAL__Group_4_2__1"
    // InternalHal.g:987:1: rule__HAL__Group_4_2__1 : rule__HAL__Group_4_2__1__Impl rule__HAL__Group_4_2__2 ;
    public final void rule__HAL__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:991:1: ( rule__HAL__Group_4_2__1__Impl rule__HAL__Group_4_2__2 )
            // InternalHal.g:992:2: rule__HAL__Group_4_2__1__Impl rule__HAL__Group_4_2__2
            {
            pushFollow(FOLLOW_8);
            rule__HAL__Group_4_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_4_2__2();

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
    // $ANTLR end "rule__HAL__Group_4_2__1"


    // $ANTLR start "rule__HAL__Group_4_2__1__Impl"
    // InternalHal.g:999:1: rule__HAL__Group_4_2__1__Impl : ( '{' ) ;
    public final void rule__HAL__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1003:1: ( ( '{' ) )
            // InternalHal.g:1004:1: ( '{' )
            {
            // InternalHal.g:1004:1: ( '{' )
            // InternalHal.g:1005:2: '{'
            {
             before(grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_4_2_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_4_2_1()); 

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
    // $ANTLR end "rule__HAL__Group_4_2__1__Impl"


    // $ANTLR start "rule__HAL__Group_4_2__2"
    // InternalHal.g:1014:1: rule__HAL__Group_4_2__2 : rule__HAL__Group_4_2__2__Impl rule__HAL__Group_4_2__3 ;
    public final void rule__HAL__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1018:1: ( rule__HAL__Group_4_2__2__Impl rule__HAL__Group_4_2__3 )
            // InternalHal.g:1019:2: rule__HAL__Group_4_2__2__Impl rule__HAL__Group_4_2__3
            {
            pushFollow(FOLLOW_9);
            rule__HAL__Group_4_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_4_2__3();

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
    // $ANTLR end "rule__HAL__Group_4_2__2"


    // $ANTLR start "rule__HAL__Group_4_2__2__Impl"
    // InternalHal.g:1026:1: rule__HAL__Group_4_2__2__Impl : ( ( rule__HAL__TypesAssignment_4_2_2 ) ) ;
    public final void rule__HAL__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1030:1: ( ( ( rule__HAL__TypesAssignment_4_2_2 ) ) )
            // InternalHal.g:1031:1: ( ( rule__HAL__TypesAssignment_4_2_2 ) )
            {
            // InternalHal.g:1031:1: ( ( rule__HAL__TypesAssignment_4_2_2 ) )
            // InternalHal.g:1032:2: ( rule__HAL__TypesAssignment_4_2_2 )
            {
             before(grammarAccess.getHALAccess().getTypesAssignment_4_2_2()); 
            // InternalHal.g:1033:2: ( rule__HAL__TypesAssignment_4_2_2 )
            // InternalHal.g:1033:3: rule__HAL__TypesAssignment_4_2_2
            {
            pushFollow(FOLLOW_2);
            rule__HAL__TypesAssignment_4_2_2();

            state._fsp--;


            }

             after(grammarAccess.getHALAccess().getTypesAssignment_4_2_2()); 

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
    // $ANTLR end "rule__HAL__Group_4_2__2__Impl"


    // $ANTLR start "rule__HAL__Group_4_2__3"
    // InternalHal.g:1041:1: rule__HAL__Group_4_2__3 : rule__HAL__Group_4_2__3__Impl rule__HAL__Group_4_2__4 ;
    public final void rule__HAL__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1045:1: ( rule__HAL__Group_4_2__3__Impl rule__HAL__Group_4_2__4 )
            // InternalHal.g:1046:2: rule__HAL__Group_4_2__3__Impl rule__HAL__Group_4_2__4
            {
            pushFollow(FOLLOW_9);
            rule__HAL__Group_4_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_4_2__4();

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
    // $ANTLR end "rule__HAL__Group_4_2__3"


    // $ANTLR start "rule__HAL__Group_4_2__3__Impl"
    // InternalHal.g:1053:1: rule__HAL__Group_4_2__3__Impl : ( ( rule__HAL__Group_4_2_3__0 )* ) ;
    public final void rule__HAL__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1057:1: ( ( ( rule__HAL__Group_4_2_3__0 )* ) )
            // InternalHal.g:1058:1: ( ( rule__HAL__Group_4_2_3__0 )* )
            {
            // InternalHal.g:1058:1: ( ( rule__HAL__Group_4_2_3__0 )* )
            // InternalHal.g:1059:2: ( rule__HAL__Group_4_2_3__0 )*
            {
             before(grammarAccess.getHALAccess().getGroup_4_2_3()); 
            // InternalHal.g:1060:2: ( rule__HAL__Group_4_2_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHal.g:1060:3: rule__HAL__Group_4_2_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__HAL__Group_4_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getHALAccess().getGroup_4_2_3()); 

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
    // $ANTLR end "rule__HAL__Group_4_2__3__Impl"


    // $ANTLR start "rule__HAL__Group_4_2__4"
    // InternalHal.g:1068:1: rule__HAL__Group_4_2__4 : rule__HAL__Group_4_2__4__Impl ;
    public final void rule__HAL__Group_4_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1072:1: ( rule__HAL__Group_4_2__4__Impl )
            // InternalHal.g:1073:2: rule__HAL__Group_4_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HAL__Group_4_2__4__Impl();

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
    // $ANTLR end "rule__HAL__Group_4_2__4"


    // $ANTLR start "rule__HAL__Group_4_2__4__Impl"
    // InternalHal.g:1079:1: rule__HAL__Group_4_2__4__Impl : ( '}' ) ;
    public final void rule__HAL__Group_4_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1083:1: ( ( '}' ) )
            // InternalHal.g:1084:1: ( '}' )
            {
            // InternalHal.g:1084:1: ( '}' )
            // InternalHal.g:1085:2: '}'
            {
             before(grammarAccess.getHALAccess().getRightCurlyBracketKeyword_4_2_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getRightCurlyBracketKeyword_4_2_4()); 

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
    // $ANTLR end "rule__HAL__Group_4_2__4__Impl"


    // $ANTLR start "rule__HAL__Group_4_2_3__0"
    // InternalHal.g:1095:1: rule__HAL__Group_4_2_3__0 : rule__HAL__Group_4_2_3__0__Impl rule__HAL__Group_4_2_3__1 ;
    public final void rule__HAL__Group_4_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1099:1: ( rule__HAL__Group_4_2_3__0__Impl rule__HAL__Group_4_2_3__1 )
            // InternalHal.g:1100:2: rule__HAL__Group_4_2_3__0__Impl rule__HAL__Group_4_2_3__1
            {
            pushFollow(FOLLOW_8);
            rule__HAL__Group_4_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_4_2_3__1();

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
    // $ANTLR end "rule__HAL__Group_4_2_3__0"


    // $ANTLR start "rule__HAL__Group_4_2_3__0__Impl"
    // InternalHal.g:1107:1: rule__HAL__Group_4_2_3__0__Impl : ( ',' ) ;
    public final void rule__HAL__Group_4_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1111:1: ( ( ',' ) )
            // InternalHal.g:1112:1: ( ',' )
            {
            // InternalHal.g:1112:1: ( ',' )
            // InternalHal.g:1113:2: ','
            {
             before(grammarAccess.getHALAccess().getCommaKeyword_4_2_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getCommaKeyword_4_2_3_0()); 

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
    // $ANTLR end "rule__HAL__Group_4_2_3__0__Impl"


    // $ANTLR start "rule__HAL__Group_4_2_3__1"
    // InternalHal.g:1122:1: rule__HAL__Group_4_2_3__1 : rule__HAL__Group_4_2_3__1__Impl ;
    public final void rule__HAL__Group_4_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1126:1: ( rule__HAL__Group_4_2_3__1__Impl )
            // InternalHal.g:1127:2: rule__HAL__Group_4_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HAL__Group_4_2_3__1__Impl();

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
    // $ANTLR end "rule__HAL__Group_4_2_3__1"


    // $ANTLR start "rule__HAL__Group_4_2_3__1__Impl"
    // InternalHal.g:1133:1: rule__HAL__Group_4_2_3__1__Impl : ( ( rule__HAL__TypesAssignment_4_2_3_1 ) ) ;
    public final void rule__HAL__Group_4_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1137:1: ( ( ( rule__HAL__TypesAssignment_4_2_3_1 ) ) )
            // InternalHal.g:1138:1: ( ( rule__HAL__TypesAssignment_4_2_3_1 ) )
            {
            // InternalHal.g:1138:1: ( ( rule__HAL__TypesAssignment_4_2_3_1 ) )
            // InternalHal.g:1139:2: ( rule__HAL__TypesAssignment_4_2_3_1 )
            {
             before(grammarAccess.getHALAccess().getTypesAssignment_4_2_3_1()); 
            // InternalHal.g:1140:2: ( rule__HAL__TypesAssignment_4_2_3_1 )
            // InternalHal.g:1140:3: rule__HAL__TypesAssignment_4_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__HAL__TypesAssignment_4_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHALAccess().getTypesAssignment_4_2_3_1()); 

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
    // $ANTLR end "rule__HAL__Group_4_2_3__1__Impl"


    // $ANTLR start "rule__HAL__Group_4_3__0"
    // InternalHal.g:1149:1: rule__HAL__Group_4_3__0 : rule__HAL__Group_4_3__0__Impl rule__HAL__Group_4_3__1 ;
    public final void rule__HAL__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1153:1: ( rule__HAL__Group_4_3__0__Impl rule__HAL__Group_4_3__1 )
            // InternalHal.g:1154:2: rule__HAL__Group_4_3__0__Impl rule__HAL__Group_4_3__1
            {
            pushFollow(FOLLOW_6);
            rule__HAL__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_4_3__1();

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
    // $ANTLR end "rule__HAL__Group_4_3__0"


    // $ANTLR start "rule__HAL__Group_4_3__0__Impl"
    // InternalHal.g:1161:1: rule__HAL__Group_4_3__0__Impl : ( 'actuators' ) ;
    public final void rule__HAL__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1165:1: ( ( 'actuators' ) )
            // InternalHal.g:1166:1: ( 'actuators' )
            {
            // InternalHal.g:1166:1: ( 'actuators' )
            // InternalHal.g:1167:2: 'actuators'
            {
             before(grammarAccess.getHALAccess().getActuatorsKeyword_4_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getActuatorsKeyword_4_3_0()); 

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
    // $ANTLR end "rule__HAL__Group_4_3__0__Impl"


    // $ANTLR start "rule__HAL__Group_4_3__1"
    // InternalHal.g:1176:1: rule__HAL__Group_4_3__1 : rule__HAL__Group_4_3__1__Impl rule__HAL__Group_4_3__2 ;
    public final void rule__HAL__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1180:1: ( rule__HAL__Group_4_3__1__Impl rule__HAL__Group_4_3__2 )
            // InternalHal.g:1181:2: rule__HAL__Group_4_3__1__Impl rule__HAL__Group_4_3__2
            {
            pushFollow(FOLLOW_11);
            rule__HAL__Group_4_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_4_3__2();

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
    // $ANTLR end "rule__HAL__Group_4_3__1"


    // $ANTLR start "rule__HAL__Group_4_3__1__Impl"
    // InternalHal.g:1188:1: rule__HAL__Group_4_3__1__Impl : ( '{' ) ;
    public final void rule__HAL__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1192:1: ( ( '{' ) )
            // InternalHal.g:1193:1: ( '{' )
            {
            // InternalHal.g:1193:1: ( '{' )
            // InternalHal.g:1194:2: '{'
            {
             before(grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_4_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_4_3_1()); 

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
    // $ANTLR end "rule__HAL__Group_4_3__1__Impl"


    // $ANTLR start "rule__HAL__Group_4_3__2"
    // InternalHal.g:1203:1: rule__HAL__Group_4_3__2 : rule__HAL__Group_4_3__2__Impl rule__HAL__Group_4_3__3 ;
    public final void rule__HAL__Group_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1207:1: ( rule__HAL__Group_4_3__2__Impl rule__HAL__Group_4_3__3 )
            // InternalHal.g:1208:2: rule__HAL__Group_4_3__2__Impl rule__HAL__Group_4_3__3
            {
            pushFollow(FOLLOW_11);
            rule__HAL__Group_4_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_4_3__3();

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
    // $ANTLR end "rule__HAL__Group_4_3__2"


    // $ANTLR start "rule__HAL__Group_4_3__2__Impl"
    // InternalHal.g:1215:1: rule__HAL__Group_4_3__2__Impl : ( ( rule__HAL__TypesAssignment_4_3_2 )* ) ;
    public final void rule__HAL__Group_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1219:1: ( ( ( rule__HAL__TypesAssignment_4_3_2 )* ) )
            // InternalHal.g:1220:1: ( ( rule__HAL__TypesAssignment_4_3_2 )* )
            {
            // InternalHal.g:1220:1: ( ( rule__HAL__TypesAssignment_4_3_2 )* )
            // InternalHal.g:1221:2: ( rule__HAL__TypesAssignment_4_3_2 )*
            {
             before(grammarAccess.getHALAccess().getTypesAssignment_4_3_2()); 
            // InternalHal.g:1222:2: ( rule__HAL__TypesAssignment_4_3_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHal.g:1222:3: rule__HAL__TypesAssignment_4_3_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__HAL__TypesAssignment_4_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getHALAccess().getTypesAssignment_4_3_2()); 

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
    // $ANTLR end "rule__HAL__Group_4_3__2__Impl"


    // $ANTLR start "rule__HAL__Group_4_3__3"
    // InternalHal.g:1230:1: rule__HAL__Group_4_3__3 : rule__HAL__Group_4_3__3__Impl ;
    public final void rule__HAL__Group_4_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1234:1: ( rule__HAL__Group_4_3__3__Impl )
            // InternalHal.g:1235:2: rule__HAL__Group_4_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HAL__Group_4_3__3__Impl();

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
    // $ANTLR end "rule__HAL__Group_4_3__3"


    // $ANTLR start "rule__HAL__Group_4_3__3__Impl"
    // InternalHal.g:1241:1: rule__HAL__Group_4_3__3__Impl : ( '}' ) ;
    public final void rule__HAL__Group_4_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1245:1: ( ( '}' ) )
            // InternalHal.g:1246:1: ( '}' )
            {
            // InternalHal.g:1246:1: ( '}' )
            // InternalHal.g:1247:2: '}'
            {
             before(grammarAccess.getHALAccess().getRightCurlyBracketKeyword_4_3_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getRightCurlyBracketKeyword_4_3_3()); 

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
    // $ANTLR end "rule__HAL__Group_4_3__3__Impl"


    // $ANTLR start "rule__HAL__Group_5__0"
    // InternalHal.g:1257:1: rule__HAL__Group_5__0 : rule__HAL__Group_5__0__Impl rule__HAL__Group_5__1 ;
    public final void rule__HAL__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1261:1: ( rule__HAL__Group_5__0__Impl rule__HAL__Group_5__1 )
            // InternalHal.g:1262:2: rule__HAL__Group_5__0__Impl rule__HAL__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__HAL__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_5__1();

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
    // $ANTLR end "rule__HAL__Group_5__0"


    // $ANTLR start "rule__HAL__Group_5__0__Impl"
    // InternalHal.g:1269:1: rule__HAL__Group_5__0__Impl : ( 'rooms' ) ;
    public final void rule__HAL__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1273:1: ( ( 'rooms' ) )
            // InternalHal.g:1274:1: ( 'rooms' )
            {
            // InternalHal.g:1274:1: ( 'rooms' )
            // InternalHal.g:1275:2: 'rooms'
            {
             before(grammarAccess.getHALAccess().getRoomsKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getRoomsKeyword_5_0()); 

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
    // $ANTLR end "rule__HAL__Group_5__0__Impl"


    // $ANTLR start "rule__HAL__Group_5__1"
    // InternalHal.g:1284:1: rule__HAL__Group_5__1 : rule__HAL__Group_5__1__Impl rule__HAL__Group_5__2 ;
    public final void rule__HAL__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1288:1: ( rule__HAL__Group_5__1__Impl rule__HAL__Group_5__2 )
            // InternalHal.g:1289:2: rule__HAL__Group_5__1__Impl rule__HAL__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__HAL__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_5__2();

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
    // $ANTLR end "rule__HAL__Group_5__1"


    // $ANTLR start "rule__HAL__Group_5__1__Impl"
    // InternalHal.g:1296:1: rule__HAL__Group_5__1__Impl : ( '{' ) ;
    public final void rule__HAL__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1300:1: ( ( '{' ) )
            // InternalHal.g:1301:1: ( '{' )
            {
            // InternalHal.g:1301:1: ( '{' )
            // InternalHal.g:1302:2: '{'
            {
             before(grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__HAL__Group_5__1__Impl"


    // $ANTLR start "rule__HAL__Group_5__2"
    // InternalHal.g:1311:1: rule__HAL__Group_5__2 : rule__HAL__Group_5__2__Impl rule__HAL__Group_5__3 ;
    public final void rule__HAL__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1315:1: ( rule__HAL__Group_5__2__Impl rule__HAL__Group_5__3 )
            // InternalHal.g:1316:2: rule__HAL__Group_5__2__Impl rule__HAL__Group_5__3
            {
            pushFollow(FOLLOW_11);
            rule__HAL__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_5__3();

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
    // $ANTLR end "rule__HAL__Group_5__2"


    // $ANTLR start "rule__HAL__Group_5__2__Impl"
    // InternalHal.g:1323:1: rule__HAL__Group_5__2__Impl : ( ( rule__HAL__RoomsAssignment_5_2 )* ) ;
    public final void rule__HAL__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1327:1: ( ( ( rule__HAL__RoomsAssignment_5_2 )* ) )
            // InternalHal.g:1328:1: ( ( rule__HAL__RoomsAssignment_5_2 )* )
            {
            // InternalHal.g:1328:1: ( ( rule__HAL__RoomsAssignment_5_2 )* )
            // InternalHal.g:1329:2: ( rule__HAL__RoomsAssignment_5_2 )*
            {
             before(grammarAccess.getHALAccess().getRoomsAssignment_5_2()); 
            // InternalHal.g:1330:2: ( rule__HAL__RoomsAssignment_5_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHal.g:1330:3: rule__HAL__RoomsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__HAL__RoomsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getHALAccess().getRoomsAssignment_5_2()); 

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
    // $ANTLR end "rule__HAL__Group_5__2__Impl"


    // $ANTLR start "rule__HAL__Group_5__3"
    // InternalHal.g:1338:1: rule__HAL__Group_5__3 : rule__HAL__Group_5__3__Impl ;
    public final void rule__HAL__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1342:1: ( rule__HAL__Group_5__3__Impl )
            // InternalHal.g:1343:2: rule__HAL__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HAL__Group_5__3__Impl();

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
    // $ANTLR end "rule__HAL__Group_5__3"


    // $ANTLR start "rule__HAL__Group_5__3__Impl"
    // InternalHal.g:1349:1: rule__HAL__Group_5__3__Impl : ( '}' ) ;
    public final void rule__HAL__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1353:1: ( ( '}' ) )
            // InternalHal.g:1354:1: ( '}' )
            {
            // InternalHal.g:1354:1: ( '}' )
            // InternalHal.g:1355:2: '}'
            {
             before(grammarAccess.getHALAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getRightCurlyBracketKeyword_5_3()); 

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
    // $ANTLR end "rule__HAL__Group_5__3__Impl"


    // $ANTLR start "rule__HAL__Group_6__0"
    // InternalHal.g:1365:1: rule__HAL__Group_6__0 : rule__HAL__Group_6__0__Impl rule__HAL__Group_6__1 ;
    public final void rule__HAL__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1369:1: ( rule__HAL__Group_6__0__Impl rule__HAL__Group_6__1 )
            // InternalHal.g:1370:2: rule__HAL__Group_6__0__Impl rule__HAL__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__HAL__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_6__1();

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
    // $ANTLR end "rule__HAL__Group_6__0"


    // $ANTLR start "rule__HAL__Group_6__0__Impl"
    // InternalHal.g:1377:1: rule__HAL__Group_6__0__Impl : ( 'rules' ) ;
    public final void rule__HAL__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1381:1: ( ( 'rules' ) )
            // InternalHal.g:1382:1: ( 'rules' )
            {
            // InternalHal.g:1382:1: ( 'rules' )
            // InternalHal.g:1383:2: 'rules'
            {
             before(grammarAccess.getHALAccess().getRulesKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getRulesKeyword_6_0()); 

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
    // $ANTLR end "rule__HAL__Group_6__0__Impl"


    // $ANTLR start "rule__HAL__Group_6__1"
    // InternalHal.g:1392:1: rule__HAL__Group_6__1 : rule__HAL__Group_6__1__Impl rule__HAL__Group_6__2 ;
    public final void rule__HAL__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1396:1: ( rule__HAL__Group_6__1__Impl rule__HAL__Group_6__2 )
            // InternalHal.g:1397:2: rule__HAL__Group_6__1__Impl rule__HAL__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__HAL__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_6__2();

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
    // $ANTLR end "rule__HAL__Group_6__1"


    // $ANTLR start "rule__HAL__Group_6__1__Impl"
    // InternalHal.g:1404:1: rule__HAL__Group_6__1__Impl : ( '{' ) ;
    public final void rule__HAL__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1408:1: ( ( '{' ) )
            // InternalHal.g:1409:1: ( '{' )
            {
            // InternalHal.g:1409:1: ( '{' )
            // InternalHal.g:1410:2: '{'
            {
             before(grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__HAL__Group_6__1__Impl"


    // $ANTLR start "rule__HAL__Group_6__2"
    // InternalHal.g:1419:1: rule__HAL__Group_6__2 : rule__HAL__Group_6__2__Impl rule__HAL__Group_6__3 ;
    public final void rule__HAL__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1423:1: ( rule__HAL__Group_6__2__Impl rule__HAL__Group_6__3 )
            // InternalHal.g:1424:2: rule__HAL__Group_6__2__Impl rule__HAL__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__HAL__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_6__3();

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
    // $ANTLR end "rule__HAL__Group_6__2"


    // $ANTLR start "rule__HAL__Group_6__2__Impl"
    // InternalHal.g:1431:1: rule__HAL__Group_6__2__Impl : ( ( rule__HAL__RulesAssignment_6_2 )* ) ;
    public final void rule__HAL__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1435:1: ( ( ( rule__HAL__RulesAssignment_6_2 )* ) )
            // InternalHal.g:1436:1: ( ( rule__HAL__RulesAssignment_6_2 )* )
            {
            // InternalHal.g:1436:1: ( ( rule__HAL__RulesAssignment_6_2 )* )
            // InternalHal.g:1437:2: ( rule__HAL__RulesAssignment_6_2 )*
            {
             before(grammarAccess.getHALAccess().getRulesAssignment_6_2()); 
            // InternalHal.g:1438:2: ( rule__HAL__RulesAssignment_6_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHal.g:1438:3: rule__HAL__RulesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__HAL__RulesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getHALAccess().getRulesAssignment_6_2()); 

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
    // $ANTLR end "rule__HAL__Group_6__2__Impl"


    // $ANTLR start "rule__HAL__Group_6__3"
    // InternalHal.g:1446:1: rule__HAL__Group_6__3 : rule__HAL__Group_6__3__Impl ;
    public final void rule__HAL__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1450:1: ( rule__HAL__Group_6__3__Impl )
            // InternalHal.g:1451:2: rule__HAL__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HAL__Group_6__3__Impl();

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
    // $ANTLR end "rule__HAL__Group_6__3"


    // $ANTLR start "rule__HAL__Group_6__3__Impl"
    // InternalHal.g:1457:1: rule__HAL__Group_6__3__Impl : ( '}' ) ;
    public final void rule__HAL__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1461:1: ( ( '}' ) )
            // InternalHal.g:1462:1: ( '}' )
            {
            // InternalHal.g:1462:1: ( '}' )
            // InternalHal.g:1463:2: '}'
            {
             before(grammarAccess.getHALAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getRightCurlyBracketKeyword_6_3()); 

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
    // $ANTLR end "rule__HAL__Group_6__3__Impl"


    // $ANTLR start "rule__HAL__Group_7__0"
    // InternalHal.g:1473:1: rule__HAL__Group_7__0 : rule__HAL__Group_7__0__Impl rule__HAL__Group_7__1 ;
    public final void rule__HAL__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1477:1: ( rule__HAL__Group_7__0__Impl rule__HAL__Group_7__1 )
            // InternalHal.g:1478:2: rule__HAL__Group_7__0__Impl rule__HAL__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__HAL__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_7__1();

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
    // $ANTLR end "rule__HAL__Group_7__0"


    // $ANTLR start "rule__HAL__Group_7__0__Impl"
    // InternalHal.g:1485:1: rule__HAL__Group_7__0__Impl : ( 'sensorEntries' ) ;
    public final void rule__HAL__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1489:1: ( ( 'sensorEntries' ) )
            // InternalHal.g:1490:1: ( 'sensorEntries' )
            {
            // InternalHal.g:1490:1: ( 'sensorEntries' )
            // InternalHal.g:1491:2: 'sensorEntries'
            {
             before(grammarAccess.getHALAccess().getSensorEntriesKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getSensorEntriesKeyword_7_0()); 

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
    // $ANTLR end "rule__HAL__Group_7__0__Impl"


    // $ANTLR start "rule__HAL__Group_7__1"
    // InternalHal.g:1500:1: rule__HAL__Group_7__1 : rule__HAL__Group_7__1__Impl rule__HAL__Group_7__2 ;
    public final void rule__HAL__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1504:1: ( rule__HAL__Group_7__1__Impl rule__HAL__Group_7__2 )
            // InternalHal.g:1505:2: rule__HAL__Group_7__1__Impl rule__HAL__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__HAL__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_7__2();

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
    // $ANTLR end "rule__HAL__Group_7__1"


    // $ANTLR start "rule__HAL__Group_7__1__Impl"
    // InternalHal.g:1512:1: rule__HAL__Group_7__1__Impl : ( '{' ) ;
    public final void rule__HAL__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1516:1: ( ( '{' ) )
            // InternalHal.g:1517:1: ( '{' )
            {
            // InternalHal.g:1517:1: ( '{' )
            // InternalHal.g:1518:2: '{'
            {
             before(grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__HAL__Group_7__1__Impl"


    // $ANTLR start "rule__HAL__Group_7__2"
    // InternalHal.g:1527:1: rule__HAL__Group_7__2 : rule__HAL__Group_7__2__Impl rule__HAL__Group_7__3 ;
    public final void rule__HAL__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1531:1: ( rule__HAL__Group_7__2__Impl rule__HAL__Group_7__3 )
            // InternalHal.g:1532:2: rule__HAL__Group_7__2__Impl rule__HAL__Group_7__3
            {
            pushFollow(FOLLOW_11);
            rule__HAL__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HAL__Group_7__3();

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
    // $ANTLR end "rule__HAL__Group_7__2"


    // $ANTLR start "rule__HAL__Group_7__2__Impl"
    // InternalHal.g:1539:1: rule__HAL__Group_7__2__Impl : ( ( rule__HAL__EntriesAssignment_7_2 )* ) ;
    public final void rule__HAL__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1543:1: ( ( ( rule__HAL__EntriesAssignment_7_2 )* ) )
            // InternalHal.g:1544:1: ( ( rule__HAL__EntriesAssignment_7_2 )* )
            {
            // InternalHal.g:1544:1: ( ( rule__HAL__EntriesAssignment_7_2 )* )
            // InternalHal.g:1545:2: ( rule__HAL__EntriesAssignment_7_2 )*
            {
             before(grammarAccess.getHALAccess().getEntriesAssignment_7_2()); 
            // InternalHal.g:1546:2: ( rule__HAL__EntriesAssignment_7_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHal.g:1546:3: rule__HAL__EntriesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__HAL__EntriesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getHALAccess().getEntriesAssignment_7_2()); 

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
    // $ANTLR end "rule__HAL__Group_7__2__Impl"


    // $ANTLR start "rule__HAL__Group_7__3"
    // InternalHal.g:1554:1: rule__HAL__Group_7__3 : rule__HAL__Group_7__3__Impl ;
    public final void rule__HAL__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1558:1: ( rule__HAL__Group_7__3__Impl )
            // InternalHal.g:1559:2: rule__HAL__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HAL__Group_7__3__Impl();

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
    // $ANTLR end "rule__HAL__Group_7__3"


    // $ANTLR start "rule__HAL__Group_7__3__Impl"
    // InternalHal.g:1565:1: rule__HAL__Group_7__3__Impl : ( '}' ) ;
    public final void rule__HAL__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1569:1: ( ( '}' ) )
            // InternalHal.g:1570:1: ( '}' )
            {
            // InternalHal.g:1570:1: ( '}' )
            // InternalHal.g:1571:2: '}'
            {
             before(grammarAccess.getHALAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__HAL__Group_7__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalHal.g:1581:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1585:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalHal.g:1586:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalHal.g:1593:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__Alternatives_0 ) ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1597:1: ( ( ( rule__QualifiedName__Alternatives_0 ) ) )
            // InternalHal.g:1598:1: ( ( rule__QualifiedName__Alternatives_0 ) )
            {
            // InternalHal.g:1598:1: ( ( rule__QualifiedName__Alternatives_0 ) )
            // InternalHal.g:1599:2: ( rule__QualifiedName__Alternatives_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternatives_0()); 
            // InternalHal.g:1600:2: ( rule__QualifiedName__Alternatives_0 )
            // InternalHal.g:1600:3: rule__QualifiedName__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalHal.g:1608:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1612:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalHal.g:1613:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalHal.g:1619:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )? ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1623:1: ( ( ( rule__QualifiedName__Group_1__0 )? ) )
            // InternalHal.g:1624:1: ( ( rule__QualifiedName__Group_1__0 )? )
            {
            // InternalHal.g:1624:1: ( ( rule__QualifiedName__Group_1__0 )? )
            // InternalHal.g:1625:2: ( rule__QualifiedName__Group_1__0 )?
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalHal.g:1626:2: ( rule__QualifiedName__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHal.g:1626:3: rule__QualifiedName__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalHal.g:1635:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1639:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalHal.g:1640:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalHal.g:1647:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1651:1: ( ( '.' ) )
            // InternalHal.g:1652:1: ( '.' )
            {
            // InternalHal.g:1652:1: ( '.' )
            // InternalHal.g:1653:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalHal.g:1662:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1666:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalHal.g:1667:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalHal.g:1673:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__Alternatives_1_1 ) ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1677:1: ( ( ( rule__QualifiedName__Alternatives_1_1 ) ) )
            // InternalHal.g:1678:1: ( ( rule__QualifiedName__Alternatives_1_1 ) )
            {
            // InternalHal.g:1678:1: ( ( rule__QualifiedName__Alternatives_1_1 ) )
            // InternalHal.g:1679:2: ( rule__QualifiedName__Alternatives_1_1 )
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternatives_1_1()); 
            // InternalHal.g:1680:2: ( rule__QualifiedName__Alternatives_1_1 )
            // InternalHal.g:1680:3: rule__QualifiedName__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalHal.g:1689:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1693:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalHal.g:1694:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

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
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalHal.g:1701:1: rule__Room__Group__0__Impl : ( ( rule__Room__NameAssignment_0 ) ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1705:1: ( ( ( rule__Room__NameAssignment_0 ) ) )
            // InternalHal.g:1706:1: ( ( rule__Room__NameAssignment_0 ) )
            {
            // InternalHal.g:1706:1: ( ( rule__Room__NameAssignment_0 ) )
            // InternalHal.g:1707:2: ( rule__Room__NameAssignment_0 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_0()); 
            // InternalHal.g:1708:2: ( rule__Room__NameAssignment_0 )
            // InternalHal.g:1708:3: rule__Room__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Room__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalHal.g:1716:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1720:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalHal.g:1721:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Room__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__2();

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
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalHal.g:1728:1: rule__Room__Group__1__Impl : ( '(' ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1732:1: ( ( '(' ) )
            // InternalHal.g:1733:1: ( '(' )
            {
            // InternalHal.g:1733:1: ( '(' )
            // InternalHal.g:1734:2: '('
            {
             before(grammarAccess.getRoomAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__2"
    // InternalHal.g:1743:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1747:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalHal.g:1748:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Room__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__3();

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
    // $ANTLR end "rule__Room__Group__2"


    // $ANTLR start "rule__Room__Group__2__Impl"
    // InternalHal.g:1755:1: rule__Room__Group__2__Impl : ( ( rule__Room__LengthAssignment_2 ) ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1759:1: ( ( ( rule__Room__LengthAssignment_2 ) ) )
            // InternalHal.g:1760:1: ( ( rule__Room__LengthAssignment_2 ) )
            {
            // InternalHal.g:1760:1: ( ( rule__Room__LengthAssignment_2 ) )
            // InternalHal.g:1761:2: ( rule__Room__LengthAssignment_2 )
            {
             before(grammarAccess.getRoomAccess().getLengthAssignment_2()); 
            // InternalHal.g:1762:2: ( rule__Room__LengthAssignment_2 )
            // InternalHal.g:1762:3: rule__Room__LengthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__LengthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getLengthAssignment_2()); 

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
    // $ANTLR end "rule__Room__Group__2__Impl"


    // $ANTLR start "rule__Room__Group__3"
    // InternalHal.g:1770:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1774:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalHal.g:1775:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Room__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__4();

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
    // $ANTLR end "rule__Room__Group__3"


    // $ANTLR start "rule__Room__Group__3__Impl"
    // InternalHal.g:1782:1: rule__Room__Group__3__Impl : ( 'x' ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1786:1: ( ( 'x' ) )
            // InternalHal.g:1787:1: ( 'x' )
            {
            // InternalHal.g:1787:1: ( 'x' )
            // InternalHal.g:1788:2: 'x'
            {
             before(grammarAccess.getRoomAccess().getXKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getXKeyword_3()); 

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
    // $ANTLR end "rule__Room__Group__3__Impl"


    // $ANTLR start "rule__Room__Group__4"
    // InternalHal.g:1797:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1801:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalHal.g:1802:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Room__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__5();

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
    // $ANTLR end "rule__Room__Group__4"


    // $ANTLR start "rule__Room__Group__4__Impl"
    // InternalHal.g:1809:1: rule__Room__Group__4__Impl : ( ( rule__Room__WidthAssignment_4 ) ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1813:1: ( ( ( rule__Room__WidthAssignment_4 ) ) )
            // InternalHal.g:1814:1: ( ( rule__Room__WidthAssignment_4 ) )
            {
            // InternalHal.g:1814:1: ( ( rule__Room__WidthAssignment_4 ) )
            // InternalHal.g:1815:2: ( rule__Room__WidthAssignment_4 )
            {
             before(grammarAccess.getRoomAccess().getWidthAssignment_4()); 
            // InternalHal.g:1816:2: ( rule__Room__WidthAssignment_4 )
            // InternalHal.g:1816:3: rule__Room__WidthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Room__WidthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getWidthAssignment_4()); 

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
    // $ANTLR end "rule__Room__Group__4__Impl"


    // $ANTLR start "rule__Room__Group__5"
    // InternalHal.g:1824:1: rule__Room__Group__5 : rule__Room__Group__5__Impl rule__Room__Group__6 ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1828:1: ( rule__Room__Group__5__Impl rule__Room__Group__6 )
            // InternalHal.g:1829:2: rule__Room__Group__5__Impl rule__Room__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Room__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__6();

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
    // $ANTLR end "rule__Room__Group__5"


    // $ANTLR start "rule__Room__Group__5__Impl"
    // InternalHal.g:1836:1: rule__Room__Group__5__Impl : ( ')' ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1840:1: ( ( ')' ) )
            // InternalHal.g:1841:1: ( ')' )
            {
            // InternalHal.g:1841:1: ( ')' )
            // InternalHal.g:1842:2: ')'
            {
             before(grammarAccess.getRoomAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Room__Group__5__Impl"


    // $ANTLR start "rule__Room__Group__6"
    // InternalHal.g:1851:1: rule__Room__Group__6 : rule__Room__Group__6__Impl rule__Room__Group__7 ;
    public final void rule__Room__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1855:1: ( rule__Room__Group__6__Impl rule__Room__Group__7 )
            // InternalHal.g:1856:2: rule__Room__Group__6__Impl rule__Room__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Room__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__7();

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
    // $ANTLR end "rule__Room__Group__6"


    // $ANTLR start "rule__Room__Group__6__Impl"
    // InternalHal.g:1863:1: rule__Room__Group__6__Impl : ( '{' ) ;
    public final void rule__Room__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1867:1: ( ( '{' ) )
            // InternalHal.g:1868:1: ( '{' )
            {
            // InternalHal.g:1868:1: ( '{' )
            // InternalHal.g:1869:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Room__Group__6__Impl"


    // $ANTLR start "rule__Room__Group__7"
    // InternalHal.g:1878:1: rule__Room__Group__7 : rule__Room__Group__7__Impl rule__Room__Group__8 ;
    public final void rule__Room__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1882:1: ( rule__Room__Group__7__Impl rule__Room__Group__8 )
            // InternalHal.g:1883:2: rule__Room__Group__7__Impl rule__Room__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Room__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__8();

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
    // $ANTLR end "rule__Room__Group__7"


    // $ANTLR start "rule__Room__Group__7__Impl"
    // InternalHal.g:1890:1: rule__Room__Group__7__Impl : ( ( rule__Room__Group_7__0 )? ) ;
    public final void rule__Room__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1894:1: ( ( ( rule__Room__Group_7__0 )? ) )
            // InternalHal.g:1895:1: ( ( rule__Room__Group_7__0 )? )
            {
            // InternalHal.g:1895:1: ( ( rule__Room__Group_7__0 )? )
            // InternalHal.g:1896:2: ( rule__Room__Group_7__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_7()); 
            // InternalHal.g:1897:2: ( rule__Room__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalHal.g:1897:3: rule__Room__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Room__Group__7__Impl"


    // $ANTLR start "rule__Room__Group__8"
    // InternalHal.g:1905:1: rule__Room__Group__8 : rule__Room__Group__8__Impl ;
    public final void rule__Room__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1909:1: ( rule__Room__Group__8__Impl )
            // InternalHal.g:1910:2: rule__Room__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__8__Impl();

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
    // $ANTLR end "rule__Room__Group__8"


    // $ANTLR start "rule__Room__Group__8__Impl"
    // InternalHal.g:1916:1: rule__Room__Group__8__Impl : ( '}' ) ;
    public final void rule__Room__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1920:1: ( ( '}' ) )
            // InternalHal.g:1921:1: ( '}' )
            {
            // InternalHal.g:1921:1: ( '}' )
            // InternalHal.g:1922:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Room__Group__8__Impl"


    // $ANTLR start "rule__Room__Group_7__0"
    // InternalHal.g:1932:1: rule__Room__Group_7__0 : rule__Room__Group_7__0__Impl rule__Room__Group_7__1 ;
    public final void rule__Room__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1936:1: ( rule__Room__Group_7__0__Impl rule__Room__Group_7__1 )
            // InternalHal.g:1937:2: rule__Room__Group_7__0__Impl rule__Room__Group_7__1
            {
            pushFollow(FOLLOW_18);
            rule__Room__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_7__1();

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
    // $ANTLR end "rule__Room__Group_7__0"


    // $ANTLR start "rule__Room__Group_7__0__Impl"
    // InternalHal.g:1944:1: rule__Room__Group_7__0__Impl : ( ( rule__Room__DevicesAssignment_7_0 ) ) ;
    public final void rule__Room__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1948:1: ( ( ( rule__Room__DevicesAssignment_7_0 ) ) )
            // InternalHal.g:1949:1: ( ( rule__Room__DevicesAssignment_7_0 ) )
            {
            // InternalHal.g:1949:1: ( ( rule__Room__DevicesAssignment_7_0 ) )
            // InternalHal.g:1950:2: ( rule__Room__DevicesAssignment_7_0 )
            {
             before(grammarAccess.getRoomAccess().getDevicesAssignment_7_0()); 
            // InternalHal.g:1951:2: ( rule__Room__DevicesAssignment_7_0 )
            // InternalHal.g:1951:3: rule__Room__DevicesAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Room__DevicesAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getDevicesAssignment_7_0()); 

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
    // $ANTLR end "rule__Room__Group_7__0__Impl"


    // $ANTLR start "rule__Room__Group_7__1"
    // InternalHal.g:1959:1: rule__Room__Group_7__1 : rule__Room__Group_7__1__Impl ;
    public final void rule__Room__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1963:1: ( rule__Room__Group_7__1__Impl )
            // InternalHal.g:1964:2: rule__Room__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_7__1__Impl();

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
    // $ANTLR end "rule__Room__Group_7__1"


    // $ANTLR start "rule__Room__Group_7__1__Impl"
    // InternalHal.g:1970:1: rule__Room__Group_7__1__Impl : ( ( rule__Room__Group_7_1__0 )* ) ;
    public final void rule__Room__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1974:1: ( ( ( rule__Room__Group_7_1__0 )* ) )
            // InternalHal.g:1975:1: ( ( rule__Room__Group_7_1__0 )* )
            {
            // InternalHal.g:1975:1: ( ( rule__Room__Group_7_1__0 )* )
            // InternalHal.g:1976:2: ( rule__Room__Group_7_1__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_7_1()); 
            // InternalHal.g:1977:2: ( rule__Room__Group_7_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalHal.g:1977:3: rule__Room__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Room__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_7_1()); 

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
    // $ANTLR end "rule__Room__Group_7__1__Impl"


    // $ANTLR start "rule__Room__Group_7_1__0"
    // InternalHal.g:1986:1: rule__Room__Group_7_1__0 : rule__Room__Group_7_1__0__Impl rule__Room__Group_7_1__1 ;
    public final void rule__Room__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:1990:1: ( rule__Room__Group_7_1__0__Impl rule__Room__Group_7_1__1 )
            // InternalHal.g:1991:2: rule__Room__Group_7_1__0__Impl rule__Room__Group_7_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Room__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_7_1__1();

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
    // $ANTLR end "rule__Room__Group_7_1__0"


    // $ANTLR start "rule__Room__Group_7_1__0__Impl"
    // InternalHal.g:1998:1: rule__Room__Group_7_1__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2002:1: ( ( ',' ) )
            // InternalHal.g:2003:1: ( ',' )
            {
            // InternalHal.g:2003:1: ( ',' )
            // InternalHal.g:2004:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_7_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_7_1_0()); 

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
    // $ANTLR end "rule__Room__Group_7_1__0__Impl"


    // $ANTLR start "rule__Room__Group_7_1__1"
    // InternalHal.g:2013:1: rule__Room__Group_7_1__1 : rule__Room__Group_7_1__1__Impl ;
    public final void rule__Room__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2017:1: ( rule__Room__Group_7_1__1__Impl )
            // InternalHal.g:2018:2: rule__Room__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_7_1__1__Impl();

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
    // $ANTLR end "rule__Room__Group_7_1__1"


    // $ANTLR start "rule__Room__Group_7_1__1__Impl"
    // InternalHal.g:2024:1: rule__Room__Group_7_1__1__Impl : ( ( rule__Room__DevicesAssignment_7_1_1 ) ) ;
    public final void rule__Room__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2028:1: ( ( ( rule__Room__DevicesAssignment_7_1_1 ) ) )
            // InternalHal.g:2029:1: ( ( rule__Room__DevicesAssignment_7_1_1 ) )
            {
            // InternalHal.g:2029:1: ( ( rule__Room__DevicesAssignment_7_1_1 ) )
            // InternalHal.g:2030:2: ( rule__Room__DevicesAssignment_7_1_1 )
            {
             before(grammarAccess.getRoomAccess().getDevicesAssignment_7_1_1()); 
            // InternalHal.g:2031:2: ( rule__Room__DevicesAssignment_7_1_1 )
            // InternalHal.g:2031:3: rule__Room__DevicesAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__DevicesAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getDevicesAssignment_7_1_1()); 

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
    // $ANTLR end "rule__Room__Group_7_1__1__Impl"


    // $ANTLR start "rule__AutomationRule__Group__0"
    // InternalHal.g:2040:1: rule__AutomationRule__Group__0 : rule__AutomationRule__Group__0__Impl rule__AutomationRule__Group__1 ;
    public final void rule__AutomationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2044:1: ( rule__AutomationRule__Group__0__Impl rule__AutomationRule__Group__1 )
            // InternalHal.g:2045:2: rule__AutomationRule__Group__0__Impl rule__AutomationRule__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AutomationRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group__1();

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
    // $ANTLR end "rule__AutomationRule__Group__0"


    // $ANTLR start "rule__AutomationRule__Group__0__Impl"
    // InternalHal.g:2052:1: rule__AutomationRule__Group__0__Impl : ( ( rule__AutomationRule__NameAssignment_0 ) ) ;
    public final void rule__AutomationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2056:1: ( ( ( rule__AutomationRule__NameAssignment_0 ) ) )
            // InternalHal.g:2057:1: ( ( rule__AutomationRule__NameAssignment_0 ) )
            {
            // InternalHal.g:2057:1: ( ( rule__AutomationRule__NameAssignment_0 ) )
            // InternalHal.g:2058:2: ( rule__AutomationRule__NameAssignment_0 )
            {
             before(grammarAccess.getAutomationRuleAccess().getNameAssignment_0()); 
            // InternalHal.g:2059:2: ( rule__AutomationRule__NameAssignment_0 )
            // InternalHal.g:2059:3: rule__AutomationRule__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AutomationRule__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAutomationRuleAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__AutomationRule__Group__0__Impl"


    // $ANTLR start "rule__AutomationRule__Group__1"
    // InternalHal.g:2067:1: rule__AutomationRule__Group__1 : rule__AutomationRule__Group__1__Impl rule__AutomationRule__Group__2 ;
    public final void rule__AutomationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2071:1: ( rule__AutomationRule__Group__1__Impl rule__AutomationRule__Group__2 )
            // InternalHal.g:2072:2: rule__AutomationRule__Group__1__Impl rule__AutomationRule__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__AutomationRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group__2();

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
    // $ANTLR end "rule__AutomationRule__Group__1"


    // $ANTLR start "rule__AutomationRule__Group__1__Impl"
    // InternalHal.g:2079:1: rule__AutomationRule__Group__1__Impl : ( ( rule__AutomationRule__Group_1__0 )? ) ;
    public final void rule__AutomationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2083:1: ( ( ( rule__AutomationRule__Group_1__0 )? ) )
            // InternalHal.g:2084:1: ( ( rule__AutomationRule__Group_1__0 )? )
            {
            // InternalHal.g:2084:1: ( ( rule__AutomationRule__Group_1__0 )? )
            // InternalHal.g:2085:2: ( rule__AutomationRule__Group_1__0 )?
            {
             before(grammarAccess.getAutomationRuleAccess().getGroup_1()); 
            // InternalHal.g:2086:2: ( rule__AutomationRule__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalHal.g:2086:3: rule__AutomationRule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutomationRule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomationRuleAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AutomationRule__Group__1__Impl"


    // $ANTLR start "rule__AutomationRule__Group__2"
    // InternalHal.g:2094:1: rule__AutomationRule__Group__2 : rule__AutomationRule__Group__2__Impl rule__AutomationRule__Group__3 ;
    public final void rule__AutomationRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2098:1: ( rule__AutomationRule__Group__2__Impl rule__AutomationRule__Group__3 )
            // InternalHal.g:2099:2: rule__AutomationRule__Group__2__Impl rule__AutomationRule__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__AutomationRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group__3();

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
    // $ANTLR end "rule__AutomationRule__Group__2"


    // $ANTLR start "rule__AutomationRule__Group__2__Impl"
    // InternalHal.g:2106:1: rule__AutomationRule__Group__2__Impl : ( '{' ) ;
    public final void rule__AutomationRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2110:1: ( ( '{' ) )
            // InternalHal.g:2111:1: ( '{' )
            {
            // InternalHal.g:2111:1: ( '{' )
            // InternalHal.g:2112:2: '{'
            {
             before(grammarAccess.getAutomationRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAutomationRuleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__AutomationRule__Group__2__Impl"


    // $ANTLR start "rule__AutomationRule__Group__3"
    // InternalHal.g:2121:1: rule__AutomationRule__Group__3 : rule__AutomationRule__Group__3__Impl rule__AutomationRule__Group__4 ;
    public final void rule__AutomationRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2125:1: ( rule__AutomationRule__Group__3__Impl rule__AutomationRule__Group__4 )
            // InternalHal.g:2126:2: rule__AutomationRule__Group__3__Impl rule__AutomationRule__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__AutomationRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group__4();

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
    // $ANTLR end "rule__AutomationRule__Group__3"


    // $ANTLR start "rule__AutomationRule__Group__3__Impl"
    // InternalHal.g:2133:1: rule__AutomationRule__Group__3__Impl : ( 'WHEN' ) ;
    public final void rule__AutomationRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2137:1: ( ( 'WHEN' ) )
            // InternalHal.g:2138:1: ( 'WHEN' )
            {
            // InternalHal.g:2138:1: ( 'WHEN' )
            // InternalHal.g:2139:2: 'WHEN'
            {
             before(grammarAccess.getAutomationRuleAccess().getWHENKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAutomationRuleAccess().getWHENKeyword_3()); 

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
    // $ANTLR end "rule__AutomationRule__Group__3__Impl"


    // $ANTLR start "rule__AutomationRule__Group__4"
    // InternalHal.g:2148:1: rule__AutomationRule__Group__4 : rule__AutomationRule__Group__4__Impl rule__AutomationRule__Group__5 ;
    public final void rule__AutomationRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2152:1: ( rule__AutomationRule__Group__4__Impl rule__AutomationRule__Group__5 )
            // InternalHal.g:2153:2: rule__AutomationRule__Group__4__Impl rule__AutomationRule__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__AutomationRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group__5();

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
    // $ANTLR end "rule__AutomationRule__Group__4"


    // $ANTLR start "rule__AutomationRule__Group__4__Impl"
    // InternalHal.g:2160:1: rule__AutomationRule__Group__4__Impl : ( ( rule__AutomationRule__PreconditionAssignment_4 ) ) ;
    public final void rule__AutomationRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2164:1: ( ( ( rule__AutomationRule__PreconditionAssignment_4 ) ) )
            // InternalHal.g:2165:1: ( ( rule__AutomationRule__PreconditionAssignment_4 ) )
            {
            // InternalHal.g:2165:1: ( ( rule__AutomationRule__PreconditionAssignment_4 ) )
            // InternalHal.g:2166:2: ( rule__AutomationRule__PreconditionAssignment_4 )
            {
             before(grammarAccess.getAutomationRuleAccess().getPreconditionAssignment_4()); 
            // InternalHal.g:2167:2: ( rule__AutomationRule__PreconditionAssignment_4 )
            // InternalHal.g:2167:3: rule__AutomationRule__PreconditionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AutomationRule__PreconditionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAutomationRuleAccess().getPreconditionAssignment_4()); 

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
    // $ANTLR end "rule__AutomationRule__Group__4__Impl"


    // $ANTLR start "rule__AutomationRule__Group__5"
    // InternalHal.g:2175:1: rule__AutomationRule__Group__5 : rule__AutomationRule__Group__5__Impl rule__AutomationRule__Group__6 ;
    public final void rule__AutomationRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2179:1: ( rule__AutomationRule__Group__5__Impl rule__AutomationRule__Group__6 )
            // InternalHal.g:2180:2: rule__AutomationRule__Group__5__Impl rule__AutomationRule__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__AutomationRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group__6();

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
    // $ANTLR end "rule__AutomationRule__Group__5"


    // $ANTLR start "rule__AutomationRule__Group__5__Impl"
    // InternalHal.g:2187:1: rule__AutomationRule__Group__5__Impl : ( 'THEN' ) ;
    public final void rule__AutomationRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2191:1: ( ( 'THEN' ) )
            // InternalHal.g:2192:1: ( 'THEN' )
            {
            // InternalHal.g:2192:1: ( 'THEN' )
            // InternalHal.g:2193:2: 'THEN'
            {
             before(grammarAccess.getAutomationRuleAccess().getTHENKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAutomationRuleAccess().getTHENKeyword_5()); 

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
    // $ANTLR end "rule__AutomationRule__Group__5__Impl"


    // $ANTLR start "rule__AutomationRule__Group__6"
    // InternalHal.g:2202:1: rule__AutomationRule__Group__6 : rule__AutomationRule__Group__6__Impl rule__AutomationRule__Group__7 ;
    public final void rule__AutomationRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2206:1: ( rule__AutomationRule__Group__6__Impl rule__AutomationRule__Group__7 )
            // InternalHal.g:2207:2: rule__AutomationRule__Group__6__Impl rule__AutomationRule__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__AutomationRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group__7();

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
    // $ANTLR end "rule__AutomationRule__Group__6"


    // $ANTLR start "rule__AutomationRule__Group__6__Impl"
    // InternalHal.g:2214:1: rule__AutomationRule__Group__6__Impl : ( ( rule__AutomationRule__ActionsAssignment_6 ) ) ;
    public final void rule__AutomationRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2218:1: ( ( ( rule__AutomationRule__ActionsAssignment_6 ) ) )
            // InternalHal.g:2219:1: ( ( rule__AutomationRule__ActionsAssignment_6 ) )
            {
            // InternalHal.g:2219:1: ( ( rule__AutomationRule__ActionsAssignment_6 ) )
            // InternalHal.g:2220:2: ( rule__AutomationRule__ActionsAssignment_6 )
            {
             before(grammarAccess.getAutomationRuleAccess().getActionsAssignment_6()); 
            // InternalHal.g:2221:2: ( rule__AutomationRule__ActionsAssignment_6 )
            // InternalHal.g:2221:3: rule__AutomationRule__ActionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AutomationRule__ActionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAutomationRuleAccess().getActionsAssignment_6()); 

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
    // $ANTLR end "rule__AutomationRule__Group__6__Impl"


    // $ANTLR start "rule__AutomationRule__Group__7"
    // InternalHal.g:2229:1: rule__AutomationRule__Group__7 : rule__AutomationRule__Group__7__Impl rule__AutomationRule__Group__8 ;
    public final void rule__AutomationRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2233:1: ( rule__AutomationRule__Group__7__Impl rule__AutomationRule__Group__8 )
            // InternalHal.g:2234:2: rule__AutomationRule__Group__7__Impl rule__AutomationRule__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__AutomationRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group__8();

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
    // $ANTLR end "rule__AutomationRule__Group__7"


    // $ANTLR start "rule__AutomationRule__Group__7__Impl"
    // InternalHal.g:2241:1: rule__AutomationRule__Group__7__Impl : ( ( rule__AutomationRule__Group_7__0 )* ) ;
    public final void rule__AutomationRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2245:1: ( ( ( rule__AutomationRule__Group_7__0 )* ) )
            // InternalHal.g:2246:1: ( ( rule__AutomationRule__Group_7__0 )* )
            {
            // InternalHal.g:2246:1: ( ( rule__AutomationRule__Group_7__0 )* )
            // InternalHal.g:2247:2: ( rule__AutomationRule__Group_7__0 )*
            {
             before(grammarAccess.getAutomationRuleAccess().getGroup_7()); 
            // InternalHal.g:2248:2: ( rule__AutomationRule__Group_7__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==27) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalHal.g:2248:3: rule__AutomationRule__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AutomationRule__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAutomationRuleAccess().getGroup_7()); 

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
    // $ANTLR end "rule__AutomationRule__Group__7__Impl"


    // $ANTLR start "rule__AutomationRule__Group__8"
    // InternalHal.g:2256:1: rule__AutomationRule__Group__8 : rule__AutomationRule__Group__8__Impl ;
    public final void rule__AutomationRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2260:1: ( rule__AutomationRule__Group__8__Impl )
            // InternalHal.g:2261:2: rule__AutomationRule__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group__8__Impl();

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
    // $ANTLR end "rule__AutomationRule__Group__8"


    // $ANTLR start "rule__AutomationRule__Group__8__Impl"
    // InternalHal.g:2267:1: rule__AutomationRule__Group__8__Impl : ( '}' ) ;
    public final void rule__AutomationRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2271:1: ( ( '}' ) )
            // InternalHal.g:2272:1: ( '}' )
            {
            // InternalHal.g:2272:1: ( '}' )
            // InternalHal.g:2273:2: '}'
            {
             before(grammarAccess.getAutomationRuleAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAutomationRuleAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__AutomationRule__Group__8__Impl"


    // $ANTLR start "rule__AutomationRule__Group_1__0"
    // InternalHal.g:2283:1: rule__AutomationRule__Group_1__0 : rule__AutomationRule__Group_1__0__Impl rule__AutomationRule__Group_1__1 ;
    public final void rule__AutomationRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2287:1: ( rule__AutomationRule__Group_1__0__Impl rule__AutomationRule__Group_1__1 )
            // InternalHal.g:2288:2: rule__AutomationRule__Group_1__0__Impl rule__AutomationRule__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__AutomationRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group_1__1();

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
    // $ANTLR end "rule__AutomationRule__Group_1__0"


    // $ANTLR start "rule__AutomationRule__Group_1__0__Impl"
    // InternalHal.g:2295:1: rule__AutomationRule__Group_1__0__Impl : ( '(' ) ;
    public final void rule__AutomationRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2299:1: ( ( '(' ) )
            // InternalHal.g:2300:1: ( '(' )
            {
            // InternalHal.g:2300:1: ( '(' )
            // InternalHal.g:2301:2: '('
            {
             before(grammarAccess.getAutomationRuleAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAutomationRuleAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__AutomationRule__Group_1__0__Impl"


    // $ANTLR start "rule__AutomationRule__Group_1__1"
    // InternalHal.g:2310:1: rule__AutomationRule__Group_1__1 : rule__AutomationRule__Group_1__1__Impl rule__AutomationRule__Group_1__2 ;
    public final void rule__AutomationRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2314:1: ( rule__AutomationRule__Group_1__1__Impl rule__AutomationRule__Group_1__2 )
            // InternalHal.g:2315:2: rule__AutomationRule__Group_1__1__Impl rule__AutomationRule__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__AutomationRule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group_1__2();

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
    // $ANTLR end "rule__AutomationRule__Group_1__1"


    // $ANTLR start "rule__AutomationRule__Group_1__1__Impl"
    // InternalHal.g:2322:1: rule__AutomationRule__Group_1__1__Impl : ( ( rule__AutomationRule__ActiveAssignment_1_1 ) ) ;
    public final void rule__AutomationRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2326:1: ( ( ( rule__AutomationRule__ActiveAssignment_1_1 ) ) )
            // InternalHal.g:2327:1: ( ( rule__AutomationRule__ActiveAssignment_1_1 ) )
            {
            // InternalHal.g:2327:1: ( ( rule__AutomationRule__ActiveAssignment_1_1 ) )
            // InternalHal.g:2328:2: ( rule__AutomationRule__ActiveAssignment_1_1 )
            {
             before(grammarAccess.getAutomationRuleAccess().getActiveAssignment_1_1()); 
            // InternalHal.g:2329:2: ( rule__AutomationRule__ActiveAssignment_1_1 )
            // InternalHal.g:2329:3: rule__AutomationRule__ActiveAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AutomationRule__ActiveAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAutomationRuleAccess().getActiveAssignment_1_1()); 

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
    // $ANTLR end "rule__AutomationRule__Group_1__1__Impl"


    // $ANTLR start "rule__AutomationRule__Group_1__2"
    // InternalHal.g:2337:1: rule__AutomationRule__Group_1__2 : rule__AutomationRule__Group_1__2__Impl ;
    public final void rule__AutomationRule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2341:1: ( rule__AutomationRule__Group_1__2__Impl )
            // InternalHal.g:2342:2: rule__AutomationRule__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group_1__2__Impl();

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
    // $ANTLR end "rule__AutomationRule__Group_1__2"


    // $ANTLR start "rule__AutomationRule__Group_1__2__Impl"
    // InternalHal.g:2348:1: rule__AutomationRule__Group_1__2__Impl : ( ')' ) ;
    public final void rule__AutomationRule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2352:1: ( ( ')' ) )
            // InternalHal.g:2353:1: ( ')' )
            {
            // InternalHal.g:2353:1: ( ')' )
            // InternalHal.g:2354:2: ')'
            {
             before(grammarAccess.getAutomationRuleAccess().getRightParenthesisKeyword_1_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAutomationRuleAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__AutomationRule__Group_1__2__Impl"


    // $ANTLR start "rule__AutomationRule__Group_7__0"
    // InternalHal.g:2364:1: rule__AutomationRule__Group_7__0 : rule__AutomationRule__Group_7__0__Impl rule__AutomationRule__Group_7__1 ;
    public final void rule__AutomationRule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2368:1: ( rule__AutomationRule__Group_7__0__Impl rule__AutomationRule__Group_7__1 )
            // InternalHal.g:2369:2: rule__AutomationRule__Group_7__0__Impl rule__AutomationRule__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__AutomationRule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group_7__1();

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
    // $ANTLR end "rule__AutomationRule__Group_7__0"


    // $ANTLR start "rule__AutomationRule__Group_7__0__Impl"
    // InternalHal.g:2376:1: rule__AutomationRule__Group_7__0__Impl : ( ',' ) ;
    public final void rule__AutomationRule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2380:1: ( ( ',' ) )
            // InternalHal.g:2381:1: ( ',' )
            {
            // InternalHal.g:2381:1: ( ',' )
            // InternalHal.g:2382:2: ','
            {
             before(grammarAccess.getAutomationRuleAccess().getCommaKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAutomationRuleAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__AutomationRule__Group_7__0__Impl"


    // $ANTLR start "rule__AutomationRule__Group_7__1"
    // InternalHal.g:2391:1: rule__AutomationRule__Group_7__1 : rule__AutomationRule__Group_7__1__Impl ;
    public final void rule__AutomationRule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2395:1: ( rule__AutomationRule__Group_7__1__Impl )
            // InternalHal.g:2396:2: rule__AutomationRule__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutomationRule__Group_7__1__Impl();

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
    // $ANTLR end "rule__AutomationRule__Group_7__1"


    // $ANTLR start "rule__AutomationRule__Group_7__1__Impl"
    // InternalHal.g:2402:1: rule__AutomationRule__Group_7__1__Impl : ( ( rule__AutomationRule__ActionsAssignment_7_1 ) ) ;
    public final void rule__AutomationRule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2406:1: ( ( ( rule__AutomationRule__ActionsAssignment_7_1 ) ) )
            // InternalHal.g:2407:1: ( ( rule__AutomationRule__ActionsAssignment_7_1 ) )
            {
            // InternalHal.g:2407:1: ( ( rule__AutomationRule__ActionsAssignment_7_1 ) )
            // InternalHal.g:2408:2: ( rule__AutomationRule__ActionsAssignment_7_1 )
            {
             before(grammarAccess.getAutomationRuleAccess().getActionsAssignment_7_1()); 
            // InternalHal.g:2409:2: ( rule__AutomationRule__ActionsAssignment_7_1 )
            // InternalHal.g:2409:3: rule__AutomationRule__ActionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__AutomationRule__ActionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAutomationRuleAccess().getActionsAssignment_7_1()); 

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
    // $ANTLR end "rule__AutomationRule__Group_7__1__Impl"


    // $ANTLR start "rule__SensorEntry__Group__0"
    // InternalHal.g:2418:1: rule__SensorEntry__Group__0 : rule__SensorEntry__Group__0__Impl rule__SensorEntry__Group__1 ;
    public final void rule__SensorEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2422:1: ( rule__SensorEntry__Group__0__Impl rule__SensorEntry__Group__1 )
            // InternalHal.g:2423:2: rule__SensorEntry__Group__0__Impl rule__SensorEntry__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SensorEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorEntry__Group__1();

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
    // $ANTLR end "rule__SensorEntry__Group__0"


    // $ANTLR start "rule__SensorEntry__Group__0__Impl"
    // InternalHal.g:2430:1: rule__SensorEntry__Group__0__Impl : ( ( rule__SensorEntry__SensorAssignment_0 ) ) ;
    public final void rule__SensorEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2434:1: ( ( ( rule__SensorEntry__SensorAssignment_0 ) ) )
            // InternalHal.g:2435:1: ( ( rule__SensorEntry__SensorAssignment_0 ) )
            {
            // InternalHal.g:2435:1: ( ( rule__SensorEntry__SensorAssignment_0 ) )
            // InternalHal.g:2436:2: ( rule__SensorEntry__SensorAssignment_0 )
            {
             before(grammarAccess.getSensorEntryAccess().getSensorAssignment_0()); 
            // InternalHal.g:2437:2: ( rule__SensorEntry__SensorAssignment_0 )
            // InternalHal.g:2437:3: rule__SensorEntry__SensorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SensorEntry__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorEntryAccess().getSensorAssignment_0()); 

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
    // $ANTLR end "rule__SensorEntry__Group__0__Impl"


    // $ANTLR start "rule__SensorEntry__Group__1"
    // InternalHal.g:2445:1: rule__SensorEntry__Group__1 : rule__SensorEntry__Group__1__Impl rule__SensorEntry__Group__2 ;
    public final void rule__SensorEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2449:1: ( rule__SensorEntry__Group__1__Impl rule__SensorEntry__Group__2 )
            // InternalHal.g:2450:2: rule__SensorEntry__Group__1__Impl rule__SensorEntry__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__SensorEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorEntry__Group__2();

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
    // $ANTLR end "rule__SensorEntry__Group__1"


    // $ANTLR start "rule__SensorEntry__Group__1__Impl"
    // InternalHal.g:2457:1: rule__SensorEntry__Group__1__Impl : ( '{' ) ;
    public final void rule__SensorEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2461:1: ( ( '{' ) )
            // InternalHal.g:2462:1: ( '{' )
            {
            // InternalHal.g:2462:1: ( '{' )
            // InternalHal.g:2463:2: '{'
            {
             before(grammarAccess.getSensorEntryAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSensorEntryAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__SensorEntry__Group__1__Impl"


    // $ANTLR start "rule__SensorEntry__Group__2"
    // InternalHal.g:2472:1: rule__SensorEntry__Group__2 : rule__SensorEntry__Group__2__Impl rule__SensorEntry__Group__3 ;
    public final void rule__SensorEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2476:1: ( rule__SensorEntry__Group__2__Impl rule__SensorEntry__Group__3 )
            // InternalHal.g:2477:2: rule__SensorEntry__Group__2__Impl rule__SensorEntry__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SensorEntry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorEntry__Group__3();

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
    // $ANTLR end "rule__SensorEntry__Group__2"


    // $ANTLR start "rule__SensorEntry__Group__2__Impl"
    // InternalHal.g:2484:1: rule__SensorEntry__Group__2__Impl : ( 'reading' ) ;
    public final void rule__SensorEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2488:1: ( ( 'reading' ) )
            // InternalHal.g:2489:1: ( 'reading' )
            {
            // InternalHal.g:2489:1: ( 'reading' )
            // InternalHal.g:2490:2: 'reading'
            {
             before(grammarAccess.getSensorEntryAccess().getReadingKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSensorEntryAccess().getReadingKeyword_2()); 

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
    // $ANTLR end "rule__SensorEntry__Group__2__Impl"


    // $ANTLR start "rule__SensorEntry__Group__3"
    // InternalHal.g:2499:1: rule__SensorEntry__Group__3 : rule__SensorEntry__Group__3__Impl rule__SensorEntry__Group__4 ;
    public final void rule__SensorEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2503:1: ( rule__SensorEntry__Group__3__Impl rule__SensorEntry__Group__4 )
            // InternalHal.g:2504:2: rule__SensorEntry__Group__3__Impl rule__SensorEntry__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__SensorEntry__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorEntry__Group__4();

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
    // $ANTLR end "rule__SensorEntry__Group__3"


    // $ANTLR start "rule__SensorEntry__Group__3__Impl"
    // InternalHal.g:2511:1: rule__SensorEntry__Group__3__Impl : ( ( rule__SensorEntry__ReadingAssignment_3 ) ) ;
    public final void rule__SensorEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2515:1: ( ( ( rule__SensorEntry__ReadingAssignment_3 ) ) )
            // InternalHal.g:2516:1: ( ( rule__SensorEntry__ReadingAssignment_3 ) )
            {
            // InternalHal.g:2516:1: ( ( rule__SensorEntry__ReadingAssignment_3 ) )
            // InternalHal.g:2517:2: ( rule__SensorEntry__ReadingAssignment_3 )
            {
             before(grammarAccess.getSensorEntryAccess().getReadingAssignment_3()); 
            // InternalHal.g:2518:2: ( rule__SensorEntry__ReadingAssignment_3 )
            // InternalHal.g:2518:3: rule__SensorEntry__ReadingAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SensorEntry__ReadingAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorEntryAccess().getReadingAssignment_3()); 

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
    // $ANTLR end "rule__SensorEntry__Group__3__Impl"


    // $ANTLR start "rule__SensorEntry__Group__4"
    // InternalHal.g:2526:1: rule__SensorEntry__Group__4 : rule__SensorEntry__Group__4__Impl rule__SensorEntry__Group__5 ;
    public final void rule__SensorEntry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2530:1: ( rule__SensorEntry__Group__4__Impl rule__SensorEntry__Group__5 )
            // InternalHal.g:2531:2: rule__SensorEntry__Group__4__Impl rule__SensorEntry__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__SensorEntry__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorEntry__Group__5();

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
    // $ANTLR end "rule__SensorEntry__Group__4"


    // $ANTLR start "rule__SensorEntry__Group__4__Impl"
    // InternalHal.g:2538:1: rule__SensorEntry__Group__4__Impl : ( 'timestamp' ) ;
    public final void rule__SensorEntry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2542:1: ( ( 'timestamp' ) )
            // InternalHal.g:2543:1: ( 'timestamp' )
            {
            // InternalHal.g:2543:1: ( 'timestamp' )
            // InternalHal.g:2544:2: 'timestamp'
            {
             before(grammarAccess.getSensorEntryAccess().getTimestampKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSensorEntryAccess().getTimestampKeyword_4()); 

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
    // $ANTLR end "rule__SensorEntry__Group__4__Impl"


    // $ANTLR start "rule__SensorEntry__Group__5"
    // InternalHal.g:2553:1: rule__SensorEntry__Group__5 : rule__SensorEntry__Group__5__Impl rule__SensorEntry__Group__6 ;
    public final void rule__SensorEntry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2557:1: ( rule__SensorEntry__Group__5__Impl rule__SensorEntry__Group__6 )
            // InternalHal.g:2558:2: rule__SensorEntry__Group__5__Impl rule__SensorEntry__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__SensorEntry__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorEntry__Group__6();

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
    // $ANTLR end "rule__SensorEntry__Group__5"


    // $ANTLR start "rule__SensorEntry__Group__5__Impl"
    // InternalHal.g:2565:1: rule__SensorEntry__Group__5__Impl : ( ( rule__SensorEntry__TimeStampAssignment_5 ) ) ;
    public final void rule__SensorEntry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2569:1: ( ( ( rule__SensorEntry__TimeStampAssignment_5 ) ) )
            // InternalHal.g:2570:1: ( ( rule__SensorEntry__TimeStampAssignment_5 ) )
            {
            // InternalHal.g:2570:1: ( ( rule__SensorEntry__TimeStampAssignment_5 ) )
            // InternalHal.g:2571:2: ( rule__SensorEntry__TimeStampAssignment_5 )
            {
             before(grammarAccess.getSensorEntryAccess().getTimeStampAssignment_5()); 
            // InternalHal.g:2572:2: ( rule__SensorEntry__TimeStampAssignment_5 )
            // InternalHal.g:2572:3: rule__SensorEntry__TimeStampAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SensorEntry__TimeStampAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSensorEntryAccess().getTimeStampAssignment_5()); 

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
    // $ANTLR end "rule__SensorEntry__Group__5__Impl"


    // $ANTLR start "rule__SensorEntry__Group__6"
    // InternalHal.g:2580:1: rule__SensorEntry__Group__6 : rule__SensorEntry__Group__6__Impl ;
    public final void rule__SensorEntry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2584:1: ( rule__SensorEntry__Group__6__Impl )
            // InternalHal.g:2585:2: rule__SensorEntry__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorEntry__Group__6__Impl();

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
    // $ANTLR end "rule__SensorEntry__Group__6"


    // $ANTLR start "rule__SensorEntry__Group__6__Impl"
    // InternalHal.g:2591:1: rule__SensorEntry__Group__6__Impl : ( '}' ) ;
    public final void rule__SensorEntry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2595:1: ( ( '}' ) )
            // InternalHal.g:2596:1: ( '}' )
            {
            // InternalHal.g:2596:1: ( '}' )
            // InternalHal.g:2597:2: '}'
            {
             before(grammarAccess.getSensorEntryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSensorEntryAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__SensorEntry__Group__6__Impl"


    // $ANTLR start "rule__Device__Group__0"
    // InternalHal.g:2607:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2611:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalHal.g:2612:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__1();

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
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // InternalHal.g:2619:1: rule__Device__Group__0__Impl : ( ( rule__Device__NameAssignment_0 ) ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2623:1: ( ( ( rule__Device__NameAssignment_0 ) ) )
            // InternalHal.g:2624:1: ( ( rule__Device__NameAssignment_0 ) )
            {
            // InternalHal.g:2624:1: ( ( rule__Device__NameAssignment_0 ) )
            // InternalHal.g:2625:2: ( rule__Device__NameAssignment_0 )
            {
             before(grammarAccess.getDeviceAccess().getNameAssignment_0()); 
            // InternalHal.g:2626:2: ( rule__Device__NameAssignment_0 )
            // InternalHal.g:2626:3: rule__Device__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Device__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // InternalHal.g:2634:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2638:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalHal.g:2639:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__2();

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
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // InternalHal.g:2646:1: rule__Device__Group__1__Impl : ( 'is' ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2650:1: ( ( 'is' ) )
            // InternalHal.g:2651:1: ( 'is' )
            {
            // InternalHal.g:2651:1: ( 'is' )
            // InternalHal.g:2652:2: 'is'
            {
             before(grammarAccess.getDeviceAccess().getIsKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__2"
    // InternalHal.g:2661:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2665:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalHal.g:2666:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Device__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__3();

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
    // $ANTLR end "rule__Device__Group__2"


    // $ANTLR start "rule__Device__Group__2__Impl"
    // InternalHal.g:2673:1: rule__Device__Group__2__Impl : ( 'type' ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2677:1: ( ( 'type' ) )
            // InternalHal.g:2678:1: ( 'type' )
            {
            // InternalHal.g:2678:1: ( 'type' )
            // InternalHal.g:2679:2: 'type'
            {
             before(grammarAccess.getDeviceAccess().getTypeKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__Device__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__3"
    // InternalHal.g:2688:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2692:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalHal.g:2693:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Device__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__4();

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
    // $ANTLR end "rule__Device__Group__3"


    // $ANTLR start "rule__Device__Group__3__Impl"
    // InternalHal.g:2700:1: rule__Device__Group__3__Impl : ( ( rule__Device__TypeAssignment_3 ) ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2704:1: ( ( ( rule__Device__TypeAssignment_3 ) ) )
            // InternalHal.g:2705:1: ( ( rule__Device__TypeAssignment_3 ) )
            {
            // InternalHal.g:2705:1: ( ( rule__Device__TypeAssignment_3 ) )
            // InternalHal.g:2706:2: ( rule__Device__TypeAssignment_3 )
            {
             before(grammarAccess.getDeviceAccess().getTypeAssignment_3()); 
            // InternalHal.g:2707:2: ( rule__Device__TypeAssignment_3 )
            // InternalHal.g:2707:3: rule__Device__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Device__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Device__Group__3__Impl"


    // $ANTLR start "rule__Device__Group__4"
    // InternalHal.g:2715:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2719:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalHal.g:2720:2: rule__Device__Group__4__Impl rule__Device__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Device__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__5();

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
    // $ANTLR end "rule__Device__Group__4"


    // $ANTLR start "rule__Device__Group__4__Impl"
    // InternalHal.g:2727:1: rule__Device__Group__4__Impl : ( 'at' ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2731:1: ( ( 'at' ) )
            // InternalHal.g:2732:1: ( 'at' )
            {
            // InternalHal.g:2732:1: ( 'at' )
            // InternalHal.g:2733:2: 'at'
            {
             before(grammarAccess.getDeviceAccess().getAtKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getAtKeyword_4()); 

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
    // $ANTLR end "rule__Device__Group__4__Impl"


    // $ANTLR start "rule__Device__Group__5"
    // InternalHal.g:2742:1: rule__Device__Group__5 : rule__Device__Group__5__Impl rule__Device__Group__6 ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2746:1: ( rule__Device__Group__5__Impl rule__Device__Group__6 )
            // InternalHal.g:2747:2: rule__Device__Group__5__Impl rule__Device__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Device__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__6();

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
    // $ANTLR end "rule__Device__Group__5"


    // $ANTLR start "rule__Device__Group__5__Impl"
    // InternalHal.g:2754:1: rule__Device__Group__5__Impl : ( '(' ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2758:1: ( ( '(' ) )
            // InternalHal.g:2759:1: ( '(' )
            {
            // InternalHal.g:2759:1: ( '(' )
            // InternalHal.g:2760:2: '('
            {
             before(grammarAccess.getDeviceAccess().getLeftParenthesisKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getLeftParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Device__Group__5__Impl"


    // $ANTLR start "rule__Device__Group__6"
    // InternalHal.g:2769:1: rule__Device__Group__6 : rule__Device__Group__6__Impl rule__Device__Group__7 ;
    public final void rule__Device__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2773:1: ( rule__Device__Group__6__Impl rule__Device__Group__7 )
            // InternalHal.g:2774:2: rule__Device__Group__6__Impl rule__Device__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Device__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__7();

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
    // $ANTLR end "rule__Device__Group__6"


    // $ANTLR start "rule__Device__Group__6__Impl"
    // InternalHal.g:2781:1: rule__Device__Group__6__Impl : ( ( rule__Device__LengthPosAssignment_6 ) ) ;
    public final void rule__Device__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2785:1: ( ( ( rule__Device__LengthPosAssignment_6 ) ) )
            // InternalHal.g:2786:1: ( ( rule__Device__LengthPosAssignment_6 ) )
            {
            // InternalHal.g:2786:1: ( ( rule__Device__LengthPosAssignment_6 ) )
            // InternalHal.g:2787:2: ( rule__Device__LengthPosAssignment_6 )
            {
             before(grammarAccess.getDeviceAccess().getLengthPosAssignment_6()); 
            // InternalHal.g:2788:2: ( rule__Device__LengthPosAssignment_6 )
            // InternalHal.g:2788:3: rule__Device__LengthPosAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Device__LengthPosAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getLengthPosAssignment_6()); 

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
    // $ANTLR end "rule__Device__Group__6__Impl"


    // $ANTLR start "rule__Device__Group__7"
    // InternalHal.g:2796:1: rule__Device__Group__7 : rule__Device__Group__7__Impl rule__Device__Group__8 ;
    public final void rule__Device__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2800:1: ( rule__Device__Group__7__Impl rule__Device__Group__8 )
            // InternalHal.g:2801:2: rule__Device__Group__7__Impl rule__Device__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Device__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__8();

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
    // $ANTLR end "rule__Device__Group__7"


    // $ANTLR start "rule__Device__Group__7__Impl"
    // InternalHal.g:2808:1: rule__Device__Group__7__Impl : ( ',' ) ;
    public final void rule__Device__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2812:1: ( ( ',' ) )
            // InternalHal.g:2813:1: ( ',' )
            {
            // InternalHal.g:2813:1: ( ',' )
            // InternalHal.g:2814:2: ','
            {
             before(grammarAccess.getDeviceAccess().getCommaKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getCommaKeyword_7()); 

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
    // $ANTLR end "rule__Device__Group__7__Impl"


    // $ANTLR start "rule__Device__Group__8"
    // InternalHal.g:2823:1: rule__Device__Group__8 : rule__Device__Group__8__Impl rule__Device__Group__9 ;
    public final void rule__Device__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2827:1: ( rule__Device__Group__8__Impl rule__Device__Group__9 )
            // InternalHal.g:2828:2: rule__Device__Group__8__Impl rule__Device__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Device__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__9();

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
    // $ANTLR end "rule__Device__Group__8"


    // $ANTLR start "rule__Device__Group__8__Impl"
    // InternalHal.g:2835:1: rule__Device__Group__8__Impl : ( ( rule__Device__WidthPosAssignment_8 ) ) ;
    public final void rule__Device__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2839:1: ( ( ( rule__Device__WidthPosAssignment_8 ) ) )
            // InternalHal.g:2840:1: ( ( rule__Device__WidthPosAssignment_8 ) )
            {
            // InternalHal.g:2840:1: ( ( rule__Device__WidthPosAssignment_8 ) )
            // InternalHal.g:2841:2: ( rule__Device__WidthPosAssignment_8 )
            {
             before(grammarAccess.getDeviceAccess().getWidthPosAssignment_8()); 
            // InternalHal.g:2842:2: ( rule__Device__WidthPosAssignment_8 )
            // InternalHal.g:2842:3: rule__Device__WidthPosAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Device__WidthPosAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getWidthPosAssignment_8()); 

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
    // $ANTLR end "rule__Device__Group__8__Impl"


    // $ANTLR start "rule__Device__Group__9"
    // InternalHal.g:2850:1: rule__Device__Group__9 : rule__Device__Group__9__Impl ;
    public final void rule__Device__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2854:1: ( rule__Device__Group__9__Impl )
            // InternalHal.g:2855:2: rule__Device__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__9__Impl();

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
    // $ANTLR end "rule__Device__Group__9"


    // $ANTLR start "rule__Device__Group__9__Impl"
    // InternalHal.g:2861:1: rule__Device__Group__9__Impl : ( ')' ) ;
    public final void rule__Device__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2865:1: ( ( ')' ) )
            // InternalHal.g:2866:1: ( ')' )
            {
            // InternalHal.g:2866:1: ( ')' )
            // InternalHal.g:2867:2: ')'
            {
             before(grammarAccess.getDeviceAccess().getRightParenthesisKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__Device__Group__9__Impl"


    // $ANTLR start "rule__PosFloat__Group__0"
    // InternalHal.g:2877:1: rule__PosFloat__Group__0 : rule__PosFloat__Group__0__Impl rule__PosFloat__Group__1 ;
    public final void rule__PosFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2881:1: ( rule__PosFloat__Group__0__Impl rule__PosFloat__Group__1 )
            // InternalHal.g:2882:2: rule__PosFloat__Group__0__Impl rule__PosFloat__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__PosFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PosFloat__Group__1();

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
    // $ANTLR end "rule__PosFloat__Group__0"


    // $ANTLR start "rule__PosFloat__Group__0__Impl"
    // InternalHal.g:2889:1: rule__PosFloat__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__PosFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2893:1: ( ( RULE_INT ) )
            // InternalHal.g:2894:1: ( RULE_INT )
            {
            // InternalHal.g:2894:1: ( RULE_INT )
            // InternalHal.g:2895:2: RULE_INT
            {
             before(grammarAccess.getPosFloatAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPosFloatAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__PosFloat__Group__0__Impl"


    // $ANTLR start "rule__PosFloat__Group__1"
    // InternalHal.g:2904:1: rule__PosFloat__Group__1 : rule__PosFloat__Group__1__Impl ;
    public final void rule__PosFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2908:1: ( rule__PosFloat__Group__1__Impl )
            // InternalHal.g:2909:2: rule__PosFloat__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PosFloat__Group__1__Impl();

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
    // $ANTLR end "rule__PosFloat__Group__1"


    // $ANTLR start "rule__PosFloat__Group__1__Impl"
    // InternalHal.g:2915:1: rule__PosFloat__Group__1__Impl : ( ( rule__PosFloat__Group_1__0 )? ) ;
    public final void rule__PosFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2919:1: ( ( ( rule__PosFloat__Group_1__0 )? ) )
            // InternalHal.g:2920:1: ( ( rule__PosFloat__Group_1__0 )? )
            {
            // InternalHal.g:2920:1: ( ( rule__PosFloat__Group_1__0 )? )
            // InternalHal.g:2921:2: ( rule__PosFloat__Group_1__0 )?
            {
             before(grammarAccess.getPosFloatAccess().getGroup_1()); 
            // InternalHal.g:2922:2: ( rule__PosFloat__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalHal.g:2922:3: rule__PosFloat__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PosFloat__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPosFloatAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PosFloat__Group__1__Impl"


    // $ANTLR start "rule__PosFloat__Group_1__0"
    // InternalHal.g:2931:1: rule__PosFloat__Group_1__0 : rule__PosFloat__Group_1__0__Impl rule__PosFloat__Group_1__1 ;
    public final void rule__PosFloat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2935:1: ( rule__PosFloat__Group_1__0__Impl rule__PosFloat__Group_1__1 )
            // InternalHal.g:2936:2: rule__PosFloat__Group_1__0__Impl rule__PosFloat__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__PosFloat__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PosFloat__Group_1__1();

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
    // $ANTLR end "rule__PosFloat__Group_1__0"


    // $ANTLR start "rule__PosFloat__Group_1__0__Impl"
    // InternalHal.g:2943:1: rule__PosFloat__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PosFloat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2947:1: ( ( '.' ) )
            // InternalHal.g:2948:1: ( '.' )
            {
            // InternalHal.g:2948:1: ( '.' )
            // InternalHal.g:2949:2: '.'
            {
             before(grammarAccess.getPosFloatAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPosFloatAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__PosFloat__Group_1__0__Impl"


    // $ANTLR start "rule__PosFloat__Group_1__1"
    // InternalHal.g:2958:1: rule__PosFloat__Group_1__1 : rule__PosFloat__Group_1__1__Impl rule__PosFloat__Group_1__2 ;
    public final void rule__PosFloat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2962:1: ( rule__PosFloat__Group_1__1__Impl rule__PosFloat__Group_1__2 )
            // InternalHal.g:2963:2: rule__PosFloat__Group_1__1__Impl rule__PosFloat__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__PosFloat__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PosFloat__Group_1__2();

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
    // $ANTLR end "rule__PosFloat__Group_1__1"


    // $ANTLR start "rule__PosFloat__Group_1__1__Impl"
    // InternalHal.g:2970:1: rule__PosFloat__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__PosFloat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2974:1: ( ( RULE_INT ) )
            // InternalHal.g:2975:1: ( RULE_INT )
            {
            // InternalHal.g:2975:1: ( RULE_INT )
            // InternalHal.g:2976:2: RULE_INT
            {
             before(grammarAccess.getPosFloatAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPosFloatAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__PosFloat__Group_1__1__Impl"


    // $ANTLR start "rule__PosFloat__Group_1__2"
    // InternalHal.g:2985:1: rule__PosFloat__Group_1__2 : rule__PosFloat__Group_1__2__Impl ;
    public final void rule__PosFloat__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:2989:1: ( rule__PosFloat__Group_1__2__Impl )
            // InternalHal.g:2990:2: rule__PosFloat__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PosFloat__Group_1__2__Impl();

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
    // $ANTLR end "rule__PosFloat__Group_1__2"


    // $ANTLR start "rule__PosFloat__Group_1__2__Impl"
    // InternalHal.g:2996:1: rule__PosFloat__Group_1__2__Impl : ( ( rule__PosFloat__Group_1_2__0 )? ) ;
    public final void rule__PosFloat__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3000:1: ( ( ( rule__PosFloat__Group_1_2__0 )? ) )
            // InternalHal.g:3001:1: ( ( rule__PosFloat__Group_1_2__0 )? )
            {
            // InternalHal.g:3001:1: ( ( rule__PosFloat__Group_1_2__0 )? )
            // InternalHal.g:3002:2: ( rule__PosFloat__Group_1_2__0 )?
            {
             before(grammarAccess.getPosFloatAccess().getGroup_1_2()); 
            // InternalHal.g:3003:2: ( rule__PosFloat__Group_1_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=11 && LA24_0<=12)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalHal.g:3003:3: rule__PosFloat__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PosFloat__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPosFloatAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__PosFloat__Group_1__2__Impl"


    // $ANTLR start "rule__PosFloat__Group_1_2__0"
    // InternalHal.g:3012:1: rule__PosFloat__Group_1_2__0 : rule__PosFloat__Group_1_2__0__Impl rule__PosFloat__Group_1_2__1 ;
    public final void rule__PosFloat__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3016:1: ( rule__PosFloat__Group_1_2__0__Impl rule__PosFloat__Group_1_2__1 )
            // InternalHal.g:3017:2: rule__PosFloat__Group_1_2__0__Impl rule__PosFloat__Group_1_2__1
            {
            pushFollow(FOLLOW_31);
            rule__PosFloat__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PosFloat__Group_1_2__1();

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
    // $ANTLR end "rule__PosFloat__Group_1_2__0"


    // $ANTLR start "rule__PosFloat__Group_1_2__0__Impl"
    // InternalHal.g:3024:1: rule__PosFloat__Group_1_2__0__Impl : ( ( rule__PosFloat__Alternatives_1_2_0 ) ) ;
    public final void rule__PosFloat__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3028:1: ( ( ( rule__PosFloat__Alternatives_1_2_0 ) ) )
            // InternalHal.g:3029:1: ( ( rule__PosFloat__Alternatives_1_2_0 ) )
            {
            // InternalHal.g:3029:1: ( ( rule__PosFloat__Alternatives_1_2_0 ) )
            // InternalHal.g:3030:2: ( rule__PosFloat__Alternatives_1_2_0 )
            {
             before(grammarAccess.getPosFloatAccess().getAlternatives_1_2_0()); 
            // InternalHal.g:3031:2: ( rule__PosFloat__Alternatives_1_2_0 )
            // InternalHal.g:3031:3: rule__PosFloat__Alternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PosFloat__Alternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPosFloatAccess().getAlternatives_1_2_0()); 

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
    // $ANTLR end "rule__PosFloat__Group_1_2__0__Impl"


    // $ANTLR start "rule__PosFloat__Group_1_2__1"
    // InternalHal.g:3039:1: rule__PosFloat__Group_1_2__1 : rule__PosFloat__Group_1_2__1__Impl rule__PosFloat__Group_1_2__2 ;
    public final void rule__PosFloat__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3043:1: ( rule__PosFloat__Group_1_2__1__Impl rule__PosFloat__Group_1_2__2 )
            // InternalHal.g:3044:2: rule__PosFloat__Group_1_2__1__Impl rule__PosFloat__Group_1_2__2
            {
            pushFollow(FOLLOW_31);
            rule__PosFloat__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PosFloat__Group_1_2__2();

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
    // $ANTLR end "rule__PosFloat__Group_1_2__1"


    // $ANTLR start "rule__PosFloat__Group_1_2__1__Impl"
    // InternalHal.g:3051:1: rule__PosFloat__Group_1_2__1__Impl : ( ( '-' )? ) ;
    public final void rule__PosFloat__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3055:1: ( ( ( '-' )? ) )
            // InternalHal.g:3056:1: ( ( '-' )? )
            {
            // InternalHal.g:3056:1: ( ( '-' )? )
            // InternalHal.g:3057:2: ( '-' )?
            {
             before(grammarAccess.getPosFloatAccess().getHyphenMinusKeyword_1_2_1()); 
            // InternalHal.g:3058:2: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalHal.g:3058:3: '-'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPosFloatAccess().getHyphenMinusKeyword_1_2_1()); 

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
    // $ANTLR end "rule__PosFloat__Group_1_2__1__Impl"


    // $ANTLR start "rule__PosFloat__Group_1_2__2"
    // InternalHal.g:3066:1: rule__PosFloat__Group_1_2__2 : rule__PosFloat__Group_1_2__2__Impl ;
    public final void rule__PosFloat__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3070:1: ( rule__PosFloat__Group_1_2__2__Impl )
            // InternalHal.g:3071:2: rule__PosFloat__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PosFloat__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__PosFloat__Group_1_2__2"


    // $ANTLR start "rule__PosFloat__Group_1_2__2__Impl"
    // InternalHal.g:3077:1: rule__PosFloat__Group_1_2__2__Impl : ( RULE_INT ) ;
    public final void rule__PosFloat__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3081:1: ( ( RULE_INT ) )
            // InternalHal.g:3082:1: ( RULE_INT )
            {
            // InternalHal.g:3082:1: ( RULE_INT )
            // InternalHal.g:3083:2: RULE_INT
            {
             before(grammarAccess.getPosFloatAccess().getINTTerminalRuleCall_1_2_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPosFloatAccess().getINTTerminalRuleCall_1_2_2()); 

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
    // $ANTLR end "rule__PosFloat__Group_1_2__2__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalHal.g:3093:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3097:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalHal.g:3098:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalHal.g:3105:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActuatorAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3109:1: ( ( ( rule__Action__ActuatorAssignment_0 ) ) )
            // InternalHal.g:3110:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            {
            // InternalHal.g:3110:1: ( ( rule__Action__ActuatorAssignment_0 ) )
            // InternalHal.g:3111:2: ( rule__Action__ActuatorAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_0()); 
            // InternalHal.g:3112:2: ( rule__Action__ActuatorAssignment_0 )
            // InternalHal.g:3112:3: rule__Action__ActuatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActuatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActuatorAssignment_0()); 

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
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalHal.g:3120:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3124:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalHal.g:3125:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalHal.g:3132:1: rule__Action__Group__1__Impl : ( 'runs' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3136:1: ( ( 'runs' ) )
            // InternalHal.g:3137:1: ( 'runs' )
            {
            // InternalHal.g:3137:1: ( 'runs' )
            // InternalHal.g:3138:2: 'runs'
            {
             before(grammarAccess.getActionAccess().getRunsKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRunsKeyword_1()); 

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
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalHal.g:3147:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3151:1: ( rule__Action__Group__2__Impl )
            // InternalHal.g:3152:2: rule__Action__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__2__Impl();

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
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalHal.g:3158:1: rule__Action__Group__2__Impl : ( ( rule__Action__CommandAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3162:1: ( ( ( rule__Action__CommandAssignment_2 ) ) )
            // InternalHal.g:3163:1: ( ( rule__Action__CommandAssignment_2 ) )
            {
            // InternalHal.g:3163:1: ( ( rule__Action__CommandAssignment_2 ) )
            // InternalHal.g:3164:2: ( rule__Action__CommandAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getCommandAssignment_2()); 
            // InternalHal.g:3165:2: ( rule__Action__CommandAssignment_2 )
            // InternalHal.g:3165:3: rule__Action__CommandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__CommandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getCommandAssignment_2()); 

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
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__AtomicRelationalTerm__Group__0"
    // InternalHal.g:3174:1: rule__AtomicRelationalTerm__Group__0 : rule__AtomicRelationalTerm__Group__0__Impl rule__AtomicRelationalTerm__Group__1 ;
    public final void rule__AtomicRelationalTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3178:1: ( rule__AtomicRelationalTerm__Group__0__Impl rule__AtomicRelationalTerm__Group__1 )
            // InternalHal.g:3179:2: rule__AtomicRelationalTerm__Group__0__Impl rule__AtomicRelationalTerm__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__AtomicRelationalTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicRelationalTerm__Group__1();

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
    // $ANTLR end "rule__AtomicRelationalTerm__Group__0"


    // $ANTLR start "rule__AtomicRelationalTerm__Group__0__Impl"
    // InternalHal.g:3186:1: rule__AtomicRelationalTerm__Group__0__Impl : ( ( rule__AtomicRelationalTerm__NegatedAssignment_0 )? ) ;
    public final void rule__AtomicRelationalTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3190:1: ( ( ( rule__AtomicRelationalTerm__NegatedAssignment_0 )? ) )
            // InternalHal.g:3191:1: ( ( rule__AtomicRelationalTerm__NegatedAssignment_0 )? )
            {
            // InternalHal.g:3191:1: ( ( rule__AtomicRelationalTerm__NegatedAssignment_0 )? )
            // InternalHal.g:3192:2: ( rule__AtomicRelationalTerm__NegatedAssignment_0 )?
            {
             before(grammarAccess.getAtomicRelationalTermAccess().getNegatedAssignment_0()); 
            // InternalHal.g:3193:2: ( rule__AtomicRelationalTerm__NegatedAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalHal.g:3193:3: rule__AtomicRelationalTerm__NegatedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicRelationalTerm__NegatedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicRelationalTermAccess().getNegatedAssignment_0()); 

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
    // $ANTLR end "rule__AtomicRelationalTerm__Group__0__Impl"


    // $ANTLR start "rule__AtomicRelationalTerm__Group__1"
    // InternalHal.g:3201:1: rule__AtomicRelationalTerm__Group__1 : rule__AtomicRelationalTerm__Group__1__Impl rule__AtomicRelationalTerm__Group__2 ;
    public final void rule__AtomicRelationalTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3205:1: ( rule__AtomicRelationalTerm__Group__1__Impl rule__AtomicRelationalTerm__Group__2 )
            // InternalHal.g:3206:2: rule__AtomicRelationalTerm__Group__1__Impl rule__AtomicRelationalTerm__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__AtomicRelationalTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicRelationalTerm__Group__2();

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
    // $ANTLR end "rule__AtomicRelationalTerm__Group__1"


    // $ANTLR start "rule__AtomicRelationalTerm__Group__1__Impl"
    // InternalHal.g:3213:1: rule__AtomicRelationalTerm__Group__1__Impl : ( ( rule__AtomicRelationalTerm__SensorAssignment_1 ) ) ;
    public final void rule__AtomicRelationalTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3217:1: ( ( ( rule__AtomicRelationalTerm__SensorAssignment_1 ) ) )
            // InternalHal.g:3218:1: ( ( rule__AtomicRelationalTerm__SensorAssignment_1 ) )
            {
            // InternalHal.g:3218:1: ( ( rule__AtomicRelationalTerm__SensorAssignment_1 ) )
            // InternalHal.g:3219:2: ( rule__AtomicRelationalTerm__SensorAssignment_1 )
            {
             before(grammarAccess.getAtomicRelationalTermAccess().getSensorAssignment_1()); 
            // InternalHal.g:3220:2: ( rule__AtomicRelationalTerm__SensorAssignment_1 )
            // InternalHal.g:3220:3: rule__AtomicRelationalTerm__SensorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicRelationalTerm__SensorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicRelationalTermAccess().getSensorAssignment_1()); 

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
    // $ANTLR end "rule__AtomicRelationalTerm__Group__1__Impl"


    // $ANTLR start "rule__AtomicRelationalTerm__Group__2"
    // InternalHal.g:3228:1: rule__AtomicRelationalTerm__Group__2 : rule__AtomicRelationalTerm__Group__2__Impl rule__AtomicRelationalTerm__Group__3 ;
    public final void rule__AtomicRelationalTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3232:1: ( rule__AtomicRelationalTerm__Group__2__Impl rule__AtomicRelationalTerm__Group__3 )
            // InternalHal.g:3233:2: rule__AtomicRelationalTerm__Group__2__Impl rule__AtomicRelationalTerm__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__AtomicRelationalTerm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicRelationalTerm__Group__3();

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
    // $ANTLR end "rule__AtomicRelationalTerm__Group__2"


    // $ANTLR start "rule__AtomicRelationalTerm__Group__2__Impl"
    // InternalHal.g:3240:1: rule__AtomicRelationalTerm__Group__2__Impl : ( ( rule__AtomicRelationalTerm__OperatorAssignment_2 ) ) ;
    public final void rule__AtomicRelationalTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3244:1: ( ( ( rule__AtomicRelationalTerm__OperatorAssignment_2 ) ) )
            // InternalHal.g:3245:1: ( ( rule__AtomicRelationalTerm__OperatorAssignment_2 ) )
            {
            // InternalHal.g:3245:1: ( ( rule__AtomicRelationalTerm__OperatorAssignment_2 ) )
            // InternalHal.g:3246:2: ( rule__AtomicRelationalTerm__OperatorAssignment_2 )
            {
             before(grammarAccess.getAtomicRelationalTermAccess().getOperatorAssignment_2()); 
            // InternalHal.g:3247:2: ( rule__AtomicRelationalTerm__OperatorAssignment_2 )
            // InternalHal.g:3247:3: rule__AtomicRelationalTerm__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomicRelationalTerm__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicRelationalTermAccess().getOperatorAssignment_2()); 

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
    // $ANTLR end "rule__AtomicRelationalTerm__Group__2__Impl"


    // $ANTLR start "rule__AtomicRelationalTerm__Group__3"
    // InternalHal.g:3255:1: rule__AtomicRelationalTerm__Group__3 : rule__AtomicRelationalTerm__Group__3__Impl ;
    public final void rule__AtomicRelationalTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3259:1: ( rule__AtomicRelationalTerm__Group__3__Impl )
            // InternalHal.g:3260:2: rule__AtomicRelationalTerm__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicRelationalTerm__Group__3__Impl();

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
    // $ANTLR end "rule__AtomicRelationalTerm__Group__3"


    // $ANTLR start "rule__AtomicRelationalTerm__Group__3__Impl"
    // InternalHal.g:3266:1: rule__AtomicRelationalTerm__Group__3__Impl : ( ( rule__AtomicRelationalTerm__ComparedAgainstValueAssignment_3 ) ) ;
    public final void rule__AtomicRelationalTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3270:1: ( ( ( rule__AtomicRelationalTerm__ComparedAgainstValueAssignment_3 ) ) )
            // InternalHal.g:3271:1: ( ( rule__AtomicRelationalTerm__ComparedAgainstValueAssignment_3 ) )
            {
            // InternalHal.g:3271:1: ( ( rule__AtomicRelationalTerm__ComparedAgainstValueAssignment_3 ) )
            // InternalHal.g:3272:2: ( rule__AtomicRelationalTerm__ComparedAgainstValueAssignment_3 )
            {
             before(grammarAccess.getAtomicRelationalTermAccess().getComparedAgainstValueAssignment_3()); 
            // InternalHal.g:3273:2: ( rule__AtomicRelationalTerm__ComparedAgainstValueAssignment_3 )
            // InternalHal.g:3273:3: rule__AtomicRelationalTerm__ComparedAgainstValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AtomicRelationalTerm__ComparedAgainstValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtomicRelationalTermAccess().getComparedAgainstValueAssignment_3()); 

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
    // $ANTLR end "rule__AtomicRelationalTerm__Group__3__Impl"


    // $ANTLR start "rule__CompoundRelationalTerm__Group__0"
    // InternalHal.g:3282:1: rule__CompoundRelationalTerm__Group__0 : rule__CompoundRelationalTerm__Group__0__Impl rule__CompoundRelationalTerm__Group__1 ;
    public final void rule__CompoundRelationalTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3286:1: ( rule__CompoundRelationalTerm__Group__0__Impl rule__CompoundRelationalTerm__Group__1 )
            // InternalHal.g:3287:2: rule__CompoundRelationalTerm__Group__0__Impl rule__CompoundRelationalTerm__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__CompoundRelationalTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundRelationalTerm__Group__1();

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
    // $ANTLR end "rule__CompoundRelationalTerm__Group__0"


    // $ANTLR start "rule__CompoundRelationalTerm__Group__0__Impl"
    // InternalHal.g:3294:1: rule__CompoundRelationalTerm__Group__0__Impl : ( ( rule__CompoundRelationalTerm__NegatedAssignment_0 )? ) ;
    public final void rule__CompoundRelationalTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3298:1: ( ( ( rule__CompoundRelationalTerm__NegatedAssignment_0 )? ) )
            // InternalHal.g:3299:1: ( ( rule__CompoundRelationalTerm__NegatedAssignment_0 )? )
            {
            // InternalHal.g:3299:1: ( ( rule__CompoundRelationalTerm__NegatedAssignment_0 )? )
            // InternalHal.g:3300:2: ( rule__CompoundRelationalTerm__NegatedAssignment_0 )?
            {
             before(grammarAccess.getCompoundRelationalTermAccess().getNegatedAssignment_0()); 
            // InternalHal.g:3301:2: ( rule__CompoundRelationalTerm__NegatedAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalHal.g:3301:3: rule__CompoundRelationalTerm__NegatedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompoundRelationalTerm__NegatedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundRelationalTermAccess().getNegatedAssignment_0()); 

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
    // $ANTLR end "rule__CompoundRelationalTerm__Group__0__Impl"


    // $ANTLR start "rule__CompoundRelationalTerm__Group__1"
    // InternalHal.g:3309:1: rule__CompoundRelationalTerm__Group__1 : rule__CompoundRelationalTerm__Group__1__Impl rule__CompoundRelationalTerm__Group__2 ;
    public final void rule__CompoundRelationalTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3313:1: ( rule__CompoundRelationalTerm__Group__1__Impl rule__CompoundRelationalTerm__Group__2 )
            // InternalHal.g:3314:2: rule__CompoundRelationalTerm__Group__1__Impl rule__CompoundRelationalTerm__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__CompoundRelationalTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundRelationalTerm__Group__2();

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
    // $ANTLR end "rule__CompoundRelationalTerm__Group__1"


    // $ANTLR start "rule__CompoundRelationalTerm__Group__1__Impl"
    // InternalHal.g:3321:1: rule__CompoundRelationalTerm__Group__1__Impl : ( '(' ) ;
    public final void rule__CompoundRelationalTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3325:1: ( ( '(' ) )
            // InternalHal.g:3326:1: ( '(' )
            {
            // InternalHal.g:3326:1: ( '(' )
            // InternalHal.g:3327:2: '('
            {
             before(grammarAccess.getCompoundRelationalTermAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCompoundRelationalTermAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__CompoundRelationalTerm__Group__1__Impl"


    // $ANTLR start "rule__CompoundRelationalTerm__Group__2"
    // InternalHal.g:3336:1: rule__CompoundRelationalTerm__Group__2 : rule__CompoundRelationalTerm__Group__2__Impl rule__CompoundRelationalTerm__Group__3 ;
    public final void rule__CompoundRelationalTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3340:1: ( rule__CompoundRelationalTerm__Group__2__Impl rule__CompoundRelationalTerm__Group__3 )
            // InternalHal.g:3341:2: rule__CompoundRelationalTerm__Group__2__Impl rule__CompoundRelationalTerm__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__CompoundRelationalTerm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundRelationalTerm__Group__3();

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
    // $ANTLR end "rule__CompoundRelationalTerm__Group__2"


    // $ANTLR start "rule__CompoundRelationalTerm__Group__2__Impl"
    // InternalHal.g:3348:1: rule__CompoundRelationalTerm__Group__2__Impl : ( ( rule__CompoundRelationalTerm__LHSAssignment_2 ) ) ;
    public final void rule__CompoundRelationalTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3352:1: ( ( ( rule__CompoundRelationalTerm__LHSAssignment_2 ) ) )
            // InternalHal.g:3353:1: ( ( rule__CompoundRelationalTerm__LHSAssignment_2 ) )
            {
            // InternalHal.g:3353:1: ( ( rule__CompoundRelationalTerm__LHSAssignment_2 ) )
            // InternalHal.g:3354:2: ( rule__CompoundRelationalTerm__LHSAssignment_2 )
            {
             before(grammarAccess.getCompoundRelationalTermAccess().getLHSAssignment_2()); 
            // InternalHal.g:3355:2: ( rule__CompoundRelationalTerm__LHSAssignment_2 )
            // InternalHal.g:3355:3: rule__CompoundRelationalTerm__LHSAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompoundRelationalTerm__LHSAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompoundRelationalTermAccess().getLHSAssignment_2()); 

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
    // $ANTLR end "rule__CompoundRelationalTerm__Group__2__Impl"


    // $ANTLR start "rule__CompoundRelationalTerm__Group__3"
    // InternalHal.g:3363:1: rule__CompoundRelationalTerm__Group__3 : rule__CompoundRelationalTerm__Group__3__Impl rule__CompoundRelationalTerm__Group__4 ;
    public final void rule__CompoundRelationalTerm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3367:1: ( rule__CompoundRelationalTerm__Group__3__Impl rule__CompoundRelationalTerm__Group__4 )
            // InternalHal.g:3368:2: rule__CompoundRelationalTerm__Group__3__Impl rule__CompoundRelationalTerm__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__CompoundRelationalTerm__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundRelationalTerm__Group__4();

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
    // $ANTLR end "rule__CompoundRelationalTerm__Group__3"


    // $ANTLR start "rule__CompoundRelationalTerm__Group__3__Impl"
    // InternalHal.g:3375:1: rule__CompoundRelationalTerm__Group__3__Impl : ( ( rule__CompoundRelationalTerm__OperatorAssignment_3 ) ) ;
    public final void rule__CompoundRelationalTerm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3379:1: ( ( ( rule__CompoundRelationalTerm__OperatorAssignment_3 ) ) )
            // InternalHal.g:3380:1: ( ( rule__CompoundRelationalTerm__OperatorAssignment_3 ) )
            {
            // InternalHal.g:3380:1: ( ( rule__CompoundRelationalTerm__OperatorAssignment_3 ) )
            // InternalHal.g:3381:2: ( rule__CompoundRelationalTerm__OperatorAssignment_3 )
            {
             before(grammarAccess.getCompoundRelationalTermAccess().getOperatorAssignment_3()); 
            // InternalHal.g:3382:2: ( rule__CompoundRelationalTerm__OperatorAssignment_3 )
            // InternalHal.g:3382:3: rule__CompoundRelationalTerm__OperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CompoundRelationalTerm__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompoundRelationalTermAccess().getOperatorAssignment_3()); 

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
    // $ANTLR end "rule__CompoundRelationalTerm__Group__3__Impl"


    // $ANTLR start "rule__CompoundRelationalTerm__Group__4"
    // InternalHal.g:3390:1: rule__CompoundRelationalTerm__Group__4 : rule__CompoundRelationalTerm__Group__4__Impl rule__CompoundRelationalTerm__Group__5 ;
    public final void rule__CompoundRelationalTerm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3394:1: ( rule__CompoundRelationalTerm__Group__4__Impl rule__CompoundRelationalTerm__Group__5 )
            // InternalHal.g:3395:2: rule__CompoundRelationalTerm__Group__4__Impl rule__CompoundRelationalTerm__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__CompoundRelationalTerm__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundRelationalTerm__Group__5();

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
    // $ANTLR end "rule__CompoundRelationalTerm__Group__4"


    // $ANTLR start "rule__CompoundRelationalTerm__Group__4__Impl"
    // InternalHal.g:3402:1: rule__CompoundRelationalTerm__Group__4__Impl : ( ( rule__CompoundRelationalTerm__RHSAssignment_4 ) ) ;
    public final void rule__CompoundRelationalTerm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3406:1: ( ( ( rule__CompoundRelationalTerm__RHSAssignment_4 ) ) )
            // InternalHal.g:3407:1: ( ( rule__CompoundRelationalTerm__RHSAssignment_4 ) )
            {
            // InternalHal.g:3407:1: ( ( rule__CompoundRelationalTerm__RHSAssignment_4 ) )
            // InternalHal.g:3408:2: ( rule__CompoundRelationalTerm__RHSAssignment_4 )
            {
             before(grammarAccess.getCompoundRelationalTermAccess().getRHSAssignment_4()); 
            // InternalHal.g:3409:2: ( rule__CompoundRelationalTerm__RHSAssignment_4 )
            // InternalHal.g:3409:3: rule__CompoundRelationalTerm__RHSAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CompoundRelationalTerm__RHSAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCompoundRelationalTermAccess().getRHSAssignment_4()); 

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
    // $ANTLR end "rule__CompoundRelationalTerm__Group__4__Impl"


    // $ANTLR start "rule__CompoundRelationalTerm__Group__5"
    // InternalHal.g:3417:1: rule__CompoundRelationalTerm__Group__5 : rule__CompoundRelationalTerm__Group__5__Impl ;
    public final void rule__CompoundRelationalTerm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3421:1: ( rule__CompoundRelationalTerm__Group__5__Impl )
            // InternalHal.g:3422:2: rule__CompoundRelationalTerm__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompoundRelationalTerm__Group__5__Impl();

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
    // $ANTLR end "rule__CompoundRelationalTerm__Group__5"


    // $ANTLR start "rule__CompoundRelationalTerm__Group__5__Impl"
    // InternalHal.g:3428:1: rule__CompoundRelationalTerm__Group__5__Impl : ( ')' ) ;
    public final void rule__CompoundRelationalTerm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3432:1: ( ( ')' ) )
            // InternalHal.g:3433:1: ( ')' )
            {
            // InternalHal.g:3433:1: ( ')' )
            // InternalHal.g:3434:2: ')'
            {
             before(grammarAccess.getCompoundRelationalTermAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCompoundRelationalTermAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__CompoundRelationalTerm__Group__5__Impl"


    // $ANTLR start "rule__Command__Group__0"
    // InternalHal.g:3444:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3448:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // InternalHal.g:3449:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Command__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__1();

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
    // $ANTLR end "rule__Command__Group__0"


    // $ANTLR start "rule__Command__Group__0__Impl"
    // InternalHal.g:3456:1: rule__Command__Group__0__Impl : ( () ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3460:1: ( ( () ) )
            // InternalHal.g:3461:1: ( () )
            {
            // InternalHal.g:3461:1: ( () )
            // InternalHal.g:3462:2: ()
            {
             before(grammarAccess.getCommandAccess().getCommandAction_0()); 
            // InternalHal.g:3463:2: ()
            // InternalHal.g:3463:3: 
            {
            }

             after(grammarAccess.getCommandAccess().getCommandAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0__Impl"


    // $ANTLR start "rule__Command__Group__1"
    // InternalHal.g:3471:1: rule__Command__Group__1 : rule__Command__Group__1__Impl ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3475:1: ( rule__Command__Group__1__Impl )
            // InternalHal.g:3476:2: rule__Command__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__1__Impl();

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
    // $ANTLR end "rule__Command__Group__1"


    // $ANTLR start "rule__Command__Group__1__Impl"
    // InternalHal.g:3482:1: rule__Command__Group__1__Impl : ( ( rule__Command__NameAssignment_1 ) ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3486:1: ( ( ( rule__Command__NameAssignment_1 ) ) )
            // InternalHal.g:3487:1: ( ( rule__Command__NameAssignment_1 ) )
            {
            // InternalHal.g:3487:1: ( ( rule__Command__NameAssignment_1 ) )
            // InternalHal.g:3488:2: ( rule__Command__NameAssignment_1 )
            {
             before(grammarAccess.getCommandAccess().getNameAssignment_1()); 
            // InternalHal.g:3489:2: ( rule__Command__NameAssignment_1 )
            // InternalHal.g:3489:3: rule__Command__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Command__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Command__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalHal.g:3498:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3502:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalHal.g:3503:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

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
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalHal.g:3510:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3514:1: ( ( () ) )
            // InternalHal.g:3515:1: ( () )
            {
            // InternalHal.g:3515:1: ( () )
            // InternalHal.g:3516:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalHal.g:3517:2: ()
            // InternalHal.g:3517:3: 
            {
            }

             after(grammarAccess.getSensorAccess().getSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalHal.g:3525:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3529:1: ( rule__Sensor__Group__1__Impl )
            // InternalHal.g:3530:2: rule__Sensor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalHal.g:3536:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3540:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalHal.g:3541:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalHal.g:3541:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalHal.g:3542:2: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // InternalHal.g:3543:2: ( rule__Sensor__NameAssignment_1 )
            // InternalHal.g:3543:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalHal.g:3552:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3556:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalHal.g:3557:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1();

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
    // $ANTLR end "rule__Actuator__Group__0"


    // $ANTLR start "rule__Actuator__Group__0__Impl"
    // InternalHal.g:3564:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3568:1: ( ( () ) )
            // InternalHal.g:3569:1: ( () )
            {
            // InternalHal.g:3569:1: ( () )
            // InternalHal.g:3570:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalHal.g:3571:2: ()
            // InternalHal.g:3571:3: 
            {
            }

             after(grammarAccess.getActuatorAccess().getActuatorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0__Impl"


    // $ANTLR start "rule__Actuator__Group__1"
    // InternalHal.g:3579:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl rule__Actuator__Group__2 ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3583:1: ( rule__Actuator__Group__1__Impl rule__Actuator__Group__2 )
            // InternalHal.g:3584:2: rule__Actuator__Group__1__Impl rule__Actuator__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Actuator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__2();

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
    // $ANTLR end "rule__Actuator__Group__1"


    // $ANTLR start "rule__Actuator__Group__1__Impl"
    // InternalHal.g:3591:1: rule__Actuator__Group__1__Impl : ( ( rule__Actuator__NameAssignment_1 ) ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3595:1: ( ( ( rule__Actuator__NameAssignment_1 ) ) )
            // InternalHal.g:3596:1: ( ( rule__Actuator__NameAssignment_1 ) )
            {
            // InternalHal.g:3596:1: ( ( rule__Actuator__NameAssignment_1 ) )
            // InternalHal.g:3597:2: ( rule__Actuator__NameAssignment_1 )
            {
             before(grammarAccess.getActuatorAccess().getNameAssignment_1()); 
            // InternalHal.g:3598:2: ( rule__Actuator__NameAssignment_1 )
            // InternalHal.g:3598:3: rule__Actuator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Actuator__Group__1__Impl"


    // $ANTLR start "rule__Actuator__Group__2"
    // InternalHal.g:3606:1: rule__Actuator__Group__2 : rule__Actuator__Group__2__Impl rule__Actuator__Group__3 ;
    public final void rule__Actuator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3610:1: ( rule__Actuator__Group__2__Impl rule__Actuator__Group__3 )
            // InternalHal.g:3611:2: rule__Actuator__Group__2__Impl rule__Actuator__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Actuator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__3();

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
    // $ANTLR end "rule__Actuator__Group__2"


    // $ANTLR start "rule__Actuator__Group__2__Impl"
    // InternalHal.g:3618:1: rule__Actuator__Group__2__Impl : ( '{' ) ;
    public final void rule__Actuator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3622:1: ( ( '{' ) )
            // InternalHal.g:3623:1: ( '{' )
            {
            // InternalHal.g:3623:1: ( '{' )
            // InternalHal.g:3624:2: '{'
            {
             before(grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Actuator__Group__2__Impl"


    // $ANTLR start "rule__Actuator__Group__3"
    // InternalHal.g:3633:1: rule__Actuator__Group__3 : rule__Actuator__Group__3__Impl rule__Actuator__Group__4 ;
    public final void rule__Actuator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3637:1: ( rule__Actuator__Group__3__Impl rule__Actuator__Group__4 )
            // InternalHal.g:3638:2: rule__Actuator__Group__3__Impl rule__Actuator__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Actuator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__4();

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
    // $ANTLR end "rule__Actuator__Group__3"


    // $ANTLR start "rule__Actuator__Group__3__Impl"
    // InternalHal.g:3645:1: rule__Actuator__Group__3__Impl : ( ( rule__Actuator__Group_3__0 )? ) ;
    public final void rule__Actuator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3649:1: ( ( ( rule__Actuator__Group_3__0 )? ) )
            // InternalHal.g:3650:1: ( ( rule__Actuator__Group_3__0 )? )
            {
            // InternalHal.g:3650:1: ( ( rule__Actuator__Group_3__0 )? )
            // InternalHal.g:3651:2: ( rule__Actuator__Group_3__0 )?
            {
             before(grammarAccess.getActuatorAccess().getGroup_3()); 
            // InternalHal.g:3652:2: ( rule__Actuator__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalHal.g:3652:3: rule__Actuator__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actuator__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActuatorAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Actuator__Group__3__Impl"


    // $ANTLR start "rule__Actuator__Group__4"
    // InternalHal.g:3660:1: rule__Actuator__Group__4 : rule__Actuator__Group__4__Impl ;
    public final void rule__Actuator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3664:1: ( rule__Actuator__Group__4__Impl )
            // InternalHal.g:3665:2: rule__Actuator__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__4__Impl();

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
    // $ANTLR end "rule__Actuator__Group__4"


    // $ANTLR start "rule__Actuator__Group__4__Impl"
    // InternalHal.g:3671:1: rule__Actuator__Group__4__Impl : ( '}' ) ;
    public final void rule__Actuator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3675:1: ( ( '}' ) )
            // InternalHal.g:3676:1: ( '}' )
            {
            // InternalHal.g:3676:1: ( '}' )
            // InternalHal.g:3677:2: '}'
            {
             before(grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Actuator__Group__4__Impl"


    // $ANTLR start "rule__Actuator__Group_3__0"
    // InternalHal.g:3687:1: rule__Actuator__Group_3__0 : rule__Actuator__Group_3__0__Impl rule__Actuator__Group_3__1 ;
    public final void rule__Actuator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3691:1: ( rule__Actuator__Group_3__0__Impl rule__Actuator__Group_3__1 )
            // InternalHal.g:3692:2: rule__Actuator__Group_3__0__Impl rule__Actuator__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Actuator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group_3__1();

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
    // $ANTLR end "rule__Actuator__Group_3__0"


    // $ANTLR start "rule__Actuator__Group_3__0__Impl"
    // InternalHal.g:3699:1: rule__Actuator__Group_3__0__Impl : ( ( rule__Actuator__CommandsAssignment_3_0 ) ) ;
    public final void rule__Actuator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3703:1: ( ( ( rule__Actuator__CommandsAssignment_3_0 ) ) )
            // InternalHal.g:3704:1: ( ( rule__Actuator__CommandsAssignment_3_0 ) )
            {
            // InternalHal.g:3704:1: ( ( rule__Actuator__CommandsAssignment_3_0 ) )
            // InternalHal.g:3705:2: ( rule__Actuator__CommandsAssignment_3_0 )
            {
             before(grammarAccess.getActuatorAccess().getCommandsAssignment_3_0()); 
            // InternalHal.g:3706:2: ( rule__Actuator__CommandsAssignment_3_0 )
            // InternalHal.g:3706:3: rule__Actuator__CommandsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__CommandsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getCommandsAssignment_3_0()); 

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
    // $ANTLR end "rule__Actuator__Group_3__0__Impl"


    // $ANTLR start "rule__Actuator__Group_3__1"
    // InternalHal.g:3714:1: rule__Actuator__Group_3__1 : rule__Actuator__Group_3__1__Impl ;
    public final void rule__Actuator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3718:1: ( rule__Actuator__Group_3__1__Impl )
            // InternalHal.g:3719:2: rule__Actuator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group_3__1__Impl();

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
    // $ANTLR end "rule__Actuator__Group_3__1"


    // $ANTLR start "rule__Actuator__Group_3__1__Impl"
    // InternalHal.g:3725:1: rule__Actuator__Group_3__1__Impl : ( ( rule__Actuator__Group_3_1__0 )* ) ;
    public final void rule__Actuator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3729:1: ( ( ( rule__Actuator__Group_3_1__0 )* ) )
            // InternalHal.g:3730:1: ( ( rule__Actuator__Group_3_1__0 )* )
            {
            // InternalHal.g:3730:1: ( ( rule__Actuator__Group_3_1__0 )* )
            // InternalHal.g:3731:2: ( rule__Actuator__Group_3_1__0 )*
            {
             before(grammarAccess.getActuatorAccess().getGroup_3_1()); 
            // InternalHal.g:3732:2: ( rule__Actuator__Group_3_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalHal.g:3732:3: rule__Actuator__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Actuator__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getActuatorAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Actuator__Group_3__1__Impl"


    // $ANTLR start "rule__Actuator__Group_3_1__0"
    // InternalHal.g:3741:1: rule__Actuator__Group_3_1__0 : rule__Actuator__Group_3_1__0__Impl rule__Actuator__Group_3_1__1 ;
    public final void rule__Actuator__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3745:1: ( rule__Actuator__Group_3_1__0__Impl rule__Actuator__Group_3_1__1 )
            // InternalHal.g:3746:2: rule__Actuator__Group_3_1__0__Impl rule__Actuator__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Actuator__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group_3_1__1();

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
    // $ANTLR end "rule__Actuator__Group_3_1__0"


    // $ANTLR start "rule__Actuator__Group_3_1__0__Impl"
    // InternalHal.g:3753:1: rule__Actuator__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Actuator__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3757:1: ( ( ',' ) )
            // InternalHal.g:3758:1: ( ',' )
            {
            // InternalHal.g:3758:1: ( ',' )
            // InternalHal.g:3759:2: ','
            {
             before(grammarAccess.getActuatorAccess().getCommaKeyword_3_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Actuator__Group_3_1__0__Impl"


    // $ANTLR start "rule__Actuator__Group_3_1__1"
    // InternalHal.g:3768:1: rule__Actuator__Group_3_1__1 : rule__Actuator__Group_3_1__1__Impl ;
    public final void rule__Actuator__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3772:1: ( rule__Actuator__Group_3_1__1__Impl )
            // InternalHal.g:3773:2: rule__Actuator__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Actuator__Group_3_1__1"


    // $ANTLR start "rule__Actuator__Group_3_1__1__Impl"
    // InternalHal.g:3779:1: rule__Actuator__Group_3_1__1__Impl : ( ( rule__Actuator__CommandsAssignment_3_1_1 ) ) ;
    public final void rule__Actuator__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3783:1: ( ( ( rule__Actuator__CommandsAssignment_3_1_1 ) ) )
            // InternalHal.g:3784:1: ( ( rule__Actuator__CommandsAssignment_3_1_1 ) )
            {
            // InternalHal.g:3784:1: ( ( rule__Actuator__CommandsAssignment_3_1_1 ) )
            // InternalHal.g:3785:2: ( rule__Actuator__CommandsAssignment_3_1_1 )
            {
             before(grammarAccess.getActuatorAccess().getCommandsAssignment_3_1_1()); 
            // InternalHal.g:3786:2: ( rule__Actuator__CommandsAssignment_3_1_1 )
            // InternalHal.g:3786:3: rule__Actuator__CommandsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__CommandsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getCommandsAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Actuator__Group_3_1__1__Impl"


    // $ANTLR start "rule__HAL__PasswordAssignment_1"
    // InternalHal.g:3795:1: rule__HAL__PasswordAssignment_1 : ( RULE_STRING ) ;
    public final void rule__HAL__PasswordAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3799:1: ( ( RULE_STRING ) )
            // InternalHal.g:3800:2: ( RULE_STRING )
            {
            // InternalHal.g:3800:2: ( RULE_STRING )
            // InternalHal.g:3801:3: RULE_STRING
            {
             before(grammarAccess.getHALAccess().getPasswordSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getPasswordSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__HAL__PasswordAssignment_1"


    // $ANTLR start "rule__HAL__AddressAssignment_3"
    // InternalHal.g:3810:1: rule__HAL__AddressAssignment_3 : ( RULE_STRING ) ;
    public final void rule__HAL__AddressAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3814:1: ( ( RULE_STRING ) )
            // InternalHal.g:3815:2: ( RULE_STRING )
            {
            // InternalHal.g:3815:2: ( RULE_STRING )
            // InternalHal.g:3816:3: RULE_STRING
            {
             before(grammarAccess.getHALAccess().getAddressSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHALAccess().getAddressSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__HAL__AddressAssignment_3"


    // $ANTLR start "rule__HAL__TypesAssignment_4_2_2"
    // InternalHal.g:3825:1: rule__HAL__TypesAssignment_4_2_2 : ( ruleSensor ) ;
    public final void rule__HAL__TypesAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3829:1: ( ( ruleSensor ) )
            // InternalHal.g:3830:2: ( ruleSensor )
            {
            // InternalHal.g:3830:2: ( ruleSensor )
            // InternalHal.g:3831:3: ruleSensor
            {
             before(grammarAccess.getHALAccess().getTypesSensorParserRuleCall_4_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getHALAccess().getTypesSensorParserRuleCall_4_2_2_0()); 

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
    // $ANTLR end "rule__HAL__TypesAssignment_4_2_2"


    // $ANTLR start "rule__HAL__TypesAssignment_4_2_3_1"
    // InternalHal.g:3840:1: rule__HAL__TypesAssignment_4_2_3_1 : ( ruleSensor ) ;
    public final void rule__HAL__TypesAssignment_4_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3844:1: ( ( ruleSensor ) )
            // InternalHal.g:3845:2: ( ruleSensor )
            {
            // InternalHal.g:3845:2: ( ruleSensor )
            // InternalHal.g:3846:3: ruleSensor
            {
             before(grammarAccess.getHALAccess().getTypesSensorParserRuleCall_4_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getHALAccess().getTypesSensorParserRuleCall_4_2_3_1_0()); 

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
    // $ANTLR end "rule__HAL__TypesAssignment_4_2_3_1"


    // $ANTLR start "rule__HAL__TypesAssignment_4_3_2"
    // InternalHal.g:3855:1: rule__HAL__TypesAssignment_4_3_2 : ( ruleActuator ) ;
    public final void rule__HAL__TypesAssignment_4_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3859:1: ( ( ruleActuator ) )
            // InternalHal.g:3860:2: ( ruleActuator )
            {
            // InternalHal.g:3860:2: ( ruleActuator )
            // InternalHal.g:3861:3: ruleActuator
            {
             before(grammarAccess.getHALAccess().getTypesActuatorParserRuleCall_4_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getHALAccess().getTypesActuatorParserRuleCall_4_3_2_0()); 

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
    // $ANTLR end "rule__HAL__TypesAssignment_4_3_2"


    // $ANTLR start "rule__HAL__RoomsAssignment_5_2"
    // InternalHal.g:3870:1: rule__HAL__RoomsAssignment_5_2 : ( ruleRoom ) ;
    public final void rule__HAL__RoomsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3874:1: ( ( ruleRoom ) )
            // InternalHal.g:3875:2: ( ruleRoom )
            {
            // InternalHal.g:3875:2: ( ruleRoom )
            // InternalHal.g:3876:3: ruleRoom
            {
             before(grammarAccess.getHALAccess().getRoomsRoomParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getHALAccess().getRoomsRoomParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__HAL__RoomsAssignment_5_2"


    // $ANTLR start "rule__HAL__RulesAssignment_6_2"
    // InternalHal.g:3885:1: rule__HAL__RulesAssignment_6_2 : ( ruleAutomationRule ) ;
    public final void rule__HAL__RulesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3889:1: ( ( ruleAutomationRule ) )
            // InternalHal.g:3890:2: ( ruleAutomationRule )
            {
            // InternalHal.g:3890:2: ( ruleAutomationRule )
            // InternalHal.g:3891:3: ruleAutomationRule
            {
             before(grammarAccess.getHALAccess().getRulesAutomationRuleParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAutomationRule();

            state._fsp--;

             after(grammarAccess.getHALAccess().getRulesAutomationRuleParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__HAL__RulesAssignment_6_2"


    // $ANTLR start "rule__HAL__EntriesAssignment_7_2"
    // InternalHal.g:3900:1: rule__HAL__EntriesAssignment_7_2 : ( ruleSensorEntry ) ;
    public final void rule__HAL__EntriesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3904:1: ( ( ruleSensorEntry ) )
            // InternalHal.g:3905:2: ( ruleSensorEntry )
            {
            // InternalHal.g:3905:2: ( ruleSensorEntry )
            // InternalHal.g:3906:3: ruleSensorEntry
            {
             before(grammarAccess.getHALAccess().getEntriesSensorEntryParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorEntry();

            state._fsp--;

             after(grammarAccess.getHALAccess().getEntriesSensorEntryParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__HAL__EntriesAssignment_7_2"


    // $ANTLR start "rule__Room__NameAssignment_0"
    // InternalHal.g:3915:1: rule__Room__NameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__Room__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3919:1: ( ( ruleQualifiedName ) )
            // InternalHal.g:3920:2: ( ruleQualifiedName )
            {
            // InternalHal.g:3920:2: ( ruleQualifiedName )
            // InternalHal.g:3921:3: ruleQualifiedName
            {
             before(grammarAccess.getRoomAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getNameQualifiedNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Room__NameAssignment_0"


    // $ANTLR start "rule__Room__LengthAssignment_2"
    // InternalHal.g:3930:1: rule__Room__LengthAssignment_2 : ( rulePosFloat ) ;
    public final void rule__Room__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3934:1: ( ( rulePosFloat ) )
            // InternalHal.g:3935:2: ( rulePosFloat )
            {
            // InternalHal.g:3935:2: ( rulePosFloat )
            // InternalHal.g:3936:3: rulePosFloat
            {
             before(grammarAccess.getRoomAccess().getLengthPosFloatParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePosFloat();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getLengthPosFloatParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Room__LengthAssignment_2"


    // $ANTLR start "rule__Room__WidthAssignment_4"
    // InternalHal.g:3945:1: rule__Room__WidthAssignment_4 : ( rulePosFloat ) ;
    public final void rule__Room__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3949:1: ( ( rulePosFloat ) )
            // InternalHal.g:3950:2: ( rulePosFloat )
            {
            // InternalHal.g:3950:2: ( rulePosFloat )
            // InternalHal.g:3951:3: rulePosFloat
            {
             before(grammarAccess.getRoomAccess().getWidthPosFloatParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePosFloat();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getWidthPosFloatParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Room__WidthAssignment_4"


    // $ANTLR start "rule__Room__DevicesAssignment_7_0"
    // InternalHal.g:3960:1: rule__Room__DevicesAssignment_7_0 : ( ruleDevice ) ;
    public final void rule__Room__DevicesAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3964:1: ( ( ruleDevice ) )
            // InternalHal.g:3965:2: ( ruleDevice )
            {
            // InternalHal.g:3965:2: ( ruleDevice )
            // InternalHal.g:3966:3: ruleDevice
            {
             before(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__Room__DevicesAssignment_7_0"


    // $ANTLR start "rule__Room__DevicesAssignment_7_1_1"
    // InternalHal.g:3975:1: rule__Room__DevicesAssignment_7_1_1 : ( ruleDevice ) ;
    public final void rule__Room__DevicesAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3979:1: ( ( ruleDevice ) )
            // InternalHal.g:3980:2: ( ruleDevice )
            {
            // InternalHal.g:3980:2: ( ruleDevice )
            // InternalHal.g:3981:3: ruleDevice
            {
             before(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_7_1_1_0()); 

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
    // $ANTLR end "rule__Room__DevicesAssignment_7_1_1"


    // $ANTLR start "rule__AutomationRule__NameAssignment_0"
    // InternalHal.g:3990:1: rule__AutomationRule__NameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__AutomationRule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:3994:1: ( ( ruleQualifiedName ) )
            // InternalHal.g:3995:2: ( ruleQualifiedName )
            {
            // InternalHal.g:3995:2: ( ruleQualifiedName )
            // InternalHal.g:3996:3: ruleQualifiedName
            {
             before(grammarAccess.getAutomationRuleAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAutomationRuleAccess().getNameQualifiedNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AutomationRule__NameAssignment_0"


    // $ANTLR start "rule__AutomationRule__ActiveAssignment_1_1"
    // InternalHal.g:4005:1: rule__AutomationRule__ActiveAssignment_1_1 : ( ( 'active' ) ) ;
    public final void rule__AutomationRule__ActiveAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4009:1: ( ( ( 'active' ) ) )
            // InternalHal.g:4010:2: ( ( 'active' ) )
            {
            // InternalHal.g:4010:2: ( ( 'active' ) )
            // InternalHal.g:4011:3: ( 'active' )
            {
             before(grammarAccess.getAutomationRuleAccess().getActiveActiveKeyword_1_1_0()); 
            // InternalHal.g:4012:3: ( 'active' )
            // InternalHal.g:4013:4: 'active'
            {
             before(grammarAccess.getAutomationRuleAccess().getActiveActiveKeyword_1_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAutomationRuleAccess().getActiveActiveKeyword_1_1_0()); 

            }

             after(grammarAccess.getAutomationRuleAccess().getActiveActiveKeyword_1_1_0()); 

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
    // $ANTLR end "rule__AutomationRule__ActiveAssignment_1_1"


    // $ANTLR start "rule__AutomationRule__PreconditionAssignment_4"
    // InternalHal.g:4024:1: rule__AutomationRule__PreconditionAssignment_4 : ( ruleBooleanExpression ) ;
    public final void rule__AutomationRule__PreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4028:1: ( ( ruleBooleanExpression ) )
            // InternalHal.g:4029:2: ( ruleBooleanExpression )
            {
            // InternalHal.g:4029:2: ( ruleBooleanExpression )
            // InternalHal.g:4030:3: ruleBooleanExpression
            {
             before(grammarAccess.getAutomationRuleAccess().getPreconditionBooleanExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getAutomationRuleAccess().getPreconditionBooleanExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__AutomationRule__PreconditionAssignment_4"


    // $ANTLR start "rule__AutomationRule__ActionsAssignment_6"
    // InternalHal.g:4039:1: rule__AutomationRule__ActionsAssignment_6 : ( ruleAction ) ;
    public final void rule__AutomationRule__ActionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4043:1: ( ( ruleAction ) )
            // InternalHal.g:4044:2: ( ruleAction )
            {
            // InternalHal.g:4044:2: ( ruleAction )
            // InternalHal.g:4045:3: ruleAction
            {
             before(grammarAccess.getAutomationRuleAccess().getActionsActionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getAutomationRuleAccess().getActionsActionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__AutomationRule__ActionsAssignment_6"


    // $ANTLR start "rule__AutomationRule__ActionsAssignment_7_1"
    // InternalHal.g:4054:1: rule__AutomationRule__ActionsAssignment_7_1 : ( ruleAction ) ;
    public final void rule__AutomationRule__ActionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4058:1: ( ( ruleAction ) )
            // InternalHal.g:4059:2: ( ruleAction )
            {
            // InternalHal.g:4059:2: ( ruleAction )
            // InternalHal.g:4060:3: ruleAction
            {
             before(grammarAccess.getAutomationRuleAccess().getActionsActionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getAutomationRuleAccess().getActionsActionParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__AutomationRule__ActionsAssignment_7_1"


    // $ANTLR start "rule__SensorEntry__SensorAssignment_0"
    // InternalHal.g:4069:1: rule__SensorEntry__SensorAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SensorEntry__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4073:1: ( ( ( ruleQualifiedName ) ) )
            // InternalHal.g:4074:2: ( ( ruleQualifiedName ) )
            {
            // InternalHal.g:4074:2: ( ( ruleQualifiedName ) )
            // InternalHal.g:4075:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSensorEntryAccess().getSensorDeviceCrossReference_0_0()); 
            // InternalHal.g:4076:3: ( ruleQualifiedName )
            // InternalHal.g:4077:4: ruleQualifiedName
            {
             before(grammarAccess.getSensorEntryAccess().getSensorDeviceQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSensorEntryAccess().getSensorDeviceQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSensorEntryAccess().getSensorDeviceCrossReference_0_0()); 

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
    // $ANTLR end "rule__SensorEntry__SensorAssignment_0"


    // $ANTLR start "rule__SensorEntry__ReadingAssignment_3"
    // InternalHal.g:4088:1: rule__SensorEntry__ReadingAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__SensorEntry__ReadingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4092:1: ( ( ruleQualifiedName ) )
            // InternalHal.g:4093:2: ( ruleQualifiedName )
            {
            // InternalHal.g:4093:2: ( ruleQualifiedName )
            // InternalHal.g:4094:3: ruleQualifiedName
            {
             before(grammarAccess.getSensorEntryAccess().getReadingQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSensorEntryAccess().getReadingQualifiedNameParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SensorEntry__ReadingAssignment_3"


    // $ANTLR start "rule__SensorEntry__TimeStampAssignment_5"
    // InternalHal.g:4103:1: rule__SensorEntry__TimeStampAssignment_5 : ( ruleELong ) ;
    public final void rule__SensorEntry__TimeStampAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4107:1: ( ( ruleELong ) )
            // InternalHal.g:4108:2: ( ruleELong )
            {
            // InternalHal.g:4108:2: ( ruleELong )
            // InternalHal.g:4109:3: ruleELong
            {
             before(grammarAccess.getSensorEntryAccess().getTimeStampELongParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getSensorEntryAccess().getTimeStampELongParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__SensorEntry__TimeStampAssignment_5"


    // $ANTLR start "rule__Device__NameAssignment_0"
    // InternalHal.g:4118:1: rule__Device__NameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__Device__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4122:1: ( ( ruleQualifiedName ) )
            // InternalHal.g:4123:2: ( ruleQualifiedName )
            {
            // InternalHal.g:4123:2: ( ruleQualifiedName )
            // InternalHal.g:4124:3: ruleQualifiedName
            {
             before(grammarAccess.getDeviceAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getNameQualifiedNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Device__NameAssignment_0"


    // $ANTLR start "rule__Device__TypeAssignment_3"
    // InternalHal.g:4133:1: rule__Device__TypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Device__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4137:1: ( ( ( ruleQualifiedName ) ) )
            // InternalHal.g:4138:2: ( ( ruleQualifiedName ) )
            {
            // InternalHal.g:4138:2: ( ( ruleQualifiedName ) )
            // InternalHal.g:4139:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDeviceAccess().getTypeDeviceTypeCrossReference_3_0()); 
            // InternalHal.g:4140:3: ( ruleQualifiedName )
            // InternalHal.g:4141:4: ruleQualifiedName
            {
             before(grammarAccess.getDeviceAccess().getTypeDeviceTypeQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getTypeDeviceTypeQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDeviceAccess().getTypeDeviceTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Device__TypeAssignment_3"


    // $ANTLR start "rule__Device__LengthPosAssignment_6"
    // InternalHal.g:4152:1: rule__Device__LengthPosAssignment_6 : ( rulePosFloat ) ;
    public final void rule__Device__LengthPosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4156:1: ( ( rulePosFloat ) )
            // InternalHal.g:4157:2: ( rulePosFloat )
            {
            // InternalHal.g:4157:2: ( rulePosFloat )
            // InternalHal.g:4158:3: rulePosFloat
            {
             before(grammarAccess.getDeviceAccess().getLengthPosPosFloatParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePosFloat();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getLengthPosPosFloatParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Device__LengthPosAssignment_6"


    // $ANTLR start "rule__Device__WidthPosAssignment_8"
    // InternalHal.g:4167:1: rule__Device__WidthPosAssignment_8 : ( rulePosFloat ) ;
    public final void rule__Device__WidthPosAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4171:1: ( ( rulePosFloat ) )
            // InternalHal.g:4172:2: ( rulePosFloat )
            {
            // InternalHal.g:4172:2: ( rulePosFloat )
            // InternalHal.g:4173:3: rulePosFloat
            {
             before(grammarAccess.getDeviceAccess().getWidthPosPosFloatParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePosFloat();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getWidthPosPosFloatParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Device__WidthPosAssignment_8"


    // $ANTLR start "rule__Action__ActuatorAssignment_0"
    // InternalHal.g:4182:1: rule__Action__ActuatorAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Action__ActuatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4186:1: ( ( ( ruleQualifiedName ) ) )
            // InternalHal.g:4187:2: ( ( ruleQualifiedName ) )
            {
            // InternalHal.g:4187:2: ( ( ruleQualifiedName ) )
            // InternalHal.g:4188:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getActionAccess().getActuatorDeviceCrossReference_0_0()); 
            // InternalHal.g:4189:3: ( ruleQualifiedName )
            // InternalHal.g:4190:4: ruleQualifiedName
            {
             before(grammarAccess.getActionAccess().getActuatorDeviceQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActuatorDeviceQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getActionAccess().getActuatorDeviceCrossReference_0_0()); 

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
    // $ANTLR end "rule__Action__ActuatorAssignment_0"


    // $ANTLR start "rule__Action__CommandAssignment_2"
    // InternalHal.g:4201:1: rule__Action__CommandAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Action__CommandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4205:1: ( ( ( ruleQualifiedName ) ) )
            // InternalHal.g:4206:2: ( ( ruleQualifiedName ) )
            {
            // InternalHal.g:4206:2: ( ( ruleQualifiedName ) )
            // InternalHal.g:4207:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getActionAccess().getCommandCommandCrossReference_2_0()); 
            // InternalHal.g:4208:3: ( ruleQualifiedName )
            // InternalHal.g:4209:4: ruleQualifiedName
            {
             before(grammarAccess.getActionAccess().getCommandCommandQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActionAccess().getCommandCommandQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getActionAccess().getCommandCommandCrossReference_2_0()); 

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
    // $ANTLR end "rule__Action__CommandAssignment_2"


    // $ANTLR start "rule__AtomicRelationalTerm__NegatedAssignment_0"
    // InternalHal.g:4220:1: rule__AtomicRelationalTerm__NegatedAssignment_0 : ( ( 'NOT' ) ) ;
    public final void rule__AtomicRelationalTerm__NegatedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4224:1: ( ( ( 'NOT' ) ) )
            // InternalHal.g:4225:2: ( ( 'NOT' ) )
            {
            // InternalHal.g:4225:2: ( ( 'NOT' ) )
            // InternalHal.g:4226:3: ( 'NOT' )
            {
             before(grammarAccess.getAtomicRelationalTermAccess().getNegatedNOTKeyword_0_0()); 
            // InternalHal.g:4227:3: ( 'NOT' )
            // InternalHal.g:4228:4: 'NOT'
            {
             before(grammarAccess.getAtomicRelationalTermAccess().getNegatedNOTKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAtomicRelationalTermAccess().getNegatedNOTKeyword_0_0()); 

            }

             after(grammarAccess.getAtomicRelationalTermAccess().getNegatedNOTKeyword_0_0()); 

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
    // $ANTLR end "rule__AtomicRelationalTerm__NegatedAssignment_0"


    // $ANTLR start "rule__AtomicRelationalTerm__SensorAssignment_1"
    // InternalHal.g:4239:1: rule__AtomicRelationalTerm__SensorAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AtomicRelationalTerm__SensorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4243:1: ( ( ( ruleQualifiedName ) ) )
            // InternalHal.g:4244:2: ( ( ruleQualifiedName ) )
            {
            // InternalHal.g:4244:2: ( ( ruleQualifiedName ) )
            // InternalHal.g:4245:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAtomicRelationalTermAccess().getSensorDeviceCrossReference_1_0()); 
            // InternalHal.g:4246:3: ( ruleQualifiedName )
            // InternalHal.g:4247:4: ruleQualifiedName
            {
             before(grammarAccess.getAtomicRelationalTermAccess().getSensorDeviceQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAtomicRelationalTermAccess().getSensorDeviceQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAtomicRelationalTermAccess().getSensorDeviceCrossReference_1_0()); 

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
    // $ANTLR end "rule__AtomicRelationalTerm__SensorAssignment_1"


    // $ANTLR start "rule__AtomicRelationalTerm__OperatorAssignment_2"
    // InternalHal.g:4258:1: rule__AtomicRelationalTerm__OperatorAssignment_2 : ( ruleComparisonOperator ) ;
    public final void rule__AtomicRelationalTerm__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4262:1: ( ( ruleComparisonOperator ) )
            // InternalHal.g:4263:2: ( ruleComparisonOperator )
            {
            // InternalHal.g:4263:2: ( ruleComparisonOperator )
            // InternalHal.g:4264:3: ruleComparisonOperator
            {
             before(grammarAccess.getAtomicRelationalTermAccess().getOperatorComparisonOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getAtomicRelationalTermAccess().getOperatorComparisonOperatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__AtomicRelationalTerm__OperatorAssignment_2"


    // $ANTLR start "rule__AtomicRelationalTerm__ComparedAgainstValueAssignment_3"
    // InternalHal.g:4273:1: rule__AtomicRelationalTerm__ComparedAgainstValueAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__AtomicRelationalTerm__ComparedAgainstValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4277:1: ( ( ruleQualifiedName ) )
            // InternalHal.g:4278:2: ( ruleQualifiedName )
            {
            // InternalHal.g:4278:2: ( ruleQualifiedName )
            // InternalHal.g:4279:3: ruleQualifiedName
            {
             before(grammarAccess.getAtomicRelationalTermAccess().getComparedAgainstValueQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAtomicRelationalTermAccess().getComparedAgainstValueQualifiedNameParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AtomicRelationalTerm__ComparedAgainstValueAssignment_3"


    // $ANTLR start "rule__CompoundRelationalTerm__NegatedAssignment_0"
    // InternalHal.g:4288:1: rule__CompoundRelationalTerm__NegatedAssignment_0 : ( ( 'NOT' ) ) ;
    public final void rule__CompoundRelationalTerm__NegatedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4292:1: ( ( ( 'NOT' ) ) )
            // InternalHal.g:4293:2: ( ( 'NOT' ) )
            {
            // InternalHal.g:4293:2: ( ( 'NOT' ) )
            // InternalHal.g:4294:3: ( 'NOT' )
            {
             before(grammarAccess.getCompoundRelationalTermAccess().getNegatedNOTKeyword_0_0()); 
            // InternalHal.g:4295:3: ( 'NOT' )
            // InternalHal.g:4296:4: 'NOT'
            {
             before(grammarAccess.getCompoundRelationalTermAccess().getNegatedNOTKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCompoundRelationalTermAccess().getNegatedNOTKeyword_0_0()); 

            }

             after(grammarAccess.getCompoundRelationalTermAccess().getNegatedNOTKeyword_0_0()); 

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
    // $ANTLR end "rule__CompoundRelationalTerm__NegatedAssignment_0"


    // $ANTLR start "rule__CompoundRelationalTerm__LHSAssignment_2"
    // InternalHal.g:4307:1: rule__CompoundRelationalTerm__LHSAssignment_2 : ( ruleBooleanExpression ) ;
    public final void rule__CompoundRelationalTerm__LHSAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4311:1: ( ( ruleBooleanExpression ) )
            // InternalHal.g:4312:2: ( ruleBooleanExpression )
            {
            // InternalHal.g:4312:2: ( ruleBooleanExpression )
            // InternalHal.g:4313:3: ruleBooleanExpression
            {
             before(grammarAccess.getCompoundRelationalTermAccess().getLHSBooleanExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getCompoundRelationalTermAccess().getLHSBooleanExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CompoundRelationalTerm__LHSAssignment_2"


    // $ANTLR start "rule__CompoundRelationalTerm__OperatorAssignment_3"
    // InternalHal.g:4322:1: rule__CompoundRelationalTerm__OperatorAssignment_3 : ( ruleBooleanOperator ) ;
    public final void rule__CompoundRelationalTerm__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4326:1: ( ( ruleBooleanOperator ) )
            // InternalHal.g:4327:2: ( ruleBooleanOperator )
            {
            // InternalHal.g:4327:2: ( ruleBooleanOperator )
            // InternalHal.g:4328:3: ruleBooleanOperator
            {
             before(grammarAccess.getCompoundRelationalTermAccess().getOperatorBooleanOperatorEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanOperator();

            state._fsp--;

             after(grammarAccess.getCompoundRelationalTermAccess().getOperatorBooleanOperatorEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__CompoundRelationalTerm__OperatorAssignment_3"


    // $ANTLR start "rule__CompoundRelationalTerm__RHSAssignment_4"
    // InternalHal.g:4337:1: rule__CompoundRelationalTerm__RHSAssignment_4 : ( ruleBooleanExpression ) ;
    public final void rule__CompoundRelationalTerm__RHSAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4341:1: ( ( ruleBooleanExpression ) )
            // InternalHal.g:4342:2: ( ruleBooleanExpression )
            {
            // InternalHal.g:4342:2: ( ruleBooleanExpression )
            // InternalHal.g:4343:3: ruleBooleanExpression
            {
             before(grammarAccess.getCompoundRelationalTermAccess().getRHSBooleanExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getCompoundRelationalTermAccess().getRHSBooleanExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CompoundRelationalTerm__RHSAssignment_4"


    // $ANTLR start "rule__Command__NameAssignment_1"
    // InternalHal.g:4352:1: rule__Command__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Command__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4356:1: ( ( ruleQualifiedName ) )
            // InternalHal.g:4357:2: ( ruleQualifiedName )
            {
            // InternalHal.g:4357:2: ( ruleQualifiedName )
            // InternalHal.g:4358:3: ruleQualifiedName
            {
             before(grammarAccess.getCommandAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Command__NameAssignment_1"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // InternalHal.g:4367:1: rule__Sensor__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4371:1: ( ( ruleQualifiedName ) )
            // InternalHal.g:4372:2: ( ruleQualifiedName )
            {
            // InternalHal.g:4372:2: ( ruleQualifiedName )
            // InternalHal.g:4373:3: ruleQualifiedName
            {
             before(grammarAccess.getSensorAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Actuator__NameAssignment_1"
    // InternalHal.g:4382:1: rule__Actuator__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Actuator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4386:1: ( ( ruleQualifiedName ) )
            // InternalHal.g:4387:2: ( ruleQualifiedName )
            {
            // InternalHal.g:4387:2: ( ruleQualifiedName )
            // InternalHal.g:4388:3: ruleQualifiedName
            {
             before(grammarAccess.getActuatorAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Actuator__NameAssignment_1"


    // $ANTLR start "rule__Actuator__CommandsAssignment_3_0"
    // InternalHal.g:4397:1: rule__Actuator__CommandsAssignment_3_0 : ( ruleCommand ) ;
    public final void rule__Actuator__CommandsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4401:1: ( ( ruleCommand ) )
            // InternalHal.g:4402:2: ( ruleCommand )
            {
            // InternalHal.g:4402:2: ( ruleCommand )
            // InternalHal.g:4403:3: ruleCommand
            {
             before(grammarAccess.getActuatorAccess().getCommandsCommandParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getCommandsCommandParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Actuator__CommandsAssignment_3_0"


    // $ANTLR start "rule__Actuator__CommandsAssignment_3_1_1"
    // InternalHal.g:4412:1: rule__Actuator__CommandsAssignment_3_1_1 : ( ruleCommand ) ;
    public final void rule__Actuator__CommandsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHal.g:4416:1: ( ( ruleCommand ) )
            // InternalHal.g:4417:2: ( ruleCommand )
            {
            // InternalHal.g:4417:2: ( ruleCommand )
            // InternalHal.g:4418:3: ruleCommand
            {
             before(grammarAccess.getActuatorAccess().getCommandsCommandParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getCommandsCommandParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Actuator__CommandsAssignment_3_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000E0800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000016000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400200000060L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000060L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000180000L});

}