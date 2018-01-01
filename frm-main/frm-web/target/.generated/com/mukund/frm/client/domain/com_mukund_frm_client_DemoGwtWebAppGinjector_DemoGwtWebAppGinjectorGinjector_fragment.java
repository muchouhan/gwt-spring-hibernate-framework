package com.mukund.frm.client.domain;

import com.google.gwt.core.client.GWT;
import com.mukund.frm.client.com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector;

public class com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$mukund$frm$client$domain$PersonClient$_annotation$$none$$(com.mukund.frm.client.domain.PersonClient injectee) {
    
  }
  
  public void memberInject_Key$type$com$mukund$frm$client$domain$UserClient$_annotation$$none$$(com.mukund.frm.client.domain.UserClient injectee) {
    
  }
  
  private com.mukund.frm.client.domain.PersonClient singleton_Key$type$com$mukund$frm$client$domain$PersonClient$_annotation$$none$$ = null;
  
  public com.mukund.frm.client.domain.PersonClient get_Key$type$com$mukund$frm$client$domain$PersonClient$_annotation$$none$$() {
    
    if (singleton_Key$type$com$mukund$frm$client$domain$PersonClient$_annotation$$none$$ == null) {
    Object created = GWT.create(com.mukund.frm.client.domain.PersonClient.class);
    assert created instanceof com.mukund.frm.client.domain.PersonClient;
    com.mukund.frm.client.domain.PersonClient result = (com.mukund.frm.client.domain.PersonClient) created;
    
    memberInject_Key$type$com$mukund$frm$client$domain$PersonClient$_annotation$$none$$(result);
    
        singleton_Key$type$com$mukund$frm$client$domain$PersonClient$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$mukund$frm$client$domain$PersonClient$_annotation$$none$$;
    
  }
  
  private com.mukund.frm.client.domain.UserClient singleton_Key$type$com$mukund$frm$client$domain$UserClient$_annotation$$none$$ = null;
  
  public com.mukund.frm.client.domain.UserClient get_Key$type$com$mukund$frm$client$domain$UserClient$_annotation$$none$$() {
    
    if (singleton_Key$type$com$mukund$frm$client$domain$UserClient$_annotation$$none$$ == null) {
    Object created = GWT.create(com.mukund.frm.client.domain.UserClient.class);
    assert created instanceof com.mukund.frm.client.domain.UserClient;
    com.mukund.frm.client.domain.UserClient result = (com.mukund.frm.client.domain.UserClient) created;
    
    memberInject_Key$type$com$mukund$frm$client$domain$UserClient$_annotation$$none$$(result);
    
        singleton_Key$type$com$mukund$frm$client$domain$UserClient$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$mukund$frm$client$domain$UserClient$_annotation$$none$$;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector injector;
  public com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector_fragment(com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
