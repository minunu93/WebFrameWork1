<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수강신청조회</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/css/main.css">
</head>
<body>
	<table id="customers">
		<tr><td>수강년도</td><td>학기</td><td>교과코드</td><td>교과목명</td><td>구분</td><td>학점</td></tr>
		<c:forEach var="currentinfo" items="${currentinfo }">		
			<tr>
				<td><c:out value="${ currentinfo.year}" > </c:out></td>
				<td><c:out value="${ currentinfo.semester}" > </c:out></td>
				<td><c:out value="${ currentinfo.subject_code}" > </c:out></td>
				<td><c:out value="${ currentinfo.subject_name}" > </c:out></td>
				<td><c:out value="${ currentinfo.division}" > </c:out></td>
				<td><c:out value="${ currentinfo.credit}" > </c:out></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>