package sec2;

public class OverloadEx3 {

	public static void main(String[] args) {
		Board b1 = new Board(); 	// 매개변수 없는 방식으로 b1객체 생성
		Board b2 = new Board(101);	// bno가 있는 생성자 방식으로 b2객체 생성
		Board b3 = new Board(102, "응애");
		System.out.println(b3.toString());
	}
}
