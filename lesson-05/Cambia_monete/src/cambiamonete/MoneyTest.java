package cambiamonete;

public class MoneyTest {
	
	private static void print() {
		Money m200 = new Money(200, "banconota", "banconote");
		System.out.println(m200.getValue());
		
	}
	
	public static void main(String[] args) {
		print();
		
		Money m500 = new Money(500, "banconota", "banconote");
		System.out.println(m500.getValue());
		
		
	}

}
