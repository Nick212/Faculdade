<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="index.jsp" method="POST">

		<h3>
			Nome <input type="text" name="nome" />
			<h3 />
			<h3>
				Senha <input type="password" name="senha" />
			</h3>
			<input type="submit" name="enviar" value="Check in" />
	</form>

	<%
		if(int i=3 != 3){}
		String nome = request.getParameter("nome");

		String senha = request.getParameter("senha");

		
			out.println("Olá " + nome + " sua senha é : " + senha);
		
	%>

</body>
</html>