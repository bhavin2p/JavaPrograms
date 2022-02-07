package stringCharOcc;

import java.util.HashMap;
import java.util.Map;

public class EachOccurances {

	public static void main(String[] args) {
		String str = "the hello world 123";
		char ch[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(Character c : ch) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else
			{
				charMap.put(c, 1);
			}
		}
		
		System.out.println(charMap);
		

	}

}
