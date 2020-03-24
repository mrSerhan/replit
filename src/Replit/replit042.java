package Replit;

import java.util.Scanner;

public class replit042 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	
	
	String name;
	
	System.out.println("enter top roll number of the Child");
	int roll=scan.nextInt();
	
	switch(roll) {
	
	case 101:
		name="Student name: Ramesh";
		break;
	case 102:
		name="Studen name: Mahesh";
		break;
	case 103:
		name="Studen name: Mukesh";
		break;
	default:
		name="Not found Student name: in class";
	
	}
		
	System.out.println(name);
		
	}

}
