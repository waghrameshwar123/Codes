<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="java.util.*"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Product Details - Using Scriptlet</h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Price</th>
		<th>Quantity</th>
	</tr>
	<%
		Object obj = session.getAttribute("obj");
		List<Product> listOfPro = (List<Product>)obj;
		Iterator<Product> li = listOfPro.iterator();
		while(li.hasNext()){
			Product pro = li.next();
			%>
			<tr>
				<td><%=pro.getId() %></td>
				<td><%=pro.getName() %></td>
				<td><%=pro.getPrice() %></td>
				<td><%=pro.getQuantity() %><td>
			</tr>
			<% 
		}
	%>
</table>
<br/>
<h2>Employee Details - Using JSTL</h2>
<table border="1" >
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
		<th>Quantity</th>
		</tr>
		<core:forEach items="${sessionScope.obj}" var="pro">
			<tr>
				
				<td><core:out value="${pro.getID}"></core:out></td>
				<td><core:out value="${pro.getName()}"></core:out></td>
				<td><core:out value="${pro.getPrice()}"></core:out></td>
				<td><core:out value="${pro.getQuantity()}"></core:out></td>
			</tr>
		</core:forEach>
</table>
	<a href="index.jsp">Add Product</a>
</body>
</html>