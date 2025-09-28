package com.qsp.string;

public class ReverseInSameOrder {

	public static void main(String[] args) {
		
		String s = "All the best";
		String s1 = "";
		String s2 = "";
		
		String [] str = s.split(" ");
		
		for(int i=0; i<str.length;i++) {
			s1 = str[i];
			String rev = "";
			
			for(int j=s1.length()-1;j>=0;j--) {
				char ch = s1.charAt(j);
				rev = rev + ch;
			}
			s2 = s2 + rev + " ";
		}
		System.out.println(s2);
	}
}
