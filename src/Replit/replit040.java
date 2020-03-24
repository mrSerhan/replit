package Replit;

import java.util.Scanner;

public class replit040 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name;
		String resp=null;

		System.out.println("Enter name of the instructor");
		name = scan.nextLine();

		switch (name) {

		case "Shiva":
			resp = "Java Assignment";
			break;

		case "Sandish":
			resp = "SDLC Assignment";
			break;

		case "Weqas":
			resp = "Selenium Assignment";
			break;

		case "Asel":
			resp = "every Assignment";
			break;

		default:
			System.out.println("Invalid instructor selected");
			System.out.println("Will take care of " + resp);


		}

		
	}

}
