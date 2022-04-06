package singletonClass;

import staticDemo.staticDemo;

public class Database {

	//at a time we create only one object 
	//In OOP, a singleton class is a class that can have only one object (instance of the class at a time.
	private static Database dbObject;
	private Database() {
		
	}
	
	public static Database getInstance() {
		if(dbObject == null) {
			dbObject = new Database();
		}
		return dbObject;
	}
	
	public void getConnection() {
		System.out.println("You are now connected to the database..");
	}
	
	public static void main(String[] args) {
	    Database db1 =	Database.getInstance();
	    db1.getConnection();

	}

}
