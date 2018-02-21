<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Celcius value : </h4>
		<form class="navbar-form pull-left" method="POST" >
			<input type="text" class="span2" name="celcius">
			<button type="submit" class="btn">Convert</button>
		</form>
		
		<br><br>
		<h2> Fahrenheit : </h2>
		<%
		if(request.getAttribute("result") != null)
			out.write(request.getAttribute("result").toString());		
		%>


</body>
</html>