package Replit;

public class replit128_asel {

	static int countVowels (String s) {
		
		String count = s.replaceAll("[^AaEeIiOoUu]", "");
		return count.length();
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(countVowels("obama"));
		System.out.println(countVowels("happy friday! i love weekends"));
	}
	
	
}
