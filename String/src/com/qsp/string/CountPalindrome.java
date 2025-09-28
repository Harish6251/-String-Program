package com.qsp.string;

public class CountPalindrome {

	public static void main(String[] args) {
		
		String s = "wow its amazing racecar";
		int count = 0;
		
		String str [] = s.split(" ");
		
		for(int i=0;i<str.length;i++) {
			String s1 = str[i];
			String rev = "";
			
			for(int j=s1.length()-1;j>=0;j--) {
				rev = rev + s1.charAt(j);
			}
			if(s1.equals(rev)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
