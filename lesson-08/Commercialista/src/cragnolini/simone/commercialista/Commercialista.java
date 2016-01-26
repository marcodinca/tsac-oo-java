package cragnolini.simone.commercialista;

public class Commercialista {

	private Cliente[] clienti;

	public Cliente[] getClienti() {
		return clienti;
	}

	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}


	public int totaleIncasso() {

		int incasso = 0;
		
		for(Cliente c:clienti) {
			
			if (c instanceof CalcoloParcella) {
				CalcoloParcella calc = (CalcoloParcella)c;
				incasso += calc.calcolaParcella();
			}
		}
		
		return incasso;
		
	}

}
