package ExercisesArray;

public class SumValuesArray {

	public static void main(String[] args) {
		// Write a Java program to sum values of an array
		
		int [] num= {2,4,6,8,10};
		int sumArray=0;
		for(int i=0;i<num.length;i++) {
			sumArray+=num[i];
			
			System.out.print(num[i]+" ");
		}
		System.out.println(" ");
		System.out.println("sum of the numbers in array ="+sumArray);
		
		System.out.println(" ");
		System.out.println("=======SECOND WAY==========");
		System.out.println(" ");
		
		sumArray=0;
		for(int x:num) {
			sumArray+=x;
		}
		System.out.println("sum of the numbers in array ="+sumArray);
	}

}
