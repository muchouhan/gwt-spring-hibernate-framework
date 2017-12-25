// .ui.xml template last modified: 1514188203718
package com.mukund.frm.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MainPanelView_MainPanelViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.mukund.frm.client.view.MainPanelView>, com.mukund.frm.client.view.MainPanelView.MainPanelViewUiBinder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.mukund.frm.client.view.MainPanelView owner) {


    return new Widgets(owner).get_f_ScrollPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.mukund.frm.client.view.MainPanelView owner;


    public Widgets(final com.mukund.frm.client.view.MainPanelView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_i18n();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenBundle) GWT.create(com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 5 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenCss_style style;
    private com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.mukund.frm.client.view.MainPanelView_MainPanelViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for i18n called 5 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.mukund.frm.client.Messages i18n;
    private com.mukund.frm.client.Messages get_i18n() {
      return i18n;
    }
    private com.mukund.frm.client.Messages build_i18n() {
      // Creation section.
      i18n = (com.mukund.frm.client.Messages) GWT.create(com.mukund.frm.client.Messages.class);
      // Setup section.

      return i18n;
    }

    /**
     * Getter for asset called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.mukund.frm.client.common.Asset get_asset() {
      return build_asset();
    }
    private com.mukund.frm.client.common.Asset build_asset() {
      // Creation section.
      final com.mukund.frm.client.common.Asset asset = (com.mukund.frm.client.common.Asset) GWT.create(com.mukund.frm.client.common.Asset.class);
      // Setup section.

      return asset;
    }

    /**
     * Getter for f_ScrollPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.ScrollPanel get_f_ScrollPanel1() {
      return build_f_ScrollPanel1();
    }
    private com.google.gwt.user.client.ui.ScrollPanel build_f_ScrollPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel1 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
      // Setup section.
      f_ScrollPanel1.add(get_f_Container2());

      return f_ScrollPanel1;
    }

    /**
     * Getter for f_Container2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container2() {
      return build_f_Container2();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container2 = (org.gwtbootstrap3.client.ui.Container) GWT.create(org.gwtbootstrap3.client.ui.Container.class);
      // Setup section.
      f_Container2.add(get_f_Row3());
      f_Container2.add(get_f_Row22());
      f_Container2.add(get_f_Row23());
      f_Container2.setFluid(true);

      return f_Container2;
    }

    /**
     * Getter for f_Row3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row3() {
      return build_f_Row3();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row3 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row3.add(get_f_Column4());

      return f_Row3;
    }

    /**
     * Getter for f_Column4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column4() {
      return build_f_Column4();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column4 = new org.gwtbootstrap3.client.ui.Column("MD_12");
      // Setup section.
      f_Column4.add(get_f_Panel5());

      return f_Column4;
    }

    /**
     * Getter for f_Panel5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel5() {
      return build_f_Panel5();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel5 = (org.gwtbootstrap3.client.ui.Panel) GWT.create(org.gwtbootstrap3.client.ui.Panel.class);
      // Setup section.
      f_Panel5.add(get_f_PanelBody6());

      return f_Panel5;
    }

    /**
     * Getter for f_PanelBody6 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody6() {
      return build_f_PanelBody6();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody6 = (org.gwtbootstrap3.client.ui.PanelBody) GWT.create(org.gwtbootstrap3.client.ui.PanelBody.class);
      // Setup section.
      f_PanelBody6.add(get_f_Navbar7());

      return f_PanelBody6;
    }

    /**
     * Getter for f_Navbar7 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Navbar get_f_Navbar7() {
      return build_f_Navbar7();
    }
    private org.gwtbootstrap3.client.ui.Navbar build_f_Navbar7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Navbar f_Navbar7 = (org.gwtbootstrap3.client.ui.Navbar) GWT.create(org.gwtbootstrap3.client.ui.Navbar.class);
      // Setup section.
      f_Navbar7.add(get_f_NavbarHeader8());
      f_Navbar7.add(get_f_NavbarCollapse11());
      f_Navbar7.setPosition(org.gwtbootstrap3.client.ui.constants.NavbarPosition.FIXED_TOP);

      return f_Navbar7;
    }

    /**
     * Getter for f_NavbarHeader8 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.NavbarHeader get_f_NavbarHeader8() {
      return build_f_NavbarHeader8();
    }
    private org.gwtbootstrap3.client.ui.NavbarHeader build_f_NavbarHeader8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarHeader f_NavbarHeader8 = (org.gwtbootstrap3.client.ui.NavbarHeader) GWT.create(org.gwtbootstrap3.client.ui.NavbarHeader.class);
      // Setup section.
      f_NavbarHeader8.add(get_f_NavbarNav9());
      f_NavbarHeader8.addStyleName("" + get_style().marginFix() + "");

      return f_NavbarHeader8;
    }

    /**
     * Getter for f_NavbarNav9 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.NavbarNav get_f_NavbarNav9() {
      return build_f_NavbarNav9();
    }
    private org.gwtbootstrap3.client.ui.NavbarNav build_f_NavbarNav9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarNav f_NavbarNav9 = (org.gwtbootstrap3.client.ui.NavbarNav) GWT.create(org.gwtbootstrap3.client.ui.NavbarNav.class);
      // Setup section.
      f_NavbarNav9.add(get_mainImage());
      f_NavbarNav9.add(get_f_NavbarCollapseButton10());
      f_NavbarNav9.addStyleName("col-lg-1");

      return f_NavbarNav9;
    }

    /**
     * Getter for mainImage called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.Image get_mainImage() {
      return build_mainImage();
    }
    private org.gwtbootstrap3.client.ui.Image build_mainImage() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image mainImage = new org.gwtbootstrap3.client.ui.Image(get_asset().logo());
      // Setup section.
      mainImage.addStyleName("" + get_style().marginLogo() + "");
      mainImage.setWidth("120px");
      mainImage.setType(org.gwtbootstrap3.client.ui.constants.ImageType.ROUNDED);
      mainImage.setHeight("60px");

      this.owner.mainImage = mainImage;

      return mainImage;
    }

    /**
     * Getter for f_NavbarCollapseButton10 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.NavbarCollapseButton get_f_NavbarCollapseButton10() {
      return build_f_NavbarCollapseButton10();
    }
    private org.gwtbootstrap3.client.ui.NavbarCollapseButton build_f_NavbarCollapseButton10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarCollapseButton f_NavbarCollapseButton10 = (org.gwtbootstrap3.client.ui.NavbarCollapseButton) GWT.create(org.gwtbootstrap3.client.ui.NavbarCollapseButton.class);
      // Setup section.
      f_NavbarCollapseButton10.setDataTarget("#navbar-collapse");

      return f_NavbarCollapseButton10;
    }

    /**
     * Getter for f_NavbarCollapse11 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.NavbarCollapse get_f_NavbarCollapse11() {
      return build_f_NavbarCollapse11();
    }
    private org.gwtbootstrap3.client.ui.NavbarCollapse build_f_NavbarCollapse11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarCollapse f_NavbarCollapse11 = (org.gwtbootstrap3.client.ui.NavbarCollapse) GWT.create(org.gwtbootstrap3.client.ui.NavbarCollapse.class);
      // Setup section.
      f_NavbarCollapse11.add(get_f_NavbarNav12());
      f_NavbarCollapse11.add(get_f_NavbarNav16());
      f_NavbarCollapse11.setId("navbar-collapse");

      return f_NavbarCollapse11;
    }

    /**
     * Getter for f_NavbarNav12 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.NavbarNav get_f_NavbarNav12() {
      return build_f_NavbarNav12();
    }
    private org.gwtbootstrap3.client.ui.NavbarNav build_f_NavbarNav12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarNav f_NavbarNav12 = (org.gwtbootstrap3.client.ui.NavbarNav) GWT.create(org.gwtbootstrap3.client.ui.NavbarNav.class);
      // Setup section.
      f_NavbarNav12.add(get_taskListAnchorListItem());
      f_NavbarNav12.add(get_f_ListDropDown13());
      f_NavbarNav12.addStyleName("col-lg-4");
      f_NavbarNav12.addStyleName("" + get_style().marginTitle() + "");

      return f_NavbarNav12;
    }

    /**
     * Getter for taskListAnchorListItem called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_taskListAnchorListItem() {
      return build_taskListAnchorListItem();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_taskListAnchorListItem() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem taskListAnchorListItem = (org.gwtbootstrap3.client.ui.AnchorListItem) GWT.create(org.gwtbootstrap3.client.ui.AnchorListItem.class);
      // Setup section.
      taskListAnchorListItem.setText("" + get_i18n().app_title() + "");

      return taskListAnchorListItem;
    }

    /**
     * Getter for f_ListDropDown13 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.ListDropDown get_f_ListDropDown13() {
      return build_f_ListDropDown13();
    }
    private org.gwtbootstrap3.client.ui.ListDropDown build_f_ListDropDown13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListDropDown f_ListDropDown13 = (org.gwtbootstrap3.client.ui.ListDropDown) GWT.create(org.gwtbootstrap3.client.ui.ListDropDown.class);
      // Setup section.
      f_ListDropDown13.add(get_f_AnchorButton14());
      f_ListDropDown13.add(get_f_DropDownMenu15());

      return f_ListDropDown13;
    }

    /**
     * Getter for f_AnchorButton14 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_f_AnchorButton14() {
      return build_f_AnchorButton14();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_f_AnchorButton14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton f_AnchorButton14 = (org.gwtbootstrap3.client.ui.AnchorButton) GWT.create(org.gwtbootstrap3.client.ui.AnchorButton.class);
      // Setup section.
      f_AnchorButton14.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);
      f_AnchorButton14.setText("" + get_i18n().menu_text_1() + "");

      return f_AnchorButton14;
    }

    /**
     * Getter for f_DropDownMenu15 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu15() {
      return build_f_DropDownMenu15();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu15 = (org.gwtbootstrap3.client.ui.DropDownMenu) GWT.create(org.gwtbootstrap3.client.ui.DropDownMenu.class);
      // Setup section.
      f_DropDownMenu15.add(get_menuListItem());

      return f_DropDownMenu15;
    }

    /**
     * Getter for menuListItem called 1 times. Type: DEFAULT. Build precedence: 12.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_menuListItem() {
      return build_menuListItem();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_menuListItem() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem menuListItem = (org.gwtbootstrap3.client.ui.AnchorListItem) GWT.create(org.gwtbootstrap3.client.ui.AnchorListItem.class);
      // Setup section.
      menuListItem.setText("" + get_i18n().menu_text_2() + "");

      return menuListItem;
    }

    /**
     * Getter for f_NavbarNav16 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.NavbarNav get_f_NavbarNav16() {
      return build_f_NavbarNav16();
    }
    private org.gwtbootstrap3.client.ui.NavbarNav build_f_NavbarNav16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarNav f_NavbarNav16 = (org.gwtbootstrap3.client.ui.NavbarNav) GWT.create(org.gwtbootstrap3.client.ui.NavbarNav.class);
      // Setup section.
      f_NavbarNav16.add(get_f_ListDropDown17());
      f_NavbarNav16.add(get_f_ListDropDown18());
      f_NavbarNav16.add(get_f_ListDropDown20());
      f_NavbarNav16.addStyleName("col-lg-2");
      f_NavbarNav16.addStyleName("" + get_style().marginTitle() + "");
      f_NavbarNav16.setPull(org.gwtbootstrap3.client.ui.constants.Pull.RIGHT);

      return f_NavbarNav16;
    }

    /**
     * Getter for f_ListDropDown17 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.ListDropDown get_f_ListDropDown17() {
      return build_f_ListDropDown17();
    }
    private org.gwtbootstrap3.client.ui.ListDropDown build_f_ListDropDown17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListDropDown f_ListDropDown17 = (org.gwtbootstrap3.client.ui.ListDropDown) GWT.create(org.gwtbootstrap3.client.ui.ListDropDown.class);
      // Setup section.
      f_ListDropDown17.add(get_webAppsPopOver());

      return f_ListDropDown17;
    }

    /**
     * Getter for webAppsPopOver called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.Popover get_webAppsPopOver() {
      return build_webAppsPopOver();
    }
    private org.gwtbootstrap3.client.ui.Popover build_webAppsPopOver() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Popover webAppsPopOver = (org.gwtbootstrap3.client.ui.Popover) GWT.create(org.gwtbootstrap3.client.ui.Popover.class);
      // Setup section.
      webAppsPopOver.add(get_webAppsButton());
      webAppsPopOver.setIsHtml(true);
      webAppsPopOver.setTrigger(org.gwtbootstrap3.client.ui.constants.Trigger.CLICK);
      webAppsPopOver.setPlacement(org.gwtbootstrap3.client.ui.constants.Placement.BOTTOM);
      webAppsPopOver.setTitle("Interseroh WabApps");

      this.owner.webAppsPopOver = webAppsPopOver;

      return webAppsPopOver;
    }

    /**
     * Getter for webAppsButton called 1 times. Type: DEFAULT. Build precedence: 12.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_webAppsButton() {
      return build_webAppsButton();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_webAppsButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton webAppsButton = (org.gwtbootstrap3.client.ui.AnchorButton) GWT.create(org.gwtbootstrap3.client.ui.AnchorButton.class);
      // Setup section.

      this.owner.webAppsButton = webAppsButton;

      return webAppsButton;
    }

    /**
     * Getter for f_ListDropDown18 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.ListDropDown get_f_ListDropDown18() {
      return build_f_ListDropDown18();
    }
    private org.gwtbootstrap3.client.ui.ListDropDown build_f_ListDropDown18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListDropDown f_ListDropDown18 = (org.gwtbootstrap3.client.ui.ListDropDown) GWT.create(org.gwtbootstrap3.client.ui.ListDropDown.class);
      // Setup section.
      f_ListDropDown18.add(get_notificationButton());
      f_ListDropDown18.add(get_f_DropDownMenu19());

      return f_ListDropDown18;
    }

    /**
     * Getter for notificationButton called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_notificationButton() {
      return build_notificationButton();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_notificationButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton notificationButton = (org.gwtbootstrap3.client.ui.AnchorButton) GWT.create(org.gwtbootstrap3.client.ui.AnchorButton.class);
      // Setup section.
      notificationButton.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);
      notificationButton.setToggleCaret(false);

      this.owner.notificationButton = notificationButton;

      return notificationButton;
    }

    /**
     * Getter for f_DropDownMenu19 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu19() {
      return build_f_DropDownMenu19();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu19 = (org.gwtbootstrap3.client.ui.DropDownMenu) GWT.create(org.gwtbootstrap3.client.ui.DropDownMenu.class);
      // Setup section.
      f_DropDownMenu19.add(get_notificationListItem());

      return f_DropDownMenu19;
    }

    /**
     * Getter for notificationListItem called 1 times. Type: DEFAULT. Build precedence: 12.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_notificationListItem() {
      return build_notificationListItem();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_notificationListItem() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem notificationListItem = (org.gwtbootstrap3.client.ui.AnchorListItem) GWT.create(org.gwtbootstrap3.client.ui.AnchorListItem.class);
      // Setup section.
      notificationListItem.setText("" + get_i18n().menu_text_1() + "");

      return notificationListItem;
    }

    /**
     * Getter for f_ListDropDown20 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.ListDropDown get_f_ListDropDown20() {
      return build_f_ListDropDown20();
    }
    private org.gwtbootstrap3.client.ui.ListDropDown build_f_ListDropDown20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListDropDown f_ListDropDown20 = (org.gwtbootstrap3.client.ui.ListDropDown) GWT.create(org.gwtbootstrap3.client.ui.ListDropDown.class);
      // Setup section.
      f_ListDropDown20.add(get_wrenchButton());
      f_ListDropDown20.add(get_f_DropDownMenu21());

      return f_ListDropDown20;
    }

    /**
     * Getter for wrenchButton called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_wrenchButton() {
      return build_wrenchButton();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_wrenchButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton wrenchButton = (org.gwtbootstrap3.client.ui.AnchorButton) GWT.create(org.gwtbootstrap3.client.ui.AnchorButton.class);
      // Setup section.
      wrenchButton.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);
      wrenchButton.setText("Lofi Dewanto");
      wrenchButton.setToggleCaret(false);

      this.owner.wrenchButton = wrenchButton;

      return wrenchButton;
    }

    /**
     * Getter for f_DropDownMenu21 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu21() {
      return build_f_DropDownMenu21();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu21 = (org.gwtbootstrap3.client.ui.DropDownMenu) GWT.create(org.gwtbootstrap3.client.ui.DropDownMenu.class);
      // Setup section.
      f_DropDownMenu21.add(get_wrenchListItem());

      return f_DropDownMenu21;
    }

    /**
     * Getter for wrenchListItem called 1 times. Type: DEFAULT. Build precedence: 12.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_wrenchListItem() {
      return build_wrenchListItem();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_wrenchListItem() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem wrenchListItem = (org.gwtbootstrap3.client.ui.AnchorListItem) GWT.create(org.gwtbootstrap3.client.ui.AnchorListItem.class);
      // Setup section.
      wrenchListItem.setText("" + get_i18n().menu_text_1() + "");

      return wrenchListItem;
    }

    /**
     * Getter for f_Row22 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row22() {
      return build_f_Row22();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row22 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.

      return f_Row22;
    }

    /**
     * Getter for f_Row23 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row23() {
      return build_f_Row23();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row23 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row23.add(get_f_Column24());

      return f_Row23;
    }

    /**
     * Getter for f_Column24 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column24() {
      return build_f_Column24();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column24 = new org.gwtbootstrap3.client.ui.Column("MD_12");
      // Setup section.
      f_Column24.add(get_f_Container25());

      return f_Column24;
    }

    /**
     * Getter for f_Container25 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container25() {
      return build_f_Container25();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container25 = (org.gwtbootstrap3.client.ui.Container) GWT.create(org.gwtbootstrap3.client.ui.Container.class);
      // Setup section.
      f_Container25.add(get_f_Row26());
      f_Container25.addStyleName("" + get_style().marginTopBottom() + "");
      f_Container25.setFluid(true);

      return f_Container25;
    }

    /**
     * Getter for f_Row26 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row26() {
      return build_f_Row26();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row26 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row26.add(get_contentColumn());

      return f_Row26;
    }

    /**
     * Getter for contentColumn called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_contentColumn() {
      return build_contentColumn();
    }
    private org.gwtbootstrap3.client.ui.Column build_contentColumn() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column contentColumn = new org.gwtbootstrap3.client.ui.Column("MD_12");
      // Setup section.

      this.owner.contentColumn = contentColumn;

      return contentColumn;
    }
  }
}
