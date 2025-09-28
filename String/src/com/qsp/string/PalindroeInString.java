package com.qsp.string;

import java.util.Scanner;

public class PalindroeInString {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	
	String str = sc.next();
	
	String rev = "";
	
	int i = str.length()-1;
	
	while(i>=0)
	{
		rev = rev + str.charAt(i);
		i--;
	}
	if(str.equals(rev))
	{
		System.out.println(str +" is a palindrome");
	}
	else
	{
		System.out.println(str +" is not a palindrome");
	}
	sc.close();
}
}

