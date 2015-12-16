
public class Student {

	String name;
	String surname;
	
	/// get/set
	private int age;
	
	// NOTE: tutti gli attributi/fields della classe DEVONO
	// essere dichiarati private
	
	// per impostare un valore usare:
	void setAge(int age) {
		if (age <= 120)
			this.age = age;
	}
	
	// per leggere il valore
	int getAge() {
		return age;
	}
	
	//////////
	
	String bigliettoVisita() {
		StringBuffer sb = new StringBuffer();
		sb.append(name + " ");
		sb.append(surname);
		sb.append(concatenaEta());
		return sb.toString();
	}
	
	// accessibile solo dalla classe Student
	// metodo di "lavoro", usato internamente.
	private String concatenaEta() {
		return ", " + age + " years old";
	}
	
}
