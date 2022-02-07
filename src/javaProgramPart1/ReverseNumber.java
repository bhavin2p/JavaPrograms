package javaProgramPart1;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 12321;
		int rev = 0;
		int t;
		t=num;
		while(num!=0) {
			rev = rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(t==rev) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
		
		long num1 = 12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
