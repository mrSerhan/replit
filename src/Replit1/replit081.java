package Replit1;

public class replit081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
		int control = a[0][0];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]>control) {
					control=a[i][j];
				}
			}
			
		}
		
		System.out.println(control);
	}

}
