package cambiamonete;



public class Test {

	public static void main(String[] args) {
		int value = 1252;
		
		MoneyChange[] moneyChanges = MoneyChangeAlgorithm.change(value);
		for(MoneyChange mc: moneyChanges) {
			
			System.out.println(mc.getItems() 
								+ " " + mc.getMoneyType() 
								+ " da " +
								mc.getMoneyValue() + " euro");
			
		}
		
	}

}
