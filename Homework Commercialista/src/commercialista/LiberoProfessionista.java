package commercialista;

public class LiberoProfessionista extends Dipendente{

	private String pIva;
	private int nFatture;
	
	public LiberoProfessionista(String n, String c, String cod, String iva, int fatture) {
		super(n, c, cod);
		this.pIva = iva;
		this.nFatture = fatture;
	}
	
	public double calcolaParcella() {
		return 50 + (nFatture * 0.5);
	}

	public String getpIva() {
		return pIva;
	}

	public void setpIva(String pIva) {
		this.pIva = pIva;
	}

	public int getnFatture() {
		return nFatture;
	}

	public void setnFatture(int nFatture) {
		this.nFatture = nFatture;
	}
	
	
}
