package stringDemo;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String str = "Hello This is World";
		
		String str1[] = str.split(" ");

		int len = str1.length;
		
		for(int i = len-1; i>=0; i--) {
			System.out.print(str1[i] + " ");
		}
	}

}
