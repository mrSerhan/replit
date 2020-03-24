package Replit;

import java.util.Scanner;

public class replit044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		String carMake;
		String carOrigin;
		System.out.println("Please enter your favorite car make");
		carMake=scan.nextLine();
		
		switch(carMake) {
		
		case "BMW":
			carOrigin="german car";
			break;
		case "Toyota":
			carOrigin="japanese car";
			break;
		case "Maserati":
			carOrigin="italian car";
			break;	
		default:
			carOrigin="unknown";
			
		}
		
		System.out.println("Your favorite car is "+carOrigin);
	}

}
