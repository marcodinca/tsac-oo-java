
public class Main {

	public static void main(String[] args) {
		
		Student luca = new Student();
		
		// operatore dot .
		luca.name = "Luca";
		luca.surname = "Rossi";
		
		int age = 23;
		luca.age = age;
		
		luca.marks = new int[] {3,2,4,1};
		
		System.out.println("Luca marks:" + luca.marks[2]);
		
		Student marco = new Student();
		marco.name = "Marco";
		marco.surname = "Bianchi";
		marco.age = 33;
		marco.marks = new int[] {7,2,8,7};
		
		System.out.println("Marco marks:" + marco.marks[2]);
		
		int lucaMarks = luca.average();
		System.out.println("Luca marks avg: " + lucaMarks);
		
		int marcoMarks = marco.average();
		System.out.println("Marco marks avg: " + marcoMarks);
		
		// Constructor
		
		Student giacomo = new Student("Giacomo", "Viola");
		System.out.println(giacomo.name + " surname: " + giacomo.surname);
		
		// Association example
		
		Statistics stat = new Statistics();
		int avgStudents = stat.average(new Student[] {luca, marco});
		System.out.println("Average students: " + avgStudents);

	}
	
}
