
public class Valuta {
	public int valore;
	public String tipo;
	
	public Valuta(int n) {
		if(n == 1 || n == 2) {
			tipo = "Moneta";
		} else {
			tipo = "Banconota";
		}
		valore = n;
	}
}
