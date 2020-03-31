package Exercises;

public class return2 {
	
	
	static int ikiilecarp(int a) {
		return a*2;
	}
	
	static int ikiiletopla(int a) {
		return a+2;
	}

	static int dortilecarp(int a) {
		 return a*4;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
													//32
		System.out.println(ikiilecarp(ikiiletopla(dortilecarp(8))));
		
		
		
	}

}
