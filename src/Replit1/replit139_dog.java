package Replit1;
//1. Complete the Dog.java class:
//
//Create following class variables. 
//dogName
//dogWeight   
//static dogBreed=Mutt;
//For all methods and variables use proper naming convention. 
//
//Create constructor to initialize instance variables 
//
//2. In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.
//
//Expected Output:
//Tarzan Mutt 50.0
//Lucy Mutt 10.0

public class replit139_dog {

	String dogName;
	double dogWeight;
	static String dogBreed = "Mutt";
	
	replit139_dog(String dogName, double dogWeight){			
	this.dogName = dogName;
	this.dogWeight = dogWeight;
	
	
		
	}
	public void display() {
		System.out.println(dogName+" "+dogBreed+" "+dogWeight);
	}
}
