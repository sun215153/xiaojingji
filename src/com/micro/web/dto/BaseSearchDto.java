/*
* BaseSearchDto.java    2012-11-1
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.dto;

import java.io.Serializable;


/**
 * TODO Add class description
 * @author yangling
 */
public class BaseSearchDto implements Serializable {
	
	private static final long serialVersionUID = 2178612291954956253L;
	protected int pageNo = 1;
	protected int pageSize = 2;
	protected int startNo;
	protected String sortColumn;
	protected long personinfoid;
	protected int groupid;
	
	public BaseSearchDto(){
		this.startNo = (this.pageNo -1) * this.pageSize;
	}
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
		if (this.pageNo<1) {
			this.startNo = 0;
			return ;
		}
		this.startNo = (this.pageNo -1) * this.pageSize;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getSortColumn() {
		return sortColumn;
	}
	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
	}

	public int getStartNo() {
		return startNo;
	}

	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}

	public long getPersoninfoid() {
		return personinfoid;
	}

	public void setPersoninfoid(long personinfoid) {
		this.personinfoid = personinfoid;
	}

	public int getGroupid() {
		return groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	
	
}
