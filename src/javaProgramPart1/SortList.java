package javaProgramPart1;
import java.util.ArrayList;
import java.util.Collections;


public class SortList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");

        Collections.sort(al);
        
        System.out.println(al);

	}

}
