package sec1;

public class CalcuratorExam {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 4;
		
		Arithmetic a1 = new Arithmetic();
		a1.print();
		System.out.println("원주율 : " + a1.PI);
		System.out.println("덧셈 : " + a1.add(num1, num2));
		System.out.println("뺄셈 : " + a1.subtract(num1, num2));
		System.out.println("곱셈 : " + a1.multiply(num1, num2));
		System.out.println("나눗셈 : " + a1.divide(num1, num2));
		System.out.println("거듭제곱 : " + a1.power(num1, num2));
	}

}
