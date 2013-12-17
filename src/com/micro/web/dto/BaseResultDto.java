/*
* BaseResultDto.java    2012-11-1
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.dto;

import java.io.Serializable;
import java.util.List;


/**
 * TODO Add class description
 * @author yangling
 */
public class BaseResultDto<T> implements Serializable {
	
	private static final long serialVersionUID = 626205010898309857L;
	
	private int totalRecords;
	private int currentPage;
	private int pageSize;
	
	private List<T> restults;
	
	public BaseResultDto(){}
	
	public BaseResultDto(int totalRecords, int currentPage, int pageSize){
		super();
		this.totalRecords = totalRecords;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getRestults() {
		return restults;
	}

	public void setRestults(List<T> restults) {
		this.restults = restults;
	}
	
	
}
