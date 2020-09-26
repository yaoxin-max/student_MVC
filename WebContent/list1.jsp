<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 要将jstl标签库导入到当前的jsp页面 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分页显示员工列表信息</title>
<style type="text/css">
	.page{
	
		padiing:5px;
	}

    .page a,font{
    	text-decoration: none;
    	color:black;
    	font-size: 14px;
    	
    	padding: 2px 5px;
    	border: 1px solid gray;
    }
    
    .page a:hover{
    	color:red;
    	background: #ccc;
    	border: 1px solid gray;
     }
     
     .page .num{
     	width: 40px;
     }
</style>

</head>
<body>
	<h1>分页显示员工信息</h1>
	<hr>
	
	<table border="1" style="width: 500px;border-collapse: collapse;text-align: center;">
	
		<!-- 添加行 -->
		<tr>
			<!-- 添加咧 -->
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>薪资</th>
		</tr>
		
		<!-- 循环输出员工信息  -->
		<c:forEach items="${list}" var="emp">
			<tr>
				<td>${emp.id }</td>
				<td>${emp.name}</td>
				<td>${emp.age}</td>
				<td>${emp.salary}</td>	
			</tr>		
		</c:forEach>
	
	</table>
	<br>
	<!--使用jsp的包含指令将动态页码在下方显示  -->
	<%@ include file="page.jsp" %>
</body>
</html>