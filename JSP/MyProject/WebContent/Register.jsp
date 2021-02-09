<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (request.getAttribute("responsemessage") != null)
		response.getWriter().append(request.getAttribute("responsemessage").toString());
	%>
	<form method="post" action="RegisterController">
		<table>
			<tr>
				<%
				if (request.getAttribute("regfailed") != null)
					response.getWriter().append(request.getAttribute("regfailed").toString());
				%>
			</tr>
			<tr>
				<td><p>UserName</p></td>
				<td><input id="custname" name="custname"> <!-- this tag is used for getting username from the user this tag must have a name and id property attached to it -->
				</td>
			</tr>
			<tr>
				<td><p>Password</p></td>
				<td><input type="password" id="custpassword"
					name="custpassword">
			</tr>
			<tr>
				<td><p>EmailId</p></td>
				<td><input type="email" id="custemail" name="custemail">
			</tr>
			<tr>
				<td><p>PhoneNumber</p></td>
				<td><input type="text" id="custphno" name="custphno"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>