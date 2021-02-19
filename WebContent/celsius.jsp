<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Temperature Converter</title>
</head>
<body>
	<h1>Converting C to F!</h1>
	<form action="getFTempServlet" method ="post">
	Enter the temperature in Celsius to be converted to Fahrenheit:
	<input type="text" name="userTemp" size="10">
	<input type="submit" value="Convert Temp"/>
	</form>
	<br/>
	<a href="index.jsp">Convert from Fahrenheit to Celsius instead</a>
</body>
</html>