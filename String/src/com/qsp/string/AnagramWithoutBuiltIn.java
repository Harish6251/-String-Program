package com.qsp.string;

public class AnagramWithoutBuiltIn {

	public static String upperCase (String s) {
		String result = "";
		
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch>='a' && ch<='z') {
				result = result + (char)(ch-32);
			}
			else {
				result+=ch;
			}
		}
		return result;
	}
	
	public static void sort(char ch[]) {
		
		for(int i=0; i<ch.length;i++) {
			for(int j=0; j<ch.length-1-i;j++) {
				if(ch[j] > ch[j+1]) {
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
	}
	
	public static String arrayToString(char ch[]) {
		 
		String result = "";
		
		for(int i=0;i<ch.length;i++) {
			result+=ch[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		String s1 = "Listen";
		String s2 = "Silent";
		
		s1 = upperCase(s1);
		s2 = upperCase(s2);
		
		char ch1 [] = s1.toCharArray();
		char ch2 [] = s2.toCharArray();
		
		sort(ch1);
		sort(ch2);
		
		s1 = arrayToString(ch1);
		s2 = arrayToString(ch2);
		
		if(s1.equals(s2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not anagram");
		}
	}
}
