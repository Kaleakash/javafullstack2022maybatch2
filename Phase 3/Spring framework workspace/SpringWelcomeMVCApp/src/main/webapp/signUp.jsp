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
<h2>Account Create</h2>
<form action="storeUserIntoDb" method="post">
	<label>EmailId</label>
	<input type="email" name="emailid"><br/>
	<label>Password</label>
	<input type="password" name="password"><br/>
	<input type="submit" value="signUp">
	<input type="reset" value="reset">
</form>
<a href="login.jsp">Login Page</a>
</body>
</html>