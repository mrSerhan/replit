package Exercises;

public class RightAngelTriangleInceaseBy1 {

	public static void main(String[] args) {
		
		// Write a program in Java to make such a pattern 
		// like right angle triangle with number increased by 1
		
		int numbers=4;
		int k=1;
		
		for(int i=1;i<=numbers;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(k++);
			}
			System.out.println("");
			
		}
		
	}
	
}
