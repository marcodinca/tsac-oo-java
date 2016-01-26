package harbour.game;

public class Sottomarino extends Invasore {

	private int nArmamenti;
	private int peso;

	public Sottomarino(int codice, String mod, int stazza, int armi) {
		super(codice, mod);
		this.peso = stazza;
		this.nArmamenti = armi;
	}
	
	public int getPotenzaFuoco() {
		return this.nArmamenti * this.peso;
	}
}
