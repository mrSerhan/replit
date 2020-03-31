package Replit;
//	Create a static method with the following specification
//
//	Return Type: String
//	Method Name: mixString
//	Parameters:
//	a String called s1
//	a String called s2

//	Then inside method write logic that will return the strings combined, one letter at a time, starting with s1.  See example below for an example.  
//
//	NOTE: s1 and s2 should be of equal lengths:
//	
public class replit125 {
	
	static String mixString(String s1,String s2) {
		
		
		StringBuilder combined = new StringBuilder();
				
		
		for(int i = 0; i < s1.length() || i < s2.length(); i++ ) {
			
			if( i < s1.length()) {
				combined.append(s1.charAt(i));
				}
			if( i < s2.length()) {
				combined.append(s2.charAt(i));
			}
			
			
		}
		String merged = combined.toString();
		
		return merged;
		
	}
	
	
	public static void main(String[] args) {
	
			String firstValue = mixString("12345","abcde"); 
			System.out.println(firstValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 

	}

}
