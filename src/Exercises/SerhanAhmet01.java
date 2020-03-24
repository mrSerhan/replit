package Exercises;

public class SerhanAhmet01 {

	public static void main(String[] args) {
		// 1 3 6 8 9 print this number
		
		
		int [] num= {1,3,6,8,9};
		int s=0;
		for(s=0;s<num.length;s++) {
			if(num[s]%2==0) {
				
				System.out.print(num[s]+" ");	
			}
					
		}
		System.out.println();
		System.out.println("==========================");
		
		
		
		//Write a program that creates an array of strings with the following 
		//values{"This", "is", "array", "of", "strings"} and prints all values in one line.
		
		String [] ser = {"ne ","kadar ","hava ","da ","olacak ","guzel "};
		
		System.out.println(ser[2]+ser[0]+ser[1]+ser[3]+ser[5]+ser[4]);
		
		
	}

}
