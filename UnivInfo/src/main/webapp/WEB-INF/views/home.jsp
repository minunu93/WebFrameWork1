<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/css/main.css">
<title>Home</title>
</head>
<body>
	<table id="customers">
		<tr>
			<td><img
				src="http://t1.daumcdn.net/brunch/service/user/8SM/image/cKBPYGQfiKoErjsVCSYy4eNfW5w.jpg"
				alt="Main View"></td>
		</tr>
		<tr>
			<td>
				<a href="${pageContext.request.contextPath }/menu">menu</a>
			</td>
			
		</tr>
		<tr>
			<td>
				<c:if test="${pageContext.request.userPrincipal.name != null}">
					<a href="javascript:document.getElementById('logout').submit()" >Logout</a>
				</c:if>

				<form id="logout" action="<c:url value="/logout" />" method="post">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				</form>
			</td>
		</tr>
	</table>

</body>
</html>

