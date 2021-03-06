/*
* UserManageAction.java    2012-10-18
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.micro.bean.UserMessage;
import com.micro.util.Constants;
import com.micro.util.CookieUtil;
import com.micro.web.entities.User;
import com.micro.web.service.UserService;


/**
 * TODO Add class description
 */

@Controller 
@Scope("prototype")
public class UserAction extends BaseAction {
	
	private User user;

	private int cookieTime = 1*24* 60* 60*1000;
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
	
	
	public String loginOut(){
		Cookie cookie = CookieUtil.getCookieByName(getRequest(), Constants.COOKIE_NAME);
		cookie.setMaxAge(0);
		//设置路径，这个路径即该工程下都可以访问该cookie 如果不设置路径，那么只有设置该cookie路径及其子路径可以访问
		cookie.setPath("/");
		getResponse().addCookie(cookie);
		getRequest().removeAttribute(Constants.COOKIE_NAME);
		return "userLogin";
	}
	
	
	public String userLogin(){
		try {
			user = userService.findUser(user);
			HttpServletResponse response =  getResponse();
			HttpServletRequest request  = getRequest();
			if(user.getUsertype() == 2){
				
			}
			if(user.getUsertype() == 1){
				// cookie =  getCookieByName(request, user.getUsername());
				UserMessage userMessage = (UserMessage) getRequest().getAttribute(Constants.COOKIE_NAME);
				if(userMessage.getUser() == null){
					JSONObject jsonObject = new JSONObject(user);
					Cookie	cookie = new Cookie(Constants.COOKIE_NAME,jsonObject.toString());
					cookie.setMaxAge(cookieTime);
					//设置路径，这个路径即该工程下都可以访问该cookie 如果不设置路径，那么只有设置该cookie路径及其子路径可以访问
					cookie.setPath("/");
					response.addCookie(cookie);
				}
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
