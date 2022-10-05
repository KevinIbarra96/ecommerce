<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="saveUser" method="post" modelAttribute="user">
	<table>	
	<form:hidden path="userId"/>	
		<tr>
			<td>Name:</td>
			<td><form:input path="name" /></td>			
		</tr>
		<tr>
			<td>Password:</td>
			<td><form:input path="password" /></td>			
		</tr>
		<tr>
			<td>Email:</td>
			<td><form:input path="emailid" /></td>			
		</tr>
		<tr>
			<td>Phone Number:</td>
			<td><form:input path="phoneNo" /></td>			
		</tr>
		<tr><td colspan="2" align="center"><input type="submit" value="Register"></td>
		</tr>
	</table>

</form:form>

</body>
</html>