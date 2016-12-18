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
	<form:form method="POST" action="add" modelAttribute="employee">
		<table border="1">
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName"/> </td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName"/></td>
			</tr>
			<tr>
				<td>Dept</td>
				<td><form:input path="deptNo"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Save"/>
				</td>
			</tr>
		</table>	
	</form:form>
	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Dept</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
				<td>${employee.deptNo}</td>
				<td><a href="get/${employee.id}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>