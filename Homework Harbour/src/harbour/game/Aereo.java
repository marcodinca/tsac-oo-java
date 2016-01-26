package harbour.game;

public class Aereo extends Invasore{

	private int nArmamentiAlpha;
	private int nArmamentiBeta;

	public Aereo(int codice, String mod, int alpha, int beta) {
		super(codice, mod);
		this.nArmamentiAlpha = alpha;
		this.nArmamentiBeta = beta;
	}
	
	public int getPotenzaFuoco() {
		return this.nArmamentiAlpha * 10 + nArmamentiBeta * 25;
	}

}
