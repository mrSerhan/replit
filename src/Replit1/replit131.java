package Replit1;
//
//For you to do 
//In main class please declared the variables using different access modifiers that will hold value for:
//name
//city
//name of the school
//batch number
//
//Create a method to display details in following format:
//My name is ___ and I live in ___. I study at ___ in batch ___
//
//Assign values to the variables and execute method display
//
//Expected Output:
//My name is John and I live in Miami. I study at Syntax in batch 6


public class replit131 {

	String name;
	public String city;
	protected String school;
	private int batchNo;
	
	public void display() {
		System.out.println("My name is "+name+" and I live in "+city+". I study at "+school+" in batch "+batchNo);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		replit131 obj = new replit131();
		obj.name = "John";
		obj.city = "Miami";
		obj.school = "Syntax";
		obj.batchNo = 6;
		obj.display();
		
	}

}
