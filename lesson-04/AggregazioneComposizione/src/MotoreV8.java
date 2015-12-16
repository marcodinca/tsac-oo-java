
public class MotoreV8 {

	int cilindrata;
	
	private Cilindro cilindro; // con private, da Aggregazione a Composizione
	private int numeroCilindri;
	
	MotoreV8() {
		cilindro = new Cilindro(); // creando internamente l'oggetto da Aggregazione a Composizione
		cilindro.alesaggio = 60;
		cilindro.corsa = 80;
		numeroCilindri = 8;
	}
	
	String caratteristiche() {
		StringBuffer sb = new StringBuffer();
		sb.append("Cilindrata: ");
		sb.append(cilindrata + "\n");
		
		sb.append("Cilindro: ");
		sb.append(cilindro.caratteristiche() + "\n");
		sb.append("# cilindri: ");
		sb.append(numeroCilindri + "\n");
		
		return sb.toString();
		
	}
}
