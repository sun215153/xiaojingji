/*
* Constants.java    2012-10-31
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.util;

/**
 * TODO Add class description
 * @author yangling
 */
public class PageUtil {
	private int totalRecords;
	private int currentPage;
	private int pageSize;
	private String url;
	private String params="";
	private String javascript;
	private String jsPrefix="javascript:";
	private String style="pagination align-right";

	public PageUtil(int totalRecords, int currentPage,int pageSize,  String url) {
		super();
		this.totalRecords = totalRecords;
		this.currentPage = currentPage;
		this.pageSize=pageSize;
		this.url = url;
	}

	public PageUtil(int totalRecords, int currentPage,int pageSize ,String url,
			String params, String javascript, String style) {
		super();
		this.totalRecords = totalRecords;
		this.currentPage = currentPage;
		this.url = url;
		this.params = params;
		this.pageSize=pageSize;
		this.javascript = javascript;
		if(!StringUtil.isEmpty(style)){
			this.style=style;
		}
	}

	private int indicateTotalPages() {
		int totalPage = this.totalRecords / this.pageSize;
		if (this.totalRecords % this.pageSize != 0) {
		    totalPage++;
		}
		return totalPage;

	}

	public String descriptPageLink(){
		StringBuffer sb=new StringBuffer();
		sb.append("<div class=\""+this.style+"\">");
		if(currentPage==1){
			sb.append("<a title=\"首页\""+">&laquo; 首页</a>");
			sb.append("<a title=\"上一页\""+">&laquo; 上一�?/a>");
		}else{
			sb.append("<a title=\"首页\" href=\""+descFirstUrl()+"\">&laquo; 首页</a>");
			sb.append("<a title=\"上一页\" href=\""+descPreviousUrl()+"\">&laquo; 上一�?/a>");
		}
		
		
		if (this.currentPage >=4) {
		    sb.append("&nbsp;...&nbsp;");
		}
		int submitIndex;

		submitIndex = this.currentPage -2;
		if (submitIndex > 0) {
			sb.append("<a class=\"number\" title=\""+submitIndex+"\" href=\"").append(descUrl(submitIndex)).append("\">").append(submitIndex).append("</a>");
		}

		submitIndex = this.currentPage - 1;
		if (submitIndex > 0) {
			sb.append("<a class=\"number\" title=\""+submitIndex+"\" href=\"").append(descUrl(submitIndex)).append("\">").append(submitIndex).append("</a>");

		}

		sb.append("<a class=\"number current\" title=\""+this.currentPage+"\">"+this.currentPage+"</a>");

		submitIndex = this.currentPage + 1;
		if (submitIndex <= indicateTotalPages()) {
			sb.append("<a class=\"number\" title=\""+submitIndex+"\" href=\"").append(descUrl(submitIndex)).append("\">").append(submitIndex).append("</a>");

		}

		submitIndex = this.currentPage + 2;
		if (submitIndex <= indicateTotalPages()) {
			sb.append("<a class=\"number\" title=\""+submitIndex+"\" href=\"").append(descUrl(submitIndex)).append("\">").append(submitIndex).append("</a>");

		}

		if(this.currentPage<3){
			submitIndex = this.currentPage + 3;
			if (submitIndex <= indicateTotalPages()) {
				sb.append("<a class=\"number\" title=\""+submitIndex+"\" href=\"").append(descUrl(submitIndex)).append("\">").append(submitIndex).append("</a>");

			}
		}
		
		
		if(this.currentPage<=1){
			submitIndex = this.currentPage + 4;
			if (submitIndex <= indicateTotalPages()) {
				sb.append("<a class=\"number\" title=\""+submitIndex+"\" href=\"").append(descUrl(submitIndex)).append("\">").append(submitIndex).append("</a>");
	
			}
		}

		if (this.currentPage + 3<= indicateTotalPages()) {
		    sb.append("&nbsp;...&nbsp;");
		}
		
		
		if(this.currentPage== indicateTotalPages()){
			sb.append("<a title=\"下一页\""+">下一�?&raquo;</a>");
			sb.append("<a title=\"尾页\""+">尾页 &raquo;</a>");
			
		}else{
			sb.append("<a title=\"下一页\" href=\""+descNextUrl()+"\" >下一�?&raquo;</a>");
			sb.append("<a title=\"尾页\" href=\""+descLastUrl()+"\" >尾页 &raquo;</a>");
		}
		
		sb.append("</div>");
		return sb.toString();
	}

	private String descFirstUrl(){
		return descUrl(1);
	}
	
	private String descPreviousUrl(){
		int page=this.currentPage-1;
		if(page<=0){
			page=1;
		}
		return descUrl(page);
	}

	private String descNextUrl(){
		int nextPage = this.currentPage+1;
		if(nextPage>indicateTotalPages()){
			nextPage=indicateTotalPages();
		}
		return descUrl(nextPage);
				
	}
	
	private String descLastUrl(){
		return descUrl(indicateTotalPages());
	}
	
	private String descUrl(int page){
		if (javascript != null && javascript.trim().length() > 0) {
			//String url = javaScript + "(" + pageIndex + ")";
		    String url = jsPrefix+javascript + "(" + page + ")";
		    return url;
		} else {
		    String url = this.url + "?pageNo=" + page;
		    if (params != null && params.trim().length() > 0) {
			url += "&" + params;
		    }
		    return url;
		}
	}
	
	
	
	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getJavascript() {
		return javascript;
	}

	public void setJavascript(String javascript) {
		this.javascript = javascript;
	}

	public String getJsPrefix() {
		return jsPrefix;
	}

	public void setJsPrefix(String jsPrefix) {
		this.jsPrefix = jsPrefix;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
	
	public String getStyle() {
		return style;
	}



	public void setStyle(String style) {
		this.style = style;
	}

	public static void main(String[] args){
		PageUtil pu=new  PageUtil(60,2,10,"/url","a=1","","");
		System.out.println(pu.descriptPageLink());
	}
	
	
}
