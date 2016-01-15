import java.util.Vector;

public class Homework {
    
    public static Valuta[] contaMonete(int n) {
    	
    	Valuta[] valute = new Valuta[]{new Valuta(500), new Valuta(200), new Valuta(100), new Valuta(50), new Valuta(20), new Valuta(10), new Valuta(5), new Valuta(2), new Valuta(1)};
    	Vector ritorno = new Vector();
    	
    	for(int i = 0; i < valute.length; i++) {
    		int rep = n/valute[i].valore;
    		while(rep>0) {
    			n -= valute[i].valore;
    			rep--;
    			ritorno.add(new Valuta(valute[i].valore));
    		}
    	}
    	return null;
    }

    public static void main(String[] args) {
        contaMonete(1742);
    }
}
