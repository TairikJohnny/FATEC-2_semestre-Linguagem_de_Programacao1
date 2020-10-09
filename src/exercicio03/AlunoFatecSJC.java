package exercicio03;

public class AlunoFatecSJC {
	private String nome;
	private String curso;
	private String periodo;
	
	//contrutor
	public AlunoFatecSJC(String nome, String curso, String periodo) {
		this.nome = nome;
		this.curso = curso;
		this.periodo = periodo;
	}
	
	public AlunoFatecSJC() {
		
	}
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	
	//getters
	public String getNome() {
		return nome;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	
	
	//metodos
	public void estudar() {
		System.out.println("Esta na hora de estudar Java");
	}
	
	public void ir() {
		System.out.println("As aulas presenciais retornaram, estou indo para a FATEC");
	}
	
	public void entregar() {
		System.out.println("Acabei de entregar as tarefas de Linguagem de Programacao 1");
	}
}
