package privateConstructor;

public class SingletonObject {
	
	//A private constructor does not allow a class to be subclassed.
	//A private constructor does not allow to create an object outside the class.
	//If all the constant methods are there in our class we can use a private constructor.
	//If all the methods are static then we can use a private constructor.
	//If we try to extend a class which is having private constructor compile time error will occur.

	private SingletonObject() {
	      System.out.println("In a private constructor");
	   }
	   public static SingletonObject getObject() {
	      // we can call this constructor
	      if (ref == null)
	         ref = new SingletonObject();
	      return ref;
	   }
	   private static SingletonObject ref;
}
