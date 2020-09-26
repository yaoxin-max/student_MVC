<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新学生页面</title>
<style type="text/css">
	.t1{
		text-align: right;
	}
	table{
		width:500px;
		position: relative;
		left:-113px;
	}
	#btn{
		position: relative;
		left: 52px;
	}
	a{
		text-decoration: none;
		color: black;
	}
	.error{
		text-align: left;
		color: red;
	}
	td{
		width: 160px;
	}
</style>
</head>
<body>
	<h3>添加学生页面</h3>
	<form action="/student_MVC/UpdateById" method="post" onsubmit="return saveUser();">
		<input type="text" name="sid" value="${student.sid}" style="display: none;">
		<table >
			<tr>
				<td class="t1">姓名: </td>
				<td><input type="text" name="sName" value="${student.sName}"></td>
				<td class="error"><span id="errorsName"></span></td>
			</tr>
			<tr>
				<td class="t1">性别: </td>
				<td>
				<c:if test="${student.sSex=='男'}">
					<input type="radio" name="sSex" value="男" checked="checked">男
					<input type="radio" name="sSex" value="女">女
				</c:if>
				<c:if test="${student.sSex=='女'}">
					<input type="radio" name="sSex" value="男">男
					<input type="radio" name="sSex" value="女" checked="checked">女
				</c:if>
				 </td>
				 <td class="error"><span id="errorsSex"></span></td>
			</tr>
			<tr>
				<td class="t1">年龄: </td>
				<td><input type="text" name="sAge" value="${student.sAge}"></td>
				<td class="error"><span id="errorsAge"></span></td>
			</tr>
			<tr>
				<td class="t1">电话: </td>
				<td><input type="text" name="sTel" value="${student.sTel}"></td>
				<td class="error"><span id="errorsTel"></span></td>
			</tr>
			<tr>
				<td class="t1">系别: </td>
				<td><input type="text" name="sDept" value="${student.sDept}"></td>
				<td class="error"><span id="errorsDept"></span></td>
			</tr>
			<tr>
				<td class="t1">地址: </td>
				<td><input type="text" name="sAddress" value="${student.sAddress}"></td>
				<td class="error"><span id="errorsAddress"></span></td>
			</tr>
		</table>
		<div id="btn">
			<button type="submit">提交</button>
			<button onclick="tz()" type="button">返回</button>
		</div>
	</form>
	<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
	<script type="text/javascript">
    function saveUser() {
    	//获取值
    	var sName = document.getElementsByName("sName")[0].value;
    	var val=$('input:radio[name="sSex"]:checked').val();
    	var sAge = document.getElementsByName("sAge")[0].value;
    	var sTel = document.getElementsByName("sTel")[0].value;
    	var sDept = document.getElementsByName("sDept")[0].value;
    	var sAddress = document.getElementsByName("sAddress")[0].value;
 
        if (sName == null || sName == "") {
            document.getElementById("errorsName").innerHTML = "用户名不能为空";
            return false;
        }else{
            document.getElementById("errorsName").innerHTML = "";
        }
        if (val==null) {
            document.getElementById("errorsSex").innerHTML = "性别不能为空";
            return false;
        }else{
            document.getElementById("errorsSex").innerHTML = "";
        }
        if (sAge == null || sAge == "") {
            document.getElementById("errorsAge").innerHTML = "年龄不能为空";
            return false;
        }else{
            document.getElementById("errorsAge").innerHTML = "";
        }
        if (sTel == null || sTel == "") {
            document.getElementById("errorsTel").innerHTML = "电话不能为空";
            return false;
        }else{
            document.getElementById("errorsTel").innerHTML = "";
        }
        if (sDept == null || sDept == "") {
            document.getElementById("errorsDept").innerHTML = "系别不能为空";
            return false;
        }else{
            document.getElementById("errorsDept").innerHTML = "";
        }
        if (sAddress == null || sAddress == "") {
            document.getElementById("errorsAddress").innerHTML = "地址不能为空";
            return false;
        }else{
            document.getElementById("errorsAddress").innerHTML = "";
        }
    }
    function  tz() {
    	window.location.href='info.jsp';
	}
	</script>
</body>
</html>