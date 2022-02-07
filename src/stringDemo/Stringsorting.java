package stringDemo;

public class Stringsorting {

	public static void main(String[] args) {
		
		String str[] = {"Bhavin", "Kulsum", "Mudra", "Divya", "Aarti"};
		
		int len = str.length;
		
		String temp;
		
		for(int i = 0 ; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(str[i].compareTo(str[j])>0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		for(String s : str) {
			System.out.println(s);
		}

	}

}
