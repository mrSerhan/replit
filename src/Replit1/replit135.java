package Replit1;

public class replit135 {

	public static int maxValue(int[] arr) {
		
		int maxValue = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i]>maxValue) {
					maxValue = arr[i];
				}
			}
		return maxValue;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,12,-3,7,3,22};
		System.out.println(maxValue(arr));
	}

}
