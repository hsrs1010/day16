package com.one;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("this");

		sb.append(" is pencil");
		System.out.println(sb);

		sb.insert(7, " my");
		System.out.println(sb);

		sb.replace(8, 10, "your");
		System.out.println(sb);

		sb.delete(8, 13);
		System.out.println(sb);

		sb.setLength(4);
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("a");
		
		sb2.append(" pencil");
		System.out.println(sb2);
		
		sb2.insert(2, "nice ");
		System.out.println(sb2);
		
		sb2.replace(2, 6, "bad");
		System.out.println(sb2);
		
		sb2.delete(0, 2);
		System.out.println(sb2);
		
		sb2
		.reverse();
		System.out.println(sb2);
		
		System.out.println("length : "+sb2.length());
		System.out.println(sb2.charAt(3));
		sb2.setLength(3);
		System.out.println(sb2);
		
		
		
	}
}
