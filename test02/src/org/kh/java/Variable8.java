package org.kh.java;

public class Variable8 {

	public static void main(String[] args) {

		// 가변 할당(동적 할당) : 자료형과 무관하게 해당하는 리터럴(값)에 의해 자료형이 자유롭게 변형되는 할당 방법
		var num1 = 29.456;
		var num2 = 34;
		var num3 = 'k';
		var num4 = "김기태";
		var num5 = true;
		int num7 = (int) num1;
		// num1 = 67; // num1의 타입이 double 에서 int로 변환
		// var은 현재 호환성을 고려하여 많이 사용하지는 않음
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);
		System.out.println("num5 : " + num7);
	}

}
