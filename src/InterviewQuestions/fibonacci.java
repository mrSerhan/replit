package InterviewQuestions;

public class fibonacci {

	public static void main(String[] args) {
//		   0 1 1 2 3 5 8 13 21 34 55
//		   a+b c
//		     a+b c
//		       a b c
		
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		
		for(int i = 0 ; i < 10; i++ ) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(num3+" ");
		}
		
		

	}

}
