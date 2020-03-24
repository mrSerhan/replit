package Replit;

import java.util.Scanner;

public class replit041 {
	 public static void main(String[] args){
		  
		  Scanner scan= new Scanner(System.in);
		  
		  
		  int age=0;
		  String act;
		  
		  System.out.println("enter the age of the Child");
		  age=scan.nextInt();
		  
		  switch(age) {
		    case 1:
		      act="You can Crawl";
		      break;
		    case 2:
		      act="You can talk";
		      break;
		    case 3:
		      act="You can Dance";
		      break;
		    case 4:
		      act="You can get Trouble";
		      break;
		    default:
		      act="I dont know how old you are";
		    
		  }
		    System.out.println(act);
		  
		  }
		}

