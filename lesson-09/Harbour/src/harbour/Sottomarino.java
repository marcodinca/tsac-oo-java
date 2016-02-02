package harbour;

public class Sottomarino extends Invasore {
	
	private int nArmamenti;
	private int stazza;

	@Override
	public int potenzaFuoco(){
		return nArmamenti * stazza;
	}


	public int getnArmamenti() {
		return nArmamenti;
	}


	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}


	public int getStazza() {
		return stazza;
	}


	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	

	
}
