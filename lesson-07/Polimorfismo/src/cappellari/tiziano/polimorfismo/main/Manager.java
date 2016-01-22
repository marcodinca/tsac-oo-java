package cappellari.tiziano.polimorfismo.main;

public class Manager extends Dipendente {
	
	private int bonus;
	
	private Progetto[] progetti;
	
	public int calcolaStipendio() {
		//int pb = pagaBase; // ERRORE
		// pagaBase è definito private all'interno della classe Dipendente
		// OVVERO pagaBase è acccessibile unicamente dei metodi
		// definiti all'interno della classe Dipendente.
		// QUINDI NON accessibili dall'esterno.
		// NOTA: l'oggetto manager (istanza della classe Manager)
		// contiene l'attributo pagaBase con il suo relativo valore
		// ma NON può accedervi da metodi di classi diverse di Dipendente.
			
		// getPagaBase();
		// equivale a this.getPagaBase();
		// this è un oggetto di tipo Manager
		// getPagaBase è public, quindi accessibile da classi diverse da
		// dove è stato definito
		
		return Math.round(bonus + 	//bonus accessibile come attributo
						  getPagaBase() +  // definito classe Dipendente
						  getPagaBase() * getAnzianita() * 2 / 100.0f);
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Progetto[] getProgetti() {
		return progetti;
	}

	public void setProgetti(Progetto[] progetti) {
		this.progetti = progetti;
	}
	
	

}
