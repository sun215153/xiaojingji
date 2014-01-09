<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="images/xiao.ico" rel="SHORTCUT ICON">
<style type="text/css">
.regcen{width: 1000px;margin-top:20px}
.regcenhead{height: 70px}
.regcontent{border-top: 1px solid silver;width: 1000px;padding-bottom: 70px;border-bottom: 1px solid silver; }
.regcontent input{height: 29px;width: 235px}
.regcontent p{margin-bottom: 30px}
.regcontent p:FIRST-CHILD {margin-top:40px}
.regtlx{width: 84px}
#agreement{margin-left: 90px}
#agreement input{width: 20px;height:15px;padding-top: 20px}
#agreement a{color: gray;font-size: 13px}
#agreement span{color:gray;font-size: 13px}
#butt{margin-left: 90px}
#butt:HOVER{cursor: pointer;}
.tips{color: black;font-size: 12px}
</style>
<title>小经济</title>
<script type="text/javascript" src="js/jquery-1.6.4.js"></script>
<script type="text/javascript">
	$(function(){
		$('#nickName').blur(function(){
			var len = $(this).val().length;
			if(len <4 || len >=20){
				$('#nickName_Tip').html("4-20位，可由汉字、数字、字母和“_”组成，注册成功后用户名不可修改");
			}
		}).focus(function(){$('#nickName_Tip').html("");});
		
		
		$('#txtemail').blur(function(){
			var lenMail = $(this).val().length;
			if(lenMail <4 || lenMail >=20){
				$('#txtemail_Tip').html("请输入有效的电子邮箱，可用于登录和找回密码");
			}
		}).focus(function(){$('#txtemail_Tip').html("");});
	});
</script>
</head>
<body>
	<div align="center">
		<div class="regcen">
			<div  class="regcenhead">
				<div style="float: left;"><img alt="" src="images/logo3.png" style="width: 120pxpx;height: 45px"/></div>
				<div style="float: left;border-left: 1px solid silver;margin-left: 20px;padding-left:20px;height: 30px;font-size: 20px;font-family: '微软雅黑';padding-top: 20px">用户登入</div>
				<div style="float: right;padding-top: 40px;color: gray;font-size: 13px"><a >返回首页</a></div>
			</div>
			<div  class="regcontent" style="height: 300px">
				<form action="user_userLogin">
					<div align="left" style="margin-left: 60px">
						<p>
                    		<span class="regtlx">用&nbsp;&nbsp;户&nbsp;&nbsp;名&nbsp;</span>
                       		<input type="text" size="20" value="" class="inp inw" id="nickName" maxlength="20" name="user.username"/>
                       		<span id="nickName_Tip" class="tips"></span> 
                  		</p>
                    	 <p>
                			<span class="regtlx">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;&nbsp;</span>
                  			<input type="password" size="30" name="user.password" id="password" class="inp inw" onkeyup="$.c.user.reg.CheckPasswordStrength(this)" onpaste="return false" maxlength="16"  />
                  			<span id="password_Tip"  class="tips"></span> 
                		</p>
                    	 <p>
                    		 <label id="butt" class="butt"><input type="submit" class="btns" value="登入" checked="checked" id="btnSubmit" style="width:110px;" /></label>
               			 </p>
					</div>
				</form>
			</div>
		</div>
		<div style="padding-top: 10px">
			<a style="font-size: 12px;color:#616161;padding-top: 5px;cursor: pointer;">关于小经济</a>
		</div>
	</div>
</body>
</html>