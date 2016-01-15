package cambiamonete;

public class MoneyChangeAlgorithm {

	public static MoneyChange[] change(int value){
		String banconota = "banconota";
		String banconotaPlurale = "banconote";
		String moneta = "moneta";
		String monetaPlurale = "monete";
		
		Money[] money = new Money[]{
				new Money(500, banconota, banconotaPlurale),
				new Money(200, banconota, banconotaPlurale),
				new Money(100, banconota, banconotaPlurale),
				new Money(50, banconota, banconotaPlurale),
				new Money(20, banconota, banconotaPlurale),
				new Money(10, banconota, banconotaPlurale),
				new Money(5, banconota, banconotaPlurale),
				new Money(2, moneta, monetaPlurale),
				new Money(1, moneta, monetaPlurale)
			};
				
		
		MoneyChange[] moneyChanges = new MoneyChange[money.length];
		// fill moneyChanges defaults
		for(int i = 0; i < money.length; ++i) {
			moneyChanges[i] = new MoneyChange(0, money[i]);
		}
		
		
		// fill moneyChanges
		int zeros = 0;
		for (int i = 0; i < money.length; i++) {
			int rep = value / money[i].getValue(); 
			
			if (rep > 0) {
				value -= money[i].getValue() * rep;
				moneyChanges[i].setItems(rep);
			} else {
				zeros++;
			}
		}
		
		// remove 0-items
		MoneyChange[] moneyChangesResult = new MoneyChange[money.length - zeros];
		// TODO: fix if zeros == money.length
		int index = 0;
		for(MoneyChange mc: moneyChanges) {
			if (mc.getItems() > 0) {
				moneyChangesResult[index] = mc;
				index++;
			}
		}
		
		
		return moneyChangesResult;
	}
}