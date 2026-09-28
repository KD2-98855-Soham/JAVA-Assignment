package com.sunbeam;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :");
		String str = sc.nextLine();
		
		String[] Words = str.trim().split("\\s+");
		
		System.out.print("Number of words in string is :" + Words.length);
	}

}
