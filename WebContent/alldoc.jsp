<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<!--[if lte IE 6]><script>isIE6=true;</script><![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<title>欢迎登录盖睿医疗系统</title>
<link href="../style/css.css" rel="stylesheet" type="text/css" />
<link href="../style/login.css" rel="stylesheet" type="text/css" />
<link href="../style/style.css" rel="stylesheet" type="text/css" />
<link type="text/css" rel="stylesheet" href="../style/head.css"/>
<link type="text/css" rel="stylesheet" href="../style/middle.css"/>
<link type="text/css" rel="stylesheet" href="../style/foot.css"/>
<link rel="stylesheet" type="text/css" href="../wdatepicker/skin/WdatePicker.css" />
<link rel="stylesheet" type="text/css" href="../wdatepicker/skin/default/datepicker.css" />
<script type="text/javascript" src="../wdatepicker/WdatePicker.js" defer="defer"></script>
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="../js/jquery-1.6.4.js"></script>
<script type="text/javascript" src="../js/table.js"></script>
<script type="text/javascript">
	function s(){
		var time = document.getElementById("date2").value;
		var select  =document.getElementById("select").value;
		var rowIndex = $("#tableSmall").find("tr").length-1;
		$("<tr><td>"+select+"</td><td>"+time+"</td><td><a href='#' onclick='deleteSamllRow(this)'>删除</a></td></tr>").insertAfter($("#tableSmall tr:eq("+rowIndex+")"));
	}
	
	function deleteRow(obj){
		var rowIndex =  obj.parentElement.parentElement.rowIndex;
		$("#table tr:eq("+rowIndex+")").remove();
	}
	
	function deleteSamllRow(obj){
		var rowIndex =  obj.parentElement.parentElement.rowIndex;
		$("#tableSmall tr:eq("+rowIndex+")").remove();
	}
	
	function save(){
		alert('保存成功！');		
	}
	
	var flag1 = true;
	var flag2 = false;
	var flag3 = true;
	var flag4 = false;
	var flag5 = true;
	var flag6 = false;
	function medicineSensitive(obj){
		var num = obj.parentElement.parentElement.rowIndex;
		if(obj.value == "yes" && flag1 ){
			flag1 = false;
			flag2 = true;
			$('<tr><td class="fv">过敏药物：</td><td colspan="5">青霉素<input type="checkbox"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;磺胺<input type="checkbox"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;链霉素<input type="checkbox"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其他：<input type="text"  /></td></tr>').insertAfter($("#table tr:eq("+num+")"));
		}
		if(obj.value=="no" && flag2){
			flag2 = false;
			flag1 = true;
			$("#table tr:eq("+(num+1)+")").remove();
		}
	}
	
	function medicineHistory(obj){
		var num = obj.parentElement.parentElement.rowIndex;
		if(obj.value == "yes" && flag3 ){
			flag3 = false;
			flag4 = true;
			$('<tr><td class="fv">暴露类型：</td><td colspan="5">化学品<input type="checkbox"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;毒物<input type="checkbox"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;射线<input type="checkbox"/></td></tr>').insertAfter($("#table tr:eq("+num+")"));
		}
		if(obj.value=="no" && flag4){
			flag4 = false;
			flag3 = true;
			$("#table tr:eq("+(num+1)+")").remove();
		}
	}
	
	function surgery(obj){
		var num = obj.parentElement.parentElement.rowIndex;
		if(obj.value == "yes" && flag5 ){
			flag5 = false;
			flag6 = true;
			$('<tr><td> 手术名称：</td><td colspan="2"><input  type="text" name="surgeryName"/></td><td>手术时间：</td><td colspan="2"><input type="text" class="Wdate" id="date2" onfocus="WdatePicker({skin:"default",startDate:"%y-%M-%d",dateFmt:"yyyy-MM-dd",alwaysUseStartDate:true})" value="" style="cursor:hand;width:100px;height:20px"/></td></tr><tr><td> 手术名称：</td><td colspan="2"><input  type="text" name="surgeryName"/></td><td>手术时间：</td><td colspan="2"><input type="text" class="Wdate" id="date2" onfocus="WdatePicker({skin:"default",startDate:"%y-%M-%d",dateFmt:"yyyy-MM-dd",alwaysUseStartDate:true})" value="" style="cursor:hand;width:100px;height:20px"/></td></tr>').insertAfter($("#table tr:eq("+num+")"));
		}
		if(obj.value=="no" && flag6){
			flag6 = false;
			flag5 = true;
			$("#table tr:eq("+(num+1)+")").remove();
			$("#table tr:eq("+(num+1)+")").remove();
		}
	}
	
	function dieaseName(obj){
		var dieaseName = document.getElementById("dieaseName");
		if(obj.value == 'no'){
			dieaseName.value = "";
			dieaseName.disabled="disabled";
		}else{
			dieaseName.disabled="";
		}
	}
	
	function sure(){
		alert('提交成功！');
	}
</script>
</head>
<body>
	<!-- main contents start  -->
	<!-- center contents start  -->
	<div id="main">
		<div class="m680" style="width: 980px !important;">
			<div class="con02">
				<!-- nav -->
				<!-- nav -->
				<!--中间 右侧 -->
				<div class="con02right">
					<div>
						<div class="stitle">基本信息</div>
						<table class="tb2" id="table">
							<tr>
								<td class="fv">姓名：</td><td><input  type="text" disabled="disabled" value="张三"/> </td>
								<td class="fv">身份证号：</td><td><input type="text" name="identityId" value="320586198811142425" disabled="disabled"/></td>
								<td class="fv">手机号码：</td><td><input type="text" name="identityId" value="13771822403" disabled="disabled"/></td>
							</tr>
							<tr>
								<td class="fv">性别：</td><td>男<input type="radio" name="gender"/>&nbsp;&nbsp;&nbsp;女<input type="radio" name="gender"/></td>
								<td class="fv">出生日期：</td><td><input type="text" class="Wdate" id="date1" onfocus="WdatePicker({skin:'default',startDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd',alwaysUseStartDate:true})" value="" style="cursor:hand;width:100px;height:20px"/></td>
								<td class="fv">本人电话：</td><td><input type="text" /></td>
							</tr>
							<tr>
								<td class="fv">工作单位：</td><td colspan="3"><input type="text" /></td>
								
								<td class="fv">联系人姓名：</td><td><input type="text" /></td>
							</tr>
							<tr>
								<td class="fv">联系人电话：</td><td><input type="text" /></td>
								<td class="fv">常住类型：</td><td>户籍<input type="radio" name="gender"/>&nbsp;&nbsp;&nbsp;非户籍<input type="radio" name="gender"/></td>
								<td class="fv">民族：</td><td><input type="text" /></td>
							</tr>
							<tr>
								<td class="fv">血型：</td>
								<td>
									<select>
										<option>A型</option>
										<option>B型</option>
										<option>O型</option>
										<option>AB型</option>
										<option>不详</option>
									</select>
								</td>
								<td class="fv" >RH阴性：</td>
								<td>
									<select>
										<option>否</option>
										<option>是</option>
										<option>不详</option>
									</select>
								</td>
								<td class="fv">药物过敏史：</td>
								<td>
									有<input type="radio" value="yes" name="sensitive" onclick="medicineSensitive(this)"/>&nbsp;&nbsp;&nbsp;无<input type="radio" name="sensitive" value="no" onclick="medicineSensitive(this)"/>
								</td>				
							</tr>
							<tr>
								<td class="fv">职业：</td>
								<td colspan="3">
									<select>
										<option >国家机关、党群组织、企业、事业单位负责人</option>
										<option >专业技术人员</option>
										<option >办事人员和有关人员</option>
										<option >商业、服务业人员</option>
										<option >农、林、牧、渔、水利业生产人员</option>
										<option >生产、运输设备操作人员及有关人员</option>
										<option>军人</option>
										<option >不便分类的其他从业人员</option>
									</select>
								</td>
								<td class="fv">文化程度：</td>
								<td>
									<select>
										<option>文盲及半文盲</option>
										<option>小学</option>
										<option>初中</option>
										<option>高中/技校/中专</option>
										<option>大学专科及以上</option>
										<option>不详</option>
									</select>
								</td>
							</tr>
							<tr>
								<td class="fv">医疗费用支付方式：</td>
								<td colspan="3">
									<select>
										<option>城镇职工基本医疗保险</option>
										<option>城镇居民基本医疗保险</option>
										<option>贫困救助</option>
										<option>商业医疗保险</option>
										<option>全公费</option>
										<option>全自费</option>
										<option>其他</option>
									</select>
								</td>	
								<td class="fv">暴露史：</td>
								<td>
									有<input type="radio" value="yes" name="history" onclick="medicineHistory(this)"/>&nbsp;&nbsp;&nbsp;无<input type="radio" name="history" value="no" onclick="medicineHistory(this)"/>
								</td>	
							</tr>
						</table>
						
						<div class="stitle">既往史</div>
						<table class="tb2">
							<tr>
								<td colspan="6">
									<table class="tb2" id="tableSmall">
										<tr>
											<td class="tv">疾病：
												<select id="select">
													<option value="高血压">高血压</option>
													<option value="糖尿病">糖尿病</option>
													<option value="冠心病">冠心病</option>
												</select> 
											</td>
											<td class="tv">确诊时间：<input type="text" class="Wdate" id="date2" onfocus="WdatePicker({skin:'default',startDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd',alwaysUseStartDate:true})" value="" style="cursor:hand;width:100px;height:20px"/></td>
										    <td class="tv"><input type="button" value="添加"  onclick="s()"/> </td>
										</tr>
									</table>								
								</td>
							</tr>
							<tr>
								<td>手术</td>
								<td>名称1：<input name="" type="text" /></td><td>时间：<input type="text" class="Wdate" id="date2" onfocus="WdatePicker({skin:'default',startDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd',alwaysUseStartDate:true})" value="" style="cursor:hand;width:100px;height:20px"/></td>
								<td>名称2：<input name="" type="text" /></td><td>时间：<input type="text" class="Wdate" id="date2" onfocus="WdatePicker({skin:'default',startDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd',alwaysUseStartDate:true})" value="" style="cursor:hand;width:100px;height:20px"/></td>
							</tr>
							<tr>
								<td>外伤</td>
								<td>名称1：<input name="" type="text" /></td><td>时间：<input type="text" class="Wdate" id="date2" onfocus="WdatePicker({skin:'default',startDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd',alwaysUseStartDate:true})" value="" style="cursor:hand;width:100px;height:20px"/></td>
								<td>名称2：<input name="" type="text" /></td><td>时间：<input type="text" class="Wdate" id="date2" onfocus="WdatePicker({skin:'default',startDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd',alwaysUseStartDate:true})" value="" style="cursor:hand;width:100px;height:20px"/></td>
							</tr>
							<tr>
								<td>输血</td>
								<td>名称1：<input name="" type="text" /></td><td>时间：<input type="text" class="Wdate" id="date2" onfocus="WdatePicker({skin:'default',startDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd',alwaysUseStartDate:true})" value="" style="cursor:hand;width:100px;height:20px"/></td>
								<td>名称2：<input name="" type="text" /></td><td>时间：<input type="text" class="Wdate" id="date2" onfocus="WdatePicker({skin:'default',startDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd',alwaysUseStartDate:true})" value="" style="cursor:hand;width:100px;height:20px"/></td>
							</tr>
						</table>
						
						<div class="stitle">家族史</div>
						<table class="tb2">
							<tr><td></td><td  align="center">高血压</td><td  align="center">糖尿病</td><td  align="center">冠心病</td><td  align="center">慢性阻塞性肺疾病</td><td  align="center"> 恶性肿瘤</td><td  align="center">脑卒中</td><td  align="center"> 重性精神疾病</td><td  align="center"> 结核病</td><td  align="center">  肝炎</td><td  align="center"> 先天畸形</td><td align="center">其他</td></tr>
							<tr><td>父亲</td><td align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"> <input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="text" style="width: 40px"/></td><td></td></tr>
							<tr><td>母亲</td><td align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"> <input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="text" style="width: 40px"/></td><td></td></tr>
							<tr><td>兄弟姐妹</td><td align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"> <input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="text" style="width: 40px"/></td><td></td></tr>
							<tr><td>子女</td><td align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"> <input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="checkbox" name="gender"/></td><td  align="center"><input type="text" style="width: 40px"/></td><td></td></tr>
						</table>
						
						<div class="stitle">其他</div>
						<table class="tb2">
							<tr><td>遗传病史：</td><td>无<input type="radio" name="gender" value="no" onclick="dieaseName(this)"/>&nbsp;&nbsp;&nbsp;有&nbsp;&nbsp;&nbsp;<input type="radio" name="gender" value="yes" onclick="dieaseName(this)"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;疾病名称：<input type="text" disabled="disabled" id="dieaseName"/></td> </tr>
							<tr>
								<td>残疾情况：</td>
								<td>
									无残疾<input type="checkbox"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									视力残疾<input type="checkbox"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									听力残疾<input type="checkbox"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									言语残疾<input type="checkbox"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									肢体残疾<input type="checkbox"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									智力残疾<input type="checkbox"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									精神残疾<input type="checkbox"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									其他：<input type="text" style="width: 40px"/>
								</td>
							</tr>
						</table>
						
						<div class="stitle">生活环境</div>
						<table class="tb2">
							<tr>
								<td>厨房排风设施：
									<select>
										<option>无</option>
										<option>油烟机</option>
										<option>换气扇</option>
										<option>烟囱</option>
									</select>
								</td>
								<td >燃料类型：
									<select>
										<option>液化气</option>
										<option>煤 </option>
										<option>天然气</option>
										<option>沼气</option>
										<option>柴火</option>
										<option>其他</option>
									</select>
								</td>
							</tr>
							<tr>
								<td>饮水：
									<select>
										<option>自来水</option>
										<option>经净化过滤的水</option>
										<option>井水</option>
										<option>河湖水</option>
										<option>塘水</option>
										<option>其他</option>
									</select>
								</td>
								<td >厕所：
									<select>
										<option>卫生厕所</option>
										<option>一格或二格粪池式</option>
										<option>马桶</option>
										<option>露天粪坑</option>
										<option>简易棚厕</option>
									</select>
								</td>
							</tr>
							<tr>
								<td>禽畜栏：
									<select>
										<option>单设</option>
										<option>室内</option>
										<option>室外</option>
									</select>
								</td>
								
							</tr>
							<tr>
								<td colspan="6" align="center"><input  type="button" value="提交" onclick="sure()"/></td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- center contents end  -->
	
	<!-- bottom contents start  -->
	<!-- bottom contents end  -->
	
	<!-- main contents end  -->
	
	<s:fielderror escape="false">
		<s:param>checkerror</s:param>
	</s:fielderror>
</body>
</html>
