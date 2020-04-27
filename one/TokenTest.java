package com.one;

import java.util.StringTokenizer;

public class TokenTest {
	public static void main(String[] args) {
		String query="name&kit&addr&seoul&age&21";
		StringTokenizer st= new StringTokenizer(query,"&=");
		int n = st.countTokens();
		System.out.println("토큰 갯수 : "+n);
		//내용 출력
		for (int i = 0; i < n; i++) {
			String token=st.nextToken();
			System.out.println(token);
		}
	}
}
