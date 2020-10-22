package exercicio_Estrutura_de_Dados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import exercicio03.AlunoFatecSJC;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// SET
		
		//Produto produto1 = new Produto(1, "Chinelo", 10.00);
		//Produto produto2 = new Produto(2, "Tenis", 50.00);
		//Produto produto3 = new Produto(3, "Sandalia", 30.00);
		Produto produto = new Produto();
		//Produto produto1 = new Produto();
		
		produto.setNumero_produto(1);
		produto.setNome_produto("Chinelo");
		produto.setPreco(10.00);
		
		//produto1.setNumero_produto(2);
		//produto1.setNome_produto("Tenis");
		//produto1.setPreco(150.00);
		
		Set<Produto> produtoSet = new HashSet<>();
		
		produtoSet.add(produto);
		//produtoSet.add(produto1);
		//produtoSet.add(produto2);
		//produtoSet.add(produto3);
		
		for (Produto p:produtoSet) {
			System.out.println("--------- SET ---------");
			System.out.println("Numero do produto: " + produto.getNumero_produto());
			System.out.println("Nome do produto: " + produto.getNome_produto());
			System.out.println("Preco do produto: " + produto.getPreco());
			System.out.println("-----------------------");
		}	
		
		
		// MAP
		
		Carro carro = new Carro();
		Carro carro1 = new Carro();
		
		carro.setMarca("Chevrolet");
		carro.setModelo("Prisma");
		
		carro1.setMarca("Fiat");
		carro1.setModelo("Palio");
		
		Map<String, String> carroMap = new HashMap<>();
		
		carroMap.put(carro.getMarca(), carro.getModelo());
		carroMap.put(carro1.getMarca(), carro1.getModelo());
		
		System.out.println("---------- MAP -----------");
		System.out.println(new StringBuilder().append("Marca do carro: ").append(carroMap.keySet()));
		System.out.println(new StringBuilder().append("Modelo do carro: ").append(carroMap.values()));
		System.out.println("--------------------------");
		
		
		// ARRAYLIST
		
		Pessoa pessoa = new Pessoa();
		//Pessoa pessoa1 = new Pessoa();
		
		ArrayList<Pessoa> array_pessoa;
		
		array_pessoa = new ArrayList<Pessoa>();

		
		pessoa.setNome("Leonardo");
		pessoa.setIdade(20);
		pessoa.setAltura((float) 1.70);
		pessoa.setTelefone(991447823);
		
		//pessoa1.setNome("Roberto");
		//pessoa1.setIdade(45);
		//pessoa1.setAltura((float) 1.90);
		//pessoa1.setTelefone(998563214);
		
		array_pessoa.add(pessoa);
		//array_pessoa.add(pessoa1);
		
		for (Pessoa p:array_pessoa) {
			System.out.println("--------- ARRAYLIST ---------");
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Altura: " + pessoa.getAltura());
			System.out.println("Telefone: " + pessoa.getTelefone());
			System.out.println("-----------------------------");
		}	
	}

}
