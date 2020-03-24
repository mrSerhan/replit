package InterviewQuestions;

public class secondLargestInArray {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		
		int [] arr = {42,15,78,65,6,155,100,149};
		int maxNum = arr [0];
		int minNum = arr [0];
	
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i]>maxNum) {
				maxNum = arr[i];
			}
		}
		for(int i = 0; i < arr.length ; i++) {	
			if(arr[i]<minNum) {
				minNum = arr[i];
			}
			
		}
		System.out.println("Maximum number is "+maxNum+" in array");
		System.out.println("Minimum number is "+minNum+" in array");
		
		
		
	}

}
