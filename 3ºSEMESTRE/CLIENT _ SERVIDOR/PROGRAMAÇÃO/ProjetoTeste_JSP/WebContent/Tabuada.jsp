<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Tabuada</title>
	</head>
	
	<body>




		<%	int valor = Integer.parseInt(request.getParameter("txtValor"));  	%>
		
		<h1>Tabuada do <%= valor %></h1>
		
		<%
		for (int i = 0; i <11 ; i++){
			//out.println(valor + "X" + i + "=" + (valor*i) + "</br>");}
		%>
		
		<h3>  <%= valor %> x <%=i %> = <%=valor*i %></h3>
		
		
		<%
		}
		%>
		
	</body>
</html>