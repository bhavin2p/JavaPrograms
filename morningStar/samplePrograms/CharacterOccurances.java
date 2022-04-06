package samplePrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurances {

	public static void stringOccCount(String str, char s) {

		Map<Character, Integer> charMap = new HashMap<>();

		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}

		System.out.println("The character - " + s + " occurs " + charMap.get(s) + " times.");
		System.out.println(charMap);

	}

	public static void StringOcc(String str, char s) {
		
		char []charArray = str.toCharArray();
		int count = 0;
		for(char c : charArray) {
			if(c == s) {
				count ++;
			}
		}
		System.out.println("The character - " + s + " occurs " + count + " times.");
	}

	public static void main(String[] args) {
		
		String str = "MorningStar";
		char s = 't';
		stringOccCount(str, s);
		StringOcc(str, s);

	}

}
