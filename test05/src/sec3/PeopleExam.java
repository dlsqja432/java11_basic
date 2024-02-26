package sec3;

public class PeopleExam {

	public static void main(String[] args) {

		People p1 = new People();
		p1.selNum = 200; // People.selNum = 200; 과 같음 => 클래스 변수 == 정적 필드 == 공유 데이터
		p1.name = "장인범";
		p1.age = 29;
		p1.addr = "십정동";
		
		People p2 = new People();
		p2.selNum = 300; // People.selNum = 300; 과 같음
		p2.name = "김대희";
		p2.age = 27;
		p2.addr = "구월동";
		
		System.out.println(p1.selNum + ", " + p1.name);
		System.out.println(p2.selNum + ", " + p2.name);
		
		p1.print1();
		p2.print1();
		
		p1.print2(); // People.print2(); 와 같음
		p2.print2(); // People.print2(); 와 같음
		
		// 정적(static) 요소 : static으로 선언된 필드 또는 메소드. 객체의 생성 없이 활용 가능
		// 정적(static) 메소드 : 객체의 생성없이 해당하는 클래스에서 바로 활용하는 메소드
		System.out.println("\n정적 메소드");
		People.print2();
		People.selNum = 500;
		People.print2();
	}

}
