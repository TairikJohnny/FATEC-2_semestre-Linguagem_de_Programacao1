package exercicio_Estrutura_de_Dados;

public class Produto {
	
	private int numero_produto;
	private String nome_produto;
	private Double preco;
	
	/*public Produto(int numero_produto, String nome_produto, Double preco) {
		this.numero_produto = numero_produto;
		this.nome_produto = nome_produto;
		this.preco = preco;
	}*/
	public Produto() {
		
	}
	
	public int getNumero_produto() {
		return numero_produto;
	}
	
	public void setNumero_produto(int numero_produto) {
		this.numero_produto = numero_produto;
	}
	
	public String getNome_produto() {
		return nome_produto;
	}
	
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
