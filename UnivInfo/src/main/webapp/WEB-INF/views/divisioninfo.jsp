<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>이수구분별학점조회</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/css/main.css">
</head>
<body>
	<table id="customers">
		<tr><td>교필</td><td>핵교</td><td>전지</td><td>전기</td><td>전선</td><td>총학점</td></tr>	
			<tr>
				<td><c:out value="${ divisioninfo.division1}" > </c:out></td>
				<td><c:out value="${ divisioninfo.division2}" > </c:out></td>
				<td><c:out value="${ divisioninfo.division3}" > </c:out></td>
				<td><c:out value="${ divisioninfo.division4}" > </c:out></td>
				<td><c:out value="${ divisioninfo.division5}" > </c:out></td>
				<td><c:out value="${ divisioninfo.total}" > </c:out></td>
			</tr>
	</table>
</body>
</html>