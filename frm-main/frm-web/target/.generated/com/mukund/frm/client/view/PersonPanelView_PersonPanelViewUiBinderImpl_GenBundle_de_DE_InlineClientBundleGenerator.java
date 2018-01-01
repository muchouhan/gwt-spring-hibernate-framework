package com.mukund.frm.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class PersonPanelView_PersonPanelViewUiBinderImpl_GenBundle_de_DE_InlineClientBundleGenerator implements com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenBundle {
  private static PersonPanelView_PersonPanelViewUiBinderImpl_GenBundle_de_DE_InlineClientBundleGenerator _instance0 = new PersonPanelView_PersonPanelViewUiBinderImpl_GenBundle_de_DE_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GNJD51RCBJ{margin-left:" + ("10px")  + ";}.GNJD51RCDJ{margin-top:" + ("20px")  + ";margin-right:" + ("10px")  + ";margin-left:" + ("10px")  + ";}.GNJD51RCCJ{margin-top:" + ("10px")  + ";margin-right:" + ("10px")  + ";margin-left:" + ("10px")  + ";}.GNJD51RCEJ{margin-top:" + ("20px")  + ";margin-right:" + ("10px")  + ";margin-left:" + ("10px")  + ";}.GNJD51RCPI{margin-left:") + (("10px")  + ";}.GNJD51RCAJ{margin-bottom:" + ("0")  + " !important;border-bottom-width:" + ("0")  + ";border-style:" + ("none")  + ";}.GNJD51RCOI{margin-right:" + ("15px")  + ";}.GNJD51RCFJ{word-wrap:" + ("break-word")  + ";}")) : ((".GNJD51RCBJ{margin-right:" + ("10px")  + ";}.GNJD51RCDJ{margin-top:" + ("20px")  + ";margin-left:" + ("10px")  + ";margin-right:" + ("10px")  + ";}.GNJD51RCCJ{margin-top:" + ("10px")  + ";margin-left:" + ("10px")  + ";margin-right:" + ("10px")  + ";}.GNJD51RCEJ{margin-top:" + ("20px")  + ";margin-left:" + ("10px")  + ";margin-right:" + ("10px")  + ";}.GNJD51RCPI{margin-right:") + (("10px")  + ";}.GNJD51RCAJ{margin-bottom:" + ("0")  + " !important;border-bottom-width:" + ("0")  + ";border-style:" + ("none")  + ";}.GNJD51RCOI{margin-left:" + ("15px")  + ";}.GNJD51RCFJ{word-wrap:" + ("break-word")  + ";}"));
      }
      public java.lang.String amountUpdateTimeInfo() {
        return "GNJD51RCOI";
      }
      public java.lang.String buttonToolbar() {
        return "GNJD51RCPI";
      }
      public java.lang.String marginFix() {
        return "GNJD51RCAJ";
      }
      public java.lang.String marginRight() {
        return "GNJD51RCBJ";
      }
      public java.lang.String panelLeftBottom() {
        return "GNJD51RCCJ";
      }
      public java.lang.String panelLeftTop() {
        return "GNJD51RCDJ";
      }
      public java.lang.String panelMain() {
        return "GNJD51RCEJ";
      }
      public java.lang.String tableWordWrap() {
        return "GNJD51RCFJ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
