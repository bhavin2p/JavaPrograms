package abstractDemo1;

public class HRTeam extends ITDept{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * HRTeam h1 = new HRTeam(); h1.goodies(); h1.work(); h1.sal(); h1.demo1();
		 * h1.demo();
		 */
		 ITDept d1 = new HRTeam();
		 d1.demo();
		 d1.demo1();
		 //d1.sal();
		
		

	}

	@Override
	public void sal() {
		// TODO Auto-generated method stub
		System.out.println("Salary");
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method implemented in class");
	}


}
