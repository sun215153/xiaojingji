/*
* DoctorSearchDto.java    2012-11-1
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.dto;


/**
 * TODO Add class description
 * @author yangling
 */
public class DoctorSearchDto extends BaseSearchDto {

	private static final long serialVersionUID = -7000782041401376751L;
	private String doctorName;
	private String idCard;
	
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
	
	
}
