package Exercises;

import java.util.Scanner;

public class OddNumbersAndSum {

	public static void main(String[] args) {
		//  Write a program in Java to display the n terms of odd natural number and their sum

		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number and see odd number and sum");
		
		int number=scan.nextInt();
		int odd=0;
		int sumOdd=0;
		int evenOdd=0;
		for(int i=0;i<=number;i++) {
			
			if(i%2!=0) {
				sumOdd+=i;
				System.out.print(i+"  ");
				
			}else {
				evenOdd+=i;
			}
			
		}
		System.out.println();
		System.out.println("Sum odd = "+sumOdd);
		System.out.println("Even odd = "+evenOdd);
		
	}

}
