package revision;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value in A : ");
		a = s.nextInt();
		System.out.println("Enter Value in B : ");
		b = s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Values in a : " +a);
		System.out.println("Values in b : " +b);
	}
}
