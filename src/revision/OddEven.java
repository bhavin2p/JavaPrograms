package revision;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int no;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		no = s.nextInt();
		if(no%2==0) {
			System.out.println("even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}
}
