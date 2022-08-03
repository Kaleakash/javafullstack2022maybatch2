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
<form action="updateProduct" method="post">
	<label>PName</label>
	<input type="number" name="pid"><br/>
	<label>URL</label>
	<input type="url" name="url"><br/>
	<label>Price</label>
	<input type="number" name="price"><br/>
	<label>Quantity</label>
	<input type="number" name="quantity"><br/>
	<input type="submit" value="Update Product">
	<input type="reset" value="reset">
</form>
<br/>
<a href="adminHome.jsp">Back</a>
</body>
</html>