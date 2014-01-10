<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="../css/general.css">
<link type="text/css" rel="stylesheet" href="../css/video.css">
<script type="text/javascript" src="../js/jquery-1.6.4.js"></script>
<script type="text/javascript" src="../js/video.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>小经济</title>
</head>
<body>
	<!-- header -->
	<%@include file="../common/head.jsp" %>
	<!-- body -->
	
	<div class="body">
		<div class="div_body1">
			<p class="smallTittle"><a>芝加哥学派</a></p>
			<p style="width: 100%;margin-top: 10px" align="center"><img alt="" src="../css/image/smallTittle.jpg" width="70%" height="1px" /></p>
			<p class="smallTittle"><a>奥地利学派</a></p>
			<p style="width: 100%;margin-top: 10px" align="center"><img alt="" src="../css/image/smallTittle.jpg" width="70%" height="1px" /></p>
			<p class="smallTittle"><a>凯恩斯主义</a></p>
			<p style="width: 100%;margin-top: 10px" align="center"><img alt="" src="../css/image/smallTittle.jpg" width="70%" height="1px" /></p>
			<p class="smallTittle"><a>斯坦福公开课</a></p>
		</div>
		<div class="div_body2">
			<div class="videoH">
				<div class="video" style="margin-left: 70px" onclick="play">
					<div class="video_div">
						<a onclick="playVideo('Friedman','ecnomicControl1.flv','video_html/Friedman/ecnomicControl1.html')">
							<img alt="" src="video_image/Friedman/ecnomicControl1.jpg">
						</a>
					</div>
					<p class="p1">蛮横的经济控制(一)</p>
					<p>播放次数</p>
					<p class="p3">弗里德曼</p>
				</div>
				<div class="video">
					<div class="video_div"><a onclick="playVideo('Friedman','ecnomicControl2.flv','video_html/Friedman/ecnomicControl2.html')"><img alt="" src="video_image/Friedman/ecnomicControl2.jpg"></a></div>
					<p class="p1">蛮横的经济控制(二)</p>
					<p>评分</p>
					<p class="p3">弗里德曼</p>
				</div>
				<div  class="video">
					<div class="video_div">
						<a onclick="playVideo('Friedman','ecnomicControl3.flv','video_html/Friedman/ecnomicControl3.html')">
							<img alt="" src="video_image/Friedman/ecnomicControl3.jpg">
						</a>
					</div>
					<p class="p1">蛮横的经济控制(三)</p>
					<p>评分</p>
					<p class="p3">弗里德曼</p>
				</div>
				<div  class="video">
					<div class="video_div">
						<a onclick="playVideo('Friedman','ecnomicControl4.flv','video_html/Friedman/ecnomicControl4.html')">
							<img alt="" src="video_image/Friedman/ecnomicControl4.jpg">
						</a>
					</div>
					<p class="p1">蛮横的经济控制(四)</p>
					<p>评分</p>
					<p class="p3">弗里德曼</p>
				</div>
				
			</div>
			<div class="videoH">
				<div class="video"  style="margin-left: 70px">
					<div class="video_div">
						<a onclick="playVideo('Friedman','ecnomicControl.flv','video_html/Friedman/ecnomicControl.html')">
							<img alt="" src="video_image/Friedman/ecnomicControl.jpg">
						</a>
					</div>
					<p class="p1">蛮横的经济控制(全)</p>
					<p>评分</p>
					<p class="p3">弗里德曼</p>
				</div>
				<div class="video">
					<div class="video_div">
						<a onclick="playVideo('Friedman','greed.flv','video_html/Friedman/greed.html')">
							<img alt="" src="video_image/Friedman/greedFldm.jpg">
						</a>
					</div>
					<p class="p1">弗里德曼论贪婪(全)</p>
					<p>评分</p>
					<p class="p3">弗里德曼</p>
				</div>
				<div class="video">
					<div class="video_div"><img alt="" src="video_image/Friedman/ecnomicControl2.jpg"></div>
					<p class="p1">蛮横的经济控制(二)</p>
					<p>评分</p>
					<p class="p3">弗里德曼</p>
				</div>
				<div  class="video">
					<div class="video_div"><img alt="" src="video_image/Friedman/ecnomicControl3.jpg"></div>
					<p class="p1">蛮横的经济控制(三)</p>
					<p>评分</p>
					<p class="p3">弗里德曼</p>
				</div>
			</div>
			<div class="page"></div>
		</div>
	</div>
</body>
</html>