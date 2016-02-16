package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class UBoot extends Invasore{
	
	private int armiK;
	private int armiH;
	
	public void setArmaK(int i) {
		this.armiK = i;
	}

	public void setArmaH(int i) {
		this.armiH = i;
	}

	public int potenzaFuoco() {
		return (this.armiK*20)+(this.armiH*30);
	}
	
}