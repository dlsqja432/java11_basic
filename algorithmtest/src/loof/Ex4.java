package loof;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int n = scanner.nextInt();
		int total = 0;
		
		for(int i = 0; i<n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			total = total + a*b;
		}
		
		if(x == total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		scanner.close();
	}
	
}


