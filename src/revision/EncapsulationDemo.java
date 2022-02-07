package revision;

public class EncapsulationDemo {
	
	
	private int ssn;
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	private String empName;
	private int empAge;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationDemo e1 = new EncapsulationDemo();
		e1.setEmpAge(20);
		e1.setEmpName("Bhavin");
		e1.setSsn(123456);
		
		System.out.println("Employee Age : " + e1.getEmpAge() + "Employee Name : " + e1.getEmpName() + "Employee SSN : " +e1.getSsn());
		
		
		
		


	}

	

}
