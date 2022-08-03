<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<core:forEach items="${requestScope.listOfProduct}" var="product">
	<img alt="" src="${product.url}" width="100" height="100">
	
	PName <core:out value="${product.pname}"></core:out>
	Price <core:out value="${product.price}"></core:out><br/>
</core:forEach>
</body>
</html>