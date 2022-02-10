package hashTableDemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo2 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new Hashtable<>();
		map.put(1, "Bhavin");
		map.put(2, "Ankita");
		map.put(3, "Roshani");
		map.put(4, "Kulsum");
		
		System.out.println(map);

		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			
			System.out.println(i + " " +map.get(i));
		}
		

	}

}
