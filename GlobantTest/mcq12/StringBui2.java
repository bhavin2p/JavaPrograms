package mcq12;

public class StringBui2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		if(sb.equals(s)) {
			System.out.println("1");
		} else if(sb.toString().equals(s.toString())) {
			System.out.println("2");
		} else {
			System.out.println("no match");
		}
	}
}

/*
no match
1
2
Null PointerException
*/