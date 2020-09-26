<%@page import="com.yx.entity.Page"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css" />
    </head>
    <body>
		<table class="table table-hover table-bordered" id="mytable">
			<thead>
				<tr>
					<!--  int sid, String sName, String sSex, String sAge, String sTel, String sDept, String sAddress -->
					<th>选中</th>
					<th>编号</th>
					<th>姓名</th>
					<th>性别</th>
					<th>年龄</th>
					<th>电话</th>
					<th>系别</th>
					<th>地址</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody id="listTable">
	
					<c:forEach items="${students}" var="s">
							<tr>
								<td><input type="checkbox" name="item" /></td>
								<td>${s.sid}</td>
								<td>${s.sName}</td>
								<td>${s.sSex}</td>
								<td>${s.sAge}</td>
								<td>${s.sTel}</td>
								<td>${s.sDept}</td>
								<td>${s.sAddress}</td>
								<td>

								<!-- 传参的时候顺便把值传过去 -->
									<a type="button" class="btn btn-danger" href="/student_MVC/DeleteById?id=${s.sid}">删除</a>
									<a type="button" class="btn btn-info" href="/student_MVC//QueryById?id=${s.sid}" >修改</a>
								</td>
							</tr>
					</c:forEach>
					<tr>
						<td colspan="9" style="text-align: center;">
							<button type="button" onclick="tz()" id="fhbtn" class="btn btn-success" style="width: 100px">返回主界面</button>
							<button type="button" onclick="tz2()" id="fhbtn" class="btn btn-success" style="width: 100px">返回登录界面</button>
						</td>
					</tr>
			</tbody>
		</table>
		<%@include file="/footpage.jsp" %>
		<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
		<script type="text/javascript">
		    function  tz() {
		    	window.location.href='main.jsp';
			}
		    function  tz2() {
		    	window.location.href='login.jsp';
			}
		</script>
	</body> 
</html>


	
