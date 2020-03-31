package Exercises;

public class vowelsMethod {

	public String isVowels(String str) {
		String vowels = "";
		
		vowels = str.replaceAll("[^AaEeIiOoUu]","");
	
		return vowels;
	}
	
	
	public static void main(String[] args) {
		
		vowelsMethod obj = new vowelsMethod();
		
		System.out.println(obj.isVowels("Ahmet"));
		
	}

}
