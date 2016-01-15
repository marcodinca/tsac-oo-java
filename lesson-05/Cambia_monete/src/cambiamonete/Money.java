package cambiamonete;

public class Money {
	private int value;
	private String type;
	private String typePlural;
	
	public Money() {
	}
	
	public Money(int value, String type, String typePlural) {
		this.value = value;
		this.type = type;
		this.typePlural = typePlural;
	}

	public String getTypePlural() {
		return typePlural;
	}

	public void setTypePlural(String typePlural) {
		this.typePlural = typePlural;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}



