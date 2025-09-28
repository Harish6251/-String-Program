package com.qsp.string;

import java.util.Arrays;

public class AnagramWithBuiltIn {

	public static void main(String[] args) {
		
		String s1 = "Listen";
		String s2 = "sIlent";
		
		if(s1.length() == s2.length()) {
			
			s1 = s1.toUpperCase();
			s2 = s2.toUpperCase();
			
			char ch1 [] = s1.toCharArray();
			char ch2 [] = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			s1 = new String(ch1);
			s2 = new String(ch2);
			
			if(s1.equals(s2)) {
				System.out.println("anagram");
			}
			else {
				System.out.println("Not anagram");
			}
		}
		else {
			System.out.println("not anagram");
		}
		
		
	}
}
