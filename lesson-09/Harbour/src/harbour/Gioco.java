package harbour;

public class Gioco {

	private Porto porto;

	public Gioco(Porto p) {
		this.porto = p;
	}
	
	public void attacco(Invasore invasori[]){
		for(Invasore inv: invasori){
			int potenzadifuoco = inv.potenzaFuoco(); // <---- polimorfismo (inv).
			porto.addMetriQuadriDistrutti(potenzadifuoco * 1.5);
		}
	}
	
	public boolean portoDistrutto(){
		return porto.getDimensioneSqMetersNonDistrutta() <= 0; 
	}

	
}
