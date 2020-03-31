package Replit;

public class replit118 {

	String country;
	String capital;
	int population;
	
	public void display() {
		System.out.println("The capital of "+country+" is "+capital+" and population is "+population);
	}
	
	
	public static void main(String[] args) {
		
		replit118 obj1 = new replit118();
		obj1.country = "USA";
		obj1.capital = "Washington DC";
		obj1.population = 330000000;
		
		replit118 obj2 = new replit118();
		obj2.country = "Kazakhstan";
		obj2.capital = "Astana";
		obj2.population = 18500000;
		
		obj1.display();
		obj2.display();
		
	}

}
