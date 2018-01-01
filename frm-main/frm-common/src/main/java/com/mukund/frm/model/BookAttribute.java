package com.mukund.frm.model;

import java.io.Serializable;
import java.util.List;

public class BookAttribute  implements Serializable {
	private String id;			//fname
	private String name;		//FirstName
	private String label;		//First Name
	private String toolTip;		//Please Enter First Name
	private String containerName;	//Basic, Owner
	private AttributeTypeE type;	//TEXT, LIST, FLAG
	private String value;		//Mukund
	private int seqNumber;		//1
	private List<String> validValues;	//
	private boolean isVisible;	//This will use to hide attribute on GUI
	private boolean isMandatory;
	
}
