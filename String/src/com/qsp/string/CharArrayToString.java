package com.qsp.string;

import java.util.Arrays;

public class CharArrayToString {

	public static void main(String[] args) {
		
		char ch [] = {'H','A','R','I','S','H'};
		
		String s = new String (ch);
		//String s = Arrays.toString(ch);
		
		System.out.println(s);
	}
}
