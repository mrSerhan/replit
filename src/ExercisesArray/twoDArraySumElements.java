package ExercisesArray;

public class twoDArraySumElements {

	public static void main (String [] args) {
		
		
		int [][] num = {
					{1,2,3,4},
					{5,6,7,8,9},
					{10,11}
		};
		
		int elementSum = 0;
		
		
		for(int row = 0; row < num.length; row ++) {
			for(int col = 0; col < num[row].length; col++) {
				System.out.println(num[row][col]);
				elementSum+=num[row][col];
			
			}
			System.out.println();
		}
		
		System.out.println("Sum of elements = "+elementSum);
		
		
	}
}
