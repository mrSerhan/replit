package Exercises;

import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//"TASK : Write a program in Java to display n terms of natural numbers and their sum");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		int Sum=0;
		for(int i=0;i<=number;i++) {
			Sum=Sum+i;
			
		}
		System.out.println("the sum of numbers ="+Sum);
		
	}

}
