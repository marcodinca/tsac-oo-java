package its.ereditarieta.animali;

public class Leone extends Carnivoro {

	// override (ridefinisco) metodo classe Carnivoro
	public String predaPreferita() {
		return "Gazzella";
	}

	// override (ridefinisco) metodo classe Animale
	public String verso() {
		return "Ruggito";
	}

}
