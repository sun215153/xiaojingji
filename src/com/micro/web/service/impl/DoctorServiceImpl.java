package com.micro.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.web.dao.DoctorDAO;
import com.micro.web.dto.BaseResultDto;
import com.micro.web.dto.DoctorSearchDto;
import com.micro.web.entities.Doctor;
import com.micro.web.service.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	public DoctorDAO doctorDAO;
	@Override
	public Doctor findDoctorByLoginnameAndpassword(Doctor doctor) {
		return doctorDAO.findDoctorByLoginnameAndPassword(doctor);
	}
	
	@Override
	public BaseResultDto<Doctor> queryDoctors(DoctorSearchDto doctorSearchDto) {
		return doctorDAO.selectBySearchDto(doctorSearchDto);
	}
}
