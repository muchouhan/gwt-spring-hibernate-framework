package com.mukund.frm.client.view;

import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.ResetButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mukund.frm.client.Messages;

public class LoginPage extends BaseView {

	private static Logger logger = Logger.getLogger(LoginPage.class.getName());
	private Messages messages = GWT.create(Messages.class);
	 
	private final TextBox txtUserName;
	private final PasswordTextBox txtPassword;
	private final Button btnSubmitButton;
	private final ResetButton btnClearButton;
	private final Hyperlink lnkForgetPwd;
	private final FlexTable detailsTable;
	

	public LoginPage() {
		
		DecoratorPanel contentDetailsDecorator = new DecoratorPanel();
		contentDetailsDecorator.setWidth("18em");
		initWidget(contentDetailsDecorator);
		contentDetailsDecorator.setStyleName("{style.panel-main}");
		VerticalPanel contentDetailsPanel = new VerticalPanel();
		contentDetailsPanel.setWidth("100%");

		// Create the contacts list
		//
		detailsTable = new FlexTable();
		detailsTable.setCellSpacing(0);
		detailsTable.setWidth("100%");
		detailsTable.addStyleName("contacts-ListContainer");
		detailsTable.getColumnFormatter().addStyleName(1, "add-contact-input");
		txtUserName = new TextBox();
		txtPassword = new PasswordTextBox();
		lnkForgetPwd = new Hyperlink();
		initDetailsTable();
		contentDetailsPanel.add(detailsTable);

		HorizontalPanel menuPanel = new HorizontalPanel();
		btnSubmitButton = new Button(messages.login_submit());
		btnClearButton = new ResetButton(messages.login_clear());
		
		menuPanel.add(btnSubmitButton);
		menuPanel.add(btnClearButton);
		contentDetailsPanel.add(menuPanel);
		contentDetailsDecorator.add(contentDetailsPanel);

	}

	private void initDetailsTable() {
		detailsTable.setWidget(0, 0, new Label(messages.login_username()));
		detailsTable.setWidget(0, 1, txtUserName);
		detailsTable.setWidget(1, 0, new Label(messages.login_password()));
		detailsTable.setWidget(1, 1, txtPassword);
		detailsTable.setWidget(2, 0, new Label(messages.login_forget()));
		detailsTable.setWidget(2, 1, lnkForgetPwd);
		txtUserName.setFocus(true);
	}

	public Widget asWidget() {
		return this;
	}

}