package commercialista;

public class MainClass {
	public static void main(String[] args) {
		Commercialista c = new Commercialista(new Cliente[] {
				new Dipendente("Marco", "D'Incà", "complicato"),
				new Imprenditore("Francesco", "Celato", "tante cose", "iva", "Francesco Celato", 50),
				new LiberoProfessionista("Tim", "chy", "robe", "iva", 130)
		});
		
		System.out.println(c.calcolaIncasso());
	}
}
