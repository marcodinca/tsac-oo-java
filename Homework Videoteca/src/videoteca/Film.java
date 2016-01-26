package videoteca;

public class Film {
	private String titolo;
	private String nomeRegista;
	private int annoProduzione;
	private String[] attoriPrincipali;
	private Supporto tipoFilm;
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getNomeRegista() {
		return nomeRegista;
	}
	public void setNomeRegista(String nomeRegista) {
		this.nomeRegista = nomeRegista;
	}
	public int getAnnoProduzione() {
		return annoProduzione;
	}
	public void setAnnoProduzione(int annoProduzione) {
		this.annoProduzione = annoProduzione;
	}
	public String[] getAttoriPrincipali() {
		return attoriPrincipali;
	}
	public void setAttoriPrincipali(String[] attoriPrincipali) {
		this.attoriPrincipali = attoriPrincipali;
	}
	public Supporto getTipoFilm() {
		return tipoFilm;
	}
	public void setTipoFilm(Supporto tipoFilm) {
		this.tipoFilm = tipoFilm;
	}

	public Film(String t, String n, int a, String[] aP, Supporto tF) {
		this. titolo = t;
		this.nomeRegista = n;
		this.annoProduzione = a;
		this.attoriPrincipali = aP;
		this.tipoFilm = tF;
	}
	
	public double getCostoNoleggio(int days) {
		return this.tipoFilm.getCosto(days);
	}
}
