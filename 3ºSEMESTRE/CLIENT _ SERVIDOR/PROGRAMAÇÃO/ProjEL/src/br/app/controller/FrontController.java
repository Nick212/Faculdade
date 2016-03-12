package br.app.controller;

import java.io.IOException;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.app.bean.Aluno;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("texto", "Olá Mundo!"); // Está passando informções
														// para o JSP

		String texto = " Olá Mundo novamente";
		request.setAttribute("texto2", texto);

		// Define um objeto da classe Aluno
		Aluno aluno = new Aluno("9768768", "Chiquinha", "chiquinha@silva.com");

		// Enviar parâmetro
		request.setAttribute("aluno", aluno);

		// Define uma lista de Alunoss
		List<Aluno> lista = new ArrayList<Aluno>();

		lista.add(new Aluno("123", "Paulo", "paulo@paulo.com"));
		lista.add(new Aluno("321", "Jose", "jose@jose.com"));
		lista.add(new Aluno("234", "Pedro", "pedro@pedro.com"));
		lista.add(new Aluno("432", "Jessica", "jessica@oliveira.com"));

		request.setAttribute("lista", lista);
		
		
		
		
		/** Método de redirecionamento de página **/
		// Define o Despacho
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");

		// Executa o Despacho
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
