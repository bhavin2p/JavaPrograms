package stringManipulation;

public class stringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullname = "Selenium-HP-QTP-Grid";
		
		String[] tooname = fullname.split("-");
		for(int i=0; i<tooname.length; i++) {
			System.out.println(tooname[i]);
			if(tooname[i].equalsIgnoreCase("selenium")) {
				System.out.println("Test Passed");
				break;
			}
		}

	}
 
}
