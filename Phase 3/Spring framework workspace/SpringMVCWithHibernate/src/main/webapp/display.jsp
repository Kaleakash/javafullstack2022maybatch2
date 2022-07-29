<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<core:if test="${requestScope.listOfProducts.size()==0}">
	<core:out value="Record not present"></core:out>
</core:if>
<core:if test="${requestScope.listOfProducts.size() > 0}">
<table border="1">
	<caption>Product Details</caption>
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Price</th>
	</tr>
	<core:forEach items="${requestScope.listOfProducts}" var="product">
		<tr>
			<td><core:out value="${product.pid}"></core:out> </td>
			<td><core:out value="${product.pname}"></core:out> </td>
			<td><core:out value="${product.price}"></core:out> </td>
		</tr>
	</core:forEach>
</table>	
</core:if>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>