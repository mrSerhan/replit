package Exercises;

import java.util.Scanner;

public class SerhanAhmet03 {

	public static void main(String[] args) {
		// Write a program that creates an array of strings with the size being 7.
		// Ask the user to input Days of a week beginning with Sunday using Scanner class.
		// Add these inputs to your array and then print all values from that array

		Scanner scan=new Scanner(System.in);
		int [] days  = {1,2,3,4,5,6,7};
		
		for(int i=0;i<7;i++) {
			System.out.println("pls enter day "+(i+1)+" of the week.");
			days[i]=scan.nextInt();
			System.out.println(days[i]);
		}
		
	}

}
