package com.mukund.frm.shared;

public class PersonDto_Generated_JsonEncoderDecoder_ extends org.fusesource.restygwt.client.AbstractJsonEncoderDecoder<com.mukund.frm.shared.PersonDto> {
  
  public static final PersonDto_Generated_JsonEncoderDecoder_ INSTANCE = new PersonDto_Generated_JsonEncoderDecoder_();
  
  public com.google.gwt.json.client.JSONValue encode(com.mukund.frm.shared.PersonDto value) {
    if( value==null ) {
      return getNullType();
    }
    com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
    com.mukund.frm.shared.PersonDto parseValue = (com.mukund.frm.shared.PersonDto)value;
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getName()), rc, "name");
    isNotNullValuePut(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.getNickname()), rc, "nickname");
    return rc;
  }
  
  public com.mukund.frm.shared.PersonDto decode(com.google.gwt.json.client.JSONValue value) {
    if( value == null || value.isNull()!=null ) {
      return null;
    }
    com.google.gwt.json.client.JSONObject object = toObject(value);
    com.mukund.frm.shared.PersonDto rc = new com.mukund.frm.shared.PersonDto();
    rc.setName(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("name")), null));
    rc.setNickname(getValueToSet(org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("nickname")), null));
    return rc;
  }
  
}
