package videoteca;

public abstract class Supporto {
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Supporto(String n) {
		this.nome = n;
	}
	
	public double getCosto(int days) {
		return 0;
	}
}
