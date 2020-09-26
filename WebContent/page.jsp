<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class = "page">

	<c:choose>
		<c:when test="${currentPage == 1 }">
			<font style="border: 1px solid white">首页</font>
			<font style="border: 1px solid white">上一页</font>
		</c:when>
		
		<c:otherwise>
			<a href="${pageContext.request.contextPath }${url}?page=1">首页</a>
			<a href="${pageContext.request.contextPath }${url}?page=${currentPage-1}">上一页</a>
		</c:otherwise>
	
	</c:choose>
	
	<!-- 实现数字分页 -->
	<c:set var="begin" value="1"></c:set>
	<c:set var="end" value="10"></c:set>
	
	
	<!-- 判断起始的页码 200——》20-->
	<c:if test="${totalPage >10 && currentPage>6 } ">
		<c:set var="begin" value="${ currentPage-4}"></c:set>
	</c:if>
	
	<!-- 判断结束的页码 -->
	<c:if test=" ">
	</c:if>
	
	<c:forEach begin="${begin }" end ="${end }" step="1" var="i">
		<c:if test="${i==currentPage }">
			<font style="border: 1px solid white;">${i }</font>
		
		</c:if>
		
		<c:if test="${i !=currentPage }">
			<a href="${ pageContext.request.contextPath}${url}?page=${i}" >${i }</a>
		</c:if>
	
	</c:forEach>

		<c:choose>
		<c:when test="${currentPage < totalPage }">
			
			<a href="${pageContext.request.contextPath }${url}?page=${currentPage+1}">下一页</a>
			<a href="${pageContext.request.contextPath }${url}?page=${totalPage}">尾页</a>
		</c:when>
		
		<c:otherwise>
			<font style="border: 1px solid white">下一页</font>
			<font style="border: 1px solid white">尾页</font>
		</c:otherwise>
		</c:choose>
		
		<input name="num" class="num" type="text" value="${currentPage }"/>
		
		<input name="btn" type="button" value="前往"/>
		
		<script type="text/javascript">
			var btn = document.getElementsByName("btn")[0];
			
			btn.onclick = function(){
				
				var page = document.getElementsByName("num")[0].value;
				
				if(isNaN(page)){
					document.getElementsByName("num")[0].style="border:1px solid red;color:red";
				}
				
				
				if(page>0 && page<=${totalPage}){
					location.href="${pageContext.request.contextPath}${url}?page="+page;
				}
			};
	
		</script>	
</div>
