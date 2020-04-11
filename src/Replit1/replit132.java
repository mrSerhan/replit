package Replit1;

//For you to do:
//
//In AnotherClass declare a private, default, protected, public methods and have 
//them each return the name of the what access modifier they are using.
//All methods should be accessible by class name
//
//Call methods of Another class inside Main class
//
//Expected Output:
//default
//protected
//public

public class replit132 {

	static String a() {
		String str ="default";
		return str;
	}
	
	public static String b() {
		String str = "public";
		return str;
	}
	
	protected static String c() {
		String str = "protected";
		return str;
	}
	
	private static String d() {
		String str = "private";
		return str;
	}
}

 class Main {

	public static void main(String[] args) {
		

		replit132 obj = new replit132();
		
		System.out.println(replit132.a());
		System.out.println(replit132.c());
		System.out.println(replit132.b());
	}
}