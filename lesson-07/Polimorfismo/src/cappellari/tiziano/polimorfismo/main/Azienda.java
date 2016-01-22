package cappellari.tiziano.polimorfismo.main;

public class Azienda {
	
	private String ragioneSociale;
	
	/* DREAM */
	private Dipendente[] dipendenti;
	public Dipendente[] getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}
	/* END DREAM */
	
	// AMARA REALTA'
	private Manager[] managers;
	private Sviluppatore[] sviluppatori;

	public Manager[] getManagers() {
		return managers;
	}

	public void setManagers(Manager[] managers) {
		this.managers = managers;
	}

	public Sviluppatore[] getSviluppatori() {
		return sviluppatori;
	}

	public void setSviluppatori(Sviluppatore[] sviluppatori) {
		this.sviluppatori = sviluppatori;
	}
	
	// END AMARA REALTA'

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	
	// DREAM
	
	public int totaleStipendiPolimorfismo() {
		// DREAM ===> ho array Dipendenti, non array Sviluppatori/Manager/Segretari
		
		int tot = 0;
		for(Dipendente d: dipendenti) {
			
			// AAAH!!! ma d è un Dipendente?
			// Niente bonus, ecc. ecc. 
			
			// NO, tranquilli.
			// la variabile d è di tipo Dipendente, ma l'oggetto
			// a cui si riferisce è (Sviluppatore, Segretario...)
			// l'oggetto è definito durante la chiamata new NomeClasse.
			// possiamo dire che d è di 2 tipi.
			// - compile time: Dipendente
			// - run time: es. Sviluppatore (new Sviluppatore)
			
			// il metodo chiamato è definito mediante dynamic binding (o late binding)
			// ed è quello dell'oggetto definito a run-time.
			
			tot += d.calcolaStipendio();
		}
		return tot;
	}
	
	// AMARA REALTA' <= c'è il polimorfismo, tranquilli ;)
	public int totaleStipendi() {
		
		int tot = 0;
		for(Manager m: managers) {
			tot += m.calcolaStipendio();
		}
		for(Sviluppatore s: sviluppatori) {
			tot += s.calcolaStipendio();
		}
		
		// e il segretario??
		return tot;
		
	}

}
