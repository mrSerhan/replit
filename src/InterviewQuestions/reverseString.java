package InterviewQuestions;




public class reverseString {

	public static void main(String[] args) {
		// Write a java program to reverse String? Reverse a string word by word?

		String teo = "Hangi guvercin atlamis catidan ya da hangi balik denize hesap yapip akillica";
		
		String[] arrTeo = teo.split(" ");		
		
		
		for(int i = arrTeo.length-1; i >= 0; i--) { 
			
			System.out.print(arrTeo[i]+" ");
		}
		System.out.println();
		
		System.out.println("=== CHARACTER REVERSE ===");
		
		String hero = "I am a hero";
		
		char [] arr = hero.toCharArray();
			for(int i = arr.length-1; i >= 0; i--) {
				System.out.print(arr[i]);	
			}
			
		
		
		
	}

}
