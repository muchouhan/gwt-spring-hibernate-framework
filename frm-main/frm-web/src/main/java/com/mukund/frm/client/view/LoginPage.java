package com.mukund.frm.client.view;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.inject.Singleton;

import org.gwtbootstrap3.client.ui.AnchorButton;
import org.gwtbootstrap3.client.ui.Column;
import org.gwtbootstrap3.client.ui.Image;
import org.gwtbootstrap3.client.ui.Popover;
import org.gwtbootstrap3.client.ui.constants.IconSize;
import org.gwtbootstrap3.client.ui.constants.IconType;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.binder.EventBinder;
import com.google.web.bindery.event.shared.binder.EventHandler;
import com.mukund.frm.client.common.ErrorFormatter;
import com.mukund.frm.client.common.Startable;
import com.mukund.frm.client.common.WidgetName;
import com.mukund.frm.client.ui.event.ChangeViewEvent;

@Singleton
public class LoginPage extends Composite {

	private static Logger logger = Logger
			.getLogger(LoginPage.class.getName());

	interface LoginPageUiBinder extends UiBinder<Widget, LoginPage> {
	}

	private static LoginPageUiBinder uiBinder = GWT
			.create(LoginPageUiBinder.class);

	interface LoginPageEventBinder extends EventBinder<LoginPage> {
	}

	private final LoginPageEventBinder eventBinder = GWT
			.create(LoginPageEventBinder.class);

	final Map<WidgetName, Widget> widgets = new HashMap<>();

	@SuppressWarnings("unused")
	private final LoadingMessagePopupPanel loadingMessagePopupPanel;

	@SuppressWarnings("unused")
	private final ErrorFormatter errorFormatter;

	@UiField
	Column contentColumn;

	@UiField
	AnchorButton webAppsButton;

	@UiField
	AnchorButton notificationButton;

	@UiField
	AnchorButton wrenchButton;
	
	@UiField
	Popover webAppsPopOver;
	
	@UiField
	Image mainImage;

