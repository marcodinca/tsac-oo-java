
public class Student {

	// fields
	
	String name;
	String surname;
	int[] marks;
	int age;
	
	// Constructor
	Student(/*Student this,*/String n, String surname) {
		name = n;
		this.surname = surname;
	}
	
	// Default constructor
	Student() {
	}
	

	// methods
	
	int average() {
		// marks
		float sum = 0; // Math.round return int when param is float.
		for(int x: marks) {
			sum += x;
		}
		
		// integer division
		float avg = sum / marks.length;
		return Math.round(avg);
	}
	
}
