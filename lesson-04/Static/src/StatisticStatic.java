
public class StatisticStatic {
	
	static int minAverage; // example: 6 politico

	// static method
	// metodi della classe (class methods)
	static int averageS(Student[] students) {
		float tot = 0;
		for(Student s: students) {
			tot += s.average(); // association
		}
		int avg = Math.round(tot / students.length);
		avg = Math.max(minAverage, avg);
		return avg;
	}
}
