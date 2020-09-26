<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
	#n1{
		margin-left: 12px;
	}
	#n2{
		margin-left: 12px;
		margin-top:10px;
	}
	.button{
		margin-top:10px;
	}
</style>
</head>
<body>
	<form action="/student_MVC/adminLogin" onsubmit="return saveUser();">
		<h1>用户登录</h1>
		<label>用户名</label><input id="n1" placeholder="请输入用户名" name="userName" value="">
		<span style="color: red" id="errname" class="importspan"></span>
		<span style="color: red">${error}</span>
		<br>
		<label>密&emsp;码</label><input id="n2" type="password" placeholder="请输入密码" name="password">
		<span style="color: red" id="errpassword" class="importspan"></span>
		<br>
		<input class="button" type="submit" value="登录" >
		<input class="button" type="reset" value="重置" >
	</form>
	<script type="text/javascript">
    function saveUser() {
        var namevalue = document.getElementById("n1").value;
        var passwordvalue = document.getElementById("n2").value;
        if (namevalue == null || namevalue == "") {
            document.getElementById("errname").innerHTML = "用户名不能为空";
            return false;
        }else{
            document.getElementById("errname").innerHTML = "";
        }
        if (passwordvalue == null || passwordvalue == "") {
            document.getElementById("errpassword").innerHTML = "密码不能为空";
            return false;
        }else{
            document.getElementById("errpassword").innerHTML = "";
        }
    }
	</script>
</body>
</html>