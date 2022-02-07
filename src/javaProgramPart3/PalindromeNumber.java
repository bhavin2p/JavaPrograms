package javaProgramPart3;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 121; //4321
		
		int rev = 0;
		int temp = num;
		while(num != 0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}
		if(rev == temp) {
			System.out.println("number is palindrome");
		}
		else
			System.out.println("number is not palindrome");


	}

}
