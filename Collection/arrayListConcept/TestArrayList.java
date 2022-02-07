package arrayListConcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		List<String> al2 = new ArrayList<String>();
		al2.add("James");
		al2.add("Serena");
		al2.add("Swati");
		al2.add("Junaid");
		
		System.out.println("arraylist : " +al);
		System.out.println("Arraylist2 : " +al2);
		Collections.reverse(al2);
		System.out.println("Arraylist reversed " +al2);
		
		for(String all:al) {
			System.out.println(all);
		}
		
		System.out.println("Using Iterator");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
