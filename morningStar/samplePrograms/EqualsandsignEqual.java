package samplePrograms;

import revision.ReverseStringValues;

public class EqualsandsignEqual {

	/*
	 * == checks if both objects point to the same memory location
	 * . equals() evaluates to the comparison of values in the objects.
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String string = "Hellow";
		String string1 = "HelloW";
		if(string == string1) {
			System.out.println("Checks the both string points to same memory.");
		}
		
		if(!string.equals(string1)) {
			System.out.println("Checks the both string contents are not same.");
		}
		
		int i = 10;
		int j = 10;
		if(i == j) {
			System.out.println("both interger values are same.");
		}
		//int a = new int(10); // not allowed
		Integer a1 = new Integer(10); // this is allowed
	}

}
