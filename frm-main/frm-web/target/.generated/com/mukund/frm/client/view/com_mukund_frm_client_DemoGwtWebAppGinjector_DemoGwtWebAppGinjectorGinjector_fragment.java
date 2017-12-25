package com.mukund.frm.client.view;

import com.google.gwt.core.client.GWT;
import com.mukund.frm.client.com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector;

public class com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$mukund$frm$client$view$MainPanelView$_annotation$$none$$(com.mukund.frm.client.view.MainPanelView injectee) {
    
  }
  
  public void com$mukund$frm$client$view$PersonPanelView_personUtil_fieldInjection(com.mukund.frm.client.view.PersonPanelView injectee, com.mukund.frm.client.extra.PersonUtil value) {
    injectee.personUtil = value;
  }
  
  public void memberInject_Key$type$com$mukund$frm$client$view$PersonPanelView$_annotation$$none$$(com.mukund.frm.client.view.PersonPanelView injectee) {
    com$mukund$frm$client$view$PersonPanelView_personUtil_fieldInjection(injectee, injector.getFragment_com_mukund_frm_client_extra().get_Key$type$com$mukund$frm$client$extra$PersonUtil$_annotation$$none$$());
    
    
  }
  
  private com.mukund.frm.client.view.MainPanelView singleton_Key$type$com$mukund$frm$client$view$MainPanelView$_annotation$$none$$ = null;
  
  public com.mukund.frm.client.view.MainPanelView get_Key$type$com$mukund$frm$client$view$MainPanelView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$mukund$frm$client$view$MainPanelView$_annotation$$none$$ == null) {
    com.mukund.frm.client.view.MainPanelView result = com$mukund$frm$client$view$MainPanelView_com$mukund$frm$client$view$MainPanelView_methodInjection(injector.getFragment_com_google_gwt_event_shared().get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), injector.getFragment_com_mukund_frm_client_common().get_Key$type$com$mukund$frm$client$common$ErrorFormatter$_annotation$$none$$(), injector.getFragment_com_mukund_frm_client_common().get_Key$type$com$mukund$frm$client$common$LoadingMessagePopupPanel$_annotation$$none$$());
    memberInject_Key$type$com$mukund$frm$client$view$MainPanelView$_annotation$$none$$(result);
    
        singleton_Key$type$com$mukund$frm$client$view$MainPanelView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$mukund$frm$client$view$MainPanelView$_annotation$$none$$;
    
  }
  
  public com.mukund.frm.client.view.MainPanelView com$mukund$frm$client$view$MainPanelView_com$mukund$frm$client$view$MainPanelView_methodInjection(com.google.gwt.event.shared.EventBus _0, com.mukund.frm.client.common.ErrorFormatter _1, com.mukund.frm.client.common.LoadingMessagePopupPanel _2) {
    return new com.mukund.frm.client.view.MainPanelView(_0, _1, _2);
  }
  
  private com.mukund.frm.client.view.PersonPanelView singleton_Key$type$com$mukund$frm$client$view$PersonPanelView$_annotation$$none$$ = null;
  
  public com.mukund.frm.client.view.PersonPanelView get_Key$type$com$mukund$frm$client$view$PersonPanelView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$mukund$frm$client$view$PersonPanelView$_annotation$$none$$ == null) {
    com.mukund.frm.client.view.PersonPanelView result = com$mukund$frm$client$view$PersonPanelView_com$mukund$frm$client$view$PersonPanelView_methodInjection(injector.getFragment_com_google_gwt_event_shared().get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), injector.getFragment_com_mukund_frm_client_common().get_Key$type$com$mukund$frm$client$common$ErrorFormatter$_annotation$$none$$(), injector.getFragment_com_mukund_frm_client_common().get_Key$type$com$mukund$frm$client$common$LoadingMessagePopupPanel$_annotation$$none$$(), injector.getFragment_com_mukund_frm_client_domain().get_Key$type$com$mukund$frm$client$domain$PersonClient$_annotation$$none$$());
    memberInject_Key$type$com$mukund$frm$client$view$PersonPanelView$_annotation$$none$$(result);
    
        singleton_Key$type$com$mukund$frm$client$view$PersonPanelView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$mukund$frm$client$view$PersonPanelView$_annotation$$none$$;
    
  }
  
  public com.mukund.frm.client.view.PersonPanelView com$mukund$frm$client$view$PersonPanelView_com$mukund$frm$client$view$PersonPanelView_methodInjection(com.google.gwt.event.shared.EventBus _0, com.mukund.frm.client.common.ErrorFormatter _1, com.mukund.frm.client.common.LoadingMessagePopupPanel _2, com.mukund.frm.client.domain.PersonClient _3) {
    return new com.mukund.frm.client.view.PersonPanelView(_0, _1, _2, _3);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector injector;
  public com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector_fragment(com_mukund_frm_client_DemoGwtWebAppGinjector_DemoGwtWebAppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
