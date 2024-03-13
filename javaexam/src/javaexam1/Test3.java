package javaexam1;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
//		list 선언만 있으므로 객체 생성이 되어 있지 않아 NullPointerException이 발생한다.
		List<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
//		List의 선언 시 요소의 데이터 타입이 Integer로 설정되어 있어 정수만 입력 받을 수 있으므로 데이터 타입 오류 발생
//		list.add(1); 로 바꾼다.
//		list.add(1.23456);
		
		for(int num : list) {
			char ch;
			
//			if 문의 조건에서 0을 포함하여 음수라고 표현했으므로 0이어도 음수가 발생하고, 0인 경우의
//			정상으로 처리되어야 할 else문이 실행되지 않는 오류 발생
//			30line => num < 0
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
			
//			for 반복문의 실행 조건이 해당 숫자를 포함하지 않고 작을 때까지만 실행하게 되어 
//			해당 숫자의 횟수 만큼 부호를 출력해야 하는 데, 한번 씩 덜 출력됨
			for(int i=1; i<Math.abs(num); i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
