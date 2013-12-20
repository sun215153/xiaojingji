/*
* UserManageAction.java    2012-10-18
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.micro.web.entities.User;
import com.micro.web.service.UserService;


/**
 * TODO Add class description
 */

@Controller 
@Scope("prototype")
public class UserAction extends BaseAction {
	
	private User user;

	@Autowired
	private UserService userService;
	
	
	 public String  addUser() {
		 userService.addUser(user);
		 return "addUser";
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
}
