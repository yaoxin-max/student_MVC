<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<c:choose> 
	<c:when test="${requestScope.message eq '更改密码成功！'}">    <!--如果 --> 
		<meta http-equiv="refresh" content="1;url=main.jsp"/> 
	</c:when>      

	<c:otherwise>  <!--否则 -->    
		<meta http-equiv="refresh" content="1;url=/student_MVC/FindAllStudents"/> 
	</c:otherwise> 

</c:choose>
 
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