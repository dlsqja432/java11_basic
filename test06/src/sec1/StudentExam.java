package sec1;

import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {

		// 5명의 학생(Student) 배열 객체 선언
		Student[] s = new Student[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			s[i] = new Student(); // 개별 객체 선언
			s[i].setNo(i+1);
			System.out.print(i+1 + "번째 국어 : ");
			s[i].setKor(scan.nextInt());
			System.out.print(i+1 + "번째 영어 : ");
			s[i].setEng(scan.nextInt());
			System.out.print(i+1 + "번째 수학 : ");
			s[i].setMath(scan.nextInt());
		}
		
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t학점" );
		
		for(int i=0; i<5; i++) {
			s[i].showInfo();
		}
		
		scan.close();
	}

}
