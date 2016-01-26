package cragnolini.simone.commercialista;

public class Imprenditore extends Cliente implements CalcoloParcella {

	private String piva;
	private String ragioneSociale;
	private int numeroFatture;
	
	public Imprenditore(){
		
	}
	
	public Imprenditore(String nome, String cognome, String cf, String piva, String ragioneSociale, int numeroFatture) {
		super(nome, cognome, cf);
		this.piva = piva;
		this.ragioneSociale = ragioneSociale;
		this.numeroFatture = numeroFatture;
	}
	
	@Override
	public int calcolaParcella() {
		if(numeroFatture <= 100) {
			return 500 * 1000;
		} else {
			return (500 + numeroFatture * 1) * 1000;
		}
	}

	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getNumeroFatture() {
		return numeroFatture;
	}

	public void setNumeroFatture(int numeroFatture) {
		this.numeroFatture = numeroFatture;
	}
	
	
	
}
