package com.qsp.string;

public class CountDigitsInString {

	public static void main(String[] args) {
		
		String s = "Hari1sh1102";
		int count = 0;
		
		for(int i=0; i<s.length();i++) {
			char ch= s.charAt(i);
			
			if(ch>='0' && ch<='9') {
				count++;
			}
		}
		System.out.println(count);
	}
}
