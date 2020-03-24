package Exercises;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("please enter number");
		int num=scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			
			System.out.println(num+"x"+i+"="+(num*i));
			
		}
		
	}

}
