
public class Arrays {
	
	public static void main(String[] args) {
		
		System.out.println("Arrays");
		
		// 1. i dati devono essere dello stesso tipo
		// 2. la dimensione dell'array deve essere indicata a priori ad è fissa
		//    per tutta la vita di quell'array
		
		int[] ia = new int[10]; // crea un array di 10 elementi, indici da 0 a 10
		System.out.println(ia[0]);
		
		boolean[] ba = new boolean[10]; // crea un array di 10 elementi, indici da 0 a 10
		System.out.println(ba[0]);
		
		char[] ca = new char[10]; // crea un array di 10 elementi, indici da 0 a 10
		System.out.println("[" + ca[0] + "]");
		int mya = ca[0];
		System.out.println(mya);
		
		ia[0] = 10;
		ia[1] = 20;
		// ia[2] = 1.2; compile error: cannot convert double to int
		
		//ia[10] = 4; // RUNTIME error: index out of bound
		
		System.out.println("for loop");
		for(int i = 0; i < ia.length; i++) {
			ia[i] = i;
		}
		
		for(int i = 0; i < ia.length; i++) {
			System.out.println("[" + ia[i] + "]");
		}
		
		// for each
		System.out.println("for insert");
		double[] darray = new double[10];
		for(int i = 0; i < darray.length; i++) {
			darray[i] = i * 2;
		}
		
		System.out.println("for each");
		for(double d : darray) {
			System.out.println(d);
		}
		
		// init arrays
		int[] initArray = new int[5];
		initArray[0] = 5;
		//
		
		int [] initArrayDirectly = new int[] { 1,4,8,9,5 };
		System.out.println(initArrayDirectly[2]);
		
		
		
	}

}
