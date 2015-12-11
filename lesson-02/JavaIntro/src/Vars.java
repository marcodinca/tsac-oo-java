
public class Vars {

	public static void main(String[] args) {
		System.out.println("Start Vars");
		
		// TIPI PRIMITIVI
		
		// booleans
		boolean b1; // b1 is a (local) boolean var
		boolean b2;
		
		// System.out.println(b1); compile error: b1 uninitialized
		b1 = true;
		b2 = false;
		System.out.println("b1 and b2 values");
		System.out.println(b1);
		System.out.println(b2);
		
		// b1 = 0; compile error: cannot convert int to boolean
		
		// ints
		int i1 = 5;
		int i2 = 10;
		
		System.out.println("i1 and i2 values");
		System.out.println(i1);
		System.out.println(i2);
		
		// int i3 = 3.2; compile error: cannot convert double to int
		
		// doubles
		double d1 = 5.2;
		double d2 = 3; // convert int to double
		
		System.out.println("d1 and d2 values");
		System.out.println(d1);
		System.out.println(d2);
		
		// chars
		
		char c1 = 'a';
		char c2 = 'b';
		// char c3 = 'ab'; compile error: ab is not a char
		
		System.out.println("c1 and c2 values");
		System.out.println(c1);
		System.out.println(c2);
		
		// short
		
		short s1 = 3;
		short s2 = 32767;

		// short s3 = 32768; cannot convert int to short
		System.out.println("s1 and s2 values");
		System.out.println(s1);
		System.out.println(s2);
		
		// long
		long l1 = 3;
		long l2 = 2147483647; // 2147483647: int value
		long l3 = 2147483648L; // tratta 2147483648 come long
		// limite pos long: 9220000000000000000
		
		System.out.println("l1 and l2 values");
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
		// float
		float f1 = 3; // int to float: OK
		//float f2 = 3.2; // cannot convert double to float
		float f2 = 3.2f;
		
		System.out.println("f1 and f2 values");
		System.out.println(f1);
		System.out.println(f2);
		
		// byte
		byte by1 = 3;
		byte by2 = 127;
		// byte by3 = 128;  cannot convert int to byte

		// short s3 = 32768; cannot convert int to short
		System.out.println("by1 and by2 values");
		System.out.println(by1);
		System.out.println(by2);
		
		// END TIPI PRIMITIVI
		
		// Objects
		
		String str1 = null; // string can be null (str1 is an object)
		String str2 = "Ciao";
		
		System.out.println("str1 and str2 values");
		System.out.println(str1);
		System.out.println(str2);
		
	} // end main method
	
} // end Vars class
