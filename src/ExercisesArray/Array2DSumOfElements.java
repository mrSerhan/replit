package ExercisesArray;

public class Array2DSumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] num = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
					};
		
		int sumElements = 0;
		
			for (int i = 0; i <num.length; i++) {
				
				for (int j = 0; j < num[i].length; j++) {
					
					System.out.println("elements = "+num[i][j]);
					sumElements = sumElements + num[i][j];
					
				}
				System.out.println();
			}
		
		System.out.println("sum of elements = "+sumElements);
		
						
		}
		
	}


