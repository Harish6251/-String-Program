package com.qsp.string;

public class ReverseTheSentence {

	public static void main(String[] args) {
		
		String s = "I am Harish";
		String s1= "";
		
		String [] str = s.split(" ");
		
		for(int i=str.length-1; i>=0; i--) {
			s1 = s1 + str[i];
		}
		System.out.println(s1);
	}
}
