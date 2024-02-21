package org.kh.site2;
// 대입 연산자 : 연산 후에 대입하는 연산자 +=, -=, /=, %=, &=, |=
// 비트 연산자 : &, |, ^(xor), ~(complement), >>(right shift), <<(left shift)
public class Operation7 {

	public static void main(String[] args) {

//		* 연산자 우선순위
//		단항 연산자가 가장 높고 이항, 삼항 연산자 순서입니다.
//		대입 연산자의 우선순위가 가장 낮습니다.
//		산술, 관계, 논리, 대입 연산자 순서로 우선순위를 가지며 ()의 우선순위가 가장 높습니다.
		
		int a = 20;
		int b = 15;
		int tmp;
		a += b;	// a = 35, b = 15
		b -= a;	// a = 35, b = -20
		
		// a와 b의 값 바꾸기
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("a, b : " + a+ "," + b);
		
		int x = 0b01101;
		int y = 0b01011;
		System.out.println("x = " + Integer.toBinaryString(x));
		System.out.println("y = " + Integer.toBinaryString(y));
		System.out.println("x | y = " + Integer.toBinaryString(x | y));
		System.out.println("x & y = " + Integer.toBinaryString(x & y));
		System.out.println("x ^ y = " + Integer.toBinaryString(x ^ y));
		System.out.println("~x = " + Integer.toBinaryString(~x));
		System.out.println("x >> 2 : " + Integer.toBinaryString(x >> 2));
		System.out.println("x << 2 : " + Integer.toBinaryString(x << 2));
		
		int i = 25; // 11001
		int j = 30; // 11110
		i &= j;		// 11000
		System.out.println("i &= j : " + i);
		i = 25;
		i |= j;
		System.out.println("i |= j : " + i);
		i = 25;
		i ^= j;
		System.out.println("i ^= j : " + i);
		
		j >>= 2; // 11110 -> 111
		System.out.println("j >>= 2 : " + j);
		
		j = 30;
		j <<= 2;
		System.out.println("j <<= 2 : " + j);
	}

}
