package Exercises;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		// Write a program in Java to input 6 numbers 
		// from keyboard and find their sum and average.
		
		int i,sum=0,num=0;
		System.out.println("input the 6 numbers");
		Scanner scan=new Scanner(System.in);
		
	
		for (i=0;i<6;i++) {
			num=scan.nextInt();
			sum+=num;
		}
		double average=(double)sum/6;
		System.out.println("sum numbers ="+sum+"\nThe average is = "+average);
	
	}

}
