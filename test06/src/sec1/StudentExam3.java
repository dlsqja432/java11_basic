package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam3 {

	public static void main(String[] args) {
		List<Student> s = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			Student st = new Student();
			st = new Student(); // 개별 객체 선언
			st.setNo(i+1);
			System.out.print(i+1 + "번째 국어 : ");
			st.setKor(scan.nextInt());
			System.out.print(i+1 + "번째 영어 : ");
			st.setEng(scan.nextInt());
			System.out.print(i+1 + "번째 수학 : ");
			st.setMath(scan.nextInt());
			s.add(st);
		}
		System.out.println("\n학번\t국어\t영어\t수학\t총점\t평균\t학점" );
		
		for(int i=0; i<s.size(); i++) {
			s.get(i).showInfo();
		}
	}

}
