package exercicio03;

public class Lugar {
	private String nome_lugar;
	private String clima;
	private String pontos_turisticos;
	
	//contrutor
	public Lugar(String nome_lugar, String clima, String pontos_turisticos) {
		this.nome_lugar = nome_lugar;
		this.clima = clima;
		this.pontos_turisticos = pontos_turisticos;
	}
	
	//setters
	public void setNomeLugar(String nome_lugar) {
		this.nome_lugar = nome_lugar;
	}
	
	public void setClima(String clima) {
		this.clima = clima;
	}
	
	public void SetPontosTuristicos(String pontos_turisticos) {
		this.pontos_turisticos = pontos_turisticos;
	}
	
	//getters
	public String getNoleLugar() {
		return nome_lugar;
	}
	
	public String getClima() {
		return clima;
	}
	
	public String getPontosTuristicos() {
		return pontos_turisticos;
	}
	

	//metodos
	public void viajar() {
		System.out.println("Estamos viajando!!!");
	}
	
	public void pescar() {
		System.out.println("Estamos pescando!!!");
	}
	
	public void passear() {
		System.out.println("Estamos passeando!!!");
	}
}
