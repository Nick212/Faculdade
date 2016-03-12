import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;


public class Tela_Cadastro extends JFrame {

	private JPanel contentPane;
	private JLabel lblNome;
	private JLabel lblEndereo;
	private JLabel lblSexo;
	private JLabel lblEstadoCivil;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JComboBox cmbSexo;
	private JComboBox cmbEstadoCivil;
	private JButton btnMostrar;
	private JButton btnLimpar;
	private TextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cadastro frame = new Tela_Cadastro();
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
	public Tela_Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 14, 46, 14);
		contentPane.add(lblNome);
		
		lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 39, 70, 14);
		contentPane.add(lblEndereo);
		
		lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(10, 64, 46, 14);
		contentPane.add(lblSexo);
		
		lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setBounds(10, 91, 83, 14);
		contentPane.add(lblEstadoCivil);
		
		txtNome = new JTextField();
		txtNome.setBounds(144, 11, 254, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(144, 36, 254, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		cmbSexo = new JComboBox();
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] {"", "Masculino", "Feminino"}));
		cmbSexo.setBounds(144, 61, 107, 20);
		contentPane.add(cmbSexo);
		
		cmbEstadoCivil = new JComboBox();
		cmbEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"--escolha--", "Solteiro", "Casado", "Vi\u00FAvo"}));
		cmbEstadoCivil.setBounds(144, 88, 107, 20);
		contentPane.add(cmbEstadoCivil);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResultado.setText("Nome:"+txtNome.getText() + 			//variavel + . + getText()
									 "\nEndereço:" + txtEndereco.getText() + 
									 "\nSexo: " + cmbSexo.getSelectedItem() +
									 "\nEstado Civil: " + cmbEstadoCivil.getSelectedItem());		//Pegando o item selecionado
				
				
			}
		});
		btnMostrar.setBounds(99, 137, 89, 35);
		contentPane.add(btnMostrar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Limpar caixa de Texto
				txtEndereco.setText(null);
				txtNome.setText(null);
				
				//Limpar Text Area
				txtResultado.setText("");
				
				//Limpar combos
				cmbEstadoCivil.setSelectedIndex(0);
				cmbSexo.setSelectedIndex(0);
				
			}
		});
		btnLimpar.setBounds(213, 137, 89, 35);
		contentPane.add(btnLimpar);
		
		txtResultado = new TextArea();
		txtResultado.setBounds(29, 189, 380, 95);
		contentPane.add(txtResultado);
	}
}
