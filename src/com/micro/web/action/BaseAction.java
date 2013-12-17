/*
* BaseAction.java    2012-10-30
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.micro.util.Constants;
import com.micro.util.FormatUtil;
import com.micro.web.session.SessionInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


/**
 * TODO Add class description
 * @author yangling
 */
public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = -1591668143847456001L;
	
	protected int pageSize = 10;
	protected String PAGE_NO = "pageNo";
	protected static String EXCEPTION = "exception";
	protected static String LOGIN = "login";
	protected static String ERROR = "error";
	protected static String NOPAGE = "nopage";
	
	
	@SuppressWarnings("rawtypes")
	protected Map getSession(){
		return ActionContext.getContext().getSession();
	}
	
	protected HttpServletRequest getRequest(){
		return (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	}
	
	protected HttpServletRequest getResponse(){
		return (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_RESPONSE);
	}
	
	protected SessionInfo getSessionInfo(){
		SessionInfo sessionInfo = (SessionInfo)this.getSession().get(Constants.SESSION_INFO);
		if (sessionInfo == null){
			sessionInfo = new SessionInfo();
			sessionInfo.setUserType(2); // dev 假设用户是管理员
			sessionInfo.setUserId(1L);
			sessionInfo.setLoginName("sysadmin");
			ActionContext.getContext().getSession().put(Constants.SESSION_INFO, sessionInfo);
		}
		return (SessionInfo)this.getSession().get(Constants.SESSION_INFO);
	}
	
	protected int getPageNo(){
		return FormatUtil.parseInt(this.getRequest().getParameter(PAGE_NO));
	}
}
