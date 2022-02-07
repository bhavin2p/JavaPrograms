package revision;

public class ReverseString2 {

	public static void main(String[] args) {
		String str = "Hello World";
		
		int len = str.length();
		
		for(int i = len-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
