package hashTableDemo;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary<Integer, String> geek = new Hashtable<Integer, String>();
		geek.put(123, "Code");
		geek.put(456, "Program");
		
		for(Enumeration<String> i = geek.elements(); i.hasMoreElements();) {
			System.out.println("Value in Dictionary : "+ i.nextElement());
		}
		
		System.out.println("\nValue at key = 6 : " +geek.get(6));
		System.out.println("Value at key = 456 : " +geek.get(123));
		
		System.out.println("\nThere is no key-value pair : " +geek.isEmpty() );
		
		for(Enumeration<Integer> k = geek.keys(); k.hasMoreElements();) {
			System.out.println("Keys in Dictionary = " +k.nextElement());
		}
		
		System.out.println("\nRemove : " +geek.remove(123));
		
		System.out.println("Check the value of removed key : " +geek.get(123));
		System.out.println("Size of Dictionary : " +geek.size());
		

	}

}
