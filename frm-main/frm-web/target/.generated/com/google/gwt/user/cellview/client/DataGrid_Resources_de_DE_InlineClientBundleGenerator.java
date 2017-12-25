package com.google.gwt.user.cellview.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DataGrid_Resources_de_DE_InlineClientBundleGenerator implements com.google.gwt.user.cellview.client.DataGrid.Resources {
  private static DataGrid_Resources_de_DE_InlineClientBundleGenerator _instance0 = new DataGrid_Resources_de_DE_InlineClientBundleGenerator();
  private void dataGridLoadingInitializer() {
    dataGridLoading = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "dataGridLoading",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?externalImage_rtl : externalImage),
      0, 0, 43, 11, true, false
    );
  }
  private static class dataGridLoadingInitializer {
    static {
      _instance0.dataGridLoadingInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return dataGridLoading;
    }
  }
  public com.google.gwt.resources.client.ImageResource dataGridLoading() {
    return dataGridLoadingInitializer.get();
  }
  private void dataGridSortAscendingInitializer() {
    dataGridSortAscending = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "dataGridSortAscending",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?externalImage_rtl0 : externalImage0),
      0, 0, 11, 7, false, false
    );
  }
  private static class dataGridSortAscendingInitializer {
    static {
      _instance0.dataGridSortAscendingInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return dataGridSortAscending;
    }
  }
  public com.google.gwt.resources.client.ImageResource dataGridSortAscending() {
    return dataGridSortAscendingInitializer.get();
  }
  private void dataGridSortDescendingInitializer() {
    dataGridSortDescending = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "dataGridSortDescending",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?externalImage_rtl1 : externalImage1),
      0, 0, 11, 7, false, false
    );
  }
  private static class dataGridSortDescendingInitializer {
    static {
      _instance0.dataGridSortDescendingInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return dataGridSortDescending;
    }
  }
  public com.google.gwt.resources.client.ImageResource dataGridSortDescending() {
    return dataGridSortDescendingInitializer.get();
  }
  private void dataGridStyleInitializer() {
    dataGridStyle = new com.google.gwt.user.cellview.client.DataGrid.Style() {
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
        return "dataGridStyle";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GNJD51RCHG{border-top:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("right")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";}.GNJD51RCIG{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("right")  + ";color:") + (("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";}.GNJD51RCBG{padding:" + ("2px"+ " " +"15px")  + ";overflow:" + ("hidden")  + ";}.GNJD51RCFH{cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";}.GNJD51RCFH:hover{color:" + ("#6c6b6b")  + ";}.GNJD51RCCG{background:" + ("#fff")  + ";}.GNJD51RCDG{border:" + ("2px"+ " " +"solid"+ " " +"#fff") ) + (";}.GNJD51RCBH{background:" + ("#f3f7fb")  + ";}.GNJD51RCCH{border:" + ("2px"+ " " +"solid"+ " " +"#f3f7fb")  + ";}.GNJD51RCJG{background:" + ("#eee")  + ";}.GNJD51RCKG{border:" + ("2px"+ " " +"solid"+ " " +"#eee")  + ";}.GNJD51RCMG{background:" + ("#ffc")  + ";}.GNJD51RCNG{border:" + ("2px"+ " " +"solid"+ " " +"#ffc")  + ";}.GNJD51RCDH{background:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("auto")  + ";}.GNJD51RCEH{border:") + (("2px"+ " " +"solid"+ " " +"#628cd5")  + ";}.GNJD51RCLG{border:" + ("2px"+ " " +"solid"+ " " +"#d7dde8")  + ";}")) : ((".GNJD51RCHG{border-top:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("left")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";}.GNJD51RCIG{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("left")  + ";color:") + (("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";}.GNJD51RCBG{padding:" + ("2px"+ " " +"15px")  + ";overflow:" + ("hidden")  + ";}.GNJD51RCFH{cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";}.GNJD51RCFH:hover{color:" + ("#6c6b6b")  + ";}.GNJD51RCCG{background:" + ("#fff")  + ";}.GNJD51RCDG{border:" + ("2px"+ " " +"solid"+ " " +"#fff") ) + (";}.GNJD51RCBH{background:" + ("#f3f7fb")  + ";}.GNJD51RCCH{border:" + ("2px"+ " " +"solid"+ " " +"#f3f7fb")  + ";}.GNJD51RCJG{background:" + ("#eee")  + ";}.GNJD51RCKG{border:" + ("2px"+ " " +"solid"+ " " +"#eee")  + ";}.GNJD51RCMG{background:" + ("#ffc")  + ";}.GNJD51RCNG{border:" + ("2px"+ " " +"solid"+ " " +"#ffc")  + ";}.GNJD51RCDH{background:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("auto")  + ";}.GNJD51RCEH{border:") + (("2px"+ " " +"solid"+ " " +"#628cd5")  + ";}.GNJD51RCLG{border:" + ("2px"+ " " +"solid"+ " " +"#d7dde8")  + ";}"));
      }
      public java.lang.String dataGridCell() {
        return "GNJD51RCBG";
      }
      public java.lang.String dataGridEvenRow() {
        return "GNJD51RCCG";
      }
      public java.lang.String dataGridEvenRowCell() {
        return "GNJD51RCDG";
      }
      public java.lang.String dataGridFirstColumn() {
        return "GNJD51RCEG";
      }
      public java.lang.String dataGridFirstColumnFooter() {
        return "GNJD51RCFG";
      }
      public java.lang.String dataGridFirstColumnHeader() {
        return "GNJD51RCGG";
      }
      public java.lang.String dataGridFooter() {
        return "GNJD51RCHG";
      }
      public java.lang.String dataGridHeader() {
        return "GNJD51RCIG";
      }
      public java.lang.String dataGridHoveredRow() {
        return "GNJD51RCJG";
      }
      public java.lang.String dataGridHoveredRowCell() {
        return "GNJD51RCKG";
      }
      public java.lang.String dataGridKeyboardSelectedCell() {
        return "GNJD51RCLG";
      }
      public java.lang.String dataGridKeyboardSelectedRow() {
        return "GNJD51RCMG";
      }
      public java.lang.String dataGridKeyboardSelectedRowCell() {
        return "GNJD51RCNG";
      }
      public java.lang.String dataGridLastColumn() {
        return "GNJD51RCOG";
      }
      public java.lang.String dataGridLastColumnFooter() {
        return "GNJD51RCPG";
      }
      public java.lang.String dataGridLastColumnHeader() {
        return "GNJD51RCAH";
      }
      public java.lang.String dataGridOddRow() {
        return "GNJD51RCBH";
      }
      public java.lang.String dataGridOddRowCell() {
        return "GNJD51RCCH";
      }
      public java.lang.String dataGridSelectedRow() {
        return "GNJD51RCDH";
      }
      public java.lang.String dataGridSelectedRowCell() {
        return "GNJD51RCEH";
      }
      public java.lang.String dataGridSortableHeader() {
        return "GNJD51RCFH";
      }
      public java.lang.String dataGridSortedHeaderAscending() {
        return "GNJD51RCGH";
      }
      public java.lang.String dataGridSortedHeaderDescending() {
        return "GNJD51RCHH";
      }
      public java.lang.String dataGridWidget() {
        return "GNJD51RCIH";
      }
    }
    ;
  }
  private static class dataGridStyleInitializer {
    static {
      _instance0.dataGridStyleInitializer();
    }
    static com.google.gwt.user.cellview.client.DataGrid.Style get() {
      return dataGridStyle;
    }
  }
  public com.google.gwt.user.cellview.client.DataGrid.Style dataGridStyle() {
    return dataGridStyleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/gif;base64,R0lGODlhKwALAPEAAP///0tKSqampktKSiH/C05FVFNDQVBFMi4wAwEAAAAh/hpDcmVhdGVkIHdpdGggYWpheGxvYWQuaW5mbwAh+QQJCgAAACwAAAAAKwALAAACMoSOCMuW2diD88UKG95W88uF4DaGWFmhZid93pq+pwxnLUnXh8ou+sSz+T64oCAyTBUAACH5BAkKAAAALAAAAAArAAsAAAI9xI4IyyAPYWOxmoTHrHzzmGHe94xkmJifyqFKQ0pwLLgHa82xrekkDrIBZRQab1jyfY7KTtPimixiUsevAAAh+QQJCgAAACwAAAAAKwALAAACPYSOCMswD2FjqZpqW9xv4g8KE7d54XmMpNSgqLoOpgvC60xjNonnyc7p+VKamKw1zDCMR8rp8pksYlKorgAAIfkECQoAAAAsAAAAACsACwAAAkCEjgjLltnYmJS6Bxt+sfq5ZUyoNJ9HHlEqdCfFrqn7DrE2m7Wdj/2y45FkQ13t5itKdshFExC8YCLOEBX6AhQAADsAAAAAAAAAAAA=";
  private static final java.lang.String externalImage_rtl = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACsAAAALCAYAAADm8XT2AAAAMElEQVR42mNgAIJly5b9J4QZ8AC66SdGIT4L6ap/1LGjjh117KhjRx1Le/1DpQYDAInICKwfCLm7AAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAsAAAAHCAYAAADebrddAAAAiklEQVR42mNgwALyKrumFRf3iDAQAvmVXVVAxf/zKjq341WYV95hk1fZ+R+MK8C4HqtCkLW5FZ2PQYpyK6AaKjv/5VV1OmIozq3s3AFR0AXFUNMrO5/lV7WKI6yv6mxCksSGDyTU13Mw5JV2qeaWd54FWn0BRAMlLgPZl/NAuBKMz+dWdF0H2hwCAPwcZIjfOFLHAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage_rtl0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAsAAAAHCAYAAADebrddAAAAiklEQVR42mNgQAPFxT0ieZVd0xiIAXkVnduBiv/nV3ZVEVJYD8T/8yqhuLzDBrvCqk5HoIJ/IEW5IA0VYPoxyFkoCvOrWsWBip4hTO2CYqCGys4dcIUJ9fUcQMEDcKuRMUxzVWcTWDFQZ0huRdd1oOB5IL4MVHAZaP1lEDu3vPMskH0BROeVdqkCAJLDZIgWLbFCAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAsAAAAHCAYAAADebrddAAAAiklEQVR42mPIrewMya3oup5X2XkeiC/nVXRezgViEDu3vPMskH0BROeVdqkyJNTXcwAlDgDxfwxcAaWrOpsYYCC/qlUcKPgMLlnZBcWd/4E272BAB0DdjkDJf2AFFRBTgfTj4uIeEQZsAKigHmE6EJd32DDgA0DF20FOyK/sqmIgBEDWAhVPwyYHAJAqZIiNwsHKAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage_rtl1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAsAAAAHCAYAAADebrddAAAAiElEQVR42mPIK+1SzS3vPJtb0XkBROdVdl4Gsi/ngXAlGJ/Prei6nlvZGcIAAnlVnU1Awf9ABf/BNCY+kFBfz8EAA0CdOyASXVAM1/wsv6pVnAEZFBf3iACtfwxSkIuw4R/QVkcGbCCvvMMGbnUFGNcz4AP5lV1VYGdUdG5nIAYAFU8DOQtdHAD5g2SIRShEoQAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource dataGridLoading;
  private static com.google.gwt.resources.client.ImageResource dataGridSortAscending;
  private static com.google.gwt.resources.client.ImageResource dataGridSortDescending;
  private static com.google.gwt.user.cellview.client.DataGrid.Style dataGridStyle;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      dataGridLoading(), 
      dataGridSortAscending(), 
      dataGridSortDescending(), 
      dataGridStyle(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("dataGridLoading", dataGridLoading());
        resourceMap.put("dataGridSortAscending", dataGridSortAscending());
        resourceMap.put("dataGridSortDescending", dataGridSortDescending());
        resourceMap.put("dataGridStyle", dataGridStyle());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'dataGridLoading': return this.@com.google.gwt.user.cellview.client.DataGrid.Resources::dataGridLoading()();
      case 'dataGridSortAscending': return this.@com.google.gwt.user.cellview.client.DataGrid.Resources::dataGridSortAscending()();
      case 'dataGridSortDescending': return this.@com.google.gwt.user.cellview.client.DataGrid.Resources::dataGridSortDescending()();
      case 'dataGridStyle': return this.@com.google.gwt.user.cellview.client.DataGrid.Resources::dataGridStyle()();
    }
    return null;
  }-*/;
}
