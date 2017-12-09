<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수강신청</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/css/main.css">
</head>
<body>
	<sf:form method="post"
		action="${pageContext.request.contextPath }/docreate"
		modelAttribute="information">
		<table class="formtable" id="customers">
			<tr>
				<td class="label">년도:</td>
				<td><sf:input class="control" type="text" path="year" /><br/>
					<sf:errors path="year" class="error" /></td>
			</tr>
			<tr>
				<td class="label">학기:</td>
				<td><sf:input class="control" type="text" path="semester" /><br/>
					<sf:errors path="semester" class="error" /></td>
			</tr>
			<tr>
				<td class="label">교과코드:</td>
				<td><sf:input class="control" type="text" path="subject_code" /><br/> 
					<sf:errors path="subject_code" class="error" /></td>
			</tr>
			<tr>
				<td class="label">교과목명:</td>
				<td><sf:input class="control" type="text" path="subject_name" /><br/> 
					<sf:errors path="subject_name" class="error" /></td>
			</tr>
			<tr>
				<td class="label">구분:</td>
				<td><sf:input class="control" type="text" path="division" /><br/> 
					<sf:errors path="division" class="error" /></td>
			</tr>
			<tr>
				<td class="label">학점:</td>
				<td><sf:input class="control" type="text" path="credit" /><br/> 
					<sf:errors path="credit" class="error" /></td>
			</tr>
			<tr>
				<td class="label"></td>
				<td><input class="control" type="submit" value="수강신청" /></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>