	@Inject
	public LoginPage(EventBus eventBus, ErrorFormatter errorFormatter,
			LoadingMessagePopupPanel loadingMessagePopupPanel) {
		initWidget(uiBinder.createAndBindUi(this));
		eventBinder.bindEventHandlers(this, eventBus);
		this.errorFormatter = errorFormatter;
		this.loadingMessagePopupPanel = loadingMessagePopupPanel;

		// webAppsButton.getElement().setClassName("glyphicon");
		webAppsButton.setIcon(IconType.TH);
		webAppsButton.setIconSize(IconSize.LARGE);
		
		notificationButton.setIcon(IconType.BELL);
		notificationButton.setIconSize(IconSize.LARGE);
		
		wrenchButton.setIcon(IconType.WRENCH);
		wrenchButton.setIconSize(IconSize.LARGE);
		
		webAppsPopOver.setContent("<div class='webapps-popover-outer-div' style='max-height: 414px; height: 496px;' aria-label='Interseroh-Apps' aria-hidden='false' role='region'>"
				+ "<ul class='webapps-popover-unnumbered-list' aria-dropeffect='move'>"
				+ "<li class='webapps-popover-list-item' aria-grapped='false'>"
				+ "<a class='webapps-popover-a webapps-popover-a-1-1' target='_blank' href='http://www.google.de'>"
				+ "<div class='webapps-popover-list-item-div-1'></div>"
				+ "<div class='webapps-popover-list-item-div-2'></div>"
				+ "<div class='webapps-popover-list-item-div-3'></div>"
				+ "<div class='webapps-popover-list-item-div-4'></div>"
				+ "<span class='webapps-popover-list-item-image'>"
				+ "<img src='images/dienstleistung-logo.png' width='56px' height='56px'/>"
				+ "</span>"
				+ "<span class='webapps-popover-list-item-text'>Dienstleistung</span>"
				+ "</a>"
				+ "</li>"
				+ "<li class='webapps-popover-list-item' aria-grapped='false'>"
				+ "<a class='webapps-popover-a webapps-popover-a-1-2' target='_blank' href='http://www.yahoo.de'>"
				+ "<div class='webapps-popover-list-item-div-1'></div>"
				+ "<div class='webapps-popover-list-item-div-2'></div>"
				+ "<div class='webapps-popover-list-item-div-3'></div>"
				+ "<div class='webapps-popover-list-item-div-4'></div>"
				+ "<span class='webapps-popover-list-item-image'>"
				+ "<img src='images/mengenmeldung-logo.png' width='56px' height='56px'/>"
				+ "</span>"
				+ "<span class='webapps-popover-list-item-text'>Mengen</span>"
				+ "</a>"
				+ "</li>"
				+ "<li class='webapps-popover-list-item' aria-grapped='false'>"
				+ "<a class='webapps-popover-a webapps-popover-a-1-3' target='_blank' href='http://www.google.de'>"
				+ "<div class='webapps-popover-list-item-div-1'></div>"
				+ "<div class='webapps-popover-list-item-div-2'></div>"
				+ "<div class='webapps-popover-list-item-div-3'></div>"
				+ "<div class='webapps-popover-list-item-div-4'></div>"
				+ "<span class='webapps-popover-list-item-image'>"
				+ "<img src='images/isupplier-logo.png' width='56px' height='40px'/>"
				+ "</span>"
				+ "<span class='webapps-popover-list-item-text'>iSupplier</span>"
				+ "</a>"
				+ "</li>"
				+ "<li class='webapps-popover-list-item' aria-grapped='false'>"
				+ "<a class='webapps-popover-a webapps-popover-a-2-1' target='_blank' href='http://www.yahoo.de'>"
				+ "<div class='webapps-popover-list-item-div-1'></div>"
				+ "<div class='webapps-popover-list-item-div-2'></div>"
				+ "<div class='webapps-popover-list-item-div-3'></div>"
				+ "<div class='webapps-popover-list-item-div-4'></div>"
				+ "<span class='webapps-popover-list-item-image'>"
				+ "<img src='images/entsorger-logo.png' width='56px' height='56px'/>"
				+ "</span>"
				+ "<span class='webapps-popover-list-item-text'>Entsorger</span>"
				+ "</a>"
				+ "</li>"
				+ "<li class='webapps-popover-list-item' aria-grapped='false'>"
				+ "<a class='webapps-popover-a webapps-popover-a-2-2' target='_blank' href='http://www.yahoo.de'>"
				+ "<div class='webapps-popover-list-item-div-1'></div>"
				+ "<div class='webapps-popover-list-item-div-2'></div>"
				+ "<div class='webapps-popover-list-item-div-3'></div>"
				+ "<div class='webapps-popover-list-item-div-4'></div>"
				+ "<span class='webapps-popover-list-item-image'>"
				+ "<img src='images/ecoservice24-logo.png' width='56px' height='56px'/>"
				+ "</span>"
				+ "<span class='webapps-popover-list-item-text'>ecoservice24</span>"
				+ "</a>"
				+ "</li>"
				+ "<li class='webapps-popover-list-item' aria-grapped='false'>"
				+ "<a class='webapps-popover-a webapps-popover-a-2-3' target='_blank' href='http://www.yahoo.de'>"
				+ "<div class='webapps-popover-list-item-div-1'></div>"
				+ "<div class='webapps-popover-list-item-div-2'></div>"
				+ "<div class='webapps-popover-list-item-div-3'></div>"
				+ "<div class='webapps-popover-list-item-div-4'></div>"
				+ "<span class='webapps-popover-list-item-image'>"
				+ "<img src='images/auftrags-logo.png' width='56px' height='56px'/>"
				+ "</span>"
				+ "<span class='webapps-popover-list-item-text'>Auftrag</span>"
				+ "</a>"
				+ "</li>"
				+ "<li class='webapps-popover-list-item' aria-grapped='false'>"
				+ "<a class='webapps-popover-a webapps-popover-a-3-1' target='_blank' href='http://www.yahoo.de'>"
				+ "<div class='webapps-popover-list-item-div-1'></div>"
				+ "<div class='webapps-popover-list-item-div-2'></div>"
				+ "<div class='webapps-popover-list-item-div-3'></div>"
				+ "<div class='webapps-popover-list-item-div-4'></div>"
				+ "<span class='webapps-popover-list-item-image'>"
				+ "<img src='images/sammeldrache-logo.jpeg' width='56px' height='56px'/>"
				+ "</span>"
				+ "<span class='webapps-popover-list-item-text'>Drache</span>"
				+ "</a>"
				+ "</li>"
				+ "</ul>"
				+ "</div>");
		
		logger.info("MainPanelView created...");
	}

	public void addWidget(WidgetName name, Widget widget) {
		this.widgets.put(name, widget);
		this.contentColumn.add(widget);
		widget.setVisible(false);
	}

	public void showWidget(WidgetName name) {
		hideAllWidgets();
		Widget widget = this.widgets.get(name);
		widget.setVisible(true);
	}

	private void hideAllWidgets() {
		final int count = this.contentColumn.getWidgetCount();
		for (int i = 0; i < count; i++) {
			this.contentColumn.getWidget(i).setVisible(false);
		}
	}

	void showAndStartWidget(WidgetName name) {
		hideAllWidgets();
		Widget widget = this.widgets.get(name);
		widget.setVisible(true);
		if (widget instanceof Startable) {
			Startable startable = (Startable) widget;
			startable.start();
		}
	}

	public void setContentAreaVisible(boolean visible) {
		this.contentColumn.setVisible(visible);
	}

	public void updatePersonPanelView() {
		showWidget(WidgetName.PERSONLIST);
		// Workaround for DataGrid, the same for GwtBootstrap3:
		// https://github.com/gwtbootstrap/gwt-bootstrap/issues/279
		// just call dataGrid.onResize() when the tab is clicked
		// dataGrid implements RequiresResize and must be placed on a
		// LayoutPanel or you must call onResize() yourself
		PersonPanelView personPanelView = (PersonPanelView) this.widgets
				.get(WidgetName.PERSONLIST);

		logger.info("Method updatePersonPanelView finished: " + personPanelView.getTitle());
	}

	@EventHandler
	void onChangeViewed(ChangeViewEvent event) {
		logger.info("ChangeViewEvent triggered: " + event.getWidgetName()
				+ " - Source: " + event.getSource());
		showAndStartWidget(event.getWidgetName());
	}

}
