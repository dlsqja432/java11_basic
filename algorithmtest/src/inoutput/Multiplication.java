package inoutput;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		int a, b, b1, b2, b3;
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		b1 = b % 10;
		b2 = (b % 100) / 10;
		b3 = b / 100;
		
		System.out.println(a*b1);
		System.out.println(a*b2);
		System.out.println(a*b3);
		System.out.println(a*b);
		
		scanner.close();
	}

}
