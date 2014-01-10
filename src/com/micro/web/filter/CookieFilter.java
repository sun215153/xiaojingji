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
		 
		Cookie cookie = getCookieByName(req,"usermessage");
		try {
			JSONObject info =  new  JSONObject(cookie.getValue());
			User user = new User();
			user.setUsername(info.getString("username"));
			user.setUserid(info.getLong(("userid")));
			user.setUsertype(info.getInt("usertype"));
			UserMessage message = new UserMessage();
			message.setUser(user);
			req.setAttribute("usermessage", message);
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("usermessage", new UserMessage());
		}
		chain.doFilter(req, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
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
