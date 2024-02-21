package org.kh.app;
// 조건문 if~else~ : if(조건식) { 조건식이 참일 때 실행문 } else {조건이 거짓일 때 실행문} 
public class Condition2 {

	public static void main(String[] args) {

		char sel = '1';
		// 성별코드(sel)가 1이거나 3이면, "남성", 아니면 "여성"
		String gender;
		
		if(sel == '1' || sel == '3') {
			gender = "남성";
		}
		else {
			gender = "여성";
		}
		System.out.println("당신의 성별은 " + gender);
	}

}
