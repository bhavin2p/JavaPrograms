package revision;

public class FibonoSeries {

	public static void main(String[] args) {
		int num=55, first=0, second=1;
		
		for(int i=0; i<=num; i++) {
			System.out.print(first + ", " );
			int Nexttemp = first + second;
			first = second;
			second = Nexttemp;
		}
		
		
		int n = 10, firstTerm = 0, secondTerm = 1;
	    System.out.println("\nFibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
		
		

	}

}
