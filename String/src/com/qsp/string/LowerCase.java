package com.qsp.string;

public class LowerCase {

	public static void main(String[] args) {
		 
		String s = "Harish";
		String s1 = "";
		
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				ch = (char)(ch+32);
			}
			s1+=ch;
		}
		System.out.println(s1);
	}
}