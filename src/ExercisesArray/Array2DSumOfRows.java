package ExercisesArray;

public class Array2DSumOfRows {

	public static void main(String[] args) {


		int [][] num = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
			};
		
		int sumElements = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			for ( int j = 0; j < num[i].length; j++) {
				sumElements = sumElements + num[i][j];
				
		
			}
			System.out.println("Sum of " + (i+1) + ". row = "+sumElements);
		}
		
		
		
	}

}
