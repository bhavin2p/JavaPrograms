package revision;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CharNumber {

	public static void main(String[] args) {
		
		String plain = "a1bcd efg!h";

	    String reversed = Arrays.stream(plain.split(" ")).map(str -> {
	        char[] chars = str.toCharArray();
	        int i = 0;
	        int j = chars.length - 1;
	        while(i < j) {
	            if(Character.isLetter(chars[i]) && Character.isLetter(chars[j])) {
	                char tmp = chars[i];
	                chars[i] = chars[j];
	                chars[j] = tmp;
	                i++;
	                j--;
	            } else if(!Character.isLetter(chars[i]))
	                i++;
	            else
	                j--;
	        }
	        return new String(chars);
	    }).collect(Collectors.joining(" "));

	}

}
