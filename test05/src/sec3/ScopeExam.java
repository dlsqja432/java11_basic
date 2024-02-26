package sec3;

public class ScopeExam {
	int a = 10;	// 전역 변수 : 클래스 전체에서 인지되는 변수지만, 특정 메소드 내에서는 인지 하지 못함
	static int b = 100;	// 클래스 변수 : 클래스 전체에서 인식되며, 특정 메소드 내에서도 인지함.
	
	public static void main(String[] args) {
		int a = 20;
		System.out.println(a);
		run();
		run(15);
	}
	
	public static void run() {
		int c = 40; // 지역 변수 : 특정 메소드 내에서 선언되어 활용되는 변수로서, 메소드 블록을 벗어나면 인지할 수 없음.
//		System.out.println("전역 변수 a = " + a);
		System.out.println("클래스 변수 b = " + b);
	}
	
	public static void run(int a) { // 매개 변수 : 메소드 정의시 괄호 안에 있는 변수로 호출 시 지정된 값을 저장한다.
		System.out.println("매개변수 a = " + a);
	}

}
