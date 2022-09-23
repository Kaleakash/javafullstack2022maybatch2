<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
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
<h2>Retrieve record using Scriplet</h2>
<table border="1">
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Price</th>
	</tr>

<%
Object obj = request.getAttribute("obj");
if(obj != null){
	List<Product> listOfProduct = (List<Product>)obj;
	Iterator<Product> li  = listOfProduct.iterator();
	while(li.hasNext()){
		Product p = li.next();
		%>
			<tr>
				<td> <%=p.getPid() %></td>
				<td> <%=p.getPname() %></td>
				<td> <%=p.getPrice() %></td>
			</tr>
		<% 
	}
}
%>
</table>
<hr/>
<h2>Product Details using JSTL</h2>
<table border="1">
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Price</th>
	</tr>
	<core:forEach items="${requestScope.obj}" var="p">
		<tr>
			<td> <core:out value="${p.pid}"></core:out> </td>
			<td> <core:out value="${p.pname}"></core:out> </td>
			<td> <core:out value="${p.price}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
</body>
</html>