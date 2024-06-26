package org.kh.java;

public class Variable5 {

	public static void main(String[] args) {

		char ch1 = 'H';
		char ch2 = 65;
		char ch3 = 95;
		char ch4 = '\u2665';
//		char ch5 = -11; // char는 음수 값을 가질 수 없음
		char ch5 = 121;
		char ch6 = '\u26BD';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		
		System.out.println("코드 넘버");
		System.out.println("ch1 : " + (int)ch1); // char타입 변수인 ch1을 int로 강제 형변환
		System.out.println("ch2 : " + (int)ch2);
		System.out.println("ch3 : " + (int)ch3);
		System.out.println("ch4 : " + (int)ch4); // ch4는 유니코드, 나머지는 아스키코드
		System.out.println("ch5 : " + (int)ch5);
		System.out.println("ch6 : " + (int)ch6);
	}

}
