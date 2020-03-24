package InterviewQuestions;

public class alphaCharAndNumberOfWords {

	public static void main(String[] args) {
		//Find out how many alpha characters are present in a String?  Find number of words in string?
		
		String kaya = "Bugun dusunemeyecegin kadar basim belada.";
		
		String [] arr = kaya.split(" ");
		int counter = 0;
		for(int i = 0; i < arr.length;i++) {
			counter++;
		}
		System.out.println("there are "+counter+" words in this array");
		
		
		System.out.println("There are "+kaya.replaceAll("[^A-Za-z]","").length()+" alpha characters in this string");
	}

}
