package revision;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num= 989779;
		
		int rev=0, rem;
		System.out.println(num);
		while(num!=0) {
			rem = num% 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		System.out.println(num);
		System.out.println(rev);

	}

}
