package revision;

public class ReverseSentenceString {

	public static void main(String[] args) {
		
		String str = "Kulsum Bhavin Aarti Payal Mudra Divya";
		
		String str1[] = str.split(" ");
		String rev = "";
		int len = str1.length;
		for(int i = len-1; i>=0; i--) {
			rev = rev + " " + str1[i];
			System.out.print(str1[i] + " ");
		}
		String s = rev.trim();
		System.out.println(s);

	}

}
