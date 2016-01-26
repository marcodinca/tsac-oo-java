package harbour.game;

public class MainClass {
	public static void main(String[] args) {
		PortoNavale p = new PortoNavale("Casa di tim", 720, 15);
		Invasore[] invasori = { new Sottomarino(1, "Lumia", 4, 2),
								new Aereo(2, "Bambimbo", 3, 1),
								new Aereo(3, "Chupa Chupa a rotore", 1, 2)
				};
		Gioco g = new Gioco(p, invasori);
		int contatoreTurni = 0;
		while(g.getPortoVivo()) {
			g.attaccaPorto();
			contatoreTurni++;
		}
		System.out.println("Il Porto è stato distrutto, ci sono voluti "+contatoreTurni+" turni!");
	}
}
