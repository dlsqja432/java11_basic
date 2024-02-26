package sec2;

public class Bus {

	int num;	// 노선번호
	int cnt;	// 승객수
	int money;	// 버스비
	
	// 객체 생성 시 노선번호(num)만 입력받는 생성자 함수
	public Bus(int num) {
		this.num = num;
	}
	
	// 승객이 버스를 타면 행해지는 일
	public void take(int money) {
		this.money += money;
		this.cnt++;
	}
	
	// 버스이 현재 정보 출력
	public void show() {
		System.out.println("버스 번호 : " + this.num + ", 수입 금액 : " + this.money + ", 승객 수 : " + this.cnt);
	}
}
