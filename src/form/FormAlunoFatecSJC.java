package form;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import exercicio03.AlunoFatecSJC;

public class FormAlunoFatecSJC extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField cursoField;
	private JTextField periodoField;
	private ArrayList<AlunoFatecSJC> array_aluno;

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
		
		setTitle("Aluno Fatec SJC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME DO ALUNO: ");
		lblNewLabel.setBounds(10, 11, 103, 21);
		contentPane.add(lblNewLabel);
		
		nomeField = new JTextField();
		nomeField.setBounds(123, 11, 301, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CURSO:");
		lblNewLabel_1.setBounds(10, 46, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PERIODO:");
		lblNewLabel_2.setBounds(10, 84, 55, 14);
		contentPane.add(lblNewLabel_2);
		
		cursoField = new JTextField();
		cursoField.setBounds(66, 43, 358, 20);
		contentPane.add(cursoField);
		cursoField.setColumns(10);
		
		periodoField = new JTextField();
		periodoField.setBounds(76, 81, 348, 20);
		contentPane.add(periodoField);
		periodoField.setColumns(10);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvarAluno();
			}
		});
		btnSalvar.setBounds(10, 227, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(335, 227, 89, 23);
		contentPane.add(btnFechar);
		
		JButton btnProcurar = new JButton("PROCURAR");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procurarAluno();
			}
		});
		btnProcurar.setBounds(165, 227, 103, 23);
		contentPane.add(btnProcurar);
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
}
