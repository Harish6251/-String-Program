package com.qsp.string;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "MALAYALAM";
		String s1 = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			s1 = s1 + ch;
		}
		
		if(s.equals(s1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
}
