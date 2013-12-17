package com.micro.web.service;

import com.micro.web.dto.BaseResultDto;
import com.micro.web.dto.DoctorSearchDto;
import com.micro.web.entities.Doctor;

public interface DoctorService {
	
	public Doctor findDoctorByLoginnameAndpassword(Doctor doctor);
	
	public BaseResultDto<Doctor> queryDoctors(DoctorSearchDto doctorSearchDto);
}
