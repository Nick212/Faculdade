

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Ex2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Ex2() {
        super();
    
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// cria��o do Objeto
				PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Minha Pagina em Servlet</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<form action='Ex_1' method='post'>");
				out.println("Nome: <input type='text' name='nome'></br>");
				out.println("Endere�o: <input type='text' name='tel'></br>");
				out.println("<input type='submit'>");
				out.println("</form>");
				out.println("</body>");
				out.println("</html>");
				out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String tel = request.getParameter("tel");

		PrintWriter out = response.getWriter();
		out.println(" Ol� " + nome + " seu endere�o �: " + tel);
		out.close();
		
	}

}
