package com.qsp.string;

public class ReverseParticularword {

	public static void main(String[] args) {
		
		String s = "All the best";
		String s1 = "";
		String s2 = "";
		
		String [] str = s.split(" ");
		
		for(int i=0; i<str.length;i++) {
			
			s1 = str[i];
			String rev = "";
			
			if(s1.equals("the")) {
				for(int j=s1.length()-1;j>=0;j--) {
					rev = rev + s1.charAt(j);
				}
				s2 = s2 + rev + " ";
			}
			else {
				s2 = s2 + s1 + rev + " ";
			}
		}
		System.out.println(s2);
	}
}
