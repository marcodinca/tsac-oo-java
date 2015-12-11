
public class FlowControl {

	public static void main(String[] args) {
		
		// if
		int i1 = 5;
		int i2 = 3;
		if (i1 == i2) {
			System.out.println("i1 == i2");
		} else {
			System.out.println("i1 != i2");
		}
		
		// switch
		switch(i1) {
			case 1:
				System.out.println("i1 è 1");
				break;
			case 5:
				System.out.println("i1 è 5");
				break;
			default:
				System.out.println("i1 != 1 e != 5");
				
		}
		
		// while
		while (i1 < 10) {
			System.out.println("i1 = " + i1);
			i1++;
		}
		
		// while/do while
		int i = 0;
		while (i < 10) {
			System.out.println("i= " + i);
			i++;
		}
		i = 0;
		do {
			System.out.println("i= " + i);
			i++;
		} while (i < 10);
		
		int j = 20;
		while (j < 10) {
			System.out.println("while: j= " + j);
			j++;
		}
		j = 20;
		do {
			System.out.println("do while: j= " + j);
			j++;
		} while (j < 10);
		
		// for
		for(int index = 0; index < 10; index++) {
			System.out.println("for: index= " + index);
		}
		
		
	}
	
}
