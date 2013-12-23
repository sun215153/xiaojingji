/*
* UserManageAction.java    2012-10-18
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;



/**
 * TODO Add class description
 */

@Controller 
@Scope("prototype")
public class BookAction extends BaseAction {
	
	//private User user;

	//@Autowired
	//private UserService userService;
	
	public String index(){
		
		
		return "index";
	}
	
	
	
}
