<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="/spring-sample/employee/update" modelAttribute="employee">
		<table border="1">
			<tr>
				<td>First Name</td>
				<td>
					<form:hidden path="id"/>
					<form:input path="firstName"/>
				</td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName"/></td>
			</tr>
			<tr>
				<td>Dept</td>
				<td>
					<form:select path="deptNo">
						<form:option value="CSE"></form:option>
						<form:option value="ECE"></form:option>
					</form:select>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Update"/>
				</td>
			</tr>
		</table>	
	</form:form>
</body>
</html>