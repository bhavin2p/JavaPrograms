package stringCharOcc;

import java.util.HashMap;
import java.util.Map;

public class EachOccurancesString {

	public static void main(String[] args) {
		
		
		String str = "Test One Two";
		Map<Character, Integer> charsMap = new HashMap<>();
		char charArray[] = str.toCharArray();
		
		for(char c : charArray) {
			if(charsMap.containsKey(c)) {
				charsMap.put(c, charsMap.get(c)+1);
			}
			else
			{
				charsMap.put(c, 1);
			}
		
		}
		
		System.out.println(str + " : " +charsMap);
		
		
		
		

	}

}
