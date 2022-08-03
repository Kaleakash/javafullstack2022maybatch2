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
<h2>Welcome to sportyshoes.com App</h2>
<form action="signIn" method="post">
<label>EmailId</label>
<input type="email" name="emailid"><br/>
<label>Password</label>
<input type="password" name="password"><br/>
<label>TypeOfUser</label>
<input type="radio" name="typeofuser" value="admin">Admin
<input type="radio" name="typeofuser" value="user">User<br/>
<input type="submit" value="signIn">
<input type="reset" value="reset">
</form>
<br/>
<a href="signUp.jsp">SignUp</a>
</body>
</html>