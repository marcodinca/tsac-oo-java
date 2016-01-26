package harbour.game;

public class Gioco {
	
	private PortoNavale p;
	private Invasore[] invasori;
	
	public Gioco(PortoNavale porto, Invasore[] i) {
		this.p = porto;
		this.invasori = i;
	}
	
	public void attaccaPorto() {
		for(Invasore i: this.invasori) {
			this.p.setDanno( i.getPotenzaFuoco()*1.5 );
		}
	}

	public boolean getPortoVivo() {
		return p.isAlive();
	}
}
