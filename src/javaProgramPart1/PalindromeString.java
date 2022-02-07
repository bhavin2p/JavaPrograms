package javaProgramPart1;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PalindromeString.isPalindromeString("BeeB"));

	}
	private static boolean isPalindromeString(String str) {
		if(str==null)
			return false;
		int length = str.length();
		System.out.println(length/2);
		
		for(int i=0;i<length/2; i++) {
			if(str.charAt(i)!=str.charAt(length-i-1))
				return false;
		}
		return true;		
	}
}

