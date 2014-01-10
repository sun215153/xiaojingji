<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/general.css">
<link href="images/xiao.ico" rel="SHORTCUT ICON">
<script type="text/javascript" src="js/jquery-1.6.4.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>小经济</title>
</head>
<body>
<!-- header -->
	<div class="div_fir_h" >
		<c:if test="${empty usermessage.user}">
			<span style="color: white;margin-left: 200px;"> 
				<font color="white">你好，欢迎登入!</font> 
			</span>
			<span style="float: right;margin-right: 200px;color: white;">
				 <a href="first.html">Xiaojingji.com</a>|
				 
				  <a href="user_userRegister" target="_blank">注册</a>|
				 <a href="user_login" target="_blank">登入</a>
				
			</span>
		 </c:if>
		 
		 <c:if test="${not empty usermessage.user}">
			<span style="color: white;margin-left: 200px;"> 
				<font color="white">你好，${usermessage.user.username}!</font> 
			</span>
			<span style="float: right;margin-right: 200px;color: white;">
				 <a href="first.html">Xiaojingji.com</a>|
				  <a href="user_userRegister" target="_blank">个人中心</a>|
				 <a href="user_loginOut">登出</a>
			</span>
		 </c:if>
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
	
	<!-- body -->
	
	<div class="body">
		<div class="div_fir_body_b">
			<div class="div_fir_body_b_left" >
				<div class="div_fir_body_b_tittle">
					<span class="div_fir_body_b_span1">论坛</span>
					<span class="div_fir_body_b_span2">&gt;<a href="" >&nbsp;更多</a></span>
				</div>
				<div class="index">
					<p class=""><a href="#" class="">中国经济面临三大不确定</a></p>
					<p class=""><a href="#" class="">中国经济面临三大不确定</a></p>
					<p class=""><a href="#" class="">中国经济面临三大不确定</a></p>
					<p class=""><a href="#" class="">中国经济面临三大不确定</a></p>
					<p class=""><a href="#" class="">中国经济面临三大不确定</a></p>
					<p class=""><a href="#" class="">中国经济面临三大不确定</a></p>
					<p class=""><a href="#" class="">中国经济面临三大不确定</a></p>
					<p class=""><a href="#" class="">中国经济面临三大不确定</a></p>
				</div>
			</div>
			<div class="div_fir_body_b_left">
				<div class="div_fir_body_b_tittle">
					<span class="div_fir_body_b_span1">书籍</span>
					<span class="div_fir_body_b_span2">&gt;<a href="" >&nbsp;更多</a></span>
				</div>
			</div>
			<div class="div_fir_body_b_left" >
				<div class="div_fir_body_b_tittle">
					<span class="div_fir_body_b_span1">视屏</span>
					<span class="div_fir_body_b_span2">&gt;<a href="" >&nbsp;更多</a></span>
				</div>
			</div>
		</div>
		
		<div class="div_fir_body_b" >
			<div class="div_fir_body_b_left">
				<div class="div_fir_body_b_tittle">
					<span class="div_fir_body_b_span1">时文</span>
					<span class="div_fir_body_b_span2">&gt;<a href="" >&nbsp;更多</a></span>
				</div>
				<div>
					<p class=""><a href="#" class="">中国的农村和城镇经济改革都是基层的制度创新在先，政府予以追认和推广。</a></p>
				</div>
			</div>
			<div class="div_fir_body_b_left" >
				<div class="div_fir_body_b_tittle">
					<span class="div_fir_body_b_span1">强音</span>
					<span class="div_fir_body_b_span2">&gt;<a href="" >&nbsp;更多</a></span>
				</div>
			</div>
			<div class="div_fir_body_b_left" >
				<div class="div_fir_body_b_tittle">
					<span class="div_fir_body_b_span1">经济学家</span>
					<span class="div_fir_body_b_span2">&gt;<a href="" >&nbsp;更多</a></span>
				</div>
			</div>
		</div>
	</div>
</body>
</html>