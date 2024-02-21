package org.kh.site2;
// 논리 연산자 : &&, ||, ! 
public class Operation6 {

	public static void main(String[] args) {

		int a = 26;
		int b = 28;
		int c = 27;
		
		// and 논리 : 모든 입력이 ture일 경우 출력이 true가 된다.
		System.out.println("a > b && b > c : " + (a>b && a>c));
		System.out.println("a > b && b > c : " + (a>b && b>c));
		System.out.println("a > b && b > c : " + (a<b && b<c));
		System.out.println("a > b && b > c : " + (a<b && b>c));
		
		// or 논리 : 입력이 어느 하나라도 true이면 출력이 true가 된다.
		System.out.println("a > b || b > c : " + (a>b || a>c));
		System.out.println("a > b || b > c : " + (a>b || b>c));
		System.out.println("a > b || b > c : " + (a<b || b<c));
		System.out.println("a > b || b > c : " + (a<b || b>c));
		
		// not 논리 : 입력이 true이면, 출력은 false, 입력이 false이면, 출력은 true : 반대로 출력
		System.out.println("!(a > b) : " + !(a>b));
		System.out.println("!(a < b) : " + !(a<b));
		
	}

}
