package commercialista;
public class Dipendente extends Cliente{

	public Dipendente(String n, String c, String cod) {
		super(n, c, cod);
	}
	
	public double calcolaParcella() {
		return 50;
	}
}
