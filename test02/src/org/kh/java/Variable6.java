package org.kh.java;

public class Variable6 {

	public static void main(String[] args) {

		float f1 = 3.14f;
		double f2 = 3.14;
		int kor = 90, eng = 80, mat = 95;
		
//		float 형변환 하는 방법 두가지
//		float avg = (kor + eng + mat) / 3.0f;
		float avg = (float) (kor + eng + mat) / 3; 
		
		System.out.printf("f1 = %.3f\n", f1);
		System.out.printf("f1 = %.2f\n", f2);
		System.out.printf("평균 : %.2f\n", avg);
	}

}
