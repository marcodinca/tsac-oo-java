package cambiamonete;

public abstract class MoneyChangeAlgorithm {

	public static MoneyChange[] change(int value){
		Money[] money = //TODO new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1}; //valuta utilizzabile
				
		int[] ripetitions = new int[money.length]; //array che contiene la quantità di banconote da utilizzare
		
		for (int i = 0; i < money.length; i++) {
			int rep = value / money[i]; 
			
			if (rep > 0) {
				value -= money[i] * rep;
				ripetitions[i] = rep;
			}
		}
		return ripetitions;
	}
}