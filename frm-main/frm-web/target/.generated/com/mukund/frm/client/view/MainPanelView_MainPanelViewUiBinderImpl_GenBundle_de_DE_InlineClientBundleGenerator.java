package com.mukund.frm.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MainPanelView_MainPanelViewUiBinderImpl_GenBundle_de_DE_InlineClientBundleGenerator implements com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenBundle {
  private static MainPanelView_MainPanelViewUiBinderImpl_GenBundle_de_DE_InlineClientBundleGenerator _instance0 = new MainPanelView_MainPanelViewUiBinderImpl_GenBundle_de_DE_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GNJD51RCGI{background-color:" + ("#fcf2f2")  + ";border-color:" + ("#dfb5b4")  + ";}.GNJD51RCHI{margin-bottom:" + ("0")  + " !important;}.GNJD51RCII{margin-right:" + ("20px")  + ";margin-top:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";}.GNJD51RCMI{margin-left:" + ("20px")  + ";margin-right:" + ("20px")  + ";}.GNJD51RCNI{margin-left:" + ("20px")  + ";margin-right:" + ("10px")  + ";}.GNJD51RCKI{margin-top:") + (("30px")  + ";margin-bottom:" + ("10px")  + ";}.GNJD51RCLI{margin-top:" + ("10px")  + ";margin-bottom:" + ("10px")  + ";}.GNJD51RCJI{padding-top:" + ("5px")  + ";}")) : ((".GNJD51RCGI{background-color:" + ("#fcf2f2")  + ";border-color:" + ("#dfb5b4")  + ";}.GNJD51RCHI{margin-bottom:" + ("0")  + " !important;}.GNJD51RCII{margin-left:" + ("20px")  + ";margin-top:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";}.GNJD51RCMI{margin-right:" + ("20px")  + ";margin-left:" + ("20px")  + ";}.GNJD51RCNI{margin-right:" + ("20px")  + ";margin-left:" + ("10px")  + ";}.GNJD51RCKI{margin-top:") + (("30px")  + ";margin-bottom:" + ("10px")  + ";}.GNJD51RCLI{margin-top:" + ("10px")  + ";margin-bottom:" + ("10px")  + ";}.GNJD51RCJI{padding-top:" + ("5px")  + ";}"));
      }
      public java.lang.String danger() {
        return "GNJD51RCGI";
      }
      public java.lang.String marginFix() {
        return "GNJD51RCHI";
      }
      public java.lang.String marginLogo() {
        return "GNJD51RCII";
      }
      public java.lang.String marginTitle() {
        return "GNJD51RCJI";
      }
      public java.lang.String marginTopBottom() {
        return "GNJD51RCKI";
      }
      public java.lang.String marginTopBottomSearchField() {
        return "GNJD51RCLI";
      }
      public java.lang.String marginUser() {
        return "GNJD51RCMI";
      }
      public java.lang.String marginWebapps() {
        return "GNJD51RCNI";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
