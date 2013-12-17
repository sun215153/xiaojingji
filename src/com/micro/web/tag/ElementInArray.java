/*
* ElementInArray.java    2012-11-4
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;


/**
 * TODO Add class description
 * @author Heqi
 */
public class ElementInArray  extends SimpleTagSupport{
	private  String value;
	private  String  values;
	
	
	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public String getValues() {
		return values;
	}


	public void setValues(String values) {
		this.values = values;
	}


	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		String[] strs = values.split(":");
		for(String str:strs){
			if(str.equals(value)){
				getJspBody().getJspContext().getOut().print("checked = 'checked'");
			}
		}
		
	}
	
	
	
}
