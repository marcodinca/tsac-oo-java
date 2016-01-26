package harbour.game;

public class Invasore {
	private int cod;
	private String modello;
	
	public Invasore(int codice, String mod) {
		this.cod = codice;
		this.modello = mod;
	}
	
	public int getPotenzaFuoco() {
		return 0;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}	
}
