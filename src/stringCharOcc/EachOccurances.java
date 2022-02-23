package stringCharOcc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EachOccurances {
	public static void main(String[] args) {
		// String str = "thehelloworld123";
		String str = "aaabbcccdd";
			
		char ch[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for (Character c : ch) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		Iterator<Character> cm = charMap.keySet().iterator();
		while (cm.hasNext()) {
			char key = cm.next();
			System.out.print(key + "" + charMap.get(key) + "");
		}
		System.out.println(charMap);
	}
}
