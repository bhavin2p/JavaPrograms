package inheritanceDemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class C extends A {
	public static void main(String[] args) {
		String str = "AABBCCC";
		Map<Character, Integer> charMap = new Hashtable<Character, Integer>();
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		Iterator<Character> itr = charMap.keySet().iterator();

		while (itr.hasNext()) {
			char c1 = itr.next();
			System.out.print(charMap.get(c1) + "" + c1);
		}
	}
}
