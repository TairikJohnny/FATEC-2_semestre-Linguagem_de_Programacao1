package form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;

import exercicio03.Planeta;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormPlaneta extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField corField;
	private JTextField galaxiaField;
	private JTextField menorField;
	private JTextField maiorField;
	private JTextField quantidadeField;
	private JTextField nomesatelitesField;
	private ArrayList<Planeta> array_planeta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPlaneta frame = new FormPlaneta();
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
	public FormPlaneta() {
		
		array_planeta = new ArrayList<Planeta>();
		
		setTitle("CADASTRO DE NOVO PLANETA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME DO PLANETA:");
		lblNewLabel.setBounds(10, 43, 116, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COR DO PLANETA:");
		lblNewLabel_1.setBounds(10, 68, 129, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("GALAXIA AONDE SE ENCONTRA:");
		lblNewLabel_2.setBounds(10, 93, 181, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MENOR TEMPERATURA:");
		lblNewLabel_3.setBounds(10, 115, 139, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MAIOR TEMPERATURA:");
		lblNewLabel_4.setBounds(10, 136, 139, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("QUANTIDADE DE SATELITES:");
		lblNewLabel_5.setBounds(10, 161, 166, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("NOMES DOS SATELITES:");
		lblNewLabel_6.setBounds(10, 186, 166, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("DESCOBRIMOS UM NOVO PLANETA");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_7.setBounds(76, 18, 285, 14);
		contentPane.add(lblNewLabel_7);
		
		nomeField = new JTextField();
		nomeField.setBounds(136, 40, 415, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		
		corField = new JTextField();
		corField.setBounds(118, 65, 433, 20);
		contentPane.add(corField);
		corField.setColumns(10);
		
		galaxiaField = new JTextField();
		galaxiaField.setBounds(201, 90, 350, 20);
		contentPane.add(galaxiaField);
		galaxiaField.setColumns(10);
		
		menorField = new JTextField();
		menorField.setBounds(159, 112, 392, 20);
		contentPane.add(menorField);
		menorField.setColumns(10);
		
		maiorField = new JTextField();
		maiorField.setBounds(159, 133, 392, 20);
		contentPane.add(maiorField);
		maiorField.setColumns(10);
		
		quantidadeField = new JTextField();
		quantidadeField.setBounds(178, 158, 373, 20);
		contentPane.add(quantidadeField);
		quantidadeField.setColumns(10);
		
		nomesatelitesField = new JTextField();
		nomesatelitesField.setBounds(175, 183, 376, 20);
		contentPane.add(nomesatelitesField);
		nomesatelitesField.setColumns(10);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvarPlaneta();
			}
		});
		btnSalvar.setBounds(17, 227, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnProcurar = new JButton("PROCURAR");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procurarPlaneta();
			}
		});
		btnProcurar.setBounds(220, 227, 115, 23);
		contentPane.add(btnProcurar);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(462, 227, 89, 23);
		contentPane.add(btnFechar);
	}
	
	public void salvarPlaneta() {
		
		Planeta planeta = new Planeta();
		
		planeta.setNome(nomeField.getText());
		planeta.setCor(corField.getText());
		planeta.setGalaxia(galaxiaField.getText());
		planeta.setMenor_temperatura(Double.valueOf((menorField.getText())));
		planeta.setMaior_temperatura(Double.valueOf(maiorField.getText()));
		planeta.setQuantidade_satelite(Integer.valueOf(quantidadeField.getText()));
		planeta.setNome_satelite(nomesatelitesField.getText());
		array_planeta.add(planeta);
		limparCampos();
	}
	
	public void limparCampos() {
		nomeField.setText("");
		corField.setText("");
		galaxiaField.setText("");
		menorField.setText("");
		maiorField.setText("");
		quantidadeField.setText("");
		nomesatelitesField.setText("");
	}
	
	public void procurarPlaneta() {
		
		Planeta planeta = new Planeta();
		
		for(int i = 0; i < array_planeta.size(); i ++) {
			
			planeta = (Planeta)array_planeta.get(i);
			
			if(planeta.getNome().equals(nomeField.getText())) {
				nomeField.setText(planeta.getNome());
				corField.setText(planeta.getCor());
				galaxiaField.setText(planeta.getGalaxia());
				menorField.setText(String.valueOf(planeta.getMenor_temperatura()));
				maiorField.setText(String.valueOf(planeta.getMaior_temperatura()));
				quantidadeField.setText(String.valueOf(planeta.getQuantidade_satelite()));
				nomesatelitesField.setText(String.valueOf(planeta.getNome_satelite()));
				break;
			}
		}
		
	}
}
