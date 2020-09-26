<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>主界面</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css" />
    	<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
    </head>
    <style>
		#date{
			color: black;
			border: 0px;
			width: 200px;
		}
		#d1{
			margin-left: 20px;
		    margin-bottom: 5px;
		    margin-top: 10px;
		}
    </style>
<body>
<img src="img/学生信息管理系统.png" />
	<br>
	<div id="d1">
		<span>欢迎管理员：</span><span style="color: red">${sessionScope.name}</span>
		<input type="text" id="date" /><br>
	</div>
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> 
					<span  class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">首页</a>
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="add.jsp"><i class="icon-pencil"></i>&nbsp;添加学生信息</a></li>
					<li><a href="/student_MVC/FindAllStudents"><i class="icon-book"></i>&nbsp;学生信息维护 </a></li>
					<li><a href="adminEditPwd.jsp"><i class=" icon-cog"></i>&nbsp;修改密码</a></li>
					<li><a href="login.jsp"><i class="icon-user"></i>&nbsp;退出系统</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<script>
		Date.prototype.Format = function (fmt) { //author: meizz 
    	var o = {
	        "M+": this.getMonth() + 1, //月份 
	        "d+": this.getDate(), //日 
	        "h+": this.getHours(), //小时 
	        "m+": this.getMinutes(), //分 
	        "s+": this.getSeconds(), //秒 
	        "q+": Math.floor((this.getMonth() + 3)/3),
	        "S": this.getMilliseconds() //毫秒 
  			 };
	    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	    for (var k in o)
	    if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
	    return fmt;
	   }
		var time1 = new Date().Format("yyyy年-MM月-dd日-hh:mm:ss");
		$(function(){
			$("#date").val(time1);
		})
	</script>
</body>
</html>