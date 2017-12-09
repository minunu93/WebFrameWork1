<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/css/main.css">
</head>
<body>
	<table id="customers">
		<tr>
		<td><p>
			<a href="${pageContext.request.contextPath }/"> Home </a>
		</p></td>
		</tr>
		
		<tr>
		<td><p>
			<a href="${pageContext.request.contextPath }/totalinfo"> 모든이수과목조회 </a>
		</p></td>
		</tr>
		
		<tr>
		<td><p>
			<a href="${pageContext.request.contextPath }/semesterinfo"> 이수학점조회 </a>
		</p></td>
		</tr>
		
		<tr>
		<td><p>
			<a href="${pageContext.request.contextPath }/divisioninfo"> 이수구분별학점조회 </a>
		</p></td>
		</tr>
		
		<tr>
		<td><p>
			<a href="${pageContext.request.contextPath }/createinfo"> 수강신청 </a>
		</p></td>
		</tr>
		
		<tr>
		<td><p>
			<a href="${pageContext.request.contextPath }/currentinfo"> 수강신청조회 </a>
		</p></td>
		</tr>
	</table>
	


</body>
</html>