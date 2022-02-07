package javaProgramPart1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingForArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"Bhavin", "Kulsum", "Ashwini", "Mitalee", "Payal", "Rozeena", "Pooja", "Yogita", "Madhuri"};
		int size = str.length;
		for(int i = 0; i<=size-1; i++) {
			for(int j = i+1; j<=size-1;j++) {
				if( str[i].compareTo( str[j] ) > 0 ) {
					String temp = str[i];
					str[i] = str [j];
					str[j] = temp;
					
				}
			}
		}
		
		  System.out.println(Arrays.toString(str));
		  
		  ArrayList<String> al = new ArrayList<>();
		  
		  for(int i = str.length-1; i>=0; i--) { al.add(str[i]); }
		  System.out.println("Without Sorting : " +al );
		  
		  Collections.sort(al); System.out.println(al);
		 
		

	}

}
