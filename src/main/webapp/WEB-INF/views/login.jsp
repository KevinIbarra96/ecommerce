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
<form:form action="Login" method="post" modelAttribute="credential">
	<table>		
		<tr>
			<td>Name:</td>
			<td><form:input path="name" /></td>			
		</tr>
		<tr>
			<td>Password:</td>
			<td><form:input path="password" /></td>			
		</tr>		
		<tr><td colspan="2" align="center"><input type="submit" value="Login"><a href="regist">Register</a></td>	
		</tr>
	</table>

</form:form>
</body>
</html>