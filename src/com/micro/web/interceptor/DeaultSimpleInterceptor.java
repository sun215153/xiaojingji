package com.micro.web.interceptor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@Controller 
@Scope("prototype")
public class DeaultSimpleInterceptor extends AbstractInterceptor {
	private static HashMap<String, Boolean> map = new HashMap<String, Boolean>();
	static{
		map.put("register", true);
	}
	private static final long serialVersionUID = 1L;

	private String requestdate;
	
	private String Contents=" ";

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		//HttpSession session = ServletActionContext.getRequest().getSession(true);
		Object action = actionInvocation.getAction();
		
		// 获取请求的action名称
		String actionName = actionInvocation.getInvocationContext().getName();	
		if (map.get(actionName)) {
			return "aa";
		}else{
			return actionInvocation.invoke();
		}
	}
	
}
