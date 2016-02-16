package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {

	private AeroPorto aeroporto;
	
	public Gioco(AeroPorto p) {
		this.aeroporto = p;
	}

	public void attacco(Invasore[] invasoriA) {
		double dannoTot = 0;
		for(Invasore i: invasoriA) {
			dannoTot += i.potenzaFuoco();
		}
		this.aeroporto.addMetriQuadriDistrutti(dannoTot*2.5);
	}

	public boolean portoDistrutto() {
		return aeroporto.getDimensioneSqMetersNonDistrutta() <= 0;
	}

}
