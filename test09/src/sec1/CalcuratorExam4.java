package sec1;

public class CalcuratorExam4 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 3;
		
		Calcurator a1;
		
//		메소드의 구현 내용이 없어 인터페이스 생성자로 객체를 생성할 수 없으나
//		메소드의 구현 내용을 별도로 기술하면, 객체를 생성할 수 있음.
		a1 = new Calcurator() {

			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}

			@Override
			public int subtract(int num1, int num2) {
				return num1 - num2;
			}

			@Override
			public int multiply(int num1, int num2) {
				return num1 * num2;
			}

			@Override
			public int divide(int num1, int num2) {
				return num1 / num2;
			}
			
		};
		
//		a1.print();
		System.out.println("원주율 : " + a1.PI);
		System.out.println("덧셈 : " + a1.add(num1, num2));
		System.out.println("뺄셈 : " + a1.subtract(num1, num2));
		System.out.println("곱셈 : " + a1.multiply(num1, num2));
		System.out.println("나눗셈 : " + a1.divide(num1, num2));
//		System.out.println("거듭제곱 : " + a1.power(num1, num2));
	}

}
