package morganSample;

import java.util.HashMap;

public class CharacterOc {

	public static void main(String[] args) {
		String str = "asdfdsafdfdddreww";
        char strArr[] = str.toCharArray();
        
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        
        for(char c:strArr){
            
        	//containsKey
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1);
            }
            else{
                charMap.put(c, 1);
            }
            
        }
        
        System.out.println(charMap);

	}
}
