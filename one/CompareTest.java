package com.one;

public class CompareTest {
	public static void main(String[] args) {
		String java = "java";
		String cpp = "pp";
		int res = java.compareTo(cpp);
		System.out.println("res : " + res);
		if (res == 0) {
			System.out.println("same");
		} else if (res < 0) {
			System.out.println("<");
		} else if (res > 0) {
			System.out.println(">");
		}
		String totStr=java.concat(cpp);
		System.out.println(totStr);
	}
}
