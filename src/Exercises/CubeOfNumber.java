package Exercises;

public class CubeOfNumber {

	public static void main(String[] args) {
		// Write a program in Java to display the cube of the number up to given an integer.

		int number=10;
		int cube=0;
		
		for(int i=1;i<=number;i++) {
			cube=i*i*i;
			System.out.println("Number is "+i+" and cube of "+ i+" is :  "+cube);
			
		}
		
	}

}
