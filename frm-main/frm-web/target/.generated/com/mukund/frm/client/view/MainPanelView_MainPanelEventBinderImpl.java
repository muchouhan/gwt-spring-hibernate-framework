package com.mukund.frm.client.view;

import com.google.web.bindery.event.shared.binder.EventBinder;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.binder.GenericEvent;
import com.google.web.bindery.event.shared.binder.impl.GenericEventHandler;
import com.google.web.bindery.event.shared.HandlerRegistration;
import java.util.LinkedList;
import java.util.List;

public class MainPanelView_MainPanelEventBinderImpl extends com.google.web.bindery.event.shared.binder.impl.AbstractEventBinder<MainPanelView> implements MainPanelView.MainPanelEventBinder {
  protected List<HandlerRegistration> doBindEventHandlers(final com.mukund.frm.client.view.MainPanelView target, EventBus eventBus) {
    List<HandlerRegistration> registrations = new LinkedList<HandlerRegistration>();
    bind(eventBus, registrations, com.mukund.frm.client.ui.event.ChangeViewEvent.class, new GenericEventHandler() {
      public void handleEvent(GenericEvent event) { target.onChangeViewed((com.mukund.frm.client.ui.event.ChangeViewEvent) event); }
    });
    return registrations;
  }
}
