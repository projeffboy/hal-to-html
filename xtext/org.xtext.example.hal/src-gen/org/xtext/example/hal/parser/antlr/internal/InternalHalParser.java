package org.xtext.example.hal.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.hal.services.HalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'password'", "'address'", "'types'", "'{'", "'sensors'", "','", "'}'", "'actuators'", "'rooms'", "'rules'", "'sensorEntries'", "'.'", "'('", "'x'", "')'", "'active'", "'WHEN'", "'THEN'", "'reading'", "'timestamp'", "'is'", "'type'", "'at'", "'E'", "'e'", "'-'", "'runs'", "'NOT'", "'='", "'>'", "'>='", "'<'", "'<='", "'!='", "'AND'", "'OR'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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

        public InternalHalParser(TokenStream input, HalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "HAL";
       	}

       	@Override
       	protected HalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHAL"
    // InternalHal.g:65:1: entryRuleHAL returns [EObject current=null] : iv_ruleHAL= ruleHAL EOF ;
    public final EObject entryRuleHAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHAL = null;


        try {
            // InternalHal.g:65:44: (iv_ruleHAL= ruleHAL EOF )
            // InternalHal.g:66:2: iv_ruleHAL= ruleHAL EOF
            {
             newCompositeNode(grammarAccess.getHALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHAL=ruleHAL();

            state._fsp--;

             current =iv_ruleHAL; 
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
    // $ANTLR end "entryRuleHAL"


    // $ANTLR start "ruleHAL"
    // InternalHal.g:72:1: ruleHAL returns [EObject current=null] : (otherlv_0= 'password' ( (lv_password_1_0= RULE_STRING ) ) otherlv_2= 'address' ( (lv_address_3_0= RULE_STRING ) ) (otherlv_4= 'types' otherlv_5= '{' (otherlv_6= 'sensors' otherlv_7= '{' ( ( (lv_types_8_0= ruleSensor ) ) (otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) ) )* )? otherlv_11= '}' )? (otherlv_12= 'actuators' otherlv_13= '{' ( (lv_types_14_0= ruleActuator ) )* otherlv_15= '}' )? otherlv_16= '}' )? (otherlv_17= 'rooms' otherlv_18= '{' ( (lv_rooms_19_0= ruleRoom ) )* otherlv_20= '}' )? (otherlv_21= 'rules' otherlv_22= '{' ( (lv_rules_23_0= ruleAutomationRule ) )* otherlv_24= '}' )? (otherlv_25= 'sensorEntries' otherlv_26= '{' ( (lv_entries_27_0= ruleSensorEntry ) )* otherlv_28= '}' )? ) ;
    public final EObject ruleHAL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_password_1_0=null;
        Token otherlv_2=null;
        Token lv_address_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        EObject lv_types_8_0 = null;

        EObject lv_types_10_0 = null;

        EObject lv_types_14_0 = null;

        EObject lv_rooms_19_0 = null;

        EObject lv_rules_23_0 = null;

        EObject lv_entries_27_0 = null;



        	enterRule();

        try {
            // InternalHal.g:78:2: ( (otherlv_0= 'password' ( (lv_password_1_0= RULE_STRING ) ) otherlv_2= 'address' ( (lv_address_3_0= RULE_STRING ) ) (otherlv_4= 'types' otherlv_5= '{' (otherlv_6= 'sensors' otherlv_7= '{' ( ( (lv_types_8_0= ruleSensor ) ) (otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) ) )* )? otherlv_11= '}' )? (otherlv_12= 'actuators' otherlv_13= '{' ( (lv_types_14_0= ruleActuator ) )* otherlv_15= '}' )? otherlv_16= '}' )? (otherlv_17= 'rooms' otherlv_18= '{' ( (lv_rooms_19_0= ruleRoom ) )* otherlv_20= '}' )? (otherlv_21= 'rules' otherlv_22= '{' ( (lv_rules_23_0= ruleAutomationRule ) )* otherlv_24= '}' )? (otherlv_25= 'sensorEntries' otherlv_26= '{' ( (lv_entries_27_0= ruleSensorEntry ) )* otherlv_28= '}' )? ) )
            // InternalHal.g:79:2: (otherlv_0= 'password' ( (lv_password_1_0= RULE_STRING ) ) otherlv_2= 'address' ( (lv_address_3_0= RULE_STRING ) ) (otherlv_4= 'types' otherlv_5= '{' (otherlv_6= 'sensors' otherlv_7= '{' ( ( (lv_types_8_0= ruleSensor ) ) (otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) ) )* )? otherlv_11= '}' )? (otherlv_12= 'actuators' otherlv_13= '{' ( (lv_types_14_0= ruleActuator ) )* otherlv_15= '}' )? otherlv_16= '}' )? (otherlv_17= 'rooms' otherlv_18= '{' ( (lv_rooms_19_0= ruleRoom ) )* otherlv_20= '}' )? (otherlv_21= 'rules' otherlv_22= '{' ( (lv_rules_23_0= ruleAutomationRule ) )* otherlv_24= '}' )? (otherlv_25= 'sensorEntries' otherlv_26= '{' ( (lv_entries_27_0= ruleSensorEntry ) )* otherlv_28= '}' )? )
            {
            // InternalHal.g:79:2: (otherlv_0= 'password' ( (lv_password_1_0= RULE_STRING ) ) otherlv_2= 'address' ( (lv_address_3_0= RULE_STRING ) ) (otherlv_4= 'types' otherlv_5= '{' (otherlv_6= 'sensors' otherlv_7= '{' ( ( (lv_types_8_0= ruleSensor ) ) (otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) ) )* )? otherlv_11= '}' )? (otherlv_12= 'actuators' otherlv_13= '{' ( (lv_types_14_0= ruleActuator ) )* otherlv_15= '}' )? otherlv_16= '}' )? (otherlv_17= 'rooms' otherlv_18= '{' ( (lv_rooms_19_0= ruleRoom ) )* otherlv_20= '}' )? (otherlv_21= 'rules' otherlv_22= '{' ( (lv_rules_23_0= ruleAutomationRule ) )* otherlv_24= '}' )? (otherlv_25= 'sensorEntries' otherlv_26= '{' ( (lv_entries_27_0= ruleSensorEntry ) )* otherlv_28= '}' )? )
            // InternalHal.g:80:3: otherlv_0= 'password' ( (lv_password_1_0= RULE_STRING ) ) otherlv_2= 'address' ( (lv_address_3_0= RULE_STRING ) ) (otherlv_4= 'types' otherlv_5= '{' (otherlv_6= 'sensors' otherlv_7= '{' ( ( (lv_types_8_0= ruleSensor ) ) (otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) ) )* )? otherlv_11= '}' )? (otherlv_12= 'actuators' otherlv_13= '{' ( (lv_types_14_0= ruleActuator ) )* otherlv_15= '}' )? otherlv_16= '}' )? (otherlv_17= 'rooms' otherlv_18= '{' ( (lv_rooms_19_0= ruleRoom ) )* otherlv_20= '}' )? (otherlv_21= 'rules' otherlv_22= '{' ( (lv_rules_23_0= ruleAutomationRule ) )* otherlv_24= '}' )? (otherlv_25= 'sensorEntries' otherlv_26= '{' ( (lv_entries_27_0= ruleSensorEntry ) )* otherlv_28= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHALAccess().getPasswordKeyword_0());
            		
            // InternalHal.g:84:3: ( (lv_password_1_0= RULE_STRING ) )
            // InternalHal.g:85:4: (lv_password_1_0= RULE_STRING )
            {
            // InternalHal.g:85:4: (lv_password_1_0= RULE_STRING )
            // InternalHal.g:86:5: lv_password_1_0= RULE_STRING
            {
            lv_password_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_password_1_0, grammarAccess.getHALAccess().getPasswordSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHALRule());
            					}
            					setWithLastConsumed(
            						current,
            						"password",
            						lv_password_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getHALAccess().getAddressKeyword_2());
            		
            // InternalHal.g:106:3: ( (lv_address_3_0= RULE_STRING ) )
            // InternalHal.g:107:4: (lv_address_3_0= RULE_STRING )
            {
            // InternalHal.g:107:4: (lv_address_3_0= RULE_STRING )
            // InternalHal.g:108:5: lv_address_3_0= RULE_STRING
            {
            lv_address_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_address_3_0, grammarAccess.getHALAccess().getAddressSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHALRule());
            					}
            					setWithLastConsumed(
            						current,
            						"address",
            						lv_address_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalHal.g:124:3: (otherlv_4= 'types' otherlv_5= '{' (otherlv_6= 'sensors' otherlv_7= '{' ( ( (lv_types_8_0= ruleSensor ) ) (otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) ) )* )? otherlv_11= '}' )? (otherlv_12= 'actuators' otherlv_13= '{' ( (lv_types_14_0= ruleActuator ) )* otherlv_15= '}' )? otherlv_16= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHal.g:125:4: otherlv_4= 'types' otherlv_5= '{' (otherlv_6= 'sensors' otherlv_7= '{' ( ( (lv_types_8_0= ruleSensor ) ) (otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) ) )* )? otherlv_11= '}' )? (otherlv_12= 'actuators' otherlv_13= '{' ( (lv_types_14_0= ruleActuator ) )* otherlv_15= '}' )? otherlv_16= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getHALAccess().getTypesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalHal.g:133:4: (otherlv_6= 'sensors' otherlv_7= '{' ( ( (lv_types_8_0= ruleSensor ) ) (otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) ) )* )? otherlv_11= '}' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==15) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalHal.g:134:5: otherlv_6= 'sensors' otherlv_7= '{' ( ( (lv_types_8_0= ruleSensor ) ) (otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) ) )* )? otherlv_11= '}'
                            {
                            otherlv_6=(Token)match(input,15,FOLLOW_6); 

                            					newLeafNode(otherlv_6, grammarAccess.getHALAccess().getSensorsKeyword_4_2_0());
                            				
                            otherlv_7=(Token)match(input,14,FOLLOW_8); 

                            					newLeafNode(otherlv_7, grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_4_2_1());
                            				
                            // InternalHal.g:142:5: ( ( (lv_types_8_0= ruleSensor ) ) (otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) ) )* )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                                alt2=1;
                            }
                            switch (alt2) {
                                case 1 :
                                    // InternalHal.g:143:6: ( (lv_types_8_0= ruleSensor ) ) (otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) ) )*
                                    {
                                    // InternalHal.g:143:6: ( (lv_types_8_0= ruleSensor ) )
                                    // InternalHal.g:144:7: (lv_types_8_0= ruleSensor )
                                    {
                                    // InternalHal.g:144:7: (lv_types_8_0= ruleSensor )
                                    // InternalHal.g:145:8: lv_types_8_0= ruleSensor
                                    {

                                    								newCompositeNode(grammarAccess.getHALAccess().getTypesSensorParserRuleCall_4_2_2_0_0());
                                    							
                                    pushFollow(FOLLOW_9);
                                    lv_types_8_0=ruleSensor();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getHALRule());
                                    								}
                                    								add(
                                    									current,
                                    									"types",
                                    									lv_types_8_0,
                                    									"org.xtext.example.hal.Hal.Sensor");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }

                                    // InternalHal.g:162:6: (otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) ) )*
                                    loop1:
                                    do {
                                        int alt1=2;
                                        int LA1_0 = input.LA(1);

                                        if ( (LA1_0==16) ) {
                                            alt1=1;
                                        }


                                        switch (alt1) {
                                    	case 1 :
                                    	    // InternalHal.g:163:7: otherlv_9= ',' ( (lv_types_10_0= ruleSensor ) )
                                    	    {
                                    	    otherlv_9=(Token)match(input,16,FOLLOW_10); 

                                    	    							newLeafNode(otherlv_9, grammarAccess.getHALAccess().getCommaKeyword_4_2_2_1_0());
                                    	    						
                                    	    // InternalHal.g:167:7: ( (lv_types_10_0= ruleSensor ) )
                                    	    // InternalHal.g:168:8: (lv_types_10_0= ruleSensor )
                                    	    {
                                    	    // InternalHal.g:168:8: (lv_types_10_0= ruleSensor )
                                    	    // InternalHal.g:169:9: lv_types_10_0= ruleSensor
                                    	    {

                                    	    									newCompositeNode(grammarAccess.getHALAccess().getTypesSensorParserRuleCall_4_2_2_1_1_0());
                                    	    								
                                    	    pushFollow(FOLLOW_9);
                                    	    lv_types_10_0=ruleSensor();

                                    	    state._fsp--;


                                    	    									if (current==null) {
                                    	    										current = createModelElementForParent(grammarAccess.getHALRule());
                                    	    									}
                                    	    									add(
                                    	    										current,
                                    	    										"types",
                                    	    										lv_types_10_0,
                                    	    										"org.xtext.example.hal.Hal.Sensor");
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
                                    break;

                            }

                            otherlv_11=(Token)match(input,17,FOLLOW_11); 

                            					newLeafNode(otherlv_11, grammarAccess.getHALAccess().getRightCurlyBracketKeyword_4_2_3());
                            				

                            }
                            break;

                    }

                    // InternalHal.g:193:4: (otherlv_12= 'actuators' otherlv_13= '{' ( (lv_types_14_0= ruleActuator ) )* otherlv_15= '}' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalHal.g:194:5: otherlv_12= 'actuators' otherlv_13= '{' ( (lv_types_14_0= ruleActuator ) )* otherlv_15= '}'
                            {
                            otherlv_12=(Token)match(input,18,FOLLOW_6); 

                            					newLeafNode(otherlv_12, grammarAccess.getHALAccess().getActuatorsKeyword_4_3_0());
                            				
                            otherlv_13=(Token)match(input,14,FOLLOW_8); 

                            					newLeafNode(otherlv_13, grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_4_3_1());
                            				
                            // InternalHal.g:202:5: ( (lv_types_14_0= ruleActuator ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalHal.g:203:6: (lv_types_14_0= ruleActuator )
                            	    {
                            	    // InternalHal.g:203:6: (lv_types_14_0= ruleActuator )
                            	    // InternalHal.g:204:7: lv_types_14_0= ruleActuator
                            	    {

                            	    							newCompositeNode(grammarAccess.getHALAccess().getTypesActuatorParserRuleCall_4_3_2_0());
                            	    						
                            	    pushFollow(FOLLOW_8);
                            	    lv_types_14_0=ruleActuator();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getHALRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"types",
                            	    								lv_types_14_0,
                            	    								"org.xtext.example.hal.Hal.Actuator");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);

                            otherlv_15=(Token)match(input,17,FOLLOW_12); 

                            					newLeafNode(otherlv_15, grammarAccess.getHALAccess().getRightCurlyBracketKeyword_4_3_3());
                            				

                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getHALAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalHal.g:231:3: (otherlv_17= 'rooms' otherlv_18= '{' ( (lv_rooms_19_0= ruleRoom ) )* otherlv_20= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHal.g:232:4: otherlv_17= 'rooms' otherlv_18= '{' ( (lv_rooms_19_0= ruleRoom ) )* otherlv_20= '}'
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_17, grammarAccess.getHALAccess().getRoomsKeyword_5_0());
                    			
                    otherlv_18=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_18, grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalHal.g:240:4: ( (lv_rooms_19_0= ruleRoom ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalHal.g:241:5: (lv_rooms_19_0= ruleRoom )
                    	    {
                    	    // InternalHal.g:241:5: (lv_rooms_19_0= ruleRoom )
                    	    // InternalHal.g:242:6: lv_rooms_19_0= ruleRoom
                    	    {

                    	    						newCompositeNode(grammarAccess.getHALAccess().getRoomsRoomParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_rooms_19_0=ruleRoom();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getHALRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"rooms",
                    	    							lv_rooms_19_0,
                    	    							"org.xtext.example.hal.Hal.Room");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getHALAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalHal.g:264:3: (otherlv_21= 'rules' otherlv_22= '{' ( (lv_rules_23_0= ruleAutomationRule ) )* otherlv_24= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalHal.g:265:4: otherlv_21= 'rules' otherlv_22= '{' ( (lv_rules_23_0= ruleAutomationRule ) )* otherlv_24= '}'
                    {
                    otherlv_21=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getHALAccess().getRulesKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_22, grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalHal.g:273:4: ( (lv_rules_23_0= ruleAutomationRule ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalHal.g:274:5: (lv_rules_23_0= ruleAutomationRule )
                    	    {
                    	    // InternalHal.g:274:5: (lv_rules_23_0= ruleAutomationRule )
                    	    // InternalHal.g:275:6: lv_rules_23_0= ruleAutomationRule
                    	    {

                    	    						newCompositeNode(grammarAccess.getHALAccess().getRulesAutomationRuleParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_rules_23_0=ruleAutomationRule();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getHALRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"rules",
                    	    							lv_rules_23_0,
                    	    							"org.xtext.example.hal.Hal.AutomationRule");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_24, grammarAccess.getHALAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalHal.g:297:3: (otherlv_25= 'sensorEntries' otherlv_26= '{' ( (lv_entries_27_0= ruleSensorEntry ) )* otherlv_28= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHal.g:298:4: otherlv_25= 'sensorEntries' otherlv_26= '{' ( (lv_entries_27_0= ruleSensorEntry ) )* otherlv_28= '}'
                    {
                    otherlv_25=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_25, grammarAccess.getHALAccess().getSensorEntriesKeyword_7_0());
                    			
                    otherlv_26=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_26, grammarAccess.getHALAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalHal.g:306:4: ( (lv_entries_27_0= ruleSensorEntry ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalHal.g:307:5: (lv_entries_27_0= ruleSensorEntry )
                    	    {
                    	    // InternalHal.g:307:5: (lv_entries_27_0= ruleSensorEntry )
                    	    // InternalHal.g:308:6: lv_entries_27_0= ruleSensorEntry
                    	    {

                    	    						newCompositeNode(grammarAccess.getHALAccess().getEntriesSensorEntryParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_entries_27_0=ruleSensorEntry();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getHALRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"entries",
                    	    							lv_entries_27_0,
                    	    							"org.xtext.example.hal.Hal.SensorEntry");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_28, grammarAccess.getHALAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleHAL"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalHal.g:334:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalHal.g:334:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalHal.g:335:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalHal.g:341:1: ruleBooleanExpression returns [EObject current=null] : (this_AtomicRelationalTerm_0= ruleAtomicRelationalTerm | this_CompoundRelationalTerm_1= ruleCompoundRelationalTerm ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicRelationalTerm_0 = null;

        EObject this_CompoundRelationalTerm_1 = null;



        	enterRule();

        try {
            // InternalHal.g:347:2: ( (this_AtomicRelationalTerm_0= ruleAtomicRelationalTerm | this_CompoundRelationalTerm_1= ruleCompoundRelationalTerm ) )
            // InternalHal.g:348:2: (this_AtomicRelationalTerm_0= ruleAtomicRelationalTerm | this_CompoundRelationalTerm_1= ruleCompoundRelationalTerm )
            {
            // InternalHal.g:348:2: (this_AtomicRelationalTerm_0= ruleAtomicRelationalTerm | this_CompoundRelationalTerm_1= ruleCompoundRelationalTerm )
            int alt13=2;
            switch ( input.LA(1) ) {
            case 38:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==23) ) {
                    alt13=2;
                }
                else if ( ((LA13_1>=RULE_STRING && LA13_1<=RULE_ID)) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalHal.g:349:3: this_AtomicRelationalTerm_0= ruleAtomicRelationalTerm
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getAtomicRelationalTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicRelationalTerm_0=ruleAtomicRelationalTerm();

                    state._fsp--;


                    			current = this_AtomicRelationalTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHal.g:358:3: this_CompoundRelationalTerm_1= ruleCompoundRelationalTerm
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getCompoundRelationalTermParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompoundRelationalTerm_1=ruleCompoundRelationalTerm();

                    state._fsp--;


                    			current = this_CompoundRelationalTerm_1;
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalHal.g:370:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalHal.g:370:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalHal.g:371:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalHal.g:377:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) (kw= '.' (this_STRING_3= RULE_STRING | this_ID_4= RULE_ID ) )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_STRING_3=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalHal.g:383:2: ( ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) (kw= '.' (this_STRING_3= RULE_STRING | this_ID_4= RULE_ID ) )? ) )
            // InternalHal.g:384:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) (kw= '.' (this_STRING_3= RULE_STRING | this_ID_4= RULE_ID ) )? )
            {
            // InternalHal.g:384:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) (kw= '.' (this_STRING_3= RULE_STRING | this_ID_4= RULE_ID ) )? )
            // InternalHal.g:385:3: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) (kw= '.' (this_STRING_3= RULE_STRING | this_ID_4= RULE_ID ) )?
            {
            // InternalHal.g:385:3: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalHal.g:386:4: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    				current.merge(this_STRING_0);
                    			

                    				newLeafNode(this_STRING_0, grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalHal.g:394:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_16); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            // InternalHal.g:402:3: (kw= '.' (this_STRING_3= RULE_STRING | this_ID_4= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalHal.g:403:4: kw= '.' (this_STRING_3= RULE_STRING | this_ID_4= RULE_ID )
                    {
                    kw=(Token)match(input,22,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
                    			
                    // InternalHal.g:408:4: (this_STRING_3= RULE_STRING | this_ID_4= RULE_ID )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_STRING) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_ID) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalHal.g:409:5: this_STRING_3= RULE_STRING
                            {
                            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            					current.merge(this_STRING_3);
                            				

                            					newLeafNode(this_STRING_3, grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalHal.g:417:5: this_ID_4= RULE_ID
                            {
                            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                            					current.merge(this_ID_4);
                            				

                            					newLeafNode(this_ID_4, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1_1());
                            				

                            }
                            break;

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRoom"
    // InternalHal.g:430:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalHal.g:430:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalHal.g:431:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalHal.g:437:1: ruleRoom returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_length_2_0= rulePosFloat ) ) otherlv_3= 'x' ( (lv_width_4_0= rulePosFloat ) ) otherlv_5= ')' otherlv_6= '{' ( ( (lv_devices_7_0= ruleDevice ) ) (otherlv_8= ',' ( (lv_devices_9_0= ruleDevice ) ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_length_2_0 = null;

        AntlrDatatypeRuleToken lv_width_4_0 = null;

        EObject lv_devices_7_0 = null;

        EObject lv_devices_9_0 = null;



        	enterRule();

        try {
            // InternalHal.g:443:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_length_2_0= rulePosFloat ) ) otherlv_3= 'x' ( (lv_width_4_0= rulePosFloat ) ) otherlv_5= ')' otherlv_6= '{' ( ( (lv_devices_7_0= ruleDevice ) ) (otherlv_8= ',' ( (lv_devices_9_0= ruleDevice ) ) )* )? otherlv_10= '}' ) )
            // InternalHal.g:444:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_length_2_0= rulePosFloat ) ) otherlv_3= 'x' ( (lv_width_4_0= rulePosFloat ) ) otherlv_5= ')' otherlv_6= '{' ( ( (lv_devices_7_0= ruleDevice ) ) (otherlv_8= ',' ( (lv_devices_9_0= ruleDevice ) ) )* )? otherlv_10= '}' )
            {
            // InternalHal.g:444:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_length_2_0= rulePosFloat ) ) otherlv_3= 'x' ( (lv_width_4_0= rulePosFloat ) ) otherlv_5= ')' otherlv_6= '{' ( ( (lv_devices_7_0= ruleDevice ) ) (otherlv_8= ',' ( (lv_devices_9_0= ruleDevice ) ) )* )? otherlv_10= '}' )
            // InternalHal.g:445:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '(' ( (lv_length_2_0= rulePosFloat ) ) otherlv_3= 'x' ( (lv_width_4_0= rulePosFloat ) ) otherlv_5= ')' otherlv_6= '{' ( ( (lv_devices_7_0= ruleDevice ) ) (otherlv_8= ',' ( (lv_devices_9_0= ruleDevice ) ) )* )? otherlv_10= '}'
            {
            // InternalHal.g:445:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalHal.g:446:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalHal.g:446:4: (lv_name_0_0= ruleQualifiedName )
            // InternalHal.g:447:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.hal.Hal.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHal.g:468:3: ( (lv_length_2_0= rulePosFloat ) )
            // InternalHal.g:469:4: (lv_length_2_0= rulePosFloat )
            {
            // InternalHal.g:469:4: (lv_length_2_0= rulePosFloat )
            // InternalHal.g:470:5: lv_length_2_0= rulePosFloat
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getLengthPosFloatParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_length_2_0=rulePosFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_2_0,
            						"org.xtext.example.hal.Hal.PosFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getXKeyword_3());
            		
            // InternalHal.g:491:3: ( (lv_width_4_0= rulePosFloat ) )
            // InternalHal.g:492:4: (lv_width_4_0= rulePosFloat )
            {
            // InternalHal.g:492:4: (lv_width_4_0= rulePosFloat )
            // InternalHal.g:493:5: lv_width_4_0= rulePosFloat
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getWidthPosFloatParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_width_4_0=rulePosFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_4_0,
            						"org.xtext.example.hal.Hal.PosFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalHal.g:518:3: ( ( (lv_devices_7_0= ruleDevice ) ) (otherlv_8= ',' ( (lv_devices_9_0= ruleDevice ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHal.g:519:4: ( (lv_devices_7_0= ruleDevice ) ) (otherlv_8= ',' ( (lv_devices_9_0= ruleDevice ) ) )*
                    {
                    // InternalHal.g:519:4: ( (lv_devices_7_0= ruleDevice ) )
                    // InternalHal.g:520:5: (lv_devices_7_0= ruleDevice )
                    {
                    // InternalHal.g:520:5: (lv_devices_7_0= ruleDevice )
                    // InternalHal.g:521:6: lv_devices_7_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_devices_7_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						add(
                    							current,
                    							"devices",
                    							lv_devices_7_0,
                    							"org.xtext.example.hal.Hal.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHal.g:538:4: (otherlv_8= ',' ( (lv_devices_9_0= ruleDevice ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalHal.g:539:5: otherlv_8= ',' ( (lv_devices_9_0= ruleDevice ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_10); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRoomAccess().getCommaKeyword_7_1_0());
                    	    				
                    	    // InternalHal.g:543:5: ( (lv_devices_9_0= ruleDevice ) )
                    	    // InternalHal.g:544:6: (lv_devices_9_0= ruleDevice )
                    	    {
                    	    // InternalHal.g:544:6: (lv_devices_9_0= ruleDevice )
                    	    // InternalHal.g:545:7: lv_devices_9_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_devices_9_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"devices",
                    	    								lv_devices_9_0,
                    	    								"org.xtext.example.hal.Hal.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleAutomationRule"
    // InternalHal.g:572:1: entryRuleAutomationRule returns [EObject current=null] : iv_ruleAutomationRule= ruleAutomationRule EOF ;
    public final EObject entryRuleAutomationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomationRule = null;


        try {
            // InternalHal.g:572:55: (iv_ruleAutomationRule= ruleAutomationRule EOF )
            // InternalHal.g:573:2: iv_ruleAutomationRule= ruleAutomationRule EOF
            {
             newCompositeNode(grammarAccess.getAutomationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutomationRule=ruleAutomationRule();

            state._fsp--;

             current =iv_ruleAutomationRule; 
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
    // $ANTLR end "entryRuleAutomationRule"


    // $ANTLR start "ruleAutomationRule"
    // InternalHal.g:579:1: ruleAutomationRule returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_active_2_0= 'active' ) ) otherlv_3= ')' )? otherlv_4= '{' otherlv_5= 'WHEN' ( (lv_precondition_6_0= ruleBooleanExpression ) ) otherlv_7= 'THEN' ( (lv_actions_8_0= ruleAction ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleAutomationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_active_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_precondition_6_0 = null;

        EObject lv_actions_8_0 = null;

        EObject lv_actions_10_0 = null;



        	enterRule();

        try {
            // InternalHal.g:585:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_active_2_0= 'active' ) ) otherlv_3= ')' )? otherlv_4= '{' otherlv_5= 'WHEN' ( (lv_precondition_6_0= ruleBooleanExpression ) ) otherlv_7= 'THEN' ( (lv_actions_8_0= ruleAction ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )* otherlv_11= '}' ) )
            // InternalHal.g:586:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_active_2_0= 'active' ) ) otherlv_3= ')' )? otherlv_4= '{' otherlv_5= 'WHEN' ( (lv_precondition_6_0= ruleBooleanExpression ) ) otherlv_7= 'THEN' ( (lv_actions_8_0= ruleAction ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )* otherlv_11= '}' )
            {
            // InternalHal.g:586:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_active_2_0= 'active' ) ) otherlv_3= ')' )? otherlv_4= '{' otherlv_5= 'WHEN' ( (lv_precondition_6_0= ruleBooleanExpression ) ) otherlv_7= 'THEN' ( (lv_actions_8_0= ruleAction ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )* otherlv_11= '}' )
            // InternalHal.g:587:3: ( (lv_name_0_0= ruleQualifiedName ) ) (otherlv_1= '(' ( (lv_active_2_0= 'active' ) ) otherlv_3= ')' )? otherlv_4= '{' otherlv_5= 'WHEN' ( (lv_precondition_6_0= ruleBooleanExpression ) ) otherlv_7= 'THEN' ( (lv_actions_8_0= ruleAction ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )* otherlv_11= '}'
            {
            // InternalHal.g:587:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalHal.g:588:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalHal.g:588:4: (lv_name_0_0= ruleQualifiedName )
            // InternalHal.g:589:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.hal.Hal.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHal.g:606:3: (otherlv_1= '(' ( (lv_active_2_0= 'active' ) ) otherlv_3= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalHal.g:607:4: otherlv_1= '(' ( (lv_active_2_0= 'active' ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getAutomationRuleAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalHal.g:611:4: ( (lv_active_2_0= 'active' ) )
                    // InternalHal.g:612:5: (lv_active_2_0= 'active' )
                    {
                    // InternalHal.g:612:5: (lv_active_2_0= 'active' )
                    // InternalHal.g:613:6: lv_active_2_0= 'active'
                    {
                    lv_active_2_0=(Token)match(input,26,FOLLOW_20); 

                    						newLeafNode(lv_active_2_0, grammarAccess.getAutomationRuleAccess().getActiveActiveKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAutomationRuleRule());
                    						}
                    						setWithLastConsumed(current, "active", lv_active_2_0 != null, "active");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getAutomationRuleAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getAutomationRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getAutomationRuleAccess().getWHENKeyword_3());
            		
            // InternalHal.g:638:3: ( (lv_precondition_6_0= ruleBooleanExpression ) )
            // InternalHal.g:639:4: (lv_precondition_6_0= ruleBooleanExpression )
            {
            // InternalHal.g:639:4: (lv_precondition_6_0= ruleBooleanExpression )
            // InternalHal.g:640:5: lv_precondition_6_0= ruleBooleanExpression
            {

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getPreconditionBooleanExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_precondition_6_0=ruleBooleanExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
            					}
            					set(
            						current,
            						"precondition",
            						lv_precondition_6_0,
            						"org.xtext.example.hal.Hal.BooleanExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getAutomationRuleAccess().getTHENKeyword_5());
            		
            // InternalHal.g:661:3: ( (lv_actions_8_0= ruleAction ) )
            // InternalHal.g:662:4: (lv_actions_8_0= ruleAction )
            {
            // InternalHal.g:662:4: (lv_actions_8_0= ruleAction )
            // InternalHal.g:663:5: lv_actions_8_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getAutomationRuleAccess().getActionsActionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_actions_8_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_8_0,
            						"org.xtext.example.hal.Hal.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHal.g:680:3: (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalHal.g:681:4: otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_9, grammarAccess.getAutomationRuleAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalHal.g:685:4: ( (lv_actions_10_0= ruleAction ) )
            	    // InternalHal.g:686:5: (lv_actions_10_0= ruleAction )
            	    {
            	    // InternalHal.g:686:5: (lv_actions_10_0= ruleAction )
            	    // InternalHal.g:687:6: lv_actions_10_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getAutomationRuleAccess().getActionsActionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_actions_10_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAutomationRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_10_0,
            	    							"org.xtext.example.hal.Hal.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAutomationRuleAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAutomationRule"


    // $ANTLR start "entryRuleSensorEntry"
    // InternalHal.g:713:1: entryRuleSensorEntry returns [EObject current=null] : iv_ruleSensorEntry= ruleSensorEntry EOF ;
    public final EObject entryRuleSensorEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorEntry = null;


        try {
            // InternalHal.g:713:52: (iv_ruleSensorEntry= ruleSensorEntry EOF )
            // InternalHal.g:714:2: iv_ruleSensorEntry= ruleSensorEntry EOF
            {
             newCompositeNode(grammarAccess.getSensorEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorEntry=ruleSensorEntry();

            state._fsp--;

             current =iv_ruleSensorEntry; 
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
    // $ANTLR end "entryRuleSensorEntry"


    // $ANTLR start "ruleSensorEntry"
    // InternalHal.g:720:1: ruleSensorEntry returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '{' otherlv_2= 'reading' ( (lv_reading_3_0= ruleQualifiedName ) ) otherlv_4= 'timestamp' ( (lv_timeStamp_5_0= ruleELong ) ) otherlv_6= '}' ) ;
    public final EObject ruleSensorEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_reading_3_0 = null;

        AntlrDatatypeRuleToken lv_timeStamp_5_0 = null;



        	enterRule();

        try {
            // InternalHal.g:726:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '{' otherlv_2= 'reading' ( (lv_reading_3_0= ruleQualifiedName ) ) otherlv_4= 'timestamp' ( (lv_timeStamp_5_0= ruleELong ) ) otherlv_6= '}' ) )
            // InternalHal.g:727:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' otherlv_2= 'reading' ( (lv_reading_3_0= ruleQualifiedName ) ) otherlv_4= 'timestamp' ( (lv_timeStamp_5_0= ruleELong ) ) otherlv_6= '}' )
            {
            // InternalHal.g:727:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' otherlv_2= 'reading' ( (lv_reading_3_0= ruleQualifiedName ) ) otherlv_4= 'timestamp' ( (lv_timeStamp_5_0= ruleELong ) ) otherlv_6= '}' )
            // InternalHal.g:728:3: ( ( ruleQualifiedName ) ) otherlv_1= '{' otherlv_2= 'reading' ( (lv_reading_3_0= ruleQualifiedName ) ) otherlv_4= 'timestamp' ( (lv_timeStamp_5_0= ruleELong ) ) otherlv_6= '}'
            {
            // InternalHal.g:728:3: ( ( ruleQualifiedName ) )
            // InternalHal.g:729:4: ( ruleQualifiedName )
            {
            // InternalHal.g:729:4: ( ruleQualifiedName )
            // InternalHal.g:730:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorEntryRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSensorEntryAccess().getSensorDeviceCrossReference_0_0());
            				
            pushFollow(FOLLOW_6);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorEntryAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorEntryAccess().getReadingKeyword_2());
            		
            // InternalHal.g:752:3: ( (lv_reading_3_0= ruleQualifiedName ) )
            // InternalHal.g:753:4: (lv_reading_3_0= ruleQualifiedName )
            {
            // InternalHal.g:753:4: (lv_reading_3_0= ruleQualifiedName )
            // InternalHal.g:754:5: lv_reading_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSensorEntryAccess().getReadingQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_reading_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorEntryRule());
            					}
            					set(
            						current,
            						"reading",
            						lv_reading_3_0,
            						"org.xtext.example.hal.Hal.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorEntryAccess().getTimestampKeyword_4());
            		
            // InternalHal.g:775:3: ( (lv_timeStamp_5_0= ruleELong ) )
            // InternalHal.g:776:4: (lv_timeStamp_5_0= ruleELong )
            {
            // InternalHal.g:776:4: (lv_timeStamp_5_0= ruleELong )
            // InternalHal.g:777:5: lv_timeStamp_5_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getSensorEntryAccess().getTimeStampELongParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_timeStamp_5_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorEntryRule());
            					}
            					set(
            						current,
            						"timeStamp",
            						lv_timeStamp_5_0,
            						"org.xtext.example.hal.Hal.ELong");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSensorEntryAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSensorEntry"


    // $ANTLR start "entryRuleDevice"
    // InternalHal.g:802:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalHal.g:802:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalHal.g:803:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalHal.g:809:1: ruleDevice returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'is' otherlv_2= 'type' ( ( ruleQualifiedName ) ) otherlv_4= 'at' otherlv_5= '(' ( (lv_lengthPos_6_0= rulePosFloat ) ) otherlv_7= ',' ( (lv_widthPos_8_0= rulePosFloat ) ) otherlv_9= ')' ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_lengthPos_6_0 = null;

        AntlrDatatypeRuleToken lv_widthPos_8_0 = null;



        	enterRule();

        try {
            // InternalHal.g:815:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'is' otherlv_2= 'type' ( ( ruleQualifiedName ) ) otherlv_4= 'at' otherlv_5= '(' ( (lv_lengthPos_6_0= rulePosFloat ) ) otherlv_7= ',' ( (lv_widthPos_8_0= rulePosFloat ) ) otherlv_9= ')' ) )
            // InternalHal.g:816:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'is' otherlv_2= 'type' ( ( ruleQualifiedName ) ) otherlv_4= 'at' otherlv_5= '(' ( (lv_lengthPos_6_0= rulePosFloat ) ) otherlv_7= ',' ( (lv_widthPos_8_0= rulePosFloat ) ) otherlv_9= ')' )
            {
            // InternalHal.g:816:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'is' otherlv_2= 'type' ( ( ruleQualifiedName ) ) otherlv_4= 'at' otherlv_5= '(' ( (lv_lengthPos_6_0= rulePosFloat ) ) otherlv_7= ',' ( (lv_widthPos_8_0= rulePosFloat ) ) otherlv_9= ')' )
            // InternalHal.g:817:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= 'is' otherlv_2= 'type' ( ( ruleQualifiedName ) ) otherlv_4= 'at' otherlv_5= '(' ( (lv_lengthPos_6_0= rulePosFloat ) ) otherlv_7= ',' ( (lv_widthPos_8_0= rulePosFloat ) ) otherlv_9= ')'
            {
            // InternalHal.g:817:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalHal.g:818:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalHal.g:818:4: (lv_name_0_0= ruleQualifiedName )
            // InternalHal.g:819:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.hal.Hal.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getTypeKeyword_2());
            		
            // InternalHal.g:844:3: ( ( ruleQualifiedName ) )
            // InternalHal.g:845:4: ( ruleQualifiedName )
            {
            // InternalHal.g:845:4: ( ruleQualifiedName )
            // InternalHal.g:846:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDeviceAccess().getTypeDeviceTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_30);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getAtKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getDeviceAccess().getLeftParenthesisKeyword_5());
            		
            // InternalHal.g:868:3: ( (lv_lengthPos_6_0= rulePosFloat ) )
            // InternalHal.g:869:4: (lv_lengthPos_6_0= rulePosFloat )
            {
            // InternalHal.g:869:4: (lv_lengthPos_6_0= rulePosFloat )
            // InternalHal.g:870:5: lv_lengthPos_6_0= rulePosFloat
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getLengthPosPosFloatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_31);
            lv_lengthPos_6_0=rulePosFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceRule());
            					}
            					set(
            						current,
            						"lengthPos",
            						lv_lengthPos_6_0,
            						"org.xtext.example.hal.Hal.PosFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getDeviceAccess().getCommaKeyword_7());
            		
            // InternalHal.g:891:3: ( (lv_widthPos_8_0= rulePosFloat ) )
            // InternalHal.g:892:4: (lv_widthPos_8_0= rulePosFloat )
            {
            // InternalHal.g:892:4: (lv_widthPos_8_0= rulePosFloat )
            // InternalHal.g:893:5: lv_widthPos_8_0= rulePosFloat
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getWidthPosPosFloatParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
            lv_widthPos_8_0=rulePosFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceRule());
            					}
            					set(
            						current,
            						"widthPos",
            						lv_widthPos_8_0,
            						"org.xtext.example.hal.Hal.PosFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDeviceAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRulePosFloat"
    // InternalHal.g:918:1: entryRulePosFloat returns [String current=null] : iv_rulePosFloat= rulePosFloat EOF ;
    public final String entryRulePosFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePosFloat = null;


        try {
            // InternalHal.g:918:48: (iv_rulePosFloat= rulePosFloat EOF )
            // InternalHal.g:919:2: iv_rulePosFloat= rulePosFloat EOF
            {
             newCompositeNode(grammarAccess.getPosFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosFloat=rulePosFloat();

            state._fsp--;

             current =iv_rulePosFloat.getText(); 
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
    // $ANTLR end "entryRulePosFloat"


    // $ANTLR start "rulePosFloat"
    // InternalHal.g:925:1: rulePosFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )? ) ;
    public final AntlrDatatypeRuleToken rulePosFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalHal.g:931:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )? ) )
            // InternalHal.g:932:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )? )
            {
            // InternalHal.g:932:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )? )
            // InternalHal.g:933:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getPosFloatAccess().getINTTerminalRuleCall_0());
            		
            // InternalHal.g:940:3: (kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalHal.g:941:4: kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
                    {
                    kw=(Token)match(input,22,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPosFloatAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_32); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getPosFloatAccess().getINTTerminalRuleCall_1_1());
                    			
                    // InternalHal.g:953:4: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=34 && LA23_0<=35)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalHal.g:954:5: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_6= RULE_INT
                            {
                            // InternalHal.g:954:5: (kw= 'E' | kw= 'e' )
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==34) ) {
                                alt21=1;
                            }
                            else if ( (LA21_0==35) ) {
                                alt21=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 21, 0, input);

                                throw nvae;
                            }
                            switch (alt21) {
                                case 1 :
                                    // InternalHal.g:955:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,34,FOLLOW_33); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getPosFloatAccess().getEKeyword_1_2_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalHal.g:961:6: kw= 'e'
                                    {
                                    kw=(Token)match(input,35,FOLLOW_33); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getPosFloatAccess().getEKeyword_1_2_0_1());
                                    					

                                    }
                                    break;

                            }

                            // InternalHal.g:967:5: (kw= '-' )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==36) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalHal.g:968:6: kw= '-'
                                    {
                                    kw=(Token)match(input,36,FOLLOW_18); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getPosFloatAccess().getHyphenMinusKeyword_1_2_1());
                                    					

                                    }
                                    break;

                            }

                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                            					current.merge(this_INT_6);
                            				

                            					newLeafNode(this_INT_6, grammarAccess.getPosFloatAccess().getINTTerminalRuleCall_1_2_2());
                            				

                            }
                            break;

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
    // $ANTLR end "rulePosFloat"


    // $ANTLR start "entryRuleAction"
    // InternalHal.g:987:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalHal.g:987:47: (iv_ruleAction= ruleAction EOF )
            // InternalHal.g:988:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalHal.g:994:1: ruleAction returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'runs' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalHal.g:1000:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'runs' ( ( ruleQualifiedName ) ) ) )
            // InternalHal.g:1001:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'runs' ( ( ruleQualifiedName ) ) )
            {
            // InternalHal.g:1001:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'runs' ( ( ruleQualifiedName ) ) )
            // InternalHal.g:1002:3: ( ( ruleQualifiedName ) ) otherlv_1= 'runs' ( ( ruleQualifiedName ) )
            {
            // InternalHal.g:1002:3: ( ( ruleQualifiedName ) )
            // InternalHal.g:1003:4: ( ruleQualifiedName )
            {
            // InternalHal.g:1003:4: ( ruleQualifiedName )
            // InternalHal.g:1004:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorDeviceCrossReference_0_0());
            				
            pushFollow(FOLLOW_34);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getRunsKeyword_1());
            		
            // InternalHal.g:1022:3: ( ( ruleQualifiedName ) )
            // InternalHal.g:1023:4: ( ruleQualifiedName )
            {
            // InternalHal.g:1023:4: ( ruleQualifiedName )
            // InternalHal.g:1024:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getCommandCommandCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAtomicRelationalTerm"
    // InternalHal.g:1042:1: entryRuleAtomicRelationalTerm returns [EObject current=null] : iv_ruleAtomicRelationalTerm= ruleAtomicRelationalTerm EOF ;
    public final EObject entryRuleAtomicRelationalTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRelationalTerm = null;


        try {
            // InternalHal.g:1042:61: (iv_ruleAtomicRelationalTerm= ruleAtomicRelationalTerm EOF )
            // InternalHal.g:1043:2: iv_ruleAtomicRelationalTerm= ruleAtomicRelationalTerm EOF
            {
             newCompositeNode(grammarAccess.getAtomicRelationalTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicRelationalTerm=ruleAtomicRelationalTerm();

            state._fsp--;

             current =iv_ruleAtomicRelationalTerm; 
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
    // $ANTLR end "entryRuleAtomicRelationalTerm"


    // $ANTLR start "ruleAtomicRelationalTerm"
    // InternalHal.g:1049:1: ruleAtomicRelationalTerm returns [EObject current=null] : ( ( (lv_negated_0_0= 'NOT' ) )? ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparedAgainstValue_3_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleAtomicRelationalTerm() throws RecognitionException {
        EObject current = null;

        Token lv_negated_0_0=null;
        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_comparedAgainstValue_3_0 = null;



        	enterRule();

        try {
            // InternalHal.g:1055:2: ( ( ( (lv_negated_0_0= 'NOT' ) )? ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparedAgainstValue_3_0= ruleQualifiedName ) ) ) )
            // InternalHal.g:1056:2: ( ( (lv_negated_0_0= 'NOT' ) )? ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparedAgainstValue_3_0= ruleQualifiedName ) ) )
            {
            // InternalHal.g:1056:2: ( ( (lv_negated_0_0= 'NOT' ) )? ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparedAgainstValue_3_0= ruleQualifiedName ) ) )
            // InternalHal.g:1057:3: ( (lv_negated_0_0= 'NOT' ) )? ( ( ruleQualifiedName ) ) ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_comparedAgainstValue_3_0= ruleQualifiedName ) )
            {
            // InternalHal.g:1057:3: ( (lv_negated_0_0= 'NOT' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalHal.g:1058:4: (lv_negated_0_0= 'NOT' )
                    {
                    // InternalHal.g:1058:4: (lv_negated_0_0= 'NOT' )
                    // InternalHal.g:1059:5: lv_negated_0_0= 'NOT'
                    {
                    lv_negated_0_0=(Token)match(input,38,FOLLOW_10); 

                    					newLeafNode(lv_negated_0_0, grammarAccess.getAtomicRelationalTermAccess().getNegatedNOTKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomicRelationalTermRule());
                    					}
                    					setWithLastConsumed(current, "negated", lv_negated_0_0 != null, "NOT");
                    				

                    }


                    }
                    break;

            }

            // InternalHal.g:1071:3: ( ( ruleQualifiedName ) )
            // InternalHal.g:1072:4: ( ruleQualifiedName )
            {
            // InternalHal.g:1072:4: ( ruleQualifiedName )
            // InternalHal.g:1073:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicRelationalTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAtomicRelationalTermAccess().getSensorDeviceCrossReference_1_0());
            				
            pushFollow(FOLLOW_35);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHal.g:1087:3: ( (lv_operator_2_0= ruleComparisonOperator ) )
            // InternalHal.g:1088:4: (lv_operator_2_0= ruleComparisonOperator )
            {
            // InternalHal.g:1088:4: (lv_operator_2_0= ruleComparisonOperator )
            // InternalHal.g:1089:5: lv_operator_2_0= ruleComparisonOperator
            {

            					newCompositeNode(grammarAccess.getAtomicRelationalTermAccess().getOperatorComparisonOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_operator_2_0=ruleComparisonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicRelationalTermRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"org.xtext.example.hal.Hal.ComparisonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHal.g:1106:3: ( (lv_comparedAgainstValue_3_0= ruleQualifiedName ) )
            // InternalHal.g:1107:4: (lv_comparedAgainstValue_3_0= ruleQualifiedName )
            {
            // InternalHal.g:1107:4: (lv_comparedAgainstValue_3_0= ruleQualifiedName )
            // InternalHal.g:1108:5: lv_comparedAgainstValue_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getAtomicRelationalTermAccess().getComparedAgainstValueQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_comparedAgainstValue_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicRelationalTermRule());
            					}
            					set(
            						current,
            						"comparedAgainstValue",
            						lv_comparedAgainstValue_3_0,
            						"org.xtext.example.hal.Hal.QualifiedName");
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
    // $ANTLR end "ruleAtomicRelationalTerm"


    // $ANTLR start "entryRuleCompoundRelationalTerm"
    // InternalHal.g:1129:1: entryRuleCompoundRelationalTerm returns [EObject current=null] : iv_ruleCompoundRelationalTerm= ruleCompoundRelationalTerm EOF ;
    public final EObject entryRuleCompoundRelationalTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundRelationalTerm = null;


        try {
            // InternalHal.g:1129:63: (iv_ruleCompoundRelationalTerm= ruleCompoundRelationalTerm EOF )
            // InternalHal.g:1130:2: iv_ruleCompoundRelationalTerm= ruleCompoundRelationalTerm EOF
            {
             newCompositeNode(grammarAccess.getCompoundRelationalTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompoundRelationalTerm=ruleCompoundRelationalTerm();

            state._fsp--;

             current =iv_ruleCompoundRelationalTerm; 
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
    // $ANTLR end "entryRuleCompoundRelationalTerm"


    // $ANTLR start "ruleCompoundRelationalTerm"
    // InternalHal.g:1136:1: ruleCompoundRelationalTerm returns [EObject current=null] : ( ( (lv_negated_0_0= 'NOT' ) )? otherlv_1= '(' ( (lv_LHS_2_0= ruleBooleanExpression ) ) ( (lv_operator_3_0= ruleBooleanOperator ) ) ( (lv_RHS_4_0= ruleBooleanExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleCompoundRelationalTerm() throws RecognitionException {
        EObject current = null;

        Token lv_negated_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_LHS_2_0 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_RHS_4_0 = null;



        	enterRule();

        try {
            // InternalHal.g:1142:2: ( ( ( (lv_negated_0_0= 'NOT' ) )? otherlv_1= '(' ( (lv_LHS_2_0= ruleBooleanExpression ) ) ( (lv_operator_3_0= ruleBooleanOperator ) ) ( (lv_RHS_4_0= ruleBooleanExpression ) ) otherlv_5= ')' ) )
            // InternalHal.g:1143:2: ( ( (lv_negated_0_0= 'NOT' ) )? otherlv_1= '(' ( (lv_LHS_2_0= ruleBooleanExpression ) ) ( (lv_operator_3_0= ruleBooleanOperator ) ) ( (lv_RHS_4_0= ruleBooleanExpression ) ) otherlv_5= ')' )
            {
            // InternalHal.g:1143:2: ( ( (lv_negated_0_0= 'NOT' ) )? otherlv_1= '(' ( (lv_LHS_2_0= ruleBooleanExpression ) ) ( (lv_operator_3_0= ruleBooleanOperator ) ) ( (lv_RHS_4_0= ruleBooleanExpression ) ) otherlv_5= ')' )
            // InternalHal.g:1144:3: ( (lv_negated_0_0= 'NOT' ) )? otherlv_1= '(' ( (lv_LHS_2_0= ruleBooleanExpression ) ) ( (lv_operator_3_0= ruleBooleanOperator ) ) ( (lv_RHS_4_0= ruleBooleanExpression ) ) otherlv_5= ')'
            {
            // InternalHal.g:1144:3: ( (lv_negated_0_0= 'NOT' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalHal.g:1145:4: (lv_negated_0_0= 'NOT' )
                    {
                    // InternalHal.g:1145:4: (lv_negated_0_0= 'NOT' )
                    // InternalHal.g:1146:5: lv_negated_0_0= 'NOT'
                    {
                    lv_negated_0_0=(Token)match(input,38,FOLLOW_17); 

                    					newLeafNode(lv_negated_0_0, grammarAccess.getCompoundRelationalTermAccess().getNegatedNOTKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompoundRelationalTermRule());
                    					}
                    					setWithLastConsumed(current, "negated", lv_negated_0_0 != null, "NOT");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getCompoundRelationalTermAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHal.g:1162:3: ( (lv_LHS_2_0= ruleBooleanExpression ) )
            // InternalHal.g:1163:4: (lv_LHS_2_0= ruleBooleanExpression )
            {
            // InternalHal.g:1163:4: (lv_LHS_2_0= ruleBooleanExpression )
            // InternalHal.g:1164:5: lv_LHS_2_0= ruleBooleanExpression
            {

            					newCompositeNode(grammarAccess.getCompoundRelationalTermAccess().getLHSBooleanExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_LHS_2_0=ruleBooleanExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundRelationalTermRule());
            					}
            					set(
            						current,
            						"LHS",
            						lv_LHS_2_0,
            						"org.xtext.example.hal.Hal.BooleanExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHal.g:1181:3: ( (lv_operator_3_0= ruleBooleanOperator ) )
            // InternalHal.g:1182:4: (lv_operator_3_0= ruleBooleanOperator )
            {
            // InternalHal.g:1182:4: (lv_operator_3_0= ruleBooleanOperator )
            // InternalHal.g:1183:5: lv_operator_3_0= ruleBooleanOperator
            {

            					newCompositeNode(grammarAccess.getCompoundRelationalTermAccess().getOperatorBooleanOperatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_operator_3_0=ruleBooleanOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundRelationalTermRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"org.xtext.example.hal.Hal.BooleanOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHal.g:1200:3: ( (lv_RHS_4_0= ruleBooleanExpression ) )
            // InternalHal.g:1201:4: (lv_RHS_4_0= ruleBooleanExpression )
            {
            // InternalHal.g:1201:4: (lv_RHS_4_0= ruleBooleanExpression )
            // InternalHal.g:1202:5: lv_RHS_4_0= ruleBooleanExpression
            {

            					newCompositeNode(grammarAccess.getCompoundRelationalTermAccess().getRHSBooleanExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_RHS_4_0=ruleBooleanExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundRelationalTermRule());
            					}
            					set(
            						current,
            						"RHS",
            						lv_RHS_4_0,
            						"org.xtext.example.hal.Hal.BooleanExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCompoundRelationalTermAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleCompoundRelationalTerm"


    // $ANTLR start "entryRuleCommand"
    // InternalHal.g:1227:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalHal.g:1227:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalHal.g:1228:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalHal.g:1234:1: ruleCommand returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalHal.g:1240:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // InternalHal.g:1241:2: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // InternalHal.g:1241:2: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalHal.g:1242:3: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalHal.g:1242:3: (lv_name_0_0= ruleQualifiedName )
            // InternalHal.g:1243:4: lv_name_0_0= ruleQualifiedName
            {

            				newCompositeNode(grammarAccess.getCommandAccess().getNameQualifiedNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getCommandRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.hal.Hal.QualifiedName");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleSensor"
    // InternalHal.g:1263:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalHal.g:1263:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalHal.g:1264:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalHal.g:1270:1: ruleSensor returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalHal.g:1276:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // InternalHal.g:1277:2: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // InternalHal.g:1277:2: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalHal.g:1278:3: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalHal.g:1278:3: (lv_name_0_0= ruleQualifiedName )
            // InternalHal.g:1279:4: lv_name_0_0= ruleQualifiedName
            {

            				newCompositeNode(grammarAccess.getSensorAccess().getNameQualifiedNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSensorRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.hal.Hal.QualifiedName");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalHal.g:1299:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalHal.g:1299:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalHal.g:1300:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalHal.g:1306:1: ruleActuator returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '{' ( ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_commands_2_0 = null;

        EObject lv_commands_4_0 = null;



        	enterRule();

        try {
            // InternalHal.g:1312:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '{' ( ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )* )? otherlv_5= '}' ) )
            // InternalHal.g:1313:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '{' ( ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )* )? otherlv_5= '}' )
            {
            // InternalHal.g:1313:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '{' ( ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )* )? otherlv_5= '}' )
            // InternalHal.g:1314:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= '{' ( ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )* )? otherlv_5= '}'
            {
            // InternalHal.g:1314:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalHal.g:1315:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalHal.g:1315:4: (lv_name_0_0= ruleQualifiedName )
            // InternalHal.g:1316:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.hal.Hal.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalHal.g:1337:3: ( ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalHal.g:1338:4: ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )*
                    {
                    // InternalHal.g:1338:4: ( (lv_commands_2_0= ruleCommand ) )
                    // InternalHal.g:1339:5: (lv_commands_2_0= ruleCommand )
                    {
                    // InternalHal.g:1339:5: (lv_commands_2_0= ruleCommand )
                    // InternalHal.g:1340:6: lv_commands_2_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getCommandsCommandParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_commands_2_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						add(
                    							current,
                    							"commands",
                    							lv_commands_2_0,
                    							"org.xtext.example.hal.Hal.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHal.g:1357:4: (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==16) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalHal.g:1358:5: otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalHal.g:1362:5: ( (lv_commands_4_0= ruleCommand ) )
                    	    // InternalHal.g:1363:6: (lv_commands_4_0= ruleCommand )
                    	    {
                    	    // InternalHal.g:1363:6: (lv_commands_4_0= ruleCommand )
                    	    // InternalHal.g:1364:7: lv_commands_4_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getActuatorAccess().getCommandsCommandParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_commands_4_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActuatorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"commands",
                    	    								lv_commands_4_0,
                    	    								"org.xtext.example.hal.Hal.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleELong"
    // InternalHal.g:1391:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // InternalHal.g:1391:45: (iv_ruleELong= ruleELong EOF )
            // InternalHal.g:1392:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalHal.g:1398:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalHal.g:1404:2: (this_INT_0= RULE_INT )
            // InternalHal.g:1405:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getELongAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "ruleComparisonOperator"
    // InternalHal.g:1415:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalHal.g:1421:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalHal.g:1422:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalHal.g:1422:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) )
            int alt29=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt29=1;
                }
                break;
            case 40:
                {
                alt29=2;
                }
                break;
            case 41:
                {
                alt29=3;
                }
                break;
            case 42:
                {
                alt29=4;
                }
                break;
            case 43:
                {
                alt29=5;
                }
                break;
            case 44:
                {
                alt29=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalHal.g:1423:3: (enumLiteral_0= '=' )
                    {
                    // InternalHal.g:1423:3: (enumLiteral_0= '=' )
                    // InternalHal.g:1424:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHal.g:1431:3: (enumLiteral_1= '>' )
                    {
                    // InternalHal.g:1431:3: (enumLiteral_1= '>' )
                    // InternalHal.g:1432:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATERTHANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGREATERTHANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHal.g:1439:3: (enumLiteral_2= '>=' )
                    {
                    // InternalHal.g:1439:3: (enumLiteral_2= '>=' )
                    // InternalHal.g:1440:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATERTHANOREQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGREATERTHANOREQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHal.g:1447:3: (enumLiteral_3= '<' )
                    {
                    // InternalHal.g:1447:3: (enumLiteral_3= '<' )
                    // InternalHal.g:1448:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESSTHANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getLESSTHANEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHal.g:1455:3: (enumLiteral_4= '<=' )
                    {
                    // InternalHal.g:1455:3: (enumLiteral_4= '<=' )
                    // InternalHal.g:1456:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESSTHANOREQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getLESSTHANOREQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHal.g:1463:3: (enumLiteral_5= '!=' )
                    {
                    // InternalHal.g:1463:3: (enumLiteral_5= '!=' )
                    // InternalHal.g:1464:4: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getNOTEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getNOTEQUALEnumLiteralDeclaration_5());
                    			

                    }


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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleBooleanOperator"
    // InternalHal.g:1474:1: ruleBooleanOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleBooleanOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalHal.g:1480:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalHal.g:1481:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalHal.g:1481:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            else if ( (LA30_0==46) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalHal.g:1482:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalHal.g:1482:3: (enumLiteral_0= 'AND' )
                    // InternalHal.g:1483:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHal.g:1490:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalHal.g:1490:3: (enumLiteral_1= 'OR' )
                    // InternalHal.g:1491:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleBooleanOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000382002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000800030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00001F8000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000600000000000L});

}