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
package com.mukund.frm.client;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.i18n.client.Messages;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.mukund.frm.client.common.ServicePreparator;
import com.mukund.frm.client.view.MainPanelView;
import com.mukund.frm.client.view.PersonPanelView;

@GinModules(DemoGwtWebAppGinModule.class)
public interface DemoGwtWebAppGinjector extends Ginjector {

	ServicePreparator getServicePreparator();

	SimpleEventBus getEventBus();

	Messages getMessages();

	MainPanelView getMainPanelView();

	PersonPanelView getPersonPanelView();

}
