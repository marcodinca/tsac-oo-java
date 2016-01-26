package commercialista;

public class Commercialista {
	private Dipendente[] clienti;
	
	public Commercialista(Dipendente[] clienti) {
		this.clienti = clienti;
	}
	
	public double calcolaIncasso() {
		double incasso = 0;
		for(Dipendente d: this.clienti) {
			incasso += d.calcolaParcella();
		}
		return incasso;
	}
}
