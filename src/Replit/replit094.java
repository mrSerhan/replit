package Replit;

import java.util.Scanner;

public class replit094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the browser name to proceed further with execution");
	    String browser = sc.nextLine(); 
	    
	    if(browser.equalsIgnoreCase("chrome")) {
	    	String chrome = browser.substring(0,1).toUpperCase()+browser.substring(1).toLowerCase();
	    	System.out.println("Proceed with "+chrome+" browser");
	   
	    }else if (browser.equalsIgnoreCase("firefox")) {
	    	String firefox = browser.substring(0,1).toUpperCase()+browser.substring(1,4).toLowerCase()+browser.substring(4,5).toUpperCase()+browser.substring(5,7).toLowerCase();
	    	
	    	System.out.println("Proceed with "+firefox+" browser");
	    }else if(browser.equalsIgnoreCase("IE")){
	    	String ie = browser.toUpperCase();
	    	System.out.println("Proceed with "+ie+" browser");
	    }else {
	    	System.out.println("Invalid browser");
	    }
	    
	}

}
