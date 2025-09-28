package com.qsp.string;

public class Frequency {

	public static void main(String[] args) {
		
		String s = "Harisshh";
		
		char ch [] =  s.toCharArray();
		boolean b [] = new boolean [ch.length];
		
		for(int i=0; i<ch.length;i++) {
			if(!b[i]) {
				int count = 1;
				
				for(int j=i+1; j<ch.length;j++) {
					if(ch[i] == ch[j]) {
						count++;
						b[j] = true;
					}
				}
				System.out.println(ch[i] +" is " + count + " times occured");
			}
		}
	}
}
