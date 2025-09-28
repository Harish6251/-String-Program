package com.qsp.string;

public class StringIntoCharArray {

	public static void main(String[] args) {
		
		String s = "Harish";
		
		char [] ch = s.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
	}
}
