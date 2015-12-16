
public class Test {

	public static void main(String[] args) {
		Student giacomo = new Student();
		giacomo.name = "Giacomo";
		giacomo.surname = "Zan";
		giacomo.setAge(28);
		
		System.out.println(giacomo.bigliettoVisita());
		
		giacomo.setAge(150);
		System.out.println(giacomo.bigliettoVisita());

		//giacomo.age = 280; // non accessibile!!!!
		giacomo.setAge(280);
		System.out.println(giacomo.bigliettoVisita());
		
		// get/set
		
	}

}
