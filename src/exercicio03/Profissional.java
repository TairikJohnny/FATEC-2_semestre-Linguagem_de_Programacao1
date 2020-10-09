package exercicio03;

public class Profissional {
	private String profissao;
	private String local_atuacao;
	private Double salario;
	
	//construtor
	public Profissional(String profissao, String local_atuacao, Double salario) {
		this.profissao = profissao;
		this.local_atuacao = local_atuacao;
		this.salario = salario;
	}
	
	
	//setters
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public void setLocal_Atuacao(String local_atuacao) {
		this.local_atuacao = local_atuacao;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	//getters
	public String getProfissao() {
		return profissao;
	}
	
	public String getLocal_Atuacao() {
		return local_atuacao;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	
	//metodos
	public void entrar() {
		System.out.println("Entrando no trabalho!!!");
	}
	
	public void colocar() {
		System.out.println("Colocando EPI!!!");
	}
	
	public void sair() {
		System.out.println("Saindo do servico!!!");
	}
}
