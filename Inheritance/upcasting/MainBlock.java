package upcasting;

public class MainBlock {

	public static void main(String[] args) {
		
		Parent p = new Child();
		
		
		//Down Casting
		Child c = (Child)p;
        c.print();
        
        

	}

}
