package Exercises;

public class pattern02 {

	public static void main(String[] args) {
		// 
		
		for (int row = 7; row >=1; row --) {
			for (int col = 1; col <= row; col ++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		for (int row = 2; row <= 7; row ++ ) {
			for ( int col = 1; col <= row; col++ ) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
