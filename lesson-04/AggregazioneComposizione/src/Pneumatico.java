
public class Pneumatico {

	int spalla;
	int battistrada;
	
	String caratteristiche() {
		StringBuffer sb = new StringBuffer();
		sb.append("spalla: " + spalla + "\n");
		sb.append("battistrada: " + battistrada + "\n");
		return sb.toString();
	}
	
}
