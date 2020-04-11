package Replit1;

//	Include the following class variables:
//	* name(String)
//	* lastName(String)
//	* employeeId(int)
//	* startDate(String)
//	* salary(int)
//	
//	
//	Write two constructors:
//	
//	* non-argument constructor
//	* parameterized constructor that will initialize all instance variables
//
//	Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.

public class replit140_employee {
	
	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;
	
	public replit140_employee() {
	
	}
	
	replit140_employee(String name, String lastName, int employeeId, String startDate, int salary){
		this.lastName = lastName;
		this.name = name;
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
}
