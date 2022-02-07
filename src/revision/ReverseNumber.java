package revision;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, rev = 0, r;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = s.nextInt();
		while(no>0) {
			r=no%10;
			rev=rev*10+r;
			no = no/10;
		}
		System.out.println("The reverse of the given number is : " +rev);

	}

}
