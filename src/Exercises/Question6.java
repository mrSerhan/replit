package Exercises;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int reversed=0;
		
		System.out.println("pls enter digits");
		int num=scan.nextInt();
		
	/*	while(num!=0) {
			int digit = num%10;
			reserved = reversed *10 + digit;
			num/=10;
		
		}*/	
	
		if(num<100000 && num>0) {
		
		for (;num%10 !=0;) {
			
			reversed=reversed*10;
			reversed=reversed+num%10;
			num=num/10;
		}
		System.out.println("reversed number = "+reversed);
		
		}else {
			System.out.println("invalid number ");
		}
		
		
		
		
	}

}
