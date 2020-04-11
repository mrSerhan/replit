package Replit1;


//Create the maxLength method that will accept String array of words and return the word with the largest length.
//
//Method should visible only within same package!
//
//Expected Output: this is long
	
	



public class replit134 {

	String [] arr;
	
	
	public static String maxLength(String [] arr) {
		int maxLength = 0;
		String longestString = "";
		for(String str:arr) {
			if(str.length() > maxLength) {
				maxLength = str.length();
				longestString = str;
			}
		}
		return longestString;
	}
	
	public static void main(String[] args) {
		
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(maxLength(arr));
		
	}
	

		
	}
	


 