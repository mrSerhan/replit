package Exercises;

import java.util.Scanner;

public class SerhanAhmet02 {

	public static void main(String[] args) {
		// Write an array with size of 5.
		// Use a loop to input values to the array (don't print any prompt message for Scanner).
	 	// Then print out all the elements you have created in the first loop in reverse order.
		
			Scanner scan=new Scanner(System.in);
			
			int [] num = new int[5];
			for(int i =0;i<num.length;i++) {
				num[i]=scan.nextInt();
			}
			for(int i=num.length-1;i>=0;i--) {
				System.out.println(num[i]);
			}
			}
			
	}


