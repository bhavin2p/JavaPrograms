package stringDemo;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		String s = "Selenium";
		String s1 = "SeleniumHome";
		reverseFun(s);
		System.out.println(reverseFun2(s1));
		
		
	}
	
	public static String reverseFun(String str) {
		char s1;
		int length = str.length();
		for(int i = length-1; i>=0; i--) {
			s1 = str.charAt(i);
			System.out.print(s1);
		}
		return str;
	}
	
	public static String reverseFun2(String str) {
		int len = str.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}
}
