package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(78787);
		list.add("Bhavin");
		list.add(78.12);
		
		System.out.println(list);
		
		for(Object abc : list) {
			System.out.println(abc);
		}
		
		Iterator itr =  list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
