package mcq12;

public abstract class Vehicle10 {
	private int x, y;
	public abstract void drive();
	public void setProperties(int topSpeed, int mileage) {
		this.x = topSpeed;
		this.y = mileage;
	}
}


/*
public abstract class Car extends Vehicle10{
	private int speed;
} // correct

public class Car implements Vehicle10{
	private int speed;
}


public class Car extends Vehicle10{
	private int speed; 
	public void drive();
}

public abstract class Car implements Vehicle{
	private int speed;
	public void drive();
}*/

