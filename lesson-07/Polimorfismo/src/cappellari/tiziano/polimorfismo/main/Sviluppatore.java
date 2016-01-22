package cappellari.tiziano.polimorfismo.main;

public class Sviluppatore extends Dipendente {

	private String[] linguaggiConosciuti;
	
	public int calcolaStipendio() {
		return 1000;
	}

	public String[] getLinguaggiConosciuti() {
		return linguaggiConosciuti;
	}

	public void setLinguaggiConosciuti(String[] linguaggiConosciuti) {
		this.linguaggiConosciuti = linguaggiConosciuti;
	}
	
}
