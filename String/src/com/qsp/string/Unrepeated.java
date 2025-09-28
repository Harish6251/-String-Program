package com.qsp.string;

public class Unrepeated {

	public static void main(String[] args) {
		
		String s = "Harish";
		char ch [] = s.toCharArray();
		boolean b [] = new boolean [ch.length];
		
		for(int i=0; i<ch.length; i++) {
			if(b[i] == false) {
				int count = 0;
				
				for(int j=i+1; j<ch.length;j++) {
					if(ch[i] == ch[j]) {
						count++;
						b[j] = true;
					}
				}
				if(count == 0) {
					System.out.println(ch[i]);
				}
			}
		}
	}
}
