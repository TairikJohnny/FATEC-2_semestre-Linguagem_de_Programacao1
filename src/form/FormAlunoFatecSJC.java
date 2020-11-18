package form;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.awt.event.ActionEvent;

import exercicio03.AlunoFatecSJC;
import jdbc.FabricaConexao;
import java.awt.Font;
import java.awt.Color;

public class FormAlunoFatecSJC extends JFrame {

	protected static final AlunoFatecSJC AlunoFatecSJC = null;
	JLabel labelTemp = new JLabel();
	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField cursoField;
	private JTextField periodoField;
	private ArrayList<AlunoFatecSJC> array_aluno;
	private HashMap<String, AlunoFatecSJC> alunos;
	private ArrayList<AlunoFatecSJC> historico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAlunoFatecSJC frame = new FormAlunoFatecSJC();
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
	public FormAlunoFatecSJC() {
		
		array_aluno = new ArrayList<AlunoFatecSJC>();
		
		historico = new ArrayList<>();
		
		alunos = new HashMap<>();
		
		setTitle("Aluno Fatec SJC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME DO ALUNO: ");
		lblNewLabel.setBounds(10, 63, 103, 21);
		contentPane.add(lblNewLabel);
		
		nomeField = new JTextField();
		nomeField.setBounds(123, 63, 367, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CURSO:");
		lblNewLabel_1.setBounds(39, 121, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PERIODO:");
		lblNewLabel_2.setBounds(30, 175, 55, 14);
		contentPane.add(lblNewLabel_2);
		
		cursoField = new JTextField();
		cursoField.setBounds(95, 118, 395, 20);
		contentPane.add(cursoField);
		cursoField.setColumns(10);
		
		periodoField = new JTextField();
		periodoField.setBounds(95, 172, 395, 20);
		contentPane.add(periodoField);
		periodoField.setColumns(10);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		btnSalvar.setBounds(10, 288, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(511, 288, 89, 23);
		contentPane.add(btnFechar);
		
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
		btnProcurar.setBounds(128, 288, 103, 23);
		contentPane.add(btnProcurar);
		
		JLabel lblNewLabel_3 = new JLabel("CADASTRO ALUNOS");
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(176, 11, 181, 30);
		contentPane.add(lblNewLabel_3);
		
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
		btnAtualizar.setBounds(266, 288, 103, 23);
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
		btnExcluir.setBounds(394, 288, 89, 23);
		contentPane.add(btnExcluir);
	}
	
	public void salvarAluno() {
		
		AlunoFatecSJC aluno1 = new AlunoFatecSJC(nomeField.getText(), cursoField.getText(), periodoField.getText());
		
		aluno1.setNome(nomeField.getText());
		aluno1.setCurso(cursoField.getText());
		aluno1.setPeriodo(periodoField.getText());
		array_aluno.add(aluno1);
		limparCampos();
	}
	
	public void limparCampos() {
		nomeField.setText("");
		cursoField.setText("");
		periodoField.setText("");
	}
	
	public void procurarAluno() {
		
		AlunoFatecSJC aluno = new AlunoFatecSJC();
		
		for(int i = 0; i < array_aluno.size(); i ++) {
			
			aluno = (AlunoFatecSJC)array_aluno.get(i);
			
			if(aluno.getNome().equals(nomeField.getText())){
				
				nomeField.setText(aluno.getNome());
				cursoField.setText(aluno.getCurso());
				periodoField.setText(aluno.getPeriodo());
				break;
			}
		}
	}
	
	public void save() {
        AlunoFatecSJC alunofatec = new AlunoFatecSJC(nomeField.getText(), cursoField.getText(), periodoField.getText());
        
        try {
			post(nomeField.getText(), cursoField.getText(), periodoField.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if(checarCampos(alunofatec)==0) {
            if(!alunos.containsKey(nomeField.getText())) {
                this.alunos.put(nomeField.getText(), alunofatec);
                this.historico.add(alunofatec);            
            } else {
            	alunos.get(nomeField.getText()).setCurso(cursoField.getText());
            	alunos.get(nomeField.getText()).setPeriodo(periodoField.getText());
            }
            
            limparDados();
        }
        
        nomeField.requestFocus();
    }
	
	
	public static void post(String nome, String curso, String periodo) throws Exception {
		try {
			Connection conexao = FabricaConexao.getConexao();

			String sql = "INSERT INTO alunofatec VALUES (?,?,?)";
			PreparedStatement posted = conexao.prepareStatement(sql);
			posted.setString(1, nome);
			posted.setString(2, curso);
			posted.setString(3, periodo);
			posted.executeUpdate();
		}
		catch (Exception e) {
			System.out.println("catch do post " + e);
		}
		finally {
			System.out.println("dados inseridos");
		}
	}
	
	
	public int checarCampos(AlunoFatecSJC aluno) {
        int count = 0;
        
        if(aluno.getNome().equals("")) {
            count++;
        } else if(aluno.getCurso().equals("")) {
            count++;
        } else if(aluno.getPeriodo().equals("")) {
            count++;
        } else {
            return count;
        }
        
        return count;
        
    }
	
    public void limparDados() {
        nomeField.setText("");
        cursoField.setText("");
        periodoField.setText("");
    }

    
    public void search() throws SQLException {
    	Connection conexao = FabricaConexao.getConexao();
    	
    	// Atribuindo oque foi digitado no textField a variavel x
    	String x = nomeField.getText();
    	
    	// Pesquisando no BD oque foi digitado no textField
		String sql = "SELECT * FROM alunofatec WHERE nome='"+ x + "'";
		
		Statement stmt = conexao.createStatement();
		
		// ESTA SENDO ATRIBUIDO A VARIAVEL RESULTADO O RETORNO DA VARIAVEL SQL COM A CONSULTA DO BANCO
		ResultSet resultado = stmt.executeQuery(sql);
		
		resultado.next();
		
		// Setando o retorno do BD nos textField
		nomeField.setText(resultado.getString("nome"));
		cursoField.setText(resultado.getString("curso"));
		periodoField.setText(resultado.getString("periodo"));	
		
		conexao.close();
		
		
		// EXEMPLO ABAIXO LISTA NO CONSOLE
		
		//List<AlunoFatecSJC> teste = new ArrayList<>();
		
		// ENQUANTO HOUVER REGISTRO FICA NA REPETI��O
		//while(resultado.next()) {
		//	String nome = resultado.getString("nome");
		//	String curso = resultado.getString("curso");
		//	String periodo = resultado.getString("periodo");
		//	teste.add(new AlunoFatecSJC(nome, curso, periodo));
		//}
		
		//for(AlunoFatecSJC p: teste) {
		//	System.out.println("O nome do aluno é: " + p.getNome());
		//	System.out.println("O curso do aluno é: " + p.getCurso());
		//	System.out.println("O perido do curso é: " + p.getPeriodo());
		//	System.out.println("---------------------------------------");
		//}
   }
    
    public void update() throws SQLException {
    	Connection conexao = FabricaConexao.getConexao();
    	
    	// Atribuindo oque foi digitado no textField a variavel x
    	String x = nomeField.getText();
		
    	// Faz o Update nos campos curso e periodo atraves do nome que foi passado, nome nao muda pois é chave primaria
		String updateSQL = "UPDATE alunofatec SET curso = ?, periodo = ? WHERE nome='"+ x + "'";
		
		// Recebendo o updateSQL
		PreparedStatement stmt = conexao.prepareStatement(updateSQL);		
		
		// Setando no banco
		stmt.setString(1, cursoField.getText());
		stmt.setString(2, periodoField.getText());
		stmt.executeUpdate();
		
		// Fechando conexoes
		stmt.close();
		conexao.close();
    }
    
    public void delete() throws SQLException {
    	
    	Connection conexao = FabricaConexao.getConexao();
    	
    	// Atribuindo oque foi digitado no textField a variavel x
    	String x = nomeField.getText();
    	
    	String deleteSQL = "DELETE FROM alunofatec WHERE nome='"+ x + "'";
    	
    	PreparedStatement stmt = conexao.prepareStatement(deleteSQL);
    	
    	stmt.execute();
    	
    	nomeField.setText("");
    	cursoField.setText("");
    	periodoField.setText("");
    	
    	conexao.close(); 	
    }
}
        