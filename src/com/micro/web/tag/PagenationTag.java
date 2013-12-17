/*
* PagenationTag.java    2012-11-1
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.web.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.log4j.Logger;

import com.micro.util.PageUtil;
import com.micro.util.StringUtil;
import com.micro.web.dto.BaseResultDto;


/**
 * TODO Add class description
 * @author yangling
 */
public class PagenationTag extends TagSupport {

	private static final long serialVersionUID = 7068236773446970783L;
	private Logger logger = Logger.getLogger(PagenationTag.class);
	
	private String resultKey;
	private int pageNo;
	private int pageSize;
	private int totalRecords = 0;
	private String url;
	private String style;
	private String javascript;
	private String param;
	
	@Override
	public int doStartTag() throws JspException {
		if(!StringUtil.isEmpty(resultKey)){
			BaseResultDto result= getResult();
			if(result!=null){
				totalRecords=result.getTotalRecords();
				pageNo=result.getCurrentPage();
				pageSize=result.getPageSize();
				
				if(pageNo<1) pageNo=1;
				if(pageSize<1) pageSize=10;
				
			}
		}
		
		if(totalRecords>0){
			PageUtil pu=new  PageUtil(totalRecords,pageNo,pageSize,url,param,javascript,style);
			
			StringBuffer sb=new StringBuffer();
			sb.append(pu.descriptPageLink());

			try {
				pageContext.getOut().println(sb.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.debug("Encounter an exception when parse tag."+e.getMessage());
			}
		
		}
		return SKIP_BODY;
	}
	
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	
	private BaseResultDto getResult(){
		BaseResultDto result=(BaseResultDto) this.pageContext.getAttribute(resultKey);
		if(result==null){
			result=(BaseResultDto) this.pageContext.getRequest().getAttribute(resultKey);
		}
		
		if(result==null){
			result=(BaseResultDto) this.pageContext.getSession().getAttribute(resultKey);
		}
		
		return result;
	}
	
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getJavascript() {
		return javascript;
	}

	public void setJavascript(String javascript) {
		this.javascript = javascript;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getResultKey() {
		return resultKey;
	}

	public void setResultKey(String resultKey) {
		this.resultKey = resultKey;
	}

	
}
