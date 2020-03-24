package InterviewQuestions;

public class Swap2NumbersAndStrings {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?

		int x = 20;
		int y = 30;
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("After swapping x = "+x+" y = "+y);
		
		String a = "serhan";
		String b = "ozgun";
		
		a = a+b;
		
		b = a.substring(0,a.length()-b.length());
		
		a = a.substring(b.length());
		
		System.out.println("String a = "+a+" String b = "+b);
	}

}
