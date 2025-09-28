package com.qsp.string;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String s = "I am Harish"; 
		String s1 = "";
		
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch != ' ') {
				s1 = s1 + ch;
			}
		}
		System.out.println(s1);
	}
}