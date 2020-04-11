package Replit1;

public class replit112 {

	boolean bothEven(int a, int b) {   
		// public static boolean diye baslarsam main classta create obje istemiyor
		// public static koymazsam main class ta create object yapmak gerekiyor neden?
		
		if(a%2==0 && b%2==0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		replit112 isBothEven = new replit112();
		
		System.out.println(isBothEven.bothEven(12, 8));
	
		
		
	}

}
