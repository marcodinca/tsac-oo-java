package videoteca;

public class BluRay extends Supporto{
	public BluRay() {
		super("BluRay");
	}
	
	public double getCosto(int days) {
		if(days == 1) {
			return 1;
		} else {
			double costo = 0;
			for(int i = 0; i < days; i++) {
				costo += 1 + 1 * (i*0.1);
			}
			return costo;
		}
	}
}
