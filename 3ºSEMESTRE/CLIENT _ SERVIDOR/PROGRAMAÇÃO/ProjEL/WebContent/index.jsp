<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="br.app.bean.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página Principal</title>
</head>


<body>

	<h1>PÁGINA PRINCIPAL</h1>
	<hr />

	<%
		//Recebendo o valor que foi passado pela servlet
		String texto = (String) request.getAttribute("texto");

		out.println("A Servilet disse: " + texto + "<br/>");

		String texto2 = (String) request.getAttribute("texto2");
		out.print("A servlet disse novamente: " + texto2 + "");
		
		
		//Recebendo o parametro obj ALuno
		Aluno aluno = (Aluno) request.getAttribute("aluno");   //Sempre deve fazer um Cast pois o request retorna objeto 
	%>
	
	<h3>Dados do Aluno</h3>
	<div>RGM: <%= aluno.getRgm() %></div>
	<div>NOME:  <%= aluno.getNome() %> </div>
	<div>EMAIL: <%= aluno.getEmail() %> </div>
	<hr/>
	
	<h3> Lista de Alunos </h3>
	<table border="1">
		<tr>
			<th>RGM</th> <th>NOME</th> <th>EMAIL</th>
		</tr>
	
		<%
			List<Aluno> lista = (ArrayList<Aluno>) request.getAttribute("lista");
		
		for (int i =0; i < lista.size(); i++){
	
			String rgm = lista.get(i).getRgm();
			String nome = lista.get(i).getNome();
			String email = lista.get(i).getEmail();
			
		
		%>
		<tr>
			<td><%= rgm %></td>
			<td><%=nome %></td>
			<td><%=email %></td>	
		</tr>
		<%} %>
	
	</table>
	
	<hr/>
	
	<h1>Utilizando /expression Language</h1>
	${"Olá Mundo"} <br/>
	${texto}<br/>
	Soma> 2+2= ${2+2} 
	
	<hr/>
	<h4>Dados do Aluno</h4>
	<div>RGM: ${aluno.rgm}</div>
	<div>NOME: ${aluno.nome}</div>
	<div>EMAIL: ${aluno.email}</div>

</body>
</html>