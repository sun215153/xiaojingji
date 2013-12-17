function getVideoUrl(){
	var str = window.location.search;
	//?packageName:videoName
	str = str.substring(1);
	//var arry = str.split(":");
	return str;
}

function playVideo(packageName,videoName,url){
	window.location.href = url+"?"+packageName+":"+videoName;
}