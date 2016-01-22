package cappellari.tiziano.polimorfismo.main;

public class Segretario extends Dipendente {

	private int oreufficio;

	public int getOreufficio() {
		return oreufficio;
	}

	public void setOreufficio(int oreufficio) {
		this.oreufficio = oreufficio;
	}



	public int calcolaStipendio() {
		return Math.round(super.calcolaStipendio() * 0.8f);		
	}
	
}
