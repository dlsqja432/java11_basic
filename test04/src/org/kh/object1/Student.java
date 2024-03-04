package org.kh.object1;

public class Student {

	String name = "아무개";
	int kor = 100;
	int eng = 100;
	int mat = 100;
	
	int total() {
		return this.kor + this.eng + this.mat;
	}
	
	double avg() {
		return total()/3.0f;
	}
	
	void resulting() {
		System.out.print("이름 : " + this.name + ", 총점 : " + total());
		System.out.printf(", 평균 : %.2f", avg());
	}
}

