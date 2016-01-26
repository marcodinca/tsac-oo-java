package videoteca;

public class Cassetta extends Supporto {
	public Cassetta() {
		super("Cassetta");
	}
	
	public double getCosto(int days) {
		return 1+((days-1)*2);
	}
}
