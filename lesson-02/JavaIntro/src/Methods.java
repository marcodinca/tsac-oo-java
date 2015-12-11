
public class Methods {
	
	static int sumAll(int[] myarray) {
		int sum = 0;
		for(int x : myarray) {
			sum += x;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		int[] arrays = new int[]{1,4,6,3};
		int res = sumAll(arrays);
		System.out.println(res);
	}

}
