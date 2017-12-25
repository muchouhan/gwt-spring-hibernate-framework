package com.mukund.frm.client.domain;

public class PersonClient_Generated_RestServiceProxy_ implements com.mukund.frm.client.domain.PersonClient, org.fusesource.restygwt.client.RestServiceProxy {
  private org.fusesource.restygwt.client.Resource resource = null;
  
  public void setResource(org.fusesource.restygwt.client.Resource resource) {
    this.resource = resource;
  }
  public org.fusesource.restygwt.client.Resource getResource() {
    if (this.resource == null) {
      String serviceRoot = org.fusesource.restygwt.client.Defaults.getServiceRoot();
      this.resource = new org.fusesource.restygwt.client.Resource(serviceRoot);
    }
    return this.resource;
  }
  private org.fusesource.restygwt.client.Dispatcher dispatcher = null;
  
  public void setDispatcher(org.fusesource.restygwt.client.Dispatcher dispatcher) {
    this.dispatcher = dispatcher;
  }
  
  public org.fusesource.restygwt.client.Dispatcher getDispatcher() {
    return this.dispatcher;
  }
  public void filterPerson(java.lang.String personName, java.util.Date fromDate, java.util.Date toDate, org.fusesource.restygwt.client.MethodCallback<java.util.List<com.mukund.frm.shared.PersonDto>> callback) {
    final java.lang.String final_personName = personName;
    final java.util.Date final_fromDate = fromDate;
    final java.util.Date final_toDate = toDate;
    final org.fusesource.restygwt.client.Method __method =
    getResource()
    .resolve("/demogwt/v1/personsFilter")
    .addQueryParam("fromDateTimePicker", (fromDate != null ? fromDate.toString() : null))
    .addQueryParam("nameSuggestBox", personName)
    .addQueryParam("untilDateTimePicker", (toDate != null ? toDate.toString() : null))
    .get();
    __method.setDispatcher(this.dispatcher);
    __method.header(org.fusesource.restygwt.client.Resource.HEADER_ACCEPT, "application/json");
    __method.header(org.fusesource.restygwt.client.Resource.HEADER_CONTENT_TYPE, "application/json");
    try {
      __method.send(new org.fusesource.restygwt.client.AbstractRequestCallback<java.util.List<com.mukund.frm.shared.PersonDto>>(__method, callback) {
        protected java.util.List<com.mukund.frm.shared.PersonDto> parseResult() throws Exception {
          try {
            return org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toList(com.google.gwt.json.client.JSONParser.parse(__method.getResponse().getText()), com.mukund.frm.shared.PersonDto_Generated_JsonEncoderDecoder_.INSTANCE);
          } catch (Throwable __e) {
            throw new org.fusesource.restygwt.client.ResponseFormatException("Response was NOT a valid JSON document", __e);
          }
        }
      });
    } catch (com.google.gwt.http.client.RequestException __e) {
      callback.onFailure(__method,__e);
    }
  }
  public void getPersons(java.lang.Integer start, java.lang.Integer length, org.fusesource.restygwt.client.MethodCallback<java.util.List<com.mukund.frm.shared.PersonDto>> callback) {
    final java.lang.Integer final_start = start;
    final java.lang.Integer final_length = length;
    final org.fusesource.restygwt.client.Method __method =
    getResource()
    .resolve("/demogwt/v1/persons")
    .addQueryParam("start", (start != null ? start.toString() : null))
    .addQueryParam("length", (length != null ? length.toString() : null))
    .get();
    __method.setDispatcher(this.dispatcher);
    __method.header(org.fusesource.restygwt.client.Resource.HEADER_ACCEPT, "application/json");
    __method.header(org.fusesource.restygwt.client.Resource.HEADER_CONTENT_TYPE, "application/json");
    try {
      __method.send(new org.fusesource.restygwt.client.AbstractRequestCallback<java.util.List<com.mukund.frm.shared.PersonDto>>(__method, callback) {
        protected java.util.List<com.mukund.frm.shared.PersonDto> parseResult() throws Exception {
          try {
            return org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toList(com.google.gwt.json.client.JSONParser.parse(__method.getResponse().getText()), com.mukund.frm.shared.PersonDto_Generated_JsonEncoderDecoder_.INSTANCE);
          } catch (Throwable __e) {
            throw new org.fusesource.restygwt.client.ResponseFormatException("Response was NOT a valid JSON document", __e);
          }
        }
      });
    } catch (com.google.gwt.http.client.RequestException __e) {
      callback.onFailure(__method,__e);
    }
  }
}
