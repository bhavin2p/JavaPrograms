package pojo;

public class MainClass {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.setName("Kulsum");
		obj.setId("143");
		obj.setSal(100000);
		
		System.out.println("Name = " +obj.getName());
		System.out.println("Id = " +obj.getId());
		System.out.println("Salary = " +obj.getSal());

	}

}
