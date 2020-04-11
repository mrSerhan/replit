package Replit1;

public class replit136 {

public static void main(String[] args) {
		
		replit136 obj1 = new replit136();
		obj1.display();
		replit136 obj2 = new replit136("Syntax", 6, 2010, "07/30/2020");
		obj2.display();
	}
	
	
	String schoolName;
	String lastDayOfClass;
	int year;
	int batch;
	
	replit136(){
	}
	
	replit136(String schoolName, int batch,int year,String lastDayOfClass){
		this.schoolName = schoolName;
		this.lastDayOfClass = lastDayOfClass;
		this.year = year;
		this.batch = batch;
	}
	
	public void display() {
		System.out.println(schoolName+batch+year+lastDayOfClass);
	}
}

