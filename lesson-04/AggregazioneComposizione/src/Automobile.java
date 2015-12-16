
public class Automobile {

	String marca;
	String modello;
	
	Motore motore; // Aggregazione
	Pneumatico[] pneumatici; //4 // Aggregazione
	
	String caratteristiche() {
		String s = " Marca: " + marca + "\n";
		s += " Modello: " + modello + "\n";
		
		s += "Motore: \n";
		s += motore.caratteristiche();
		
		s += "Pneumatici: \n";
		for(Pneumatico p: pneumatici) {
			s += p.caratteristiche(); // Associazione
		}
		return s;
	}
}
