
public class AllOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		a = 3 + 4;
		a = 3 + a;
		a = a + a;
		
		int b = 3 * 3;
		b = 3 * b;
		b = a * b;
		
		a = a - b;
		a = a - 10000;
		
		a = 5 / 3;
		a = 5 % 3; // gives the remainder
		
		System.out.println("the answer is " + (5 / 3) + "R" + (5%3) );
		
		double i = 1.1 + 2;
		i = i + a; // Mixing number data types is ok with double
		
		i = i - 2.32323;
		i = i * 5;
		i = 5 / 3;
		
		double x = 5.0 / 3.0;
		System.out.println(x);
		
		String adding = "Hello";
		adding = adding + " World";
		System.out.println(adding); 
		
		
		
	}

}
