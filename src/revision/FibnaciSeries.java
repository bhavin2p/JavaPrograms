package revision;

public class FibnaciSeries {

	public static void main(String[] args) {
		
		int f=0, s=1, res;
		
		for(int i=0; i<=10; i++) {
			System.out.print(f + " ");
			//System.out.print(s);
			res=f+s;
			f=s;
			s=res;
		}

	}

}
