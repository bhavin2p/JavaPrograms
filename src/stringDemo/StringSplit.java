package stringDemo;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="abcaada";
		System.out.println(Arrays.toString(string.split("a")));
		
		String string2 = "Pankaj, New York, USA";
		String[] data= string2.split(",", 4);
		System.out.println("Name = " +data[0]);
		System.out.println("Address = "+data[1]);
		System.out.println("Country = " +data[2]);
		

	}

}
