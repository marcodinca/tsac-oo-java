
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
		Student[] students = new Student[] {luca, marco};
		int avgStudents = stat.average(students);
		System.out.println("Average students: " + avgStudents);
		
		
		int avgStudents2 = StatisticStatic.averageS(students);
		System.out.println("Average students: " + avgStudents2);
		
		// 6 politico
		Statistics statPoli = new Statistics();
		statPoli.minAverage = 6;
		System.out.println("Average (Poli) students: " + statPoli.average(students));
		
		// 6 politico static
		StatisticStatic.minAverage = 6;
		System.out.println("Average (Poli) students: " + StatisticStatic.averageS(students));

		// static vs non static
		Statistics stat1 = new Statistics();
		stat1.minAverage = 6;
		Statistics stat2 = new Statistics();
		stat2.minAverage = 5;
		
		StatisticStatic.minAverage = 6;
		
		StatisticStatic.minAverage = 5;
		
		System.out.println("stat1 Average (Poli) students: " 
				+ stat1.average(students));
		System.out.println("stat2 Average (Poli) students: " 
				+ stat2.average(students));
		System.out.println("Static Average (Poli) students: " 
							+ StatisticStatic.averageS(students));
	}
	
}
