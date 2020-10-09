package exercicio03;

public class Planeta {
	
	private String nome;
	private String cor;
	private String galaxia;
	private double menor_temperatura;
	private double maior_temperatura;
	private int quantidade_satelite;
	private String nome_satelite;
	
	
	public Planeta(String nome, String cor, String galaxia, double menor_temperatura, double maior_temperatura,
			int quantidade_satelite, String nome_satelite) {
		this.nome = nome;
		this.cor = cor;
		this.galaxia = galaxia;
		this.menor_temperatura = menor_temperatura;
		this.maior_temperatura = maior_temperatura;
		this.quantidade_satelite = quantidade_satelite;
		this.nome_satelite = nome_satelite;
	}
	
	public Planeta() {
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getGalaxia() {
		return galaxia;
	}
	
	public void setGalaxia(String galaxia) {
		this.galaxia = galaxia;
	}
	
	public double getMenor_temperatura() {
		return menor_temperatura;
	}
	
	public void setMenor_temperatura(double menor_temperatura) {
		this.menor_temperatura = menor_temperatura;
	}
	
	public double getMaior_temperatura() {
		return maior_temperatura;
	}
	
	public void setMaior_temperatura(double maior_temperatura) {
		this.maior_temperatura = maior_temperatura;
	}
	
	public int getQuantidade_satelite() {
		return quantidade_satelite;
	}
	
	public void setQuantidade_satelite(int quantidade_satelite) {
		this.quantidade_satelite = quantidade_satelite;
	}
	
	public String getNome_satelite() {
		return nome_satelite;
	}
	
	public void setNome_satelite(String nome_satelite) {
		this.nome_satelite = nome_satelite;
	}
}
