package Replit;

public class replit069 {

	public static void main(String[] args) {
		/*
		 1 2 3 4 5 6 7 
		 1 2 3 4 5 6 
 		 1 2 3 4 5 
		 1 2 3 4 
		 1 2 3 
		 1 2 
		 1 
		 1 2 
		 1 2 3 
	     1 2 3 4 
	     1 2 3 4 5 
		 1 2 3 4 5 6 
		 1 2 3 4 5 6 7 
		 
		 */

		for ( int i = 1; i <= 7; i++) {
			for ( int j = 1; j < 9-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for ( int i = 1; i <= 6; i ++) {
			for (int j = 1; j <= i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}