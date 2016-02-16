package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class CarroArmato extends Invasore{
	
	private int missili;
	private int stazza;
	
	public void setMissili(int i) {
		this.missili = i;
	}

	public void setStazza(int i) {
		this.stazza = i;
	}

	public int potenzaFuoco() {
		double prodotto = (this.stazza * this.missili)*0.3;
		return (int)Math.round(prodotto);
	}
}
