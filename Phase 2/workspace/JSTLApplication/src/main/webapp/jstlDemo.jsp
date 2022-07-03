<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int a=10;
int m = 100;
int n =50;
String stdnames[]={"Ravi","Ajay","Vijay","Lokesh","Mahesh"};
request.setAttribute("obj", stdnames);
out.println("Welcome to JSP Page <br/>");
out.println("<br/>Value of a is "+a);
if(m>n){
	out.println("Value of m is greater than n");
}
for(String name:stdnames){
	out.println("Name is "+name+"<br/>");
}
%>
<br/>
<core:out value="Welcome to Simple JSTL Example"></core:out>
<br/>
<core:set var="b" value="20"></core:set><br/>
Value of b is <core:out value="${b}"></core:out>
<br/>
<core:set value="100" var="x"></core:set>
<core:set value="50" var="y" ></core:set>
<core:if test="${ x gt 50}">
	<core:out value="Yes value of x is > y"></core:out>
</core:if>
<br/>
<h2> All Student Names are </h2>
<core:forEach items="${requestScope.obj}" var="std">
	<core:out value="${std}"></core:out><br/>
</core:forEach>
</body>
</html>