package com.one;

public class TrimTest {
	public static void main(String[] args) {
		String a="    abc   def    ";
		String b="    xyz\t   ";
		String trima=a.trim();
		String trimb=b.trim();
		
		String replacea=a.replace(" ", "");
		
		System.out.println("trima : "+trima+" :");
		System.out.println("replace : "+replacea+" :");
		System.out.println("trimb : "+trimb+" :");
	}
}
