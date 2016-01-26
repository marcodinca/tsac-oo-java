package commercialista;

public class Cliente {
	private String nome;
	private String cognome;
	private String CF;
	
	public Cliente(String n, String c, String cod) {
		this.nome = n;
		this.cognome = c;
		this.CF = cod;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCF() {
		return CF;
	}
	public void setCF(String cF) {
		CF = cF;
	}
	
	public double calcolaParcella() {
		return 0;
	}
}
