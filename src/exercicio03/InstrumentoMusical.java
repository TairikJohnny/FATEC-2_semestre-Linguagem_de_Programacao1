package exercicio03;

public class InstrumentoMusical {
	private String nome;
	private String tipo;
	private Double valor;
	
	
	//construtor
	public InstrumentoMusical(String nome, String tipo, Double valor) {
		this.nome = nome;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	
	//setters
	public void SetNome(String nome) {
		this.nome = nome;
	}
	
	public void SetTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void SetValor(Double valor) {
		this.valor = valor;
	}
	
	
	//getter
	public String GetNome() {
		return nome;
	}
	
	public String GetTipo() {
		return tipo;
	}
	
	public Double getValor() {
		return valor;
	}
	
	
	//metodos
	public void tocar() {
		System.out.println("Tocando instrumento!!!");
	}
	
	public void afinar() {
		System.out.println("Afinando instrumento!!!");
	}
	
	public void comprar() {
		System.out.println("Vamos comprar!!!");
	}

}
