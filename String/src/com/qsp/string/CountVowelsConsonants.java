package com.qsp.string;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the word :");
		String str = sc.nextLine();
		
		int vowelCount = 0;
		int consoCount = 0;
		
		int i = 0;
		
		while(i<str.length()) {
			
			char ch = str.charAt(i);
			
			if(ch != ' ') {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				
					vowelCount++;
				}
				else {
					consoCount++;
				}
			}
			i++;
		}
		
		System.out.println("Vowels Count : " + vowelCount);
		System.out.println("Consonant Count : " + consoCount);
		
		sc.close();
	}
}
