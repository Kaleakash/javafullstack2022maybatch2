<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Price</th>
	</tr>
	<core:forEach items="${requestScope.listOfProduct}" var="product">
		<tr>
		<td><core:out value="${product.pid}"></core:out> </td>
		<td><core:out value="${product.pname}"></core:out> </td>
		<td><core:out value="${product.price}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>