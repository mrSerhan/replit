package Replit1;

public class replit116 {

	int year;
	String schoolName;
	int batch;
	
	public void text() {
		System.out.println("I am a student of batch "+batch+" studying at "+schoolName+" in the year of "+year);
	}
	
	public static void main(String[] args) {
		
		replit116 obj = new replit116();
		obj.year = 2020;
		obj.batch = 6;
		obj.schoolName = "Syntax";
		obj.text();
		
	}
	
	
}
