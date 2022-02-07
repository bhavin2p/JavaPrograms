package stringCharOcc;

public class CharOccurances {

	public static void main(String[] args) {
		String str = "ABCDE test";
		char []charArray = str.toCharArray();
		
		int count = 0;
		for(char c : charArray) {
			if(c == 't') {
				count ++;
			}
		}
		System.out.println(count);
	}
	

}
