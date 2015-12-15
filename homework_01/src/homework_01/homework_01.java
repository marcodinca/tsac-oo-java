package homework_01;

public class homework_01 {
	
	private static int[] splice(int[] array) {
		int[] result = new int[array.length-1];
		for(int i=0;i<result.length;i++) {
			result[i] = array[i+1];
		}
		return result;
	}
	
	public static int ex_1_I(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum;
	}
	public static int ex_1_R(int[] array) {
		if(array.length==0) {
			return 0;
		} else {
			return array[0]+ex_1_R(splice(array));
		}
	}
	
	public static int ex_2_I(int n) {
		int sum=0;
		int index = 1;
		for(int i=0;i<n;i++) {
			sum += index;
			index+=2;
		}
		return sum;
	}
	public static int ricorsioneEx2(int n,int index) {
		if(n==0)
			return 0;
		else
			return index+ricorsioneEx2(n-1,index+2);
	}
	public static int ex_2_R(int n) {
		return ricorsioneEx2(n,1);
	}
	
	public static int ex_3_I(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		return sum/array.length;
	}
	/*public static int ex_3_inner(int[] array) {
		if(array.length == 0) {
			return 0;
		} else {
			return array[0]+ex_3_inner(splice(array));
		}
	}*/
	public static int ex_3_R(int[] array) {
		if(array.length==0) {
			return 0;
		} else if(array.length==10) {
			return array[0]+ex_3_R(splice(array))/10;
		} else {
			return array[0]+ex_3_R(splice(array));
		}
		//return ex_3_inner(array)/10;
	}
	
	public static int ex_4_I(int a, int b) {
		if(b<a) {
			int sup = a;
			a = b;
			b = sup;
		}
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		return sum;
	}
	public static int ex_4_R(int a,int b) {
		if(b<a) {
			int sup = a;
			a = b;
			b = sup;
		}
		if(a==b) {
			return a;
		} else {
			return a+ex_4_R(a+1,b);
		}
	}
	
	public static void main(String[] args) {
	}
}
