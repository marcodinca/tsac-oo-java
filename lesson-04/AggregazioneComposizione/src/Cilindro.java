
public class Cilindro {

	int alesaggio;
	int corsa;
	
	String caratteristiche() {
		StringBuffer sb = new StringBuffer();
		sb.append("alesaggio: " + alesaggio + "\n");
		sb.append("corsa: " + corsa + "\n");
		return sb.toString();
	}
}
