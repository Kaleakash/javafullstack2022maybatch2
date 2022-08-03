<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}
<br/>
<a href="storeProduct.jsp">Store Product</a> |
<a href="displayAllProduct">View Product Details</a> |
<a href="updateProduct.jsp">Update Product Details</a>
<br/>
<br/>
<a href="index.jsp">Logout</a>
</body>
</html>