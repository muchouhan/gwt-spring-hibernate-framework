package com.mukund.frm.client.extra;

import com.google.gwt.core.client.GWT;
import com.mukund.frm.client.com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector;

public class com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$mukund$frm$client$extra$PersonUtil$_annotation$$none$$(com.mukund.frm.client.extra.PersonUtil injectee) {
    
  }
  
  private com.mukund.frm.client.extra.PersonUtil singleton_Key$type$com$mukund$frm$client$extra$PersonUtil$_annotation$$none$$ = null;
  
  public com.mukund.frm.client.extra.PersonUtil get_Key$type$com$mukund$frm$client$extra$PersonUtil$_annotation$$none$$() {
    
    if (singleton_Key$type$com$mukund$frm$client$extra$PersonUtil$_annotation$$none$$ == null) {
    com.mukund.frm.client.extra.PersonUtil result = com$mukund$frm$client$extra$PersonUtil_com$mukund$frm$client$extra$PersonUtil_methodInjection(injector.getFragment_com_google_gwt_event_shared().get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$());
    memberInject_Key$type$com$mukund$frm$client$extra$PersonUtil$_annotation$$none$$(result);
    
        singleton_Key$type$com$mukund$frm$client$extra$PersonUtil$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$mukund$frm$client$extra$PersonUtil$_annotation$$none$$;
    
  }
  
  public com.mukund.frm.client.extra.PersonUtil com$mukund$frm$client$extra$PersonUtil_com$mukund$frm$client$extra$PersonUtil_methodInjection(com.google.gwt.event.shared.EventBus _0) {
    return new com.mukund.frm.client.extra.PersonUtil(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector injector;
  public com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector_fragment(com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
