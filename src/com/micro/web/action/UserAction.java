/*
* UserManageAction.java    2012-10-18
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpRequest;
import org.json.JSONObject;
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

	public String userRegister(){
		
		return "userRegister";
	}

	public String login(){
		
		
		return "login";
	}
	
	public String userLogin(){
		try {
			user = userService.findUser(user);
			HttpServletResponse response =  getResponse();
			HttpServletRequest request  = getRequest();
			if(user.getUsertype() == 2){
				
			}
			if(user.getUsertype() == 1){
				Cookie cookie =  getCookieByName(request, user.getUsername());
				if(cookie == null){
					cookie = new Cookie(user.getUsername(),user.getUserid().toString());
					cookie.setMaxAge(360000);
					//设置路径，这个路径即该工程下都可以访问该cookie 如果不设置路径，那么只有设置该cookie路径及其子路径可以访问
					cookie.setPath("/");
				}
				response.addCookie(cookie);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "userLogin";
	}
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
}
