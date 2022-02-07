package hashTableDemo;

import java.util.Hashtable;
import java.util.Map.Entry;

public class AddElementsToHashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht1 = new Hashtable<>();
		
		Hashtable<Integer, String> ht2 = new Hashtable<>();
		
		ht1.put(1, "One");
		ht1.put(2, "Two");
		ht1.put(3, "Three");
		
		ht2.put(4, "Four");
		ht2.put(5, "Five");
		ht2.put(6, "Six");
		
		System.out.println("Mapping of Hashtable 1" +ht1);
		System.out.println("Mapping of Hashtable 2" +ht2);
		
		for(Entry<Integer, String> e: ht1.entrySet())
			System.out.println(e.getKey() + " " +e.getValue());
		
		System.out.println(ht1.containsKey(3));
			

	}

}
