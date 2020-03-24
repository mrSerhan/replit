package Replit;

import java.util.Scanner;

public class replit036 {

	public static void main(String[] args) {

		Scanner scan;
		int num1 = 0;
		int num2 = 0;
		String word1;
		String word2;
		String output;

		scan = new Scanner(System.in);

		System.out.println("Please enter two strings");
		word1 = scan.nextLine();
		word2 = scan.nextLine();
		System.out.println("Please enter two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

			if(num1==num2 && word1.equals(word2)) {
				output="AND";
			}else if(num1==num2 || word1.equals(word2)) {
				output="OR";
			}else {
				output="NONE";
			}
		
		System.out.println(output);
		
	}

}
