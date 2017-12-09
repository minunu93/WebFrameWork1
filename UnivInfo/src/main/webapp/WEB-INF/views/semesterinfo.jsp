<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/css/main.css">
</head>
<body>
	<table id="customers">
		<tr><td>수강년도</td><td>학기</td><td>이수학점</td><td>상세보기</td></tr>	
			<tr>
				<td><c:out value="${ semester1.year}" > </c:out></td>
				<td><c:out value="${ semester1.semester}" > </c:out></td>
				<td><c:out value="${ semester1.credit}" > </c:out></td>
				<td><a href="${pageContext.request.contextPath }/totalinfo/2017/1">상세보기</a></td>
			</tr>
			
			<tr>
				<td><c:out value="${ semester2.year}" > </c:out></td>
				<td><c:out value="${ semester2.semester}" > </c:out></td>
				<td><c:out value="${ semester2.credit}" > </c:out></td>
				<td><a href="${pageContext.request.contextPath }/totalinfo/2017/2">상세보기</a></td>
			</tr>
			
			<tr>
				<td><c:out value="${ semester3.year}" > </c:out></td>
				<td><c:out value="${ semester3.semester}" > </c:out></td>
				<td><c:out value="${ semester3.credit}" > </c:out></td>
				<td><a href="${pageContext.request.contextPath }/totalinfo/2018/1">상세보기</a></td>
			</tr>
	</table>
	<a href="${pageContext.request.contextPath }/menu">menu</a>
</body>
</html>