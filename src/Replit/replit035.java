package Replit;

import java.util.Scanner;

public class replit035 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean loan;
		int score = 0;
		String eligibility;

		System.out.println("Do you need a loan?");
		loan = scan.nextBoolean();
		if (loan) {
			System.out.println("What is your credit score?");
			score = scan.nextInt();
			if (score < 600) {
				eligibility = "Not eligible";
			} else if (score >= 600 && score <= 700) {
				eligibility = "Maybe eligible";
			} else if (score > 700 && score <= 800) {
				eligibility = "Eligible";
			} else {
				eligibility = "Definitely";
			}
			

		} else {
			eligibility="Unknown";
		}

		System.out.println("The eligibility is " + eligibility);
	}

}
