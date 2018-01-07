package com.mukund.frm.client.view;

import java.util.logging.Logger;

import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class LoginView extends BaseView {

	private static Logger logger = Logger.getLogger(LoginView.class.getName());

	public LoginView() {

		DecoratorPanel contentDetailsDecorator = new DecoratorPanel();
		contentDetailsDecorator.setWidth("18em");
		initWidget(contentDetailsDecorator);

		SplitLayoutPanel p = new SplitLayoutPanel();
		p.addWest(new HTML("navigation"), 128);
		p.addNorth(new HTML("list"), 384);
		p.add(new HTML("detailssdsdfsfsd sdfsdfsdfdsfsd"
				+ "sd fsdfsdfsdfsd f"
				+ " sd"
				+ "fsdf"
				+ "sdfsd"));
		contentDetailsDecorator.add(p);
	}

	public Widget asWidget() {
		return this;
	}

}