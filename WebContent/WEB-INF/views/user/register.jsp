<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
</style>
<title>小经济</title>
</head>
<body>
	<div align="center">
		<div class="regcen">
			<div  class="regcenhead">
				<div style="float: left;"><img alt="" src="images/logo-49h.gif"></div>
				<div style="float: left;border-left: 1px solid silver;margin-left: 20px;padding-left:20px;height: 30px;font-size: 20px;font-family: '微软雅黑';padding-top: 20px">用户注册</div>
				<div style="float: right;padding-top: 40px;color: gray;font-size: 13px"><a >返回首页</a></div>
			</div>
			<div  class="regcontent">
				<form action="user_addUser">
					<div align="left" style="margin-left: 60px">
						<p>
                    		<span class="regtlx">用&nbsp;&nbsp;户&nbsp;&nbsp;名&nbsp;</span>
                       		<input type="text" size="20" value="" class="inp inw" id="nickName" maxlength="20" name="user.username"/>
                       		<span id="nickName_Tip"></span> 
                  		</p>
                  		
                  		 <p>
	                    	<span class="regtlx">电&nbsp;子&nbsp;邮&nbsp;箱</span>
	                        <input type="text" size="20" value="" class="inp inw" id="txtemail" name="user.email" />
	                        <span id="txtemail_Tip"></span> 
                    	</p>
                    	
                    	 <p>
                			<span class="regtlx">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;&nbsp;</span>
                  			<input type="password" size="30" name="user.password" id="password" class="inp inw" onkeyup="$.c.user.reg.CheckPasswordStrength(this)" onpaste="return false" maxlength="16"  />
                  			<span id="password_Tip" style="z-index: 100;"></span> 
                		</p>
              			  <p id="cpp">
                			<span class="regtlx">确&nbsp;认&nbsp;密&nbsp;码</span>
                    		<input type="password" size="30" name="cpassword" id="cpassword" class="inp inw" maxlength="16" onpaste="return false"  />
                  			  <span id="cpassword_Tip"></span> 
               			 </p>
               			 
               			 <p id="agreement">
                    		<input type="checkbox" checked="checked" /> 
                    		<span>我已阅读并同意</span>
                    		<a target="_blank" href="http://about.xiaojingji.com/home/announcement.html">《本站使用协议》</a>
                    		<span id="chkagreement_Tip"></span>
                    	</p>
                    	
                    	 <p>
                    		 <label id="butt" class="butt"><input type="submit" class="btns" value="立即注册" checked="checked" id="btnSubmit" style="width:110px;" /></label>
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