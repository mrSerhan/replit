package Replit1;

public class replit126 {

//	Write a method header on line two with the following specs:  
//		  
//		Returns:
//		a String
//		Name:
//		thirdLetter
//		Parameters:
//		a String called s
//
//		Then complete the method by programming the following behavior
//		Returns every 3rd letter of the String s, 
//		starting from the first letter.
//		See below examples.
//
//		Examples:
//		thirdLetter("hello there") ==> "hltr"
//		thirdLetter("technology") ==> "thly"
//	
	
	static String thirdLetter(String s) {
		String result="";
		
		for(int i = 0 ; i<s.length();i+=3) {
			result = result + s.charAt(i);
		}
	
		return result;
	}
	

	
	
	public static void main(String[] args) {

		
		
		System.out.println(thirdLetter("hello there"));
		System.out.println(thirdLetter("technology"));

	}

}
