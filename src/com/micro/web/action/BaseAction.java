/*
* BaseAction.java    2012-10-30
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	protected HttpServletResponse getResponse(){
		return (HttpServletResponse)ActionContext.getContext().get(ServletActionContext.HTTP_RESPONSE);
	}
	
	
	protected int getPageNo(){
		return FormatUtil.parseInt(this.getRequest().getParameter(PAGE_NO));
	}
	
	
	/**
	 * 根据名字获取cookie
	 * @param request
	 * @param name cookie名字
	 * @return cookie,if find nothing ,return null
	 */
	protected Cookie getCookieByName(HttpServletRequest request,String name) {
		 Map<String,Cookie> cookieMap = ReadCookieMap(request);
		    if(cookieMap.containsKey(name)){
		        Cookie cookie = (Cookie)cookieMap.get(name);
		        return cookie;
		    }else{
		        return null;
		    }   
	}
	 
	 
	 
	/**
	 * 将cookie封装到Map里面
	 * @param request
	 * @return
	 */
	private static Map<String,Cookie> ReadCookieMap(HttpServletRequest request){  
	    Map<String,Cookie> cookieMap = new HashMap<String,Cookie>();
	    Cookie[] cookies = request.getCookies();
	    if(null!=cookies){
	        for(Cookie cookie : cookies){
	            cookieMap.put(cookie.getName(), cookie);
	        }
	    }
	    return cookieMap;
	}
}
