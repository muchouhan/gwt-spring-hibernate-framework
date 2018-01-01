package com.mukund.frm.client.common;

import com.google.gwt.core.client.GWT;
import com.mukund.frm.client.com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector;

public class com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$mukund$frm$client$common$ErrorFormatter$_annotation$$none$$(com.mukund.frm.client.common.ErrorFormatter injectee) {
    
  }
  
  public void memberInject_Key$type$com$mukund$frm$client$common$Asset$_annotation$$none$$(com.mukund.frm.client.common.Asset injectee) {
    
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
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector injector;
  public com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector_fragment(com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
