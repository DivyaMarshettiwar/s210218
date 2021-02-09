<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginController" method="post">
		<table>
			<tr>
				<%
				if (request.getAttribute("regsuccess") != null)
					response.getWriter().append(request.getAttribute("regsuccess").toString());
				%>
			</tr>
			<tr>
				<td><p>UserName</p></td>
				<td><input type="text" name="loginname" id="loginname">
			</tr>
			<tr>
				<td><p>Password</p></td>
				<td><input type="password" name="loginpassword"
					id="loginpassword"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>