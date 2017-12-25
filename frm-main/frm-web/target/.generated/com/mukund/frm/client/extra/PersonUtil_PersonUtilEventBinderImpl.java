package com.mukund.frm.client.extra;

import com.google.web.bindery.event.shared.binder.EventBinder;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.binder.GenericEvent;
import com.google.web.bindery.event.shared.binder.impl.GenericEventHandler;
import com.google.web.bindery.event.shared.HandlerRegistration;
import java.util.LinkedList;
import java.util.List;

public class PersonUtil_PersonUtilEventBinderImpl extends com.google.web.bindery.event.shared.binder.impl.AbstractEventBinder<PersonUtil> implements PersonUtil.PersonUtilEventBinder {
  protected List<HandlerRegistration> doBindEventHandlers(final com.mukund.frm.client.extra.PersonUtil target, EventBus eventBus) {
    List<HandlerRegistration> registrations = new LinkedList<HandlerRegistration>();
    bind(eventBus, registrations, com.mukund.frm.client.ui.event.FilterEvent.class, new GenericEventHandler() {
      public void handleEvent(GenericEvent event) { target.onEvent((com.mukund.frm.client.ui.event.FilterEvent) event); }
    });
    bind(eventBus, registrations, com.mukund.frm.client.ui.event.SearchEvent.class, new GenericEventHandler() {
      public void handleEvent(GenericEvent event) { target.onEvent((com.mukund.frm.client.ui.event.SearchEvent) event); }
    });
    return registrations;
  }
}
