package exceptions.easy;


class MyException extends Exception {
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}

public class Main {
	
	int x = 0;
	
	public static int g(int x) throws MyException {
		//Main m = null;
		//m.x++;
		
		if (x < 0) {
			MyException e = new MyException();
			e.setState(x);
			throw e;
		}
		return x;
			
	}
	
	public static int f(int a) throws MyException {
		
		int x =  g(a);
		return x++; // in caso di exception non viene eseguita
		
	}
	
	public static void main(String[] args) {
		
		try {
			int x = f(-2);
			System.out.println(x);  // in caso di exception non viene eseguita
			
		} catch(MyException e){
			System.out.println("x era: " + e.getState());
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace(); 
		}
		System.out.println("end of story");
	}

}
