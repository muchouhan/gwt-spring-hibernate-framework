package com.mukund.frm.client.common;

import com.google.gwt.core.client.GWT;
import com.mukund.frm.client.com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector;

public class com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$mukund$frm$client$common$ErrorFormatter$_annotation$$none$$(com.mukund.frm.client.common.ErrorFormatter injectee) {
    
  }
  
  public void memberInject_Key$type$com$mukund$frm$client$common$Asset$_annotation$$none$$(com.mukund.frm.client.common.Asset injectee) {
    
  }
  
  public void memberInject_Key$type$com$mukund$frm$client$common$LoadingMessagePopupPanel$_annotation$$none$$(com.mukund.frm.client.common.LoadingMessagePopupPanel injectee) {
    
  }
  
  public native void com$mukund$frm$client$common$ServicePreparator_personClient_fieldInjection(com.mukund.frm.client.common.ServicePreparator injectee, com.mukund.frm.client.domain.PersonClient value) /*-{
    injectee.@com.mukund.frm.client.common.ServicePreparator::personClient = value;
  }-*/;
  
  public void com$mukund$frm$client$common$ServicePreparator_userClient_fieldInjection(com.mukund.frm.client.common.ServicePreparator injectee, com.mukund.frm.client.domain.UserClient value) {
    injectee.userClient = value;
  }
  
  public void memberInject_Key$type$com$mukund$frm$client$common$ServicePreparator$_annotation$$none$$(com.mukund.frm.client.common.ServicePreparator injectee) {
    com$mukund$frm$client$common$ServicePreparator_personClient_fieldInjection(injectee, injector.getFragment_com_mukund_frm_client_domain().get_Key$type$com$mukund$frm$client$domain$PersonClient$_annotation$$none$$());
    
    com$mukund$frm$client$common$ServicePreparator_userClient_fieldInjection(injectee, injector.getFragment_com_mukund_frm_client_domain().get_Key$type$com$mukund$frm$client$domain$UserClient$_annotation$$none$$());
    
    
  }
  
  private com.mukund.frm.client.common.ErrorFormatter singleton_Key$type$com$mukund$frm$client$common$ErrorFormatter$_annotation$$none$$ = null;
  
  public com.mukund.frm.client.common.ErrorFormatter get_Key$type$com$mukund$frm$client$common$ErrorFormatter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$mukund$frm$client$common$ErrorFormatter$_annotation$$none$$ == null) {
    Object created = GWT.create(com.mukund.frm.client.common.ErrorFormatter.class);
    assert created instanceof com.mukund.frm.client.common.ErrorFormatter;
    com.mukund.frm.client.common.ErrorFormatter result = (com.mukund.frm.client.common.ErrorFormatter) created;
    
    memberInject_Key$type$com$mukund$frm$client$common$ErrorFormatter$_annotation$$none$$(result);
    
        singleton_Key$type$com$mukund$frm$client$common$ErrorFormatter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$mukund$frm$client$common$ErrorFormatter$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.mukund.frm.client.common.Asset declared at:
   *   Implicit GWT.create binding for com.mukund.frm.client.common.Asset
   */
  public com.mukund.frm.client.common.Asset get_Key$type$com$mukund$frm$client$common$Asset$_annotation$$none$$() {
    Object created = GWT.create(com.mukund.frm.client.common.Asset.class);
    assert created instanceof com.mukund.frm.client.common.Asset;
    com.mukund.frm.client.common.Asset result = (com.mukund.frm.client.common.Asset) created;
    
    memberInject_Key$type$com$mukund$frm$client$common$Asset$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.mukund.frm.client.common.LoadingMessagePopupPanel singleton_Key$type$com$mukund$frm$client$common$LoadingMessagePopupPanel$_annotation$$none$$ = null;
  
  public com.mukund.frm.client.common.LoadingMessagePopupPanel get_Key$type$com$mukund$frm$client$common$LoadingMessagePopupPanel$_annotation$$none$$() {
    
    if (singleton_Key$type$com$mukund$frm$client$common$LoadingMessagePopupPanel$_annotation$$none$$ == null) {
    com.mukund.frm.client.common.LoadingMessagePopupPanel result = com$mukund$frm$client$common$LoadingMessagePopupPanel_com$mukund$frm$client$common$LoadingMessagePopupPanel_methodInjection(injector.getFragment_com_mukund_frm_client().get_Key$type$com$mukund$frm$client$Messages$_annotation$$none$$(), get_Key$type$com$mukund$frm$client$common$Asset$_annotation$$none$$());
    memberInject_Key$type$com$mukund$frm$client$common$LoadingMessagePopupPanel$_annotation$$none$$(result);
    
        singleton_Key$type$com$mukund$frm$client$common$LoadingMessagePopupPanel$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$mukund$frm$client$common$LoadingMessagePopupPanel$_annotation$$none$$;
    
  }
  
  public com.mukund.frm.client.common.LoadingMessagePopupPanel com$mukund$frm$client$common$LoadingMessagePopupPanel_com$mukund$frm$client$common$LoadingMessagePopupPanel_methodInjection(com.mukund.frm.client.Messages _0, com.mukund.frm.client.common.Asset _1) {
    return new com.mukund.frm.client.common.LoadingMessagePopupPanel(_0, _1);
  }
  
  private com.mukund.frm.client.common.ServicePreparator singleton_Key$type$com$mukund$frm$client$common$ServicePreparator$_annotation$$none$$ = null;
  
  public com.mukund.frm.client.common.ServicePreparator get_Key$type$com$mukund$frm$client$common$ServicePreparator$_annotation$$none$$() {
    
    if (singleton_Key$type$com$mukund$frm$client$common$ServicePreparator$_annotation$$none$$ == null) {
    Object created = GWT.create(com.mukund.frm.client.common.ServicePreparator.class);
    assert created instanceof com.mukund.frm.client.common.ServicePreparator;
    com.mukund.frm.client.common.ServicePreparator result = (com.mukund.frm.client.common.ServicePreparator) created;
    
    memberInject_Key$type$com$mukund$frm$client$common$ServicePreparator$_annotation$$none$$(result);
    
        singleton_Key$type$com$mukund$frm$client$common$ServicePreparator$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$mukund$frm$client$common$ServicePreparator$_annotation$$none$$;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector injector;
  public com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector_fragment(com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
