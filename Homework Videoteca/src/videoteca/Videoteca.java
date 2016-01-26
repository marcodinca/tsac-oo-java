package videoteca;
public class Videoteca {
	private Film[] collezione;
	private int incasso;
		
	public Film[] getCollezione() {
		return collezione;
	}
	public void setCollezione(Film[] collezione) {
		this.collezione = collezione;
	}
	public int getIncasso() {
		return incasso;
	}
	public void setIncasso(int incasso) {
		this.incasso = incasso;
	}
	
	
	public Videoteca(Film[] c) {
		this.collezione = c;
	}
	public void noleggiaFilm(String titolo, int days) {
		boolean trovato = false;
		for(Film f: collezione) {
			if(f.getTitolo() == titolo) {
				System.out.println(titolo+" disponibile, costo: "+f.getCostoNoleggio(days)+"€ per "+days+" giorni.");
				this.incasso += f.getCostoNoleggio(days);
				trovato = true;
			}
		}
		if(!trovato) {
			System.out.println(titolo+" non disponibile");
		}
	}
}
