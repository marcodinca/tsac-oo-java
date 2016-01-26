package cragnolini.simone.commercialista;

public class LiberoProfessionista extends Cliente {

	private String piva;
	private int numeroFatture;
	
	public LiberoProfessionista(){
	}
	
	public LiberoProfessionista(String nome, String cognome, String cf, String piva, int numeroFatture) {
		super(nome, cognome, cf);
		this.piva = piva;
		this.numeroFatture = numeroFatture;
	}
	
	//public int calcolaParcella() {
	//	return Math.round((50 + numeroFatture * 0.5f) * 1000);
	//}

	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public int getNumeroFatture() {
		return numeroFatture;
	}

	public void setNumeroFatture(int numeroFatture) {
		this.numeroFatture = numeroFatture;
	}
	
	
	
}
