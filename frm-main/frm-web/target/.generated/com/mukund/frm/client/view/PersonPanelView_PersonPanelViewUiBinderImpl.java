// .ui.xml template last modified: 1514147248367
package com.mukund.frm.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class PersonPanelView_PersonPanelViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.mukund.frm.client.view.PersonPanelView>, com.mukund.frm.client.view.PersonPanelView.PersonPanelViewUiBinder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.mukund.frm.client.view.PersonPanelView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.mukund.frm.client.view.PersonPanelView owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onButtonClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final com.mukund.frm.client.view.PersonPanelView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_i18n();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenBundle) GWT.create(com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 4 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenCss_style style;
    private com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.mukund.frm.client.view.PersonPanelView_PersonPanelViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for i18n called 9 times. Type: IMPORTED. Build precedence: 1.
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
     * Getter for f_Row1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row1() {
      return build_f_Row1();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row1 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row1.add(get_f_Column2());

      return f_Row1;
    }

    /**
     * Getter for f_Column2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column2() {
      return build_f_Column2();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column2 = new org.gwtbootstrap3.client.ui.Column("MD_12");
      // Setup section.
      f_Column2.add(get_f_Row3());

      return f_Column2;
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
      f_Row3.add(get_f_Panel4());
      f_Row3.add(get_f_Panel23());

      return f_Row3;
    }

    /**
     * Getter for f_Panel4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel4() {
      return build_f_Panel4();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel4 = (org.gwtbootstrap3.client.ui.Panel) GWT.create(org.gwtbootstrap3.client.ui.Panel.class);
      // Setup section.
      f_Panel4.add(get_f_PanelHeader5());
      f_Panel4.add(get_f_PanelBody7());
      f_Panel4.addStyleName("" + get_style().panelMain() + "");

      return f_Panel4;
    }

    /**
     * Getter for f_PanelHeader5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader5() {
      return build_f_PanelHeader5();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader5 = (org.gwtbootstrap3.client.ui.PanelHeader) GWT.create(org.gwtbootstrap3.client.ui.PanelHeader.class);
      // Setup section.
      f_PanelHeader5.add(get_f_Heading6());

      return f_PanelHeader5;
    }

    /**
     * Getter for f_Heading6 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading6() {
      return build_f_Heading6();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading6 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading6.setText("Filter");

      return f_Heading6;
    }

    /**
     * Getter for f_PanelBody7 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody7() {
      return build_f_PanelBody7();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody7 = (org.gwtbootstrap3.client.ui.PanelBody) GWT.create(org.gwtbootstrap3.client.ui.PanelBody.class);
      // Setup section.
      f_PanelBody7.add(get_f_Container8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_Container8 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container8() {
      return build_f_Container8();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container8 = (org.gwtbootstrap3.client.ui.Container) GWT.create(org.gwtbootstrap3.client.ui.Container.class);
      // Setup section.
      f_Container8.add(get_f_Form9());
      f_Container8.setFluid(true);

      return f_Container8;
    }

    /**
     * Getter for f_Form9 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Form get_f_Form9() {
      return build_f_Form9();
    }
    private org.gwtbootstrap3.client.ui.Form build_f_Form9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Form f_Form9 = (org.gwtbootstrap3.client.ui.Form) GWT.create(org.gwtbootstrap3.client.ui.Form.class);
      // Setup section.
      f_Form9.add(get_f_FieldSet10());
      f_Form9.setType(org.gwtbootstrap3.client.ui.constants.FormType.HORIZONTAL);

      return f_Form9;
    }

    /**
     * Getter for f_FieldSet10 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FieldSet get_f_FieldSet10() {
      return build_f_FieldSet10();
    }
    private org.gwtbootstrap3.client.ui.FieldSet build_f_FieldSet10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FieldSet f_FieldSet10 = (org.gwtbootstrap3.client.ui.FieldSet) GWT.create(org.gwtbootstrap3.client.ui.FieldSet.class);
      // Setup section.
      f_FieldSet10.add(get_f_FormGroup11());

      return f_FieldSet10;
    }

    /**
     * Getter for f_FormGroup11 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup11() {
      return build_f_FormGroup11();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup11 = (org.gwtbootstrap3.client.ui.FormGroup) GWT.create(org.gwtbootstrap3.client.ui.FormGroup.class);
      // Setup section.
      f_FormGroup11.add(get_f_FormLabel12());
      f_FormGroup11.add(get_f_FlowPanel13());
      f_FormGroup11.add(get_f_FormLabel17());
      f_FormGroup11.add(get_nameSuggestBox());
      f_FormGroup11.add(get_f_FormLabel18());
      f_FormGroup11.add(get_f_FlowPanel19());
      f_FormGroup11.add(get_f_FormLabel20());
      f_FormGroup11.add(get_f_FlowPanel21());
      f_FormGroup11.add(get_f_ButtonToolBar22());

      return f_FormGroup11;
    }

    /**
     * Getter for f_FormLabel12 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel12() {
      return build_f_FormLabel12();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel12 = (org.gwtbootstrap3.client.ui.FormLabel) GWT.create(org.gwtbootstrap3.client.ui.FormLabel.class);
      // Setup section.
      f_FormLabel12.addStyleName("col-lg-1");
      f_FormLabel12.setFor("basic3");
      f_FormLabel12.setText("Food");

      return f_FormLabel12;
    }

    /**
     * Getter for f_FlowPanel13 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel13() {
      return build_f_FlowPanel13();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel13() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel13 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel13.add(get_foodMultipleSelect());
      f_FlowPanel13.addStyleName("col-lg-1");
      f_FlowPanel13.setWidth("20%");

      return f_FlowPanel13;
    }

    /**
     * Getter for foodMultipleSelect called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_foodMultipleSelect() {
      return build_foodMultipleSelect();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_foodMultipleSelect() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect foodMultipleSelect = (org.gwtbootstrap3.extras.select.client.ui.MultipleSelect) GWT.create(org.gwtbootstrap3.extras.select.client.ui.MultipleSelect.class);
      // Setup section.
      foodMultipleSelect.add(get_f_Option14());
      foodMultipleSelect.add(get_f_Option15());
      foodMultipleSelect.add(get_f_Option16());
      foodMultipleSelect.setId("basic3");

      this.owner.foodMultipleSelect = foodMultipleSelect;

      return foodMultipleSelect;
    }

    /**
     * Getter for f_Option14 called 1 times. Type: DEFAULT. Build precedence: 12.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option14() {
      return build_f_Option14();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option14() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option14 = (org.gwtbootstrap3.extras.select.client.ui.Option) GWT.create(org.gwtbootstrap3.extras.select.client.ui.Option.class);
      // Setup section.
      f_Option14.setText("Mustard");

      return f_Option14;
    }

    /**
     * Getter for f_Option15 called 1 times. Type: DEFAULT. Build precedence: 12.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option15() {
      return build_f_Option15();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option15() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option15 = (org.gwtbootstrap3.extras.select.client.ui.Option) GWT.create(org.gwtbootstrap3.extras.select.client.ui.Option.class);
      // Setup section.
      f_Option15.setText("Ketchup");

      return f_Option15;
    }

    /**
     * Getter for f_Option16 called 1 times. Type: DEFAULT. Build precedence: 12.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option16() {
      return build_f_Option16();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option16() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option16 = (org.gwtbootstrap3.extras.select.client.ui.Option) GWT.create(org.gwtbootstrap3.extras.select.client.ui.Option.class);
      // Setup section.
      f_Option16.setText("Relish");

      return f_Option16;
    }

    /**
     * Getter for f_FormLabel17 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel17() {
      return build_f_FormLabel17();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel17 = (org.gwtbootstrap3.client.ui.FormLabel) GWT.create(org.gwtbootstrap3.client.ui.FormLabel.class);
      // Setup section.
      f_FormLabel17.addStyleName("col-lg-1");
      f_FormLabel17.setFor("nameSuggestBox");
      f_FormLabel17.setText("" + get_i18n().name_suggest() + "");

      return f_FormLabel17;
    }

    /**
     * Getter for nameSuggestBox called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.SuggestBox get_nameSuggestBox() {
      return build_nameSuggestBox();
    }
    private org.gwtbootstrap3.client.ui.SuggestBox build_nameSuggestBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.SuggestBox nameSuggestBox = (org.gwtbootstrap3.client.ui.SuggestBox) GWT.create(org.gwtbootstrap3.client.ui.SuggestBox.class);
      // Setup section.
      nameSuggestBox.addStyleName("col-lg-2");
      nameSuggestBox.setWidth("20%");
      nameSuggestBox.setId("nameSuggestBox");

      this.owner.nameSuggestBox = nameSuggestBox;

      return nameSuggestBox;
    }

    /**
     * Getter for f_FormLabel18 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel18() {
      return build_f_FormLabel18();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel18 = (org.gwtbootstrap3.client.ui.FormLabel) GWT.create(org.gwtbootstrap3.client.ui.FormLabel.class);
      // Setup section.
      f_FormLabel18.addStyleName("col-lg-1");
      f_FormLabel18.setFor("fromDateTimePicker");
      f_FormLabel18.setText("" + get_i18n().date_from() + "");

      return f_FormLabel18;
    }

    /**
     * Getter for f_FlowPanel19 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel19() {
      return build_f_FlowPanel19();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel19() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel19 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel19.add(get_fromDateTimePicker());
      f_FlowPanel19.addStyleName("col-lg-1");
      f_FlowPanel19.setWidth("10%");

      return f_FlowPanel19;
    }

    /**
     * Getter for fromDateTimePicker called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_fromDateTimePicker() {
      return build_fromDateTimePicker();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_fromDateTimePicker() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker fromDateTimePicker = (org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker) GWT.create(org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker.class);
      // Setup section.
      fromDateTimePicker.setHighlightToday(true);
      fromDateTimePicker.setShowTodayButton(true);
      fromDateTimePicker.setFormat("mm-dd-yyyy");
      fromDateTimePicker.setLanguage(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerLanguage.EN);
      fromDateTimePicker.setPlaceholder("mm-dd-yyyy");
      fromDateTimePicker.setId("fromDateTimePicker");
      fromDateTimePicker.setMinView(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerView.MONTH);
      fromDateTimePicker.setAutoClose(true);

      this.owner.fromDateTimePicker = fromDateTimePicker;

      return fromDateTimePicker;
    }

    /**
     * Getter for f_FormLabel20 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel20() {
      return build_f_FormLabel20();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel20 = (org.gwtbootstrap3.client.ui.FormLabel) GWT.create(org.gwtbootstrap3.client.ui.FormLabel.class);
      // Setup section.
      f_FormLabel20.addStyleName("col-lg-1");
      f_FormLabel20.setFor("untilDateTimePicker");
      f_FormLabel20.setText("" + get_i18n().date_until() + "");

      return f_FormLabel20;
    }

    /**
     * Getter for f_FlowPanel21 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel21() {
      return build_f_FlowPanel21();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel21() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel21 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel21.add(get_untilDateTimePicker());
      f_FlowPanel21.addStyleName("col-lg-1");
      f_FlowPanel21.setWidth("10%");

      return f_FlowPanel21;
    }

    /**
     * Getter for untilDateTimePicker called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_untilDateTimePicker() {
      return build_untilDateTimePicker();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_untilDateTimePicker() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker untilDateTimePicker = (org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker) GWT.create(org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker.class);
      // Setup section.
      untilDateTimePicker.setHighlightToday(true);
      untilDateTimePicker.setShowTodayButton(true);
      untilDateTimePicker.setFormat("mm-dd-yyyy");
      untilDateTimePicker.setLanguage(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerLanguage.EN);
      untilDateTimePicker.setPlaceholder("mm-dd-yyyy");
      untilDateTimePicker.setId("untilDateTimePicker");
      untilDateTimePicker.setMinView(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerView.MONTH);
      untilDateTimePicker.setAutoClose(true);

      this.owner.untilDateTimePicker = untilDateTimePicker;

      return untilDateTimePicker;
    }

    /**
     * Getter for f_ButtonToolBar22 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.ButtonToolBar get_f_ButtonToolBar22() {
      return build_f_ButtonToolBar22();
    }
    private org.gwtbootstrap3.client.ui.ButtonToolBar build_f_ButtonToolBar22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonToolBar f_ButtonToolBar22 = (org.gwtbootstrap3.client.ui.ButtonToolBar) GWT.create(org.gwtbootstrap3.client.ui.ButtonToolBar.class);
      // Setup section.
      f_ButtonToolBar22.add(get_filterButton());
      f_ButtonToolBar22.addStyleName("pull-right");

      return f_ButtonToolBar22;
    }

    /**
     * Getter for filterButton called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.Button get_filterButton() {
      return build_filterButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_filterButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button filterButton = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      filterButton.setText("" + get_i18n().button_filter() + "");
      filterButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      this.owner.filterButton = filterButton;

      return filterButton;
    }

    /**
     * Getter for f_Panel23 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel23() {
      return build_f_Panel23();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel23 = (org.gwtbootstrap3.client.ui.Panel) GWT.create(org.gwtbootstrap3.client.ui.Panel.class);
      // Setup section.
      f_Panel23.add(get_f_PanelHeader24());
      f_Panel23.add(get_f_PanelBody26());
      f_Panel23.addStyleName("" + get_style().panelMain() + "");

      return f_Panel23;
    }

    /**
     * Getter for f_PanelHeader24 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader24() {
      return build_f_PanelHeader24();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader24 = (org.gwtbootstrap3.client.ui.PanelHeader) GWT.create(org.gwtbootstrap3.client.ui.PanelHeader.class);
      // Setup section.
      f_PanelHeader24.add(get_f_Heading25());

      return f_PanelHeader24;
    }

    /**
     * Getter for f_Heading25 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading25() {
      return build_f_Heading25();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading25 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading25.setText("" + get_i18n().content_heading() + "");

      return f_Heading25;
    }

    /**
     * Getter for f_PanelBody26 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody26() {
      return build_f_PanelBody26();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody26 = (org.gwtbootstrap3.client.ui.PanelBody) GWT.create(org.gwtbootstrap3.client.ui.PanelBody.class);
      // Setup section.
      f_PanelBody26.add(get_f_NavTabs27());
      f_PanelBody26.add(get_f_TabContent28());

      return f_PanelBody26;
    }

    /**
     * Getter for f_NavTabs27 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavTabs get_f_NavTabs27() {
      return build_f_NavTabs27();
    }
    private org.gwtbootstrap3.client.ui.NavTabs build_f_NavTabs27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavTabs f_NavTabs27 = (org.gwtbootstrap3.client.ui.NavTabs) GWT.create(org.gwtbootstrap3.client.ui.NavTabs.class);
      // Setup section.
      f_NavTabs27.add(get_listTab());
      f_NavTabs27.add(get_searchTab());

      return f_NavTabs27;
    }

    /**
     * Getter for listTab called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_listTab() {
      return build_listTab();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_listTab() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem listTab = (org.gwtbootstrap3.client.ui.TabListItem) GWT.create(org.gwtbootstrap3.client.ui.TabListItem.class);
      // Setup section.
      listTab.setActive(true);
      listTab.setText("" + get_i18n().first_tab() + "");
      listTab.setDataTarget("#listTab");

      this.owner.listTab = listTab;

      return listTab;
    }

    /**
     * Getter for searchTab called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_searchTab() {
      return build_searchTab();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_searchTab() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem searchTab = (org.gwtbootstrap3.client.ui.TabListItem) GWT.create(org.gwtbootstrap3.client.ui.TabListItem.class);
      // Setup section.
      searchTab.setVisible(true);
      searchTab.setText("" + get_i18n().search_tab() + "");
      searchTab.setDataTarget("#searchTab");

      this.owner.searchTab = searchTab;

      return searchTab;
    }

    /**
     * Getter for f_TabContent28 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabContent get_f_TabContent28() {
      return build_f_TabContent28();
    }
    private org.gwtbootstrap3.client.ui.TabContent build_f_TabContent28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabContent f_TabContent28 = (org.gwtbootstrap3.client.ui.TabContent) GWT.create(org.gwtbootstrap3.client.ui.TabContent.class);
      // Setup section.
      f_TabContent28.add(get_listTabPane());
      f_TabContent28.add(get_searchTabPane());

      return f_TabContent28;
    }

    /**
     * Getter for listTabPane called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_listTabPane() {
      return build_listTabPane();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_listTabPane() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane listTabPane = (org.gwtbootstrap3.client.ui.TabPane) GWT.create(org.gwtbootstrap3.client.ui.TabPane.class);
      // Setup section.
      listTabPane.add(get_panelBody1());
      listTabPane.add(get_f_ButtonToolBar29());
      listTabPane.setFade(true);
      listTabPane.setIn(true);
      listTabPane.setActive(true);
      listTabPane.setId("listTab");

      return listTabPane;
    }

    /**
     * Getter for panelBody1 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_panelBody1() {
      return build_panelBody1();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_panelBody1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody panelBody1 = (org.gwtbootstrap3.client.ui.PanelBody) GWT.create(org.gwtbootstrap3.client.ui.PanelBody.class);
      // Setup section.
      panelBody1.add(get_dataGrid1());
      panelBody1.add(get_dataGridPagination1());

      return panelBody1;
    }

    /**
     * Getter for dataGrid1 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.gwt.DataGrid get_dataGrid1() {
      return build_dataGrid1();
    }
    private org.gwtbootstrap3.client.ui.gwt.DataGrid build_dataGrid1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.gwt.DataGrid dataGrid1 = (org.gwtbootstrap3.client.ui.gwt.DataGrid) GWT.create(org.gwtbootstrap3.client.ui.gwt.DataGrid.class);
      // Setup section.
      dataGrid1.addStyleName("" + get_style().tableWordWrap() + "");
      dataGrid1.setStriped(true);
      dataGrid1.setHover(true);
      dataGrid1.setWidth("100%");
      dataGrid1.setCondensed(true);
      dataGrid1.setBordered(true);
      dataGrid1.setHeight("450px");

      this.owner.dataGrid1 = dataGrid1;

      return dataGrid1;
    }

    /**
     * Getter for dataGridPagination1 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Pagination get_dataGridPagination1() {
      return build_dataGridPagination1();
    }
    private org.gwtbootstrap3.client.ui.Pagination build_dataGridPagination1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pagination dataGridPagination1 = (org.gwtbootstrap3.client.ui.Pagination) GWT.create(org.gwtbootstrap3.client.ui.Pagination.class);
      // Setup section.

      this.owner.dataGridPagination1 = dataGridPagination1;

      return dataGridPagination1;
    }

    /**
     * Getter for f_ButtonToolBar29 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.ButtonToolBar get_f_ButtonToolBar29() {
      return build_f_ButtonToolBar29();
    }
    private org.gwtbootstrap3.client.ui.ButtonToolBar build_f_ButtonToolBar29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonToolBar f_ButtonToolBar29 = (org.gwtbootstrap3.client.ui.ButtonToolBar) GWT.create(org.gwtbootstrap3.client.ui.ButtonToolBar.class);
      // Setup section.
      f_ButtonToolBar29.add(get_refreshButton());
      f_ButtonToolBar29.addStyleName("pull-right");

      return f_ButtonToolBar29;
    }

    /**
     * Getter for refreshButton called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Button get_refreshButton() {
      return build_refreshButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_refreshButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button refreshButton = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      refreshButton.setText("" + get_i18n().button_update() + "");
      refreshButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.SUCCESS);
      refreshButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.refreshButton = refreshButton;

      return refreshButton;
    }

    /**
     * Getter for searchTabPane called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_searchTabPane() {
      return build_searchTabPane();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_searchTabPane() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane searchTabPane = (org.gwtbootstrap3.client.ui.TabPane) GWT.create(org.gwtbootstrap3.client.ui.TabPane.class);
      // Setup section.
      searchTabPane.add(get_panelBody2());
      searchTabPane.add(get_f_ButtonToolBar30());
      searchTabPane.setFade(true);
      searchTabPane.setId("searchTab");

      return searchTabPane;
    }

    /**
     * Getter for panelBody2 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_panelBody2() {
      return build_panelBody2();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_panelBody2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody panelBody2 = (org.gwtbootstrap3.client.ui.PanelBody) GWT.create(org.gwtbootstrap3.client.ui.PanelBody.class);
      // Setup section.
      panelBody2.add(get_dataGrid2());
      panelBody2.add(get_dataGridPagination2());

      return panelBody2;
    }

    /**
     * Getter for dataGrid2 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.gwt.DataGrid get_dataGrid2() {
      return build_dataGrid2();
    }
    private org.gwtbootstrap3.client.ui.gwt.DataGrid build_dataGrid2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.gwt.DataGrid dataGrid2 = (org.gwtbootstrap3.client.ui.gwt.DataGrid) GWT.create(org.gwtbootstrap3.client.ui.gwt.DataGrid.class);
      // Setup section.
      dataGrid2.addStyleName("" + get_style().tableWordWrap() + "");
      dataGrid2.setStriped(true);
      dataGrid2.setHover(true);
      dataGrid2.setWidth("100%");
      dataGrid2.setCondensed(true);
      dataGrid2.setBordered(true);
      dataGrid2.setHeight("520px");

      this.owner.dataGrid2 = dataGrid2;

      return dataGrid2;
    }

    /**
     * Getter for dataGridPagination2 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Pagination get_dataGridPagination2() {
      return build_dataGridPagination2();
    }
    private org.gwtbootstrap3.client.ui.Pagination build_dataGridPagination2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pagination dataGridPagination2 = (org.gwtbootstrap3.client.ui.Pagination) GWT.create(org.gwtbootstrap3.client.ui.Pagination.class);
      // Setup section.

      this.owner.dataGridPagination2 = dataGridPagination2;

      return dataGridPagination2;
    }

    /**
     * Getter for f_ButtonToolBar30 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.ButtonToolBar get_f_ButtonToolBar30() {
      return build_f_ButtonToolBar30();
    }
    private org.gwtbootstrap3.client.ui.ButtonToolBar build_f_ButtonToolBar30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonToolBar f_ButtonToolBar30 = (org.gwtbootstrap3.client.ui.ButtonToolBar) GWT.create(org.gwtbootstrap3.client.ui.ButtonToolBar.class);
      // Setup section.
      f_ButtonToolBar30.add(get_searchButton());
      f_ButtonToolBar30.addStyleName("pull-right");

      return f_ButtonToolBar30;
    }

    /**
     * Getter for searchButton called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Button get_searchButton() {
      return build_searchButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_searchButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button searchButton = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      searchButton.setText("" + get_i18n().button_search() + "");
      searchButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.SUCCESS);

      this.owner.searchButton = searchButton;

      return searchButton;
    }
  }
}
