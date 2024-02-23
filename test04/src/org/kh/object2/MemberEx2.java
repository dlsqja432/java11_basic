package org.kh.object2;

import org.kh.object1.Member;

public class MemberEx2 {

	public static void main(String[] args) {
		
		Member jang = new Member();
		jang.setId("dlsqja432");
		jang.setPw("password777");
		jang.setEmail("dlsqja432@naver.com");
		jang.setBirth("1996-11-13");
		jang.setTel("010-7223-0264");
		System.out.println("id : " + jang.getId());
	}

}
