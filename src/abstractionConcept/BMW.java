package abstractionConcept;

public class BMW implements Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car started");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car stopped");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("Refuel car ");
	}
	
	public void theftsafety() {
		System.out.println("Theft Safety");
	}
	

}
