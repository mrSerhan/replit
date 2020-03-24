package Replit;

import java.util.Scanner;

public class replit076 {

	public static void main(String[] args) {
		
		
		String [] days = new String[7];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<=days.length-1;i++) {
			System.out.println("Please enter day "+(i+1) +" of the week");
			days [i]=scan.nextLine();	
			
		}
		for (int i=0;i<=days.length-1;i++) {
			System.out.println(days[i]);
		}

	}

}
