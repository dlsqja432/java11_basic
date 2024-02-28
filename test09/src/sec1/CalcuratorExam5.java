package sec1;

public class CalcuratorExam5 {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 4;
		Repeator rep1;
		
		rep1 = new Repeator() {

			@Override
			public int multiply(int num1, int num2) {
				return num1 * num2;
			}

			@Override
			public int divide(int num1, int num2) {
				return num1 / num2;
			}

			@Override
			int power(int num1, int num2) {
				int tmp = num1;
				for(int i=1; i<num2; i++) {
					num1 *= tmp;
				}
				return num1;
			}
		};
		
		System.out.println("원주율 : " + rep1.PI);
		System.out.println("덧셈 : " + rep1.add(num1, num2));
		System.out.println("뺄셈 : " + rep1.subtract(num1, num2));
		System.out.println("곱셈 : " + rep1.multiply(num1, num2));
		System.out.println("나눗셈 : " + rep1.divide(num1, num2));
		System.out.println("거듭제곱 : " + rep1.power(num1, num2));
	}

}
