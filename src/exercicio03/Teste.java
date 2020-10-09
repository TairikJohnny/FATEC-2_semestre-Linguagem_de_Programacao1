package exercicio03;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Classe Lugar
		Lugar [] a = new Lugar[5];
		
		a[0] = new Lugar("Ubatuba", "Ensolarado", "Ilha da couves");
		a[1] = new Lugar("Caraguatatuba", "Nublado", "Praia da Coconha");
		a[2] = new Lugar("Sao Sabastiao", "Chuvoso", "Centro historico de Sao Sebastiao");
		a[3] = new Lugar("Campos do Jordao", "Nublado", "Parque estadual Campos do Jordao");
		a[4] = new Lugar("Ilha Bela", "Ensolarado", "Praia do Curral");
		
		a[0].viajar();
		for (int i = 0; i < 5; i ++) {
			System.out.println("Lugar: " + i + ", nome: " + a[i].getNoleLugar() + ", clima: " + a[i].getClima() + ", ponto turistico: " + a[i].getPontosTuristicos());
		}
		a[0].passear();
		a[0].pescar();
		
		System.out.println("\n\n------------------------------------\n\n");
		
		
		
		//Classe Pessoa
		Pessoa [] b = new Pessoa[5];
		
		b[0] = new Pessoa("Joao", 14);
		b[1] = new Pessoa("Maria", 24);
		b[2] = new Pessoa("Marcos", 20);
		b[3] = new Pessoa("Ronaldo", 34);
		b[4] = new Pessoa("Roberto", 49);
		
		b[0].fazer();
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("Pessoa: " + i + ", nome: " + b[i].getNome() + ", idade: " + b[i].getIdade());
		}
		b[0].comer();
		b[0].caminhar();
		System.out.println("\n\n------------------------------------\n\n");
		
		
		//classe AlunoFatecSJC
		AlunoFatecSJC [] c = new AlunoFatecSJC[5];
		
		c[0] = new AlunoFatecSJC("Jose", "Banco de Dados", "Noturno");
		c[1] = new AlunoFatecSJC("Thiago", "ADS", "Diurno");
		c[2] = new AlunoFatecSJC("Rodrigo", "Logistica", "Diurno");
		c[3] = new AlunoFatecSJC("Ana", "Gestao da Producao Industrial", "Noturno");
		c[4] = new AlunoFatecSJC("Paulo", "Manutencao de Aeronaves", "Noturno");
		
		c[0].estudar();
		c[0].ir();
		for(int i = 0; i < 5; i ++) {
			c[i].entregar();
			
			System.out.println("Aluno: " + i + ", nome: " + c[i].getNome() + ", curso: " + c[i].getCurso() + ", periodo: " + c[i].getPeriodo());
		}
		c[0].entregar();
		System.out.println("\n\n------------------------------------\n\n");
		
		
		//classe InstrumentoMusical
		InstrumentoMusical [] d = new InstrumentoMusical[5];
		
		d[0] = new InstrumentoMusical("Violao", "Cordofone", 155.33);
		d[1] = new InstrumentoMusical("Flauta", "Aerofones", 49.99);
		d[2] = new InstrumentoMusical("Xilofone", "Idiofones", 78.99);
		d[3] = new InstrumentoMusical("Pandeiro", "Membranofones", 60.99);
		d[4] = new InstrumentoMusical("Violino eletronico", "Eletrofones", 299.99);
		
		d[0].afinar();
		d[0].tocar();
		for(int i = 0; i < 5; i ++) {
			System.out.println("Instrumento: " + i + ", nome: " + d[i].GetNome() + ", tipo: " + d[i].GetTipo() + ", valor: " + d[i].getValor());
		}
		d[0].comprar();
		System.out.println("\n\n------------------------------------\n\n");
		
		
		//classe Profissional
		Profissional [] e = new Profissional[5];
		
		e[0] = new Profissional("Professor", "Escolas", 3.999);
		e[1] = new Profissional("Arquiteto", "Contrucao de predios", 6.999);
		e[2] = new Profissional("Medico", "Hospitais", 9.999);
		e[3] = new Profissional("Bombeiro", "Perimetro urbano", 2.647);
		e[4] = new Profissional("Mecanico", "Oficinas", 2.299);
		
		e[0].entrar();
		e[0].colocar();
		for(int i = 0; i <5; i ++) {
			System.out.println("Profissional: " + i + ", profissao: " + e[i].getProfissao() + ", local de atuacao: " + e[i].getLocal_Atuacao() + ", salario: " + e[i].getSalario());
		}
		e[0].sair();
		System.out.println("\n\n------------------------------------\n\n");
		
		
		//classe Calcado
		Calcado [] f = new Calcado[5];
		
		f[0] = new Calcado("Tenis Nike", "Branco", 42);
		f[1] = new Calcado("Tenis Adidas", "Preto", 38);
		f[2] = new Calcado("Bota", "Preto", 44);
		f[3] = new Calcado("Chinelo", "Azul", 39);
		f[4] = new Calcado("Sandalia", "Verde", 36);
		
		f[0].experimentar();
		for(int i = 0; i < 5; i ++) {
			System.out.println("Calcado: " + i + ", nome: " + f[i].getNome() + ", cor: " + f[i].getCor() + ", numero: " + f[i].getNumero());
		}
		f[0].guardar();
		f[0].comprar();
		
	}

}
