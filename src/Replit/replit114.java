package Replit;

public class replit114 {

	String spaceOut(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		return str;
	}
	
	
	public static void main(String[] args) {
		
		replit114 obj = new replit114();
		
		obj.spaceOut("hello");
		System.out.println();
		obj.spaceOut("technology");
	}

}
