package cragnolini.simone.commercialista;

public abstract class Cliente extends Persona {
	
	
	private String cf;
	
	public Cliente(String nome, String cognome, String cf) {
		super(nome, cognome);
		this.cf = cf;
	}
	
	public Cliente(){
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	// l'implementazione del metodo calcolaParcella
	// è funzionale per l'uso come classe base per le implementazioni
	// dipendente, libero prof..
	/*
	public int calcolaParcella() {
		return 0; // bho!? 
	}
	*/
	
	// (ABSTRACT)
	// il metodo è astratto === dichiaro il metodo ma non
	// lo implementato (definisco)
	// nota: se una classe contiene un metodo astratto => 
	// la classe deve essere definita come astratta
	//public abstract int calcolaParcella();
}
