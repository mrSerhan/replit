package Replit;

public class replit110 {

	void mult(int x , int y) {
		System.out.println("Multiplication " + (x*y));
	}
	
	void add(int x , int y) {
		System.out.println("Addition " + (x+y));
	}
	
	void subt(int x , int y) {
		System.out.println("Subtraction "+(x-y));
	}
	
	public static void main(String[] args) {
		
		replit110 math = new replit110();
		math.add(20,10);
		math.mult(10, 3);
		math.subt(25, 5);
		
		
	}

}
