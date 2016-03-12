import java.sql.*;

import javax.swing.JOptionPane;
public class Acesso_SQL {
	
	private Connection conn;
	public void getConnection(){
		
		try{
			
			String url = "jdbc:odbc:localhost/NEXCODE";
			String user = "sa";
			String senha = "sa";
			
			//indica o banco de dados
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection("url","user","senha");
			
			JOptionPane.showMessageDialog(null,"Conectado com sucesso");
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"Erro ao conectar com o banco de Dados");
		}
	}

}
