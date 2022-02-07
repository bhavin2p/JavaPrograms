package revision;

public class SortArrayString {

	public static void main(String[] args) {
		
		String str[] = {"Bhavin", "Aarti", "Rupal", "Kulsum", "Pooja", "Rozeena", "Anjali"};
		
		int len = str.length;
		
		String temp="";
		
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++) {
				if(str[i].compareTo(str[j])>0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		for(int i=0; i<len; i++) {
			System.out.println(str[i]);
		}

	}

}
