package Exercises;

public class RightAngelTrianglePattern {

	public static void main(String[] args) {
		/* Write a program in Java to display the pattern like right angle triangle with a number.
			1                                                                                
			12                                                                               
			123                                                                              
			1234                                                                             
			12345                                                                            
			123456                                                                           
			1234567                                                                          
			12345678                                                                         
			123456789                                                                        
			12345678910   */
		
		int number=10;
		int sum=0;
		
		for(int i=1;i<=10;i++) {
		
			for(int j=1;j<=i;j++) { //kritik nokta burasi 2. kosul j her zaman 1. kosulun i sine kucuk esit olmali.
				
				System.out.print(j);
			}
			System.out.println("");
		}
		
	}

}
