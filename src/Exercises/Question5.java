package Exercises;

import java.util.Scanner;

public class Question5 {

	
	// two numbers are entered through the keyboard.
//	write a program to find the value of one number raised to the power of
//	another
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter two number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int i;
		int result=1;
		
		for(i=1;i<=num2;i++) {
			result=result*num1;
			
		}
		
		System.out.println(result);
		
	}

}
