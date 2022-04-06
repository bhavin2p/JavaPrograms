package mcq12;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap3 {

	public static void main(String[] args) {
		SortedMap<String, Integer> map = new TreeMap<>();
		map.put("B", 1);
		map.put("B", 2);
		map.put("a", 3);
		System.out.println(map.lastKey()+" " +map.size());
	}
}
/*
a:3
B:3
B:2
a:2 = correct
*/