package revision;

public class ReverseStringValues {

	public static void main(String[] args) {
		
		
		String str = "Hello this is string";
		
		String str2[] = str.split(" ");
		
		int len = str2.length;
		int len2 = str.length();
		for(int i=len-1; i>=0; i--) {
			System.out.print(str2[i] + " ");
		}
		System.out.println();
		for(int i=len2-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
