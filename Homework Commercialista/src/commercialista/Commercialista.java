package commercialista;

public class Commercialista {
	private Cliente[] clienti;
	
	public Commercialista(Cliente[] clienti) {
		this.clienti = clienti;
	}
	
	public double calcolaIncasso() {
		double incasso = 0;
		for(Cliente d: this.clienti) {
			incasso += d.calcolaParcella();
		}
		return incasso;
	}
}
