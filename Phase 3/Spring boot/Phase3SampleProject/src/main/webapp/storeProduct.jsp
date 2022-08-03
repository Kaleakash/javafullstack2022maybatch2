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
<h2>Add Product</h2>
<form action="storeProduct" method="post">
	<label>PName</label>
	<input type="text" name="pname"><br/>
	<label>Category</label>
	<select name="category">
		<option>--Select Category--</option>
		<option value="Men">Men</option>
		<option value="Women">Women</option>
		<option value="Kid">Kid</option>
	</select>
	<br/>
	<label>URL</label>
	<input type="url" name="url"><br/>
	<label>Price</label>
	<input type="number" name="price"><br/>
	<label>Quantity</label>
	<input type="number" name="quantity"><br/>
	<input type="submit" value="Store Product">
	<input type="reset" value="reset">
</form>
<br/>
<a href="adminHome.jsp">Back</a>
</body>
</html>