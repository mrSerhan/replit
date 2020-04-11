package Replit1;

public class replit137_main {

	public static void main(String[] args) {
	
		replit137_car car1 = new replit137_car("Toyota", "Prius", 4, 120, 30000.0);
		replit137_car car2 = new replit137_car("Toyota", "Prius", 120, 30000.0);
		replit137_car car3 = new replit137_car(4, 120, 30000.0);
		replit137_car car4 = new replit137_car("Toyota", "Prius", 4);
		
		car1.display();
		car2.display();
		car3.display();
		car4.display();
	}

}
