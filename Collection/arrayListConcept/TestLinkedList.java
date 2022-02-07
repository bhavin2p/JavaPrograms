package arrayListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ravi");
		ll.add("Ajay");
		
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
