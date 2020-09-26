<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- 设置几秒后刷新页面进行跳转 -->
<meta http-equiv="refresh" content="1;url=main.jsp"/> 
<title>Insert title here</title>
</head>
<style>
	span{
		color: red;
		text-shadow:5px 5px 5px gray;
	}
</style>
<body>
	<h3><span>${message}</span></h3>	
</body>
</html>