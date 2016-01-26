package commercialista;

public class Imprenditore extends Dipendente {
	private String pIva;
	private String ragioneSociale;
	private int nFatture;
	
	public Imprenditore(String n, String c, String cod, String iva, String rg, int fatture) {
		super(n, c, cod);
		this.pIva = iva;
		this.ragioneSociale = rg;
		this.nFatture = fatture;
	}
	
	public double calcolaParcella() {
		if(nFatture <= 100) {
			return 500;
		} else {
			return 500 + (nFatture - 100);
		}
	}

	public String getpIva() {
		return pIva;
	}

	public void setpIva(String pIva) {
		this.pIva = pIva;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getnFatture() {
		return nFatture;
	}

	public void setnFatture(int nFatture) {
		this.nFatture = nFatture;
	}
	
	
}
