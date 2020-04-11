package Replit1;

public class replit124 {

//	Declare two static variables to hold
//	country name
//	continent
//
//	Create a method to display the value of static variables in the following format:
//	 
//	____ located on ____ continent
//
//	In the main method assign values to a static variable and execute method display

	
	static String countryName, continent;
	
	void display(String countryName, String continent) {
		System.out.println(countryName+" located on "+continent+" continent");
	}
	
	
	public static void main(String[] args) {
		

	
	replit124 obj = new replit124();
	obj.display("Canada", "N. America");
		
	}

}
