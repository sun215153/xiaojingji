<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- header -->
	<div class="div_fir_h" >
		<span style="color: white;margin-left: 200px;"> 
			<font color="white">你好，欢迎登入!</font> 
		</span>
		<span style="float: right;margin-right: 200px;color: white;">
			 <a href="first.html">Xiaojingji.com</a>|
			 <c:if test="${}"></c:if>
			  <a href="user_userRegister" target="_blank">注册</a>|
			 <a href="user_login" target="_blank">登入</a>
		</span>
	</div>
	<div class="div_fir_m">
		<span style="margin-left: 200px;">
			<font style="font-size: 40px" color="white">Xiaojingji.com</font> 
		</span>
		<span style="float: right;margin-right: 200px;padding-top: 15px ">
			<input type="text" name="" value="" style="height: 20px">
			<a href="#" style="color: white;padding-left: 3px;">
				<img  src="css/pic/search.jpg" style="height: 27px;" align="top"/>
			</a>
		</span>
	</div>
	<div class="div_fir_f">
		<span style="margin-left: 200px;">
			<a href="http://127.0.0.1:8080">首页</a>
			<a href="topic/topic_index.html">论坛</a>
			<a href="book_index">书籍</a>
			<a href="video_index">视屏</a>
			<a href="essay_index">时文</a>
			<a>强音</a>
		</span>
	</div>