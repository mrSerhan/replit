package Replit;

import java.util.Scanner;

public class replit098 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
		
	    for (int i = 0; i < word.length();i++) {
	    	   if (i%2==0) {
	    			  char a= word.charAt(i);
	    				   System.out.print(a);
	    }
	    
	}

	}
}
