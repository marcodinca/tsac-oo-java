package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class PressureSensorMain {
	public static void main(String args[]) {
		
		ArrayList<Double> results = new ArrayList();
		ArrayList<Integer> exceptions = new ArrayList();
		
		PressureSensor ps = new PressureSensor();
		PressureSensorListener psl = new PressureSensorListener() {
			@Override
			public void onSuccess(double pressure) {
				results.add(new Double(pressure));
			}

			@Override
			public void onFailed(PressureSensorException exception) {
				exceptions.add(exception.getErrorcode());
			}
		};
		ps.setListener(psl);
		
		for(int i = 0; i < 1000; i++) {
			ps.next();
		}
		
		double max = 0;
		double somma = 0;
		for(int i = 0; i < results.size(); i++) {
			double value = results.get(i).doubleValue();
			somma += value;
			if(value > max) {
				max = value;
			}
		}
		
		System.out.println("Max: "+ max);
		System.out.println("Media: "+ (somma / results.size()));
		
		int[] exceptionList = new int[10];
		System.out.println("Error codes: ");
		for(int i=0; i<exceptions.size(); i++) {
			exceptionList[Math.abs(exceptions.get(i).intValue())]++;
		}
		for(int i=0; i<exceptionList.length; i++) {
			System.out.println(">Error code -"+i);
			System.out.println(exceptionList[i]);
		}
		
	}
}
