package Replit1;

import java.util.Scanner;

public class replit077 {

	public static void main(String[] args) {

		int[] num = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= num.length - 1; i++) {
			num[i] = scan.nextInt();
		}
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i]);
		}

	}

}
