package setDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> values = new HashSet<>();
		values.add("Selenium");
		values.add("QTP");
		values.add("Winium");
		values.add("1");
		values.add("abc");
		values.add("abc");
		
		ArrayList<String> list = new ArrayList<>(values);
		
		System.out.println("List : " + list);
		System.out.println(list.get(3));
		System.out.println(values);
		
		for(String e:values) {
			System.out.println(e);
		}

	}

}
