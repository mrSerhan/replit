package Replit;

public class replit080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double[][] a = {
						{1.4,2.0,3.3,2},
						{4,1.5,6.1,1},
						{1.2,3.1,4,1.6}};
	
	//Double and print array
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=a.length;j++){
				System.out.print(2*a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
