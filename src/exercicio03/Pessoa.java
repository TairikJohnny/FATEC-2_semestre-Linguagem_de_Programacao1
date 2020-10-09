package exercicio03;

public class Pessoa {
	private String nome;
	private int idade;
	
	//contrutor
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//getters
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	//metodos
	public void comer() {
		System.out.println("Estou com fome, vou comer alguma coisa!!!");
	}
	
	public void caminhar() {
		System.out.println("Estou de dieta, vou caminhar um pouco!!!");
	}
	
	public void fazer() {
		System.out.println("Vou fazer os exercicios de Linguagem de Programacao 1!!!");
	}
	
}
