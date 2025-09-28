package com.qsp.string;

public class ValidatePassword {

	public static void main(String[] args) {
		
		String s = "Har1234";
		
		int upperCase = 0, lowerCase = 0, space = 0, specialChar = 0, number = 0;
		
		if(s.length()>=8 && s.length()<=15) {
			
			for(int i=0; i<s.length();i++) {
				
				char ch = s.charAt(i);
				
				if(ch>='A' && ch<='Z') {
					upperCase++;
				}
				else if(ch>='a' && ch<='z') {
					lowerCase++;
				}
				else if(ch == ' ') {
					space++;
				}
				else if(ch>='0' && ch<='9') {
					number++;
				}
				else {
					specialChar++;
				}
			}

			if(upperCase>0 && lowerCase>0 && space == 0 && number>0 && specialChar>0) { 
				System.out.println("It is valid");
			}
			else {
				System.out.println("invalid Password");
			}
			
		}
		else {
			System.out.println("Invalid Password");
		}
	}
}
