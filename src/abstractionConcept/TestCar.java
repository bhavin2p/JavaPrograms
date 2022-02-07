package abstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		
		Car c = new BMW();
		c.start();

	}

}
