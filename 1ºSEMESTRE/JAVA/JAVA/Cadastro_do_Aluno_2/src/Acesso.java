import java.sql.*;
import javax.swing.JOptionPane;
public class Acesso {
	private Connection conn;
	public void getConnection(){
		
		try{
			//indica o banco de dados
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/cadaluno","root","");
			
			JOptionPane.showMessageDialog(null,"Conectado com sucesso");
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"Erro ao conectar com o banco de Dados");
		}
	}

}
