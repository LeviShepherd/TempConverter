<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Temperature Converter</title>
</head>
<body>
	<h1>Converting F to C!</h1>
	<form action="getCTempServlet" method ="post">
	Enter the temperature in Fahrenheit to be converted to Celsius:
	<input type="text" name="userTemp" size="10">
	<input type="submit" value="Convert Temp"/>
	</form>
	<br/>
	<a href="celsius.jsp">Convert from Celsius to Fahrenheit instead</a>
</body>
</html>