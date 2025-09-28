package com.qsp.string;

public class RemoveBlankSpace {

	public static void main(String[] args) {
		
		String s = "I am Harish";
		String s1 =  "";
		
		String [] str = s.split(" ");
		
		for(int i=0; i<str.length; i++) {
			s1 = s1 + str[i];
		}
		System.out.println(s1);
	}
}
