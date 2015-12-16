
public class Motore {
	
	int cilindrata;
	
	Cilindro cilindro; // Aggregazione
	int numeroCilindri;
	
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
