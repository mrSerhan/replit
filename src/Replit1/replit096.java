package Replit1;

import java.util.Scanner;

public class replit096 {

	public static void main(String[] args) {
		//Write a for loop that will print out the reverse of the string.

		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	    
	    for (int i = s.length()-1;i >= 0; i--) {
	    	System.out.print(s.charAt(i));
	    	
	    }
	    
	    
	}

}
