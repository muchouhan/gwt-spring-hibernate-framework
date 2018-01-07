/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.mukund.frm.client.common;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.gwtbootstrap3.client.ui.Image;
import org.gwtbootstrap3.client.ui.gwt.FlowPanel;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.PopupPanel;
import com.mukund.frm.client.Messages;

@Singleton
public final class LoadingMessagePopupPanel extends PopupPanel {

	private final FlowPanel container = new FlowPanel();

	@Inject
	public LoadingMessagePopupPanel(Messages messages, Asset asset) {
		final Image ajaxImage = new Image(asset.loadingIcon());
		final Grid grid = new Grid(1, 3);
		grid.setWidget(0, 0, ajaxImage);
		grid.setText(0, 2, messages.loadingMessage_message());
		this.container.add(grid);
		add(this.container);
	}

}