package Replit1;

public class replit134_asel {

	static String maxLength(String[] words) {
	int index = 0;
	int elementLength = words[0].length();
		for(int i = 1; i < words.length; i++) {
			if(words[i].length() > elementLength) {
				index = i;
				elementLength = words[i].length();
			}
		}
	return words[index];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "hey", "yolo", "hi", "this is long" };
		System.out.println(maxLength(arr));
		// should print "this is long"
	}

}
