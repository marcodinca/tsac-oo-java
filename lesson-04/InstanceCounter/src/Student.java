
public class Student {

	// fields
	
	String name;
	String surname;
	int[] marks;
	int age;
	
	static int instanceCounter;

	// Default constructor
	Student() {
		this(null, null); // constructor call
	}
	
	// Constructor
	Student(/*Student this,*/String n, String surname) {
		name = n;
		this.surname = surname;
		
		instanceCounter++;
	}
	
	static int instances() {
		return instanceCounter;
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
