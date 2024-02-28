package sec3;
// 스케쥴링 : 선점형과 비선점형이 있다.
// 선점(preemption) : 해당 프로세스가 처리되다가 다른 프로세스에게 CPU를 양도될 수 있는 스케쥴링
// 비선점(Non-preemption) : 해당 프로세스가 모두 완료될 때 까지 다른 프로세스에게 CPU를 양도할 수 없는 스케쥴링
// LeastJob : 작업량이 가장 적은 것 부터 진행
// SCJ(Short time Job) : 요구 시간이 가장 작은 것 부터 진행(스케쥴링)
// 아래와 같이 5개의 프로세스가 CPU 에서 처리되고자 한다면
// A	08:00 	3시간
// B	09:00	2시간
// C	10:00	4시간
// D	14:00	3시간
// E	14:00	2시간
// 총시간 14시간
// 8~11 9,11~13 10,13~14 14~16  16~19  14,19~22
// A -> B ->    C ->     E ->	C ->   D
public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
	}

}
