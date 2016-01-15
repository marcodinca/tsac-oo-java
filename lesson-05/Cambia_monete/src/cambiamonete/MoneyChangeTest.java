package cambiamonete;

public class MoneyChangeTest {

	public static void main(String[] args) {
		
		MoneyChange mc =new MoneyChange();
		mc.setItems(5);
		mc.setMoney(new Money(500, "banconota", "banconote"));
		System.out.println(mc.getItems());
		System.out.println(mc.getMoneyValue());
		System.out.println(mc.getMoneyType());
		
		MoneyChange mcSingolare =new MoneyChange();
		mcSingolare.setItems(1);
		mcSingolare.setMoney(new Money(500, "banconota", "banconote"));
		System.out.println(mcSingolare.getItems());
		System.out.println(mcSingolare.getMoneyValue());
		System.out.println(mcSingolare.getMoneyType());
		
		
		//System.out.println(mc.getMoney().getValue());
		//System.out.println(mc.getMoney().getType());
		//System.out.println(mc.getMoney().getTypePlural());
	}
	
}
