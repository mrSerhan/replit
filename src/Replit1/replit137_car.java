package Replit1;

public class replit137_car {

	String make;
	String model;
	int numOfDoors;
	int topSpeed;
	double price;
	
	replit137_car(String make,	String model,	int numOfDoors, int topSpeed,	double price){
		this.make = make;
		this.model=model;
		this.numOfDoors = numOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
		
	}
	replit137_car(String make,	String model, int topSpeed,	double price){
		this.make = make;
		this.model=model;
		this.numOfDoors = 4;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	replit137_car(int numOfDoors, int topSpeed,	double price){
		
		this.numOfDoors = numOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
		this.make = "unknown";
		this.model = "unknown";
	}
	replit137_car(String make,	String model, int numOfDoors){
		this.make = make;
		this.model=model;
		this.numOfDoors = numOfDoors;
		this.topSpeed = 90;
		this.price = 0.0;
	}
	
	public void display() {
		System.out.println(make+" "+model+" "+numOfDoors+" "+topSpeed+" "+price);
	}
}
