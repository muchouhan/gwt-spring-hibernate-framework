package com.mukund.frm.model.metadata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.mukund.frm.model.AttributeTypeE;

public class AltSystemMetaData implements Cloneable {

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isLink() {
		return isLink;
	}

	public void setLink(boolean isLink) {
		this.isLink = isLink;
	}

	public boolean isLinkInRDM() {
		return isLinkInRDM;
	}

	public void setLinkInRDM(boolean isLinkInRDM) {
		this.isLinkInRDM = isLinkInRDM;
	}

	public List<BookAttributeMetaData> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<BookAttributeMetaData> attributes) {
		this.attributes = attributes;
	}

	private String code;
	private String name;
	private String label;
	private boolean isLink;
	private boolean isLinkInRDM;
	private List<BookAttributeMetaData> attributes = new ArrayList<>();

	public void addAttributes(BookAttributeMetaData attribute) {
		this.attributes.add(attribute);
	}

	public void addAllAttributes(Collection<BookAttributeMetaData> attributes) {
		this.attributes.addAll(attributes);
	}

	public BookAttributeMetaData getAttributeByName(String name) {
		return null;
	}

	public List<BookAttributeMetaData> getAttributeByType(AttributeTypeE type) {
		return null;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
