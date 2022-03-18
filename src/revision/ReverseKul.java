package revision;

import java.util.Scanner;

public class ReverseKul {

	public static void main(String[] args) {
		
		int no=12345, rev = 0;
		
		while(no!=0) {
			//r=no%10;
			rev=rev*10+no%10;
			no = no/10;
		}
		System.out.println("The reverse of the given number is : " +rev);


	}

}
