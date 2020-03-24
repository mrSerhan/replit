package InterviewQuestions;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str1 = null;
		String reverse = "";
		
		System.out.println("enter a word");
		str1 = scan.nextLine();
		
		for(int i = str1.length()-1; i >=0; i-- ) {
			reverse = reverse + str1.charAt(i);
		}
		
		if(str1.equals(reverse)) {
			System.out.println(str1+" is a palindrome");
		}else {
			System.out.println(str1+" is not a palindrome");
		}
		
		
		}
		
		
	}


