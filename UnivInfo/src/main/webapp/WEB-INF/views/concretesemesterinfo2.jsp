<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2017년도 2학기</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/css/main.css">
</head>
<body>
	<table id="customers">
		<tr><td>수강년도</td><td>학기</td><td>교과코드</td><td>교과목명</td><td>구분</td><td>학점</td></tr>
		<c:forEach var="semester" items="${semester }">		
			<tr>
				<td><c:out value="${ semester.year}" > </c:out></td>
				<td><c:out value="${ semester.semester}" > </c:out></td>
				<td><c:out value="${ semester.subject_code}" > </c:out></td>
				<td><c:out value="${ semester.subject_name}" > </c:out></td>
				<td><c:out value="${ semester.division}" > </c:out></td>
				<td><c:out value="${ semester.credit}" > </c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>