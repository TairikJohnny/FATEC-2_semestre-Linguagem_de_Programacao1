package exercicio03;

public class Calcado {
	
	private String nome;
	private String cor;
	private int numero;
	
	
	//construtor
	public Calcado(String nome, String cor, int numero) {
		this.nome = nome;
		this.cor = cor;
		this.numero = numero;
	}
	
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	//getters
	public String getNome() {
		return nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public int getNumero() {
		return numero;
	}
	
	
	//metodos
	public void experimentar() {
		System.out.println("Experimentando o calcado!!!");
	}
	
	public void guardar() {
		System.out.println("Guardando o calcado!!!");
	}
	
	public void comprar() {
		System.out.println("Vou comprar o calcado!!!");
	}

}
