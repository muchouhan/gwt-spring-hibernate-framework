package com.mukund.frm.model.metadata;

import java.util.List;

import com.mukund.frm.model.AttributeTypeE;

public class BookAttributeMetaData {
	
	private String name;
	private String value;
	private int seq;
	private String label;
	private String tooltip;
	private String tab;
	private boolean isMandatory;
	private AttributeTypeE type;
	private List<String> validValues;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getTooltip() {
		return tooltip;
	}
	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}
	public String getTab() {
		return tab;
	}
	public void setTab(String tab) {
		this.tab = tab;
	}
	public boolean isMandatory() {
		return isMandatory;
	}
	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
	public AttributeTypeE getType() {
		return type;
	}
	public void setType(AttributeTypeE type) {
		this.type = type;
	}
	public List<String> getValidValues() {
		return validValues;
	}
	public void setValidValues(List<String> validValues) {
		this.validValues = validValues;
	}
	
}
