package sec3;

public class People {
	public static int selNum = 100;	// 고유 번호-정적 필드(공유 데이터), 객체와 관계없이 메모리가 공유된다.
	public String name;			// 이름
	public int age;				// 나이
	public String addr;			// 주소
	
	public void print1() {
		System.out.println("selNum : " + this.selNum);
		System.out.println("name : " + this.name);
	}
	
	// 객체를 만들기 전 부터 생성되어있는 메소드기 때문에 this를 사용할 수 없음
	public static void print2() { // 정적(static) 메소드
		System.out.println("name : 아무개");
		System.out.println("age : 29");
	}
}
