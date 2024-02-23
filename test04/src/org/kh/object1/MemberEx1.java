package org.kh.object1;
// public > protected(다른 패키지여도 상송받거나 연관있으면 사용가능) > default > private
public class MemberEx1 {

	public static void main(String[] args) {
		
		Member jang = new Member();
//		jang.id = "dlsqja432";
//		jang.pw = "password777";
//		jang.birth = "1996-11-13";
//		jang.email = "dlsqja432@naver.com";
//		jang.tel = "010-7223-0264";
		jang.setId("dlsqja432");
		jang.setPw("password777");
		jang.setEmail("dlsqja432@naver.com");
		jang.setBirth("1996-11-13");
		jang.setTel("010-7223-0264");
		System.out.println("id : " + jang.getId());
		
		
		
		jang.showInfo();
		System.out.println(jang.toString());
	}

}
