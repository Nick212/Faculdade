import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JLabel lblCadastroDoAluno;
	private JLabel lblNomeDoAluno;
	private JLabel lblEmailDoAluno;
	private JTextField txtNomeAluno;
	private JTextField txtEmailAluno;
	private JButton btnNovo;
	private JButton btnGravar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCadastroDoAluno = new JLabel("Cadastro do Aluno");
		lblCadastroDoAluno.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblCadastroDoAluno.setForeground(Color.BLACK);
		lblCadastroDoAluno.setBounds(130, 11, 189, 34);
		contentPane.add(lblCadastroDoAluno);
		
		lblNomeDoAluno = new JLabel("Nome do Aluno");
		lblNomeDoAluno.setForeground(Color.BLUE);
		lblNomeDoAluno.setBounds(10, 59, 86, 14);
		contentPane.add(lblNomeDoAluno);
		
		lblEmailDoAluno = new JLabel("Email do Aluno");
		lblEmailDoAluno.setForeground(Color.BLUE);
		lblEmailDoAluno.setBounds(10, 102, 86, 14);
		contentPane.add(lblEmailDoAluno);
		
		txtNomeAluno = new JTextField();
		txtNomeAluno.setBounds(106, 56, 318, 20);
		contentPane.add(txtNomeAluno);
		txtNomeAluno.setColumns(10);
		
		txtEmailAluno = new JTextField();
		txtEmailAluno.setBounds(106, 99, 318, 20);
		contentPane.add(txtEmailAluno);
		txtEmailAluno.setColumns(10);
		
		btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNovo.setBounds(101, 156, 89, 23);
		contentPane.add(btnNovo);
		
		btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Acesso acesso = new Acesso();
				acesso.getConnection();
			}
		});
		btnGravar.setBounds(262, 156, 89, 23);
		contentPane.add(btnGravar);
	}
}
