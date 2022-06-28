<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>WElcome to Simple HTML Message</h2>
<%-- JSP Comments  --%>
<%! int a,b,sum; %>
<%
	a=10;
	b=20;
	sum = a+b;
	out.println("Welcome to Simple JSP Application");
	//out.println("<b/>Sum of two number is "+sum+"</b>");
%>
<br/>
<p>Sum of two number is <%=100+200 %></p>
<font color="red">Sum of two number is <%=sum %></font><br/>
<font color="blue">sum of <%=a %> and <%=b %> is <%=sum %></font>
</body>
</html>