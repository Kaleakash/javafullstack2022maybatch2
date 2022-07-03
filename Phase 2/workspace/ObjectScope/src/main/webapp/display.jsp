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
Object obj1 = request.getAttribute("obj");
Object obj2 = session.getAttribute("obj");
out.println("<br/> In JSP Page ");
out.println("<br/> Name is "+obj1);
out.println("<br/> Name is "+obj2);
%>
</body>
</html>