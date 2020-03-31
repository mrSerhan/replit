package Exercises;

public class SumOfArray_Method {

	public int methodArray(int[] x) {
		int sumArray=0;
		
		for(int i = 0; i<x.length;i++ ) {
			sumArray+=x[i];
		}
		
		return sumArray;
	}
	
	
	
	public static void main(String[] args) {
		
		SumOfArray_Method obj = new SumOfArray_Method();
		int [] x = {1,2,3,4,5};
		System.out.println(obj.methodArray(x));
	}

}
