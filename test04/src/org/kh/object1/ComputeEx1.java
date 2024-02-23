package org.kh.object1;
// 메서드(method) : 정의 -> 호출
public class ComputeEx1 {

	public static void main(String[] args) {

		Compute01 comp1 = new Compute01();
		comp1.fnc1();	// 메소드 호출
		comp1.fnc2(5);
		int a = comp1.fnc3();
		System.out.println(comp1.fnc3());
		System.out.println(a);
		String result = comp1.fnc4(85);
		System.out.println(result);
		
		fnc1();
	}
	
	// 함수(Function) : 정의 호출
	public static void fnc1() {
		System.out.println("반환(o), 매개 변수(x)");
	}
	
	public static void fnc2(int a) {
		System.out.println("반환(x), 매개 변수(o)");
		System.out.println("입력 수 : " + a);
	}
	
	public static int fnc3() {
		return 500;
	}
	
	public static int fnc4(int a) {
		return 500;
	}
}
