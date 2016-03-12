<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
	<form action="Temperatura.jsp" method="post">
		Digite a Temperatura <input type="text" name="temp">
		<input type="submit"></br> Temperatura em Fahrenheit:
		<%
			int c = Integer.parseInt(request.getParameter("temp"));
			
		%>
		<span style="color:#FF0000">
		<%
			out.print(c +" graus F = " +((9 / 5) * c + 32) + " graus C");
		%>




	</form>









</body>
</html>