package form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jdbc.FabricaConexao;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class FormCalcado extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField corField;
	private JTextField numeroField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCalcado frame = new FormCalcado();
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
	public FormCalcado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE CAL\u00C7ADO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(106, 0, 241, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setBounds(69, 72, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("COR:");
		lblNewLabel_2.setBounds(69, 112, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NUMERO:");
		lblNewLabel_3.setBounds(69, 151, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		nomeField = new JTextField();
		nomeField.setBounds(116, 69, 241, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		
		corField = new JTextField();
		corField.setBounds(126, 109, 253, 20);
		contentPane.add(corField);
		corField.setColumns(10);
		
		numeroField = new JTextField();
		numeroField.setBounds(150, 148, 229, 20);
		contentPane.add(numeroField);
		numeroField.setColumns(10);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		btnSalvar.setBounds(21, 227, 87, 23);
		contentPane.add(btnSalvar);
		
		JButton btnProcurar = new JButton("PROCURAR");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					search();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnProcurar.setBounds(118, 227, 101, 23);
		contentPane.add(btnProcurar);
		
		JButton btnAtualizar = new JButton("ATUALIZAR");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					update();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAtualizar.setBounds(229, 227, 101, 23);
		contentPane.add(btnAtualizar);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					delete();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnExcluir.setBounds(340, 227, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(439, 227, 89, 23);
		contentPane.add(btnFechar);
	}
	
	public void save() {
        
        try {
			post(nomeField.getText(), corField.getText(), Integer.parseInt(numeroField.getText()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void post(String nome, String cor, int numero) throws Exception {
		try {
			Connection conexao = FabricaConexao.getConexao();

			String sql = "INSERT INTO calcado VALUES (?,?,?)";
			PreparedStatement posted = conexao.prepareStatement(sql);
			posted.setString(1, nome);
			posted.setString(2, cor);
			posted.setInt(3, numero);
			posted.executeUpdate();
		}
		catch (Exception e) {
			System.out.println("catch do post " + e);
		}
		finally {
			System.out.println("dados inseridos");
		}
	}
	
	public void search() throws SQLException {
		
    	Connection conexao = FabricaConexao.getConexao();
    	
    	// Atribuindo oque foi digitado no textField a variavel x
    	String x = nomeField.getText();
    	
    	// Pesquisando no BD oque foi digitado no textField
		String sql = "SELECT * FROM calcado WHERE nome='"+ x + "'";
		
		Statement stmt = conexao.createStatement();
		
		// ESTA SENDO ATRIBUIDO A VARIAVEL RESULTADO O RETORNO DA VARIAVEL SQL COM A CONSULTA DO BANCO
		ResultSet resultado = stmt.executeQuery(sql);
		
		resultado.next();
		
		// Setando o retorno do BD nos textField
		nomeField.setText(resultado.getString("nome"));
		corField.setText(resultado.getString("cor"));
		numeroField.setText(resultado.getString("numero"));

		
		conexao.close();
	}
	
	public void update() throws SQLException {
    	
    	Connection conexao = FabricaConexao.getConexao();
    	
    	// Atribuindo oque foi digitado no textField a variavel x
    	String x = nomeField.getText();
		
    	// Faz o Update nos campos curso e periodo atraves do nome que foi passado, nome nao muda pois é chave primaria
		String updateSQL = "UPDATE calcado SET cor = ?, numero = ?  WHERE nome='"+ x + "'";
		
		// Recebendo o updateSQL
		PreparedStatement stmt = conexao.prepareStatement(updateSQL);		
		
		// Setando no banco
		stmt.setString(1, corField.getText());
		stmt.setString(2, numeroField.getText());
		stmt.executeUpdate();
		
		// Fechando conexoes
		stmt.close();
		conexao.close();
    }
	
    public void delete() throws SQLException {
    	
    	Connection conexao = FabricaConexao.getConexao();
    	
    	// Atribuindo oque foi digitado no textField a variavel x
    	String x = nomeField.getText();
    	
    	String deleteSQL = "DELETE FROM calcado WHERE nome='"+ x + "'";
    	
    	PreparedStatement stmt = conexao.prepareStatement(deleteSQL);
    	
    	stmt.execute();
    	
    	nomeField.setText("");
    	corField.setText("");
    	numeroField.setText("");

    	
    	conexao.close(); 	
    }
}
