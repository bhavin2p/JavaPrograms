package arrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//default class
		//dynamic array
		
		//int i[] = new int[4];
		
		//default generics
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add("Testing");
		ar.add(true);
		System.out.println(ar);
		System.out.println(ar.get(2));
		System.out.println(ar.size());

		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
	}

}
