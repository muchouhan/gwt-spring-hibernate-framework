package com.mukund.frm.client;

import com.google.gwt.core.client.GWT;
import com.mukund.frm.client.com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector;

public class com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$mukund$frm$client$Messages$_annotation$$none$$(com.mukund.frm.client.Messages injectee) {
    
  }
  
  public native void com$mukund$frm$client$ServicePreparator_personClient_fieldInjection(com.mukund.frm.client.ServicePreparator injectee, com.mukund.frm.client.domain.PersonClient value) /*-{
    injectee.@com.mukund.frm.client.ServicePreparator::personClient = value;
  }-*/;
  
  public void com$mukund$frm$client$ServicePreparator_userClient_fieldInjection(com.mukund.frm.client.ServicePreparator injectee, com.mukund.frm.client.domain.UserClient value) {
    injectee.userClient = value;
  }
  
  public void memberInject_Key$type$com$mukund$frm$client$ServicePreparator$_annotation$$none$$(com.mukund.frm.client.ServicePreparator injectee) {
    com$mukund$frm$client$ServicePreparator_personClient_fieldInjection(injectee, injector.getFragment_com_mukund_frm_client_domain().get_Key$type$com$mukund$frm$client$domain$PersonClient$_annotation$$none$$());
    
    com$mukund$frm$client$ServicePreparator_userClient_fieldInjection(injectee, injector.getFragment_com_mukund_frm_client_domain().get_Key$type$com$mukund$frm$client$domain$UserClient$_annotation$$none$$());
    
    
  }
  
  
  /**
   * Binding for com.mukund.frm.client.Messages declared at:
   *   Implicit GWT.create binding for com.mukund.frm.client.Messages
   */
  public com.mukund.frm.client.Messages get_Key$type$com$mukund$frm$client$Messages$_annotation$$none$$() {
    Object created = GWT.create(com.mukund.frm.client.Messages.class);
    assert created instanceof com.mukund.frm.client.Messages;
    com.mukund.frm.client.Messages result = (com.mukund.frm.client.Messages) created;
    
    memberInject_Key$type$com$mukund$frm$client$Messages$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.mukund.frm.client.ServicePreparator singleton_Key$type$com$mukund$frm$client$ServicePreparator$_annotation$$none$$ = null;
  
  public com.mukund.frm.client.ServicePreparator get_Key$type$com$mukund$frm$client$ServicePreparator$_annotation$$none$$() {
    
    if (singleton_Key$type$com$mukund$frm$client$ServicePreparator$_annotation$$none$$ == null) {
    Object created = GWT.create(com.mukund.frm.client.ServicePreparator.class);
    assert created instanceof com.mukund.frm.client.ServicePreparator;
    com.mukund.frm.client.ServicePreparator result = (com.mukund.frm.client.ServicePreparator) created;
    
    memberInject_Key$type$com$mukund$frm$client$ServicePreparator$_annotation$$none$$(result);
    
        singleton_Key$type$com$mukund$frm$client$ServicePreparator$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$mukund$frm$client$ServicePreparator$_annotation$$none$$;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector injector;
  public com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector_fragment(com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
