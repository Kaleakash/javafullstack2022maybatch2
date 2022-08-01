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
<h2>Delete Product</h2>
<form action="deleteProduct" method="get">
	<label>PId</label>
	<input type="text" name="pid"><br/>
	<input type="submit" value="submit">
	<input type="reset" value="reset">
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>