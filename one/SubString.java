package com.one;

public class SubString {
	public static void main(String[] args) {
		String str="012345678";
		String substr=str.substring(5);
		System.out.println(substr);
		
		String sub2str=str.substring(3, 6);
		System.out.println(sub2str);
		
		System.out.println("length : "+sub2str.length());
	}
}
