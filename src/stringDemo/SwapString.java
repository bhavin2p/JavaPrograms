package stringDemo;

public class SwapString {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		
		String temp;
		
		System.out.println(a + " " +b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a + " " +b );
		
		String a1 = "Mumbai";
		String b1 = "Pune";
		
		a1 = a1+b1;
		b1 = a1.substring(0, a1.length()-b1.length());
		a1 = a1.substring(b1.length());
		
		System.out.println(a1 + " " +b1);

	}

}
