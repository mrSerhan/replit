package Replit1;

public class replit115 {

	String censorLetter(String str, char a) {
	str = str.replace(a, '*');
		
		return str;
	}
	
	
	public static void main(String[] args) {
		
		replit115 censor = new replit115();
		System.out.println(censor.censorLetter("computer sciense", 'e'));
		System.out.println(censor.censorLetter("trick or treat", 't'));
	}

}
