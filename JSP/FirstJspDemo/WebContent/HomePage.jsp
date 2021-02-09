<!-- when we want to provide some additional information to my browser then the directives of jsp  
page level---@page
-->
<%@page import="java.io.PrintWriter"%>
<%@page language="java" session="true" errorPage="errorpage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int a=17;
int b=9;
void add()
{
	System.out.println(a+b);
}
%>
The sum of two numbers is<%=a+b%>
<%
	PrintWriter bout=response.getWriter();
	if(a>b)
		bout.write("a is greater");
	else
		bout.write("b is greater");
%>

</body>
</html>
<!-- 
to inform when this page needs to be executed or displayed in the browser i can combine this
with servlet
 -->