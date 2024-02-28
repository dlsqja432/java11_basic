package sec3;

import java.io.IOException;

public class SchedulExam {
	public static void main(String[] args) throws IOException {
//		키보드로 알파벳[A-Z]를 입력받아 입력 값이 'R' 이면, RoundRobin 의 객체가,
//		'P' 이면, PriorityAllocation 의 객체가, 
//		'L' 이면, LeastJob 의 객체가 생성되고,
//		그 밖의 문자가 입력되면, "지원하지 않는 스케쥴링 입니다." 를 출력
//		일벽 문자는 대문자와 소문자 모두 입력 가능하도록 비교하여야 함.
		
		Scheduler s = null;
		System.out.println("전화 상담 방식 선택 [A-Z] : ");
		int ch = System.in.read();
		
		if(ch == 'R' || ch == 'r') {
			s = new RoundRobin();
		}
		
		else if(ch == 'P' || ch == 'p') {
			s = new PriorityAllocation();
		}
		
		else if(ch =='L' || ch == 'l') {
			s = new LeastJob();
		}
		
		else {
			System.out.println("지원하지 않는 스케쥴링 입니다.");
			return;
		}
		
		s.getNextCall();
		s.sendCallToAgent();
	}
}
