
public class Test {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student("N", "C");
		Student s3 = new Student();
		Student s4 = new Student();
	
		int studentsInstances = Student.instances();
		System.out.println("students instances: " + studentsInstances);
		
	}

}
