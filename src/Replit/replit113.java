package Replit;

public class replit113 {

	 int sumEvenToX(int x) {
		int sumEven = 0;
		for(int i = 0; i <= x; i+=2) {
			//if(i%2 == 0) {
			sumEven+=i;				
			//}
		}
		return sumEven;	
	}
	
	public static void main(String[] args) {
		
		replit113 sumEven7 = new replit113();
		System.out.println(sumEven7.sumEvenToX(8));

	}

}
