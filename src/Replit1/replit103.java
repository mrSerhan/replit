package Replit1;

public class replit103 {

	String breed;
	String name;
	String color;
	
	void bark() {
		System.out.println(breed+" can bark");
	}
	
	void run() {
		System.out.println(breed+" can run");
	}
	
	void play() {
		System.out.println(breed+" can play");
	}
	
	public static void main (String [] args) {
		
		replit103 dog1 = new replit103();
		dog1.breed = "Husky";
		
		replit103 dog2 = new replit103();
		dog2.breed = "Bulldog";
		
		replit103 dog3 = new replit103();
		dog3.breed = "Labrador";
		
		dog1.bark();
		dog1.run();
		dog1.play();
		dog2.bark();
		dog2.run();
		dog2.play();
		dog3.bark();
		dog3.run();
		dog3.play();

	}
}
