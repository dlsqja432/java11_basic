package inoutput;
import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {

		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		//사용자로 부터 숫자 두개 입력받기
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//사칙연산 출력
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		sc.close();
	}

}
