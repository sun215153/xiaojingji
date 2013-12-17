/*
* SessionInfo.java    2012-10-30
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.session;

import java.io.Serializable;



/**
 * TODO Add class description
 * @author yangling
 */
public class SessionInfo implements Serializable{

	private static final long serialVersionUID = -8500070587910346851L;
	/**
	 * This is user info, It was stored in session.
	 */
	private int userType ;
	private Long userId ;
	private String loginName ;
	private int groupId;
	
	
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	
	
}
