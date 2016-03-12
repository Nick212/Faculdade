

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessaServlet
 */
public class ProcessaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String numero = request.getParameter("numero");
		int n = Integer.parseInt(numero);
		
		PrintWriter out = response.getWriter();
		
		for(int i=1;i<=10;i++)         //O loop é executado 10 vezes
		{
		
		out.println( n + "x" + i + "=" + (n*i) + "</br>");
		
		}
		out.close();
	}

}
