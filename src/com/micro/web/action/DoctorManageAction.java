/*
* UserManageAction.java    2012-10-18
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.action;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.micro.web.dto.BaseResultDto;
import com.micro.web.dto.DoctorSearchDto;
import com.micro.web.entities.Doctor;
import com.micro.web.service.DoctorService;
import com.micro.web.service.UserService;


/**
 * TODO Add class description
 */

@Controller 
@Scope("prototype")
public class DoctorManageAction extends BaseAction {
	
	private static final long serialVersionUID = -9025930558307651270L;
	private static Logger logger = Logger.getLogger(DoctorManageAction.class);
	private Doctor doctor;
	private DoctorSearchDto doctorSearchDto;
	private BaseResultDto<Doctor> doctorResults;

	@Autowired
	private UserService userService;
	
	@Autowired
	private DoctorService doctorService;
	
	/**
	 * add a doctor.
	 * @return
	 */
	public String saveDoctor(){
		return SUCCESS;
	}
	
	public String queryDoctor(){
		if (this.doctorSearchDto == null){
			this.doctorSearchDto = new DoctorSearchDto();
		}
		this.doctorSearchDto.setPageNo(this.getPageNo());
		doctorResults = doctorService.queryDoctors(this.doctorSearchDto);
		return SUCCESS;
	}
	
	
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public DoctorSearchDto getDoctorSearchDto() {
		return doctorSearchDto;
	}

	public void setDoctorSearchDto(DoctorSearchDto doctorSearchDto) {
		this.doctorSearchDto = doctorSearchDto;
	}

	public BaseResultDto<Doctor> getDoctorResults() {
		return doctorResults;
	}

	public void setDoctorResults(BaseResultDto<Doctor> doctorResults) {
		this.doctorResults = doctorResults;
	}
	
}
