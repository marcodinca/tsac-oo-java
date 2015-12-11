
public class Operators {

	public static void main(String[] args) {
		System.out.println("Start Operators");
		
		// Sum, Sub, Molt, Div, Mod
		int i1 = 5;
		int i2 = 3;
		int is = i1 + i2; // +, -, *, /, %
		
		System.out.println("Sum");
		System.out.println(i1);
		System.out.println("+");
		System.out.println(i2);
		System.out.println("=");
		System.out.println(is);
		
		// Div intera
		
		int idiv = i1 / i2; // divisione intera!
		System.out.println("Div");
		System.out.println(i1);
		System.out.println("/");
		System.out.println(i2);
		System.out.println("=");
		System.out.println(idiv);
		
		double ddiv = i1 / i2;
		System.out.println("result to double");
		System.out.println(ddiv);
		
		System.out.println("i1 / i2");
		System.out.println(i1 / i2);
		
		
		double d1 = i1;
		System.out.println("d1 (double) / i2");
		System.out.println(d1 / i2);
		
		// boolean
		boolean b1 = true;
		boolean b2 = false;
		
		boolean b3 = b1 && b2; // && == AND, || == OR, ! == NOT, ^ == XOR
		System.out.println(b1);
		System.out.println("AND");
		System.out.println(b2);
		System.out.println("=");
		System.out.println(b3);
		
		// String concat
		
		String s1 = "Hello ";
		String s2 = "world";
		
		String s3 = s1 + s2;
		System.out.println("s1 + s2");
		System.out.println(s3);
		
		// Assignment
		System.out.println("i1 value before");
		System.out.println(i1);
		System.out.println("i2 value before");
		System.out.println(i2);
		i1 += 5; // += -= *= /= %=
		i2++;	//++, --
		System.out.println("i1 value after");
		System.out.println(i1);
		System.out.println("i2 value after");
		System.out.println(i2);
		
		String str1 = " Valore ";
		String str2 = str1 + i1; // +(str1, i1)
		System.out.println("str1 + i1");
		System.out.println(str2);
		
		String str3 = i1 + str1;
		System.out.println(str3);
		
		// operatore ternario ?:
		
		int a = 10;
		int b = 15;
		
		int c = a == b ? 100 : 0;
		String s = a != b ? "Sono Diverso" : "Sono Uguale";
		
		
	}
	
}
