package stringDemo;

import java.util.HashSet;
import java.util.Set;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "The rains have started here";
		//System.out.println(str.length());
		
		String []StrArr = str.split(" ");
		
		for(int i = StrArr.length-1; i>=0; i--) {
			System.out.print(StrArr[i] + " ");
		}
		
		String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java"};
		
		for(int i = 0; i<names.length; i++) {
			for(int j = i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println(names[j]);
				}
			}
		}
		
		for(int i = 0; i<names.length; i++) {
			for(int j = i+1; j<names.length; j++) {
				if(names[i].compareToIgnoreCase(names[j]) > 0) {
					String temp;
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.println("Sorting array of string");
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
		Set<String> store = new HashSet<>();
		
		for(String name : names) {
			//System.out.println(store.add(name));
			if(store.add(name) == false) {
				System.out.println(name);
			}
			
		}
		
		

	}

}
