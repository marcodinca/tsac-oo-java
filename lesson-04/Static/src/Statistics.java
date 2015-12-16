
public class Statistics {
	
	int minAverage; // example: 6 politico

	// method candidato per essere dichiarato static (vedi metodo averageS)
	int average(Student[] students) {
		float tot = 0;
		for(Student s: students) {
			tot += s.average(); // association
		}
		int avg = Math.round(tot / students.length);
		avg = Math.max(minAverage, avg);
		
		return avg;
	}
	
}
