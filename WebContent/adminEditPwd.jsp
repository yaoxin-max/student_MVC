<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>更改管理员密码</title>
<style type="text/css">
	#n1{
		margin-left: 12px;
	}
	#n2{
		margin-left: 12px;
		margin-top:10px;
	}
	#n3{
		margin-left: 12px;
		margin-top:10px;
	}
	.button{
		margin-top:10px;
		margin-let
	}
	div{
		margin-left: 75px;
	}
</style>
</head>
<body>
	<form action="/student_MVC/AdminUpdatePwd" onsubmit="return saveUser();" method="post">
		<h1>更改密码</h1> 
		<input type="text" style="display: none" value="${sessionScope.id}" name="id">
		<label>&emsp;用户名</label><input id="n1"  name="userName" value="${sessionScope.name}">
		<span style="color: red" id="errname" class="importspan"></span>
		<br>
		<label>&emsp;&emsp;密码</label><input id="n2" type="password" placeholder="请输入你要修改的密码" name="password">
		<span style="color: red" id="errpassword" class="importspan"></span>
		<br>
		<label>确认密码</label><input id="n3" type="password" placeholder="请再次输入你要修改的密码" name="repassword">
		<div>
			<input class="button" type="submit" value="修改" >
			<input class="button" type="reset" value="重置" >		
		</div>

	</form>
	<script type="text/javascript">
	    function saveUser() {
	        var namevalue = document.getElementById("n1").value;
	        var passwordvalue = document.getElementById("n2").value;
	        var repasswordvalue = document.getElementById("n3").value;
	        
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
	        if(repasswordvalue == null || repasswordvalue == ""){
	            document.getElementById("errpassword").innerHTML = "请再次输入密码";
	            return false;
	        }else{
	            document.getElementById("errpassword").innerHTML = "";
	        }
	        if(repasswordvalue!=passwordvalue){
	            document.getElementById("errpassword").innerHTML = "两次密码输入不一致";
	            return false;
	        }else{
	            document.getElementById("errpassword").innerHTML = "";
	        }
	    }
	</script>
</body>
</html>