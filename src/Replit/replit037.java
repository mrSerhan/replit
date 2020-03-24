package Replit;

import java.util.Scanner;

public class replit037 {

	public static void main(String[] args) {

		boolean x;
		boolean y;
		String drink;
		Scanner scan;
		scan = new Scanner(System.in);

		System.out.println("Are you thirsty?");
		x = scan.nextBoolean();
		System.out.println("Are you sleepy?");
		y = scan.nextBoolean();

		if (x && !y) {
			drink = "Water";
		} else if (x && y) {
			drink = "Coffee";
		} else if (!x && y) {
			drink = "Tea";
		} else {
			drink = "Nothing";
		}

		System.out.println("Looks like you need " + drink);
	}

}
