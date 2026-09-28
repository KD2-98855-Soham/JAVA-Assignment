package com.sunbeam;

import java.util.Scanner;

public class Ques2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string to check palindrome :");
		String str = sc.nextLine();
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if(rev.equals(str)) {
			System.out.print("The string is palindrome.");
		}
		else {
			System.out.print("The string is not palindrome.");
		}

	}

}
