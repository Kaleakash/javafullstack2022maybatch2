<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int a,b,sum; %>
<%
a = 10;
b=20;
sum = a+b;
%>
<h1>Sum of two number is <%=sum %></h1>
<h1>Sum of two number is <%=100+200 %></h1>
<hr/>
<h1>Sum of two number is ${10+20}</h1>
<h1>Sub of two number is ${10-20}</h1>
<h1>Mul of two number is ${10*20}</h1>
<h1>Div of two number is ${10/20}</h1>
<h1>Div of two number is ${10 div 20}</h1>
<h1>Equal of two number is ${10 eq 20}</h1>
<h1>Not Equal of two number is ${10 ne 20}</h1>
<h1>Greater than of two number is ${10 gt 20}</h1>
<h1>Less than of two number is ${10 lt 20}</h1>
</body>
</html>