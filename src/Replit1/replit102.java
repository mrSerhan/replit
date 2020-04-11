package Replit1;

public class replit102 {
	
	String carColor;
	int carYear;
	String carMake;



	public static void main (String [] args) {
		
		replit102 obj0 = new replit102();
		
		obj0.carColor = "Black";
		obj0.carYear = 2019;
		obj0.carMake = "BMW";
		
		replit102 obj1 = new replit102();
		obj1.carColor = "White";
		obj1.carYear = 2018;
		obj1.carMake = "Toyota";
		
		System.out.println("Car color is "+obj0.carColor + " and car year is "+ obj0.carYear+" and car model is "+obj0.carMake);
		System.out.println("Car color is "+obj1.carColor + " and car year is "+ obj1.carYear+" and car model is "+obj1.carMake);
	}
}