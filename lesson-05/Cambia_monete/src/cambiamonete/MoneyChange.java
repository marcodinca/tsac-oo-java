package cambiamonete;

public class MoneyChange {

	private int items;
	private Money money;

	public MoneyChange() {
	}
	
	public MoneyChange(int items, Money money) {
		super();
		this.items = items;
		this.money = money;
	}
	
	public int getItems() {
		return items;
	}
	public void setItems(int items) {
		this.items = items;
	}
	
	public void setMoney(Money money) {
		this.money = money;
	}

	public int getMoneyValue() {
		return money.getValue();
	}
	
	public String getMoneyType() {
		return items == 1 ? money.getType() : money.getTypePlural();
	}
	
	
}
