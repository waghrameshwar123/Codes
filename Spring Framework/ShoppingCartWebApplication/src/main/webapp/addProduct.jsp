<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="storeProduct" method="post">
<label>Product ID:</label>
<input type="text" name="id"><br/><br>
<label>Product Name</label>
<input type="text" name="name"><br/><br>
<label>Price</label>
<input type="text" name="price"><br/><br>
<label>Quantity</label>
<input type="text" name="quantity"><br/><br>

<input type="submit" value="store">
<input type="reset" value="Reset">
</form>
</div>
</body>
</html>