package stringDemo;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before swaping : ");
		System.out.println("The value of a is : " +a);
		System.out.println("The value of b is : " +b);
		
		//1.append a and b
		a = a+b;
		
		//store inital string a in string b:
		b = a.substring(0, a.length()-b.length());
		
		//store inital string b in string a:
		a = a.substring(b.length());
		
		System.out.println("The value of a and b after swapping ");
		System.out.println(a);
		System.out.println(b);
		
		
		

	}

}
