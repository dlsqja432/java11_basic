package javaexam1;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
//		list는 ArrayList로 생성해야 하지만, null로 대입하였으므로 
//		13~17 문장은 NullPointerException이 발생한다.
		List<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
//		list는 정수 타입의 ArrayList이므로 정수만 add 할 수 있다.
//		여기서 20line은 실수를 add 했으므로 타입 불일치 오류가 발생한다.
//		list.add(1); 로 바꾼다.
//		list.add(1.23456);
		
		for(int num : list) {
			char ch;
			
//			결과 값을 보면 num이 0일 때 ################ 이 출력되어야 하는데, 지금은 0일 때 아무것도
//			출력 되지 않음.
//			30line => num < 0
//			37line => System.out.println("################");
			if(num <= 0) {
				ch = '-';
			}
			else if(num > 0) {
				ch = '+';
			}
			else {
				System.out.println("@@@@@@@@@@");
				continue;
			}
			
//			결과 값을 보면 list에 저장된 수의 절대값 만큼 +나 -를 찍어야 하는데, 한개가 부족하게 찍힘.
//			int i=0 으로 바꿈
			for(int i=1; i<Math.abs(num); i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
