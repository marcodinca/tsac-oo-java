
public class Test {

	
	public static void main(String[] args) {
		
		// creo auto
		Automobile fordFocus = new Automobile();
		fordFocus.marca = "FORD";
		fordFocus.modello = "Focus";
		
		// creo motore
		Motore ecoBoost = new Motore();
		ecoBoost.cilindrata = 2300;
		
		// creo cilindro
		Cilindro cilindro = new Cilindro();
		cilindro.alesaggio = 88;
		cilindro.corsa = 94;
		
		// assegno cilindro a motore
		ecoBoost.cilindro = cilindro;
		ecoBoost.numeroCilindri = 4;
		
		// assegno motore ad auto
		fordFocus.motore = ecoBoost;
		
		// creo pneumatici frontali
		Pneumatico pfl = new Pneumatico();
		pfl.battistrada = 235;
		pfl.spalla = 35;
		
		Pneumatico pfr = new Pneumatico();
		pfr.battistrada = 235;
		pfr.spalla = 35;

		// creo pneumatici posteriori
		Pneumatico prl = new Pneumatico();
		prl.battistrada = 236;
		prl.spalla = 38;
		
		Pneumatico prr = new Pneumatico();
		prr.battistrada = 236;
		prr.spalla = 38;
		
		// creo set di pneumatici
		Pneumatico[] pneumatici = new Pneumatico[] { pfl, pfr, prl, prr};
		
		// assegno pneumatici a auto
		fordFocus.pneumatici = pneumatici;
		
		System.out.println(fordFocus.caratteristiche());
		
		// Motore v8 (composizione)
		MotoreV8 mv8 = new MotoreV8();
		mv8.cilindrata = 2000;
		
		System.out.println(mv8.caratteristiche());
		
		// MotoreV8 e Motore
		// MotoreV8 ha il cilindro privato 
		//mv8.cilindro = new Cilindro(); // voglio evitare questo!
		
		
		
	}
}
