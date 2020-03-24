package InterviewQuestions;

import java.util.Scanner;

public class givenNumbersPrimeOrNot {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number :");
		int number = scan.nextInt();
		boolean isPrime=true;
			for(int i = number-1; i>1; i--) {
				if(number%i == 0) {
					isPrime = false;
					break;
				}						
			}
				
			if(isPrime==false) {
				System.out.println("this number is not a prime number");
			}else {
				System.out.println("This number is a prime number");
			}

	}

}
