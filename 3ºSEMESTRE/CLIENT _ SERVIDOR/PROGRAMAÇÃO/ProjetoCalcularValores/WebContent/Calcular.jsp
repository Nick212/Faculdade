<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
				<title>Insert title here</title>
		</head>
			
			
			<body>
			<h3>Resultado em JAVA:</h3> </br>
			
			ID: <%int id = Integer.parseInt(request.getParameter("id"));
				out.println(id);	
					%> </br>
			Nome: <%String nome = request.getParameter("nome");
				out.println(nome);	%>	</br>				

			Quantidade: <%int quant = Integer.parseInt(request.getParameter("quant"));
				out.println(quant);	%>	</br>
			
			Valor: <%int valor = Integer.parseInt(request.getParameter("valor"));
				out.println(valor);	%></br>
				
			Valor Total: <%	out.println(quant * valor);	%>	
			
			</br></br>
			
			<h3>Resultado em JSP:</h3> </br>
			
			ID: <%= id %> </br>
			Nome: <%= nome %> </br>
			Quantidade: <%= quant%> </br>
			Valor: <%= valor %> </br>
			Valor Total: <%= quant * valor %> </br>
			
			</body>
</html>