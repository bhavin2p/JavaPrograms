package revision;

public class SwapString {

	public static void main(String[] args) {
		String s1 = "Kulsum";
		String s2 = "Bhavin";
		
		System.out.println("Before Swap : " +s1+ " " + s2);
		
		s1 = s2+s1;
		s2 = s1.substring(s2.length());
		s1 = s1.substring(0, s2.length());
		
		
		System.out.println("After Swap : " +s1+ " " + s2);

	}

}
