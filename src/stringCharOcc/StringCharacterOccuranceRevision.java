package stringCharOcc;

import java.util.HashMap;
import java.util.Map;

public class StringCharacterOccuranceRevision {

	public static void stringOccCount(String str) {
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		char ch[] = str.toCharArray();
		for(char c : ch) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c, 1);
			}
		}
		System.out.println(charMap);
		
	}
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		stringOccCount(str);
		

	}

}
