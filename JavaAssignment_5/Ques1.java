package com.sunbeam;
import java.util.Scanner;

public class Ques1 {
	public static void reverseString(String str) {
		String rev = "";
		
		
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Reversed string is :" + rev);
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String str = sc.nextLine(); 
		
		reverseString(str);

	}

}
