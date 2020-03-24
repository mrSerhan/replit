package ExercisesArray;

public class Array2DLargestAndSmallestElement {

	public static void main(String[] args) {
		// Find largest and smallest element in the 2D array
		
		
		int num [][] = {
						{10,20,30,40},
						{12,25,38,43},
						{50,8,11,65},
						{1,99}
		};
		
		int largest = num[0][0];
		int smallest = num[0][0];
		
		for(int i = 0; i < num.length; i++) {
			
			for(int j = 0; j < num[i].length; j++) {
				
				if (  num[i][j] > largest) {
					  largest =  num[i][j] ;
				}
				if (num[i][j] < smallest) {
					smallest = num[i][j];
				}
				
			}
		}
		System.out.println("the largest number is "+largest+ "  and smallest number is "+smallest+ " in the array");
		
		
		int [][] arrays = {
							{10,20,30,40},
							{12,25,38,43},
							{50,8,11,65},
							{2,98}
							};
		
		int min = arrays[0][0];
		int max = arrays[0][0];
		
		
		

	}

}
