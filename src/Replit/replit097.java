package Replit;

import java.util.Scanner;

public class replit097 {

	public static void main(String[] args) {
		// Write code that will take in a String input and check to see if it is a palindrome or not.
		
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String givenString = inp.nextLine();
		   	//write your code below
		    
		   String reverse = "";
		   boolean p = true;
		   
		   for (int i = givenString.length()-1; i >= 0; i--) {
			   
			   reverse = reverse + givenString.charAt(i);
			   
			   
		   }
		   
		   String givenString2 = givenString.replaceAll(" ", ""); 
		   String reverse2 = reverse.replaceAll(" ","");
		   
		   if (givenString2.equalsIgnoreCase(reverse2)) {
			   p = true;
			   System.out.println(p);
		   }else {
			   p = false;
			   System.out.println(p);
		   }
		

	}

}
