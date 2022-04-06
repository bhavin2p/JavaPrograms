package program2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.TreeMap;

public class MaximumSpeChar {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		String readLine = "";
		while((readLine = br.readLine()) != null) {
			int output = count(readLine);
			System.out.println(output);
		}
		br.close();

	}

	@SuppressWarnings("unlikely-arg-type")
	public static int count(String str) {
		char chStr[] = str.toCharArray();
		String chara = "!#$%&'()*+,-/:;<=>?@[\\]^_`{|}~";
		char ch[] = chara.toCharArray();
		
		//TreeMap<Character, Integer> chMap = new TreeMap<>();
		HashMap<Character, Integer> chMap = new HashMap<>();
		for(char c1 : chStr) { 
			if(chMap.containsKey(c1)) {
					chMap.put(c1, chMap.get(c1)+1);
				}
				else {
					chMap.put(c1, 1);
				}
		}
		HashMap<Character, Integer> chMap1 = new HashMap<>();
		for(char c: ch) {
			if(chMap1.containsKey(chMap.get(c))) {
				chMap1.put(c, chMap1.get(c)+1);
			}
			else {
				chMap1.put(c, 1);
			}
		}
		System.out.println(chMap1);
		/*for(char c : ch) { //special character
			for(char c1 : chStr) { //string special
				if(chMap.containsKey(c1)) {
				//if(c==c1) {
					chMap.put(c1, chMap.get(c1)+1);
				}
				else {
					chMap.put(c1, 1);
				}
				}
		}*/
		System.out.println(chMap);
		//System.out.println(chMap.lastEntry());
		return 0;
	}

}
