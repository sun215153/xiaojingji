package com.micro.web.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

import com.micro.bean.UserMessage;
import com.micro.util.Constants;
import com.micro.util.CookieUtil;
import com.micro.web.entities.User;



public class CookieFilter  implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest	 req = (HttpServletRequest)request;
	//	HttpServletResponse rep = (HttpServletResponse)response;
		 
		Cookie cookie = CookieUtil.getCookieByName(req,Constants.COOKIE_NAME);
		try {
			JSONObject info =  new  JSONObject(cookie.getValue());
			User user = new User();
			user.setUsername(info.getString("username"));
			user.setUserid(info.getLong(("userid")));
			user.setUsertype(info.getInt("usertype"));
			UserMessage message = new UserMessage();
			message.setUser(user);
			req.setAttribute(Constants.COOKIE_NAME, message);
		} catch (Exception e) {
			req.setAttribute(Constants.COOKIE_NAME, new UserMessage());
		}
		chain.doFilter(req, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
	

}
