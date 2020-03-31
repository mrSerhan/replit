package Replit;

public class replit127 {

	static int countA(String s) {
		int aCounter=0;
		
		
		for(int i = 0; i < s.length();i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='A') {
				aCounter++;
			}
		}
		
		return aCounter;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(countA("aaA"));
		System.out.println(countA("aaBBdf8k3AAadnklA"));
	}

}
