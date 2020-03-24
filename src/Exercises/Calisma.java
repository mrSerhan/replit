package Exercises;

public class Calisma {

	public static void main(String[] args) {
		String str = "Bugun hava yagmurlu";
		
		String [] reverse = str.split(" ");
		
		for(int i = reverse.length-1; i>=0; i--) {
			System.out.print(reverse[i] + " ");
		}
	}

}
