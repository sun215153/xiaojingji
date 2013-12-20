<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微经济</title>
<script type="text/javascript" src="js/jquery-1.6.4.js"></script>
<script type="text/javascript">

$(function(){
	setInterval(function(){
		var total = parseInt($('#sy').html());
		if (total == 0){
			window.location.href = "index.jsp";
		}else{
			total = total -1;
			$('#sy').html(total)
		}
	}, 1000);
});

</script>
</head>
<body>
	<div align="center" style="margin-top: 150px">
		<p><font color="red" style="font-size: 25px">注册成功!</font>， 还有<font color="red" style="font-size: 25px;font-weight: 600" id="sy">5</font>秒钟将返回首页！</p>
		<p><a href="index.html">返回首页</a></p>
	</div>
</body>
</html>