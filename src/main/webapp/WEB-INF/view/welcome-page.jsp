<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cafe</title>
</head>
<body>
	<h1 align="center">${websiteTitle}</h1>
	<hr>
	<form action="processOrder">
	<div align="center">
		<label for="foodItem">Food Item : </label> <input name="foodType"
			type="text" placeholder="Item Name" id="foodItem"> <input
			type="submit" Value="Place Order">
	</div>
	</form>


</body>
</html>