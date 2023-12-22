package Java_demo;

import java.util.Scanner;

public class Revstring {

	public static void main(String[] args) 
	{

		Scanner rm = new Scanner(System.in);
		System.out.println("Enter an string :- ");
	String str= rm.nextLine();
	
	String rev=" ";
	
	for(int i=0;i<str.length();i++) {
	char ch=str.charAt(i);
	
	rev=ch+rev;
	
	}
	
	System.out.println("After rev string is :- " +rev);
	
	
	}
	
	

}
