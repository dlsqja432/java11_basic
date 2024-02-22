package org.kh.app2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {

		/*
		 * for와 마찬가지로 조건이 만족하는 동안만 반복 수행
		 * 그러나 while의 괄호에 조건만 기입하고, 해당 블록 안에 증감식이 기재됨.
		 * 
		 * 초기식
		 * while(조건식) {
		 * 		증감식;
		 * 		반복할 문장;
		 * }
		 */
		
		int i=0; 
		int total = 0;
		while(i<5) {
			i++;
			total += i;
		}
		System.out.println("결과 : " + total);
		
		// 해당 숫자를 입력하면, 구구단 중 해당 숫자의 단을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력[2-9] : ");
		int num = sc.nextInt();
		
		// while로 구현
		int k = 1;
		while(k < 10) {
			System.out.println(num + " * " + k + " = " + num*k);
			k++;
		}
		
		System.out.println();
		
		// for로 구현
		for(int j=1; j<10; j++) {
			System.out.println(num + " * " + j + " = " + num*j);
		}
		sc.close();
	}

}
