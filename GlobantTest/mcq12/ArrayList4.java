package mcq12;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(null);
		list.remove(1);
		list.remove(null);	
		System.out.println(list);
	}
}
/*[1,3,4] = correct
 * [2,3,4] 
 *[1,3,4,null]
 *compilation fails
 */
